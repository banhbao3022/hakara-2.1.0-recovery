package p007c.p114h.p145f.p146b;

import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.opengl.EGLExt;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.FloatBuffer;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p126d.p128b.EglCore;
import p007c.p114h.p126d.p128b.WindowSurface;
import p007c.p114h.p126d.p129c.p130a.GLImageFilter;
import p007c.p114h.p126d.p129c.p143i.OpenGLUtils;
import p007c.p114h.p126d.p129c.p143i.TextureRotationUtils;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.h.f.b.m, reason: use source file name */
/* JADX INFO: compiled from: VideoRecorder.java */
/* JADX INFO: loaded from: classes.dex */
public final class VideoRecorder implements Runnable, VideoEncoder.a {

    /* JADX INFO: renamed from: f */
    public WindowSurface f4372f;

    /* JADX INFO: renamed from: g */
    public EglCore f4373g;

    /* JADX INFO: renamed from: h */
    public GLImageFilter f4374h;

    /* JADX INFO: renamed from: i */
    public FloatBuffer f4375i;

    /* JADX INFO: renamed from: j */
    public FloatBuffer f4376j;

    /* JADX INFO: renamed from: k */
    public VideoEncoder f4377k;

    /* JADX INFO: renamed from: l */
    public volatile a f4378l;

    /* JADX INFO: renamed from: m */
    public final Object f4379m = new Object();

    /* JADX INFO: renamed from: n */
    public boolean f4380n;

    /* JADX INFO: renamed from: o */
    public boolean f4381o;

    /* JADX INFO: renamed from: p */
    public HWMediaRecorder f4382p;

    /* JADX INFO: renamed from: q */
    public int f4383q;

    /* JADX INFO: renamed from: r */
    public long f4384r;

    /* JADX INFO: renamed from: c.h.f.b.m$a */
    /* JADX INFO: compiled from: VideoRecorder.java */
    public static class a extends Handler {

        /* JADX INFO: renamed from: a */
        public WeakReference<VideoRecorder> f4385a;

