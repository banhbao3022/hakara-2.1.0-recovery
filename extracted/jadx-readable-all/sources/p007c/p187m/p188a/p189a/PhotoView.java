package p007c.p187m.p188a.p189a;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Objects;
import p007c.p165l.p175i0.C1095a;

/* JADX INFO: renamed from: c.m.a.a.j, reason: use source file name */
/* JADX INFO: compiled from: PhotoView.java */
/* JADX INFO: loaded from: classes.dex */
public class PhotoView extends AppCompatImageView {

    /* JADX INFO: renamed from: h */
    public PhotoViewAttacher f5441h;

    /* JADX INFO: renamed from: i */
    public ImageView.ScaleType f5442i;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoViewAttacher getAttacher() {
        return this.f5441h;
    }

    public RectF getDisplayRect() {
        return this.f5441h.m2720c();
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.f5441h.f5462q;
    }

    public float getMaximumScale() {
        return this.f5441h.f5455j;
    }

    public float getMediumScale() {
        return this.f5441h.f5454i;
    }

    public float getMinimumScale() {
        return this.f5441h.f5453h;
    }

    public float getScale() {
        return this.f5441h.m2725l();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.f5441h.f5449G;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f5441h.f5456k = z;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.f5441h.m2729r();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        if (photoViewAttacher != null) {
            photoViewAttacher.m2729r();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        if (photoViewAttacher != null) {
            photoViewAttacher.m2729r();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        if (photoViewAttacher != null) {
            photoViewAttacher.m2729r();
        }
    }

    public void setMaximumScale(float f) {
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        C1095a.m2393i(photoViewAttacher.f5453h, photoViewAttacher.f5454i, f);
        photoViewAttacher.f5455j = f;
    }

    public void setMediumScale(float f) {
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        C1095a.m2393i(photoViewAttacher.f5453h, f, photoViewAttacher.f5455j);
        photoViewAttacher.f5454i = f;
    }

    public void setMinimumScale(float f) {
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        C1095a.m2393i(f, photoViewAttacher.f5454i, photoViewAttacher.f5455j);
        photoViewAttacher.f5453h = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5441h.f5470y = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f5441h.f5459n.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5441h.f5471z = onLongClickListener;
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.f5441h.f5466u = onMatrixChangedListener;
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f5441h.f5468w = onOutsidePhotoTapListener;
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.f5441h.f5467v = onPhotoTapListener;
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.f5441h.f5443A = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.f5441h.f5444B = onSingleFlingListener;
    }

    public void setOnViewDragListener(OnViewDragListener onViewDragListener) {
        this.f5441h.f5445C = onViewDragListener;
    }

    public void setOnViewTapListener(OnViewTapListener onViewTapListener) {
        this.f5441h.f5469x = onViewTapListener;
    }

    public void setRotationBy(float f) {
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        photoViewAttacher.f5463r.postRotate(f % 360.0f);
        photoViewAttacher.m2718a();
    }

    public void setRotationTo(float f) {
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        photoViewAttacher.f5463r.setRotate(f % 360.0f);
        photoViewAttacher.m2718a();
    }

    public void setScale(float f) {
        this.f5441h.m2728q(f, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        if (photoViewAttacher == null) {
            this.f5442i = scaleType;
            return;
        }
        Objects.requireNonNull(photoViewAttacher);
        boolean z = true;
        if (scaleType == null) {
            z = false;
        } else if (Util5.f5486a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (!z || scaleType == photoViewAttacher.f5449G) {
            return;
        }
        photoViewAttacher.f5449G = scaleType;
        photoViewAttacher.m2729r();
    }

    public void setZoomTransitionDuration(int i) {
        this.f5441h.f5452g = i;
    }

    public void setZoomable(boolean z) {
        PhotoViewAttacher photoViewAttacher = this.f5441h;
        photoViewAttacher.f5448F = z;
        photoViewAttacher.m2729r();
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5441h = new PhotoViewAttacher(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.f5442i;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f5442i = null;
        }
    }
}
