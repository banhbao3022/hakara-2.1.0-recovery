package p469c1.p470a.p471a.p472a;

import android.content.Context;
import android.graphics.Bitmap;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p098v.p099d.BitmapResource;
import p007c.p085g.p086a.p112s.Util4;

/* JADX INFO: renamed from: c1.a.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: BitmapTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BitmapTransformation2 implements Transformation<Bitmap> {
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
        int i3 = i;
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapMo12545c = mo12545c(context.getApplicationContext(), bitmapPool, bitmap, i3, i2);
        return bitmap.equals(bitmapMo12545c) ? resource2 : BitmapResource.m1881e(bitmapMo12545c, bitmapPool);
    }

    /* JADX INFO: renamed from: c */
    public abstract Bitmap mo12545c(Context context, BitmapPool bitmapPool, Bitmap bitmap, int i, int i2);
}
