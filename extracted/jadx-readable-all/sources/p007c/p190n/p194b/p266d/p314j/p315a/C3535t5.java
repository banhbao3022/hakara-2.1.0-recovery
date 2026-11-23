package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.t5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3535t5 extends gg2 implements InterfaceC3610v5 {
    public C3535t5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: a */
    public final InterfaceC2799a mo7056a() throws RemoteException {
        return outline.m1583e(m7003i1(1, m7001E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: b */
    public final Uri mo7057b() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        Uri uri = (Uri) ig2.m7250a(parcelM7003i1, Uri.CREATOR);
        parcelM7003i1.recycle();
        return uri;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: c */
    public final int mo7058c() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(4, m7001E0());
        int i = parcelM7003i1.readInt();
        parcelM7003i1.recycle();
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: d */
    public final int mo7059d() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(5, m7001E0());
        int i = parcelM7003i1.readInt();
        parcelM7003i1.recycle();
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3610v5
    /* JADX INFO: renamed from: e */
    public final double mo7060e() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(3, m7001E0());
        double d = parcelM7003i1.readDouble();
        parcelM7003i1.recycle();
        return d;
    }
}
