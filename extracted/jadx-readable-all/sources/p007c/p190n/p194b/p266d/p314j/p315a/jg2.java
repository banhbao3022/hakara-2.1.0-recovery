package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jg2 extends gg2 implements lg2 {
    public jg2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lg2
    /* JADX INFO: renamed from: A0 */
    public final void mo7339A0(int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(i);
        m7002T1(7, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lg2
    /* JADX INFO: renamed from: G3 */
    public final void mo7340G3(int[] iArr) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeIntArray(null);
        m7002T1(4, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lg2
    /* JADX INFO: renamed from: G4 */
    public final void mo7341G4(InterfaceC2799a interfaceC2799a, String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        ig2.m7253d(parcelM7001E0, interfaceC2799a);
        parcelM7001E0.writeString("GMA_SDK");
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lg2
    /* JADX INFO: renamed from: d */
    public final void mo7342d() throws RemoteException {
        m7002T1(3, m7001E0());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lg2
    /* JADX INFO: renamed from: s4 */
    public final void mo7343s4(byte[] bArr) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeByteArray(bArr);
        m7002T1(5, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lg2
    /* JADX INFO: renamed from: x0 */
    public final void mo7344x0(int i) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeInt(0);
        m7002T1(6, parcelM7001E0);
    }
}
