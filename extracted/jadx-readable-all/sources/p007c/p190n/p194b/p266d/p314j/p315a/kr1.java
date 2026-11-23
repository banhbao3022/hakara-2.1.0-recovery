package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kr1 {

    /* JADX INFO: renamed from: a */
    public static boolean f16023a = false;

    /* JADX INFO: renamed from: b */
    public static MessageDigest f16024b;

    /* JADX INFO: renamed from: c */
    public static final Object f16025c = new Object();

    /* JADX INFO: renamed from: d */
    public static final Object f16026d = new Object();

    /* JADX INFO: renamed from: e */
    public static final CountDownLatch f16027e = new CountDownLatch(1);

    /* JADX INFO: renamed from: a */
    public static void m7538a() {
        synchronized (f16026d) {
            if (!f16023a) {
                f16023a = true;
                new Thread(new oq1()).start();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m7539b(f31 f31Var, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArrM7541d;
        byte[] bArrMo7574w = f31Var.mo7574w();
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14158B1)).booleanValue()) {
            int length = bArrMo7574w.length;
            Vector vector = null;
            if (length > 0) {
                int i = (length + 254) / 255;
                Vector vector2 = new Vector();
                for (int i2 = 0; i2 < i; i2++) {
                    int i3 = i2 * 255;
                    try {
                        int length2 = bArrMo7574w.length;
                        if (length2 - i3 > 255) {
                            length2 = i3 + 255;
                        }
                        vector2.add(Arrays.copyOfRange(bArrMo7574w, i3, length2));
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
                vector = vector2;
            }
            if (vector == null || vector.size() == 0) {
                go0 go0VarM6750r0 = f31.m6750r0();
                go0VarM6750r0.m7010v(4096);
                bArrM7541d = m7541d(go0VarM6750r0.m6300o().mo7574w(), str, true);
            } else {
                uk1 uk1VarM8423v = tl1.m8423v();
                int size = vector.size();
                for (int i4 = 0; i4 < size; i4++) {
                    byte[] bArrM7541d2 = m7541d((byte[]) vector.get(i4), str, false);
                    uk1VarM8423v.m8511r(g72.m6939G(bArrM7541d2, 0, bArrM7541d2.length));
                }
                g72 g72VarM6940H = g72.m6940H(m7540c(bArrMo7574w));
                if (uk1VarM8423v.f13191h) {
                    uk1VarM8423v.m6298m();
                    uk1VarM8423v.f13191h = false;
                }
                tl1.m8426z((tl1) uk1VarM8423v.f13190g, g72VarM6940H);
                bArrM7541d = uk1VarM8423v.m6300o().mo7574w();
            }
        } else {
            if (cw0.f13137a == null) {
                throw new GeneralSecurityException();
            }
            byte[] bArrMo6126a = cw0.f13137a.mo6126a(bArrMo7574w, str != null ? str.getBytes() : new byte[0]);
            uk1 uk1VarM8423v2 = tl1.m8423v();
            uk1VarM8423v2.m8511r(g72.m6940H(bArrMo6126a));
            ja1 ja1Var = ja1.TINK_HYBRID;
            if (uk1VarM8423v2.f13191h) {
                uk1VarM8423v2.m6298m();
                uk1VarM8423v2.f13191h = false;
            }
            tl1.m8422A((tl1) uk1VarM8423v2.f13190g, ja1Var);
            bArrM7541d = uk1VarM8423v2.m6300o().mo7574w();
        }
        return C2622l.m5292O0(bArrM7541d, true);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m7540c(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f16025c) {
            m7538a();
            MessageDigest messageDigest2 = null;
            try {
                if (f16027e.await(2L, TimeUnit.SECONDS) && (messageDigest = f16024b) != null) {
                    messageDigest2 = messageDigest;
                }
            } catch (InterruptedException unused) {
            }
            if (messageDigest2 == null) {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
            messageDigest2.reset();
            messageDigest2.update(bArr);
            bArrDigest = f16024b.digest();
        }
        return bArrDigest;
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m7541d(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArrArray;
        int i = true != z ? 255 : 239;
        if (bArr.length > i) {
            go0 go0VarM6750r0 = f31.m6750r0();
            go0VarM6750r0.m7010v(4096);
            bArr = go0VarM6750r0.m6300o().mo7574w();
        }
        int length = bArr.length;
        if (length < i) {
            byte[] bArr2 = new byte[i - length];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i + 1).put((byte) length).put(bArr).array();
        }
        if (z) {
            bArrArray = ByteBuffer.allocate(256).put(m7540c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[256];
        os1[] os1VarArr = new f52().f13818G2;
        int length2 = os1VarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            os1VarArr[i2].mo6926a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            r62 r62Var = new r62(str.getBytes(Utf8Charset.NAME));
            int i3 = r62Var.f18712b;
            int i4 = r62Var.f18713c;
            for (int i5 = 0; i5 < 256; i5++) {
                i3 = (i3 + 1) & 255;
                byte[] bArr4 = r62Var.f18711a;
                byte b = bArr4[i3];
                i4 = (i4 + b) & 255;
                bArr4[i3] = bArr4[i4];
                bArr4[i4] = b;
                bArr3[i5] = (byte) (bArr4[(bArr4[i3] + b) & 255] ^ bArr3[i5]);
            }
            r62Var.f18712b = i3;
            r62Var.f18713c = i4;
        }
        return bArr3;
    }
}
