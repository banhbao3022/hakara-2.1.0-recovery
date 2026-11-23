package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class aq2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final AbstractC3679x0 f12252f;

    /* JADX INFO: renamed from: g */
    public final C3092h6 f12253g;

    /* JADX INFO: renamed from: h */
    public final Runnable f12254h;

    public aq2(AbstractC3679x0 abstractC3679x0, C3092h6 c3092h6, Runnable runnable) {
        this.f12252f = abstractC3679x0;
        this.f12253g = c3092h6;
        this.f12254h = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC3275m4 interfaceC3275m4;
        this.f12252f.m8706m();
        C3092h6 c3092h6 = this.f12253g;
        C2872b9 c2872b9 = c3092h6.f14769c;
        if (c2872b9 == null) {
            this.f12252f.mo4729x(c3092h6.f14767a);
        } else {
            AbstractC3679x0 abstractC3679x0 = this.f12252f;
            synchronized (abstractC3679x0.f21407j) {
                interfaceC3275m4 = abstractC3679x0.f21408k;
            }
            if (interfaceC3275m4 != null) {
                interfaceC3275m4.mo4710a(c2872b9);
            }
        }
        if (this.f12253g.f14770d) {
            this.f12252f.m8702f("intermediate-response");
        } else {
            this.f12252f.m8703h("done");
        }
        Runnable runnable = this.f12254h;
        if (runnable != null) {
            runnable.run();
        }
    }
}
