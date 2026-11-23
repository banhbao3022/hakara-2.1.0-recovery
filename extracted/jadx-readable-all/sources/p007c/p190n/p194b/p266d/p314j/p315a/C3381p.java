package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3381p extends gg2 implements InterfaceC3455r {
    public C3381p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: B6 */
    public final void mo5666B6(String str, InterfaceC3536t6 interfaceC3536t6, InterfaceC3425q6 interfaceC3425q6) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3536t6);
        ig2.m7253d(parcelM7001E0, interfaceC3425q6);
        m7002T1(5, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: C5 */
    public final void mo5667C5(C3165j5 c3165j5) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, c3165j5);
        m7002T1(6, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: K0 */
    public final void mo5670K0(InterfaceC3122i interfaceC3122i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3122i);
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: c */
    public final InterfaceC3344o mo5673c() throws RemoteException {
        InterfaceC3344o c3270m;
        Parcel parcelM7003i1 = m7003i1(1, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3270m = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            c3270m = iInterfaceQueryLocalInterface instanceof InterfaceC3344o ? (InterfaceC3344o) iInterfaceQueryLocalInterface : new C3270m(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3270m;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3455r
    /* JADX INFO: renamed from: c5 */
    public final void mo5674c5(InterfaceC3759z6 interfaceC3759z6) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3759z6);
        m7002T1(10, parcelM7001E0);
    }
}
