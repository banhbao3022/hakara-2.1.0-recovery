package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p276f0.InterfaceC2173a;

/* JADX INFO: renamed from: c.n.b.d.j.a.pk */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3402pk extends AbstractBinderC3586uj {

    /* JADX INFO: renamed from: f */
    public final String f17999f;

    /* JADX INFO: renamed from: g */
    public final int f18000g;

    public BinderC3402pk(InterfaceC2173a interfaceC2173a) {
        this(interfaceC2173a != null ? interfaceC2173a.mo4623a() : "", interfaceC2173a != null ? interfaceC2173a.mo4624b() : 1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3624vj
    /* JADX INFO: renamed from: c */
    public final String mo8121c() throws RemoteException {
        return this.f17999f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3624vj
    /* JADX INFO: renamed from: d */
    public final int mo8122d() throws RemoteException {
        return this.f18000g;
    }

    public BinderC3402pk(String str, int i) {
        this.f17999f = str;
        this.f18000g = i;
    }
}
