package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.i, reason: use source file name */
/* JADX INFO: compiled from: CenterCrop.java */
/* JADX INFO: loaded from: classes.dex */
public class CenterCrop extends BitmapTransformation {

    /* JADX INFO: renamed from: b */
    public static final byte[] f3544b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(Key.f3032a);

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        messageDigest.update(f3544b);
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p099d.BitmapTransformation
    /* JADX INFO: renamed from: c */
    public Bitmap mo1882c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        Paint paint = TransformationUtils.f3521a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo1753e = bitmapPool.mo1753e(i, i2, TransformationUtils.m1878e(bitmap));
        bitmapMo1753e.setHasAlpha(bitmap.hasAlpha());
        TransformationUtils.m1874a(bitmap, bitmapMo1753e, matrix);
        return bitmapMo1753e;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        return obj instanceof CenterCrop;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return -599754482;
    }
}
