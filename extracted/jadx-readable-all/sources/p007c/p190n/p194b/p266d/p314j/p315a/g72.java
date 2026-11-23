package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g72 implements Iterable<Byte>, Serializable {

    /* JADX INFO: renamed from: f */
    public static final g72 f14513f = new e72(p82.f17880b);

    /* JADX INFO: renamed from: g */
    public int f14514g = 0;

    static {
        int i = v62.f20704a;
    }

    /* JADX INFO: renamed from: G */
    public static g72 m6939G(byte[] bArr, int i, int i2) {
        m6945f(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new e72(bArr2);
    }

    /* JADX INFO: renamed from: H */
    public static g72 m6940H(byte[] bArr) {
        return m6939G(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: K */
    public static g72 m6941K(String str) {
        return new e72(str.getBytes(p82.f17879a));
    }

    /* JADX INFO: renamed from: L */
    public static g72 m6942L(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = 256;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i = 0;
            while (i < iMin) {
                int i2 = inputStream.read(bArr, i, iMin - i);
                if (i2 == -1) {
                    break;
                }
                i += i2;
            }
            g72 g72VarM6939G = i == 0 ? null : m6939G(bArr, 0, i);
            if (g72VarM6939G == null) {
                return m6943M(arrayList);
            }
            arrayList.add(g72VarM6939G);
            iMin = Math.min(iMin + iMin, 8192);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public static g72 m6943M(Iterable<g72> iterable) {
        int size;
        if (iterable instanceof Collection) {
            size = iterable.size();
        } else {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? f14513f : m6946q(iterable.iterator(), size);
    }

    /* JADX INFO: renamed from: c */
    public static void m6944c(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i >= 0) {
                throw new ArrayIndexOutOfBoundsException(outline.m1586h(40, "Index > length: ", i, ", ", i2));
            }
            throw new ArrayIndexOutOfBoundsException(outline.m1585g(22, "Index < 0: ", i));
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m6945f(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i >= 0) {
            if (i2 < i) {
                throw new IndexOutOfBoundsException(outline.m1586h(66, "Beginning index larger than ending index: ", i, ", ", i2));
            }
            throw new IndexOutOfBoundsException(outline.m1586h(37, "End index: ", i2, " >= ", i3));
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("Beginning index: ");
        sb.append(i);
        sb.append(" < 0");
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8 A[LOOP:0: B:33:0x00c0->B:35:0x00c8, LOOP_END] */
    /* JADX INFO: renamed from: q */
    public static g72 m6946q(Iterator<g72> it, int i) {
        x92 x92Var;
        g72 g72VarPop;
        aa2 aa2Var;
        if (i <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
        }
        if (i == 1) {
            return it.next();
        }
        int i2 = i >>> 1;
        g72 g72VarM6946q = m6946q(it, i2);
        g72 g72VarM6946q2 = m6946q(it, i - i2);
        if (Integer.MAX_VALUE - g72VarM6946q.mo5719m() < g72VarM6946q2.mo5719m()) {
            throw new IllegalArgumentException(outline.m1586h(53, "ByteString would be too long: ", g72VarM6946q.mo5719m(), "+", g72VarM6946q2.mo5719m()));
        }
        if (g72VarM6946q2.mo5719m() == 0) {
            return g72VarM6946q;
        }
        if (g72VarM6946q.mo5719m() == 0) {
            return g72VarM6946q2;
        }
        int iMo5719m = g72VarM6946q2.mo5719m() + g72VarM6946q.mo5719m();
        if (iMo5719m < 128) {
            return aa2.m5711P(g72VarM6946q, g72VarM6946q2);
        }
        if (g72VarM6946q instanceof aa2) {
            aa2 aa2Var2 = (aa2) g72VarM6946q;
            if (g72VarM6946q2.mo5719m() + aa2Var2.f12052k.mo5719m() < 128) {
                aa2Var = new aa2(aa2Var2.f12051j, aa2.m5711P(aa2Var2.f12052k, g72VarM6946q2));
            } else {
                if (aa2Var2.f12051j.mo5721t() > aa2Var2.f12052k.mo5721t() && aa2Var2.f12054m > g72VarM6946q2.mo5721t()) {
                    return new aa2(aa2Var2.f12051j, new aa2(aa2Var2.f12052k, g72VarM6946q2));
                }
                if (iMo5719m >= aa2.m5712Q(Math.max(g72VarM6946q.mo5721t(), g72VarM6946q2.mo5721t()) + 1)) {
                    x92Var = new x92(null);
                    x92Var.m8730a(g72VarM6946q);
                    x92Var.m8730a(g72VarM6946q2);
                    g72VarPop = x92Var.f21473a.pop();
                    while (!x92Var.f21473a.isEmpty()) {
                        g72VarPop = new aa2(x92Var.f21473a.pop(), g72VarPop);
                    }
                    return g72VarPop;
                }
                aa2Var = new aa2(g72VarM6946q, g72VarM6946q2);
            }
        } else {
            if (iMo5719m >= aa2.m5712Q(Math.max(g72VarM6946q.mo5721t(), g72VarM6946q2.mo5721t()) + 1)) {
                x92Var = new x92(null);
                x92Var.m8730a(g72VarM6946q);
                x92Var.m8730a(g72VarM6946q2);
                g72VarPop = x92Var.f21473a.pop();
                while (!x92Var.f21473a.isEmpty()) {
                    g72VarPop = new aa2(x92Var.f21473a.pop(), g72VarPop);
                }
                return g72VarPop;
            }
            aa2Var = new aa2(g72VarM6946q, g72VarM6946q2);
        }
        return aa2Var;
    }

    /* JADX INFO: renamed from: B */
    public abstract int mo5713B(int i, int i2, int i3);

    /* JADX INFO: renamed from: C */
    public abstract int mo5714C(int i, int i2, int i3);

    /* JADX INFO: renamed from: D */
    public abstract j72 mo5715D();

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a72 iterator() {
        return new z62(this);
    }

    @Deprecated
    /* JADX INFO: renamed from: N */
    public final void m6947N(byte[] bArr, int i, int i2, int i3) {
        m6945f(i, i + i3, mo5719m());
        m6945f(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo5720s(bArr, i, i2, i3);
        }
    }

    /* JADX INFO: renamed from: O */
    public final byte[] m6948O() {
        int iMo5719m = mo5719m();
        if (iMo5719m == 0) {
            return p82.f17880b;
        }
        byte[] bArr = new byte[iMo5719m];
        mo5720s(bArr, 0, 0, iMo5719m);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: h */
    public abstract byte mo5717h(int i);

    public final int hashCode() {
        int iMo5714C = this.f14514g;
        if (iMo5714C == 0) {
            int iMo5719m = mo5719m();
            iMo5714C = mo5714C(iMo5719m, 0, iMo5719m);
            if (iMo5714C == 0) {
                iMo5714C = 1;
            }
            this.f14514g = iMo5714C;
        }
        return iMo5714C;
    }

    /* JADX INFO: renamed from: j */
    public abstract byte mo5718j(int i);

    /* JADX INFO: renamed from: m */
    public abstract int mo5719m();

    /* JADX INFO: renamed from: s */
    public abstract void mo5720s(byte[] bArr, int i, int i2, int i3);

    /* JADX INFO: renamed from: t */
    public abstract int mo5721t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo5719m());
        objArr[2] = mo5719m() <= 50 ? C2622l.m5268J0(this) : String.valueOf(C2622l.m5268J0(mo5723v(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: renamed from: u */
    public abstract boolean mo5722u();

    /* JADX INFO: renamed from: v */
    public abstract g72 mo5723v(int i, int i2);

    /* JADX INFO: renamed from: x */
    public abstract void mo5724x(y62 y62Var) throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract String mo5725y(Charset charset);

    /* JADX INFO: renamed from: z */
    public abstract boolean mo5726z();
}
