package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.sf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3508sf implements InterfaceC2110d<?, ?> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2878bf f19544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3618vd f19545b;

    public C3508sf(BinderC3657wf binderC3657wf, InterfaceC2878bf interfaceC2878bf, InterfaceC3618vd interfaceC3618vd) {
        this.f19544a = interfaceC2878bf;
        this.f19545b = interfaceC3618vd;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d
    /* JADX INFO: renamed from: a */
    public final void mo4603a(C2103a c2103a) {
        try {
            this.f19544a.mo5987s(c2103a.m4597a());
        } catch (RemoteException e) {
            C2622l.m5438t3("", e);
        }
    }
}
