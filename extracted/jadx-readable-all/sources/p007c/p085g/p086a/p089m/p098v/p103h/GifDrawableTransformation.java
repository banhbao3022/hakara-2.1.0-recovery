package p007c.p085g.p086a.p089m.p098v.p103h;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;
import java.util.Objects;
import p007c.p085g.p086a.Glide;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p098v.p099d.BitmapResource;

/* JADX INFO: renamed from: c.g.a.m.v.h.f, reason: use source file name */
/* JADX INFO: compiled from: GifDrawableTransformation.java */
/* JADX INFO: loaded from: classes.dex */
public class GifDrawableTransformation implements Transformation<GifDrawable> {

    /* JADX INFO: renamed from: b */
    public final Transformation<Bitmap> f3629b;

    public GifDrawableTransformation(Transformation<Bitmap> transformation) {
        Objects.requireNonNull(transformation, "Argument must not be null");
        this.f3629b = transformation;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    /* JADX INFO: renamed from: a */
    public void mo1703a(MessageDigest messageDigest) {
        this.f3629b.mo1703a(messageDigest);
    }

    @Override // p007c.p085g.p086a.p089m.Transformation
    /* JADX INFO: renamed from: b */
    public Resource2<GifDrawable> mo1704b(Context context, Resource2<GifDrawable> resource2, int i, int i2) {
        GifDrawable gifDrawable = resource2.get();
        Resource2<Bitmap> bitmapResource = new BitmapResource(gifDrawable.m1925b(), Glide.m1624b(context).f2856h);
        Resource2<Bitmap> resource2Mo1704b = this.f3629b.mo1704b(context, bitmapResource, i, i2);
        if (!bitmapResource.equals(resource2Mo1704b)) {
            bitmapResource.mo1830b();
        }
        Bitmap bitmap = resource2Mo1704b.get();
        gifDrawable.f3618f.f3628a.m1931c(this.f3629b, bitmap);
        return resource2;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public boolean equals(Object obj) {
        if (obj instanceof GifDrawableTransformation) {
            return this.f3629b.equals(((GifDrawableTransformation) obj).f3629b);
        }
        return false;
    }

    @Override // p007c.p085g.p086a.p089m.Key
    public int hashCode() {
        return this.f3629b.hashCode();
    }
}
