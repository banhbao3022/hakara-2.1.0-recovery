package p007c.p056c.p057a.p064d0;

import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.io.IOException;
import java.lang.ref.WeakReference;
import p007c.p056c.p057a.LottieComposition;
import p007c.p056c.p057a.p064d0.p065h0.JsonReader;
import p007c.p056c.p057a.p066e0.MiscUtils;
import p007c.p056c.p057a.p066e0.Utils;
import p007c.p056c.p057a.p067f0.Keyframe;
import p636z0.p691g.SparseArrayCompat;

/* JADX INFO: renamed from: c.c.a.d0.p, reason: use source file name */
/* JADX INFO: compiled from: KeyframeParser.java */
/* JADX INFO: loaded from: classes.dex */
public class KeyframeParser {

    /* JADX INFO: renamed from: b */
    public static SparseArrayCompat<WeakReference<Interpolator>> f2302b;

    /* JADX INFO: renamed from: a */
    public static final Interpolator f2301a = new LinearInterpolator();

    /* JADX INFO: renamed from: c */
    public static JsonReader.a f2303c = JsonReader.a.m1394a("t", "s", "e", "o", "i", "h", "to", "ti");

    /* JADX WARN: Code duplicated, block: B:80:0x0132 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static <T> Keyframe<T> m1409a(JsonReader jsonReader, LottieComposition lottieComposition, float f, ValueParser<T> valueParser, boolean z) throws IOException {
        Interpolator linearInterpolator;
        T t;
        WeakReference<Interpolator> weakReferenceM15617g;
        PathInterpolator pathInterpolator;
        WeakReference<Interpolator> weakReference;
        if (!z) {
            return new Keyframe<>(valueParser.mo1374a(jsonReader, f));
        }
        jsonReader.mo1384c();
        int i = 1;
        PointF pointFM1406b = null;
        PointF pointFM1406b2 = null;
        T tMo1374a = null;
        T tMo1374a2 = null;
        PointF pointFM1406b3 = null;
        PointF pointFM1406b4 = null;
        boolean z2 = false;
        float fMo1379H = 0.0f;
        while (jsonReader.mo1377B()) {
            switch (jsonReader.mo1389n0(f2303c)) {
                case 0:
                    fMo1379H = (float) jsonReader.mo1379H();
                    break;
                case 1:
                    tMo1374a2 = valueParser.mo1374a(jsonReader, f);
                    continue;
                case 2:
                    tMo1374a = valueParser.mo1374a(jsonReader, f);
                    continue;
                case 3:
                    pointFM1406b = JsonUtils.m1406b(jsonReader, f);
                    continue;
                case 4:
                    pointFM1406b2 = JsonUtils.m1406b(jsonReader, f);
                    continue;
                case 5:
                    if (jsonReader.mo1380O() == i) {
                        z2 = true;
                    } else {
                        z2 = false;
                        continue;
                    }
                    break;
                case 6:
                    pointFM1406b4 = JsonUtils.m1406b(jsonReader, f);
                    continue;
                case 7:
                    pointFM1406b3 = JsonUtils.m1406b(jsonReader, f);
                    continue;
                default:
                    jsonReader.mo1392u0();
                    break;
            }
            i = 1;
        }
        jsonReader.mo1388h();
        if (z2) {
            linearInterpolator = f2301a;
            t = tMo1374a2;
        } else {
            if (pointFM1406b == null || pointFM1406b2 == null) {
                linearInterpolator = f2301a;
            } else {
                float f2 = -f;
                pointFM1406b.x = MiscUtils.m1432b(pointFM1406b.x, f2, f);
                pointFM1406b.y = MiscUtils.m1432b(pointFM1406b.y, -100.0f, 100.0f);
                pointFM1406b2.x = MiscUtils.m1432b(pointFM1406b2.x, f2, f);
                float fM1432b = MiscUtils.m1432b(pointFM1406b2.y, -100.0f, 100.0f);
                pointFM1406b2.y = fM1432b;
                float f3 = pointFM1406b.x;
                float f4 = pointFM1406b.y;
                float f5 = pointFM1406b2.x;
                ThreadLocal<PathMeasure> threadLocal = Utils.f2337a;
                int i2 = f3 != 0.0f ? (int) (527 * f3) : 17;
                if (f4 != 0.0f) {
                    i2 = (int) (i2 * 31 * f4);
                }
                if (f5 != 0.0f) {
                    i2 = (int) (i2 * 31 * f5);
                }
                if (fM1432b != 0.0f) {
                    i2 = (int) (i2 * 31 * fM1432b);
                }
                synchronized (KeyframeParser.class) {
                    if (f2302b == null) {
                        f2302b = new SparseArrayCompat<>();
                    }
                    weakReferenceM15617g = f2302b.m15617g(i2, null);
                }
                linearInterpolator = weakReferenceM15617g != null ? weakReferenceM15617g.get() : null;
                if (weakReferenceM15617g == null || linearInterpolator == null) {
                    pointFM1406b.x /= f;
                    pointFM1406b.y /= f;
                    float f6 = pointFM1406b2.x / f;
                    pointFM1406b2.x = f6;
                    float f7 = pointFM1406b2.y / f;
                    pointFM1406b2.y = f7;
                    try {
                        try {
                            pathInterpolator = new PathInterpolator(pointFM1406b.x, pointFM1406b.y, f6, f7);
                        } catch (IllegalArgumentException e) {
                            if (e.getMessage().equals("The Path cannot loop back on itself.")) {
                                pathInterpolator = new PathInterpolator(Math.min(pointFM1406b.x, 1.0f), pointFM1406b.y, Math.max(pointFM1406b2.x, 0.0f), pointFM1406b2.y);
                            } else {
                                linearInterpolator = new LinearInterpolator();
                            }
                            weakReference = new WeakReference<>(linearInterpolator);
                            synchronized (KeyframeParser.class) {
                                f2302b.m15619j(i2, weakReference);
                                t = tMo1374a;
                                Keyframe<T> keyframe = new Keyframe<>(lottieComposition, tMo1374a2, t, linearInterpolator, fMo1379H, null);
                                keyframe.f2370m = pointFM1406b4;
                                keyframe.f2371n = pointFM1406b3;
                                return keyframe;
                            }
                        }
                        weakReference = new WeakReference<>(linearInterpolator);
                        synchronized (KeyframeParser.class) {
                            f2302b.m15619j(i2, weakReference);
                        }
                    } catch (ArrayIndexOutOfBoundsException unused) {
                    }
                    linearInterpolator = pathInterpolator;
                }
            }
            t = tMo1374a;
        }
        Keyframe<T> keyframe2 = new Keyframe<>(lottieComposition, tMo1374a2, t, linearInterpolator, fMo1379H, null);
        keyframe2.f2370m = pointFM1406b4;
        keyframe2.f2371n = pointFM1406b3;
        return keyframe2;
    }
}
