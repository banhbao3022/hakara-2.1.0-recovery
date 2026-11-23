package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.q5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4642q5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4712w9 f24286f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4480ca f24287g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC4463b5 f24288h;

    public RunnableC4642q5(BinderC4463b5 binderC4463b5, C4712w9 c4712w9, C4480ca c4480ca) {
        this.f24288h = binderC4463b5;
        this.f24286f = c4712w9;
        this.f24287g = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f24288h.f23726f.m10670R();
        if (this.f24286f.m10847H() == null) {
            this.f24288h.f23726f.m10656D(this.f24286f, this.f24287g);
        } else {
            this.f24288h.f23726f.m10683k(this.f24286f, this.f24287g);
        }
    }
}
