package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.InvalidKeyException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d52 extends e52 {
    public d52(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e52
    /* JADX INFO: renamed from: b */
    public final int[] mo6287b(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        e52.m6608f(iArr2, this.f13514b);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.e52
    /* JADX INFO: renamed from: c */
    public final int mo6288c() {
        return 12;
    }
}
