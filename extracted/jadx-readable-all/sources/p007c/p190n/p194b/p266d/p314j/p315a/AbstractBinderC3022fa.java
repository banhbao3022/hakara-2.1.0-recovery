package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.fa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3022fa extends hg2 implements InterfaceC3059ga {
    public AbstractBinderC3022fa() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo6615T4(parcel.createTypedArrayList(C3762z9.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
