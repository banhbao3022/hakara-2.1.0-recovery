package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.k.h3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4181h3 extends C4079a implements InterfaceC4180h2 {
    public C4181h3(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4180h2
    /* JADX INFO: renamed from: V */
    public final Bundle mo9820V(Bundle bundle) throws RemoteException {
        Parcel parcelM9333E0 = m9333E0();
        C4385w.m10298c(parcelM9333E0, bundle);
        Parcel parcelM9335i1 = m9335i1(1, parcelM9333E0);
        Bundle bundle2 = (Bundle) C4385w.m10296a(parcelM9335i1, Bundle.CREATOR);
        parcelM9335i1.recycle();
        return bundle2;
    }
}
