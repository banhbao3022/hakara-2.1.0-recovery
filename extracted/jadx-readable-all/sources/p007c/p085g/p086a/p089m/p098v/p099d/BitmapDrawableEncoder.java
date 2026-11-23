package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;
import p007c.p085g.p086a.p089m.EncodeStrategy;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceEncoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;

/* JADX INFO: renamed from: c.g.a.m.v.d.b, reason: use source file name */
/* JADX INFO: compiled from: BitmapDrawableEncoder.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableEncoder implements ResourceEncoder<BitmapDrawable> {

    /* JADX INFO: renamed from: a */
    public final BitmapPool f3519a;

    /* JADX INFO: renamed from: b */
    public final ResourceEncoder<Bitmap> f3520b;

    public BitmapDrawableEncoder(BitmapPool bitmapPool, ResourceEncoder<Bitmap> resourceEncoder) {
        this.f3519a = bitmapPool;
        this.f3520b = resourceEncoder;
    }

    @Override // p007c.p085g.p086a.p089m.Encoder
    /* JADX INFO: renamed from: a */
    public boolean mo1700a(Object obj, File file, Options options) {
        return this.f3520b.mo1700a((Bitmap) new BitmapResource(((BitmapDrawable) ((Resource2) obj).get()).getBitmap(), this.f3519a), file, options);
    }

    @Override // p007c.p085g.p086a.p089m.ResourceEncoder
    /* JADX INFO: renamed from: b */
    public EncodeStrategy mo1711b(Options options) {
        return this.f3520b.mo1711b(options);
    }
}
