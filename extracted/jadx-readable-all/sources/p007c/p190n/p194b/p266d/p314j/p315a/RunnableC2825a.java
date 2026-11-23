package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2825a implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f11987f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f11988g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC3679x0 f11989h;

    public RunnableC2825a(AbstractC3679x0 abstractC3679x0, String str, long j2) {
        this.f11989h = abstractC3679x0;
        this.f11987f = str;
        this.f11988g = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11989h.f21403f.m7975a(this.f11987f, this.f11988g);
        AbstractC3679x0 abstractC3679x0 = this.f11989h;
        abstractC3679x0.f21403f.m7976b(abstractC3679x0.toString());
    }
}
