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
public final class b52 implements bw1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Cipher> f12527a = new a52();

    /* JADX INFO: renamed from: b */
    public final SecretKey f12528b;

    public b52(byte[] bArr) throws GeneralSecurityException {
        h62.m7066a(bArr.length);
        this.f12528b = new SecretKeySpec(bArr, "AES");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0038  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5927a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrM6935a = g62.m6935a(12);
        System.arraycopy(bArrM6935a, 0, bArr3, 0, 12);
        int length2 = bArrM6935a.length;
        if (C2622l.m5451w1()) {
            try {
                i = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
                i = -1;
            }
            if (i <= 19) {
                ivParameterSpec = new IvParameterSpec(bArrM6935a, 0, length2);
            } else {
                ivParameterSpec = new GCMParameterSpec(128, bArrM6935a, 0, length2);
            }
        } else {
            ivParameterSpec = new GCMParameterSpec(128, bArrM6935a, 0, length2);
        }
        ThreadLocal<Cipher> threadLocal = f12527a;
        threadLocal.get().init(1, this.f12528b, ivParameterSpec);
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
