package p636z0.p644b.p651g.p652i;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p733g.p734a.SupportMenu;
import p636z0.p725k.p739l.ActionProvider;
import p636z0.p725k.p739l.ViewConfigurationCompat;

/* JADX INFO: renamed from: z0.b.g.i.g, reason: use source file name */
/* JADX INFO: compiled from: MenuBuilder.java */
/* JADX INFO: loaded from: classes.dex */
public class MenuBuilder implements SupportMenu {

    /* JADX INFO: renamed from: a */
    public static final int[] f34818a = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: b */
    public final Context f34819b;

    /* JADX INFO: renamed from: c */
    public final Resources f34820c;

    /* JADX INFO: renamed from: d */
    public boolean f34821d;

    /* JADX INFO: renamed from: e */
    public boolean f34822e;

    /* JADX INFO: renamed from: f */
    public a f34823f;

    /* JADX INFO: renamed from: g */
    public ArrayList<MenuItemImpl> f34824g;

    /* JADX INFO: renamed from: h */
    public ArrayList<MenuItemImpl> f34825h;

    /* JADX INFO: renamed from: i */
    public boolean f34826i;

    /* JADX INFO: renamed from: j */
    public ArrayList<MenuItemImpl> f34827j;

    /* JADX INFO: renamed from: k */
    public ArrayList<MenuItemImpl> f34828k;

    /* JADX INFO: renamed from: l */
    public boolean f34829l;

    /* JADX INFO: renamed from: n */
    public CharSequence f34831n;

    /* JADX INFO: renamed from: o */
    public Drawable f34832o;

    /* JADX INFO: renamed from: p */
    public View f34833p;

    /* JADX INFO: renamed from: w */
    public MenuItemImpl f34840w;

    /* JADX INFO: renamed from: y */
    public boolean f34842y;

    /* JADX INFO: renamed from: m */
    public int f34830m = 0;

    /* JADX INFO: renamed from: q */
    public boolean f34834q = false;

    /* JADX INFO: renamed from: r */
    public boolean f34835r = false;

    /* JADX INFO: renamed from: s */
    public boolean f34836s = false;

    /* JADX INFO: renamed from: t */
    public boolean f34837t = false;

    /* JADX INFO: renamed from: u */
    public ArrayList<MenuItemImpl> f34838u = new ArrayList<>();

    /* JADX INFO: renamed from: v */
    public CopyOnWriteArrayList<WeakReference<MenuPresenter>> f34839v = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: x */
    public boolean f34841x = false;

    /* JADX INFO: renamed from: z0.b.g.i.g$a */
    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        boolean mo188a(MenuBuilder menuBuilder, MenuItem menuItem);

