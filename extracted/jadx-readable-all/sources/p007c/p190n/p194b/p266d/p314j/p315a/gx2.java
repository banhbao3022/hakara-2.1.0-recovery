package p007c.p190n.p194b.p266d.p314j.p315a;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;
import java.util.WeakHashMap;
import p007c.p190n.p194b.p266d.p267a.p275e0.C2170a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gx2 {

    /* JADX INFO: renamed from: a */
    public static final gx2 f14692a = new gx2();

    /* JADX INFO: renamed from: b */
    public final C3331nn f14693b;

    /* JADX INFO: renamed from: c */
    public final ex2 f14694c;

    /* JADX INFO: renamed from: d */
    public final String f14695d;

    /* JADX INFO: renamed from: e */
    public final C3702xn f14696e;

    /* JADX INFO: renamed from: f */
    public final Random f14697f;

    /* JADX INFO: renamed from: g */
    public final WeakHashMap<C2170a, String> f14698g;

    public gx2() {
        C3331nn c3331nn = new C3331nn();
        ex2 ex2Var = new ex2(new dw2(), new cw2(), new C3680x1(), new C3204k7(), new C3217kk(), new C2843ah(), new C3241l7());
        UUID uuidRandomUUID = UUID.randomUUID();
        byte[] byteArray = BigInteger.valueOf(uuidRandomUUID.getLeastSignificantBits()).toByteArray();
        byte[] byteArray2 = BigInteger.valueOf(uuidRandomUUID.getMostSignificantBits()).toByteArray();
        String string = new BigInteger(1, byteArray).toString();
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(byteArray);
                messageDigest.update(byteArray2);
                byte[] bArr = new byte[8];
                System.arraycopy(messageDigest.digest(), 0, bArr, 0, 8);
                string = new BigInteger(1, bArr).toString();
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        C3702xn c3702xn = new C3702xn(0, 210890000, true, false, false);
        Random random = new Random();
        WeakHashMap<C2170a, String> weakHashMap = new WeakHashMap<>();
        this.f14693b = c3331nn;
        this.f14694c = ex2Var;
        this.f14695d = string;
        this.f14696e = c3702xn;
        this.f14697f = random;
        this.f14698g = weakHashMap;
    }
}
