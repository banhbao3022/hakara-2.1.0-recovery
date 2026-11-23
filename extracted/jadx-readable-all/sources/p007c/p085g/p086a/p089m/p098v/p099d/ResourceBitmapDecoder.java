package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p098v.p101f.DrawableResource;
import p007c.p085g.p086a.p089m.p098v.p101f.ResourceDrawableDecoder;

/* JADX INFO: renamed from: c.g.a.m.v.d.y, reason: use source file name */
/* JADX INFO: compiled from: ResourceBitmapDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public class ResourceBitmapDecoder implements ResourceDecoder<Uri, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final ResourceDrawableDecoder f3599a;

    /* JADX INFO: renamed from: b */
    public final BitmapPool f3600b;

    public ResourceBitmapDecoder(ResourceDrawableDecoder resourceDrawableDecoder, BitmapPool bitmapPool) {
        this.f3599a = resourceDrawableDecoder;
        this.f3600b = bitmapPool;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public boolean mo1709a(Uri uri, Options options) throws IOException {
        return "android.resource".equals(uri.getScheme());
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(Uri uri, int i, int i2, Options options) throws IOException {
        Resource2 resource2M1919c = this.f3599a.m1919c(uri);
        if (resource2M1919c == null) {
            return null;
        }
        return DrawableToBitmapConverter.m1907a(this.f3600b, (Drawable) ((DrawableResource) resource2M1919c).get(), i, i2);
    }
}
