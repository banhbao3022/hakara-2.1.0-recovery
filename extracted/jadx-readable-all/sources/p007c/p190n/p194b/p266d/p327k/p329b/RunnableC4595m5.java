package p007c.p190n.p194b.p266d.p327k.p329b;

import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p325k.C4145e9;

/* JADX INFO: renamed from: c.n.b.d.k.b.m5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4595m5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4480ca f24148f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BinderC4463b5 f24149g;

    public RunnableC4595m5(BinderC4463b5 binderC4463b5, C4480ca c4480ca) {
        this.f24149g = binderC4463b5;
        this.f24148f = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f24149g.f23726f.m10670R();
        C4611n9 c4611n9 = this.f24149g.f23726f;
        C4480ca c4480ca = this.f24148f;
        if (C4145e9.m9566a() && c4611n9.f24201k.f24534h.m10417k(C4647r.f24315J0)) {
            c4611n9.mo10686n().mo10381b();
            c4611n9.m10668P();
            C2622l.m5359e(c4480ca.f23798f);
            C4481d c4481dM10484b = C4481d.m10484b(c4480ca.f23797B);
            C4481d c4481dM10676a = c4611n9.m10676a(c4480ca.f23798f);
            c4611n9.mo10684l().f24426n.m10813c("Setting consent, package, consent", c4480ca.f23798f, c4481dM10484b);
            c4611n9.m10691s(c4480ca.f23798f, c4481dM10484b);
            if (c4481dM10484b.m10490f(c4481dM10676a)) {
                c4611n9.m10688p(c4480ca);
            }
        }
    }
}
