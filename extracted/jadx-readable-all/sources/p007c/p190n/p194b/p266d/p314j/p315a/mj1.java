package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.LinkedList;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mj1 {

    /* JADX INFO: renamed from: b */
    public final int f16776b;

    /* JADX INFO: renamed from: c */
    public final int f16777c;

    /* JADX INFO: renamed from: a */
    public final LinkedList<vj1<?>> f16775a = new LinkedList<>();

    /* JADX INFO: renamed from: d */
    public final lk1 f16778d = new lk1();

    public mj1(int i, int i2) {
        this.f16776b = i;
        this.f16777c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final vj1<?> m7715a() {
        lk1 lk1Var = this.f16778d;
        Objects.requireNonNull(lk1Var);
        lk1Var.f16379c = C2330u.f10884a.f10896k.mo5623c();
        lk1Var.f16380d++;
        m7717c();
        if (this.f16775a.isEmpty()) {
            return null;
        }
        vj1<?> vj1VarRemove = this.f16775a.remove();
        if (vj1VarRemove != null) {
            lk1 lk1Var2 = this.f16778d;
            lk1Var2.f16381e++;
            lk1Var2.f16378b.f15970f = true;
        }
        return vj1VarRemove;
    }

    /* JADX INFO: renamed from: b */
    public final int m7716b() {
        m7717c();
        return this.f16775a.size();
    }

    /* JADX INFO: renamed from: c */
    public final void m7717c() {
        while (!this.f16775a.isEmpty()) {
            if (C2330u.f10884a.f10896k.mo5623c() - this.f16775a.getFirst().f20808d < this.f16777c) {
                return;
            }
            lk1 lk1Var = this.f16778d;
            lk1Var.f16382f++;
            lk1Var.f16378b.f15971g++;
            this.f16775a.remove();
        }
    }
}
