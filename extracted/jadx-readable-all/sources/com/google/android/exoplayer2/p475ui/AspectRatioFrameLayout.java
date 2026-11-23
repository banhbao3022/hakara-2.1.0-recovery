package com.google.android.exoplayer2.p475ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p007c.p190n.p194b.p209b.p263z1.C2097f;

/* JADX INFO: loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public final RunnableC5884c f28420f;

    /* JADX INFO: renamed from: g */
    public InterfaceC5883b f28421g;

    /* JADX INFO: renamed from: h */
    public float f28422h;

    /* JADX INFO: renamed from: i */
    public int f28423i;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public interface InterfaceC5883b {
        /* JADX INFO: renamed from: a */
        void m12631a(float f, float f2, boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    public final class RunnableC5884c implements Runnable {

        /* JADX INFO: renamed from: f */
        public float f28424f;

        /* JADX INFO: renamed from: g */
        public float f28425g;

        /* JADX INFO: renamed from: h */
        public boolean f28426h;

        /* JADX INFO: renamed from: i */
        public boolean f28427i;

        public RunnableC5884c(C5882a c5882a) {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f28427i = false;
            InterfaceC5883b interfaceC5883b = AspectRatioFrameLayout.this.f28421g;
            if (interfaceC5883b == null) {
                return;
            }
            interfaceC5883b.m12631a(this.f28424f, this.f28425g, this.f28426h);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    public int getResizeMode() {
        return this.f28423i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.f28422h <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.f28422h / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            RunnableC5884c runnableC5884c = this.f28420f;
            runnableC5884c.f28424f = this.f28422h;
            runnableC5884c.f28425g = f5;
            runnableC5884c.f28426h = false;
            if (runnableC5884c.f28427i) {
                return;
            }
            runnableC5884c.f28427i = true;
            AspectRatioFrameLayout.this.post(runnableC5884c);
            return;
        }
        int i3 = this.f28423i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.f28422h;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.f28422h;
                    } else {
                        f2 = this.f28422h;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.f28422h;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.f28422h;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.f28422h;
            measuredWidth = (int) (f4 * f);
        }
        RunnableC5884c runnableC5884c2 = this.f28420f;
        runnableC5884c2.f28424f = this.f28422h;
        runnableC5884c2.f28425g = f5;
        runnableC5884c2.f28426h = true;
        if (!runnableC5884c2.f28427i) {
            runnableC5884c2.f28427i = true;
            AspectRatioFrameLayout.this.post(runnableC5884c2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f28422h != f) {
            this.f28422h = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(InterfaceC5883b interfaceC5883b) {
        this.f28421g = interfaceC5883b;
    }

    public void setResizeMode(int i) {
        if (this.f28423i != i) {
            this.f28423i = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28423i = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C2097f.f10382a, 0, 0);
            try {
                this.f28423i = typedArrayObtainStyledAttributes.getInt(0, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f28420f = new RunnableC5884c(null);
    }
}
