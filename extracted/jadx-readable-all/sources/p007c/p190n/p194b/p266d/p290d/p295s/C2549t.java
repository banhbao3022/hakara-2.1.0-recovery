package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Handler;
import android.os.Looper;
import java.util.Locale;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p314j.p320f.HandlerC4025w;

/* JADX INFO: renamed from: c.n.b.d.d.s.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2549t {

    /* JADX INFO: renamed from: a */
    public static final C2518b f11460a = new C2518b("RequestTracker");

    /* JADX INFO: renamed from: b */
    public static final Object f11461b = new Object();

    /* JADX INFO: renamed from: c */
    public long f11462c;

    /* JADX INFO: renamed from: f */
    public InterfaceC2546q f11465f;

    /* JADX INFO: renamed from: g */
    public Runnable f11466g;

    /* JADX INFO: renamed from: e */
    public long f11464e = -1;

    /* JADX INFO: renamed from: d */
    public final Handler f11463d = new HandlerC4025w(Looper.getMainLooper());

    public C2549t(long j2) {
        this.f11462c = j2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m5163a(long j2) {
        boolean z;
        synchronized (f11461b) {
            long j3 = this.f11464e;
            z = j3 != -1 && j3 == j2;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final void m5164b(int i, Object obj, String str) {
        f11460a.m5119a(str, new Object[0]);
        Object obj2 = f11461b;
        synchronized (obj2) {
            InterfaceC2546q interfaceC2546q = this.f11465f;
            if (interfaceC2546q != null) {
                interfaceC2546q.mo5106b(this.f11464e, i, obj);
            }
            this.f11464e = -1L;
            this.f11465f = null;
            synchronized (obj2) {
                Runnable runnable = this.f11466g;
                if (runnable != null) {
                    this.f11463d.removeCallbacks(runnable);
                    this.f11466g = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5165c(long j2, InterfaceC2546q interfaceC2546q) {
        InterfaceC2546q interfaceC2546q2;
        long j3;
        Object obj = f11461b;
        synchronized (obj) {
            interfaceC2546q2 = this.f11465f;
            j3 = this.f11464e;
            this.f11464e = j2;
            this.f11465f = interfaceC2546q;
        }
        if (interfaceC2546q2 != null) {
            interfaceC2546q2.mo5105a(j3);
        }
        synchronized (obj) {
            Runnable runnable = this.f11466g;
            if (runnable != null) {
                this.f11463d.removeCallbacks(runnable);
            }
            Runnable runnable2 = new Runnable(this) { // from class: c.n.b.d.d.s.s

                /* JADX INFO: renamed from: f */
                public final C2549t f11459f;

                {
                    this.f11459f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2549t c2549t = this.f11459f;
                    Objects.requireNonNull(c2549t);
                    synchronized (C2549t.f11461b) {
                        if (c2549t.f11464e == -1) {
                            return;
                        }
                        c2549t.m5166d(15);
                    }
                }
            };
            this.f11466g = runnable2;
            this.f11463d.postDelayed(runnable2, this.f11462c);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m5166d(int i) {
        synchronized (f11461b) {
            long j2 = this.f11464e;
            if (j2 == -1) {
                return false;
            }
            m5164b(i, null, String.format(Locale.ROOT, "clearing request %d", Long.valueOf(j2)));
            return true;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m5167e(long j2, int i, Object obj) {
        synchronized (f11461b) {
            long j3 = this.f11464e;
            if (j3 == -1 || j3 != j2) {
                return false;
            }
            m5164b(i, obj, String.format(Locale.ROOT, "request %d completed", Long.valueOf(j2)));
            return true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5168f() {
        boolean z;
        synchronized (f11461b) {
            z = this.f11464e != -1;
        }
        return z;
    }
}
