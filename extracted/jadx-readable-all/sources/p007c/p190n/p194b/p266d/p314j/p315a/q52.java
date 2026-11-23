package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q52 implements x52<Cipher> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x52
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Cipher mo8191a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
