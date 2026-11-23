package p007c.p008a.p009a.p010a;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p154j.p158j.DefaultHttpClient;
import p007c.p154j.p158j.HttpClient;
import p007c.p154j.p159k.ComponentHolder;
import p007c.p154j.p161l.DownloadRequest;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.ResourcesCompat;

/* JADX INFO: renamed from: c.a.a.a.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0244f {
    /* JADX INFO: renamed from: a */
    public static float[] m1012a(float[] fArr, float[] fArr2, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i * i2; i4++) {
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = (i4 * i3) + i5;
                fArr[i6] = fArr[i6] + fArr2[i5];
            }
        }
        return fArr;
    }

    /* JADX INFO: renamed from: b */
    public static final String m1013b(String str) throws Exception {
        int i;
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(str)), 1024);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            do {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    messageDigest.update(bArr, 0, i);
                }
            } while (i != -1);
            String string = new BigInteger(1, messageDigest.digest()).toString(16);
            bufferedInputStream.close();
            return string;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static float[] m1014c(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[fArr.length + fArr2.length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        return fArr3;
    }

    /* JADX INFO: renamed from: d */
    public static float[] m1015d(float[] fArr, float[] fArr2, int i, int i2, int i3, int i4, int i5) {
        int i6 = (i2 - i4) + 1;
        float[] fArr3 = new float[i * i6 * i5];
        for (int i7 = 0; i7 < i; i7++) {
            for (int i8 = 0; i8 < i5; i8++) {
                for (int i9 = 0; i9 < i6; i9++) {
                    float f = 0.0f;
                    for (int i10 = 0; i10 < i4; i10++) {
                        for (int i11 = 0; i11 < i3; i11++) {
                            f += fArr[((i10 + i9) * i3) + (i2 * i3 * i7) + i11] * fArr2[(((i10 * i3) + i11) * i5) + i8];
                        }
                    }
                    fArr3[outline.m1591m(i9, i5, i5 * i6 * i7, i8)] = f;
                }
            }
        }
        return fArr3;
    }

    /* JADX INFO: renamed from: e */
    public static float[] m1016e(float[] fArr, float[] fArr2, float[] fArr3, int i, int i2, int i3) {
        float[] fArr4 = new float[i * i3];
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = (i4 * i3) + i5;
                fArr4[i6] = 0.0f;
                for (int i7 = 0; i7 < i2; i7++) {
                    fArr4[i6] = (fArr[(i4 * i2) + i7] * fArr2[(i7 * i3) + i5]) + fArr4[i6];
                }
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            for (int i9 = 0; i9 < i3; i9++) {
                int i10 = (i8 * i3) + i9;
                fArr4[i10] = fArr4[i10] + fArr3[i9];
            }
        }
        return fArr4;
    }

    /* JADX INFO: renamed from: f */
    public static String m1017f(String str, String str2) {
        return outline.m1550A(outline.m1556G(str), File.separator, str2);
    }

    /* JADX INFO: renamed from: g */
    public static HttpClient m1018g(HttpClient httpClient, DownloadRequest downloadRequest) throws IllegalAccessException, IOException {
        DefaultHttpClient defaultHttpClient = (DefaultHttpClient) httpClient;
        int iM2227b = defaultHttpClient.m2227b();
        String headerField = defaultHttpClient.f4429f.getHeaderField("Location");
        int i = 0;
        HttpClient httpClient2 = defaultHttpClient;
        while (true) {
            if (!(iM2227b == 301 || iM2227b == 302 || iM2227b == 303 || iM2227b == 300 || iM2227b == 307 || iM2227b == 308)) {
                return httpClient2;
            }
            if (headerField == null) {
                throw new IllegalAccessException("Location is null");
            }
            downloadRequest.f4458b = headerField;
            HttpClient httpClientM2229b = ComponentHolder.f4430a.m2229b();
            DefaultHttpClient defaultHttpClient2 = (DefaultHttpClient) httpClientM2229b;
            defaultHttpClient2.m2226a(downloadRequest);
            int iM2227b2 = defaultHttpClient2.m2227b();
            String headerField2 = defaultHttpClient2.f4429f.getHeaderField("Location");
            i++;
            if (i >= 10) {
                throw new IllegalAccessException("Max redirection done");
            }
            headerField = headerField2;
            iM2227b = iM2227b2;
            httpClient2 = httpClientM2229b;
        }
    }

    /* JADX INFO: renamed from: h */
    public static String m1019h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sbM1556G = outline.m1556G(str);
        sbM1556G.append(File.separator);
        sbM1556G.append(str2);
        sb.append(sbM1556G.toString());
        sb.append(".temp");
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m1020i(Context context) {
        Intrinsics2.m13089e(context, "$this$isDeviceTV");
        Object systemService = context.getSystemService("uimode");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.UiModeManager");
        return ((UiModeManager) systemService).getCurrentModeType() == 4;
    }

    /* JADX INFO: renamed from: j */
    public static float[] m1021j(float[] fArr, int i, int i2, int i3) {
        int i4 = (i - i3) + 1;
        float[] fArr2 = new float[i4 * i2];
        for (int i5 = 0; i5 < i2; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                for (int i7 = i6; i7 < i6 + i3; i7++) {
                    int i8 = (i6 * i2) + i5;
                    fArr2[i8] = Math.max(fArr2[i8], fArr[(i7 * i2) + i5]);
                }
            }
        }
        return fArr2;
    }

    /* JADX INFO: renamed from: k */
    public static final String m1022k(long j2) {
        if (j2 < 0) {
            return "--:--";
        }
        long j3 = (j2 % 60000) / 1000;
        long j4 = (j2 % 3600000) / 60000;
        long j5 = (j2 % 86400000) / 3600000;
        if (j5 > 0) {
            String str = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j4), Long.valueOf(j3)}, 3));
            Intrinsics2.m13088d(str, "java.lang.String.format(this, *args)");
            return str;
        }
        String str2 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j3)}, 2));
        Intrinsics2.m13088d(str2, "java.lang.String.format(this, *args)");
        return str2;
    }

    /* JADX INFO: renamed from: l */
    public static void m1023l(float[] fArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (fArr[i2] < 0.0f) {
                fArr[i2] = 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m1024m(String str, String str2) throws IOException {
        File file = new File(str);
        try {
            File file2 = new File(str2);
            if (file2.exists() && !file2.delete()) {
                throw new IOException("Deletion Failed");
            }
            if (!file.renameTo(file2)) {
                throw new IOException("Rename Failed");
            }
            if (file.exists()) {
                file.delete();
            }
        } catch (Throwable th) {
            if (file.exists()) {
                file.delete();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public static final Drawable m1025n(Context context, int i, int i2) {
        ColorStateList colorStateListM14706a;
        Intrinsics2.m13089e(context, "$this$tintListCompat");
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f37835a;
        Drawable drawable = resources.getDrawable(i, theme);
        Intrinsics2.m13087c(drawable);
        Drawable drawableMutate = drawable.mutate();
        Intrinsics2.m13088d(drawableMutate, "ResourcesCompat.getDrawa…bleRes, theme)!!.mutate()");
        Intrinsics2.m13089e(context, "$this$tintListCompat");
        Intrinsics2.m13089e(drawableMutate, "drawable");
        Drawable drawableM16054Y = C8162a.m16054Y(drawableMutate);
        Intrinsics2.m13089e(context, "$this$getColorStateListCompat");
        if (Build.VERSION.SDK_INT >= 23) {
            colorStateListM14706a = context.getResources().getColorStateList(i2, context.getTheme());
            Intrinsics2.m13088d(colorStateListM14706a, "resources.getColorStateList(colorRes, theme)");
        } else {
            colorStateListM14706a = AppCompatResources.m14706a(context, i2);
            Intrinsics2.m13088d(colorStateListM14706a, "AppCompatResources.getCo…StateList(this, colorRes)");
        }
        drawableM16054Y.setTintList(colorStateListM14706a);
        Intrinsics2.m13088d(drawableM16054Y, "DrawableCompat\n        .…istCompat(tintListRes)) }");
        return drawableM16054Y;
    }

    /* JADX INFO: renamed from: o */
    public static float[] m1026o(float[] fArr, int i, int i2) {
        float[] fArr2 = new float[i * i2];
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                fArr2[(i4 * i) + i3] = fArr[(i3 * i2) + i4];
            }
        }
        return fArr2;
    }

    /* JADX INFO: renamed from: p */
    public static float[] m1027p(float[] fArr, int i, int i2, int i3) {
        float[] fArr2 = new float[i * i2 * i3];
        for (int i4 = 0; i4 < i; i4++) {
            for (int i5 = 0; i5 < i2; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    fArr2[outline.m1591m(i5, i, i6 * i * i2, i4)] = fArr[outline.m1591m(i5, i3, i4 * i2 * i3, i6)];
                }
            }
        }
        return fArr2;
    }
}
