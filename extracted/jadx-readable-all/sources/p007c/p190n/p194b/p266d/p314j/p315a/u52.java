package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u52 implements x52<Mac> {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.x52
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Mac mo8191a(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
