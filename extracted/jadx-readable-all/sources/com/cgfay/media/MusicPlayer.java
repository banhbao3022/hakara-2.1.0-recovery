package com.cgfay.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: loaded from: classes.dex */
public class MusicPlayer {
    private static final int MEDIA_CURRENT = 300;
    private static final int MEDIA_ERROR = 100;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_PLAYBACK_COMPLETE = 3;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_STARTED = 2;
    private static final String TAG = "MusicPlayer";
    private EventHandler mEventHandler;
    private long mNativeContext;
    private OnCompletionListener mOnCompletionListener;
    private OnCurrentPositionListener mOnCurrentPositionListener;
    private OnErrorListener mOnErrorListener;
    private OnPreparedListener mOnPreparedListener;
    private OnSeekCompleteListener mOnSeekCompleteListener;

    public class EventHandler extends Handler {
        private final MusicPlayer mMusicPlayer;

        public EventHandler(MusicPlayer musicPlayer, Looper looper) {
            super(looper);
            this.mMusicPlayer = musicPlayer;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.mMusicPlayer.mNativeContext == 0) {
                Log.w(MusicPlayer.TAG, "musicplayer went away with unhandled events");
                return;
            }
            int i = message.what;
            if (i == 1) {
                if (MusicPlayer.this.mOnPreparedListener != null) {
                    MusicPlayer.this.mOnPreparedListener.onPrepared(this.mMusicPlayer);
                    return;
                }
                return;
            }
            if (i == 2) {
                Log.d(MusicPlayer.TAG, "music player is started!");
                return;
            }
            if (i == 3) {
                if (MusicPlayer.this.mOnCompletionListener != null) {
                    MusicPlayer.this.mOnCompletionListener.onCompletion(this.mMusicPlayer);
                    return;
                }
                return;
            }
            if (i == 4) {
                if (MusicPlayer.this.mOnSeekCompleteListener != null) {
                    MusicPlayer.this.mOnSeekCompleteListener.onSeekComplete(this.mMusicPlayer);
                    return;
                }
                return;
            }
            if (i != 100) {
                if (i != 200) {
                    if (i != MusicPlayer.MEDIA_CURRENT) {
                        StringBuilder sbM1556G = outline.m1556G("Unknown message type ");
                        sbM1556G.append(message.what);
                        Log.e(MusicPlayer.TAG, sbM1556G.toString());
                        return;
                    } else {
                        if (MusicPlayer.this.mOnCurrentPositionListener != null) {
                            MusicPlayer.this.mOnCurrentPositionListener.onCurrentPosition(this.mMusicPlayer, message.arg1, message.arg2);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            StringBuilder sbM1556G2 = outline.m1556G("Error (");
            sbM1556G2.append(message.arg1);
            sbM1556G2.append(",");
            sbM1556G2.append(message.arg2);
            sbM1556G2.append(")");
            Log.e(MusicPlayer.TAG, sbM1556G2.toString());
            boolean zOnError = MusicPlayer.this.mOnErrorListener != null ? MusicPlayer.this.mOnErrorListener.onError(this.mMusicPlayer, message.arg1, message.arg2) : false;
            if (MusicPlayer.this.mOnCompletionListener == null || zOnError) {
                return;
            }
            MusicPlayer.this.mOnCompletionListener.onCompletion(this.mMusicPlayer);
        }
    }

    public interface OnCompletionListener {
        void onCompletion(MusicPlayer musicPlayer);
    }

    public interface OnCurrentPositionListener {
        void onCurrentPosition(MusicPlayer musicPlayer, float f, float f2);
    }

    public interface OnErrorListener {
        boolean onError(MusicPlayer musicPlayer, int i, int i2);
    }

    public interface OnPreparedListener {
        void onPrepared(MusicPlayer musicPlayer);
    }

    public interface OnSeekCompleteListener {
        void onSeekComplete(MusicPlayer musicPlayer);
    }

    static {
        System.loadLibrary("ffmpeg");
        System.loadLibrary("musicplayer");
        native_init();
    }

    public MusicPlayer() {
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

    private native float _getDuration();

    private native boolean _isLooping();

    private native boolean _isPlaying();

    private native void _pause();

    private native void _prepare();

    private native void _release();

    private native void _seekTo(float f);

    private native void _setDataSource(String str);

    private native void _setLooping(boolean z);

    private native void _setRange(float f, float f2);

    private native void _setSpeed(float f);

    private native void _setVolume(float f, float f2);

    private native void _start();

    private native void _stop();

    private native void native_finalize();

    private static native void native_init();

    private native void native_setup(Object obj);

    private static void postEventFromNative(Object obj, int i, int i2, int i3, Object obj2) {
        EventHandler eventHandler;
        MusicPlayer musicPlayer = (MusicPlayer) ((WeakReference) obj).get();
        if (musicPlayer == null || (eventHandler = musicPlayer.mEventHandler) == null) {
            return;
        }
        musicPlayer.mEventHandler.sendMessage(eventHandler.obtainMessage(i, i2, i3, obj2));
    }

    public void finalize() throws Throwable {
        native_finalize();
        super.finalize();
    }

    public float getDuration() {
        return _getDuration();
    }

    public boolean isLooping() {
        return _isLooping();
    }

    public boolean isPlaying() {
        return _isPlaying();
    }

    public void pause() throws IllegalStateException {
        _pause();
    }

    public void prepare() throws IllegalStateException {
        _prepare();
    }

    public void release() {
        this.mOnPreparedListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnErrorListener = null;
        this.mOnCurrentPositionListener = null;
        _release();
    }

    public void seekTo(float f) throws IllegalStateException {
        _seekTo(f);
    }

    public void setDataSource(String str) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        _setDataSource(str);
    }

    public void setLooping(boolean z) {
        _setLooping(z);
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    public void setOnCurrentPositionListener(OnCurrentPositionListener onCurrentPositionListener) {
        this.mOnCurrentPositionListener = onCurrentPositionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    public void setRange(float f, float f2) {
        _setRange(f, f2);
    }

    public void setSpeed(float f) {
        _setSpeed(f);
    }

    public void setVolume(float f, float f2) {
        _setVolume(f, f2);
    }

    public void start() throws IllegalStateException {
        _start();
    }

    public void stop() throws IllegalStateException {
        _stop();
    }
}
