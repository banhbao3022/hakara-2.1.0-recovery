package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3048g extends gg2 implements InterfaceC3122i {
    public C3048g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: D0 */
    public final void mo5870D0(yv2 yv2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, yv2Var);
        m7002T1(8, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: L */
    public final void mo5871L(int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(i);
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: a */
    public final void mo5872a() throws RemoteException {
        m7002T1(1, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: c */
    public final void mo5873c() throws RemoteException {
        m7002T1(3, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: d */
    public final void mo5874d() throws RemoteException {
        m7002T1(4, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: f */
    public final void mo5875f() throws RemoteException {
        m7002T1(5, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: g */
    public final void mo5876g() throws RemoteException {
        m7002T1(6, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: i */
    public final void mo5877i() throws RemoteException {
        m7002T1(7, m7001E0());
    }
}
