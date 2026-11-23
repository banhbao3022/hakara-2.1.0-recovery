package p007c.p085g.p086a.p089m.p098v.p104i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p098v.p099d.BitmapResource;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawable;

/* JADX INFO: renamed from: c.g.a.m.v.i.c, reason: use source file name */
/* JADX INFO: compiled from: DrawableBytesTranscoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class DrawableBytesTranscoder implements ResourceTranscoder<Drawable, byte[]> {

    /* JADX INFO: renamed from: a */
    public final BitmapPool f3661a;

    /* JADX INFO: renamed from: b */
    public final ResourceTranscoder<Bitmap, byte[]> f3662b;

    /* JADX INFO: renamed from: c */
    public final ResourceTranscoder<GifDrawable, byte[]> f3663c;

    public DrawableBytesTranscoder(BitmapPool bitmapPool, ResourceTranscoder<Bitmap, byte[]> resourceTranscoder, ResourceTranscoder<GifDrawable, byte[]> resourceTranscoder2) {
        this.f3661a = bitmapPool;
        this.f3662b = resourceTranscoder;
        this.f3663c = resourceTranscoder2;
    }

    @Override // p007c.p085g.p086a.p089m.p098v.p104i.ResourceTranscoder
    /* JADX INFO: renamed from: a */
    public Resource2<byte[]> mo1934a(Resource2<Drawable> resource2, Options options) {
        Drawable drawable = resource2.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f3662b.mo1934a(BitmapResource.m1881e(((BitmapDrawable) drawable).getBitmap(), this.f3661a), options);
        }
        if (drawable instanceof GifDrawable) {
            return this.f3663c.mo1934a(resource2, options);
        }
        return null;
    }
}
