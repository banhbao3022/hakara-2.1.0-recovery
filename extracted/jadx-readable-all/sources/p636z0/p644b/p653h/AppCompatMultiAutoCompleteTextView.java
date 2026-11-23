package p636z0.p644b.p653h;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p636z0.p644b.C7462a;
import p636z0.p644b.p646d.p647a.AppCompatResources;

/* JADX INFO: renamed from: z0.b.h.n, reason: use source file name */
/* JADX INFO: compiled from: AppCompatMultiAutoCompleteTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: f */
    public static final int[] f35128f = {R.attr.popupBackground};

    /* JADX INFO: renamed from: g */
    public final AppCompatBackgroundHelper f35129g;

    /* JADX INFO: renamed from: h */
    public final AppCompatTextHelper f35130h;

    public AppCompatMultiAutoCompleteTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35129g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14876a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35130h;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35129g;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14877b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35129g;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14878c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C7462a.m14577n(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35129g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14880e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35129g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14881f(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AppCompatResources.m14707b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35129g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14883h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35129g;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14884i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f35130h;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14989f(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.autoCompleteTextViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m14982a(context);
        ThemeUtils.m14962a(this, getContext());
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(getContext(), attributeSet, f35128f, i, 0);
        if (tintTypedArrayM14998r.m15014p(0)) {
            setDropDownBackgroundDrawable(tintTypedArrayM14998r.m15005g(0));
        }
        tintTypedArrayM14998r.f35267b.recycle();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f35129g = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m14879d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f35130h = appCompatTextHelper;
        appCompatTextHelper.m14988e(attributeSet, i);
        appCompatTextHelper.m14986b();
    }
}
