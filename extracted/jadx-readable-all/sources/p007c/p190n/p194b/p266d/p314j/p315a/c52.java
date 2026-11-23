package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class c52 implements ew1 {

    /* JADX INFO: renamed from: a */
    public static final Collection<Integer> f12940a = Arrays.asList(64);

    /* JADX INFO: renamed from: b */
    public static final byte[] f12941b = new byte[16];

    /* JADX INFO: renamed from: c */
    public final a62 f12942c;

    /* JADX INFO: renamed from: d */
    public final byte[] f12943d;

    public c52(byte[] bArr) throws GeneralSecurityException {
        Collection<Integer> collection = f12940a;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i = length >> 1;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
            this.f12943d = Arrays.copyOfRange(bArr, i, length);
            this.f12942c = new a62(bArrCopyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ew1
    /* JADX INFO: renamed from: a */
    public final byte[] mo6147a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrM5330X2;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipherM8079a = p52.f17856c.m8079a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] bArrMo5697a = this.f12942c.mo5697a(f12941b, 16);
        for (char c2 = 0; c2 <= 0; c2 = 1) {
            byte[] bArr4 = bArr3[0];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArrMo5697a = C2622l.m5330X2(C2622l.m5411o1(bArrMo5697a), this.f12942c.mo5697a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = bArrMo5697a.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i = length - length2;
            bArrM5330X2 = Arrays.copyOf(bArr5, length);
            for (int i2 = 0; i2 < bArrMo5697a.length; i2++) {
                int i3 = i + i2;
                bArrM5330X2[i3] = (byte) (bArrM5330X2[i3] ^ bArrMo5697a[i2]);
            }
        } else {
            bArrM5330X2 = C2622l.m5330X2(C2622l.m5342a2(bArr5), C2622l.m5411o1(bArrMo5697a));
        }
        byte[] bArrMo5697a2 = this.f12942c.mo5697a(bArrM5330X2, 16);
        byte[] bArr6 = (byte[]) bArrMo5697a2.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipherM8079a.init(1, new SecretKeySpec(this.f12943d, "AES"), new IvParameterSpec(bArr6));
        return C2622l.m5416p1(bArrMo5697a2, cipherM8079a.doFinal(bArr));
    }
}
