package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.text.TextUtils;
import java.util.regex.Pattern;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xu0 implements r90, uv2, a70, m60 {

    /* JADX INFO: renamed from: f */
    public final Context f21681f;

    /* JADX INFO: renamed from: g */
    public final si1 f21682g;

    /* JADX INFO: renamed from: h */
    public final di1 f21683h;

    /* JADX INFO: renamed from: i */
    public final rh1 f21684i;

    /* JADX INFO: renamed from: j */
    public final pw0 f21685j;

    /* JADX INFO: renamed from: k */
    public Boolean f21686k;

    /* JADX INFO: renamed from: l */
    public final boolean f21687l = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14420p4)).booleanValue();

    /* JADX INFO: renamed from: m */
    public final im1 f21688m;

    /* JADX INFO: renamed from: n */
    public final String f21689n;

    public xu0(Context context, si1 si1Var, di1 di1Var, rh1 rh1Var, pw0 pw0Var, im1 im1Var, String str) {
        this.f21681f = context;
        this.f21682g = si1Var;
        this.f21683h = di1Var;
        this.f21684i = rh1Var;
        this.f21685j = pw0Var;
        this.f21688m = im1Var;
        this.f21689n = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r90
    /* JADX INFO: renamed from: a */
    public final void mo5829a() {
        if (m8756b()) {
            this.f21688m.mo7280b(m8757c("adapter_impression"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8756b() {
        if (this.f21686k == null) {
            synchronized (this) {
                try {
                    if (this.f21686k == null) {
                        String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14263S0);
                        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
                        String strM4738H = C2267h1.m4738H(this.f21681f);
                        boolean zMatches = false;
                        if (str != null) {
                            try {
                                zMatches = Pattern.matches(str, strM4738H);
                            } catch (RuntimeException e) {
                                C2998en c2998en = C2330u.f10884a.f10893h;
                                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "CsiActionsListener.isPatternMatched");
                            }
                        }
                        this.f21686k = Boolean.valueOf(zMatches);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f21686k.booleanValue();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m60
    /* JADX INFO: renamed from: b0 */
    public final void mo5831b0(yv2 yv2Var) {
        yv2 yv2Var2;
        if (this.f21687l) {
            int i = yv2Var.f22116f;
            String str = yv2Var.f22117g;
            if (yv2Var.f22118h.equals("com.google.android.gms.ads") && (yv2Var2 = yv2Var.f22119i) != null && !yv2Var2.f22118h.equals("com.google.android.gms.ads")) {
                yv2 yv2Var3 = yv2Var.f22119i;
                i = yv2Var3.f22116f;
                str = yv2Var3.f22117g;
            }
            String strM8353a = this.f21682g.m8353a(str);
            hm1 hm1VarM8757c = m8757c("ifts");
            hm1VarM8757c.f14911a.put("reason", "adapter");
            if (i >= 0) {
                hm1VarM8757c.f14911a.put("arec", String.valueOf(i));
            }
            if (strM8353a != null) {
                hm1VarM8757c.f14911a.put("areec", strM8353a);
            }
            this.f21688m.mo7280b(hm1VarM8757c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final hm1 m8757c(String str) {
        hm1 hm1VarM7144a = hm1.m7144a(str);
        hm1VarM7144a.m7147d(this.f21683h, null);
        hm1VarM7144a.f14911a.put("aai", this.f21684i.f18831v);
        hm1VarM7144a.f14911a.put("request_id", this.f21689n);
        if (!this.f21684i.f18828s.isEmpty()) {
            hm1VarM7144a.f14911a.put("ancn", this.f21684i.f18828s.get(0));
        }
        if (this.f21684i.f18810d0) {
            C2330u c2330u = C2330u.f10884a;
            C2267h1 c2267h1 = c2330u.f10889d;
            hm1VarM7144a.f14911a.put("device_connectivity", true != C2267h1.m4747f(this.f21681f) ? "offline" : "online");
            hm1VarM7144a.f14911a.put("event_timestamp", String.valueOf(c2330u.f10896k.mo5623c()));
            hm1VarM7144a.f14911a.put("offline_ad", "1");
        }
        return hm1VarM7144a;
    }

    /* JADX INFO: renamed from: d */
    public final void m8758d(hm1 hm1Var) {
        if (!this.f21684i.f18810d0) {
            this.f21688m.mo7280b(hm1Var);
            return;
        }
        rw0 rw0Var = new rw0(C2330u.f10884a.f10896k.mo5623c(), this.f21683h.f13281b.f12695b.f20318b, this.f21688m.mo7279a(hm1Var), 2);
        pw0 pw0Var = this.f21685j;
        pw0Var.m8169a(new nw0(pw0Var, rw0Var));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m60
    /* JADX INFO: renamed from: e */
    public final void mo5834e() {
        if (this.f21687l) {
            im1 im1Var = this.f21688m;
            hm1 hm1VarM8757c = m8757c("ifts");
            hm1VarM8757c.f14911a.put("reason", "blocked");
            im1Var.mo7280b(hm1VarM8757c);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final void mo5699i() {
        if (m8756b() || this.f21684i.f18810d0) {
            m8758d(m8757c("impression"));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        if (this.f21684i.f18810d0) {
            m8758d(m8757c("click"));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.r90
    /* JADX INFO: renamed from: k */
    public final void mo5835k() {
        if (m8756b()) {
            this.f21688m.mo7280b(m8757c("adapter_shown"));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m60
    /* JADX INFO: renamed from: k0 */
    public final void mo5836k0(be0 be0Var) {
        if (this.f21687l) {
            hm1 hm1VarM8757c = m8757c("ifts");
            hm1VarM8757c.f14911a.put("reason", "exception");
            if (!TextUtils.isEmpty(be0Var.getMessage())) {
                hm1VarM8757c.f14911a.put("msg", be0Var.getMessage());
            }
            this.f21688m.mo7280b(hm1VarM8757c);
        }
    }
}
