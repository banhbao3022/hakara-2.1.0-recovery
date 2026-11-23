package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 extends ThreadLocal<Cipher> {
    @Override // java.lang.ThreadLocal
    public final Cipher initialValue() {
        try {
            return p52.f17856c.m8079a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
