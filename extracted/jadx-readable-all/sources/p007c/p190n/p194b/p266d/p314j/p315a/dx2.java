package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dx2 extends fx2<InterfaceC3735yj> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f13420b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f13421c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InterfaceC3395pd f13422d;

    public dx2(ex2 ex2Var, Context context, String str, InterfaceC3395pd interfaceC3395pd) {
        this.f13420b = context;
        this.f13421c = str;
        this.f13422d = interfaceC3395pd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3735yj mo5889a() {
        ex2.m6696b(this.f13420b, "rewarded");
        return new BinderC3051g2();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final InterfaceC3735yj mo5890b() throws RemoteException {
        Context context = this.f13420b;
        try {
            IBinder iBinderM6197K2 = ((C2921ck) C2622l.m5233C0(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", C3180jk.f15604a)).m6197K2(new BinderC2800b(context), this.f13421c, this.f13422d, 210890000);
            if (iBinderM6197K2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderM6197K2.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return iInterfaceQueryLocalInterface instanceof InterfaceC3735yj ? (InterfaceC3735yj) iInterfaceQueryLocalInterface : new C3661wj(iBinderM6197K2);
        } catch (RemoteException | C3628vn e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3735yj mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6139v4(new BinderC2800b(this.f13420b), this.f13421c, this.f13422d, 210890000);
    }
}
