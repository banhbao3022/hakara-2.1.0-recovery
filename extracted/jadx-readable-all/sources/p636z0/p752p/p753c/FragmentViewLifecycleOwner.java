package p636z0.p752p.p753c;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryController;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p759s.HasDefaultViewModelProviderFactory;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleRegistry;
import p636z0.p759s.SavedStateViewModelFactory;
import p636z0.p759s.ViewModelProvider2;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: z0.p.c.v0, reason: use source file name */
/* JADX INFO: compiled from: FragmentViewLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
public class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {

    /* JADX INFO: renamed from: f */
    public final Fragment f38559f;

    /* JADX INFO: renamed from: g */
    public final ViewModelStore f38560g;

    /* JADX INFO: renamed from: h */
    public ViewModelProvider2.b f38561h;

    /* JADX INFO: renamed from: i */
    public LifecycleRegistry f38562i = null;

    /* JADX INFO: renamed from: j */
    public SavedStateRegistryController f38563j = null;

    public FragmentViewLifecycleOwner(Fragment fragment, ViewModelStore viewModelStore) {
        this.f38559f = fragment;
        this.f38560g = viewModelStore;
    }

    /* JADX INFO: renamed from: a */
    public void m16615a(Lifecycle3.a aVar) {
        LifecycleRegistry lifecycleRegistry = this.f38562i;
        lifecycleRegistry.m16732e("handleLifecycleEvent");
        lifecycleRegistry.m16734h(aVar.getTargetState());
    }

    @Override // p636z0.p759s.LifecycleOwner
    /* JADX INFO: renamed from: b */
    public Lifecycle3 mo124b() {
        m16616c();
        return this.f38562i;
    }

    /* JADX INFO: renamed from: c */
    public void m16616c() {
        if (this.f38562i == null) {
            this.f38562i = new LifecycleRegistry(this);
            this.f38563j = new SavedStateRegistryController(this);
        }
    }

    @Override // p636z0.p759s.HasDefaultViewModelProviderFactory
    /* JADX INFO: renamed from: i */
    public ViewModelProvider2.b mo126i() {
        ViewModelProvider2.b bVarMo126i = this.f38559f.mo126i();
        if (!bVarMo126i.equals(this.f38559f.f38428Y)) {
            this.f38561h = bVarMo126i;
            return bVarMo126i;
        }
        if (this.f38561h == null) {
            Application application = null;
            for (Context applicationContext = this.f38559f.m16528G0().getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
            }
            this.f38561h = new SavedStateViewModelFactory(application, this, this.f38559f.f38438m);
        }
        return this.f38561h;
    }

    @Override // p636z0.p759s.ViewModelStoreOwner
    /* JADX INFO: renamed from: o */
    public ViewModelStore mo128o() {
        m16616c();
        return this.f38560g;
    }

    @Override // p636z0.p654b0.SavedStateRegistryOwner
    /* JADX INFO: renamed from: s */
    public SavedStateRegistry mo129s() {
        m16616c();
        return this.f38563j.f35301b;
    }
}
