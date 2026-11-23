package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.d7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2945d7 extends gg2 implements InterfaceC3019f7 {
    public C2945d7(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3019f7
    /* JADX INFO: renamed from: A2 */
    public final void mo6290A2(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3019f7
    /* JADX INFO: renamed from: d */
    public final void mo6291d() throws RemoteException {
        m7002T1(2, m7001E0());
    }
}
