package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.LifecycleEventObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import mtp.media.karaoke.R;
import p636z0.p637a.OnBackPressedDispatcherOwner;
import p636z0.p637a.p638d.ContextAwareHelper;
import p636z0.p637a.p638d.OnContextAvailableListener;
import p636z0.p637a.p639e.ActivityResultCallback;
import p636z0.p637a.p639e.ActivityResultRegistry;
import p636z0.p637a.p639e.ActivityResultRegistryOwner;
import p636z0.p637a.p639e.IntentSenderRequest;
import p636z0.p637a.p639e.p640g.ActivityResultContract;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryController;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p726c.ActivityOptionsCompat;
import p636z0.p725k.p726c.ComponentActivity2;
import p636z0.p759s.HasDefaultViewModelProviderFactory;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.LifecycleRegistry;
import p636z0.p759s.ReportFragment;
import p636z0.p759s.SavedStateViewModelFactory;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends ComponentActivity2 implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner {

    /* JADX INFO: renamed from: g */
    public final ContextAwareHelper f138g;

    /* JADX INFO: renamed from: h */
    public final LifecycleRegistry f139h;

    /* JADX INFO: renamed from: i */
    public final SavedStateRegistryController f140i;

    /* JADX INFO: renamed from: j */
    public ViewModelStore f141j;

    /* JADX INFO: renamed from: k */
    public ViewModelProvider2.b f142k;

    /* JADX INFO: renamed from: l */
    public final OnBackPressedDispatcher f143l;

    /* JADX INFO: renamed from: m */
    public int f144m;

    /* JADX INFO: renamed from: n */
    public final ActivityResultRegistry f145n;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a */
    public class RunnableC0045a implements Runnable {
        public RunnableC0045a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b */
    public class C0046b extends ActivityResultRegistry {

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f151f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ ActivityResultContract.a f152g;

            public a(int i, ActivityResultContract.a aVar) {
                this.f151f = i;
                this.f152g = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                ActivityResultCallback<?> activityResultCallback;
                C0046b c0046b = C0046b.this;
                int i = this.f151f;
                Object obj = this.f152g.f34195a;
                String str = c0046b.f34174b.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                c0046b.f34177e.remove(str);
                ActivityResultRegistry.b<?> bVar = c0046b.f34178f.get(str);
                if (bVar != null && (activityResultCallback = bVar.f34185a) != null) {
                    activityResultCallback.mo14492a(obj);
                } else {
                    c0046b.f34180h.remove(str);
                    c0046b.f34179g.put(str, obj);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$b$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ int f154f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ IntentSender.SendIntentException f155g;

            public b(int i, IntentSender.SendIntentException sendIntentException) {
                this.f154f = i;
                this.f155g = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0046b.this.m14495a(this.f154f, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f155g));
            }
        }

        public C0046b() {
        }

        @Override // p636z0.p637a.p639e.ActivityResultRegistry
        /* JADX INFO: renamed from: b */
        public <I, O> void mo131b(int i, ActivityResultContract<I, O> activityResultContract, I i2, ActivityOptionsCompat activityOptionsCompat) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            ActivityResultContract.a<O> aVarMo14499b = activityResultContract.mo14499b(componentActivity, i2);
            if (aVarMo14499b != null) {
                new Handler(Looper.getMainLooper()).post(new a(i, aVarMo14499b));
                return;
            }
            Intent intentMo14498a = activityResultContract.mo14498a(componentActivity, i2);
            if (intentMo14498a.getExtras() != null && intentMo14498a.getExtras().getClassLoader() == null) {
                intentMo14498a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo14498a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentMo14498a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentMo14498a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                if (activityOptionsCompat != null) {
                    throw null;
                }
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentMo14498a.getAction())) {
                String[] stringArrayExtra = intentMo14498a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.m16082c(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentMo14498a.getAction())) {
                int i3 = ActivityCompat.f37660b;
                componentActivity.startActivityForResult(intentMo14498a, i, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo14498a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f34187f;
                Intent intent = intentSenderRequest.f34188g;
                int i4 = intentSenderRequest.f34189h;
                int i5 = intentSenderRequest.f34190i;
                int i6 = ActivityCompat.f37660b;
                componentActivity.startIntentSenderForResult(intentSender, i, intent, i4, i5, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new b(i, e));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$c */
    public static final class C0047c {

        /* JADX INFO: renamed from: a */
        public ViewModelStore f157a;
    }

    public ComponentActivity() {
        this.f138g = new ContextAwareHelper();
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
        this.f139h = lifecycleRegistry;
        this.f140i = new SavedStateRegistryController(this);
        this.f143l = new OnBackPressedDispatcher(new RunnableC0045a());
        new AtomicInteger();
        this.f145n = new C0046b();
        if (lifecycleRegistry == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        lifecycleRegistry.mo16727a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                if (aVar == Lifecycle3.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        lifecycleRegistry.mo16727a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                if (aVar == Lifecycle3.a.ON_DESTROY) {
                    ComponentActivity.this.f138g.f34170b = null;
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.mo128o().m16725a();
                }
            }
        });
        lifecycleRegistry.mo16727a(new LifecycleEventObserver() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                ComponentActivity.this.m122A();
                LifecycleRegistry lifecycleRegistry2 = ComponentActivity.this.f139h;
                lifecycleRegistry2.m16732e("removeObserver");
                lifecycleRegistry2.f38704a.mo15030m(this);
            }
        });
        if (i <= 23) {
            lifecycleRegistry.mo16727a(new ImmLeaksCleaner(this));
        }
    }

    /* JADX INFO: renamed from: A */
    public void m122A() {
        if (this.f141j == null) {
            C0047c c0047c = (C0047c) getLastNonConfigurationInstance();
            if (c0047c != null) {
                this.f141j = c0047c.f157a;
            }
            if (this.f141j == null) {
                this.f141j = new ViewModelStore();
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m123B() {
        getWindow().getDecorView().setTag(R.id.view_tree_lifecycle_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_view_model_store_owner, this);
        getWindow().getDecorView().setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m123B();
        super.addContentView(view, layoutParams);
    }

    @Override // p636z0.p725k.p726c.ComponentActivity2, p636z0.p759s.LifecycleOwner
    /* JADX INFO: renamed from: b */
    public Lifecycle3 mo124b() {
        return this.f139h;
    }

    @Override // p636z0.p637a.OnBackPressedDispatcherOwner
    /* JADX INFO: renamed from: d */
    public final OnBackPressedDispatcher mo125d() {
        return this.f143l;
    }

    @Override // p636z0.p759s.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: i */
    public ViewModelProvider2.b mo126i() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f142k == null) {
            this.f142k = new SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.f142k;
    }

    @Override // p636z0.p637a.p639e.ActivityResultRegistryOwner
    /* JADX INFO: renamed from: l */
    public final ActivityResultRegistry mo127l() {
        return this.f145n;
    }

    @Override // p636z0.p759s.ViewModelStoreOwner
    /* JADX INFO: renamed from: o */
    public ViewModelStore mo128o() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        m122A();
        return this.f141j;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f145n.m14495a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f143l.m133b();
    }

    @Override // p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f140i.m15021a(bundle);
        ContextAwareHelper contextAwareHelper = this.f138g;
        contextAwareHelper.f34170b = this;
        Iterator<OnContextAvailableListener> it = contextAwareHelper.f34169a.iterator();
        while (it.hasNext()) {
            it.next().mo14491a(this);
        }
        super.onCreate(bundle);
        ActivityResultRegistry activityResultRegistry = this.f145n;
        Objects.requireNonNull(activityResultRegistry);
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    int iIntValue = integerArrayList.get(i).intValue();
                    String str = stringArrayList.get(i);
                    activityResultRegistry.f34174b.put(Integer.valueOf(iIntValue), str);
                    activityResultRegistry.f34175c.put(str, Integer.valueOf(iIntValue));
                }
                activityResultRegistry.f34177e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                activityResultRegistry.f34173a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                activityResultRegistry.f34180h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            }
        }
        ReportFragment.m16746c(this);
        int i2 = this.f144m;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.f145n.m14495a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0047c c0047c;
        ViewModelStore viewModelStore = this.f141j;
        if (viewModelStore == null && (c0047c = (C0047c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = c0047c.f157a;
        }
        if (viewModelStore == null) {
            return null;
        }
        C0047c c0047c2 = new C0047c();
        c0047c2.f157a = viewModelStore;
        return c0047c2;
    }

    @Override // p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        LifecycleRegistry lifecycleRegistry = this.f139h;
        if (lifecycleRegistry instanceof LifecycleRegistry) {
            lifecycleRegistry.m16736j(Lifecycle3.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f140i.m15022b(bundle);
        ActivityResultRegistry activityResultRegistry = this.f145n;
        Objects.requireNonNull(activityResultRegistry);
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(activityResultRegistry.f34174b.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(activityResultRegistry.f34174b.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f34177e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) activityResultRegistry.f34180h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", activityResultRegistry.f34173a);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C8462c.m16950q()) {
                Trace.beginSection("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            Trace.endSection();
        }
    }

    @Override // p636z0.p654b0.SavedStateRegistryOwner
    /* JADX INFO: renamed from: s */
    public final SavedStateRegistry mo129s() {
        return this.f140i.f35301b;
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m123B();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        m123B();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        m123B();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.f144m = i;
    }
}
