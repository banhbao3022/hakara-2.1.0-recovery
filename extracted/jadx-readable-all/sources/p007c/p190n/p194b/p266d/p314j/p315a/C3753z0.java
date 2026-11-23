package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.z0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3753z0 extends gg2 implements InterfaceC2864b1 {
    public C3753z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2864b1
    /* JADX INFO: renamed from: o4 */
    public final void mo5908o4(lw2 lw2Var) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, lw2Var);
        m7002T1(1, parcelM7001E0);
    }
}
