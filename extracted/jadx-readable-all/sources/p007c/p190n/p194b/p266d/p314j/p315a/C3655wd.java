package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.wd */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3655wd extends gg2 implements InterfaceC3692xd {
    public C3655wd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3692xd
    /* JADX INFO: renamed from: c */
    public final InterfaceC2799a mo8623c() throws RemoteException {
        return outline.m1583e(m7003i1(1, m7001E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3692xd
    /* JADX INFO: renamed from: d */
    public final boolean mo8624d() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }
}
