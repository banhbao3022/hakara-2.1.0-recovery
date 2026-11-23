package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class l81 implements ia1<m81> {

    /* JADX INFO: renamed from: a */
    public final lv1 f16296a;

    /* JADX INFO: renamed from: b */
    public final qh1 f16297b;

    public l81(lv1 lv1Var, qh1 qh1Var) {
        this.f16296a = lv1Var;
        this.f16297b = qh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<m81> zza() {
        return this.f16296a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.k81

            /* JADX INFO: renamed from: a */
            public final l81 f15901a;

            {
                this.f15901a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new m81(this.f15901a.f16297b);
            }
        });
    }
}
