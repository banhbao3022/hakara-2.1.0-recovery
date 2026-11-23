package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i62 extends e52 {
    public i62(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e52
    /* JADX INFO: renamed from: b */
    public final int[] mo6287b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        e52.m6608f(iArr3, this.f13514b);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        e52.m6609g(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        e52.m6608f(iArr2, Arrays.copyOf(iArr3, 8));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e52
    /* JADX INFO: renamed from: c */
    public final int mo6288c() {
        return 24;
    }
}
