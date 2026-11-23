package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hr2 {

    /* JADX INFO: renamed from: a */
    public final Runnable f14948a = new dr2(this);

    /* JADX INFO: renamed from: b */
    public final Object f14949b = new Object();

    /* JADX INFO: renamed from: c */
    public kr2 f14950c;

    /* JADX INFO: renamed from: d */
    public Context f14951d;

    /* JADX INFO: renamed from: e */
    public nr2 f14952e;

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m7158c(hr2 hr2Var) {
        synchronized (hr2Var.f14949b) {
            kr2 kr2Var = hr2Var.f14950c;
            if (kr2Var == null) {
                return;
            }
            if (kr2Var.m5582u0() || hr2Var.f14950c.m5572d()) {
                hr2Var.f14950c.mo5133J();
            }
            hr2Var.f14950c = null;
            hr2Var.f14952e = null;
            Binder.flushPendingCommands();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7159a(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.f14949b) {
            try {
                if (this.f14951d != null) {
                    return;
                }
                this.f14951d = context.getApplicationContext();
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14341e2;
                C2862b c2862b = C2862b.f12493a;
                if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                    m7161d();
                } else {
                    if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14334d2)).booleanValue()) {
                        C2330u.f10884a.f10892g.m6422b(new er2(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final ir2 m7160b(lr2 lr2Var) {
        synchronized (this.f14949b) {
            if (this.f14952e == null) {
                return new ir2();
            }
            try {
                if (this.f14950c.m7542C()) {
                    return this.f14952e.m7933q3(lr2Var);
                }
                return this.f14952e.m7932K2(lr2Var);
            } catch (RemoteException e) {
                C2622l.m5438t3("Unable to call into cache service.", e);
                return new ir2();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7161d() {
        kr2 kr2Var;
        synchronized (this.f14949b) {
            try {
                if (this.f14951d == null || this.f14950c != null) {
                    return;
                }
                fr2 fr2Var = new fr2(this);
                gr2 gr2Var = new gr2(this);
                synchronized (this) {
                    kr2Var = new kr2(this.f14951d, C2330u.f10884a.f10903r.m4786a(), fr2Var, gr2Var);
                }
                this.f14950c = kr2Var;
                kr2Var.m5578o();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
