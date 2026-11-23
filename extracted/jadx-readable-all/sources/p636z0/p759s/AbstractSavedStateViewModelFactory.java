package p636z0.p759s;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.ViewModel;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryOwner;

/* JADX INFO: renamed from: z0.s.a, reason: use source file name */
/* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider2.c {

    /* JADX INFO: renamed from: a */
    public final SavedStateRegistry f38665a;

    /* JADX INFO: renamed from: b */
    public final Lifecycle3 f38666b;

    /* JADX INFO: renamed from: c */
    public final Bundle f38667c;

    public AbstractSavedStateViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        this.f38665a = savedStateRegistryOwner.mo129s();
        this.f38666b = savedStateRegistryOwner.mo124b();
        this.f38667c = bundle;
    }

    @Override // p636z0.p759s.ViewModelProvider2.c, p636z0.p759s.ViewModelProvider2.b
    /* JADX INFO: renamed from: a */
    public final <T extends ViewModel> T mo13840a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo16715c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p636z0.p759s.ViewModelProvider2.e
    /* JADX INFO: renamed from: b */
    public void mo16714b(ViewModel viewModel) {
        SavedStateHandleController.m432e(viewModel, this.f38665a, this.f38666b);
    }

    @Override // p636z0.p759s.ViewModelProvider2.c
    /* JADX INFO: renamed from: c */
    public final <T extends ViewModel> T mo16715c(String str, Class<T> cls) {
        SavedStateHandleController savedStateHandleControllerM433g = SavedStateHandleController.m433g(this.f38665a, this.f38666b, str, this.f38667c);
        T t = (T) mo13841d(str, cls, savedStateHandleControllerM433g.f789h);
        t.m439f("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerM433g);
        return t;
    }

    /* JADX INFO: renamed from: d */
    public abstract <T extends ViewModel> T mo13841d(String str, Class<T> cls, SavedStateHandle savedStateHandle);
}
