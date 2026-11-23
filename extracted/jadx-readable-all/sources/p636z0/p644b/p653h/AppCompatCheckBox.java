package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import mtp.media.karaoke.R;
import p636z0.p644b.p646d.p647a.AppCompatResources;

/* JADX INFO: renamed from: z0.b.h.g, reason: use source file name */
/* JADX INFO: compiled from: AppCompatCheckBox.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox {

    /* JADX INFO: renamed from: f */
    public final AppCompatCompoundButtonHelper f35032f;

    /* JADX INFO: renamed from: g */
    public final AppCompatBackgroundHelper f35033g;

    /* JADX INFO: renamed from: h */
    public final AppCompatTextHelper f35034h;

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35033g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14876a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35034h;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f35032f;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35033g;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14877b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35033g;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14878c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f35032f;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.f35049b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f35032f;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.f35050c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35033g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14880e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35033g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14881f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f35032f;
        if (appCompatCompoundButtonHelper != null) {
            if (appCompatCompoundButtonHelper.f35053f) {
                appCompatCompoundButtonHelper.f35053f = false;
            } else {
                appCompatCompoundButtonHelper.f35053f = true;
                appCompatCompoundButtonHelper.m14894a();
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35033g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14883h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35033g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14884i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f35032f;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.f35049b = colorStateList;
            appCompatCompoundButtonHelper.f35051d = true;
            appCompatCompoundButtonHelper.m14894a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f35032f;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.f35050c = mode;
            appCompatCompoundButtonHelper.f35052e = true;
            appCompatCompoundButtonHelper.m14894a();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m14982a(context);
        ThemeUtils.m14962a(this, getContext());
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = new AppCompatCompoundButtonHelper(this);
        this.f35032f = appCompatCompoundButtonHelper;
        appCompatCompoundButtonHelper.m14895b(attributeSet, i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f35033g = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m14879d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f35034h = appCompatTextHelper;
        appCompatTextHelper.m14988e(attributeSet, i);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AppCompatResources.m14707b(getContext(), i));
    }
}
