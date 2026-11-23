package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.uj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3586uj extends hg2 implements InterfaceC3624vj {
    public AbstractBinderC3586uj() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String str = ((BinderC3402pk) this).f17999f;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = ((BinderC3402pk) this).f18000g;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }
}
