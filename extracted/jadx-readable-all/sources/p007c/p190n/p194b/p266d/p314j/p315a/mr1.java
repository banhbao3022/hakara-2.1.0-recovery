package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mr1 extends gg2 implements IInterface {
    public mr1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IClearcut");
    }

    /* JADX INFO: renamed from: K2 */
    public final void m7727K2(InterfaceC2799a interfaceC2799a, String str, String str2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(null);
        m7002T1(8, parcelM7001E0);
    }
}
