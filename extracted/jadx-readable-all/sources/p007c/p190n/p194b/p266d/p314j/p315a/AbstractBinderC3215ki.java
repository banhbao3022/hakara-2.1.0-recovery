package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2292q;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2294r;

/* JADX INFO: renamed from: c.n.b.d.j.a.ki */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3215ki extends hg2 implements InterfaceC3252li {
    public AbstractBinderC3215ki() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ((zs0) this).f22396f.f12266a.m7286a(new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) ig2.m7250a(parcel, ParcelFileDescriptor.CREATOR)));
        } else {
            if (i != 2) {
                return false;
            }
            C2294r c2294r = (C2294r) ig2.m7250a(parcel, C2294r.CREATOR);
            ((zs0) this).f22396f.f12266a.m7287b(new C2292q(c2294r.f10767f, c2294r.f10768g));
        }
        parcel2.writeNoException();
        return true;
    }
}
