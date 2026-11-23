package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.rd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3469rd extends hg2 implements InterfaceC3506sd {
    public AbstractBinderC3469rd() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3618vd c3543td = null;
        InterfaceC3618vd c3543td2 = null;
        InterfaceC3618vd c3543td3 = null;
        InterfaceC2948da c2873ba = null;
        InterfaceC3618vd c3543td4 = null;
        InterfaceC3618vd c3543td5 = null;
        InterfaceC3618vd c3543td6 = null;
        InterfaceC3618vd c3543td7 = null;
        InterfaceC3618vd c3543td8 = null;
        switch (i) {
            case 1:
                InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                jw2 jw2Var = (jw2) ig2.m7250a(parcel, jw2.CREATOR);
                ew2 ew2Var = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td = iInterfaceQueryLocalInterface instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface : new C3543td(strongBinder);
                }
                mo7825M3(interfaceC2799aM5638i1, jw2Var, ew2Var, string, c3543td);
                parcel2.writeNoException();
                return true;
            case 2:
                InterfaceC2799a interfaceC2799aMo7838d = mo7838d();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2799aMo7838d);
                return true;
            case 3:
                InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ew2 ew2Var2 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td8 = iInterfaceQueryLocalInterface2 instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface2 : new C3543td(strongBinder2);
                }
                mo7830U0(interfaceC2799aM5638i2, ew2Var2, string2, c3543td8);
                parcel2.writeNoException();
                return true;
            case 4:
                mo7842g();
                parcel2.writeNoException();
                return true;
            case 5:
                mo7845i();
                parcel2.writeNoException();
                return true;
            case 6:
                InterfaceC2799a interfaceC2799aM5638i3 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                jw2 jw2Var2 = (jw2) ig2.m7250a(parcel, jw2.CREATOR);
                ew2 ew2Var3 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td7 = iInterfaceQueryLocalInterface3 instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface3 : new C3543td(strongBinder3);
                }
                mo7832W3(interfaceC2799aM5638i3, jw2Var2, ew2Var3, string3, string4, c3543td7);
                parcel2.writeNoException();
                return true;
            case 7:
                InterfaceC2799a interfaceC2799aM5638i4 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ew2 ew2Var4 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td6 = iInterfaceQueryLocalInterface4 instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface4 : new C3543td(strongBinder4);
                }
                mo7836c1(interfaceC2799aM5638i4, ew2Var4, string5, string6, c3543td6);
                parcel2.writeNoException();
                return true;
            case 8:
                mo7846j();
                parcel2.writeNoException();
                return true;
            case 9:
                mo7848m();
                parcel2.writeNoException();
                return true;
            case 10:
                mo7841e3(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), (ew2) ig2.m7250a(parcel, ew2.CREATOR), parcel.readString(), AbstractBinderC3401pj.m8119F6(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                mo7819A6((ew2) ig2.m7250a(parcel, ew2.CREATOR), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 12:
                mo7849n();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zMo7847l = mo7847l();
                parcel2.writeNoException();
                ClassLoader classLoader = ig2.f15182a;
                parcel2.writeInt(zMo7847l ? 1 : 0);
                return true;
            case 14:
                InterfaceC2799a interfaceC2799aM5638i5 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ew2 ew2Var5 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td5 = iInterfaceQueryLocalInterface5 instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface5 : new C3543td(strongBinder5);
                }
                mo7837c2(interfaceC2799aM5638i5, ew2Var5, string7, string8, c3543td5, (C3165j5) ig2.m7250a(parcel, C3165j5.CREATOR), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                ig2.m7253d(parcel2, null);
                return true;
            case 17:
                Bundle bundleMo7853q = mo7853q();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleMo7853q);
                return true;
            case 18:
                Bundle bundleMo7851o = mo7851o();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleMo7851o);
                return true;
            case 19:
                Bundle bundleMo7854r = mo7854r();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, bundleMo7854r);
                return true;
            case 20:
                mo7843h2((ew2) ig2.m7250a(parcel, ew2.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 21:
                mo7840e0(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                ClassLoader classLoader2 = ig2.f15182a;
                parcel2.writeInt(0);
                return true;
            case 23:
                mo7839d3(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()), AbstractBinderC3401pj.m8119F6(parcel.readStrongBinder()), parcel.createStringArrayList());
                parcel2.writeNoException();
                return true;
            case 24:
                InterfaceC3129i6 interfaceC3129i6Mo7856v = mo7856v();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3129i6Mo7856v);
                return true;
            case 25:
                ClassLoader classLoader3 = ig2.f15182a;
                mo7855s0(parcel.readInt() != 0);
                parcel2.writeNoException();
                return true;
            case 26:
                InterfaceC3087h1 interfaceC3087h1Mo7828O = mo7828O();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3087h1Mo7828O);
                return true;
            case 27:
                InterfaceC2952de interfaceC2952deMo7835b5 = mo7835b5();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC2952deMo7835b5);
                return true;
            case 28:
                InterfaceC2799a interfaceC2799aM5638i6 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ew2 ew2Var6 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string9 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td4 = iInterfaceQueryLocalInterface6 instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface6 : new C3543td(strongBinder6);
                }
                mo7827N1(interfaceC2799aM5638i6, ew2Var6, string9, c3543td4);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                mo7844h3(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 31:
                InterfaceC2799a interfaceC2799aM5638i7 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
                    c2873ba = iInterfaceQueryLocalInterface7 instanceof InterfaceC2948da ? (InterfaceC2948da) iInterfaceQueryLocalInterface7 : new C2873ba(strongBinder7);
                }
                mo7834a2(interfaceC2799aM5638i7, c2873ba, parcel.createTypedArrayList(C3096ha.CREATOR));
                parcel2.writeNoException();
                return true;
            case 32:
                InterfaceC2799a interfaceC2799aM5638i8 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                ew2 ew2Var7 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string10 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td3 = iInterfaceQueryLocalInterface8 instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface8 : new C3543td(strongBinder8);
                }
                mo7850n5(interfaceC2799aM5638i8, ew2Var7, string10, c3543td3);
                parcel2.writeNoException();
                return true;
            case 33:
                C3694xf c3694xfMo7833X = mo7833X();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, c3694xfMo7833X);
                return true;
            case 34:
                C3694xf c3694xfMo7824H0 = mo7824H0();
                parcel2.writeNoException();
                ig2.m7252c(parcel2, c3694xfMo7824H0);
                return true;
            case 35:
                InterfaceC2799a interfaceC2799aM5638i9 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                jw2 jw2Var3 = (jw2) ig2.m7250a(parcel, jw2.CREATOR);
                ew2 ew2Var8 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    c3543td2 = iInterfaceQueryLocalInterface9 instanceof InterfaceC3618vd ? (InterfaceC3618vd) iInterfaceQueryLocalInterface9 : new C3543td(strongBinder9);
                }
                mo7822G2(interfaceC2799aM5638i9, jw2Var3, ew2Var8, string11, string12, c3543td2);
                parcel2.writeNoException();
                return true;
            case 36:
                InterfaceC3692xd interfaceC3692xdMo7829T = mo7829T();
                parcel2.writeNoException();
                ig2.m7253d(parcel2, interfaceC3692xdMo7829T);
                return true;
            case 37:
                mo7831U1(InterfaceC2799a.a.m5638i1(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
        }
    }
}
