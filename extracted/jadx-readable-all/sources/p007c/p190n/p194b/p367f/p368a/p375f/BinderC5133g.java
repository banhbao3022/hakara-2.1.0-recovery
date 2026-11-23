package p007c.p190n.p194b.p367f.p368a.p375f;

import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractBinderC5085d;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.f.g */
/* JADX INFO: loaded from: classes.dex */
public class BinderC5133g<T> extends AbstractBinderC5085d {

    /* JADX INFO: renamed from: f */
    public final C5089f f26090f;

    /* JADX INFO: renamed from: g */
    public final C5151o<T> f26091g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5135i f26092h;

    public BinderC5133g(C5135i c5135i, C5089f c5089f, C5151o<T> c5151o) {
        this.f26092h = c5135i;
        this.f26090f = c5089f;
        this.f26091g = c5151o;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5087e
    /* JADX INFO: renamed from: j3 */
    public void mo11530j3(Bundle bundle) throws RemoteException {
        this.f26092h.f26094b.m11549b();
        this.f26090f.m11533b(4, "onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
