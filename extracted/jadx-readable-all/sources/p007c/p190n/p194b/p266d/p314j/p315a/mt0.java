package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mt0 implements nt0 {

    /* JADX INFO: renamed from: a */
    public final Map<String, gd2<nt0>> f16845a;

    /* JADX INFO: renamed from: b */
    public final lv1 f16846b;

    /* JADX INFO: renamed from: c */
    public final y80 f16847c;

    public mt0(Map<String, gd2<nt0>> map, lv1 lv1Var, y80 y80Var) {
        this.f16845a = map;
        this.f16846b = lv1Var;
        this.f16847c = y80Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.nt0
    /* JADX INFO: renamed from: a */
    public final kv1<di1> mo7730a(final C3437qi c3437qi) {
        this.f16847c.m7108A0(new w80(c3437qi));
        kv1<di1> gv1Var = new gv1<>(new or0(3));
        for (String str : ((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14243O4)).split(",")) {
            final gd2<nt0> gd2Var = this.f16845a.get(str.trim());
            if (gd2Var != null) {
                gv1Var = cw0.m6247q(gv1Var, or0.class, new qu1(gd2Var, c3437qi) { // from class: c.n.b.d.j.a.kt0

                    /* JADX INFO: renamed from: a */
                    public final gd2 f16036a;

                    /* JADX INFO: renamed from: b */
                    public final C3437qi f16037b;

                    {
                        this.f16036a = gd2Var;
                        this.f16037b = c3437qi;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qu1
                    /* JADX INFO: renamed from: a */
                    public final kv1 mo4612a(Object obj) {
                        gd2 gd2Var2 = this.f16036a;
                        return ((nt0) gd2Var2.mo4613a()).mo7730a(this.f16037b);
                    }
                }, this.f16846b);
            }
        }
        gv1Var.mo6230f(new ev1(gv1Var, new lt0(this)), C2962do.f13335f);
        return gv1Var;
    }
}