        /* JADX INFO: renamed from: b */
        void mo189b(MenuBuilder menuBuilder);
    }

    /* JADX INFO: renamed from: z0.b.g.i.g$b */
    /* JADX INFO: compiled from: MenuBuilder.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        boolean mo150a(MenuItemImpl menuItemImpl);
    }

    public MenuBuilder(Context context) {
        boolean zShouldShowMenuShortcutsWhenKeyboardPresent;
        boolean z = false;
        this.f34819b = context;
        Resources resources = context.getResources();
        this.f34820c = resources;
        this.f34824g = new ArrayList<>();
        this.f34825h = new ArrayList<>();
        this.f34826i = true;
        this.f34827j = new ArrayList<>();
        this.f34828k = new ArrayList<>();
        this.f34829l = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = ViewConfigurationCompat.f38091a;
            if (Build.VERSION.SDK_INT >= 28) {
                zShouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zShouldShowMenuShortcutsWhenKeyboardPresent = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zShouldShowMenuShortcutsWhenKeyboardPresent) {
                z = true;
            }
        }
        this.f34822e = z;
    }

    /* JADX INFO: renamed from: a */
    public MenuItem mo11117a(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = f34818a;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                MenuItemImpl menuItemImpl = new MenuItemImpl(this, i, i2, i3, i6, charSequence, this.f34830m);
                ArrayList<MenuItemImpl> arrayList = this.f34824g;
                int size = arrayList.size();
                do {
                    size--;
                    if (size < 0) {
                        i4 = 0;
                    }
                    arrayList.add(i4, menuItemImpl);
                    m14783q(true);
                    return menuItemImpl;
                } while (arrayList.get(size).f34853d > i6);
                i4 = size + 1;
                arrayList.add(i4, menuItemImpl);
                m14783q(true);
                return menuItemImpl;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return mo11117a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f34819b.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = mo11117a(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* JADX INFO: renamed from: b */
    public void m14768b(MenuPresenter menuPresenter, Context context) {
        this.f34839v.add(new WeakReference<>(menuPresenter));
        menuPresenter.mo245C(context, this);
        this.f34829l = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m14769c(boolean z) {
        if (this.f34837t) {
            return;
        }
        this.f34837t = true;
        for (WeakReference<MenuPresenter> weakReference : this.f34839v) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.f34839v.remove(weakReference);
            } else {
                menuPresenter.mo249c(this, z);
            }
        }
        this.f34837t = false;
    }

    @Override // android.view.Menu
    public void clear() {
        MenuItemImpl menuItemImpl = this.f34840w;
        if (menuItemImpl != null) {
            mo14770d(menuItemImpl);
        }
        this.f34824g.clear();
        m14783q(true);
    }

    public void clearHeader() {
        this.f34832o = null;
        this.f34831n = null;
        this.f34833p = null;
        m14783q(false);
    }

    @Override // android.view.Menu
    public void close() {
        m14769c(true);
    }

    /* JADX INFO: renamed from: d */
    public boolean mo14770d(MenuItemImpl menuItemImpl) {
        boolean zMo253z = false;
        if (!this.f34839v.isEmpty() && this.f34840w == menuItemImpl) {
            m14792z();
            for (WeakReference<MenuPresenter> weakReference : this.f34839v) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter != null) {
                    zMo253z = menuPresenter.mo253z(this, menuItemImpl);
                    if (zMo253z) {
                        break;
                    }
                } else {
                    this.f34839v.remove(weakReference);
                }
            }
            m14791y();
            if (zMo253z) {
                this.f34840w = null;
            }
        }
        return zMo253z;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo14771e(MenuBuilder menuBuilder, MenuItem menuItem) {
        a aVar = this.f34823f;
        return aVar != null && aVar.mo188a(menuBuilder, menuItem);
    }

    /* JADX INFO: renamed from: f */
    public boolean mo14772f(MenuItemImpl menuItemImpl) {
        boolean zMo244A = false;
        if (this.f34839v.isEmpty()) {
            return false;
        }
        m14792z();
        for (WeakReference<MenuPresenter> weakReference : this.f34839v) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter != null) {
                zMo244A = menuPresenter.mo244A(this, menuItemImpl);
                if (zMo244A) {
                    break;
                }
            } else {
                this.f34839v.remove(weakReference);
            }
        }
        m14791y();
        if (zMo244A) {
            this.f34840w = menuItemImpl;
        }
        return zMo244A;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f34824g.get(i2);
            if (menuItemImpl.f34850a == i) {
                return menuItemImpl;
            }
            if (menuItemImpl.hasSubMenu() && (menuItemFindItem = menuItemImpl.f34864o.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public MenuItemImpl m14773g(int i, KeyEvent keyEvent) {
        ArrayList<MenuItemImpl> arrayList = this.f34838u;
        arrayList.clear();
        m14774h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zMo14780n = mo14780n();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = arrayList.get(i2);
            char c2 = zMo14780n ? menuItemImpl.f34859j : menuItemImpl.f34857h;
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (zMo14780n && c2 == '\b' && i == 67))) {
                return menuItemImpl;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f34824g.get(i);
    }

    /* JADX INFO: renamed from: h */
    public void m14774h(List<MenuItemImpl> list, int i, KeyEvent keyEvent) {
        boolean zMo14780n = mo14780n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f34824g.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItemImpl menuItemImpl = this.f34824g.get(i2);
                if (menuItemImpl.hasSubMenu()) {
                    menuItemImpl.f34864o.m14774h(list, i, keyEvent);
                }
                char c2 = zMo14780n ? menuItemImpl.f34859j : menuItemImpl.f34857h;
                if (((modifiers & 69647) == ((zMo14780n ? menuItemImpl.f34860k : menuItemImpl.f34858i) & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (zMo14780n && c2 == '\b' && i == 67)) && menuItemImpl.isEnabled()) {
                        list.add(menuItemImpl);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f34842y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f34824g.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public void m14775i() {
        ArrayList<MenuItemImpl> arrayListM14778l = m14778l();
        if (this.f34829l) {
            boolean zMo252y = false;
            for (WeakReference<MenuPresenter> weakReference : this.f34839v) {
                MenuPresenter menuPresenter = weakReference.get();
                if (menuPresenter == null) {
                    this.f34839v.remove(weakReference);
                } else {
                    zMo252y |= menuPresenter.mo252y();
                }
            }
            if (zMo252y) {
                this.f34827j.clear();
                this.f34828k.clear();
                int size = arrayListM14778l.size();
                for (int i = 0; i < size; i++) {
                    MenuItemImpl menuItemImpl = arrayListM14778l.get(i);
                    if (menuItemImpl.m14797g()) {
                        this.f34827j.add(menuItemImpl);
                    } else {
                        this.f34828k.add(menuItemImpl);
                    }
                }
            } else {
                this.f34827j.clear();
                this.f34828k.clear();
                this.f34828k.addAll(m14778l());
            }
            this.f34829l = false;
        }
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m14773g(i, keyEvent) != null;
    }

    /* JADX INFO: renamed from: j */
    public String mo14776j() {
        return "android:menu:actionviewstates";
    }

    /* JADX INFO: renamed from: k */
    public MenuBuilder mo14777k() {
        return this;
    }

    /* JADX INFO: renamed from: l */
    public ArrayList<MenuItemImpl> m14778l() {
        if (!this.f34826i) {
            return this.f34825h;
        }
        this.f34825h.clear();
        int size = this.f34824g.size();
        for (int i = 0; i < size; i++) {
            MenuItemImpl menuItemImpl = this.f34824g.get(i);
            if (menuItemImpl.isVisible()) {
                this.f34825h.add(menuItemImpl);
            }
        }
        this.f34826i = false;
        this.f34829l = true;
        return this.f34825h;
    }

    /* JADX INFO: renamed from: m */
    public boolean mo14779m() {
        return this.f34841x;
    }

    /* JADX INFO: renamed from: n */
    public boolean mo14780n() {
        return this.f34821d;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo14781o() {
        return this.f34822e;
    }

    /* JADX INFO: renamed from: p */
    public void m14782p() {
        this.f34829l = true;
        m14783q(true);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m14784r(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        MenuItemImpl menuItemImplM14773g = m14773g(i, keyEvent);
        boolean zM14785s = menuItemImplM14773g != null ? m14785s(menuItemImplM14773g, null, i2) : false;
        if ((i2 & 2) != 0) {
            m14769c(true);
        }
        return zM14785s;
    }

    /* JADX INFO: renamed from: q */
    public void m14783q(boolean z) {
        if (this.f34834q) {
            this.f34835r = true;
            if (z) {
                this.f34836s = true;
                return;
            }
            return;
        }
        if (z) {
            this.f34826i = true;
            this.f34829l = true;
        }
        if (this.f34839v.isEmpty()) {
            return;
        }
        m14792z();
        for (WeakReference<MenuPresenter> weakReference : this.f34839v) {
            MenuPresenter menuPresenter = weakReference.get();
            if (menuPresenter == null) {
                this.f34839v.remove(weakReference);
            } else {
                menuPresenter.mo251x(z);
            }
        }
        m14791y();
    }

    /* JADX INFO: renamed from: r */
    public boolean m14784r(MenuItem menuItem, int i) {
        return m14785s(menuItem, null, i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.f34824g.get(i2).f34851b == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.f34824g.size() - i2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size2 || this.f34824g.get(i2).f34851b != i) {
                    break;
                }
                m14786t(i2, false);
                i3 = i4;
            }
            m14783q(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (i2 < size) {
            if (this.f34824g.get(i2).f34850a == i) {
                m14786t(i2, true);
            }
            i2++;
        }
        i2 = -1;
        m14786t(i2, true);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:32:0x004f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:37:0x005d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00aa A[SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public boolean m14785s(MenuItem menuItem, MenuPresenter menuPresenter, int i) {
        ActionProvider actionProvider;
        boolean zExpandActionView;
        ActionProvider actionProvider2;
        boolean z;
        SubMenuBuilder subMenuBuilder;
        MenuPresenter menuPresenter2;
        MenuItemImpl menuItemImpl = (MenuItemImpl) menuItem;
        boolean zMo247E = false;
        if (menuItemImpl == null || !menuItemImpl.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = menuItemImpl.f34865p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(menuItemImpl)) {
            MenuBuilder menuBuilder = menuItemImpl.f34863n;
            if (menuBuilder.mo14771e(menuBuilder, menuItemImpl)) {
                zExpandActionView = true;
            } else {
                Intent intent = menuItemImpl.f34856g;
                if (intent != null) {
                    try {
                        menuItemImpl.f34863n.f34819b.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
                        actionProvider = menuItemImpl.f34846A;
                        if (actionProvider == null) {
                        }
                        zExpandActionView = false;
                        actionProvider2 = menuItemImpl.f34846A;
                        if (actionProvider2 == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (menuItemImpl.m14796f()) {
                            zExpandActionView |= menuItemImpl.expandActionView();
                            if (zExpandActionView) {
                                m14769c(true);
                            }
                        } else if (menuItemImpl.hasSubMenu()) {
                            if ((i & 4) == 0) {
                                m14769c(false);
                            }
                            if (!menuItemImpl.hasSubMenu()) {
                                SubMenuBuilder subMenuBuilder2 = new SubMenuBuilder(this.f34819b, this, menuItemImpl);
                                menuItemImpl.f34864o = subMenuBuilder2;
                                subMenuBuilder2.setHeaderTitle(menuItemImpl.f34854e);
                            }
                            subMenuBuilder = menuItemImpl.f34864o;
                            if (z) {
                                actionProvider2.mo14808f(subMenuBuilder);
                            }
                            if (!this.f34839v.isEmpty()) {
                                if (menuPresenter != null) {
                                }
                                for (WeakReference<MenuPresenter> weakReference : this.f34839v) {
                                    menuPresenter2 = weakReference.get();
                                    if (menuPresenter2 == null) {
                                        this.f34839v.remove(weakReference);
                                    } else if (!zMo247E) {
                                        zMo247E = menuPresenter2.mo247E(subMenuBuilder);
                                    }
                                }
                            }
                            zExpandActionView |= zMo247E;
                            if (!zExpandActionView) {
                                m14769c(true);
                            }
                        } else {
                            if ((i & 4) == 0) {
                                m14769c(false);
                            }
                            if (!menuItemImpl.hasSubMenu()) {
                                SubMenuBuilder subMenuBuilder3 = new SubMenuBuilder(this.f34819b, this, menuItemImpl);
                                menuItemImpl.f34864o = subMenuBuilder3;
                                subMenuBuilder3.setHeaderTitle(menuItemImpl.f34854e);
                            }
                            subMenuBuilder = menuItemImpl.f34864o;
                            if (z) {
                                actionProvider2.mo14808f(subMenuBuilder);
                            }
                            if (!this.f34839v.isEmpty()) {
                                zMo247E = menuPresenter != null ? menuPresenter.mo247E(subMenuBuilder) : false;
                                while (r8.hasNext()) {
                                    menuPresenter2 = weakReference.get();
                                    if (menuPresenter2 == null) {
                                        this.f34839v.remove(weakReference);
                                    } else if (!zMo247E) {
                                        zMo247E = menuPresenter2.mo247E(subMenuBuilder);
                                    }
                                }
                            }
                            zExpandActionView |= zMo247E;
                            if (!zExpandActionView) {
                                m14769c(true);
                            }
                        }
                        return zExpandActionView;
                    }
                    zExpandActionView = true;
                } else {
                    actionProvider = menuItemImpl.f34846A;
                    if (actionProvider == null && actionProvider.mo14807e()) {
                        zExpandActionView = true;
                    } else {
                        zExpandActionView = false;
                    }
                }
            }
        } else {
            zExpandActionView = true;
        }
        actionProvider2 = menuItemImpl.f34846A;
        if (actionProvider2 == null && actionProvider2.mo14805a()) {
            z = true;
        } else {
            z = false;
        }
        if (menuItemImpl.m14796f()) {
            zExpandActionView |= menuItemImpl.expandActionView();
            if (zExpandActionView) {
                m14769c(true);
            }
        } else if (menuItemImpl.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                m14769c(false);
            }
            if (!menuItemImpl.hasSubMenu()) {
                SubMenuBuilder subMenuBuilder4 = new SubMenuBuilder(this.f34819b, this, menuItemImpl);
                menuItemImpl.f34864o = subMenuBuilder4;
                subMenuBuilder4.setHeaderTitle(menuItemImpl.f34854e);
            }
            subMenuBuilder = menuItemImpl.f34864o;
            if (z) {
                actionProvider2.mo14808f(subMenuBuilder);
            }
            if (!this.f34839v.isEmpty()) {
                if (menuPresenter != null) {
                }
                while (r8.hasNext()) {
                    menuPresenter2 = weakReference.get();
                    if (menuPresenter2 == null) {
                        this.f34839v.remove(weakReference);
                    } else if (!zMo247E) {
                        zMo247E = menuPresenter2.mo247E(subMenuBuilder);
                    }
                }
            }
            zExpandActionView |= zMo247E;
            if (!zExpandActionView) {
                m14769c(true);
            }
        } else if ((i & 1) == 0) {
            m14769c(true);
        }
        return zExpandActionView;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f34824g.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f34824g.get(i2);
            if (menuItemImpl.f34851b == i) {
                menuItemImpl.m14801k(z2);
                menuItemImpl.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f34841x = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f34824g.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f34824g.get(i2);
            if (menuItemImpl.f34851b == i) {
                menuItemImpl.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f34824g.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItemImpl menuItemImpl = this.f34824g.get(i2);
            if (menuItemImpl.f34851b == i && menuItemImpl.m14803m(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m14783q(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f34821d = z;
        m14783q(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f34824g.size();
    }

    /* JADX INFO: renamed from: t */
    public final void m14786t(int i, boolean z) {
        if (i < 0 || i >= this.f34824g.size()) {
            return;
        }
        this.f34824g.remove(i);
        if (z) {
            m14783q(true);
        }
    }

    /* JADX INFO: renamed from: u */
    public void m14787u(MenuPresenter menuPresenter) {
        for (WeakReference<MenuPresenter> weakReference : this.f34839v) {
            MenuPresenter menuPresenter2 = weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.f34839v.remove(weakReference);
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m14788v(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo14776j());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).m14788v(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    /* JADX INFO: renamed from: w */
    public void m14789w(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuBuilder) item.getSubMenu()).m14789w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo14776j(), sparseArray);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m14790x(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.f34820c;
        if (view != null) {
            this.f34833p = view;
            this.f34831n = null;
            this.f34832o = null;
        } else {
            if (i > 0) {
                this.f34831n = resources.getText(i);
            } else if (charSequence != null) {
                this.f34831n = charSequence;
            }
            if (i2 > 0) {
                Context context = this.f34819b;
                Object obj = ContextCompat.f37815a;
                this.f34832o = ContextCompat.c.m16141b(context, i2);
            } else if (drawable != null) {
                this.f34832o = drawable;
            }
            this.f34833p = null;
        }
        m14783q(false);
    }

    /* JADX INFO: renamed from: y */
    public void m14791y() {
        this.f34834q = false;
        if (this.f34835r) {
            this.f34835r = false;
            m14783q(this.f34836s);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m14792z() {
        if (this.f34834q) {
            return;
        }
        this.f34834q = true;
        this.f34835r = false;
        this.f34836s = false;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return mo11117a(0, 0, 0, this.f34820c.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f34820c.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo11117a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        MenuItemImpl menuItemImpl = (MenuItemImpl) mo11117a(i, i2, i3, charSequence);
        SubMenuBuilder subMenuBuilder = new SubMenuBuilder(this.f34819b, this, menuItemImpl);
        menuItemImpl.f34864o = subMenuBuilder;
        subMenuBuilder.setHeaderTitle(menuItemImpl.f34854e);
        return subMenuBuilder;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo11117a(i, i2, i3, this.f34820c.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f34820c.getString(i4));
    }
}
