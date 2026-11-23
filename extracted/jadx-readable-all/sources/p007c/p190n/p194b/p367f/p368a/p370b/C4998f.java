package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.f */
/* JADX INFO: loaded from: classes.dex */
public final class C4998f extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25753g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5151o f25754h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5030n f25755i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4998f(C5030n c5030n, C5151o c5151o, int i, C5151o c5151o2) {
        super(c5151o);
        this.f25755i = c5030n;
        this.f25753g = i;
        this.f25754h = c5151o2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        try {
            C5030n c5030n = this.f25755i;
            InterfaceC5106n0 interfaceC5106n0 = (InterfaceC5106n0) c5030n.f25881e.f26067l;
            String str = c5030n.f25879c;
            int i = this.f25753g;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            interfaceC5106n0.mo11541O1(str, bundle, C5030n.m11460h(), new BinderC5010i(this.f25755i, this.f25754h, (int[]) null));
        } catch (RemoteException e) {
            C5030n.f25877a.m11532a(e, "notifySessionFailed", new Object[0]);
        }
    }
}
