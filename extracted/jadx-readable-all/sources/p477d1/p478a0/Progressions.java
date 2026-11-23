package p477d1.p478a0;

import java.util.Iterator;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.p496v.KMarkers;

/* JADX INFO: renamed from: d1.a0.a, reason: use source file name */
/* JADX INFO: compiled from: Progressions.kt */
/* JADX INFO: loaded from: classes.dex */
public class Progressions implements Iterable<Integer>, KMarkers {

    /* JADX INFO: renamed from: f */
    public static final a f29430f = new a(null);

    /* JADX INFO: renamed from: g */
    public final int f29431g;

    /* JADX INFO: renamed from: h */
    public final int f29432h;

    /* JADX INFO: renamed from: i */
    public final int f29433i;

    /* JADX INFO: renamed from: d1.a0.a$a */
    /* JADX INFO: compiled from: Progressions.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public Progressions(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f29431g = i;
        if (i3 > 0) {
            if (i < i2) {
                i2 -= C5729a.m12431D(C5729a.m12431D(i2, i3) - C5729a.m12431D(i, i3), i3);
            }
        } else {
            if (i3 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                int i4 = -i3;
                i2 += C5729a.m12431D(C5729a.m12431D(i, i4) - C5729a.m12431D(i2, i4), i4);
            }
        }
        this.f29432h = i2;
        this.f29433i = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Progressions) {
            if (!isEmpty() || !((Progressions) obj).isEmpty()) {
                Progressions progressions = (Progressions) obj;
                if (this.f29431g != progressions.f29431g || this.f29432h != progressions.f29432h || this.f29433i != progressions.f29433i) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f29431g * 31) + this.f29432h) * 31) + this.f29433i;
    }

    public boolean isEmpty() {
        if (this.f29433i > 0) {
            if (this.f29431g > this.f29432h) {
                return true;
            }
        } else if (this.f29431g < this.f29432h) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return new ProgressionIterators(this.f29431g, this.f29432h, this.f29433i);
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.f29433i > 0) {
            sb = new StringBuilder();
            sb.append(this.f29431g);
            sb.append("..");
            sb.append(this.f29432h);
            sb.append(" step ");
            i = this.f29433i;
        } else {
            sb = new StringBuilder();
            sb.append(this.f29431g);
            sb.append(" downTo ");
            sb.append(this.f29432h);
            sb.append(" step ");
            i = -this.f29433i;
        }
        sb.append(i);
        return sb.toString();
    }
}
