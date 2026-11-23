package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.fj */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3031fj extends hg2 implements InterfaceC3068gj {
    public AbstractBinderC3031fj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String str = ((BinderC2957dj) this).f13282f;
            parcel2.writeNoException();
            parcel2.writeString(str);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = ((BinderC2957dj) this).f13283g;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }
}
