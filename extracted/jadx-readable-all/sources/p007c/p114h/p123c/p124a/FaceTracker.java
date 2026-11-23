package p007c.p114h.p123c.p124a;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: c.h.c.a.b, reason: use source file name */
/* JADX INFO: compiled from: FaceTracker.java */
/* JADX INFO: loaded from: classes.dex */
public final class FaceTracker {

    /* JADX INFO: renamed from: a */
    public final Object f3963a = new Object();

    /* JADX INFO: renamed from: b */
    public c f3964b;

    /* JADX INFO: renamed from: c.h.c.a.b$b */
    /* JADX INFO: compiled from: FaceTracker.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public static FaceTracker f3965a = new FaceTracker(null);
    }

    /* JADX INFO: renamed from: c.h.c.a.b$c */
    /* JADX INFO: compiled from: FaceTracker.java */
    public static class c extends Thread {

        /* JADX INFO: renamed from: f */
        public final Object f3966f;

        /* JADX INFO: renamed from: g */
        public boolean f3967g;

        /* JADX INFO: renamed from: h */
        public Looper f3968h;

        /* JADX INFO: renamed from: i */
        public Handler f3969i;

        public c(String str) {
            super(str);
            this.f3966f = new Object();
            this.f3967g = false;
        }

        /* JADX INFO: renamed from: a */
        public void m2115a() {
            synchronized (this.f3966f) {
                while (!this.f3967g) {
                    try {
                        this.f3966f.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            synchronized (this) {
                this.f3968h = Looper.myLooper();
                notifyAll();
                this.f3969i = new Handler(this.f3968h);
            }
            synchronized (this.f3966f) {
                this.f3967g = true;
                this.f3966f.notify();
            }
            Looper.loop();
            synchronized (this) {
                this.f3969i.removeCallbacksAndMessages(null);
                this.f3969i = null;
            }
            synchronized (this.f3966f) {
                this.f3967g = false;
            }
        }
    }

    public FaceTracker(a aVar) {
    }
}
