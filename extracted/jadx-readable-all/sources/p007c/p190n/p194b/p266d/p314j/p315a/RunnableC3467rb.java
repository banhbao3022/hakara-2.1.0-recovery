package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.d.j.a.rb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3467rb implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2913cc f18733f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC3689xa f18734g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2950dc f18735h;

    public RunnableC3467rb(C2950dc c2950dc, C2913cc c2913cc, InterfaceC3689xa interfaceC3689xa) {
        this.f18735h = c2950dc;
        this.f18733f = c2913cc;
        this.f18734g = interfaceC3689xa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18735h.f13224a) {
            try {
                if (this.f18733f.m8130c() != -1 && this.f18733f.m8130c() != 1) {
                    this.f18733f.m8129b();
                    lv1 lv1Var = C2962do.f13334e;
                    final InterfaceC3689xa interfaceC3689xa = this.f18734g;
                    lv1Var.execute(new Runnable(interfaceC3689xa) { // from class: c.n.b.d.j.a.qb

                        /* JADX INFO: renamed from: f */
                        public final InterfaceC3689xa f18245f;

                        {
                            this.f18245f = interfaceC3689xa;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f18245f.mo6786i();
                        }
                    });
                    C2096e.m4590z("Could not receive loaded message in a timely manner. Rejecting.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
