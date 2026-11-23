package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class my1 implements bw1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Cipher> f16962a = new ly1();

    /* JADX INFO: renamed from: b */
    public final SecretKey f16963b;

    public my1(byte[] bArr) throws GeneralSecurityException {
        h62.m7066a(bArr.length);
        this.f16963b = new SecretKeySpec(bArr, "AES");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5927a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrM6935a = g62.m6935a(12);
        System.arraycopy(bArrM6935a, 0, bArr3, 0, 12);
        int length2 = bArrM6935a.length;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, bArrM6935a, 0, length2);
        } catch (ClassNotFoundException unused) {
            if (!C2622l.m5451w1()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArrM6935a, 0, length2);
        }
        ThreadLocal<Cipher> threadLocal = f16962a;
        threadLocal.get().init(1, this.f16963b, ivParameterSpec);
        if (bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
