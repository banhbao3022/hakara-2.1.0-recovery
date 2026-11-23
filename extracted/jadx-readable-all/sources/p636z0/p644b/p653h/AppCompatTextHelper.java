package p636z0.p644b.p653h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.ResourcesCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p741c0.EditorInfoCompat;
import p636z0.p725k.p742m.AutoSizeableTextView;
import p636z0.p725k.p742m.TintableCompoundDrawablesView;

/* JADX INFO: renamed from: z0.b.h.x, reason: use source file name */
/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatTextHelper {

    /* JADX INFO: renamed from: a */
    public final TextView f35245a;

    /* JADX INFO: renamed from: b */
    public TintInfo f35246b;

    /* JADX INFO: renamed from: c */
    public TintInfo f35247c;

    /* JADX INFO: renamed from: d */
    public TintInfo f35248d;

    /* JADX INFO: renamed from: e */
    public TintInfo f35249e;

    /* JADX INFO: renamed from: f */
    public TintInfo f35250f;

    /* JADX INFO: renamed from: g */
    public TintInfo f35251g;

    /* JADX INFO: renamed from: h */
    public TintInfo f35252h;

    /* JADX INFO: renamed from: i */
    public final AppCompatTextViewAutoSizeHelper f35253i;

    /* JADX INFO: renamed from: j */
    public int f35254j = 0;

    /* JADX INFO: renamed from: k */
    public int f35255k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f35256l;

    /* JADX INFO: renamed from: m */
    public boolean f35257m;

    /* JADX INFO: renamed from: z0.b.h.x$a */
    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    public class a extends ResourcesCompat.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f35258a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f35259b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ WeakReference f35260c;

        public a(int i, int i2, WeakReference weakReference) {
            this.f35258a = i;
            this.f35259b = i2;
            this.f35260c = weakReference;
        }

        @Override // p636z0.p725k.p727d.p728c.ResourcesCompat.c
        /* JADX INFO: renamed from: d */
        public void mo11356d(int i) {
        }

        @Override // p636z0.p725k.p727d.p728c.ResourcesCompat.c
        /* JADX INFO: renamed from: e */
        public void mo11357e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f35258a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f35259b & 2) != 0);
            }
            AppCompatTextHelper appCompatTextHelper = AppCompatTextHelper.this;
            WeakReference weakReference = this.f35260c;
            if (appCompatTextHelper.f35257m) {
                appCompatTextHelper.f35256l = typeface;
                TextView textView = (TextView) weakReference.get();
                if (textView != null) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    if (textView.isAttachedToWindow()) {
                        textView.post(new AppCompatTextHelper2(appCompatTextHelper, textView, typeface, appCompatTextHelper.f35254j));
                    } else {
                        textView.setTypeface(typeface, appCompatTextHelper.f35254j);
                    }
                }
            }
        }
    }

    public AppCompatTextHelper(TextView textView) {
        this.f35245a = textView;
        this.f35253i = new AppCompatTextViewAutoSizeHelper(textView);
    }

    /* JADX INFO: renamed from: c */
    public static TintInfo m14984c(Context context, AppCompatDrawableManager appCompatDrawableManager, int i) {
        ColorStateList colorStateListM14909d = appCompatDrawableManager.m14909d(context, i);
        if (colorStateListM14909d == null) {
            return null;
        }
        TintInfo tintInfo = new TintInfo();
        tintInfo.f35244d = true;
        tintInfo.f35241a = colorStateListM14909d;
        return tintInfo;
    }

    /* JADX INFO: renamed from: a */
    public final void m14985a(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.m14907f(drawable, tintInfo, this.f35245a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public void m14986b() {
        if (this.f35246b != null || this.f35247c != null || this.f35248d != null || this.f35249e != null) {
            Drawable[] compoundDrawables = this.f35245a.getCompoundDrawables();
            m14985a(compoundDrawables[0], this.f35246b);
            m14985a(compoundDrawables[1], this.f35247c);
            m14985a(compoundDrawables[2], this.f35248d);
            m14985a(compoundDrawables[3], this.f35249e);
        }
        if (this.f35250f == null && this.f35251g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f35245a.getCompoundDrawablesRelative();
        m14985a(compoundDrawablesRelative[0], this.f35250f);
        m14985a(compoundDrawablesRelative[2], this.f35251g);
    }

    /* JADX INFO: renamed from: d */
    public boolean m14987d() {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f35253i;
        return appCompatTextViewAutoSizeHelper.m14835i() && appCompatTextViewAutoSizeHelper.f34941d != 0;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: e */
    public void m14988e(AttributeSet attributeSet, int i) {
        boolean zM14999a;
        String strM15012n;
        boolean z;
        ColorStateList colorStateListM15001c;
        ColorStateList colorStateListM15001c2;
        ColorStateList colorStateListM15001c3;
        String strM15012n2;
        AppCompatDrawableManager appCompatDrawableManager;
        int i2;
        AppCompatDrawableManager appCompatDrawableManager2;
        int i3;
        Drawable drawableM14908b;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        int i4;
        int i5;
        Context context = this.f35245a.getContext();
        AppCompatDrawableManager appCompatDrawableManagerM14904a = AppCompatDrawableManager.m14904a();
        int[] iArr = C7463b.f34392h;
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(context, attributeSet, iArr, i, 0);
        TextView textView = this.f35245a;
        ViewCompat.m16326t(textView, textView.getContext(), iArr, attributeSet, tintTypedArrayM14998r.f35267b, i, 0);
        int iM15011m = tintTypedArrayM14998r.m15011m(0, -1);
        if (tintTypedArrayM14998r.m15014p(3)) {
            this.f35246b = m14984c(context, appCompatDrawableManagerM14904a, tintTypedArrayM14998r.m15011m(3, 0));
        }
        if (tintTypedArrayM14998r.m15014p(1)) {
            this.f35247c = m14984c(context, appCompatDrawableManagerM14904a, tintTypedArrayM14998r.m15011m(1, 0));
        }
        if (tintTypedArrayM14998r.m15014p(4)) {
            this.f35248d = m14984c(context, appCompatDrawableManagerM14904a, tintTypedArrayM14998r.m15011m(4, 0));
        }
        if (tintTypedArrayM14998r.m15014p(2)) {
            this.f35249e = m14984c(context, appCompatDrawableManagerM14904a, tintTypedArrayM14998r.m15011m(2, 0));
        }
        int i6 = Build.VERSION.SDK_INT;
        if (tintTypedArrayM14998r.m15014p(5)) {
            this.f35250f = m14984c(context, appCompatDrawableManagerM14904a, tintTypedArrayM14998r.m15011m(5, 0));
        }
        if (tintTypedArrayM14998r.m15014p(6)) {
            this.f35251g = m14984c(context, appCompatDrawableManagerM14904a, tintTypedArrayM14998r.m15011m(6, 0));
        }
        tintTypedArrayM14998r.f35267b.recycle();
        boolean z2 = this.f35245a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iM15011m != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iM15011m, C7463b.f34406v);
            TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
            if (z2 || !tintTypedArray.m15014p(14)) {
                zM14999a = false;
                z = false;
            } else {
                zM14999a = tintTypedArray.m14999a(14, false);
                z = true;
            }
            m14996m(context, tintTypedArray);
            if (i6 < 23) {
                colorStateListM15001c = tintTypedArray.m15014p(3) ? tintTypedArray.m15001c(3) : null;
                colorStateListM15001c2 = tintTypedArray.m15014p(4) ? tintTypedArray.m15001c(4) : null;
                if (tintTypedArray.m15014p(5)) {
                    colorStateListM15001c3 = tintTypedArray.m15001c(5);
                    i4 = 15;
                }
                if (tintTypedArray.m15014p(i4)) {
                    strM15012n2 = tintTypedArray.m15012n(i4);
                    i5 = 26;
                } else {
                    i5 = 26;
                    strM15012n2 = null;
                }
                if (i6 >= i5 || !tintTypedArray.m15014p(13)) {
                    strM15012n = null;
                } else {
                    strM15012n = tintTypedArray.m15012n(13);
                }
                typedArrayObtainStyledAttributes.recycle();
            } else {
                colorStateListM15001c = null;
                colorStateListM15001c2 = null;
            }
            i4 = 15;
            colorStateListM15001c3 = null;
            if (tintTypedArray.m15014p(i4)) {
                strM15012n2 = tintTypedArray.m15012n(i4);
                i5 = 26;
            } else {
                i5 = 26;
                strM15012n2 = null;
            }
            if (i6 >= i5) {
                strM15012n = null;
            } else {
                strM15012n = null;
            }
            typedArrayObtainStyledAttributes.recycle();
        } else {
            zM14999a = false;
            strM15012n = null;
            z = false;
            colorStateListM15001c = null;
            colorStateListM15001c2 = null;
            colorStateListM15001c3 = null;
            strM15012n2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C7463b.f34406v, i, 0);
        TintTypedArray tintTypedArray2 = new TintTypedArray(context, typedArrayObtainStyledAttributes2);
        if (!z2 && tintTypedArray2.m15014p(14)) {
            zM14999a = tintTypedArray2.m14999a(14, false);
            z = true;
        }
        if (i6 < 23) {
            if (tintTypedArray2.m15014p(3)) {
                colorStateListM15001c = tintTypedArray2.m15001c(3);
            }
            if (tintTypedArray2.m15014p(4)) {
                colorStateListM15001c2 = tintTypedArray2.m15001c(4);
            }
            if (tintTypedArray2.m15014p(5)) {
                colorStateListM15001c3 = tintTypedArray2.m15001c(5);
            }
        }
        ColorStateList colorStateList2 = colorStateListM15001c;
        ColorStateList colorStateList3 = colorStateListM15001c2;
        ColorStateList colorStateList4 = colorStateListM15001c3;
        if (tintTypedArray2.m15014p(15)) {
            strM15012n2 = tintTypedArray2.m15012n(15);
        }
        String str = strM15012n2;
        if (i6 >= 26 && tintTypedArray2.m15014p(13)) {
            strM15012n = tintTypedArray2.m15012n(13);
        }
        if (i6 < 28 || !tintTypedArray2.m15014p(0)) {
            appCompatDrawableManager = appCompatDrawableManagerM14904a;
        } else {
            appCompatDrawableManager = appCompatDrawableManagerM14904a;
            if (tintTypedArray2.m15004f(0, -1) == 0) {
                this.f35245a.setTextSize(0, 0.0f);
            }
        }
        m14996m(context, tintTypedArray2);
        typedArrayObtainStyledAttributes2.recycle();
        if (colorStateList2 != null) {
            this.f35245a.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            this.f35245a.setHintTextColor(colorStateList3);
        }
        if (colorStateList4 != null) {
            this.f35245a.setLinkTextColor(colorStateList4);
        }
        if (!z2 && z) {
            this.f35245a.setAllCaps(zM14999a);
        }
        Typeface typeface = this.f35256l;
        if (typeface != null) {
            if (this.f35255k == -1) {
                this.f35245a.setTypeface(typeface, this.f35254j);
            } else {
                this.f35245a.setTypeface(typeface);
            }
        }
        if (strM15012n != null) {
            this.f35245a.setFontVariationSettings(strM15012n);
        }
        if (str == null) {
            i2 = 0;
        } else if (i6 >= 24) {
            this.f35245a.setTextLocales(LocaleList.forLanguageTags(str));
            i2 = 0;
        } else {
            i2 = 0;
            this.f35245a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
        }
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f35253i;
        Context context2 = appCompatTextViewAutoSizeHelper.f34950m;
        int[] iArr2 = C7463b.f34393i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i, i2);
        TextView textView2 = appCompatTextViewAutoSizeHelper.f34949l;
        ViewCompat.m16326t(textView2, textView2.getContext(), iArr2, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            appCompatTextViewAutoSizeHelper.f34941d = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr3[i7] = typedArrayObtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                appCompatTextViewAutoSizeHelper.f34946i = appCompatTextViewAutoSizeHelper.m14830b(iArr3);
                appCompatTextViewAutoSizeHelper.m14834h();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!appCompatTextViewAutoSizeHelper.m14835i()) {
            appCompatTextViewAutoSizeHelper.f34941d = 0;
        } else if (appCompatTextViewAutoSizeHelper.f34941d == 1) {
            if (!appCompatTextViewAutoSizeHelper.f34947j) {
                DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f34950m.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                appCompatTextViewAutoSizeHelper.m14836j(dimension2, dimension3, dimension);
            }
            appCompatTextViewAutoSizeHelper.m14833g();
        }
        if (AutoSizeableTextView.f38127a) {
            AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper2 = this.f35253i;
            if (appCompatTextViewAutoSizeHelper2.f34941d != 0) {
                int[] iArr4 = appCompatTextViewAutoSizeHelper2.f34946i;
                if (iArr4.length > 0) {
                    if (this.f35245a.getAutoSizeStepGranularity() != -1.0f) {
                        this.f35245a.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f35253i.f34944g), Math.round(this.f35253i.f34945h), Math.round(this.f35253i.f34943f), 0);
                    } else {
                        this.f35245a.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                    }
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, C7463b.f34393i);
        int resourceId3 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        if (resourceId3 != -1) {
            appCompatDrawableManager2 = appCompatDrawableManager;
            drawableM14908b = appCompatDrawableManager2.m14908b(context, resourceId3);
            i3 = 13;
        } else {
            appCompatDrawableManager2 = appCompatDrawableManager;
            i3 = 13;
            drawableM14908b = null;
        }
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(i3, -1);
        Drawable drawableM14908b2 = resourceId4 != -1 ? appCompatDrawableManager2.m14908b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM14908b3 = resourceId5 != -1 ? appCompatDrawableManager2.m14908b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM14908b4 = resourceId6 != -1 ? appCompatDrawableManager2.m14908b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM14908b5 = resourceId7 != -1 ? appCompatDrawableManager2.m14908b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM14908b6 = resourceId8 != -1 ? appCompatDrawableManager2.m14908b(context, resourceId8) : null;
        if (drawableM14908b5 != null || drawableM14908b6 != null) {
            Drawable[] compoundDrawablesRelative = this.f35245a.getCompoundDrawablesRelative();
            TextView textView3 = this.f35245a;
            if (drawableM14908b5 == null) {
                drawableM14908b5 = compoundDrawablesRelative[0];
            }
            if (drawableM14908b2 == null) {
                drawableM14908b2 = compoundDrawablesRelative[1];
            }
            if (drawableM14908b6 == null) {
                drawableM14908b6 = compoundDrawablesRelative[2];
            }
            if (drawableM14908b4 == null) {
                drawableM14908b4 = compoundDrawablesRelative[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM14908b5, drawableM14908b2, drawableM14908b6, drawableM14908b4);
        } else if (drawableM14908b != null || drawableM14908b2 != null || drawableM14908b3 != null || drawableM14908b4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f35245a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f35245a.getCompoundDrawables();
                TextView textView4 = this.f35245a;
                if (drawableM14908b == null) {
                    drawableM14908b = compoundDrawables[0];
                }
                if (drawableM14908b2 == null) {
                    drawableM14908b2 = compoundDrawables[1];
                }
                if (drawableM14908b3 == null) {
                    drawableM14908b3 = compoundDrawables[2];
                }
                if (drawableM14908b4 == null) {
                    drawableM14908b4 = compoundDrawables[3];
                }
                textView4.setCompoundDrawablesWithIntrinsicBounds(drawableM14908b, drawableM14908b2, drawableM14908b3, drawableM14908b4);
            } else {
                TextView textView5 = this.f35245a;
                Drawable drawable = compoundDrawablesRelative2[0];
                if (drawableM14908b2 == null) {
                    drawableM14908b2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (drawableM14908b4 == null) {
                    drawableM14908b4 = compoundDrawablesRelative2[3];
                }
                textView5.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM14908b2, drawable2, drawableM14908b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AppCompatResources.m14706a(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            TextView textView6 = this.f35245a;
            Objects.requireNonNull(textView6);
            if (Build.VERSION.SDK_INT >= 24) {
                textView6.setCompoundDrawableTintList(colorStateList);
            } else if (textView6 instanceof TintableCompoundDrawablesView) {
                ((TintableCompoundDrawablesView) textView6).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode modeM14887c = DrawableUtils.m14887c(typedArrayObtainStyledAttributes4.getInt(12, -1), null);
            TextView textView7 = this.f35245a;
            Objects.requireNonNull(textView7);
            if (Build.VERSION.SDK_INT >= 24) {
                textView7.setCompoundDrawableTintMode(modeM14887c);
            } else if (textView7 instanceof TintableCompoundDrawablesView) {
                ((TintableCompoundDrawablesView) textView7).setSupportCompoundDrawablesTintMode(modeM14887c);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(14, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(17, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            C8162a.m16041L(this.f35245a, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            C8162a.m16042M(this.f35245a, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            C8162a.m16044O(this.f35245a, dimensionPixelSize3);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14989f(Context context, int i) {
        String strM15012n;
        ColorStateList colorStateListM15001c;
        ColorStateList colorStateListM15001c2;
        ColorStateList colorStateListM15001c3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C7463b.f34406v);
        TintTypedArray tintTypedArray = new TintTypedArray(context, typedArrayObtainStyledAttributes);
        if (tintTypedArray.m15014p(14)) {
            this.f35245a.setAllCaps(tintTypedArray.m14999a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (tintTypedArray.m15014p(3) && (colorStateListM15001c3 = tintTypedArray.m15001c(3)) != null) {
                this.f35245a.setTextColor(colorStateListM15001c3);
            }
            if (tintTypedArray.m15014p(5) && (colorStateListM15001c2 = tintTypedArray.m15001c(5)) != null) {
                this.f35245a.setLinkTextColor(colorStateListM15001c2);
            }
            if (tintTypedArray.m15014p(4) && (colorStateListM15001c = tintTypedArray.m15001c(4)) != null) {
                this.f35245a.setHintTextColor(colorStateListM15001c);
            }
        }
        if (tintTypedArray.m15014p(0) && tintTypedArray.m15004f(0, -1) == 0) {
            this.f35245a.setTextSize(0, 0.0f);
        }
        m14996m(context, tintTypedArray);
        if (i2 >= 26 && tintTypedArray.m15014p(13) && (strM15012n = tintTypedArray.m15012n(13)) != null) {
            this.f35245a.setFontVariationSettings(strM15012n);
        }
        typedArrayObtainStyledAttributes.recycle();
        Typeface typeface = this.f35256l;
        if (typeface != null) {
            this.f35245a.setTypeface(typeface, this.f35254j);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14990g(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        Objects.requireNonNull(text);
        if (i >= 30) {
            editorInfo.setInitialSurroundingSubText(text, 0);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 + 0 : i2 + 0;
        int i5 = i2 > i3 ? i2 - 0 : i3 + 0;
        int length = text.length();
        if (i4 < 0 || i5 > length) {
            EditorInfoCompat.m16283b(editorInfo, null, 0, 0);
            return;
        }
        int i6 = editorInfo.inputType & 4095;
        if (i6 == 129 || i6 == 225 || i6 == 18) {
            EditorInfoCompat.m16283b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            EditorInfoCompat.m16283b(editorInfo, text, i4, i5);
            return;
        }
        int i7 = i5 - i4;
        int i8 = i7 > 1024 ? 0 : i7;
        int i9 = 2048 - i8;
        int iMin = Math.min(text.length() - i5, i9 - Math.min(i4, (int) (((double) i9) * 0.8d)));
        int iMin2 = Math.min(i4, i9 - iMin);
        int i10 = i4 - iMin2;
        if (EditorInfoCompat.m16282a(text, i10, 0)) {
            i10++;
            iMin2--;
        }
        if (EditorInfoCompat.m16282a(text, (i5 + iMin) - 1, 1)) {
            iMin--;
        }
        CharSequence charSequenceConcat = i8 != i7 ? TextUtils.concat(text.subSequence(i10, i10 + iMin2), text.subSequence(i5, iMin + i5)) : text.subSequence(i10, iMin2 + i8 + iMin + i10);
        int i11 = iMin2 + 0;
        EditorInfoCompat.m16283b(editorInfo, charSequenceConcat, i11, i8 + i11);
    }

    /* JADX INFO: renamed from: h */
    public void m14991h(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f35253i;
        if (appCompatTextViewAutoSizeHelper.m14835i()) {
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f34950m.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.m14836j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (appCompatTextViewAutoSizeHelper.m14833g()) {
                appCompatTextViewAutoSizeHelper.m14829a();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void m14992i(int[] iArr, int i) throws IllegalArgumentException {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f35253i;
        if (appCompatTextViewAutoSizeHelper.m14835i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f34950m.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                appCompatTextViewAutoSizeHelper.f34946i = appCompatTextViewAutoSizeHelper.m14830b(iArrCopyOf);
                if (!appCompatTextViewAutoSizeHelper.m14834h()) {
                    StringBuilder sbM1556G = outline.m1556G("None of the preset sizes is valid: ");
                    sbM1556G.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sbM1556G.toString());
                }
            } else {
                appCompatTextViewAutoSizeHelper.f34947j = false;
            }
            if (appCompatTextViewAutoSizeHelper.m14833g()) {
                appCompatTextViewAutoSizeHelper.m14829a();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m14993j(int i) {
        AppCompatTextViewAutoSizeHelper appCompatTextViewAutoSizeHelper = this.f35253i;
        if (appCompatTextViewAutoSizeHelper.m14835i()) {
            if (i == 0) {
                appCompatTextViewAutoSizeHelper.f34941d = 0;
                appCompatTextViewAutoSizeHelper.f34944g = -1.0f;
                appCompatTextViewAutoSizeHelper.f34945h = -1.0f;
                appCompatTextViewAutoSizeHelper.f34943f = -1.0f;
                appCompatTextViewAutoSizeHelper.f34946i = new int[0];
                appCompatTextViewAutoSizeHelper.f34942e = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(outline.m1590l("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = appCompatTextViewAutoSizeHelper.f34950m.getResources().getDisplayMetrics();
            appCompatTextViewAutoSizeHelper.m14836j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (appCompatTextViewAutoSizeHelper.m14833g()) {
                appCompatTextViewAutoSizeHelper.m14829a();
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14994k(ColorStateList colorStateList) {
        if (this.f35252h == null) {
            this.f35252h = new TintInfo();
        }
        TintInfo tintInfo = this.f35252h;
        tintInfo.f35241a = colorStateList;
        tintInfo.f35244d = colorStateList != null;
        this.f35246b = tintInfo;
        this.f35247c = tintInfo;
        this.f35248d = tintInfo;
        this.f35249e = tintInfo;
        this.f35250f = tintInfo;
        this.f35251g = tintInfo;
    }

    /* JADX INFO: renamed from: l */
    public void m14995l(PorterDuff.Mode mode) {
        if (this.f35252h == null) {
            this.f35252h = new TintInfo();
        }
        TintInfo tintInfo = this.f35252h;
        tintInfo.f35242b = mode;
        tintInfo.f35243c = mode != null;
        this.f35246b = tintInfo;
        this.f35247c = tintInfo;
        this.f35248d = tintInfo;
        this.f35249e = tintInfo;
        this.f35250f = tintInfo;
        this.f35251g = tintInfo;
    }

    /* JADX INFO: renamed from: m */
    public final void m14996m(Context context, TintTypedArray tintTypedArray) {
        String strM15012n;
        this.f35254j = tintTypedArray.m15008j(2, this.f35254j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iM15008j = tintTypedArray.m15008j(11, -1);
            this.f35255k = iM15008j;
            if (iM15008j != -1) {
                this.f35254j = (this.f35254j & 2) | 0;
            }
        }
        if (!tintTypedArray.m15014p(10) && !tintTypedArray.m15014p(12)) {
            if (tintTypedArray.m15014p(1)) {
                this.f35257m = false;
                int iM15008j2 = tintTypedArray.m15008j(1, 1);
                if (iM15008j2 == 1) {
                    this.f35256l = Typeface.SANS_SERIF;
                    return;
                } else if (iM15008j2 == 2) {
                    this.f35256l = Typeface.SERIF;
                    return;
                } else {
                    if (iM15008j2 != 3) {
                        return;
                    }
                    this.f35256l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f35256l = null;
        int i2 = tintTypedArray.m15014p(12) ? 12 : 10;
        int i3 = this.f35255k;
        int i4 = this.f35254j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM15007i = tintTypedArray.m15007i(i2, this.f35254j, new a(i3, i4, new WeakReference(this.f35245a)));
                if (typefaceM15007i != null) {
                    if (i < 28 || this.f35255k == -1) {
                        this.f35256l = typefaceM15007i;
                    } else {
                        this.f35256l = Typeface.create(Typeface.create(typefaceM15007i, 0), this.f35255k, (this.f35254j & 2) != 0);
                    }
                }
                this.f35257m = this.f35256l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f35256l != null || (strM15012n = tintTypedArray.m15012n(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f35255k == -1) {
            this.f35256l = Typeface.create(strM15012n, this.f35254j);
        } else {
            this.f35256l = Typeface.create(Typeface.create(strM15012n, 0), this.f35255k, (this.f35254j & 2) != 0);
        }
    }
}
