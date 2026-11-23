package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.r7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4655r7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4585l7 f24406f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f24407g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4573k7 f24408h;

    public RunnableC4655r7(C4573k7 c4573k7, C4585l7 c4585l7, long j2) {
        this.f24408h = c4573k7;
        this.f24406f = c4585l7;
        this.f24407g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24408h.m10625C(this.f24406f, false, this.f24407g);
        C4573k7 c4573k7 = this.f24408h;
        c4573k7.f24067e = null;
        C4677t7 c4677t7M10385p = c4573k7.m10385p();
        c4677t7M10385p.mo10381b();
        c4677t7M10385p.m10479t();
        c4677t7M10385p.m10778z(new RunnableC4743z7(c4677t7M10385p, null));
    }
}
