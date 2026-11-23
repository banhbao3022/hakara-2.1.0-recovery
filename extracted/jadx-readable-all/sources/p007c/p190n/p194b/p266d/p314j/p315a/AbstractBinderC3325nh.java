package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.nh */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3325nh extends hg2 implements InterfaceC3362oh {
    public AbstractBinderC3325nh() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3362oh m7862F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3362oh ? (InterfaceC3362oh) iInterfaceQueryLocalInterface : new C3288mh(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo7699y5(parcel.createTypedArrayList(Uri.CREATOR));
        } else {
            if (i != 2) {
                return false;
            }
            mo7698S(parcel.readString());
        }
        parcel2.writeNoException();
        return true;
    }
}
