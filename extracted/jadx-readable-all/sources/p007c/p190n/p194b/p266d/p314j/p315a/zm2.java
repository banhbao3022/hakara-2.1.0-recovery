package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zm2 {

    /* JADX INFO: renamed from: a */
    public int f22356a;

    /* JADX INFO: renamed from: b */
    public final rm2[] f22357b;

    public zm2(rm2[] rm2VarArr, byte... bArr) {
        this.f22357b = rm2VarArr;
    }

    /* JADX INFO: renamed from: a */
    public final rm2 m8893a(int i) {
        return this.f22357b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zm2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f22357b, ((zm2) obj).f22357b);
    }

    public final int hashCode() {
        int i = this.f22356a;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f22357b) + 527;
        this.f22356a = iHashCode;
        return iHashCode;
    }
}
