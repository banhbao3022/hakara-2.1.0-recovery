package p636z0.p644b.p653h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import mtp.media.karaoke.R;
import p636z0.p725k.C8162a;
import p636z0.p725k.p742m.AutoSizeableTextView;
import p636z0.p725k.p742m.TintableCompoundDrawablesView;

/* JADX INFO: renamed from: z0.b.h.f, reason: use source file name */
/* JADX INFO: compiled from: AppCompatButton.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatButton extends Button implements AutoSizeableTextView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: f */
    public final AppCompatBackgroundHelper f35015f;

    /* JADX INFO: renamed from: g */
    public final AppCompatTextHelper f35016g;

    public AppCompatButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35015f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14876a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.f38127a) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f35253i.f34945h);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.f38127a) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f35253i.f34944g);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.f38127a) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            return Math.round(appCompatTextHelper.f35253i.f34943f);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.f38127a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        return appCompatTextHelper != null ? appCompatTextHelper.f35253i.f34946i : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AutoSizeableTextView.f38127a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f35253i.f34941d;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35015f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14877b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35015f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14878c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        TintInfo tintInfo = this.f35016g.f35252h;
        if (tintInfo != null) {
            return tintInfo.f35241a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        TintInfo tintInfo = this.f35016g.f35252h;
        if (tintInfo != null) {
            return tintInfo.f35242b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper == null || AutoSizeableTextView.f38127a) {
            return;
        }
        appCompatTextHelper.f35253i.m14829a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper == null || AutoSizeableTextView.f38127a || !appCompatTextHelper.m14987d()) {
            return;
        }
        this.f35016g.f35253i.m14829a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AutoSizeableTextView.f38127a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14991h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (AutoSizeableTextView.f38127a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14992i(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AutoSizeableTextView.f38127a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14993j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35015f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14880e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35015f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14881f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8162a.m16055Z(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.f35245a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35015f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14883h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35015f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14884i(mode);
        }
    }

    @Override // p636z0.p725k.p742m.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f35016g.m14994k(colorStateList);
        this.f35016g.m14986b();
    }

    @Override // p636z0.p725k.p742m.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f35016g.m14995l(mode);
        this.f35016g.m14986b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14989f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = AutoSizeableTextView.f38127a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35016g;
        if (appCompatTextHelper == null || z || appCompatTextHelper.m14987d()) {
            return;
        }
        appCompatTextHelper.f35253i.m14832f(i, f);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m14982a(context);
        ThemeUtils.m14962a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f35015f = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m14879d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f35016g = appCompatTextHelper;
        appCompatTextHelper.m14988e(attributeSet, i);
        appCompatTextHelper.m14986b();
    }
}
