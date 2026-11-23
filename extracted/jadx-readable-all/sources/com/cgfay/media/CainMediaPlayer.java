package com.cgfay.media;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class CainMediaPlayer implements IMediaPlayer {
    public static final boolean APPLY_METADATA_FILTER = true;
    public static final boolean BYPASS_METADATA_FILTER = false;
    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_CURRENT = 300;
    private static final int MEDIA_ERROR = 100;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int MEDIA_TIMED_TEXT = 99;
    public static final boolean METADATA_ALL = false;
    public static final boolean METADATA_UPDATE_ONLY = true;
    private static final int NODE_BEAUTY = 1;
    private static final int NODE_DISPLAY = 7;
    private static final int NODE_EFFECT = 5;
    private static final int NODE_FACE = 2;
    private static final int NODE_FILTER = 4;
    private static final int NODE_INPUT = 0;
    private static final int NODE_MAKEUP = 3;
    private static final int NODE_NONE = -1;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWR = 5;
    public static final int OPT_CATEGORY_SWS = 3;
    private static final String TAG = "CainMediaPlayer";
    private EventHandler mEventHandler;
    private int mListenerContext;
    private long mNativeContext;
    private int mNativeSurfaceTexture;
    private IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    private IMediaPlayer.OnCompletionListener mOnCompletionListener;
    private IMediaPlayer.OnCurrentPositionListener mOnCurrentPositionListener;
    private IMediaPlayer.OnErrorListener mOnErrorListener;
    private IMediaPlayer.OnInfoListener mOnInfoListener;
    private IMediaPlayer.OnPreparedListener mOnPreparedListener;
    private IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    private IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private boolean mScreenOnWhilePlaying;
    private int mSessionId;
    private boolean mStayAwake;
    private SurfaceHolder mSurfaceHolder;
    private PowerManager.WakeLock mWakeLock = null;

    public class EventHandler extends Handler {
        private CainMediaPlayer mMediaPlayer;

        public EventHandler(CainMediaPlayer cainMediaPlayer, Looper looper) {
            super(looper);
            this.mMediaPlayer = cainMediaPlayer;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.mMediaPlayer.mNativeContext == 0) {
                Log.w(CainMediaPlayer.TAG, "mediaplayer went away with unhandled events");
                return;
            }
            int i = message.what;
            if (i != 0) {
                if (i == 1) {
                    if (CainMediaPlayer.this.mOnPreparedListener != null) {
                        CainMediaPlayer.this.mOnPreparedListener.onPrepared(this.mMediaPlayer);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (CainMediaPlayer.this.mOnCompletionListener != null) {
                        CainMediaPlayer.this.mOnCompletionListener.onCompletion(this.mMediaPlayer);
                    }
                    CainMediaPlayer.this.stayAwake(false);
                    return;
                }
                if (i == 3) {
                    if (CainMediaPlayer.this.mOnBufferingUpdateListener != null) {
                        CainMediaPlayer.this.mOnBufferingUpdateListener.onBufferingUpdate(this.mMediaPlayer, message.arg1);
                        return;
                    }
                    return;
                }
                if (i == 4) {
                    if (CainMediaPlayer.this.mOnSeekCompleteListener != null) {
                        CainMediaPlayer.this.mOnSeekCompleteListener.onSeekComplete(this.mMediaPlayer);
                        return;
                    }
                    return;
                }
                if (i == 5) {
                    if (CainMediaPlayer.this.mOnVideoSizeChangedListener != null) {
                        CainMediaPlayer.this.mOnVideoSizeChangedListener.onVideoSizeChanged(this.mMediaPlayer, message.arg1, message.arg2);
                        return;
                    }
                    return;
                }
                if (i != 99) {
                    if (i == 100) {
                        StringBuilder sbM1556G = outline.m1556G("Error (");
                        sbM1556G.append(message.arg1);
                        sbM1556G.append(",");
                        sbM1556G.append(message.arg2);
                        sbM1556G.append(")");
                        Log.e(CainMediaPlayer.TAG, sbM1556G.toString());
                        boolean zOnError = CainMediaPlayer.this.mOnErrorListener != null ? CainMediaPlayer.this.mOnErrorListener.onError(this.mMediaPlayer, message.arg1, message.arg2) : false;
                        if (CainMediaPlayer.this.mOnCompletionListener != null && !zOnError) {
                            CainMediaPlayer.this.mOnCompletionListener.onCompletion(this.mMediaPlayer);
                        }
                        CainMediaPlayer.this.stayAwake(false);
                        return;
                    }
                    if (i != 200) {
                        if (i != CainMediaPlayer.MEDIA_CURRENT) {
                            StringBuilder sbM1556G2 = outline.m1556G("Unknown message type ");
                            sbM1556G2.append(message.what);
                            Log.e(CainMediaPlayer.TAG, sbM1556G2.toString());
                            return;
                        } else {
                            if (CainMediaPlayer.this.mOnCurrentPositionListener != null) {
                                CainMediaPlayer.this.mOnCurrentPositionListener.onCurrentPosition(this.mMediaPlayer, message.arg1, message.arg2);
                                return;
                            }
                            return;
                        }
                    }
                    if (message.arg1 != 700) {
                        StringBuilder sbM1556G3 = outline.m1556G("Info (");
                        sbM1556G3.append(message.arg1);
                        sbM1556G3.append(",");
                        sbM1556G3.append(message.arg2);
                        sbM1556G3.append(")");
                        Log.i(CainMediaPlayer.TAG, sbM1556G3.toString());
                    }
                    if (CainMediaPlayer.this.mOnInfoListener != null) {
                        CainMediaPlayer.this.mOnInfoListener.onInfo(this.mMediaPlayer, message.arg1, message.arg2);
                    }
                }
            }
        }
    }

    static {
        System.loadLibrary("ffmpeg");
        System.loadLibrary("soundtouch");
        System.loadLibrary("yuv");
        System.loadLibrary("media_player");
        native_init();
    }

    public CainMediaPlayer() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null) {
            this.mEventHandler = new EventHandler(this, looperMyLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new EventHandler(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        native_setup(new WeakReference(this));
    }

    private native void _changeFilter(int i, int i2);

    private native void _changeFilter(int i, String str);

    private native long _getCurrentPosition();

    private native long _getDuration();

    private native int _getRotate();

    private native int _getVideoHeight();

    private native int _getVideoWidth();

    private native boolean _isLooping();

    private native boolean _isPlaying();

    private native void _pause() throws IllegalStateException;

    private native void _prepare() throws IllegalStateException, IOException;

    private native void _release();

    private native void _reset();

    private native void _resume() throws IllegalStateException;

    private native void _seekTo(float f) throws IllegalStateException;

    private native void _setDataSource(FileDescriptor fileDescriptor, long j2, long j3) throws IllegalStateException, IOException, IllegalArgumentException;

    private native void _setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    private native void _setDataSource(String str, String[] strArr, String[] strArr2) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException;

    private native void _setLooping(boolean z);

    private native void _setMute(boolean z);

    private native void _setOption(int i, String str, long j2) throws IllegalStateException;

    private native void _setOption(int i, String str, String str2) throws IllegalStateException;

    private native void _setPitch(float f);

    private native void _setRate(float f);

    private native void _setVideoSurface(Surface surface);

    private native void _setVolume(float f, float f2);

    private native void _start() throws IllegalStateException;

    private native void _stop() throws IllegalStateException;

    public static CainMediaPlayer create(Context context, Uri uri) {
        return create(context, uri, null);
    }

    private native void native_finalize();

    private static native void native_init();

    private native void native_setup(Object obj);

    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        EventHandler eventHandler;
        CainMediaPlayer cainMediaPlayer = (CainMediaPlayer) ((WeakReference) obj).get();
        if (cainMediaPlayer == null || (eventHandler = cainMediaPlayer.mEventHandler) == null) {
            return;
        }
        cainMediaPlayer.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, i3, obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stayAwake(boolean z) {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (z && !wakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!z && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = z;
        updateSurfaceScreenOn();
    }

    private void updateSurfaceScreenOn() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.setKeepScreenOn(this.mScreenOnWhilePlaying && this.mStayAwake);
        }
    }

    public native void _prepareAsync() throws IllegalStateException;

    public void changeEffect(String str) {
        _changeFilter(5, str);
    }

    public void changeFilter(String str) {
        _changeFilter(4, str);
    }

    public void finalize() throws Throwable {
        native_finalize();
        super.finalize();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public int getAudioSessionId() {
        return this.mSessionId;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public long getCurrentPosition() {
        return _getCurrentPosition();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public long getDuration() {
        return _getDuration();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public int getRotate() {
        return _getRotate();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public int getVideoHeight() {
        return _getVideoHeight();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public int getVideoWidth() {
        return _getVideoWidth();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public boolean isLooping() {
        return _isLooping();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public boolean isPlaying() {
        return _isPlaying();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void pause() throws IllegalStateException {
        stayAwake(false);
        _pause();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void prepare() throws IllegalStateException, IOException {
        _prepare();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void prepareAsync() throws IllegalStateException {
        _prepareAsync();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void release() {
        stayAwake(false);
        updateSurfaceScreenOn();
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnCurrentPositionListener = null;
        _release();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void reset() {
        stayAwake(false);
        _reset();
        this.mEventHandler.removeCallbacksAndMessages(null);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void resume() throws IllegalStateException {
        stayAwake(true);
        _resume();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void seekTo(float f) throws IllegalStateException {
        _seekTo(f);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setAudioSessionId(int i) throws IllegalStateException, IllegalArgumentException {
        this.mSessionId = i;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setAudioStreamType(int i) {
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setDataSource(Context context, Uri uri) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        setDataSource(context, uri, (Map<String, String>) null);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        _setVideoSurface(surfaceHolder != null ? surfaceHolder.getSurface() : null);
        updateSurfaceScreenOn();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setLooping(boolean z) {
        _setLooping(z);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setMute(boolean z) {
        _setMute(z);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnCurrentPositionListener(IMediaPlayer.OnCurrentPositionListener onCurrentPositionListener) {
        this.mOnCurrentPositionListener = onCurrentPositionListener;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
    }

    public void setOption(int i, String str, String str2) throws IllegalStateException {
        _setOption(i, str, str2);
    }

    public void setPitch(float f) {
        _setPitch(f);
    }

    public void setRate(float f) {
        _setRate(f);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setScreenOnWhilePlaying(boolean z) {
        if (this.mScreenOnWhilePlaying != z) {
            if (z && this.mSurfaceHolder == null) {
                Log.w(TAG, "setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = z;
            updateSurfaceScreenOn();
        }
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setSurface(Surface surface) {
        if (this.mScreenOnWhilePlaying && surface != null) {
            Log.w(TAG, "setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        this.mSurfaceHolder = null;
        _setVideoSurface(surface);
        updateSurfaceScreenOn();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setVolume(float f, float f2) {
        _setVolume(f, f2);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setWakeMode(Context context, int i) {
        boolean z;
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                z = true;
                this.mWakeLock.release();
            } else {
                z = false;
            }
            this.mWakeLock = null;
        } else {
            z = false;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i | 536870912, CainMediaPlayer.class.getName());
        this.mWakeLock = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
        if (z) {
            this.mWakeLock.acquire();
        }
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void start() throws IllegalStateException {
        stayAwake(true);
        _start();
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void stop() throws IllegalStateException {
        stayAwake(false);
        _stop();
    }

    public static CainMediaPlayer create(Context context, Uri uri, SurfaceHolder surfaceHolder) {
        try {
            CainMediaPlayer cainMediaPlayer = new CainMediaPlayer();
            cainMediaPlayer.setDataSource(context, uri);
            if (surfaceHolder != null) {
                cainMediaPlayer.setDisplay(surfaceHolder);
            }
            cainMediaPlayer.prepare();
            return cainMediaPlayer;
        } catch (IOException e) {
            Log.d(TAG, "create failed:", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.d(TAG, "create failed:", e2);
            return null;
        } catch (SecurityException e3) {
            Log.d(TAG, "create failed:", e3);
            return null;
        }
    }

    public void changeEffect(int i) {
        _changeFilter(5, i);
    }

    public void changeFilter(int i) {
        _changeFilter(4, i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    @Override // com.cgfay.media.IMediaPlayer
    public void setDataSource(Context context, Uri uri, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("file")) {
            setDataSource(uri.getPath());
            return;
        }
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                    assetFileDescriptorOpenAssetFileDescriptor.close();
                }
            } else {
                if (assetFileDescriptorOpenAssetFileDescriptor.getDeclaredLength() < 0) {
                    setDataSource(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                } else {
                    setDataSource(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor(), assetFileDescriptorOpenAssetFileDescriptor.getStartOffset(), assetFileDescriptorOpenAssetFileDescriptor.getDeclaredLength());
                }
                assetFileDescriptorOpenAssetFileDescriptor.close();
            }
        } catch (IOException unused) {
            if (0 != 0) {
                assetFileDescriptor.close();
            }
            Log.d(TAG, "Couldn't open file on client side, trying server side");
            setDataSource(uri.toString(), map);
        } catch (SecurityException unused2) {
            if (0 != 0) {
                assetFileDescriptor.close();
            }
            Log.d(TAG, "Couldn't open file on client side, trying server side");
            setDataSource(uri.toString(), map);
        } catch (Throwable th) {
            if (0 != 0) {
                assetFileDescriptor.close();
            }
            throw th;
        }
    }

    public void setOption(int i, String str, long j2) throws IllegalStateException {
        _setOption(i, str, j2);
    }

    public static CainMediaPlayer create(Context context, int i) {
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = context.getResources().openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                return null;
            }
            CainMediaPlayer cainMediaPlayer = new CainMediaPlayer();
            cainMediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd.getFileDescriptor(), assetFileDescriptorOpenRawResourceFd.getStartOffset(), assetFileDescriptorOpenRawResourceFd.getLength());
            assetFileDescriptorOpenRawResourceFd.close();
            cainMediaPlayer.prepare();
            return cainMediaPlayer;
        } catch (IOException e) {
            Log.d(TAG, "create failed:", e);
            return null;
        } catch (IllegalArgumentException e2) {
            Log.d(TAG, "create failed:", e2);
            return null;
        } catch (SecurityException e3) {
            Log.d(TAG, "create failed:", e3);
            return null;
        }
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        _setDataSource(str);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setDataSource(String str, Map<String, String> map) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        String[] strArr;
        String[] strArr2 = null;
        if (map != null) {
            strArr2 = new String[map.size()];
            strArr = new String[map.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                strArr2[i] = entry.getKey();
                strArr[i] = entry.getValue();
                i++;
            }
        } else {
            strArr = null;
        }
        _setDataSource(str, strArr2, strArr);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor) throws IllegalStateException, IOException, IllegalArgumentException {
        setDataSource(fileDescriptor, 0L, 576460752303423487L);
    }

    @Override // com.cgfay.media.IMediaPlayer
    public void setDataSource(FileDescriptor fileDescriptor, long j2, long j3) throws IllegalStateException, IOException, IllegalArgumentException {
        _setDataSource(fileDescriptor, j2, j3);
    }
}
