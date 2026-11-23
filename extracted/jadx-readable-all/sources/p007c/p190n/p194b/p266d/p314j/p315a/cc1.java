package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cc1 implements ia1<dc1> {

    /* JADX INFO: renamed from: a */
    public final lv1 f12977a;

    /* JADX INFO: renamed from: b */
    public final List<String> f12978b;

    /* JADX WARN: Multi-variable type inference failed */
    public cc1(C3495s2 c3495s2, C3495s2 c3495s3, lv1 lv1Var, List<String> list) {
        this.f12977a = c3495s3;
        this.f12978b = lv1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<dc1> zza() {
        return this.f12977a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.bc1

            /* JADX INFO: renamed from: a */
            public final cc1 f12556a;

            {
                this.f12556a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new dc1(this.f12556a.f12978b);
            }
        });
    }
}
