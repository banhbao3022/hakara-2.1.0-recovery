package p007c.p190n.p194b.p266d.p290d.p291r;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p314j.p320f.C3988s;
import p007c.p190n.p194b.p266d.p314j.p320f.C4016v;

/* JADX INFO: renamed from: c.n.b.d.d.r.b0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2425b0 extends C3988s implements InterfaceC2423a0 {
    public C2425b0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0
    /* JADX INFO: renamed from: Q */
    public final void mo4996Q(int i) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeInt(i);
        m9211T1(2, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0
    /* JADX INFO: renamed from: W */
    public final void mo4997W(C2602b c2602b) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9269c(parcelM9209E0, c2602b);
        m9211T1(3, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0
    /* JADX INFO: renamed from: c0 */
    public final void mo4998c0(Bundle bundle) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9269c(parcelM9209E0, null);
        m9211T1(1, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0
    /* JADX INFO: renamed from: d0 */
    public final void mo4999d0(int i) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        parcelM9209E0.writeInt(i);
        m9211T1(5, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0
    /* JADX INFO: renamed from: l0 */
    public final void mo5000l0(C2380d c2380d, String str, String str2, boolean z) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        C4016v.m9269c(parcelM9209E0, c2380d);
        parcelM9209E0.writeString(str);
        parcelM9209E0.writeString(str2);
        parcelM9209E0.writeInt(z ? 1 : 0);
        m9211T1(4, parcelM9209E0);
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.InterfaceC2423a0
    /* JADX INFO: renamed from: r3 */
    public final void mo5001r3(boolean z, int i) throws RemoteException {
        Parcel parcelM9209E0 = m9209E0();
        int i2 = C4016v.f22903a;
        parcelM9209E0.writeInt(z ? 1 : 0);
        parcelM9209E0.writeInt(0);
        m9211T1(6, parcelM9209E0);
    }
}
