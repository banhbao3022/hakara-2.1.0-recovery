package p500e1.p501a;

/* JADX INFO: renamed from: e1.a.f1 */
/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes.dex */
public class C6264f1 extends C6270h1 implements CompletableJob {

    /* JADX INFO: renamed from: g */
    public final boolean f29742g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6264f1(Job job) {
        C6270h1 c6270h1M13218r;
        super(true);
        boolean z = true;
        m13220A(job);
        Job3 job3M13241w = m13241w();
        C6286n c6286n = (C6286n) (job3M13241w instanceof C6286n ? job3M13241w : null);
        if (c6286n == null || (c6270h1M13218r = c6286n.m13218r()) == null) {
            z = false;
            break;
        }
        while (!c6270h1M13218r.mo13214s()) {
            Job3 job3M13241w2 = c6270h1M13218r.m13241w();
            C6286n c6286n2 = (C6286n) (job3M13241w2 instanceof C6286n ? job3M13241w2 : null);
            if (c6286n2 == null || (c6270h1M13218r = c6286n2.m13218r()) == null) {
                z = false;
                break;
            }
        }
        this.f29742g = z;
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: s */
    public boolean mo13214s() {
        return this.f29742g;
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: t */
    public boolean mo13215t() {
        return true;
    }
}
