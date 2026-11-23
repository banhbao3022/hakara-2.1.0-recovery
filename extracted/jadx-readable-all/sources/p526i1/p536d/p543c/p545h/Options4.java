package p526i1.p536d.p543c.p545h;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;

/* JADX INFO: renamed from: i1.d.c.h.d, reason: use source file name */
/* JADX INFO: compiled from: Options.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Options4 {

    /* JADX INFO: renamed from: a */
    public boolean f30912a;

    /* JADX INFO: renamed from: b */
    public boolean f30913b;

    /* JADX WARN: Illegal instructions before constructor call */
    public Options4() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public Options4(boolean z, boolean z2) {
        this.f30912a = z;
        this.f30913b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Options4)) {
            return false;
        }
        Options4 options4 = (Options4) obj;
        return this.f30912a == options4.f30912a && this.f30913b == options4.f30913b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z = this.f30912a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.f30913b;
        return i + (z2 ? 1 : z2);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Options(isCreatedAtStart=");
        sbM1556G.append(this.f30912a);
        sbM1556G.append(", override=");
        sbM1556G.append(this.f30913b);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    public /* synthetic */ Options4(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
