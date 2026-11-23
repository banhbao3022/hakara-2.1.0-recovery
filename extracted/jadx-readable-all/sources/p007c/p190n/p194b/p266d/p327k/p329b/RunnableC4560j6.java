package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.j6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4560j6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f24034f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f24035g;

    public RunnableC4560j6(C4500e6 c4500e6, long j2) {
        this.f24035g = c4500e6;
        this.f24034f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24035g.m10818g().f23903r.m10611b(this.f24034f);
        this.f24035g.mo10684l().f24425m.m10812b("Session timeout duration set", Long.valueOf(this.f24034f));
    }
}
