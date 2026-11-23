package p007c.p190n.p194b.p367f.p368a.p373d;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: renamed from: c.n.b.f.a.d.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5102l0 extends C5096i0 implements InterfaceC5106n0 {
    public C5102l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0
    /* JADX INFO: renamed from: I5 */
    public final void mo11540I5(String str, Bundle bundle, InterfaceC5110p0 interfaceC5110p0) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        parcelM11536E0.writeString(str);
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeStrongBinder(interfaceC5110p0);
        m11537i1(5, parcelM11536E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0
    /* JADX INFO: renamed from: O1 */
    public final void mo11541O1(String str, Bundle bundle, Bundle bundle2, InterfaceC5110p0 interfaceC5110p0) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        parcelM11536E0.writeString(str);
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeInt(1);
        bundle2.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeStrongBinder(interfaceC5110p0);
        m11537i1(9, parcelM11536E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0
    /* JADX INFO: renamed from: Q2 */
    public final void mo11542Q2(String str, Bundle bundle, InterfaceC5110p0 interfaceC5110p0) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        parcelM11536E0.writeString(str);
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeStrongBinder(interfaceC5110p0);
        m11537i1(10, parcelM11536E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0
    /* JADX INFO: renamed from: R2 */
    public final void mo11543R2(String str, Bundle bundle, Bundle bundle2, InterfaceC5110p0 interfaceC5110p0) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        parcelM11536E0.writeString(str);
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeInt(1);
        bundle2.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeStrongBinder(interfaceC5110p0);
        m11537i1(11, parcelM11536E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0
    /* JADX INFO: renamed from: b6 */
    public final void mo11544b6(String str, Bundle bundle, Bundle bundle2, InterfaceC5110p0 interfaceC5110p0) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        parcelM11536E0.writeString(str);
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeInt(1);
        bundle2.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeStrongBinder(interfaceC5110p0);
        m11537i1(6, parcelM11536E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0
    /* JADX INFO: renamed from: f1 */
    public final void mo11545f1(String str, Bundle bundle, Bundle bundle2, InterfaceC5110p0 interfaceC5110p0) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        parcelM11536E0.writeString(str);
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeInt(1);
        bundle2.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeStrongBinder(interfaceC5110p0);
        m11537i1(7, parcelM11536E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p367f.p368a.p373d.InterfaceC5106n0
    /* JADX INFO: renamed from: j1 */
    public final void mo11546j1(String str, List<Bundle> list, Bundle bundle, InterfaceC5110p0 interfaceC5110p0) throws RemoteException {
        Parcel parcelM11536E0 = m11536E0();
        parcelM11536E0.writeString(str);
        parcelM11536E0.writeTypedList(list);
        int i = C5100k0.f26051a;
        parcelM11536E0.writeInt(1);
        bundle.writeToParcel(parcelM11536E0, 0);
        parcelM11536E0.writeStrongBinder(interfaceC5110p0);
        m11537i1(14, parcelM11536E0);
    }
}
