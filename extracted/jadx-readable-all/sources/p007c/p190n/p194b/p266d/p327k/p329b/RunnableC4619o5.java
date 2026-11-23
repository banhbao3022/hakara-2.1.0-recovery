package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.o5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4619o5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4625p f24228f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24229g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC4463b5 f24230h;

    public RunnableC4619o5(BinderC4463b5 binderC4463b5, C4625p c4625p, String str) {
        this.f24230h = binderC4463b5;
        this.f24228f = c4625p;
        this.f24229g = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        this.f24230h.f23726f.m10670R();
        this.f24230h.f23726f.m10680h(this.f24228f, this.f24229g);
    }
}
