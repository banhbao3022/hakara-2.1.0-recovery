package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p360t.ForegroundLinearLayout;
import p636z0.p644b.C7462a;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuView;
import p636z0.p644b.p653h.LinearLayoutCompat;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.p728c.ResourcesCompat;
import p636z0.p725k.p739l.AccessibilityDelegateCompat;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends ForegroundLinearLayout implements MenuView.a {

    /* JADX INFO: renamed from: A */
    public static final int[] f29004A = {R.attr.state_checked};

    /* JADX INFO: renamed from: B */
    public int f29005B;

    /* JADX INFO: renamed from: C */
    public boolean f29006C;

    /* JADX INFO: renamed from: D */
    public boolean f29007D;

    /* JADX INFO: renamed from: E */
    public final CheckedTextView f29008E;

    /* JADX INFO: renamed from: F */
    public FrameLayout f29009F;

    /* JADX INFO: renamed from: G */
    public MenuItemImpl f29010G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f29011H;

    /* JADX INFO: renamed from: I */
    public boolean f29012I;

    /* JADX INFO: renamed from: J */
    public Drawable f29013J;

    /* JADX INFO: renamed from: K */
    public final AccessibilityDelegateCompat f29014K;

    /* JADX INFO: renamed from: com.google.android.material.internal.NavigationMenuItemView$a */
    public class C5962a extends AccessibilityDelegateCompat {
        public C5962a() {
        }

        @Override // p636z0.p725k.p739l.AccessibilityDelegateCompat
        /* JADX INFO: renamed from: d */
        public void mo382d(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            this.f37977b.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat.f38018b);
            accessibilityNodeInfoCompat.f38018b.setCheckable(NavigationMenuItemView.this.f29007D);
        }
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f29009F == null) {
                this.f29009F = (FrameLayout) ((ViewStub) findViewById(mtp.media.karaoke.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.f29009F.removeAllViews();
            this.f29009F.addView(view);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    /* JADX INFO: renamed from: d */
    public void mo144d(MenuItemImpl menuItemImpl, int i) {
        StateListDrawable stateListDrawable;
        this.f29010G = menuItemImpl;
        int i2 = menuItemImpl.f34850a;
        if (i2 > 0) {
            setId(i2);
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(mtp.media.karaoke.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f29004A, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            setBackground(stateListDrawable);
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.f34854e);
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.f34866q);
        C7462a.m14578o(this, menuItemImpl.f34867r);
        MenuItemImpl menuItemImpl2 = this.f29010G;
        if (menuItemImpl2.f34854e == null && menuItemImpl2.getIcon() == null && this.f29010G.getActionView() != null) {
            this.f29008E.setVisibility(8);
            FrameLayout frameLayout = this.f29009F;
            if (frameLayout != null) {
                LinearLayoutCompat.a aVar = (LinearLayoutCompat.a) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) aVar).width = -1;
                this.f29009F.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.f29008E.setVisibility(0);
        FrameLayout frameLayout2 = this.f29009F;
        if (frameLayout2 != null) {
            LinearLayoutCompat.a aVar2 = (LinearLayoutCompat.a) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) aVar2).width = -2;
            this.f29009F.setLayoutParams(aVar2);
        }
    }

    @Override // p636z0.p644b.p651g.p652i.MenuView.a
    public MenuItemImpl getItemData() {
        return this.f29010G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        MenuItemImpl menuItemImpl = this.f29010G;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f29010G.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, f29004A);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f29007D != z) {
            this.f29007D = z;
            this.f29014K.mo16221h(this.f29008E, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f29008E.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f29012I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C8162a.m16054Y(drawable).mutate();
                drawable.setTintList(this.f29011H);
            }
            int i = this.f29005B;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f29006C) {
            if (this.f29013J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = ResourcesCompat.f37835a;
                Drawable drawable2 = resources.getDrawable(mtp.media.karaoke.R.drawable.navigation_empty_icon, theme);
                this.f29013J = drawable2;
                if (drawable2 != null) {
                    int i2 = this.f29005B;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f29013J;
        }
        this.f29008E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f29008E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f29005B = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f29011H = colorStateList;
        this.f29012I = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f29010G;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f29008E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f29006C = z;
    }

    public void setTextAppearance(int i) {
        C8162a.m16047R(this.f29008E, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f29008E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f29008E.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5962a c5962a = new C5962a();
        this.f29014K = c5962a;
        setOrientation(0);
        LayoutInflater.from(context).inflate(mtp.media.karaoke.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(mtp.media.karaoke.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(mtp.media.karaoke.R.id.design_menu_item_text);
        this.f29008E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.m16327u(checkedTextView, c5962a);
    }
}
