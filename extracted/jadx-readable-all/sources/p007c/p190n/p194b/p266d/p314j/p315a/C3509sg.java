package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.sg */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3509sg extends gg2 implements InterfaceC3583ug {
    public C3509sg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3583ug
    /* JADX INFO: renamed from: B0 */
    public final InterfaceC3435qg mo8351B0(InterfaceC2799a interfaceC2799a, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3435qg c3361og;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(1, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3361og = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3361og = iInterfaceQueryLocalInterface instanceof InterfaceC3435qg ? (InterfaceC3435qg) iInterfaceQueryLocalInterface : new C3361og(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3361og;
    }
}
