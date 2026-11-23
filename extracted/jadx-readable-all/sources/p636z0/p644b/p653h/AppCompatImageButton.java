package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import mtp.media.karaoke.R;

/* JADX INFO: renamed from: z0.b.h.l, reason: use source file name */
/* JADX INFO: compiled from: AppCompatImageButton.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* JADX INFO: renamed from: f */
    public final AppCompatBackgroundHelper f35117f;

    /* JADX INFO: renamed from: g */
    public final AppCompatImageHelper f35118g;

    public AppCompatImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35117f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14876a();
        }
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m14926a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35117f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14877b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35117f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14878c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.f35120b) == null) {
            return null;
        }
        return tintInfo.f35241a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        TintInfo tintInfo;
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper == null || (tintInfo = appCompatImageHelper.f35120b) == null) {
            return null;
        }
        return tintInfo.f35242b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f35118g.f35119a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35117f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14880e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35117f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14881f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m14926a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m14926a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f35118g.m14928c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m14926a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35117f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14883h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35117f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14884i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m14929d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.f35118g;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.m14930e(mode);
        }
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m14982a(context);
        ThemeUtils.m14962a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f35117f = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m14879d(attributeSet, i);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f35118g = appCompatImageHelper;
        appCompatImageHelper.m14927b(attributeSet, i);
    }
}
