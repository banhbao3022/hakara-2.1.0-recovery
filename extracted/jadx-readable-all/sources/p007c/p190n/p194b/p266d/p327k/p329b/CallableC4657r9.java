package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.concurrent.Callable;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;

/* JADX INFO: renamed from: c.n.b.d.k.b.r9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC4657r9 implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C4480ca f24410a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4611n9 f24411b;

    public CallableC4657r9(C4611n9 c4611n9, C4480ca c4480ca) {
        this.f24411b = c4611n9;
        this.f24410a = c4480ca;
    }

    @Override // java.util.concurrent.Callable
    public final String call() throws Exception {
        if (!C4145e9.m9566a() || !this.f24411b.f24201k.f24534h.m10417k(C4647r.f24315J0) || (this.f24411b.m10676a(this.f24410a.f23798f).m10493k() && C4481d.m10484b(this.f24410a.f23797B).m10493k())) {
            return this.f24411b.m10659G(this.f24410a).m10471s();
        }
        this.f24411b.mo10684l().f24426n.m10811a("Analytics storage consent denied. Returning null app instance id");
        return null;
    }
}
