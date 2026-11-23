package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.kf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3212kf extends hg2 implements InterfaceC3249lf {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f15931f = 0;

    public AbstractBinderC3212kf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [c.n.b.d.j.a.of] */
    /* JADX WARN: Type inference failed for: r14v0, types: [c.n.b.d.j.a.bf] */
    /* JADX WARN: Type inference failed for: r14v1, types: [c.n.b.d.j.a.if] */
    /* JADX WARN: Type inference failed for: r14v2, types: [c.n.b.d.j.a.ff] */
    /* JADX WARN: Type inference failed for: r16v1, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r17v2, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r21v0, types: [c.n.b.d.j.a.ye] */
    /* JADX WARN: Type inference failed for: r22v1, types: [c.n.b.d.j.a.ye] */
    /* JADX WARN: Type inference failed for: r4v24, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r4v30, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r5v2, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r9v11, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r9v3, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r9v5, types: [c.n.b.d.j.a.wf] */
    /* JADX WARN: Type inference failed for: r9v7, types: [c.n.b.d.j.a.ff] */
    /* JADX WARN: Type inference failed for: r9v9, types: [c.n.b.d.j.a.if] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface c3286mf = null;
        if (i == 1) {
            InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            String string = parcel.readString();
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) ig2.m7250a(parcel, creator);
            Bundle bundle2 = (Bundle) ig2.m7250a(parcel, creator);
            jw2 jw2Var = (jw2) ig2.m7250a(parcel, jw2.CREATOR);
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                c3286mf = iInterfaceQueryLocalInterface instanceof InterfaceC3360of ? (InterfaceC3360of) iInterfaceQueryLocalInterface : new C3286mf(strongBinder);
            }
            ((BinderC3657wf) this).mo7334o2(interfaceC2799aM5638i1, string, bundle, bundle2, jw2Var, c3286mf);
            parcel2.writeNoException();
        } else if (i == 2) {
            C3694xf c3694xfMo7329d = ((BinderC3657wf) this).mo7329d();
            parcel2.writeNoException();
            ig2.m7252c(parcel2, c3694xfMo7329d);
        } else if (i == 3) {
            C3694xf c3694xfMo7331f = ((BinderC3657wf) this).mo7331f();
            parcel2.writeNoException();
            ig2.m7252c(parcel2, c3694xfMo7331f);
        } else if (i == 5) {
            InterfaceC3087h1 interfaceC3087h1Mo7332g = ((BinderC3657wf) this).mo7332g();
            parcel2.writeNoException();
            ig2.m7253d(parcel2, interfaceC3087h1Mo7332g);
        } else if (i == 10) {
            InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            parcel2.writeNoException();
        } else if (i != 11) {
            switch (i) {
                case 13:
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    ew2 ew2Var = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                    InterfaceC2799a interfaceC2799aM5638i2 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c3286mf = iInterfaceQueryLocalInterface2 instanceof InterfaceC3730ye ? (InterfaceC3730ye) iInterfaceQueryLocalInterface2 : new C3656we(strongBinder2);
                    }
                    ((BinderC3657wf) this).mo7333m4(string2, string3, ew2Var, interfaceC2799aM5638i2, c3286mf, AbstractBinderC3580ud.m8482F6(parcel.readStrongBinder()), (jw2) ig2.m7250a(parcel, jw2.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    ew2 ew2Var2 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                    InterfaceC2799a interfaceC2799aM5638i3 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    IBinder strongBinder3 = parcel.readStrongBinder();
                    if (strongBinder3 != null) {
                        IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        c3286mf = iInterfaceQueryLocalInterface3 instanceof InterfaceC2878bf ? (InterfaceC2878bf) iInterfaceQueryLocalInterface3 : new C3767ze(strongBinder3);
                    }
                    ((BinderC3657wf) this).mo7330e5(string4, string5, ew2Var2, interfaceC2799aM5638i3, c3286mf, AbstractBinderC3580ud.m8482F6(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    ClassLoader classLoader = ig2.f15182a;
                    parcel2.writeInt(0);
                    break;
                case 16:
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    ew2 ew2Var3 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                    InterfaceC2799a interfaceC2799aM5638i4 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    IBinder strongBinder4 = parcel.readStrongBinder();
                    if (strongBinder4 != null) {
                        IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c3286mf = iInterfaceQueryLocalInterface4 instanceof InterfaceC3138if ? (InterfaceC3138if) iInterfaceQueryLocalInterface4 : new C3064gf(strongBinder4);
                    }
                    ((BinderC3657wf) this).mo7337w3(string6, string7, ew2Var3, interfaceC2799aM5638i4, c3286mf, AbstractBinderC3580ud.m8482F6(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    parcel2.writeNoException();
                    ClassLoader classLoader2 = ig2.f15182a;
                    parcel2.writeInt(0);
                    break;
                case 18:
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    ew2 ew2Var4 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                    InterfaceC2799a interfaceC2799aM5638i5 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    IBinder strongBinder5 = parcel.readStrongBinder();
                    if (strongBinder5 != null) {
                        IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c3286mf = iInterfaceQueryLocalInterface5 instanceof InterfaceC3027ff ? (InterfaceC3027ff) iInterfaceQueryLocalInterface5 : new C2953df(strongBinder5);
                    }
                    ((BinderC3657wf) this).mo7336v6(string8, string9, ew2Var4, interfaceC2799aM5638i5, c3286mf, AbstractBinderC3580ud.m8482F6(parcel.readStrongBinder()), null);
                    parcel2.writeNoException();
                    break;
                case 19:
                    ((BinderC3657wf) this).f21046h = parcel.readString();
                    parcel2.writeNoException();
                    break;
                case 20:
                    String string10 = parcel.readString();
                    String string11 = parcel.readString();
                    ew2 ew2Var5 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                    InterfaceC2799a interfaceC2799aM5638i6 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    IBinder strongBinder6 = parcel.readStrongBinder();
                    if (strongBinder6 != null) {
                        IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        c3286mf = iInterfaceQueryLocalInterface6 instanceof InterfaceC3138if ? (InterfaceC3138if) iInterfaceQueryLocalInterface6 : new C3064gf(strongBinder6);
                    }
                    ((BinderC3657wf) this).mo7328Y0(string10, string11, ew2Var5, interfaceC2799aM5638i6, c3286mf, AbstractBinderC3580ud.m8482F6(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 21:
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    ew2 ew2Var6 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                    InterfaceC2799a interfaceC2799aM5638i7 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    IBinder strongBinder7 = parcel.readStrongBinder();
                    if (strongBinder7 != null) {
                        IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        c3286mf = iInterfaceQueryLocalInterface7 instanceof InterfaceC3730ye ? (InterfaceC3730ye) iInterfaceQueryLocalInterface7 : new C3656we(strongBinder7);
                    }
                    ((BinderC3657wf) this).mo7326L4(string12, string13, ew2Var6, interfaceC2799aM5638i7, c3286mf, AbstractBinderC3580ud.m8482F6(parcel.readStrongBinder()), (jw2) ig2.m7250a(parcel, jw2.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 22:
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    ew2 ew2Var7 = (ew2) ig2.m7250a(parcel, ew2.CREATOR);
                    InterfaceC2799a interfaceC2799aM5638i8 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
                    IBinder strongBinder8 = parcel.readStrongBinder();
                    if (strongBinder8 != null) {
                        IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        c3286mf = iInterfaceQueryLocalInterface8 instanceof InterfaceC3027ff ? (InterfaceC3027ff) iInterfaceQueryLocalInterface8 : new C2953df(strongBinder8);
                    }
                    ((BinderC3657wf) this).mo7336v6(string14, string15, ew2Var7, interfaceC2799aM5638i8, c3286mf, AbstractBinderC3580ud.m8482F6(parcel.readStrongBinder()), (C3165j5) ig2.m7250a(parcel, C3165j5.CREATOR));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        } else {
            parcel.createStringArray();
            parcel2.writeNoException();
        }
        return true;
    }
}
