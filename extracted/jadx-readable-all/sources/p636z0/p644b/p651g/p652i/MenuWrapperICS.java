package p636z0.p644b.p651g.p652i;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.p733g.p734a.SupportMenu;
import p636z0.p725k.p733g.p734a.SupportMenuItem;
import p636z0.p725k.p733g.p734a.SupportSubMenu;

/* JADX INFO: renamed from: z0.b.g.i.o, reason: use source file name */
/* JADX INFO: compiled from: MenuWrapperICS.java */
/* JADX INFO: loaded from: classes.dex */
public class MenuWrapperICS extends BaseMenuWrapper implements Menu {

    /* JADX INFO: renamed from: d */
    public final SupportMenu f34901d;

    public MenuWrapperICS(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f34901d = supportMenu;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m14747c(this.f34901d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f34901d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m14747c(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m14748d(this.f34901d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        SimpleArrayMap<SupportMenuItem, MenuItem> simpleArrayMap = this.f34764b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<SupportSubMenu, SubMenu> simpleArrayMap2 = this.f34765c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
        this.f34901d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f34901d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m14747c(this.f34901d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m14747c(this.f34901d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f34901d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f34901d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f34901d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f34901d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        if (this.f34764b != null) {
            int i2 = 0;
            while (true) {
                SimpleArrayMap<SupportMenuItem, MenuItem> simpleArrayMap = this.f34764b;
                if (i2 >= simpleArrayMap.f36667l) {
                    break;
                }
                if (simpleArrayMap.m15611h(i2).getGroupId() == i) {
                    this.f34764b.mo2036j(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f34901d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        if (this.f34764b != null) {
            int i2 = 0;
            while (true) {
                SimpleArrayMap<SupportMenuItem, MenuItem> simpleArrayMap = this.f34764b;
                if (i2 >= simpleArrayMap.f36667l) {
                    break;
                }
                if (simpleArrayMap.m15611h(i2).getItemId() == i) {
                    this.f34764b.mo2036j(i2);
                    break;
                }
                i2++;
            }
        }
        this.f34901d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f34901d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f34901d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f34901d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f34901d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f34901d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m14747c(this.f34901d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m14748d(this.f34901d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m14747c(this.f34901d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m14748d(this.f34901d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m14747c(this.f34901d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m14748d(this.f34901d.addSubMenu(i, i2, i3, i4));
    }
}
