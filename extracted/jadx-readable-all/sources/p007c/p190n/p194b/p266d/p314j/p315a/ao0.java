package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ao0 implements r90, uv2, a70, m60 {

    /* JADX INFO: renamed from: f */
    public final Context f12229f;

    /* JADX INFO: renamed from: g */
    public final si1 f12230g;

    /* JADX INFO: renamed from: h */
    public final po0 f12231h;

    /* JADX INFO: renamed from: i */
    public final di1 f12232i;

    /* JADX INFO: renamed from: j */
    public final rh1 f12233j;

    /* JADX INFO: renamed from: k */
    public final pw0 f12234k;

    /* JADX INFO: renamed from: l */
    public Boolean f12235l;

    /* JADX INFO: renamed from: m */
    public final boolean f12236m = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14420p4)).booleanValue();

    public ao0(Context context, si1 si1Var, po0 po0Var, di1 di1Var, rh1 rh1Var, pw0 pw0Var) {
        this.f12229f = context;
        this.f12230g = si1Var;
        this.f12231h = po0Var;
        this.f12232i = di1Var;
        this.f12233j = rh1Var;
        this.f12234k = pw0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r90
    /* JADX INFO: renamed from: a */
    public final void mo5829a() {
        if (m5830b()) {
            m5832c("adapter_impression").m8047b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m5830b() {
        if (this.f12235l == null) {
            synchronized (this) {
                try {
                    if (this.f12235l == null) {
                        String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14263S0);
                        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                        String strM4738H = C2267h1.m4738H(this.f12229f);
                        boolean zMatches = false;
                        if (str != null) {
                            try {
                                zMatches = Pattern.matches(str, strM4738H);
                            } catch (RuntimeException e) {
                                C2998en c2998en = C2330u.f10884a.f10893h;
                                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "CsiActionsListener.isPatternMatched");
                            }
                        }
                        this.f12235l = Boolean.valueOf(zMatches);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f12235l.booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m60
    /* JADX INFO: renamed from: b0 */
    public final void mo5831b0(yv2 yv2Var) {
        yv2 yv2Var2;
        if (this.f12236m) {
            oo0 oo0VarM5832c = m5832c("ifts");
            oo0VarM5832c.f17700a.put("reason", "adapter");
            int i = yv2Var.f22116f;
            String str = yv2Var.f22117g;
            if (yv2Var.f22118h.equals("com.google.android.gms.ads") && (yv2Var2 = yv2Var.f22119i) != null && !yv2Var2.f22118h.equals("com.google.android.gms.ads")) {
                yv2 yv2Var3 = yv2Var.f22119i;
                i = yv2Var3.f22116f;
                str = yv2Var3.f22117g;
            }
            if (i >= 0) {
                oo0VarM5832c.f17700a.put("arec", String.valueOf(i));
            }
            String strM8353a = this.f12230g.m8353a(str);
            if (strM8353a != null) {
                oo0VarM5832c.f17700a.put("areec", strM8353a);
            }
            oo0VarM5832c.m8047b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final oo0 m5832c(String str) {
        oo0 oo0VarM8131a = this.f12231h.m8131a();
        oo0VarM8131a.m8046a(this.f12232i.f13281b.f12695b);
        oo0VarM8131a.f17700a.put("aai", this.f12233j.f18831v);
        oo0VarM8131a.f17700a.put("action", str);
        if (!this.f12233j.f18828s.isEmpty()) {
            oo0VarM8131a.f17700a.put("ancn", this.f12233j.f18828s.get(0));
        }
        if (this.f12233j.f18810d0) {
            C2330u c2330u = C2330u.f10884a;
            C2267h1 c2267h1 = c2330u.f10889d;
            oo0VarM8131a.f17700a.put("device_connectivity", true != C2267h1.m4747f(this.f12229f) ? "offline" : "online");
            oo0VarM8131a.f17700a.put("event_timestamp", String.valueOf(c2330u.f10896k.mo5623c()));
            oo0VarM8131a.f17700a.put("offline_ad", "1");
        }
        return oo0VarM8131a;
    }

    /* JADX INFO: renamed from: d */
    public final void m5833d(oo0 oo0Var) {
        if (!this.f12233j.f18810d0) {
            oo0Var.m8047b();
            return;
        }
        uo0 uo0Var = oo0Var.f17701b.f18043a;
        rw0 rw0Var = new rw0(C2330u.f10884a.f10896k.mo5623c(), this.f12232i.f13281b.f12695b.f20318b, uo0Var.f21279e.m8356a(oo0Var.f17700a), 2);
        pw0 pw0Var = this.f12234k;
        pw0Var.m8169a(new nw0(pw0Var, rw0Var));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m60
    /* JADX INFO: renamed from: e */
    public final void mo5834e() {
        if (this.f12236m) {
            oo0 oo0VarM5832c = m5832c("ifts");
            oo0VarM5832c.f17700a.put("reason", "blocked");
            oo0VarM5832c.m8047b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final void mo5699i() {
        if (m5830b() || this.f12233j.f18810d0) {
            m5833d(m5832c("impression"));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        if (this.f12233j.f18810d0) {
            m5833d(m5832c("click"));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r90
    /* JADX INFO: renamed from: k */
    public final void mo5835k() {
        if (m5830b()) {
            m5832c("adapter_shown").m8047b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m60
    /* JADX INFO: renamed from: k0 */
    public final void mo5836k0(be0 be0Var) {
        if (this.f12236m) {
            oo0 oo0VarM5832c = m5832c("ifts");
            oo0VarM5832c.f17700a.put("reason", "exception");
            if (!TextUtils.isEmpty(be0Var.getMessage())) {
                oo0VarM5832c.f17700a.put("msg", be0Var.getMessage());
            }
            oo0VarM5832c.m8047b();
        }
    }
}
