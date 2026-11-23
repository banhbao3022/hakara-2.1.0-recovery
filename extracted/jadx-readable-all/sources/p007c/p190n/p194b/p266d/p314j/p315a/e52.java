package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.dumpapp.Framer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e52 implements z52 {

    /* JADX INFO: renamed from: a */
    public static final int[] f13513a = m6611i(new byte[]{101, Framer.EXIT_FRAME_PREFIX, 112, 97, 110, 100, 32, 51, Framer.STDERR_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: b */
    public int[] f13514b;

    /* JADX INFO: renamed from: c */
    public final int f13515c;

    public e52(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f13514b = m6611i(bArr);
        this.f13515c = i;
    }

    /* JADX INFO: renamed from: f */
    public static void m6608f(int[] iArr, int[] iArr2) {
        int[] iArr3 = f13513a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: renamed from: g */
    public static void m6609g(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            m6610h(iArr, 0, 4, 8, 12);
            m6610h(iArr, 1, 5, 9, 13);
            m6610h(iArr, 2, 6, 10, 14);
            m6610h(iArr, 3, 7, 11, 15);
            m6610h(iArr, 0, 5, 10, 15);
            m6610h(iArr, 1, 6, 11, 12);
            m6610h(iArr, 2, 7, 8, 13);
            m6610h(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m6610h(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    /* JADX INFO: renamed from: i */
    public static int[] m6611i(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z52
    /* JADX INFO: renamed from: a */
    public final byte[] mo6612a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > Integer.MAX_VALUE - mo6288c()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(mo6288c() + length);
        m6613d(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: renamed from: b */
    public abstract int[] mo6287b(int[] iArr, int i);

    /* JADX INFO: renamed from: c */
    public abstract int mo6288c();

    /* JADX INFO: renamed from: d */
    public final void m6613d(ByteBuffer byteBuffer, byte[] bArr) throws GeneralSecurityException {
        if (byteBuffer.remaining() - mo6288c() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrM6935a = g62.m6935a(mo6288c());
        byteBuffer.put(bArrM6935a);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        int i = (iRemaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer byteBufferM6614e = m6614e(bArrM6935a, this.f13515c + i2);
            if (i2 == i - 1) {
                C2622l.m5225A2(byteBuffer, byteBufferWrap, byteBufferM6614e, iRemaining % 64);
            } else {
                C2622l.m5225A2(byteBuffer, byteBufferWrap, byteBufferM6614e, 64);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final ByteBuffer m6614e(byte[] bArr, int i) {
        int[] iArrMo6287b = mo6287b(m6611i(bArr), i);
        int[] iArr = (int[]) iArrMo6287b.clone();
        m6609g(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            iArrMo6287b[i2] = iArrMo6287b[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrMo6287b, 0, 16);
        return byteBufferOrder;
    }
}
