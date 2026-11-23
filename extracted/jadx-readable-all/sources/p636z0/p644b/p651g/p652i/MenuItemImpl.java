package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Objects;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p725k.C8162a;
import p636z0.p725k.p733g.p734a.SupportMenuItem;
import p636z0.p725k.p739l.ActionProvider;

/* JADX INFO: renamed from: z0.b.g.i.i, reason: use source file name */
/* JADX INFO: compiled from: MenuItemImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemImpl implements SupportMenuItem {

    /* JADX INFO: renamed from: A */
    public ActionProvider f34846A;

    /* JADX INFO: renamed from: B */
    public MenuItem.OnActionExpandListener f34847B;

    /* JADX INFO: renamed from: D */
    public ContextMenu.ContextMenuInfo f34849D;

    /* JADX INFO: renamed from: a */
    public final int f34850a;

    /* JADX INFO: renamed from: b */
    public final int f34851b;

    /* JADX INFO: renamed from: c */
    public final int f34852c;

    /* JADX INFO: renamed from: d */
    public final int f34853d;

    /* JADX INFO: renamed from: e */
    public CharSequence f34854e;

    /* JADX INFO: renamed from: f */
    public CharSequence f34855f;

    /* JADX INFO: renamed from: g */
    public Intent f34856g;

    /* JADX INFO: renamed from: h */
    public char f34857h;

    /* JADX INFO: renamed from: j */
    public char f34859j;

    /* JADX INFO: renamed from: l */
    public Drawable f34861l;

    /* JADX INFO: renamed from: n */
    public MenuBuilder f34863n;

    /* JADX INFO: renamed from: o */
    public SubMenuBuilder f34864o;

    /* JADX INFO: renamed from: p */
    public MenuItem.OnMenuItemClickListener f34865p;

    /* JADX INFO: renamed from: q */
    public CharSequence f34866q;

    /* JADX INFO: renamed from: r */
    public CharSequence f34867r;

    /* JADX INFO: renamed from: y */
    public int f34874y;

    /* JADX INFO: renamed from: z */
    public View f34875z;

    /* JADX INFO: renamed from: i */
    public int f34858i = 4096;

    /* JADX INFO: renamed from: k */
    public int f34860k = 4096;

    /* JADX INFO: renamed from: m */
    public int f34862m = 0;

    /* JADX INFO: renamed from: s */
    public ColorStateList f34868s = null;

    /* JADX INFO: renamed from: t */
    public PorterDuff.Mode f34869t = null;

    /* JADX INFO: renamed from: u */
    public boolean f34870u = false;

    /* JADX INFO: renamed from: v */
    public boolean f34871v = false;

    /* JADX INFO: renamed from: w */
    public boolean f34872w = false;

    /* JADX INFO: renamed from: x */
    public int f34873x = 16;

    /* JADX INFO: renamed from: C */
    public boolean f34848C = false;

    /* JADX INFO: renamed from: z0.b.g.i.i$a */
    /* JADX INFO: compiled from: MenuItemImpl.java */
    public class a implements ActionProvider.a {
        public a() {
        }
    }

    public MenuItemImpl(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f34874y = 0;
        this.f34863n = menuBuilder;
        this.f34850a = i2;
        this.f34851b = i;
        this.f34852c = i3;
        this.f34853d = i4;
        this.f34854e = charSequence;
        this.f34874y = i5;
    }

    /* JADX INFO: renamed from: c */
    public static void m14793c(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem
    /* JADX INFO: renamed from: a */
    public SupportMenuItem mo14739a(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f34846A;
        if (actionProvider2 != null) {
            actionProvider2.f38013a = null;
        }
        this.f34875z = null;
        this.f34846A = actionProvider;
        this.f34863n.m14783q(true);
        ActionProvider actionProvider3 = this.f34846A;
        if (actionProvider3 != null) {
            actionProvider3.mo14812h(new a());
        }
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem
    /* JADX INFO: renamed from: b */
    public ActionProvider mo14740b() {
        return this.f34846A;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f34874y & 8) == 0) {
            return false;
        }
        if (this.f34875z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f34847B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f34863n.mo14770d(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m14794d(Drawable drawable) {
        if (drawable != null && this.f34872w && (this.f34870u || this.f34871v)) {
            drawable = C8162a.m16054Y(drawable).mutate();
            if (this.f34870u) {
                drawable.setTintList(this.f34868s);
            }
            if (this.f34871v) {
                drawable.setTintMode(this.f34869t);
            }
            this.f34872w = false;
        }
        return drawable;
    }

    /* JADX INFO: renamed from: e */
    public char m14795e() {
        return this.f34863n.mo14780n() ? this.f34859j : this.f34857h;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        if (!m14796f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f34847B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f34863n.mo14772f(this);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m14796f() {
        ActionProvider actionProvider;
        if ((this.f34874y & 8) == 0) {
            return false;
        }
        if (this.f34875z == null && (actionProvider = this.f34846A) != null) {
            this.f34875z = actionProvider.mo14810d(this);
        }
        return this.f34875z != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m14797g() {
        return (this.f34873x & 32) == 32;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        View view = this.f34875z;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f34846A;
        if (actionProvider == null) {
            return null;
        }
        View viewMo14810d = actionProvider.mo14810d(this);
        this.f34875z = viewMo14810d;
        return viewMo14810d;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f34860k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f34859j;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f34866q;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f34851b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f34861l;
        if (drawable != null) {
            return m14794d(drawable);
        }
        int i = this.f34862m;
        if (i == 0) {
            return null;
        }
        Drawable drawableM14707b = AppCompatResources.m14707b(this.f34863n.f34819b, i);
        this.f34862m = 0;
        this.f34861l = drawableM14707b;
        return m14794d(drawableM14707b);
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f34868s;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f34869t;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f34856g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f34850a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f34849D;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f34858i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f34857h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f34852c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f34864o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f34854e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f34855f;
        return charSequence != null ? charSequence : this.f34854e;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f34867r;
    }

    /* JADX INFO: renamed from: h */
    public boolean m14798h() {
        return (this.f34873x & 4) != 0;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f34864o != null;
    }

    /* JADX INFO: renamed from: i */
    public SupportMenuItem m14799i(View view) {
        int i;
        this.f34875z = view;
        this.f34846A = null;
        if (view != null && view.getId() == -1 && (i = this.f34850a) > 0) {
            view.setId(i);
        }
        this.f34863n.m14782p();
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f34848C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f34873x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f34873x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f34873x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        ActionProvider actionProvider = this.f34846A;
        if (actionProvider == null || !actionProvider.mo14811g()) {
            return (this.f34873x & 8) == 0;
        }
        return (this.f34873x & 8) == 0 && this.f34846A.mo14809b();
    }

    /* JADX INFO: renamed from: j */
    public void m14800j(boolean z) {
        int i = this.f34873x;
        int i2 = (z ? 2 : 0) | (i & (-3));
        this.f34873x = i2;
        if (i != i2) {
            this.f34863n.m14783q(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m14801k(boolean z) {
        this.f34873x = (z ? 4 : 0) | (this.f34873x & (-5));
    }

    /* JADX INFO: renamed from: l */
    public void m14802l(boolean z) {
        if (z) {
            this.f34873x |= 32;
        } else {
            this.f34873x &= -33;
        }
    }

    /* JADX INFO: renamed from: m */
    public boolean m14803m(boolean z) {
        int i = this.f34873x;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.f34873x = i2;
        return i != i2;
    }

    /* JADX INFO: renamed from: n */
    public boolean m14804n() {
        return this.f34863n.mo14781o() && m14795e() != 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        m14799i(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.f34859j == c2) {
            return this;
        }
        this.f34859j = Character.toLowerCase(c2);
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f34873x;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f34873x = i2;
        if (i != i2) {
            this.f34863n.m14783q(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f34873x & 4) != 0) {
            MenuBuilder menuBuilder = this.f34863n;
            Objects.requireNonNull(menuBuilder);
            int groupId = getGroupId();
            int size = menuBuilder.f34824g.size();
            menuBuilder.m14792z();
            for (int i = 0; i < size; i++) {
                MenuItemImpl menuItemImpl = menuBuilder.f34824g.get(i);
                if (menuItemImpl.f34851b == groupId && menuItemImpl.m14798h() && menuItemImpl.isCheckable()) {
                    menuItemImpl.m14800j(menuItemImpl == this);
                }
            }
            menuBuilder.m14791y();
        } else {
            m14800j(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f34866q = charSequence;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f34873x |= 16;
        } else {
            this.f34873x &= -17;
        }
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f34862m = 0;
        this.f34861l = drawable;
        this.f34872w = true;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f34868s = colorStateList;
        this.f34870u = true;
        this.f34872w = true;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f34869t = mode;
        this.f34871v = true;
        this.f34872w = true;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f34856g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        if (this.f34857h == c2) {
            return this;
        }
        this.f34857h = c2;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f34847B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f34865p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f34857h = c2;
        this.f34859j = Character.toLowerCase(c3);
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f34874y = i;
        this.f34863n.m14782p();
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f34854e = charSequence;
        this.f34863n.m14783q(false);
        SubMenuBuilder subMenuBuilder = this.f34864o;
        if (subMenuBuilder != null) {
            subMenuBuilder.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f34855f = charSequence;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f34867r = charSequence;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m14803m(z)) {
            MenuBuilder menuBuilder = this.f34863n;
            menuBuilder.f34826i = true;
            menuBuilder.m14783q(true);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f34854e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setActionView(int i) {
        Context context = this.f34863n.f34819b;
        m14799i(LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false));
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f34866q = charSequence;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f34867r = charSequence;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        if (this.f34859j == c2 && this.f34860k == i) {
            return this;
        }
        this.f34859j = Character.toLowerCase(c2);
        this.f34860k = KeyEvent.normalizeMetaState(i);
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        if (this.f34857h == c2 && this.f34858i == i) {
            return this;
        }
        this.f34857h = c2;
        this.f34858i = KeyEvent.normalizeMetaState(i);
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f34857h = c2;
        this.f34858i = KeyEvent.normalizeMetaState(i);
        this.f34859j = Character.toLowerCase(c3);
        this.f34860k = KeyEvent.normalizeMetaState(i2);
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f34861l = null;
        this.f34862m = i;
        this.f34872w = true;
        this.f34863n.m14783q(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        setTitle(this.f34863n.f34819b.getString(i));
        return this;
    }
}
