package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.jj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3179jj extends gg2 implements InterfaceC3216kj {
    public C3179jj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: c */
    public final void mo7347c() throws RemoteException {
        m7002T1(1, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: c3 */
    public final void mo7348c3(InterfaceC3068gj interfaceC3068gj) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3068gj);
        m7002T1(5, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: d */
    public final void mo7349d() throws RemoteException {
        m7002T1(2, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: f */
    public final void mo7350f() throws RemoteException {
        m7002T1(3, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: g */
    public final void mo7351g() throws RemoteException {
        m7002T1(4, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: h */
    public final void mo7352h() throws RemoteException {
        m7002T1(6, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: j */
    public final void mo7353j() throws RemoteException {
        m7002T1(8, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj
    /* JADX INFO: renamed from: n0 */
    public final void mo7354n0(int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(i);
        m7002T1(7, parcelM7001E0);
    }
}
