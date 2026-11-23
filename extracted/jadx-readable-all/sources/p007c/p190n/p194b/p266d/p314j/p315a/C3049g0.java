package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.g0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3049g0 extends gg2 implements InterfaceC3123i0 {
    public C3049g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3123i0
    /* JADX INFO: renamed from: A3 */
    public final void mo6127A3(yv2 yv2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, yv2Var);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3123i0
    /* JADX INFO: renamed from: b */
    public final void mo6128b() throws RemoteException {
        m7002T1(2, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3123i0
    /* JADX INFO: renamed from: c */
    public final void mo6129c() throws RemoteException {
        m7002T1(4, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3123i0
    /* JADX INFO: renamed from: e */
    public final void mo6130e() throws RemoteException {
        m7002T1(3, m7001E0());
    }
}
