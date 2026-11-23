package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.x3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3682x3 extends gg2 implements InterfaceC3719y3 {
    public C3682x3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3719y3
    /* JADX INFO: renamed from: n6 */
    public final void mo8714n6(InterfaceC3645w3 interfaceC3645w3) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3645w3);
        m7002T1(1, parcelM7001E0);
    }
}
