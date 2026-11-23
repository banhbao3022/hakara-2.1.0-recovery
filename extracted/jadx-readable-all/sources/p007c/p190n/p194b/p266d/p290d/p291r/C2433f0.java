package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.f0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2433f0 extends C3988s implements InterfaceC2429d0 {
    public C2433f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2429d0
    /* JADX INFO: renamed from: e2 */
    public final void mo5015e2() throws RemoteException {
        m9211T1(1, m9209E0());
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2429d0
    public final void onDestroy() throws RemoteException {
        m9211T1(4, m9209E0());
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2429d0
    /* JADX INFO: renamed from: y4 */
    public final IBinder mo5016y4(Intent intent) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9269c(parcelM9209E0, intent);
        Parcel parcelM9212i1 = m9212i1(3, parcelM9209E0);
        IBinder strongBinder = parcelM9212i1.readStrongBinder();
        parcelM9212i1.recycle();
        return strongBinder;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2429d0
    /* JADX INFO: renamed from: z5 */
    public final int mo5017z5(Intent intent, int i, int i2) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9269c(parcelM9209E0, intent);
        parcelM9209E0.writeInt(i);
        parcelM9209E0.writeInt(i2);
        Parcel parcelM9212i1 = m9212i1(2, parcelM9209E0);
        int i3 = parcelM9212i1.readInt();
        parcelM9212i1.recycle();
        return i3;
    }
}
