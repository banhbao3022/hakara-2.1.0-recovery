package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.p645c.ToolbarActionBar;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p644b.p653h.ActionMenuPresenter;
import p636z0.p644b.p653h.LinearLayoutCompat;
import p636z0.p644b.p653h.ViewUtils5;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.b, MenuView {

    /* JADX INFO: renamed from: A */
    public MenuBuilder.a f332A;

    /* JADX INFO: renamed from: B */
    public boolean f333B;

    /* JADX INFO: renamed from: C */
    public int f334C;

    /* JADX INFO: renamed from: D */
    public int f335D;

    /* JADX INFO: renamed from: E */
    public int f336E;

    /* JADX INFO: renamed from: F */
    public InterfaceC0065e f337F;

    /* JADX INFO: renamed from: u */
    public MenuBuilder f338u;

    /* JADX INFO: renamed from: v */
    public Context f339v;

    /* JADX INFO: renamed from: w */
    public int f340w;

    /* JADX INFO: renamed from: x */
    public boolean f341x;

    /* JADX INFO: renamed from: y */
    public ActionMenuPresenter f342y;

    /* JADX INFO: renamed from: z */
    public MenuPresenter.a f343z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$a */
    public interface InterfaceC0061a {
        /* JADX INFO: renamed from: a */
        boolean mo141a();

        /* JADX INFO: renamed from: b */
        boolean mo142b();
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$b */
    public static class C0062b implements MenuPresenter.a {
        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: c */
        public void mo186c(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: d */
        public boolean mo187d(MenuBuilder menuBuilder) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$c */
    public static class C0063c extends LinearLayoutCompat.a {

        /* JADX INFO: renamed from: a */
        @ViewDebug.ExportedProperty
        public boolean f344a;

        /* JADX INFO: renamed from: b */
        @ViewDebug.ExportedProperty
        public int f345b;

        /* JADX INFO: renamed from: c */
        @ViewDebug.ExportedProperty
        public int f346c;

        /* JADX INFO: renamed from: d */
        @ViewDebug.ExportedProperty
        public boolean f347d;

        /* JADX INFO: renamed from: e */
        @ViewDebug.ExportedProperty
        public boolean f348e;

        /* JADX INFO: renamed from: f */
        public boolean f349f;

        public C0063c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0063c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0063c(C0063c c0063c) {
            super((ViewGroup.LayoutParams) c0063c);
            this.f344a = c0063c.f344a;
        }

        public C0063c(int i, int i2) {
            super(i, i2);
            this.f344a = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$d */
    public class C0064d implements MenuBuilder.a {
        public C0064d() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: a */
        public boolean mo188a(MenuBuilder menuBuilder, MenuItem menuItem) {
            InterfaceC0065e interfaceC0065e = ActionMenuView.this.f337F;
            if (interfaceC0065e == null) {
                return false;
            }
            Toolbar.InterfaceC0089f interfaceC0089f = Toolbar.this.f453L;
            return interfaceC0089f != null ? ToolbarActionBar.this.f34532c.onMenuItemSelected(0, menuItem) : false;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: b */
        public void mo189b(MenuBuilder menuBuilder) {
            MenuBuilder.a aVar = ActionMenuView.this.f332A;
            if (aVar != null) {
                aVar.mo189b(menuBuilder);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionMenuView$e */
    public interface InterfaceC0065e {
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: t */
    public static int m179t(View view, int i, int i2, int i3, int i4) {
        C0063c c0063c = (C0063c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.m143c();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, Integer.MIN_VALUE), iMakeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!c0063c.f344a && z2) {
            z = true;
        }
        c0063c.f347d = z;
        c0063c.f345b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), iMakeMeasureSpec);
        return i5;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder.b
    /* JADX INFO: renamed from: a */
    public boolean mo150a(MenuItemImpl menuItemImpl) {
        return this.f338u.m14785s(menuItemImpl, null, 0);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView
    /* JADX INFO: renamed from: b */
    public void mo151b(MenuBuilder menuBuilder) {
        this.f338u = menuBuilder;
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0063c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f338u == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.f338u = menuBuilder;
            menuBuilder.f34823f = new C0064d();
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.f342y = actionMenuPresenter;
            actionMenuPresenter.f34983r = true;
            actionMenuPresenter.f34984s = true;
            MenuPresenter.a c0062b = this.f343z;
            if (c0062b == null) {
                c0062b = new C0062b();
            }
            actionMenuPresenter.f34758j = c0062b;
            this.f338u.m14768b(actionMenuPresenter, this.f339v);
            ActionMenuPresenter actionMenuPresenter2 = this.f342y;
            actionMenuPresenter2.f34761m = this;
            this.f338u = actionMenuPresenter2.f34756h;
        }
        return this.f338u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f342y;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f34980o;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (actionMenuPresenter.f34982q) {
            return actionMenuPresenter.f34981p;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f340w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat
    /* JADX INFO: renamed from: i */
    public LinearLayoutCompat.a generateLayoutParams(AttributeSet attributeSet) {
        return new C0063c(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.f342y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo251x(false);
            if (this.f342y.m14847i()) {
                this.f342y.m14845g();
                this.f342y.m14848j();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f342y;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m14844f();
        }
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int paddingLeft;
        if (!this.f333B) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i5 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i6 = i3 - i;
        int paddingRight = (i6 - getPaddingRight()) - getPaddingLeft();
        boolean zM14875b = ViewUtils5.m14875b(this);
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                C0063c c0063c = (C0063c) childAt.getLayoutParams();
                if (c0063c.f344a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m185s(i9)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zM14875b) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0063c).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0063c).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i10 = i5 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i10, width, measuredHeight + i10);
                    paddingRight -= measuredWidth;
                    i7 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0063c).leftMargin) + ((LinearLayout.LayoutParams) c0063c).rightMargin;
                    m185s(i9);
                    i8++;
                }
            }
        }
        if (childCount == 1 && i7 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i11 = (i6 / 2) - (measuredWidth2 / 2);
            int i12 = i5 - (measuredHeight2 / 2);
            childAt2.layout(i11, i12, measuredWidth2 + i11, measuredHeight2 + i12);
            return;
        }
        int i13 = i8 - (i7 ^ 1);
        int iMax = Math.max(0, i13 > 0 ? paddingRight / i13 : 0);
        if (zM14875b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt3 = getChildAt(i14);
                C0063c c0063c2 = (C0063c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0063c2.f344a) {
                    int i15 = width2 - ((LinearLayout.LayoutParams) c0063c2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i16 = i5 - (measuredHeight3 / 2);
                    childAt3.layout(i15 - measuredWidth3, i16, i15, measuredHeight3 + i16);
                    width2 = i15 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0063c2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt4 = getChildAt(i17);
            C0063c c0063c3 = (C0063c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0063c3.f344a) {
                int i18 = paddingLeft2 + ((LinearLayout.LayoutParams) c0063c3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i19 = i5 - (measuredHeight4 / 2);
                childAt4.layout(i18, i19, i18 + measuredWidth4, measuredHeight4 + i19);
                paddingLeft2 = outline.m1578b(measuredWidth4, ((LinearLayout.LayoutParams) c0063c3).rightMargin, iMax, i18);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v39 */
    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean z;
        ?? r3;
        MenuBuilder menuBuilder;
        boolean z2 = this.f333B;
        boolean z3 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f333B = z3;
        if (z2 != z3) {
            this.f334C = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f333B && (menuBuilder = this.f338u) != null && size != this.f334C) {
            this.f334C = size;
            menuBuilder.m14783q(true);
        }
        int childCount = getChildCount();
        if (!this.f333B || childCount <= 0) {
            for (int i4 = 0; i4 < childCount; i4++) {
                C0063c c0063c = (C0063c) getChildAt(i4).getLayoutParams();
                ((LinearLayout.LayoutParams) c0063c).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0063c).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i5 = size2 - paddingRight;
        int i6 = this.f335D;
        int i7 = i5 / i6;
        int i8 = i5 % i6;
        if (i7 == 0) {
            setMeasuredDimension(i5, 0);
            return;
        }
        int i9 = (i8 / i7) + i6;
        int childCount2 = getChildCount();
        int i10 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z4 = false;
        long j2 = 0;
        while (i12 < childCount2) {
            View childAt = getChildAt(i12);
            int i13 = size3;
            int i14 = i5;
            if (childAt.getVisibility() != 8) {
                boolean z5 = childAt instanceof ActionMenuItemView;
                int i15 = i10 + 1;
                if (z5) {
                    int i16 = this.f336E;
                    r3 = 0;
                    childAt.setPadding(i16, 0, i16, 0);
                } else {
                    r3 = 0;
                }
                C0063c c0063c2 = (C0063c) childAt.getLayoutParams();
                c0063c2.f349f = r3;
                c0063c2.f346c = r3;
                c0063c2.f345b = r3;
                c0063c2.f347d = r3;
                ((LinearLayout.LayoutParams) c0063c2).leftMargin = r3;
                ((LinearLayout.LayoutParams) c0063c2).rightMargin = r3;
                c0063c2.f348e = z5 && ((ActionMenuItemView) childAt).m143c();
                int iM179t = m179t(childAt, i9, c0063c2.f344a ? 1 : i7, childMeasureSpec, paddingBottom);
                iMax2 = Math.max(iMax2, iM179t);
                if (c0063c2.f347d) {
                    i11++;
                }
                if (c0063c2.f344a) {
                    z4 = true;
                }
                i7 -= iM179t;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iM179t == 1) {
                    j2 |= (long) (1 << i12);
                }
                i10 = i15;
            }
            i12++;
            size3 = i13;
            i5 = i14;
        }
        int i17 = i5;
        int i18 = size3;
        boolean z6 = z4 && i10 == 2;
        boolean z7 = false;
        while (true) {
            if (i11 <= 0 || i7 <= 0) {
                i3 = iMax;
                z = z7;
                break;
            }
            int i19 = Integer.MAX_VALUE;
            int i20 = 0;
            int i21 = 0;
            long j3 = 0;
            while (i20 < childCount2) {
                int i22 = iMax;
                C0063c c0063c3 = (C0063c) getChildAt(i20).getLayoutParams();
                boolean z8 = z7;
                if (c0063c3.f347d) {
                    int i23 = c0063c3.f345b;
                    if (i23 < i19) {
                        j3 = 1 << i20;
                        i19 = i23;
                        i21 = 1;
                    } else if (i23 == i19) {
                        i21++;
                        j3 |= 1 << i20;
                    }
                }
                i20++;
                z7 = z8;
                iMax = i22;
            }
            i3 = iMax;
            z = z7;
            j2 |= j3;
            if (i21 > i7) {
                break;
            }
            int i24 = i19 + 1;
            int i25 = 0;
            while (i25 < childCount2) {
                View childAt2 = getChildAt(i25);
                C0063c c0063c4 = (C0063c) childAt2.getLayoutParams();
                int i26 = i11;
                long j4 = 1 << i25;
                if ((j3 & j4) == 0) {
                    if (c0063c4.f345b == i24) {
                        j2 |= j4;
                    }
                    z6 = z6;
                } else {
                    if (z6 && c0063c4.f348e && i7 == 1) {
                        int i27 = this.f336E;
                        childAt2.setPadding(i27 + i9, 0, i27, 0);
                    }
                    c0063c4.f345b++;
                    c0063c4.f349f = true;
                    i7--;
                }
                i25++;
                i11 = i26;
                z6 = z6;
            }
            iMax = i3;
            z7 = true;
        }
        boolean z9 = !z4 && i10 == 1;
        if (i7 > 0 && j2 != 0 && (i7 < i10 - 1 || z9 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j2);
            if (!z9) {
                if ((j2 & 1) != 0 && !((C0063c) getChildAt(0).getLayoutParams()).f348e) {
                    fBitCount -= 0.5f;
                }
                int i28 = childCount2 - 1;
                if ((j2 & ((long) (1 << i28))) != 0 && !((C0063c) getChildAt(i28).getLayoutParams()).f348e) {
                    fBitCount -= 0.5f;
                }
            }
            int i29 = fBitCount > 0.0f ? (int) ((i7 * i9) / fBitCount) : 0;
            for (int i30 = 0; i30 < childCount2; i30++) {
                if ((j2 & ((long) (1 << i30))) != 0) {
                    View childAt3 = getChildAt(i30);
                    C0063c c0063c5 = (C0063c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0063c5.f346c = i29;
                        c0063c5.f349f = true;
                        if (i30 == 0 && !c0063c5.f348e) {
                            ((LinearLayout.LayoutParams) c0063c5).leftMargin = (-i29) / 2;
                        }
                    } else if (c0063c5.f344a) {
                        c0063c5.f346c = i29;
                        c0063c5.f349f = true;
                        ((LinearLayout.LayoutParams) c0063c5).rightMargin = (-i29) / 2;
                    } else {
                        if (i30 != 0) {
                            ((LinearLayout.LayoutParams) c0063c5).leftMargin = i29 / 2;
                        }
                        if (i30 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) c0063c5).rightMargin = i29 / 2;
                        }
                    }
                    z = true;
                }
            }
        }
        if (z) {
            for (int i31 = 0; i31 < childCount2; i31++) {
                View childAt4 = getChildAt(i31);
                C0063c c0063c6 = (C0063c) childAt4.getLayoutParams();
                if (c0063c6.f349f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0063c6.f345b * i9) + c0063c6.f346c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i17, mode != 1073741824 ? i3 : i18);
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0063c generateDefaultLayoutParams() {
        C0063c c0063c = new C0063c(-2, -2);
        ((LinearLayout.LayoutParams) c0063c).gravity = 16;
        return c0063c;
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public C0063c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        C0063c c0063c = layoutParams instanceof C0063c ? new C0063c((C0063c) layoutParams) : new C0063c(layoutParams);
        if (((LinearLayout.LayoutParams) c0063c).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0063c).gravity = 16;
        }
        return c0063c;
    }

    /* JADX INFO: renamed from: s */
    public boolean m185s(int i) {
        boolean zMo141a = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC0061a)) {
            zMo141a = false | ((InterfaceC0061a) childAt).mo141a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC0061a)) ? zMo141a : zMo141a | ((InterfaceC0061a) childAt2).mo142b();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f342y.f34988w = z;
    }

    public void setOnMenuItemClickListener(InterfaceC0065e interfaceC0065e) {
        this.f337F = interfaceC0065e;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.f342y;
        ActionMenuPresenter.d dVar = actionMenuPresenter.f34980o;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.f34982q = true;
            actionMenuPresenter.f34981p = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.f341x = z;
    }

    public void setPopupTheme(int i) {
        if (this.f340w != i) {
            this.f340w = i;
            if (i == 0) {
                this.f339v = getContext();
            } else {
                this.f339v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.f342y = actionMenuPresenter;
        actionMenuPresenter.f34761m = this;
        this.f338u = actionMenuPresenter.f34756h;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f335D = (int) (56.0f * f);
        this.f336E = (int) (f * 4.0f);
        this.f339v = context;
        this.f340w = 0;
    }

    @Override // p636z0.p644b.p653h.LinearLayoutCompat, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0063c(getContext(), attributeSet);
    }
}
