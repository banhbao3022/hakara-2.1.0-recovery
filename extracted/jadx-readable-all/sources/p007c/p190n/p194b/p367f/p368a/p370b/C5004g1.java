package p007c.p190n.p194b.p367f.p368a.p370b;

import java.util.Arrays;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.f.a.b.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5004g1 {

    /* JADX INFO: renamed from: a */
    public byte[] f25800a = new byte[4096];

    /* JADX INFO: renamed from: b */
    public int f25801b;

    /* JADX INFO: renamed from: c */
    public long f25802c;

    /* JADX INFO: renamed from: d */
    public long f25803d;

    /* JADX INFO: renamed from: e */
    public int f25804e;

    /* JADX INFO: renamed from: f */
    public int f25805f;

    /* JADX INFO: renamed from: g */
    public int f25806g;

    /* JADX INFO: renamed from: h */
    public boolean f25807h;

    /* JADX INFO: renamed from: i */
    public String f25808i;

    public C5004g1() {
        m11447c();
    }

    /* JADX INFO: renamed from: a */
    public final int m11445a(byte[] bArr, int i, int i2) {
        int iM11448d = m11448d(30, bArr, i, i2);
        if (iM11448d == -1) {
            return -1;
        }
        if (this.f25802c == -1) {
            long jM11015u = C4799a.m11015u(this.f25800a, 0);
            this.f25802c = jM11015u;
            if (jM11015u == 67324752) {
                this.f25807h = false;
                this.f25803d = C4799a.m11015u(this.f25800a, 18);
                this.f25806g = C4799a.m10950A(this.f25800a, 8);
                this.f25804e = C4799a.m10950A(this.f25800a, 26);
                int iM10950A = this.f25804e + 30 + C4799a.m10950A(this.f25800a, 28);
                this.f25805f = iM10950A;
                int length = this.f25800a.length;
                if (length < iM10950A) {
                    do {
                        length += length;
                    } while (length < iM10950A);
                    this.f25800a = Arrays.copyOf(this.f25800a, length);
                }
            } else {
                this.f25807h = true;
            }
        }
        int iM11448d2 = m11448d(this.f25805f, bArr, i + iM11448d, i2 - iM11448d);
        if (iM11448d2 == -1) {
            return -1;
        }
        int i3 = iM11448d + iM11448d2;
        if (!this.f25807h && this.f25808i == null) {
            this.f25808i = new String(this.f25800a, 30, this.f25804e);
        }
        return i3;
    }

    /* JADX INFO: renamed from: b */
    public final C5070y1 m11446b() {
        int i = this.f25801b;
        int i2 = this.f25805f;
        if (i < i2) {
            return new C5070y1(this.f25808i, this.f25803d, this.f25806g, true, this.f25807h, Arrays.copyOf(this.f25800a, i));
        }
        C5070y1 c5070y1 = new C5070y1(this.f25808i, this.f25803d, this.f25806g, false, this.f25807h, Arrays.copyOf(this.f25800a, i2));
        m11447c();
        return c5070y1;
    }

    /* JADX INFO: renamed from: c */
    public final void m11447c() {
        this.f25801b = 0;
        this.f25804e = -1;
        this.f25802c = -1L;
        this.f25807h = false;
        this.f25805f = 30;
        this.f25803d = -1L;
        this.f25806g = -1;
        this.f25808i = null;
    }

    /* JADX INFO: renamed from: d */
    public final int m11448d(int i, byte[] bArr, int i2, int i3) {
        int i4 = this.f25801b;
        if (i4 >= i) {
            return 0;
        }
        int iMin = Math.min(i3, i - i4);
        System.arraycopy(bArr, i2, this.f25800a, this.f25801b, iMin);
        int i5 = this.f25801b + iMin;
        this.f25801b = i5;
        if (i5 < i) {
            return -1;
        }
        return iMin;
    }
}
