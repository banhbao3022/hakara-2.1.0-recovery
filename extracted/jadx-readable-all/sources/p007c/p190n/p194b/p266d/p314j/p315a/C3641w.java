package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3641w extends gg2 implements IInterface {
    public C3641w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    /* JADX INFO: renamed from: K2 */
    public final IBinder m8601K2(InterfaceC2799a interfaceC2799a, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd, int i, int i2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, jw2Var);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        parcelM7001E0.writeInt(i2);
        Parcel parcelM7003i1 = m7003i1(2, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        parcelM7003i1.recycle();
        return strongBinder;
    }
}
