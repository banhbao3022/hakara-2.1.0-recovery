package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.fi */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3030fi extends gg2 implements InterfaceC3104hi {
    public C3030fi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: B4 */
    public final void mo6814B4(String str, InterfaceC3252li interfaceC3252li) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3252li);
        m7002T1(7, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: J1 */
    public final void mo6815J1(C3437qi c3437qi, InterfaceC3252li interfaceC3252li) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, c3437qi);
        ig2.m7253d(parcelM7001E0, interfaceC3252li);
        m7002T1(6, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: a1 */
    public final void mo6816a1(C3437qi c3437qi, InterfaceC3252li interfaceC3252li) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, c3437qi);
        ig2.m7253d(parcelM7001E0, interfaceC3252li);
        m7002T1(5, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3104hi
    /* JADX INFO: renamed from: i6 */
    public final void mo6817i6(C3437qi c3437qi, InterfaceC3252li interfaceC3252li) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, c3437qi);
        ig2.m7253d(parcelM7001E0, interfaceC3252li);
        m7002T1(4, parcelM7001E0);
    }
}
