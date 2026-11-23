package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPoolAdapter;

/* JADX INFO: renamed from: c.g.a.m.v.d.o, reason: use source file name */
/* JADX INFO: compiled from: DrawableToBitmapConverter.java */
/* JADX INFO: loaded from: classes.dex */
public final class DrawableToBitmapConverter {

    /* JADX INFO: renamed from: a */
    public static final BitmapPool f3572a = new a();

    /* JADX INFO: renamed from: c.g.a.m.v.d.o$a */
    /* JADX INFO: compiled from: DrawableToBitmapConverter.java */
    public class a extends BitmapPoolAdapter {
        @Override // p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPoolAdapter, p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool
        /* JADX INFO: renamed from: d */
        public void mo1752d(Bitmap bitmap) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static Resource2<Bitmap> m1907a(BitmapPool bitmapPool, Drawable drawable, int i, int i2) {
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i2 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i2 = current.getIntrinsicHeight();
                    }
                    Lock lock = TransformationUtils.f3525e;
                    lock.lock();
                    Bitmap bitmapMo1753e = bitmapPool.mo1753e(i, i2, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(bitmapMo1753e);
                        current.setBounds(0, 0, i, i2);
                        current.draw(canvas);
                        canvas.setBitmap(null);
                        lock.unlock();
                        bitmap = bitmapMo1753e;
                    } catch (Throwable th) {
                        lock.unlock();
                        throw th;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            z = true;
        }
        if (!z) {
            bitmapPool = f3572a;
        }
        return BitmapResource.m1881e(bitmap, bitmapPool);
    }
}
