package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.f6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3018f6 extends gg2 implements InterfaceC3129i6 {
    public C3018f6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3129i6
    /* JADX INFO: renamed from: H */
    public final boolean mo6365H(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        Parcel parcelM7003i1 = m7003i1(10, parcelM7001E0);
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3129i6
    /* JADX INFO: renamed from: g */
    public final String mo6366g() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(4, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3129i6
    /* JADX INFO: renamed from: m */
    public final InterfaceC2799a mo6368m() throws RemoteException {
        return outline.m1583e(m7003i1(9, m7001E0()));
    }
}
