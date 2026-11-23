package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.r5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4653r5 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f24399f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24400g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24401h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f24402i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ BinderC4463b5 f24403j;

    public RunnableC4653r5(BinderC4463b5 binderC4463b5, String str, String str2, String str3, long j2) {
        this.f24403j = binderC4463b5;
        this.f24399f = str;
        this.f24400g = str2;
        this.f24401h = str3;
        this.f24402i = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f24399f;
        if (str == null) {
            this.f24403j.f23726f.f24201k.m10840w().m10626D(this.f24400g, null);
        } else {
            this.f24403j.f23726f.f24201k.m10840w().m10626D(this.f24400g, new C4585l7(this.f24401h, str, this.f24402i));
        }
    }
}
