package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.xj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3698xj extends hg2 implements InterfaceC3735yj {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f21557f = 0;

    public AbstractBinderC3698xj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3032fk c2958dk = null;
        InterfaceC3032fk c2958dk2 = null;
        InterfaceC3716y0 c3642w0 = null;
        C3069gk c3069gk = null;
        InterfaceC2883bk c3772zj = null;
        switch (i) {
            case 1:
                ew2 ew2Var = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c2958dk = iInterfaceQueryLocalInterface instanceof InterfaceC3032fk ? (InterfaceC3032fk) iInterfaceQueryLocalInterface : new C2958dk(strongBinder);
                }
                mo6902D3(ew2Var, c2958dk);
                parcel2.writeNoException();
                return true;
            case 2:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
                    c3772zj = iInterfaceQueryLocalInterface2 instanceof InterfaceC2883bk ? (InterfaceC2883bk) iInterfaceQueryLocalInterface2 : new C3772zj(strongBinder2);
                }
                mo6916w4(c3772zj);
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zMo6909i = mo6909i();
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(zMo6909i ? 1 : 0);
                return true;
            case 4:
                String strMo6908h = mo6908h();
                parcel2.writeNoException();
                parcel2.writeString(strMo6908h);
                return true;
            case 5:
                mo6915t0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 6:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
                    c3069gk = iInterfaceQueryLocalInterface3 instanceof C3069gk ? (C3069gk) iInterfaceQueryLocalInterface3 : new C3069gk(strongBinder3);
                }
                mo6914o5(c3069gk);
                parcel2.writeNoException();
                return true;
            case 7:
                mo6904N0((C3291mk) ig2.m7250a(parcel, C3291mk.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdMetadataChangedListener");
                    c3642w0 = iInterfaceQueryLocalInterface4 instanceof InterfaceC3716y0 ? (InterfaceC3716y0) iInterfaceQueryLocalInterface4 : new C3642w0(strongBinder4);
                }
                mo6905X4(c3642w0);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundleMo6907f = mo6907f();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleMo6907f);
                return true;
            case 10:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ClassLoader classLoader2 = ig2.f15182a;
                mo6906Z0(interfaceC2799aM5638i1, parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 11:
                InterfaceC3624vj interfaceC3624vjMo6911j = mo6911j();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3624vjMo6911j);
                return true;
            case 12:
                InterfaceC2976e1 interfaceC2976e1Mo6912m = mo6912m();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2976e1Mo6912m);
                return true;
            case 13:
                mo6910i2(AbstractBinderC2827a1.m5656F6(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 14:
                ew2 ew2Var2 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
                    c2958dk2 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3032fk ? (InterfaceC3032fk) iInterfaceQueryLocalInterface5 : new C2958dk(strongBinder5);
                }
                mo6913n4(ew2Var2, c2958dk2);
                parcel2.writeNoException();
                return true;
            case 15:
                ClassLoader classLoader3 = ig2.f15182a;
                mo6903F0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
