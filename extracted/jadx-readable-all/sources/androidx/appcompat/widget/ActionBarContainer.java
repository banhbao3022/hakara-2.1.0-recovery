package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.C7463b;
import p636z0.p644b.p653h.ActionBarBackgroundDrawable;
import p636z0.p644b.p653h.ScrollingTabContainerView2;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public boolean f274f;

    /* JADX INFO: renamed from: g */
    public View f275g;

    /* JADX INFO: renamed from: h */
    public View f276h;

    /* JADX INFO: renamed from: i */
    public View f277i;

    /* JADX INFO: renamed from: j */
    public Drawable f278j;

    /* JADX INFO: renamed from: k */
    public Drawable f279k;

    /* JADX INFO: renamed from: l */
    public Drawable f280l;

    /* JADX INFO: renamed from: m */
    public boolean f281m;

    /* JADX INFO: renamed from: n */
    public boolean f282n;

    /* JADX INFO: renamed from: o */
    public int f283o;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    public final int m155a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m156b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f278j;
        if (drawable != null && drawable.isStateful()) {
            this.f278j.setState(getDrawableState());
        }
        Drawable drawable2 = this.f279k;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f279k.setState(getDrawableState());
        }
        Drawable drawable3 = this.f280l;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f280l.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f275g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f278j;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f279k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f280l;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f276h = findViewById(R.id.action_bar);
        this.f277i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f274f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.f275g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i5 = layoutParams.bottomMargin;
            view.layout(i, measuredHeight2 - i5, i3, measuredHeight - i5);
        }
        if (this.f281m) {
            Drawable drawable2 = this.f280l;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f278j != null) {
                if (this.f276h.getVisibility() == 0) {
                    this.f278j.setBounds(this.f276h.getLeft(), this.f276h.getTop(), this.f276h.getRight(), this.f276h.getBottom());
                } else {
                    View view2 = this.f277i;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f278j.setBounds(0, 0, 0, 0);
                    } else {
                        this.f278j.setBounds(this.f277i.getLeft(), this.f277i.getTop(), this.f277i.getRight(), this.f277i.getBottom());
                    }
                }
                z3 = true;
            }
            this.f282n = z4;
            if (!z4 || (drawable = this.f279k) == null) {
                z2 = z3;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM155a;
        int i3;
        if (this.f276h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f283o) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f276h == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.f275g;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (m156b(this.f276h)) {
            iM155a = !m156b(this.f277i) ? m155a(this.f277i) : 0;
        } else {
            iM155a = m155a(this.f276h);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(m155a(this.f275g) + iM155a, mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f278j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f278j);
        }
        this.f278j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f276h;
            if (view != null) {
                this.f278j.setBounds(view.getLeft(), this.f276h.getTop(), this.f276h.getRight(), this.f276h.getBottom());
            }
        }
        boolean z = true;
        if (!this.f281m ? this.f278j != null || this.f279k != null : this.f280l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f280l;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f280l);
        }
        this.f280l = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f281m && (drawable2 = this.f280l) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f281m ? !(this.f278j != null || this.f279k != null) : this.f280l == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f279k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f279k);
        }
        this.f279k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f282n && (drawable2 = this.f279k) != null) {
                drawable2.setBounds(this.f275g.getLeft(), this.f275g.getTop(), this.f275g.getRight(), this.f275g.getBottom());
            }
        }
        boolean z = true;
        if (!this.f281m ? this.f278j != null || this.f279k != null : this.f280l != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView2 scrollingTabContainerView2) {
        View view = this.f275g;
        if (view != null) {
            removeView(view);
        }
        this.f275g = scrollingTabContainerView2;
        if (scrollingTabContainerView2 != null) {
            addView(scrollingTabContainerView2);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView2.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView2.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f274f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f278j;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f279k;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f280l;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f278j && !this.f281m) || (drawable == this.f279k && this.f282n) || ((drawable == this.f280l && this.f281m) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ActionBarBackgroundDrawable actionBarBackgroundDrawable = new ActionBarBackgroundDrawable(this);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        setBackground(actionBarBackgroundDrawable);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34385a);
        boolean z = false;
        this.f278j = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f279k = typedArrayObtainStyledAttributes.getDrawable(2);
        this.f283o = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f281m = true;
            this.f280l = typedArrayObtainStyledAttributes.getDrawable(1);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f281m ? !(this.f278j != null || this.f279k != null) : this.f280l == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
