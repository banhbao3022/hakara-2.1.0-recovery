package p007c.p190n.p194b.p334e.p338c0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;

/* JADX INFO: renamed from: c.n.b.e.c0.g, reason: use source file name */
/* JADX INFO: compiled from: CutoutDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class CutoutDrawable extends MaterialShapeDrawable {

    /* JADX INFO: renamed from: D */
    public final Paint f24833D;

    /* JADX INFO: renamed from: E */
    public final RectF f24834E;

    /* JADX INFO: renamed from: F */
    public int f24835F;

    public CutoutDrawable() {
        this(null);
    }

    /* JADX INFO: renamed from: B */
    public void m11048B(float f, float f2, float f3, float f4) {
        RectF rectF = this.f24834E;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.f24835F = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.f24834E, this.f24833D);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.f24835F);
    }

    public CutoutDrawable(ShapeAppearanceModel shapeAppearanceModel) {
        super(shapeAppearanceModel == null ? new ShapeAppearanceModel() : shapeAppearanceModel);
        Paint paint = new Paint(1);
        this.f24833D = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f24834E = new RectF();
    }
}
