package p636z0.p686f.p687c;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: z0.f.c.d, reason: use source file name */
/* JADX INFO: compiled from: RoundRectDrawable.java */
/* JADX INFO: loaded from: classes.dex */
public class RoundRectDrawable extends Drawable {

    /* JADX INFO: renamed from: a */
    public float f36512a;

    /* JADX INFO: renamed from: c */
    public final RectF f36514c;

    /* JADX INFO: renamed from: d */
    public final Rect f36515d;

    /* JADX INFO: renamed from: e */
    public float f36516e;

    /* JADX INFO: renamed from: h */
    public ColorStateList f36519h;

    /* JADX INFO: renamed from: i */
    public PorterDuffColorFilter f36520i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f36521j;

    /* JADX INFO: renamed from: f */
    public boolean f36517f = false;

    /* JADX INFO: renamed from: g */
    public boolean f36518g = true;

    /* JADX INFO: renamed from: k */
    public PorterDuff.Mode f36522k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public final Paint f36513b = new Paint(5);

    public RoundRectDrawable(ColorStateList colorStateList, float f) {
        this.f36512a = f;
        m15545b(colorStateList);
        this.f36514c = new RectF();
        this.f36515d = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m15544a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* JADX INFO: renamed from: b */
    public final void m15545b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f36519h = colorStateList;
        this.f36513b.setColor(colorStateList.getColorForState(getState(), this.f36519h.getDefaultColor()));
    }

    /* JADX INFO: renamed from: c */
    public final void m15546c(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f36514c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f36515d.set(rect);
        if (this.f36517f) {
            this.f36515d.inset((int) Math.ceil(RoundRectDrawableWithShadow.m15547a(this.f36516e, this.f36512a, this.f36518g)), (int) Math.ceil(RoundRectDrawableWithShadow.m15548b(this.f36516e, this.f36512a, this.f36518g)));
            this.f36514c.set(this.f36515d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f36513b;
        if (this.f36520i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f36520i);
            z = true;
        }
        RectF rectF = this.f36514c;
        float f = this.f36512a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f36515d, this.f36512a);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f36521j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f36519h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m15546c(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f36519h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f36513b.getColor();
        if (z) {
            this.f36513b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f36521j;
        if (colorStateList2 == null || (mode = this.f36522k) == null) {
            return z;
        }
        this.f36520i = m15544a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f36513b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36513b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f36521j = colorStateList;
        this.f36520i = m15544a(colorStateList, this.f36522k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f36522k = mode;
        this.f36520i = m15544a(this.f36521j, mode);
        invalidateSelf();
    }
}
