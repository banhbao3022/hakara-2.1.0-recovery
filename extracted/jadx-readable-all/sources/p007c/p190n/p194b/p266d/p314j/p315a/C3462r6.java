package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.r6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3462r6 extends gg2 implements InterfaceC3536t6 {
    public C3462r6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3536t6
    /* JADX INFO: renamed from: W5 */
    public final void mo7779W5(InterfaceC3129i6 interfaceC3129i6) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC3129i6);
        m7002T1(1, parcelM7001E0);
    }
}
