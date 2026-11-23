package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yq2 extends gg2 implements zq2 {
    public yq2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zq2
    /* JADX INFO: renamed from: D0 */
    public final void mo8825D0(yv2 yv2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, yv2Var);
        m7002T1(3, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zq2
    /* JADX INFO: renamed from: L */
    public final void mo8826L(int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(i);
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zq2
    /* JADX INFO: renamed from: M0 */
    public final void mo8827M0(xq2 xq2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, xq2Var);
        m7002T1(1, parcelM7001E0);
    }
}
