package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.n */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3307n extends hg2 implements InterfaceC3344o {
    public AbstractBinderC3307n() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo7651y0((ew2) ig2.m7250a(parcel, ew2.CREATOR));
            parcel2.writeNoException();
        } else if (i == 2) {
            String strMo7654d = mo7654d();
            parcel2.writeNoException();
            parcel2.writeString(strMo7654d);
        } else if (i == 3) {
            boolean zMo7655f = mo7655f();
            parcel2.writeNoException();
            ClassLoader classLoader = ig2.f15182a;
            parcel2.writeInt(zMo7655f ? 1 : 0);
        } else if (i == 4) {
            String strMo7657g = mo7657g();
            parcel2.writeNoException();
            parcel2.writeString(strMo7657g);
        } else {
            if (i != 5) {
                return false;
            }
            mo7656f4((ew2) ig2.m7250a(parcel, ew2.CREATOR), parcel.readInt());
            parcel2.writeNoException();
        }
        return true;
    }
}
