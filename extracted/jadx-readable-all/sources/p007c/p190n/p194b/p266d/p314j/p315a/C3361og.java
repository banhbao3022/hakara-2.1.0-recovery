package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.og */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3361og extends gg2 implements InterfaceC3435qg {
    public C3361og(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg
    /* JADX INFO: renamed from: I0 */
    public final void mo8005I0(Intent intent) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, intent);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg
    /* JADX INFO: renamed from: O0 */
    public final void mo8006O0(InterfaceC2799a interfaceC2799a, String str, String str2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg
    /* JADX INFO: renamed from: f */
    public final void mo8007f() throws RemoteException {
        m7002T1(3, m7001E0());
    }
}
