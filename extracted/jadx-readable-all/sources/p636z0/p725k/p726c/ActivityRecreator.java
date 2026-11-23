package p636z0.p725k.p726c;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: z0.k.c.d, reason: use source file name */
/* JADX INFO: compiled from: ActivityRecreator.java */
/* JADX INFO: loaded from: classes.dex */
public final class ActivityRecreator {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f37665a;

    /* JADX INFO: renamed from: b */
    public static final Field f37666b;

    /* JADX INFO: renamed from: c */
    public static final Field f37667c;

    /* JADX INFO: renamed from: d */
    public static final Method f37668d;

    /* JADX INFO: renamed from: e */
    public static final Method f37669e;

    /* JADX INFO: renamed from: f */
    public static final Method f37670f;

    /* JADX INFO: renamed from: g */
    public static final Handler f37671g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: z0.k.c.d$a */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ c f37672f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Object f37673g;

        public a(c cVar, Object obj) {
            this.f37672f = cVar;
            this.f37673g = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37672f.f37676f = this.f37673g;
        }
    }

    /* JADX INFO: renamed from: z0.k.c.d$b */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Application f37674f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ c f37675g;

        public b(Application application, c cVar) {
            this.f37674f = application;
            this.f37675g = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37674f.unregisterActivityLifecycleCallbacks(this.f37675g);
        }
    }

    /* JADX INFO: renamed from: z0.k.c.d$c */
    /* JADX INFO: compiled from: ActivityRecreator.java */
    public static final class c implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: f */
        public Object f37676f;

        /* JADX INFO: renamed from: g */
        public Activity f37677g;

        /* JADX INFO: renamed from: h */
        public final int f37678h;

        /* JADX INFO: renamed from: i */
        public boolean f37679i = false;

        /* JADX INFO: renamed from: j */
        public boolean f37680j = false;

        /* JADX INFO: renamed from: k */
        public boolean f37681k = false;

        public c(Activity activity) {
            this.f37677g = activity;
            this.f37678h = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f37677g == activity) {
                this.f37677g = null;
                this.f37680j = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f37680j || this.f37681k || this.f37679i) {
                return;
            }
            Object obj = this.f37676f;
            int i = this.f37678h;
            boolean z = false;
            try {
                Object obj2 = ActivityRecreator.f37667c.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    ActivityRecreator.f37671g.postAtFrontOfQueue(new ActivityRecreator2(ActivityRecreator.f37666b.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z) {
                this.f37681k = true;
                this.f37676f = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f37677g == activity) {
                this.f37679i = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f37665a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f37666b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f37667c = declaredField2;
        Class<?> cls2 = f37665a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f37668d = declaredMethod;
        Class<?> cls3 = f37665a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f37669e = declaredMethod2;
        Class<?> cls4 = f37665a;
        if (m16084a() && cls4 != null) {
            try {
                Class<?> cls5 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f37670f = method;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m16084a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16085b(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (m16084a() && f37670f == null) {
            return false;
        }
        if (f37669e == null && f37668d == null) {
            return false;
        }
        try {
            Object obj2 = f37667c.get(activity);
            if (obj2 == null || (obj = f37666b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            c cVar = new c(activity);
            application.registerActivityLifecycleCallbacks(cVar);
            f37671g.post(new a(cVar, obj2));
            try {
                if (m16084a()) {
                    Method method = f37670f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f37671g.post(new b(application, cVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
