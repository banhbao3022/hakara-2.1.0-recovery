package p007c.p085g.p086a.p089m.p092t;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.p092t.p095e0.GlideExecutor;
import p007c.p085g.p086a.p108q.ResourceCallback;
import p007c.p085g.p086a.p108q.SingleRequest;
import p007c.p085g.p086a.p112s.Executors;
import p007c.p085g.p086a.p112s.p113k.FactoryPools;
import p007c.p085g.p086a.p112s.p113k.StateVerifier;
import p636z0.p725k.p738k.Pools2;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: c.g.a.m.t.m, reason: use source file name */
/* JADX INFO: compiled from: EngineJob.java */
/* JADX INFO: loaded from: classes.dex */
public class EngineJob<R> implements DecodeJob.a<R>, FactoryPools.d {

    /* JADX INFO: renamed from: f */
    public static final c f3304f = new c();

    /* JADX INFO: renamed from: A */
    public boolean f3305A;

    /* JADX INFO: renamed from: B */
    public EngineResource<?> f3306B;

    /* JADX INFO: renamed from: C */
    public DecodeJob<R> f3307C;

    /* JADX INFO: renamed from: D */
    public volatile boolean f3308D;

    /* JADX INFO: renamed from: g */
    public final e f3309g;

    /* JADX INFO: renamed from: h */
    public final StateVerifier f3310h;

    /* JADX INFO: renamed from: i */
    public final EngineResource.a f3311i;

    /* JADX INFO: renamed from: j */
    public final Pools2<EngineJob<?>> f3312j;

    /* JADX INFO: renamed from: k */
    public final c f3313k;

    /* JADX INFO: renamed from: l */
    public final EngineJobListener f3314l;

    /* JADX INFO: renamed from: m */
    public final GlideExecutor f3315m;

    /* JADX INFO: renamed from: n */
    public final GlideExecutor f3316n;

    /* JADX INFO: renamed from: o */
    public final GlideExecutor f3317o;

    /* JADX INFO: renamed from: p */
    public final GlideExecutor f3318p;

    /* JADX INFO: renamed from: q */
    public final AtomicInteger f3319q;

    /* JADX INFO: renamed from: r */
    public Key f3320r;

    /* JADX INFO: renamed from: s */
    public boolean f3321s;

    /* JADX INFO: renamed from: t */
    public boolean f3322t;

    /* JADX INFO: renamed from: u */
    public boolean f3323u;

    /* JADX INFO: renamed from: v */
    public boolean f3324v;

    /* JADX INFO: renamed from: w */
    public Resource2<?> f3325w;

    /* JADX INFO: renamed from: x */
    public DataSource f3326x;

    /* JADX INFO: renamed from: y */
    public boolean f3327y;

    /* JADX INFO: renamed from: z */
    public GlideException f3328z;

    /* JADX INFO: renamed from: c.g.a.m.t.m$a */
    /* JADX INFO: compiled from: EngineJob.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final ResourceCallback f3329f;

        public a(ResourceCallback resourceCallback) {
            this.f3329f = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            SingleRequest singleRequest = (SingleRequest) this.f3329f;
            singleRequest.f3752c.mo2059a();
            synchronized (singleRequest.f3753d) {
                synchronized (EngineJob.this) {
                    if (EngineJob.this.f3309g.f3335f.contains(new d(this.f3329f, Executors.f3817b))) {
                        EngineJob engineJob = EngineJob.this;
                        ResourceCallback resourceCallback = this.f3329f;
                        Objects.requireNonNull(engineJob);
                        try {
                            ((SingleRequest) resourceCallback).m2014m(engineJob.f3328z, 5);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    EngineJob.this.m1823c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.m$b */
    /* JADX INFO: compiled from: EngineJob.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final ResourceCallback f3331f;

        public b(ResourceCallback resourceCallback) {
            this.f3331f = resourceCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            SingleRequest singleRequest = (SingleRequest) this.f3331f;
            singleRequest.f3752c.mo2059a();
            synchronized (singleRequest.f3753d) {
                synchronized (EngineJob.this) {
                    if (EngineJob.this.f3309g.f3335f.contains(new d(this.f3331f, Executors.f3817b))) {
                        EngineJob.this.f3306B.m1829a();
                        EngineJob engineJob = EngineJob.this;
                        ResourceCallback resourceCallback = this.f3331f;
                        Objects.requireNonNull(engineJob);
                        try {
                            ((SingleRequest) resourceCallback).m2015n(engineJob.f3306B, engineJob.f3326x);
                            EngineJob.this.m1827g(this.f3331f);
                        } catch (Throwable th) {
                            throw new CallbackException(th);
                        }
                    }
                    EngineJob.this.m1823c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.m$c */
    /* JADX INFO: compiled from: EngineJob.java */
    public static class c {
    }

    /* JADX INFO: renamed from: c.g.a.m.t.m$d */
    /* JADX INFO: compiled from: EngineJob.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final ResourceCallback f3333a;

        /* JADX INFO: renamed from: b */
        public final Executor f3334b;

