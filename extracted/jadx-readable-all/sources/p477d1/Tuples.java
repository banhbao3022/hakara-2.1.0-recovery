package p477d1;

import java.io.Serializable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.j, reason: use source file name */
/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Tuples<A, B> implements Serializable {

    /* JADX INFO: renamed from: f */
    public final A f29491f;

    /* JADX INFO: renamed from: g */
    public final B f29492g;

    public Tuples(A a, B b) {
        this.f29491f = a;
        this.f29492g = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tuples)) {
            return false;
        }
        Tuples tuples = (Tuples) obj;
        return Intrinsics2.m13085a(this.f29491f, tuples.f29491f) && Intrinsics2.m13085a(this.f29492g, tuples.f29492g);
    }

    public int hashCode() {
        A a = this.f29491f;
        int iHashCode = (a != null ? a.hashCode() : 0) * 31;
        B b = this.f29492g;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbM1555F = outline.m1555F('(');
        sbM1555F.append(this.f29491f);
        sbM1555F.append(", ");
        sbM1555F.append(this.f29492g);
        sbM1555F.append(')');
        return sbM1555F.toString();
    }
}
