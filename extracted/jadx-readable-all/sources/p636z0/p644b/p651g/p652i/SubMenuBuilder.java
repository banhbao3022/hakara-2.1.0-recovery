package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: z0.b.g.i.r, reason: use source file name */
/* JADX INFO: compiled from: SubMenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuBuilder extends MenuBuilder implements SubMenu {

    /* JADX INFO: renamed from: A */
    public MenuItemImpl f34924A;

    /* JADX INFO: renamed from: z */
    public MenuBuilder f34925z;

    public SubMenuBuilder(Context context, MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        super(context);
        this.f34925z = menuBuilder;
        this.f34924A = menuItemImpl;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: d */
    public boolean mo14770d(MenuItemImpl menuItemImpl) {
        return this.f34925z.mo14770d(menuItemImpl);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: e */
    public boolean mo14771e(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.mo14771e(menuBuilder, menuItem) || this.f34925z.mo14771e(menuBuilder, menuItem);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: f */
    public boolean mo14772f(MenuItemImpl menuItemImpl) {
        return this.f34925z.mo14772f(menuItemImpl);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f34924A;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: j */
    public String mo14776j() {
        MenuItemImpl menuItemImpl = this.f34924A;
        int i = menuItemImpl != null ? menuItemImpl.f34850a : 0;
        if (i == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: k */
    public MenuBuilder mo14777k() {
        return this.f34925z.mo14777k();
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: m */
    public boolean mo14779m() {
        return this.f34925z.mo14779m();
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: n */
    public boolean mo14780n() {
        return this.f34925z.mo14780n();
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: o */
    public boolean mo14781o() {
        return this.f34925z.mo14781o();
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f34925z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        m14790x(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        m14790x(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        m14790x(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f34924A.setIcon(drawable);
        return this;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f34925z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        m14790x(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        m14790x(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f34924A.setIcon(i);
        return this;
    }
}
