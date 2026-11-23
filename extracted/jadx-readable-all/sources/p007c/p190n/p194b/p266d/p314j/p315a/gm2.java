package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gm2 implements bm2 {

    /* JADX INFO: renamed from: f */
    public final bm2[] f14617f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<bm2> f14618g;

    /* JADX INFO: renamed from: i */
    public am2 f14620i;

    /* JADX INFO: renamed from: j */
    public nh2 f14621j;

    /* JADX INFO: renamed from: l */
    public em2 f14623l;

    /* JADX INFO: renamed from: h */
    public final mh2 f14619h = new mh2();

    /* JADX INFO: renamed from: k */
    public int f14622k = -1;

    public gm2(bm2... bm2VarArr) {
        this.f14617f = bm2VarArr;
        this.f14618g = new ArrayList<>(Arrays.asList(bm2VarArr));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: a */
    public final void mo6059a() throws IOException {
        em2 em2Var = this.f14623l;
        if (em2Var != null) {
            throw em2Var;
        }
        for (bm2 bm2Var : this.f14617f) {
            bm2Var.mo6059a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: b */
    public final zl2 mo6060b(int i, kn2 kn2Var) {
        int length = this.f14617f.length;
        zl2[] zl2VarArr = new zl2[length];
        for (int i2 = 0; i2 < length; i2++) {
            zl2VarArr[i2] = this.f14617f[i2].mo6060b(i, kn2Var);
        }
        return new cm2(zl2VarArr);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: d */
    public final void mo6061d(tg2 tg2Var, boolean z, am2 am2Var) {
        this.f14620i = am2Var;
        int i = 0;
        while (true) {
            bm2[] bm2VarArr = this.f14617f;
            if (i >= bm2VarArr.length) {
                return;
            }
            bm2VarArr[i].mo6061d(tg2Var, false, new dm2(this, i));
            i++;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: e */
    public final void mo6062e() {
        for (bm2 bm2Var : this.f14617f) {
            bm2Var.mo6062e();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bm2
    /* JADX INFO: renamed from: f */
    public final void mo6063f(zl2 zl2Var) {
        cm2 cm2Var = (cm2) zl2Var;
        int i = 0;
        while (true) {
            bm2[] bm2VarArr = this.f14617f;
            if (i >= bm2VarArr.length) {
                return;
            }
            bm2VarArr[i].mo6063f(cm2Var.f13053f[i]);
            i++;
        }
    }
}
