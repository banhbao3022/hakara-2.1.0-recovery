package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.k.x3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4402x3 implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: f */
    public static final AbstractC4402x3 f23614f = new C4126d4(C4127d5.f23113b);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC4098b4 f23615g;

    /* JADX INFO: renamed from: h */
    public int f23616h = 0;

    static {
        f23615g = C4363u3.m10264a() ? new C4168g4(null) : new C4084a4(null);
    }

    /* JADX INFO: renamed from: m */
    public static AbstractC4402x3 m10331m(byte[] bArr, int i, int i2) {
        m10332u(i, i + i2, bArr.length);
        return new C4126d4(f23615g.mo9339a(bArr, i, i2));
    }

    /* JADX INFO: renamed from: u */
    public static int m10332u(int i, int i2, int i3) {
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

    /* JADX INFO: renamed from: c */
    public abstract byte mo9501c(int i);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo9502f();

    /* JADX INFO: renamed from: h */
    public abstract int mo9540h(int i, int i2, int i3);

    public final int hashCode() {
        int iMo9540h = this.f23616h;
        if (iMo9540h == 0) {
            int iMo9502f = mo9502f();
            iMo9540h = mo9540h(iMo9502f, 0, iMo9502f);
            if (iMo9540h == 0) {
                iMo9540h = 1;
            }
            this.f23616h = iMo9540h;
        }
        return iMo9540h;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C4428z3(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract AbstractC4402x3 mo9541j(int i, int i2);

    /* JADX INFO: renamed from: q */
    public abstract String mo9542q(Charset charset);

    /* JADX INFO: renamed from: s */
    public abstract void mo9543s(AbstractC4415y3 abstractC4415y3) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract byte mo9503t(int i);

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo9502f());
        objArr[2] = mo9502f() <= 50 ? C2622l.m5273K0(this) : String.valueOf(C2622l.m5273K0(mo9541j(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    /* JADX INFO: renamed from: v */
    public abstract boolean mo9544v();
}
