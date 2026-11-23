package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class c62 implements pz1 {

    /* JADX INFO: renamed from: a */
    public final ThreadLocal<Mac> f12945a;

    /* JADX INFO: renamed from: b */
    public final String f12946b;

    /* JADX INFO: renamed from: c */
    public final Key f12947c;

    /* JADX INFO: renamed from: d */
    public final int f12948d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    public c62(String str, Key key) throws GeneralSecurityException {
        byte b;
        int i;
        b62 b62Var = new b62(this);
        this.f12945a = b62Var;
        this.f12946b = str;
        this.f12947c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b = 0;
                break;
            case "HMACSHA256":
                b = 1;
                break;
            case "HMACSHA384":
                b = 2;
                break;
            case "HMACSHA512":
                b = 3;
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            i = 20;
        } else {
            if (b != 1) {
                if (b == 2) {
                    i = 48;
                } else {
                    if (b != 3) {
                        throw new NoSuchAlgorithmException(str.length() != 0 ? "unknown Hmac algorithm: ".concat(str) : new String("unknown Hmac algorithm: "));
                    }
                    this.f12948d = 64;
                }
                b62Var.get();
            }
            i = 32;
        }
        this.f12948d = i;
        b62Var.get();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pz1
    /* JADX INFO: renamed from: a */
    public final byte[] mo5697a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > this.f12948d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.f12945a.get().update(bArr);
        return Arrays.copyOf(this.f12945a.get().doFinal(), i);
    }
}
