package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.SecureRandom;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class f62 extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ SecureRandom initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
