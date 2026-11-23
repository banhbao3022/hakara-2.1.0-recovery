package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p651g.ActionMode;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p644b.p653h.AbsActionBarView;
import p636z0.p644b.p653h.ActionMenuPresenter;
import p636z0.p644b.p653h.ViewUtils5;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbsActionBarView {

    /* JADX INFO: renamed from: n */
    public CharSequence f284n;

    /* JADX INFO: renamed from: o */
    public CharSequence f285o;

    /* JADX INFO: renamed from: p */
    public View f286p;

    /* JADX INFO: renamed from: q */
    public View f287q;

    /* JADX INFO: renamed from: r */
    public View f288r;

    /* JADX INFO: renamed from: s */
    public LinearLayout f289s;

    /* JADX INFO: renamed from: t */
    public TextView f290t;

    /* JADX INFO: renamed from: u */
    public TextView f291u;

    /* JADX INFO: renamed from: v */
    public int f292v;

    /* JADX INFO: renamed from: w */
    public int f293w;

    /* JADX INFO: renamed from: x */
    public boolean f294x;

    /* JADX INFO: renamed from: y */
    public int f295y;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarContextView$a */
    public class ViewOnClickListenerC0055a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ActionMode f296f;

        public ViewOnClickListenerC0055a(ActionBarContextView actionBarContextView, ActionMode actionMode) {
            this.f296f = actionMode;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f296f.mo14692c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: f */
    public void m157f(ActionMode actionMode) {
        View view = this.f286p;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f295y, (ViewGroup) this, false);
            this.f286p = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f286p);
        }
        View viewFindViewById = this.f286p.findViewById(R.id.action_mode_close_button);
        this.f287q = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0055a(this, actionMode));
        MenuBuilder menuBuilder = (MenuBuilder) actionMode.mo14694e();
        ActionMenuPresenter actionMenuPresenter = this.f34930i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m14844f();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f34930i = actionMenuPresenter2;
        actionMenuPresenter2.f34983r = true;
        actionMenuPresenter2.f34984s = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        menuBuilder.m14768b(this.f34930i, this.f34928g);
        ActionMenuPresenter actionMenuPresenter3 = this.f34930i;
        MenuView menuView = actionMenuPresenter3.f34761m;
        if (menuView == null) {
            MenuView menuView2 = (MenuView) actionMenuPresenter3.f34757i.inflate(actionMenuPresenter3.f34759k, (ViewGroup) this, false);
            actionMenuPresenter3.f34761m = menuView2;
            menuView2.mo151b(actionMenuPresenter3.f34756h);
            actionMenuPresenter3.mo251x(true);
        }
        MenuView menuView3 = actionMenuPresenter3.f34761m;
        if (menuView != menuView3) {
            ((ActionMenuView) menuView3).setPresenter(actionMenuPresenter3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) menuView3;
        this.f34929h = actionMenuView;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        actionMenuView.setBackground(null);
        addView(this.f34929h, layoutParams);
    }

    /* JADX INFO: renamed from: g */
    public final void m158g() {
        if (this.f289s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f289s = linearLayout;
            this.f290t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f291u = (TextView) this.f289s.findViewById(R.id.action_bar_subtitle);
            if (this.f292v != 0) {
                this.f290t.setTextAppearance(getContext(), this.f292v);
            }
            if (this.f293w != 0) {
                this.f291u.setTextAppearance(getContext(), this.f293w);
            }
        }
        this.f290t.setText(this.f284n);
        this.f291u.setText(this.f285o);
        boolean z = !TextUtils.isEmpty(this.f284n);
        boolean z2 = !TextUtils.isEmpty(this.f285o);
        int i = 0;
        this.f291u.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.f289s;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.f289s.getParent() == null) {
            addView(this.f289s);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p636z0.p644b.p653h.AbsActionBarView
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p636z0.p644b.p653h.AbsActionBarView
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f285o;
    }

    public CharSequence getTitle() {
        return this.f284n;
    }

    /* JADX INFO: renamed from: h */
    public void m159h() {
        removeAllViews();
        this.f288r = null;
        this.f34929h = null;
        this.f34930i = null;
        View view = this.f287q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f34930i;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.m14845g();
            this.f34930i.m14846h();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f284n);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zM14875b = ViewUtils5.m14875b(this);
        int paddingRight = zM14875b ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f286p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f286p.getLayoutParams();
            int i5 = zM14875b ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zM14875b ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zM14875b ? paddingRight - i5 : paddingRight + i5;
            int iM14824d = i7 + m14824d(this.f286p, i7, paddingTop, paddingTop2, zM14875b);
            paddingRight = zM14875b ? iM14824d - i6 : iM14824d + i6;
        }
        int iM14824d2 = paddingRight;
        LinearLayout linearLayout = this.f289s;
        if (linearLayout != null && this.f288r == null && linearLayout.getVisibility() != 8) {
            iM14824d2 += m14824d(this.f289s, iM14824d2, paddingTop, paddingTop2, zM14875b);
        }
        int i8 = iM14824d2;
        View view2 = this.f288r;
        if (view2 != null) {
            m14824d(view2, i8, paddingTop, paddingTop2, zM14875b);
        }
        int paddingLeft = zM14875b ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f34929h;
        if (actionMenuView != null) {
            m14824d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zM14875b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f34931j;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f286p;
        if (view != null) {
            int iM14823c = m14823c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f286p.getLayoutParams();
            paddingLeft = iM14823c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f34929h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m14823c(this.f34929h, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f289s;
        if (linearLayout != null && this.f288r == null) {
            if (this.f294x) {
                this.f289s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f289s.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.f289s.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = m14823c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f288r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.f288r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.f34931j > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // p636z0.p644b.p653h.AbsActionBarView
    public void setContentHeight(int i) {
        this.f34931j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f288r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f288r = view;
        if (view != null && (linearLayout = this.f289s) != null) {
            removeView(linearLayout);
            this.f289s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f285o = charSequence;
        m158g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f284n = charSequence;
        m158g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.f294x) {
            requestLayout();
        }
        this.f294x = z;
    }

    @Override // p636z0.p644b.p653h.AbsActionBarView, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        int resourceId;
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34388d, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AppCompatResources.m14707b(context, resourceId);
        } else {
            drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        }
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setBackground(drawable);
        this.f292v = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f293w = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f34931j = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f295y = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }
}
