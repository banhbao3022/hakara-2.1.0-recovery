package p007c.p085g.p086a.p089m.p098v.p099d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.p, reason: use source file name */
/* JADX INFO: compiled from: DrawableTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public class DrawableTransformation implements Transformation<Drawable> {

    /* JADX INFO: renamed from: b */
    public final Transformation<Bitmap> f3573b;

    /* JADX INFO: renamed from: c */
    public final boolean f3574c;

    public DrawableTransformation(Transformation<Bitmap> transformation, boolean z) {
        this.f3573b = transformation;
        this.f3574c = z;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        this.f3573b.mo1703a(messageDigest);
    }

    @Override // p007c.p085g.p086a.p089m.Transformation
    /* JADX INFO: renamed from: b */
    public Resource2<Drawable> mo1704b(Context context, Resource2<Drawable> resource2, int i, int i2) {
        BitmapPool bitmapPool = Glide.m1624b(context).f2856h;
        Drawable drawable = resource2.get();
        Resource2<Bitmap> resource2M1907a = DrawableToBitmapConverter.m1907a(bitmapPool, drawable, i, i2);
        if (resource2M1907a != null) {
            Resource2<Bitmap> resource2Mo1704b = this.f3573b.mo1704b(context, resource2M1907a, i, i2);
            if (!resource2Mo1704b.equals(resource2M1907a)) {
                return LazyBitmapDrawableResource.m1914e(context.getResources(), resource2Mo1704b);
            }
            resource2Mo1704b.mo1830b();
            return resource2;
        }
        if (!this.f3574c) {
            return resource2;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (obj instanceof DrawableTransformation) {
            return this.f3573b.equals(((DrawableTransformation) obj).f3573b);
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return this.f3573b.hashCode();
    }
}
