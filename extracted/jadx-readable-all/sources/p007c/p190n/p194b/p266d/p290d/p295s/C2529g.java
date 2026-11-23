package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p290d.C2389g;
import p007c.p190n.p194b.p266d.p290d.C2560u0;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.s.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2529g extends C3988s implements InterfaceC2542m0 {
    public C2529g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.internal.ICastDeviceController");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: I */
    public final void mo5138I(String str) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        m9210K2(5, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: J */
    public final void mo5139J() throws RemoteException {
        m9210K2(1, m9209E0());
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: K */
    public final void mo5140K() throws RemoteException {
        m9210K2(17, m9209E0());
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: X2 */
    public final void mo5141X2() throws RemoteException {
        m9210K2(19, m9209E0());
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: e6 */
    public final void mo5142e6(InterfaceC2527f interfaceC2527f) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9268b(parcelM9209E0, interfaceC2527f);
        m9210K2(18, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: i3 */
    public final void mo5143i3(String str) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        m9210K2(11, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: p1 */
    public final void mo5144p1(String str) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        m9210K2(12, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: r6 */
    public final void mo5145r6(String str, C2389g c2389g) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        C4016v.m9269c(parcelM9209E0, c2389g);
        m9210K2(13, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: x6 */
    public final void mo5146x6(String str, String str2, C2560u0 c2560u0) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        parcelM9209E0.writeString(str2);
        C4016v.m9269c(parcelM9209E0, c2560u0);
        m9210K2(14, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p295s.InterfaceC2542m0
    /* JADX INFO: renamed from: y1 */
    public final void mo5147y1(String str, String str2, long j2) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeString(str);
        parcelM9209E0.writeString(str2);
        parcelM9209E0.writeLong(j2);
        m9210K2(9, parcelM9209E0);
    }
}
