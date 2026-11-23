package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5006h extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5151o f25810g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5030n f25811h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5006h(C5030n c5030n, C5151o c5151o, C5151o c5151o2) {
        super(c5151o);
        this.f25811h = c5030n;
        this.f25810g = c5151o2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        try {
            C5030n c5030n = this.f25811h;
            ((InterfaceC5106n0) c5030n.f25882f.f26067l).mo11542Q2(c5030n.f25879c, C5030n.m11460h(), new BinderC5022l(this.f25811h, this.f25810g));
        } catch (RemoteException e) {
            C5030n.f25877a.m11532a(e, "keepAlive", new Object[0]);
        }
    }
}
