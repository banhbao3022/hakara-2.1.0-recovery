package p636z0.p644b.p651g.p652i;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p636z0.p725k.C8162a;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p733g.p734a.SupportMenuItem;
import p636z0.p725k.p739l.ActionProvider;

/* JADX INFO: renamed from: z0.b.g.i.a, reason: use source file name */
/* JADX INFO: compiled from: ActionMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItem implements SupportMenuItem {

    /* JADX INFO: renamed from: a */
    public final int f34735a;

    /* JADX INFO: renamed from: b */
    public final int f34736b;

    /* JADX INFO: renamed from: c */
    public final int f34737c;

    /* JADX INFO: renamed from: d */
    public CharSequence f34738d;

    /* JADX INFO: renamed from: e */
    public CharSequence f34739e;

    /* JADX INFO: renamed from: f */
    public Intent f34740f;

    /* JADX INFO: renamed from: g */
    public char f34741g;

    /* JADX INFO: renamed from: i */
    public char f34743i;

    /* JADX INFO: renamed from: k */
    public Drawable f34745k;

    /* JADX INFO: renamed from: l */
    public Context f34746l;

    /* JADX INFO: renamed from: m */
    public CharSequence f34747m;

    /* JADX INFO: renamed from: n */
    public CharSequence f34748n;

    /* JADX INFO: renamed from: h */
    public int f34742h = 4096;

    /* JADX INFO: renamed from: j */
    public int f34744j = 4096;

    /* JADX INFO: renamed from: o */
    public ColorStateList f34749o = null;

    /* JADX INFO: renamed from: p */
    public PorterDuff.Mode f34750p = null;

    /* JADX INFO: renamed from: q */
    public boolean f34751q = false;

    /* JADX INFO: renamed from: r */
    public boolean f34752r = false;

    /* JADX INFO: renamed from: s */
    public int f34753s = 16;

    public ActionMenuItem(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f34746l = context;
        this.f34735a = i2;
        this.f34736b = i;
        this.f34737c = i4;
        this.f34738d = charSequence;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem
    /* JADX INFO: renamed from: a */
    public SupportMenuItem mo14739a(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem
    /* JADX INFO: renamed from: b */
    public ActionProvider mo14740b() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m14741c() {
        Drawable drawable = this.f34745k;
        if (drawable != null) {
            if (this.f34751q || this.f34752r) {
                Drawable drawableM16054Y = C8162a.m16054Y(drawable);
                this.f34745k = drawableM16054Y;
                Drawable drawableMutate = drawableM16054Y.mutate();
                this.f34745k = drawableMutate;
                if (this.f34751q) {
                    drawableMutate.setTintList(this.f34749o);
                }
                if (this.f34752r) {
                    this.f34745k.setTintMode(this.f34750p);
                }
            }
        }
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f34744j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f34743i;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f34747m;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f34736b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f34745k;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f34749o;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f34750p;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f34740f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f34735a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f34742h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f34741g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f34737c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f34738d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f34739e;
        return charSequence != null ? charSequence : this.f34738d;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f34748n;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f34753s & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f34753s & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f34753s & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f34753s & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f34743i = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f34753s = (z ? 1 : 0) | (this.f34753s & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f34753s = (z ? 2 : 0) | (this.f34753s & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f34747m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f34753s = (z ? 16 : 0) | (this.f34753s & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f34745k = drawable;
        m14741c();
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f34749o = colorStateList;
        this.f34751q = true;
        m14741c();
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f34750p = mode;
        this.f34752r = true;
        m14741c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f34740f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c2) {
        this.f34741g = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3) {
        this.f34741g = c2;
        this.f34743i = Character.toLowerCase(c3);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f34738d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f34739e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f34748n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f34753s = (this.f34753s & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c2, int i) {
        this.f34743i = Character.toLowerCase(c2);
        this.f34744j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f34747m = charSequence;
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setNumericShortcut(char c2, int i) {
        this.f34741g = c2;
        this.f34742h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f34738d = this.f34746l.getResources().getString(i);
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f34748n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        Context context = this.f34746l;
        Object obj = ContextCompat.f37815a;
        this.f34745k = ContextCompat.c.m16141b(context, i);
        m14741c();
        return this;
    }

    @Override // p636z0.p725k.p733g.p734a.SupportMenuItem, android.view.MenuItem
    public MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.f34741g = c2;
        this.f34742h = KeyEvent.normalizeMetaState(i);
        this.f34743i = Character.toLowerCase(c3);
        this.f34744j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
