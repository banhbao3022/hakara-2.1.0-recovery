package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.qf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3434qf implements InterfaceC2110d<?, ?> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3730ye f18274a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3618vd f18275b;

    public C3434qf(InterfaceC3730ye interfaceC3730ye, InterfaceC3618vd interfaceC3618vd) {
        this.f18274a = interfaceC3730ye;
        this.f18275b = interfaceC3618vd;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d
    /* JADX INFO: renamed from: a */
    public final void mo4603a(C2103a c2103a) {
        try {
            this.f18274a.mo7739s(c2103a.m4597a());
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
