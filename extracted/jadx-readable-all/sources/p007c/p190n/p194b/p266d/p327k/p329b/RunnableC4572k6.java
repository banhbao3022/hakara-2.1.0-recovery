package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.k6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4572k6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f24063f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f24064g;

    public RunnableC4572k6(C4500e6 c4500e6, long j2) {
        this.f24064g = c4500e6;
        this.f24063f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f24064g.m10818g().f23902q.m10611b(this.f24063f);
        this.f24064g.mo10684l().f24425m.m10812b("Minimum session duration set", Long.valueOf(this.f24063f));
    }
}
