package p636z0.p644b.p651g;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7463b;
import p636z0.p644b.p651g.p652i.MenuItemImpl;
import p636z0.p644b.p651g.p652i.MenuItemWrapperICS;
import p636z0.p644b.p653h.DrawableUtils;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p725k.p733g.p734a.SupportMenu;
import p636z0.p725k.p733g.p734a.SupportMenuItem;
import p636z0.p725k.p739l.ActionProvider;

/* JADX INFO: renamed from: z0.b.g.f, reason: use source file name */
/* JADX INFO: compiled from: SupportMenuInflater.java */
/* JADX INFO: loaded from: classes.dex */
public class SupportMenuInflater extends MenuInflater {

    /* JADX INFO: renamed from: a */
    public static final Class<?>[] f34684a;

    /* JADX INFO: renamed from: b */
    public static final Class<?>[] f34685b;

    /* JADX INFO: renamed from: c */
    public final Object[] f34686c;

    /* JADX INFO: renamed from: d */
    public final Object[] f34687d;

    /* JADX INFO: renamed from: e */
    public Context f34688e;

    /* JADX INFO: renamed from: f */
    public Object f34689f;

    /* JADX INFO: renamed from: z0.b.g.f$a */
    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a */
        public static final Class<?>[] f34690a = {MenuItem.class};

        /* JADX INFO: renamed from: b */
        public Object f34691b;

        /* JADX INFO: renamed from: c */
        public Method f34692c;

