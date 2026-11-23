package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ex1 {

    /* JADX INFO: renamed from: a */
    public static final String f13746a;

    /* JADX INFO: renamed from: b */
    public static final String f13747b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public static final o42 f13748c;

    static {
        new kx1();
        f13746a = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
        new tx1();
        f13747b = "type.googleapis.com/google.crypto.tink.AesGcmKey";
        new wx1();
        new qx1();
        new cy1();
        new gy1();
        new zx1();
        new ky1();
        f13748c = o42.m7960x();
        try {
            m6695a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m6695a() throws GeneralSecurityException {
        boolean z;
        mz1.m7741a();
        cx1.m6259c(new kx1(), true);
        cx1.m6259c(new qx1(), true);
        cx1.m6259c(new tx1(), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            cx1.m6259c(new wx1(), true);
        }
        cx1.m6259c(new zx1(), true);
        cx1.m6259c(new cy1(), true);
        cx1.m6259c(new gy1(), true);
        cx1.m6259c(new ky1(), true);
        cx1.m6261e(new gx1());
    }
}
