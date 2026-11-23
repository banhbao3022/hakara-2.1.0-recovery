package p007c.p085g.p086a.p108q.p109h;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: renamed from: c.g.a.q.h.d, reason: use source file name */
/* JADX INFO: compiled from: DrawableImageViewTarget.java */
/* JADX INFO: loaded from: classes.dex */
public class DrawableImageViewTarget extends ImageViewTarget<Drawable> {
    public DrawableImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    @Override // p007c.p085g.p086a.p108q.p109h.ImageViewTarget
    /* JADX INFO: renamed from: k */
    public void mo2022k(Drawable drawable) {
        ((ImageView) this.f3783g).setImageDrawable(drawable);
    }

    @Deprecated
    public DrawableImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
