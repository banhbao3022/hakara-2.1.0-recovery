package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q01 {

    /* JADX INFO: renamed from: a */
    public final si1 f18148a;

    /* JADX INFO: renamed from: b */
    public final jm0 f18149b;

    /* JADX INFO: renamed from: c */
    public final po0 f18150c;

    /* JADX INFO: renamed from: d */
    public final im1 f18151d;

    public q01(si1 si1Var, jm0 jm0Var, po0 po0Var, im1 im1Var) {
        this.f18148a = si1Var;
        this.f18149b = jm0Var;
        this.f18150c = po0Var;
        this.f18151d = im1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m8173a(uh1 uh1Var, rh1 rh1Var, int i, gx0 gx0Var, long j2) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
            hm1 hm1VarM7144a = hm1.m7144a("adapter_status");
            hm1VarM7144a.m7148e(uh1Var);
            hm1VarM7144a.f14911a.put("aai", rh1Var.f18831v);
            hm1VarM7144a.f14911a.put("adapter_l", String.valueOf(j2));
            hm1VarM7144a.f14911a.put("sc", Integer.toString(i));
            if (gx0Var != null) {
                hm1VarM7144a.f14911a.put("arec", Integer.toString(gx0Var.f14691g.f22116f));
                String strM8353a = this.f18148a.m8353a(gx0Var.getMessage());
                if (strM8353a != null) {
                    hm1VarM7144a.f14911a.put("areec", strM8353a);
                }
            }
            im0 im0VarM7362a = this.f18149b.m7362a(rh1Var.f18828s);
            if (im0VarM7362a != null) {
                hm1VarM7144a.f14911a.put("ancn", im0VarM7362a.f15299a);
                C3694xf c3694xf = im0VarM7362a.f15300b;
                if (c3694xf != null) {
                    hm1VarM7144a.f14911a.put("adapter_v", c3694xf.toString());
                }
                C3694xf c3694xf2 = im0VarM7362a.f15301c;
                if (c3694xf2 != null) {
                    hm1VarM7144a.f14911a.put("adapter_sv", c3694xf2.toString());
                }
            }
            this.f18151d.mo7280b(hm1VarM7144a);
            return;
        }
        oo0 oo0VarM8131a = this.f18150c.m8131a();
        oo0VarM8131a.f17700a.put("gqi", uh1Var.f20318b);
        oo0VarM8131a.f17700a.put("aai", rh1Var.f18831v);
        oo0VarM8131a.f17700a.put("action", "adapter_status");
        oo0VarM8131a.f17700a.put("adapter_l", String.valueOf(j2));
        oo0VarM8131a.f17700a.put("sc", Integer.toString(i));
        if (gx0Var != null) {
            oo0VarM8131a.f17700a.put("arec", Integer.toString(gx0Var.f14691g.f22116f));
            String strM8353a2 = this.f18148a.m8353a(gx0Var.getMessage());
            if (strM8353a2 != null) {
                oo0VarM8131a.f17700a.put("areec", strM8353a2);
            }
        }
        im0 im0VarM7362a2 = this.f18149b.m7362a(rh1Var.f18828s);
        if (im0VarM7362a2 != null) {
            oo0VarM8131a.f17700a.put("ancn", im0VarM7362a2.f15299a);
            C3694xf c3694xf3 = im0VarM7362a2.f15300b;
            if (c3694xf3 != null) {
                oo0VarM8131a.f17700a.put("adapter_v", c3694xf3.toString());
            }
            C3694xf c3694xf4 = im0VarM7362a2.f15301c;
            if (c3694xf4 != null) {
                oo0VarM8131a.f17700a.put("adapter_sv", c3694xf4.toString());
            }
        }
        oo0VarM8131a.m8047b();
    }
}
