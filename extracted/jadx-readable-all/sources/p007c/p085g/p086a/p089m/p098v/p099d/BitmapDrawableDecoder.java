package p007c.p085g.p086a.p089m.p098v.p099d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;
import java.util.Objects;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.a, reason: use source file name */
/* JADX INFO: compiled from: BitmapDrawableDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableDecoder<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final ResourceDecoder<DataType, Bitmap> f3513a;

    /* JADX INFO: renamed from: b */
    public final Resources f3514b;

    public BitmapDrawableDecoder(Context context, ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        this(context.getResources(), resourceDecoder);
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(DataType datatype, Options options) throws IOException {
        return this.f3513a.mo1709a(datatype, options);
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<BitmapDrawable> mo1710b(DataType datatype, int i, int i2, Options options) throws IOException {
        return LazyBitmapDrawableResource.m1914e(this.f3514b, this.f3513a.mo1710b(datatype, i, i2, options));
    }

    @Deprecated
    public BitmapDrawableDecoder(Resources resources, BitmapPool bitmapPool, ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        this(resources, resourceDecoder);
    }

    public BitmapDrawableDecoder(Resources resources, ResourceDecoder<DataType, Bitmap> resourceDecoder) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f3514b = resources;
        Objects.requireNonNull(resourceDecoder, "Argument must not be null");
        this.f3513a = resourceDecoder;
    }
}
