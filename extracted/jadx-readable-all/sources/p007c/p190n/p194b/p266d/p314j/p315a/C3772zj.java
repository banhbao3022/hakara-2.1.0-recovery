package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.zj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3772zj extends gg2 implements InterfaceC2883bk {
    public C3772zj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: Q1 */
    public final void mo6028Q1(InterfaceC3624vj interfaceC3624vj) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3624vj);
        m7002T1(3, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: c */
    public final void mo6029c() throws RemoteException {
        m7002T1(1, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: d */
    public final void mo6030d() throws RemoteException {
        m7002T1(2, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: d0 */
    public final void mo6031d0(int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(i);
        m7002T1(4, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: h */
    public final void mo6032h() throws RemoteException {
        m7002T1(6, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2883bk
    /* JADX INFO: renamed from: m0 */
    public final void mo6033m0(yv2 yv2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, yv2Var);
        m7002T1(5, parcelM7001E0);
    }
}
