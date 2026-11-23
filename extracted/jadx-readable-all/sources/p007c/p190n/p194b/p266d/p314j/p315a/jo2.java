package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Build;
import java.util.Arrays;
import java.util.regex.Pattern;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jo2 {

    /* JADX INFO: renamed from: a */
    public static final int f15673a;

    /* JADX INFO: renamed from: b */
    public static final String f15674b;

    /* JADX INFO: renamed from: c */
    public static final String f15675c;

    /* JADX INFO: renamed from: d */
    public static final String f15676d;

    /* JADX INFO: renamed from: e */
    public static final String f15677e;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i == 25 && Build.VERSION.CODENAME.charAt(0) == 'O') {
            i = 26;
        }
        f15673a = i;
        String str = Build.DEVICE;
        f15674b = str;
        String str2 = Build.MANUFACTURER;
        f15675c = str2;
        String str3 = Build.MODEL;
        f15676d = str3;
        StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(str).length(), 17, String.valueOf(str3).length(), String.valueOf(str2).length()));
        outline.m1572W(sb, str, ", ", str3, ", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i);
        f15677e = sb.toString();
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
    }

    /* JADX INFO: renamed from: a */
    public static boolean m7369a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* JADX INFO: renamed from: b */
    public static int m7370b(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* JADX INFO: renamed from: c */
    public static int m7371c(long[] jArr, long j2, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i = -(iBinarySearch + 2);
        } else {
            do {
                iBinarySearch--;
                if (iBinarySearch < 0) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i = iBinarySearch + 1;
        }
        return z2 ? Math.max(0, i) : i;
    }

    /* JADX INFO: renamed from: d */
    public static int m7372d(long[] jArr, long j2, boolean z, boolean z2) {
        int i;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i = ~iBinarySearch;
        } else {
            do {
                iBinarySearch++;
                if (iBinarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[iBinarySearch] == j2);
            i = z ? iBinarySearch - 1 : iBinarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i) : i;
    }

    /* JADX INFO: renamed from: e */
    public static long m7373e(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        return (long) ((j3 / j4) * j2);
    }

    /* JADX INFO: renamed from: f */
    public static void m7374f(long[] jArr, long j2) {
        int i = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
            return;
        }
        if (j2 >= 1000000 || 1000000 % j2 != 0) {
            double d = 1000000.0d / j2;
            while (i < jArr.length) {
                jArr[i] = (long) (jArr[i] * d);
                i++;
            }
            return;
        }
        long j4 = 1000000 / j2;
        while (i < jArr.length) {
            jArr[i] = jArr[i] * j4;
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m7375g(String str) {
        int length = str.length();
        C2622l.m5366f1(length <= 4);
        int iCharAt = 0;
        for (int i = 0; i < length; i++) {
            iCharAt = (iCharAt << 8) | str.charAt(i);
        }
        return iCharAt;
    }

    /* JADX INFO: renamed from: h */
    public static int m7376h(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: i */
    public static int m7377i(int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return i2 * 3;
        }
        if (i == 1073741824) {
            return i2 * 4;
        }
        if (i == 2) {
            return i2 + i2;
        }
        if (i == 3) {
            return i2;
        }
        throw new IllegalArgumentException();
    }
}
