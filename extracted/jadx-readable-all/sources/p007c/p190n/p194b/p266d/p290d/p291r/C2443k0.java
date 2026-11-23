package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.k0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2443k0 extends C3988s implements InterfaceC2437h0 {
    public C2443k0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2437h0
    /* JADX INFO: renamed from: G0 */
    public final InterfaceC2799a mo5028G0() throws RemoteException {
        return outline.m1583e(m9212i1(7, m9209E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2437h0
    /* JADX INFO: renamed from: Q5 */
    public final InterfaceC2799a mo5029Q5() throws RemoteException {
        return outline.m1583e(m9212i1(1, m9209E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2437h0
    /* JADX INFO: renamed from: S0 */
    public final void mo5030S0(InterfaceC2441j0 interfaceC2441j0) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9268b(parcelM9209E0, interfaceC2441j0);
        m9211T1(2, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2437h0
    /* JADX INFO: renamed from: W0 */
    public final void mo5031W0(boolean z, boolean z2) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        int i = C4016v.f22903a;
        parcelM9209E0.writeInt(1);
        parcelM9209E0.writeInt(z2 ? 1 : 0);
        m9211T1(6, parcelM9209E0);
    }
}
