package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.m6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3277m6 extends gg2 implements InterfaceC3314n6 {
    public C3277m6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3314n6
    /* JADX INFO: renamed from: y6 */
    public final void mo7658y6(InterfaceC2981e6 interfaceC2981e6) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2981e6);
        m7002T1(1, parcelM7001E0);
    }
}
