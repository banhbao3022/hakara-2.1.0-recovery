package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.i1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3124i1 extends gg2 implements InterfaceC3198k1 {
    public C3124i1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3198k1
    /* JADX INFO: renamed from: c */
    public final void mo7187c() throws RemoteException {
        m7002T1(1, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3198k1
    /* JADX INFO: renamed from: d */
    public final void mo7188d() throws RemoteException {
        m7002T1(2, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3198k1
    /* JADX INFO: renamed from: f */
    public final void mo7189f() throws RemoteException {
        m7002T1(3, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3198k1
    /* JADX INFO: renamed from: g */
    public final void mo7190g() throws RemoteException {
        m7002T1(4, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3198k1
    /* JADX INFO: renamed from: j4 */
    public final void mo7191j4(boolean z) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ClassLoader classLoader = ig2.f15182a;
        parcelM7001E0.writeInt(z ? 1 : 0);
        m7002T1(5, parcelM7001E0);
    }
}
