package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ad */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2839ad {

    /* JADX INFO: renamed from: a */
    public final C2950dc f12069a;

    /* JADX INFO: renamed from: b */
    public kv1<InterfaceC2987ec> f12070b;

    public C2839ad(C2950dc c2950dc) {
        this.f12069a = c2950dc;
    }

    /* JADX INFO: renamed from: a */
    public final void m5729a() {
        if (this.f12070b == null) {
            final C3147io c3147io = new C3147io();
            this.f12070b = c3147io;
            this.f12069a.m6350b(null).m8128a(new InterfaceC3295mo(c3147io) { // from class: c.n.b.d.j.a.wc

                /* JADX INFO: renamed from: a */
                public final C3147io f21031a;

                {
                    this.f21031a = c3147io;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3295mo
                /* JADX INFO: renamed from: a */
                public final void mo5960a(Object obj) {
                    this.f21031a.m7286a((InterfaceC2987ec) obj);
                }
            }, new InterfaceC3221ko(c3147io) { // from class: c.n.b.d.j.a.xc

                /* JADX INFO: renamed from: a */
                public final C3147io f21483a;

                {
                    this.f21483a = c3147io;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3221ko
                public final void zza() {
                    this.f21483a.m7287b(new C3061gc("Cannot get Javascript Engine"));
                }
            });
        }
    }
}
