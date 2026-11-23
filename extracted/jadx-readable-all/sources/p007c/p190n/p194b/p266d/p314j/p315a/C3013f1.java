package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.f1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3013f1 extends gg2 implements InterfaceC3087h1 {
    public C3013f1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: g4 */
    public final void mo5775g4(InterfaceC3198k1 interfaceC3198k1) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3198k1);
        m7002T1(8, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: h */
    public final float mo5776h() throws RemoteException {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: k */
    public final float mo5778k() throws RemoteException {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: m */
    public final float mo5780m() throws RemoteException {
        throw null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1
    /* JADX INFO: renamed from: u */
    public final InterfaceC3198k1 mo5783u() throws RemoteException {
        InterfaceC3198k1 c3124i1;
        Parcel parcelM7003i1 = m7003i1(11, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3124i1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            c3124i1 = iInterfaceQueryLocalInterface instanceof InterfaceC3198k1 ? (InterfaceC3198k1) iInterfaceQueryLocalInterface : new C3124i1(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3124i1;
    }
}
