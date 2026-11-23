package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class aa2 extends g72 {

    /* JADX INFO: renamed from: h */
    public static final int[] f12049h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: i */
    public final int f12050i;

    /* JADX INFO: renamed from: j */
    public final g72 f12051j;

    /* JADX INFO: renamed from: k */
    public final g72 f12052k;

    /* JADX INFO: renamed from: l */
    public final int f12053l;

    /* JADX INFO: renamed from: m */
    public final int f12054m;

    public aa2(g72 g72Var, g72 g72Var2) {
        this.f12051j = g72Var;
        this.f12052k = g72Var2;
        int iMo5719m = g72Var.mo5719m();
        this.f12053l = iMo5719m;
        this.f12050i = g72Var2.mo5719m() + iMo5719m;
        this.f12054m = Math.max(g72Var.mo5721t(), g72Var2.mo5721t()) + 1;
    }

    /* JADX INFO: renamed from: P */
    public static g72 m5711P(g72 g72Var, g72 g72Var2) {
        int iMo5719m = g72Var.mo5719m();
        int iMo5719m2 = g72Var2.mo5719m();
        byte[] bArr = new byte[iMo5719m + iMo5719m2];
        g72Var.m6947N(bArr, 0, 0, iMo5719m);
        g72Var2.m6947N(bArr, 0, iMo5719m, iMo5719m2);
        return new e72(bArr);
    }

    /* JADX INFO: renamed from: Q */
    public static int m5712Q(int i) {
        int[] iArr = f12049h;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: B */
    public final int mo5713B(int i, int i2, int i3) {
        int i4 = this.f12053l;
        if (i2 + i3 <= i4) {
            return this.f12051j.mo5713B(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f12052k.mo5713B(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f12052k.mo5713B(this.f12051j.mo5713B(i, i2, i5), 0, i3 - i5);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: C */
    public final int mo5714C(int i, int i2, int i3) {
        int i4 = this.f12053l;
        if (i2 + i3 <= i4) {
            return this.f12051j.mo5714C(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.f12052k.mo5714C(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.f12052k.mo5714C(this.f12051j.mo5714C(i, i2, i5), 0, i3 - i5);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: D */
    public final j72 mo5715D() {
        return new i72(new z92(this));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: F */
    public final a72 iterator() {
        return new w92(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g72)) {
            return false;
        }
        g72 g72Var = (g72) obj;
        if (this.f12050i != g72Var.mo5719m()) {
            return false;
        }
        if (this.f12050i == 0) {
            return true;
        }
        int i = this.f14514g;
        int i2 = g72Var.f14514g;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        y92 y92Var = new y92(this, null);
        d72 d72VarM8780a = y92Var.next();
        y92 y92Var2 = new y92(g72Var, null);
        d72 d72VarM8780a2 = y92Var2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int iMo5719m = d72VarM8780a.mo5719m() - i3;
            int iMo5719m2 = d72VarM8780a2.mo5719m() - i4;
            int iMin = Math.min(iMo5719m, iMo5719m2);
            if (!(i3 == 0 ? d72VarM8780a.mo6292P(d72VarM8780a2, i4, iMin) : d72VarM8780a2.mo6292P(d72VarM8780a, i3, iMin))) {
                return false;
            }
            i5 += iMin;
            int i6 = this.f12050i;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iMo5719m) {
                d72VarM8780a = y92Var.next();
                i3 = 0;
            } else {
                i3 += iMin;
            }
            if (iMin == iMo5719m2) {
                d72VarM8780a = d72VarM8780a;
                d72VarM8780a2 = y92Var2.next();
                i4 = 0;
            } else {
                d72VarM8780a = d72VarM8780a;
                i4 += iMin;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: h */
    public final byte mo5717h(int i) {
        g72.m6944c(i, this.f12050i);
        return mo5718j(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
        return new w92(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: j */
    public final byte mo5718j(int i) {
        int i2 = this.f12053l;
        return i < i2 ? this.f12051j.mo5718j(i) : this.f12052k.mo5718j(i - i2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: m */
    public final int mo5719m() {
        return this.f12050i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: s */
    public final void mo5720s(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.f12053l;
        if (i + i3 <= i4) {
            this.f12051j.mo5720s(bArr, i, i2, i3);
        } else {
            if (i >= i4) {
                this.f12052k.mo5720s(bArr, i - i4, i2, i3);
                return;
            }
            int i5 = i4 - i;
            this.f12051j.mo5720s(bArr, i, i2, i5);
            this.f12052k.mo5720s(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: t */
    public final int mo5721t() {
        return this.f12054m;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: u */
    public final boolean mo5722u() {
        return this.f12050i >= m5712Q(this.f12054m);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: v */
    public final g72 mo5723v(int i, int i2) {
        int iM6945f = g72.m6945f(i, i2, this.f12050i);
        if (iM6945f == 0) {
            return g72.f14513f;
        }
        if (iM6945f == this.f12050i) {
            return this;
        }
        int i3 = this.f12053l;
        if (i2 <= i3) {
            return this.f12051j.mo5723v(i, i2);
        }
        if (i >= i3) {
            return this.f12052k.mo5723v(i - i3, i2 - i3);
        }
        g72 g72Var = this.f12051j;
        return new aa2(g72Var.mo5723v(i, g72Var.mo5719m()), this.f12052k.mo5723v(0, i2 - this.f12053l));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: x */
    public final void mo5724x(y62 y62Var) throws IOException {
        this.f12051j.mo5724x(y62Var);
        this.f12052k.mo5724x(y62Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: y */
    public final String mo5725y(Charset charset) {
        return new String(m6948O(), charset);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.g72
    /* JADX INFO: renamed from: z */
    public final boolean mo5726z() {
        int iMo5713B = this.f12051j.mo5713B(0, 0, this.f12053l);
        g72 g72Var = this.f12052k;
        return g72Var.mo5713B(iMo5713B, 0, g72Var.mo5719m()) == 0;
    }
}
