package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dm2 implements am2 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f13320f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gm2 f13321g;

    public dm2(gm2 gm2Var, int i) {
        this.f13321g = gm2Var;
        this.f13320f = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.am2
    /* JADX INFO: renamed from: c */
    public final void mo5793c(nh2 nh2Var, Object obj) {
        gm2 gm2Var = this.f13321g;
        int i = this.f13320f;
        if (gm2Var.f14623l == null) {
            for (int i2 = 0; i2 <= 0; i2++) {
                nh2Var.m7864g(i2, gm2Var.f14619h);
            }
            int i3 = gm2Var.f14622k;
            if (i3 == -1) {
                gm2Var.f14622k = 1;
            } else {
                em2 em2Var = i3 != 1 ? new em2(1) : null;
                gm2Var.f14623l = em2Var;
            }
            gm2Var.f14623l = em2Var;
        }
        if (gm2Var.f14623l != null) {
            return;
        }
        gm2Var.f14618g.remove(gm2Var.f14617f[i]);
        if (i == 0) {
            gm2Var.f14621j = nh2Var;
        }
        if (gm2Var.f14618g.isEmpty()) {
            gm2Var.f14620i.mo5793c(gm2Var.f14621j, null);
        }
    }
}