        public a(VideoRecorder videoRecorder) {
            this.f4385a = new WeakReference<>(videoRecorder);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            Object obj = message.obj;
            VideoRecorder videoRecorder = this.f4385a.get();
            if (videoRecorder == null) {
                Log.w("VideoRecorder", "RecordHandler.handleMessage: encoder is null");
                return;
            }
            if (i == 0) {
                VideoParams videoParams = (VideoParams) obj;
                Log.d("VideoRecorder", "onStartRecord " + videoParams);
                videoRecorder.f4375i = OpenGLUtils.m2178c(TextureRotationUtils.f4260a);
                videoRecorder.f4376j = OpenGLUtils.m2178c(TextureRotationUtils.f4261b);
                try {
                    videoRecorder.f4377k = new VideoEncoder(videoParams, videoRecorder);
                    EglCore eglCore = new EglCore(videoParams.f4371g, 1);
                    videoRecorder.f4373g = eglCore;
                    WindowSurface windowSurface = new WindowSurface(eglCore, videoRecorder.f4377k.f4354a, true);
                    videoRecorder.f4372f = windowSurface;
                    windowSurface.m2123b();
                    GLImageFilter gLImageFilter = new GLImageFilter(null);
                    videoRecorder.f4374h = gLImageFilter;
                    int i2 = videoParams.f4365a;
                    int i3 = videoParams.f4366b;
                    gLImageFilter.f4040n = i2;
                    gLImageFilter.f4041o = i3;
                    gLImageFilter.mo2133i(i2, i3);
                    HWMediaRecorder hWMediaRecorder = videoRecorder.f4382p;
                    if (hWMediaRecorder != null) {
                        hWMediaRecorder.m2202c();
                        return;
                    }
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new RuntimeException(outline.m1590l("Unhandled msg what=", i));
                    }
                    Looper.myLooper().quit();
                    return;
                }
                long j2 = (((long) message.arg1) << 32) | (((long) message.arg2) & 4294967295L);
                int iIntValue = ((Integer) obj).intValue();
                Log.d("VideoRecorder", "onRecordFrameAvailable");
                VideoEncoder videoEncoder = videoRecorder.f4377k;
                if (videoEncoder == null) {
                    return;
                }
                int i4 = videoEncoder.f4360g.f4369e;
                if (i4 == 4 || i4 == 5) {
                    if (videoRecorder.f4383q % (i4 != 5 ? 2 : 3) == 0) {
                        videoRecorder.m2213a(iIntValue, j2);
                    }
                } else {
                    videoRecorder.m2213a(iIntValue, j2);
                }
                videoRecorder.f4383q++;
                return;
            }
            if (videoRecorder.f4377k == null) {
                return;
            }
            Log.d("VideoRecorder", "onStopRecord");
            videoRecorder.f4377k.m2212a(true);
            VideoEncoder videoEncoder2 = videoRecorder.f4377k;
            Objects.requireNonNull(videoEncoder2);
            Log.d("VideoEncoder", "releasing encoder objects");
            MediaCodec mediaCodec = videoEncoder2.f4356c;
            if (mediaCodec != null) {
                mediaCodec.stop();
                videoEncoder2.f4356c.release();
                videoEncoder2.f4356c = null;
            }
            MediaMuxer mediaMuxer = videoEncoder2.f4355b;
            if (mediaMuxer != null) {
                if (videoEncoder2.f4359f) {
                    mediaMuxer.stop();
                }
                videoEncoder2.f4355b.release();
                videoEncoder2.f4355b = null;
            }
            GLImageFilter gLImageFilter2 = videoRecorder.f4374h;
            if (gLImageFilter2 != null) {
                gLImageFilter2.mo2126o();
                videoRecorder.f4374h = null;
            }
            WindowSurface windowSurface2 = videoRecorder.f4372f;
            if (windowSurface2 != null) {
                windowSurface2.m2124c();
                videoRecorder.f4372f = null;
            }
            EglCore eglCore2 = videoRecorder.f4373g;
            if (eglCore2 != null) {
                eglCore2.m2121c();
                videoRecorder.f4373g = null;
            }
            HWMediaRecorder hWMediaRecorder2 = videoRecorder.f4382p;
            if (hWMediaRecorder2 != null) {
                VideoEncoder videoEncoder3 = videoRecorder.f4377k;
                hWMediaRecorder2.m2201b(new RecordInfo(videoEncoder3.f4360g.f4368d, videoEncoder3.f4364k, MediaType.VIDEO));
            }
            videoRecorder.f4377k = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2213a(int i, long j2) {
        this.f4372f.m2123b();
        this.f4374h.mo2129d(i, this.f4375i, this.f4376j);
        WindowSurface windowSurface = this.f4372f;
        int i2 = this.f4377k.f4360g.f4369e;
        if (i2 != 3) {
            long jNanoTime = System.nanoTime();
            if (this.f4384r <= 0) {
                this.f4384r = jNanoTime;
            }
            long j3 = this.f4384r;
            j2 = (long) (((jNanoTime - j3) / C7804v0.m15334w(i2)) + j3);
        }
        EGLExt.eglPresentationTimeANDROID(windowSurface.f3993a.f3990a, windowSurface.f3994b, j2);
        this.f4372f.m2125d();
        this.f4377k.m2212a(false);
    }

    @Override // java.lang.Runnable
    public void run() {
        Looper.prepare();
        synchronized (this.f4379m) {
            this.f4378l = new a(this);
            this.f4380n = true;
            this.f4379m.notify();
        }
        Looper.loop();
        Log.d("VideoRecorder", "Video record thread exiting");
        synchronized (this.f4379m) {
            this.f4381o = false;
            this.f4380n = false;
            this.f4378l = null;
        }
    }
}
