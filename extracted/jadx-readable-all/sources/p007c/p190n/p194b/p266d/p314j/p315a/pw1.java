package p007c.p190n.p194b.p266d.p314j.p315a;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pw1 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList<ow1> f18112a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: a */
    public static ow1 m8171a(String str) throws GeneralSecurityException {
        for (ow1 ow1Var : f18112a) {
            if (ow1Var.zza()) {
                return ow1Var;
            }
        }
        String strValueOf = String.valueOf(str);
        throw new GeneralSecurityException(strValueOf.length() != 0 ? "No KMS client does support: ".concat(strValueOf) : new String("No KMS client does support: "));
    }
}
