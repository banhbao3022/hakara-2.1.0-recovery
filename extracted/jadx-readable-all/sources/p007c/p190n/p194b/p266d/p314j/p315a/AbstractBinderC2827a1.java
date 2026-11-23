package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.a1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2827a1 extends hg2 implements InterfaceC2864b1 {
    public AbstractBinderC2827a1() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC2864b1 m5656F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC2864b1 ? (InterfaceC2864b1) iInterfaceQueryLocalInterface : new C3753z0(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ((BinderC3088h2) this).mo5908o4((lw2) ig2.m7250a(parcel, lw2.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
