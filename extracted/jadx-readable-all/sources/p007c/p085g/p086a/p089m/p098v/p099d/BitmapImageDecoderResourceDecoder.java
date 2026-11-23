package p007c.p085g.p086a.p089m.p098v.p099d;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.p089m.p092t.Resource2;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPool;
import p007c.p085g.p086a.p089m.p092t.p093c0.BitmapPoolAdapter;
import p007c.p085g.p086a.p089m.p098v.ImageDecoderResourceDecoder;

/* JADX INFO: renamed from: c.g.a.m.v.d.d, reason: use source file name */
/* JADX INFO: compiled from: BitmapImageDecoderResourceDecoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class BitmapImageDecoderResourceDecoder extends ImageDecoderResourceDecoder<Bitmap> {

    /* JADX INFO: renamed from: b */
    public final BitmapPool f3530b = new BitmapPoolAdapter();

    @Override // p007c.p085g.p086a.p089m.p098v.ImageDecoderResourceDecoder
    /* JADX INFO: renamed from: c */
    public Resource2<Bitmap> mo1870c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sbM1556G = outline.m1556G("Decoded [");
            sbM1556G.append(bitmapDecodeBitmap.getWidth());
            sbM1556G.append("x");
            sbM1556G.append(bitmapDecodeBitmap.getHeight());
            sbM1556G.append("] for [");
            sbM1556G.append(i);
            sbM1556G.append("x");
            sbM1556G.append(i2);
            sbM1556G.append("]");
            Log.v("BitmapImageDecoder", sbM1556G.toString());
        }
        return new BitmapResource(bitmapDecodeBitmap, this.f3530b);
    }
}
