package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2281m0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2295r0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class jp2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f */
    public static final long f15686f = ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14221L0)).longValue();

    /* JADX INFO: renamed from: g */
    public final Context f15687g;

    /* JADX INFO: renamed from: h */
    public Application f15688h;

    /* JADX INFO: renamed from: i */
    public final WindowManager f15689i;

    /* JADX INFO: renamed from: j */
    public final PowerManager f15690j;

    /* JADX INFO: renamed from: k */
    public final KeyguardManager f15691k;

    /* JADX INFO: renamed from: l */
    public BroadcastReceiver f15692l;

    /* JADX INFO: renamed from: m */
    public WeakReference<ViewTreeObserver> f15693m;

    /* JADX INFO: renamed from: n */
    public final WeakReference<View> f15694n;

    /* JADX INFO: renamed from: o */
    public vp2 f15695o;

    /* JADX INFO: renamed from: p */
    public final C2281m0 f15696p = new C2281m0(f15686f);

    /* JADX INFO: renamed from: q */
    public boolean f15697q = false;

    /* JADX INFO: renamed from: r */
    public int f15698r = -1;

    /* JADX INFO: renamed from: s */
    public final HashSet<ip2> f15699s = new HashSet<>();

    /* JADX INFO: renamed from: t */
    public final DisplayMetrics f15700t;

    /* JADX INFO: renamed from: u */
    public final Rect f15701u;

    public jp2(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f15687g = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f15689i = windowManager;
        this.f15690j = (PowerManager) applicationContext.getSystemService("power");
        this.f15691k = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f15688h = application;
            this.f15695o = new vp2(application, this);
        }
        this.f15700t = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.f15701u = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f15694n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m7386h(view2);
        }
        this.f15694n = new WeakReference<>(view);
        if (view != null) {
            if (C2330u.f10884a.f10891f.mo4718g(view)) {
                m7385g(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7379a(ip2 ip2Var) {
        this.f15699s.add(ip2Var);
        m7383e(3);
    }

    /* JADX INFO: renamed from: b */
    public final Rect m7380b(Rect rect) {
        return new Rect(m7384f(rect.left), m7384f(rect.top), m7384f(rect.right), m7384f(rect.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final void m7381c() {
        C2267h1.f10713a.post(new Runnable(this) { // from class: c.n.b.d.j.a.fp2

            /* JADX INFO: renamed from: f */
            public final jp2 f14091f;

            {
                this.f14091f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f14091f.m7383e(3);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m7382d(Activity activity, int i) {
        Window window;
        if (this.f15694n == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.f15694n.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f15698r = i;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00f9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m7383e(int i) {
        WeakReference<View> weakReference;
        View view;
        boolean z;
        boolean z2;
        ?? EmptyList;
        boolean z3;
        if (this.f15699s.size() == 0 || (weakReference = this.f15694n) == null) {
            return;
        }
        View view2 = weakReference.get();
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        if (view2 != null) {
            boolean globalVisibleRect = view2.getGlobalVisibleRect(rect2);
            boolean localVisibleRect = view2.getLocalVisibleRect(rect3);
            view2.getHitRect(rect4);
            try {
                view2.getLocationOnScreen(iArr);
                view2.getLocationInWindow(iArr2);
            } catch (Exception e) {
                C2622l.m5438t3("Failure getting view location.", e);
            }
            int i2 = iArr[0];
            rect.left = i2;
            rect.top = iArr[1];
            rect.right = view2.getWidth() + i2;
            rect.bottom = view2.getHeight() + rect.top;
            view = view2;
            z = globalVisibleRect;
            z2 = localVisibleRect;
        } else {
            view = null;
            z = false;
            z2 = false;
        }
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14239O0)).booleanValue() || view == null) {
            EmptyList = Collections.emptyList();
        } else {
            try {
                EmptyList = new ArrayList();
                for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                    View view3 = (View) parent;
                    Rect rect5 = new Rect();
                    if (view3.isScrollContainer() && view3.getGlobalVisibleRect(rect5)) {
                        EmptyList.add(m7380b(rect5));
                    }
                }
            } catch (Exception e2) {
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e2, "PositionWatcher.getParentScrollViewRects");
                EmptyList = Collections.emptyList();
            }
        }
        ?? r26 = EmptyList;
        int windowVisibility = view != null ? view.getWindowVisibility() : 8;
        int i3 = this.f15698r;
        if (i3 != -1) {
            windowVisibility = i3;
        }
        if (view2 != null) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            if (C2267h1.m4758q(view, this.f15690j, this.f15691k) && z && z2 && windowVisibility == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (i == 1 && !this.f15696p.m4790a() && z3 == this.f15697q) {
            return;
        }
        if (z3 || this.f15697q || i != 1) {
            C2330u c2330u = C2330u.f10884a;
            hp2 hp2Var = new hp2(c2330u.f10896k.mo5621a(), this.f15690j.isScreenOn(), view != null && c2330u.f10891f.mo4718g(view), view != null ? view.getWindowVisibility() : 8, m7380b(this.f15701u), m7380b(rect), m7380b(rect2), z, m7380b(rect3), z2, m7380b(rect4), this.f15700t.density, z3, r26);
            Iterator<ip2> it = this.f15699s.iterator();
            while (it.hasNext()) {
                it.next().mo6352q0(hp2Var);
            }
            this.f15697q = z3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m7384f(int i) {
        return (int) (i / this.f15700t.density);
    }

    /* JADX INFO: renamed from: g */
    public final void m7385g(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f15693m = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f15692l == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            gp2 gp2Var = new gp2(this);
            this.f15692l = gp2Var;
            C2295r0 c2295r0 = C2330u.f10884a.f10911z;
            Context context = this.f15687g;
            synchronized (c2295r0) {
                if (c2295r0.f10772d) {
                    c2295r0.f10770b.put(gp2Var, intentFilter);
                } else {
                    context.registerReceiver(gp2Var, intentFilter);
                }
            }
        }
        Application application = this.f15688h;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f15695o);
            } catch (Exception e) {
                C2622l.m5438t3("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7386h(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f15693m;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f15693m = null;
            }
        } catch (Exception e) {
            C2622l.m5438t3("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            C2622l.m5438t3("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        BroadcastReceiver broadcastReceiver = this.f15692l;
        if (broadcastReceiver != null) {
            try {
                C2330u.f10884a.f10911z.m4800b(this.f15687g, broadcastReceiver);
            } catch (IllegalStateException e3) {
                C2622l.m5438t3("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                C2998en c2998en = C2330u.f10884a.f10893h;
                C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f15692l = null;
        }
        Application application = this.f15688h;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f15695o);
            } catch (Exception e5) {
                C2622l.m5438t3("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m7382d(activity, 0);
        m7383e(3);
        m7381c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m7383e(3);
        m7381c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m7382d(activity, 4);
        m7383e(3);
        m7381c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m7382d(activity, 0);
        m7383e(3);
        m7381c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m7383e(3);
        m7381c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m7382d(activity, 0);
        m7383e(3);
        m7381c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m7383e(3);
        m7381c();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m7383e(2);
        m7381c();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m7383e(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f15698r = -1;
        m7385g(view);
        m7383e(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f15698r = -1;
        m7383e(3);
        m7381c();
        m7386h(view);
    }
}
