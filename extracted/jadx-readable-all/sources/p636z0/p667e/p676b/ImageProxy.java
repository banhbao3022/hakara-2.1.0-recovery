package p636z0.p667e.p676b;

import android.graphics.Rect;
import android.media.Image;

/* JADX INFO: renamed from: z0.e.b.f1, reason: use source file name */
/* JADX INFO: compiled from: ImageProxy.java */
/* JADX INFO: loaded from: classes.dex */
public interface ImageProxy extends AutoCloseable {
    /* JADX INFO: renamed from: X */
    void mo15261X(Rect rect);

    /* JADX INFO: renamed from: Z */
    ImageInfo mo15262Z();

    @Override // java.lang.AutoCloseable
    void close();

    int getHeight();

    int getWidth();

    /* JADX INFO: renamed from: j0 */
    Image mo15263j0();
}
