package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.z */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3752z extends gg2 implements InterfaceC2863b0 {
    public C3752z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2863b0
    /* JADX INFO: renamed from: Z */
    public final void mo5896Z(String str, String str2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        m7002T1(1, parcelM7001E0);
    }
}
