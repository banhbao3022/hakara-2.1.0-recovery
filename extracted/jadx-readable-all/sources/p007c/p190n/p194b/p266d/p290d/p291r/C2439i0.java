package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.i0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2439i0 extends C3988s implements InterfaceC2435g0 {
    public C2439i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0
    /* JADX INFO: renamed from: C2 */
    public final void mo5020C2(int i) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeInt(i);
        m9211T1(13, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0
    /* JADX INFO: renamed from: d5 */
    public final boolean mo5021d5() throws RemoteException {
        Parcel parcelM9212i1 = m9212i1(9, m9209E0());
        int i = C4016v.f22903a;
        boolean z = parcelM9212i1.readInt() != 0;
        parcelM9212i1.recycle();
        return z;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0
    /* JADX INFO: renamed from: f5 */
    public final InterfaceC2799a mo5022f5() throws RemoteException {
        return outline.m1583e(m9212i1(1, m9209E0()));
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0
    /* JADX INFO: renamed from: m5 */
    public final void mo5023m5(int i) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeInt(i);
        m9211T1(15, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0
    /* JADX INFO: renamed from: r4 */
    public final void mo5024r4(int i) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeInt(i);
        m9211T1(12, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2435g0
    /* JADX INFO: renamed from: u0 */
    public final boolean mo5025u0() throws RemoteException {
        Parcel parcelM9212i1 = m9212i1(5, m9209E0());
        int i = C4016v.f22903a;
        boolean z = parcelM9212i1.readInt() != 0;
        parcelM9212i1.recycle();
        return z;
    }
}
