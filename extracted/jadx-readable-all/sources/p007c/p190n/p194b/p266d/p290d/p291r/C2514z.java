package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2514z extends C3988s implements InterfaceC2512x {
    public C2514z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2512x
    /* JADX INFO: renamed from: G */
    public final boolean mo5108G() throws RemoteException {
        Parcel parcelM9212i1 = m9212i1(12, m9209E0());
        int i = C4016v.f22903a;
        boolean z = parcelM9212i1.readInt() != 0;
        parcelM9212i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2512x
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC2437h0 mo5109g0() throws RemoteException {
        InterfaceC2437h0 c2443k0;
        Parcel parcelM9212i1 = m9212i1(5, m9209E0());
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        if (strongBinder == null) {
            c2443k0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            c2443k0 = iInterfaceQueryLocalInterface instanceof InterfaceC2437h0 ? (InterfaceC2437h0) iInterfaceQueryLocalInterface : new C2443k0(strongBinder);
        }
        parcelM9212i1.recycle();
        return c2443k0;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2512x
    /* JADX INFO: renamed from: j0 */
    public final InterfaceC2427c0 mo5110j0() throws RemoteException {
        InterfaceC2427c0 c2431e0;
        Parcel parcelM9212i1 = m9212i1(6, m9209E0());
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        if (strongBinder == null) {
            c2431e0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            c2431e0 = iInterfaceQueryLocalInterface instanceof InterfaceC2427c0 ? (InterfaceC2427c0) iInterfaceQueryLocalInterface : new C2431e0(strongBinder);
        }
        parcelM9212i1.recycle();
        return c2431e0;
    }
}
