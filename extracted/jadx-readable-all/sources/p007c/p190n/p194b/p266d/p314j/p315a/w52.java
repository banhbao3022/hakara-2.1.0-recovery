package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class w52 implements x52<Signature> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x52
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Signature mo8191a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
