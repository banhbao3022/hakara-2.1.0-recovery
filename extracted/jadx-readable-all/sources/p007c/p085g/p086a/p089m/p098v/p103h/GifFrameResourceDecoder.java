package p007c.p085g.p086a.p089m.p098v.p103h;

import android.graphics.Bitmap;
import com.bumptech.glide.gifdecoder.GifDecoder;
import java.io.IOException;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceDecoder;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p098v.p099d.BitmapResource;

/* JADX INFO: renamed from: c.g.a.m.v.h.h, reason: use source file name */
/* JADX INFO: compiled from: GifFrameResourceDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class GifFrameResourceDecoder implements ResourceDecoder<GifDecoder, Bitmap> {

    /* JADX INFO: renamed from: a */
    public final BitmapPool f3652a;

    public GifFrameResourceDecoder(BitmapPool bitmapPool) {
        this.f3652a = bitmapPool;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ boolean mo1709a(GifDecoder gifDecoder, Options options) throws IOException {
        return true;
    }

    @Override // p007c.p085g.p086a.p089m.ResourceDecoder
    /* JADX INFO: renamed from: b */
    public Resource2<Bitmap> mo1710b(GifDecoder gifDecoder, int i, int i2, Options options) throws IOException {
        return BitmapResource.m1881e(gifDecoder.getNextFrame(), this.f3652a);
    }
}
