package p007c.p085g.p086a.p089m.p092t;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.GlideContext;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.Key;
import p007c.p085g.p086a.p089m.Option;
import p007c.p085g.p086a.p089m.Options;
import p007c.p085g.p086a.p089m.ResourceEncoder;
import p007c.p085g.p086a.p089m.p090s.DataFetcher;
import p007c.p085g.p086a.p089m.p090s.DataRewinder;
import p007c.p085g.p086a.p089m.p090s.DataRewinderRegistry;
import p007c.p085g.p086a.p089m.p098v.p099d.Downsampler;
import p007c.p085g.p086a.p112s.LogTime;
import p007c.p085g.p086a.p112s.p113k.FactoryPools;
import p007c.p085g.p086a.p112s.p113k.StateVerifier;
import p636z0.p725k.p738k.Pools2;

/* JADX INFO: renamed from: c.g.a.m.t.i, reason: use source file name */
/* JADX INFO: compiled from: DecodeJob.java */
/* JADX INFO: loaded from: classes.dex */
public class DecodeJob<R> implements DataFetcherGenerator.a, Runnable, Comparable<DecodeJob<?>>, FactoryPools.d {

    /* JADX INFO: renamed from: A */
    public Object f3219A;

    /* JADX INFO: renamed from: B */
    public Thread f3220B;

    /* JADX INFO: renamed from: C */
    public Key f3221C;

    /* JADX INFO: renamed from: D */
    public Key f3222D;

    /* JADX INFO: renamed from: E */
    public Object f3223E;

    /* JADX INFO: renamed from: F */
    public DataSource f3224F;

    /* JADX INFO: renamed from: G */
    public DataFetcher<?> f3225G;

    /* JADX INFO: renamed from: H */
    public volatile DataFetcherGenerator f3226H;

    /* JADX INFO: renamed from: I */
    public volatile boolean f3227I;

    /* JADX INFO: renamed from: J */
    public volatile boolean f3228J;

    /* JADX INFO: renamed from: i */
    public final d f3232i;

    /* JADX INFO: renamed from: j */
    public final Pools2<DecodeJob<?>> f3233j;

    /* JADX INFO: renamed from: m */
    public GlideContext f3236m;

    /* JADX INFO: renamed from: n */
    public Key f3237n;

    /* JADX INFO: renamed from: o */
    public Priority f3238o;

    /* JADX INFO: renamed from: p */
    public EngineKey f3239p;

    /* JADX INFO: renamed from: q */
    public int f3240q;

    /* JADX INFO: renamed from: r */
    public int f3241r;

    /* JADX INFO: renamed from: s */
    public DiskCacheStrategy f3242s;

    /* JADX INFO: renamed from: t */
    public Options f3243t;

    /* JADX INFO: renamed from: u */
    public a<R> f3244u;

    /* JADX INFO: renamed from: v */
    public int f3245v;

    /* JADX INFO: renamed from: w */
    public g f3246w;

    /* JADX INFO: renamed from: x */
    public f f3247x;

    /* JADX INFO: renamed from: y */
    public long f3248y;

    /* JADX INFO: renamed from: z */
    public boolean f3249z;

    /* JADX INFO: renamed from: f */
    public final DecodeHelper<R> f3229f = new DecodeHelper<>();

    /* JADX INFO: renamed from: g */
    public final List<Throwable> f3230g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final StateVerifier f3231h = new StateVerifier.b();

    /* JADX INFO: renamed from: k */
    public final c<?> f3234k = new c<>();

    /* JADX INFO: renamed from: l */
    public final e f3235l = new e();

    /* JADX INFO: renamed from: c.g.a.m.t.i$a */
    /* JADX INFO: compiled from: DecodeJob.java */
    public interface a<R> {
    }

    /* JADX INFO: renamed from: c.g.a.m.t.i$b */
    /* JADX INFO: compiled from: DecodeJob.java */
    public final class b<Z> implements DecodePath.a<Z> {

        /* JADX INFO: renamed from: a */
        public final DataSource f3250a;

