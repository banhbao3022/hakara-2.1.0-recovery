package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.ra */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3466ra extends gg2 implements InterfaceC3503sa {
    public C3466ra(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3503sa
    /* JADX INFO: renamed from: I3 */
    public final void mo8268I3(InterfaceC3281ma interfaceC3281ma) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3281ma);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3503sa
    /* JADX INFO: renamed from: s */
    public final void mo8269s(yv2 yv2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, yv2Var);
        m7002T1(3, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3503sa
    /* JADX INFO: renamed from: y */
    public final void mo8270y(int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(i);
        m7002T1(2, parcelM7001E0);
    }
}
