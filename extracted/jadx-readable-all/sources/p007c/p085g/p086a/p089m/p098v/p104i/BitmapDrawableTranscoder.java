package p007c.p085g.p086a.p089m.p098v.p104i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Objects;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p098v.p099d.LazyBitmapDrawableResource;

/* JADX INFO: renamed from: c.g.a.m.v.i.b, reason: use source file name */
/* JADX INFO: compiled from: BitmapDrawableTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableTranscoder implements ResourceTranscoder<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final Resources f3660a;

    public BitmapDrawableTranscoder(Context context) {
        this(context.getResources());
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p104i.ResourceTranscoder
    /* JADX INFO: renamed from: a */
    public Resource2<BitmapDrawable> mo1934a(Resource2<Bitmap> resource2, Options options) {
        return LazyBitmapDrawableResource.m1914e(this.f3660a, resource2);
    }

    @Deprecated
    public BitmapDrawableTranscoder(Resources resources, BitmapPool bitmapPool) {
        this(resources);
    }

    public BitmapDrawableTranscoder(Resources resources) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f3660a = resources;
    }
}
