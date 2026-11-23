package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.pa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3392pa extends hg2 implements InterfaceC3429qa {
    public AbstractBinderC3392pa() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel.readInt();
        }
        parcel2.writeNoException();
        return true;
    }
}
