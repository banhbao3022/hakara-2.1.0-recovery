package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p733g.p734a.SupportMenuItem;
import p636z0.p725k.p733g.p734a.SupportSubMenu;

/* JADX INFO: renamed from: z0.b.g.i.c, reason: use source file name */
/* JADX INFO: compiled from: BaseMenuWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseMenuWrapper {

    /* JADX INFO: renamed from: a */
    public final Context f34763a;

    /* JADX INFO: renamed from: b */
    public SimpleArrayMap<SupportMenuItem, MenuItem> f34764b;

    /* JADX INFO: renamed from: c */
    public SimpleArrayMap<SupportSubMenu, SubMenu> f34765c;

    public BaseMenuWrapper(Context context) {
        this.f34763a = context;
    }

    /* JADX INFO: renamed from: c */
    public final MenuItem m14747c(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f34764b == null) {
            this.f34764b = new SimpleArrayMap<>();
        }
        MenuItem orDefault = this.f34764b.getOrDefault(menuItem, null);
        if (orDefault != null) {
            return orDefault;
        }
        MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS(this.f34763a, supportMenuItem);
        this.f34764b.put(supportMenuItem, menuItemWrapperICS);
        return menuItemWrapperICS;
    }

    /* JADX INFO: renamed from: d */
    public final SubMenu m14748d(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f34765c == null) {
            this.f34765c = new SimpleArrayMap<>();
        }
        SubMenu subMenu2 = this.f34765c.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuWrapperICS subMenuWrapperICS = new SubMenuWrapperICS(this.f34763a, supportSubMenu);
        this.f34765c.put(supportSubMenu, subMenuWrapperICS);
        return subMenuWrapperICS;
    }
}
