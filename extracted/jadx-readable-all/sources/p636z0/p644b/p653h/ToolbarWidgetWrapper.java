package p636z0.p644b.p653h;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.C0087d;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p651g.p652i.ActionMenuItem;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter;

/* JADX INFO: renamed from: z0.b.h.z0, reason: use source file name */
/* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class ToolbarWidgetWrapper implements DecorToolbar {

    /* JADX INFO: renamed from: a */
    public Toolbar f35274a;

    /* JADX INFO: renamed from: b */
    public int f35275b;

    /* JADX INFO: renamed from: c */
    public View f35276c;

    /* JADX INFO: renamed from: d */
    public View f35277d;

    /* JADX INFO: renamed from: e */
    public Drawable f35278e;

    /* JADX INFO: renamed from: f */
    public Drawable f35279f;

    /* JADX INFO: renamed from: g */
    public Drawable f35280g;

    /* JADX INFO: renamed from: h */
    public boolean f35281h;

    /* JADX INFO: renamed from: i */
    public CharSequence f35282i;

    /* JADX INFO: renamed from: j */
    public CharSequence f35283j;

    /* JADX INFO: renamed from: k */
    public CharSequence f35284k;

    /* JADX INFO: renamed from: l */
    public Window.Callback f35285l;

    /* JADX INFO: renamed from: m */
    public boolean f35286m;

    /* JADX INFO: renamed from: n */
    public ActionMenuPresenter f35287n;

    /* JADX INFO: renamed from: o */
    public int f35288o;

    /* JADX INFO: renamed from: p */
    public Drawable f35289p;

    /* JADX INFO: renamed from: z0.b.h.z0$a */
    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: f */
        public final ActionMenuItem f35290f;

        public a() {
            this.f35290f = new ActionMenuItem(ToolbarWidgetWrapper.this.f35274a.getContext(), 0, R.id.home, 0, 0, ToolbarWidgetWrapper.this.f35282i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
            Window.Callback callback = toolbarWidgetWrapper.f35285l;
            if (callback == null || !toolbarWidgetWrapper.f35286m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f35290f);
        }
    }

    /* JADX INFO: renamed from: z0.b.h.z0$b */
    /* JADX INFO: compiled from: ToolbarWidgetWrapper.java */
    public class b extends ViewPropertyAnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public boolean f35292a = false;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f35293b;

        public b(int i) {
            this.f35293b = i;
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: a */
        public void mo14826a(View view) {
            this.f35292a = true;
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: b */
        public void mo14669b(View view) {
            if (this.f35292a) {
                return;
            }
            ToolbarWidgetWrapper.this.f35274a.setVisibility(this.f35293b);
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: c */
        public void mo14677c(View view) {
            ToolbarWidgetWrapper.this.f35274a.setVisibility(0);
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z) {
        this(toolbar, z, mtp.media.karaoke.R.string.abc_action_bar_up_description, mtp.media.karaoke.R.drawable.abc_ic_ab_back_material);
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: a */
    public void mo14851a(Menu menu, MenuPresenter.a aVar) {
        MenuItemImpl menuItemImpl;
        if (this.f35287n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f35274a.getContext());
            this.f35287n = actionMenuPresenter;
            actionMenuPresenter.f34762n = mtp.media.karaoke.R.id.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f35287n;
        actionMenuPresenter2.f34758j = aVar;
        Toolbar toolbar = this.f35274a;
        MenuBuilder menuBuilder = (MenuBuilder) menu;
        if (menuBuilder == null && toolbar.f462f == null) {
            return;
        }
        toolbar.m227f();
        MenuBuilder menuBuilder2 = toolbar.f462f.f338u;
        if (menuBuilder2 == menuBuilder) {
            return;
        }
        if (menuBuilder2 != null) {
            menuBuilder2.m14787u(toolbar.f456O);
            menuBuilder2.m14787u(toolbar.f457P);
        }
        if (toolbar.f457P == null) {
            toolbar.f457P = toolbar.new C0087d();
        }
        actionMenuPresenter2.f34988w = true;
        if (menuBuilder != null) {
            menuBuilder.m14768b(actionMenuPresenter2, toolbar.f471o);
            menuBuilder.m14768b(toolbar.f457P, toolbar.f471o);
        } else {
            actionMenuPresenter2.mo245C(toolbar.f471o, null);
            Toolbar.C0087d c0087d = toolbar.f457P;
            MenuBuilder menuBuilder3 = c0087d.f486f;
            if (menuBuilder3 != null && (menuItemImpl = c0087d.f487g) != null) {
                menuBuilder3.mo14770d(menuItemImpl);
            }
            c0087d.f486f = null;
            actionMenuPresenter2.mo251x(true);
            toolbar.f457P.mo251x(true);
        }
        toolbar.f462f.setPopupTheme(toolbar.f472p);
        toolbar.f462f.setPresenter(actionMenuPresenter2);
        toolbar.f456O = actionMenuPresenter2;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: b */
    public boolean mo14852b() {
        return this.f35274a.m237p();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: c */
    public void mo14853c() {
        this.f35286m = true;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public void collapseActionView() {
        Toolbar.C0087d c0087d = this.f35274a.f457P;
        MenuItemImpl menuItemImpl = c0087d == null ? null : c0087d.f487g;
        if (menuItemImpl != null) {
            menuItemImpl.collapseActionView();
        }
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: d */
    public boolean mo14854d() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f35274a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f462f) != null && actionMenuView.f341x;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: e */
    public boolean mo14855e() {
        boolean z;
        ActionMenuView actionMenuView = this.f35274a.f462f;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f342y;
        if (actionMenuPresenter == null) {
            z = false;
        } else {
            if (actionMenuPresenter.f34976B != null || actionMenuPresenter.m14847i()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: f */
    public boolean mo14856f() {
        ActionMenuView actionMenuView = this.f35274a.f462f;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f342y;
        return actionMenuPresenter != null && actionMenuPresenter.m14845g();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: g */
    public boolean mo14857g() {
        return this.f35274a.m243v();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public Context getContext() {
        return this.f35274a.getContext();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public CharSequence getTitle() {
        return this.f35274a.getTitle();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: h */
    public void mo14858h() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f35274a.f462f;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f342y) == null) {
            return;
        }
        actionMenuPresenter.m14844f();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: i */
    public void mo14859i(ScrollingTabContainerView2 scrollingTabContainerView2) {
        View view = this.f35276c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f35274a;
            if (parent == toolbar) {
                toolbar.removeView(this.f35276c);
            }
        }
        this.f35276c = null;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: j */
    public boolean mo14860j() {
        Toolbar.C0087d c0087d = this.f35274a.f457P;
        return (c0087d == null || c0087d.f487g == null) ? false : true;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: k */
    public void mo14861k(int i) {
        View view;
        int i2 = this.f35275b ^ i;
        this.f35275b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m15015x();
                }
                m15016y();
            }
            if ((i2 & 3) != 0) {
                m15017z();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f35274a.setTitle(this.f35282i);
                    this.f35274a.setSubtitle(this.f35283j);
                } else {
                    this.f35274a.setTitle((CharSequence) null);
                    this.f35274a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f35277d) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f35274a.addView(view);
            } else {
                this.f35274a.removeView(view);
            }
        }
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: l */
    public Menu mo14862l() {
        return this.f35274a.getMenu();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: m */
    public void mo14863m(int i) {
        this.f35279f = i != 0 ? AppCompatResources.m14707b(getContext(), i) : null;
        m15017z();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: n */
    public int mo14864n() {
        return 0;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: o */
    public ViewPropertyAnimatorCompat mo14865o(int i, long j2) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b = ViewCompat.m16308b(this.f35274a);
        viewPropertyAnimatorCompatM16308b.m16345a(i == 0 ? 1.0f : 0.0f);
        viewPropertyAnimatorCompatM16308b.m16347c(j2);
        b bVar = new b(i);
        View view = viewPropertyAnimatorCompatM16308b.f38092a.get();
        if (view != null) {
            viewPropertyAnimatorCompatM16308b.m16349e(view, bVar);
        }
        return viewPropertyAnimatorCompatM16308b;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: p */
    public void mo14866p(MenuPresenter.a aVar, MenuBuilder.a aVar2) {
        Toolbar toolbar = this.f35274a;
        toolbar.f458Q = aVar;
        toolbar.f459R = aVar2;
        ActionMenuView actionMenuView = toolbar.f462f;
        if (actionMenuView != null) {
            actionMenuView.f343z = aVar;
            actionMenuView.f332A = aVar2;
        }
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: q */
    public void mo14867q(int i) {
        this.f35274a.setVisibility(i);
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: r */
    public ViewGroup mo14868r() {
        return this.f35274a;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: s */
    public void mo14869s(boolean z) {
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public void setIcon(int i) {
        this.f35278e = i != 0 ? AppCompatResources.m14707b(getContext(), i) : null;
        m15017z();
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public void setTitle(CharSequence charSequence) {
        this.f35281h = true;
        this.f35282i = charSequence;
        if ((this.f35275b & 8) != 0) {
            this.f35274a.setTitle(charSequence);
        }
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public void setWindowCallback(Window.Callback callback) {
        this.f35285l = callback;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f35281h) {
            return;
        }
        this.f35282i = charSequence;
        if ((this.f35275b & 8) != 0) {
            this.f35274a.setTitle(charSequence);
        }
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: t */
    public int mo14870t() {
        return this.f35275b;
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: u */
    public void mo14871u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: v */
    public void mo14872v() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    /* JADX INFO: renamed from: w */
    public void mo14873w(boolean z) {
        this.f35274a.setCollapsible(z);
    }

    /* JADX INFO: renamed from: x */
    public final void m15015x() {
        if ((this.f35275b & 4) != 0) {
            if (TextUtils.isEmpty(this.f35284k)) {
                this.f35274a.setNavigationContentDescription(this.f35288o);
            } else {
                this.f35274a.setNavigationContentDescription(this.f35284k);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m15016y() {
        if ((this.f35275b & 4) == 0) {
            this.f35274a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f35274a;
        Drawable drawable = this.f35280g;
        if (drawable == null) {
            drawable = this.f35289p;
        }
        toolbar.setNavigationIcon(drawable);
    }

    /* JADX INFO: renamed from: z */
    public final void m15017z() {
        Drawable drawable;
        int i = this.f35275b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f35279f) == null) {
            drawable = this.f35278e;
        }
        this.f35274a.setLogo(drawable);
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f35288o = 0;
        this.f35274a = toolbar;
        this.f35282i = toolbar.getTitle();
        this.f35283j = toolbar.getSubtitle();
        this.f35281h = this.f35282i != null;
        this.f35280g = toolbar.getNavigationIcon();
        TintTypedArray tintTypedArrayM14998r = TintTypedArray.m14998r(toolbar.getContext(), null, C7463b.f34385a, mtp.media.karaoke.R.attr.actionBarStyle, 0);
        int i3 = 15;
        this.f35289p = tintTypedArrayM14998r.m15005g(15);
        if (z) {
            CharSequence charSequenceM15013o = tintTypedArrayM14998r.m15013o(27);
            if (!TextUtils.isEmpty(charSequenceM15013o)) {
                setTitle(charSequenceM15013o);
            }
            CharSequence charSequenceM15013o2 = tintTypedArrayM14998r.m15013o(25);
            if (!TextUtils.isEmpty(charSequenceM15013o2)) {
                this.f35283j = charSequenceM15013o2;
                if ((this.f35275b & 8) != 0) {
                    this.f35274a.setSubtitle(charSequenceM15013o2);
                }
            }
            Drawable drawableM15005g = tintTypedArrayM14998r.m15005g(20);
            if (drawableM15005g != null) {
                this.f35279f = drawableM15005g;
                m15017z();
            }
            Drawable drawableM15005g2 = tintTypedArrayM14998r.m15005g(17);
            if (drawableM15005g2 != null) {
                this.f35278e = drawableM15005g2;
                m15017z();
            }
            if (this.f35280g == null && (drawable = this.f35289p) != null) {
                this.f35280g = drawable;
                m15016y();
            }
            mo14861k(tintTypedArrayM14998r.m15008j(10, 0));
            int iM15011m = tintTypedArrayM14998r.m15011m(9, 0);
            if (iM15011m != 0) {
                View viewInflate = LayoutInflater.from(this.f35274a.getContext()).inflate(iM15011m, (ViewGroup) this.f35274a, false);
                View view = this.f35277d;
                if (view != null && (this.f35275b & 16) != 0) {
                    this.f35274a.removeView(view);
                }
                this.f35277d = viewInflate;
                if (viewInflate != null && (this.f35275b & 16) != 0) {
                    this.f35274a.addView(viewInflate);
                }
                mo14861k(this.f35275b | 16);
            }
            int iM15010l = tintTypedArrayM14998r.m15010l(13, 0);
            if (iM15010l > 0) {
                ViewGroup.LayoutParams layoutParams = this.f35274a.getLayoutParams();
                layoutParams.height = iM15010l;
                this.f35274a.setLayoutParams(layoutParams);
            }
            int iM15003e = tintTypedArrayM14998r.m15003e(7, -1);
            int iM15003e2 = tintTypedArrayM14998r.m15003e(3, -1);
            if (iM15003e >= 0 || iM15003e2 >= 0) {
                Toolbar toolbar2 = this.f35274a;
                int iMax = Math.max(iM15003e, 0);
                int iMax2 = Math.max(iM15003e2, 0);
                toolbar2.m225d();
                toolbar2.f481y.m14948a(iMax, iMax2);
            }
            int iM15011m2 = tintTypedArrayM14998r.m15011m(28, 0);
            if (iM15011m2 != 0) {
                Toolbar toolbar3 = this.f35274a;
                Context context = toolbar3.getContext();
                toolbar3.f473q = iM15011m2;
                TextView textView = toolbar3.f463g;
                if (textView != null) {
                    textView.setTextAppearance(context, iM15011m2);
                }
            }
            int iM15011m3 = tintTypedArrayM14998r.m15011m(26, 0);
            if (iM15011m3 != 0) {
                Toolbar toolbar4 = this.f35274a;
                Context context2 = toolbar4.getContext();
                toolbar4.f474r = iM15011m3;
                TextView textView2 = toolbar4.f464h;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, iM15011m3);
                }
            }
            int iM15011m4 = tintTypedArrayM14998r.m15011m(22, 0);
            if (iM15011m4 != 0) {
                this.f35274a.setPopupTheme(iM15011m4);
            }
        } else {
            if (this.f35274a.getNavigationIcon() != null) {
                this.f35289p = this.f35274a.getNavigationIcon();
            } else {
                i3 = 11;
            }
            this.f35275b = i3;
        }
        tintTypedArrayM14998r.f35267b.recycle();
        if (i != this.f35288o) {
            this.f35288o = i;
            if (TextUtils.isEmpty(this.f35274a.getNavigationContentDescription())) {
                int i4 = this.f35288o;
                this.f35284k = i4 != 0 ? getContext().getString(i4) : null;
                m15015x();
            }
        }
        this.f35284k = this.f35274a.getNavigationContentDescription();
        this.f35274a.setNavigationOnClickListener(new a());
    }

    @Override // p636z0.p644b.p653h.DecorToolbar
    public void setIcon(Drawable drawable) {
        this.f35278e = drawable;
        m15017z();
    }
}
