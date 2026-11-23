package p007c.p190n.p378c.p381c;

import java.math.RoundingMode;

/* JADX INFO: renamed from: c.n.c.c.a, reason: use source file name */
/* JADX INFO: compiled from: LongMath.java */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class LongMath {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f26293a;

    static {
        int[] iArr = new int[RoundingMode.values().length];
        f26293a = iArr;
        try {
            iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26293a[RoundingMode.DOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26293a[RoundingMode.FLOOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f26293a[RoundingMode.UP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26293a[RoundingMode.CEILING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f26293a[RoundingMode.HALF_DOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f26293a[RoundingMode.HALF_UP.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f26293a[RoundingMode.HALF_EVEN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
    }
}
