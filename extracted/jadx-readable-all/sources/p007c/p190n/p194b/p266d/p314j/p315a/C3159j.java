package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3159j extends gg2 implements InterfaceC3233l {
    public C3159j(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3233l
    /* JADX INFO: renamed from: a */
    public final void mo6113a() throws RemoteException {
        m7002T1(1, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3233l
    /* JADX INFO: renamed from: d6 */
    public final void mo6114d6(yv2 yv2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, yv2Var);
        m7002T1(2, parcelM7001E0);
    }
}
