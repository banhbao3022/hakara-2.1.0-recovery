package p636z0.p725k.p729e.p730l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.k.e.l.c, reason: use source file name */
/* JADX INFO: compiled from: WrappedDrawableApi14.java */
/* JADX INFO: loaded from: classes.dex */
public class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {

    /* JADX INFO: renamed from: f */
    public static final PorterDuff.Mode f37877f = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: g */
    public int f37878g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f37879h;

    /* JADX INFO: renamed from: i */
    public boolean f37880i;

    /* JADX INFO: renamed from: j */
    public WrappedDrawableState f37881j;

    /* JADX INFO: renamed from: k */
    public boolean f37882k;

    /* JADX INFO: renamed from: l */
    public Drawable f37883l;

    public WrappedDrawableApi14(WrappedDrawableState wrappedDrawableState, Resources resources) {
        Drawable.ConstantState constantState;
        this.f37881j = wrappedDrawableState;
        if (wrappedDrawableState == null || (constantState = wrappedDrawableState.f37886b) == null) {
            return;
        }
        mo16196a(constantState.newDrawable(resources));
    }

    @Override // p636z0.p725k.p729e.p730l.WrappedDrawable
    /* JADX INFO: renamed from: a */
    public final void mo16196a(Drawable drawable) {
        Drawable drawable2 = this.f37883l;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f37883l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.f37881j;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.f37886b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // p636z0.p725k.p729e.p730l.WrappedDrawable
    /* JADX INFO: renamed from: b */
    public final Drawable mo16197b() {
        return this.f37883l;
    }

    /* JADX INFO: renamed from: c */
    public boolean mo16198c() {
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16199d(int[] iArr) {
        if (!mo16198c()) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.f37881j;
        ColorStateList colorStateList = wrappedDrawableState.f37887c;
        PorterDuff.Mode mode = wrappedDrawableState.f37888d;
        if (colorStateList == null || mode == null) {
            this.f37880i = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f37880i || colorForState != this.f37878g || mode != this.f37879h) {
                setColorFilter(colorForState, mode);
                this.f37878g = colorForState;
                this.f37879h = mode;
                this.f37880i = true;
                return true;
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f37883l.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.f37881j;
        return changingConfigurations | (wrappedDrawableState != null ? wrappedDrawableState.getChangingConfigurations() : 0) | this.f37883l.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.f37881j;
        if (wrappedDrawableState == null) {
            return null;
        }
        if (!(wrappedDrawableState.f37886b != null)) {
            return null;
        }
        wrappedDrawableState.f37885a = getChangingConfigurations();
        return this.f37881j;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f37883l.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f37883l.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f37883l.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return C8162a.m16075t(this.f37883l);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f37883l.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f37883l.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f37883l.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f37883l.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f37883l.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f37883l.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f37883l.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        WrappedDrawableState wrappedDrawableState;
        ColorStateList colorStateList = (!mo16198c() || (wrappedDrawableState = this.f37881j) == null) ? null : wrappedDrawableState.f37887c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f37883l.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f37883l.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f37882k && super.mutate() == this) {
            this.f37881j = new WrappedDrawableState(this.f37881j);
            Drawable drawable = this.f37883l;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState = this.f37881j;
            if (wrappedDrawableState != null) {
                Drawable drawable2 = this.f37883l;
                wrappedDrawableState.f37886b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f37882k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f37883l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return C8162a.m16043N(this.f37883l, i);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        return this.f37883l.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f37883l.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        this.f37883l.setAutoMirrored(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        this.f37883l.setChangingConfigurations(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37883l.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        this.f37883l.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f37883l.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return m16199d(iArr) || this.f37883l.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2) || this.f37883l.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public WrappedDrawableApi14(Drawable drawable) {
        this.f37881j = new WrappedDrawableState(this.f37881j);
        mo16196a(drawable);
    }
}
