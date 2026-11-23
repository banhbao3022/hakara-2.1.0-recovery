package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.ba */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2873ba extends gg2 implements InterfaceC2948da {
    public C2873ba(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2948da
    /* JADX INFO: renamed from: S */
    public final void mo5941S(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        m7002T1(3, parcelM7001E0);
    }
}
