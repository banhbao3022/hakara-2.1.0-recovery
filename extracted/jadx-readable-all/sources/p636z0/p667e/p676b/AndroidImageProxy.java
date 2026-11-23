package p636z0.p667e.p676b;

import android.graphics.Rect;
import android.media.Image;
import p636z0.p667e.p676b.p677v1.TagBundle;

/* JADX INFO: renamed from: z0.e.b.i0, reason: use source file name */
/* JADX INFO: compiled from: AndroidImageProxy.java */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidImageProxy implements ImageProxy {

    /* JADX INFO: renamed from: f */
    public final Image f35907f;

    /* JADX INFO: renamed from: g */
    public final a[] f35908g;

    /* JADX INFO: renamed from: h */
    public final ImageInfo f35909h;

    /* JADX INFO: renamed from: z0.e.b.i0$a */
    /* JADX INFO: compiled from: AndroidImageProxy.java */
    public static final class a {
        public a(Image.Plane plane) {
        }
    }

    public AndroidImageProxy(Image image) {
        this.f35907f = image;
        Image.Plane[] planes = image.getPlanes();
        if (planes != null) {
            this.f35908g = new a[planes.length];
            for (int i = 0; i < planes.length; i++) {
                this.f35908g[i] = new a(planes[i]);
            }
        } else {
            this.f35908g = new a[0];
        }
        this.f35909h = new AutoValue_ImmutableImageInfo(TagBundle.f36212a, image.getTimestamp(), 0);
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: X */
    public synchronized void mo15261X(Rect rect) {
        this.f35907f.setCropRect(rect);
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: Z */
    public ImageInfo mo15262Z() {
        return this.f35909h;
    }

    @Override // p636z0.p667e.p676b.ImageProxy, java.lang.AutoCloseable
    public synchronized void close() {
        this.f35907f.close();
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    public synchronized int getHeight() {
        return this.f35907f.getHeight();
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    public synchronized int getWidth() {
        return this.f35907f.getWidth();
    }

    @Override // p636z0.p667e.p676b.ImageProxy
    /* JADX INFO: renamed from: j0 */
    public synchronized Image mo15263j0() {
        return this.f35907f;
    }
}
