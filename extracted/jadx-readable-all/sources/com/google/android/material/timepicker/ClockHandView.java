package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4801b;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ClockHandView extends View {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f29217f = 0;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f29218g;

    /* JADX INFO: renamed from: h */
    public float f29219h;

    /* JADX INFO: renamed from: i */
    public float f29220i;

    /* JADX INFO: renamed from: j */
    public boolean f29221j;

    /* JADX INFO: renamed from: k */
    public int f29222k;

    /* JADX INFO: renamed from: l */
    public final List<InterfaceC5987c> f29223l;

    /* JADX INFO: renamed from: m */
    public final int f29224m;

    /* JADX INFO: renamed from: n */
    public final float f29225n;

    /* JADX INFO: renamed from: o */
    public final Paint f29226o;

    /* JADX INFO: renamed from: p */
    public final RectF f29227p;

    /* JADX INFO: renamed from: q */
    public final int f29228q;

    /* JADX INFO: renamed from: r */
    public float f29229r;

    /* JADX INFO: renamed from: s */
    public boolean f29230s;

    /* JADX INFO: renamed from: t */
    public double f29231t;

    /* JADX INFO: renamed from: u */
    public int f29232u;

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$a */
    public class C5985a implements ValueAnimator.AnimatorUpdateListener {
        public C5985a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ClockHandView clockHandView = ClockHandView.this;
            int i = ClockHandView.f29217f;
            clockHandView.m12893c(fFloatValue, true);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$b */
    public class C5986b extends AnimatorListenerAdapter {
        public C5986b(ClockHandView clockHandView) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.timepicker.ClockHandView$c */
    public interface InterfaceC5987c {
        /* JADX INFO: renamed from: a */
        void mo12889a(float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m12891a(float f, float f2) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    /* JADX INFO: renamed from: b */
    public void m12892b(float f, boolean z) {
        ValueAnimator valueAnimator = this.f29218g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m12893c(f, false);
            return;
        }
        float f2 = this.f29229r;
        if (Math.abs(f2 - f) > 180.0f) {
            if (f2 > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (f2 < 180.0f && f > 180.0f) {
                f2 += 360.0f;
            }
        }
        Pair pair = new Pair(Float.valueOf(f2), Float.valueOf(f));
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pair.first).floatValue(), ((Float) pair.second).floatValue());
        this.f29218g = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f29218g.addUpdateListener(new C5985a());
        this.f29218g.addListener(new C5986b(this));
        this.f29218g.start();
    }

    /* JADX INFO: renamed from: c */
    public final void m12893c(float f, boolean z) {
        float f2 = f % 360.0f;
        this.f29229r = f2;
        this.f29231t = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        float fCos = (this.f29232u * ((float) Math.cos(this.f29231t))) + (getWidth() / 2);
        float fSin = (this.f29232u * ((float) Math.sin(this.f29231t))) + height;
        RectF rectF = this.f29227p;
        int i = this.f29224m;
        rectF.set(fCos - i, fSin - i, fCos + i, fSin + i);
        Iterator<InterfaceC5987c> it = this.f29223l.iterator();
        while (it.hasNext()) {
            it.next().mo12889a(f2, z);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fCos = (this.f29232u * ((float) Math.cos(this.f29231t))) + f;
        float f2 = height;
        float fSin = (this.f29232u * ((float) Math.sin(this.f29231t))) + f2;
        this.f29226o.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.f29224m, this.f29226o);
        double dSin = Math.sin(this.f29231t);
        double dCos = Math.cos(this.f29231t);
        double d = this.f29232u - this.f29224m;
        this.f29226o.setStrokeWidth(this.f29228q);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.f29226o);
        canvas.drawCircle(f, f2, this.f29225n, this.f29226o);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m12892b(this.f29229r, false);
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 2) {
                int i = (int) (x - this.f29219h);
                int i2 = (int) (y - this.f29220i);
                this.f29221j = (i2 * i2) + (i * i) > this.f29222k;
                z = this.f29230s;
                if (actionMasked == 1) {
                }
            } else {
                z = false;
            }
            z2 = false;
        } else {
            this.f29219h = x;
            this.f29220i = y;
            this.f29221j = true;
            this.f29230s = false;
            z = false;
            z2 = true;
        }
        boolean z4 = this.f29230s;
        float fM12891a = m12891a(x, y);
        boolean z5 = this.f29229r != fM12891a;
        if (z2 && z5) {
            z3 = true;
        } else if (z5 || z) {
            m12892b(fM12891a, false);
            z3 = true;
        }
        this.f29230s = z4 | z3;
        return true;
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29223l = new ArrayList();
        Paint paint = new Paint();
        this.f29226o = paint;
        this.f29227p = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4801b.f24756k, i, 2132017960);
        this.f29232u = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f29224m = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f29228q = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f29225n = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m12892b(0.0f, false);
        this.f29222k = ViewConfiguration.get(context).getScaledTouchSlop();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }
}
