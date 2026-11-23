package p007c.p190n.p194b.p266d.p290d.p291r;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p007c.p190n.p194b.p195a.Encoding;
import p007c.p190n.p194b.p195a.p196i.CCTDestination;
import p007c.p190n.p194b.p195a.p198j.TransportFactoryImpl;
import p007c.p190n.p194b.p195a.p198j.TransportRuntime;
import p007c.p190n.p194b.p266d.p290d.C2567y;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p290d.p295s.C2553x;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2687r;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p320f.BinderC3958p;
import p007c.p190n.p194b.p266d.p314j.p320f.C3858f;
import p007c.p190n.p194b.p266d.p314j.p320f.C3888i;
import p007c.p190n.p194b.p266d.p314j.p320f.C3889i0;
import p007c.p190n.p194b.p266d.p314j.p320f.C4008u0;
import p007c.p190n.p194b.p266d.p314j.p320f.C4030w4;
import p007c.p190n.p194b.p266d.p314j.p320f.C4031w5;
import p007c.p190n.p194b.p266d.p314j.p320f.C4055z2;
import p007c.p190n.p194b.p266d.p314j.p320f.EnumC3811a2;
import p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3878h;
import p007c.p190n.p194b.p266d.p333n.C4778g0;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p007c.p190n.p194b.p266d.p333n.C4783k;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4775f;
import p636z0.p767w.p768a.MediaRouter;
import p636z0.p767w.p768a.RegisteredMediaRouteProviderWatcher;

