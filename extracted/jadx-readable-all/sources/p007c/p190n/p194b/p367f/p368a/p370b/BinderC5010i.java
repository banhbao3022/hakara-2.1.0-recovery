package p007c.p190n.p194b.p367f.p368a.p370b;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import p007c.p190n.p194b.p367f.p368a.p373d.AbstractBinderC5108o0;
import p007c.p190n.p194b.p367f.p368a.p377h.C5151o;

/* JADX INFO: renamed from: c.n.b.f.a.b.i */
/* JADX INFO: loaded from: classes.dex */
public class BinderC5010i<T> extends AbstractBinderC5108o0 {

    /* JADX INFO: renamed from: f */
    public final C5151o<T> f25823f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C5030n f25824g;

    public BinderC5010i(C5030n c5030n, C5151o<T> c5151o) {
        this.f25824g = c5030n;
        this.f25823f = c5151o;
    }

    public BinderC5010i(C5030n c5030n, C5151o c5151o, byte[] bArr) {
        this.f25824g = c5030n;
        this.f25823f = c5151o;
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: H4 */
    public void mo11451H4(Bundle bundle, Bundle bundle2) {
        this.f25824g.f25882f.m11549b();
        C5030n.f25877a.m11533b(4, "onKeepAlive(%b)", new Object[]{Boolean.valueOf(bundle.getBoolean("keep_alive"))});
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: M5 */
    public void mo11452M5(List<Bundle> list) {
        this.f25824g.f25881e.m11549b();
        C5030n.f25877a.m11533b(4, "onGetSessionStates", new Object[0]);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: s5 */
    public void mo11453s5(Bundle bundle) {
        this.f25824g.f25881e.m11549b();
        int i = bundle.getInt("error_code");
        C5030n.f25877a.m11533b(6, "onError(%d)", new Object[]{Integer.valueOf(i)});
        this.f25823f.m11572a(new C4978a(i));
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5110p0
    /* JADX INFO: renamed from: t5 */
    public void mo11454t5(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f25824g.f25881e.m11549b();
        C5030n.f25877a.m11533b(4, "onGetChunkFileDescriptor", new Object[0]);
    }

    public BinderC5010i(C5030n c5030n, C5151o c5151o, char[] cArr) {
        this.f25824g = c5030n;
        this.f25823f = c5151o;
    }

    public BinderC5010i(C5030n c5030n, C5151o c5151o, int[] iArr) {
        this.f25824g = c5030n;
        this.f25823f = c5151o;
    }
}
