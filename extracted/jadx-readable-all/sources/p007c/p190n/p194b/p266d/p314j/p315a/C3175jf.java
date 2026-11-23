package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.jf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3175jf extends gg2 implements InterfaceC3249lf {
    public C3175jf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: B2 */
    public final void mo7325B2(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3027ff interfaceC3027ff, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3027ff);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(18, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: L4 */
    public final void mo7326L4(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3730ye interfaceC3730ye, InterfaceC3618vd interfaceC3618vd, jw2 jw2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3730ye);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        ig2.m7251b(parcelM7001E0, jw2Var);
        m7002T1(21, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: X3 */
    public final boolean mo7327X3(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        Parcel parcelM7003i1 = m7003i1(15, parcelM7001E0);
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: Y0 */
    public final void mo7328Y0(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3138if interfaceC3138if, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3138if);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(20, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: d */
    public final C3694xf mo7329d() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        C3694xf c3694xf = (C3694xf) ig2.m7250a(parcelM7003i1, C3694xf.CREATOR);
        parcelM7003i1.recycle();
        return c3694xf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: e5 */
    public final void mo7330e5(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC2878bf interfaceC2878bf, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC2878bf);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(14, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: f */
    public final C3694xf mo7331f() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(3, m7001E0());
        C3694xf c3694xf = (C3694xf) ig2.m7250a(parcelM7003i1, C3694xf.CREATOR);
        parcelM7003i1.recycle();
        return c3694xf;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: g */
    public final InterfaceC3087h1 mo7332g() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(5, m7001E0());
        InterfaceC3087h1 interfaceC3087h1M6893F6 = AbstractBinderC3050g1.m6893F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3087h1M6893F6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: m4 */
    public final void mo7333m4(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3730ye interfaceC3730ye, InterfaceC3618vd interfaceC3618vd, jw2 jw2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3730ye);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        ig2.m7251b(parcelM7001E0, jw2Var);
        m7002T1(13, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: o2 */
    public final void mo7334o2(InterfaceC2799a interfaceC2799a, String str, Bundle bundle, Bundle bundle2, jw2 jw2Var, InterfaceC3360of interfaceC3360of) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString(str);
        ig2.m7251b(parcelM7001E0, bundle);
        ig2.m7251b(parcelM7001E0, bundle2);
        ig2.m7251b(parcelM7001E0, jw2Var);
        ig2.m7253d(parcelM7001E0, interfaceC3360of);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: v5 */
    public final boolean mo7335v5(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        Parcel parcelM7003i1 = m7003i1(17, parcelM7001E0);
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: v6 */
    public final void mo7336v6(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3027ff interfaceC3027ff, InterfaceC3618vd interfaceC3618vd, C3165j5 c3165j5) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3027ff);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        ig2.m7251b(parcelM7001E0, c3165j5);
        m7002T1(22, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: w3 */
    public final void mo7337w3(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3138if interfaceC3138if, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, ew2Var);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3138if);
        ig2.m7253d(parcelM7001E0, interfaceC3618vd);
        m7002T1(16, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: z0 */
    public final void mo7338z0(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        m7002T1(19, parcelM7001E0);
    }
}