        public a(Object obj, String str) {
            this.f34691b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f34692c = cls.getMethod(str, f34690a);
            } catch (Exception e) {
                StringBuilder sbM1562M = outline.m1562M("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM1562M.append(cls.getName());
                InflateException inflateException = new InflateException(sbM1562M.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f34692c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f34692c.invoke(this.f34691b, menuItem)).booleanValue();
                }
                this.f34692c.invoke(this.f34691b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: z0.b.g.f$b */
    /* JADX INFO: compiled from: SupportMenuInflater.java */
    public class b {

        /* JADX INFO: renamed from: A */
        public ActionProvider f34693A;

        /* JADX INFO: renamed from: B */
        public CharSequence f34694B;

        /* JADX INFO: renamed from: C */
        public CharSequence f34695C;

        /* JADX INFO: renamed from: a */
        public Menu f34699a;

        /* JADX INFO: renamed from: h */
        public boolean f34706h;

        /* JADX INFO: renamed from: i */
        public int f34707i;

        /* JADX INFO: renamed from: j */
        public int f34708j;

        /* JADX INFO: renamed from: k */
        public CharSequence f34709k;

        /* JADX INFO: renamed from: l */
        public CharSequence f34710l;

        /* JADX INFO: renamed from: m */
        public int f34711m;

        /* JADX INFO: renamed from: n */
        public char f34712n;

        /* JADX INFO: renamed from: o */
        public int f34713o;

        /* JADX INFO: renamed from: p */
        public char f34714p;

        /* JADX INFO: renamed from: q */
        public int f34715q;

        /* JADX INFO: renamed from: r */
        public int f34716r;

        /* JADX INFO: renamed from: s */
        public boolean f34717s;

        /* JADX INFO: renamed from: t */
        public boolean f34718t;

        /* JADX INFO: renamed from: u */
        public boolean f34719u;

        /* JADX INFO: renamed from: v */
        public int f34720v;

        /* JADX INFO: renamed from: w */
        public int f34721w;

        /* JADX INFO: renamed from: x */
        public String f34722x;

        /* JADX INFO: renamed from: y */
        public String f34723y;

        /* JADX INFO: renamed from: z */
        public String f34724z;

        /* JADX INFO: renamed from: D */
        public ColorStateList f34696D = null;

        /* JADX INFO: renamed from: E */
        public PorterDuff.Mode f34697E = null;

        /* JADX INFO: renamed from: b */
        public int f34700b = 0;

        /* JADX INFO: renamed from: c */
        public int f34701c = 0;

        /* JADX INFO: renamed from: d */
        public int f34702d = 0;

        /* JADX INFO: renamed from: e */
        public int f34703e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f34704f = true;

        /* JADX INFO: renamed from: g */
        public boolean f34705g = true;

        public b(Menu menu) {
            this.f34699a = menu;
        }

        /* JADX INFO: renamed from: a */
        public SubMenu m14734a() {
            this.f34706h = true;
            SubMenu subMenuAddSubMenu = this.f34699a.addSubMenu(this.f34700b, this.f34707i, this.f34708j, this.f34709k);
            m14736c(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        /* JADX INFO: renamed from: b */
        public final <T> T m14735b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.f34688e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m14736c(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f34717s).setVisible(this.f34718t).setEnabled(this.f34719u).setCheckable(this.f34716r >= 1).setTitleCondensed(this.f34710l).setIcon(this.f34711m);
            int i = this.f34720v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f34724z != null) {
                if (SupportMenuInflater.this.f34688e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
                if (supportMenuInflater.f34689f == null) {
                    supportMenuInflater.f34689f = supportMenuInflater.m14732a(supportMenuInflater.f34688e);
                }
                menuItem.setOnMenuItemClickListener(new a(supportMenuInflater.f34689f, this.f34724z));
            }
            if (this.f34716r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).m14801k(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    try {
                        if (menuItemWrapperICS.f34878e == null) {
                            menuItemWrapperICS.f34878e = menuItemWrapperICS.f34877d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.f34878e.invoke(menuItemWrapperICS.f34877d, Boolean.TRUE);
                    } catch (Exception e) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
                    }
                }
            }
            String str = this.f34722x;
            if (str != null) {
                menuItem.setActionView((View) m14735b(str, SupportMenuInflater.f34684a, SupportMenuInflater.this.f34686c));
                z = true;
            }
            int i2 = this.f34721w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            ActionProvider actionProvider = this.f34693A;
            if (actionProvider != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).mo14739a(actionProvider);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f34694B;
            boolean z2 = menuItem instanceof SupportMenuItem;
            if (z2) {
                ((SupportMenuItem) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.f34695C;
            if (z2) {
                ((SupportMenuItem) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.f34712n;
            int i3 = this.f34713o;
            if (z2) {
                ((SupportMenuItem) menuItem).setAlphabeticShortcut(c2, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i3);
            }
            char c3 = this.f34714p;
            int i4 = this.f34715q;
            if (z2) {
                ((SupportMenuItem) menuItem).setNumericShortcut(c3, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i4);
            }
            PorterDuff.Mode mode = this.f34697E;
            if (mode != null) {
                if (z2) {
                    ((SupportMenuItem) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.f34696D;
            if (colorStateList != null) {
                if (z2) {
                    ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f34684a = clsArr;
        f34685b = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.f34688e = context;
        Object[] objArr = {context};
        this.f34686c = objArr;
        this.f34687d = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final Object m14732a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m14732a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00e9  */
    /* JADX INFO: renamed from: b */
    public final void m14733b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(outline.m1599u("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.f34700b = 0;
                        bVar.f34701c = 0;
                        bVar.f34702d = 0;
                        bVar.f34703e = 0;
                        bVar.f34704f = true;
                        bVar.f34705g = true;
                    } else if (name2.equals("item")) {
                        if (!bVar.f34706h) {
                            ActionProvider actionProvider = bVar.f34693A;
                            if (actionProvider == null || !actionProvider.mo14805a()) {
                                bVar.f34706h = true;
                                bVar.m14736c(bVar.f34699a.add(bVar.f34700b, bVar.f34707i, bVar.f34708j, bVar.f34709k));
                            } else {
                                bVar.m14734a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray typedArrayObtainStyledAttributes = SupportMenuInflater.this.f34688e.obtainStyledAttributes(attributeSet, C7463b.f34399o);
                    bVar.f34700b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    bVar.f34701c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    bVar.f34702d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    bVar.f34703e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    bVar.f34704f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    bVar.f34705g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    TintTypedArray tintTypedArrayM14997q = TintTypedArray.m14997q(SupportMenuInflater.this.f34688e, attributeSet, C7463b.f34400p);
                    bVar.f34707i = tintTypedArrayM14997q.m15011m(2, 0);
                    bVar.f34708j = (tintTypedArrayM14997q.m15008j(5, bVar.f34701c) & (-65536)) | (tintTypedArrayM14997q.m15008j(6, bVar.f34702d) & 65535);
                    bVar.f34709k = tintTypedArrayM14997q.m15013o(7);
                    bVar.f34710l = tintTypedArrayM14997q.m15013o(8);
                    bVar.f34711m = tintTypedArrayM14997q.m15011m(0, 0);
                    String strM15012n = tintTypedArrayM14997q.m15012n(9);
                    bVar.f34712n = strM15012n == null ? (char) 0 : strM15012n.charAt(0);
                    bVar.f34713o = tintTypedArrayM14997q.m15008j(16, 4096);
                    String strM15012n2 = tintTypedArrayM14997q.m15012n(10);
                    bVar.f34714p = strM15012n2 == null ? (char) 0 : strM15012n2.charAt(0);
                    bVar.f34715q = tintTypedArrayM14997q.m15008j(20, 4096);
                    if (tintTypedArrayM14997q.m15014p(11)) {
                        bVar.f34716r = tintTypedArrayM14997q.m14999a(11, false) ? 1 : 0;
                    } else {
                        bVar.f34716r = bVar.f34703e;
                    }
                    bVar.f34717s = tintTypedArrayM14997q.m14999a(3, false);
                    bVar.f34718t = tintTypedArrayM14997q.m14999a(4, bVar.f34704f);
                    bVar.f34719u = tintTypedArrayM14997q.m14999a(1, bVar.f34705g);
                    bVar.f34720v = tintTypedArrayM14997q.m15008j(21, -1);
                    bVar.f34724z = tintTypedArrayM14997q.m15012n(12);
                    bVar.f34721w = tintTypedArrayM14997q.m15011m(13, 0);
                    bVar.f34722x = tintTypedArrayM14997q.m15012n(15);
                    String strM15012n3 = tintTypedArrayM14997q.m15012n(14);
                    bVar.f34723y = strM15012n3;
                    boolean z3 = strM15012n3 != null;
                    if (z3 && bVar.f34721w == 0 && bVar.f34722x == null) {
                        bVar.f34693A = (ActionProvider) bVar.m14735b(strM15012n3, f34685b, SupportMenuInflater.this.f34687d);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.f34693A = null;
                    }
                    bVar.f34694B = tintTypedArrayM14997q.m15013o(17);
                    bVar.f34695C = tintTypedArrayM14997q.m15013o(22);
                    if (tintTypedArrayM14997q.m15014p(19)) {
                        bVar.f34697E = DrawableUtils.m14887c(tintTypedArrayM14997q.m15008j(19, -1), bVar.f34697E);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar.f34697E = null;
                    }
                    if (tintTypedArrayM14997q.m15014p(18)) {
                        bVar.f34696D = tintTypedArrayM14997q.m15001c(18);
                    } else {
                        bVar.f34696D = colorStateList;
                    }
                    tintTypedArrayM14997q.f35267b.recycle();
                    bVar.f34706h = false;
                } else if (name3.equals("menu")) {
                    m14733b(xmlPullParser, attributeSet, bVar.m14734a());
                } else {
                    z2 = true;
                    str = name3;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f34688e.getResources().getLayout(i);
                    m14733b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (XmlPullParserException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
