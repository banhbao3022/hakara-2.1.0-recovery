package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import com.facebook.stetho.websocket.CloseCodes;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p645c.AlertController2;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.NestedScrollingChild;
import p636z0.p725k.p739l.NestedScrollingChildHelper;
import p636z0.p725k.p739l.NestedScrollingParent3;
import p636z0.p725k.p739l.NestedScrollingParentHelper;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild {

    /* JADX INFO: renamed from: f */
    public static final C0108a f685f = new C0108a();

    /* JADX INFO: renamed from: g */
    public static final int[] f686g = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A */
    public int f687A;

    /* JADX INFO: renamed from: B */
    public int f688B;

    /* JADX INFO: renamed from: C */
    public C0110c f689C;

    /* JADX INFO: renamed from: D */
    public final NestedScrollingParentHelper f690D;

    /* JADX INFO: renamed from: E */
    public final NestedScrollingChildHelper f691E;

    /* JADX INFO: renamed from: F */
    public float f692F;

    /* JADX INFO: renamed from: G */
    public InterfaceC0109b f693G;

    /* JADX INFO: renamed from: h */
    public long f694h;

    /* JADX INFO: renamed from: i */
    public final Rect f695i;

    /* JADX INFO: renamed from: j */
    public OverScroller f696j;

    /* JADX INFO: renamed from: k */
    public EdgeEffect f697k;

    /* JADX INFO: renamed from: l */
    public EdgeEffect f698l;

    /* JADX INFO: renamed from: m */
    public int f699m;

    /* JADX INFO: renamed from: n */
    public boolean f700n;

    /* JADX INFO: renamed from: o */
    public boolean f701o;

    /* JADX INFO: renamed from: p */
    public View f702p;

    /* JADX INFO: renamed from: q */
    public boolean f703q;

    /* JADX INFO: renamed from: r */
    public VelocityTracker f704r;

    /* JADX INFO: renamed from: s */
    public boolean f705s;

    /* JADX INFO: renamed from: t */
    public boolean f706t;

    /* JADX INFO: renamed from: u */
    public int f707u;

    /* JADX INFO: renamed from: v */
    public int f708v;

    /* JADX INFO: renamed from: w */
    public int f709w;

    /* JADX INFO: renamed from: x */
    public int f710x;

    /* JADX INFO: renamed from: y */
    public final int[] f711y;

    /* JADX INFO: renamed from: z */
    public final int[] f712z;

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$a */
    public static class C0108a extends AccessibilityDelegateCompat {
        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: c */
        public void mo381c(View view, AccessibilityEvent accessibilityEvent) {
            this.f37977b.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.f38018b.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.f38018b.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.m16260a(AccessibilityNodeInfoCompat.a.f38023c);
                accessibilityNodeInfoCompat.m16260a(AccessibilityNodeInfoCompat.a.f38027g);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.m16260a(AccessibilityNodeInfoCompat.a.f38022b);
                accessibilityNodeInfoCompat.m16260a(AccessibilityNodeInfoCompat.a.f38028h);
            }
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: g */
        public boolean mo383g(View view, int i, Bundle bundle) {
            if (super.mo383g(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m360B(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), 250, true);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m360B(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$b */
    public interface InterfaceC0109b {
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c */
    public static class C0110c extends View.BaseSavedState {
        public static final Parcelable.Creator<C0110c> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public int f713f;

        /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$c$a */
        public class a implements Parcelable.Creator<C0110c> {
            @Override // android.os.Parcelable.Creator
            public C0110c createFromParcel(Parcel parcel) {
                return new C0110c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public C0110c[] newArray(int i) {
                return new C0110c[i];
            }
        }

        public C0110c(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbM1556G = outline.m1556G("HorizontalScrollView.SavedState{");
            sbM1556G.append(Integer.toHexString(System.identityHashCode(this)));
            sbM1556G.append(" scrollPosition=");
            return outline.m1603y(sbM1556G, this.f713f, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f713f);
        }

        public C0110c(Parcel parcel) {
            super(parcel);
            this.f713f = parcel.readInt();
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: c */
    public static int m357c(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f692F == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f692F = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f692F;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m358s(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m358s((View) parent, view2);
    }

    /* JADX INFO: renamed from: A */
    public final void m359A(View view) {
        view.getDrawingRect(this.f695i);
        offsetDescendantRectToMyCoords(view, this.f695i);
        int iM365d = m365d(this.f695i);
        if (iM365d != 0) {
            scrollBy(0, iM365d);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m360B(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f694h > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f696j.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            m379y(z);
        } else {
            if (!this.f696j.isFinished()) {
                m363a();
            }
            scrollBy(i, i2);
        }
        this.f694h = AnimationUtils.currentAnimationTimeMillis();
    }

    /* JADX INFO: renamed from: C */
    public boolean m361C(int i, int i2) {
        return this.f691E.m16299i(i, i2);
    }

    /* JADX INFO: renamed from: D */
    public void m362D(int i) {
        this.f691E.m16300j(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m363a() {
        this.f696j.abortAnimation();
        this.f691E.m16300j(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    /* JADX INFO: renamed from: b */
    public boolean m364b(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m374t(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m367f(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f695i);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f695i);
            m367f(m365d(this.f695i));
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!m374t(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f696j.isFinished()) {
            return;
        }
        this.f696j.computeScrollOffset();
        int currY = this.f696j.getCurrY();
        int i = currY - this.f688B;
        this.f688B = currY;
        int[] iArr = this.f712z;
        boolean z = false;
        iArr[1] = 0;
        m366e(0, i, iArr, null, 1);
        int i2 = i - this.f712z[1];
        int scrollRange = getScrollRange();
        if (i2 != 0) {
            int scrollY = getScrollY();
            m377w(0, i2, getScrollX(), scrollY, 0, scrollRange, 0, 0);
            int scrollY2 = getScrollY() - scrollY;
            int i3 = i2 - scrollY2;
            int[] iArr2 = this.f712z;
            iArr2[1] = 0;
            this.f691E.m16296f(0, scrollY2, 0, i3, this.f711y, 1, iArr2);
            i2 = i3 - this.f712z[1];
        }
        if (i2 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z = true;
            }
            if (z) {
                m369h();
                if (i2 < 0) {
                    if (this.f697k.isFinished()) {
                        this.f697k.onAbsorb((int) this.f696j.getCurrVelocity());
                    }
                } else if (this.f698l.isFinished()) {
                    this.f698l.onAbsorb((int) this.f696j.getCurrVelocity());
                }
            }
            m363a();
        }
        if (this.f696j.isFinished()) {
            this.f691E.m16300j(1);
        } else {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    /* JADX INFO: renamed from: d */
    public int m365d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m370i(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f691E.m16291a(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f691E.m16292b(f, f2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return m366e(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f691E.m16295e(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f697k != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f697k.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingRight() + getPaddingLeft();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingBottom() + getPaddingTop();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f697k.setSize(width, height);
                if (this.f697k.draw(canvas)) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    postInvalidateOnAnimation();
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f698l.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingRight() + getPaddingLeft();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingBottom() + getPaddingTop();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f698l.setSize(width2, height2);
            if (this.f698l.draw(canvas)) {
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m366e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.f691E.m16293c(i, i2, iArr, iArr2, i3);
    }

    /* JADX INFO: renamed from: f */
    public final void m367f(int i) {
        if (i != 0) {
            if (this.f706t) {
                m360B(0, i, 250, false);
            } else {
                scrollBy(0, i);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m368g() {
        this.f703q = false;
        m378x();
        this.f691E.m16300j(0);
        EdgeEffect edgeEffect = this.f697k;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f698l.onRelease();
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f690D.m16301a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    /* JADX INFO: renamed from: h */
    public final void m369h() {
        if (getOverScrollMode() == 2) {
            this.f697k = null;
            this.f698l = null;
        } else if (this.f697k == null) {
            Context context = getContext();
            this.f697k = new EdgeEffect(context);
            this.f698l = new EdgeEffect(context);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return m373r(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0033  */
    /* JADX INFO: renamed from: i */
    public boolean m370i(KeyEvent keyEvent) {
        boolean z;
        this.f695i.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? m364b(33) : m372q(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? m364b(130) : m372q(130);
        }
        if (keyCode != 62) {
            return false;
        }
        int i = keyEvent.isShiftPressed() ? 33 : 130;
        boolean z2 = i == 130;
        int height = getHeight();
        if (z2) {
            this.f695i.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt2 = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt2.getBottom() + ((FrameLayout.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                Rect rect = this.f695i;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            this.f695i.top = getScrollY() - height;
            Rect rect2 = this.f695i;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f695i;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        m380z(i, i2, i3);
        return false;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f691E.f38065d;
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent3
    /* JADX INFO: renamed from: j */
    public void mo169j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        m375u(i4, i5, iArr);
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: k */
    public void mo170k(View view, int i, int i2, int i3, int i4, int i5) {
        m375u(i4, i5, null);
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: l */
    public boolean mo171l(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: m */
    public void mo172m(View view, View view2, int i, int i2) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f690D;
        if (i2 == 1) {
            nestedScrollingParentHelper.f38068b = i;
        } else {
            nestedScrollingParentHelper.f38067a = i;
        }
        m361C(2, i2);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: n */
    public void mo173n(View view, int i) {
        NestedScrollingParentHelper nestedScrollingParentHelper = this.f690D;
        if (i == 1) {
            nestedScrollingParentHelper.f38068b = 0;
        } else {
            nestedScrollingParentHelper.f38067a = 0;
        }
        m362D(i);
    }

    @Override // p636z0.p725k.p739l.NestedScrollingParent2
    /* JADX INFO: renamed from: o */
    public void mo174o(View view, int i, int i2, int[] iArr, int i3) {
        m366e(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f701o = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f703q) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i = scrollY - verticalScrollFactorCompat;
                if (i < 0) {
                    scrollRange = 0;
                } else if (i <= scrollRange) {
                    scrollRange = i;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 2 && this.f703q) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y = (int) motionEvent.getY();
            int x = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y < childAt.getTop() - scrollY || y >= childAt.getBottom() - scrollY || x < childAt.getLeft() || x >= childAt.getRight()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = false;
            }
            if (z) {
                this.f699m = y;
                this.f710x = motionEvent.getPointerId(0);
                VelocityTracker velocityTracker = this.f704r;
                if (velocityTracker == null) {
                    this.f704r = VelocityTracker.obtain();
                } else {
                    velocityTracker.clear();
                }
                this.f704r.addMovement(motionEvent);
                this.f696j.computeScrollOffset();
                this.f703q = !this.f696j.isFinished();
                m361C(2, 0);
            } else {
                this.f703q = false;
                m378x();
            }
        } else if (i == 1) {
            this.f703q = false;
            this.f710x = -1;
            m378x();
            if (this.f696j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                postInvalidateOnAnimation();
            }
            this.f691E.m16300j(0);
        } else if (i == 2) {
            int i2 = this.f710x;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i2 + " in onInterceptTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y2 - this.f699m) > this.f707u && (2 & getNestedScrollAxes()) == 0) {
                        this.f703q = true;
                        this.f699m = y2;
                        if (this.f704r == null) {
                            this.f704r = VelocityTracker.obtain();
                        }
                        this.f704r.addMovement(motionEvent);
                        this.f687A = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f703q = false;
            this.f710x = -1;
            m378x();
            if (this.f696j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                postInvalidateOnAnimation();
            }
            this.f691E.m16300j(0);
        } else if (i == 6) {
            m376v(motionEvent);
        }
        return this.f703q;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.f700n = false;
        View view = this.f702p;
        if (view != null && m358s(view, this)) {
            m359A(this.f702p);
        }
        this.f702p = null;
        if (!this.f701o) {
            if (this.f689C != null) {
                scrollTo(getScrollX(), this.f689C.f713f);
                this.f689C = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM357c = m357c(scrollY, paddingTop, measuredHeight);
            if (iM357c != scrollY) {
                scrollTo(getScrollX(), iM357c);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f701o = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f705s && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        m371p((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m366e(i, i2, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        m375u(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f690D.f38067a = i;
        m361C(2, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus == null || (true ^ m374t(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0110c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0110c c0110c = (C0110c) parcelable;
        super.onRestoreInstanceState(c0110c.getSuperState());
        this.f689C = c0110c;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        C0110c c0110c = new C0110c(super.onSaveInstanceState());
        c0110c.f713f = getScrollY();
        return c0110c;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC0109b interfaceC0109b = this.f693G;
        if (interfaceC0109b != null) {
            AlertController2 alertController2 = (AlertController2) interfaceC0109b;
            AlertController.m135c(this, alertController2.f34412a, alertController2.f34413b);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m374t(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f695i);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f695i);
        m367f(m365d(this.f695i));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f690D.f38067a = 0;
        m362D(0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f704r == null) {
            this.f704r = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f687A = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f687A);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f704r;
                velocityTracker.computeCurrentVelocity(CloseCodes.NORMAL_CLOSURE, this.f709w);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f710x);
                if (Math.abs(yVelocity) >= this.f708v) {
                    int i = -yVelocity;
                    float f = i;
                    if (!dispatchNestedPreFling(0.0f, f)) {
                        dispatchNestedFling(0.0f, f, true);
                        m371p(i);
                    }
                } else if (this.f696j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    postInvalidateOnAnimation();
                }
                this.f710x = -1;
                m368g();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f710x);
                if (iFindPointerIndex == -1) {
                    StringBuilder sbM1556G = outline.m1556G("Invalid pointerId=");
                    sbM1556G.append(this.f710x);
                    sbM1556G.append(" in onTouchEvent");
                    Log.e("NestedScrollView", sbM1556G.toString());
                } else {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.f699m - y;
                    if (!this.f703q && Math.abs(i2) > this.f707u) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f703q = true;
                        i2 = i2 > 0 ? i2 - this.f707u : i2 + this.f707u;
                    }
                    int i3 = i2;
                    if (this.f703q) {
                        if (m366e(0, i3, this.f712z, this.f711y, 0)) {
                            i3 -= this.f712z[1];
                            this.f687A += this.f711y[1];
                        }
                        int i4 = i3;
                        this.f699m = y - this.f711y[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (m377w(0, i4, 0, getScrollY(), 0, scrollRange, 0, 0) && !m373r(0)) {
                            this.f704r.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f712z;
                        iArr[1] = 0;
                        this.f691E.m16296f(0, scrollY2, 0, i4 - scrollY2, this.f711y, 0, iArr);
                        int i5 = this.f699m;
                        int[] iArr2 = this.f711y;
                        this.f699m = i5 - iArr2[1];
                        this.f687A += iArr2[1];
                        if (z) {
                            int i6 = i4 - this.f712z[1];
                            m369h();
                            int i7 = scrollY + i6;
                            if (i7 < 0) {
                                this.f697k.onPull(i6 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f698l.isFinished()) {
                                    this.f698l.onRelease();
                                }
                            } else if (i7 > scrollRange) {
                                this.f698l.onPull(i6 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f697k.isFinished()) {
                                    this.f697k.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f697k;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f698l.isFinished())) {
                                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                                postInvalidateOnAnimation();
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f703q && getChildCount() > 0 && this.f696j.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    AtomicInteger atomicInteger3 = ViewCompat.f38073a;
                    postInvalidateOnAnimation();
                }
                this.f710x = -1;
                m368g();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f699m = (int) motionEvent.getY(actionIndex);
                this.f710x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m376v(motionEvent);
                this.f699m = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f710x));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z2 = !this.f696j.isFinished();
            this.f703q = z2;
            if (z2 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f696j.isFinished()) {
                m363a();
            }
            this.f699m = (int) motionEvent.getY();
            this.f710x = motionEvent.getPointerId(0);
            m361C(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f704r;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m371p(int i) {
        if (getChildCount() > 0) {
            this.f696j.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            m379y(true);
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m372q(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f695i;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f695i.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f695i;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f695i;
        return m380z(i, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: r */
    public boolean m373r(int i) {
        return this.f691E.m16297g(i) != null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f700n) {
            this.f702p = view2;
        } else {
            m359A(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iM365d = m365d(rect);
        boolean z2 = iM365d != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iM365d);
            } else {
                m360B(0, iM365d, 250, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            m378x();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f700n = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM357c = m357c(i, width, width2);
            int iM357c2 = m357c(i2, height, height2);
            if (iM357c == getScrollX() && iM357c2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM357c, iM357c2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.f705s) {
            this.f705s = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        NestedScrollingChildHelper nestedScrollingChildHelper = this.f691E;
        if (nestedScrollingChildHelper.f38065d) {
            View view = nestedScrollingChildHelper.f38064c;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            view.stopNestedScroll();
        }
        nestedScrollingChildHelper.f38065d = z;
    }

    public void setOnScrollChangeListener(InterfaceC0109b interfaceC0109b) {
        this.f693G = interfaceC0109b;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f706t = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.f691E.m16299i(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f691E.m16300j(0);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m374t(View view, int i, int i2) {
        view.getDrawingRect(this.f695i);
        offsetDescendantRectToMyCoords(view, this.f695i);
        return this.f695i.bottom + i >= getScrollY() && this.f695i.top - i <= getScrollY() + i2;
    }

    /* JADX INFO: renamed from: u */
    public final void m375u(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f691E.m16294d(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    /* JADX INFO: renamed from: v */
    public final void m376v(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f710x) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f699m = (int) motionEvent.getY(i);
            this.f710x = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f704r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0057  */
    /* JADX WARN: Code duplicated, block: B:40:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x005c  */
    /* JADX WARN: Code duplicated, block: B:42:0x005e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0061  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: w */
    public boolean m377w(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        boolean z2;
        int overScrollMode = getOverScrollMode();
        boolean z3 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z4 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z5 = overScrollMode == 0 || (overScrollMode == 1 && z3);
        boolean z6 = overScrollMode == 0 || (overScrollMode == 1 && z4);
        int i9 = i3 + i;
        int i10 = !z5 ? 0 : i7;
        int i11 = i4 + i2;
        int i12 = !z6 ? 0 : i8;
        int i13 = -i10;
        int i14 = i10 + i5;
        int i15 = -i12;
        int i16 = i12 + i6;
        if (i9 <= i14) {
            if (i9 < i13) {
                i9 = i13;
            } else {
                z = false;
            }
            if (i11 > i16) {
                if (i11 < i15) {
                    i11 = i15;
                } else {
                    z2 = false;
                }
                if (z2 && !m373r(1)) {
                    this.f696j.springBack(i9, i11, 0, 0, 0, getScrollRange());
                }
                onOverScrolled(i9, i11, z, z2);
                return !z || z2;
            }
            i11 = i16;
            z2 = true;
            if (z2) {
                this.f696j.springBack(i9, i11, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i9, i11, z, z2);
            if (z) {
            }
        }
        i9 = i14;
        z = true;
        if (i11 > i16) {
            if (i11 < i15) {
                i11 = i15;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f696j.springBack(i9, i11, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i9, i11, z, z2);
            if (z) {
            }
        }
        i11 = i16;
        z2 = true;
        if (z2) {
            this.f696j.springBack(i9, i11, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i9, i11, z, z2);
        if (z) {
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m378x() {
        VelocityTracker velocityTracker = this.f704r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f704r = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m379y(boolean z) {
        if (z) {
            m361C(2, 1);
        } else {
            this.f691E.m16300j(1);
        }
        this.f688B = getScrollY();
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX INFO: renamed from: z */
    public final boolean m380z(int i, int i2, int i3) {
        boolean z;
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z2 = i == 33;
        ArrayList focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 < scrollY || i3 > i4) {
            m367f(z2 ? i2 - scrollY : i3 - i4);
            z = true;
        } else {
            z = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, mtp.media.karaoke.R.attr.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f695i = new Rect();
        this.f700n = true;
        this.f701o = false;
        this.f702p = null;
        this.f703q = false;
        this.f706t = true;
        this.f710x = -1;
        this.f711y = new int[2];
        this.f712z = new int[2];
        this.f696j = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f707u = viewConfiguration.getScaledTouchSlop();
        this.f708v = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f709w = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f686g, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f690D = new NestedScrollingParentHelper(this);
        this.f691E = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.m16327u(this, f685f);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
