package p636z0.p725k.p733g.p734a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import p636z0.p725k.p739l.ActionProvider;

/* JADX INFO: renamed from: z0.k.g.a.b, reason: use source file name */
/* JADX INFO: compiled from: SupportMenuItem.java */
/* JADX INFO: loaded from: classes.dex */
public interface SupportMenuItem extends MenuItem {
    /* JADX INFO: renamed from: a */
    SupportMenuItem mo14739a(ActionProvider actionProvider);

    /* JADX INFO: renamed from: b */
    ActionProvider mo14740b();

    @Override // android.view.MenuItem
    boolean collapseActionView();

    @Override // android.view.MenuItem
    boolean expandActionView();

    @Override // android.view.MenuItem
    View getActionView();

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    boolean isActionViewExpanded();

    @Override // android.view.MenuItem
    MenuItem setActionView(int i);

    @Override // android.view.MenuItem
    MenuItem setActionView(View view);

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c2, int i);

    @Override // android.view.MenuItem
    SupportMenuItem setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c2, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c2, char c3, int i, int i2);

    @Override // android.view.MenuItem
    void setShowAsAction(int i);

    @Override // android.view.MenuItem
    MenuItem setShowAsActionFlags(int i);

    @Override // android.view.MenuItem
    SupportMenuItem setTooltipText(CharSequence charSequence);
}
