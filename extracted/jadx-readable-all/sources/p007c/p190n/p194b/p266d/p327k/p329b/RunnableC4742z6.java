package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.z6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4742z6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4481d f24624f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f24625g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f24626h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f24627i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f24628j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C4500e6 f24629k;

    public RunnableC4742z6(C4500e6 c4500e6, C4481d c4481d, long j2, int i, long j3, boolean z) {
        this.f24629k = c4500e6;
        this.f24624f = c4481d;
        this.f24625g = j2;
        this.f24626h = i;
        this.f24627i = j3;
        this.f24628j = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24629k.m10531z(this.f24624f);
        this.f24629k.m10528w(this.f24625g, false);
        C4500e6.m10510C(this.f24629k, this.f24624f, this.f24626h, this.f24627i, true, this.f24628j);
    }
}
