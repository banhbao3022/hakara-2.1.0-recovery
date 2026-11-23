package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wq2 extends hg2 implements xq2 {
    public wq2() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        ar2 ar2Var = null;
        cr2 br2Var = null;
        switch (i) {
            case 2:
                InterfaceC3604v interfaceC3604vMo7184c = mo7184c();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3604vMo7184c);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    ar2Var = iInterfaceQueryLocalInterface instanceof ar2 ? (ar2) iInterfaceQueryLocalInterface : new ar2(strongBinder);
                }
                mo7181P4(ar2Var);
                parcel2.writeNoException();
                return true;
            case 4:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    br2Var = iInterfaceQueryLocalInterface2 instanceof cr2 ? (cr2) iInterfaceQueryLocalInterface2 : new br2(strongBinder2);
                }
                mo7182S3(interfaceC2799aM5638i1, br2Var);
                parcel2.writeNoException();
                return true;
            case 5:
                InterfaceC2976e1 interfaceC2976e1Mo7185f = mo7185f();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2976e1Mo7185f);
                return true;
            case 6:
                ClassLoader classLoader = ig2.f15182a;
                mo7186v0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 7:
                mo7183Y5(AbstractBinderC2827a1.m5656F6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
