package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z42 implements bw1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<Cipher> f22173a = new x42();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<Cipher> f22174b = new y42();

    /* JADX INFO: renamed from: c */
    public final byte[] f22175c;

    /* JADX INFO: renamed from: d */
    public final byte[] f22176d;

    /* JADX INFO: renamed from: e */
    public final SecretKeySpec f22177e;

    /* JADX INFO: renamed from: f */
    public final int f22178f;

    public z42(byte[] bArr, int i) throws GeneralSecurityException {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f22178f = i;
        h62.m7066a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f22177e = secretKeySpec;
        Cipher cipher = f22173a.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM8846c = m8846c(cipher.doFinal(new byte[16]));
        this.f22175c = bArrM8846c;
        this.f22176d = m8846c(bArrM8846c);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m8845b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m8846c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b = bArr[i];
            int i2 = i + 1;
            bArr2[i] = (byte) (((b + b) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        byte b2 = bArr[15];
        bArr2[15] = (byte) ((b2 + b2) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.bw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5927a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.f22178f;
        if (length > (Integer.MAX_VALUE - i) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i + length + 16];
        byte[] bArrM6935a = g62.m6935a(i);
        System.arraycopy(bArrM6935a, 0, bArr3, 0, this.f22178f);
        Cipher cipher = f22173a.get();
        cipher.init(1, this.f22177e);
        byte[] bArrM8847d = m8847d(cipher, 0, bArrM6935a, 0, bArrM6935a.length);
        byte[] bArrM8847d2 = m8847d(cipher, 1, bArr2, 0, bArr2.length);
        Cipher cipher2 = f22174b.get();
        cipher2.init(1, this.f22177e, new IvParameterSpec(bArrM8847d));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f22178f);
        byte[] bArrM8847d3 = m8847d(cipher, 2, bArr3, this.f22178f, length);
        int i2 = length + this.f22178f;
        for (int i3 = 0; i3 < 16; i3++) {
            bArr3[i2 + i3] = (byte) ((bArrM8847d2[i3] ^ bArrM8847d[i3]) ^ bArrM8847d3[i3]);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m8847d(Cipher cipher, int i, byte[] bArr, int i2, int i3) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrM8845b;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i3 == 0) {
            return cipher.doFinal(m8845b(bArr2, this.f22175c));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        int i5 = 0;
        while (i3 - i5 > 16) {
            for (int i6 = 0; i6 < 16; i6++) {
                bArrDoFinal[i6] = (byte) (bArrDoFinal[i6] ^ bArr[(i2 + i5) + i6]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i5 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i5 + i2, i2 + i3);
        if (bArrCopyOfRange.length == 16) {
            bArrM8845b = m8845b(bArrCopyOfRange, this.f22175c);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f22176d, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i4 >= length) {
                    break;
                }
                bArrCopyOf[i4] = (byte) (bArrCopyOf[i4] ^ bArrCopyOfRange[i4]);
                i4++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrM8845b = bArrCopyOf;
        }
        return cipher.doFinal(m8845b(bArrDoFinal, bArrM8845b));
    }
}
