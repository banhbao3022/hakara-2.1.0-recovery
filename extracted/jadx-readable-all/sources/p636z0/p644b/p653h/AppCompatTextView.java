package p636z0.p644b.p653h;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p636z0.p644b.C7462a;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;
import p636z0.p725k.p729e.TypefaceCompat;
import p636z0.p725k.p729e.TypefaceCompatBaseImpl2;
import p636z0.p725k.p737j.PrecomputedTextCompat;
import p636z0.p725k.p742m.AutoSizeableTextView;
import p636z0.p725k.p742m.TintableCompoundDrawablesView;

/* JADX INFO: renamed from: z0.b.h.z, reason: use source file name */
/* JADX INFO: compiled from: AppCompatTextView.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextView extends TextView implements TintableCompoundDrawablesView, AutoSizeableTextView {

    /* JADX INFO: renamed from: f */
    public final AppCompatBackgroundHelper f35269f;

    /* JADX INFO: renamed from: g */
    public final AppCompatTextHelper f35270g;

    /* JADX INFO: renamed from: h */
    public final AppCompatTextClassifierHelper f35271h;

    /* JADX INFO: renamed from: i */
    public boolean f35272i;

    /* JADX INFO: renamed from: j */
    public Future<PrecomputedTextCompat> f35273j;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35269f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14876a();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.f38127a) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
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
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
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
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
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
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        return appCompatTextHelper != null ? appCompatTextHelper.f35253i.f34946i : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (AutoSizeableTextView.f38127a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.f35253i.f34941d;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35269f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14877b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35269f;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.m14878c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        TintInfo tintInfo = this.f35270g.f35252h;
        if (tintInfo != null) {
            return tintInfo.f35241a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        TintInfo tintInfo = this.f35270g.f35252h;
        if (tintInfo != null) {
            return tintInfo.f35242b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future<PrecomputedTextCompat> future = this.f35273j;
        if (future != null) {
            try {
                this.f35273j = null;
                C8162a.m16046Q(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        return (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f35271h) == null) ? super.getTextClassifier() : appCompatTextClassifierHelper.m14983a();
    }

    public PrecomputedTextCompat.a getTextMetricsParamsCompat() {
        return C8162a.m16032C(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f35270g.m14990g(this, inputConnectionOnCreateInputConnection, editorInfo);
        C7462a.m14577n(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper == null || AutoSizeableTextView.f38127a) {
            return;
        }
        appCompatTextHelper.f35253i.m14829a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future<PrecomputedTextCompat> future = this.f35273j;
        if (future != null) {
            try {
                this.f35273j = null;
                C8162a.m16046Q(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper == null || AutoSizeableTextView.f38127a || !appCompatTextHelper.m14987d()) {
            return;
        }
        this.f35270g.f35253i.m14829a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AutoSizeableTextView.f38127a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
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
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
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
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14993j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35269f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14880e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35269f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14881f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C8162a.m16055Z(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C8162a.m16041L(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C8162a.m16042M(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        C8162a.m16044O(this, i);
    }

    public void setPrecomputedText(PrecomputedTextCompat precomputedTextCompat) {
        C8162a.m16046Q(this, precomputedTextCompat);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35269f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14883h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f35269f;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.m14884i(mode);
        }
    }

    @Override // p636z0.p725k.p742m.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f35270g.m14994k(colorStateList);
        this.f35270g.m14986b();
    }

    @Override // p636z0.p725k.p742m.TintableCompoundDrawablesView
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f35270g.m14995l(mode);
        this.f35270g.m14986b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14989f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f35271h) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            appCompatTextClassifierHelper.f35240b = textClassifier;
        }
    }

    public void setTextFuture(Future<PrecomputedTextCompat> future) {
        this.f35273j = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(PrecomputedTextCompat.a aVar) {
        int i = Build.VERSION.SDK_INT;
        TextDirectionHeuristic textDirectionHeuristic = aVar.f37956b;
        int i2 = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        if (i >= 23) {
            getPaint().set(aVar.f37955a);
            setBreakStrategy(aVar.f37957c);
            setHyphenationFrequency(aVar.f37958d);
        } else {
            float textScaleX = aVar.f37955a.getTextScaleX();
            getPaint().set(aVar.f37955a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = AutoSizeableTextView.f38127a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper == null || z || appCompatTextHelper.m14987d()) {
            return;
        }
        appCompatTextHelper.f35253i.m14832f(i, f);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        if (this.f35272i) {
            return;
        }
        Typeface typefaceCreate = null;
        if (typeface != null && i > 0) {
            Context context = getContext();
            TypefaceCompatBaseImpl2 typefaceCompatBaseImpl2 = TypefaceCompat.f37857a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.f35272i = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f35272i = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TintContextWrapper.m14982a(context);
        this.f35272i = false;
        ThemeUtils.m14962a(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f35269f = appCompatBackgroundHelper;
        appCompatBackgroundHelper.m14879d(attributeSet, i);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f35270g = appCompatTextHelper;
        appCompatTextHelper.m14988e(attributeSet, i);
        appCompatTextHelper.m14986b();
        this.f35271h = new AppCompatTextClassifierHelper(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AppCompatResources.m14707b(context, i) : null, i2 != 0 ? AppCompatResources.m14707b(context, i2) : null, i3 != 0 ? AppCompatResources.m14707b(context, i3) : null, i4 != 0 ? AppCompatResources.m14707b(context, i4) : null);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AppCompatResources.m14707b(context, i) : null, i2 != 0 ? AppCompatResources.m14707b(context, i2) : null, i3 != 0 ? AppCompatResources.m14707b(context, i3) : null, i4 != 0 ? AppCompatResources.m14707b(context, i4) : null);
        AppCompatTextHelper appCompatTextHelper = this.f35270g;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.m14986b();
        }
    }
}
