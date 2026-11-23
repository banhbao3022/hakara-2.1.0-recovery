package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.SecureRandom;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g62 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<SecureRandom> f14510a = new f62();

    /* JADX INFO: renamed from: a */
    public static byte[] m6935a(int i) {
        byte[] bArr = new byte[i];
        f14510a.get().nextBytes(bArr);
        return bArr;
    }
}
