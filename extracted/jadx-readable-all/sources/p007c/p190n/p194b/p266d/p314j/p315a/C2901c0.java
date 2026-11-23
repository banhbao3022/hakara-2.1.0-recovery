package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.c0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2901c0 extends gg2 implements InterfaceC2975e0 {
    public C2901c0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: B3 */
    public final InterfaceC3404pm mo6131B3(InterfaceC2799a interfaceC2799a, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3404pm c3330nm;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(14, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        int i2 = AbstractBinderC3367om.f17676f;
        if (strongBinder == null) {
            c3330nm = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c3330nm = iInterfaceQueryLocalInterface instanceof InterfaceC3404pm ? (InterfaceC3404pm) iInterfaceQueryLocalInterface : new C3330nm(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3330nm;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: Z4 */
    public final InterfaceC3234l0 mo6132Z4(InterfaceC2799a interfaceC2799a, int i) throws RemoteException {
        InterfaceC3234l0 c3160j0;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(9, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3160j0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            c3160j0 = iInterfaceQueryLocalInterface instanceof InterfaceC3234l0 ? (InterfaceC3234l0) iInterfaceQueryLocalInterface : new C3160j0(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3160j0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: h6 */
    public final InterfaceC3604v mo6133h6(InterfaceC2799a interfaceC2799a, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3604v c3529t;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, jw2Var);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(1, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3529t = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3529t = iInterfaceQueryLocalInterface instanceof InterfaceC3604v ? (InterfaceC3604v) iInterfaceQueryLocalInterface : new C3529t(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3529t;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC3604v mo6134o1(InterfaceC2799a interfaceC2799a, jw2 jw2Var, String str, int i) throws RemoteException {
        InterfaceC3604v c3529t;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, jw2Var);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(10, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3529t = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3529t = iInterfaceQueryLocalInterface instanceof InterfaceC3604v ? (InterfaceC3604v) iInterfaceQueryLocalInterface : new C3529t(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3529t;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: q0 */
    public final InterfaceC2955dh mo6135q0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        InterfaceC2955dh c2880bh;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        Parcel parcelM7003i1 = m7003i1(8, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        int i = AbstractBinderC2918ch.f13000f;
        if (strongBinder == null) {
            c2880bh = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            c2880bh = iInterfaceQueryLocalInterface instanceof InterfaceC2955dh ? (InterfaceC2955dh) iInterfaceQueryLocalInterface : new C2880bh(strongBinder);
        }
        parcelM7003i1.recycle();
        return c2880bh;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: q6 */
    public final InterfaceC3604v mo6136q6(InterfaceC2799a interfaceC2799a, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3604v c3529t;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, jw2Var);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(2, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3529t = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            c3529t = iInterfaceQueryLocalInterface instanceof InterfaceC3604v ? (InterfaceC3604v) iInterfaceQueryLocalInterface : new C3529t(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3529t;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: t6 */
    public final InterfaceC3455r mo6137t6(InterfaceC2799a interfaceC2799a, String str, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3455r c3381p;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(3, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3381p = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            c3381p = iInterfaceQueryLocalInterface instanceof InterfaceC3455r ? (InterfaceC3455r) iInterfaceQueryLocalInterface : new C3381p(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3381p;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: u4 */
    public final InterfaceC3435qg mo6138u4(InterfaceC2799a interfaceC2799a, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3435qg c3361og;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(15, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        int i2 = AbstractBinderC3398pg.f17969f;
        if (strongBinder == null) {
            c3361og = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3361og = iInterfaceQueryLocalInterface instanceof InterfaceC3435qg ? (InterfaceC3435qg) iInterfaceQueryLocalInterface : new C3361og(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3361og;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2975e0
    /* JADX INFO: renamed from: v4 */
    public final InterfaceC3735yj mo6139v4(InterfaceC2799a interfaceC2799a, String str, InterfaceC3395pd interfaceC3395pd, int i) throws RemoteException {
        InterfaceC3735yj c3661wj;
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        parcelM7001E0.writeInt(210890000);
        Parcel parcelM7003i1 = m7003i1(12, parcelM7001E0);
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        int i2 = AbstractBinderC3698xj.f21557f;
        if (strongBinder == null) {
            c3661wj = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            c3661wj = iInterfaceQueryLocalInterface instanceof InterfaceC3735yj ? (InterfaceC3735yj) iInterfaceQueryLocalInterface : new C3661wj(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3661wj;
    }
}
