package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.f.a.d.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5114r0 extends C5096i0 implements InterfaceC5116s0 {
    public C5114r0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetPackExtractionServiceCallback");
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5116s0
    /* JADX INFO: renamed from: Q3 */
    public final void mo11552Q3(Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeInt(1);
        bundle2.writeToParcel(parcelM11536E0, 0);
        m11537i1(2, parcelM11536E0);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5116s0
    /* JADX INFO: renamed from: R4 */
    public final void mo11553R4(Bundle bundle) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        m11537i1(3, parcelM11536E0);
    }

    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5116s0
    /* JADX INFO: renamed from: T3 */
    public final void mo11554T3(Bundle bundle) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        m11537i1(4, parcelM11536E0);
    }
}
