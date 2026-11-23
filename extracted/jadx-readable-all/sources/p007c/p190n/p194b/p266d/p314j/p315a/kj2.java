package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kj2 {

    /* JADX INFO: renamed from: a */
    public final int f15965a = 1;

    /* JADX INFO: renamed from: b */
    public final byte[] f15966b;

    public kj2(int i, byte[] bArr) {
        this.f15966b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && kj2.class == obj.getClass() && Arrays.equals(this.f15966b, ((kj2) obj).f15966b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15966b) + 31;
    }
}
