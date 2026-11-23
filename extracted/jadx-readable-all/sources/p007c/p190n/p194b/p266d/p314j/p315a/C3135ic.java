package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;

/* JADX INFO: renamed from: c.n.b.d.j.a.ic */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3135ic {

    /* JADX INFO: renamed from: a */
    public final Object f15135a = new Object();

    /* JADX INFO: renamed from: b */
    public final Object f15136b = new Object();

    /* JADX INFO: renamed from: c */
    public C3468rc f15137c;

    /* JADX INFO: renamed from: d */
    public C3468rc f15138d;

    /* JADX INFO: renamed from: a */
    public final C3468rc m7227a(Context context, C3702xn c3702xn) {
        C3468rc c3468rc;
        synchronized (this.f15136b) {
            if (this.f15138d == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f15138d = new C3468rc(context, c3702xn, C3683x4.f21434a.m6603d());
            }
            c3468rc = this.f15138d;
        }
        return c3468rc;
    }

    /* JADX INFO: renamed from: b */
    public final C3468rc m7228b(Context context, C3702xn c3702xn) {
        C3468rc c3468rc;
        synchronized (this.f15135a) {
            if (this.f15137c == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                this.f15137c = new C3468rc(context, c3702xn, (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14310a));
            }
            c3468rc = this.f15137c;
        }
        return c3468rc;
    }
}
