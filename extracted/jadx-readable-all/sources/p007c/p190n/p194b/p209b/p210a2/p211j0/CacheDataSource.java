package p007c.p190n.p194b.p209b.p210a2.p211j0;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p210a2.DataSink;
import p007c.p190n.p194b.p209b.p210a2.DataSource3;
import p007c.p190n.p194b.p209b.p210a2.DataSourceException;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.DummyDataSource;
import p007c.p190n.p194b.p209b.p210a2.FileDataSource;
import p007c.p190n.p194b.p209b.p210a2.PriorityDataSource;
import p007c.p190n.p194b.p209b.p210a2.TeeDataSource;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.PriorityTaskManager;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p378c.p379a.Charsets;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.e, reason: use source file name */
/* JADX INFO: compiled from: CacheDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public final class CacheDataSource implements DataSource3 {

    /* JADX INFO: renamed from: a */
    public final Cache f6043a;

    /* JADX INFO: renamed from: b */
    public final DataSource3 f6044b;

    /* JADX INFO: renamed from: c */
    public final DataSource3 f6045c;

    /* JADX INFO: renamed from: d */
    public final DataSource3 f6046d;

    /* JADX INFO: renamed from: e */
    public final CacheKeyFactory f6047e;

    /* JADX INFO: renamed from: f */
    public final a f6048f;

    /* JADX INFO: renamed from: g */
    public final boolean f6049g;

    /* JADX INFO: renamed from: h */
    public final boolean f6050h;

    /* JADX INFO: renamed from: i */
    public final boolean f6051i;

    /* JADX INFO: renamed from: j */
    public Uri f6052j;

    /* JADX INFO: renamed from: k */
    public DataSpec f6053k;

    /* JADX INFO: renamed from: l */
    public DataSource3 f6054l;

    /* JADX INFO: renamed from: m */
    public boolean f6055m;

    /* JADX INFO: renamed from: n */
    public long f6056n;

    /* JADX INFO: renamed from: o */
    public long f6057o;

    /* JADX INFO: renamed from: p */
    public CacheSpan f6058p;

    /* JADX INFO: renamed from: q */
    public boolean f6059q;

    /* JADX INFO: renamed from: r */
    public boolean f6060r;

    /* JADX INFO: renamed from: s */
    public long f6061s;

    /* JADX INFO: renamed from: t */
    public long f6062t;

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.e$a */
    /* JADX INFO: compiled from: CacheDataSource.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m2951a(int i);

        /* JADX INFO: renamed from: b */
        void m2952b(long j2, long j3);
    }

    /* JADX INFO: renamed from: c.n.b.b.a2.j0.e$b */
    /* JADX INFO: compiled from: CacheDataSource.java */
    public static final class b implements DataSource3.a {

        /* JADX INFO: renamed from: a */
        public Cache f6063a;

        /* JADX INFO: renamed from: b */
        public DataSource3.a f6064b = new FileDataSource.a();

        /* JADX INFO: renamed from: c */
        public CacheKeyFactory f6065c;

        /* JADX INFO: renamed from: d */
        public DataSource3.a f6066d;

        /* JADX INFO: renamed from: e */
        public int f6067e;

        public b() {
            int i = CacheKeyFactory.f6073a;
            this.f6065c = C1417a.f6028b;
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3.a
        /* JADX INFO: renamed from: a */
        public DataSource3 mo2953a() {
            DataSource3.a aVar = this.f6066d;
            CacheDataSink cacheDataSink = null;
            DataSource3 dataSource3Mo2953a = aVar != null ? aVar.mo2953a() : null;
            int i = this.f6067e;
            Cache cache = this.f6063a;
            Objects.requireNonNull(cache);
            if (dataSource3Mo2953a != null) {
                CacheDataSink.b bVar = new CacheDataSink.b();
                bVar.f6040a = cache;
                cacheDataSink = new CacheDataSink(cache, bVar.f6041b, bVar.f6042c);
            }
            return new CacheDataSource(cache, dataSource3Mo2953a, this.f6064b.mo2953a(), cacheDataSink, this.f6065c, i, null, 0, null);
        }
    }

    public CacheDataSource(Cache cache, DataSource3 dataSource3) {
        this(cache, dataSource3, 0);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: c */
    public void mo2915c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f6044b.mo2915c(transferListener);
        this.f6046d.mo2915c(transferListener);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws IOException {
        this.f6053k = null;
        this.f6052j = null;
        this.f6056n = 0L;
        a aVar = this.f6048f;
        if (aVar != null && this.f6061s > 0) {
            aVar.m2952b(this.f6043a.mo2937h(), this.f6061s);
            this.f6061s = 0L;
        }
        try {
            m2946q();
        } catch (Throwable th) {
            m2947r(th);
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws IOException {
        int i;
        a aVar;
        try {
            Objects.requireNonNull((C1417a) this.f6047e);
            String string = dataSpec.f6144h;
            if (string == null) {
                string = dataSpec.f6137a.toString();
            }
            DataSpec.b bVarM3001a = dataSpec.m3001a();
            bVarM3001a.f6154h = string;
            DataSpec dataSpecM3005a = bVarM3001a.m3005a();
            this.f6053k = dataSpecM3005a;
            Cache cache = this.f6043a;
            Uri uri = dataSpecM3005a.f6137a;
            byte[] bArr = ((DefaultContentMetadata) cache.mo2931b(string)).f6109c.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, Charsets.f26131c) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f6052j = uri;
            this.f6056n = dataSpec.f6142f;
            boolean z = true;
            if (this.f6050h && this.f6059q) {
                i = 0;
            } else {
                i = (this.f6051i && dataSpec.f6143g == -1) ? 1 : -1;
            }
            if (i == -1) {
                z = false;
            }
            this.f6060r = z;
            if (z && (aVar = this.f6048f) != null) {
                aVar.m2951a(i);
            }
            long j2 = dataSpec.f6143g;
            if (j2 != -1 || this.f6060r) {
                this.f6057o = j2;
            } else {
                long jM2982a = ContentMetadata.m2982a(this.f6043a.mo2931b(string));
                this.f6057o = jM2982a;
                if (jM2982a != -1) {
                    long j3 = jM2982a - dataSpec.f6142f;
                    this.f6057o = j3;
                    if (j3 <= 0) {
                        throw new DataSourceException(0);
                    }
                }
            }
            m2949t(dataSpecM3005a, false);
            return this.f6057o;
        } catch (Throwable th) {
            m2947r(th);
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        return m2948s() ^ true ? this.f6046d.mo2916j() : Collections.emptyMap();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        return this.f6052j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m2946q() throws IOException {
        DataSource3 dataSource3 = this.f6054l;
        if (dataSource3 == null) {
            return;
        }
        try {
            dataSource3.close();
        } finally {
            this.f6054l = null;
            this.f6055m = false;
            CacheSpan cacheSpan = this.f6058p;
            if (cacheSpan != null) {
                this.f6043a.mo2938i(cacheSpan);
                this.f6058p = null;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2947r(Throwable th) {
        if (m2948s() || (th instanceof Cache.a)) {
            this.f6059q = true;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        DataSpec dataSpec = this.f6053k;
        Objects.requireNonNull(dataSpec);
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        if (this.f6057o == 0) {
            return -1;
        }
        try {
            if (this.f6056n >= this.f6062t) {
                m2949t(dataSpec, true);
            }
            DataSource3 dataSource3 = this.f6054l;
            Objects.requireNonNull(dataSource3);
            int i3 = dataSource3.read(bArr, i, i2);
            if (i3 != -1) {
                if (m2948s()) {
                    this.f6061s += (long) i3;
                }
                long j2 = i3;
                this.f6056n += j2;
                long j3 = this.f6057o;
                if (j3 != -1) {
                    this.f6057o = j3 - j2;
                }
            } else {
                if (!this.f6055m) {
                    long j4 = this.f6057o;
                    if (j4 <= 0) {
                        if (j4 == -1) {
                        }
                    }
                    m2946q();
                    m2949t(dataSpec, false);
                    return read(bArr, i, i2);
                }
                String str = dataSpec.f6144h;
                int i4 = Util6.f6307a;
                m2950u(str);
            }
            return i3;
        } catch (IOException e) {
            if (this.f6055m) {
                int i5 = DataSourceException.f6129f;
                for (Throwable cause = e; cause != null; cause = cause.getCause()) {
                    if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f6130g == 0) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    String str2 = dataSpec.f6144h;
                    int i6 = Util6.f6307a;
                    m2950u(str2);
                    return -1;
                }
            }
            m2947r(e);
            throw e;
        } catch (Throwable th) {
            m2947r(th);
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2948s() {
        return this.f6054l == this.f6044b;
    }

    /* JADX INFO: renamed from: t */
    public final void m2949t(DataSpec dataSpec, boolean z) throws IOException {
        CacheSpan cacheSpanMo2935f;
        DataSpec dataSpecM3005a;
        DataSource3 dataSource3;
        String str = dataSpec.f6144h;
        int i = Util6.f6307a;
        if (this.f6060r) {
            cacheSpanMo2935f = null;
        } else if (this.f6049g) {
            try {
                cacheSpanMo2935f = this.f6043a.mo2935f(str, this.f6056n, this.f6057o);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            cacheSpanMo2935f = this.f6043a.mo2934e(str, this.f6056n, this.f6057o);
        }
        if (cacheSpanMo2935f == null) {
            dataSource3 = this.f6046d;
            DataSpec.b bVarM3001a = dataSpec.m3001a();
            bVarM3001a.f6152f = this.f6056n;
            bVarM3001a.f6153g = this.f6057o;
            dataSpecM3005a = bVarM3001a.m3005a();
        } else if (cacheSpanMo2935f.f6077i) {
            Uri uriFromFile = Uri.fromFile(cacheSpanMo2935f.f6078j);
            long j2 = cacheSpanMo2935f.f6075g;
            long j3 = this.f6056n - j2;
            long jMin = cacheSpanMo2935f.f6076h - j3;
            long j4 = this.f6057o;
            if (j4 != -1) {
                jMin = Math.min(jMin, j4);
            }
            DataSpec.b bVarM3001a2 = dataSpec.m3001a();
            bVarM3001a2.f6147a = uriFromFile;
            bVarM3001a2.f6148b = j2;
            bVarM3001a2.f6152f = j3;
            bVarM3001a2.f6153g = jMin;
            dataSpecM3005a = bVarM3001a2.m3005a();
            dataSource3 = this.f6044b;
        } else {
            long jMin2 = cacheSpanMo2935f.f6076h;
            if (jMin2 == -1) {
                jMin2 = this.f6057o;
            } else {
                long j5 = this.f6057o;
                if (j5 != -1) {
                    jMin2 = Math.min(jMin2, j5);
                }
            }
            DataSpec.b bVarM3001a3 = dataSpec.m3001a();
            bVarM3001a3.f6152f = this.f6056n;
            bVarM3001a3.f6153g = jMin2;
            dataSpecM3005a = bVarM3001a3.m3005a();
            dataSource3 = this.f6045c;
            if (dataSource3 == null) {
                dataSource3 = this.f6046d;
                this.f6043a.mo2938i(cacheSpanMo2935f);
                cacheSpanMo2935f = null;
            }
        }
        this.f6062t = (this.f6060r || dataSource3 != this.f6046d) ? Long.MAX_VALUE : this.f6056n + 102400;
        if (z) {
            C2096e.m4570f(this.f6054l == this.f6046d);
            if (dataSource3 == this.f6046d) {
                return;
            }
            try {
                m2946q();
            } catch (Throwable th) {
                if (!(!cacheSpanMo2935f.f6077i)) {
                    throw th;
                }
                this.f6043a.mo2938i(cacheSpanMo2935f);
                throw th;
            }
        }
        if (cacheSpanMo2935f != null && (!cacheSpanMo2935f.f6077i)) {
            this.f6058p = cacheSpanMo2935f;
        }
        this.f6054l = dataSource3;
        this.f6055m = dataSpecM3005a.f6143g == -1;
        long jMo2913h = dataSource3.mo2913h(dataSpecM3005a);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (this.f6055m && jMo2913h != -1) {
            this.f6057o = jMo2913h;
            ContentMetadataMutations.m2983a(contentMetadataMutations, this.f6056n + jMo2913h);
        }
        if (!m2948s()) {
            Uri uriMo2914n = dataSource3.mo2914n();
            this.f6052j = uriMo2914n;
            Uri uri = dataSpec.f6137a.equals(uriMo2914n) ^ true ? this.f6052j : null;
            if (uri == null) {
                contentMetadataMutations.f6106b.add("exo_redir");
                contentMetadataMutations.f6105a.remove("exo_redir");
            } else {
                String string = uri.toString();
                Map<String, Object> map = contentMetadataMutations.f6105a;
                Objects.requireNonNull(string);
                map.put("exo_redir", string);
                contentMetadataMutations.f6106b.remove("exo_redir");
            }
        }
        if (this.f6054l == this.f6045c) {
            this.f6043a.mo2932c(str, contentMetadataMutations);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m2950u(String str) throws IOException {
        this.f6057o = 0L;
        if (this.f6054l == this.f6045c) {
            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
            ContentMetadataMutations.m2983a(contentMetadataMutations, this.f6056n);
            this.f6043a.mo2932c(str, contentMetadataMutations);
        }
    }

    public CacheDataSource(Cache cache, DataSource3 dataSource3, int i) {
        this(cache, dataSource3, new FileDataSource(), new CacheDataSink(cache, 5242880L), i, null);
    }

    public CacheDataSource(Cache cache, DataSource3 dataSource3, DataSource3 dataSource4, DataSink dataSink, int i, a aVar) {
        this(cache, dataSource3, dataSource4, dataSink, i, aVar, null);
    }

    public CacheDataSource(Cache cache, DataSource3 dataSource3, DataSource3 dataSource4, DataSink dataSink, int i, a aVar, CacheKeyFactory cacheKeyFactory) {
        this(cache, dataSource3, dataSource4, dataSink, cacheKeyFactory, i, null, 0, aVar);
    }

    public CacheDataSource(Cache cache, DataSource3 dataSource3, DataSource3 dataSource4, DataSink dataSink, CacheKeyFactory cacheKeyFactory, int i, PriorityTaskManager priorityTaskManager, int i2, a aVar) {
        this.f6043a = cache;
        this.f6044b = dataSource4;
        if (cacheKeyFactory == null) {
            int i3 = CacheKeyFactory.f6073a;
            cacheKeyFactory = C1417a.f6028b;
        }
        this.f6047e = cacheKeyFactory;
        this.f6049g = (i & 1) != 0;
        this.f6050h = (i & 2) != 0;
        this.f6051i = (i & 4) != 0;
        if (dataSource3 != null) {
            dataSource3 = priorityTaskManager != null ? new PriorityDataSource(dataSource3, priorityTaskManager, i2) : dataSource3;
            this.f6046d = dataSource3;
            this.f6045c = dataSink != null ? new TeeDataSource(dataSource3, dataSink) : null;
        } else {
            this.f6046d = DummyDataSource.f6236a;
            this.f6045c = null;
        }
        this.f6048f = aVar;
    }
}
