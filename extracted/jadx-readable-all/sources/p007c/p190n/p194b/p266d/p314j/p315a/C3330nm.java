package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.nm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3330nm extends gg2 implements InterfaceC3404pm {
    public C3330nm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3404pm
    /* JADX INFO: renamed from: x4 */
    public final void mo4622x4(InterfaceC2799a interfaceC2799a, C3552tm c3552tm, InterfaceC3293mm interfaceC3293mm) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7251b(parcelM7001E0, c3552tm);
        ig2.m7253d(parcelM7001E0, interfaceC3293mm);
        m7002T1(1, parcelM7001E0);
    }
}
