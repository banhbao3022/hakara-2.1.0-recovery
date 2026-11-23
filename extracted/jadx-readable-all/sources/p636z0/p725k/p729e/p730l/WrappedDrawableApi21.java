package p636z0.p725k.p729e.p730l;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: z0.k.e.l.d, reason: use source file name */
/* JADX INFO: compiled from: WrappedDrawableApi21.java */
/* JADX INFO: loaded from: classes.dex */
public class WrappedDrawableApi21 extends WrappedDrawableApi14 {

    /* JADX INFO: renamed from: m */
    public static Method f37884m;

    public WrappedDrawableApi21(Drawable drawable) {
        super(drawable);
        m16200e();
    }

    @Override // p636z0.p725k.p729e.p730l.WrappedDrawableApi14
    /* JADX INFO: renamed from: c */
    public boolean mo16198c() {
        if (Build.VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f37883l;
        return (drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: e */
    public final void m16200e() {
        if (f37884m == null) {
            try {
                f37884m = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        return this.f37883l.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f37883l.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f37883l;
        if (drawable != null && (method = f37884m) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception e) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", e);
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        this.f37883l.setHotspot(f, f2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f37883l.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // p636z0.p725k.p729e.p730l.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // p636z0.p725k.p729e.p730l.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (mo16198c()) {
            super.setTint(i);
        } else {
            this.f37883l.setTint(i);
        }
    }

    @Override // p636z0.p725k.p729e.p730l.WrappedDrawableApi14, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (!mo16198c()) {
            this.f37883l.setTintList(colorStateList);
        } else {
            this.f37881j.f37887c = colorStateList;
            m16199d(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (!mo16198c()) {
            this.f37883l.setTintMode(mode);
        } else {
            this.f37881j.f37888d = mode;
            m16199d(getState());
        }
    }

    public WrappedDrawableApi21(WrappedDrawableState wrappedDrawableState, Resources resources) {
        super(wrappedDrawableState, resources);
        m16200e();
    }
}
