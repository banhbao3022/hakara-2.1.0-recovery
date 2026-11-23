package p007c.p190n.p194b.p266d.p311h;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p322h.C4062a;
import p007c.p190n.p194b.p266d.p314j.p322h.C4064c;

/* JADX INFO: renamed from: c.n.b.d.h.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2815m extends C4062a implements IInterface {
    public C2815m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* JADX INFO: renamed from: K2 */
    public final InterfaceC2799a m5649K2(InterfaceC2799a interfaceC2799a, String str, int i, InterfaceC2799a interfaceC2799a2) throws RemoteException {
        Parcel parcelM9328i1 = m9328i1();
        C4064c.m9330b(parcelM9328i1, interfaceC2799a);
        parcelM9328i1.writeString(str);
        parcelM9328i1.writeInt(i);
        C4064c.m9330b(parcelM9328i1, interfaceC2799a2);
        return outline.m1583e(m9327E0(3, parcelM9328i1));
    }

    /* JADX INFO: renamed from: T1 */
    public final InterfaceC2799a m5650T1(InterfaceC2799a interfaceC2799a, String str, int i, InterfaceC2799a interfaceC2799a2) throws RemoteException {
        Parcel parcelM9328i1 = m9328i1();
        C4064c.m9330b(parcelM9328i1, interfaceC2799a);
        parcelM9328i1.writeString(str);
        parcelM9328i1.writeInt(i);
        C4064c.m9330b(parcelM9328i1, interfaceC2799a2);
        return outline.m1583e(m9327E0(2, parcelM9328i1));
    }
}
