package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.bh */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2880bh extends gg2 implements InterfaceC2955dh {
    public C2880bh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: H */
    public final void mo4674H(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        m7002T1(13, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: Y1 */
    public final void mo4682Y1(Bundle bundle) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, bundle);
        Parcel parcelM7003i1 = m7003i1(6, parcelM7001E0);
        if (parcelM7003i1.readInt() != 0) {
            bundle.readFromParcel(parcelM7003i1);
        }
        parcelM7003i1.recycle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: c */
    public final void mo4685c() throws RemoteException {
        m7002T1(10, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: c6 */
    public final void mo4686c6(Bundle bundle) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, bundle);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: d */
    public final void mo4687d() throws RemoteException {
        m7002T1(14, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: d2 */
    public final void mo4688d2(int i, int i2, Intent intent) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(i);
        parcelM7001E0.writeInt(i2);
        ig2.m7251b(parcelM7001E0, intent);
        m7002T1(12, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: f */
    public final boolean mo4689f() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(11, m7001E0());
        ClassLoader classLoader = ig2.f15182a;
        boolean z = parcelM7003i1.readInt() != 0;
        parcelM7003i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: h */
    public final void mo4690h() throws RemoteException {
        m7002T1(3, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: i */
    public final void mo4691i() throws RemoteException {
        m7002T1(2, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: j */
    public final void mo4692j() throws RemoteException {
        m7002T1(5, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: k */
    public final void mo4693k() throws RemoteException {
        m7002T1(4, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: l */
    public final void mo4694l() throws RemoteException {
        m7002T1(8, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: n */
    public final void mo4695n() throws RemoteException {
        m7002T1(7, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: q */
    public final void mo4696q() throws RemoteException {
        m7002T1(9, m7001E0());
    }
}
