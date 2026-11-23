package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pi1 implements dv1<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3410ps f17981a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bn1 f17982b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pw0 f17983c;

    public pi1(InterfaceC3410ps interfaceC3410ps, bn1 bn1Var, pw0 pw0Var) {
        this.f17981a = interfaceC3410ps;
        this.f17982b = bn1Var;
        this.f17983c = pw0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(String str) {
        String str2 = str;
        if (!this.f17981a.mo6499q().f18810d0) {
            this.f17982b.m6065b(str2);
            return;
        }
        C2330u c2330u = C2330u.f10884a;
        long jMo5623c = c2330u.f10896k.mo5623c();
        String str3 = this.f17981a.mo6512x().f20318b;
        C2267h1 c2267h1 = c2330u.f10889d;
        rw0 rw0Var = new rw0(jMo5623c, str3, str2, true == C2267h1.m4747f(this.f17981a.getContext()) ? 2 : 1);
        pw0 pw0Var = this.f17983c;
        pw0Var.m8169a(new nw0(pw0Var, rw0Var));
    }
}
