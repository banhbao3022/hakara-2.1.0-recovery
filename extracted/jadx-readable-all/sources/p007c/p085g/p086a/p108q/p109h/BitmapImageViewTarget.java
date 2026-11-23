package p007c.p085g.p086a.p108q.p109h;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: renamed from: c.g.a.q.h.b, reason: use source file name */
/* JADX INFO: compiled from: BitmapImageViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
public class BitmapImageViewTarget extends ImageViewTarget<Bitmap> {
    public BitmapImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.ImageViewTarget
    /* JADX INFO: renamed from: k */
    public void mo2022k(Bitmap bitmap) {
        ((ImageView) this.f3783g).setImageBitmap(bitmap);
    }

    @Deprecated
    public BitmapImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
