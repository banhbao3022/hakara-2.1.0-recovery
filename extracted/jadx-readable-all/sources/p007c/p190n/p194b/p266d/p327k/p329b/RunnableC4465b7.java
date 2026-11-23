package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.b7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4465b7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4481d f23729f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f23730g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f23731h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f23732i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C4500e6 f23733j;

    public RunnableC4465b7(C4500e6 c4500e6, C4481d c4481d, int i, long j2, boolean z) {
        this.f23733j = c4500e6;
        this.f23729f = c4481d;
        this.f23730g = i;
        this.f23731h = j2;
        this.f23732i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23733j.m10531z(this.f23729f);
        C4500e6.m10510C(this.f23733j, this.f23729f, this.f23730g, this.f23731h, false, this.f23732i);
    }
}
