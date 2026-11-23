package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import p636z0.p644b.p645c.AppCompatDelegateImpl;
import p636z0.p644b.p645c.AppCompatDelegateImpl3;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p653h.DecorContentParent;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public TypedValue f356f;

    /* JADX INFO: renamed from: g */
    public TypedValue f357g;

    /* JADX INFO: renamed from: h */
    public TypedValue f358h;

    /* JADX INFO: renamed from: i */
    public TypedValue f359i;

    /* JADX INFO: renamed from: j */
    public TypedValue f360j;

    /* JADX INFO: renamed from: k */
    public TypedValue f361k;

    /* JADX INFO: renamed from: l */
    public final Rect f362l;

    /* JADX INFO: renamed from: m */
    public InterfaceC0066a f363m;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    public interface InterfaceC0066a {
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f360j == null) {
            this.f360j = new TypedValue();
        }
        return this.f360j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f361k == null) {
            this.f361k = new TypedValue();
        }
        return this.f361k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f358h == null) {
            this.f358h = new TypedValue();
        }
        return this.f358h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f359i == null) {
            this.f359i = new TypedValue();
        }
        return this.f359i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f356f == null) {
            this.f356f = new TypedValue();
        }
        return this.f356f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f357g == null) {
            this.f357g = new TypedValue();
        }
        return this.f357g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0066a interfaceC0066a = this.f363m;
        if (interfaceC0066a != null) {
            Objects.requireNonNull((AppCompatDelegateImpl3) interfaceC0066a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0066a interfaceC0066a = this.f363m;
        if (interfaceC0066a != null) {
            AppCompatDelegateImpl appCompatDelegateImpl = ((AppCompatDelegateImpl3) interfaceC0066a).f34516a;
            DecorContentParent decorContentParent = appCompatDelegateImpl.f34476t;
            if (decorContentParent != null) {
                decorContentParent.mo168i();
            }
            if (appCompatDelegateImpl.f34481y != null) {
                appCompatDelegateImpl.f34470n.getDecorView().removeCallbacks(appCompatDelegateImpl.f34482z);
                if (appCompatDelegateImpl.f34481y.isShowing()) {
                    try {
                        appCompatDelegateImpl.f34481y.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                appCompatDelegateImpl.f34481y = null;
            }
            appCompatDelegateImpl.m14649J();
            MenuBuilder menuBuilder = appCompatDelegateImpl.m14654O(0).f34504h;
            if (menuBuilder != null) {
                menuBuilder.m14769c(true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int i4;
        float fraction;
        int i5;
        int i6;
        float fraction2;
        int i7;
        int i8;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z2 = true;
        boolean z3 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            z = false;
        } else {
            TypedValue typedValue = z3 ? this.f359i : this.f358h;
            if (typedValue == null || (i7 = typedValue.type) == 0) {
                z = false;
            } else {
                if (i7 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i7 == 6) {
                        int i9 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i9, i9);
                    } else {
                        i8 = 0;
                    }
                    if (i8 > 0) {
                        Rect rect = this.f362l;
                        i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z = true;
                    } else {
                        z = false;
                    }
                }
                i8 = (int) fraction3;
                if (i8 > 0) {
                    Rect rect2 = this.f362l;
                    i = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i)), 1073741824);
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z3 ? this.f360j : this.f361k;
            if (typedValue2 != null && (i5 = typedValue2.type) != 0) {
                if (i5 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i5 == 6) {
                        int i10 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i10, i10);
                    } else {
                        i6 = 0;
                    }
                    if (i6 > 0) {
                        Rect rect3 = this.f362l;
                        i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                    }
                }
                i6 = (int) fraction2;
                if (i6 > 0) {
                    Rect rect4 = this.f362l;
                    i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i6 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                }
            }
        }
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z || mode != Integer.MIN_VALUE) {
            z2 = false;
        } else {
            TypedValue typedValue3 = z3 ? this.f357g : this.f356f;
            if (typedValue3 == null || (i3 = typedValue3.type) == 0) {
                z2 = false;
            } else {
                if (i3 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i3 == 6) {
                        int i11 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i11, i11);
                    } else {
                        i4 = 0;
                    }
                    if (i4 > 0) {
                        Rect rect5 = this.f362l;
                        i4 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i4) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                    } else {
                        z2 = false;
                    }
                }
                i4 = (int) fraction;
                if (i4 > 0) {
                    Rect rect6 = this.f362l;
                    i4 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i4) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                } else {
                    z2 = false;
                }
            }
        }
        if (z2) {
            super.onMeasure(iMakeMeasureSpec, i2);
        }
    }

    public void setAttachListener(InterfaceC0066a interfaceC0066a) {
        this.f363m = interfaceC0066a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f362l = new Rect();
    }
}
