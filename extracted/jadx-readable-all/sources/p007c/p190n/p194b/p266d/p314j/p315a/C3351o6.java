package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.o6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3351o6 extends gg2 implements InterfaceC3425q6 {
    public C3351o6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3425q6
    /* JADX INFO: renamed from: s6 */
    public final void mo7660s6(InterfaceC3129i6 interfaceC3129i6, String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3129i6);
        parcelM7001E0.writeString(str);
        m7002T1(1, parcelM7001E0);
    }
}