        public b(DataSource dataSource) {
            this.f3250a = dataSource;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.i$c */
    /* JADX INFO: compiled from: DecodeJob.java */
    public static class c<Z> {

        /* JADX INFO: renamed from: a */
        public Key f3252a;

        /* JADX INFO: renamed from: b */
        public ResourceEncoder<Z> f3253b;

        /* JADX INFO: renamed from: c */
        public LockedResource<Z> f3254c;
    }

    /* JADX INFO: renamed from: c.g.a.m.t.i$d */
    /* JADX INFO: compiled from: DecodeJob.java */
    public interface d {
    }

    /* JADX INFO: renamed from: c.g.a.m.t.i$e */
    /* JADX INFO: compiled from: DecodeJob.java */
    public static class e {

        /* JADX INFO: renamed from: a */
        public boolean f3255a;

        /* JADX INFO: renamed from: b */
        public boolean f3256b;

        /* JADX INFO: renamed from: c */
        public boolean f3257c;

        /* JADX INFO: renamed from: a */
        public final boolean m1806a(boolean z) {
            return (this.f3257c || z || this.f3256b) && this.f3255a;
        }
    }

    /* JADX INFO: renamed from: c.g.a.m.t.i$f */
    /* JADX INFO: compiled from: DecodeJob.java */
    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: c.g.a.m.t.i$g */
    /* JADX INFO: compiled from: DecodeJob.java */
    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    public DecodeJob(d dVar, Pools2<DecodeJob<?>> pools2) {
        this.f3232i = dVar;
        this.f3233j = pools2;
    }

    /* JADX INFO: renamed from: A */
    public final void m1795A() {
        int iOrdinal = this.f3247x.ordinal();
        if (iOrdinal == 0) {
            this.f3246w = m1801v(g.INITIALIZE);
            this.f3226H = m1800u();
            m1805z();
        } else if (iOrdinal == 1) {
            m1805z();
        } else if (iOrdinal == 2) {
            m1799s();
        } else {
            StringBuilder sbM1556G = outline.m1556G("Unrecognized run reason: ");
            sbM1556G.append(this.f3247x);
            throw new IllegalStateException(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m1796B() {
        Throwable th;
        this.f3231h.mo2059a();
        if (!this.f3227I) {
            this.f3227I = true;
            return;
        }
        if (this.f3230g.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f3230g;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Comparable
    public int compareTo(DecodeJob<?> decodeJob) {
        DecodeJob<?> decodeJob2 = decodeJob;
        int iOrdinal = this.f3238o.ordinal() - decodeJob2.f3238o.ordinal();
        return iOrdinal == 0 ? this.f3245v - decodeJob2.f3245v : iOrdinal;
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator.a
    /* JADX INFO: renamed from: f */
    public void mo1735f(Key key, Exception exc, DataFetcher<?> dataFetcher, DataSource dataSource) {
        dataFetcher.mo1715b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        Class<?> clsMo1712a = dataFetcher.mo1712a();
        glideException.f3354h = key;
        glideException.f3355i = dataSource;
        glideException.f3356j = clsMo1712a;
        this.f3230g.add(glideException);
        if (Thread.currentThread() == this.f3220B) {
            m1805z();
        } else {
            this.f3247x = f.SWITCH_TO_SOURCE_SERVICE;
            ((EngineJob) this.f3244u).m1828h(this);
        }
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator.a
    /* JADX INFO: renamed from: h */
    public void mo1736h() {
        this.f3247x = f.SWITCH_TO_SOURCE_SERVICE;
        ((EngineJob) this.f3244u).m1828h(this);
    }

    @Override // p007c.p085g.p086a.p089m.p092t.DataFetcherGenerator.a
    /* JADX INFO: renamed from: j */
    public void mo1737j(Key key, Object obj, DataFetcher<?> dataFetcher, DataSource dataSource, Key key2) {
        this.f3221C = key;
        this.f3223E = obj;
        this.f3225G = dataFetcher;
        this.f3224F = dataSource;
        this.f3222D = key2;
        if (Thread.currentThread() == this.f3220B) {
            m1799s();
        } else {
            this.f3247x = f.DECODE_DATA;
            ((EngineJob) this.f3244u).m1828h(this);
        }
    }

    @Override // p007c.p085g.p086a.p112s.p113k.FactoryPools.d
    /* JADX INFO: renamed from: l */
    public StateVerifier mo1785l() {
        return this.f3231h;
    }

    /* JADX INFO: renamed from: m */
    public final <Data> Resource2<R> m1797m(DataFetcher<?> dataFetcher, Data data, DataSource dataSource) throws GlideException {
        if (data == null) {
            dataFetcher.mo1715b();
            return null;
        }
        try {
            int i = LogTime.f3820b;
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            Resource2<R> resource2M1798q = m1798q(data, dataSource);
            if (Log.isLoggable("DecodeJob", 2)) {
                m1802w("Decoded result " + resource2M1798q, jElapsedRealtimeNanos, null);
            }
            return resource2M1798q;
        } finally {
            dataFetcher.mo1715b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final <Data> Resource2<R> m1798q(Data data, DataSource dataSource) throws GlideException {
        DataRewinder<Data> dataRewinderMo1725b;
        LoadPath<Data, ?, R> loadPathM1791d = this.f3229f.m1791d(data.getClass());
        Options options = this.f3243t;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = dataSource == DataSource.RESOURCE_DISK_CACHE || this.f3229f.f3218r;
            Option<Boolean> option = Downsampler.f3562d;
            Boolean bool = (Boolean) options.m1707c(option);
            if (bool == null || (bool.booleanValue() && !z)) {
                options = new Options();
                options.m1708d(this.f3243t);
                options.f3039b.put(option, Boolean.valueOf(z));
            }
        }
        Options options2 = options;
        DataRewinderRegistry dataRewinderRegistry = this.f3236m.f2881c.f2899e;
        synchronized (dataRewinderRegistry) {
            DataRewinder.a<?> aVar = dataRewinderRegistry.f3051b.get(data.getClass());
            if (aVar == null) {
                for (DataRewinder.a<?> aVar2 : dataRewinderRegistry.f3051b.values()) {
                    if (aVar2.mo1724a().isAssignableFrom(data.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = DataRewinderRegistry.f3050a;
            }
            dataRewinderMo1725b = aVar.mo1725b(data);
        }
        try {
            return loadPathM1791d.m1842a(dataRewinderMo1725b, options2, this.f3240q, this.f3241r, new b(dataSource));
        } finally {
            dataRewinderMo1725b.mo1723b();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        DataFetcher<?> dataFetcher = this.f3225G;
        try {
            try {
                try {
                    if (this.f3228J) {
                        m1803x();
                        if (dataFetcher != null) {
                            dataFetcher.mo1715b();
                            return;
                        }
                        return;
                    }
                    m1795A();
                    if (dataFetcher != null) {
                        dataFetcher.mo1715b();
                    }
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f3228J + ", stage: " + this.f3246w, th);
                    }
                    if (this.f3246w != g.ENCODE) {
                        this.f3230g.add(th);
                        m1803x();
                    }
                    if (!this.f3228J) {
                        throw th;
                    }
                    throw th;
                }
            } catch (CallbackException e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            if (dataFetcher != null) {
                dataFetcher.mo1715b();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1799s() {
        LockedResource lockedResourceM1797m;
        boolean zM1806a;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j2 = this.f3248y;
            StringBuilder sbM1556G = outline.m1556G("data: ");
            sbM1556G.append(this.f3223E);
            sbM1556G.append(", cache key: ");
            sbM1556G.append(this.f3221C);
            sbM1556G.append(", fetcher: ");
            sbM1556G.append(this.f3225G);
            m1802w("Retrieved data", j2, sbM1556G.toString());
        }
        LockedResource lockedResourceM1843a = null;
        try {
            lockedResourceM1797m = m1797m(this.f3225G, this.f3223E, this.f3224F);
        } catch (GlideException e2) {
            Key key = this.f3222D;
            DataSource dataSource = this.f3224F;
            e2.f3354h = key;
            e2.f3355i = dataSource;
            e2.f3356j = null;
            this.f3230g.add(e2);
            lockedResourceM1797m = null;
        }
        if (lockedResourceM1797m == null) {
            m1805z();
            return;
        }
        DataSource dataSource2 = this.f3224F;
        if (lockedResourceM1797m instanceof Initializable) {
            ((Initializable) lockedResourceM1797m).mo1840a();
        }
        if (this.f3234k.f3254c != null) {
            lockedResourceM1843a = LockedResource.m1843a(lockedResourceM1797m);
            lockedResourceM1797m = lockedResourceM1843a;
        }
        m1796B();
        EngineJob<?> engineJob = (EngineJob) this.f3244u;
        synchronized (engineJob) {
            engineJob.f3325w = lockedResourceM1797m;
            engineJob.f3326x = dataSource2;
        }
        synchronized (engineJob) {
            engineJob.f3310h.mo2059a();
            if (engineJob.f3308D) {
                engineJob.f3325w.mo1830b();
                engineJob.m1826f();
            } else {
                if (engineJob.f3309g.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (engineJob.f3327y) {
                    throw new IllegalStateException("Already have resource");
                }
                EngineJob.c cVar = engineJob.f3313k;
                Resource2<?> resource2 = engineJob.f3325w;
                boolean z = engineJob.f3321s;
                Key key2 = engineJob.f3320r;
                EngineResource.a aVar = engineJob.f3311i;
                Objects.requireNonNull(cVar);
                engineJob.f3306B = new EngineResource<>(resource2, z, true, key2, aVar);
                engineJob.f3327y = true;
                EngineJob.e eVar = engineJob.f3309g;
                Objects.requireNonNull(eVar);
                ArrayList<EngineJob.d> arrayList = new ArrayList(eVar.f3335f);
                engineJob.m1824d(arrayList.size() + 1);
                ((Engine) engineJob.f3314l).m1817e(engineJob, engineJob.f3320r, engineJob.f3306B);
                for (EngineJob.d dVar : arrayList) {
                    dVar.f3334b.execute(new EngineJob.b(dVar.f3333a));
                }
                engineJob.m1823c();
            }
        }
        this.f3246w = g.ENCODE;
        try {
            c<?> cVar2 = this.f3234k;
            if (cVar2.f3254c != null) {
                try {
                    ((Engine.c) this.f3232i).m1820a().mo1776a(cVar2.f3252a, new DataCacheWriter(cVar2.f3253b, cVar2.f3254c, this.f3243t));
                    cVar2.f3254c.m1844e();
                } catch (Throwable th) {
                    cVar2.f3254c.m1844e();
                    throw th;
                }
            }
            if (lockedResourceM1843a != null) {
                lockedResourceM1843a.m1844e();
            }
            e eVar2 = this.f3235l;
            synchronized (eVar2) {
                eVar2.f3256b = true;
                zM1806a = eVar2.m1806a(false);
            }
            if (zM1806a) {
                m1804y();
            }
        } catch (Throwable th2) {
            if (lockedResourceM1843a != null) {
                lockedResourceM1843a.m1844e();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: u */
    public final DataFetcherGenerator m1800u() {
        int iOrdinal = this.f3246w.ordinal();
        if (iOrdinal == 1) {
            return new ResourceCacheGenerator(this.f3229f, this);
        }
        if (iOrdinal == 2) {
            return new DataCacheGenerator(this.f3229f, this);
        }
        if (iOrdinal == 3) {
            return new SourceGenerator2(this.f3229f, this);
        }
        if (iOrdinal == 5) {
            return null;
        }
        StringBuilder sbM1556G = outline.m1556G("Unrecognized stage: ");
        sbM1556G.append(this.f3246w);
        throw new IllegalStateException(sbM1556G.toString());
    }

    /* JADX INFO: renamed from: v */
    public final g m1801v(g gVar) {
        g gVar2 = g.RESOURCE_CACHE;
        g gVar3 = g.DATA_CACHE;
        g gVar4 = g.FINISHED;
        int iOrdinal = gVar.ordinal();
        if (iOrdinal == 0) {
            return this.f3242s.mo1810b() ? gVar2 : m1801v(gVar2);
        }
        if (iOrdinal == 1) {
            return this.f3242s.mo1809a() ? gVar3 : m1801v(gVar3);
        }
        if (iOrdinal == 2) {
            return this.f3249z ? gVar4 : g.SOURCE;
        }
        if (iOrdinal == 3 || iOrdinal == 5) {
            return gVar4;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + gVar);
    }

    /* JADX INFO: renamed from: w */
    public final void m1802w(String str, long j2, String str2) {
        StringBuilder sbM1561L = outline.m1561L(str, " in ");
        sbM1561L.append(LogTime.m2040a(j2));
        sbM1561L.append(", load key: ");
        sbM1561L.append(this.f3239p);
        sbM1561L.append(str2 != null ? outline.m1599u(", ", str2) : "");
        sbM1561L.append(", thread: ");
        sbM1561L.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sbM1561L.toString());
    }

    /* JADX INFO: renamed from: x */
    public final void m1803x() {
        boolean zM1806a;
        m1796B();
        GlideException glideException = new GlideException("Failed to load resource", new ArrayList(this.f3230g));
        EngineJob<?> engineJob = (EngineJob) this.f3244u;
        synchronized (engineJob) {
            engineJob.f3328z = glideException;
        }
        synchronized (engineJob) {
            engineJob.f3310h.mo2059a();
            if (engineJob.f3308D) {
                engineJob.m1826f();
            } else {
                if (engineJob.f3309g.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (engineJob.f3305A) {
                    throw new IllegalStateException("Already failed once");
                }
                engineJob.f3305A = true;
                Key key = engineJob.f3320r;
                EngineJob.e eVar = engineJob.f3309g;
                Objects.requireNonNull(eVar);
                ArrayList<EngineJob.d> arrayList = new ArrayList(eVar.f3335f);
                engineJob.m1824d(arrayList.size() + 1);
                ((Engine) engineJob.f3314l).m1817e(engineJob, key, null);
                for (EngineJob.d dVar : arrayList) {
                    dVar.f3334b.execute(new EngineJob.a(dVar.f3333a));
                }
                engineJob.m1823c();
            }
        }
        e eVar2 = this.f3235l;
        synchronized (eVar2) {
            eVar2.f3257c = true;
            zM1806a = eVar2.m1806a(false);
        }
        if (zM1806a) {
            m1804y();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1804y() {
        e eVar = this.f3235l;
        synchronized (eVar) {
            eVar.f3256b = false;
            eVar.f3255a = false;
            eVar.f3257c = false;
        }
        c<?> cVar = this.f3234k;
        cVar.f3252a = null;
        cVar.f3253b = null;
        cVar.f3254c = null;
        DecodeHelper<R> decodeHelper = this.f3229f;
        decodeHelper.f3203c = null;
        decodeHelper.f3204d = null;
        decodeHelper.f3214n = null;
        decodeHelper.f3207g = null;
        decodeHelper.f3211k = null;
        decodeHelper.f3209i = null;
        decodeHelper.f3215o = null;
        decodeHelper.f3210j = null;
        decodeHelper.f3216p = null;
        decodeHelper.f3201a.clear();
        decodeHelper.f3212l = false;
        decodeHelper.f3202b.clear();
        decodeHelper.f3213m = false;
        this.f3227I = false;
        this.f3236m = null;
        this.f3237n = null;
        this.f3243t = null;
        this.f3238o = null;
        this.f3239p = null;
        this.f3244u = null;
        this.f3246w = null;
        this.f3226H = null;
        this.f3220B = null;
        this.f3221C = null;
        this.f3223E = null;
        this.f3224F = null;
        this.f3225G = null;
        this.f3248y = 0L;
        this.f3228J = false;
        this.f3219A = null;
        this.f3230g.clear();
        this.f3233j.mo2058b(this);
    }

    /* JADX INFO: renamed from: z */
    public final void m1805z() {
        this.f3220B = Thread.currentThread();
        int i = LogTime.f3820b;
        this.f3248y = SystemClock.elapsedRealtimeNanos();
        boolean zMo1734a = false;
        while (!this.f3228J && this.f3226H != null && !(zMo1734a = this.f3226H.mo1734a())) {
            this.f3246w = m1801v(this.f3246w);
            this.f3226H = m1800u();
            if (this.f3246w == g.SOURCE) {
                this.f3247x = f.SWITCH_TO_SOURCE_SERVICE;
                ((EngineJob) this.f3244u).m1828h(this);
                return;
            }
        }
        if ((this.f3246w == g.FINISHED || this.f3228J) && !zMo1734a) {
            m1803x();
        }
    }
}
