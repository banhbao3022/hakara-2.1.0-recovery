package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2294r;

/* JADX INFO: renamed from: c.n.b.d.j.a.ji */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3178ji extends gg2 implements InterfaceC3252li {
    public C3178ji(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3252li
    /* JADX INFO: renamed from: o6 */
    public final void mo7345o6(C2294r c2294r) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, c2294r);
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3252li
    /* JADX INFO: renamed from: t4 */
    public final void mo7346t4(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7251b(parcelM7001E0, parcelFileDescriptor);
        m7002T1(1, parcelM7001E0);
    }
}
