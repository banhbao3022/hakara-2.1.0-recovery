package p636z0.p725k.p729e;

import android.graphics.Color;

/* JADX INFO: renamed from: z0.k.e.a, reason: use source file name */
/* JADX INFO: compiled from: ColorUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class ColorUtils {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<double[]> f37849a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static double m16162a(int i) {
        ThreadLocal<double[]> threadLocal = f37849a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i);
        int iGreen = Color.green(i);
        int iBlue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) iRed) / 255.0d;
        double dPow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = ((double) iGreen) / 255.0d;
        double dPow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = ((double) iBlue) / 255.0d;
        double dPow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        dArr[1] = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return dArr[1] / 100.0d;
    }

    /* JADX INFO: renamed from: b */
    public static int m16163b(int i, int i2) {
        int iAlpha = Color.alpha(i2);
        int iAlpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - iAlpha2) * (255 - iAlpha)) / 255);
        return Color.argb(i3, m16164c(Color.red(i), iAlpha2, Color.red(i2), iAlpha, i3), m16164c(Color.green(i), iAlpha2, Color.green(i2), iAlpha, i3), m16164c(Color.blue(i), iAlpha2, Color.blue(i2), iAlpha, i3));
    }

    /* JADX INFO: renamed from: c */
    public static int m16164c(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((255 - i2) * (i3 * i4)) + ((i * 255) * i2)) / (i5 * 255);
    }

    /* JADX INFO: renamed from: d */
    public static int m16165d(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }
}
