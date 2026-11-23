package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: renamed from: c.n.b.d.j.a.ef */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC2990ef extends hg2 implements InterfaceC3027ff {
    public AbstractBinderC2990ef() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC2952de c2877be;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c2877be = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                c2877be = iInterfaceQueryLocalInterface instanceof InterfaceC2952de ? (InterfaceC2952de) iInterfaceQueryLocalInterface : new C2877be(strongBinder);
            }
            a01 a01Var = (a01) this;
            a01Var.f11992g.f12500c = c2877be;
            ((yy0) a01Var.f11991f.f13745c).mo6585h();
        } else if (i == 2) {
            ((yy0) ((a01) this).f11991f.f13745c).mo6595z6(0, parcel.readString());
        } else {
            if (i != 3) {
                return false;
            }
            ((yy0) ((a01) this).f11991f.f13745c).mo6584g1((yv2) ig2.m7250a(parcel, yv2.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
