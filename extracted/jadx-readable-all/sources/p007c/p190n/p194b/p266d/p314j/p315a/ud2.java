package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ud2 {

    /* JADX INFO: renamed from: a */
    public static Cipher f20290a;

    /* JADX INFO: renamed from: b */
    public static final Object f20291b = new Object();

    /* JADX INFO: renamed from: c */
    public static final Object f20292c = new Object();

    public ud2(SecureRandom secureRandom) {
    }

    /* JADX INFO: renamed from: c */
    public static final Cipher m8485c() throws NoSuchPaddingException, NoSuchAlgorithmException {
        Cipher cipher;
        synchronized (f20292c) {
            if (f20290a == null) {
                f20290a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f20290a;
        }
        return cipher;
    }

    /* JADX INFO: renamed from: a */
    public final String m8486a(byte[] bArr, byte[] bArr2) throws td2 {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f20291b) {
                m8485c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = m8485c().doFinal(bArr2);
                iv = m8485c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return C2622l.m5292O0(bArr3, false);
        } catch (InvalidKeyException e) {
            throw new td2(this, e);
        } catch (NoSuchAlgorithmException e2) {
            throw new td2(this, e2);
        } catch (BadPaddingException e3) {
            throw new td2(this, e3);
        } catch (IllegalBlockSizeException e4) {
            throw new td2(this, e4);
        } catch (NoSuchPaddingException e5) {
            throw new td2(this, e5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m8487b(byte[] bArr, String str) throws td2 {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrM5337Z1 = C2622l.m5337Z1(str, false);
            int length2 = bArrM5337Z1.length;
            if (length2 <= 16) {
                throw new td2(this);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrM5337Z1);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f20291b) {
                m8485c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = m8485c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e) {
            throw new td2(this, e);
        } catch (InvalidAlgorithmParameterException e2) {
            throw new td2(this, e2);
        } catch (InvalidKeyException e3) {
            throw new td2(this, e3);
        } catch (NoSuchAlgorithmException e4) {
            throw new td2(this, e4);
        } catch (BadPaddingException e5) {
            throw new td2(this, e5);
        } catch (IllegalBlockSizeException e6) {
            throw new td2(this, e6);
        } catch (NoSuchPaddingException e7) {
            throw new td2(this, e7);
        }
    }
}
