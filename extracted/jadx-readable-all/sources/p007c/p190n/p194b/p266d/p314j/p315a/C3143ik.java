package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p276f0.InterfaceC2173a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ik */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3143ik implements InterfaceC2173a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3624vj f15255a;

    public C3143ik(InterfaceC3624vj interfaceC3624vj) {
        this.f15255a = interfaceC3624vj;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p276f0.InterfaceC2173a
    /* JADX INFO: renamed from: a */
    public final String mo4623a() {
        InterfaceC3624vj interfaceC3624vj = this.f15255a;
        if (interfaceC3624vj != null) {
            try {
                return interfaceC3624vj.mo8121c();
            } catch (RemoteException e) {
                C2622l.m5241D3("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p276f0.InterfaceC2173a
    /* JADX INFO: renamed from: b */
    public final int mo4624b() {
        InterfaceC3624vj interfaceC3624vj = this.f15255a;
        if (interfaceC3624vj != null) {
            try {
                return interfaceC3624vj.mo8122d();
            } catch (RemoteException e) {
                C2622l.m5241D3("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }
}
