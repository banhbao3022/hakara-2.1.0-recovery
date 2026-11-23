package p636z0.p644b.p645c;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p644b.p651g.WindowCallbackWrapper;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p653h.DecorToolbar;
import p636z0.p644b.p653h.ToolbarWidgetWrapper;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: renamed from: z0.b.c.s, reason: use source file name */
/* JADX INFO: compiled from: ToolbarActionBar.java */
/* JADX INFO: loaded from: classes.dex */
public class ToolbarActionBar extends ActionBar {

    /* JADX INFO: renamed from: a */
    public DecorToolbar f34530a;

    /* JADX INFO: renamed from: b */
    public boolean f34531b;

    /* JADX INFO: renamed from: c */
    public Window.Callback f34532c;

    /* JADX INFO: renamed from: d */
    public boolean f34533d;

    /* JADX INFO: renamed from: e */
    public boolean f34534e;

    /* JADX INFO: renamed from: f */
    public ArrayList<ActionBar.b> f34535f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public final Runnable f34536g = new a();

    /* JADX INFO: renamed from: h */
    public final Toolbar.InterfaceC0089f f34537h;

    /* JADX INFO: renamed from: z0.b.c.s$a */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            Menu menuM14683u = toolbarActionBar.m14683u();
            MenuBuilder menuBuilder = menuM14683u instanceof MenuBuilder ? (MenuBuilder) menuM14683u : null;
            if (menuBuilder != null) {
                menuBuilder.m14792z();
            }
            try {
                menuM14683u.clear();
                if (!toolbarActionBar.f34532c.onCreatePanelMenu(0, menuM14683u) || !toolbarActionBar.f34532c.onPreparePanel(0, null, menuM14683u)) {
                    menuM14683u.clear();
                }
            } finally {
                if (menuBuilder != null) {
                    menuBuilder.m14791y();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.c.s$b */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class b implements Toolbar.InterfaceC0089f {
        public b() {
        }
    }

    /* JADX INFO: renamed from: z0.b.c.s$c */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class c implements MenuPresenter.a {

        /* JADX INFO: renamed from: f */
        public boolean f34540f;

        public c() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: c */
        public void mo186c(MenuBuilder menuBuilder, boolean z) {
            if (this.f34540f) {
                return;
            }
            this.f34540f = true;
            ToolbarActionBar.this.f34530a.mo14858h();
            Window.Callback callback = ToolbarActionBar.this.f34532c;
            if (callback != null) {
                callback.onPanelClosed(108, menuBuilder);
            }
            this.f34540f = false;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: d */
        public boolean mo187d(MenuBuilder menuBuilder) {
            Window.Callback callback = ToolbarActionBar.this.f34532c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* JADX INFO: renamed from: z0.b.c.s$d */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public final class d implements MenuBuilder.a {
        public d() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: a */
        public boolean mo188a(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
        /* JADX INFO: renamed from: b */
        public void mo189b(MenuBuilder menuBuilder) {
            ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
            if (toolbarActionBar.f34532c != null) {
                if (toolbarActionBar.f34530a.mo14852b()) {
                    ToolbarActionBar.this.f34532c.onPanelClosed(108, menuBuilder);
                } else if (ToolbarActionBar.this.f34532c.onPreparePanel(0, null, menuBuilder)) {
                    ToolbarActionBar.this.f34532c.onMenuOpened(108, menuBuilder);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.c.s$e */
    /* JADX INFO: compiled from: ToolbarActionBar.java */
    public class e extends WindowCallbackWrapper {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            return i == 0 ? new View(ToolbarActionBar.this.f34530a.getContext()) : this.f34734f.onCreatePanelView(i);
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean zOnPreparePanel = this.f34734f.onPreparePanel(i, view, menu);
            if (zOnPreparePanel) {
                ToolbarActionBar toolbarActionBar = ToolbarActionBar.this;
                if (!toolbarActionBar.f34531b) {
                    toolbarActionBar.f34530a.mo14853c();
                    ToolbarActionBar.this.f34531b = true;
                }
            }
            return zOnPreparePanel;
        }
    }

    public ToolbarActionBar(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f34537h = bVar;
        this.f34530a = new ToolbarWidgetWrapper(toolbar, false);
        e eVar = new e(callback);
        this.f34532c = eVar;
        this.f34530a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(bVar);
        this.f34530a.setWindowTitle(charSequence);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: a */
    public boolean mo14581a() {
        return this.f34530a.mo14856f();
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: b */
    public boolean mo14582b() {
        if (!this.f34530a.mo14860j()) {
            return false;
        }
        this.f34530a.collapseActionView();
        return true;
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: c */
    public void mo14583c(boolean z) {
        if (z == this.f34534e) {
            return;
        }
        this.f34534e = z;
        int size = this.f34535f.size();
        for (int i = 0; i < size; i++) {
            this.f34535f.get(i).m14601a(z);
        }
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: d */
    public int mo14584d() {
        return this.f34530a.mo14870t();
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: e */
    public Context mo14585e() {
        return this.f34530a.getContext();
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: f */
    public boolean mo14586f() {
        this.f34530a.mo14868r().removeCallbacks(this.f34536g);
        ViewGroup viewGroupMo14868r = this.f34530a.mo14868r();
        Runnable runnable = this.f34536g;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        viewGroupMo14868r.postOnAnimation(runnable);
        return true;
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: g */
    public void mo14587g(Configuration configuration) {
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: h */
    public void mo14588h() {
        this.f34530a.mo14868r().removeCallbacks(this.f34536g);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: i */
    public boolean mo14589i(int i, KeyEvent keyEvent) {
        Menu menuM14683u = m14683u();
        if (menuM14683u == null) {
            return false;
        }
        menuM14683u.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuM14683u.performShortcut(i, keyEvent, 0);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: j */
    public boolean mo14590j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.f34530a.mo14857g();
        }
        return true;
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: k */
    public boolean mo14591k() {
        return this.f34530a.mo14857g();
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: l */
    public void mo14592l(boolean z) {
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: m */
    public void mo14593m(boolean z) {
        m14684v(z ? 4 : 0, 4);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: n */
    public void mo14594n(boolean z) {
        m14684v(z ? 2 : 0, 2);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: o */
    public void mo14595o(boolean z) {
        m14684v(z ? 8 : 0, 8);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: p */
    public void mo14596p(boolean z) {
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: q */
    public void mo14597q(int i) {
        DecorToolbar decorToolbar = this.f34530a;
        decorToolbar.setTitle(i != 0 ? decorToolbar.getContext().getText(i) : null);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: r */
    public void mo14598r(CharSequence charSequence) {
        this.f34530a.setTitle(charSequence);
    }

    @Override // p636z0.p644b.p645c.ActionBar
    /* JADX INFO: renamed from: s */
    public void mo14599s(CharSequence charSequence) {
        this.f34530a.setWindowTitle(charSequence);
    }

    /* JADX INFO: renamed from: u */
    public final Menu m14683u() {
        if (!this.f34533d) {
            this.f34530a.mo14866p(new c(), new d());
            this.f34533d = true;
        }
        return this.f34530a.mo14862l();
    }

    /* JADX INFO: renamed from: v */
    public void m14684v(int i, int i2) {
        this.f34530a.mo14861k((i & i2) | ((~i2) & this.f34530a.mo14870t()));
    }
}
