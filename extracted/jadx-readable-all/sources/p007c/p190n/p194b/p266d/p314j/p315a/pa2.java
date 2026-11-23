package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pa2 {

    /* JADX INFO: renamed from: a */
    public static final pa2 f17890a = new pa2(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: b */
    public int f17891b;

    /* JADX INFO: renamed from: c */
    public int[] f17892c;

    /* JADX INFO: renamed from: d */
    public Object[] f17893d;

    /* JADX INFO: renamed from: e */
    public int f17894e;

    /* JADX INFO: renamed from: f */
    public boolean f17895f;

    public pa2() {
        this(0, new int[8], new Object[8], true);
    }

    public pa2(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f17894e = -1;
        this.f17891b = i;
        this.f17892c = iArr;
        this.f17893d = objArr;
        this.f17895f = z;
    }

    /* JADX INFO: renamed from: a */
    public static pa2 m8091a() {
        return new pa2(0, new int[8], new Object[8], true);
    }

    /* JADX INFO: renamed from: b */
    public final int m8092b() {
        int iM7971u;
        int iM7972v;
        int iM7971u2;
        int i = this.f17894e;
        if (i != -1) {
            return i;
        }
        int iM7971u3 = 0;
        for (int i2 = 0; i2 < this.f17891b; i2++) {
            int i3 = this.f17892c[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        g72 g72Var = (g72) this.f17893d[i2];
                        int iM7971u4 = o72.m7971u(i4 << 3);
                        int iMo5719m = g72Var.mo5719m();
                        iM7971u3 = o72.m7971u(iMo5719m) + iMo5719m + iM7971u4 + iM7971u3;
                    } else if (i5 == 3) {
                        int iM7969s = o72.m7969s(i4);
                        iM7971u = iM7969s + iM7969s;
                        iM7972v = ((pa2) this.f17893d[i2]).m8092b();
                    } else {
                        if (i5 != 5) {
                            throw new IllegalStateException(r82.m8265f());
                        }
                        ((Integer) this.f17893d[i2]).intValue();
                        iM7971u2 = o72.m7971u(i4 << 3) + 4;
                    }
                } else {
                    ((Long) this.f17893d[i2]).longValue();
                    iM7971u2 = o72.m7971u(i4 << 3) + 8;
                }
                iM7971u3 = iM7971u2 + iM7971u3;
            } else {
                long jLongValue = ((Long) this.f17893d[i2]).longValue();
                iM7971u = o72.m7971u(i4 << 3);
                iM7972v = o72.m7972v(jLongValue);
            }
            iM7971u3 = iM7972v + iM7971u + iM7971u3;
        }
        this.f17894e = iM7971u3;
        return iM7971u3;
    }

    /* JADX INFO: renamed from: c */
    public final void m8093c(int i, Object obj) {
        if (!this.f17895f) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f17891b;
        int[] iArr = this.f17892c;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f17892c = Arrays.copyOf(iArr, i3);
            this.f17893d = Arrays.copyOf(this.f17893d, i3);
        }
        int[] iArr2 = this.f17892c;
        int i4 = this.f17891b;
        iArr2[i4] = i;
        this.f17893d[i4] = obj;
        this.f17891b = i4 + 1;
    }

    /* JADX INFO: renamed from: d */
    public final void m8094d(p72 p72Var) throws IOException {
        if (this.f17891b != 0) {
            for (int i = 0; i < this.f17891b; i++) {
                int i2 = this.f17892c[i];
                Object obj = this.f17893d[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    p72Var.f17875a.mo7665h(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    p72Var.f17875a.mo7666i(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    p72Var.f17875a.mo7669l(i3, (g72) obj);
                } else if (i4 == 3) {
                    p72Var.f17875a.mo7661d(i3, 3);
                    ((pa2) obj).m8094d(p72Var);
                    p72Var.f17875a.mo7661d(i3, 4);
                } else {
                    if (i4 != 5) {
                        throw new RuntimeException(r82.m8265f());
                    }
                    p72Var.f17875a.mo7664g(i3, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pa2)) {
            return false;
        }
        pa2 pa2Var = (pa2) obj;
        int i = this.f17891b;
        if (i == pa2Var.f17891b) {
            int[] iArr = this.f17892c;
            int[] iArr2 = pa2Var.f17892c;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f17893d;
            Object[] objArr2 = pa2Var.f17893d;
            int i3 = this.f17891b;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f17891b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f17892c;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f17893d;
        int i6 = this.f17891b;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
