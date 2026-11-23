package p524h1;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p477d1.p483s._ArraysJvm;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: h1.w, reason: use source file name */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SegmentedByteString extends ByteString3 {

    /* JADX INFO: renamed from: k */
    public final transient byte[][] f30753k;

    /* JADX INFO: renamed from: l */
    public final transient int[] f30754l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedByteString(byte[][] bArr, int[] iArr) {
        super(ByteString3.f30711f.f30715j);
        Intrinsics2.m13090f(bArr, "segments");
        Intrinsics2.m13090f(iArr, "directory");
        this.f30753k = bArr;
        this.f30754l = iArr;
    }

    private final Object writeReplace() {
        return m13793z();
    }

    @Override // p524h1.ByteString3
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString3) {
            ByteString3 byteString3 = (ByteString3) obj;
            if (byteString3.mo13765j() == mo13765j() && mo13769s(0, byteString3, 0, mo13765j())) {
                return true;
            }
        }
        return false;
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: f */
    public String mo13763f() {
        return m13793z().mo13763f();
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: h */
    public ByteString3 mo13764h(String str) throws NoSuchAlgorithmException {
        Intrinsics2.m13090f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = this.f30753k.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f30754l;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(this.f30753k[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics2.m13086b(bArrDigest, "digest.digest()");
        return new ByteString3(bArrDigest);
    }

    @Override // p524h1.ByteString3
    public int hashCode() {
        int i = this.f30713h;
        if (i != 0) {
            return i;
        }
        int length = this.f30753k.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f30754l;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr = this.f30753k[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f30713h = i3;
        return i3;
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: j */
    public int mo13765j() {
        return this.f30754l[this.f30753k.length - 1];
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: l */
    public String mo13766l() {
        return m13793z().mo13766l();
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: m */
    public byte[] mo13767m() {
        return m13792y();
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: q */
    public byte mo13768q(int i) {
        SkuDao.a.m14085f(this.f30754l[this.f30753k.length - 1], i, 1L);
        int iM14062N = SkuDao.a.m14062N(this, i);
        int i2 = iM14062N == 0 ? 0 : this.f30754l[iM14062N - 1];
        int[] iArr = this.f30754l;
        byte[][] bArr = this.f30753k;
        return bArr[iM14062N][(i - i2) + iArr[bArr.length + iM14062N]];
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: s */
    public boolean mo13769s(int i, ByteString3 byteString3, int i2, int i3) {
        Intrinsics2.m13090f(byteString3, "other");
        if (i < 0 || i > mo13765j() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM14062N = SkuDao.a.m14062N(this, i);
        while (i < i4) {
            int i5 = iM14062N == 0 ? 0 : this.f30754l[iM14062N - 1];
            int[] iArr = this.f30754l;
            int i6 = iArr[iM14062N] - i5;
            int i7 = iArr[this.f30753k.length + iM14062N];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!byteString3.mo13770u(i2, this.f30753k[iM14062N], (i - i5) + i7, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM14062N++;
        }
        return true;
    }

    @Override // p524h1.ByteString3
    public String toString() {
        return m13793z().toString();
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: u */
    public boolean mo13770u(int i, byte[] bArr, int i2, int i3) {
        Intrinsics2.m13090f(bArr, "other");
        if (i < 0 || i > mo13765j() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int iM14062N = SkuDao.a.m14062N(this, i);
        while (i < i4) {
            int i5 = iM14062N == 0 ? 0 : this.f30754l[iM14062N - 1];
            int[] iArr = this.f30754l;
            int i6 = iArr[iM14062N] - i5;
            int i7 = iArr[this.f30753k.length + iM14062N];
            int iMin = Math.min(i4, i6 + i5) - i;
            if (!SkuDao.a.m14079c(this.f30753k[iM14062N], (i - i5) + i7, bArr, i2, iMin)) {
                return false;
            }
            i2 += iMin;
            i += iMin;
            iM14062N++;
        }
        return true;
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: v */
    public ByteString3 mo13771v() {
        return m13793z().mo13771v();
    }

    @Override // p524h1.ByteString3
    /* JADX INFO: renamed from: x */
    public void mo13773x(Buffer3 buffer3, int i, int i2) {
        Intrinsics2.m13090f(buffer3, "buffer");
        int i3 = i2 + i;
        int iM14062N = SkuDao.a.m14062N(this, i);
        while (i < i3) {
            int i4 = iM14062N == 0 ? 0 : this.f30754l[iM14062N - 1];
            int[] iArr = this.f30754l;
            int i5 = iArr[iM14062N] - i4;
            int i6 = iArr[this.f30753k.length + iM14062N];
            int iMin = Math.min(i3, i5 + i4) - i;
            int i7 = (i - i4) + i6;
            Segment segment = new Segment(this.f30753k[iM14062N], i7, i7 + iMin, true, false);
            Segment segment2 = buffer3.f30707f;
            if (segment2 == null) {
                segment.f30748g = segment;
                segment.f30747f = segment;
                buffer3.f30707f = segment;
            } else {
                Segment segment3 = segment2.f30748g;
                if (segment3 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                segment3.m13787b(segment);
            }
            i += iMin;
            iM14062N++;
        }
        buffer3.f30708g += (long) mo13765j();
    }

    /* JADX INFO: renamed from: y */
    public byte[] m13792y() {
        byte[] bArr = new byte[mo13765j()];
        int length = this.f30753k.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f30754l;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            _ArraysJvm.m13028b(this.f30753k[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: z */
    public final ByteString3 m13793z() {
        return new ByteString3(m13792y());
    }
}
