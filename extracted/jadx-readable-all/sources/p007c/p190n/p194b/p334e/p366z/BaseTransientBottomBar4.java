package p007c.p190n.p194b.p334e.p366z;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.z.d, reason: use source file name */
/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar4 extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final View.OnTouchListener f25681f = new a();

    /* JADX INFO: renamed from: g */
    public BaseTransientBottomBar3 f25682g;

    /* JADX INFO: renamed from: h */
    public BaseTransientBottomBar2 f25683h;

    /* JADX INFO: renamed from: i */
    public int f25684i;

    /* JADX INFO: renamed from: j */
    public final float f25685j;

    /* JADX INFO: renamed from: k */
    public final float f25686k;

    /* JADX INFO: renamed from: l */
    public ColorStateList f25687l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f25688m;

    /* JADX INFO: renamed from: c.n.b.e.z.d$a */
    /* JADX INFO: compiled from: BaseTransientBottomBar.java */
    public static class a implements View.OnTouchListener {
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public BaseTransientBottomBar4(Context context, AttributeSet attributeSet) {
        Drawable drawableM16054Y;
        super(MaterialThemeOverlay.m11090a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C4801b.f24739K);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            setElevation(dimensionPixelSize);
        }
        this.f25684i = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f25685j = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(C4799a.m10961L(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(C4799a.m10999l0(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f25686k = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f25681f);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(C4799a.m10989g0(C4799a.m10960K(this, R.attr.colorSurface), C4799a.m10960K(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            if (this.f25687l != null) {
                drawableM16054Y = C8162a.m16054Y(gradientDrawable);
                drawableM16054Y.setTintList(this.f25687l);
            } else {
                drawableM16054Y = C8162a.m16054Y(gradientDrawable);
            }
            AtomicInteger atomicInteger2 = ViewCompat.f38073a;
            setBackground(drawableM16054Y);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f25686k;
    }

    public int getAnimationMode() {
        return this.f25684i;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f25685j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        BaseTransientBottomBar2 baseTransientBottomBar2 = this.f25683h;
        if (baseTransientBottomBar2 != null) {
            baseTransientBottomBar2.onViewAttachedToWindow(this);
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        BaseTransientBottomBar2 baseTransientBottomBar2 = this.f25683h;
        if (baseTransientBottomBar2 != null) {
            baseTransientBottomBar2.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        BaseTransientBottomBar3 baseTransientBottomBar3 = this.f25682g;
        if (baseTransientBottomBar3 != null) {
            baseTransientBottomBar3.m11415a(this, i, i2, i3, i4);
        }
    }

    public void setAnimationMode(int i) {
        this.f25684i = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f25687l != null) {
            drawable = C8162a.m16054Y(drawable.mutate());
            drawable.setTintList(this.f25687l);
            drawable.setTintMode(this.f25688m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f25687l = colorStateList;
        if (getBackground() != null) {
            Drawable drawableM16054Y = C8162a.m16054Y(getBackground().mutate());
            drawableM16054Y.setTintList(colorStateList);
            drawableM16054Y.setTintMode(this.f25688m);
            if (drawableM16054Y != getBackground()) {
                super.setBackgroundDrawable(drawableM16054Y);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f25688m = mode;
        if (getBackground() != null) {
            Drawable drawableM16054Y = C8162a.m16054Y(getBackground().mutate());
            drawableM16054Y.setTintMode(mode);
            if (drawableM16054Y != getBackground()) {
                super.setBackgroundDrawable(drawableM16054Y);
            }
        }
    }

    public void setOnAttachStateChangeListener(BaseTransientBottomBar2 baseTransientBottomBar2) {
        this.f25683h = baseTransientBottomBar2;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f25681f);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(BaseTransientBottomBar3 baseTransientBottomBar3) {
        this.f25682g = baseTransientBottomBar3;
    }
}
