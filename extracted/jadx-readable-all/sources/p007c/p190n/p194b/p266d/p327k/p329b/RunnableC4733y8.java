package p007c.p190n.p194b.p266d.p327k.p329b;

/* JADX INFO: renamed from: c.n.b.d.k.b.y8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4733y8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f24608f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4744z8 f24609g;

    public RunnableC4733y8(C4744z8 c4744z8, long j2) {
        this.f24609g = c4744z8;
        this.f24608f = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4744z8 c4744z8 = this.f24609g;
        long j2 = this.f24608f;
        c4744z8.mo10381b();
        c4744z8.m10915x();
        c4744z8.mo10684l().f24426n.m10812b("Activity resumed, time", Long.valueOf(j2));
        if (c4744z8.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
            if (c4744z8.f24476a.f24534h.m10428z().booleanValue() || c4744z8.m10818g().f23909x.m10594b()) {
                C4527g9 c4527g9 = c4744z8.f24634e;
                c4527g9.f23952d.mo10381b();
                c4527g9.f23951c.m10597c();
                c4527g9.f23949a = j2;
                c4527g9.f23950b = j2;
            }
            c4744z8.f24635f.m10378a();
        } else {
            c4744z8.f24635f.m10378a();
            if (c4744z8.f24476a.f24534h.m10428z().booleanValue()) {
                C4527g9 c4527g10 = c4744z8.f24634e;
                c4527g10.f23952d.mo10381b();
                c4527g10.f23951c.m10597c();
                c4527g10.f23949a = j2;
                c4527g10.f23950b = j2;
            }
        }
        C4551i9 c4551i9 = c4744z8.f24633d;
        c4551i9.f24009a.mo10381b();
        if (c4551i9.f24009a.f24476a.m10828d()) {
            if (!c4551i9.f24009a.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
                c4551i9.f24009a.m10818g().f23909x.m10593a(false);
            }
            c4551i9.m10601b(c4551i9.f24009a.f24476a.f24541o.mo5623c(), false);
        }
    }
}
