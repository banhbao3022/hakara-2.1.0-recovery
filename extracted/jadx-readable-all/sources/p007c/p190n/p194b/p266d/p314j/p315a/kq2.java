package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kq2 {

    /* JADX INFO: renamed from: a */
    public static MessageDigest f16019a;

    /* JADX INFO: renamed from: b */
    public final Object f16020b = new Object();

    /* JADX INFO: renamed from: a */
    public abstract byte[] mo7536a(String str);

    /* JADX INFO: renamed from: b */
    public final MessageDigest m7537b() {
        synchronized (this.f16020b) {
            MessageDigest messageDigest = f16019a;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f16019a = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return f16019a;
        }
    }
}
