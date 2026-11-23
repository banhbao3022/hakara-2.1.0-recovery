package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.hf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3101hf extends hg2 implements InterfaceC3138if {
    public AbstractBinderC3101hf() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            ((yy0) ((y01) this).f21726f.f13745c).mo6585h();
        } else if (i == 3) {
            ((yy0) ((y01) this).f21726f.f13745c).mo6595z6(0, parcel.readString());
        } else {
            if (i != 4) {
                return false;
            }
            ((yy0) ((y01) this).f21726f.f13745c).mo6584g1((yv2) ig2.m7250a(parcel, yv2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
