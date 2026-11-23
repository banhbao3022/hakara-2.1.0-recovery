package p007c.p190n.p194b.p266d.p314j.p325k;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: c.n.b.d.j.k.l4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4238l4 extends AbstractC4415y3 {

    /* JADX INFO: renamed from: a */
    public static final Logger f23285a = Logger.getLogger(AbstractC4238l4.class.getName());

    /* JADX INFO: renamed from: b */
    public static final boolean f23286b = C4353t7.f23481g;

    /* JADX INFO: renamed from: c */
    public C4266n4 f23287c;

    /* JADX INFO: renamed from: c.n.b.d.j.k.l4$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
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

    /* JADX INFO: renamed from: c.n.b.d.j.k.l4$b */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
    public static class b extends AbstractC4238l4 {

        /* JADX INFO: renamed from: d */
        public final byte[] f23288d;

        /* JADX INFO: renamed from: e */
        public final int f23289e;

        /* JADX INFO: renamed from: f */
        public int f23290f;

        public b(byte[] bArr, int i) {
            super(null);
            if ((i | 0 | (bArr.length - i)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.f23288d = bArr;
            this.f23290f = 0;
            this.f23289e = i;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: A */
        public final void mo9972A(long j2) throws IOException {
            try {
                byte[] bArr = this.f23288d;
                int i = this.f23290f;
                int i2 = i + 1;
                this.f23290f = i2;
                bArr[i] = (byte) j2;
                int i3 = i2 + 1;
                this.f23290f = i3;
                bArr[i2] = (byte) (j2 >> 8);
                int i4 = i3 + 1;
                this.f23290f = i4;
                bArr[i3] = (byte) (j2 >> 16);
                int i5 = i4 + 1;
                this.f23290f = i5;
                bArr[i4] = (byte) (j2 >> 24);
                int i6 = i5 + 1;
                this.f23290f = i6;
                bArr[i5] = (byte) (j2 >> 32);
                int i7 = i6 + 1;
                this.f23290f = i7;
                bArr[i6] = (byte) (j2 >> 40);
                int i8 = i7 + 1;
                this.f23290f = i8;
                bArr[i7] = (byte) (j2 >> 48);
                this.f23290f = i8 + 1;
                bArr[i8] = (byte) (j2 >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23290f), Integer.valueOf(this.f23289e), 1), e);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: C */
        public final void mo9973C(int i) throws IOException {
            try {
                byte[] bArr = this.f23288d;
                int i2 = this.f23290f;
                int i3 = i2 + 1;
                this.f23290f = i3;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                this.f23290f = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                this.f23290f = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f23290f = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23290f), Integer.valueOf(this.f23289e), 1), e);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: G */
        public final void mo9974G(int i, int i2) throws IOException {
            mo9986r((i << 3) | 5);
            mo9973C(i2);
        }

        /* JADX INFO: renamed from: W */
        public final void m9991W(AbstractC4402x3 abstractC4402x3) throws IOException {
            mo9986r(abstractC4402x3.mo9502f());
            abstractC4402x3.mo9543s(this);
        }

        /* JADX INFO: renamed from: X */
        public final void m9992X(InterfaceC4240l6 interfaceC4240l6) throws IOException {
            mo9986r(interfaceC4240l6.mo9420i());
            interfaceC4240l6.mo9416d(this);
        }

        /* JADX INFO: renamed from: Y */
        public final void m9993Y(String str) throws IOException {
            int i = this.f23290f;
            try {
                int iM9951L = AbstractC4238l4.m9951L(str.length() * 3);
                int iM9951L2 = AbstractC4238l4.m9951L(str.length());
                if (iM9951L2 != iM9951L) {
                    mo9986r(C4367u7.m10278a(str));
                    this.f23290f = C4367u7.f23503a.mo10291b(str, this.f23288d, this.f23290f, mo9975a());
                    return;
                }
                int i2 = i + iM9951L2;
                this.f23290f = i2;
                int iMo10291b = C4367u7.f23503a.mo10291b(str, this.f23288d, i2, mo9975a());
                this.f23290f = i;
                mo9986r((iMo10291b - i) - iM9951L2);
                this.f23290f = iMo10291b;
            } catch (C4419y7 e) {
                this.f23290f = i;
                AbstractC4238l4.f23285a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(C4127d5.f23112a);
                try {
                    mo9986r(bytes.length);
                    m9994Z(bytes, 0, bytes.length);
                } catch (a e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new a(e3);
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new a(e4);
            }
        }

        /* JADX INFO: renamed from: Z */
        public final void m9994Z(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f23288d, this.f23290f, i2);
                this.f23290f += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23290f), Integer.valueOf(this.f23289e), Integer.valueOf(i2)), e);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: a */
        public final int mo9975a() {
            return this.f23289e - this.f23290f;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: d */
        public final void mo9976d(byte b) throws IOException {
            try {
                byte[] bArr = this.f23288d;
                int i = this.f23290f;
                this.f23290f = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23290f), Integer.valueOf(this.f23289e), 1), e);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: e */
        public final void mo9977e(int i) throws IOException {
            if (i >= 0) {
                mo9986r(i);
            } else {
                mo9985m(i);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: f */
        public final void mo9978f(int i, int i2) throws IOException {
            mo9986r((i << 3) | i2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: g */
        public final void mo9979g(int i, long j2) throws IOException {
            mo9986r((i << 3) | 0);
            mo9985m(j2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: h */
        public final void mo9980h(int i, AbstractC4402x3 abstractC4402x3) throws IOException {
            mo9986r((i << 3) | 2);
            m9991W(abstractC4402x3);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: i */
        public final void mo9981i(int i, InterfaceC4240l6 interfaceC4240l6) throws IOException {
            mo9978f(1, 3);
            mo9989y(2, i);
            mo9978f(3, 2);
            m9992X(interfaceC4240l6);
            mo9978f(1, 4);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: j */
        public final void mo9982j(int i, InterfaceC4240l6 interfaceC4240l6, InterfaceC4431z6 interfaceC4431z6) throws IOException {
            mo9986r((i << 3) | 2);
            AbstractC4293p3 abstractC4293p3 = (AbstractC4293p3) interfaceC4240l6;
            int iMo9419h = abstractC4293p3.mo9419h();
            if (iMo9419h == -1) {
                iMo9419h = interfaceC4431z6.mo10056b(abstractC4293p3);
                abstractC4293p3.mo9421j(iMo9419h);
            }
            mo9986r(iMo9419h);
            interfaceC4431z6.mo10057c(interfaceC4240l6, this.f23287c);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: k */
        public final void mo9983k(int i, String str) throws IOException {
            mo9986r((i << 3) | 2);
            m9993Y(str);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: l */
        public final void mo9984l(int i, boolean z) throws IOException {
            mo9986r((i << 3) | 0);
            mo9976d(z ? (byte) 1 : (byte) 0);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: m */
        public final void mo9985m(long j2) throws IOException {
            if (AbstractC4238l4.f23286b && mo9975a() >= 10) {
                while ((j2 & (-128)) != 0) {
                    byte[] bArr = this.f23288d;
                    int i = this.f23290f;
                    this.f23290f = i + 1;
                    C4353t7.m10230i(bArr, i, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr2 = this.f23288d;
                int i2 = this.f23290f;
                this.f23290f = i2 + 1;
                C4353t7.m10230i(bArr2, i2, (byte) j2);
                return;
            }
            while ((j2 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f23288d;
                    int i3 = this.f23290f;
                    this.f23290f = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23290f), Integer.valueOf(this.f23289e), 1), e);
                }
            }
            byte[] bArr4 = this.f23288d;
            int i4 = this.f23290f;
            this.f23290f = i4 + 1;
            bArr4[i4] = (byte) j2;
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: r */
        public final void mo9986r(int i) throws IOException {
            if (!AbstractC4238l4.f23286b || C4363u3.m10264a() || mo9975a() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f23288d;
                        int i2 = this.f23290f;
                        this.f23290f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new a(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f23290f), Integer.valueOf(this.f23289e), 1), e);
                    }
                }
                byte[] bArr2 = this.f23288d;
                int i3 = this.f23290f;
                this.f23290f = i3 + 1;
                bArr2[i3] = (byte) i;
                return;
            }
            if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f23288d;
                int i4 = this.f23290f;
                this.f23290f = i4 + 1;
                C4353t7.m10230i(bArr3, i4, (byte) i);
                return;
            }
            byte[] bArr4 = this.f23288d;
            int i5 = this.f23290f;
            this.f23290f = i5 + 1;
            C4353t7.m10230i(bArr4, i5, (byte) (i | 128));
            int i6 = i >>> 7;
            if ((i6 & (-128)) == 0) {
                byte[] bArr5 = this.f23288d;
                int i7 = this.f23290f;
                this.f23290f = i7 + 1;
                C4353t7.m10230i(bArr5, i7, (byte) i6);
                return;
            }
            byte[] bArr6 = this.f23288d;
            int i8 = this.f23290f;
            this.f23290f = i8 + 1;
            C4353t7.m10230i(bArr6, i8, (byte) (i6 | 128));
            int i9 = i6 >>> 7;
            if ((i9 & (-128)) == 0) {
                byte[] bArr7 = this.f23288d;
                int i10 = this.f23290f;
                this.f23290f = i10 + 1;
                C4353t7.m10230i(bArr7, i10, (byte) i9);
                return;
            }
            byte[] bArr8 = this.f23288d;
            int i11 = this.f23290f;
            this.f23290f = i11 + 1;
            C4353t7.m10230i(bArr8, i11, (byte) (i9 | 128));
            int i12 = i9 >>> 7;
            if ((i12 & (-128)) == 0) {
                byte[] bArr9 = this.f23288d;
                int i13 = this.f23290f;
                this.f23290f = i13 + 1;
                C4353t7.m10230i(bArr9, i13, (byte) i12);
                return;
            }
            byte[] bArr10 = this.f23288d;
            int i14 = this.f23290f;
            this.f23290f = i14 + 1;
            C4353t7.m10230i(bArr10, i14, (byte) (i12 | 128));
            byte[] bArr11 = this.f23288d;
            int i15 = this.f23290f;
            this.f23290f = i15 + 1;
            C4353t7.m10230i(bArr11, i15, (byte) (i12 >>> 7));
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: s */
        public final void mo9987s(int i, int i2) throws IOException {
            mo9986r((i << 3) | 0);
            if (i2 >= 0) {
                mo9986r(i2);
            } else {
                mo9985m(i2);
            }
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: t */
        public final void mo9988t(int i, AbstractC4402x3 abstractC4402x3) throws IOException {
            mo9978f(1, 3);
            mo9989y(2, i);
            mo9980h(3, abstractC4402x3);
            mo9978f(1, 4);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: y */
        public final void mo9989y(int i, int i2) throws IOException {
            mo9986r((i << 3) | 0);
            mo9986r(i2);
        }

        @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4238l4
        /* JADX INFO: renamed from: z */
        public final void mo9990z(int i, long j2) throws IOException {
            mo9986r((i << 3) | 1);
            mo9972A(j2);
        }
    }

    public AbstractC4238l4() {
    }

    /* JADX INFO: renamed from: B */
    public static int m9943B(int i, long j2) {
        return m9946F(j2) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: D */
    public static int m9944D(int i) {
        return m9951L(i << 3);
    }

    /* JADX INFO: renamed from: E */
    public static int m9945E(int i, long j2) {
        return m9946F(j2) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: F */
    public static int m9946F(long j2) {
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

    /* JADX INFO: renamed from: H */
    public static int m9947H(int i) {
        if (i >= 0) {
            return m9951L(i);
        }
        return 10;
    }

    /* JADX INFO: renamed from: I */
    public static int m9948I(int i, int i2) {
        return m9947H(i2) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: J */
    public static int m9949J(int i, long j2) {
        return m9946F(m9957R(j2)) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: K */
    public static int m9950K(long j2) {
        return m9946F(m9957R(j2));
    }

    /* JADX INFO: renamed from: L */
    public static int m9951L(int i) {
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

    /* JADX INFO: renamed from: M */
    public static int m9952M(int i, int i2) {
        return m9951L(i2) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: N */
    public static int m9953N(int i) {
        return m9951L(i << 3) + 8;
    }

    /* JADX INFO: renamed from: O */
    public static int m9954O(int i) {
        return m9951L(m9961V(i));
    }

    /* JADX INFO: renamed from: P */
    public static int m9955P(int i, int i2) {
        return m9951L(m9961V(i2)) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: Q */
    public static int m9956Q(int i) {
        return m9951L(i << 3) + 8;
    }

    /* JADX INFO: renamed from: R */
    public static long m9957R(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    /* JADX INFO: renamed from: S */
    public static int m9958S(int i) {
        return m9951L(i << 3) + 4;
    }

    /* JADX INFO: renamed from: T */
    public static int m9959T(int i) {
        return m9951L(i << 3) + 4;
    }

    /* JADX INFO: renamed from: U */
    public static int m9960U(int i, int i2) {
        return m9947H(i2) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: V */
    public static int m9961V(int i) {
        return (i >> 31) ^ (i << 1);
    }

    /* JADX INFO: renamed from: b */
    public static int m9962b(C4309q5 c4309q5) {
        int iM10168a = c4309q5.m10168a();
        return m9951L(iM10168a) + iM10168a;
    }

    /* JADX INFO: renamed from: c */
    public static int m9963c(InterfaceC4240l6 interfaceC4240l6, InterfaceC4431z6 interfaceC4431z6) {
        AbstractC4293p3 abstractC4293p3 = (AbstractC4293p3) interfaceC4240l6;
        int iMo9419h = abstractC4293p3.mo9419h();
        if (iMo9419h == -1) {
            iMo9419h = interfaceC4431z6.mo10056b(abstractC4293p3);
            abstractC4293p3.mo9421j(iMo9419h);
        }
        return m9951L(iMo9419h) + iMo9419h;
    }

    /* JADX INFO: renamed from: n */
    public static int m9964n(int i) {
        return m9951L(i << 3) + 4;
    }

    /* JADX INFO: renamed from: o */
    public static int m9965o(int i, String str) {
        return m9967q(str) + m9951L(i << 3);
    }

    /* JADX INFO: renamed from: p */
    public static int m9966p(AbstractC4402x3 abstractC4402x3) {
        int iMo9502f = abstractC4402x3.mo9502f();
        return m9951L(iMo9502f) + iMo9502f;
    }

    /* JADX INFO: renamed from: q */
    public static int m9967q(String str) {
        int length;
        try {
            length = C4367u7.m10278a(str);
        } catch (C4419y7 unused) {
            length = str.getBytes(C4127d5.f23112a).length;
        }
        return m9951L(length) + length;
    }

    /* JADX INFO: renamed from: u */
    public static int m9968u(int i) {
        return m9951L(i << 3) + 8;
    }

    /* JADX INFO: renamed from: v */
    public static int m9969v(int i) {
        return m9951L(i << 3) + 1;
    }

    /* JADX INFO: renamed from: w */
    public static int m9970w(int i, AbstractC4402x3 abstractC4402x3) {
        int iM9951L = m9951L(i << 3);
        int iMo9502f = abstractC4402x3.mo9502f();
        return m9951L(iMo9502f) + iMo9502f + iM9951L;
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static int m9971x(int i, InterfaceC4240l6 interfaceC4240l6, InterfaceC4431z6 interfaceC4431z6) {
        int iM9951L = m9951L(i << 3) << 1;
        AbstractC4293p3 abstractC4293p3 = (AbstractC4293p3) interfaceC4240l6;
        int iMo9419h = abstractC4293p3.mo9419h();
        if (iMo9419h == -1) {
            iMo9419h = interfaceC4431z6.mo10056b(abstractC4293p3);
            abstractC4293p3.mo9421j(iMo9419h);
        }
        return iM9951L + iMo9419h;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo9972A(long j2) throws IOException;

    /* JADX INFO: renamed from: C */
    public abstract void mo9973C(int i) throws IOException;

    /* JADX INFO: renamed from: G */
    public abstract void mo9974G(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract int mo9975a();

    /* JADX INFO: renamed from: d */
    public abstract void mo9976d(byte b2) throws IOException;

    /* JADX INFO: renamed from: e */
    public abstract void mo9977e(int i) throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract void mo9978f(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: g */
    public abstract void mo9979g(int i, long j2) throws IOException;

    /* JADX INFO: renamed from: h */
    public abstract void mo9980h(int i, AbstractC4402x3 abstractC4402x3) throws IOException;

    /* JADX INFO: renamed from: i */
    public abstract void mo9981i(int i, InterfaceC4240l6 interfaceC4240l6) throws IOException;

    /* JADX INFO: renamed from: j */
    public abstract void mo9982j(int i, InterfaceC4240l6 interfaceC4240l6, InterfaceC4431z6 interfaceC4431z6) throws IOException;

    /* JADX INFO: renamed from: k */
    public abstract void mo9983k(int i, String str) throws IOException;

    /* JADX INFO: renamed from: l */
    public abstract void mo9984l(int i, boolean z) throws IOException;

    /* JADX INFO: renamed from: m */
    public abstract void mo9985m(long j2) throws IOException;

    /* JADX INFO: renamed from: r */
    public abstract void mo9986r(int i) throws IOException;

    /* JADX INFO: renamed from: s */
    public abstract void mo9987s(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: t */
    public abstract void mo9988t(int i, AbstractC4402x3 abstractC4402x3) throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract void mo9989y(int i, int i2) throws IOException;

    /* JADX INFO: renamed from: z */
    public abstract void mo9990z(int i, long j2) throws IOException;

    public AbstractC4238l4(C4224k4 c4224k4) {
    }
}
