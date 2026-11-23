package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.k, reason: use source file name */
/* JADX INFO: compiled from: CircleCrop.java */
/* JADX INFO: loaded from: classes.dex */
public class CircleCrop extends BitmapTransformation {

    /* JADX INFO: renamed from: b */
    public static final byte[] f3546b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(Key.f3032a);

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        messageDigest.update(f3546b);
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p099d.BitmapTransformation
    /* JADX INFO: renamed from: c */
    public Bitmap mo1882c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Paint paint = TransformationUtils.f3521a;
        int iMin = Math.min(i, i2);
        float f = iMin;
        float f2 = f / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f / width, f / height);
        float f3 = width * fMax;
        float f4 = fMax * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap bitmapM1876c = TransformationUtils.m1876c(bitmapPool, bitmap);
        Bitmap bitmapMo1753e = bitmapPool.mo1753e(iMin, iMin, TransformationUtils.m1877d(bitmap));
        bitmapMo1753e.setHasAlpha(true);
        Lock lock = TransformationUtils.f3525e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo1753e);
            canvas.drawCircle(f2, f2, f2, TransformationUtils.f3522b);
            canvas.drawBitmap(bitmapM1876c, (Rect) null, rectF, TransformationUtils.f3523c);
            canvas.setBitmap(null);
            lock.unlock();
            if (!bitmapM1876c.equals(bitmap)) {
                bitmapPool.mo1752d(bitmapM1876c);
            }
            return bitmapMo1753e;
        } catch (Throwable th) {
            TransformationUtils.f3525e.unlock();
            throw th;
        }
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        return obj instanceof CircleCrop;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return 1101716364;
    }
}
