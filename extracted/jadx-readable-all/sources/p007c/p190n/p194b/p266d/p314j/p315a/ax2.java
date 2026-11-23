package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ax2 extends fx2<InterfaceC3604v> {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f12477b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jw2 f12478c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f12479d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC3395pd f12480e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ex2 f12481f;

    public ax2(ex2 ex2Var, Context context, jw2 jw2Var, String str, InterfaceC3395pd interfaceC3395pd) {
        this.f12481f = ex2Var;
        this.f12477b = context;
        this.f12478c = jw2Var;
        this.f12479d = str;
        this.f12480e = interfaceC3395pd;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3604v mo5889a() {
        ex2.m6696b(this.f12477b, "interstitial");
        return new BinderC2903c2();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC3604v mo5890b() throws RemoteException {
        return this.f12481f.f13749a.m6536c(this.f12477b, this.f12478c, this.f12479d, this.f12480e, 2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.fx2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3604v mo5891c(InterfaceC2975e0 interfaceC2975e0) throws RemoteException {
        return interfaceC2975e0.mo6136q6(new BinderC2800b(this.f12477b), this.f12478c, this.f12479d, this.f12480e, 210890000);
    }
}
