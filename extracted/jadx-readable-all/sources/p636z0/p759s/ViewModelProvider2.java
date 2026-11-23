package p636z0.p759s;

import android.app.Application;
import androidx.lifecycle.ViewModel;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: z0.s.d0, reason: use source file name */
/* JADX INFO: compiled from: ViewModelProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewModelProvider2 {

    /* JADX INFO: renamed from: a */
    public final b f38693a;

    /* JADX INFO: renamed from: b */
    public final ViewModelStore f38694b;

    /* JADX INFO: renamed from: z0.s.d0$a */
    /* JADX INFO: compiled from: ViewModelProvider.java */
    public static class a extends d {

        /* JADX INFO: renamed from: b */
        public static a f38695b;

        /* JADX INFO: renamed from: c */
        public Application f38696c;

        public a(Application application) {
            this.f38696c = application;
        }

        @Override // p636z0.p759s.ViewModelProvider2.d, p636z0.p759s.ViewModelProvider2.b
        /* JADX INFO: renamed from: a */
        public <T extends ViewModel> T mo13840a(Class<T> cls) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return (T) super.mo13840a(cls);
            }
            try {
                return cls.getConstructor(Application.class).newInstance(this.f38696c);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
    }

    /* JADX INFO: renamed from: z0.s.d0$b */
    /* JADX INFO: compiled from: ViewModelProvider.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        <T extends ViewModel> T mo13840a(Class<T> cls);
    }

    /* JADX INFO: renamed from: z0.s.d0$c */
    /* JADX INFO: compiled from: ViewModelProvider.java */
    public static abstract class c extends e implements b {
        /* JADX INFO: renamed from: a */
        public <T extends ViewModel> T mo13840a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* JADX INFO: renamed from: c */
        public abstract <T extends ViewModel> T mo16715c(String str, Class<T> cls);
    }

    /* JADX INFO: renamed from: z0.s.d0$d */
    /* JADX INFO: compiled from: ViewModelProvider.java */
    public static class d implements b {

        /* JADX INFO: renamed from: a */
        public static d f38697a;

        @Override // p636z0.p759s.ViewModelProvider2.b
        /* JADX INFO: renamed from: a */
        public <T extends ViewModel> T mo13840a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            }
        }
    }

    /* JADX INFO: renamed from: z0.s.d0$e */
    /* JADX INFO: compiled from: ViewModelProvider.java */
    public static class e {
        /* JADX INFO: renamed from: b */
        public void mo16714b(ViewModel viewModel) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider2(ViewModelStoreOwner viewModelStoreOwner) {
        b bVarMo126i;
        ViewModelStore viewModelStoreMo128o = viewModelStoreOwner.mo128o();
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            bVarMo126i = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).mo126i();
        } else {
            if (d.f38697a == null) {
                d.f38697a = new d();
            }
            bVarMo126i = d.f38697a;
        }
        this(viewModelStoreMo128o, bVarMo126i);
    }

    /* JADX INFO: renamed from: a */
    public <T extends ViewModel> T m16722a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) m16723b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: b */
    public <T extends ViewModel> T m16723b(String str, Class<T> cls) {
        T t = (T) this.f38694b.f38702a.get(str);
        if (cls.isInstance(t)) {
            Object obj = this.f38693a;
            if (obj instanceof e) {
                ((e) obj).mo16714b(t);
            }
            return t;
        }
        b bVar = this.f38693a;
        T t2 = bVar instanceof c ? (T) ((c) bVar).mo16715c(str, cls) : (T) bVar.mo13840a(cls);
        ViewModel viewModelPut = this.f38694b.f38702a.put(str, t2);
        if (viewModelPut != null) {
            viewModelPut.mo438e();
        }
        return t2;
    }

    public ViewModelProvider2(ViewModelStoreOwner viewModelStoreOwner, b bVar) {
        this(viewModelStoreOwner.mo128o(), bVar);
    }

    public ViewModelProvider2(ViewModelStore viewModelStore, b bVar) {
        this.f38693a = bVar;
        this.f38694b = viewModelStore;
    }
}
