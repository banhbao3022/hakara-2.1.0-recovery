package p636z0.p644b.p645c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import com.facebook.stetho.websocket.CloseCodes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p644b.C7463b;
import p636z0.p644b.p646d.p647a.AppCompatResources;
import p636z0.p644b.p651g.ActionMode;
import p636z0.p644b.p651g.ContextThemeWrapper;
import p636z0.p644b.p651g.StandaloneActionMode;
import p636z0.p644b.p651g.SupportActionModeWrapper;
import p636z0.p644b.p651g.SupportMenuInflater;
import p636z0.p644b.p651g.WindowCallbackWrapper;
import p636z0.p644b.p651g.p652i.ListMenuPresenter;
import p636z0.p644b.p651g.p652i.ListMenuPresenter.a;
import p636z0.p644b.p651g.p652i.MenuBuilder;
import p636z0.p644b.p651g.p652i.MenuPresenter;
import p636z0.p644b.p653h.AppCompatCheckedTextView;
import p636z0.p644b.p653h.AppCompatDrawableManager;
import p636z0.p644b.p653h.AppCompatEditText;
import p636z0.p644b.p653h.AppCompatImageButton;
import p636z0.p644b.p653h.AppCompatMultiAutoCompleteTextView;
import p636z0.p644b.p653h.AppCompatRatingBar;
import p636z0.p644b.p653h.AppCompatSeekBar;
import p636z0.p644b.p653h.AppCompatSpinner;
import p636z0.p644b.p653h.AppCompatToggleButton;
import p636z0.p644b.p653h.DecorContentParent;
import p636z0.p644b.p653h.ResourceManagerInternal;
import p636z0.p644b.p653h.TintTypedArray;
import p636z0.p644b.p653h.VectorEnabledTintResources;
import p636z0.p644b.p653h.ViewUtils5;
import p636z0.p691g.LongSparseArray;
import p636z0.p691g.SimpleArrayMap;
import p636z0.p725k.C8162a;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p726c.ActivityCompat2;
import p636z0.p725k.p726c.ActivityRecreator;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p725k.p727d.p728c.ResourcesCompat2;
import p636z0.p725k.p739l.KeyEventDispatcher;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorCompat;
import p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter;
import p636z0.p725k.p739l.WindowInsetsCompat;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: renamed from: z0.b.c.k, reason: use source file name */
/* JADX INFO: compiled from: AppCompatDelegateImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: h */
    public static final SimpleArrayMap<String, Integer> f34431h = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: i */
    public static final int[] f34432i = {R.attr.windowBackground};

    /* JADX INFO: renamed from: j */
    public static final boolean f34433j = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: k */
    public static final boolean f34434k = true;

    /* JADX INFO: renamed from: B */
    public boolean f34436B;

    /* JADX INFO: renamed from: C */
    public ViewGroup f34437C;

    /* JADX INFO: renamed from: D */
    public TextView f34438D;

    /* JADX INFO: renamed from: E */
    public View f34439E;

    /* JADX INFO: renamed from: F */
    public boolean f34440F;

    /* JADX INFO: renamed from: G */
    public boolean f34441G;

    /* JADX INFO: renamed from: H */
    public boolean f34442H;

    /* JADX INFO: renamed from: I */
    public boolean f34443I;

    /* JADX INFO: renamed from: J */
    public boolean f34444J;

    /* JADX INFO: renamed from: K */
    public boolean f34445K;

    /* JADX INFO: renamed from: L */
    public boolean f34446L;

    /* JADX INFO: renamed from: M */
    public boolean f34447M;

    /* JADX INFO: renamed from: N */
    public i[] f34448N;

    /* JADX INFO: renamed from: O */
    public i f34449O;

    /* JADX INFO: renamed from: P */
    public boolean f34450P;

    /* JADX INFO: renamed from: Q */
    public boolean f34451Q;

    /* JADX INFO: renamed from: R */
    public boolean f34452R;

    /* JADX INFO: renamed from: S */
    public boolean f34453S;

    /* JADX INFO: renamed from: T */
    public boolean f34454T;

    /* JADX INFO: renamed from: U */
    public int f34455U;

    /* JADX INFO: renamed from: V */
    public int f34456V;

    /* JADX INFO: renamed from: W */
    public boolean f34457W;

    /* JADX INFO: renamed from: X */
    public boolean f34458X;

    /* JADX INFO: renamed from: Y */
    public f f34459Y;

    /* JADX INFO: renamed from: Z */
    public f f34460Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f34461a0;

    /* JADX INFO: renamed from: b0 */
    public int f34462b0;

    /* JADX INFO: renamed from: d0 */
    public boolean f34464d0;

    /* JADX INFO: renamed from: e0 */
    public Rect f34465e0;

    /* JADX INFO: renamed from: f0 */
    public Rect f34466f0;

    /* JADX INFO: renamed from: g0 */
    public AppCompatViewInflater f34467g0;

    /* JADX INFO: renamed from: l */
    public final Object f34468l;

    /* JADX INFO: renamed from: m */
    public final Context f34469m;

    /* JADX INFO: renamed from: n */
    public Window f34470n;

    /* JADX INFO: renamed from: o */
    public d f34471o;

    /* JADX INFO: renamed from: p */
    public final AppCompatCallback f34472p;

    /* JADX INFO: renamed from: q */
    public ActionBar f34473q;

    /* JADX INFO: renamed from: r */
    public MenuInflater f34474r;

    /* JADX INFO: renamed from: s */
    public CharSequence f34475s;

    /* JADX INFO: renamed from: t */
    public DecorContentParent f34476t;

    /* JADX INFO: renamed from: u */
    public b f34477u;

    /* JADX INFO: renamed from: v */
    public j f34478v;

    /* JADX INFO: renamed from: w */
    public ActionMode f34479w;

    /* JADX INFO: renamed from: x */
    public ActionBarContextView f34480x;

    /* JADX INFO: renamed from: y */
    public PopupWindow f34481y;

    /* JADX INFO: renamed from: z */
    public Runnable f34482z;

    /* JADX INFO: renamed from: A */
    public ViewPropertyAnimatorCompat f34435A = null;

    /* JADX INFO: renamed from: c0 */
    public final Runnable f34463c0 = new a();

    /* JADX INFO: renamed from: z0.b.c.k$a */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f34462b0 & 1) != 0) {
                appCompatDelegateImpl.m14648I(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f34462b0 & 4096) != 0) {
                appCompatDelegateImpl2.m14648I(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f34461a0 = false;
            appCompatDelegateImpl3.f34462b0 = 0;
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$b */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public final class b implements MenuPresenter.a {
        public b() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: c */
        public void mo186c(MenuBuilder menuBuilder, boolean z) {
            AppCompatDelegateImpl.this.m14644E(menuBuilder);
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: d */
        public boolean mo187d(MenuBuilder menuBuilder) {
            Window.Callback callbackM14655P = AppCompatDelegateImpl.this.m14655P();
            if (callbackM14655P == null) {
                return true;
            }
            callbackM14655P.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$c */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class c implements ActionMode.a {

        /* JADX INFO: renamed from: a */
        public ActionMode.a f34485a;

        /* JADX INFO: renamed from: z0.b.c.k$c$a */
        /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
        public class a extends ViewPropertyAnimatorListenerAdapter {
            public a() {
            }

            @Override // p636z0.p725k.p739l.ViewPropertyAnimatorListenerAdapter, p636z0.p725k.p739l.ViewPropertyAnimatorListener
            /* JADX INFO: renamed from: b */
            public void mo14669b(View view) {
                AppCompatDelegateImpl.this.f34480x.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f34481y;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f34480x.getParent() instanceof View) {
                    View view2 = (View) AppCompatDelegateImpl.this.f34480x.getParent();
                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                    view2.requestApplyInsets();
                }
                AppCompatDelegateImpl.this.f34480x.m159h();
                AppCompatDelegateImpl.this.f34435A.m16348d(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f34435A = null;
                ViewGroup viewGroup = appCompatDelegateImpl2.f34437C;
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                viewGroup.requestApplyInsets();
            }
        }

        public c(ActionMode.a aVar) {
            this.f34485a = aVar;
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: a */
        public void mo14665a(ActionMode actionMode) {
            this.f34485a.mo14665a(actionMode);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f34481y != null) {
                appCompatDelegateImpl.f34470n.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f34482z);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f34480x != null) {
                appCompatDelegateImpl2.m14649J();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b = ViewCompat.m16308b(appCompatDelegateImpl3.f34480x);
                viewPropertyAnimatorCompatM16308b.m16345a(0.0f);
                appCompatDelegateImpl3.f34435A = viewPropertyAnimatorCompatM16308b;
                ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = AppCompatDelegateImpl.this.f34435A;
                a aVar = new a();
                View view = viewPropertyAnimatorCompat.f38092a.get();
                if (view != null) {
                    viewPropertyAnimatorCompat.m16349e(view, aVar);
                }
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            AppCompatCallback appCompatCallback = appCompatDelegateImpl4.f34472p;
            if (appCompatCallback != null) {
                appCompatCallback.onSupportActionModeFinished(appCompatDelegateImpl4.f34479w);
            }
            AppCompatDelegateImpl appCompatDelegateImpl5 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl5.f34479w = null;
            ViewGroup viewGroup = appCompatDelegateImpl5.f34437C;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            viewGroup.requestApplyInsets();
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: b */
        public boolean mo14666b(ActionMode actionMode, Menu menu) {
            return this.f34485a.mo14666b(actionMode, menu);
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: c */
        public boolean mo14667c(ActionMode actionMode, Menu menu) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.f34437C;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            viewGroup.requestApplyInsets();
            return this.f34485a.mo14667c(actionMode, menu);
        }

        @Override // p636z0.p644b.p651g.ActionMode.a
        /* JADX INFO: renamed from: d */
        public boolean mo14668d(ActionMode actionMode, MenuItem menuItem) {
            return this.f34485a.mo14668d(actionMode, menuItem);
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$e */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class e extends f {

        /* JADX INFO: renamed from: c */
        public final PowerManager f34489c;

        public e(Context context) {
            super();
            this.f34489c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // p636z0.p644b.p645c.AppCompatDelegateImpl.f
        /* JADX INFO: renamed from: b */
        public IntentFilter mo14671b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // p636z0.p644b.p645c.AppCompatDelegateImpl.f
        /* JADX INFO: renamed from: c */
        public int mo14672c() {
            return this.f34489c.isPowerSaveMode() ? 2 : 1;
        }

        @Override // p636z0.p644b.p645c.AppCompatDelegateImpl.f
        /* JADX INFO: renamed from: d */
        public void mo14673d() {
            AppCompatDelegateImpl.this.m14640A();
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$f */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public abstract class f {

        /* JADX INFO: renamed from: a */
        public BroadcastReceiver f34491a;

        /* JADX INFO: renamed from: z0.b.c.k$f$a */
        /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                f.this.mo14673d();
            }
        }

        public f() {
        }

        /* JADX INFO: renamed from: a */
        public void m14674a() {
            BroadcastReceiver broadcastReceiver = this.f34491a;
            if (broadcastReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.f34469m.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f34491a = null;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract IntentFilter mo14671b();

        /* JADX INFO: renamed from: c */
        public abstract int mo14672c();

        /* JADX INFO: renamed from: d */
        public abstract void mo14673d();

        /* JADX INFO: renamed from: e */
        public void m14675e() {
            m14674a();
            IntentFilter intentFilterMo14671b = mo14671b();
            if (intentFilterMo14671b == null || intentFilterMo14671b.countActions() == 0) {
                return;
            }
            if (this.f34491a == null) {
                this.f34491a = new a();
            }
            AppCompatDelegateImpl.this.f34469m.registerReceiver(this.f34491a, intentFilterMo14671b);
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$g */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class g extends f {

        /* JADX INFO: renamed from: c */
        public final TwilightManager f34494c;

        public g(TwilightManager twilightManager) {
            super();
            this.f34494c = twilightManager;
        }

        @Override // p636z0.p644b.p645c.AppCompatDelegateImpl.f
        /* JADX INFO: renamed from: b */
        public IntentFilter mo14671b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // p636z0.p644b.p645c.AppCompatDelegateImpl.f
        /* JADX INFO: renamed from: c */
        public int mo14672c() {
            boolean z;
            long j2;
            long j3;
            TwilightManager twilightManager = this.f34494c;
            TwilightManager.a aVar = twilightManager.f34551d;
            if (aVar.f34553b > System.currentTimeMillis()) {
                z = aVar.f34552a;
            } else {
                Location locationM14686a = C8162a.m16064i(twilightManager.f34549b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? twilightManager.m14686a("network") : null;
                Location locationM14686a2 = C8162a.m16064i(twilightManager.f34549b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? twilightManager.m14686a("gps") : null;
                if (locationM14686a2 == null || locationM14686a == null ? locationM14686a2 != null : locationM14686a2.getTime() > locationM14686a.getTime()) {
                    locationM14686a = locationM14686a2;
                }
                if (locationM14686a != null) {
                    TwilightManager.a aVar2 = twilightManager.f34551d;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (TwilightCalculator.f34544a == null) {
                        TwilightCalculator.f34544a = new TwilightCalculator();
                    }
                    TwilightCalculator twilightCalculator = TwilightCalculator.f34544a;
                    twilightCalculator.m14685a(jCurrentTimeMillis - 86400000, locationM14686a.getLatitude(), locationM14686a.getLongitude());
                    twilightCalculator.m14685a(jCurrentTimeMillis, locationM14686a.getLatitude(), locationM14686a.getLongitude());
                    boolean z2 = twilightCalculator.f34547d == 1;
                    long j4 = twilightCalculator.f34546c;
                    long j5 = twilightCalculator.f34545b;
                    twilightCalculator.m14685a(jCurrentTimeMillis + 86400000, locationM14686a.getLatitude(), locationM14686a.getLongitude());
                    long j6 = twilightCalculator.f34546c;
                    if (j4 == -1 || j5 == -1) {
                        j2 = 43200000 + jCurrentTimeMillis;
                    } else {
                        if (jCurrentTimeMillis > j5) {
                            j3 = j6 + 0;
                        } else {
                            j3 = jCurrentTimeMillis > j4 ? j5 + 0 : j4 + 0;
                        }
                        j2 = j3 + 60000;
                    }
                    aVar2.f34552a = z2;
                    aVar2.f34553b = j2;
                    z = aVar.f34552a;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                }
            }
            return z ? 2 : 1;
        }

        @Override // p636z0.p644b.p645c.AppCompatDelegateImpl.f
        /* JADX INFO: renamed from: d */
        public void mo14673d() {
            AppCompatDelegateImpl.this.m14640A();
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$h */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class h extends ContentFrameLayout {
        public h(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m14647H(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.m14645F(appCompatDelegateImpl.m14654O(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(AppCompatResources.m14707b(getContext(), i));
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$i */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public static final class i {

        /* JADX INFO: renamed from: a */
        public int f34497a;

        /* JADX INFO: renamed from: b */
        public int f34498b;

        /* JADX INFO: renamed from: c */
        public int f34499c;

        /* JADX INFO: renamed from: d */
        public int f34500d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f34501e;

        /* JADX INFO: renamed from: f */
        public View f34502f;

        /* JADX INFO: renamed from: g */
        public View f34503g;

        /* JADX INFO: renamed from: h */
        public MenuBuilder f34504h;

        /* JADX INFO: renamed from: i */
        public ListMenuPresenter f34505i;

        /* JADX INFO: renamed from: j */
        public Context f34506j;

        /* JADX INFO: renamed from: k */
        public boolean f34507k;

        /* JADX INFO: renamed from: l */
        public boolean f34508l;

        /* JADX INFO: renamed from: m */
        public boolean f34509m;

        /* JADX INFO: renamed from: n */
        public boolean f34510n;

        /* JADX INFO: renamed from: o */
        public boolean f34511o = false;

        /* JADX INFO: renamed from: p */
        public boolean f34512p;

        /* JADX INFO: renamed from: q */
        public Bundle f34513q;

        public i(int i) {
            this.f34497a = i;
        }

        /* JADX INFO: renamed from: a */
        public void m14676a(MenuBuilder menuBuilder) {
            ListMenuPresenter listMenuPresenter;
            MenuBuilder menuBuilder2 = this.f34504h;
            if (menuBuilder == menuBuilder2) {
                return;
            }
            if (menuBuilder2 != null) {
                menuBuilder2.m14787u(this.f34505i);
            }
            this.f34504h = menuBuilder;
            if (menuBuilder == null || (listMenuPresenter = this.f34505i) == null) {
                return;
            }
            menuBuilder.m14768b(listMenuPresenter, menuBuilder.f34819b);
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$j */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public final class j implements MenuPresenter.a {
        public j() {
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: c */
        public void mo186c(MenuBuilder menuBuilder, boolean z) {
            MenuBuilder menuBuilderMo14777k = menuBuilder.mo14777k();
            boolean z2 = menuBuilderMo14777k != menuBuilder;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                menuBuilder = menuBuilderMo14777k;
            }
            i iVarM14652M = appCompatDelegateImpl.m14652M(menuBuilder);
            if (iVarM14652M != null) {
                if (!z2) {
                    AppCompatDelegateImpl.this.m14645F(iVarM14652M, z);
                } else {
                    AppCompatDelegateImpl.this.m14643D(iVarM14652M.f34497a, iVarM14652M, menuBuilderMo14777k);
                    AppCompatDelegateImpl.this.m14645F(iVarM14652M, true);
                }
            }
        }

        @Override // p636z0.p644b.p651g.p652i.MenuPresenter.a
        /* JADX INFO: renamed from: d */
        public boolean mo187d(MenuBuilder menuBuilder) {
            Window.Callback callbackM14655P;
            if (menuBuilder != menuBuilder.mo14777k()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f34442H || (callbackM14655P = appCompatDelegateImpl.m14655P()) == null || AppCompatDelegateImpl.this.f34454T) {
                return true;
            }
            callbackM14655P.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, AppCompatCallback appCompatCallback, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f34455U = -100;
        this.f34469m = context;
        this.f34472p = appCompatCallback;
        this.f34468l = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AppCompatActivity) {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                appCompatActivity = null;
                break;
            }
            if (appCompatActivity != null) {
                this.f34455U = appCompatActivity.m14609H().mo14620f();
            }
        }
        if (this.f34455U == -100 && (orDefault = (simpleArrayMap = f34431h).getOrDefault(this.f34468l.getClass().getName(), null)) != null) {
            this.f34455U = orDefault.intValue();
            simpleArrayMap.remove(this.f34468l.getClass().getName());
        }
        if (window != null) {
            m14642C(window);
        }
        AppCompatDrawableManager.m14906e();
    }

    /* JADX INFO: renamed from: A */
    public boolean m14640A() {
        return m14641B(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public final boolean m14641B(boolean z) {
        boolean z2;
        Object obj;
        int i2;
        boolean z3 = false;
        if (this.f34454T) {
            return false;
        }
        int i3 = this.f34455U;
        if (i3 == -100) {
            i3 = -100;
        }
        Map map = null;
        obj = null;
        obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Configuration configurationM14646G = m14646G(this.f34469m, m14658S(this.f34469m, i3), null);
        boolean z4 = true;
        if (this.f34458X || !(this.f34468l instanceof Activity)) {
            this.f34458X = true;
            z2 = this.f34457W;
        } else {
            PackageManager packageManager = this.f34469m.getPackageManager();
            if (packageManager == null) {
                z2 = false;
            } else {
                try {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 29) {
                        i2 = 269221888;
                    } else {
                        i2 = i4 >= 24 ? 786432 : 0;
                    }
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f34469m, this.f34468l.getClass()), i2);
                    this.f34457W = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                    this.f34457W = false;
                }
                this.f34458X = true;
                z2 = this.f34457W;
            }
        }
        int i5 = this.f34469m.getResources().getConfiguration().uiMode & 48;
        int i6 = configurationM14646G.uiMode & 48;
        if (i5 != i6 && z && !z2 && this.f34451Q && (f34433j || this.f34452R)) {
            Object obj4 = this.f34468l;
            if ((obj4 instanceof Activity) && !((Activity) obj4).isChild()) {
                Activity activity = (Activity) this.f34468l;
                int i7 = ActivityCompat.f37660b;
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 28) {
                    activity.recreate();
                } else if (i8 <= 23) {
                    new Handler(activity.getMainLooper()).post(new ActivityCompat2(activity));
                } else if (!ActivityRecreator.m16085b(activity)) {
                    activity.recreate();
                }
                z3 = true;
            }
        }
        if (z3 || i5 == i6) {
            z4 = z3;
        } else {
            Resources resources = this.f34469m.getResources();
            Configuration configuration = new Configuration(resources.getConfiguration());
            configuration.uiMode = i6 | (resources.getConfiguration().uiMode & (-49));
            resources.updateConfiguration(configuration, null);
            int i9 = Build.VERSION.SDK_INT;
            if (i9 < 26 && i9 < 28) {
                if (i9 >= 24) {
                    if (!C7462a.f34384h) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            C7462a.f34383g = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e3);
                        }
                        C7462a.f34384h = true;
                    }
                    Field field = C7462a.f34383g;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e4) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e4);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!C7462a.f34378b) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    C7462a.f34377a = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e5) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e5);
                                }
                                C7462a.f34378b = true;
                            }
                            Field field2 = C7462a.f34377a;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e6) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e6);
                                }
                            }
                            if (obj2 != null) {
                                C7462a.m14570g(obj2);
                            }
                        }
                    }
                } else if (i9 >= 23) {
                    if (!C7462a.f34378b) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            C7462a.f34377a = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e7);
                        }
                        C7462a.f34378b = true;
                    }
                    Field field3 = C7462a.f34377a;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e8) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e8);
                        }
                    }
                    if (obj3 != null) {
                        C7462a.m14570g(obj3);
                    }
                } else {
                    if (!C7462a.f34378b) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            C7462a.f34377a = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e9) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e9);
                        }
                        C7462a.f34378b = true;
                    }
                    Field field4 = C7462a.f34377a;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e10) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i10 = this.f34456V;
            if (i10 != 0) {
                this.f34469m.setTheme(i10);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f34469m.getTheme().applyStyle(this.f34456V, true);
                }
            }
            if (z2) {
                Object obj5 = this.f34468l;
                if (obj5 instanceof Activity) {
                    Activity activity2 = (Activity) obj5;
                    if (activity2 instanceof LifecycleOwner) {
                        if (((LifecycleOwner) activity2).mo124b().mo16728b().isAtLeast(Lifecycle3.b.STARTED)) {
                            activity2.onConfigurationChanged(configuration);
                        }
                    } else if (this.f34453S) {
                        activity2.onConfigurationChanged(configuration);
                    }
                }
            }
        }
        if (z4) {
            Object obj6 = this.f34468l;
            if (obj6 instanceof AppCompatActivity) {
                ((AppCompatActivity) obj6).m14613L();
            }
        }
        if (i3 == 0) {
            m14653N(this.f34469m).m14675e();
        } else {
            f fVar = this.f34459Y;
            if (fVar != null) {
                fVar.m14674a();
            }
        }
        if (i3 == 3) {
            Context context = this.f34469m;
            if (this.f34460Z == null) {
                this.f34460Z = new e(context);
            }
            this.f34460Z.m14675e();
        } else {
            f fVar2 = this.f34460Z;
            if (fVar2 != null) {
                fVar2.m14674a();
            }
        }
        return z4;
    }

    /* JADX INFO: renamed from: C */
    public final void m14642C(Window window) {
        if (this.f34470n != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof d) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        d dVar = new d(callback);
        this.f34471o = dVar;
        window.setCallback(dVar);
        TintTypedArray tintTypedArrayM14997q = TintTypedArray.m14997q(this.f34469m, null, f34432i);
        Drawable drawableM15006h = tintTypedArrayM14997q.m15006h(0);
        if (drawableM15006h != null) {
            window.setBackgroundDrawable(drawableM15006h);
        }
        tintTypedArrayM14997q.f35267b.recycle();
        this.f34470n = window;
    }

    /* JADX INFO: renamed from: D */
    public void m14643D(int i2, i iVar, Menu menu) {
        if (menu == null && iVar != null) {
            menu = iVar.f34504h;
        }
        if ((iVar == null || iVar.f34509m) && !this.f34454T) {
            this.f34471o.f34734f.onPanelClosed(i2, menu);
        }
    }

    /* JADX INFO: renamed from: E */
    public void m14644E(MenuBuilder menuBuilder) {
        if (this.f34447M) {
            return;
        }
        this.f34447M = true;
        this.f34476t.mo168i();
        Window.Callback callbackM14655P = m14655P();
        if (callbackM14655P != null && !this.f34454T) {
            callbackM14655P.onPanelClosed(108, menuBuilder);
        }
        this.f34447M = false;
    }

    /* JADX INFO: renamed from: F */
    public void m14645F(i iVar, boolean z) {
        ViewGroup viewGroup;
        DecorContentParent decorContentParent;
        if (z && iVar.f34497a == 0 && (decorContentParent = this.f34476t) != null && decorContentParent.mo161b()) {
            m14644E(iVar.f34504h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f34469m.getSystemService("window");
        if (windowManager != null && iVar.f34509m && (viewGroup = iVar.f34501e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m14643D(iVar.f34497a, iVar, null);
            }
        }
        iVar.f34507k = false;
        iVar.f34508l = false;
        iVar.f34509m = false;
        iVar.f34502f = null;
        iVar.f34511o = true;
        if (this.f34449O == iVar) {
            this.f34449O = null;
        }
    }

    /* JADX INFO: renamed from: G */
    public final Configuration m14646G(Context context, int i2, Configuration configuration) {
        int i3;
        if (i2 != 1) {
            i3 = i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: H */
    public boolean m14647H(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean zMo165f;
        boolean zM14661V;
        Object obj = this.f34468l;
        if (((obj instanceof KeyEventDispatcher.a) || (obj instanceof AppCompatDialog)) && (decorView = this.f34470n.getDecorView()) != null && KeyEventDispatcher.m16289a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f34471o.f34734f.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f34450P = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                i iVarM14654O = m14654O(0);
                if (iVarM14654O.f34509m) {
                    return true;
                }
                m14661V(iVarM14654O, keyEvent);
                return true;
            }
        } else if (keyCode == 4) {
            boolean z2 = this.f34450P;
            this.f34450P = false;
            i iVarM14654O2 = m14654O(0);
            if (iVarM14654O2.f34509m) {
                if (z2) {
                    return true;
                }
                m14645F(iVarM14654O2, true);
                return true;
            }
            ActionMode actionMode = this.f34479w;
            if (actionMode != null) {
                actionMode.mo14692c();
            } else {
                m14656Q();
                ActionBar actionBar = this.f34473q;
                z = actionBar != null && actionBar.mo14582b();
                if (z) {
                    return true;
                }
            }
            if (z) {
                return true;
            }
        } else if (keyCode == 82) {
            if (this.f34479w != null) {
                return true;
            }
            i iVarM14654O3 = m14654O(0);
            DecorContentParent decorContentParent = this.f34476t;
            if (decorContentParent == null || !decorContentParent.mo163d() || ViewConfiguration.get(this.f34469m).hasPermanentMenuKey()) {
                boolean z3 = iVarM14654O3.f34509m;
                if (z3 || iVarM14654O3.f34508l) {
                    m14645F(iVarM14654O3, true);
                    zMo165f = z3;
                } else if (iVarM14654O3.f34507k) {
                    if (iVarM14654O3.f34512p) {
                        iVarM14654O3.f34507k = false;
                        zM14661V = m14661V(iVarM14654O3, keyEvent);
                    } else {
                        zM14661V = true;
                    }
                    if (zM14661V) {
                        m14659T(iVarM14654O3, keyEvent);
                        zMo165f = true;
                    } else {
                        zMo165f = false;
                    }
                } else {
                    zMo165f = false;
                }
            } else if (this.f34476t.mo161b()) {
                zMo165f = this.f34476t.mo165f();
            } else if (this.f34454T || !m14661V(iVarM14654O3, keyEvent)) {
                zMo165f = false;
            } else {
                zMo165f = this.f34476t.mo166g();
            }
            if (!zMo165f) {
                return true;
            }
            AudioManager audioManager = (AudioManager) this.f34469m.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return true;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: I */
    public void m14648I(int i2) {
        i iVarM14654O = m14654O(i2);
        if (iVarM14654O.f34504h != null) {
            Bundle bundle = new Bundle();
            iVarM14654O.f34504h.m14789w(bundle);
            if (bundle.size() > 0) {
                iVarM14654O.f34513q = bundle;
            }
            iVarM14654O.f34504h.m14792z();
            iVarM14654O.f34504h.clear();
        }
        iVarM14654O.f34512p = true;
        iVarM14654O.f34511o = true;
        if ((i2 == 108 || i2 == 0) && this.f34476t != null) {
            i iVarM14654O2 = m14654O(0);
            iVarM14654O2.f34507k = false;
            m14661V(iVarM14654O2, null);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m14649J() {
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.f34435A;
        if (viewPropertyAnimatorCompat != null) {
            viewPropertyAnimatorCompat.m16346b();
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m14650K() {
        ViewGroup viewGroup;
        if (this.f34436B) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f34469m.obtainStyledAttributes(C7463b.f34394j);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            mo14633t(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            mo14633t(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            mo14633t(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            mo14633t(10);
        }
        this.f34445K = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        m14651L();
        this.f34470n.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f34469m);
        if (this.f34446L) {
            viewGroup = this.f34444J ? (ViewGroup) layoutInflaterFrom.inflate(mtp.media.karaoke.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(mtp.media.karaoke.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f34445K) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(mtp.media.karaoke.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f34443I = false;
            this.f34442H = false;
        } else if (this.f34442H) {
            TypedValue typedValue = new TypedValue();
            this.f34469m.getTheme().resolveAttribute(mtp.media.karaoke.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new ContextThemeWrapper(this.f34469m, typedValue.resourceId) : this.f34469m).inflate(mtp.media.karaoke.R.layout.abc_screen_toolbar, (ViewGroup) null);
            DecorContentParent decorContentParent = (DecorContentParent) viewGroup.findViewById(mtp.media.karaoke.R.id.decor_content_parent);
            this.f34476t = decorContentParent;
            decorContentParent.setWindowCallback(m14655P());
            if (this.f34443I) {
                this.f34476t.mo167h(109);
            }
            if (this.f34440F) {
                this.f34476t.mo167h(2);
            }
            if (this.f34441G) {
                this.f34476t.mo167h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sbM1556G = outline.m1556G("AppCompat does not support the current theme features: { windowActionBar: ");
            sbM1556G.append(this.f34442H);
            sbM1556G.append(", windowActionBarOverlay: ");
            sbM1556G.append(this.f34443I);
            sbM1556G.append(", android:windowIsFloating: ");
            sbM1556G.append(this.f34445K);
            sbM1556G.append(", windowActionModeOverlay: ");
            sbM1556G.append(this.f34444J);
            sbM1556G.append(", windowNoTitle: ");
            sbM1556G.append(this.f34446L);
            sbM1556G.append(" }");
            throw new IllegalArgumentException(sbM1556G.toString());
        }
        AppCompatDelegateImpl2 appCompatDelegateImpl2 = new AppCompatDelegateImpl2(this);
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        ViewCompat.c.m16336d(viewGroup, appCompatDelegateImpl2);
        if (this.f34476t == null) {
            this.f34438D = (TextView) viewGroup.findViewById(mtp.media.karaoke.R.id.title);
        }
        Method method = ViewUtils5.f35006a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e3);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(mtp.media.karaoke.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f34470n.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f34470n.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new AppCompatDelegateImpl3(this));
        this.f34437C = viewGroup;
        Object obj = this.f34468l;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f34475s;
        if (!TextUtils.isEmpty(title)) {
            DecorContentParent decorContentParent2 = this.f34476t;
            if (decorContentParent2 != null) {
                decorContentParent2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.f34473q;
                if (actionBar != null) {
                    actionBar.mo14599s(title);
                } else {
                    TextView textView = this.f34438D;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f34437C.findViewById(R.id.content);
        View decorView = this.f34470n.getDecorView();
        contentFrameLayout2.f362l.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        AtomicInteger atomicInteger2 = ViewCompat.f38073a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f34469m.obtainStyledAttributes(C7463b.f34394j);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f34436B = true;
        i iVarM14654O = m14654O(0);
        if (this.f34454T || iVarM14654O.f34504h != null) {
            return;
        }
        m14657R(108);
    }

    /* JADX INFO: renamed from: L */
    public final void m14651L() {
        if (this.f34470n == null) {
            Object obj = this.f34468l;
            if (obj instanceof Activity) {
                m14642C(((Activity) obj).getWindow());
            }
        }
        if (this.f34470n == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    /* JADX INFO: renamed from: M */
    public i m14652M(Menu menu) {
        i[] iVarArr = this.f34448N;
        int length = iVarArr != null ? iVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            i iVar = iVarArr[i2];
            if (iVar != null && iVar.f34504h == menu) {
                return iVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: N */
    public final f m14653N(Context context) {
        if (this.f34459Y == null) {
            if (TwilightManager.f34548a == null) {
                Context applicationContext = context.getApplicationContext();
                TwilightManager.f34548a = new TwilightManager(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f34459Y = new g(TwilightManager.f34548a);
        }
        return this.f34459Y;
    }

    /* JADX INFO: renamed from: O */
    public i m14654O(int i2) {
        i[] iVarArr = this.f34448N;
        if (iVarArr == null || iVarArr.length <= i2) {
            i[] iVarArr2 = new i[i2 + 1];
            if (iVarArr != null) {
                System.arraycopy(iVarArr, 0, iVarArr2, 0, iVarArr.length);
            }
            this.f34448N = iVarArr2;
            iVarArr = iVarArr2;
        }
        i iVar = iVarArr[i2];
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(i2);
        iVarArr[i2] = iVar2;
        return iVar2;
    }

    /* JADX INFO: renamed from: P */
    public final Window.Callback m14655P() {
        return this.f34470n.getCallback();
    }

    /* JADX INFO: renamed from: Q */
    public final void m14656Q() {
        m14650K();
        if (this.f34442H && this.f34473q == null) {
            Object obj = this.f34468l;
            if (obj instanceof Activity) {
                this.f34473q = new WindowDecorActionBar((Activity) this.f34468l, this.f34443I);
            } else if (obj instanceof Dialog) {
                this.f34473q = new WindowDecorActionBar((Dialog) this.f34468l);
            }
            ActionBar actionBar = this.f34473q;
            if (actionBar != null) {
                actionBar.mo14592l(this.f34464d0);
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m14657R(int i2) {
        this.f34462b0 = (1 << i2) | this.f34462b0;
        if (this.f34461a0) {
            return;
        }
        View decorView = this.f34470n.getDecorView();
        Runnable runnable = this.f34463c0;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        decorView.postOnAnimation(runnable);
        this.f34461a0 = true;
    }

    /* JADX INFO: renamed from: S */
    public int m14658S(Context context, int i2) {
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return m14653N(context).mo14672c();
                }
                return -1;
            }
            if (i2 != 1 && i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f34460Z == null) {
                    this.f34460Z = new e(context);
                }
                return this.f34460Z.mo14672c();
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x017c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0184  */
    /* JADX WARN: Code duplicated, block: B:99:0x019a  */
    /* JADX INFO: renamed from: T */
    public final void m14659T(i iVar, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        ViewParent parent;
        int i2;
        ViewGroup.LayoutParams layoutParams2;
        if (iVar.f34509m || this.f34454T) {
            return;
        }
        if (iVar.f34497a == 0) {
            if ((this.f34469m.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackM14655P = m14655P();
        if (callbackM14655P != null && !callbackM14655P.onMenuOpened(iVar.f34497a, iVar.f34504h)) {
            m14645F(iVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f34469m.getSystemService("window");
        if (windowManager != null && m14661V(iVar, keyEvent)) {
            ViewGroup viewGroup = iVar.f34501e;
            if (viewGroup != null && !iVar.f34511o) {
                View view = iVar.f34503g;
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && layoutParams2.width == -1) {
                    i2 = -1;
                }
                iVar.f34508l = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i2, -2, 0, 0, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
                layoutParams3.gravity = iVar.f34499c;
                layoutParams3.windowAnimations = iVar.f34500d;
                windowManager.addView(iVar.f34501e, layoutParams3);
                iVar.f34509m = true;
            }
            if (viewGroup == null) {
                m14656Q();
                ActionBar actionBar = this.f34473q;
                Context contextMo14585e = actionBar != null ? actionBar.mo14585e() : null;
                if (contextMo14585e == null) {
                    contextMo14585e = this.f34469m;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextMo14585e.getResources().newTheme();
                themeNewTheme.setTo(contextMo14585e.getTheme());
                themeNewTheme.resolveAttribute(mtp.media.karaoke.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(mtp.media.karaoke.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(2132017631, true);
                }
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(contextMo14585e, 0);
                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                iVar.f34506j = contextThemeWrapper;
                TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C7463b.f34394j);
                iVar.f34498b = typedArrayObtainStyledAttributes.getResourceId(86, 0);
                iVar.f34500d = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                typedArrayObtainStyledAttributes.recycle();
                iVar.f34501e = new h(iVar.f34506j);
                iVar.f34499c = 81;
            } else if (iVar.f34511o && viewGroup.getChildCount() > 0) {
                iVar.f34501e.removeAllViews();
            }
            View view2 = iVar.f34503g;
            if (view2 == null) {
                if (iVar.f34504h != null) {
                    if (this.f34478v == null) {
                        this.f34478v = new j();
                    }
                    j jVar = this.f34478v;
                    if (iVar.f34505i == null) {
                        ListMenuPresenter listMenuPresenter = new ListMenuPresenter(iVar.f34506j, mtp.media.karaoke.R.layout.abc_list_menu_item_layout);
                        iVar.f34505i = listMenuPresenter;
                        listMenuPresenter.f34808l = jVar;
                        MenuBuilder menuBuilder = iVar.f34504h;
                        menuBuilder.m14768b(listMenuPresenter, menuBuilder.f34819b);
                    }
                    ListMenuPresenter listMenuPresenter2 = iVar.f34505i;
                    ViewGroup viewGroup2 = iVar.f34501e;
                    if (listMenuPresenter2.f34805i == null) {
                        listMenuPresenter2.f34805i = (ExpandedMenuView) listMenuPresenter2.f34803g.inflate(mtp.media.karaoke.R.layout.abc_expanded_menu_layout, viewGroup2, false);
                        if (listMenuPresenter2.f34809m == null) {
                            listMenuPresenter2.f34809m = listMenuPresenter2.new a();
                        }
                        listMenuPresenter2.f34805i.setAdapter((ListAdapter) listMenuPresenter2.f34809m);
                        listMenuPresenter2.f34805i.setOnItemClickListener(listMenuPresenter2);
                    }
                    ExpandedMenuView expandedMenuView = listMenuPresenter2.f34805i;
                    iVar.f34502f = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                    if (z) {
                        if (iVar.f34502f == null && (iVar.f34503g != null || ((ListMenuPresenter.a) iVar.f34505i.m14763a()).getCount() > 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            layoutParams = iVar.f34502f.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                            }
                            iVar.f34501e.setBackgroundResource(iVar.f34498b);
                            parent = iVar.f34502f.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(iVar.f34502f);
                            }
                            iVar.f34501e.addView(iVar.f34502f, layoutParams);
                            if (!iVar.f34502f.hasFocus()) {
                                iVar.f34502f.requestFocus();
                            }
                        }
                    }
                    iVar.f34511o = true;
                    return;
                }
                z = false;
                if (z) {
                    if (iVar.f34502f == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        layoutParams = iVar.f34502f.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        }
                        iVar.f34501e.setBackgroundResource(iVar.f34498b);
                        parent = iVar.f34502f.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(iVar.f34502f);
                        }
                        iVar.f34501e.addView(iVar.f34502f, layoutParams);
                        if (!iVar.f34502f.hasFocus()) {
                            iVar.f34502f.requestFocus();
                        }
                    }
                }
                iVar.f34511o = true;
                return;
            }
            iVar.f34502f = view2;
            z = true;
            if (z) {
                if (iVar.f34502f == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    layoutParams = iVar.f34502f.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    }
                    iVar.f34501e.setBackgroundResource(iVar.f34498b);
                    parent = iVar.f34502f.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(iVar.f34502f);
                    }
                    iVar.f34501e.addView(iVar.f34502f, layoutParams);
                    if (!iVar.f34502f.hasFocus()) {
                        iVar.f34502f.requestFocus();
                    }
                }
            }
            iVar.f34511o = true;
            return;
            i2 = -2;
            iVar.f34508l = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, 0, 0, CloseCodes.PROTOCOL_ERROR, 8519680, -3);
            layoutParams4.gravity = iVar.f34499c;
            layoutParams4.windowAnimations = iVar.f34500d;
            windowManager.addView(iVar.f34501e, layoutParams4);
            iVar.f34509m = true;
        }
    }

    /* JADX INFO: renamed from: U */
    public final boolean m14660U(i iVar, int i2, KeyEvent keyEvent, int i3) {
        MenuBuilder menuBuilder;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((iVar.f34507k || m14661V(iVar, keyEvent)) && (menuBuilder = iVar.f34504h) != null) {
            zPerformShortcut = menuBuilder.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.f34476t == null) {
            m14645F(iVar, true);
        }
        return zPerformShortcut;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m14661V(i iVar, KeyEvent keyEvent) {
        DecorContentParent decorContentParent;
        DecorContentParent decorContentParent2;
        Resources.Theme themeNewTheme;
        DecorContentParent decorContentParent3;
        DecorContentParent decorContentParent4;
        if (this.f34454T) {
            return false;
        }
        if (iVar.f34507k) {
            return true;
        }
        i iVar2 = this.f34449O;
        if (iVar2 != null && iVar2 != iVar) {
            m14645F(iVar2, false);
        }
        Window.Callback callbackM14655P = m14655P();
        if (callbackM14655P != null) {
            iVar.f34503g = callbackM14655P.onCreatePanelView(iVar.f34497a);
        }
        int i2 = iVar.f34497a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (decorContentParent4 = this.f34476t) != null) {
            decorContentParent4.mo162c();
        }
        if (iVar.f34503g == null && (!z || !(this.f34473q instanceof ToolbarActionBar))) {
            MenuBuilder menuBuilder = iVar.f34504h;
            if (menuBuilder == null || iVar.f34512p) {
                if (menuBuilder == null) {
                    Context context = this.f34469m;
                    int i3 = iVar.f34497a;
                    if ((i3 == 0 || i3 == 108) && this.f34476t != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(mtp.media.karaoke.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(mtp.media.karaoke.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(mtp.media.karaoke.R.attr.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 0);
                            contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            context = contextThemeWrapper;
                        }
                    }
                    MenuBuilder menuBuilder2 = new MenuBuilder(context);
                    menuBuilder2.f34823f = this;
                    iVar.m14676a(menuBuilder2);
                    if (iVar.f34504h == null) {
                        return false;
                    }
                }
                if (z && (decorContentParent2 = this.f34476t) != null) {
                    if (this.f34477u == null) {
                        this.f34477u = new b();
                    }
                    decorContentParent2.mo160a(iVar.f34504h, this.f34477u);
                }
                iVar.f34504h.m14792z();
                if (!callbackM14655P.onCreatePanelMenu(iVar.f34497a, iVar.f34504h)) {
                    iVar.m14676a(null);
                    if (z && (decorContentParent = this.f34476t) != null) {
                        decorContentParent.mo160a(null, this.f34477u);
                    }
                    return false;
                }
                iVar.f34512p = false;
            }
            iVar.f34504h.m14792z();
            Bundle bundle = iVar.f34513q;
            if (bundle != null) {
                iVar.f34504h.m14788v(bundle);
                iVar.f34513q = null;
            }
            if (!callbackM14655P.onPreparePanel(0, iVar.f34503g, iVar.f34504h)) {
                if (z && (decorContentParent3 = this.f34476t) != null) {
                    decorContentParent3.mo160a(null, this.f34477u);
                }
                iVar.f34504h.m14791y();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            iVar.f34510n = z2;
            iVar.f34504h.setQwertyMode(z2);
            iVar.f34504h.m14791y();
        }
        iVar.f34507k = true;
        iVar.f34508l = false;
        this.f34449O = iVar;
        return true;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m14662W() {
        ViewGroup viewGroup;
        if (this.f34436B && (viewGroup = this.f34437C) != null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final void m14663X() {
        if (this.f34436B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    /* JADX INFO: renamed from: Y */
    public final int m14664Y(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        boolean z;
        boolean z2;
        int iM16230e = windowInsetsCompat.m16230e();
        ActionBarContextView actionBarContextView = this.f34480x;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34480x.getLayoutParams();
            boolean z3 = true;
            if (this.f34480x.isShown()) {
                if (this.f34465e0 == null) {
                    this.f34465e0 = new Rect();
                    this.f34466f0 = new Rect();
                }
                Rect rect2 = this.f34465e0;
                Rect rect3 = this.f34466f0;
                rect2.set(windowInsetsCompat.m16228c(), windowInsetsCompat.m16230e(), windowInsetsCompat.m16229d(), windowInsetsCompat.m16227b());
                ViewUtils5.m14874a(this.f34437C, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                ViewGroup viewGroup = this.f34437C;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                WindowInsetsCompat windowInsetsCompatM16337a = Build.VERSION.SDK_INT >= 23 ? ViewCompat.d.m16337a(viewGroup) : ViewCompat.c.m16335c(viewGroup);
                int iM16228c = windowInsetsCompatM16337a == null ? 0 : windowInsetsCompatM16337a.m16228c();
                int iM16229d = windowInsetsCompatM16337a == null ? 0 : windowInsetsCompatM16337a.m16229d();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.f34439E != null) {
                    View view = this.f34439E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != iM16228c || marginLayoutParams2.rightMargin != iM16229d) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = iM16228c;
                            marginLayoutParams2.rightMargin = iM16229d;
                            this.f34439E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f34469m);
                    this.f34439E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iM16228c;
                    layoutParams.rightMargin = iM16229d;
                    this.f34437C.addView(this.f34439E, -1, layoutParams);
                }
                View view3 = this.f34439E;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f34439E;
                    view4.setBackgroundColor((view4.getWindowSystemUiVisibility() & 8192) != 0 ? ContextCompat.m16134b(this.f34469m, mtp.media.karaoke.R.color.abc_decor_view_status_guard_light) : ContextCompat.m16134b(this.f34469m, mtp.media.karaoke.R.color.abc_decor_view_status_guard));
                }
                if (!this.f34444J && z) {
                    iM16230e = 0;
                }
                z3 = z2;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z3) {
                this.f34480x.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f34439E;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return iM16230e;
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
    /* JADX INFO: renamed from: a */
    public boolean mo188a(MenuBuilder menuBuilder, MenuItem menuItem) {
        i iVarM14652M;
        Window.Callback callbackM14655P = m14655P();
        if (callbackM14655P == null || this.f34454T || (iVarM14652M = m14652M(menuBuilder.mo14777k())) == null) {
            return false;
        }
        return callbackM14655P.onMenuItemSelected(iVarM14652M.f34497a, menuItem);
    }

    @Override // p636z0.p644b.p651g.p652i.MenuBuilder.a
    /* JADX INFO: renamed from: b */
    public void mo189b(MenuBuilder menuBuilder) {
        DecorContentParent decorContentParent = this.f34476t;
        if (decorContentParent == null || !decorContentParent.mo163d() || (ViewConfiguration.get(this.f34469m).hasPermanentMenuKey() && !this.f34476t.mo164e())) {
            i iVarM14654O = m14654O(0);
            iVarM14654O.f34511o = true;
            m14645F(iVarM14654O, false);
            m14659T(iVarM14654O, null);
            return;
        }
        Window.Callback callbackM14655P = m14655P();
        if (this.f34476t.mo161b()) {
            this.f34476t.mo165f();
            if (this.f34454T) {
                return;
            }
            callbackM14655P.onPanelClosed(108, m14654O(0).f34504h);
            return;
        }
        if (callbackM14655P == null || this.f34454T) {
            return;
        }
        if (this.f34461a0 && (1 & this.f34462b0) != 0) {
            this.f34470n.getDecorView().removeCallbacks(this.f34463c0);
            this.f34463c0.run();
        }
        i iVarM14654O2 = m14654O(0);
        MenuBuilder menuBuilder2 = iVarM14654O2.f34504h;
        if (menuBuilder2 == null || iVarM14654O2.f34512p || !callbackM14655P.onPreparePanel(0, iVarM14654O2.f34503g, menuBuilder2)) {
            return;
        }
        callbackM14655P.onMenuOpened(108, iVarM14654O2.f34504h);
        this.f34476t.mo166g();
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: c */
    public void mo14617c(View view, ViewGroup.LayoutParams layoutParams) {
        m14650K();
        ((ViewGroup) this.f34437C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f34471o.f34734f.onContentChanged();
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: d */
    public Context mo14618d(Context context) {
        Configuration configuration;
        boolean z;
        this.f34451Q = true;
        int i2 = this.f34455U;
        if (i2 == -100) {
            i2 = -100;
        }
        int iM14658S = m14658S(context, i2);
        if (f34434k && (context instanceof android.view.ContextThemeWrapper)) {
            try {
                ((android.view.ContextThemeWrapper) context).applyOverrideConfiguration(m14646G(context, iM14658S, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).m14728a(m14646G(context, iM14658S, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f34433j) {
            return context;
        }
        int i3 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f2 = configuration3.fontScale;
                float f3 = configuration4.fontScale;
                if (f2 != f3) {
                    configuration.fontScale = f3;
                }
                int i4 = configuration3.mcc;
                int i5 = configuration4.mcc;
                if (i4 != i5) {
                    configuration.mcc = i5;
                }
                int i6 = configuration3.mnc;
                int i7 = configuration4.mnc;
                if (i6 != i7) {
                    configuration.mnc = i7;
                }
                if (i3 >= 24) {
                    LocaleList locales = configuration3.getLocales();
                    LocaleList locales2 = configuration4.getLocales();
                    if (!locales.equals(locales2)) {
                        configuration.setLocales(locales2);
                        configuration.locale = configuration4.locale;
                    }
                } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i8 = configuration3.touchscreen;
                int i9 = configuration4.touchscreen;
                if (i8 != i9) {
                    configuration.touchscreen = i9;
                }
                int i10 = configuration3.keyboard;
                int i11 = configuration4.keyboard;
                if (i10 != i11) {
                    configuration.keyboard = i11;
                }
                int i12 = configuration3.keyboardHidden;
                int i13 = configuration4.keyboardHidden;
                if (i12 != i13) {
                    configuration.keyboardHidden = i13;
                }
                int i14 = configuration3.navigation;
                int i15 = configuration4.navigation;
                if (i14 != i15) {
                    configuration.navigation = i15;
                }
                int i16 = configuration3.navigationHidden;
                int i17 = configuration4.navigationHidden;
                if (i16 != i17) {
                    configuration.navigationHidden = i17;
                }
                int i18 = configuration3.orientation;
                int i19 = configuration4.orientation;
                if (i18 != i19) {
                    configuration.orientation = i19;
                }
                int i20 = configuration3.screenLayout & 15;
                int i21 = configuration4.screenLayout & 15;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 192;
                int i23 = configuration4.screenLayout & 192;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 48;
                int i25 = configuration4.screenLayout & 48;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                int i26 = configuration3.screenLayout & 768;
                int i27 = configuration4.screenLayout & 768;
                if (i26 != i27) {
                    configuration.screenLayout |= i27;
                }
                if (i3 >= 26) {
                    int i28 = configuration3.colorMode & 3;
                    int i29 = configuration4.colorMode & 3;
                    if (i28 != i29) {
                        configuration.colorMode |= i29;
                    }
                    int i30 = configuration3.colorMode & 12;
                    int i31 = configuration4.colorMode & 12;
                    if (i30 != i31) {
                        configuration.colorMode |= i31;
                    }
                }
                int i32 = configuration3.uiMode & 15;
                int i33 = configuration4.uiMode & 15;
                if (i32 != i33) {
                    configuration.uiMode |= i33;
                }
                int i34 = configuration3.uiMode & 48;
                int i35 = configuration4.uiMode & 48;
                if (i34 != i35) {
                    configuration.uiMode |= i35;
                }
                int i36 = configuration3.screenWidthDp;
                int i37 = configuration4.screenWidthDp;
                if (i36 != i37) {
                    configuration.screenWidthDp = i37;
                }
                int i38 = configuration3.screenHeightDp;
                int i39 = configuration4.screenHeightDp;
                if (i38 != i39) {
                    configuration.screenHeightDp = i39;
                }
                int i40 = configuration3.smallestScreenWidthDp;
                int i41 = configuration4.smallestScreenWidthDp;
                if (i40 != i41) {
                    configuration.smallestScreenWidthDp = i41;
                }
                int i42 = configuration3.densityDpi;
                int i43 = configuration4.densityDpi;
                if (i42 != i43) {
                    configuration.densityDpi = i43;
                }
            }
        }
        Configuration configurationM14646G = m14646G(context, iM14658S, configuration);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2132017643);
        contextThemeWrapper.m14728a(configurationM14646G);
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            Resources.Theme theme = contextThemeWrapper.getTheme();
            int i44 = Build.VERSION.SDK_INT;
            if (i44 >= 29) {
                theme.rebase();
            } else if (i44 >= 23) {
                synchronized (ResourcesCompat2.f37846a) {
                    if (!ResourcesCompat2.f37848c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            ResourcesCompat2.f37847b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        ResourcesCompat2.f37848c = true;
                    }
                    Method method = ResourcesCompat2.f37847b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e3) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                            ResourcesCompat2.f37847b = null;
                        }
                    }
                }
            }
        }
        return contextThemeWrapper;
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: e */
    public <T extends View> T mo14619e(int i2) {
        m14650K();
        return (T) this.f34470n.findViewById(i2);
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: f */
    public int mo14620f() {
        return this.f34455U;
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: g */
    public MenuInflater mo14621g() {
        if (this.f34474r == null) {
            m14656Q();
            ActionBar actionBar = this.f34473q;
            this.f34474r = new SupportMenuInflater(actionBar != null ? actionBar.mo14585e() : this.f34469m);
        }
        return this.f34474r;
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: h */
    public ActionBar mo14622h() {
        m14656Q();
        return this.f34473q;
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: i */
    public void mo14623i() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f34469m);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: j */
    public void mo14624j() {
        m14656Q();
        ActionBar actionBar = this.f34473q;
        if (actionBar == null || !actionBar.mo14586f()) {
            m14657R(0);
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: k */
    public void mo14625k(Configuration configuration) {
        if (this.f34442H && this.f34436B) {
            m14656Q();
            ActionBar actionBar = this.f34473q;
            if (actionBar != null) {
                actionBar.mo14587g(configuration);
            }
        }
        AppCompatDrawableManager appCompatDrawableManagerM14904a = AppCompatDrawableManager.m14904a();
        Context context = this.f34469m;
        synchronized (appCompatDrawableManagerM14904a) {
            ResourceManagerInternal resourceManagerInternal = appCompatDrawableManagerM14904a.f35071c;
            synchronized (resourceManagerInternal) {
                LongSparseArray<WeakReference<Drawable.ConstantState>> longSparseArray = resourceManagerInternal.f35137g.get(context);
                if (longSparseArray != null) {
                    longSparseArray.m15585b();
                }
            }
        }
        m14641B(false);
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: l */
    public void mo14626l(Bundle bundle) {
        this.f34451Q = true;
        m14641B(false);
        m14651L();
        Object obj = this.f34468l;
        if (obj instanceof Activity) {
            String strM16030A = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    strM16030A = C8162a.m16030A(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (strM16030A != null) {
                ActionBar actionBar = this.f34473q;
                if (actionBar == null) {
                    this.f34464d0 = true;
                } else {
                    actionBar.mo14592l(true);
                }
            }
            synchronized (AppCompatDelegate.f34430g) {
                AppCompatDelegate.m14616s(this);
                AppCompatDelegate.f34429f.add(new WeakReference<>(this));
            }
        }
        this.f34452R = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: m */
    public void mo14627m() {
        if (this.f34468l instanceof Activity) {
            synchronized (AppCompatDelegate.f34430g) {
                AppCompatDelegate.m14616s(this);
            }
        }
        if (this.f34461a0) {
            this.f34470n.getDecorView().removeCallbacks(this.f34463c0);
        }
        this.f34453S = false;
        this.f34454T = true;
        if (this.f34455U != -100) {
            Object obj = this.f34468l;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f34431h.put(this.f34468l.getClass().getName(), Integer.valueOf(this.f34455U));
            } else {
                f34431h.remove(this.f34468l.getClass().getName());
            }
        } else {
            f34431h.remove(this.f34468l.getClass().getName());
        }
        ActionBar actionBar = this.f34473q;
        if (actionBar != null) {
            actionBar.mo14588h();
        }
        f fVar = this.f34459Y;
        if (fVar != null) {
            fVar.m14674a();
        }
        f fVar2 = this.f34460Z;
        if (fVar2 != null) {
            fVar2.m14674a();
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: n */
    public void mo14628n(Bundle bundle) {
        m14650K();
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: o */
    public void mo14629o() {
        m14656Q();
        ActionBar actionBar = this.f34473q;
        if (actionBar != null) {
            actionBar.mo14596p(true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View appCompatRatingBar;
        if (this.f34467g0 == null) {
            String string = this.f34469m.obtainStyledAttributes(C7463b.f34394j).getString(116);
            if (string == null) {
                this.f34467g0 = new AppCompatViewInflater();
            } else {
                try {
                    this.f34467g0 = (AppCompatViewInflater) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f34467g0 = new AppCompatViewInflater();
                }
            }
        }
        AppCompatViewInflater appCompatViewInflater = this.f34467g0;
        int i2 = VectorEnabledTintResources.f35001a;
        Objects.requireNonNull(appCompatViewInflater);
        byte b2 = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7463b.f34408x, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context contextThemeWrapper = (resourceId == 0 || ((context instanceof ContextThemeWrapper) && ((ContextThemeWrapper) context).f34667a == resourceId)) ? context : new ContextThemeWrapper(context, resourceId);
        str.hashCode();
        switch (str.hashCode()) {
            case -1946472170:
                if (!str.equals("RatingBar")) {
                    b2 = -1;
                } else {
                    b2 = 0;
                }
                break;
            case -1455429095:
                if (!str.equals("CheckedTextView")) {
                    b2 = -1;
                } else {
                    b2 = 1;
                }
                break;
            case -1346021293:
                if (!str.equals("MultiAutoCompleteTextView")) {
                    b2 = -1;
                } else {
                    b2 = 2;
                }
                break;
            case -938935918:
                if (!str.equals("TextView")) {
                    b2 = -1;
                } else {
                    b2 = 3;
                }
                break;
            case -937446323:
                if (!str.equals("ImageButton")) {
                    b2 = -1;
                }
                break;
            case -658531749:
                if (!str.equals("SeekBar")) {
                    b2 = -1;
                } else {
                    b2 = 5;
                }
                break;
            case -339785223:
                if (!str.equals("Spinner")) {
                    b2 = -1;
                } else {
                    b2 = 6;
                }
                break;
            case 776382189:
                if (!str.equals("RadioButton")) {
                    b2 = -1;
                } else {
                    b2 = 7;
                }
                break;
            case 799298502:
                if (!str.equals("ToggleButton")) {
                    b2 = -1;
                } else {
                    b2 = 8;
                }
                break;
            case 1125864064:
                if (!str.equals("ImageView")) {
                    b2 = -1;
                } else {
                    b2 = 9;
                }
                break;
            case 1413872058:
                if (!str.equals("AutoCompleteTextView")) {
                    b2 = -1;
                } else {
                    b2 = 10;
                }
                break;
            case 1601505219:
                if (!str.equals("CheckBox")) {
                    b2 = -1;
                } else {
                    b2 = 11;
                }
                break;
            case 1666676343:
                if (!str.equals("EditText")) {
                    b2 = -1;
                } else {
                    b2 = 12;
                }
                break;
            case 2001146706:
                if (!str.equals("Button")) {
                    b2 = -1;
                } else {
                    b2 = 13;
                }
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 3:
                appCompatRatingBar = appCompatViewInflater.mo12886e(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 7:
                appCompatRatingBar = appCompatViewInflater.mo12885d(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 8:
                appCompatRatingBar = new AppCompatToggleButton(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 9:
                appCompatRatingBar = new AppCompatImageView(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 10:
                appCompatRatingBar = appCompatViewInflater.mo12882a(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 11:
                appCompatRatingBar = appCompatViewInflater.mo12884c(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 12:
                appCompatRatingBar = new AppCompatEditText(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            case 13:
                appCompatRatingBar = appCompatViewInflater.mo12883b(contextThemeWrapper, attributeSet);
                appCompatViewInflater.m14682h(appCompatRatingBar, str);
                break;
            default:
                appCompatRatingBar = appCompatViewInflater.m14680f();
                break;
        }
        if (appCompatRatingBar == null && context != contextThemeWrapper) {
            appCompatRatingBar = null;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = appCompatViewInflater.f34525e;
                objArr[0] = contextThemeWrapper;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = AppCompatViewInflater.f34523c;
                        if (i3 < strArr.length) {
                            View viewM14681g = appCompatViewInflater.m14681g(contextThemeWrapper, str, strArr[i3]);
                            if (viewM14681g != null) {
                                Object[] objArr2 = appCompatViewInflater.f34525e;
                                objArr2[0] = null;
                                objArr2[1] = null;
                                appCompatRatingBar = viewM14681g;
                                appCompatViewInflater = objArr2;
                            } else {
                                i3++;
                            }
                        } else {
                            Object[] objArr3 = appCompatViewInflater.f34525e;
                            objArr3[0] = null;
                            objArr3[1] = null;
                            appCompatViewInflater = objArr3;
                        }
                    }
                } else {
                    View viewM14681g2 = appCompatViewInflater.m14681g(contextThemeWrapper, str, null);
                    Object[] objArr4 = appCompatViewInflater.f34525e;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    appCompatRatingBar = viewM14681g2;
                    appCompatViewInflater = objArr4;
                }
            } catch (Exception unused) {
                Object[] objArr5 = appCompatViewInflater.f34525e;
                objArr5[0] = appCompatRatingBar;
                objArr5[1] = appCompatRatingBar;
            } catch (Throwable th2) {
                Object[] objArr6 = appCompatViewInflater.f34525e;
                objArr6[0] = appCompatRatingBar;
                objArr6[1] = appCompatRatingBar;
                throw th2;
            }
        }
        if (appCompatRatingBar != null) {
            Context context2 = appCompatRatingBar.getContext();
            if (context2 instanceof ContextWrapper) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                if (appCompatRatingBar.hasOnClickListeners()) {
                    TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, AppCompatViewInflater.f34522b);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        appCompatRatingBar.setOnClickListener(new AppCompatViewInflater.a(appCompatRatingBar, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return appCompatRatingBar;
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: p */
    public void mo14630p(Bundle bundle) {
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: q */
    public void mo14631q() {
        this.f34453S = true;
        m14640A();
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: r */
    public void mo14632r() {
        this.f34453S = false;
        m14656Q();
        ActionBar actionBar = this.f34473q;
        if (actionBar != null) {
            actionBar.mo14596p(false);
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: t */
    public boolean mo14633t(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i2 = 108;
        } else if (i2 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i2 = 109;
        }
        if (this.f34446L && i2 == 108) {
            return false;
        }
        if (this.f34442H && i2 == 1) {
            this.f34442H = false;
        }
        if (i2 == 1) {
            m14663X();
            this.f34446L = true;
            return true;
        }
        if (i2 == 2) {
            m14663X();
            this.f34440F = true;
            return true;
        }
        if (i2 == 5) {
            m14663X();
            this.f34441G = true;
            return true;
        }
        if (i2 == 10) {
            m14663X();
            this.f34444J = true;
            return true;
        }
        if (i2 == 108) {
            m14663X();
            this.f34442H = true;
            return true;
        }
        if (i2 != 109) {
            return this.f34470n.requestFeature(i2);
        }
        m14663X();
        this.f34443I = true;
        return true;
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: u */
    public void mo14634u(int i2) {
        m14650K();
        ViewGroup viewGroup = (ViewGroup) this.f34437C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f34469m).inflate(i2, viewGroup);
        this.f34471o.f34734f.onContentChanged();
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: v */
    public void mo14635v(View view) {
        m14650K();
        ViewGroup viewGroup = (ViewGroup) this.f34437C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f34471o.f34734f.onContentChanged();
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: w */
    public void mo14636w(View view, ViewGroup.LayoutParams layoutParams) {
        m14650K();
        ViewGroup viewGroup = (ViewGroup) this.f34437C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f34471o.f34734f.onContentChanged();
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: x */
    public void mo14637x(Toolbar toolbar) {
        if (this.f34468l instanceof Activity) {
            m14656Q();
            ActionBar actionBar = this.f34473q;
            if (actionBar instanceof WindowDecorActionBar) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f34474r = null;
            if (actionBar != null) {
                actionBar.mo14588h();
            }
            if (toolbar != null) {
                Object obj = this.f34468l;
                ToolbarActionBar toolbarActionBar = new ToolbarActionBar(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f34475s, this.f34471o);
                this.f34473q = toolbarActionBar;
                this.f34470n.setCallback(toolbarActionBar.f34532c);
            } else {
                this.f34473q = null;
                this.f34470n.setCallback(this.f34471o);
            }
            mo14624j();
        }
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: y */
    public void mo14638y(int i2) {
        this.f34456V = i2;
    }

    @Override // p636z0.p644b.p645c.AppCompatDelegate
    /* JADX INFO: renamed from: z */
    public final void mo14639z(CharSequence charSequence) {
        this.f34475s = charSequence;
        DecorContentParent decorContentParent = this.f34476t;
        if (decorContentParent != null) {
            decorContentParent.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f34473q;
        if (actionBar != null) {
            actionBar.mo14599s(charSequence);
            return;
        }
        TextView textView = this.f34438D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: renamed from: z0.b.c.k$d */
    /* JADX INFO: compiled from: AppCompatDelegateImpl.java */
    public class d extends WindowCallbackWrapper {
        public d(Window.Callback callback) {
            super(callback);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: a */
        public final android.view.ActionMode m14670a(android.view.ActionMode.Callback callback) {
            ActionMode actionModeOnWindowStartingSupportActionMode;
            Context contextThemeWrapper;
            AppCompatCallback appCompatCallback;
            AppCompatCallback appCompatCallback2;
            SupportActionModeWrapper.a aVar = new SupportActionModeWrapper.a(AppCompatDelegateImpl.this.f34469m, callback);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            ActionMode actionMode = appCompatDelegateImpl.f34479w;
            if (actionMode != null) {
                actionMode.mo14692c();
            }
            c cVar = appCompatDelegateImpl.new c(aVar);
            appCompatDelegateImpl.m14656Q();
            ActionBar actionBar = appCompatDelegateImpl.f34473q;
            if (actionBar != null) {
                ActionMode actionModeMo14600t = actionBar.mo14600t(cVar);
                appCompatDelegateImpl.f34479w = actionModeMo14600t;
                if (actionModeMo14600t != null && (appCompatCallback2 = appCompatDelegateImpl.f34472p) != null) {
                    appCompatCallback2.onSupportActionModeStarted(actionModeMo14600t);
                }
            }
            if (appCompatDelegateImpl.f34479w == null) {
                appCompatDelegateImpl.m14649J();
                ActionMode actionMode2 = appCompatDelegateImpl.f34479w;
                if (actionMode2 != null) {
                    actionMode2.mo14692c();
                }
                AppCompatCallback appCompatCallback3 = appCompatDelegateImpl.f34472p;
                if (appCompatCallback3 == null || appCompatDelegateImpl.f34454T) {
                    actionModeOnWindowStartingSupportActionMode = null;
                } else {
                    try {
                        actionModeOnWindowStartingSupportActionMode = appCompatCallback3.onWindowStartingSupportActionMode(cVar);
                    } catch (AbstractMethodError unused) {
                        actionModeOnWindowStartingSupportActionMode = null;
                    }
                }
                if (actionModeOnWindowStartingSupportActionMode != null) {
                    appCompatDelegateImpl.f34479w = actionModeOnWindowStartingSupportActionMode;
                } else {
                    if (appCompatDelegateImpl.f34480x == null) {
                        if (appCompatDelegateImpl.f34445K) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = appCompatDelegateImpl.f34469m.getTheme();
                            theme.resolveAttribute(mtp.media.karaoke.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme themeNewTheme = appCompatDelegateImpl.f34469m.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                contextThemeWrapper = new ContextThemeWrapper(appCompatDelegateImpl.f34469m, 0);
                                contextThemeWrapper.getTheme().setTo(themeNewTheme);
                            } else {
                                contextThemeWrapper = appCompatDelegateImpl.f34469m;
                            }
                            appCompatDelegateImpl.f34480x = new ActionBarContextView(contextThemeWrapper);
                            PopupWindow popupWindow = new PopupWindow(contextThemeWrapper, (AttributeSet) null, mtp.media.karaoke.R.attr.actionModePopupWindowStyle);
                            appCompatDelegateImpl.f34481y = popupWindow;
                            C8162a.m16051V(popupWindow, 2);
                            appCompatDelegateImpl.f34481y.setContentView(appCompatDelegateImpl.f34480x);
                            appCompatDelegateImpl.f34481y.setWidth(-1);
                            contextThemeWrapper.getTheme().resolveAttribute(mtp.media.karaoke.R.attr.actionBarSize, typedValue, true);
                            appCompatDelegateImpl.f34480x.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, contextThemeWrapper.getResources().getDisplayMetrics()));
                            appCompatDelegateImpl.f34481y.setHeight(-2);
                            appCompatDelegateImpl.f34482z = new AppCompatDelegateImpl4(appCompatDelegateImpl);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) appCompatDelegateImpl.f34437C.findViewById(mtp.media.karaoke.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                appCompatDelegateImpl.m14656Q();
                                ActionBar actionBar2 = appCompatDelegateImpl.f34473q;
                                Context contextMo14585e = actionBar2 != null ? actionBar2.mo14585e() : null;
                                if (contextMo14585e == null) {
                                    contextMo14585e = appCompatDelegateImpl.f34469m;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(contextMo14585e));
                                appCompatDelegateImpl.f34480x = (ActionBarContextView) viewStubCompat.m254a();
                            }
                        }
                    }
                    if (appCompatDelegateImpl.f34480x != null) {
                        appCompatDelegateImpl.m14649J();
                        appCompatDelegateImpl.f34480x.m159h();
                        StandaloneActionMode standaloneActionMode = new StandaloneActionMode(appCompatDelegateImpl.f34480x.getContext(), appCompatDelegateImpl.f34480x, cVar, appCompatDelegateImpl.f34481y == null);
                        if (cVar.mo14666b(standaloneActionMode, standaloneActionMode.f34677m)) {
                            standaloneActionMode.mo14698i();
                            appCompatDelegateImpl.f34480x.m157f(standaloneActionMode);
                            appCompatDelegateImpl.f34479w = standaloneActionMode;
                            if (appCompatDelegateImpl.m14662W()) {
                                appCompatDelegateImpl.f34480x.setAlpha(0.0f);
                                ViewPropertyAnimatorCompat viewPropertyAnimatorCompatM16308b = ViewCompat.m16308b(appCompatDelegateImpl.f34480x);
                                viewPropertyAnimatorCompatM16308b.m16345a(1.0f);
                                appCompatDelegateImpl.f34435A = viewPropertyAnimatorCompatM16308b;
                                AppCompatDelegateImpl5 appCompatDelegateImpl5 = new AppCompatDelegateImpl5(appCompatDelegateImpl);
                                View view = viewPropertyAnimatorCompatM16308b.f38092a.get();
                                if (view != null) {
                                    viewPropertyAnimatorCompatM16308b.m16349e(view, appCompatDelegateImpl5);
                                }
                            } else {
                                appCompatDelegateImpl.f34480x.setAlpha(1.0f);
                                appCompatDelegateImpl.f34480x.setVisibility(0);
                                appCompatDelegateImpl.f34480x.sendAccessibilityEvent(32);
                                if (appCompatDelegateImpl.f34480x.getParent() instanceof View) {
                                    View view2 = (View) appCompatDelegateImpl.f34480x.getParent();
                                    AtomicInteger atomicInteger = ViewCompat.f38073a;
                                    view2.requestApplyInsets();
                                }
                            }
                            if (appCompatDelegateImpl.f34481y != null) {
                                appCompatDelegateImpl.f34470n.getDecorView().post(appCompatDelegateImpl.f34482z);
                            }
                        } else {
                            appCompatDelegateImpl.f34479w = null;
                        }
                    }
                }
                ActionMode actionMode3 = appCompatDelegateImpl.f34479w;
                if (actionMode3 != null && (appCompatCallback = appCompatDelegateImpl.f34472p) != null) {
                    appCompatCallback.onSupportActionModeStarted(actionMode3);
                }
                appCompatDelegateImpl.f34479w = appCompatDelegateImpl.f34479w;
            }
            ActionMode actionMode4 = appCompatDelegateImpl.f34479w;
            if (actionMode4 != null) {
                return aVar.m14730e(actionMode4);
            }
            return null;
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.m14647H(keyEvent) || this.f34734f.dispatchKeyEvent(keyEvent);
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z;
            if (!this.f34734f.dispatchKeyShortcutEvent(keyEvent)) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                int keyCode = keyEvent.getKeyCode();
                appCompatDelegateImpl.m14656Q();
                ActionBar actionBar = appCompatDelegateImpl.f34473q;
                if (actionBar == null || !actionBar.mo14589i(keyCode, keyEvent)) {
                    i iVar = appCompatDelegateImpl.f34449O;
                    if (iVar == null || !appCompatDelegateImpl.m14660U(iVar, keyEvent.getKeyCode(), keyEvent, 1)) {
                        if (appCompatDelegateImpl.f34449O == null) {
                            i iVarM14654O = appCompatDelegateImpl.m14654O(0);
                            appCompatDelegateImpl.m14661V(iVarM14654O, keyEvent);
                            boolean zM14660U = appCompatDelegateImpl.m14660U(iVarM14654O, keyEvent.getKeyCode(), keyEvent, 1);
                            iVarM14654O.f34507k = false;
                            if (zM14660U) {
                            }
                        }
                        z = false;
                    } else {
                        i iVar2 = appCompatDelegateImpl.f34449O;
                        if (iVar2 != null) {
                            iVar2.f34508l = true;
                        }
                    }
                    z = true;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof MenuBuilder)) {
                return this.f34734f.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            this.f34734f.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i == 108) {
                appCompatDelegateImpl.m14656Q();
                ActionBar actionBar = appCompatDelegateImpl.f34473q;
                if (actionBar != null) {
                    actionBar.mo14583c(true);
                }
            }
            return true;
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            this.f34734f.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i == 108) {
                appCompatDelegateImpl.m14656Q();
                ActionBar actionBar = appCompatDelegateImpl.f34473q;
                if (actionBar != null) {
                    actionBar.mo14583c(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                i iVarM14654O = appCompatDelegateImpl.m14654O(i);
                if (iVarM14654O.f34509m) {
                    appCompatDelegateImpl.m14645F(iVarM14654O, false);
                }
            }
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            MenuBuilder menuBuilder = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (i == 0 && menuBuilder == null) {
                return false;
            }
            if (menuBuilder != null) {
                menuBuilder.f34842y = true;
            }
            boolean zOnPreparePanel = this.f34734f.onPreparePanel(i, view, menu);
            if (menuBuilder != null) {
                menuBuilder.f34842y = false;
            }
            return zOnPreparePanel;
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            MenuBuilder menuBuilder = AppCompatDelegateImpl.this.m14654O(0).f34504h;
            if (menuBuilder != null) {
                this.f34734f.onProvideKeyboardShortcuts(list, menuBuilder, i);
            } else {
                this.f34734f.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            Objects.requireNonNull(AppCompatDelegateImpl.this);
            return m14670a(callback);
        }

        @Override // p636z0.p644b.p651g.WindowCallbackWrapper, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i) {
            Objects.requireNonNull(AppCompatDelegateImpl.this);
            if (i != 0) {
                return this.f34734f.onWindowStartingActionMode(callback, i);
            }
            return m14670a(callback);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
