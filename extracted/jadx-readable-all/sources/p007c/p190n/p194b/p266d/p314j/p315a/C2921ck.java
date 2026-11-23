package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ck */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2921ck extends gg2 implements IInterface {
    public C2921ck(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    /* JADX INFO: renamed from: K2 */
    public final IBinder m6197K2(InterfaceC2799a interfaceC2799a, String str, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(1, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        parcelM7003i1.recycle();
        return strongBinder;
    }
}
