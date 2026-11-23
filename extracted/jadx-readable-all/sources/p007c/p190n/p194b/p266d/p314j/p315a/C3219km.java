package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.km */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3219km extends gg2 implements InterfaceC3293mm {
    public C3219km(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm
    /* JADX INFO: renamed from: E */
    public final void mo7512E(String str) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        m7002T1(2, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm
    /* JADX INFO: renamed from: Z */
    public final void mo7513Z(String str, String str2) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        m7002T1(1, parcelM7001E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm
    /* JADX INFO: renamed from: f0 */
    public final void mo7514f0(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelM7001E0 = m7001E0();
        parcelM7001E0.writeString(str);
        parcelM7001E0.writeString(str2);
        ig2.m7251b(parcelM7001E0, bundle);
        m7002T1(3, parcelM7001E0);
    }
}
