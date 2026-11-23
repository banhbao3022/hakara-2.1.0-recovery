package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.b9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4467b9 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f23738f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4744z8 f23739g;

    public RunnableC4467b9(C4744z8 c4744z8, long j2) {
        this.f23739g = c4744z8;
        this.f23738f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4744z8 c4744z8 = this.f23739g;
        long j2 = this.f23738f;
        c4744z8.mo10381b();
        c4744z8.m10915x();
        c4744z8.mo10684l().f24426n.m10812b("Activity paused, time", Long.valueOf(j2));
        C4455a9 c4455a9 = c4744z8.f24635f;
        RunnableC4503e9 runnableC4503e9 = new RunnableC4503e9(c4455a9, c4455a9.f23719b.f24476a.f24541o.mo5623c(), j2);
        c4455a9.f23718a = runnableC4503e9;
        c4455a9.f23719b.f24632c.postDelayed(runnableC4503e9, 2000L);
        if (c4744z8.f24476a.f24534h.m10428z().booleanValue()) {
            c4744z8.f24634e.f23951c.m10597c();
        }
        C4551i9 c4551i9 = c4744z8.f24633d;
        if (c4551i9.f24009a.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
            return;
        }
        c4551i9.f24009a.m10818g().f23909x.m10593a(true);
    }
}
