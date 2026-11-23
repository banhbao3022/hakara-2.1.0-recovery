package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.j0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3160j0 extends gg2 implements InterfaceC3234l0 {
    public C3160j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: C1 */
    public final void mo6537C1(InterfaceC3059ga interfaceC3059ga) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3059ga);
        m7002T1(12, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: T2 */
    public final void mo6540T2(C3125i2 c3125i2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, c3125i2);
        m7002T1(14, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: Y3 */
    public final void mo6542Y3(InterfaceC3395pd interfaceC3395pd) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3395pd);
        m7002T1(11, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: c */
    public final void mo6545c() throws RemoteException {
        m7002T1(1, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: g2 */
    public final void mo6546g2(String str, InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(null);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(6, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: l */
    public final List<C3762z9> mo6549l() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(13, m7001E0());
        ArrayList arrayListCreateTypedArrayList = parcelM7003i1.createTypedArrayList(C3762z9.CREATOR);
        parcelM7003i1.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3234l0
    /* JADX INFO: renamed from: m */
    public final String mo6550m() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(9, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }
}
