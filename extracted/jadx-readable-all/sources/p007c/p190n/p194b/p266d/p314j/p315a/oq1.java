package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class oq1 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            kr1.f16024b = MessageDigest.getInstance("MD5");
            countDownLatch = kr1.f16027e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = kr1.f16027e;
        } catch (Throwable th) {
            kr1.f16027e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
