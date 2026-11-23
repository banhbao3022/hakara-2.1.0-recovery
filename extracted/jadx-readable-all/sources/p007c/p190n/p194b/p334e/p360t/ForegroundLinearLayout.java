package p007c.p190n.p194b.p334e.p360t;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p007c.p190n.p194b.p334e.C4801b;
import p636z0.p644b.p653h.LinearLayoutCompat;

/* JADX INFO: renamed from: c.n.b.e.t.d, reason: use source file name */
/* JADX INFO: compiled from: ForegroundLinearLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: u */
    public Drawable f25473u;

    /* JADX INFO: renamed from: v */
    public final Rect f25474v;

    /* JADX INFO: renamed from: w */
    public final Rect f25475w;

    /* JADX INFO: renamed from: x */
    public int f25476x;

    /* JADX INFO: renamed from: y */
    public boolean f25477y;

    /* JADX INFO: renamed from: z */
    public boolean f25478z;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f25473u;
        if (drawable != null) {
            if (this.f25478z) {
                this.f25478z = false;
                Rect rect = this.f25474v;
                Rect rect2 = this.f25475w;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f25477y) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f25476x, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @TargetApi(21)
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f25473u;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f25473u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f25473u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f25473u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f25476x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f25473u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f25478z = z | this.f25478z;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f25478z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f25473u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f25473u);
            }
            this.f25473u = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f25476x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f25476x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f25476x = i;
            if (i == 119 && this.f25473u != null) {
                this.f25473u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f25473u;
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25474v = new Rect();
        this.f25475w = new Rect();
        this.f25476x = 119;
        this.f25477y = true;
        this.f25478z = false;
        int[] iArr = C4801b.f24764s;
        ThemeEnforcement.m11344a(context, attributeSet, i, 0);
        ThemeEnforcement.m11345b(context, attributeSet, iArr, i, 0, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        this.f25476x = typedArrayObtainStyledAttributes.getInt(1, this.f25476x);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f25477y = typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.recycle();
    }
}
