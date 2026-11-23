package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.SavedStateHandle;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final String f787f;

    /* JADX INFO: renamed from: g */
    public boolean f788g = false;

    /* JADX INFO: renamed from: h */
    public final SavedStateHandle f789h;

    /* JADX INFO: renamed from: androidx.lifecycle.SavedStateHandleController$a */
    public static final class C0125a implements SavedStateRegistry.a {
        @Override // p636z0.p654b0.SavedStateRegistry.a
        /* JADX INFO: renamed from: a */
        public void mo436a(SavedStateRegistryOwner savedStateRegistryOwner) {
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            ViewModelStore viewModelStoreMo128o = ((ViewModelStoreOwner) savedStateRegistryOwner).mo128o();
            SavedStateRegistry savedStateRegistryMo129s = savedStateRegistryOwner.mo129s();
            Objects.requireNonNull(viewModelStoreMo128o);
            Iterator it = new HashSet(viewModelStoreMo128o.f38702a.keySet()).iterator();
            while (it.hasNext()) {
                SavedStateHandleController.m432e(viewModelStoreMo128o.f38702a.get((String) it.next()), savedStateRegistryMo129s, savedStateRegistryOwner.mo124b());
            }
            if (new HashSet(viewModelStoreMo128o.f38702a.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistryMo129s.m15020c(C0125a.class);
        }
    }

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.f787f = str;
        this.f789h = savedStateHandle;
    }

    /* JADX INFO: renamed from: e */
    public static void m432e(ViewModel viewModel, SavedStateRegistry savedStateRegistry, Lifecycle3 lifecycle3) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.m437d("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f788g) {
            return;
        }
        savedStateHandleController.m435f(savedStateRegistry, lifecycle3);
        m434h(savedStateRegistry, lifecycle3);
    }

    /* JADX INFO: renamed from: g */
    public static SavedStateHandleController m433g(SavedStateRegistry savedStateRegistry, Lifecycle3 lifecycle3, String str, Bundle bundle) {
        SavedStateHandle savedStateHandle;
        Bundle bundleM15018a = savedStateRegistry.m15018a(str);
        Class[] clsArr = SavedStateHandle.f38730a;
        if (bundleM15018a == null && bundle == null) {
            savedStateHandle = new SavedStateHandle();
        } else {
            HashMap map = new HashMap();
            if (bundle != null) {
                for (String str2 : bundle.keySet()) {
                    map.put(str2, bundle.get(str2));
                }
            }
            if (bundleM15018a == null) {
                savedStateHandle = new SavedStateHandle(map);
            } else {
                ArrayList parcelableArrayList = bundleM15018a.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundleM15018a.getParcelableArrayList("values");
                if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
                    throw new IllegalStateException("Invalid bundle passed as restored state");
                }
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    map.put((String) parcelableArrayList.get(i), parcelableArrayList2.get(i));
                }
                savedStateHandle = new SavedStateHandle(map);
            }
        }
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, savedStateHandle);
        savedStateHandleController.m435f(savedStateRegistry, lifecycle3);
        m434h(savedStateRegistry, lifecycle3);
        return savedStateHandleController;
    }

    /* JADX INFO: renamed from: h */
    public static void m434h(final SavedStateRegistry savedStateRegistry, final Lifecycle3 lifecycle3) {
        Lifecycle3.b bVarMo16728b = lifecycle3.mo16728b();
        if (bVarMo16728b == Lifecycle3.b.INITIALIZED || bVarMo16728b.isAtLeast(Lifecycle3.b.STARTED)) {
            savedStateRegistry.m15020c(C0125a.class);
        } else {
            lifecycle3.mo16727a(new LifecycleEventObserver() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                /* JADX INFO: renamed from: c */
                public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                    if (aVar == Lifecycle3.a.ON_START) {
                        lifecycle3.mo16729c(this);
                        savedStateRegistry.m15020c(C0125a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        if (aVar == Lifecycle3.a.ON_DESTROY) {
            this.f788g = false;
            lifecycleOwner.mo124b().mo16729c(this);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m435f(SavedStateRegistry savedStateRegistry, Lifecycle3 lifecycle3) {
        if (this.f788g) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f788g = true;
        lifecycle3.mo16727a(this);
        savedStateRegistry.m15019b(this.f787f, this.f789h.f38734e);
    }
}
