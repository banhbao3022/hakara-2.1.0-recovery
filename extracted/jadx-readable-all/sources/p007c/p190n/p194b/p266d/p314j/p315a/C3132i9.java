package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.i9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3132i9 extends gg2 implements InterfaceC3169j9 {
    public C3132i9(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3169j9
    /* JADX INFO: renamed from: t */
    public final void mo7219t(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        m7002T1(1, parcelM7001E0);
    }
}
