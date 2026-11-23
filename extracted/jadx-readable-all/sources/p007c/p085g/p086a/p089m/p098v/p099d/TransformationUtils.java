package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.b0, reason: use source file name */
/* JADX INFO: compiled from: TransformationUtils.java */
/* JADX INFO: loaded from: classes.dex */
public final class TransformationUtils {

    /* JADX INFO: renamed from: a */
    public static final Paint f3521a = new Paint(6);

    /* JADX INFO: renamed from: b */
    public static final Paint f3522b = new Paint(7);

    /* JADX INFO: renamed from: c */
    public static final Paint f3523c;

    /* JADX INFO: renamed from: d */
    public static final Set<String> f3524d;

    /* JADX INFO: renamed from: e */
    public static final Lock f3525e;

    /* JADX INFO: renamed from: c.g.a.m.v.d.b0$a */
    /* JADX INFO: compiled from: TransformationUtils.java */
    public static final class a implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j2, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f3524d = hashSet;
        f3525e = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        f3523c = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: renamed from: a */
    public static void m1874a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        f3525e.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f3521a);
            canvas.setBitmap(null);
        } finally {
            f3525e.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m1875b(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
            return bitmap;
        }
        float fMin = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int iRound = Math.round(bitmap.getWidth() * fMin);
        int iRound2 = Math.round(bitmap.getHeight() * fMin);
        if (bitmap.getWidth() == iRound && bitmap.getHeight() == iRound2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "adjusted target size matches input, returning input");
            }
            return bitmap;
        }
        Bitmap bitmapMo1753e = bitmapPool.mo1753e((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), m1878e(bitmap));
        bitmapMo1753e.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "request: " + i + "x" + i2);
            Log.v("TransformationUtils", "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
            Log.v("TransformationUtils", "toReuse: " + bitmapMo1753e.getWidth() + "x" + bitmapMo1753e.getHeight());
            StringBuilder sb = new StringBuilder();
            sb.append("minPct:   ");
            sb.append(fMin);
            Log.v("TransformationUtils", sb.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(fMin, fMin);
        m1874a(bitmap, bitmapMo1753e, matrix);
        return bitmapMo1753e;
    }

    /* JADX INFO: renamed from: c */
    public static Bitmap m1876c(BitmapPool bitmapPool, Bitmap bitmap) {
        Bitmap.Config configM1877d = m1877d(bitmap);
        if (configM1877d.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapMo1753e = bitmapPool.mo1753e(bitmap.getWidth(), bitmap.getHeight(), configM1877d);
        new Canvas(bitmapMo1753e).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapMo1753e;
    }

    /* JADX INFO: renamed from: d */
    public static Bitmap.Config m1877d(Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    /* JADX INFO: renamed from: e */
    public static Bitmap.Config m1878e(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }
}
