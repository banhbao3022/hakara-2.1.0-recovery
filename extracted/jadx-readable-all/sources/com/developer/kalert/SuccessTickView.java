package com.developer.kalert;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
public class SuccessTickView extends View {
    private final float CONST_LEFT_RECT_W;
    private final float CONST_RADIUS;
    private final float CONST_RECT_WEIGHT;
    private final float CONST_RIGHT_RECT_W;
    private final float MAX_RIGHT_RECT_W;
    private final float MIN_LEFT_RECT_W;
    private float leftRectWidth;
    private float mDensity;
    private boolean mLeftRectGrowMode;
    private Paint mPaint;
    private float maxLeftRectWidth;
    private float rightRectWidth;

    public SuccessTickView(Context context) {
        super(context);
        this.mDensity = -1.0f;
        this.CONST_RADIUS = dip2px(1.2f);
        this.CONST_RECT_WEIGHT = dip2px(3.0f);
        this.CONST_LEFT_RECT_W = dip2px(15.0f);
        float fDip2px = dip2px(25.0f);
        this.CONST_RIGHT_RECT_W = fDip2px;
        this.MIN_LEFT_RECT_W = dip2px(3.3f);
        this.MAX_RIGHT_RECT_W = fDip2px + dip2px(6.7f);
        init();
    }

    private float dip2px(float f) {
        if (this.mDensity == -1.0f) {
            this.mDensity = getResources().getDisplayMetrics().density;
        }
        return (f * this.mDensity) + 0.5f;
    }

    @SuppressLint({"ResourceAsColor"})
    private void init() {
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setColor(C5801R.color.success_stroke_color);
        this.leftRectWidth = this.CONST_LEFT_RECT_W;
        this.rightRectWidth = this.CONST_RIGHT_RECT_W;
        this.mLeftRectGrowMode = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        canvas.rotate(45.0f, width >> 1, height >> 1);
        int i = (int) (((double) height) / 1.4d);
        float f = (int) (((double) width) / 1.2d);
        this.maxLeftRectWidth = (((this.CONST_LEFT_RECT_W + f) / 2.0f) + this.CONST_RECT_WEIGHT) - 1.0f;
        RectF rectF = new RectF();
        if (this.mLeftRectGrowMode) {
            rectF.left = 0.0f;
            rectF.right = 0.0f + this.leftRectWidth;
        } else {
            float f2 = (((this.CONST_LEFT_RECT_W + f) / 2.0f) + this.CONST_RECT_WEIGHT) - 1.0f;
            rectF.right = f2;
            rectF.left = f2 - this.leftRectWidth;
        }
        float f3 = i;
        float f4 = (this.CONST_RIGHT_RECT_W + f3) / 2.0f;
        rectF.top = f4;
        rectF.bottom = f4 + this.CONST_RECT_WEIGHT;
        float f5 = this.CONST_RADIUS;
        canvas.drawRoundRect(rectF, f5, f5, this.mPaint);
        RectF rectF2 = new RectF();
        float f6 = (f3 + this.CONST_RIGHT_RECT_W) / 2.0f;
        float f7 = this.CONST_RECT_WEIGHT;
        float f8 = (f6 + f7) - 1.0f;
        rectF2.bottom = f8;
        float f9 = (f + this.CONST_LEFT_RECT_W) / 2.0f;
        rectF2.left = f9;
        rectF2.right = f9 + f7;
        rectF2.top = f8 - this.rightRectWidth;
        float f10 = this.CONST_RADIUS;
        canvas.drawRoundRect(rectF2, f10, f10, this.mPaint);
    }

    public void startTickAnim() {
        this.leftRectWidth = 0.0f;
        this.rightRectWidth = 0.0f;
        invalidate();
        Animation animation = new Animation() { // from class: com.developer.kalert.SuccessTickView.1
            @Override // android.view.animation.Animation
            public void applyTransformation(float f, Transformation transformation) {
                super.applyTransformation(f, transformation);
                double d = f;
                if (0.54d < d && 0.7d >= d) {
                    SuccessTickView.this.mLeftRectGrowMode = true;
                    SuccessTickView successTickView = SuccessTickView.this;
                    successTickView.leftRectWidth = ((f - 0.54f) / 0.16f) * successTickView.maxLeftRectWidth;
                    if (0.65d < d) {
                        SuccessTickView successTickView2 = SuccessTickView.this;
                        successTickView2.rightRectWidth = ((f - 0.65f) / 0.19f) * successTickView2.MAX_RIGHT_RECT_W;
                    }
                    SuccessTickView.this.invalidate();
                    return;
                }
                if (0.7d < d && 0.84d >= d) {
                    SuccessTickView.this.mLeftRectGrowMode = false;
                    SuccessTickView successTickView3 = SuccessTickView.this;
                    successTickView3.leftRectWidth = (1.0f - ((f - 0.7f) / 0.14f)) * successTickView3.maxLeftRectWidth;
                    SuccessTickView successTickView4 = SuccessTickView.this;
                    successTickView4.leftRectWidth = Math.max(successTickView4.leftRectWidth, SuccessTickView.this.MIN_LEFT_RECT_W);
                    SuccessTickView successTickView5 = SuccessTickView.this;
                    successTickView5.rightRectWidth = ((f - 0.65f) / 0.19f) * successTickView5.MAX_RIGHT_RECT_W;
                    SuccessTickView.this.invalidate();
                    return;
                }
                if (0.84d >= d || 1.0f < f) {
                    return;
                }
                SuccessTickView.this.mLeftRectGrowMode = false;
                SuccessTickView successTickView6 = SuccessTickView.this;
                float f2 = (f - 0.84f) / 0.16f;
                successTickView6.leftRectWidth = ((SuccessTickView.this.CONST_LEFT_RECT_W - SuccessTickView.this.MIN_LEFT_RECT_W) * f2) + successTickView6.MIN_LEFT_RECT_W;
                SuccessTickView successTickView7 = SuccessTickView.this;
                successTickView7.rightRectWidth = ((1.0f - f2) * (SuccessTickView.this.MAX_RIGHT_RECT_W - SuccessTickView.this.CONST_RIGHT_RECT_W)) + successTickView7.CONST_RIGHT_RECT_W;
                SuccessTickView.this.invalidate();
            }
        };
        animation.setDuration(750L);
        animation.setStartOffset(100L);
        startAnimation(animation);
    }

    public SuccessTickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDensity = -1.0f;
        this.CONST_RADIUS = dip2px(1.2f);
        this.CONST_RECT_WEIGHT = dip2px(3.0f);
        this.CONST_LEFT_RECT_W = dip2px(15.0f);
        float fDip2px = dip2px(25.0f);
        this.CONST_RIGHT_RECT_W = fDip2px;
        this.MIN_LEFT_RECT_W = dip2px(3.3f);
        this.MAX_RIGHT_RECT_W = fDip2px + dip2px(6.7f);
        init();
    }
}
