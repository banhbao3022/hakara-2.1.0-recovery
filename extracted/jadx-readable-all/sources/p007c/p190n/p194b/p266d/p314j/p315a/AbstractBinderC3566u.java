package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3566u extends hg2 implements InterfaceC3604v {
    public AbstractBinderC3566u() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3122i c3048g = null;
        InterfaceC3123i0 c3049g0 = null;
        InterfaceC3233l c3159j = null;
        InterfaceC2864b1 c3753z0 = null;
        zq2 yq2Var = null;
        InterfaceC3715y c3678x = null;
        InterfaceC3216kj c3179jj = null;
        C3012f0 c3012f0 = null;
        InterfaceC3011f c2937d = null;
        InterfaceC3719y3 c3682x3 = null;
        InterfaceC3251lh c3214kh = null;
        InterfaceC3177jh c3140ih = null;
        InterfaceC2863b0 c3752z = null;
        switch (i) {
            case 1:
                InterfaceC2799a interfaceC2799aMo4883a = mo4883a();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2799aMo4883a);
                return true;
            case 2:
                mo4886b();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zMo4888b2 = mo4888b2();
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(zMo4888b2 ? 1 : 0);
                return true;
            case 4:
                boolean zMo4904y0 = mo4904y0((ew2) ig2.m7250a(parcel, ew2.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(zMo4904y0 ? 1 : 0);
                return true;
            case 5:
                mo4889d();
                parcel2.writeNoException();
                return true;
            case 6:
                mo4890f();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    c3048g = iInterfaceQueryLocalInterface instanceof InterfaceC3122i ? (InterfaceC3122i) iInterfaceQueryLocalInterface : new C3048g(strongBinder);
                }
                mo4893j5(c3048g);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    c3752z = iInterfaceQueryLocalInterface2 instanceof InterfaceC2863b0 ? (InterfaceC2863b0) iInterfaceQueryLocalInterface2 : new C3752z(strongBinder2);
                }
                mo4867D5(c3752z);
                parcel2.writeNoException();
                return true;
            case 9:
                mo4892j();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                mo4895m();
                parcel2.writeNoException();
                return true;
            case 12:
                jw2 jw2VarMo4898p = mo4898p();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, jw2VarMo4898p);
                return true;
            case 13:
                mo4869F2((jw2) ig2.m7250a(parcel, jw2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
                    c3140ih = iInterfaceQueryLocalInterface3 instanceof InterfaceC3177jh ? (InterfaceC3177jh) iInterfaceQueryLocalInterface3 : new C3140ih(strongBinder3);
                }
                mo4866C6(c3140ih);
                parcel2.writeNoException();
                return true;
            case 15:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IPlayStorePurchaseListener");
                    c3214kh = iInterfaceQueryLocalInterface4 instanceof InterfaceC3251lh ? (InterfaceC3251lh) iInterfaceQueryLocalInterface4 : new C3214kh(strongBinder4);
                }
                mo4881U2(c3214kh, parcel.readString());
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strMo4905z = mo4905z();
                parcel2.writeNoException();
                parcel2.writeString(strMo4905z);
                return true;
            case 19:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
                    c3682x3 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3719y3 ? (InterfaceC3719y3) iInterfaceQueryLocalInterface5 : new C3682x3(strongBinder5);
                }
                mo4902u2(c3682x3);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    c2937d = iInterfaceQueryLocalInterface6 instanceof InterfaceC3011f ? (InterfaceC3011f) iInterfaceQueryLocalInterface6 : new C2937d(strongBinder6);
                }
                mo4876P1(c2937d);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    c3012f0 = iInterfaceQueryLocalInterface7 instanceof C3012f0 ? (C3012f0) iInterfaceQueryLocalInterface7 : new C3012f0(strongBinder7);
                }
                mo4878R5(c3012f0);
                parcel2.writeNoException();
                return true;
            case 22:
                ClassLoader classLoader2 = ig2.f15182a;
                mo4891h4(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zMo4887b0 = mo4887b0();
                parcel2.writeNoException();
                ClassLoader classLoader3 = ig2.f15182a;
                parcel2.writeInt(zMo4887b0 ? 1 : 0);
                return true;
            case 24:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                    c3179jj = iInterfaceQueryLocalInterface8 instanceof InterfaceC3216kj ? (InterfaceC3216kj) iInterfaceQueryLocalInterface8 : new C3179jj(strongBinder8);
                }
                mo4899p2(c3179jj);
                parcel2.writeNoException();
                return true;
            case 25:
                mo4896n2(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC3087h1 interfaceC3087h1Mo4875M = mo4875M();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1Mo4875M);
                return true;
            case 29:
                mo4885a6((C3310n2) ig2.m7250a(parcel, C3310n2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 30:
                mo4872H5((C3235l1) ig2.m7250a(parcel, C3235l1.CREATOR));
                parcel2.writeNoException();
                return true;
            case 31:
                String strMo4901r = mo4901r();
                parcel2.writeNoException();
                parcel2.writeString(strMo4901r);
                return true;
            case 32:
                InterfaceC2863b0 interfaceC2863b0Mo4865C = mo4865C();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2863b0Mo4865C);
                return true;
            case 33:
                InterfaceC3122i interfaceC3122iMo4864B = mo4864B();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3122iMo4864B);
                return true;
            case 34:
                ClassLoader classLoader4 = ig2.f15182a;
                mo4874L0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 35:
                String strMo4900q = mo4900q();
                parcel2.writeNoException();
                parcel2.writeString(strMo4900q);
                return true;
            case 36:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    c3678x = iInterfaceQueryLocalInterface9 instanceof InterfaceC3715y ? (InterfaceC3715y) iInterfaceQueryLocalInterface9 : new C3678x(strongBinder9);
                }
                mo4882U4(c3678x);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleMo4894k = mo4894k();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleMo4894k);
                return true;
            case 38:
                mo4873I4(parcel.readString());
                parcel2.writeNoException();
                return true;
            case 39:
                mo4903x1((qw2) ig2.m7250a(parcel, qw2.CREATOR));
                parcel2.writeNoException();
                return true;
            case 40:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
                    yq2Var = iInterfaceQueryLocalInterface10 instanceof zq2 ? (zq2) iInterfaceQueryLocalInterface10 : new yq2(strongBinder10);
                }
                mo4877Q4(yq2Var);
                parcel2.writeNoException();
                return true;
            case 41:
                InterfaceC2976e1 interfaceC2976e1Mo4897o = mo4897o();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2976e1Mo4897o);
                return true;
            case 42:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    c3753z0 = iInterfaceQueryLocalInterface11 instanceof InterfaceC2864b1 ? (InterfaceC2864b1) iInterfaceQueryLocalInterface11 : new C3753z0(strongBinder11);
                }
                mo4880T5(c3753z0);
                parcel2.writeNoException();
                return true;
            case 43:
                ew2 ew2Var = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    c3159j = iInterfaceQueryLocalInterface12 instanceof InterfaceC3233l ? (InterfaceC3233l) iInterfaceQueryLocalInterface12 : new C3159j(strongBinder12);
                }
                mo4868E5(ew2Var, c3159j);
                parcel2.writeNoException();
                return true;
            case 44:
                mo4884a4(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    c3049g0 = iInterfaceQueryLocalInterface13 instanceof InterfaceC3123i0 ? (InterfaceC3123i0) iInterfaceQueryLocalInterface13 : new C3049g0(strongBinder13);
                }
                mo4879S4(c3049g0);
                parcel2.writeNoException();
                return true;
        }
    }
}