        public d(ResourceCallback resourceCallback, Executor executor) {
            this.f3333a = resourceCallback;
            this.f3334b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f3333a.equals(((d) obj).f3333a);
            }
            return false;
        }

        public int hashCode() {
            return this.f3333a.hashCode();
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.m$e */
    /* JADX INFO: compiled from: EngineJob.java */
    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: f */
        public final List<d> f3335f = new ArrayList(2);

        public boolean isEmpty() {
            return this.f3335f.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator<d> iterator() {
            return this.f3335f.iterator();
        }
    }

    public EngineJob(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener, EngineResource.a aVar, Pools2<EngineJob<?>> pools2) {
        c cVar = f3304f;
        this.f3309g = new e();
        this.f3310h = new StateVerifier.b();
        this.f3319q = new AtomicInteger();
        this.f3315m = glideExecutor;
        this.f3316n = glideExecutor2;
        this.f3317o = glideExecutor3;
        this.f3318p = glideExecutor4;
        this.f3314l = engineJobListener;
        this.f3311i = aVar;
        this.f3312j = pools2;
        this.f3313k = cVar;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1821a(ResourceCallback resourceCallback, Executor executor) {
        this.f3310h.mo2059a();
        this.f3309g.f3335f.add(new d(resourceCallback, executor));
        boolean z = true;
        if (this.f3327y) {
            m1824d(1);
            executor.execute(new b(resourceCallback));
        } else if (this.f3305A) {
            m1824d(1);
            executor.execute(new a(resourceCallback));
        } else {
            if (this.f3308D) {
                z = false;
            }
            C8462c.m16935b(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m1822b() {
        if (m1825e()) {
            return;
        }
        this.f3308D = true;
        DecodeJob<R> decodeJob = this.f3307C;
        decodeJob.f3228J = true;
        DataFetcherGenerator dataFetcherGenerator = decodeJob.f3226H;
        if (dataFetcherGenerator != null) {
            dataFetcherGenerator.cancel();
        }
        EngineJobListener engineJobListener = this.f3314l;
        Key key = this.f3320r;
        Engine engine = (Engine) engineJobListener;
        synchronized (engine) {
            Jobs jobs = engine.f3279b;
            Objects.requireNonNull(jobs);
            Map<Key, EngineJob<?>> mapM1841a = jobs.m1841a(this.f3324v);
            if (equals(mapM1841a.get(key))) {
                mapM1841a.remove(key);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m1823c() {
        EngineResource<?> engineResource;
        synchronized (this) {
            this.f3310h.mo2059a();
            C8462c.m16935b(m1825e(), "Not yet complete!");
            int iDecrementAndGet = this.f3319q.decrementAndGet();
            C8462c.m16935b(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                engineResource = this.f3306B;
                m1826f();
            } else {
                engineResource = null;
            }
        }
        if (engineResource != null) {
            engineResource.m1833e();
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m1824d(int i) {
        EngineResource<?> engineResource;
        C8462c.m16935b(m1825e(), "Not yet complete!");
        if (this.f3319q.getAndAdd(i) == 0 && (engineResource = this.f3306B) != null) {
            engineResource.m1829a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1825e() {
        return this.f3305A || this.f3327y || this.f3308D;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m1826f() {
        boolean zM1806a;
        if (this.f3320r == null) {
            throw new IllegalArgumentException();
        }
        this.f3309g.f3335f.clear();
        this.f3320r = null;
        this.f3306B = null;
        this.f3325w = null;
        this.f3305A = false;
        this.f3308D = false;
        this.f3327y = false;
        DecodeJob<R> decodeJob = this.f3307C;
        DecodeJob.e eVar = decodeJob.f3235l;
        synchronized (eVar) {
            eVar.f3255a = true;
            zM1806a = eVar.m1806a(false);
        }
        if (zM1806a) {
            decodeJob.m1804y();
        }
        this.f3307C = null;
        this.f3328z = null;
        this.f3326x = null;
        this.f3312j.mo2058b(this);
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m1827g(ResourceCallback resourceCallback) {
        this.f3310h.mo2059a();
        this.f3309g.f3335f.remove(new d(resourceCallback, Executors.f3817b));
        if (this.f3309g.isEmpty()) {
            m1822b();
            if ((this.f3327y || this.f3305A) && this.f3319q.get() == 0) {
                m1826f();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m1828h(DecodeJob<?> decodeJob) {
        GlideExecutor glideExecutor;
        if (this.f3322t) {
            glideExecutor = this.f3317o;
        } else {
            glideExecutor = this.f3323u ? this.f3318p : this.f3316n;
        }
        glideExecutor.f3191h.execute(decodeJob);
    }

    @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.d
    /* JADX INFO: renamed from: l */
    public StateVerifier mo1785l() {
        return this.f3310h;
    }
}
