package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.k0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3197k0 extends hg2 implements InterfaceC3234l0 {
    public AbstractBinderC3197k0() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3059ga c2985ea = null;
        InterfaceC3605v0 c3530t0 = null;
        switch (i) {
            case 1:
                mo6545c();
                parcel2.writeNoException();
                return true;
            case 2:
                mo6543Z1(parcel.readFloat());
                parcel2.writeNoException();
                return true;
            case 3:
                mo6539K4(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 4:
                ClassLoader classLoader = ig2.f15182a;
                mo6552v0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 5:
                mo6541X1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                mo6546g2(parcel.readString(), InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 7:
                float fMo6548k = mo6548k();
                parcel2.writeNoException();
                parcel2.writeFloat(fMo6548k);
                return true;
            case 8:
                boolean zMo6547j = mo6547j();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ig2.f15182a;
                parcel2.writeInt(zMo6547j ? 1 : 0);
                return true;
            case 9:
                String strMo6550m = mo6550m();
                parcel2.writeNoException();
                parcel2.writeString(strMo6550m);
                return true;
            case 10:
                mo6538I(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                mo6542Y3(AbstractBinderC3358od.m7996F6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 12:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    c2985ea = iInterfaceQueryLocalInterface instanceof InterfaceC3059ga ? (InterfaceC3059ga) iInterfaceQueryLocalInterface : new C2985ea(strongBinder);
                }
                mo6537C1(c2985ea);
                parcel2.writeNoException();
                return true;
            case 13:
                List<C3762z9> listMo6549l = mo6549l();
                parcel2.writeNoException();
                parcel2.writeTypedList(listMo6549l);
                return true;
            case 14:
                mo6540T2((C3125i2) ig2.m7250a(parcel, C3125i2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                mo6551q();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    c3530t0 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3605v0 ? (InterfaceC3605v0) iInterfaceQueryLocalInterface2 : new C3530t0(strongBinder2);
                }
                mo6544Z5(c3530t0);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
