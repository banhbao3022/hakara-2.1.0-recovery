package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends gg2 implements fn1 {
    public dn1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: A4 */
    public final InterfaceC2799a mo6375A4(String str, InterfaceC2799a interfaceC2799a, String str2, String str3, String str4, String str5) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString("");
        parcelM7001E0.writeString("javascript");
        parcelM7001E0.writeString(str4);
        parcelM7001E0.writeString(str5);
        return outline.m1583e(m7003i1(9, parcelM7001E0));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: P0 */
    public final InterfaceC2799a mo6376P0(String str, InterfaceC2799a interfaceC2799a, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString("");
        parcelM7001E0.writeString("javascript");
        parcelM7001E0.writeString(str4);
        parcelM7001E0.writeString(str5);
        parcelM7001E0.writeString(str6);
        parcelM7001E0.writeString(str7);
        parcelM7001E0.writeString(str8);
        return outline.m1583e(m7003i1(10, parcelM7001E0));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: P5 */
    public final InterfaceC2799a mo6377P5(String str, InterfaceC2799a interfaceC2799a, String str2, String str3, String str4, String str5, String str6, String str7, String str8) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString("");
        parcelM7001E0.writeString("javascript");
        parcelM7001E0.writeString(str4);
        parcelM7001E0.writeString("Google");
        parcelM7001E0.writeString(str6);
        parcelM7001E0.writeString(str7);
        parcelM7001E0.writeString(str8);
        return outline.m1583e(m7003i1(11, parcelM7001E0));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: R */
    public final void mo6378R(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(7, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: f3 */
    public final void mo6379f3(InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC2799a2);
        m7002T1(8, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: g */
    public final String mo6380g() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(6, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: g5 */
    public final void mo6381g5(InterfaceC2799a interfaceC2799a, InterfaceC2799a interfaceC2799a2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC2799a2);
        m7002T1(5, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    /* JADX INFO: renamed from: h0 */
    public final boolean mo6382h0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        Parcel parcelM7003i1 = m7003i1(2, parcelM7001E0);
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fn1
    public final void zzf(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(4, parcelM7001E0);
    }
}
