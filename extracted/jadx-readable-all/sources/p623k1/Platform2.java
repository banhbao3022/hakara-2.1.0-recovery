package p623k1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: k1.v, reason: use source file name */
/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes2.dex */
public class Platform2 {

    /* JADX INFO: renamed from: a */
    public static final Platform2 f33237a;

    /* JADX INFO: renamed from: b */
    public final boolean f33238b;

    /* JADX INFO: renamed from: c */
    public final Constructor<MethodHandles.Lookup> f33239c;

    /* JADX INFO: renamed from: k1.v$a */
    /* JADX INFO: compiled from: Platform.java */
    public static final class a extends Platform2 {

        /* JADX INFO: renamed from: k1.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Platform.java */
        public static final class ExecutorC8553a implements Executor {

            /* JADX INFO: renamed from: f */
            public final Handler f33240f = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f33240f.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // p623k1.Platform2
        /* JADX INFO: renamed from: a */
        public Executor mo14306a() {
            return new ExecutorC8553a();
        }

        @Override // p623k1.Platform2
        /* JADX INFO: renamed from: b */
        public Object mo14307b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo14307b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f33237a = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new Platform2(true);
    }

    public Platform2(boolean z) {
        this.f33238b = z;
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        if (z) {
            try {
                declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f33239c = declaredConstructor;
    }

    /* JADX INFO: renamed from: a */
    public Executor mo14306a() {
        return null;
    }

    @IgnoreJRERequirement
    /* JADX INFO: renamed from: b */
    public Object mo14307b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f33239c;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
