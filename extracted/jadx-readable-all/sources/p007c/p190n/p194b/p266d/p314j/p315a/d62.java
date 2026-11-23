package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d62 implements qw1 {

    /* JADX INFO: renamed from: a */
    public final pz1 f13180a;

    /* JADX INFO: renamed from: b */
    public final int f13181b;

    public d62(pz1 pz1Var, int i) throws GeneralSecurityException {
        this.f13180a = pz1Var;
        this.f13181b = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        pz1Var.mo5697a(new byte[0], i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qw1
    /* JADX INFO: renamed from: a */
    public final byte[] mo6289a(byte[] bArr) throws GeneralSecurityException {
        return this.f13180a.mo5697a(bArr, this.f13181b);
    }
}
