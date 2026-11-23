package p636z0.p644b.p645c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.ActionMode;
import p636z0.p644b.p651g.SupportMenuInflater;
import p636z0.p644b.p651g.ViewPropertyAnimatorCompatSet;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p653h.ActionMenuPresenter;
import p636z0.p644b.p653h.DecorToolbar;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorListener;
import p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter;
import p636z0.p725k.p739l.ViewPropertyAnimatorUpdateListener;

/* JADX INFO: renamed from: z0.b.c.v, reason: use source file name */
/* JADX INFO: compiled from: WindowDecorActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public class WindowDecorActionBar extends ActionBar implements ActionBarOverlayLayout.InterfaceC0059d {

    /* JADX INFO: renamed from: a */
    public static final Interpolator f34554a = new AccelerateInterpolator();

    /* JADX INFO: renamed from: b */
    public static final Interpolator f34555b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A */
    public final ViewPropertyAnimatorUpdateListener f34556A;

    /* JADX INFO: renamed from: c */
    public Context f34557c;

    /* JADX INFO: renamed from: d */
    public Context f34558d;

    /* JADX INFO: renamed from: e */
    public ActionBarOverlayLayout f34559e;

    /* JADX INFO: renamed from: f */
    public ActionBarContainer f34560f;

    /* JADX INFO: renamed from: g */
    public DecorToolbar f34561g;

    /* JADX INFO: renamed from: h */
    public ActionBarContextView f34562h;

    /* JADX INFO: renamed from: i */
    public View f34563i;

    /* JADX INFO: renamed from: j */
    public boolean f34564j;

    /* JADX INFO: renamed from: k */
    public d f34565k;

    /* JADX INFO: renamed from: l */
    public ActionMode f34566l;

    /* JADX INFO: renamed from: m */
    public ActionMode.a f34567m;

    /* JADX INFO: renamed from: n */
    public boolean f34568n;

    /* JADX INFO: renamed from: o */
    public ArrayList<ActionBar.b> f34569o;

    /* JADX INFO: renamed from: p */
    public boolean f34570p;

    /* JADX INFO: renamed from: q */
    public int f34571q;

    /* JADX INFO: renamed from: r */
    public boolean f34572r;

    /* JADX INFO: renamed from: s */
    public boolean f34573s;

    /* JADX INFO: renamed from: t */
    public boolean f34574t;

    /* JADX INFO: renamed from: u */
    public boolean f34575u;

    /* JADX INFO: renamed from: v */
    public ViewPropertyAnimatorCompatSet f34576v;

    /* JADX INFO: renamed from: w */
    public boolean f34577w;

    /* JADX INFO: renamed from: x */
    public boolean f34578x;

    /* JADX INFO: renamed from: y */
    public final ViewPropertyAnimatorListener f34579y;

    /* JADX INFO: renamed from: z */
    public final ViewPropertyAnimatorListener f34580z;

    /* JADX INFO: renamed from: z0.b.c.v$a */
    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class a extends ViewPropertyAnimatorListenerAdapter {
        public a() {
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: b */
        public void mo14669b(View view) {
            View view2;
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f34572r && (view2 = windowDecorActionBar.f34563i) != null) {
                view2.setTranslationY(0.0f);
                WindowDecorActionBar.this.f34560f.setTranslationY(0.0f);
            }
            WindowDecorActionBar.this.f34560f.setVisibility(8);
            WindowDecorActionBar.this.f34560f.setTransitioning(false);
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.f34576v = null;
            ActionMode.a aVar = windowDecorActionBar2.f34567m;
            if (aVar != null) {
                aVar.mo14665a(windowDecorActionBar2.f34566l);
                windowDecorActionBar2.f34566l = null;
                windowDecorActionBar2.f34567m = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = WindowDecorActionBar.this.f34559e;
            if (actionBarOverlayLayout != null) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                actionBarOverlayLayout.requestApplyInsets();
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.c.v$b */
    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class b extends ViewPropertyAnimatorListenerAdapter {
        public b() {
        }

        @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
        /* JADX INFO: renamed from: b */
        public void mo14669b(View view) {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            windowDecorActionBar.f34576v = null;
            windowDecorActionBar.f34560f.requestLayout();
        }
    }

    /* JADX INFO: renamed from: z0.b.c.v$c */
    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class c implements ViewPropertyAnimatorUpdateListener {
        public c() {
        }
    }

    /* JADX INFO: renamed from: z0.b.c.v$d */
    /* JADX INFO: compiled from: WindowDecorActionBar.java */
    public class d extends ActionMode implements MenuBuilder.a {

        /* JADX INFO: renamed from: h */
        public final Context f34584h;

        /* JADX INFO: renamed from: i */
        public final MenuBuilder f34585i;

        /* JADX INFO: renamed from: j */
        public ActionMode.a f34586j;

        /* JADX INFO: renamed from: k */
        public WeakReference<View> f34587k;

        public d(Context context, ActionMode.a aVar) {
            this.f34584h = context;
            this.f34586j = aVar;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            menuBuilder.f34830m = 1;
            this.f34585i = menuBuilder;
            menuBuilder.f34823f = this;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: a */
        public boolean mo188a(MenuBuilder menuBuilder, MenuItem menuItem) {
            ActionMode.a aVar = this.f34586j;
            if (aVar != null) {
                return aVar.mo14668d(this, menuItem);
            }
            return false;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: b */
        public void mo189b(MenuBuilder menuBuilder) {
            if (this.f34586j == null) {
                return;
            }
            mo14698i();
            ActionMenuPresenter actionMenuPresenter = WindowDecorActionBar.this.f34562h.f34930i;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.m14848j();
            }
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: c */
        public void mo14692c() {
            WindowDecorActionBar windowDecorActionBar = WindowDecorActionBar.this;
            if (windowDecorActionBar.f34565k != this) {
                return;
            }
            if (!windowDecorActionBar.f34573s) {
                this.f34586j.mo14665a(this);
            } else {
                windowDecorActionBar.f34566l = this;
                windowDecorActionBar.f34567m = this.f34586j;
            }
            this.f34586j = null;
            WindowDecorActionBar.this.m14687u(false);
            ActionBarContextView actionBarContextView = WindowDecorActionBar.this.f34562h;
            if (actionBarContextView.f286p == null) {
                actionBarContextView.m159h();
            }
            WindowDecorActionBar.this.f34561g.mo14868r().sendAccessibilityEvent(32);
            WindowDecorActionBar windowDecorActionBar2 = WindowDecorActionBar.this;
            windowDecorActionBar2.f34559e.setHideOnContentScrollEnabled(windowDecorActionBar2.f34578x);
            WindowDecorActionBar.this.f34565k = null;
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: d */
        public View mo14693d() {
            WeakReference<View> weakReference = this.f34587k;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: e */
        public Menu mo14694e() {
            return this.f34585i;
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: f */
        public MenuInflater mo14695f() {
            return new SupportMenuInflater(this.f34584h);
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: g */
        public CharSequence mo14696g() {
            return WindowDecorActionBar.this.f34562h.getSubtitle();
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: h */
        public CharSequence mo14697h() {
            return WindowDecorActionBar.this.f34562h.getTitle();
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: i */
        public void mo14698i() {
            if (WindowDecorActionBar.this.f34565k != this) {
                return;
            }
            this.f34585i.m14792z();
            try {
                this.f34586j.mo14667c(this, this.f34585i);
            } finally {
                this.f34585i.m14791y();
            }
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: j */
        public boolean mo14699j() {
            return WindowDecorActionBar.this.f34562h.f294x;
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: k */
        public void mo14700k(View view) {
            WindowDecorActionBar.this.f34562h.setCustomView(view);
            this.f34587k = new WeakReference<>(view);
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: l */
        public void mo14701l(int i) {
            WindowDecorActionBar.this.f34562h.setSubtitle(WindowDecorActionBar.this.f34557c.getResources().getString(i));
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: m */
        public void mo14702m(CharSequence charSequence) {
            WindowDecorActionBar.this.f34562h.setSubtitle(charSequence);
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: n */
        public void mo14703n(int i) {
            WindowDecorActionBar.this.f34562h.setTitle(WindowDecorActionBar.this.f34557c.getResources().getString(i));
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: o */
        public void mo14704o(CharSequence charSequence) {
            WindowDecorActionBar.this.f34562h.setTitle(charSequence);
        }

        @Override // p636z0.p644b.p651g.ActionMode
        /* JADX INFO: renamed from: p */
        public void mo14705p(boolean z) {
            this.f34666g = z;
            WindowDecorActionBar.this.f34562h.setTitleOptional(z);
        }
    }

    public WindowDecorActionBar(Activity activity, boolean z) {
        new ArrayList();
        this.f34569o = new ArrayList<>();
        this.f34571q = 0;
        this.f34572r = true;
        this.f34575u = true;
        this.f34579y = new a();
        this.f34580z = new b();
        this.f34556A = new c();
        View decorView = activity.getWindow().getDecorView();
        m14688v(decorView);
        if (z) {
            return;
        }
        this.f34563i = decorView.findViewById(R.id.content);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: b */
    public boolean mo14582b() {
        DecorToolbar decorToolbar = this.f34561g;
        if (decorToolbar == null || !decorToolbar.mo14860j()) {
            return false;
        }
        this.f34561g.collapseActionView();
        return true;
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: c */
    public void mo14583c(boolean z) {
        if (z == this.f34568n) {
            return;
        }
        this.f34568n = z;
        int size = this.f34569o.size();
        for (int i = 0; i < size; i++) {
            this.f34569o.get(i).m14601a(z);
        }
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: d */
    public int mo14584d() {
        return this.f34561g.mo14870t();
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: e */
    public Context mo14585e() {
        if (this.f34558d == null) {
            TypedValue typedValue = new TypedValue();
            this.f34557c.getTheme().resolveAttribute(mtp.media.karaoke.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f34558d = new ContextThemeWrapper(this.f34557c, i);
            } else {
                this.f34558d = this.f34557c;
            }
        }
        return this.f34558d;
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: g */
    public void mo14587g(Configuration configuration) {
        m14690x(this.f34557c.getResources().getBoolean(mtp.media.karaoke.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: i */
    public boolean mo14589i(int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        d dVar = this.f34565k;
        if (dVar == null || (menuBuilder = dVar.f34585i) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i, keyEvent, 0);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: l */
    public void mo14592l(boolean z) {
        if (this.f34564j) {
            return;
        }
        m14689w(z ? 4 : 0, 4);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: m */
    public void mo14593m(boolean z) {
        m14689w(z ? 4 : 0, 4);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: n */
    public void mo14594n(boolean z) {
        m14689w(z ? 2 : 0, 2);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: o */
    public void mo14595o(boolean z) {
        m14689w(z ? 8 : 0, 8);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: p */
    public void mo14596p(boolean z) {
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet;
        this.f34577w = z;
        if (z || (viewPropertyAnimatorCompatSet = this.f34576v) == null) {
            return;
        }
        viewPropertyAnimatorCompatSet.m14737a();
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: q */
    public void mo14597q(int i) {
        this.f34561g.setTitle(this.f34557c.getString(i));
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: r */
    public void mo14598r(CharSequence charSequence) {
        this.f34561g.setTitle(charSequence);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: s */
    public void mo14599s(CharSequence charSequence) {
        this.f34561g.setWindowTitle(charSequence);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: t */
    public ActionMode mo14600t(ActionMode.a aVar) {
        d dVar = this.f34565k;
        if (dVar != null) {
            dVar.mo14692c();
        }
        this.f34559e.setHideOnContentScrollEnabled(false);
        this.f34562h.m159h();
        d dVar2 = new d(this.f34562h.getContext(), aVar);
        dVar2.f34585i.m14792z();
        try {
            boolean zMo14666b = dVar2.f34586j.mo14666b(dVar2, dVar2.f34585i);
            dVar2.f34585i.m14791y();
            if (!zMo14666b) {
                return null;
            }
            this.f34565k = dVar2;
            dVar2.mo14698i();
            this.f34562h.m157f(dVar2);
            m14687u(true);
            this.f34562h.sendAccessibilityEvent(32);
            return dVar2;
        } catch (Throwable th) {
            dVar2.f34585i.m14791y();
            throw th;
        }
    }

    /* JADX INFO: renamed from: u */
    public void m14687u(boolean z) {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatMo14865o;
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM14825e;
        if (z) {
            if (!this.f34574t) {
                this.f34574t = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f34559e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m14691y(false);
            }
        } else if (this.f34574t) {
            this.f34574t = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f34559e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m14691y(false);
        }
        ActionBarContainer actionBarContainer = this.f34560f;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!actionBarContainer.isLaidOut()) {
            if (z) {
                this.f34561g.mo14867q(4);
                this.f34562h.setVisibility(0);
                return;
            } else {
                this.f34561g.mo14867q(0);
                this.f34562h.setVisibility(8);
                return;
            }
        }
        if (z) {
            viewPropertyAnimatorCompatM14825e = this.f34561g.mo14865o(4, 100L);
            viewPropertyAnimatorCompatMo14865o = this.f34562h.m14825e(0, 200L);
        } else {
            viewPropertyAnimatorCompatMo14865o = this.f34561g.mo14865o(0, 200L);
            viewPropertyAnimatorCompatM14825e = this.f34562h.m14825e(8, 100L);
        }
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = new ViewPropertyAnimatorCompatSet();
        viewPropertyAnimatorCompatSet.f34725a.add(viewPropertyAnimatorCompatM14825e);
        View view = viewPropertyAnimatorCompatM14825e.f38092a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = viewPropertyAnimatorCompatMo14865o.f38092a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        viewPropertyAnimatorCompatSet.f34725a.add(viewPropertyAnimatorCompatMo14865o);
        viewPropertyAnimatorCompatSet.m14738b();
    }

    /* JADX INFO: renamed from: v */
    public final void m14688v(View view) {
        DecorToolbar wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(mtp.media.karaoke.R.id.decor_content_parent);
        this.f34559e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(mtp.media.karaoke.R.id.action_bar);
        if (callbackFindViewById instanceof DecorToolbar) {
            wrapper = (DecorToolbar) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sbM1556G = outline.m1556G("Can't make a decor toolbar out of ");
                sbM1556G.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sbM1556G.toString());
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f34561g = wrapper;
        this.f34562h = (ActionBarContextView) view.findViewById(mtp.media.karaoke.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(mtp.media.karaoke.R.id.action_bar_container);
        this.f34560f = actionBarContainer;
        DecorToolbar decorToolbar = this.f34561g;
        if (decorToolbar == null || this.f34562h == null || actionBarContainer == null) {
            throw new IllegalStateException(WindowDecorActionBar.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f34557c = decorToolbar.getContext();
        boolean z = (this.f34561g.mo14870t() & 4) != 0;
        if (z) {
            this.f34564j = true;
        }
        Context context = this.f34557c;
        this.f34561g.mo14869s((context.getApplicationInfo().targetSdkVersion < 14) || z);
        m14690x(context.getResources().getBoolean(mtp.media.karaoke.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f34557c.obtainStyledAttributes(null, C7463b.f34385a, mtp.media.karaoke.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f34559e;
            if (!actionBarOverlayLayout2.f316n) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f34578x = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f34560f;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: w */
    public void m14689w(int i, int i2) {
        int iMo14870t = this.f34561g.mo14870t();
        if ((i2 & 4) != 0) {
            this.f34564j = true;
        }
        this.f34561g.mo14861k((i & i2) | ((~i2) & iMo14870t));
    }

    /* JADX INFO: renamed from: x */
    public final void m14690x(boolean z) {
        this.f34570p = z;
        if (z) {
            this.f34560f.setTabContainer(null);
            this.f34561g.mo14859i(null);
        } else {
            this.f34561g.mo14859i(null);
            this.f34560f.setTabContainer(null);
        }
        boolean z2 = this.f34561g.mo14864n() == 2;
        this.f34561g.mo14873w(!this.f34570p && z2);
        this.f34559e.setHasNonEmbeddedTabs(!this.f34570p && z2);
    }

    /* JADX INFO: renamed from: y */
    public final void m14691y(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.f34574t || !this.f34573s)) {
            if (this.f34575u) {
                this.f34575u = false;
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet = this.f34576v;
                if (viewPropertyAnimatorCompatSet != null) {
                    viewPropertyAnimatorCompatSet.m14737a();
                }
                if (this.f34571q != 0 || (!this.f34577w && !z)) {
                    this.f34579y.mo14669b(null);
                    return;
                }
                this.f34560f.setAlpha(1.0f);
                this.f34560f.setTransitioning(true);
                ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet2 = new ViewPropertyAnimatorCompatSet();
                float f = -this.f34560f.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f34560f.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b = ViewCompat.m16308b(this.f34560f);
                viewPropertyAnimatorCompatM16308b.m16351g(f);
                viewPropertyAnimatorCompatM16308b.m16350f(this.f34556A);
                if (!viewPropertyAnimatorCompatSet2.f34729e) {
                    viewPropertyAnimatorCompatSet2.f34725a.add(viewPropertyAnimatorCompatM16308b);
                }
                if (this.f34572r && (view = this.f34563i) != null) {
                    ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b2 = ViewCompat.m16308b(view);
                    viewPropertyAnimatorCompatM16308b2.m16351g(f);
                    if (!viewPropertyAnimatorCompatSet2.f34729e) {
                        viewPropertyAnimatorCompatSet2.f34725a.add(viewPropertyAnimatorCompatM16308b2);
                    }
                }
                Interpolator interpolator = f34554a;
                boolean z2 = viewPropertyAnimatorCompatSet2.f34729e;
                if (!z2) {
                    viewPropertyAnimatorCompatSet2.f34727c = interpolator;
                }
                if (!z2) {
                    viewPropertyAnimatorCompatSet2.f34726b = 250L;
                }
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = this.f34579y;
                if (!z2) {
                    viewPropertyAnimatorCompatSet2.f34728d = viewPropertyAnimatorListener;
                }
                this.f34576v = viewPropertyAnimatorCompatSet2;
                viewPropertyAnimatorCompatSet2.m14738b();
                return;
            }
            return;
        }
        if (this.f34575u) {
            return;
        }
        this.f34575u = true;
        ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet3 = this.f34576v;
        if (viewPropertyAnimatorCompatSet3 != null) {
            viewPropertyAnimatorCompatSet3.m14737a();
        }
        this.f34560f.setVisibility(0);
        if (this.f34571q == 0 && (this.f34577w || z)) {
            this.f34560f.setTranslationY(0.0f);
            float f2 = -this.f34560f.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f34560f.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f34560f.setTranslationY(f2);
            ViewPropertyAnimatorCompatSet viewPropertyAnimatorCompatSet4 = new ViewPropertyAnimatorCompatSet();
            ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b3 = ViewCompat.m16308b(this.f34560f);
            viewPropertyAnimatorCompatM16308b3.m16351g(0.0f);
            viewPropertyAnimatorCompatM16308b3.m16350f(this.f34556A);
            if (!viewPropertyAnimatorCompatSet4.f34729e) {
                viewPropertyAnimatorCompatSet4.f34725a.add(viewPropertyAnimatorCompatM16308b3);
            }
            if (this.f34572r && (view3 = this.f34563i) != null) {
                view3.setTranslationY(f2);
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b4 = ViewCompat.m16308b(this.f34563i);
                viewPropertyAnimatorCompatM16308b4.m16351g(0.0f);
                if (!viewPropertyAnimatorCompatSet4.f34729e) {
                    viewPropertyAnimatorCompatSet4.f34725a.add(viewPropertyAnimatorCompatM16308b4);
                }
            }
            Interpolator interpolator2 = f34555b;
            boolean z3 = viewPropertyAnimatorCompatSet4.f34729e;
            if (!z3) {
                viewPropertyAnimatorCompatSet4.f34727c = interpolator2;
            }
            if (!z3) {
                viewPropertyAnimatorCompatSet4.f34726b = 250L;
            }
            ViewPropertyAnimatorListener viewPropertyAnimatorListener2 = this.f34580z;
            if (!z3) {
                viewPropertyAnimatorCompatSet4.f34728d = viewPropertyAnimatorListener2;
            }
            this.f34576v = viewPropertyAnimatorCompatSet4;
            viewPropertyAnimatorCompatSet4.m14738b();
        } else {
            this.f34560f.setAlpha(1.0f);
            this.f34560f.setTranslationY(0.0f);
            if (this.f34572r && (view2 = this.f34563i) != null) {
                view2.setTranslationY(0.0f);
            }
            this.f34580z.mo14669b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f34559e;
        if (actionBarOverlayLayout != null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    public WindowDecorActionBar(Dialog dialog) {
        new ArrayList();
        this.f34569o = new ArrayList<>();
        this.f34571q = 0;
        this.f34572r = true;
        this.f34575u = true;
        this.f34579y = new a();
        this.f34580z = new b();
        this.f34556A = new c();
        m14688v(dialog.getWindow().getDecorView());
    }

    public WindowDecorActionBar(View view) {
        new ArrayList();
        this.f34569o = new ArrayList<>();
        this.f34571q = 0;
        this.f34572r = true;
        this.f34575u = true;
        this.f34579y = new a();
        this.f34580z = new b();
        this.f34556A = new c();
        m14688v(view);
    }
}
