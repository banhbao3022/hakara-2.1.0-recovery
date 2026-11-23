package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryOwner;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class Recreator implements GenericLifecycleObserver {

    /* JADX INFO: renamed from: f */
    public final SavedStateRegistryOwner f1168f;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$a */
    public static final class C0182a implements SavedStateRegistry.b {

        /* JADX INFO: renamed from: a */
        public final Set<String> f1169a = new HashSet();

        public C0182a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m15019b("androidx.savedstate.Restarter", this);
        }

        @Override // p636z0.p654b0.SavedStateRegistry.b
        /* JADX INFO: renamed from: a */
        public Bundle mo867a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f1169a));
            return bundle;
        }
    }

    public Recreator(SavedStateRegistryOwner savedStateRegistryOwner) {
        this.f1168f = savedStateRegistryOwner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        if (aVar != Lifecycle3.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        lifecycleOwner.mo124b().mo16729c(this);
        Bundle bundleM15018a = this.f1168f.mo129s().m15018a("androidx.savedstate.Restarter");
        if (bundleM15018a == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleM15018a.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        ((SavedStateRegistry.a) declaredConstructor.newInstance(new Object[0])).mo436a(this.f1168f);
                    } catch (Exception e) {
                        throw new RuntimeException(outline.m1599u("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder sbM1556G = outline.m1556G("Class");
                    sbM1556G.append(clsAsSubclass.getSimpleName());
                    sbM1556G.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sbM1556G.toString(), e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(outline.m1600v("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
