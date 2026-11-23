package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.hu */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3116hu extends gg2 implements InterfaceC3227ku {
    public C3116hu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3227ku
    /* JADX INFO: renamed from: V2 */
    public final void mo7174V2(InterfaceC2799a interfaceC2799a, InterfaceC3079gu interfaceC3079gu) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        ig2.m7253d(parcelM7001E0, interfaceC3079gu);
        m7002T1(2, parcelM7001E0);
    }
}
