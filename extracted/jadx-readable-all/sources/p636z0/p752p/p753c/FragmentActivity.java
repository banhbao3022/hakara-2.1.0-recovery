package p636z0.p752p.p753c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p636z0.p637a.OnBackPressedDispatcherOwner;
import p636z0.p637a.p638d.ContextAwareHelper;
import p636z0.p637a.p638d.OnContextAvailableListener;
import p636z0.p637a.p639e.ActivityResultRegistry;
import p636z0.p637a.p639e.ActivityResultRegistryOwner;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p725k.C8162a;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleRegistry;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;
import p636z0.p760t.p761a.LoaderManager;

/* JADX INFO: renamed from: z0.p.c.n, reason: use source file name */
/* JADX INFO: compiled from: FragmentActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentActivity extends ComponentActivity implements ActivityCompat.b, ActivityCompat.c {

    /* JADX INFO: renamed from: o */
    public final FragmentController f38474o;

    /* JADX INFO: renamed from: p */
    public final LifecycleRegistry f38475p;

    /* JADX INFO: renamed from: q */
    public boolean f38476q;

    /* JADX INFO: renamed from: r */
    public boolean f38477r;

    /* JADX INFO: renamed from: s */
    public boolean f38478s;

    /* JADX INFO: renamed from: z0.p.c.n$a */
    /* JADX INFO: compiled from: FragmentActivity.java */
    public class a implements SavedStateRegistry.b {
        public a() {
        }

        @Override // p636z0.p654b0.SavedStateRegistry.b
        /* JADX INFO: renamed from: a */
        public Bundle mo867a() {
            Bundle bundle = new Bundle();
            while (FragmentActivity.m16576E(FragmentActivity.this.m16577C(), Lifecycle3.b.CREATED)) {
            }
            FragmentActivity.this.f38475p.m16733f(Lifecycle3.a.ON_STOP);
            Parcelable parcelableM16678c0 = FragmentActivity.this.f38474o.f38555a.f38567i.m16678c0();
            if (parcelableM16678c0 != null) {
                bundle.putParcelable("android:support:fragments", parcelableM16678c0);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: z0.p.c.n$b */
    /* JADX INFO: compiled from: FragmentActivity.java */
    public class b implements OnContextAvailableListener {
        public b() {
        }

        @Override // p636z0.p637a.p638d.OnContextAvailableListener
        /* JADX INFO: renamed from: a */
        public void mo14491a(Context context) {
            FragmentHostCallback<?> fragmentHostCallback = FragmentActivity.this.f38474o.f38555a;
            fragmentHostCallback.f38567i.m16675b(fragmentHostCallback, fragmentHostCallback, null);
            Bundle bundleM15018a = FragmentActivity.this.f140i.f35301b.m15018a("android:support:fragments");
            if (bundleM15018a != null) {
                Parcelable parcelable = bundleM15018a.getParcelable("android:support:fragments");
                FragmentHostCallback<?> fragmentHostCallback2 = FragmentActivity.this.f38474o.f38555a;
                if (!(fragmentHostCallback2 instanceof ViewModelStoreOwner)) {
                    throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
                }
                fragmentHostCallback2.f38567i.m16676b0(parcelable);
            }
        }
    }

    /* JADX INFO: renamed from: z0.p.c.n$c */
    /* JADX INFO: compiled from: FragmentActivity.java */
    public class c extends FragmentHostCallback<FragmentActivity> implements ViewModelStoreOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, FragmentOnAttachListener {
        public c() {
            super(FragmentActivity.this, FragmentActivity.this, new Handler(), 0);
        }

        @Override // p636z0.p752p.p753c.FragmentOnAttachListener
        /* JADX INFO: renamed from: a */
        public void mo16472a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.m16579F();
        }

        @Override // p636z0.p759s.LifecycleOwner
        /* JADX INFO: renamed from: b */
        public Lifecycle3 mo124b() {
            return FragmentActivity.this.f38475p;
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback, p636z0.p752p.p753c.FragmentContainer
        /* JADX INFO: renamed from: c */
        public View mo16514c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // p636z0.p637a.OnBackPressedDispatcherOwner
        /* JADX INFO: renamed from: d */
        public OnBackPressedDispatcher mo125d() {
            return FragmentActivity.this.f143l;
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback, p636z0.p752p.p753c.FragmentContainer
        /* JADX INFO: renamed from: e */
        public boolean mo16515e() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback
        /* JADX INFO: renamed from: f */
        public void mo16580f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, null, printWriter, strArr);
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback
        /* JADX INFO: renamed from: g */
        public FragmentActivity mo16581g() {
            return FragmentActivity.this;
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback
        /* JADX INFO: renamed from: h */
        public LayoutInflater mo16582h() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback
        /* JADX INFO: renamed from: i */
        public boolean mo16583i(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback
        /* JADX INFO: renamed from: j */
        public boolean mo16584j(String str) {
            FragmentActivity fragmentActivity = FragmentActivity.this;
            int i = ActivityCompat.f37660b;
            if (Build.VERSION.SDK_INT >= 23) {
                return fragmentActivity.shouldShowRequestPermissionRationale(str);
            }
            return false;
        }

        @Override // p636z0.p752p.p753c.FragmentHostCallback
        /* JADX INFO: renamed from: k */
        public void mo16585k() {
            FragmentActivity.this.mo14608G();
        }

        @Override // p636z0.p637a.p639e.ActivityResultRegistryOwner
        /* JADX INFO: renamed from: l */
        public ActivityResultRegistry mo127l() {
            return FragmentActivity.this.f145n;
        }

        @Override // p636z0.p759s.ViewModelStoreOwner
        /* JADX INFO: renamed from: o */
        public ViewModelStore mo128o() {
            return FragmentActivity.this.mo128o();
        }
    }

    public FragmentActivity() {
        c cVar = new c();
        C8162a.m16063h(cVar, "callbacks == null");
        this.f38474o = new FragmentController(cVar);
        this.f38475p = new LifecycleRegistry(this);
        this.f38478s = true;
        m16578D();
    }

    /* JADX INFO: renamed from: E */
    public static boolean m16576E(FragmentManager fragmentManager, Lifecycle3.b bVar) {
        boolean zM16576E = false;
        for (Fragment fragment : fragmentManager.m16659L()) {
            if (fragment != null) {
                FragmentHostCallback<?> fragmentHostCallback = fragment.f38451z;
                if ((fragmentHostCallback == null ? null : fragmentHostCallback.mo16581g()) != null) {
                    zM16576E |= m16576E(fragment.m16570w(), bVar);
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.f38426W;
                if (fragmentViewLifecycleOwner != null) {
                    fragmentViewLifecycleOwner.m16616c();
                    if (fragmentViewLifecycleOwner.f38562i.f38705b.isAtLeast(Lifecycle3.b.STARTED)) {
                        LifecycleRegistry lifecycleRegistry = fragment.f38426W.f38562i;
                        lifecycleRegistry.m16732e("setCurrentState");
                        lifecycleRegistry.m16734h(bVar);
                        zM16576E = true;
                    }
                }
                if (fragment.f38425V.f38705b.isAtLeast(Lifecycle3.b.STARTED)) {
                    LifecycleRegistry lifecycleRegistry2 = fragment.f38425V;
                    lifecycleRegistry2.m16732e("setCurrentState");
                    lifecycleRegistry2.m16734h(bVar);
                    zM16576E = true;
                }
            }
        }
        return zM16576E;
    }

    /* JADX INFO: renamed from: C */
    public FragmentManager m16577C() {
        return this.f38474o.f38555a.f38567i;
    }

    /* JADX INFO: renamed from: D */
    public final void m16578D() {
        this.f140i.f35301b.m15019b("android:support:fragments", new a());
        b bVar = new b();
        ContextAwareHelper contextAwareHelper = this.f138g;
        if (contextAwareHelper.f34170b != null) {
            bVar.mo14491a(contextAwareHelper.f34170b);
        }
        contextAwareHelper.f34169a.add(bVar);
    }

    @Deprecated
    /* JADX INFO: renamed from: F */
    public void m16579F() {
    }

    @Deprecated
    /* JADX INFO: renamed from: G */
    public void mo14608G() {
        invalidateOptionsMenu();
    }

    @Override // p636z0.p725k.p726c.ActivityCompat.c
    @Deprecated
    /* JADX INFO: renamed from: c */
    public final void mo16083c(int i) {
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f38476q);
        printWriter.print(" mResumed=");
        printWriter.print(this.f38477r);
        printWriter.print(" mStopped=");
        printWriter.print(this.f38478s);
        if (getApplication() != null) {
            LoaderManager.m16748b(this).mo16749a(str2, fileDescriptor, printWriter, strArr);
        }
        this.f38474o.f38555a.f38567i.m16709y(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f38474o.m16611a();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f38474o.m16611a();
        this.f38474o.f38555a.f38567i.m16693k(configuration);
    }

    @Override // androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38475p.m16733f(Lifecycle3.a.ON_CREATE);
        this.f38474o.f38555a.f38567i.m16697m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        FragmentController fragmentController = this.f38474o;
        return zOnCreatePanelMenu | fragmentController.f38555a.f38567i.m16698n(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f38474o.f38555a.f38567i.f38620f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f38474o.f38555a.f38567i.m16699o();
        this.f38475p.m16733f(Lifecycle3.a.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f38474o.f38555a.f38567i.m16700p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.f38474o.f38555a.f38567i.m16702r(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.f38474o.f38555a.f38567i.m16695l(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.f38474o.f38555a.f38567i.m16701q(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.f38474o.m16611a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.f38474o.f38555a.f38567i.m16703s(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f38477r = false;
        this.f38474o.f38555a.f38567i.m16707w(5);
        this.f38475p.m16733f(Lifecycle3.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.f38474o.f38555a.f38567i.m16705u(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f38475p.m16733f(Lifecycle3.a.ON_RESUME);
        FragmentManager fragmentManager = this.f38474o.f38555a.f38567i;
        fragmentManager.f38605B = false;
        fragmentManager.f38606C = false;
        fragmentManager.f38613J.f38303i = false;
        fragmentManager.m16707w(7);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? super.onPreparePanel(0, view, menu) | this.f38474o.f38555a.f38567i.m16706v(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f38474o.m16611a();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f38477r = true;
        this.f38474o.m16611a();
        this.f38474o.f38555a.f38567i.m16650C(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f38478s = false;
        if (!this.f38476q) {
            this.f38476q = true;
            FragmentManager fragmentManager = this.f38474o.f38555a.f38567i;
            fragmentManager.f38605B = false;
            fragmentManager.f38606C = false;
            fragmentManager.f38613J.f38303i = false;
            fragmentManager.m16707w(4);
        }
        this.f38474o.m16611a();
        this.f38474o.f38555a.f38567i.m16650C(true);
        this.f38475p.m16733f(Lifecycle3.a.ON_START);
        FragmentManager fragmentManager2 = this.f38474o.f38555a.f38567i;
        fragmentManager2.f38605B = false;
        fragmentManager2.f38606C = false;
        fragmentManager2.f38613J.f38303i = false;
        fragmentManager2.m16707w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f38474o.m16611a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f38478s = true;
        while (m16576E(m16577C(), Lifecycle3.b.CREATED)) {
        }
        FragmentManager fragmentManager = this.f38474o.f38555a.f38567i;
        fragmentManager.f38606C = true;
        fragmentManager.f38613J.f38303i = true;
        fragmentManager.m16707w(4);
        this.f38475p.m16733f(Lifecycle3.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = this.f38474o.f38555a.f38567i.f38620f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        c cVar = new c();
        C8162a.m16063h(cVar, "callbacks == null");
        this.f38474o = new FragmentController(cVar);
        this.f38475p = new LifecycleRegistry(this);
        this.f38478s = true;
        m16578D();
    }
}
