package p636z0.p654b0;

import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.savedstate.Recreator;
import java.util.Map;
import java.util.Objects;
import p636z0.p655c.p656a.p658b.SafeIterableMap;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: renamed from: z0.b0.b, reason: use source file name */
/* JADX INFO: compiled from: SavedStateRegistryController.java */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateRegistryController {

    /* JADX INFO: renamed from: a */
    public final SavedStateRegistryOwner f35300a;

    /* JADX INFO: renamed from: b */
    public final SavedStateRegistry f35301b = new SavedStateRegistry();

    public SavedStateRegistryController(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f35300a = savedStateRegistryOwner;
    }

    /* JADX INFO: renamed from: a */
    public void m15021a(Bundle bundle) {
        Lifecycle3 lifecycle3Mo124b = this.f35300a.mo124b();
        if (lifecycle3Mo124b.mo16728b() != Lifecycle3.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle3Mo124b.mo16727a(new Recreator(this.f35300a));
        final SavedStateRegistry savedStateRegistry = this.f35301b;
        if (savedStateRegistry.f35297c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            savedStateRegistry.f35296b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        lifecycle3Mo124b.mo16727a(new GenericLifecycleObserver() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                if (aVar == Lifecycle3.a.ON_START) {
                    savedStateRegistry.f35299e = true;
                } else if (aVar == Lifecycle3.a.ON_STOP) {
                    savedStateRegistry.f35299e = false;
                }
            }
        });
        savedStateRegistry.f35297c = true;
    }

    /* JADX INFO: renamed from: b */
    public void m15022b(Bundle bundle) {
        SavedStateRegistry savedStateRegistry = this.f35301b;
        Objects.requireNonNull(savedStateRegistry);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = savedStateRegistry.f35296b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        SafeIterableMap<String, SavedStateRegistry.b>.d dVarM15031f = savedStateRegistry.f35295a.m15031f();
        while (dVarM15031f.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarM15031f.next();
            bundle2.putBundle((String) entry.getKey(), ((SavedStateRegistry.b) entry.getValue()).mo867a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
