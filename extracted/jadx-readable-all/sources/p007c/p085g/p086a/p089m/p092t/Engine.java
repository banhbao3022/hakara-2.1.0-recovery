package p007c.p085g.p086a.p089m.p092t;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.GlideContext;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.Transformation;
import p007c.p085g.p086a.p089m.p092t.p094d0.DiskCache;
import p007c.p085g.p086a.p089m.p092t.p094d0.DiskCacheAdapter;
import p007c.p085g.p086a.p089m.p092t.p094d0.DiskLruCacheFactory;
import p007c.p085g.p086a.p089m.p092t.p094d0.DiskLruCacheWrapper;
import p007c.p085g.p086a.p089m.p092t.p094d0.LruResourceCache;
import p007c.p085g.p086a.p089m.p092t.p094d0.MemoryCache;
import p007c.p085g.p086a.p089m.p092t.p095e0.GlideExecutor;
import p007c.p085g.p086a.p108q.ResourceCallback;
import p007c.p085g.p086a.p108q.SingleRequest;
import p007c.p085g.p086a.p112s.LogTime;
import p007c.p085g.p086a.p112s.p113k.FactoryPools;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.t.l, reason: use source file name */
/* JADX INFO: compiled from: Engine.java */
/* JADX INFO: loaded from: classes.dex */
public class Engine implements EngineJobListener, MemoryCache.a, EngineResource.a {

    /* JADX INFO: renamed from: a */
    public static final boolean f3278a = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: b */
    public final Jobs f3279b;

    /* JADX INFO: renamed from: c */
    public final EngineKeyFactory f3280c;

    /* JADX INFO: renamed from: d */
    public final MemoryCache f3281d;

    /* JADX INFO: renamed from: e */
    public final b f3282e;

    /* JADX INFO: renamed from: f */
    public final ResourceRecycler f3283f;

    /* JADX INFO: renamed from: g */
    public final c f3284g;

    /* JADX INFO: renamed from: h */
    public final a f3285h;

    /* JADX INFO: renamed from: i */
    public final ActiveResources f3286i;

    /* JADX INFO: renamed from: c.g.a.m.t.l$a */
    /* JADX INFO: compiled from: Engine.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final DecodeJob.d f3287a;

        /* JADX INFO: renamed from: b */
        public final Pools2<DecodeJob<?>> f3288b = FactoryPools.m2055a(150, new C8502a());

        /* JADX INFO: renamed from: c */
        public int f3289c;

        /* JADX INFO: renamed from: c.g.a.m.t.l$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Engine.java */
        public class C8502a implements FactoryPools.b<DecodeJob<?>> {
            public C8502a() {
            }

            @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.b
            public DecodeJob<?> create() {
                a aVar = a.this;
                return new DecodeJob<>(aVar.f3287a, aVar.f3288b);
            }
        }

