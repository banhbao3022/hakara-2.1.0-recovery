package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.ud */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3580ud extends hg2 implements InterfaceC3618vd {
    public AbstractBinderC3580ud() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    /* JADX INFO: renamed from: F6 */
    public static InterfaceC3618vd m8482F6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface : new C3543td(iBinder);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3624vj c3549tj;
        switch (i) {
            case 1:
                mo6581c();
                break;
            case 2:
                mo6582d();
                break;
            case 3:
                mo6580Y(parcel.readInt());
                break;
            case 4:
                mo6583g();
                break;
            case 5:
                mo6586i();
                break;
            case 6:
                mo6585h();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof C3729yd) {
                    }
                }
                break;
            case 8:
                mo6588k();
                break;
            case 9:
                mo6594x5(parcel.readString(), parcel.readString());
                break;
            case 10:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (iInterfaceQueryLocalInterface2 instanceof InterfaceC3129i6) {
                    }
                }
                parcel.readString();
                break;
            case 11:
                mo5914p();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                mo5915u();
                break;
            case 14:
                mo5912V4((C3475rj) ig2.m7250a(parcel, C3475rj.CREATOR));
                break;
            case 15:
                mo6589l();
                break;
            case 16:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    c3549tj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c3549tj = iInterfaceQueryLocalInterface3 instanceof InterfaceC3624vj ? (InterfaceC3624vj) iInterfaceQueryLocalInterface3 : new C3549tj(strongBinder3);
                }
                mo5916u6(c3549tj);
                break;
            case 17:
                mo6590l2(parcel.readInt());
                break;
            case 18:
                mo5913o();
                break;
            case 19:
                break;
            case 20:
                mo6592r();
                break;
            case 21:
                mo6593v2(parcel.readString());
                break;
            case 22:
                mo6595z6(parcel.readInt(), parcel.readString());
                break;
            case 23:
                mo6584g1((yv2) ig2.m7250a(parcel, yv2.CREATOR));
                break;
            case 24:
                mo6591m3((yv2) ig2.m7250a(parcel, yv2.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
