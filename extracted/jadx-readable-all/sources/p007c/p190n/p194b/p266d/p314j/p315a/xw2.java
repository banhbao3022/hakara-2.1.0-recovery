package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xw2 extends fx2<InterfaceC3435qg> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f21709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC3395pd f21710c;

    public xw2(Context context, InterfaceC3395pd interfaceC3395pd) {
        this.f21709b = context;
        this.f21710c = interfaceC3395pd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3435qg mo5889a() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final InterfaceC3435qg mo5890b() throws RemoteException {
        try {
            return ((InterfaceC3583ug) C2622l.m5233C0(this.f21709b, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", ww2.f21384a)).mo8351B0(new BinderC2800b(this.f21709b), this.f21710c, 210890000);
        } catch (RemoteException | C3628vn | NullPointerException unused) {
            return null;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3435qg mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6138u4(new BinderC2800b(this.f21709b), this.f21710c, 210890000);
    }
}
