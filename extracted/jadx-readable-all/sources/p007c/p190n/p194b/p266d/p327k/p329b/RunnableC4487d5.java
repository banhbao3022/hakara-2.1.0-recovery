package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.d5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4487d5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4624oa f23829f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4480ca f23830g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC4463b5 f23831h;

    public RunnableC4487d5(BinderC4463b5 binderC4463b5, C4624oa c4624oa, C4480ca c4480ca) {
        this.f23831h = binderC4463b5;
        this.f23829f = c4624oa;
        this.f23830g = c4480ca;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f23831h.f23726f.m10670R();
        if (this.f23829f.f24240h.m10847H() == null) {
            this.f23831h.f23726f.m10658F(this.f23829f, this.f23830g);
        } else {
            this.f23831h.f23726f.m10689q(this.f23829f, this.f23830g);
        }
    }
}
