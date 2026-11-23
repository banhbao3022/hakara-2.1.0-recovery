package p007c.p190n.p385d;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.ComponentCallbacks2C2647c;
import p007c.p190n.p194b.p266d.p298f.p302q.C2753q;
import p007c.p190n.p194b.p266d.p298f.p307u.C2787g;
import p007c.p190n.p385d.p390k.Component3;
import p007c.p190n.p385d.p390k.ComponentRegistrar;
import p007c.p190n.p385d.p390k.ComponentRuntime7;
import p007c.p190n.p385d.p390k.Lazy;
import p007c.p190n.p385d.p416p.Publisher;
import p007c.p190n.p385d.p420s.Provider2;
import p007c.p190n.p385d.p426u.DataCollectionConfigStorage;
import p636z0.p691g.ArrayMap;

/* JADX INFO: renamed from: c.n.d.c, reason: use source file name */
/* JADX INFO: compiled from: FirebaseApp.java */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseApp2 {

    /* JADX INFO: renamed from: a */
    public static final Object f26300a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Executor f26301b = new d(null);

    /* JADX INFO: renamed from: c */
    public static final Map<String, FirebaseApp2> f26302c = new ArrayMap();

    /* JADX INFO: renamed from: d */
    public final Context f26303d;

    /* JADX INFO: renamed from: e */
    public final String f26304e;

    /* JADX INFO: renamed from: f */
    public final FirebaseOptions f26305f;

    /* JADX INFO: renamed from: g */
    public final ComponentRuntime7 f26306g;

    /* JADX INFO: renamed from: j */
    public final Lazy<DataCollectionConfigStorage> f26309j;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f26307h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final AtomicBoolean f26308i = new AtomicBoolean();

    /* JADX INFO: renamed from: k */
    public final List<b> f26310k = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c.n.d.c$b */
    /* JADX INFO: compiled from: FirebaseApp.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m11673a(boolean z);
    }

    /* JADX INFO: renamed from: c.n.d.c$c */
    /* JADX INFO: compiled from: FirebaseApp.java */
    @TargetApi(14)
    public static class c implements ComponentCallbacks2C2647c.a {

        /* JADX INFO: renamed from: a */
        public static AtomicReference<c> f26311a = new AtomicReference<>();

        @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.ComponentCallbacks2C2647c.a
        /* JADX INFO: renamed from: a */
        public void mo5503a(boolean z) {
            Object obj = FirebaseApp2.f26300a;
            synchronized (FirebaseApp2.f26300a) {
                for (FirebaseApp2 firebaseApp2 : new ArrayList(FirebaseApp2.f26302c.values())) {
                    if (firebaseApp2.f26307h.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator<b> it = firebaseApp2.f26310k.iterator();
                        while (it.hasNext()) {
                            it.next().m11673a(z);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.n.d.c$d */
    /* JADX INFO: compiled from: FirebaseApp.java */
    public static class d implements Executor {

        /* JADX INFO: renamed from: f */
        public static final Handler f26312f = new Handler(Looper.getMainLooper());

        public d(a aVar) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f26312f.post(runnable);
        }
    }

    /* JADX INFO: renamed from: c.n.d.c$e */
    /* JADX INFO: compiled from: FirebaseApp.java */
    @TargetApi(24)
    public static class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public static AtomicReference<e> f26313a = new AtomicReference<>();

        /* JADX INFO: renamed from: b */
        public final Context f26314b;

        public e(Context context) {
            this.f26314b = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object obj = FirebaseApp2.f26300a;
            synchronized (FirebaseApp2.f26300a) {
                Iterator<FirebaseApp2> it = FirebaseApp2.f26302c.values().iterator();
                while (it.hasNext()) {
                    it.next().m11670d();
                }
            }
            this.f26314b.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ba A[LOOP:0: B:25:0x00b4->B:27:0x00ba, LOOP_END] */
    public FirebaseApp2(final Context context, String str, FirebaseOptions firebaseOptions) {
        Bundle bundle;
        List<String> listEmptyList;
        new CopyOnWriteArrayList();
        this.f26303d = context;
        C2622l.m5359e(str);
        this.f26304e = str;
        Objects.requireNonNull(firebaseOptions, "null reference");
        this.f26305f = firebaseOptions;
        ArrayList arrayList = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle == null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    listEmptyList = Collections.emptyList();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    for (String str2 : bundle.keySet()) {
                        if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                            arrayList2.add(str2.substring(31));
                        }
                    }
                    listEmptyList = arrayList2;
                }
                for (final String str3 : listEmptyList) {
                    arrayList.add(new Provider2(str3) { // from class: c.n.d.k.f

                        /* JADX INFO: renamed from: a */
                        public final String f26377a;

                        {
                            this.f26377a = str3;
                        }

                        @Override // p007c.p190n.p385d.p420s.Provider2
                        public Object get() {
                            String str4 = this.f26377a;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                }
                                throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str4, "com.google.firebase.components.ComponentRegistrar"));
                            } catch (ClassNotFoundException unused) {
                                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str4));
                                return null;
                            } catch (IllegalAccessException e2) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e2);
                            } catch (InstantiationException e3) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e3);
                            } catch (NoSuchMethodException e4) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e4);
                            } catch (InvocationTargetException e5) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e5);
                            }
                        }
                    });
                }
                Executor executor = f26301b;
                int i = ComponentRuntime7.f26387a;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                arrayList3.addAll(arrayList);
                final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
                arrayList3.add(new Provider2(firebaseCommonRegistrar) { // from class: c.n.d.k.n

                    /* JADX INFO: renamed from: a */
                    public final ComponentRegistrar f26386a;

                    {
                        this.f26386a = firebaseCommonRegistrar;
                    }

                    @Override // p007c.p190n.p385d.p420s.Provider2
                    public Object get() {
                        return this.f26386a;
                    }
                });
                arrayList4.add(Component3.m11687c(context, Context.class, new Class[0]));
                arrayList4.add(Component3.m11687c(this, FirebaseApp2.class, new Class[0]));
                arrayList4.add(Component3.m11687c(firebaseOptions, FirebaseOptions.class, new Class[0]));
                this.f26306g = new ComponentRuntime7(executor, arrayList3, arrayList4);
                this.f26309j = new Lazy<>(new Provider2(this, context) { // from class: c.n.d.b

                    /* JADX INFO: renamed from: a */
                    public final FirebaseApp2 f26298a;

                    /* JADX INFO: renamed from: b */
                    public final Context f26299b;

                    {
                        this.f26298a = this;
                        this.f26299b = context;
                    }

                    @Override // p007c.p190n.p385d.p420s.Provider2
                    public Object get() {
                        FirebaseApp2 firebaseApp2 = this.f26298a;
                        Context context2 = this.f26299b;
                        Object obj = FirebaseApp2.f26300a;
                        return new DataCollectionConfigStorage(context2, firebaseApp2.m11669c(), (Publisher) firebaseApp2.f26306g.mo11684a(Publisher.class));
                    }
                });
            }
            Log.w("ComponentDiscovery", "Context has no PackageManager.");
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList5 = new ArrayList();
            while (r3.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2))) {
                }
            }
            listEmptyList = arrayList5;
        }
        while (r9.hasNext()) {
            arrayList.add(new Provider2(str3) { // from class: c.n.d.k.f

                /* JADX INFO: renamed from: a */
                public final String f26377a;

                {
                    this.f26377a = str3;
                }

                @Override // p007c.p190n.p385d.p420s.Provider2
                public Object get() {
                    String str4 = this.f26377a;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str4, "com.google.firebase.components.ComponentRegistrar"));
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str4));
                        return null;
                    } catch (IllegalAccessException e2) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e2);
                    } catch (InstantiationException e3) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e3);
                    } catch (NoSuchMethodException e4) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e4);
                    } catch (InvocationTargetException e5) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e5);
                    }
                }
            });
        }
        Executor executor2 = f26301b;
        int i2 = ComponentRuntime7.f26387a;
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        arrayList6.addAll(arrayList);
        final ComponentRegistrar firebaseCommonRegistrar2 = new FirebaseCommonRegistrar();
        arrayList6.add(new Provider2(firebaseCommonRegistrar2) { // from class: c.n.d.k.n

            /* JADX INFO: renamed from: a */
            public final ComponentRegistrar f26386a;

            {
                this.f26386a = firebaseCommonRegistrar2;
            }

            @Override // p007c.p190n.p385d.p420s.Provider2
            public Object get() {
                return this.f26386a;
            }
        });
        arrayList7.add(Component3.m11687c(context, Context.class, new Class[0]));
        arrayList7.add(Component3.m11687c(this, FirebaseApp2.class, new Class[0]));
        arrayList7.add(Component3.m11687c(firebaseOptions, FirebaseOptions.class, new Class[0]));
        this.f26306g = new ComponentRuntime7(executor2, arrayList6, arrayList7);
        this.f26309j = new Lazy<>(new Provider2(this, context) { // from class: c.n.d.b

            /* JADX INFO: renamed from: a */
            public final FirebaseApp2 f26298a;

            /* JADX INFO: renamed from: b */
            public final Context f26299b;

            {
                this.f26298a = this;
                this.f26299b = context;
            }

            @Override // p007c.p190n.p385d.p420s.Provider2
            public Object get() {
                FirebaseApp2 firebaseApp2 = this.f26298a;
                Context context2 = this.f26299b;
                Object obj = FirebaseApp2.f26300a;
                return new DataCollectionConfigStorage(context2, firebaseApp2.m11669c(), (Publisher) firebaseApp2.f26306g.mo11684a(Publisher.class));
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public static FirebaseApp2 m11665b() {
        FirebaseApp2 firebaseApp2;
        synchronized (f26300a) {
            firebaseApp2 = f26302c.get("[DEFAULT]");
            if (firebaseApp2 == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + C2787g.m5629a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp2;
    }

    /* JADX INFO: renamed from: e */
    public static FirebaseApp2 m11666e(Context context) {
        synchronized (f26300a) {
            if (f26302c.containsKey("[DEFAULT]")) {
                return m11665b();
            }
            FirebaseOptions firebaseOptionsM11675a = FirebaseOptions.m11675a(context);
            if (firebaseOptionsM11675a == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return m11667f(context, firebaseOptionsM11675a);
        }
    }

    /* JADX INFO: renamed from: f */
    public static FirebaseApp2 m11667f(Context context, FirebaseOptions firebaseOptions) {
        FirebaseApp2 firebaseApp2;
        AtomicReference<c> atomicReference = c.f26311a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            if (c.f26311a.get() == null) {
                c cVar = new c();
                if (c.f26311a.compareAndSet(null, cVar)) {
                    ComponentCallbacks2C2647c.m5501a(application);
                    ComponentCallbacks2C2647c componentCallbacks2C2647c = ComponentCallbacks2C2647c.f11638f;
                    Objects.requireNonNull(componentCallbacks2C2647c);
                    synchronized (componentCallbacks2C2647c) {
                        componentCallbacks2C2647c.f11641i.add(cVar);
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f26300a) {
            Map<String, FirebaseApp2> map = f26302c;
            C2622l.m5389k(!map.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            C2622l.m5379i(context, "Application context cannot be null.");
            firebaseApp2 = new FirebaseApp2(context, "[DEFAULT]", firebaseOptions);
            map.put("[DEFAULT]", firebaseApp2);
        }
        firebaseApp2.m11670d();
        return firebaseApp2;
    }

    /* JADX INFO: renamed from: a */
    public final void m11668a() {
        C2622l.m5389k(!this.f26308i.get(), "FirebaseApp was deleted");
    }

    /* JADX INFO: renamed from: c */
    public String m11669c() {
        StringBuilder sb = new StringBuilder();
        m11668a();
        byte[] bytes = this.f26304e.getBytes(Charset.defaultCharset());
        sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb.append("+");
        m11668a();
        byte[] bytes2 = this.f26305f.f26320b.getBytes(Charset.defaultCharset());
        sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final void m11670d() {
        HashMap map;
        if (!(Build.VERSION.SDK_INT >= 24 ? ((UserManager) this.f26303d.getSystemService(UserManager.class)).isUserUnlocked() : true)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            m11668a();
            sb.append(this.f26304e);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f26303d;
            if (e.f26313a.get() == null) {
                e eVar = new e(context);
                if (e.f26313a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        m11668a();
        sb2.append(this.f26304e);
        Log.i("FirebaseApp", sb2.toString());
        ComponentRuntime7 componentRuntime7 = this.f26306g;
        boolean zM11672h = m11672h();
        if (componentRuntime7.f26393g.compareAndSet(null, Boolean.valueOf(zM11672h))) {
            synchronized (componentRuntime7) {
                map = new HashMap(componentRuntime7.f26388b);
            }
            componentRuntime7.m11695e(map, zM11672h);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp2)) {
            return false;
        }
        String str = this.f26304e;
        FirebaseApp2 firebaseApp2 = (FirebaseApp2) obj;
        firebaseApp2.m11668a();
        return str.equals(firebaseApp2.f26304e);
    }

    /* JADX INFO: renamed from: g */
    public boolean m11671g() {
        boolean z;
        m11668a();
        DataCollectionConfigStorage dataCollectionConfigStorage = this.f26309j.get();
        synchronized (dataCollectionConfigStorage) {
            z = dataCollectionConfigStorage.f27224d;
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public boolean m11672h() {
        m11668a();
        return "[DEFAULT]".equals(this.f26304e);
    }

    public int hashCode() {
        return this.f26304e.hashCode();
    }

    public String toString() {
        C2753q c2753q = new C2753q(this);
        c2753q.m5608a("name", this.f26304e);
        c2753q.m5608a("options", this.f26305f);
        return c2753q.toString();
    }
}
