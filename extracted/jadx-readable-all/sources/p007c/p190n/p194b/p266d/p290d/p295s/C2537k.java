package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.s.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2537k extends C3988s implements InterfaceC2531h {
    public C2537k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastService");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2531h
    /* JADX INFO: renamed from: U3 */
    public final void mo5148U3(InterfaceC2540l0 interfaceC2540l0, String[] strArr) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9268b(parcelM9209E0, interfaceC2540l0);
        parcelM9209E0.writeStringArray(strArr);
        m9210K2(5, parcelM9209E0);
    }
}
