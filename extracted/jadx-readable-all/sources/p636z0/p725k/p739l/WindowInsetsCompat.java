package p636z0.p725k.p739l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p725k.p729e.Insets;

/* JADX INFO: renamed from: z0.k.l.a0, reason: use source file name */
/* JADX INFO: compiled from: WindowInsetsCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {

    /* JADX INFO: renamed from: a */
    public static final WindowInsetsCompat f37980a;

    /* JADX INFO: renamed from: b */
    public final l f37981b;

    /* JADX INFO: renamed from: z0.k.l.a0$a */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static Field f37982a;

        /* JADX INFO: renamed from: b */
        public static Field f37983b;

        /* JADX INFO: renamed from: c */
        public static Field f37984c;

        /* JADX INFO: renamed from: d */
        public static boolean f37985d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f37982a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f37983b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f37984c = declaredField3;
                declaredField3.setAccessible(true);
                f37985d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sbM1556G = outline.m1556G("Failed to get visible insets from AttachInfo ");
                sbM1556G.append(e.getMessage());
                Log.w("WindowInsetsCompat", sbM1556G.toString(), e);
            }
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$e */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class e extends d {
        public e() {
        }

        public e(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$f */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final WindowInsetsCompat f37994a;

        public f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* JADX INFO: renamed from: a */
        public final void m16238a() {
        }

        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo16235b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo16236c(Insets insets) {
            throw null;
        }

        /* JADX INFO: renamed from: d */
        public void mo16237d(Insets insets) {
            throw null;
        }

        public f(WindowInsetsCompat windowInsetsCompat) {
            this.f37994a = windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$i */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class i extends h {
        public i(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo16254a() {
            return WindowInsetsCompat.m16224i(this.f38001i.consumeDisplayCutout());
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.g, p636z0.p725k.p739l.WindowInsetsCompat.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f38001i, iVar.f38001i) && Objects.equals(this.f38005m, iVar.f38005m);
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: f */
        public DisplayCutoutCompat mo16255f() {
            DisplayCutout displayCutout = this.f38001i.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutout);
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        public int hashCode() {
            return this.f38001i.hashCode();
        }

        public i(WindowInsetsCompat windowInsetsCompat, i iVar) {
            super(windowInsetsCompat, iVar);
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$k */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class k extends j {

        /* JADX INFO: renamed from: r */
        public static final WindowInsetsCompat f38010r = WindowInsetsCompat.m16224i(WindowInsets.CONSUMED);

        public k(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.g, p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: d */
        public final void mo16240d(View view) {
        }

        public k(WindowInsetsCompat windowInsetsCompat, k kVar) {
            super(windowInsetsCompat, kVar);
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$l */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class l {

        /* JADX INFO: renamed from: a */
        public static final WindowInsetsCompat f38011a = new b().m16233a().f37981b.mo16254a().f37981b.mo16249b().m16226a();

        /* JADX INFO: renamed from: b */
        public final WindowInsetsCompat f38012b;

        public l(WindowInsetsCompat windowInsetsCompat) {
            this.f38012b = windowInsetsCompat;
        }

        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat mo16254a() {
            return this.f38012b;
        }

        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo16249b() {
            return this.f38012b;
        }

        /* JADX INFO: renamed from: c */
        public WindowInsetsCompat mo16250c() {
            return this.f38012b;
        }

        /* JADX INFO: renamed from: d */
        public void mo16240d(View view) {
        }

        /* JADX INFO: renamed from: e */
        public void mo16241e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return mo16244l() == lVar.mo16244l() && mo16252k() == lVar.mo16252k() && Objects.equals(mo16242i(), lVar.mo16242i()) && Objects.equals(mo16251h(), lVar.mo16251h()) && Objects.equals(mo16255f(), lVar.mo16255f());
        }

        /* JADX INFO: renamed from: f */
        public DisplayCutoutCompat mo16255f() {
            return null;
        }

        /* JADX INFO: renamed from: g */
        public Insets mo16256g() {
            return mo16242i();
        }

        /* JADX INFO: renamed from: h */
        public Insets mo16251h() {
            return Insets.f37850a;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(mo16244l()), Boolean.valueOf(mo16252k()), mo16242i(), mo16251h(), mo16255f());
        }

        /* JADX INFO: renamed from: i */
        public Insets mo16242i() {
            return Insets.f37850a;
        }

        /* JADX INFO: renamed from: j */
        public WindowInsetsCompat mo16243j(int i, int i2, int i3, int i4) {
            return f38011a;
        }

        /* JADX INFO: renamed from: k */
        public boolean mo16252k() {
            return false;
        }

        /* JADX INFO: renamed from: l */
        public boolean mo16244l() {
            return false;
        }

        /* JADX INFO: renamed from: m */
        public void mo16245m(Insets[] insetsArr) {
        }

        /* JADX INFO: renamed from: n */
        public void mo16246n(Insets insets) {
        }

        /* JADX INFO: renamed from: o */
        public void mo16247o(WindowInsetsCompat windowInsetsCompat) {
        }

        /* JADX INFO: renamed from: p */
        public void mo16253p(Insets insets) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f37980a = k.f38010r;
        } else {
            f37980a = l.f38011a;
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f37981b = new k(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f37981b = new j(this, windowInsets);
        } else if (i2 >= 28) {
            this.f37981b = new i(this, windowInsets);
        } else {
            this.f37981b = new h(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: f */
    public static Insets m16223f(Insets insets, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, insets.f37851b - i2);
        int iMax2 = Math.max(0, insets.f37852c - i3);
        int iMax3 = Math.max(0, insets.f37853d - i4);
        int iMax4 = Math.max(0, insets.f37854e - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? insets : Insets.m16166a(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: i */
    public static WindowInsetsCompat m16224i(WindowInsets windowInsets) {
        return m16225j(windowInsets, null);
    }

    /* JADX INFO: renamed from: j */
    public static WindowInsetsCompat m16225j(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            windowInsetsCompat.f37981b.mo16247o(Build.VERSION.SDK_INT >= 23 ? ViewCompat.d.m16337a(view) : ViewCompat.c.m16335c(view));
            windowInsetsCompat.f37981b.mo16240d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public WindowInsetsCompat m16226a() {
        return this.f37981b.mo16250c();
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public int m16227b() {
        return this.f37981b.mo16242i().f37854e;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public int m16228c() {
        return this.f37981b.mo16242i().f37851b;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public int m16229d() {
        return this.f37981b.mo16242i().f37853d;
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public int m16230e() {
        return this.f37981b.mo16242i().f37852c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return Objects.equals(this.f37981b, ((WindowInsetsCompat) obj).f37981b);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16231g() {
        return this.f37981b.mo16252k();
    }

    /* JADX INFO: renamed from: h */
    public WindowInsets m16232h() {
        l lVar = this.f37981b;
        if (lVar instanceof g) {
            return ((g) lVar).f38001i;
        }
        return null;
    }

    public int hashCode() {
        l lVar = this.f37981b;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    /* JADX INFO: renamed from: z0.k.l.a0$c */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class c extends f {

        /* JADX INFO: renamed from: b */
        public static Field f37987b = null;

        /* JADX INFO: renamed from: c */
        public static boolean f37988c = false;

        /* JADX INFO: renamed from: d */
        public static Constructor<WindowInsets> f37989d = null;

        /* JADX INFO: renamed from: e */
        public static boolean f37990e = false;

        /* JADX INFO: renamed from: f */
        public WindowInsets f37991f;

        /* JADX INFO: renamed from: g */
        public Insets f37992g;

        public c() {
            this.f37991f = m16234e();
        }

        /* JADX INFO: renamed from: e */
        public static WindowInsets m16234e() {
            if (!f37988c) {
                try {
                    f37987b = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f37988c = true;
            }
            Field field = f37987b;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f37990e) {
                try {
                    f37989d = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f37990e = true;
            }
            Constructor<WindowInsets> constructor = f37989d;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.f
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo16235b() {
            m16238a();
            WindowInsetsCompat windowInsetsCompatM16224i = WindowInsetsCompat.m16224i(this.f37991f);
            windowInsetsCompatM16224i.f37981b.mo16245m(null);
            windowInsetsCompatM16224i.f37981b.mo16253p(this.f37992g);
            return windowInsetsCompatM16224i;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.f
        /* JADX INFO: renamed from: c */
        public void mo16236c(Insets insets) {
            this.f37992g = insets;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.f
        /* JADX INFO: renamed from: d */
        public void mo16237d(Insets insets) {
            WindowInsets windowInsets = this.f37991f;
            if (windowInsets != null) {
                this.f37991f = windowInsets.replaceSystemWindowInsets(insets.f37851b, insets.f37852c, insets.f37853d, insets.f37854e);
            }
        }

        public c(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f37991f = windowInsetsCompat.m16232h();
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$d */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class d extends f {

        /* JADX INFO: renamed from: b */
        public final WindowInsets.Builder f37993b;

        public d() {
            this.f37993b = new WindowInsets.Builder();
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.f
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo16235b() {
            m16238a();
            WindowInsetsCompat windowInsetsCompatM16224i = WindowInsetsCompat.m16224i(this.f37993b.build());
            windowInsetsCompatM16224i.f37981b.mo16245m(null);
            return windowInsetsCompatM16224i;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.f
        /* JADX INFO: renamed from: c */
        public void mo16236c(Insets insets) {
            this.f37993b.setStableInsets(insets.m16168c());
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.f
        /* JADX INFO: renamed from: d */
        public void mo16237d(Insets insets) {
            this.f37993b.setSystemWindowInsets(insets.m16168c());
        }

        public d(WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builder;
            super(windowInsetsCompat);
            WindowInsets windowInsetsM16232h = windowInsetsCompat.m16232h();
            if (windowInsetsM16232h != null) {
                builder = new WindowInsets.Builder(windowInsetsM16232h);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f37993b = builder;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$h */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class h extends g {

        /* JADX INFO: renamed from: n */
        public Insets f38006n;

        public h(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f38006n = null;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: b */
        public WindowInsetsCompat mo16249b() {
            return WindowInsetsCompat.m16224i(this.f38001i.consumeStableInsets());
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: c */
        public WindowInsetsCompat mo16250c() {
            return WindowInsetsCompat.m16224i(this.f38001i.consumeSystemWindowInsets());
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: h */
        public final Insets mo16251h() {
            if (this.f38006n == null) {
                this.f38006n = Insets.m16166a(this.f38001i.getStableInsetLeft(), this.f38001i.getStableInsetTop(), this.f38001i.getStableInsetRight(), this.f38001i.getStableInsetBottom());
            }
            return this.f38006n;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: k */
        public boolean mo16252k() {
            return this.f38001i.isConsumed();
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: p */
        public void mo16253p(Insets insets) {
            this.f38006n = insets;
        }

        public h(WindowInsetsCompat windowInsetsCompat, h hVar) {
            super(windowInsetsCompat, hVar);
            this.f38006n = null;
            this.f38006n = hVar.f38006n;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$g */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class g extends l {

        /* JADX INFO: renamed from: c */
        public static boolean f37995c = false;

        /* JADX INFO: renamed from: d */
        public static Method f37996d;

        /* JADX INFO: renamed from: e */
        public static Class<?> f37997e;

        /* JADX INFO: renamed from: f */
        public static Class<?> f37998f;

        /* JADX INFO: renamed from: g */
        public static Field f37999g;

        /* JADX INFO: renamed from: h */
        public static Field f38000h;

        /* JADX INFO: renamed from: i */
        public final WindowInsets f38001i;

        /* JADX INFO: renamed from: j */
        public Insets[] f38002j;

        /* JADX INFO: renamed from: k */
        public Insets f38003k;

        /* JADX INFO: renamed from: l */
        public WindowInsetsCompat f38004l;

        /* JADX INFO: renamed from: m */
        public Insets f38005m;

        public g(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f38003k = null;
            this.f38001i = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: r */
        public static void m16239r() {
            try {
                f37996d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f37997e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f37998f = cls;
                f37999g = cls.getDeclaredField("mVisibleInsets");
                f38000h = f37997e.getDeclaredField("mAttachInfo");
                f37999g.setAccessible(true);
                f38000h.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sbM1556G = outline.m1556G("Failed to get visible insets. (Reflection error). ");
                sbM1556G.append(e.getMessage());
                Log.e("WindowInsetsCompat", sbM1556G.toString(), e);
            }
            f37995c = true;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: d */
        public void mo16240d(View view) {
            Insets insetsM16248q = m16248q(view);
            if (insetsM16248q == null) {
                insetsM16248q = Insets.f37850a;
            }
            mo16246n(insetsM16248q);
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: e */
        public void mo16241e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.f37981b.mo16247o(this.f38004l);
            windowInsetsCompat.f37981b.mo16246n(this.f38005m);
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f38005m, ((g) obj).f38005m);
            }
            return false;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: i */
        public final Insets mo16242i() {
            if (this.f38003k == null) {
                this.f38003k = Insets.m16166a(this.f38001i.getSystemWindowInsetLeft(), this.f38001i.getSystemWindowInsetTop(), this.f38001i.getSystemWindowInsetRight(), this.f38001i.getSystemWindowInsetBottom());
            }
            return this.f38003k;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: j */
        public WindowInsetsCompat mo16243j(int i, int i2, int i3, int i4) {
            b bVar = new b(WindowInsetsCompat.m16224i(this.f38001i));
            bVar.f37986a.mo16237d(WindowInsetsCompat.m16223f(mo16242i(), i, i2, i3, i4));
            bVar.f37986a.mo16236c(WindowInsetsCompat.m16223f(mo16251h(), i, i2, i3, i4));
            return bVar.m16233a();
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: l */
        public boolean mo16244l() {
            return this.f38001i.isRound();
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: m */
        public void mo16245m(Insets[] insetsArr) {
            this.f38002j = insetsArr;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: n */
        public void mo16246n(Insets insets) {
            this.f38005m = insets;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: o */
        public void mo16247o(WindowInsetsCompat windowInsetsCompat) {
            this.f38004l = windowInsetsCompat;
        }

        /* JADX INFO: renamed from: q */
        public final Insets m16248q(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f37995c) {
                m16239r();
            }
            Method method = f37996d;
            if (method != null && f37998f != null && f37999g != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f37999g.get(f38000h.get(objInvoke));
                    if (rect != null) {
                        return Insets.m16166a(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    StringBuilder sbM1556G = outline.m1556G("Failed to get visible insets. (Reflection error). ");
                    sbM1556G.append(e.getMessage());
                    Log.e("WindowInsetsCompat", sbM1556G.toString(), e);
                }
            }
            return null;
        }

        public g(WindowInsetsCompat windowInsetsCompat, g gVar) {
            this(windowInsetsCompat, new WindowInsets(gVar.f38001i));
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$j */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static class j extends i {

        /* JADX INFO: renamed from: o */
        public Insets f38007o;

        /* JADX INFO: renamed from: p */
        public Insets f38008p;

        /* JADX INFO: renamed from: q */
        public Insets f38009q;

        public j(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f38007o = null;
            this.f38008p = null;
            this.f38009q = null;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: g */
        public Insets mo16256g() {
            if (this.f38008p == null) {
                this.f38008p = Insets.m16167b(this.f38001i.getMandatorySystemGestureInsets());
            }
            return this.f38008p;
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.g, p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: j */
        public WindowInsetsCompat mo16243j(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.m16224i(this.f38001i.inset(i, i2, i3, i4));
        }

        @Override // p636z0.p725k.p739l.WindowInsetsCompat.h, p636z0.p725k.p739l.WindowInsetsCompat.l
        /* JADX INFO: renamed from: p */
        public void mo16253p(Insets insets) {
        }

        public j(WindowInsetsCompat windowInsetsCompat, j jVar) {
            super(windowInsetsCompat, jVar);
            this.f38007o = null;
            this.f38008p = null;
            this.f38009q = null;
        }
    }

    /* JADX INFO: renamed from: z0.k.l.a0$b */
    /* JADX INFO: compiled from: WindowInsetsCompat.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final f f37986a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f37986a = new e();
            } else if (i >= 29) {
                this.f37986a = new d();
            } else {
                this.f37986a = new c();
            }
        }

        /* JADX INFO: renamed from: a */
        public WindowInsetsCompat m16233a() {
            return this.f37986a.mo16235b();
        }

        public b(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f37986a = new e(windowInsetsCompat);
            } else if (i >= 29) {
                this.f37986a = new d(windowInsetsCompat);
            } else {
                this.f37986a = new c(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            l lVar = windowInsetsCompat.f37981b;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30 && (lVar instanceof k)) {
                this.f37981b = new k(this, (k) lVar);
            } else if (i2 >= 29 && (lVar instanceof j)) {
                this.f37981b = new j(this, (j) lVar);
            } else if (i2 >= 28 && (lVar instanceof i)) {
                this.f37981b = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f37981b = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f37981b = new g(this, (g) lVar);
            } else {
                this.f37981b = new l(this);
            }
            lVar.mo16241e(this);
            return;
        }
        this.f37981b = new l(this);
    }
}
