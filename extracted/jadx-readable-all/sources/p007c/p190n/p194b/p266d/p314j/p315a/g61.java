package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g61 implements ia1<i61> {

    /* JADX INFO: renamed from: a */
    public final lv1 f14506a;

    /* JADX INFO: renamed from: b */
    public final ii1 f14507b;

    /* JADX INFO: renamed from: c */
    public final C3702xn f14508c;

    /* JADX INFO: renamed from: d */
    public final C3146in f14509d;

    public g61(lv1 lv1Var, ii1 ii1Var, C3702xn c3702xn, C3146in c3146in) {
        this.f14506a = lv1Var;
        this.f14507b = ii1Var;
        this.f14508c = c3702xn;
        this.f14509d = c3146in;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<i61> zza() {
        return this.f14506a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.f61

            /* JADX INFO: renamed from: a */
            public final g61 f13981a;

            {
                this.f13981a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                g61 g61Var = this.f13981a;
                return new i61(g61Var.f14507b.f15197j, g61Var.f14508c, g61Var.f14509d.f15325g);
            }
        });
    }
}
