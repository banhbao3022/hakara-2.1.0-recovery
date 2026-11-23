package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p644b.C7463b;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p651g.CollapsibleActionView;
import p636z0.p644b.p651g.SupportMenuInflater;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p651g.p652i.SubMenuBuilder;
import p636z0.p644b.p653h.ActionMenuPresenter;
import p636z0.p644b.p653h.AppCompatImageButton;
import p636z0.p644b.p653h.AppCompatTextView;
import p636z0.p644b.p653h.DecorToolbar;
import p636z0.p644b.p653h.RtlSpacingHelper;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p644b.p653h.ToolbarWidgetWrapper;
import p636z0.p644b.p653h.ViewUtils5;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p745m.p746a.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A */
    public int f442A;

    /* JADX INFO: renamed from: B */
    public int f443B;

    /* JADX INFO: renamed from: C */
    public CharSequence f444C;

    /* JADX INFO: renamed from: D */
    public CharSequence f445D;

    /* JADX INFO: renamed from: E */
    public ColorStateList f446E;

    /* JADX INFO: renamed from: F */
    public ColorStateList f447F;

    /* JADX INFO: renamed from: G */
    public boolean f448G;

    /* JADX INFO: renamed from: H */
    public boolean f449H;

    /* JADX INFO: renamed from: I */
    public final ArrayList<View> f450I;

    /* JADX INFO: renamed from: J */
    public final ArrayList<View> f451J;

    /* JADX INFO: renamed from: K */
    public final int[] f452K;

    /* JADX INFO: renamed from: L */
    public InterfaceC0089f f453L;

    /* JADX INFO: renamed from: M */
    public final ActionMenuView.InterfaceC0065e f454M;

    /* JADX INFO: renamed from: N */
    public ToolbarWidgetWrapper f455N;

    /* JADX INFO: renamed from: O */
    public ActionMenuPresenter f456O;

    /* JADX INFO: renamed from: P */
    public C0087d f457P;

    /* JADX INFO: renamed from: Q */
    public MenuPresenter.a f458Q;

    /* JADX INFO: renamed from: R */
    public MenuBuilder.a f459R;

    /* JADX INFO: renamed from: S */
    public boolean f460S;

    /* JADX INFO: renamed from: T */
    public final Runnable f461T;

    /* JADX INFO: renamed from: f */
    public ActionMenuView f462f;

    /* JADX INFO: renamed from: g */
    public TextView f463g;

    /* JADX INFO: renamed from: h */
    public TextView f464h;

    /* JADX INFO: renamed from: i */
    public ImageButton f465i;

    /* JADX INFO: renamed from: j */
    public ImageView f466j;

    /* JADX INFO: renamed from: k */
    public Drawable f467k;

    /* JADX INFO: renamed from: l */
    public CharSequence f468l;

    /* JADX INFO: renamed from: m */
    public ImageButton f469m;

    /* JADX INFO: renamed from: n */
    public View f470n;

    /* JADX INFO: renamed from: o */
    public Context f471o;

    /* JADX INFO: renamed from: p */
    public int f472p;

    /* JADX INFO: renamed from: q */
    public int f473q;

    /* JADX INFO: renamed from: r */
    public int f474r;

    /* JADX INFO: renamed from: s */
    public int f475s;

    /* JADX INFO: renamed from: t */
    public int f476t;

    /* JADX INFO: renamed from: u */
    public int f477u;

    /* JADX INFO: renamed from: v */
    public int f478v;

    /* JADX INFO: renamed from: w */
    public int f479w;

    /* JADX INFO: renamed from: x */
    public int f480x;

    /* JADX INFO: renamed from: y */
    public RtlSpacingHelper f481y;

    /* JADX INFO: renamed from: z */
    public int f482z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$a */
    public class C0084a implements ActionMenuView.InterfaceC0065e {
        public C0084a() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$b */
    public class RunnableC0085b implements Runnable {
        public RunnableC0085b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.m243v();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$c */
    public class ViewOnClickListenerC0086c implements View.OnClickListener {
        public ViewOnClickListenerC0086c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C0087d c0087d = Toolbar.this.f457P;
            MenuItemImpl menuItemImpl = c0087d == null ? null : c0087d.f487g;
            if (menuItemImpl != null) {
                menuItemImpl.collapseActionView();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$d */
    public class C0087d implements MenuPresenter {

        /* JADX INFO: renamed from: f */
        public MenuBuilder f486f;

        /* JADX INFO: renamed from: g */
        public MenuItemImpl f487g;

        public C0087d() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: A */
        public boolean mo244A(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            Toolbar.this.m224c();
            ViewParent parent = Toolbar.this.f469m.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f469m);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f469m);
            }
            Toolbar.this.f470n = menuItemImpl.getActionView();
            this.f487g = menuItemImpl;
            ViewParent parent2 = Toolbar.this.f470n.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f470n);
                }
                C0088e c0088eGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                c0088eGenerateDefaultLayoutParams.f34411a = 8388611 | (toolbar4.f475s & 112);
                c0088eGenerateDefaultLayoutParams.f489b = 2;
                toolbar4.f470n.setLayoutParams(c0088eGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f470n);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((C0088e) childAt.getLayoutParams()).f489b != 2 && childAt != toolbar6.f462f) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.f451J.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            menuItemImpl.f34848C = true;
            menuItemImpl.f34863n.m14783q(false);
            KeyEvent.Callback callback = Toolbar.this.f470n;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).mo202c();
            }
            return true;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: C */
        public void mo245C(Context context, MenuBuilder menuBuilder) {
            MenuItemImpl menuItemImpl;
            MenuBuilder menuBuilder2 = this.f486f;
            if (menuBuilder2 != null && (menuItemImpl = this.f487g) != null) {
                menuBuilder2.mo14770d(menuItemImpl);
            }
            this.f486f = menuBuilder;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: D */
        public void mo246D(Parcelable parcelable) {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: E */
        public boolean mo247E(SubMenuBuilder subMenuBuilder) {
            return false;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: F */
        public Parcelable mo248F() {
            return null;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: c */
        public void mo249c(MenuBuilder menuBuilder, boolean z) {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: w */
        public int mo250w() {
            return 0;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: x */
        public void mo251x(boolean z) {
            if (this.f487g != null) {
                MenuBuilder menuBuilder = this.f486f;
                boolean z2 = false;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f486f.getItem(i) == this.f487g) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                mo253z(this.f486f, this.f487g);
            }
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: y */
        public boolean mo252y() {
            return false;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter
        /* JADX INFO: renamed from: z */
        public boolean mo253z(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
            KeyEvent.Callback callback = Toolbar.this.f470n;
            if (callback instanceof CollapsibleActionView) {
                ((CollapsibleActionView) callback).mo203e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f470n);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f469m);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f470n = null;
            int size = toolbar3.f451J.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.f451J.clear();
                    this.f487g = null;
                    Toolbar.this.requestLayout();
                    menuItemImpl.f34848C = false;
                    menuItemImpl.f34863n.m14783q(false);
                    return true;
                }
                toolbar3.addView(toolbar3.f451J.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$f */
    public interface InterfaceC0089f {
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g */
    public static class C0090g extends AbsSavedState {
        public static final Parcelable.Creator<C0090g> CREATOR = new a();

        /* JADX INFO: renamed from: h */
        public int f490h;

        /* JADX INFO: renamed from: i */
        public boolean f491i;

        /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$g$a */
        public class a implements Parcelable.ClassLoaderCreator<C0090g> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public C0090g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0090g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new C0090g[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new C0090g(parcel, null);
            }
        }

        public C0090g(Parcel parcel) {
            this(parcel, null);
        }

        @Override // p636z0.p745m.p746a.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f38150g, i);
            parcel.writeInt(this.f490h);
            parcel.writeInt(this.f491i ? 1 : 0);
        }

        public C0090g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f490h = parcel.readInt();
            this.f491i = parcel.readInt() != 0;
        }

        public C0090g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        return new SupportMenuInflater(getContext());
    }

    /* JADX INFO: renamed from: a */
    public final void m222a(List<View> list, int i) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean z = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C0088e c0088e = (C0088e) childAt.getLayoutParams();
                if (c0088e.f489b == 0 && m242u(childAt) && m231j(c0088e.f34411a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            C0088e c0088e2 = (C0088e) childAt2.getLayoutParams();
            if (c0088e2.f489b == 0 && m242u(childAt2) && m231j(c0088e2.f34411a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m223b(View view, boolean z) {
        C0088e c0088eGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c0088eGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            c0088eGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (C0088e) layoutParams;
        }
        c0088eGenerateLayoutParams.f489b = 1;
        if (!z || this.f470n == null) {
            addView(view, c0088eGenerateLayoutParams);
        } else {
            view.setLayoutParams(c0088eGenerateLayoutParams);
            this.f451J.add(view);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m224c() {
        if (this.f469m == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f469m = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f467k);
            this.f469m.setContentDescription(this.f468l);
            C0088e c0088eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0088eGenerateDefaultLayoutParams.f34411a = 8388611 | (this.f475s & 112);
            c0088eGenerateDefaultLayoutParams.f489b = 2;
            this.f469m.setLayoutParams(c0088eGenerateDefaultLayoutParams);
            this.f469m.setOnClickListener(new ViewOnClickListenerC0086c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C0088e);
    }

    /* JADX INFO: renamed from: d */
    public final void m225d() {
        if (this.f481y == null) {
            this.f481y = new RtlSpacingHelper();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m226e() {
        m227f();
        ActionMenuView actionMenuView = this.f462f;
        if (actionMenuView.f338u == null) {
            MenuBuilder menuBuilder = (MenuBuilder) actionMenuView.getMenu();
            if (this.f457P == null) {
                this.f457P = new C0087d();
            }
            this.f462f.setExpandedActionViewsExclusive(true);
            menuBuilder.m14768b(this.f457P, this.f471o);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m227f() {
        if (this.f462f == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f462f = actionMenuView;
            actionMenuView.setPopupTheme(this.f472p);
            this.f462f.setOnMenuItemClickListener(this.f454M);
            ActionMenuView actionMenuView2 = this.f462f;
            MenuPresenter.a aVar = this.f458Q;
            MenuBuilder.a aVar2 = this.f459R;
            actionMenuView2.f343z = aVar;
            actionMenuView2.f332A = aVar2;
            C0088e c0088eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0088eGenerateDefaultLayoutParams.f34411a = 8388613 | (this.f475s & 112);
            this.f462f.setLayoutParams(c0088eGenerateDefaultLayoutParams);
            m223b(this.f462f, false);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m228g() {
        if (this.f465i == null) {
            this.f465i = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C0088e c0088eGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            c0088eGenerateDefaultLayoutParams.f34411a = 8388611 | (this.f475s & 112);
            this.f465i.setLayoutParams(c0088eGenerateDefaultLayoutParams);
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f469m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f469m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        RtlSpacingHelper rtlSpacingHelper = this.f481y;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f35151g ? rtlSpacingHelper.f35145a : rtlSpacingHelper.f35146b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f442A;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        RtlSpacingHelper rtlSpacingHelper = this.f481y;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f35145a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        RtlSpacingHelper rtlSpacingHelper = this.f481y;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f35146b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        RtlSpacingHelper rtlSpacingHelper = this.f481y;
        if (rtlSpacingHelper != null) {
            return rtlSpacingHelper.f35151g ? rtlSpacingHelper.f35146b : rtlSpacingHelper.f35145a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f482z;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuBuilder menuBuilder;
        ActionMenuView actionMenuView = this.f462f;
        return actionMenuView != null && (menuBuilder = actionMenuView.f338u) != null && menuBuilder.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f442A, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f482z, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f466j;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f466j;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m226e();
        return this.f462f.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f465i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f465i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f456O;
    }

    public Drawable getOverflowIcon() {
        m226e();
        return this.f462f.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f471o;
    }

    public int getPopupTheme() {
        return this.f472p;
    }

    public CharSequence getSubtitle() {
        return this.f445D;
    }

    public final TextView getSubtitleTextView() {
        return this.f464h;
    }

    public CharSequence getTitle() {
        return this.f444C;
    }

    public int getTitleMarginBottom() {
        return this.f480x;
    }

    public int getTitleMarginEnd() {
        return this.f478v;
    }

    public int getTitleMarginStart() {
        return this.f477u;
    }

    public int getTitleMarginTop() {
        return this.f479w;
    }

    public final TextView getTitleTextView() {
        return this.f463g;
    }

    public DecorToolbar getWrapper() {
        if (this.f455N == null) {
            this.f455N = new ToolbarWidgetWrapper(this, true);
        }
        return this.f455N;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0088e generateDefaultLayoutParams() {
        return new C0088e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public C0088e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C0088e) {
            return new C0088e((C0088e) layoutParams);
        }
        if (layoutParams instanceof ActionBar.a) {
            return new C0088e((ActionBar.a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0088e((ViewGroup.MarginLayoutParams) layoutParams) : new C0088e(layoutParams);
    }

    /* JADX INFO: renamed from: j */
    public final int m231j(int i) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        int layoutDirection = getLayoutDirection();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, layoutDirection) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    /* JADX INFO: renamed from: k */
    public final int m232k(View view, int i) {
        C0088e c0088e = (C0088e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i3 = c0088e.f34411a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f443B & 112;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c0088e).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = ((ViewGroup.MarginLayoutParams) c0088e).topMargin;
        if (iMax < i4) {
            iMax = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i6 = ((ViewGroup.MarginLayoutParams) c0088e).bottomMargin;
            if (i5 < i6) {
                iMax = Math.max(0, iMax - (i6 - i5));
            }
        }
        return paddingTop + iMax;
    }

    /* JADX INFO: renamed from: l */
    public final int m233l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    /* JADX INFO: renamed from: m */
    public final int m234m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* JADX INFO: renamed from: n */
    public void m235n(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* JADX INFO: renamed from: o */
    public final boolean m236o(View view) {
        return view.getParent() == this || this.f451J.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f461T);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f449H = false;
        }
        if (!this.f449H) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f449H = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f449H = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x028b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0290  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a1 A[LOOP:0: B:104:0x029f->B:105:0x02a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02c3 A[LOOP:1: B:107:0x02c1->B:108:0x02c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:111:0x02e8 A[LOOP:2: B:110:0x02e6->B:111:0x02e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:115:0x0329 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x032b  */
    /* JADX WARN: Code duplicated, block: B:117:0x032f  */
    /* JADX WARN: Code duplicated, block: B:120:0x033a A[LOOP:3: B:119:0x0338->B:120:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0061 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x006a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x0107  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:48:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0138  */
    /* JADX WARN: Code duplicated, block: B:56:0x0148  */
    /* JADX WARN: Code duplicated, block: B:58:0x0150 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x016d  */
    /* JADX WARN: Code duplicated, block: B:69:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:72:0x018d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:77:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:86:0x021c  */
    /* JADX WARN: Code duplicated, block: B:88:0x021f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0227 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0229  */
    /* JADX WARN: Code duplicated, block: B:92:0x022c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0240  */
    /* JADX WARN: Code duplicated, block: B:96:0x0263  */
    /* JADX WARN: Code duplicated, block: B:98:0x0266  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iM238q;
        int iM239r;
        int iMax;
        int iMin;
        boolean zM242u;
        boolean zM242u2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        C0088e c0088e;
        C0088e c0088e2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int iMax2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int iMax3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int size;
        int iM238q2;
        int i18;
        int i19;
        int size2;
        int i20;
        ArrayList<View> arrayList;
        int i21;
        int size3;
        int i22;
        int i23;
        int measuredWidth;
        int i24;
        int i25;
        int size4;
        int iM238q3;
        int i26;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        boolean z3 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i27 = width - paddingRight;
        int[] iArr = this.f452K;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        int iMin2 = minimumHeight >= 0 ? Math.min(minimumHeight, i4 - i2) : 0;
        if (m242u(this.f465i)) {
            if (z3) {
                iM239r = m239r(this.f465i, i27, iArr, iMin2);
                iM238q = paddingLeft;
            } else {
                iM238q = m238q(this.f465i, paddingLeft, iArr, iMin2);
            }
            if (m242u(this.f469m)) {
                if (z3) {
                    iM239r = m239r(this.f469m, iM239r, iArr, iMin2);
                } else {
                    iM238q = m238q(this.f469m, iM238q, iArr, iMin2);
                }
            }
            if (m242u(this.f462f)) {
                if (z3) {
                    iM238q = m238q(this.f462f, iM238q, iArr, iMin2);
                } else {
                    iM239r = m239r(this.f462f, iM239r, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iM238q);
            iArr[1] = Math.max(0, currentContentInsetRight - (i27 - iM239r));
            iMax = Math.max(iM238q, currentContentInsetLeft);
            iMin = Math.min(iM239r, i27 - currentContentInsetRight);
            if (m242u(this.f470n)) {
                if (z3) {
                    iMin = m239r(this.f470n, iMin, iArr, iMin2);
                } else {
                    iMax = m238q(this.f470n, iMax, iArr, iMin2);
                }
            }
            if (m242u(this.f466j)) {
                if (z3) {
                    iMin = m239r(this.f466j, iMin, iArr, iMin2);
                } else {
                    iMax = m238q(this.f466j, iMax, iArr, iMin2);
                }
            }
            zM242u = m242u(this.f463g);
            zM242u2 = m242u(this.f464h);
            if (zM242u) {
                C0088e c0088e3 = (C0088e) this.f463g.getLayoutParams();
                measuredHeight = this.f463g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0088e3).topMargin + ((ViewGroup.MarginLayoutParams) c0088e3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zM242u2) {
                C0088e c0088e4 = (C0088e) this.f464h.getLayoutParams();
                measuredHeight += this.f464h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0088e4).topMargin + ((ViewGroup.MarginLayoutParams) c0088e4).bottomMargin;
            }
            if (!zM242u || zM242u2) {
                if (zM242u) {
                    textView = this.f463g;
                } else {
                    textView = this.f464h;
                }
                if (zM242u2) {
                    textView2 = this.f464h;
                } else {
                    textView2 = this.f463g;
                }
                c0088e = (C0088e) textView.getLayoutParams();
                c0088e2 = (C0088e) textView2.getLayoutParams();
                z2 = (!zM242u && this.f463g.getMeasuredWidth() > 0) || (zM242u2 && this.f464h.getMeasuredWidth() > 0);
                i5 = this.f443B & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0088e).topMargin + this.f479w;
                } else if (i5 != 80) {
                    iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i13 = ((ViewGroup.MarginLayoutParams) c0088e).topMargin;
                    i14 = this.f479w;
                    if (iMax3 < i13 + i14) {
                        iMax3 = i13 + i14;
                    } else {
                        i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                        i16 = ((ViewGroup.MarginLayoutParams) c0088e).bottomMargin;
                        i17 = this.f480x;
                        if (i15 < i16 + i17) {
                            iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) c0088e2).bottomMargin + i17) - i15));
                        }
                    }
                    paddingTop = paddingTop2 + iMax3;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0088e2).bottomMargin) - this.f480x) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i10 = this.f477u;
                    } else {
                        i10 = 0;
                    }
                    int i28 = i10 - iArr[1];
                    iMin -= Math.max(0, i28);
                    iArr[1] = Math.max(0, -i28);
                    if (zM242u) {
                        C0088e c0088e5 = (C0088e) this.f463g.getLayoutParams();
                        int measuredWidth2 = iMin - this.f463g.getMeasuredWidth();
                        int measuredHeight2 = this.f463g.getMeasuredHeight() + paddingTop;
                        this.f463g.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i11 = measuredWidth2 - this.f478v;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c0088e5).bottomMargin;
                    } else {
                        i11 = iMin;
                    }
                    if (zM242u2) {
                        int i29 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0088e) this.f464h.getLayoutParams())).topMargin;
                        this.f464h.layout(iMin - this.f464h.getMeasuredWidth(), i29, iMin, this.f464h.getMeasuredHeight() + i29);
                        i12 = iMin - this.f478v;
                    } else {
                        i12 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i11, i12);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i7 = this.f477u;
                    } else {
                        i7 = 0;
                    }
                    int i30 = i7 - iArr[0];
                    iMax2 = Math.max(0, i30) + iMax;
                    iArr[0] = Math.max(0, -i30);
                    if (zM242u) {
                        C0088e c0088e6 = (C0088e) this.f463g.getLayoutParams();
                        int measuredWidth3 = this.f463g.getMeasuredWidth() + iMax2;
                        int measuredHeight3 = this.f463g.getMeasuredHeight() + paddingTop;
                        this.f463g.layout(iMax2, paddingTop, measuredWidth3, measuredHeight3);
                        i8 = measuredWidth3 + this.f478v;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c0088e6).bottomMargin;
                    } else {
                        i8 = iMax2;
                    }
                    if (zM242u2) {
                        int i31 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0088e) this.f464h.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f464h.getMeasuredWidth() + iMax2;
                        this.f464h.layout(iMax2, i31, measuredWidth4, this.f464h.getMeasuredHeight() + i31);
                        i9 = measuredWidth4 + this.f478v;
                    } else {
                        i9 = iMax2;
                    }
                    if (z2) {
                        iMax = Math.max(i8, i9);
                    } else {
                        iMax = iMax2;
                    }
                }
            } else {
                i6 = paddingLeft;
                iMin2 = iMin2;
            }
            m222a(this.f450I, 3);
            size = this.f450I.size();
            iM238q2 = iMax;
            for (i18 = 0; i18 < size; i18++) {
                iM238q2 = m238q(this.f450I.get(i18), iM238q2, iArr, iMin2);
            }
            i19 = iMin2;
            m222a(this.f450I, 5);
            size2 = this.f450I.size();
            for (i20 = 0; i20 < size2; i20++) {
                iMin = m239r(this.f450I.get(i20), iMin, iArr, i19);
            }
            m222a(this.f450I, 1);
            arrayList = this.f450I;
            int i32 = iArr[0];
            i21 = iArr[1];
            size3 = arrayList.size();
            i22 = i32;
            i23 = 0;
            measuredWidth = 0;
            while (i23 < size3) {
                View view = arrayList.get(i23);
                C0088e c0088e7 = (C0088e) view.getLayoutParams();
                int i33 = ((ViewGroup.MarginLayoutParams) c0088e7).leftMargin - i22;
                int i34 = ((ViewGroup.MarginLayoutParams) c0088e7).rightMargin - i21;
                int iMax4 = Math.max(0, i33);
                int iMax5 = Math.max(0, i34);
                int iMax6 = Math.max(0, -i33);
                int iMax7 = Math.max(0, -i34);
                measuredWidth += view.getMeasuredWidth() + iMax4 + iMax5;
                i23++;
                i21 = iMax7;
                i22 = iMax6;
            }
            i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
            i25 = measuredWidth + i24;
            if (i24 >= iM238q2) {
                if (i25 > iMin) {
                    iM238q2 = i24 - (i25 - iMin);
                } else {
                    iM238q2 = i24;
                }
            }
            size4 = this.f450I.size();
            iM238q3 = iM238q2;
            for (i26 = 0; i26 < size4; i26++) {
                iM238q3 = m238q(this.f450I.get(i26), iM238q3, iArr, i19);
            }
            this.f450I.clear();
        }
        iM238q = paddingLeft;
        iM239r = i27;
        if (m242u(this.f469m)) {
            if (z3) {
                iM239r = m239r(this.f469m, iM239r, iArr, iMin2);
            } else {
                iM238q = m238q(this.f469m, iM238q, iArr, iMin2);
            }
        }
        if (m242u(this.f462f)) {
            if (z3) {
                iM238q = m238q(this.f462f, iM238q, iArr, iMin2);
            } else {
                iM239r = m239r(this.f462f, iM239r, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM238q);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i27 - iM239r));
        iMax = Math.max(iM238q, currentContentInsetLeft2);
        iMin = Math.min(iM239r, i27 - currentContentInsetRight2);
        if (m242u(this.f470n)) {
            if (z3) {
                iMin = m239r(this.f470n, iMin, iArr, iMin2);
            } else {
                iMax = m238q(this.f470n, iMax, iArr, iMin2);
            }
        }
        if (m242u(this.f466j)) {
            if (z3) {
                iMin = m239r(this.f466j, iMin, iArr, iMin2);
            } else {
                iMax = m238q(this.f466j, iMax, iArr, iMin2);
            }
        }
        zM242u = m242u(this.f463g);
        zM242u2 = m242u(this.f464h);
        if (zM242u) {
            C0088e c0088e8 = (C0088e) this.f463g.getLayoutParams();
            measuredHeight = this.f463g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0088e8).topMargin + ((ViewGroup.MarginLayoutParams) c0088e8).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zM242u2) {
            C0088e c0088e9 = (C0088e) this.f464h.getLayoutParams();
            measuredHeight += this.f464h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0088e9).topMargin + ((ViewGroup.MarginLayoutParams) c0088e9).bottomMargin;
        }
        if (zM242u) {
            if (zM242u) {
                textView = this.f463g;
            } else {
                textView = this.f464h;
            }
            if (zM242u2) {
                textView2 = this.f464h;
            } else {
                textView2 = this.f463g;
            }
            c0088e = (C0088e) textView.getLayoutParams();
            c0088e2 = (C0088e) textView2.getLayoutParams();
            if (zM242u) {
            }
            i5 = this.f443B & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0088e).topMargin + this.f479w;
            } else if (i5 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) c0088e).topMargin;
                i14 = this.f479w;
                if (iMax3 < i13 + i14) {
                    iMax3 = i13 + i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c0088e).bottomMargin;
                    i17 = this.f480x;
                    if (i15 < i16 + i17) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) c0088e2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0088e2).bottomMargin) - this.f480x) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f477u;
                } else {
                    i10 = 0;
                }
                int i210 = i10 - iArr[1];
                iMin -= Math.max(0, i210);
                iArr[1] = Math.max(0, -i210);
                if (zM242u) {
                    C0088e c0088e10 = (C0088e) this.f463g.getLayoutParams();
                    int measuredWidth5 = iMin - this.f463g.getMeasuredWidth();
                    int measuredHeight4 = this.f463g.getMeasuredHeight() + paddingTop;
                    this.f463g.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i11 = measuredWidth5 - this.f478v;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) c0088e10).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zM242u2) {
                    int i211 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0088e) this.f464h.getLayoutParams())).topMargin;
                    this.f464h.layout(iMin - this.f464h.getMeasuredWidth(), i211, iMin, this.f464h.getMeasuredHeight() + i211);
                    i12 = iMin - this.f478v;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.f477u;
                } else {
                    i7 = 0;
                }
                int i35 = i7 - iArr[0];
                iMax2 = Math.max(0, i35) + iMax;
                iArr[0] = Math.max(0, -i35);
                if (zM242u) {
                    C0088e c0088e11 = (C0088e) this.f463g.getLayoutParams();
                    int measuredWidth6 = this.f463g.getMeasuredWidth() + iMax2;
                    int measuredHeight5 = this.f463g.getMeasuredHeight() + paddingTop;
                    this.f463g.layout(iMax2, paddingTop, measuredWidth6, measuredHeight5);
                    i8 = measuredWidth6 + this.f478v;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) c0088e11).bottomMargin;
                } else {
                    i8 = iMax2;
                }
                if (zM242u2) {
                    int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0088e) this.f464h.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f464h.getMeasuredWidth() + iMax2;
                    this.f464h.layout(iMax2, i36, measuredWidth7, this.f464h.getMeasuredHeight() + i36);
                    i9 = measuredWidth7 + this.f478v;
                } else {
                    i9 = iMax2;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                } else {
                    iMax = iMax2;
                }
            }
        } else {
            if (zM242u) {
                textView = this.f463g;
            } else {
                textView = this.f464h;
            }
            if (zM242u2) {
                textView2 = this.f464h;
            } else {
                textView2 = this.f463g;
            }
            c0088e = (C0088e) textView.getLayoutParams();
            c0088e2 = (C0088e) textView2.getLayoutParams();
            if (zM242u) {
            }
            i5 = this.f443B & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0088e).topMargin + this.f479w;
            } else if (i5 != 80) {
                iMax3 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i13 = ((ViewGroup.MarginLayoutParams) c0088e).topMargin;
                i14 = this.f479w;
                if (iMax3 < i13 + i14) {
                    iMax3 = i13 + i14;
                } else {
                    i15 = (((height - paddingBottom) - measuredHeight) - iMax3) - paddingTop2;
                    i16 = ((ViewGroup.MarginLayoutParams) c0088e).bottomMargin;
                    i17 = this.f480x;
                    if (i15 < i16 + i17) {
                        iMax3 = Math.max(0, iMax3 - ((((ViewGroup.MarginLayoutParams) c0088e2).bottomMargin + i17) - i15));
                    }
                }
                paddingTop = paddingTop2 + iMax3;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c0088e2).bottomMargin) - this.f480x) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i10 = this.f477u;
                } else {
                    i10 = 0;
                }
                int i212 = i10 - iArr[1];
                iMin -= Math.max(0, i212);
                iArr[1] = Math.max(0, -i212);
                if (zM242u) {
                    C0088e c0088e12 = (C0088e) this.f463g.getLayoutParams();
                    int measuredWidth8 = iMin - this.f463g.getMeasuredWidth();
                    int measuredHeight6 = this.f463g.getMeasuredHeight() + paddingTop;
                    this.f463g.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i11 = measuredWidth8 - this.f478v;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) c0088e12).bottomMargin;
                } else {
                    i11 = iMin;
                }
                if (zM242u2) {
                    int i213 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0088e) this.f464h.getLayoutParams())).topMargin;
                    this.f464h.layout(iMin - this.f464h.getMeasuredWidth(), i213, iMin, this.f464h.getMeasuredHeight() + i213);
                    i12 = iMin - this.f478v;
                } else {
                    i12 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i11, i12);
                }
                iMax = iMax;
            } else {
                if (z2) {
                    i7 = this.f477u;
                } else {
                    i7 = 0;
                }
                int i37 = i7 - iArr[0];
                iMax2 = Math.max(0, i37) + iMax;
                iArr[0] = Math.max(0, -i37);
                if (zM242u) {
                    C0088e c0088e13 = (C0088e) this.f463g.getLayoutParams();
                    int measuredWidth9 = this.f463g.getMeasuredWidth() + iMax2;
                    int measuredHeight7 = this.f463g.getMeasuredHeight() + paddingTop;
                    this.f463g.layout(iMax2, paddingTop, measuredWidth9, measuredHeight7);
                    i8 = measuredWidth9 + this.f478v;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) c0088e13).bottomMargin;
                } else {
                    i8 = iMax2;
                }
                if (zM242u2) {
                    int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C0088e) this.f464h.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f464h.getMeasuredWidth() + iMax2;
                    this.f464h.layout(iMax2, i38, measuredWidth10, this.f464h.getMeasuredHeight() + i38);
                    i9 = measuredWidth10 + this.f478v;
                } else {
                    i9 = iMax2;
                }
                if (z2) {
                    iMax = Math.max(i8, i9);
                } else {
                    iMax = iMax2;
                }
            }
        }
        m222a(this.f450I, 3);
        size = this.f450I.size();
        iM238q2 = iMax;
        while (i18 < size) {
            iM238q2 = m238q(this.f450I.get(i18), iM238q2, iArr, iMin2);
        }
        i19 = iMin2;
        m222a(this.f450I, 5);
        size2 = this.f450I.size();
        while (i20 < size2) {
            iMin = m239r(this.f450I.get(i20), iMin, iArr, i19);
        }
        m222a(this.f450I, 1);
        arrayList = this.f450I;
        int i39 = iArr[0];
        i21 = iArr[1];
        size3 = arrayList.size();
        i22 = i39;
        i23 = 0;
        measuredWidth = 0;
        while (i23 < size3) {
            View view2 = arrayList.get(i23);
            C0088e c0088e14 = (C0088e) view2.getLayoutParams();
            int i310 = ((ViewGroup.MarginLayoutParams) c0088e14).leftMargin - i22;
            int i311 = ((ViewGroup.MarginLayoutParams) c0088e14).rightMargin - i21;
            int iMax8 = Math.max(0, i310);
            int iMax9 = Math.max(0, i311);
            int iMax10 = Math.max(0, -i310);
            int iMax11 = Math.max(0, -i311);
            measuredWidth += view2.getMeasuredWidth() + iMax8 + iMax9;
            i23++;
            i21 = iMax11;
            i22 = iMax10;
        }
        i24 = ((((width - i6) - paddingRight) / 2) + i6) - (measuredWidth / 2);
        i25 = measuredWidth + i24;
        if (i24 >= iM238q2) {
            if (i25 > iMin) {
                iM238q2 = i24 - (i25 - iMin);
            } else {
                iM238q2 = i24;
            }
        }
        size4 = this.f450I.size();
        iM238q3 = iM238q2;
        while (i26 < size4) {
            iM238q3 = m238q(this.f450I.get(i26), iM238q3, iArr, i19);
        }
        this.f450I.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int iM233l;
        int iMax;
        int iCombineMeasuredStates;
        int iM233l2;
        int iCombineMeasuredStates2;
        int iMax2;
        int iM234m;
        int[] iArr = this.f452K;
        boolean z = true;
        if (ViewUtils5.m14875b(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        if (m242u(this.f465i)) {
            m241t(this.f465i, i, 0, i2, 0, this.f476t);
            iM233l = m233l(this.f465i) + this.f465i.getMeasuredWidth();
            iMax = Math.max(0, m234m(this.f465i) + this.f465i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f465i.getMeasuredState());
        } else {
            iM233l = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m242u(this.f469m)) {
            m241t(this.f469m, i, 0, i2, 0, this.f476t);
            iM233l = m233l(this.f469m) + this.f469m.getMeasuredWidth();
            iMax = Math.max(iMax, m234m(this.f469m) + this.f469m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f469m.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM233l) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - iM233l);
        if (m242u(this.f462f)) {
            m241t(this.f462f, i, iMax3, i2, 0, this.f476t);
            iM233l2 = m233l(this.f462f) + this.f462f.getMeasuredWidth();
            iMax = Math.max(iMax, m234m(this.f462f) + this.f462f.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f462f.getMeasuredState());
        } else {
            iM233l2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = Math.max(currentContentInsetEnd, iM233l2) + iMax3;
        iArr[c3] = Math.max(0, currentContentInsetEnd - iM233l2);
        if (m242u(this.f470n)) {
            iMax4 += m240s(this.f470n, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m234m(this.f470n) + this.f470n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f470n.getMeasuredState());
        }
        if (m242u(this.f466j)) {
            iMax4 += m240s(this.f466j, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, m234m(this.f466j) + this.f466j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f466j.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((C0088e) childAt.getLayoutParams()).f489b == 0 && m242u(childAt)) {
                iMax4 += m240s(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, m234m(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i4 = this.f479w + this.f480x;
        int i5 = this.f477u + this.f478v;
        if (m242u(this.f463g)) {
            m240s(this.f463g, i, iMax4 + i5, i2, i4, iArr);
            int iM233l3 = m233l(this.f463g) + this.f463g.getMeasuredWidth();
            iM234m = m234m(this.f463g) + this.f463g.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f463g.getMeasuredState());
            iMax2 = iM233l3;
        } else {
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
            iM234m = 0;
        }
        if (m242u(this.f464h)) {
            iMax2 = Math.max(iMax2, m240s(this.f464h, i, iMax4 + i5, i2, iM234m + i4, iArr));
            iM234m = m234m(this.f464h) + this.f464h.getMeasuredHeight() + iM234m;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f464h.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, iM234m);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax5;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax4 + iMax2, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16);
        if (!this.f460S) {
            z = false;
            break;
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            View childAt2 = getChildAt(i6);
            if (m242u(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                z = false;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, z ? 0 : iResolveSizeAndState2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C0090g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0090g c0090g = (C0090g) parcelable;
        super.onRestoreInstanceState(c0090g.f38150g);
        ActionMenuView actionMenuView = this.f462f;
        MenuBuilder menuBuilder = actionMenuView != null ? actionMenuView.f338u : null;
        int i = c0090g.f490h;
        if (i != 0 && this.f457P != null && menuBuilder != null && (menuItemFindItem = menuBuilder.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c0090g.f491i) {
            removeCallbacks(this.f461T);
            post(this.f461T);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m225d();
        RtlSpacingHelper rtlSpacingHelper = this.f481y;
        boolean z = i == 1;
        if (z == rtlSpacingHelper.f35151g) {
            return;
        }
        rtlSpacingHelper.f35151g = z;
        if (!rtlSpacingHelper.f35152h) {
            rtlSpacingHelper.f35145a = rtlSpacingHelper.f35149e;
            rtlSpacingHelper.f35146b = rtlSpacingHelper.f35150f;
            return;
        }
        if (z) {
            int i2 = rtlSpacingHelper.f35148d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = rtlSpacingHelper.f35149e;
            }
            rtlSpacingHelper.f35145a = i2;
            int i3 = rtlSpacingHelper.f35147c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = rtlSpacingHelper.f35150f;
            }
            rtlSpacingHelper.f35146b = i3;
            return;
        }
        int i4 = rtlSpacingHelper.f35147c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = rtlSpacingHelper.f35149e;
        }
        rtlSpacingHelper.f35145a = i4;
        int i5 = rtlSpacingHelper.f35148d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = rtlSpacingHelper.f35150f;
        }
        rtlSpacingHelper.f35146b = i5;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        C0090g c0090g = new C0090g(super.onSaveInstanceState());
        C0087d c0087d = this.f457P;
        if (c0087d != null && (menuItemImpl = c0087d.f487g) != null) {
            c0090g.f490h = menuItemImpl.f34850a;
        }
        c0090g.f491i = m237p();
        return c0090g;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f448G = false;
        }
        if (!this.f448G) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f448G = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f448G = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public boolean m237p() {
        ActionMenuView actionMenuView = this.f462f;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f342y;
            if (actionMenuPresenter != null && actionMenuPresenter.m14847i()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final int m238q(View view, int i, int[] iArr, int i2) {
        C0088e c0088e = (C0088e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0088e).leftMargin - iArr[0];
        int iMax = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int iM232k = m232k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM232k, iMax + measuredWidth, view.getMeasuredHeight() + iM232k);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c0088e).rightMargin + iMax;
    }

    /* JADX INFO: renamed from: r */
    public final int m239r(View view, int i, int[] iArr, int i2) {
        C0088e c0088e = (C0088e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) c0088e).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iM232k = m232k(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM232k, iMax, view.getMeasuredHeight() + iM232k);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c0088e).leftMargin);
    }

    /* JADX INFO: renamed from: s */
    public final int m240s(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AppCompatResources.m14707b(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f460S = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f442A) {
            this.f442A = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f482z) {
            this.f482z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AppCompatResources.m14707b(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AppCompatResources.m14707b(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m228g();
        this.f465i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC0089f interfaceC0089f) {
        this.f453L = interfaceC0089f;
    }

    public void setOverflowIcon(Drawable drawable) {
        m226e();
        this.f462f.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f472p != i) {
            this.f472p = i;
            if (i == 0) {
                this.f471o = getContext();
            } else {
                this.f471o = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f480x = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f478v = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f477u = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f479w = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* JADX INFO: renamed from: t */
    public final void m241t(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m242u(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m243v() {
        ActionMenuView actionMenuView = this.f462f;
        if (actionMenuView != null) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f342y;
            if (actionMenuPresenter != null && actionMenuPresenter.m14848j()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.Toolbar$e */
    public static class C0088e extends ActionBar.a {

        /* JADX INFO: renamed from: b */
        public int f489b;

        public C0088e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f489b = 0;
        }

        public C0088e(int i, int i2) {
            super(i, i2);
            this.f489b = 0;
            this.f34411a = 8388627;
        }

        public C0088e(int i, int i2, int i3) {
            super(i, i2);
            this.f489b = 0;
            this.f34411a = i3;
        }

        public C0088e(int i) {
            this(-2, -1, i);
        }

        public C0088e(C0088e c0088e) {
            super((ActionBar.a) c0088e);
            this.f489b = 0;
            this.f489b = c0088e.f489b;
        }

        public C0088e(ActionBar.a aVar) {
            super(aVar);
            this.f489b = 0;
        }

        public C0088e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f489b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public C0088e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f489b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0088e(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m224c();
        }
        ImageButton imageButton = this.f469m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m224c();
            this.f469m.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f469m;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f467k);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f466j == null) {
                this.f466j = new AppCompatImageView(getContext());
            }
            if (!m236o(this.f466j)) {
                m223b(this.f466j, true);
            }
        } else {
            ImageView imageView = this.f466j;
            if (imageView != null && m236o(imageView)) {
                removeView(this.f466j);
                this.f451J.remove(this.f466j);
            }
        }
        ImageView imageView2 = this.f466j;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f466j == null) {
            this.f466j = new AppCompatImageView(getContext());
        }
        ImageView imageView = this.f466j;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m228g();
        }
        ImageButton imageButton = this.f465i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m228g();
            if (!m236o(this.f465i)) {
                m223b(this.f465i, true);
            }
        } else {
            ImageButton imageButton = this.f465i;
            if (imageButton != null && m236o(imageButton)) {
                removeView(this.f465i);
                this.f451J.remove(this.f465i);
            }
        }
        ImageButton imageButton2 = this.f465i;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f464h;
            if (textView != null && m236o(textView)) {
                removeView(this.f464h);
                this.f451J.remove(this.f464h);
            }
        } else {
            if (this.f464h == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f464h = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f464h.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f474r;
                if (i != 0) {
                    this.f464h.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f447F;
                if (colorStateList != null) {
                    this.f464h.setTextColor(colorStateList);
                }
            }
            if (!m236o(this.f464h)) {
                m223b(this.f464h, true);
            }
        }
        TextView textView2 = this.f464h;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f445D = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f447F = colorStateList;
        TextView textView = this.f464h;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f463g;
            if (textView != null && m236o(textView)) {
                removeView(this.f463g);
                this.f451J.remove(this.f463g);
            }
        } else {
            if (this.f463g == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f463g = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f463g.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f473q;
                if (i != 0) {
                    this.f463g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f446E;
                if (colorStateList != null) {
                    this.f463g.setTextColor(colorStateList);
                }
            }
            if (!m236o(this.f463g)) {
                m223b(this.f463g, true);
            }
        }
        TextView textView2 = this.f463g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f444C = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f446E = colorStateList;
        TextView textView = this.f463g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f443B = 8388627;
        this.f450I = new ArrayList<>();
        this.f451J = new ArrayList<>();
        this.f452K = new int[2];
        this.f454M = new C0084a();
        this.f461T = new RunnableC0085b();
        Context context2 = getContext();
        int[] iArr = C7463b.f34407w;
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(context2, attributeSet, iArr, i, 0);
        ViewCompat.m16326t(this, context, iArr, attributeSet, tintTypedArrayM14998r.f35267b, i, 0);
        this.f473q = tintTypedArrayM14998r.m15011m(28, 0);
        this.f474r = tintTypedArrayM14998r.m15011m(19, 0);
        this.f443B = tintTypedArrayM14998r.m15009k(0, this.f443B);
        this.f475s = tintTypedArrayM14998r.m15009k(2, 48);
        int iM15003e = tintTypedArrayM14998r.m15003e(22, 0);
        iM15003e = tintTypedArrayM14998r.m15014p(27) ? tintTypedArrayM14998r.m15003e(27, iM15003e) : iM15003e;
        this.f480x = iM15003e;
        this.f479w = iM15003e;
        this.f478v = iM15003e;
        this.f477u = iM15003e;
        int iM15003e2 = tintTypedArrayM14998r.m15003e(25, -1);
        if (iM15003e2 >= 0) {
            this.f477u = iM15003e2;
        }
        int iM15003e3 = tintTypedArrayM14998r.m15003e(24, -1);
        if (iM15003e3 >= 0) {
            this.f478v = iM15003e3;
        }
        int iM15003e4 = tintTypedArrayM14998r.m15003e(26, -1);
        if (iM15003e4 >= 0) {
            this.f479w = iM15003e4;
        }
        int iM15003e5 = tintTypedArrayM14998r.m15003e(23, -1);
        if (iM15003e5 >= 0) {
            this.f480x = iM15003e5;
        }
        this.f476t = tintTypedArrayM14998r.m15004f(13, -1);
        int iM15003e6 = tintTypedArrayM14998r.m15003e(9, Integer.MIN_VALUE);
        int iM15003e7 = tintTypedArrayM14998r.m15003e(5, Integer.MIN_VALUE);
        int iM15004f = tintTypedArrayM14998r.m15004f(7, 0);
        int iM15004f2 = tintTypedArrayM14998r.m15004f(8, 0);
        m225d();
        RtlSpacingHelper rtlSpacingHelper = this.f481y;
        rtlSpacingHelper.f35152h = false;
        if (iM15004f != Integer.MIN_VALUE) {
            rtlSpacingHelper.f35149e = iM15004f;
            rtlSpacingHelper.f35145a = iM15004f;
        }
        if (iM15004f2 != Integer.MIN_VALUE) {
            rtlSpacingHelper.f35150f = iM15004f2;
            rtlSpacingHelper.f35146b = iM15004f2;
        }
        if (iM15003e6 != Integer.MIN_VALUE || iM15003e7 != Integer.MIN_VALUE) {
            rtlSpacingHelper.m14948a(iM15003e6, iM15003e7);
        }
        this.f482z = tintTypedArrayM14998r.m15003e(10, Integer.MIN_VALUE);
        this.f442A = tintTypedArrayM14998r.m15003e(6, Integer.MIN_VALUE);
        this.f467k = tintTypedArrayM14998r.m15005g(4);
        this.f468l = tintTypedArrayM14998r.m15013o(3);
        CharSequence charSequenceM15013o = tintTypedArrayM14998r.m15013o(21);
        if (!TextUtils.isEmpty(charSequenceM15013o)) {
            setTitle(charSequenceM15013o);
        }
        CharSequence charSequenceM15013o2 = tintTypedArrayM14998r.m15013o(18);
        if (!TextUtils.isEmpty(charSequenceM15013o2)) {
            setSubtitle(charSequenceM15013o2);
        }
        this.f471o = getContext();
        setPopupTheme(tintTypedArrayM14998r.m15011m(17, 0));
        Drawable drawableM15005g = tintTypedArrayM14998r.m15005g(16);
        if (drawableM15005g != null) {
            setNavigationIcon(drawableM15005g);
        }
        CharSequence charSequenceM15013o3 = tintTypedArrayM14998r.m15013o(15);
        if (!TextUtils.isEmpty(charSequenceM15013o3)) {
            setNavigationContentDescription(charSequenceM15013o3);
        }
        Drawable drawableM15005g2 = tintTypedArrayM14998r.m15005g(11);
        if (drawableM15005g2 != null) {
            setLogo(drawableM15005g2);
        }
        CharSequence charSequenceM15013o4 = tintTypedArrayM14998r.m15013o(12);
        if (!TextUtils.isEmpty(charSequenceM15013o4)) {
            setLogoDescription(charSequenceM15013o4);
        }
        if (tintTypedArrayM14998r.m15014p(29)) {
            setTitleTextColor(tintTypedArrayM14998r.m15001c(29));
        }
        if (tintTypedArrayM14998r.m15014p(20)) {
            setSubtitleTextColor(tintTypedArrayM14998r.m15001c(20));
        }
        if (tintTypedArrayM14998r.m15014p(14)) {
            getMenuInflater().inflate(tintTypedArrayM14998r.m15011m(14, 0), getMenu());
        }
        tintTypedArrayM14998r.f35267b.recycle();
    }
}
