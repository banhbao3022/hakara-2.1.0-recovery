package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.wj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3661wj extends gg2 implements InterfaceC3735yj {
    public C3661wj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: D3 */
    public final void mo6902D3(ew2 ew2Var, InterfaceC3032fk interfaceC3032fk) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC3032fk);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: t0 */
    public final void mo6915t0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(5, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: w4 */
    public final void mo6916w4(InterfaceC2883bk interfaceC2883bk) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2883bk);
        m7002T1(2, parcelM7001E0);
    }
}
