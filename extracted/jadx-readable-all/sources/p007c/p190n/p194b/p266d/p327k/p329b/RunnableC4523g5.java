package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.g5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4523g5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4624oa f23941f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BinderC4463b5 f23942g;

    public RunnableC4523g5(BinderC4463b5 binderC4463b5, C4624oa c4624oa) {
        this.f23942g = binderC4463b5;
        this.f23941f = c4624oa;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f23942g.f23726f.m10670R();
        if (this.f23941f.f24240h.m10847H() == null) {
            C4611n9 c4611n9 = this.f23942g.f23726f;
            C4624oa c4624oa = this.f23941f;
            Objects.requireNonNull(c4611n9);
            C4480ca c4480caM10697y = c4611n9.m10697y(c4624oa.f24238f);
            if (c4480caM10697y != null) {
                c4611n9.m10658F(c4624oa, c4480caM10697y);
                return;
            }
            return;
        }
        C4611n9 c4611n10 = this.f23942g.f23726f;
        C4624oa c4624oa2 = this.f23941f;
        Objects.requireNonNull(c4611n10);
        C4480ca c4480caM10697y2 = c4611n10.m10697y(c4624oa2.f24238f);
        if (c4480caM10697y2 != null) {
            c4611n10.m10689q(c4624oa2, c4480caM10697y2);
        }
    }
}
