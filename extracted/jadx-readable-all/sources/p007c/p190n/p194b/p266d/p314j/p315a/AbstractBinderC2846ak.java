package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.ak */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2846ak extends hg2 implements InterfaceC2883bk {
    public AbstractBinderC2846ak() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3624vj c3549tj;
        switch (i) {
            case 1:
                mo6029c();
                break;
            case 2:
                mo6030d();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c3549tj = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c3549tj = iInterfaceQueryLocalInterface instanceof InterfaceC3624vj ? (InterfaceC3624vj) iInterfaceQueryLocalInterface : new C3549tj(strongBinder);
                }
                mo6028Q1(c3549tj);
                break;
            case 4:
                mo6031d0(parcel.readInt());
                break;
            case 5:
                mo6033m0((yv2) ig2.m7250a(parcel, yv2.CREATOR));
                break;
            case 6:
                mo6032h();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
