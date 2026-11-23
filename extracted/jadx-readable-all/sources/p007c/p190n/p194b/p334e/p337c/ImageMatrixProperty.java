package p007c.p190n.p194b.p334e.p337c;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: renamed from: c.n.b.e.c.f, reason: use source file name */
/* JADX INFO: compiled from: ImageMatrixProperty.java */
/* JADX INFO: loaded from: classes.dex */
public class ImageMatrixProperty extends Property<ImageView, Matrix> {

    /* JADX INFO: renamed from: a */
    public final Matrix f24802a;

    public ImageMatrixProperty() {
        super(Matrix.class, "imageMatrixProperty");
        this.f24802a = new Matrix();
    }

    @Override // android.util.Property
    public Matrix get(ImageView imageView) {
        this.f24802a.set(imageView.getImageMatrix());
        return this.f24802a;
    }

    @Override // android.util.Property
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
