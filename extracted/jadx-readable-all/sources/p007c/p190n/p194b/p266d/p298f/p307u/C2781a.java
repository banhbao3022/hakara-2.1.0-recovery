package p007c.p190n.p194b.p266d.p298f.p307u;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: c.n.b.d.f.u.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2781a {
    @RecentlyNullable
    /* JADX INFO: renamed from: a */
    public static MessageDigest m5620a(@RecentlyNonNull String str) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str);
                if (messageDigest != null) {
                    return messageDigest;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
