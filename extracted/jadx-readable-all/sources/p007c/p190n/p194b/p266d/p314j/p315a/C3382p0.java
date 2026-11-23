package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.p0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3382p0 extends gg2 implements InterfaceC3456r0 {
    public C3382p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3456r0
    /* JADX INFO: renamed from: c */
    public final String mo8074c() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(1, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3456r0
    /* JADX INFO: renamed from: d */
    public final String mo8075d() throws RemoteException {
        Parcel parcelM7003i1 = m7003i1(2, m7001E0());
        String string = parcelM7003i1.readString();
        parcelM7003i1.recycle();
        return string;
    }
}
