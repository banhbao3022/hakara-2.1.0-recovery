package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.q0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3419q0 extends hg2 implements InterfaceC3456r0 {
    public AbstractBinderC3419q0() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3456r0 m8172F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3456r0 ? (InterfaceC3456r0) iInterfaceQueryLocalInterface : new C3382p0(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String str = ((BinderC3606v1) this).f20685f;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else {
            if (i != 2) {
                return false;
            }
            String str2 = ((BinderC3606v1) this).f20686g;
            parcel2.writeNoException();
            parcel2.writeString(str2);
        }
        return true;
    }
}
