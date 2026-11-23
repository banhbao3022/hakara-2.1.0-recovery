package p636z0.p759s;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import androidx.lifecycle.ViewModel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import p636z0.p654b0.SavedStateRegistry;
import p636z0.p654b0.SavedStateRegistryOwner;

/* JADX INFO: renamed from: z0.s.a0, reason: use source file name */
/* JADX INFO: compiled from: SavedStateViewModelFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider2.c {

    /* JADX INFO: renamed from: a */
    public static final Class<?>[] f38668a = {Application.class, SavedStateHandle.class};

    /* JADX INFO: renamed from: b */
    public static final Class<?>[] f38669b = {SavedStateHandle.class};

    /* JADX INFO: renamed from: c */
    public final Application f38670c;

    /* JADX INFO: renamed from: d */
    public final ViewModelProvider2.b f38671d;

    /* JADX INFO: renamed from: e */
    public final Bundle f38672e;

    /* JADX INFO: renamed from: f */
    public final Lifecycle3 f38673f;

    /* JADX INFO: renamed from: g */
    public final SavedStateRegistry f38674g;

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner) {
        this(application, savedStateRegistryOwner, null);
    }

    /* JADX INFO: renamed from: d */
    public static <T> Constructor<T> m16716d(Class<T> cls, Class<?>[] clsArr) {
        for (Object obj : cls.getConstructors()) {
            Constructor<T> constructor = (Constructor<T>) obj;
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    @Override // p636z0.p759s.ViewModelProvider2.c, p636z0.p759s.ViewModelProvider2.b
    /* JADX INFO: renamed from: a */
    public <T extends ViewModel> T mo13840a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo16715c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // p636z0.p759s.ViewModelProvider2.e
    /* JADX INFO: renamed from: b */
    public void mo16714b(ViewModel viewModel) {
        SavedStateHandleController.m432e(viewModel, this.f38674g, this.f38673f);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0044 A[Catch: InvocationTargetException -> 0x0056, InstantiationException -> 0x0072, IllegalAccessException -> 0x008f, TryCatch #2 {IllegalAccessException -> 0x008f, InstantiationException -> 0x0072, InvocationTargetException -> 0x0056, blocks: (B:13:0x0030, B:15:0x0034, B:17:0x0050, B:16:0x0044), top: B:28:0x0030 }] */
    @Override // p636z0.p759s.ViewModelProvider2.c
    /* JADX INFO: renamed from: c */
    public <T extends ViewModel> T mo16715c(String str, Class<T> cls) {
        T t;
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorM16716d = (!zIsAssignableFrom || this.f38670c == null) ? m16716d(cls, f38669b) : m16716d(cls, f38668a);
        if (constructorM16716d == null) {
            return (T) this.f38671d.mo13840a(cls);
        }
        SavedStateHandleController savedStateHandleControllerM433g = SavedStateHandleController.m433g(this.f38674g, this.f38673f, str, this.f38672e);
        if (zIsAssignableFrom) {
            try {
                Application application = this.f38670c;
                if (application != null) {
                    t = (T) constructorM16716d.newInstance(application, savedStateHandleControllerM433g.f789h);
                } else {
                    t = (T) constructorM16716d.newInstance(savedStateHandleControllerM433g.f789h);
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        } else {
            t = (T) constructorM16716d.newInstance(savedStateHandleControllerM433g.f789h);
        }
        t.m439f("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerM433g);
        return t;
    }

    @SuppressLint({"LambdaLast"})
    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        ViewModelProvider2.b bVar;
        this.f38674g = savedStateRegistryOwner.mo129s();
        this.f38673f = savedStateRegistryOwner.mo124b();
        this.f38672e = bundle;
        this.f38670c = application;
        if (application != null) {
            if (ViewModelProvider2.a.f38695b == null) {
                ViewModelProvider2.a.f38695b = new ViewModelProvider2.a(application);
            }
            bVar = ViewModelProvider2.a.f38695b;
        } else {
            if (ViewModelProvider2.d.f38697a == null) {
                ViewModelProvider2.d.f38697a = new ViewModelProvider2.d();
            }
            bVar = ViewModelProvider2.d.f38697a;
        }
        this.f38671d = bVar;
    }
}
