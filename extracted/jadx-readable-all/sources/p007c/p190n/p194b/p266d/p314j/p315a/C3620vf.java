package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.vf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3620vf implements InterfaceC2110d<?, ?> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3138if f20755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3618vd f20756b;

    public C3620vf(BinderC3657wf binderC3657wf, InterfaceC3138if interfaceC3138if, InterfaceC3618vd interfaceC3618vd) {
        this.f20755a = interfaceC3138if;
        this.f20756b = interfaceC3618vd;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d
    /* JADX INFO: renamed from: a */
    public final void mo4603a(C2103a c2103a) {
        try {
            this.f20755a.mo6994s(c2103a.m4597a());
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
