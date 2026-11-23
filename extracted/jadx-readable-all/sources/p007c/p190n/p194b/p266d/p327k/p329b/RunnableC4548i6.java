package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.i6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4548i6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f23997f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f23998g;

    public RunnableC4548i6(C4500e6 c4500e6, boolean z) {
        this.f23998g = c4500e6;
        this.f23997f = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM10828d = this.f23998g.f24476a.m10828d();
        boolean zM10826B = this.f23998g.f24476a.m10826B();
        this.f23998g.f24476a.f24521B = Boolean.valueOf(this.f23997f);
        if (zM10826B == this.f23997f) {
            this.f23998g.f24476a.mo10684l().f24426n.m10812b("Default data collection state already set to", Boolean.valueOf(this.f23997f));
        }
        if (this.f23998g.f24476a.m10828d() == zM10828d || this.f23998g.f24476a.m10828d() != this.f23998g.f24476a.m10826B()) {
            this.f23998g.f24476a.mo10684l().f24423k.m10813c("Default data collection is different than actual status", Boolean.valueOf(this.f23997f), Boolean.valueOf(zM10828d));
        }
        this.f23998g.m10525P();
    }
}
