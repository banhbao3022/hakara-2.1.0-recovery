package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p636z0.p644b.p651g.CollapsibleActionView;
import p636z0.p725k.p733g.p734a.SupportMenuItem;
import p636z0.p725k.p739l.ActionProvider;

/* JADX INFO: renamed from: z0.b.g.i.j, reason: use source file name */
/* JADX INFO: compiled from: MenuItemWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class MenuItemWrapperICS extends BaseMenuWrapper implements MenuItem {

    /* JADX INFO: renamed from: d */
    public final SupportMenuItem f34877d;

    /* JADX INFO: renamed from: e */
    public Method f34878e;

    /* JADX INFO: renamed from: z0.b.g.i.j$a */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public class a extends ActionProvider {

        /* JADX INFO: renamed from: b */
        public final android.view.ActionProvider f34879b;

        public a(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f34879b = actionProvider;
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: a */
        public boolean mo14805a() {
            return this.f34879b.hasSubMenu();
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: c */
        public View mo14806c() {
            return this.f34879b.onCreateActionView();
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: e */
        public boolean mo14807e() {
            return this.f34879b.onPerformDefaultAction();
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: f */
        public void mo14808f(SubMenu subMenu) {
            this.f34879b.onPrepareSubMenu(MenuItemWrapperICS.this.m14748d(subMenu));
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.j$b */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public class b extends a implements android.view.ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d */
        public ActionProvider.a f34881d;

        public b(MenuItemWrapperICS menuItemWrapperICS, Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: b */
        public boolean mo14809b() {
            return this.f34879b.isVisible();
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: d */
        public View mo14810d(MenuItem menuItem) {
            return this.f34879b.onCreateActionView(menuItem);
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: g */
        public boolean mo14811g() {
            return this.f34879b.overridesItemVisibility();
        }

        @Override // p636z0.p725k.p739l.ActionProvider
        /* JADX INFO: renamed from: h */
        public void mo14812h(ActionProvider.a aVar) {
            this.f34881d = aVar;
            this.f34879b.setVisibilityListener(this);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            ActionProvider.a aVar = this.f34881d;
            if (aVar != null) {
                MenuBuilder menuBuilder = MenuItemImpl.this.f34863n;
                menuBuilder.f34826i = true;
                menuBuilder.m14783q(true);
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.j$c */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public static class c extends FrameLayout implements CollapsibleActionView {

        /* JADX INFO: renamed from: f */
        public final android.view.CollapsibleActionView f34882f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(View view) {
            super(view.getContext());
            this.f34882f = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        @Override // p636z0.p644b.p651g.CollapsibleActionView
        /* JADX INFO: renamed from: c */
        public void mo202c() {
            this.f34882f.onActionViewExpanded();
        }

        @Override // p636z0.p644b.p651g.CollapsibleActionView
        /* JADX INFO: renamed from: e */
        public void mo203e() {
            this.f34882f.onActionViewCollapsed();
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.j$d */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnActionExpandListener f34883a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f34883a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f34883a.onMenuItemActionCollapse(MenuItemWrapperICS.this.m14747c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f34883a.onMenuItemActionExpand(MenuItemWrapperICS.this.m14747c(menuItem));
        }
    }

    /* JADX INFO: renamed from: z0.b.g.i.j$e */
    /* JADX INFO: compiled from: MenuItemWrapperICS.java */
    public class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public final MenuItem.OnMenuItemClickListener f34885a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f34885a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f34885a.onMenuItemClick(MenuItemWrapperICS.this.m14747c(menuItem));
        }
    }

    public MenuItemWrapperICS(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f34877d = supportMenuItem;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f34877d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f34877d.expandActionView();
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        ActionProvider actionProviderMo14740b = this.f34877d.mo14740b();
        if (actionProviderMo14740b instanceof a) {
            return ((a) actionProviderMo14740b).f34879b;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f34877d.getActionView();
        return actionView instanceof c ? (View) ((c) actionView).f34882f : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f34877d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f34877d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f34877d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f34877d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f34877d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f34877d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f34877d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f34877d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f34877d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f34877d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f34877d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f34877d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f34877d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m14748d(this.f34877d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f34877d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f34877d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f34877d.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f34877d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f34877d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f34877d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f34877d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f34877d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f34877d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        b bVar = new b(this, this.f34763a, actionProvider);
        SupportMenuItem supportMenuItem = this.f34877d;
        if (actionProvider == null) {
            bVar = null;
        }
        supportMenuItem.mo14739a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new c(view);
        }
        this.f34877d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f34877d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f34877d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f34877d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f34877d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f34877d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f34877d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f34877d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f34877d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f34877d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f34877d.setNumericShortcut(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f34877d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f34877d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f34877d.setShortcut(c2, c3);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f34877d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f34877d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f34877d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f34877d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f34877d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f34877d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f34877d.setAlphabeticShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f34877d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f34877d.setNumericShortcut(c2, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f34877d.setShortcut(c2, c3, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f34877d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f34877d.setActionView(i);
        View actionView = this.f34877d.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.f34877d.setActionView(new c(actionView));
        }
        return this;
    }
}
