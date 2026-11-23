package p007c.p056c.p057a.p066e0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.os.Build;
import java.io.Closeable;
import p007c.p056c.p057a.L;

/* JADX INFO: renamed from: c.c.a.e0.h, reason: use source file name */
/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes.dex */
public final class Utils {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<PathMeasure> f2337a = new a();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<Path> f2338b = new b();

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal<Path> f2339c = new c();

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal<float[]> f2340d = new d();

    /* JADX INFO: renamed from: e */
    public static final float f2341e = (float) (Math.sqrt(2.0d) / 2.0d);

    /* JADX INFO: renamed from: f */
    public static float f2342f = -1.0f;

    /* JADX INFO: renamed from: c.c.a.e0.h$a */
    /* JADX INFO: compiled from: Utils.java */
    public class a extends ThreadLocal<PathMeasure> {
        @Override // java.lang.ThreadLocal
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* JADX INFO: renamed from: c.c.a.e0.h$b */
    /* JADX INFO: compiled from: Utils.java */
    public class b extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: c.c.a.e0.h$c */
    /* JADX INFO: compiled from: Utils.java */
    public class c extends ThreadLocal<Path> {
        @Override // java.lang.ThreadLocal
        public Path initialValue() {
            return new Path();
        }
    }

    /* JADX INFO: renamed from: c.c.a.e0.h$d */
    /* JADX INFO: compiled from: Utils.java */
    public class d extends ThreadLocal<float[]> {
        @Override // java.lang.ThreadLocal
        public float[] initialValue() {
            return new float[4];
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1437a(Path path, float f, float f2, float f3) {
        PathMeasure pathMeasure = f2337a.get();
        Path path2 = f2338b.get();
        Path path3 = f2339c.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            L.m1365a("applyTrimPathIfNeeded");
            return;
        }
        if (length < 1.0f || Math.abs((f2 - f) - 1.0f) < 0.01d) {
            L.m1365a("applyTrimPathIfNeeded");
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float fMin = Math.min(f4, f5) + f6;
        float fMax = Math.max(f4, f5) + f6;
        if (fMin >= length && fMax >= length) {
            fMin = MiscUtils.m1434d(fMin, length);
            fMax = MiscUtils.m1434d(fMax, length);
        }
        if (fMin < 0.0f) {
            fMin = MiscUtils.m1434d(fMin, length);
        }
        if (fMax < 0.0f) {
            fMax = MiscUtils.m1434d(fMax, length);
        }
        if (fMin == fMax) {
            path.reset();
            L.m1365a("applyTrimPathIfNeeded");
            return;
        }
        if (fMin >= fMax) {
            fMin -= length;
        }
        path2.reset();
        pathMeasure.getSegment(fMin, fMax, path2, true);
        if (fMax > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, fMax % length, path3, true);
            path2.addPath(path3);
        } else if (fMin < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(fMin + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        L.m1365a("applyTrimPathIfNeeded");
    }

    /* JADX INFO: renamed from: b */
    public static void m1438b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static float m1439c() {
        if (f2342f == -1.0f) {
            f2342f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f2342f;
    }

    /* JADX INFO: renamed from: d */
    public static float m1440d(Matrix matrix) {
        float[] fArr = f2340d.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = f2341e;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap m1441e(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    /* JADX INFO: renamed from: f */
    public static void m1442f(Canvas canvas, RectF rectF, Paint paint, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        L.m1365a("Utils#saveLayer");
    }
}