        public a(DecodeJob.d dVar) {
            this.f3287a = dVar;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.l$b */
    /* JADX INFO: compiled from: Engine.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final GlideExecutor f3291a;

        /* JADX INFO: renamed from: b */
        public final GlideExecutor f3292b;

        /* JADX INFO: renamed from: c */
        public final GlideExecutor f3293c;

        /* JADX INFO: renamed from: d */
        public final GlideExecutor f3294d;

        /* JADX INFO: renamed from: e */
        public final EngineJobListener f3295e;

        /* JADX INFO: renamed from: f */
        public final EngineResource.a f3296f;

        /* JADX INFO: renamed from: g */
        public final Pools2<EngineJob<?>> f3297g = FactoryPools.m2055a(150, new a());

        /* JADX INFO: renamed from: c.g.a.m.t.l$b$a */
        /* JADX INFO: compiled from: Engine.java */
        public class a implements FactoryPools.b<EngineJob<?>> {
            public a() {
            }

            @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.b
            public EngineJob<?> create() {
                b bVar = b.this;
                return new EngineJob<>(bVar.f3291a, bVar.f3292b, bVar.f3293c, bVar.f3294d, bVar.f3295e, bVar.f3296f, bVar.f3297g);
            }
        }

        public b(GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, EngineJobListener engineJobListener, EngineResource.a aVar) {
            this.f3291a = glideExecutor;
            this.f3292b = glideExecutor2;
            this.f3293c = glideExecutor3;
            this.f3294d = glideExecutor4;
            this.f3295e = engineJobListener;
            this.f3296f = aVar;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.l$c */
    /* JADX INFO: compiled from: Engine.java */
    public static class c implements DecodeJob.d {

        /* JADX INFO: renamed from: a */
        public final DiskCache.a f3299a;

        /* JADX INFO: renamed from: b */
        public volatile DiskCache f3300b;

        public c(DiskCache.a aVar) {
            this.f3299a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public DiskCache m1820a() {
            if (this.f3300b == null) {
                synchronized (this) {
                    if (this.f3300b == null) {
                        DiskLruCacheFactory diskLruCacheFactory = (DiskLruCacheFactory) this.f3299a;
                        File fileMo1779a = diskLruCacheFactory.f3157b.mo1779a();
                        DiskLruCacheWrapper diskLruCacheWrapper = null;
                        if (fileMo1779a != null && (fileMo1779a.mkdirs() || (fileMo1779a.exists() && fileMo1779a.isDirectory()))) {
                            diskLruCacheWrapper = new DiskLruCacheWrapper(fileMo1779a, diskLruCacheFactory.f3156a);
                        }
                        this.f3300b = diskLruCacheWrapper;
                    }
                    if (this.f3300b == null) {
                        this.f3300b = new DiskCacheAdapter();
                    }
                }
            }
            return this.f3300b;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.l$d */
    /* JADX INFO: compiled from: Engine.java */
    public class d {

        /* JADX INFO: renamed from: a */
        public final EngineJob<?> f3301a;

        /* JADX INFO: renamed from: b */
        public final ResourceCallback f3302b;

        public d(ResourceCallback resourceCallback, EngineJob<?> engineJob) {
            this.f3302b = resourceCallback;
            this.f3301a = engineJob;
        }
    }

    public Engine(MemoryCache memoryCache, DiskCache.a aVar, GlideExecutor glideExecutor, GlideExecutor glideExecutor2, GlideExecutor glideExecutor3, GlideExecutor glideExecutor4, boolean z) {
        this.f3281d = memoryCache;
        c cVar = new c(aVar);
        this.f3284g = cVar;
        ActiveResources activeResources = new ActiveResources(z);
        this.f3286i = activeResources;
        synchronized (this) {
            synchronized (activeResources) {
                activeResources.f3089e = this;
            }
        }
        this.f3280c = new EngineKeyFactory();
        this.f3279b = new Jobs();
        this.f3282e = new b(glideExecutor, glideExecutor2, glideExecutor3, glideExecutor4, this, this);
        this.f3285h = new a(cVar);
        this.f3283f = new ResourceRecycler();
        ((LruResourceCache) memoryCache).f3168d = this;
    }

    /* JADX INFO: renamed from: d */
    public static void m1813d(String str, long j2, Key key) {
        StringBuilder sbM1561L = outline.m1561L(str, " in ");
        sbM1561L.append(LogTime.m2040a(j2));
        sbM1561L.append("ms, key: ");
        sbM1561L.append(key);
        Log.v("Engine", sbM1561L.toString());
    }

    @Override // p007c.p085g.p086a.p089m.p092t.EngineResource.a
    /* JADX INFO: renamed from: a */
    public void mo1814a(Key key, EngineResource<?> engineResource) {
        ActiveResources activeResources = this.f3286i;
        synchronized (activeResources) {
            ActiveResources.b bVarRemove = activeResources.f3087c.remove(key);
            if (bVarRemove != null) {
                bVarRemove.f3093c = null;
                bVarRemove.clear();
            }
        }
        if (engineResource.f3345f) {
            ((LruResourceCache) this.f3281d).m2042d(key, engineResource);
        } else {
            this.f3283f.m1845a(engineResource, false);
        }
    }

    /* JADX INFO: renamed from: b */
    public <R> d m1815b(GlideContext glideContext, Object obj, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor) throws Throwable {
        long jElapsedRealtimeNanos;
        if (f3278a) {
            int i3 = LogTime.f3820b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        long j2 = jElapsedRealtimeNanos;
        Objects.requireNonNull(this.f3280c);
        EngineKey engineKey = new EngineKey(obj, key, i, i2, map, cls, cls2, options);
        synchronized (this) {
            EngineResource<?> engineResourceM1816c = m1816c(engineKey, z3, j2);
            if (engineResourceM1816c == null) {
                return m1819g(glideContext, obj, key, i, i2, cls, cls2, priority, diskCacheStrategy, map, z, z2, options, z3, z4, z5, z6, resourceCallback, executor, engineKey, j2);
            }
            ((SingleRequest) resourceCallback).m2015n(engineResourceM1816c, DataSource.MEMORY_CACHE);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final EngineResource<?> m1816c(EngineKey engineKey, boolean z, long j2) {
        EngineResource<?> engineResource;
        Object objRemove;
        EngineResource<?> engineResource2;
        if (!z) {
            return null;
        }
        ActiveResources activeResources = this.f3286i;
        synchronized (activeResources) {
            ActiveResources.b bVar = activeResources.f3087c.get(engineKey);
            if (bVar == null) {
                engineResource = null;
            } else {
                engineResource = bVar.get();
                if (engineResource == null) {
                    activeResources.m1733b(bVar);
                }
            }
        }
        if (engineResource != null) {
            engineResource.m1829a();
        }
        if (engineResource != null) {
            if (f3278a) {
                m1813d("Loaded resource from active resources", j2, engineKey);
            }
            return engineResource;
        }
        LruResourceCache lruResourceCache = (LruResourceCache) this.f3281d;
        synchronized (lruResourceCache) {
            objRemove = lruResourceCache.f3821a.remove(engineKey);
            if (objRemove != null) {
                lruResourceCache.f3823c -= (long) lruResourceCache.mo1781b(objRemove);
            }
        }
        Resource2 resource2 = (Resource2) objRemove;
        if (resource2 == null) {
            engineResource2 = null;
        } else {
            engineResource2 = resource2 instanceof EngineResource ? (EngineResource) resource2 : new EngineResource<>(resource2, true, true, engineKey, this);
        }
        if (engineResource2 != null) {
            engineResource2.m1829a();
            this.f3286i.m1732a(engineKey, engineResource2);
        }
        if (engineResource2 == null) {
            return null;
        }
        if (f3278a) {
            m1813d("Loaded resource from cache", j2, engineKey);
        }
        return engineResource2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0021 A[Catch: all -> 0x0026, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x000c, B:9:0x0021), top: B:15:0x0003 }] */
    /* JADX INFO: renamed from: e */
    public synchronized void m1817e(EngineJob<?> engineJob, Key key, EngineResource<?> engineResource) {
        Map<Key, EngineJob<?>> mapM1841a;
        if (engineResource != null) {
            if (engineResource.f3345f) {
                this.f3286i.m1732a(key, engineResource);
            }
            Jobs jobs = this.f3279b;
            Objects.requireNonNull(jobs);
            mapM1841a = jobs.m1841a(engineJob.f3324v);
            if (engineJob.equals(mapM1841a.get(key))) {
                mapM1841a.remove(key);
            }
        } else {
            Jobs jobs2 = this.f3279b;
            Objects.requireNonNull(jobs2);
            mapM1841a = jobs2.m1841a(engineJob.f3324v);
            if (engineJob.equals(mapM1841a.get(key))) {
                mapM1841a.remove(key);
            }
        }
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public void m1818f(Resource2<?> resource2) {
        if (!(resource2 instanceof EngineResource)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((EngineResource) resource2).m1833e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public final <R> d m1819g(GlideContext glideContext, Object obj, Key key, int i, int i2, Class<?> cls, Class<R> cls2, Priority priority, DiskCacheStrategy diskCacheStrategy, Map<Class<?>, Transformation<?>> map, boolean z, boolean z2, Options options, boolean z3, boolean z4, boolean z5, boolean z6, ResourceCallback resourceCallback, Executor executor, EngineKey engineKey, long j2) {
        GlideExecutor glideExecutor;
        Jobs jobs = this.f3279b;
        EngineJob<?> engineJob = (z6 ? jobs.f3361b : jobs.f3360a).get(engineKey);
        if (engineJob != null) {
            engineJob.m1821a(resourceCallback, executor);
            if (f3278a) {
                m1813d("Added to existing load", j2, engineKey);
            }
            return new d(resourceCallback, engineJob);
        }
        EngineJob<?> engineJobMo2057a = this.f3282e.f3297g.mo2057a();
        Objects.requireNonNull(engineJobMo2057a, "Argument must not be null");
        synchronized (engineJobMo2057a) {
            engineJobMo2057a.f3320r = engineKey;
            engineJobMo2057a.f3321s = z3;
            engineJobMo2057a.f3322t = z4;
            engineJobMo2057a.f3323u = z5;
            engineJobMo2057a.f3324v = z6;
        }
        a aVar = this.f3285h;
        DecodeJob<R> decodeJob = (DecodeJob) aVar.f3288b.mo2057a();
        Objects.requireNonNull(decodeJob, "Argument must not be null");
        int i3 = aVar.f3289c;
        aVar.f3289c = i3 + 1;
        DecodeHelper<R> decodeHelper = decodeJob.f3229f;
        DecodeJob.d dVar = decodeJob.f3232i;
        decodeHelper.f3203c = glideContext;
        decodeHelper.f3204d = obj;
        decodeHelper.f3214n = key;
        decodeHelper.f3205e = i;
        decodeHelper.f3206f = i2;
        decodeHelper.f3216p = diskCacheStrategy;
        decodeHelper.f3207g = cls;
        decodeHelper.f3208h = dVar;
        decodeHelper.f3211k = cls2;
        decodeHelper.f3215o = priority;
        decodeHelper.f3209i = options;
        decodeHelper.f3210j = map;
        decodeHelper.f3217q = z;
        decodeHelper.f3218r = z2;
        decodeJob.f3236m = glideContext;
        decodeJob.f3237n = key;
        decodeJob.f3238o = priority;
        decodeJob.f3239p = engineKey;
        decodeJob.f3240q = i;
        decodeJob.f3241r = i2;
        decodeJob.f3242s = diskCacheStrategy;
        decodeJob.f3249z = z6;
        decodeJob.f3243t = options;
        decodeJob.f3244u = engineJobMo2057a;
        decodeJob.f3245v = i3;
        decodeJob.f3247x = DecodeJob.f.INITIALIZE;
        decodeJob.f3219A = obj;
        Jobs jobs2 = this.f3279b;
        Objects.requireNonNull(jobs2);
        jobs2.m1841a(engineJobMo2057a.f3324v).put(engineKey, engineJobMo2057a);
        engineJobMo2057a.m1821a(resourceCallback, executor);
        synchronized (engineJobMo2057a) {
            engineJobMo2057a.f3307C = decodeJob;
            DecodeJob.g gVarM1801v = decodeJob.m1801v(DecodeJob.g.INITIALIZE);
            if (gVarM1801v == DecodeJob.g.RESOURCE_CACHE || gVarM1801v == DecodeJob.g.DATA_CACHE) {
                glideExecutor = engineJobMo2057a.f3315m;
            } else if (engineJobMo2057a.f3322t) {
                glideExecutor = engineJobMo2057a.f3317o;
            } else {
                glideExecutor = engineJobMo2057a.f3323u ? engineJobMo2057a.f3318p : engineJobMo2057a.f3316n;
            }
            glideExecutor.f3191h.execute(decodeJob);
        }
        if (f3278a) {
            m1813d("Started new load", j2, engineKey);
        }
        return new d(resourceCallback, engineJobMo2057a);
    }
}
