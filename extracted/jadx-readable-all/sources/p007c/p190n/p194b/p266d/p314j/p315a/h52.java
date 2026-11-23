package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h52 implements bw1 {

    /* JADX INFO: renamed from: a */
    public final e52 f14765a;

    /* JADX INFO: renamed from: b */
    public final e52 f14766b;

    public h52(byte[] bArr) throws InvalidKeyException {
        this.f14765a = mo6934b(bArr, 1);
        this.f14766b = mo6934b(bArr, 0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5927a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > (Integer.MAX_VALUE - this.f14765a.mo6288c()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f14765a.mo6288c() + length + 16);
        if (byteBufferAllocate.remaining() < this.f14765a.mo6288c() + length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        this.f14765a.m6613d(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[this.f14765a.mo6288c()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.f14766b.m6614e(bArr3, 0).get(bArr4);
        int length2 = bArr2.length;
        int i = length2 & 15;
        int i2 = i == 0 ? length2 : (length2 + 16) - i;
        int iRemaining = byteBufferAllocate.remaining();
        int i3 = iRemaining % 16;
        int i4 = (i3 == 0 ? iRemaining : (iRemaining + 16) - i3) + i2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr2);
        byteBufferOrder.position(i2);
        byteBufferOrder.put(byteBufferAllocate);
        byteBufferOrder.position(i4);
        byteBufferOrder.putLong(length2);
        byteBufferOrder.putLong(iRemaining);
        byte[] bArrArray = byteBufferOrder.array();
        long jM5259H1 = (C2622l.m5259H1(bArr4, 0) >> 0) & 67108863;
        long jM5259H2 = (C2622l.m5259H1(bArr4, 3) >> 2) & 67108863 & 67108611;
        long jM5259H3 = (C2622l.m5259H1(bArr4, 6) >> 4) & 67108863 & 67092735;
        long jM5259H4 = (C2622l.m5259H1(bArr4, 9) >> 6) & 67108863 & 66076671;
        long jM5259H5 = (C2622l.m5259H1(bArr4, 12) >> 8) & 67108863 & 1048575;
        long j2 = jM5259H2 * 5;
        long j3 = jM5259H3 * 5;
        long j4 = jM5259H4 * 5;
        long j5 = jM5259H5 * 5;
        int i5 = 17;
        byte[] bArr5 = new byte[17];
        long j6 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        int i6 = 0;
        while (true) {
            int length3 = bArrArray.length;
            if (i6 >= length3) {
                ByteBuffer byteBuffer = byteBufferAllocate;
                long j11 = j7 + (j6 >> 26);
                long j12 = j11 & 67108863;
                long j13 = j8 + (j11 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j9 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = ((j15 >> 26) * 5) + j10;
                long j18 = j17 & 67108863;
                long j19 = (j6 & 67108863) + (j17 >> 26);
                long j20 = j18 + 5;
                long j21 = (j20 >> 26) + j19;
                long j22 = j12 + (j21 >> 26);
                long j23 = j14 + (j22 >> 26);
                long j24 = (j16 + (j23 >> 26)) - 67108864;
                long j25 = j24 >> 63;
                long j26 = ~j25;
                long j27 = (j21 & 67108863 & j26) | (j19 & j25);
                long j28 = (j12 & j25) | (j22 & 67108863 & j26);
                long j29 = (j14 & j25) | (j23 & 67108863 & j26);
                long jM5259H6 = C2622l.m5259H1(bArr4, 16) + (((j18 & j25) | (j20 & 67108863 & j26) | (j27 << 26)) & 4294967295L);
                long jM5259H7 = C2622l.m5259H1(bArr4, 20) + (((j27 >> 6) | (j28 << 20)) & 4294967295L) + (jM5259H6 >> 32);
                long jM5259H8 = C2622l.m5259H1(bArr4, 24) + (((j28 >> 12) | (j29 << 14)) & 4294967295L) + (jM5259H7 >> 32);
                long jM5259H9 = C2622l.m5259H1(bArr4, 28);
                byte[] bArr6 = new byte[16];
                C2622l.m5326W2(bArr6, jM5259H6 & 4294967295L, 0);
                C2622l.m5326W2(bArr6, jM5259H7 & 4294967295L, 4);
                C2622l.m5326W2(bArr6, jM5259H8 & 4294967295L, 8);
                C2622l.m5326W2(bArr6, ((((j29 >> 18) | (((j16 & j25) | (j24 & j26)) << 8)) & 4294967295L) + jM5259H9 + (jM5259H8 >> 32)) & 4294967295L, 12);
                byteBuffer.limit(byteBuffer.limit() + 16);
                byteBuffer.put(bArr6);
                return byteBuffer.array();
            }
            int iMin = Math.min(16, length3 - i6);
            System.arraycopy(bArrArray, i6, bArr5, 0, iMin);
            bArr5[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr5, iMin + 1, i5, (byte) 0);
            }
            long jM5259H10 = j10 + ((C2622l.m5259H1(bArr5, 0) >> 0) & 67108863);
            long jM5259H11 = j6 + ((C2622l.m5259H1(bArr5, 3) >> 2) & 67108863);
            long jM5259H12 = j7 + ((C2622l.m5259H1(bArr5, 6) >> 4) & 67108863);
            long jM5259H13 = j8 + ((C2622l.m5259H1(bArr5, 9) >> 6) & 67108863);
            long jM5259H14 = j9 + (((C2622l.m5259H1(bArr5, 12) >> 8) & 67108863) | ((long) (bArr5[16] << 24)));
            long j30 = (jM5259H14 * j2) + (jM5259H13 * j3) + (jM5259H12 * j4) + (jM5259H11 * j5) + (jM5259H10 * jM5259H1);
            long j31 = (jM5259H14 * j3) + (jM5259H13 * j4) + (jM5259H12 * j5) + (jM5259H11 * jM5259H1) + (jM5259H10 * jM5259H2) + (j30 >> 26);
            long j32 = (jM5259H14 * j4) + (jM5259H13 * j5) + (jM5259H12 * jM5259H1) + (jM5259H11 * jM5259H2) + (jM5259H10 * jM5259H3) + (j31 >> 26);
            long j33 = (jM5259H14 * j5) + (jM5259H13 * jM5259H1) + (jM5259H12 * jM5259H2) + (jM5259H11 * jM5259H3) + (jM5259H10 * jM5259H4) + (j32 >> 26);
            long j34 = jM5259H14 * jM5259H1;
            long j35 = j34 + (jM5259H13 * jM5259H2) + (jM5259H12 * jM5259H3) + (jM5259H11 * jM5259H4) + (jM5259H10 * jM5259H5) + (j33 >> 26);
            long j36 = ((j35 >> 26) * 5) + (j30 & 67108863);
            j10 = j36 & 67108863;
            long j37 = (j31 & 67108863) + (j36 >> 26);
            i6 += 16;
            byteBufferAllocate = byteBufferAllocate;
            j9 = j35 & 67108863;
            j8 = j33 & 67108863;
            j7 = j32 & 67108863;
            j6 = j37;
            i5 = 17;
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract e52 mo6934b(byte[] bArr, int i) throws InvalidKeyException;
}
