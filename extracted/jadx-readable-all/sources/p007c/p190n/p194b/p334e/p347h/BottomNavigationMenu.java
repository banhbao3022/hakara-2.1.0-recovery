package p007c.p190n.p194b.p334e.p347h;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuItemImpl;

/* JADX INFO: renamed from: c.n.b.e.h.b, reason: use source file name */
/* JADX INFO: compiled from: BottomNavigationMenu.java */
/* JADX INFO: loaded from: classes.dex */
public final class BottomNavigationMenu extends MenuBuilder {
    public BottomNavigationMenu(Context context) {
        super(context);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder
    /* JADX INFO: renamed from: a */
    public MenuItem mo11117a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > 5) {
            throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
        }
        m14792z();
        MenuItem menuItemMo11117a = super.mo11117a(i, i2, i3, charSequence);
        ((MenuItemImpl) menuItemMo11117a).m14801k(true);
        m14791y();
        return menuItemMo11117a;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
