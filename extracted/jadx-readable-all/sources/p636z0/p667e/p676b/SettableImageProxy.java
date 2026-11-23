package p636z0.p667e.p676b;

import android.graphics.Rect;

/* JADX INFO: renamed from: z0.e.b.o1, reason: use source file name */
/* JADX INFO: compiled from: SettableImageProxy.java */
/* JADX INFO: loaded from: classes.dex */
public final class SettableImageProxy extends ForwardingImageProxy {

    /* JADX INFO: renamed from: h */
    public final ImageInfo f35976h;

    /* JADX INFO: renamed from: i */
    public final int f35977i;

    /* JADX INFO: renamed from: j */
    public final int f35978j;

    public SettableImageProxy(ImageProxy imageProxy, ImageInfo imageInfo) {
        int width;
        int height;
        super(imageProxy);
        synchronized (this) {
            width = this.f36367f.getWidth();
        }
        this.f35977i = width;
        synchronized (this) {
            height = this.f36367f.getHeight();
        }
        this.f35978j = height;
        this.f35976h = imageInfo;
    }

    @Override // p636z0.p667e.p676b.ForwardingImageProxy, p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: X */
    public synchronized void mo15261X(Rect rect) {
        int i;
        int i2;
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            synchronized (this) {
                i = this.f35977i;
                synchronized (this) {
                    i2 = this.f35978j;
                }
            }
            if (!rect2.intersect(0, 0, i, i2)) {
                rect2.setEmpty();
            }
        }
    }

    @Override // p636z0.p667e.p676b.ForwardingImageProxy, p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: Z */
    public ImageInfo mo15262Z() {
        return this.f35976h;
    }

    @Override // p636z0.p667e.p676b.ForwardingImageProxy, p636z0.p667e.p676b.ImageProxy
    public synchronized int getHeight() {
        return this.f35978j;
    }

    @Override // p636z0.p667e.p676b.ForwardingImageProxy, p636z0.p667e.p676b.ImageProxy
    public synchronized int getWidth() {
        return this.f35977i;
    }
}