/* JADX INFO: renamed from: c.n.b.d.d.r.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2422a {

    /* JADX INFO: renamed from: a */
    public static final C2518b f11141a = new C2518b("CastContext");

    /* JADX INFO: renamed from: b */
    public static C2422a f11142b;

    /* JADX INFO: renamed from: c */
    public final Context f11143c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2512x f11144d;

    /* JADX INFO: renamed from: e */
    public final C2438i f11145e;

    /* JADX INFO: renamed from: f */
    public final C2511w f11146f;

    /* JADX INFO: renamed from: g */
    public final C2424b f11147g;

    /* JADX INFO: renamed from: h */
    public BinderC3958p f11148h;

    /* JADX INFO: renamed from: i */
    public C3888i f11149i;

    /* JADX INFO: renamed from: j */
    public final List<AbstractC2442k> f11150j;

    public C2422a(Context context, C2424b c2424b, List<AbstractC2442k> list) {
        MediaRouter mediaRouter;
        InterfaceC2512x interfaceC2512xMo9033e1;
        InterfaceC2427c0 interfaceC2427c0Mo5110j0;
        InterfaceC2437h0 interfaceC2437h0Mo5109g0;
        Context applicationContext = context.getApplicationContext();
        this.f11143c = applicationContext;
        this.f11147g = c2424b;
        boolean z = MediaRouter.f38830a;
        if (applicationContext == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        MediaRouter.m16813a();
        if (MediaRouter.f38831b == null) {
            MediaRouter.d dVar = new MediaRouter.d(applicationContext.getApplicationContext());
            MediaRouter.f38831b = dVar;
            dVar.m16817a(dVar.f38847j);
            RegisteredMediaRouteProviderWatcher registeredMediaRouteProviderWatcher = new RegisteredMediaRouteProviderWatcher(dVar.f38838a, dVar);
            dVar.f38849l = registeredMediaRouteProviderWatcher;
            if (!registeredMediaRouteProviderWatcher.f38934f) {
                registeredMediaRouteProviderWatcher.f38934f = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                registeredMediaRouteProviderWatcher.f38929a.registerReceiver(registeredMediaRouteProviderWatcher.f38935g, intentFilter, null, registeredMediaRouteProviderWatcher.f38931c);
                registeredMediaRouteProviderWatcher.f38931c.post(registeredMediaRouteProviderWatcher.f38936h);
            }
        }
        MediaRouter.d dVar2 = MediaRouter.f38831b;
        int size = dVar2.f38839b.size();
        while (true) {
            size--;
            if (size >= 0) {
                mediaRouter = dVar2.f38839b.get(size).get();
                if (mediaRouter != null) {
                    if (mediaRouter.f38832c == applicationContext) {
                        break;
                    }
                } else {
                    dVar2.f38839b.remove(size);
                }
            } else {
                mediaRouter = new MediaRouter(applicationContext);
                dVar2.f38839b.add(new WeakReference<>(mediaRouter));
                break;
            }
        }
        this.f11148h = new BinderC3958p(mediaRouter);
        this.f11150j = list;
        if (TextUtils.isEmpty(this.f11147g.f11152f)) {
            this.f11149i = null;
        } else {
            this.f11149i = new C3888i(this.f11143c, this.f11147g, this.f11148h);
        }
        HashMap map = new HashMap();
        C3888i c3888i = this.f11149i;
        if (c3888i != null) {
            map.put(c3888i.f11195b, c3888i.f11196c);
        }
        if (list != null) {
            for (AbstractC2442k abstractC2442k : list) {
                C2622l.m5379i(abstractC2442k, "Additional SessionProvider must not be null.");
                String str = abstractC2442k.f11195b;
                C2622l.m5364f(str, "Category for SessionProvider must not be null or empty string.");
                C2622l.m5344b(!map.containsKey(str), String.format("SessionProvider for category %s already added", str));
                map.put(str, abstractC2442k.f11196c);
            }
        }
        Context context2 = this.f11143c;
        try {
            interfaceC2512xMo9033e1 = C3858f.m9021a(context2).mo9033e1(new BinderC2800b(context2.getApplicationContext()), c2424b, this.f11148h, map);
        } catch (RemoteException e) {
            C3858f.f22572a.m5120b(e, "Unable to call %s on %s.", "newCastContextImpl", InterfaceC3878h.class.getSimpleName());
            interfaceC2512xMo9033e1 = null;
        }
        this.f11144d = interfaceC2512xMo9033e1;
        try {
            interfaceC2427c0Mo5110j0 = interfaceC2512xMo9033e1.mo5110j0();
        } catch (RemoteException e2) {
            f11141a.m5120b(e2, "Unable to call %s on %s.", "getDiscoveryManagerImpl", InterfaceC2512x.class.getSimpleName());
            interfaceC2427c0Mo5110j0 = null;
        }
        this.f11146f = interfaceC2427c0Mo5110j0 == null ? null : new C2511w(interfaceC2427c0Mo5110j0);
        try {
            interfaceC2437h0Mo5109g0 = this.f11144d.mo5109g0();
        } catch (RemoteException e3) {
            f11141a.m5120b(e3, "Unable to call %s on %s.", "getSessionManagerImpl", InterfaceC2512x.class.getSimpleName());
            interfaceC2437h0Mo5109g0 = null;
        }
        C2438i c2438i = interfaceC2437h0Mo5109g0 != null ? new C2438i(interfaceC2437h0Mo5109g0, this.f11143c) : null;
        this.f11145e = c2438i;
        new C2428d(c2438i);
        if (c2438i != null) {
            new C2432f(this.f11147g, c2438i, new C2553x(this.f11143c));
        }
        final C2553x c2553x = new C2553x(this.f11143c);
        final String[] strArr = {"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"};
        AbstractC2687r.a aVarM5551a = AbstractC2687r.m5551a();
        aVarM5551a.f11748a = new InterfaceC2681o(c2553x, strArr) { // from class: c.n.b.d.d.s.w

            /* JADX INFO: renamed from: a */
            public final C2553x f11472a;

            /* JADX INFO: renamed from: b */
            public final String[] f11473b;

            {
                this.f11472a = c2553x;
                this.f11473b = strArr;
            }

            @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.InterfaceC2681o
            /* JADX INFO: renamed from: a */
            public final void mo4950a(Object obj, Object obj2) throws RemoteException {
                String[] strArr2 = this.f11473b;
                ((InterfaceC2531h) ((C2517a0) obj).m5581u()).mo5148U3(new BinderC2555z((C4782j) obj2), strArr2);
            }
        };
        aVarM5551a.f11750c = new C2606d[]{C2567y.f11488c};
        aVarM5551a.f11749b = false;
        Object objM5487c = c2553x.m5487c(0, aVarM5551a.m5553a());
        InterfaceC4775f interfaceC4775f = new InterfaceC4775f(this) { // from class: c.n.b.d.d.r.s

            /* JADX INFO: renamed from: a */
            public final C2422a f11365a;

            {
                this.f11365a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4775f
            /* JADX INFO: renamed from: a */
            public final void mo5107a(Object obj) {
                C2422a c2422a = this.f11365a;
                Bundle bundle = (Bundle) obj;
                Objects.requireNonNull(c2422a);
                boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && c2422a.f11145e != null;
                boolean z3 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
                if (z2 || z3) {
                    String packageName = c2422a.f11143c.getPackageName();
                    SharedPreferences sharedPreferences = c2422a.f11143c.getApplicationContext().getSharedPreferences(String.format(Locale.ROOT, "%s.%s", c2422a.f11143c.getPackageName(), "client_cast_analytics_data"), 0);
                    TransportRuntime.m2821b(c2422a.f11143c);
                    C3889i0 c3889i0 = new C3889i0(sharedPreferences, ((TransportFactoryImpl) TransportRuntime.m2820a().m2822c(CCTDestination.f5524e)).mo2750a("CAST_SENDER_SDK", C4055z2.class, new Encoding("proto"), C2500m.f11362a), bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE"));
                    if (z2) {
                        C4008u0 c4008u0 = new C4008u0(sharedPreferences, c3889i0);
                        C2438i c2438i2 = c2422a.f11145e;
                        C4030w4 c4030w4 = new C4030w4(c4008u0, null);
                        Objects.requireNonNull(c2438i2);
                        C2622l.m5354d("Must be called from the main thread.");
                        try {
                            c2438i2.f11192b.mo5030S0(new BinderC2505q(c4030w4, C2426c.class));
                        } catch (RemoteException e4) {
                            C2438i.f11191a.m5120b(e4, "Unable to call %s on %s.", "addSessionManagerListener", InterfaceC2437h0.class.getSimpleName());
                        }
                    }
                    if (z3) {
                        C2518b c2518b = C4031w5.f22970a;
                        synchronized (C4031w5.class) {
                            if (C4031w5.f22972c == null) {
                                C4031w5.f22972c = new C4031w5(sharedPreferences, c3889i0, packageName);
                            }
                            C4031w5 c4031w5 = C4031w5.f22972c;
                        }
                        EnumC3811a2 enumC3811a2 = EnumC3811a2.CAST_CONTEXT;
                        C4031w5 c4031w6 = C4031w5.f22972c;
                        if (c4031w6 == null) {
                            return;
                        }
                        c4031w6.f22974e.edit().putLong(c4031w6.m9291c(Integer.toString(5)), System.currentTimeMillis()).apply();
                        c4031w6.f22979j.add(enumC3811a2);
                        c4031w6.f22977h.post(c4031w6.f22976g);
                    }
                }
            }
        };
        C4778g0 c4778g0 = (C4778g0) objM5487c;
        Objects.requireNonNull(c4778g0);
        c4778g0.mo10932e(C4783k.f24684a, interfaceC4775f);
    }

    /* JADX INFO: renamed from: a */
    public static C2422a m4995a(Context context) throws IllegalStateException {
        C2622l.m5354d("Must be called from the main thread.");
        if (f11142b == null) {
            Context applicationContext = context.getApplicationContext();
            try {
                Bundle bundle = C2794c.m5637a(applicationContext).m5633a(applicationContext.getPackageName(), 128).metaData;
                if (bundle == null) {
                    f11141a.m5121c("Bundle is null", new Object[0]);
                }
                String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
                if (string == null) {
                    throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
                }
                InterfaceC2430e interfaceC2430e = (InterfaceC2430e) Class.forName(string).asSubclass(InterfaceC2430e.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                f11142b = new C2422a(context, interfaceC2430e.mo5019b(context.getApplicationContext()), interfaceC2430e.mo5018a(context.getApplicationContext()));
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
                throw new IllegalStateException("Failed to initialize CastContext.", e);
            }
        }
        return f11142b;
    }
}
