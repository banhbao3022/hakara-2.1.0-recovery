package p007c.p085g.p086a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import p007c.p085g.p086a.p089m.p092t.DiskCacheStrategy;
import p007c.p085g.p086a.p089m.p098v.p103h.GifDrawable;
import p007c.p085g.p086a.p105n.ConnectivityMonitor;
import p007c.p085g.p086a.p105n.ConnectivityMonitorFactory;
import p007c.p085g.p086a.p105n.DefaultConnectivityMonitor;
import p007c.p085g.p086a.p105n.DefaultConnectivityMonitorFactory;
import p007c.p085g.p086a.p105n.Lifecycle2;
import p007c.p085g.p086a.p105n.LifecycleListener;
import p007c.p085g.p086a.p105n.NullConnectivityMonitor;
import p007c.p085g.p086a.p105n.RequestManagerTreeNode;
import p007c.p085g.p086a.p105n.RequestTracker;
import p007c.p085g.p086a.p105n.TargetTracker;
import p007c.p085g.p086a.p108q.Request2;
import p007c.p085g.p086a.p108q.RequestListener;
import p007c.p085g.p086a.p108q.RequestOptions;
import p007c.p085g.p086a.p108q.p109h.Target;
import p007c.p085g.p086a.p112s.Util4;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.g.a.i, reason: use source file name */
/* JADX INFO: compiled from: RequestManager.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestManager implements ComponentCallbacks2, LifecycleListener {

    /* JADX INFO: renamed from: f */
    public static final RequestOptions f2916f = new RequestOptions().mo1975e(Bitmap.class).mo1979l();

    /* JADX INFO: renamed from: g */
    public final Glide f2917g;

    /* JADX INFO: renamed from: h */
    public final Context f2918h;

    /* JADX INFO: renamed from: i */
    public final Lifecycle2 f2919i;

    /* JADX INFO: renamed from: j */
    public final RequestTracker f2920j;

    /* JADX INFO: renamed from: k */
    public final RequestManagerTreeNode f2921k;

    /* JADX INFO: renamed from: l */
    public final TargetTracker f2922l;

    /* JADX INFO: renamed from: m */
    public final Runnable f2923m;

    /* JADX INFO: renamed from: n */
    public final Handler f2924n;

    /* JADX INFO: renamed from: o */
    public final ConnectivityMonitor f2925o;

    /* JADX INFO: renamed from: p */
    public final CopyOnWriteArrayList<RequestListener<Object>> f2926p;

    /* JADX INFO: renamed from: q */
    public RequestOptions f2927q;

    /* JADX INFO: renamed from: c.g.a.i$a */
    /* JADX INFO: compiled from: RequestManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestManager requestManager = RequestManager.this;
            requestManager.f2919i.mo1937a(requestManager);
        }
    }

    /* JADX INFO: renamed from: c.g.a.i$b */
    /* JADX INFO: compiled from: RequestManager.java */
    public class b implements ConnectivityMonitor.a {

        /* JADX INFO: renamed from: a */
        public final RequestTracker f2929a;

        public b(RequestTracker requestTracker) {
            this.f2929a = requestTracker;
        }
    }

    static {
        new RequestOptions().mo1975e(GifDrawable.class).mo1979l();
        new RequestOptions().mo1976g(DiskCacheStrategy.f3275b).mo1986s(Priority.LOW).mo1990x(true);
    }

    public RequestManager(Glide glide, Lifecycle2 lifecycle2, RequestManagerTreeNode requestManagerTreeNode, Context context) {
        RequestOptions requestOptions;
        RequestTracker requestTracker = new RequestTracker();
        ConnectivityMonitorFactory connectivityMonitorFactory = glide.f2862n;
        this.f2922l = new TargetTracker();
        a aVar = new a();
        this.f2923m = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2924n = handler;
        this.f2917g = glide;
        this.f2919i = lifecycle2;
        this.f2921k = requestManagerTreeNode;
        this.f2920j = requestTracker;
        this.f2918h = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(requestTracker);
        Objects.requireNonNull((DefaultConnectivityMonitorFactory) connectivityMonitorFactory);
        boolean z = ContextCompat.m16133a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        ConnectivityMonitor defaultConnectivityMonitor = z ? new DefaultConnectivityMonitor(applicationContext, bVar) : new NullConnectivityMonitor();
        this.f2925o = defaultConnectivityMonitor;
        if (Util4.m2052g()) {
            handler.post(aVar);
        } else {
            lifecycle2.mo1937a(this);
        }
        lifecycle2.mo1937a(defaultConnectivityMonitor);
        this.f2926p = new CopyOnWriteArrayList<>(glide.f2858j.f2884f);
        GlideContext glideContext = glide.f2858j;
        synchronized (glideContext) {
            if (glideContext.f2889k == null) {
                Objects.requireNonNull((GlideBuilder.a) glideContext.f2883e);
                RequestOptions requestOptions2 = new RequestOptions();
                requestOptions2.f3744y = true;
                glideContext.f2889k = requestOptions2;
            }
            requestOptions = glideContext.f2889k;
        }
        mo1658r(requestOptions);
        synchronized (glide.f2863o) {
            if (glide.f2863o.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            glide.f2863o.add(this);
        }
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: e */
    public synchronized void mo1649e() {
        m1656p();
        this.f2922l.mo1649e();
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    /* JADX INFO: renamed from: j */
    public synchronized void mo1650j() {
        m1657q();
        this.f2922l.mo1650j();
    }

    /* JADX INFO: renamed from: k */
    public <ResourceType> RequestBuilder<ResourceType> mo1651k(Class<ResourceType> cls) {
        return new RequestBuilder<>(this.f2917g, this, cls, this.f2918h);
    }

    /* JADX INFO: renamed from: l */
    public RequestBuilder<Bitmap> mo1652l() {
        return mo1651k(Bitmap.class).mo1647a(f2916f);
    }

    /* JADX INFO: renamed from: m */
    public RequestBuilder<Drawable> mo1653m() {
        return mo1651k(Drawable.class);
    }

    /* JADX INFO: renamed from: n */
    public void m1654n(Target<?> target) {
        boolean z;
        if (target == null) {
            return;
        }
        boolean zM1659s = m1659s(target);
        Request2 request2Mo2021g = target.mo2021g();
        if (zM1659s) {
            return;
        }
        Glide glide = this.f2917g;
        synchronized (glide.f2863o) {
            Iterator<RequestManager> it = glide.f2863o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().m1659s(target)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || request2Mo2021g == null) {
            return;
        }
        target.mo2018c(null);
        request2Mo2021g.clear();
    }

    /* JADX INFO: renamed from: o */
    public RequestBuilder<Drawable> mo1655o(Integer num) {
        return mo1653m().mo1643O(num);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p007c.p085g.p086a.p105n.LifecycleListener
    public synchronized void onDestroy() {
        this.f2922l.onDestroy();
        Iterator it = Util4.m2050e(this.f2922l.f3701f).iterator();
        while (it.hasNext()) {
            m1654n((Target) it.next());
        }
        this.f2922l.f3701f.clear();
        RequestTracker requestTracker = this.f2920j;
        Iterator it2 = ((ArrayList) Util4.m2050e(requestTracker.f3691a)).iterator();
        while (it2.hasNext()) {
            requestTracker.m1952a((Request2) it2.next());
        }
        requestTracker.f3692b.clear();
        this.f2919i.mo1938b(this);
        this.f2919i.mo1938b(this.f2925o);
        this.f2924n.removeCallbacks(this.f2923m);
        Glide glide = this.f2917g;
        synchronized (glide.f2863o) {
            if (!glide.f2863o.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            glide.f2863o.remove(this);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
    }

    /* JADX INFO: renamed from: p */
    public synchronized void m1656p() {
        RequestTracker requestTracker = this.f2920j;
        requestTracker.f3693c = true;
        for (Request2 request2 : (ArrayList) Util4.m2050e(requestTracker.f3691a)) {
            if (request2.isRunning()) {
                request2.pause();
                requestTracker.f3692b.add(request2);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m1657q() {
        RequestTracker requestTracker = this.f2920j;
        requestTracker.f3693c = false;
        for (Request2 request2 : (ArrayList) Util4.m2050e(requestTracker.f3691a)) {
            if (!request2.mo1995d() && !request2.isRunning()) {
                request2.mo1994c();
            }
        }
        requestTracker.f3692b.clear();
    }

    /* JADX INFO: renamed from: r */
    public synchronized void mo1658r(RequestOptions requestOptions) {
        this.f2927q = requestOptions.clone().mo1974b();
    }

    /* JADX INFO: renamed from: s */
    public synchronized boolean m1659s(Target<?> target) {
        Request2 request2Mo2021g = target.mo2021g();
        if (request2Mo2021g == null) {
            return true;
        }
        if (!this.f2920j.m1952a(request2Mo2021g)) {
            return false;
        }
        this.f2922l.f3701f.remove(target);
        target.mo2018c(null);
        return true;
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f2920j + ", treeNode=" + this.f2921k + "}";
    }
}
