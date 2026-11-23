package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.x6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3685x6 extends gg2 implements InterfaceC3759z6 {
    public C3685x6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3759z6
    /* JADX INFO: renamed from: f6 */
    public final void mo8080f6(InterfaceC3130i7 interfaceC3130i7) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3130i7);
        m7002T1(1, parcelM7001E0);
    }
}
