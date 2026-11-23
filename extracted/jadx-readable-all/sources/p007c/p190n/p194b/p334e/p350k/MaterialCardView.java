package p007c.p190n.p194b.p334e.p350k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p334e.C4801b;
import p007c.p190n.p194b.p334e.p340d0.p341a.MaterialThemeOverlay;
import p007c.p190n.p194b.p334e.p360t.ThemeEnforcement;
import p007c.p190n.p194b.p334e.p365y.MaterialShapeDrawable;
import p007c.p190n.p194b.p334e.p365y.ShapeAppearanceModel;
import p007c.p190n.p194b.p334e.p365y.Shapeable;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: c.n.b.e.k.a, reason: use source file name */
/* JADX INFO: compiled from: MaterialCardView.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {

    /* JADX INFO: renamed from: o */
    public static final int[] f25087o = {R.attr.state_checkable};

    /* JADX INFO: renamed from: p */
    public static final int[] f25088p = {R.attr.state_checked};

    /* JADX INFO: renamed from: q */
    public static final int[] f25089q = {mtp.media.karaoke.R.attr.state_dragged};

    /* JADX INFO: renamed from: r */
    public final MaterialCardViewHelper f25090r;

    /* JADX INFO: renamed from: s */
    public boolean f25091s;

    /* JADX INFO: renamed from: t */
    public boolean f25092t;

    /* JADX INFO: renamed from: u */
    public boolean f25093u;

    /* JADX INFO: renamed from: v */
    public a f25094v;

    /* JADX INFO: renamed from: c.n.b.e.k.a$a */
    /* JADX INFO: compiled from: MaterialCardView.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m11137a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f25090r.f25099e.getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: f */
    public final void m11135f() {
        MaterialCardViewHelper materialCardViewHelper;
        Drawable drawable;
        if (Build.VERSION.SDK_INT <= 26 || (drawable = (materialCardViewHelper = this.f25090r).f25110p) == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.bottom;
        materialCardViewHelper.f25110p.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        materialCardViewHelper.f25110p.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    /* JADX INFO: renamed from: g */
    public boolean m11136g() {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        return materialCardViewHelper != null && materialCardViewHelper.f25115u;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f25090r.f25099e.f25574h.f25597d;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f25090r.f25100f.f25574h.f25597d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f25090r.f25105k;
    }

    public int getCheckedIconMargin() {
        return this.f25090r.f25101g;
    }

    public int getCheckedIconSize() {
        return this.f25090r.f25102h;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f25090r.f25107m;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f25090r.f25098d.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f25090r.f25098d.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f25090r.f25098d.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f25090r.f25098d.top;
    }

    public float getProgress() {
        return this.f25090r.f25099e.f25574h.f25604k;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f25090r.f25099e.m11376l();
    }

    public ColorStateList getRippleColor() {
        return this.f25090r.f25106l;
    }

    public ShapeAppearanceModel getShapeAppearanceModel() {
        return this.f25090r.f25108n;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f25090r.f25109o;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f25090r.f25109o;
    }

    public int getStrokeWidth() {
        return this.f25090r.f25103i;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f25092t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4799a.m11005o0(this, this.f25090r.f25099e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (m11136g()) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f25087o);
        }
        if (this.f25092t) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f25088p);
        }
        if (this.f25093u) {
            FrameLayout.mergeDrawableStates(iArrOnCreateDrawableState, f25089q);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.f25092t);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(m11136g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.f25092t);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        super.onMeasure(i, i2);
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (materialCardViewHelper.f25111q != null) {
            int i5 = materialCardViewHelper.f25101g;
            int i6 = materialCardViewHelper.f25102h;
            int iCeil = (measuredWidth - i5) - i6;
            int iCeil2 = (measuredHeight - i5) - i6;
            if (materialCardViewHelper.f25097c.getUseCompatPadding()) {
                iCeil2 -= (int) Math.ceil(materialCardViewHelper.m11141d() * 2.0f);
                iCeil -= (int) Math.ceil(materialCardViewHelper.m11140c() * 2.0f);
            }
            int i7 = iCeil2;
            int i8 = materialCardViewHelper.f25101g;
            MaterialCardView materialCardView = materialCardViewHelper.f25097c;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = iCeil;
                i3 = i8;
            } else {
                i3 = iCeil;
                i4 = i8;
            }
            materialCardViewHelper.f25111q.setLayerInset(2, i3, materialCardViewHelper.f25101g, i4, i7);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f25091s) {
            if (!this.f25090r.f25114t) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f25090r.f25114t = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        materialCardViewHelper.f25099e.m11381q(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        materialCardViewHelper.f25099e.m11380p(materialCardViewHelper.f25097c.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.f25090r.f25100f;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.m11381q(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.f25090r.f25115u = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f25092t != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f25090r.m11144g(drawable);
    }

    public void setCheckedIconMargin(int i) {
        this.f25090r.f25101g = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f25090r.f25101g = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f25090r.m11144g(AppCompatResources.m14707b(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f25090r.f25102h = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f25090r.f25102h = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        materialCardViewHelper.f25107m = colorStateList;
        Drawable drawable = materialCardViewHelper.f25105k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        if (materialCardViewHelper != null) {
            Drawable drawable = materialCardViewHelper.f25104j;
            Drawable drawableM11142e = materialCardViewHelper.f25097c.isClickable() ? materialCardViewHelper.m11142e() : materialCardViewHelper.f25100f;
            materialCardViewHelper.f25104j = drawableM11142e;
            if (drawable != drawableM11142e) {
                if (Build.VERSION.SDK_INT < 23 || !(materialCardViewHelper.f25097c.getForeground() instanceof InsetDrawable)) {
                    materialCardViewHelper.f25097c.setForeground(materialCardViewHelper.m11143f(drawableM11142e));
                } else {
                    ((InsetDrawable) materialCardViewHelper.f25097c.getForeground()).setDrawable(drawableM11142e);
                }
            }
        }
    }

    public void setDragged(boolean z) {
        if (this.f25093u != z) {
            this.f25093u = z;
            refreshDrawableState();
            m11135f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.f25090r.m11149l();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f25094v = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f25090r.m11149l();
        this.f25090r.m11148k();
    }

    public void setProgress(float f) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        materialCardViewHelper.f25099e.m11382r(f);
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.f25100f;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.m11382r(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.f25113s;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.m11382r(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        materialCardViewHelper.m11145h(materialCardViewHelper.f25108n.m11396f(f));
        materialCardViewHelper.f25104j.invalidateSelf();
        if (materialCardViewHelper.m11147j() || materialCardViewHelper.m11146i()) {
            materialCardViewHelper.m11148k();
        }
        if (materialCardViewHelper.m11147j()) {
            materialCardViewHelper.m11149l();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        materialCardViewHelper.f25106l = colorStateList;
        materialCardViewHelper.m11150m();
    }

    public void setRippleColorResource(int i) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        materialCardViewHelper.f25106l = AppCompatResources.m14706a(getContext(), i);
        materialCardViewHelper.m11150m();
    }

    @Override // p007c.p190n.p194b.p334e.p365y.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        setClipToOutline(shapeAppearanceModel.m11395e(getBoundsAsRectF()));
        this.f25090r.m11145h(shapeAppearanceModel);
    }

    public void setStrokeColor(int i) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        if (materialCardViewHelper.f25109o == colorStateListValueOf) {
            return;
        }
        materialCardViewHelper.f25109o = colorStateListValueOf;
        materialCardViewHelper.m11151n();
    }

    public void setStrokeWidth(int i) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        if (i == materialCardViewHelper.f25103i) {
            return;
        }
        materialCardViewHelper.f25103i = i;
        materialCardViewHelper.m11151n();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f25090r.m11149l();
        this.f25090r.m11148k();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (m11136g() && isEnabled()) {
            this.f25092t = !this.f25092t;
            refreshDrawableState();
            m11135f();
            a aVar = this.f25094v;
            if (aVar != null) {
                aVar.m11137a(this, this.f25092t);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.m11090a(context, attributeSet, i, 2132017888), attributeSet, i);
        this.f25092t = false;
        this.f25093u = false;
        this.f25091s = true;
        TypedArray typedArrayM11347d = ThemeEnforcement.m11347d(getContext(), attributeSet, C4801b.f24729A, i, 2132017888, new int[0]);
        MaterialCardViewHelper materialCardViewHelper = new MaterialCardViewHelper(this, attributeSet, i, 2132017888);
        this.f25090r = materialCardViewHelper;
        materialCardViewHelper.f25099e.m11381q(super.getCardBackgroundColor());
        materialCardViewHelper.f25098d.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        materialCardViewHelper.m11148k();
        ColorStateList colorStateListM10961L = C4799a.m10961L(materialCardViewHelper.f25097c.getContext(), typedArrayM11347d, 10);
        materialCardViewHelper.f25109o = colorStateListM10961L;
        if (colorStateListM10961L == null) {
            materialCardViewHelper.f25109o = ColorStateList.valueOf(-1);
        }
        materialCardViewHelper.f25103i = typedArrayM11347d.getDimensionPixelSize(11, 0);
        boolean z = typedArrayM11347d.getBoolean(0, false);
        materialCardViewHelper.f25115u = z;
        materialCardViewHelper.f25097c.setLongClickable(z);
        materialCardViewHelper.f25107m = C4799a.m10961L(materialCardViewHelper.f25097c.getContext(), typedArrayM11347d, 5);
        materialCardViewHelper.m11144g(C4799a.m10963N(materialCardViewHelper.f25097c.getContext(), typedArrayM11347d, 2));
        materialCardViewHelper.f25102h = typedArrayM11347d.getDimensionPixelSize(4, 0);
        materialCardViewHelper.f25101g = typedArrayM11347d.getDimensionPixelSize(3, 0);
        ColorStateList colorStateListM10961L2 = C4799a.m10961L(materialCardViewHelper.f25097c.getContext(), typedArrayM11347d, 6);
        materialCardViewHelper.f25106l = colorStateListM10961L2;
        if (colorStateListM10961L2 == null) {
            materialCardViewHelper.f25106l = ColorStateList.valueOf(C4799a.m10960K(materialCardViewHelper.f25097c, mtp.media.karaoke.R.attr.colorControlHighlight));
        }
        ColorStateList colorStateListM10961L3 = C4799a.m10961L(materialCardViewHelper.f25097c.getContext(), typedArrayM11347d, 1);
        materialCardViewHelper.f25100f.m11381q(colorStateListM10961L3 == null ? ColorStateList.valueOf(0) : colorStateListM10961L3);
        materialCardViewHelper.m11150m();
        materialCardViewHelper.f25099e.m11380p(materialCardViewHelper.f25097c.getCardElevation());
        materialCardViewHelper.m11151n();
        materialCardViewHelper.f25097c.setBackgroundInternal(materialCardViewHelper.m11143f(materialCardViewHelper.f25099e));
        Drawable drawableM11142e = materialCardViewHelper.f25097c.isClickable() ? materialCardViewHelper.m11142e() : materialCardViewHelper.f25100f;
        materialCardViewHelper.f25104j = drawableM11142e;
        materialCardViewHelper.f25097c.setForeground(materialCardViewHelper.m11143f(drawableM11142e));
        typedArrayM11347d.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f25090r.f25099e.m11381q(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.f25090r;
        if (materialCardViewHelper.f25109o == colorStateList) {
            return;
        }
        materialCardViewHelper.f25109o = colorStateList;
        materialCardViewHelper.m11151n();
    }
}
