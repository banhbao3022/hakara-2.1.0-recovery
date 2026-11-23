package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.util.logging.Level;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class m72 extends o72 {

    /* JADX INFO: renamed from: d */
    public final byte[] f16695d;

    /* JADX INFO: renamed from: e */
    public final int f16696e;

    /* JADX INFO: renamed from: f */
    public int f16697f;

    public m72(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.f16695d = bArr;
        this.f16697f = 0;
        this.f16696e = i2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: d */
    public final void mo7661d(int i, int i2) throws IOException {
        mo7672o((i << 3) | i2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: e */
    public final void mo7662e(int i, int i2) throws IOException {
        mo7672o(i << 3);
        if (i2 >= 0) {
            mo7672o(i2);
        } else {
            mo7674q(i2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: f */
    public final void mo7663f(int i, int i2) throws IOException {
        mo7672o(i << 3);
        mo7672o(i2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: g */
    public final void mo7664g(int i, int i2) throws IOException {
        mo7672o((i << 3) | 5);
        mo7673p(i2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: h */
    public final void mo7665h(int i, long j2) throws IOException {
        mo7672o(i << 3);
        mo7674q(j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: i */
    public final void mo7666i(int i, long j2) throws IOException {
        mo7672o((i << 3) | 1);
        mo7675r(j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: j */
    public final void mo7667j(int i, boolean z) throws IOException {
        mo7672o(i << 3);
        mo7670m(z ? (byte) 1 : (byte) 0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: k */
    public final void mo7668k(int i, String str) throws IOException {
        mo7672o((i << 3) | 2);
        int i2 = this.f16697f;
        try {
            int iM7971u = o72.m7971u(str.length() * 3);
            int iM7971u2 = o72.m7971u(str.length());
            if (iM7971u2 == iM7971u) {
                int i3 = i2 + iM7971u2;
                this.f16697f = i3;
                int iM6159c = cb2.m6159c(str, this.f16695d, i3, this.f16696e - i3);
                this.f16697f = i2;
                mo7672o((iM6159c - i2) - iM7971u2);
                this.f16697f = iM6159c;
            } else {
                mo7672o(cb2.m6158b(str));
                byte[] bArr = this.f16695d;
                int i4 = this.f16697f;
                this.f16697f = cb2.m6159c(str, bArr, i4, this.f16696e - i4);
            }
        } catch (bb2 e) {
            this.f16697f = i2;
            o72.f17551a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(p82.f17879a);
            try {
                int length = bytes.length;
                mo7672o(length);
                m7677y(bytes, 0, length);
            } catch (n72 e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new n72(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new n72(e4);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: l */
    public final void mo7669l(int i, g72 g72Var) throws IOException {
        mo7672o((i << 3) | 2);
        mo7672o(g72Var.mo5719m());
        g72Var.mo5724x(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: m */
    public final void mo7670m(byte b) throws IOException {
        try {
            byte[] bArr = this.f16695d;
            int i = this.f16697f;
            this.f16697f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new n72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16697f), Integer.valueOf(this.f16696e), 1), e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: n */
    public final void mo7671n(int i) throws IOException {
        if (i >= 0) {
            mo7672o(i);
        } else {
            mo7674q(i);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: o */
    public final void mo7672o(int i) throws IOException {
        if (o72.f17552b) {
            int i2 = v62.f20704a;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.f16695d;
                int i3 = this.f16697f;
                this.f16697f = i3 + 1;
                bArr[i3] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new n72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16697f), Integer.valueOf(this.f16696e), 1), e);
            }
        }
        byte[] bArr2 = this.f16695d;
        int i4 = this.f16697f;
        this.f16697f = i4 + 1;
        bArr2[i4] = (byte) i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: p */
    public final void mo7673p(int i) throws IOException {
        try {
            byte[] bArr = this.f16695d;
            int i2 = this.f16697f;
            int i3 = i2 + 1;
            this.f16697f = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            this.f16697f = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            this.f16697f = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f16697f = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new n72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16697f), Integer.valueOf(this.f16696e), 1), e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: q */
    public final void mo7674q(long j2) throws IOException {
        if (o72.f17552b && this.f16696e - this.f16697f >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.f16695d;
                int i = this.f16697f;
                this.f16697f = i + 1;
                za2.f22222e.mo8616a(bArr, za2.f22225h + ((long) i), (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.f16695d;
            int i2 = this.f16697f;
            this.f16697f = i2 + 1;
            za2.f22222e.mo8616a(bArr2, za2.f22225h + ((long) i2), (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f16695d;
                int i3 = this.f16697f;
                this.f16697f = i3 + 1;
                bArr3[i3] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new n72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16697f), Integer.valueOf(this.f16696e), 1), e);
            }
        }
        byte[] bArr4 = this.f16695d;
        int i4 = this.f16697f;
        this.f16697f = i4 + 1;
        bArr4[i4] = (byte) j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o72
    /* JADX INFO: renamed from: r */
    public final void mo7675r(long j2) throws IOException {
        try {
            byte[] bArr = this.f16695d;
            int i = this.f16697f;
            int i2 = i + 1;
            this.f16697f = i2;
            bArr[i] = (byte) (((int) j2) & 255);
            int i3 = i2 + 1;
            this.f16697f = i3;
            bArr[i2] = (byte) (((int) (j2 >> 8)) & 255);
            int i4 = i3 + 1;
            this.f16697f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 16)) & 255);
            int i5 = i4 + 1;
            this.f16697f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 24)) & 255);
            int i6 = i5 + 1;
            this.f16697f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 32)) & 255);
            int i7 = i6 + 1;
            this.f16697f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 40)) & 255);
            int i8 = i7 + 1;
            this.f16697f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 48)) & 255);
            this.f16697f = i8 + 1;
            bArr[i8] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new n72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16697f), Integer.valueOf(this.f16696e), 1), e);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m7676x(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.f16695d, this.f16697f, i2);
            this.f16697f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new n72(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f16697f), Integer.valueOf(this.f16696e), Integer.valueOf(i2)), e);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7677y(byte[] bArr, int i, int i2) throws IOException {
        m7676x(bArr, 0, i2);
    }

    /* JADX INFO: renamed from: z */
    public final int m7678z() {
        return this.f16696e - this.f16697f;
    }
}
