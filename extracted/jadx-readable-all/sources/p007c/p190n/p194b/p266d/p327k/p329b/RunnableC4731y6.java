package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.y6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4731y6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4481d f24600f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24601g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f24602h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f24603i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4500e6 f24604j;

    public RunnableC4731y6(C4500e6 c4500e6, C4481d c4481d, int i, long j2, boolean z) {
        this.f24604j = c4500e6;
        this.f24600f = c4481d;
        this.f24601g = i;
        this.f24602h = j2;
        this.f24603i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24604j.m10531z(this.f24600f);
        C4500e6.m10510C(this.f24604j, this.f24600f, this.f24601g, this.f24602h, false, this.f24603i);
    }
}
