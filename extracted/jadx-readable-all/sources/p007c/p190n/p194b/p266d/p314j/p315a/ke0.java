package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ke0 implements p20<t20> {

    /* JADX INFO: renamed from: a */
    public final Map<String, bx0<t20>> f15923a;

    /* JADX INFO: renamed from: b */
    public final Map<String, bx0<wf0>> f15924b;

    /* JADX INFO: renamed from: c */
    public final Map<String, qz0<wf0>> f15925c;

    /* JADX INFO: renamed from: d */
    public final gd2<p20<n00>> f15926d;

    /* JADX INFO: renamed from: e */
    public final mg0 f15927e;

    public ke0(Map<String, bx0<t20>> map, Map<String, bx0<wf0>> map2, Map<String, qz0<wf0>> map3, gd2<p20<n00>> gd2Var, mg0 mg0Var) {
        this.f15923a = map;
        this.f15924b = map2;
        this.f15925c = map3;
        this.f15926d = gd2Var;
        this.f15927e = mg0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.p20
    /* JADX INFO: renamed from: a */
    public final bx0<t20> mo7493a(int i, String str) {
        bx0<n00> bx0VarMo7493a;
        bx0<t20> bx0Var = this.f15923a.get(str);
        if (bx0Var != null) {
            return bx0Var;
        }
        if (i == 1) {
            if (this.f15927e.f16751e == null || (bx0VarMo7493a = this.f15926d.mo4613a().mo7493a(i, str)) == null) {
                return null;
            }
            return new cx0(bx0VarMo7493a, s20.f19447a);
        }
        if (i != 4) {
            return null;
        }
        qz0<wf0> qz0Var = this.f15925c.get(str);
        if (qz0Var != null) {
            return new cx0(qz0Var, r20.f18691a);
        }
        bx0<wf0> bx0Var2 = this.f15924b.get(str);
        if (bx0Var2 == null) {
            return null;
        }
        return new cx0(bx0Var2, s20.f19447a);
    }
}
