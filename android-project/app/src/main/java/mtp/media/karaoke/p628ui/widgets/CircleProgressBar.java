package mtp.media.karaoke.p628ui.widgets;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import p555j.p556a.p557a.C6879f;

/* JADX INFO: loaded from: classes2.dex */
public class CircleProgressBar extends View {

    /* JADX INFO: renamed from: f */
    public float f34045f;

    /* JADX INFO: renamed from: g */
    public float f34046g;

    /* JADX INFO: renamed from: h */
    public int f34047h;

    /* JADX INFO: renamed from: i */
    public int f34048i;

    /* JADX INFO: renamed from: j */
    public int f34049j;

    /* JADX INFO: renamed from: k */
    public int f34050k;

    /* JADX INFO: renamed from: l */
    public RectF f34051l;

    /* JADX INFO: renamed from: m */
    public Paint f34052m;

    /* JADX INFO: renamed from: n */
    public Paint f34053n;

    public CircleProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34045f = 4.0f;
        this.f34046g = 0.0f;
        this.f34047h = 0;
        this.f34048i = 100;
        this.f34049j = -90;
        this.f34050k = -12303292;
        this.f34051l = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6879f.f32092a, 0, 0);
        try {
            this.f34045f = typedArrayObtainStyledAttributes.getDimension(3, this.f34045f);
            this.f34046g = typedArrayObtainStyledAttributes.getFloat(2, this.f34046g);
            this.f34050k = typedArrayObtainStyledAttributes.getInt(4, this.f34050k);
            this.f34047h = typedArrayObtainStyledAttributes.getInt(1, this.f34047h);
            this.f34048i = typedArrayObtainStyledAttributes.getInt(0, this.f34048i);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint(1);
            this.f34052m = paint;
            paint.setColor(m14472a(this.f34050k, 0.3f));
            this.f34052m.setStyle(Paint.Style.STROKE);
            this.f34052m.setStrokeWidth(this.f34045f);
            Paint paint2 = new Paint(1);
            this.f34053n = paint2;
            paint2.setColor(this.f34050k);
            this.f34053n.setStyle(Paint.Style.STROKE);
            this.f34053n.setStrokeWidth(this.f34045f);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    public int m14472a(int i, float f) {
        return Color.argb(Math.round(Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public int getColor() {
        return this.f34050k;
    }

    public int getMax() {
        return this.f34048i;
    }

    public int getMin() {
        return this.f34047h;
    }

    public float getProgress() {
        return this.f34046g;
    }

    public float getStrokeWidth() {
        return this.f34045f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawOval(this.f34051l, this.f34052m);
        canvas.drawArc(this.f34051l, this.f34049j, (this.f34046g * 360.0f) / this.f34048i, false, this.f34053n);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMin = Math.min(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
        setMeasuredDimension(iMin, iMin);
        RectF rectF = this.f34051l;
        float f = this.f34045f;
        float f2 = iMin;
        rectF.set((f / 2.0f) + 0.0f, (f / 2.0f) + 0.0f, f2 - (f / 2.0f), f2 - (f / 2.0f));
    }

    public void setColor(int i) {
        this.f34050k = i;
        this.f34052m.setColor(m14472a(i, 0.3f));
        this.f34053n.setColor(i);
        invalidate();
        requestLayout();
    }

    public void setMax(int i) {
        this.f34048i = i;
        invalidate();
    }

    public void setMin(int i) {
        this.f34047h = i;
        invalidate();
    }

    public void setProgress(float f) {
        this.f34046g = f;
        invalidate();
    }

    public void setProgressWithAnimation(float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", f);
        objectAnimatorOfFloat.setDuration(1000L);
        objectAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfFloat.start();
    }

    public void setStrokeWidth(float f) {
        this.f34045f = f;
        this.f34052m.setStrokeWidth(f);
        this.f34053n.setStrokeWidth(f);
        invalidate();
        requestLayout();
    }
}
