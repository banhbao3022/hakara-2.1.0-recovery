package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.xe */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3693xe extends hg2 implements InterfaceC3730ye {
    public AbstractBinderC3693xe() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg2
    /* JADX INFO: renamed from: E6 */
    public final boolean mo4735E6(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        InterfaceC3692xd c3655wd;
        if (i == 1) {
            InterfaceC2799a interfaceC2799aM5638i1 = InterfaceC2799a.a.m5638i1(parcel.readStrongBinder());
            my0 my0Var = (my0) this;
            my0Var.f16961g.f17473c = (View) BinderC2800b.m5639T1(interfaceC2799aM5638i1);
            ((yy0) my0Var.f16960f.f13745c).mo6585h();
        } else if (i == 2) {
            ((yy0) ((my0) this).f16960f.f13745c).mo6595z6(0, parcel.readString());
        } else if (i == 3) {
            ((my0) this).mo7739s((yv2) ig2.m7250a(parcel, yv2.CREATOR));
        } else {
            if (i != 4) {
                return false;
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c3655wd = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                c3655wd = iInterfaceQueryLocalInterface instanceof InterfaceC3692xd ? (InterfaceC3692xd) iInterfaceQueryLocalInterface : new C3655wd(strongBinder);
            }
            my0 my0Var2 = (my0) this;
            my0Var2.f16961g.f17474d = c3655wd;
            ((yy0) my0Var2.f16960f.f13745c).mo6585h();
        }
        parcel2.writeNoException();
        return true;
    }
}
