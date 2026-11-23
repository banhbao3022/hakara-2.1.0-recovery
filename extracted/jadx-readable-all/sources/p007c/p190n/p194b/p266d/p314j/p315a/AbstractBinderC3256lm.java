package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.lm */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3256lm extends hg2 implements InterfaceC3293mm {
    public AbstractBinderC3256lm() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ((BinderC3399ph) this).mo7513Z(parcel.readString(), parcel.readString());
        } else if (i == 2) {
            ((BinderC3399ph) this).f17971f.mo4614a(parcel.readString());
        } else {
            if (i != 3) {
                return false;
            }
            ((BinderC3399ph) this).mo7514f0(parcel.readString(), parcel.readString(), (Bundle) ig2.m7250a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
