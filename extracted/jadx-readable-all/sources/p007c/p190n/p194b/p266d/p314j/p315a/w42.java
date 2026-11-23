package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w42 implements z52 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Cipher> f20995a = new v42();

    /* JADX INFO: renamed from: b */
    public final SecretKeySpec f20996b;

    /* JADX INFO: renamed from: c */
    public final int f20997c;

    /* JADX INFO: renamed from: d */
    public final int f20998d;

    public w42(byte[] bArr, int i) throws GeneralSecurityException {
        h62.m7066a(bArr.length);
        this.f20996b = new SecretKeySpec(bArr, "AES");
        int blockSize = f20995a.get().getBlockSize();
        this.f20998d = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f20997c = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z52
    /* JADX INFO: renamed from: a */
    public final byte[] mo6612a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f20997c;
        int i2 = Integer.MAX_VALUE - i;
        if (length > i2) {
            throw new GeneralSecurityException(outline.m1585g(43, "plaintext length can not exceed ", i2));
        }
        byte[] bArr2 = new byte[i + length];
        byte[] bArrM6935a = g62.m6935a(i);
        System.arraycopy(bArrM6935a, 0, bArr2, 0, this.f20997c);
        int i3 = this.f20997c;
        Cipher cipher = f20995a.get();
        byte[] bArr3 = new byte[this.f20998d];
        System.arraycopy(bArrM6935a, 0, bArr3, 0, this.f20997c);
        cipher.init(1, this.f20996b, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i3) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
