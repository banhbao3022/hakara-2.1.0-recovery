package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.ek */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2995ek extends hg2 implements InterfaceC3032fk {
    public AbstractBinderC2995ek() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo6360c();
        } else if (i == 2) {
            mo6362y(parcel.readInt());
        } else {
            if (i != 3) {
                return false;
            }
            mo6361s((yv2) ig2.m7250a(parcel, yv2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
