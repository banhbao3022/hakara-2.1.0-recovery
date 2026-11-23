package p007c.p190n.p194b.p266d.p314j.p320f;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.f.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3938n extends C3988s implements InterfaceC3918l {
    public C3938n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3918l
    /* JADX INFO: renamed from: B5 */
    public final void mo9051B5(String str, Bundle bundle) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        C4016v.m9269c(parcelM9209E0, bundle);
        m9211T1(3, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3918l
    /* JADX INFO: renamed from: F */
    public final void mo9052F(String str, Bundle bundle) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        C4016v.m9269c(parcelM9209E0, bundle);
        m9211T1(1, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3918l
    /* JADX INFO: renamed from: N4 */
    public final void mo9053N4(String str, Bundle bundle) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        C4016v.m9269c(parcelM9209E0, bundle);
        m9211T1(4, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3918l
    /* JADX INFO: renamed from: p6 */
    public final void mo9054p6(String str, Bundle bundle) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        C4016v.m9269c(parcelM9209E0, bundle);
        m9211T1(2, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3918l
    /* JADX INFO: renamed from: u3 */
    public final void mo9055u3(String str, Bundle bundle, int i) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        C4016v.m9269c(parcelM9209E0, bundle);
        parcelM9209E0.writeInt(i);
        m9211T1(6, parcelM9209E0);
    }
}
