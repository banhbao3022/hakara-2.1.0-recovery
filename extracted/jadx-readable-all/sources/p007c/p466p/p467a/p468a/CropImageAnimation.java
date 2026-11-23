package p007c.p466p.p467a.p468a;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.theartofdev.edmodo.cropper.CropOverlayView;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.p.a.a.g, reason: use source file name */
/* JADX INFO: compiled from: CropImageAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class CropImageAnimation extends Animation implements Animation.AnimationListener {

    /* JADX INFO: renamed from: f */
    public final ImageView f27983f;

    /* JADX INFO: renamed from: g */
    public final CropOverlayView f27984g;

    /* JADX INFO: renamed from: h */
    public final float[] f27985h = new float[8];

    /* JADX INFO: renamed from: i */
    public final float[] f27986i = new float[8];

    /* JADX INFO: renamed from: j */
    public final RectF f27987j = new RectF();

    /* JADX INFO: renamed from: k */
    public final RectF f27988k = new RectF();

    /* JADX INFO: renamed from: l */
    public final float[] f27989l = new float[9];

    /* JADX INFO: renamed from: m */
    public final float[] f27990m = new float[9];

    /* JADX INFO: renamed from: n */
    public final RectF f27991n = new RectF();

    /* JADX INFO: renamed from: o */
    public final float[] f27992o = new float[8];

    /* JADX INFO: renamed from: p */
    public final float[] f27993p = new float[9];

    public CropImageAnimation(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f27983f = imageView;
        this.f27984g = cropOverlayView;
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f27991n;
        RectF rectF2 = this.f27987j;
        float f2 = rectF2.left;
        RectF rectF3 = this.f27988k;
        rectF.left = outline.m1576a(rectF3.left, f2, f, f2);
        float f3 = rectF2.top;
        rectF.top = outline.m1576a(rectF3.top, f3, f, f3);
        float f4 = rectF2.right;
        rectF.right = outline.m1576a(rectF3.right, f4, f, f4);
        float f5 = rectF2.bottom;
        rectF.bottom = outline.m1576a(rectF3.bottom, f5, f, f5);
        this.f27984g.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f27992o;
            if (i2 >= fArr.length) {
                break;
            }
            float[] fArr2 = this.f27985h;
            fArr[i2] = outline.m1576a(this.f27986i[i2], fArr2[i2], f, fArr2[i2]);
            i2++;
        }
        this.f27984g.m12962i(fArr, this.f27983f.getWidth(), this.f27983f.getHeight());
        while (true) {
            float[] fArr3 = this.f27993p;
            if (i >= fArr3.length) {
                Matrix imageMatrix = this.f27983f.getImageMatrix();
                imageMatrix.setValues(this.f27993p);
                this.f27983f.setImageMatrix(imageMatrix);
                this.f27983f.invalidate();
                this.f27984g.invalidate();
                return;
            }
            float[] fArr4 = this.f27989l;
            fArr3[i] = outline.m1576a(this.f27990m[i], fArr4[i], f, fArr4[i]);
            i++;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f27983f.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
