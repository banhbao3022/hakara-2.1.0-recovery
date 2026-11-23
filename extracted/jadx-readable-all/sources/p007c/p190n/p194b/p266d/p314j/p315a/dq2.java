package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dq2 {

    /* JADX INFO: renamed from: a */
    public final Object f13364a = new Object();

    /* JADX INFO: renamed from: b */
    public bq2 f13365b = null;

    /* JADX INFO: renamed from: c */
    public boolean f13366c = false;

    /* JADX INFO: renamed from: a */
    public final void m6421a(Context context) {
        synchronized (this.f13364a) {
            if (!this.f13366c) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    C2622l.m5226A3("Can not cast Context to Application");
                    return;
                }
                if (this.f13365b == null) {
                    this.f13365b = new bq2();
                }
                bq2 bq2Var = this.f13365b;
                if (!bq2Var.f12784n) {
                    application.registerActivityLifecycleCallbacks(bq2Var);
                    if (context instanceof Activity) {
                        bq2Var.m6071a((Activity) context);
                    }
                    bq2Var.f12777g = application;
                    bq2Var.f12785o = ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14479y0)).longValue();
                    bq2Var.f12784n = true;
                }
                this.f13366c = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6422b(cq2 cq2Var) {
        synchronized (this.f13364a) {
            if (this.f13365b == null) {
                this.f13365b = new bq2();
            }
            bq2 bq2Var = this.f13365b;
            synchronized (bq2Var.f12778h) {
                bq2Var.f12781k.add(cq2Var);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6423c(cq2 cq2Var) {
        synchronized (this.f13364a) {
            bq2 bq2Var = this.f13365b;
            if (bq2Var == null) {
                return;
            }
            synchronized (bq2Var.f12778h) {
                bq2Var.f12781k.remove(cq2Var);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final Activity m6424d() {
        synchronized (this.f13364a) {
            try {
                bq2 bq2Var = this.f13365b;
                if (bq2Var == null) {
                    return null;
                }
                return bq2Var.f12776f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final Context m6425e() {
        synchronized (this.f13364a) {
            try {
                bq2 bq2Var = this.f13365b;
                if (bq2Var == null) {
                    return null;
                }
                return bq2Var.f12777g;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
