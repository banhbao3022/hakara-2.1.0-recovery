package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.concurrent.locks.Lock;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p112s.Util4;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.v.d.z, reason: use source file name */
/* JADX INFO: compiled from: RoundedCorners.java */
/* JADX INFO: loaded from: classes.dex */
public final class RoundedCorners extends BitmapTransformation {

    /* JADX INFO: renamed from: b */
    public static final byte[] f3601b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(Key.f3032a);

    /* JADX INFO: renamed from: c */
    public final int f3602c;

    public RoundedCorners(int i) {
        C8462c.m16935b(i > 0, "roundingRadius must be greater than 0.");
        this.f3602c = i;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        messageDigest.update(f3601b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3602c).array());
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p099d.BitmapTransformation
    /* JADX INFO: renamed from: c */
    public Bitmap mo1882c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        int i3 = this.f3602c;
        Paint paint = TransformationUtils.f3521a;
        C8462c.m16935b(i3 > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config configM1877d = TransformationUtils.m1877d(bitmap);
        Bitmap bitmapM1876c = TransformationUtils.m1876c(bitmapPool, bitmap);
        Bitmap bitmapMo1753e = bitmapPool.mo1753e(bitmapM1876c.getWidth(), bitmapM1876c.getHeight(), configM1877d);
        bitmapMo1753e.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapM1876c, tileMode, tileMode);
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapMo1753e.getWidth(), bitmapMo1753e.getHeight());
        Lock lock = TransformationUtils.f3525e;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapMo1753e);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = i3;
            canvas.drawRoundRect(rectF, f, f, paint2);
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
        return (obj instanceof RoundedCorners) && this.f3602c == ((RoundedCorners) obj).f3602c;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        int i = this.f3602c;
        char[] cArr = Util4.f3828a;
        return ((i + 527) * 31) - 569625254;
    }
}
