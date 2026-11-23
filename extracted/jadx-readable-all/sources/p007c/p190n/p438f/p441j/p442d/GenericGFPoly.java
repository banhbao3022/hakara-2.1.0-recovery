package p007c.p190n.p438f.p441j.p442d;

import java.util.Objects;

/* JADX INFO: renamed from: c.n.f.j.d.b, reason: use source file name */
/* JADX INFO: compiled from: GenericGFPoly.java */
/* JADX INFO: loaded from: classes.dex */
public final class GenericGFPoly {

    /* JADX INFO: renamed from: a */
    public final GenericGF f27691a;

    /* JADX INFO: renamed from: b */
    public final int[] f27692b;

    public GenericGFPoly(GenericGF genericGF, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f27691a = genericGF;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f27692b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f27692b = new int[]{0};
            return;
        }
        int i2 = length - i;
        int[] iArr2 = new int[i2];
        this.f27692b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, i2);
    }

    /* JADX INFO: renamed from: a */
    public GenericGFPoly m12352a(GenericGFPoly genericGFPoly) {
        if (!this.f27691a.equals(genericGFPoly.f27691a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (m12355d()) {
            return genericGFPoly;
        }
        if (genericGFPoly.m12355d()) {
            return this;
        }
        int[] iArr = this.f27692b;
        int[] iArr2 = genericGFPoly.f27692b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = iArr2[i - length] ^ iArr[i];
        }
        return new GenericGFPoly(this.f27691a, iArr3);
    }

    /* JADX INFO: renamed from: b */
    public int m12353b(int i) {
        int[] iArr = this.f27692b;
        return iArr[(iArr.length - 1) - i];
    }

    /* JADX INFO: renamed from: c */
    public int m12354c() {
        return this.f27692b.length - 1;
    }

    /* JADX INFO: renamed from: d */
    public boolean m12355d() {
        return this.f27692b[0] == 0;
    }

    /* JADX INFO: renamed from: e */
    public GenericGFPoly m12356e(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f27691a.f27687i;
        }
        int length = this.f27692b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f27691a.m12351a(this.f27692b[i3], i2);
        }
        return new GenericGFPoly(this.f27691a, iArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(m12354c() * 8);
        for (int iM12354c = m12354c(); iM12354c >= 0; iM12354c--) {
            int iM12353b = m12353b(iM12354c);
            if (iM12353b != 0) {
                if (iM12353b < 0) {
                    sb.append(" - ");
                    iM12353b = -iM12353b;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iM12354c == 0 || iM12353b != 1) {
                    GenericGF genericGF = this.f27691a;
                    Objects.requireNonNull(genericGF);
                    if (iM12353b == 0) {
                        throw new IllegalArgumentException();
                    }
                    int i = genericGF.f27686h[iM12353b];
                    if (i == 0) {
                        sb.append('1');
                    } else if (i == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i);
                    }
                }
                if (iM12354c != 0) {
                    if (iM12354c == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iM12354c);
                    }
                }
            }
        }
        return sb.toString();
    }
}
