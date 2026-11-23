package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ks1 {

    /* JADX INFO: renamed from: a */
    public final hs1 f16030a;

    public ks1(hs1 hs1Var, byte[] bArr) {
        this.f16030a = hs1Var;
    }

    /* JADX INFO: renamed from: a */
    public static ks1 m7543a(zr1 zr1Var) {
        return new ks1(new hs1(zr1Var), null);
    }

    /* JADX INFO: renamed from: b */
    public final Iterable<String> m7544b(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new is1(this, charSequence);
    }
}
