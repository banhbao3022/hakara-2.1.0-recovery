package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.v6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3611v6 extends gg2 implements InterfaceC3648w6 {
    public C3611v6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3648w6
    /* JADX INFO: renamed from: l3 */
    public final void mo8537l3(InterfaceC3604v interfaceC3604v, InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3604v);
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(1, parcelM7001E0);
    }
}
