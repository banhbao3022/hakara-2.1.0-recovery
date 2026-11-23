package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2617i0;
import p007c.p190n.p194b.p266d.p298f.C2621k0;
import p007c.p190n.p194b.p266d.p298f.C2625m0;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p322h.C4062a;
import p007c.p190n.p194b.p266d.p314j.p322h.C4064c;

/* JADX INFO: renamed from: c.n.b.d.f.q.k0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2742k0 extends C4062a implements InterfaceC2746m0 {
    public C2742k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2746m0
    /* JADX INFO: renamed from: C3 */
    public final boolean mo5602C3(C2625m0 c2625m0, InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM9328i1 = m9328i1();
        int i = C4064c.f23009a;
        parcelM9328i1.writeInt(1);
        c2625m0.writeToParcel(parcelM9328i1, 0);
        C4064c.m9330b(parcelM9328i1, interfaceC2799a);
        Parcel parcelM9327E0 = m9327E0(5, parcelM9328i1);
        boolean z = parcelM9327E0.readInt() != 0;
        parcelM9327E0.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2746m0
    /* JADX INFO: renamed from: Z2 */
    public final C2621k0 mo5603Z2(C2617i0 c2617i0) throws RemoteException {
        Parcel parcelM9328i1 = m9328i1();
        int i = C4064c.f23009a;
        parcelM9328i1.writeInt(1);
        c2617i0.writeToParcel(parcelM9328i1, 0);
        Parcel parcelM9327E0 = m9327E0(6, parcelM9328i1);
        C2621k0 c2621k0 = (C2621k0) C4064c.m9329a(parcelM9327E0, C2621k0.CREATOR);
        parcelM9327E0.recycle();
        return c2621k0;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p302q.InterfaceC2746m0
    /* JADX INFO: renamed from: f */
    public final boolean mo5604f() throws RemoteException {
        Parcel parcelM9327E0 = m9327E0(7, m9328i1());
        int i = C4064c.f23009a;
        boolean z = parcelM9327E0.readInt() != 0;
        parcelM9327E0.recycle();
        return z;
    }
}
