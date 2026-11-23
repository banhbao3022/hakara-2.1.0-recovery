package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.j, reason: use source file name */
/* JADX INFO: compiled from: CenterInside.java */
/* JADX INFO: loaded from: classes.dex */
public class CenterInside extends BitmapTransformation {

    /* JADX INFO: renamed from: b */
    public static final byte[] f3545b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(Key.f3032a);

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        messageDigest.update(f3545b);
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p099d.BitmapTransformation
    /* JADX INFO: renamed from: c */
    public Bitmap mo1882c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        Paint paint = TransformationUtils.f3521a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return TransformationUtils.m1875b(bitmapPool, bitmap, i, i2);
        }
        if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        }
        Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        return bitmap;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        return obj instanceof CenterInside;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return -670243078;
    }
}
