package p636z0.p770y;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.UUID;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryController;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p759s.HasDefaultViewModelProviderFactory;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.LifecycleRegistry;
import p636z0.p759s.SavedStateViewModelFactory;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: z0.y.e, reason: use source file name */
/* JADX INFO: compiled from: NavBackStackEntry.java */
/* JADX INFO: loaded from: classes.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* JADX INFO: renamed from: f */
    public final Context f38999f;

    /* JADX INFO: renamed from: g */
    public final NavDestination f39000g;

    /* JADX INFO: renamed from: h */
    public Bundle f39001h;

    /* JADX INFO: renamed from: i */
    public final LifecycleRegistry f39002i;

    /* JADX INFO: renamed from: j */
    public final SavedStateRegistryController f39003j;

    /* JADX INFO: renamed from: k */
    public final UUID f39004k;

    /* JADX INFO: renamed from: l */
    public Lifecycle3.b f39005l;

    /* JADX INFO: renamed from: m */
    public Lifecycle3.b f39006m;

    /* JADX INFO: renamed from: n */
    public NavControllerViewModel f39007n;

    /* JADX INFO: renamed from: o */
    public ViewModelProvider2.b f39008o;

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, LifecycleOwner lifecycleOwner, NavControllerViewModel navControllerViewModel) {
        this(context, navDestination, bundle, lifecycleOwner, navControllerViewModel, UUID.randomUUID(), null);
    }

    /* JADX INFO: renamed from: a */
    public void m16903a() {
        if (this.f39005l.ordinal() < this.f39006m.ordinal()) {
            this.f39002i.m16736j(this.f39005l);
        } else {
            this.f39002i.m16736j(this.f39006m);
        }
    }

    @Override // p636z0.p759s.LifecycleOwner
    /* JADX INFO: renamed from: b */
    public Lifecycle3 mo124b() {
        return this.f39002i;
    }

    @Override // p636z0.p759s.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: i */
    public ViewModelProvider2.b mo126i() {
        if (this.f39008o == null) {
            this.f39008o = new SavedStateViewModelFactory((Application) this.f38999f.getApplicationContext(), this, this.f39001h);
        }
        return this.f39008o;
    }

    @Override // p636z0.p759s.ViewModelStoreOwner
    /* JADX INFO: renamed from: o */
    public ViewModelStore mo128o() {
        NavControllerViewModel navControllerViewModel = this.f39007n;
        if (navControllerViewModel == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
        }
        UUID uuid = this.f39004k;
        ViewModelStore viewModelStore = navControllerViewModel.f39014d.get(uuid);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        navControllerViewModel.f39014d.put(uuid, viewModelStore2);
        return viewModelStore2;
    }

    @Override // p636z0.p654b0.SavedStateRegistryOwner
    /* JADX INFO: renamed from: s */
    public SavedStateRegistry mo129s() {
        return this.f39003j.f35301b;
    }

    public NavBackStackEntry(Context context, NavDestination navDestination, Bundle bundle, LifecycleOwner lifecycleOwner, NavControllerViewModel navControllerViewModel, UUID uuid, Bundle bundle2) {
        this.f39002i = new LifecycleRegistry(this);
        SavedStateRegistryController savedStateRegistryController = new SavedStateRegistryController(this);
        this.f39003j = savedStateRegistryController;
        this.f39005l = Lifecycle3.b.CREATED;
        this.f39006m = Lifecycle3.b.RESUMED;
        this.f38999f = context;
        this.f39004k = uuid;
        this.f39000g = navDestination;
        this.f39001h = bundle;
        this.f39007n = navControllerViewModel;
        savedStateRegistryController.m15021a(bundle2);
        if (lifecycleOwner != null) {
            this.f39005l = lifecycleOwner.mo124b().mo16728b();
        }
    }
}
