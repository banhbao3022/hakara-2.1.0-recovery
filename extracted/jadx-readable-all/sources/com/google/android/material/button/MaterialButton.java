package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p349j.MaterialButtonHelper;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p363w.RippleUtils;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p007c.p190n.p194b.p334e.p365y.Shapeable;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p653h.AppCompatButton;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {

    /* JADX INFO: renamed from: h */
    public static final int[] f28876h = {R.attr.state_checkable};

    /* JADX INFO: renamed from: i */
    public static final int[] f28877i = {R.attr.state_checked};

    /* JADX INFO: renamed from: j */
    public final MaterialButtonHelper f28878j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet<InterfaceC5929a> f28879k;

    /* JADX INFO: renamed from: l */
    public InterfaceC5930b f28880l;

    /* JADX INFO: renamed from: m */
    public PorterDuff.Mode f28881m;

    /* JADX INFO: renamed from: n */
    public ColorStateList f28882n;

    /* JADX INFO: renamed from: o */
    public Drawable f28883o;

    /* JADX INFO: renamed from: p */
    public int f28884p;

    /* JADX INFO: renamed from: q */
    public int f28885q;

    /* JADX INFO: renamed from: r */
    public int f28886r;

    /* JADX INFO: renamed from: s */
    public int f28887s;

    /* JADX INFO: renamed from: t */
    public boolean f28888t;

    /* JADX INFO: renamed from: u */
    public boolean f28889u;

    /* JADX INFO: renamed from: v */
    public int f28890v;

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$a */
    public interface InterfaceC5929a {
        /* JADX INFO: renamed from: a */
        void mo12759a(MaterialButton materialButton, boolean z);
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$b */
    public interface InterfaceC5930b {
    }

    /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$c */
    public static class C5931c extends AbsSavedState {
        public static final Parcelable.Creator<C5931c> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public boolean f28891h;

        /* JADX INFO: renamed from: com.google.android.material.button.MaterialButton$c$a */
        public static class a implements Parcelable.ClassLoaderCreator<C5931c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C5931c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C5931c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C5931c[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C5931c(parcel, null);
            }
        }

        public C5931c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeInt(this.f28891h ? 1 : 0);
        }

        public C5931c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                C5931c.class.getClassLoader();
            }
            this.f28891h = parcel.readInt() == 1;
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private String getA11yClassName() {
        return (m12751a() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    /* JADX INFO: renamed from: a */
    public boolean m12751a() {
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        return materialButtonHelper != null && materialButtonHelper.f25084q;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12752b() {
        int i = this.f28890v;
        return i == 3 || i == 4;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m12753c() {
        int i = this.f28890v;
        return i == 1 || i == 2;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m12754d() {
        int i = this.f28890v;
        return i == 16 || i == 32;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12755e() {
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        return (materialButtonHelper == null || materialButtonHelper.f25082o) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final void m12756f() {
        if (m12753c()) {
            setCompoundDrawablesRelative(this.f28883o, null, null, null);
        } else if (m12752b()) {
            setCompoundDrawablesRelative(null, null, this.f28883o, null);
        } else if (m12754d()) {
            setCompoundDrawablesRelative(null, this.f28883o, null, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12757g(boolean z) {
        Drawable drawable = this.f28883o;
        if (drawable != null) {
            Drawable drawableMutate = C8162a.m16054Y(drawable).mutate();
            this.f28883o = drawableMutate;
            drawableMutate.setTintList(this.f28882n);
            PorterDuff.Mode mode = this.f28881m;
            if (mode != null) {
                this.f28883o.setTintMode(mode);
            }
            int intrinsicWidth = this.f28884p;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f28883o.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f28884p;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f28883o.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f28883o;
            int i = this.f28885q;
            int i2 = this.f28886r;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
        if (z) {
            m12756f();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = false;
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((m12753c() && drawable3 != this.f28883o) || ((m12752b() && drawable5 != this.f28883o) || (m12754d() && drawable4 != this.f28883o))) {
            z2 = true;
        }
        if (z2) {
            m12756f();
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m12755e()) {
            return this.f28878j.f25074g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f28883o;
    }

    public int getIconGravity() {
        return this.f28890v;
    }

    public int getIconPadding() {
        return this.f28887s;
    }

    public int getIconSize() {
        return this.f28884p;
    }

    public ColorStateList getIconTint() {
        return this.f28882n;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f28881m;
    }

    public int getInsetBottom() {
        return this.f28878j.f25073f;
    }

    public int getInsetTop() {
        return this.f28878j.f25072e;
    }

    public ColorStateList getRippleColor() {
        if (m12755e()) {
            return this.f28878j.f25079l;
        }
        return null;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        if (m12755e()) {
            return this.f28878j.f25069b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m12755e()) {
            return this.f28878j.f25078k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m12755e()) {
            return this.f28878j.f25075h;
        }
        return 0;
    }

    @Override // p636z0.p644b.p653h.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return m12755e() ? this.f28878j.f25077j : super.getSupportBackgroundTintList();
    }

    @Override // p636z0.p644b.p653h.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m12755e() ? this.f28878j.f25076i : super.getSupportBackgroundTintMode();
    }

    /* JADX INFO: renamed from: h */
    public final void m12758h(int i, int i2) {
        if (this.f28883o == null || getLayout() == null) {
            return;
        }
        if (!m12753c() && !m12752b()) {
            if (m12754d()) {
                this.f28885q = 0;
                if (this.f28890v == 16) {
                    this.f28886r = 0;
                    m12757g(false);
                    return;
                }
                int intrinsicHeight = this.f28884p;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f28883o.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f28887s) - getPaddingBottom()) / 2;
                if (this.f28886r != textHeight) {
                    this.f28886r = textHeight;
                    m12757g(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f28886r = 0;
        int i3 = this.f28890v;
        if (i3 == 1 || i3 == 3) {
            this.f28885q = 0;
            m12757g(false);
            return;
        }
        int intrinsicWidth = this.f28884p;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f28883o.getIntrinsicWidth();
        }
        int textWidth = i - getTextWidth();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int paddingEnd = ((((textWidth - getPaddingEnd()) - intrinsicWidth) - this.f28887s) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.f28890v == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f28885q != paddingEnd) {
            this.f28885q = paddingEnd;
            m12757g(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f28888t;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m12755e()) {
            C4799a.m11005o0(this, this.f28878j.m11128b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m12751a()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f28876h);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f28877i);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // p636z0.p644b.p653h.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // p636z0.p644b.p653h.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m12751a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // p636z0.p644b.p653h.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MaterialButtonHelper materialButtonHelper;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (materialButtonHelper = this.f28878j) == null) {
            return;
        }
        int i5 = i4 - i2;
        int i6 = i3 - i;
        Drawable drawable = materialButtonHelper.f25080m;
        if (drawable != null) {
            drawable.setBounds(materialButtonHelper.f25070c, materialButtonHelper.f25072e, i6 - materialButtonHelper.f25071d, i5 - materialButtonHelper.f25073f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C5931c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C5931c c5931c = (C5931c) parcelable;
        super.onRestoreInstanceState(c5931c.f38150g);
        setChecked(c5931c.f28891h);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        C5931c c5931c = new C5931c(super.onSaveInstanceState());
        c5931c.f28891h = this.f28888t;
        return c5931c;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m12758h(i, i2);
    }

    @Override // p636z0.p644b.p653h.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m12758h(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m12755e()) {
            super.setBackgroundColor(i);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        if (materialButtonHelper.m11128b() != null) {
            materialButtonHelper.m11128b().setTint(i);
        }
    }

    @Override // p636z0.p644b.p653h.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m12755e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        materialButtonHelper.f25082o = true;
        materialButtonHelper.f25068a.setSupportBackgroundTintList(materialButtonHelper.f25077j);
        materialButtonHelper.f25068a.setSupportBackgroundTintMode(materialButtonHelper.f25076i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // p636z0.p644b.p653h.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AppCompatResources.m14707b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (m12755e()) {
            this.f28878j.f25084q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (m12751a() && isEnabled() && this.f28888t != z) {
            this.f28888t = z;
            refreshDrawableState();
            if (this.f28889u) {
                return;
            }
            this.f28889u = true;
            Iterator<InterfaceC5929a> it = this.f28879k.iterator();
            while (it.hasNext()) {
                it.next().mo12759a(this, this.f28888t);
            }
            this.f28889u = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m12755e()) {
            MaterialButtonHelper materialButtonHelper = this.f28878j;
            if (materialButtonHelper.f25083p && materialButtonHelper.f25074g == i) {
                return;
            }
            materialButtonHelper.f25074g = i;
            materialButtonHelper.f25083p = true;
            materialButtonHelper.m11131e(materialButtonHelper.f25069b.m11396f(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m12755e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (m12755e()) {
            MaterialShapeDrawable materialShapeDrawableM11128b = this.f28878j.m11128b();
            MaterialShapeDrawable.b bVar = materialShapeDrawableM11128b.f25574h;
            if (bVar.f25608o != f) {
                bVar.f25608o = f;
                materialShapeDrawableM11128b.m11365A();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f28883o != drawable) {
            this.f28883o = drawable;
            m12757g(true);
            m12758h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f28890v != i) {
            this.f28890v = i;
            m12758h(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f28887s != i) {
            this.f28887s = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AppCompatResources.m14707b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f28884p != i) {
            this.f28884p = i;
            m12757g(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f28882n != colorStateList) {
            this.f28882n = colorStateList;
            m12757g(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f28881m != mode) {
            this.f28881m = mode;
            m12757g(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AppCompatResources.m14706a(getContext(), i));
    }

    public void setInsetBottom(int i) {
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        materialButtonHelper.m11132f(materialButtonHelper.f25072e, i);
    }

    public void setInsetTop(int i) {
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        materialButtonHelper.m11132f(i, materialButtonHelper.f25073f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC5930b interfaceC5930b) {
        this.f28880l = interfaceC5930b;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC5930b interfaceC5930b = this.f28880l;
        if (interfaceC5930b != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m12755e()) {
            MaterialButtonHelper materialButtonHelper = this.f28878j;
            if (materialButtonHelper.f25079l != colorStateList) {
                materialButtonHelper.f25079l = colorStateList;
                if (materialButtonHelper.f25068a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButtonHelper.f25068a.getBackground()).setColor(RippleUtils.m11360c(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m12755e()) {
            setRippleColor(AppCompatResources.m14706a(getContext(), i));
        }
    }

    @Override // p007c.p190n.p194b.p334e.p365y.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        if (!m12755e()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f28878j.m11131e(shapeAppearanceModel);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (m12755e()) {
            MaterialButtonHelper materialButtonHelper = this.f28878j;
            materialButtonHelper.f25081n = z;
            materialButtonHelper.m11134h();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m12755e()) {
            MaterialButtonHelper materialButtonHelper = this.f28878j;
            if (materialButtonHelper.f25078k != colorStateList) {
                materialButtonHelper.f25078k = colorStateList;
                materialButtonHelper.m11134h();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m12755e()) {
            setStrokeColor(AppCompatResources.m14706a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m12755e()) {
            MaterialButtonHelper materialButtonHelper = this.f28878j;
            if (materialButtonHelper.f25075h != i) {
                materialButtonHelper.f25075h = i;
                materialButtonHelper.m11134h();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m12755e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // p636z0.p644b.p653h.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m12755e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        if (materialButtonHelper.f25077j != colorStateList) {
            materialButtonHelper.f25077j = colorStateList;
            if (materialButtonHelper.m11128b() != null) {
                materialButtonHelper.m11128b().setTintList(materialButtonHelper.f25077j);
            }
        }
    }

    @Override // p636z0.p644b.p653h.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m12755e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.f28878j;
        if (materialButtonHelper.f25076i != mode) {
            materialButtonHelper.f25076i = mode;
            if (materialButtonHelper.m11128b() == null || materialButtonHelper.f25076i == null) {
                return;
            }
            materialButtonHelper.m11128b().setTintMode(materialButtonHelper.f25076i);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f28888t);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017876), attributeSet, i);
        this.f28879k = new LinkedHashSet<>();
        this.f28888t = false;
        this.f28889u = false;
        Context context2 = getContext();
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(context2, attributeSet, C4801b.f24768w, i, 2132017876, new int[0]);
        this.f28887s = typedArrayM11347d.getDimensionPixelSize(12, 0);
        this.f28881m = C4799a.m10999l0(typedArrayM11347d.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f28882n = C4799a.m10961L(getContext(), typedArrayM11347d, 14);
        this.f28883o = C4799a.m10963N(getContext(), typedArrayM11347d, 10);
        this.f28890v = typedArrayM11347d.getInteger(11, 1);
        this.f28884p = typedArrayM11347d.getDimensionPixelSize(13, 0);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, ShapeAppearanceModel.m11392b(context2, attributeSet, i, 2132017876).m11398a());
        this.f28878j = materialButtonHelper;
        Objects.requireNonNull(materialButtonHelper);
        materialButtonHelper.f25070c = typedArrayM11347d.getDimensionPixelOffset(1, 0);
        materialButtonHelper.f25071d = typedArrayM11347d.getDimensionPixelOffset(2, 0);
        materialButtonHelper.f25072e = typedArrayM11347d.getDimensionPixelOffset(3, 0);
        materialButtonHelper.f25073f = typedArrayM11347d.getDimensionPixelOffset(4, 0);
        if (typedArrayM11347d.hasValue(8)) {
            int dimensionPixelSize = typedArrayM11347d.getDimensionPixelSize(8, -1);
            materialButtonHelper.f25074g = dimensionPixelSize;
            materialButtonHelper.m11131e(materialButtonHelper.f25069b.m11396f(dimensionPixelSize));
            materialButtonHelper.f25083p = true;
        }
        materialButtonHelper.f25075h = typedArrayM11347d.getDimensionPixelSize(20, 0);
        materialButtonHelper.f25076i = C4799a.m10999l0(typedArrayM11347d.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        materialButtonHelper.f25077j = C4799a.m10961L(getContext(), typedArrayM11347d, 6);
        materialButtonHelper.f25078k = C4799a.m10961L(getContext(), typedArrayM11347d, 19);
        materialButtonHelper.f25079l = C4799a.m10961L(getContext(), typedArrayM11347d, 16);
        materialButtonHelper.f25084q = typedArrayM11347d.getBoolean(5, false);
        materialButtonHelper.f25086s = typedArrayM11347d.getDimensionPixelSize(9, 0);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayM11347d.hasValue(0)) {
            materialButtonHelper.f25082o = true;
            setSupportBackgroundTintList(materialButtonHelper.f25077j);
            setSupportBackgroundTintMode(materialButtonHelper.f25076i);
        } else {
            materialButtonHelper.m11133g();
        }
        setPaddingRelative(paddingStart + materialButtonHelper.f25070c, paddingTop + materialButtonHelper.f25072e, paddingEnd + materialButtonHelper.f25071d, paddingBottom + materialButtonHelper.f25073f);
        typedArrayM11347d.recycle();
        setCompoundDrawablePadding(this.f28887s);
        m12757g(this.f28883o != null);
    }
}
