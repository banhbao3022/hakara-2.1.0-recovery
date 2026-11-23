package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.RemoteException;
import java.util.Map;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g;
import p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5049r2 extends AbstractRunnableC5091g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Map f25946g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5151o f25947h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5030n f25948i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5049r2(C5030n c5030n, C5151o c5151o, Map map, C5151o c5151o2) {
        super(c5151o);
        this.f25948i = c5030n;
        this.f25946g = map;
        this.f25947h = c5151o2;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.AbstractRunnableC5091g
    /* JADX INFO: renamed from: a */
    public final void mo11431a() {
        try {
            C5030n c5030n = this.f25948i;
            ((InterfaceC5106n0) c5030n.f25881e.f26067l).mo11540I5(c5030n.f25879c, C5030n.m11461i(this.f25946g), new BinderC5018k(this.f25948i, this.f25947h));
        } catch (RemoteException e) {
            C5030n.f25877a.m11532a(e, "syncPacks", new Object[0]);
            this.f25947h.m11572a(new RuntimeException(e));
        }
    }
}
