package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class s52 implements x52<KeyFactory> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x52
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ KeyFactory mo8191a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
