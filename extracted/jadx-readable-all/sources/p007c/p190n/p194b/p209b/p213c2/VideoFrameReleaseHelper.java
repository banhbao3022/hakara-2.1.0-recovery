package p007c.p190n.p194b.p209b.p213c2;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p212b2.Log;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.c2.s, reason: use source file name */
/* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class VideoFrameReleaseHelper {

    /* JADX INFO: renamed from: a */
    public final FixedFrameRateEstimator f6517a = new FixedFrameRateEstimator();

    /* JADX INFO: renamed from: b */
    public final WindowManager f6518b;

    /* JADX INFO: renamed from: c */
    public final b f6519c;

    /* JADX INFO: renamed from: d */
    public final a f6520d;

    /* JADX INFO: renamed from: e */
    public boolean f6521e;

    /* JADX INFO: renamed from: f */
    public Surface f6522f;

    /* JADX INFO: renamed from: g */
    public float f6523g;

    /* JADX INFO: renamed from: h */
    public float f6524h;

    /* JADX INFO: renamed from: i */
    public float f6525i;

    /* JADX INFO: renamed from: j */
    public float f6526j;

    /* JADX INFO: renamed from: k */
    public long f6527k;

    /* JADX INFO: renamed from: l */
    public long f6528l;

    /* JADX INFO: renamed from: m */
    public long f6529m;

    /* JADX INFO: renamed from: n */
    public long f6530n;

    /* JADX INFO: renamed from: o */
    public long f6531o;

    /* JADX INFO: renamed from: p */
    public long f6532p;

    /* JADX INFO: renamed from: q */
    public long f6533q;

    /* JADX INFO: renamed from: c.n.b.b.c2.s$a */
    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        public final DisplayManager f6534a;

        public a(DisplayManager displayManager) {
            this.f6534a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                VideoFrameReleaseHelper.this.m3315d();
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }
    }

    /* JADX INFO: renamed from: c.n.b.b.c2.s$b */
    /* JADX INFO: compiled from: VideoFrameReleaseHelper.java */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: f */
        public static final b f6536f = new b();

        /* JADX INFO: renamed from: g */
        public volatile long f6537g = -9223372036854775807L;

        /* JADX INFO: renamed from: h */
        public final Handler f6538h;

        /* JADX INFO: renamed from: i */
        public final HandlerThread f6539i;

        /* JADX INFO: renamed from: j */
        public Choreographer f6540j;

        /* JADX INFO: renamed from: k */
        public int f6541k;

        public b() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f6539i = handlerThread;
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = Util6.f6307a;
            Handler handler = new Handler(looper, this);
            this.f6538h = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.f6537g = j2;
            Choreographer choreographer = this.f6540j;
            Objects.requireNonNull(choreographer);
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f6540j = Choreographer.getInstance();
                return true;
            }
            if (i == 1) {
                int i2 = this.f6541k + 1;
                this.f6541k = i2;
                if (i2 == 1) {
                    Choreographer choreographer = this.f6540j;
                    Objects.requireNonNull(choreographer);
                    choreographer.postFrameCallback(this);
                }
                return true;
            }
            if (i != 2) {
                return false;
            }
            int i3 = this.f6541k - 1;
            this.f6541k = i3;
            if (i3 == 0) {
                Choreographer choreographer2 = this.f6540j;
                Objects.requireNonNull(choreographer2);
                choreographer2.removeFrameCallback(this);
                this.f6537g = -9223372036854775807L;
            }
            return true;
        }
    }

    public VideoFrameReleaseHelper(Context context) {
        a aVar = null;
        if (context != null) {
            context = context.getApplicationContext();
            this.f6518b = (WindowManager) context.getSystemService("window");
        } else {
            this.f6518b = null;
        }
        if (this.f6518b != null) {
            if (Util6.f6307a >= 17) {
                Objects.requireNonNull(context);
                DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
                if (displayManager != null) {
                    aVar = new a(displayManager);
                }
            }
            this.f6520d = aVar;
            this.f6519c = b.f6536f;
        } else {
            this.f6520d = null;
            this.f6519c = null;
        }
        this.f6527k = -9223372036854775807L;
        this.f6528l = -9223372036854775807L;
        this.f6523g = -1.0f;
        this.f6526j = 1.0f;
    }

    /* JADX INFO: renamed from: c */
    public static void m3312c(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            Log.m3154b("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3313a() {
        Surface surface;
        if (Util6.f6307a < 30 || (surface = this.f6522f) == null || this.f6525i == 0.0f) {
            return;
        }
        this.f6525i = 0.0f;
        m3312c(surface, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m3314b() {
        this.f6529m = 0L;
        this.f6532p = -1L;
        this.f6530n = -1L;
    }

    /* JADX INFO: renamed from: d */
    public final void m3315d() {
        WindowManager windowManager = this.f6518b;
        Objects.requireNonNull(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f6527k = refreshRate;
            this.f6528l = (refreshRate * 80) / 100;
        } else {
            android.util.Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f6527k = -9223372036854775807L;
            this.f6528l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0086  */
    /* JADX INFO: renamed from: e */
    public final void m3316e() {
        float f;
        boolean z;
        if (Util6.f6307a < 30 || this.f6522f == null) {
            return;
        }
        if (this.f6517a.m3264a()) {
            FixedFrameRateEstimator fixedFrameRateEstimator = this.f6517a;
            if (fixedFrameRateEstimator.m3264a()) {
                FixedFrameRateEstimator.a aVar = fixedFrameRateEstimator.f6455a;
                long j2 = aVar.f6464e;
                f = (float) (1.0E9d / (j2 != 0 ? aVar.f6465f / j2 : 0L));
            } else {
                f = -1.0f;
            }
        } else {
            f = this.f6523g;
        }
        float f2 = this.f6524h;
        if (f == f2) {
            return;
        }
        boolean z2 = true;
        if (f != -1.0f && f2 != -1.0f) {
            if (this.f6517a.m3264a()) {
                FixedFrameRateEstimator fixedFrameRateEstimator2 = this.f6517a;
                if ((fixedFrameRateEstimator2.m3264a() ? fixedFrameRateEstimator2.f6455a.f6465f : -9223372036854775807L) >= 5000000000L) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (Math.abs(f - this.f6524h) < (z ? 0.02f : 1.0f)) {
                z2 = false;
            }
        } else if (f == -1.0f && this.f6517a.f6459e < 30) {
            z2 = false;
        }
        if (z2) {
            this.f6524h = f;
            m3317f(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3317f(boolean z) {
        Surface surface;
        if (Util6.f6307a < 30 || (surface = this.f6522f) == null) {
            return;
        }
        float f = 0.0f;
        if (this.f6521e) {
            float f2 = this.f6524h;
            if (f2 != -1.0f) {
                f = this.f6526j * f2;
            }
        }
        if (z || this.f6525i != f) {
            this.f6525i = f;
            m3312c(surface, f);
        }
    }
}
