package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.gg2;
import p007c.p190n.p194b.p266d.p314j.p315a.ig2;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.f0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2260f0 extends gg2 implements InterfaceC2266h0 {
    public C2260f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0
    public final boolean zze(InterfaceC2799a interfaceC2799a, String str, String str2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        Parcel parcelM7003i1 = m7003i1(1, parcelM7001E0);
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0
    public final void zzf(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(2, parcelM7001E0);
    }
}
