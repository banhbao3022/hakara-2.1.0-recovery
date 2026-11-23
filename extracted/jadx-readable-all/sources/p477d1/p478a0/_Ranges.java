package p477d1.p478a0;

import java.util.Objects;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.a0.e, reason: use source file name */
/* JADX INFO: compiled from: _Ranges.kt */
/* JADX INFO: loaded from: classes.dex */
public class _Ranges extends Ranges2 {
    /* JADX INFO: renamed from: a */
    public static final long m12966a(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    /* JADX INFO: renamed from: b */
    public static final int m12967b(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX INFO: renamed from: c */
    public static final Progressions m12968c(int i, int i2) {
        Objects.requireNonNull(Progressions.f29430f);
        return new Progressions(i, i2, -1);
    }

    /* JADX INFO: renamed from: d */
    public static final Progressions m12969d(Progressions progressions, int i) {
        Intrinsics2.m13089e(progressions, "$this$step");
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        Intrinsics2.m13089e(numValueOf, "step");
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        Progressions.a aVar = Progressions.f29430f;
        int i2 = progressions.f29431g;
        int i3 = progressions.f29432h;
        if (progressions.f29433i <= 0) {
            i = -i;
        }
        Objects.requireNonNull(aVar);
        return new Progressions(i2, i3, i);
    }

    /* JADX INFO: renamed from: e */
    public static final Ranges m12970e(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new Ranges(i, i2 - 1);
        }
        Objects.requireNonNull(Ranges.f29439k);
        return Ranges.f29438j;
    }
}
