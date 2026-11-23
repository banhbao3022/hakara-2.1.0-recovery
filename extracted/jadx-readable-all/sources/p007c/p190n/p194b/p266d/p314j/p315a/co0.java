package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class co0 implements z80, u70, l60 {

    /* JADX INFO: renamed from: f */
    public final lo0 f13064f;

    /* JADX INFO: renamed from: g */
    public final uo0 f13065g;

    public co0(lo0 lo0Var, uo0 uo0Var) {
        this.f13064f = lo0Var;
        this.f13065g = uo0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(di1 di1Var) {
        lo0 lo0Var = this.f13064f;
        Objects.requireNonNull(lo0Var);
        if (di1Var.f13281b.f12694a.size() > 0) {
            switch (di1Var.f13281b.f12694a.get(0).f18805b) {
                case 1:
                    lo0Var.f16429a.put("ad_format", "banner");
                    break;
                case 2:
                    lo0Var.f16429a.put("ad_format", "interstitial");
                    break;
                case 3:
                    lo0Var.f16429a.put("ad_format", "native_express");
                    break;
                case 4:
                    lo0Var.f16429a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    lo0Var.f16429a.put("ad_format", "rewarded");
                    break;
                case 6:
                    lo0Var.f16429a.put("ad_format", "app_open_ad");
                    lo0Var.f16429a.put("as", true != lo0Var.f16430b.f15325g ? "0" : "1");
                    break;
                default:
                    lo0Var.f16429a.put("ad_format", "unknown");
                    break;
            }
        }
        if (TextUtils.isEmpty(di1Var.f13281b.f12695b.f20318b)) {
            return;
        }
        lo0Var.f16429a.put("gqi", di1Var.f13281b.f12695b.f20318b);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        this.f13064f.f16429a.put("action", "loaded");
        this.f13065g.m8663a(this.f13064f.f16429a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
        lo0 lo0Var = this.f13064f;
        Bundle bundle = c3437qi.f18295f;
        Objects.requireNonNull(lo0Var);
        if (bundle.containsKey("cnt")) {
            lo0Var.f16429a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            lo0Var.f16429a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(yv2 yv2Var) {
        this.f13064f.f16429a.put("action", "ftl");
        this.f13064f.f16429a.put("ftl", String.valueOf(yv2Var.f22116f));
        this.f13064f.f16429a.put("ed", yv2Var.f22118h);
        this.f13065g.m8663a(this.f13064f.f16429a);
    }
}
