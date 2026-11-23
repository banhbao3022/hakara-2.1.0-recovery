package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.f.b4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3823b4 implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: f */
    public static final AbstractC3823b4 f22519f = new C3893i4(C3814a5.f22507b);

    /* JADX INFO: renamed from: g */
    public static final InterfaceC3873g4 f22520g;

    /* JADX INFO: renamed from: h */
    public int f22521h = 0;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        f22520g = C4056z3.m9317a() ? new C3903j4(null) : new C3863f4(null);
    }

    /* JADX INFO: renamed from: s */
    public static int m8945s(int i, int i2, int i3) {
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
    public abstract String mo8946c(Charset charset);

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract void mo8947f(AbstractC3833c4 abstractC3833c4) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract byte mo8948h(int i);

    public final int hashCode() {
        int iMo8950m = this.f22521h;
        if (iMo8950m == 0) {
            int size = size();
            iMo8950m = mo8950m(size, 0, size);
            if (iMo8950m == 0) {
                iMo8950m = 1;
            }
            this.f22521h = iMo8950m;
        }
        return iMo8950m;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new C3853e4(this);
    }

    /* JADX INFO: renamed from: j */
    public abstract byte mo8949j(int i);

    /* JADX INFO: renamed from: m */
    public abstract int mo8950m(int i, int i2, int i3);

    /* JADX INFO: renamed from: q */
    public abstract AbstractC3823b4 mo8951q(int i, int i2);

    public abstract int size();

    /* JADX INFO: renamed from: t */
    public abstract boolean mo8952t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        objArr[2] = size() <= 50 ? C2622l.m5432s2(this) : String.valueOf(C2622l.m5432s2(mo8951q(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
