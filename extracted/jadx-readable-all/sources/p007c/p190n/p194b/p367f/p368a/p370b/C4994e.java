package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.e */
/* JADX INFO: loaded from: classes.dex */
public final class C4994e extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25737g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25738h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5151o f25739i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f25740j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C5030n f25741k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4994e(C5030n c5030n, C5151o c5151o, int i, String str, C5151o c5151o2, int i2) {
        super(c5151o);
        this.f25741k = c5030n;
        this.f25737g = i;
        this.f25738h = str;
        this.f25739i = c5151o2;
        this.f25740j = i2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        try {
            C5030n c5030n = this.f25741k;
            InterfaceC5106n0 interfaceC5106n0 = (InterfaceC5106n0) c5030n.f25881e.f26067l;
            String str = c5030n.f25879c;
            int i = this.f25737g;
            String str2 = this.f25738h;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            interfaceC5106n0.mo11545f1(str, bundle, C5030n.m11460h(), new BinderC5026m(this.f25741k, this.f25739i, this.f25737g, this.f25738h, this.f25740j));
        } catch (RemoteException e) {
            C5030n.f25877a.m11532a(e, "notifyModuleCompleted", new Object[0]);
        }
    }
}
