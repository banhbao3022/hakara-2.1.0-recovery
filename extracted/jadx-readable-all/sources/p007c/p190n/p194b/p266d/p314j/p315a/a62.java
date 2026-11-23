package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a62 implements pz1 {

    /* JADX INFO: renamed from: a */
    public final SecretKey f12028a;

    /* JADX INFO: renamed from: b */
    public final byte[] f12029b;

    /* JADX INFO: renamed from: c */
    public final byte[] f12030c;

    public a62(byte[] bArr) throws GeneralSecurityException {
        h62.m7066a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f12028a = secretKeySpec;
        Cipher cipherM8079a = p52.f17856c.m8079a("AES/ECB/NoPadding");
        cipherM8079a.init(1, secretKeySpec);
        byte[] bArrM5411o1 = C2622l.m5411o1(cipherM8079a.doFinal(new byte[16]));
        this.f12029b = bArrM5411o1;
        this.f12030c = C2622l.m5411o1(bArrM5411o1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pz1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5697a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherM8079a = p52.f17856c.m8079a("AES/ECB/NoPadding");
        cipherM8079a.init(1, this.f12028a);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        byte[] bArrM5347b2 = iMax * 16 == length ? C2622l.m5347b2(bArr, (iMax - 1) * 16, this.f12029b, 0, 16) : C2622l.m5330X2(C2622l.m5342a2(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.f12030c);
        byte[] bArrDoFinal = new byte[16];
        for (int i2 = 0; i2 < iMax - 1; i2++) {
            bArrDoFinal = cipherM8079a.doFinal(C2622l.m5347b2(bArrDoFinal, 0, bArr, i2 * 16, 16));
        }
        return Arrays.copyOf(cipherM8079a.doFinal(C2622l.m5330X2(bArrM5347b2, bArrDoFinal)), i);
    }
}
