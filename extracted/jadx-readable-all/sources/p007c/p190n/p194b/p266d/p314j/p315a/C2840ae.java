package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ae */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2840ae extends gg2 implements IInterface {
    public C2840ae(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC2799a m5733C() throws RemoteException {
        return outline.m1583e(m7003i1(21, m7001E0()));
    }

    /* JADX INFO: renamed from: F3 */
    public final InterfaceC3350o5 m5734F3() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(19, m7001E0());
        InterfaceC3350o5 interfaceC3350o5M7778F6 = AbstractBinderC3313n5.m7778F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3350o5M7778F6;
    }

    /* JADX INFO: renamed from: J3 */
    public final InterfaceC2799a m5735J3() throws RemoteException {
        return outline.m1583e(m7003i1(20, m7001E0()));
    }

    /* JADX INFO: renamed from: K2 */
    public final Bundle m5736K2() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(13, m7001E0());
        Bundle bundle = (Bundle) ig2.m7250a(parcelM7003i1, Bundle.CREATOR);
        parcelM7003i1.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC3610v5 m5737g() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(5, m7001E0());
        InterfaceC3610v5 interfaceC3610v5M8470F6 = AbstractBinderC3572u5.m8470F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3610v5M8470F6;
    }

    /* JADX INFO: renamed from: q3 */
    public final InterfaceC3087h1 m5738q3() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(16, m7001E0());
        InterfaceC3087h1 interfaceC3087h1M6893F6 = AbstractBinderC3050g1.m6893F6(parcelM7003i1.readStrongBinder());
        parcelM7003i1.recycle();
        return interfaceC3087h1M6893F6;
    }

    /* JADX INFO: renamed from: z */
    public final InterfaceC2799a m5739z() throws RemoteException {
        return outline.m1583e(m7003i1(15, m7001E0()));
    }
}
