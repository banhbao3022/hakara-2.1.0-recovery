package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zu0 implements z80, u70, l60 {

    /* JADX INFO: renamed from: f */
    public final hm1 f22406f;

    /* JADX INFO: renamed from: g */
    public final im1 f22407g;

    /* JADX INFO: renamed from: h */
    public final C3146in f22408h;

    public zu0(hm1 hm1Var, im1 im1Var, C3146in c3146in) {
        this.f22406f = hm1Var;
        this.f22407g = im1Var;
        this.f22408h = c3146in;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(di1 di1Var) {
        this.f22406f.m7147d(di1Var, this.f22408h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        im1 im1Var = this.f22407g;
        hm1 hm1Var = this.f22406f;
        hm1Var.f14911a.put("action", "loaded");
        im1Var.mo7280b(hm1Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
        hm1 hm1Var = this.f22406f;
        Bundle bundle = c3437qi.f18295f;
        Objects.requireNonNull(hm1Var);
        if (bundle.containsKey("cnt")) {
            hm1Var.f14911a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            hm1Var.f14911a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(yv2 yv2Var) {
        hm1 hm1Var = this.f22406f;
        hm1Var.f14911a.put("action", "ftl");
        hm1Var.f14911a.put("ftl", String.valueOf(yv2Var.f22116f));
        hm1Var.f14911a.put("ed", yv2Var.f22118h);
        this.f22407g.mo7280b(this.f22406f);
    }
}
