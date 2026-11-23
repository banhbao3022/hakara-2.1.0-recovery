package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p636z0.p725k.p733g.p734a.SupportSubMenu;

/* JADX INFO: renamed from: z0.b.g.i.s, reason: use source file name */
/* JADX INFO: compiled from: SubMenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {

    /* JADX INFO: renamed from: e */
    public final SupportSubMenu f34926e;

    public SubMenuWrapperICS(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f34926e = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f34926e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m14747c(this.f34926e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f34926e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f34926e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f34926e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f34926e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f34926e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f34926e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f34926e.setIcon(drawable);
        return this;
    }
}
