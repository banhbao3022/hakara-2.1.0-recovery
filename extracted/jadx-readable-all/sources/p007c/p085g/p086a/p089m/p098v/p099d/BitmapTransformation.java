package p007c.p085g.p086a.p089m.p098v.p099d;

import android.content.Context;
import android.graphics.Bitmap;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c.g.a.m.v.d.f, reason: use source file name */
/* JADX INFO: compiled from: BitmapTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BitmapTransformation implements Transformation<Bitmap> {
    @Override // p007c.p085g.p086a.p089m.Transformation
    /* JADX INFO: renamed from: b */
    public final Resource2<Bitmap> mo1704b(Context context, Resource2<Bitmap> resource2, int i, int i2) {
        if (!Util4.m2054i(i, i2)) {
            throw new IllegalArgumentException(outline.m1593o("Cannot apply transformation on width: ", i, " or height: ", i2, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        BitmapPool bitmapPool = Glide.m1624b(context).f2856h;
        Bitmap bitmap = resource2.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo1882c = mo1882c(bitmapPool, bitmap, i, i2);
        return bitmap.equals(bitmapMo1882c) ? resource2 : BitmapResource.m1881e(bitmapMo1882c, bitmapPool);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo1882c(BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);
}
