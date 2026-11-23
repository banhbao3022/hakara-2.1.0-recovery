package p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.i.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2472m implements InterfaceC2462c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2470k f11336a;

    public C2472m(C2470k c2470k) {
        this.f11336a = c2470k;
    }

    @Override // p007c.p190n.p194b.p266d.p290d.p291r.p292l.p293i.InterfaceC2462c
    /* JADX INFO: renamed from: a */
    public final void mo5055a(Bitmap bitmap) {
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            float f = width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - height) / 2;
            RectF rectF = new RectF(0.0f, f2, f, height + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = bitmapCreateBitmap;
        }
        this.f11336a.m5096i(bitmap2, 0);
    }
}
