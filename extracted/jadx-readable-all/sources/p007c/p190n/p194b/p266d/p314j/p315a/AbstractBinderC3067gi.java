package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.gi */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3067gi extends hg2 implements InterfaceC3104hi {
    public AbstractBinderC3067gi() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3252li c3178ji = null;
        if (i == 1) {
            parcel2.writeNoException();
            ig2.m7252c(parcel2, null);
        } else if (i == 2) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (iInterfaceQueryLocalInterface instanceof C3141ii) {
                }
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            C3437qi c3437qi = (C3437qi) ig2.m7250a(parcel, C3437qi.CREATOR);
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c3178ji = iInterfaceQueryLocalInterface2 instanceof InterfaceC3252li ? (InterfaceC3252li) iInterfaceQueryLocalInterface2 : new C3178ji(strongBinder2);
            }
            ((pu0) this).mo6817i6(c3437qi, c3178ji);
            parcel2.writeNoException();
        } else if (i == 5) {
            C3437qi c3437qi2 = (C3437qi) ig2.m7250a(parcel, C3437qi.CREATOR);
            IBinder strongBinder3 = parcel.readStrongBinder();
            if (strongBinder3 != null) {
                IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c3178ji = iInterfaceQueryLocalInterface3 instanceof InterfaceC3252li ? (InterfaceC3252li) iInterfaceQueryLocalInterface3 : new C3178ji(strongBinder3);
            }
            pu0 pu0Var = (pu0) this;
            pu0Var.m8163L6(pu0Var.m8162I6(c3437qi2, Binder.getCallingUid()), c3178ji);
            parcel2.writeNoException();
        } else if (i == 6) {
            C3437qi c3437qi3 = (C3437qi) ig2.m7250a(parcel, C3437qi.CREATOR);
            IBinder strongBinder4 = parcel.readStrongBinder();
            if (strongBinder4 != null) {
                IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c3178ji = iInterfaceQueryLocalInterface4 instanceof InterfaceC3252li ? (InterfaceC3252li) iInterfaceQueryLocalInterface4 : new C3178ji(strongBinder4);
            }
            pu0 pu0Var2 = (pu0) this;
            pu0Var2.m8163L6(pu0Var2.m8160G6(c3437qi3, Binder.getCallingUid()), c3178ji);
            parcel2.writeNoException();
        } else {
            if (i != 7) {
                return false;
            }
            String string = parcel.readString();
            IBinder strongBinder5 = parcel.readStrongBinder();
            if (strongBinder5 != null) {
                IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                c3178ji = iInterfaceQueryLocalInterface5 instanceof InterfaceC3252li ? (InterfaceC3252li) iInterfaceQueryLocalInterface5 : new C3178ji(strongBinder5);
            }
            pu0 pu0Var3 = (pu0) this;
            pu0Var3.m8163L6(pu0Var3.m8161H6(string), c3178ji);
            parcel2.writeNoException();
        }
        return true;
    }
}
