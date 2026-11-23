package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayDeque;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class x92 {

    /* JADX INFO: renamed from: a */
    public final ArrayDeque<g72> f21473a = new ArrayDeque<>();

    public /* synthetic */ x92(w92 w92Var) {
    }

    /* JADX INFO: renamed from: a */
    public final void m8730a(g72 g72Var) {
        if (!g72Var.mo5722u()) {
            if (!(g72Var instanceof aa2)) {
                String strValueOf = String.valueOf(g72Var.getClass());
                throw new IllegalArgumentException(outline.m1550A(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            aa2 aa2Var = (aa2) g72Var;
            m8730a(aa2Var.f12051j);
            m8730a(aa2Var.f12052k);
            return;
        }
        int iBinarySearch = Arrays.binarySearch(aa2.f12049h, g72Var.mo5719m());
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int iM5712Q = aa2.m5712Q(iBinarySearch + 1);
        if (this.f21473a.isEmpty() || this.f21473a.peek().mo5719m() >= iM5712Q) {
            this.f21473a.push(g72Var);
            return;
        }
        int iM5712Q2 = aa2.m5712Q(iBinarySearch);
        g72 g72VarPop = this.f21473a.pop();
        while (!this.f21473a.isEmpty() && this.f21473a.peek().mo5719m() < iM5712Q2) {
            g72VarPop = new aa2(this.f21473a.pop(), g72VarPop);
        }
        aa2 aa2Var2 = new aa2(g72VarPop, g72Var);
        while (!this.f21473a.isEmpty()) {
            int iBinarySearch2 = Arrays.binarySearch(aa2.f12049h, aa2Var2.f12050i);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (this.f21473a.peek().mo5719m() >= aa2.m5712Q(iBinarySearch2 + 1)) {
                break;
            } else {
                aa2Var2 = new aa2(this.f21473a.pop(), aa2Var2);
            }
        }
        this.f21473a.push(aa2Var2);
    }
}
