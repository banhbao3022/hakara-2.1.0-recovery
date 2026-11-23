package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.qd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3432qd extends gg2 implements InterfaceC3506sd {
    public C3432qd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: A6 */
    public final void mo7819A6(ew2 ew2Var, String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(str);
        m7002T1(11, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: D */
    public final C2840ae mo7820D() throws RemoteException {
        C2840ae c2840ae;
        Parcel parcelM7003i1 = m7003i1(16, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c2840ae = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            c2840ae = iInterfaceQueryLocalInterface instanceof C2840ae ? (C2840ae) iInterfaceQueryLocalInterface : new C2840ae(strongBinder);
        }
        parcelM7003i1.recycle();
        return c2840ae;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: G2 */
    public final void mo7822G2(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, jw2Var);
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(35, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: H0 */
    public final C3694xf mo7824H0() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(34, m7001E0());
        C3694xf c3694xf = (C3694xf) ig2.m7250a(parcelM7003i1, C3694xf.CREATOR);
        parcelM7003i1.recycle();
        return c3694xf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: N */
    public final boolean mo7826N() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(22, m7001E0());
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: N1 */
    public final void mo7827N1(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(28, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: O */
    public final InterfaceC3087h1 mo7828O() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(26, m7001E0());
        InterfaceC3087h1 interfaceC3087h1M6893F6 = AbstractBinderC3050g1.m6893F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3087h1M6893F6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: T */
    public final InterfaceC3692xd mo7829T() throws RemoteException {
        InterfaceC3692xd c3655wd;
        Parcel parcelM7003i1 = m7003i1(36, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3655wd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            c3655wd = iInterfaceQueryLocalInterface instanceof InterfaceC3692xd ? (InterfaceC3692xd) iInterfaceQueryLocalInterface : new C3655wd(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3655wd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: U1 */
    public final void mo7831U1(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(37, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: W3 */
    public final void mo7832W3(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, jw2Var);
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(6, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: X */
    public final C3694xf mo7833X() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(33, m7001E0());
        C3694xf c3694xf = (C3694xf) ig2.m7250a(parcelM7003i1, C3694xf.CREATOR);
        parcelM7003i1.recycle();
        return c3694xf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: a2 */
    public final void mo7834a2(InterfaceC2799a interfaceC2799a, InterfaceC2948da interfaceC2948da, List<C3096ha> list) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC2948da);
        parcelM7001E0.writeTypedList(list);
        m7002T1(31, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: b5 */
    public final InterfaceC2952de mo7835b5() throws RemoteException {
        InterfaceC2952de c2877be;
        Parcel parcelM7003i1 = m7003i1(27, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c2877be = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            c2877be = iInterfaceQueryLocalInterface instanceof InterfaceC2952de ? (InterfaceC2952de) iInterfaceQueryLocalInterface : new C2877be(strongBinder);
        }
        parcelM7003i1.recycle();
        return c2877be;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: c1 */
    public final void mo7836c1(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(7, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: c2 */
    public final void mo7837c2(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd, C3165j5 c3165j5, List<String> list) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        ig2.m7251b(parcelM7001E0, c3165j5);
        parcelM7001E0.writeStringList(list);
        m7002T1(14, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: d */
    public final InterfaceC2799a mo7838d() throws RemoteException {
        return outline.m1583e(m7003i1(2, m7001E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: d3 */
    public final void mo7839d3(InterfaceC2799a interfaceC2799a, InterfaceC3438qj interfaceC3438qj, List<String> list) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3438qj);
        parcelM7001E0.writeStringList(list);
        m7002T1(23, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: e0 */
    public final void mo7840e0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(21, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: e3 */
    public final void mo7841e3(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3438qj interfaceC3438qj, String str2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(null);
        ig2.m7253d(parcelM7001E0, interfaceC3438qj);
        parcelM7001E0.writeString(str2);
        m7002T1(10, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: g */
    public final void mo7842g() throws RemoteException {
        m7002T1(4, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: h3 */
    public final void mo7844h3(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(30, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: i */
    public final void mo7845i() throws RemoteException {
        m7002T1(5, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: j */
    public final void mo7846j() throws RemoteException {
        m7002T1(8, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: l */
    public final boolean mo7847l() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(13, m7001E0());
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: m */
    public final void mo7848m() throws RemoteException {
        m7002T1(9, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: n */
    public final void mo7849n() throws RemoteException {
        m7002T1(12, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: n5 */
    public final void mo7850n5(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, ew2Var);
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(32, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: p0 */
    public final C3766zd mo7852p0() throws RemoteException {
        C3766zd c3766zd;
        Parcel parcelM7003i1 = m7003i1(15, m7001E0());
        IBinder strongBinder = parcelM7003i1.readStrongBinder();
        if (strongBinder == null) {
            c3766zd = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            c3766zd = iInterfaceQueryLocalInterface instanceof C3766zd ? (C3766zd) iInterfaceQueryLocalInterface : new C3766zd(strongBinder);
        }
        parcelM7003i1.recycle();
        return c3766zd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: s0 */
    public final void mo7855s0(boolean z) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ClassLoader classLoader = ig2.f15182a;
        parcelM7001E0.writeInt(z ? 1 : 0);
        m7002T1(25, parcelM7001E0);
    }
}
