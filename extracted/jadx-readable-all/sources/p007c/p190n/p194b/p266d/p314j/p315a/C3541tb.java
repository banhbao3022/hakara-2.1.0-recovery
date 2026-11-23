package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.d.j.a.tb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3541tb implements InterfaceC3221ko {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2913cc f19807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2950dc f19808b;

    public C3541tb(C2950dc c2950dc, C2913cc c2913cc) {
        this.f19808b = c2950dc;
        this.f19807a = c2913cc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3221ko
    public final void zza() {
        synchronized (this.f19808b.f13224a) {
            this.f19808b.f13230g = 1;
            C2096e.m4590z("Failed loading new engine. Marking new engine destroyable.");
            this.f19807a.m6165f();
        }
    }
}
