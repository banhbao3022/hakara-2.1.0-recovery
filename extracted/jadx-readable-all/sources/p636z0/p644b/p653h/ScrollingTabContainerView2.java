package p636z0.p644b.p653h;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.Objects;
import mtp.media.karaoke.R;
import p636z0.p644b.C7462a;
import p636z0.p644b.C7463b;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p644b.p646d.p647a.AppCompatResources;

/* JADX INFO: renamed from: z0.b.h.r0, reason: use source file name */
/* JADX INFO: compiled from: ScrollingTabContainerView.java */
/* JADX INFO: loaded from: classes.dex */
public class ScrollingTabContainerView2 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: f */
    public Runnable f35159f;

    /* JADX INFO: renamed from: g */
    public LinearLayoutCompat f35160g;

    /* JADX INFO: renamed from: h */
    public Spinner f35161h;

    /* JADX INFO: renamed from: i */
    public boolean f35162i;

    /* JADX INFO: renamed from: j */
    public int f35163j;

    /* JADX INFO: renamed from: k */
    public int f35164k;

    /* JADX INFO: renamed from: l */
    public int f35165l;

    /* JADX INFO: renamed from: m */
    public int f35166m;

    /* JADX INFO: renamed from: z0.b.h.r0$a */
    /* JADX INFO: compiled from: ScrollingTabContainerView.java */
    public class a extends BaseAdapter {
        public a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return ScrollingTabContainerView2.this.f35160g.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((b) ScrollingTabContainerView2.this.f35160g.getChildAt(i)).f35169g;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view != null) {
                b bVar = (b) view;
                bVar.f35169g = ((b) ScrollingTabContainerView2.this.f35160g.getChildAt(i)).f35169g;
                bVar.m14950a();
                return view;
            }
            ScrollingTabContainerView2 scrollingTabContainerView2 = ScrollingTabContainerView2.this;
            ActionBar.c cVar = ((b) scrollingTabContainerView2.f35160g.getChildAt(i)).f35169g;
            Objects.requireNonNull(scrollingTabContainerView2);
            b bVar2 = scrollingTabContainerView2.new b(scrollingTabContainerView2.getContext(), cVar, true);
            bVar2.setBackgroundDrawable(null);
            bVar2.setLayoutParams(new AbsListView.LayoutParams(-1, scrollingTabContainerView2.f35165l));
            return bVar2;
        }
    }

    /* JADX INFO: renamed from: z0.b.h.r0$b */
    /* JADX INFO: compiled from: ScrollingTabContainerView.java */
    public class b extends LinearLayout {

        /* JADX INFO: renamed from: f */
        public final int[] f35168f;

        /* JADX INFO: renamed from: g */
        public ActionBar.c f35169g;

        /* JADX INFO: renamed from: h */
        public TextView f35170h;

        /* JADX INFO: renamed from: i */
        public ImageView f35171i;

        /* JADX INFO: renamed from: j */
        public View f35172j;

        public b(Context context, ActionBar.c cVar, boolean z) {
            int resourceId;
            super(context, null, R.attr.actionBarTabStyle);
            int[] iArr = {android.R.attr.background};
            this.f35168f = iArr;
            this.f35169g = cVar;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.actionBarTabStyle, 0);
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                setBackgroundDrawable((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AppCompatResources.m14707b(context, resourceId));
            }
            typedArrayObtainStyledAttributes.recycle();
            if (z) {
                setGravity(8388627);
            }
            m14950a();
        }

        /* JADX INFO: renamed from: a */
        public void m14950a() {
            ActionBar.c cVar = this.f35169g;
            View viewM14603b = cVar.m14603b();
            if (viewM14603b != null) {
                ViewParent parent = viewM14603b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewM14603b);
                    }
                    addView(viewM14603b);
                }
                this.f35172j = viewM14603b;
                TextView textView = this.f35170h;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f35171i;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f35171i.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f35172j;
            if (view != null) {
                removeView(view);
                this.f35172j = null;
            }
            Drawable drawableM14604c = cVar.m14604c();
            CharSequence charSequenceM14605d = cVar.m14605d();
            if (drawableM14604c != null) {
                if (this.f35171i == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f35171i = appCompatImageView;
                }
                this.f35171i.setImageDrawable(drawableM14604c);
                this.f35171i.setVisibility(0);
            } else {
                ImageView imageView2 = this.f35171i;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f35171i.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceM14605d);
            if (z) {
                if (this.f35170h == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, R.attr.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f35170h = appCompatTextView;
                }
                this.f35170h.setText(charSequenceM14605d);
                this.f35170h.setVisibility(0);
            } else {
                TextView textView2 = this.f35170h;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f35170h.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f35171i;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.m14602a());
            }
            C7462a.m14578o(this, z ? null : cVar.m14602a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (ScrollingTabContainerView2.this.f35163j > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = ScrollingTabContainerView2.this.f35163j;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.h.r0$c */
    /* JADX INFO: compiled from: ScrollingTabContainerView.java */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f35174a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f35174a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f35174a) {
                return;
            }
            Objects.requireNonNull(ScrollingTabContainerView2.this);
            ScrollingTabContainerView2.this.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView2.this.setVisibility(0);
            this.f35174a = false;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public ScrollingTabContainerView2(Context context) {
        super(context);
        new c();
        setHorizontalScrollBarEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C7463b.f34385a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        layoutDimension = context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs) ? layoutDimension : Math.min(layoutDimension, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f35164k = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), null, R.attr.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
        this.f35160g = linearLayoutCompat;
        addView(linearLayoutCompat, new ViewGroup.LayoutParams(-2, -1));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m14949a() {
        Spinner spinner = this.f35161h;
        if (!(spinner != null && spinner.getParent() == this)) {
            return false;
        }
        removeView(this.f35161h);
        addView(this.f35160g, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f35161h.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f35159f;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, C7463b.f34385a, R.attr.actionBarStyle, 0);
        int layoutDimension = typedArrayObtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        typedArrayObtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f35164k = context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f35159f;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
        ((b) view).f35169g.m14606e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f35160g.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f35163j = -1;
        } else {
            if (childCount > 2) {
                this.f35163j = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f35163j = View.MeasureSpec.getSize(i) / 2;
            }
            this.f35163j = Math.min(this.f35163j, this.f35164k);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f35165l, 1073741824);
        if (!z && this.f35162i) {
            this.f35160g.measure(0, iMakeMeasureSpec);
            if (this.f35160g.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                Spinner spinner = this.f35161h;
                if (!(spinner != null && spinner.getParent() == this)) {
                    if (this.f35161h == null) {
                        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, R.attr.actionDropDownStyle);
                        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                        appCompatSpinner.setOnItemSelectedListener(this);
                        this.f35161h = appCompatSpinner;
                    }
                    removeView(this.f35160g);
                    addView(this.f35161h, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f35161h.getAdapter() == null) {
                        this.f35161h.setAdapter((SpinnerAdapter) new a());
                    }
                    Runnable runnable = this.f35159f;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.f35159f = null;
                    }
                    this.f35161h.setSelection(this.f35166m);
                }
            } else {
                m14949a();
            }
        } else {
            m14949a();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f35166m);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f35162i = z;
    }

    public void setContentHeight(int i) {
        this.f35165l = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f35166m = i;
        int childCount = this.f35160g.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f35160g.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = this.f35160g.getChildAt(i);
                Runnable runnable = this.f35159f;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                ScrollingTabContainerView scrollingTabContainerView = new ScrollingTabContainerView(this, childAt2);
                this.f35159f = scrollingTabContainerView;
                post(scrollingTabContainerView);
            }
            i2++;
        }
        Spinner spinner = this.f35161h;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
