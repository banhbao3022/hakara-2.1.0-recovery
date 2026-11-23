package p477d1.p483s;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p498z.Random;

/* JADX INFO: renamed from: d1.s.h, reason: use source file name */
/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes.dex */
public class _Arrays extends _ArraysJvm {
    /* JADX INFO: renamed from: f */
    public static final <T> int m13032f(T[] tArr) {
        Intrinsics2.m13089e(tArr, "$this$lastIndex");
        return tArr.length - 1;
    }

    /* JADX INFO: renamed from: g */
    public static final int m13033g(int[] iArr, Random random) {
        Intrinsics2.m13089e(iArr, "$this$random");
        Intrinsics2.m13089e(random, "random");
        if (iArr.length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        return iArr[random.mo13105c(iArr.length)];
    }

    /* JADX INFO: renamed from: h */
    public static final char m13034h(char[] cArr) {
        Intrinsics2.m13089e(cArr, "$this$single");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    /* JADX INFO: renamed from: i */
    public static final <T> List<T> m13035i(T[] tArr) {
        Intrinsics2.m13089e(tArr, "$this$toMutableList");
        Intrinsics2.m13089e(tArr, "$this$asCollection");
        return new ArrayList(new Collections(tArr, false));
    }
}
