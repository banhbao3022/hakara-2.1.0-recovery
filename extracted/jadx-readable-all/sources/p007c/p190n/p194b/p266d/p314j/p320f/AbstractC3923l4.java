package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: c.n.b.d.j.f.l4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3923l4 extends AbstractC3833c4 {

    /* JADX INFO: renamed from: a */
    public static final Logger f22763a = Logger.getLogger(AbstractC3923l4.class.getName());

    /* JADX INFO: renamed from: b */
    public static final boolean f22764b = C4015u7.f22899h;

    /* JADX INFO: renamed from: c */
    public C3943n4 f22765c;

    /* JADX INFO: renamed from: c.n.b.d.j.f.l4$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class a extends IOException {
        public a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(String str, Throwable th) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(strValueOf) : new String("CodedOutputStream was writing to a flat byte array and ran out of space.: "), th);
        }
    }

    /* JADX INFO: renamed from: c.n.b.d.j.f.l4$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
    public static class b extends AbstractC3923l4 {

        /* JADX INFO: renamed from: d */
        public final byte[] f22766d;

        /* JADX INFO: renamed from: e */
        public final int f22767e;

        /* JADX INFO: renamed from: f */
        public int f22768f;

        public b(byte[] bArr, int i) {
            super(null);
            int i2 = i + 0;
            if ((i | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f22766d = bArr;
            this.f22768f = 0;
            this.f22767e = i2;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: B */
        public final void mo9086B(int i, int i2) throws IOException {
            mo9098g((i << 3) | i2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: D */
        public final void mo9087D(int i, int i2) throws IOException {
            mo9098g((i << 3) | 0);
            if (i2 >= 0) {
                mo9098g(i2);
            } else {
                mo9091O(i2);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: F */
        public final void mo9088F(int i, int i2) throws IOException {
            mo9098g((i << 3) | 0);
            mo9098g(i2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: I */
        public final void mo9089I(int i, int i2) throws IOException {
            mo9098g((i << 3) | 5);
            mo9099h(i2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: K */
        public final int mo9090K() {
            return this.f22767e - this.f22768f;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: O */
        public final void mo9091O(long j2) throws IOException {
            if (AbstractC3923l4.f22764b && mo9090K() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f22766d;
                    int i = this.f22768f;
                    this.f22768f = i + 1;
                    C4015u7.m9239e(bArr, i, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f22766d;
                int i2 = this.f22768f;
                this.f22768f = i2 + 1;
                C4015u7.m9239e(bArr2, i2, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f22766d;
                    int i3 = this.f22768f;
                    this.f22768f = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22768f), Integer.valueOf(this.f22767e), 1), e);
                }
            }
            byte[] bArr4 = this.f22766d;
            int i4 = this.f22768f;
            this.f22768f = i4 + 1;
            bArr4[i4] = (byte) j2;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: R */
        public final void mo9092R(long j2) throws IOException {
            try {
                byte[] bArr = this.f22766d;
                int i = this.f22768f;
                int i2 = i + 1;
                this.f22768f = i2;
                bArr[i] = (byte) j2;
                int i3 = i2 + 1;
                this.f22768f = i3;
                bArr[i2] = (byte) (j2 >> 8);
                int i4 = i3 + 1;
                this.f22768f = i4;
                bArr[i3] = (byte) (j2 >> 16);
                int i5 = i4 + 1;
                this.f22768f = i5;
                bArr[i4] = (byte) (j2 >> 24);
                int i6 = i5 + 1;
                this.f22768f = i6;
                bArr[i5] = (byte) (j2 >> 32);
                int i7 = i6 + 1;
                this.f22768f = i7;
                bArr[i6] = (byte) (j2 >> 40);
                int i8 = i7 + 1;
                this.f22768f = i8;
                bArr[i7] = (byte) (j2 >> 48);
                this.f22768f = i8 + 1;
                bArr[i8] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22768f), Integer.valueOf(this.f22767e), 1), e);
            }
        }

        /* JADX INFO: renamed from: V */
        public final void m9105V(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f22766d, this.f22768f, i2);
                this.f22768f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22768f), Integer.valueOf(this.f22767e), Integer.valueOf(i2)), e);
            }
        }

        /* JADX INFO: renamed from: W */
        public final void m9106W(AbstractC3823b4 abstractC3823b4) throws IOException {
            mo9098g(abstractC3823b4.size());
            abstractC3823b4.mo8947f(this);
        }

        /* JADX INFO: renamed from: X */
        public final void m9107X(String str) throws IOException {
            int i = this.f22768f;
            try {
                int iM9075k = AbstractC3923l4.m9075k(str.length() * 3);
                int iM9075k2 = AbstractC3923l4.m9075k(str.length());
                if (iM9075k2 != iM9075k) {
                    mo9098g(C4033w7.m9295a(str));
                    this.f22768f = C4033w7.f22982a.mo8942a(str, this.f22766d, this.f22768f, mo9090K());
                    return;
                }
                int i2 = i + iM9075k2;
                this.f22768f = i2;
                int iMo8942a = C4033w7.f22982a.mo8942a(str, this.f22766d, i2, mo9090K());
                this.f22768f = i;
                mo9098g((iMo8942a - i) - iM9075k2);
                this.f22768f = iMo8942a;
            } catch (C4042x7 e) {
                this.f22768f = i;
                AbstractC3923l4.f22763a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(C3814a5.f22506a);
                try {
                    mo9098g(bytes.length);
                    m9105V(bytes, 0, bytes.length);
                } catch (a e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new a(e3);
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new a(e4);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: b */
        public final void mo9093b(int i, long j2) throws IOException {
            mo9098g((i << 3) | 0);
            mo9091O(j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: c */
        public final void mo9094c(int i, AbstractC3823b4 abstractC3823b4) throws IOException {
            mo9098g((i << 3) | 2);
            m9106W(abstractC3823b4);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: d */
        public final void mo9095d(int i, InterfaceC3895i6 interfaceC3895i6) throws IOException {
            mo9086B(1, 3);
            mo9088F(2, i);
            mo9086B(3, 2);
            mo9098g(interfaceC3895i6.mo9043e());
            interfaceC3895i6.mo9044g(this);
            mo9086B(1, 4);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: e */
        public final void mo9096e(int i, InterfaceC3895i6 interfaceC3895i6, InterfaceC4059z6 interfaceC4059z6) throws IOException {
            mo9098g((i << 3) | 2);
            AbstractC4029w3 abstractC4029w3 = (AbstractC4029w3) interfaceC3895i6;
            int iMo9288f = abstractC4029w3.mo9288f();
            if (iMo9288f == -1) {
                iMo9288f = interfaceC4059z6.mo9123b(abstractC4029w3);
                abstractC4029w3.mo9287c(iMo9288f);
            }
            mo9098g(iMo9288f);
            interfaceC4059z6.mo9125d(interfaceC3895i6, this.f22765c);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: f */
        public final void mo9097f(int i) throws IOException {
            if (i >= 0) {
                mo9098g(i);
            } else {
                mo9091O(i);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: g */
        public final void mo9098g(int i) throws IOException {
            if (!AbstractC3923l4.f22764b || C4056z3.m9317a() || mo9090K() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f22766d;
                        int i2 = this.f22768f;
                        this.f22768f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22768f), Integer.valueOf(this.f22767e), 1), e);
                    }
                }
                byte[] bArr2 = this.f22766d;
                int i3 = this.f22768f;
                this.f22768f = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f22766d;
                int i4 = this.f22768f;
                this.f22768f = i4 + 1;
                C4015u7.m9239e(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.f22766d;
            int i5 = this.f22768f;
            this.f22768f = i5 + 1;
            C4015u7.m9239e(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.f22766d;
                int i7 = this.f22768f;
                this.f22768f = i7 + 1;
                C4015u7.m9239e(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.f22766d;
            int i8 = this.f22768f;
            this.f22768f = i8 + 1;
            C4015u7.m9239e(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.f22766d;
                int i10 = this.f22768f;
                this.f22768f = i10 + 1;
                C4015u7.m9239e(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.f22766d;
            int i11 = this.f22768f;
            this.f22768f = i11 + 1;
            C4015u7.m9239e(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.f22766d;
                int i13 = this.f22768f;
                this.f22768f = i13 + 1;
                C4015u7.m9239e(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.f22766d;
            int i14 = this.f22768f;
            this.f22768f = i14 + 1;
            C4015u7.m9239e(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.f22766d;
            int i15 = this.f22768f;
            this.f22768f = i15 + 1;
            C4015u7.m9239e(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: h */
        public final void mo9099h(int i) throws IOException {
            try {
                byte[] bArr = this.f22766d;
                int i2 = this.f22768f;
                int i3 = i2 + 1;
                this.f22768f = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.f22768f = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.f22768f = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f22768f = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22768f), Integer.valueOf(this.f22767e), 1), e);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: q */
        public final void mo9100q(int i, AbstractC3823b4 abstractC3823b4) throws IOException {
            mo9086B(1, 3);
            mo9088F(2, i);
            mo9094c(3, abstractC3823b4);
            mo9086B(1, 4);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: r */
        public final void mo9101r(int i, String str) throws IOException {
            mo9098g((i << 3) | 2);
            m9107X(str);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: s */
        public final void mo9102s(int i, boolean z) throws IOException {
            mo9098g((i << 3) | 0);
            mo9103y(z ? (byte) 1 : (byte) 0);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: y */
        public final void mo9103y(byte b) throws IOException {
            try {
                byte[] bArr = this.f22766d;
                int i = this.f22768f;
                this.f22768f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f22768f), Integer.valueOf(this.f22767e), 1), e);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3923l4
        /* JADX INFO: renamed from: z */
        public final void mo9104z(int i, long j2) throws IOException {
            mo9098g((i << 3) | 1);
            mo9092R(j2);
        }
    }

    public AbstractC3923l4() {
    }

    /* JADX INFO: renamed from: A */
    public static int m9058A(int i, long j2) {
        return m9069S(j2) + m9073i(i);
    }

    /* JADX INFO: renamed from: C */
    public static int m9059C(int i, long j2) {
        return m9069S(j2) + m9073i(i);
    }

    /* JADX INFO: renamed from: E */
    public static int m9060E(int i, long j2) {
        return m9069S(m9071U(j2)) + m9073i(i);
    }

    /* JADX INFO: renamed from: G */
    public static int m9061G(int i) {
        return m9073i(i) + 8;
    }

    /* JADX INFO: renamed from: H */
    public static int m9062H(int i) {
        return m9073i(i) + 8;
    }

    /* JADX INFO: renamed from: J */
    public static int m9063J(int i, int i2) {
        return m9074j(i2) + m9073i(i);
    }

    /* JADX INFO: renamed from: L */
    public static int m9064L(int i, int i2) {
        return m9075k(i2) + m9073i(i);
    }

    /* JADX INFO: renamed from: M */
    public static int m9065M(int i, int i2) {
        return m9075k(m9078n(i2)) + m9073i(i);
    }

    /* JADX INFO: renamed from: N */
    public static int m9066N(int i) {
        return m9073i(i) + 4;
    }

    /* JADX INFO: renamed from: P */
    public static int m9067P(int i) {
        return m9073i(i) + 4;
    }

    /* JADX INFO: renamed from: Q */
    public static int m9068Q(int i, int i2) {
        return m9074j(i2) + m9073i(i);
    }

    /* JADX INFO: renamed from: S */
    public static int m9069S(long j2) {
        int i;
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if (((-34359738368L) & j2) != 0) {
            i = 6;
            j2 >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j2) != 0) {
            i += 2;
            j2 >>>= 14;
        }
        return (j2 & (-16384)) != 0 ? i + 1 : i;
    }

    /* JADX INFO: renamed from: T */
    public static int m9070T(long j2) {
        return m9069S(m9071U(j2));
    }

    /* JADX INFO: renamed from: U */
    public static long m9071U(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    /* JADX INFO: renamed from: a */
    public static int m9072a(InterfaceC3895i6 interfaceC3895i6, InterfaceC4059z6 interfaceC4059z6) {
        AbstractC4029w3 abstractC4029w3 = (AbstractC4029w3) interfaceC3895i6;
        int iMo9288f = abstractC4029w3.mo9288f();
        if (iMo9288f == -1) {
            iMo9288f = interfaceC4059z6.mo9123b(abstractC4029w3);
            abstractC4029w3.mo9287c(iMo9288f);
        }
        return m9075k(iMo9288f) + iMo9288f;
    }

    /* JADX INFO: renamed from: i */
    public static int m9073i(int i) {
        return m9075k(i << 3);
    }

    /* JADX INFO: renamed from: j */
    public static int m9074j(int i) {
        if (i >= 0) {
            return m9075k(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: k */
    public static int m9075k(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: l */
    public static int m9076l(int i) {
        return m9075k(m9078n(i));
    }

    /* JADX INFO: renamed from: m */
    public static int m9077m(String str) {
        int length;
        try {
            length = C4033w7.m9295a(str);
        } catch (C4042x7 unused) {
            length = str.getBytes(C3814a5.f22506a).length;
        }
        return m9075k(length) + length;
    }

    /* JADX INFO: renamed from: n */
    public static int m9078n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: o */
    public static int m9079o(int i) {
        return m9073i(i) + 4;
    }

    /* JADX INFO: renamed from: p */
    public static int m9080p(AbstractC3823b4 abstractC3823b4) {
        int size = abstractC3823b4.size();
        return m9075k(size) + size;
    }

    /* JADX INFO: renamed from: t */
    public static int m9081t(int i) {
        return m9073i(i) + 8;
    }

    /* JADX INFO: renamed from: u */
    public static int m9082u(int i) {
        return m9073i(i) + 1;
    }

    /* JADX INFO: renamed from: v */
    public static int m9083v(int i, AbstractC3823b4 abstractC3823b4) {
        int iM9073i = m9073i(i);
        int size = abstractC3823b4.size();
        return m9075k(size) + size + iM9073i;
    }

    @Deprecated
    /* JADX INFO: renamed from: w */
    public static int m9084w(int i, InterfaceC3895i6 interfaceC3895i6, InterfaceC4059z6 interfaceC4059z6) {
        int iM9073i = m9073i(i) << 1;
        AbstractC4029w3 abstractC4029w3 = (AbstractC4029w3) interfaceC3895i6;
        int iMo9288f = abstractC4029w3.mo9288f();
        if (iMo9288f == -1) {
            iMo9288f = interfaceC4059z6.mo9123b(abstractC4029w3);
            abstractC4029w3.mo9287c(iMo9288f);
        }
        return iM9073i + iMo9288f;
    }

    /* JADX INFO: renamed from: x */
    public static int m9085x(int i, String str) {
        return m9077m(str) + m9073i(i);
    }

    /* JADX INFO: renamed from: B */
    public abstract void mo9086B(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: D */
    public abstract void mo9087D(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: F */
    public abstract void mo9088F(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: I */
    public abstract void mo9089I(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: K */
    public abstract int mo9090K();

    /* JADX INFO: renamed from: O */
    public abstract void mo9091O(long j2) throws IOException;

    /* JADX INFO: renamed from: R */
    public abstract void mo9092R(long j2) throws IOException;

    /* JADX INFO: renamed from: b */
    public abstract void mo9093b(int i, long j2) throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract void mo9094c(int i, AbstractC3823b4 abstractC3823b4) throws IOException;

    /* JADX INFO: renamed from: d */
    public abstract void mo9095d(int i, InterfaceC3895i6 interfaceC3895i6) throws IOException;

    /* JADX INFO: renamed from: e */
    public abstract void mo9096e(int i, InterfaceC3895i6 interfaceC3895i6, InterfaceC4059z6 interfaceC4059z6) throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract void mo9097f(int i) throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract void mo9098g(int i) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo9099h(int i) throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo9100q(int i, AbstractC3823b4 abstractC3823b4) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo9101r(int i, String str) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo9102s(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract void mo9103y(byte b2) throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract void mo9104z(int i, long j2) throws IOException;

    public AbstractC3923l4(C3913k4 c3913k4) {
    }
}
