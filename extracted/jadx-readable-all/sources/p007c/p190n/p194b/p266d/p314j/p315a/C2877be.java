package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.be */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2877be extends gg2 implements InterfaceC2952de {
    public C2877be(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: C */
    public final void mo5962C() throws RemoteException {
        m7002T1(19, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: G1 */
    public final void mo5963G1(InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2, InterfaceC2799a interfaceC2799a3) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC2799a2);
        ig2.m7253d(parcelM7001E0, interfaceC2799a3);
        m7002T1(21, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: O */
    public final float mo5964O() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(25, m7001E0());
        float f = parcelM7003i1.readFloat();
        parcelM7003i1.recycle();
        return f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: b0 */
    public final float mo5965b0() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(24, m7001E0());
        float f = parcelM7003i1.readFloat();
        parcelM7003i1.recycle();
        return f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: c */
    public final String mo5966c() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: d */
    public final List mo5967d() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(3, m7001E0());
        ArrayList arrayList = parcelM7003i1.readArrayList(ig2.f15182a);
        parcelM7003i1.recycle();
        return arrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: e0 */
    public final void mo5968e0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(20, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: f */
    public final String mo5969f() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(4, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: g */
    public final InterfaceC3610v5 mo5970g() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(5, m7001E0());
        InterfaceC3610v5 interfaceC3610v5M8470F6 = AbstractBinderC3572u5.m8470F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3610v5M8470F6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: h */
    public final String mo5971h() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(7, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: i */
    public final String mo5972i() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(6, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: j */
    public final String mo5973j() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(9, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: k */
    public final double mo5974k() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(8, m7001E0());
        double d = parcelM7003i1.readDouble();
        parcelM7003i1.recycle();
        return d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: l */
    public final InterfaceC2799a mo5975l() throws RemoteException {
        return outline.m1583e(m7003i1(14, m7001E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: m */
    public final String mo5976m() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(10, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: n */
    public final InterfaceC2799a mo5977n() throws RemoteException {
        return outline.m1583e(m7003i1(13, m7001E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: o */
    public final boolean mo5978o() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(17, m7001E0());
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: p */
    public final InterfaceC3087h1 mo5979p() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(11, m7001E0());
        InterfaceC3087h1 interfaceC3087h1M6893F6 = AbstractBinderC3050g1.m6893F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3087h1M6893F6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: q */
    public final Bundle mo5980q() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(16, m7001E0());
        Bundle bundle = (Bundle) ig2.m7250a(parcelM7003i1, Bundle.CREATOR);
        parcelM7003i1.recycle();
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: q2 */
    public final void mo5981q2(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(22, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: r */
    public final boolean mo5982r() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(18, m7001E0());
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: u */
    public final InterfaceC3350o5 mo5983u() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(12, m7001E0());
        InterfaceC3350o5 interfaceC3350o5M7778F6 = AbstractBinderC3313n5.m7778F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3350o5M7778F6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: v */
    public final float mo5984v() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(23, m7001E0());
        float f = parcelM7003i1.readFloat();
        parcelM7003i1.recycle();
        return f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2952de
    /* JADX INFO: renamed from: z */
    public final InterfaceC2799a mo5985z() throws RemoteException {
        return outline.m1583e(m7003i1(15, m7001E0()));
    }
}
