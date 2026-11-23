package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.qm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3441qm extends gg2 implements InterfaceC3515sm {
    public C3441qm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3515sm
    /* JADX INFO: renamed from: B0 */
    public final InterfaceC3404pm mo8218B0(InterfaceC2799a interfaceC2799a, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3404pm c3330nm;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(2, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3330nm = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c3330nm = iInterfaceQueryLocalInterface instanceof InterfaceC3404pm ? (InterfaceC3404pm) iInterfaceQueryLocalInterface : new C3330nm(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3330nm;
    }
}
