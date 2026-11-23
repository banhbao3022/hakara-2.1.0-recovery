package p007c.p190n.p194b.p367f.p368a.p370b;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.f.a.b.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4987c0 extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public final C5004g1 f25709f;

    /* JADX INFO: renamed from: g */
    public byte[] f25710g;

    /* JADX INFO: renamed from: h */
    public long f25711h;

    /* JADX INFO: renamed from: i */
    public boolean f25712i;

    /* JADX INFO: renamed from: j */
    public boolean f25713j;

    public C4987c0(InputStream inputStream) {
        super(inputStream);
        this.f25709f = new C5004g1();
        this.f25710g = new byte[4096];
        this.f25712i = false;
        this.f25713j = false;
    }

    /* JADX INFO: renamed from: a */
    public final C5070y1 m11427a() throws IOException {
        byte[] bArr;
        if (this.f25711h > 0) {
            do {
                bArr = this.f25710g;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f25712i || this.f25713j) {
            return new C5070y1(null, -1L, -1, false, false, null);
        }
        if (!m11428c(30)) {
            this.f25712i = true;
            return this.f25709f.m11446b();
        }
        C5070y1 c5070y1M11446b = this.f25709f.m11446b();
        if (c5070y1M11446b.f26025e) {
            this.f25713j = true;
            return c5070y1M11446b;
        }
        if (c5070y1M11446b.f26022b == 4294967295L) {
            throw new C5011i0("Files bigger than 4GiB are not supported.");
        }
        int i = this.f25709f.f25805f - 30;
        long j2 = i;
        int length = this.f25710g.length;
        if (j2 > length) {
            do {
                length += length;
            } while (length < j2);
            this.f25710g = Arrays.copyOf(this.f25710g, length);
        }
        if (!m11428c(i)) {
            this.f25712i = true;
            return this.f25709f.m11446b();
        }
        C5070y1 c5070y1M11446b2 = this.f25709f.m11446b();
        this.f25711h = c5070y1M11446b2.f26022b;
        return c5070y1M11446b2;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11428c(int i) throws IOException {
        int iM11429f = m11429f(this.f25710g, 0, i);
        if (iM11429f != i) {
            int i2 = i - iM11429f;
            if (m11429f(this.f25710g, iM11429f, i2) != i2) {
                this.f25709f.m11445a(this.f25710g, 0, iM11429f);
                return false;
            }
        }
        this.f25709f.m11445a(this.f25710g, 0, i);
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m11429f(byte[] bArr, int i, int i2) throws IOException {
        return Math.max(0, super.read(bArr, i, i2));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j2 = this.f25711h;
        if (j2 <= 0 || this.f25712i) {
            return -1;
        }
        int iMax = Math.max(0, super.read(bArr, i, (int) Math.min(j2, i2)));
        this.f25711h -= (long) iMax;
        if (iMax != 0) {
            return iMax;
        }
        this.f25712i = true;
        return 0;
    }
}
