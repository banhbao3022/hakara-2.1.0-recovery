package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.od */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3358od extends hg2 implements InterfaceC3395pd {
    public AbstractBinderC3358od() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3395pd m7996F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3395pd ? (InterfaceC3395pd) iInterfaceQueryLocalInterface : new C3284md(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            InterfaceC3506sd interfaceC3506sdMo7586t = ((BinderC3247ld) this).mo7586t(parcel.readString());
            parcel2.writeNoException();
            ig2.m7253d(parcel2, interfaceC3506sdMo7586t);
        } else if (i == 2) {
            boolean zMo7583E = ((BinderC3247ld) this).mo7583E(parcel.readString());
            parcel2.writeNoException();
            ClassLoader classLoader = ig2.f15182a;
            parcel2.writeInt(zMo7583E ? 1 : 0);
        } else if (i == 3) {
            InterfaceC3249lf interfaceC3249lfMo7584S = ((BinderC3247ld) this).mo7584S(parcel.readString());
            parcel2.writeNoException();
            ig2.m7253d(parcel2, interfaceC3249lfMo7584S);
        } else {
            if (i != 4) {
                return false;
            }
            boolean zMo7585o0 = ((BinderC3247ld) this).mo7585o0(parcel.readString());
            parcel2.writeNoException();
            ClassLoader classLoader2 = ig2.f15182a;
            parcel2.writeInt(zMo7585o0 ? 1 : 0);
        }
        return true;
    }
}
