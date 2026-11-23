package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Build;
import com.facebook.stetho.dumpapp.Framer;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jp1 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f15682a = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, Framer.STDIN_REQUEST_FRAME_PREFIX, -25, -62, 63, Framer.STDERR_FRAME_PREFIX, 108, -113, -103, 74};

    /* JADX INFO: renamed from: b */
    public static final byte[] f15683b = {16, 57, 56, -18, 69, 55, -27, -98, -114, -25, -110, -10, 84, 80, 79, -72, 52, 111, -58, -77, 70, -48, -69, -60, 65, Framer.STDIN_REQUEST_FRAME_PREFIX, -61, 57, -4, -4, -114, -63};

    /* JADX INFO: renamed from: c */
    public final byte[] f15684c = f15683b;

    /* JADX INFO: renamed from: d */
    public final byte[] f15685d = f15682a;

    /* JADX INFO: renamed from: a */
    public final boolean m7378a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrM5426r1 = C2622l.m5426r1(file.getAbsolutePath());
            if (x509CertificateArrM5426r1.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrM5426r1[0][0].getEncoded());
            if (Arrays.equals(this.f15685d, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.f15684c, bArrDigest);
        } catch (jd2 e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
