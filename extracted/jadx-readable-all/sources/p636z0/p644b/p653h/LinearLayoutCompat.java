package p636z0.p644b.p653h;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.h.i0, reason: use source file name */
/* JADX INFO: compiled from: LinearLayoutCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: f */
    public boolean f35054f;

    /* JADX INFO: renamed from: g */
    public int f35055g;

    /* JADX INFO: renamed from: h */
    public int f35056h;

    /* JADX INFO: renamed from: i */
    public int f35057i;

    /* JADX INFO: renamed from: j */
    public int f35058j;

    /* JADX INFO: renamed from: k */
    public int f35059k;

    /* JADX INFO: renamed from: l */
    public float f35060l;

    /* JADX INFO: renamed from: m */
    public boolean f35061m;

    /* JADX INFO: renamed from: n */
    public int[] f35062n;

    /* JADX INFO: renamed from: o */
    public int[] f35063o;

    /* JADX INFO: renamed from: p */
    public Drawable f35064p;

    /* JADX INFO: renamed from: q */
    public int f35065q;

    /* JADX INFO: renamed from: r */
    public int f35066r;

    /* JADX INFO: renamed from: s */
    public int f35067s;

    /* JADX INFO: renamed from: t */
    public int f35068t;

    /* JADX INFO: renamed from: z0.b.h.i0$a */
    /* JADX INFO: compiled from: LinearLayoutCompat.java */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i, int i2) {
            super(i, i2);
        }

        public a(int i, int i2, float f) {
            super(i, i2, f);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    /* JADX INFO: renamed from: f */
    public void m14896f(Canvas canvas, int i) {
        this.f35064p.setBounds(getPaddingLeft() + this.f35068t, i, (getWidth() - getPaddingRight()) - this.f35068t, this.f35066r + i);
        this.f35064p.draw(canvas);
    }

    /* JADX INFO: renamed from: g */
    public void m14897g(Canvas canvas, int i) {
        this.f35064p.setBounds(i, getPaddingTop() + this.f35068t, this.f35065q + i, (getHeight() - getPaddingBottom()) - this.f35068t);
        this.f35064p.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f35055g < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f35055g;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f35055g == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f35056h;
        if (this.f35057i == 1 && (i = this.f35058j & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f35059k) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f35059k;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f35055g;
    }

    public Drawable getDividerDrawable() {
        return this.f35064p;
    }

    public int getDividerPadding() {
        return this.f35068t;
    }

    public int getDividerWidth() {
        return this.f35065q;
    }

    public int getGravity() {
        return this.f35058j;
    }

    public int getOrientation() {
        return this.f35057i;
    }

    public int getShowDividers() {
        return this.f35067s;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f35060l;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.f35057i;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* JADX INFO: renamed from: k */
    public int m14898k() {
        return 0;
    }

    /* JADX INFO: renamed from: l */
    public int m14899l() {
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public int m14900m() {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m14901n(int i) {
        if (i == 0) {
            return (this.f35067s & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.f35067s & 4) != 0;
        }
        if ((this.f35067s & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public void m14902o(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int bottom;
        if (this.f35064p == null) {
            return;
        }
        int i2 = 0;
        if (this.f35057i == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m14901n(i2)) {
                    m14896f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.f35066r);
                }
                i2++;
            }
            if (m14901n(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f35066r;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin;
                }
                m14896f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zM14875b = ViewUtils5.m14875b(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m14901n(i2)) {
                a aVar = (a) childAt3.getLayoutParams();
                m14897g(canvas, zM14875b ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f35065q);
            }
            i2++;
        }
        if (m14901n(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                a aVar2 = (a) childAt4.getLayoutParams();
                if (zM14875b) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i = this.f35065q;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zM14875b) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.f35065q;
                right = left - i;
            }
            m14897g(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:63:0x017a  */
    /* JADX WARN: Code duplicated, block: B:65:0x017e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:70:0x018d  */
    /* JADX WARN: Code duplicated, block: B:71:0x019b  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bc  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int iM14898k;
        int i5;
        int i6;
        int i7;
        int i8;
        int baseline;
        int i9;
        int i10;
        int measuredHeight;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int iM14900m;
        int i14 = 8;
        int i15 = 5;
        if (this.f35057i == 1) {
            int paddingLeft2 = getPaddingLeft();
            int i16 = i3 - i;
            int paddingRight = i16 - getPaddingRight();
            int paddingRight2 = (i16 - paddingLeft2) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i17 = this.f35058j;
            int i18 = i17 & 112;
            int i19 = 8388615 & i17;
            if (i18 != 16) {
                paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.f35059k;
            } else {
                paddingTop = getPaddingTop() + (((i4 - i2) - this.f35059k) / 2);
            }
            int iM14898k2 = 0;
            while (iM14898k2 < virtualChildCount) {
                View childAt = getChildAt(iM14898k2);
                if (childAt == null) {
                    iM14900m = m14903p() + paddingTop;
                } else {
                    if (childAt.getVisibility() != i14) {
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        a aVar = (a) childAt.getLayoutParams();
                        int i20 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i20 < 0) {
                            i20 = i19;
                        }
                        AtomicInteger atomicInteger = ViewCompat.f38073a;
                        int absoluteGravity = Gravity.getAbsoluteGravity(i20, getLayoutDirection()) & 7;
                        if (absoluteGravity != 1) {
                            if (absoluteGravity != i15) {
                                i13 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft2;
                            } else {
                                i11 = paddingRight - measuredWidth;
                                i12 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                            }
                            if (m14901n(iM14898k2)) {
                                paddingTop += this.f35066r;
                            }
                            int i21 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                            int iM14899l = m14899l() + i21;
                            childAt.layout(i13, iM14899l, measuredWidth + i13, measuredHeight2 + iM14899l);
                            iM14900m = m14900m() + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i21;
                            iM14898k2 = m14898k() + iM14898k2;
                        } else {
                            i11 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft2 + ((LinearLayout.LayoutParams) aVar).leftMargin;
                            i12 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        i13 = i11 - i12;
                        if (m14901n(iM14898k2)) {
                            paddingTop += this.f35066r;
                        }
                        int i22 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        int iM14899l2 = m14899l() + i22;
                        childAt.layout(i13, iM14899l2, measuredWidth + i13, measuredHeight2 + iM14899l2);
                        iM14900m = m14900m() + measuredHeight2 + ((LinearLayout.LayoutParams) aVar).bottomMargin + i22;
                        iM14898k2 = m14898k() + iM14898k2;
                    }
                    iM14898k2++;
                    i14 = 8;
                    i15 = 5;
                }
                paddingTop = iM14900m;
                iM14898k2++;
                i14 = 8;
                i15 = 5;
            }
            return;
        }
        boolean zM14875b = ViewUtils5.m14875b(this);
        int paddingTop2 = getPaddingTop();
        int i23 = i4 - i2;
        int paddingBottom = i23 - getPaddingBottom();
        int paddingBottom2 = (i23 - paddingTop2) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i24 = this.f35058j;
        int i25 = 8388615 & i24;
        int i26 = i24 & 112;
        boolean z2 = this.f35054f;
        int[] iArr = this.f35062n;
        int[] iArr2 = this.f35063o;
        AtomicInteger atomicInteger2 = ViewCompat.f38073a;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i25, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            paddingLeft = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.f35059k;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.f35059k) / 2);
        }
        if (zM14875b) {
            i6 = virtualChildCount2 - 1;
            iM14898k = 0;
            i5 = -1;
        } else {
            iM14898k = 0;
            i5 = 1;
            i6 = 0;
        }
        while (iM14898k < virtualChildCount2) {
            int i27 = (i5 * iM14898k) + i6;
            View childAt2 = getChildAt(i27);
            if (childAt2 == null) {
                paddingLeft = m14903p() + paddingLeft;
            } else {
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    a aVar2 = (a) childAt2.getLayoutParams();
                    if (z2) {
                        i7 = virtualChildCount2;
                        i8 = i26;
                        baseline = ((LinearLayout.LayoutParams) aVar2).height != -1 ? childAt2.getBaseline() : -1;
                        i9 = ((LinearLayout.LayoutParams) aVar2).gravity;
                        if (i9 < 0) {
                            i9 = i8;
                        }
                        i10 = i9 & 112;
                        if (i10 != 16) {
                            measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        } else if (i10 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                            if (baseline != -1) {
                                measuredHeight = (iArr[1] - baseline) + measuredHeight;
                            }
                        } else if (i10 != 80) {
                            measuredHeight = paddingTop2;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (m14901n(i27)) {
                            paddingLeft += this.f35065q;
                        }
                        int i28 = paddingLeft + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                        int iM14899l3 = m14899l() + i28;
                        childAt2.layout(iM14899l3, measuredHeight, measuredWidth2 + iM14899l3, measuredHeight3 + measuredHeight);
                        paddingLeft = i28 + m14900m() + measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                        iM14898k = m14898k() + iM14898k;
                    } else {
                        i7 = virtualChildCount2;
                        i8 = i26;
                    }
                    i9 = ((LinearLayout.LayoutParams) aVar2).gravity;
                    if (i9 < 0) {
                        i9 = i8;
                    }
                    i10 = i9 & 112;
                    if (i10 != 16) {
                        measuredHeight = ((((paddingBottom2 - measuredHeight3) / 2) + paddingTop2) + ((LinearLayout.LayoutParams) aVar2).topMargin) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                    } else if (i10 != 48) {
                        measuredHeight = ((LinearLayout.LayoutParams) aVar2).topMargin + paddingTop2;
                        if (baseline != -1) {
                            measuredHeight = (iArr[1] - baseline) + measuredHeight;
                        }
                    } else if (i10 != 80) {
                        measuredHeight = paddingTop2;
                    } else {
                        measuredHeight = (paddingBottom - measuredHeight3) - ((LinearLayout.LayoutParams) aVar2).bottomMargin;
                        if (baseline != -1) {
                            measuredHeight -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (m14901n(i27)) {
                        paddingLeft += this.f35065q;
                    }
                    int i29 = paddingLeft + ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    int iM14899l4 = m14899l() + i29;
                    childAt2.layout(iM14899l4, measuredHeight, measuredWidth2 + iM14899l4, measuredHeight3 + measuredHeight);
                    paddingLeft = i29 + m14900m() + measuredWidth2 + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                    iM14898k = m14898k() + iM14898k;
                }
                iM14898k++;
                virtualChildCount2 = i7;
                i26 = i8;
                z2 = z2;
            }
            i7 = virtualChildCount2;
            i8 = i26;
            iM14898k++;
            virtualChildCount2 = i7;
            i26 = i8;
            z2 = z2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0310  */
    /* JADX WARN: Code duplicated, block: B:158:0x031d  */
    /* JADX WARN: Code duplicated, block: B:219:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:220:0x04be  */
    /* JADX WARN: Code duplicated, block: B:223:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:224:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:227:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:228:0x0504  */
    /* JADX WARN: Code duplicated, block: B:230:0x051b  */
    /* JADX WARN: Code duplicated, block: B:236:0x052e  */
    /* JADX WARN: Code duplicated, block: B:245:0x0571  */
    /* JADX WARN: Code duplicated, block: B:251:0x0580  */
    /* JADX WARN: Code duplicated, block: B:254:0x0588 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:255:0x058a  */
    /* JADX WARN: Code duplicated, block: B:257:0x0593  */
    /* JADX WARN: Code duplicated, block: B:259:0x0597  */
    /* JADX WARN: Code duplicated, block: B:286:0x062e  */
    /* JADX WARN: Code duplicated, block: B:288:0x0634  */
    /* JADX WARN: Code duplicated, block: B:289:0x063e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0646  */
    /* JADX WARN: Code duplicated, block: B:292:0x064c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0654  */
    /* JADX WARN: Code duplicated, block: B:295:0x0665  */
    /* JADX WARN: Code duplicated, block: B:320:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:322:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:325:0x0715  */
    /* JADX WARN: Code duplicated, block: B:327:0x071b  */
    /* JADX WARN: Code duplicated, block: B:375:0x0829  */
    /* JADX WARN: Code duplicated, block: B:377:0x0834  */
    /* JADX WARN: Code duplicated, block: B:381:0x085f  */
    /* JADX WARN: Code duplicated, block: B:389:0x0871  */
    /* JADX WARN: Code duplicated, block: B:392:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:395:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:398:0x08ca  */
    /* JADX WARN: Code duplicated, block: B:400:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:402:0x08e5  */
    /* JADX WARN: Code duplicated, block: B:404:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:405:0x0906  */
    /* JADX WARN: Code duplicated, block: B:443:0x0907 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        int i3;
        float f;
        int i4;
        int iCombineMeasuredStates;
        int i5;
        int i6;
        int i7;
        char c3;
        View childAt;
        int i8;
        int i9;
        int i10;
        int baseline;
        int i11;
        int iMakeMeasureSpec;
        int i12;
        int i13;
        View childAt2;
        a aVar;
        int iM14898k;
        View childAt3;
        a aVar2;
        int i14;
        int i15;
        float f2;
        int i16;
        int i17;
        int i18;
        int iMax;
        int i19;
        int i20;
        boolean z;
        boolean z2;
        a aVar3;
        int measuredWidth;
        boolean z3;
        int i21;
        boolean z4;
        int i22;
        int measuredHeight;
        boolean z5;
        int baseline2;
        int i23;
        int i24;
        boolean z6;
        boolean z7;
        int i25;
        int i26;
        a aVar4;
        boolean z8;
        int i27;
        boolean z9;
        int iMax2;
        int i28 = -2;
        int i29 = Integer.MIN_VALUE;
        int i30 = 8;
        float f3 = 0.0f;
        int i31 = 1073741824;
        if (this.f35057i == 1) {
            this.f35059k = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int i32 = this.f35055g;
            boolean z10 = this.f35061m;
            int iM14898k2 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            int iMax5 = 0;
            int i33 = 0;
            float f4 = 0.0f;
            boolean z11 = false;
            int i34 = 0;
            boolean z12 = true;
            boolean z13 = false;
            while (iM14898k2 < virtualChildCount) {
                View childAt4 = getChildAt(iM14898k2);
                if (childAt4 == null) {
                    this.f35059k = m14903p() + this.f35059k;
                } else {
                    if (childAt4.getVisibility() == i30) {
                        iM14898k2 += m14898k();
                    } else {
                        if (m14901n(iM14898k2)) {
                            this.f35059k += this.f35066r;
                        }
                        a aVar5 = (a) childAt4.getLayoutParams();
                        float f5 = ((LinearLayout.LayoutParams) aVar5).weight;
                        f4 += f5;
                        if (mode2 == i31 && ((LinearLayout.LayoutParams) aVar5).height == 0 && f5 > f3) {
                            int i35 = this.f35059k;
                            this.f35059k = Math.max(i35, ((LinearLayout.LayoutParams) aVar5).topMargin + i35 + ((LinearLayout.LayoutParams) aVar5).bottomMargin);
                            i32 = i32;
                            aVar4 = aVar5;
                            z8 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) aVar5).height != 0 || f5 <= f3) {
                                i26 = Integer.MIN_VALUE;
                            } else {
                                ((LinearLayout.LayoutParams) aVar5).height = i28;
                                i26 = 0;
                            }
                            int i36 = f4 == f3 ? this.f35059k : 0;
                            aVar4 = aVar5;
                            m14902o(childAt4, i, 0, i2, i36);
                            if (i26 != i29) {
                                ((LinearLayout.LayoutParams) aVar4).height = i26;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i37 = this.f35059k;
                            this.f35059k = Math.max(i37, m14900m() + i37 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar4).topMargin + ((LinearLayout.LayoutParams) aVar4).bottomMargin);
                            if (z10) {
                                iMax4 = Math.max(measuredHeight2, iMax4);
                            }
                            z8 = z11;
                        }
                        if (i32 >= 0 && i32 == iM14898k2 + 1) {
                            this.f35056h = this.f35059k;
                        }
                        if (iM14898k2 < i32 && ((LinearLayout.LayoutParams) aVar4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i27 = mode;
                        if (i27 == 1073741824 || ((LinearLayout.LayoutParams) aVar4).width != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                            z13 = true;
                        }
                        int i38 = ((LinearLayout.LayoutParams) aVar4).leftMargin + ((LinearLayout.LayoutParams) aVar4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i38;
                        iMax2 = Math.max(i33, measuredWidth2);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(i34, childAt4.getMeasuredState());
                        boolean z14 = z12 && ((LinearLayout.LayoutParams) aVar4).width == -1;
                        if (((LinearLayout.LayoutParams) aVar4).weight > 0.0f) {
                            if (!z9) {
                                i38 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i38);
                        } else {
                            int i39 = iMax3;
                            if (!z9) {
                                i38 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i38);
                            iMax3 = i39;
                        }
                        iM14898k2 += m14898k();
                        z11 = z8;
                        z12 = z14;
                        i34 = iCombineMeasuredStates2;
                    }
                    iM14898k2++;
                    mode = i27;
                    i33 = iMax2;
                    i32 = i32;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i28 = -2;
                    i29 = Integer.MIN_VALUE;
                    i30 = 8;
                    f3 = 0.0f;
                    i31 = 1073741824;
                }
                i32 = i32;
                mode2 = mode2;
                i27 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i33;
                iM14898k2++;
                mode = i27;
                i33 = iMax2;
                i32 = i32;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i28 = -2;
                i29 = Integer.MIN_VALUE;
                i30 = 8;
                f3 = 0.0f;
                i31 = 1073741824;
            }
            int i40 = mode2;
            int i41 = mode;
            int i42 = virtualChildCount;
            int i43 = iMax3;
            int i44 = iMax4;
            int iMax6 = iMax5;
            int iMax7 = i33;
            int iCombineMeasuredStates3 = i34;
            if (this.f35059k > 0 && m14901n(i42)) {
                this.f35059k += this.f35066r;
            }
            int i45 = i40;
            if (z10 && (i45 == Integer.MIN_VALUE || i45 == 0)) {
                this.f35059k = 0;
                int iM14898k3 = 0;
                while (iM14898k3 < i42) {
                    View childAt5 = getChildAt(iM14898k3);
                    if (childAt5 == null) {
                        this.f35059k = m14903p() + this.f35059k;
                    } else if (childAt5.getVisibility() == 8) {
                        iM14898k3 += m14898k();
                    } else {
                        a aVar6 = (a) childAt5.getLayoutParams();
                        int i46 = this.f35059k;
                        this.f35059k = Math.max(i46, m14900m() + i46 + i44 + ((LinearLayout.LayoutParams) aVar6).topMargin + ((LinearLayout.LayoutParams) aVar6).bottomMargin);
                    }
                    iM14898k3++;
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f35059k;
            this.f35059k = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
            int i47 = (16777215 & iResolveSizeAndState) - this.f35059k;
            if (z11 || (i47 != 0 && f4 > 0.0f)) {
                float f6 = this.f35060l;
                if (f6 > 0.0f) {
                    f4 = f6;
                }
                this.f35059k = 0;
                int i48 = 0;
                while (i48 < i42) {
                    View childAt6 = getChildAt(i48);
                    if (childAt6.getVisibility() != 8) {
                        a aVar7 = (a) childAt6.getLayoutParams();
                        float f7 = ((LinearLayout.LayoutParams) aVar7).weight;
                        if (f7 > 0.0f) {
                            int i49 = (int) ((i47 * f7) / f4);
                            f4 -= f7;
                            int i50 = i47 - i49;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin, ((LinearLayout.LayoutParams) aVar7).width);
                            if (((LinearLayout.LayoutParams) aVar7).height == 0) {
                                i25 = 1073741824;
                                if (i45 == 1073741824) {
                                    if (i49 <= 0) {
                                        i49 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i49, 1073741824));
                                }
                                iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                                i47 = i50;
                            } else {
                                i25 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i49;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i25));
                            iCombineMeasuredStates3 = View.combineMeasuredStates(iCombineMeasuredStates3, childAt6.getMeasuredState() & (-256));
                            i47 = i50;
                        }
                        int i51 = ((LinearLayout.LayoutParams) aVar7).leftMargin + ((LinearLayout.LayoutParams) aVar7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i51;
                        iMax7 = Math.max(iMax7, measuredWidth3);
                        if (i41 != 1073741824) {
                            i23 = i47;
                            i24 = -1;
                            z6 = ((LinearLayout.LayoutParams) aVar7).width == -1;
                            if (!z6) {
                                i51 = measuredWidth3;
                            }
                            iMax6 = Math.max(iMax6, i51);
                            if (z12 || ((LinearLayout.LayoutParams) aVar7).width != i24) {
                                z7 = false;
                            } else {
                                z7 = true;
                            }
                            int i52 = this.f35059k;
                            this.f35059k = Math.max(i52, m14900m() + childAt6.getMeasuredHeight() + i52 + ((LinearLayout.LayoutParams) aVar7).topMargin + ((LinearLayout.LayoutParams) aVar7).bottomMargin);
                            z12 = z7;
                            i47 = i23;
                        } else {
                            i23 = i47;
                            i24 = -1;
                        }
                        if (!z6) {
                            i51 = measuredWidth3;
                        }
                        iMax6 = Math.max(iMax6, i51);
                        if (z12) {
                            z7 = false;
                        } else {
                            z7 = false;
                        }
                        int i53 = this.f35059k;
                        this.f35059k = Math.max(i53, m14900m() + childAt6.getMeasuredHeight() + i53 + ((LinearLayout.LayoutParams) aVar7).topMargin + ((LinearLayout.LayoutParams) aVar7).bottomMargin);
                        z12 = z7;
                        i47 = i23;
                    }
                    i48++;
                    i45 = i45;
                }
                this.f35059k = getPaddingBottom() + getPaddingTop() + this.f35059k;
            } else {
                iMax6 = Math.max(iMax6, i43);
                if (z10 && i45 != 1073741824) {
                    for (int i54 = 0; i54 < i42; i54++) {
                        View childAt7 = getChildAt(i54);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i44, 1073741824));
                        }
                    }
                }
            }
            int i55 = iMax7;
            if (z12 || i41 == 1073741824) {
                iMax6 = i55;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i, iCombineMeasuredStates3), iResolveSizeAndState);
            if (z13) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i56 = 0; i56 < i42; i56++) {
                    View childAt8 = getChildAt(i56);
                    if (childAt8.getVisibility() != 8) {
                        a aVar8 = (a) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar8).width == -1) {
                            int i57 = ((LinearLayout.LayoutParams) aVar8).height;
                            ((LinearLayout.LayoutParams) aVar8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i2, 0);
                            ((LinearLayout.LayoutParams) aVar8).height = i57;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f35059k = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i);
        int mode4 = View.MeasureSpec.getMode(i2);
        if (this.f35062n == null || this.f35063o == null) {
            this.f35062n = new int[4];
            this.f35063o = new int[4];
        }
        int[] iArr = this.f35062n;
        int[] iArr2 = this.f35063o;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z15 = this.f35054f;
        boolean z16 = this.f35061m;
        boolean z17 = mode3 == 1073741824;
        int iMax8 = 0;
        float f8 = 0.0f;
        int i58 = 0;
        int iM14898k4 = 0;
        int iMax9 = 0;
        int i59 = 0;
        int iMax10 = 0;
        boolean z18 = false;
        boolean z19 = true;
        boolean z20 = false;
        while (iM14898k4 < virtualChildCount2) {
            View childAt9 = getChildAt(iM14898k4);
            if (childAt9 == null) {
                this.f35059k = m14903p() + this.f35059k;
                i14 = iMax8;
                i15 = i58;
            } else {
                i14 = iMax8;
                i15 = i58;
                if (childAt9.getVisibility() == 8) {
                    iM14898k4 += m14898k();
                } else {
                    if (m14901n(iM14898k4)) {
                        this.f35059k += this.f35065q;
                    }
                    a aVar9 = (a) childAt9.getLayoutParams();
                    float f9 = ((LinearLayout.LayoutParams) aVar9).weight;
                    float f10 = f8 + f9;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) aVar9).width == 0 && f9 > 0.0f) {
                        if (z17) {
                            this.f35059k = ((LinearLayout.LayoutParams) aVar9).leftMargin + ((LinearLayout.LayoutParams) aVar9).rightMargin + this.f35059k;
                        } else {
                            int i60 = this.f35059k;
                            this.f35059k = Math.max(i60, ((LinearLayout.LayoutParams) aVar9).leftMargin + i60 + ((LinearLayout.LayoutParams) aVar9).rightMargin);
                        }
                        if (z15) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            aVar3 = aVar9;
                            i18 = i14;
                            iMax = i15;
                            i20 = iM14898k4;
                            z = z16;
                            z2 = z15;
                        } else {
                            aVar3 = aVar9;
                            i18 = i14;
                            iMax = i15;
                            i20 = iM14898k4;
                            i21 = 1073741824;
                            z = z16;
                            z2 = z15;
                            z3 = true;
                        }
                        if (mode4 == i21 && ((LinearLayout.LayoutParams) aVar3).height == -1) {
                            z4 = true;
                            z20 = true;
                        } else {
                            z4 = false;
                        }
                        i22 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i22;
                        int iCombineMeasuredStates4 = View.combineMeasuredStates(i59, childAt9.getMeasuredState());
                        if (!z2 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i61 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i61 < 0) {
                                i61 = this.f35058j;
                            }
                            int i62 = (((i61 & 112) >> 4) & (-2)) >> 1;
                            iArr[i62] = Math.max(iArr[i62], baseline2);
                            iArr2[i62] = Math.max(iArr2[i62], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(iMax10, measuredHeight);
                        if (z19 || ((LinearLayout.LayoutParams) aVar3).height != -1) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (z4) {
                                measuredHeight = i22;
                            }
                            iMax8 = Math.max(i18, measuredHeight);
                        } else {
                            int i63 = i18;
                            if (z4) {
                                measuredHeight = i22;
                            }
                            iMax = Math.max(iMax, measuredHeight);
                            iMax8 = i63;
                        }
                        iM14898k4 = m14898k() + i20;
                        iMax10 = iMax11;
                        i59 = iCombineMeasuredStates4;
                        z18 = z3;
                        z19 = z5;
                        f8 = f10;
                        i58 = iMax;
                    } else {
                        int i64 = iM14898k4;
                        if (((LinearLayout.LayoutParams) aVar9).width == 0) {
                            f2 = 0.0f;
                            if (f9 > 0.0f) {
                                ((LinearLayout.LayoutParams) aVar9).width = -2;
                                i16 = 0;
                            }
                            if (f10 == f2) {
                                i17 = this.f35059k;
                            } else {
                                i17 = 0;
                            }
                            i18 = i14;
                            iMax = i15;
                            i19 = i16;
                            i20 = i64;
                            z = z16;
                            z2 = z15;
                            m14902o(childAt9, i, i17, i2, 0);
                            if (i19 != Integer.MIN_VALUE) {
                                aVar3 = aVar9;
                                ((LinearLayout.LayoutParams) aVar3).width = i19;
                            } else {
                                aVar3 = aVar9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z17) {
                                this.f35059k = m14900m() + ((LinearLayout.LayoutParams) aVar3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar3).rightMargin + this.f35059k;
                            } else {
                                int i65 = this.f35059k;
                                this.f35059k = Math.max(i65, m14900m() + i65 + measuredWidth + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin);
                            }
                            if (z) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f2 = 0.0f;
                        }
                        i16 = Integer.MIN_VALUE;
                        if (f10 == f2) {
                            i17 = this.f35059k;
                        } else {
                            i17 = 0;
                        }
                        i18 = i14;
                        iMax = i15;
                        i19 = i16;
                        i20 = i64;
                        z = z16;
                        z2 = z15;
                        m14902o(childAt9, i, i17, i2, 0);
                        if (i19 != Integer.MIN_VALUE) {
                            aVar3 = aVar9;
                            ((LinearLayout.LayoutParams) aVar3).width = i19;
                        } else {
                            aVar3 = aVar9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z17) {
                            this.f35059k = m14900m() + ((LinearLayout.LayoutParams) aVar3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar3).rightMargin + this.f35059k;
                        } else {
                            int i66 = this.f35059k;
                            this.f35059k = Math.max(i66, m14900m() + i66 + measuredWidth + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin);
                        }
                        if (z) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z3 = z18;
                    i21 = 1073741824;
                    if (mode4 == i21) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    i22 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i22;
                    int iCombineMeasuredStates5 = View.combineMeasuredStates(i59, childAt9.getMeasuredState());
                    if (!z2) {
                    }
                    int iMax12 = Math.max(iMax10, measuredHeight);
                    if (z19) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (z4) {
                            measuredHeight = i22;
                        }
                        iMax8 = Math.max(i18, measuredHeight);
                    } else {
                        int i67 = i18;
                        if (z4) {
                            measuredHeight = i22;
                        }
                        iMax = Math.max(iMax, measuredHeight);
                        iMax8 = i67;
                    }
                    iM14898k4 = m14898k() + i20;
                    iMax10 = iMax12;
                    i59 = iCombineMeasuredStates5;
                    z18 = z3;
                    z19 = z5;
                    f8 = f10;
                    i58 = iMax;
                }
                iM14898k4++;
                z16 = z;
                z15 = z2;
            }
            z2 = z15;
            iMax8 = i14;
            i58 = i15;
            z = z16;
            iM14898k4++;
            z16 = z;
            z15 = z2;
        }
        boolean z21 = z16;
        boolean z22 = z15;
        int i68 = i58;
        int i69 = iMax8;
        int iMax13 = i68;
        if (this.f35059k > 0 && m14901n(virtualChildCount2)) {
            this.f35059k += this.f35065q;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c2 = 3;
            if (iArr[3] != -1) {
            }
            if (z21 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f35059k = 0;
                iM14898k = 0;
                while (iM14898k < virtualChildCount2) {
                    childAt3 = getChildAt(iM14898k);
                    if (childAt3 == null) {
                        this.f35059k = m14903p() + this.f35059k;
                    } else if (childAt3.getVisibility() == 8) {
                        iM14898k += m14898k();
                    } else {
                        aVar2 = (a) childAt3.getLayoutParams();
                        if (z17) {
                            this.f35059k = m14900m() + ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) aVar2).rightMargin + this.f35059k;
                        } else {
                            int i70 = this.f35059k;
                            this.f35059k = Math.max(i70, m14900m() + i70 + iMax9 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin);
                        }
                    }
                    iM14898k++;
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f35059k;
            this.f35059k = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
            i3 = (16777215 & iResolveSizeAndState2) - this.f35059k;
            if (!z18 || (i3 != 0 && f8 > 0.0f)) {
                f = this.f35060l;
                if (f > 0.0f) {
                    f8 = f;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f35059k = 0;
                i4 = i3;
                iCombineMeasuredStates = i59;
                int iMax14 = -1;
                i5 = 0;
                while (i5 < virtualChildCount2) {
                    childAt = getChildAt(i5);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i8 = i4;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        a aVar10 = (a) childAt.getLayoutParams();
                        float f11 = ((LinearLayout.LayoutParams) aVar10).weight;
                        if (f11 > 0.0f) {
                            int i71 = (int) ((i4 * f11) / f8);
                            float f12 = f8 - f11;
                            int i72 = i4 - i71;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin, ((LinearLayout.LayoutParams) aVar10).height);
                            if (((LinearLayout.LayoutParams) aVar10).width == 0) {
                                i11 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i71 <= 0) {
                                        i71 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i71, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                                f8 = f12;
                                i9 = i72;
                            } else {
                                i11 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i71;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i11), childMeasureSpec2);
                            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState() & (-16777216));
                            f8 = f12;
                            i9 = i72;
                        } else {
                            i9 = i4;
                        }
                        if (z17) {
                            this.f35059k = m14900m() + childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin + this.f35059k;
                        } else {
                            int i73 = this.f35059k;
                            this.f35059k = Math.max(i73, m14900m() + childAt.getMeasuredWidth() + i73 + ((LinearLayout.LayoutParams) aVar10).leftMargin + ((LinearLayout.LayoutParams) aVar10).rightMargin);
                        }
                        boolean z23 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) aVar10).height == -1;
                        int i74 = ((LinearLayout.LayoutParams) aVar10).topMargin + ((LinearLayout.LayoutParams) aVar10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i74;
                        iMax14 = Math.max(iMax14, measuredHeight4);
                        if (!z23) {
                            i74 = measuredHeight4;
                        }
                        iMax13 = Math.max(iMax13, i74);
                        if (z19) {
                            i10 = -1;
                            boolean z24 = ((LinearLayout.LayoutParams) aVar10).height == -1;
                            if (!z22 && (baseline = childAt.getBaseline()) != i10) {
                                int i75 = ((LinearLayout.LayoutParams) aVar10).gravity;
                                if (i75 < 0) {
                                    i75 = this.f35058j;
                                }
                                int i76 = (((i75 & 112) >> 4) & (-2)) >> 1;
                                iArr[i76] = Math.max(iArr[i76], baseline);
                                iArr2[i76] = Math.max(iArr2[i76], measuredHeight4 - baseline);
                            }
                            z19 = z24;
                            i8 = i9;
                            f8 = f8;
                        } else {
                            i10 = -1;
                        }
                        if (!z22) {
                        }
                        z19 = z24;
                        i8 = i9;
                        f8 = f8;
                    }
                    i5++;
                    i4 = i8;
                    virtualChildCount2 = virtualChildCount2;
                }
                i6 = i2;
                i7 = virtualChildCount2;
                this.f35059k = getPaddingRight() + getPaddingLeft() + this.f35059k;
                if (iArr[1] != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c3 = 3;
                    if (iArr[3] == -1) {
                        iMax10 = iMax14;
                    }
                    if (z19 || mode4 == 1073741824) {
                        iMax13 = iMax10;
                    }
                    setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                    if (z20) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                        i12 = i7;
                        for (i13 = 0; i13 < i12; i13++) {
                            childAt2 = getChildAt(i13);
                            if (childAt2.getVisibility() != 8) {
                                aVar = (a) childAt2.getLayoutParams();
                                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                                    int i77 = ((LinearLayout.LayoutParams) aVar).width;
                                    ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                                    measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                    ((LinearLayout.LayoutParams) aVar).width = i77;
                                }
                            }
                        }
                    }
                }
                c3 = 3;
                iMax10 = Math.max(iMax14, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
                if (z19) {
                    iMax13 = iMax10;
                } else {
                    iMax13 = iMax10;
                }
                setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
                if (z20) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                    i12 = i7;
                    while (i13 < i12) {
                        childAt2 = getChildAt(i13);
                        if (childAt2.getVisibility() != 8) {
                            aVar = (a) childAt2.getLayoutParams();
                            if (((LinearLayout.LayoutParams) aVar).height == -1) {
                                int i78 = ((LinearLayout.LayoutParams) aVar).width;
                                ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                                measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                                ((LinearLayout.LayoutParams) aVar).width = i78;
                            }
                        }
                    }
                }
            }
            iMax13 = Math.max(iMax13, i69);
            if (z21 && mode3 != 1073741824) {
                for (int i79 = 0; i79 < virtualChildCount2; i79++) {
                    View childAt10 = getChildAt(i79);
                    if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) childAt10.getLayoutParams())).weight > 0.0f) {
                        childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = i2;
            i7 = virtualChildCount2;
            iCombineMeasuredStates = i59;
            if (z19) {
                iMax13 = iMax10;
            } else {
                iMax13 = iMax10;
            }
            setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
            if (z20) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i12 = i7;
                while (i13 < i12) {
                    childAt2 = getChildAt(i13);
                    if (childAt2.getVisibility() != 8) {
                        aVar = (a) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) aVar).height == -1) {
                            int i710 = ((LinearLayout.LayoutParams) aVar).width;
                            ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) aVar).width = i710;
                        }
                    }
                }
            }
        }
        c2 = 3;
        iMax10 = Math.max(iMax10, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c2], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z21) {
            this.f35059k = 0;
            iM14898k = 0;
            while (iM14898k < virtualChildCount2) {
                childAt3 = getChildAt(iM14898k);
                if (childAt3 == null) {
                    this.f35059k = m14903p() + this.f35059k;
                } else if (childAt3.getVisibility() == 8) {
                    iM14898k += m14898k();
                } else {
                    aVar2 = (a) childAt3.getLayoutParams();
                    if (z17) {
                        this.f35059k = m14900m() + ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) aVar2).rightMargin + this.f35059k;
                    } else {
                        int i711 = this.f35059k;
                        this.f35059k = Math.max(i711, m14900m() + i711 + iMax9 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin);
                    }
                }
                iM14898k++;
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f35059k;
        this.f35059k = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i, 0);
        i3 = (16777215 & iResolveSizeAndState3) - this.f35059k;
        if (z18) {
            f = this.f35060l;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f35059k = 0;
            i4 = i3;
            iCombineMeasuredStates = i59;
            int iMax15 = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                }
                i5++;
                i4 = i8;
                virtualChildCount2 = virtualChildCount2;
            }
            i6 = i2;
            i7 = virtualChildCount2;
            this.f35059k = getPaddingRight() + getPaddingLeft() + this.f35059k;
            if (iArr[1] != -1) {
                c3 = 3;
            } else {
                c3 = 3;
            }
            iMax10 = Math.max(iMax15, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        } else {
            f = this.f35060l;
            if (f > 0.0f) {
                f8 = f;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f35059k = 0;
            i4 = i3;
            iCombineMeasuredStates = i59;
            int iMax16 = -1;
            i5 = 0;
            while (i5 < virtualChildCount2) {
                childAt = getChildAt(i5);
                if (childAt != null) {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i8 = i4;
                    virtualChildCount2 = virtualChildCount2;
                }
                i5++;
                i4 = i8;
                virtualChildCount2 = virtualChildCount2;
            }
            i6 = i2;
            i7 = virtualChildCount2;
            this.f35059k = getPaddingRight() + getPaddingLeft() + this.f35059k;
            if (iArr[1] != -1) {
                c3 = 3;
            } else {
                c3 = 3;
            }
            iMax10 = Math.max(iMax16, Math.max(iArr2[c3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z19) {
            iMax13 = iMax10;
        } else {
            iMax13 = iMax10;
        }
        setMeasuredDimension(((-16777216) & iCombineMeasuredStates) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax13, getSuggestedMinimumHeight()), i6, iCombineMeasuredStates << 16));
        if (z20) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i12 = i7;
            while (i13 < i12) {
                childAt2 = getChildAt(i13);
                if (childAt2.getVisibility() != 8) {
                    aVar = (a) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) aVar).height == -1) {
                        int i712 = ((LinearLayout.LayoutParams) aVar).width;
                        ((LinearLayout.LayoutParams) aVar).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) aVar).width = i712;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public int m14903p() {
        return 0;
    }

    public void setBaselineAligned(boolean z) {
        this.f35054f = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f35055g = i;
            return;
        }
        StringBuilder sbM1556G = outline.m1556G("base aligned child index out of range (0, ");
        sbM1556G.append(getChildCount());
        sbM1556G.append(")");
        throw new IllegalArgumentException(sbM1556G.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f35064p) {
            return;
        }
        this.f35064p = drawable;
        if (drawable != null) {
            this.f35065q = drawable.getIntrinsicWidth();
            this.f35066r = drawable.getIntrinsicHeight();
        } else {
            this.f35065q = 0;
            this.f35066r = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f35068t = i;
    }

    public void setGravity(int i) {
        if (this.f35058j != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f35058j = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f35058j;
        if ((8388615 & i3) != i2) {
            this.f35058j = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f35061m = z;
    }

    public void setOrientation(int i) {
        if (this.f35057i != i) {
            this.f35057i = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f35067s) {
            requestLayout();
        }
        this.f35067s = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f35058j;
        if ((i3 & 112) != i2) {
            this.f35058j = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f35060l = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        this.f35054f = true;
        this.f35055g = -1;
        this.f35056h = 0;
        this.f35058j = 8388659;
        int[] iArr = C7463b.f34397m;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.m16326t(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f35060l = typedArrayObtainStyledAttributes.getFloat(4, -1.0f);
        this.f35055g = typedArrayObtainStyledAttributes.getInt(3, -1);
        this.f35061m = typedArrayObtainStyledAttributes.getBoolean(7, false);
        if (typedArrayObtainStyledAttributes.hasValue(5) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = AppCompatResources.m14707b(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.f35067s = typedArrayObtainStyledAttributes.getInt(8, 0);
        this.f35068t = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
