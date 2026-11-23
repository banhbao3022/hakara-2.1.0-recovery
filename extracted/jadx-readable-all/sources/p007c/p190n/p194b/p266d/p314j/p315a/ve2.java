package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ve2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f */
    public static final Handler f20742f = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: g */
    public final Context f20743g;

    /* JADX INFO: renamed from: h */
    public Application f20744h;

    /* JADX INFO: renamed from: i */
    public final PowerManager f20745i;

    /* JADX INFO: renamed from: j */
    public final KeyguardManager f20746j;

    /* JADX INFO: renamed from: k */
    public BroadcastReceiver f20747k;

    /* JADX INFO: renamed from: l */
    public final he2 f20748l;

    /* JADX INFO: renamed from: m */
    public WeakReference<ViewTreeObserver> f20749m;

    /* JADX INFO: renamed from: n */
    public WeakReference<View> f20750n;

    /* JADX INFO: renamed from: o */
    public ee2 f20751o;

    /* JADX INFO: renamed from: p */
    public byte f20752p = -1;

    /* JADX INFO: renamed from: q */
    public int f20753q = -1;

    /* JADX INFO: renamed from: r */
    public long f20754r = -3;

    public ve2(Context context, he2 he2Var) {
        Context applicationContext = context.getApplicationContext();
        this.f20743g = applicationContext;
        this.f20748l = he2Var;
        this.f20745i = (PowerManager) applicationContext.getSystemService("power");
        this.f20746j = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f20744h = application;
            this.f20751o = new ee2(application, this);
        }
        m8546a(null);
    }

    /* JADX INFO: renamed from: a */
    public final void m8546a(View view) {
        long j2;
        View viewM8547b = m8547b();
        if (viewM8547b != null) {
            viewM8547b.removeOnAttachStateChangeListener(this);
            m8552g(viewM8547b);
        }
        this.f20750n = new WeakReference<>(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                m8551f(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.f20754r = j2;
    }

    /* JADX INFO: renamed from: b */
    public final View m8547b() {
        WeakReference<View> weakReference = this.f20750n;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final long m8548c() {
        if (this.f20754r <= -2 && m8547b() == null) {
            this.f20754r = -3L;
        }
        return this.f20754r;
    }

    /* JADX INFO: renamed from: d */
    public final void m8549d(Activity activity, int i) {
        Window window;
        if (this.f20750n == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewM8547b = m8547b();
        if (viewM8547b == null || viewPeekDecorView == null || viewM8547b.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.f20753q = i;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX INFO: renamed from: e */
    public final void m8550e() {
        Activity activity;
        if (this.f20750n == null) {
            return;
        }
        View viewM8547b = m8547b();
        if (viewM8547b == null) {
            this.f20754r = -3L;
            this.f20752p = (byte) -1;
            return;
        }
        int i = 0;
        int i2 = viewM8547b.getVisibility() != 0 ? 1 : 0;
        if (!viewM8547b.isShown()) {
            i2 |= 2;
        }
        PowerManager powerManager = this.f20745i;
        if (powerManager != null && !powerManager.isScreenOn()) {
            i2 |= 4;
        }
        if (!this.f20748l.f14830a) {
            KeyguardManager keyguardManager = this.f20746j;
            if (keyguardManager == null || !keyguardManager.inKeyguardRestrictedInputMode()) {
                i2 |= 8;
            } else {
                int i3 = re2.f18761a;
                View rootView = viewM8547b.getRootView();
                if (rootView == null) {
                    rootView = viewM8547b;
                }
                Context context = rootView.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper) || i >= 10) {
                        activity = null;
                        break;
                    } else if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                        i++;
                    }
                }
                if (activity != null) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes == null || (attributes.flags & 524288) == 0) {
                        i2 |= 8;
                    }
                } else {
                    i2 |= 8;
                }
            }
        }
        if (!viewM8547b.getGlobalVisibleRect(new Rect())) {
            i2 |= 16;
        }
        if (!viewM8547b.getLocalVisibleRect(new Rect())) {
            i2 |= 32;
        }
        int windowVisibility = viewM8547b.getWindowVisibility();
        int i4 = this.f20753q;
        if (i4 != -1) {
            windowVisibility = i4;
        }
        if (windowVisibility != 0) {
            i2 |= 64;
        }
        if (this.f20752p != i2) {
            this.f20752p = (byte) i2;
            this.f20754r = i2 == 0 ? SystemClock.elapsedRealtime() : (-3) - ((long) i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8551f(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f20749m = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f20747k == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            ue2 ue2Var = new ue2(this);
            this.f20747k = ue2Var;
            this.f20743g.registerReceiver(ue2Var, intentFilter);
        }
        Application application = this.f20744h;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f20751o);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m8552g(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f20749m;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f20749m = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f20747k;
        if (broadcastReceiver != null) {
            try {
                this.f20743g.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f20747k = null;
        }
        Application application = this.f20744h;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f20751o);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m8549d(activity, 0);
        m8550e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m8550e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m8549d(activity, 4);
        m8550e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m8549d(activity, 0);
        m8550e();
        f20742f.post(new te2(this));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m8550e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m8549d(activity, 0);
        m8550e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m8550e();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        m8550e();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m8550e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f20753q = -1;
        m8551f(view);
        m8550e();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f20753q = -1;
        m8550e();
        f20742f.post(new te2(this));
        m8552g(view);
    }
}
