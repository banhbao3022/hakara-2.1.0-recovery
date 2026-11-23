package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4135e extends C4079a implements InterfaceC4107c {
    public C4135e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4107c
    /* JADX INFO: renamed from: V3 */
    public final void mo9492V3(String str, String str2, Bundle bundle, long j2) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        parcelM9333E0.writeString(str);
        parcelM9333E0.writeString(str2);
        C4385w.m10298c(parcelM9333E0, bundle);
        parcelM9333E0.writeLong(j2);
        m9334T1(1, parcelM9333E0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4107c
    public final int zza() throws RemoteException {
        Parcel parcelM9335i1 = m9335i1(2, m9333E0());
        int i = parcelM9335i1.readInt();
        parcelM9335i1.recycle();
        return i;
    }
}
