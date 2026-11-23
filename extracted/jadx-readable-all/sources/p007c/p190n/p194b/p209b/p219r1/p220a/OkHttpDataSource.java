package p007c.p190n.p194b.p209b.p219r1.p220a;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.ExoPlayerLibraryInfo;
import p007c.p190n.p194b.p209b.p210a2.BaseDataSource;
import p007c.p190n.p194b.p209b.p210a2.DataSourceException;
import p007c.p190n.p194b.p209b.p210a2.DataSpec;
import p007c.p190n.p194b.p209b.p210a2.HttpDataSource;
import p007c.p190n.p194b.p209b.p210a2.TransferListener;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p378c.p379a.Predicate2;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.CacheControl;
import p509g1.Call;
import p509g1.HttpUrl;
import p509g1.MediaType2;
import p509g1.Request3;
import p509g1.RequestBody;
import p509g1.Response3;
import p509g1.ResponseBody;

/* JADX INFO: renamed from: c.n.b.b.r1.a.a, reason: use source file name */
/* JADX INFO: compiled from: OkHttpDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public class OkHttpDataSource extends BaseDataSource implements HttpDataSource {

    /* JADX INFO: renamed from: e */
    public static final byte[] f7445e;

    /* JADX INFO: renamed from: f */
    public final Call.a f7446f;

    /* JADX INFO: renamed from: g */
    public final HttpDataSource.g f7447g;

    /* JADX INFO: renamed from: h */
    public final String f7448h;

    /* JADX INFO: renamed from: i */
    public final CacheControl f7449i;

    /* JADX INFO: renamed from: j */
    public final HttpDataSource.g f7450j;

    /* JADX INFO: renamed from: k */
    public Predicate2<String> f7451k;

    /* JADX INFO: renamed from: l */
    public DataSpec f7452l;

    /* JADX INFO: renamed from: m */
    public Response3 f7453m;

    /* JADX INFO: renamed from: n */
    public InputStream f7454n;

    /* JADX INFO: renamed from: o */
    public boolean f7455o;

    /* JADX INFO: renamed from: p */
    public long f7456p;

    /* JADX INFO: renamed from: q */
    public long f7457q;

    /* JADX INFO: renamed from: r */
    public long f7458r;

    /* JADX INFO: renamed from: s */
    public long f7459s;

    /* JADX INFO: renamed from: c.n.b.b.r1.a.a$a */
    /* JADX INFO: compiled from: OkHttpDataSource.java */
    public static final class a implements HttpDataSource.c {

        /* JADX INFO: renamed from: a */
        public final HttpDataSource.g f7460a = new HttpDataSource.g();

        /* JADX INFO: renamed from: b */
        public final Call.a f7461b;

        /* JADX INFO: renamed from: c */
        public String f7462c;

        /* JADX INFO: renamed from: d */
        public TransferListener f7463d;

        public a(Call.a aVar) {
            this.f7461b = aVar;
        }

        @Override // p007c.p190n.p194b.p209b.p210a2.HttpDataSource.c, p007c.p190n.p194b.p209b.p210a2.DataSource3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public OkHttpDataSource mo2953a() {
            OkHttpDataSource okHttpDataSource = new OkHttpDataSource(this.f7461b, this.f7462c, null, this.f7460a, null);
            TransferListener transferListener = this.f7463d;
            if (transferListener != null) {
                okHttpDataSource.mo2915c(transferListener);
            }
            return okHttpDataSource;
        }
    }

    static {
        ExoPlayerLibraryInfo.m3455a("goog.exo.okhttp");
        f7445e = new byte[4096];
    }

    @Deprecated
    public OkHttpDataSource(Call.a aVar) {
        this(aVar, null);
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws HttpDataSource.d {
        if (this.f7455o) {
            this.f7455o = false;
            m2923r();
            m3704u();
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws HttpDataSource.d {
        HttpUrl httpUrlM13681c;
        byte[] bArrM3110S;
        this.f7452l = dataSpec;
        long j2 = 0;
        this.f7459s = 0L;
        this.f7458r = 0L;
        m2924s(dataSpec);
        long j3 = dataSpec.f6142f;
        long j4 = dataSpec.f6143g;
        String string = dataSpec.f6137a.toString();
        HttpUrl.b bVar = HttpUrl.f30642b;
        Objects.requireNonNull(bVar);
        Intrinsics2.m13090f(string, "$this$toHttpUrlOrNull");
        RequestBody requestBodyM13325c = null;
        try {
            httpUrlM13681c = bVar.m13681c(string);
        } catch (IllegalArgumentException unused) {
            httpUrlM13681c = null;
        }
        if (httpUrlM13681c == null) {
            throw new HttpDataSource.d("Malformed URL", dataSpec, 1);
        }
        Request3.a aVar = new Request3.a();
        aVar.m13321i(httpUrlM13681c);
        CacheControl cacheControl = this.f7449i;
        if (cacheControl != null) {
            aVar.m13315c(cacheControl);
        }
        HashMap map = new HashMap();
        HttpDataSource.g gVar = this.f7450j;
        if (gVar != null) {
            map.putAll(gVar.m3028a());
        }
        map.putAll(this.f7447g.m3028a());
        map.putAll(dataSpec.f6141e);
        for (Map.Entry entry : map.entrySet()) {
            aVar.m13316d((String) entry.getKey(), (String) entry.getValue());
        }
        if (j3 != 0 || j4 != -1) {
            String strM1595q = outline.m1595q("bytes=", j3, "-");
            if (j4 != -1) {
                StringBuilder sbM1556G = outline.m1556G(strM1595q);
                sbM1556G.append((j3 + j4) - 1);
                strM1595q = sbM1556G.toString();
            }
            aVar.m13313a("Range", strM1595q);
        }
        String str = this.f7448h;
        if (str != null) {
            aVar.m13313a("User-Agent", str);
        }
        if (!dataSpec.m3002c(1)) {
            Intrinsics2.m13090f("Accept-Encoding", "name");
            Intrinsics2.m13090f("identity", "value");
            aVar.f29958c.m13655a("Accept-Encoding", "identity");
        }
        byte[] bArr = dataSpec.f6140d;
        if (bArr != null) {
            requestBodyM13325c = RequestBody.m13325c(null, bArr);
        } else if (dataSpec.f6139c == 2) {
            requestBodyM13325c = RequestBody.m13325c(null, Util6.f6312f);
        }
        aVar.m13318f(DataSpec.m3000b(dataSpec.f6139c), requestBodyM13325c);
        try {
            Response3 response3Mo13334h = this.f7446f.mo13300a(aVar.m13314b()).mo13334h();
            this.f7453m = response3Mo13334h;
            ResponseBody responseBody = response3Mo13334h.f29996m;
            Objects.requireNonNull(responseBody);
            this.f7454n = responseBody.byteStream();
            int i = response3Mo13334h.f29993j;
            if (!response3Mo13334h.m13338f()) {
                try {
                    InputStream inputStream = this.f7454n;
                    Objects.requireNonNull(inputStream);
                    bArrM3110S = Util6.m3110S(inputStream);
                } catch (IOException unused2) {
                    bArrM3110S = Util6.f6312f;
                }
                Map<String, List<String>> mapM13652j = response3Mo13334h.f29995l.m13652j();
                m3704u();
                HttpDataSource.f fVar = new HttpDataSource.f(i, response3Mo13334h.f29992i, mapM13652j, dataSpec, bArrM3110S);
                if (i != 416) {
                    throw fVar;
                }
                fVar.initCause(new DataSourceException(0));
                throw fVar;
            }
            MediaType2 mediaType2ContentType = responseBody.contentType();
            String str2 = mediaType2ContentType != null ? mediaType2ContentType.f30665d : "";
            Predicate2<String> predicate2 = this.f7451k;
            if (predicate2 != null && !predicate2.apply(str2)) {
                m3704u();
                throw new HttpDataSource.e(str2, dataSpec);
            }
            if (i == 200) {
                long j5 = dataSpec.f6142f;
                if (j5 != 0) {
                    j2 = j5;
                }
            }
            this.f7456p = j2;
            long j6 = dataSpec.f6143g;
            if (j6 != -1) {
                this.f7457q = j6;
            } else {
                long jContentLength = responseBody.contentLength();
                this.f7457q = jContentLength != -1 ? jContentLength - this.f7456p : -1L;
            }
            this.f7455o = true;
            m2925t(dataSpec);
            return this.f7457q;
        } catch (IOException e) {
            String message = e.getMessage();
            if (message == null || !Util6.m3111T(message).matches("cleartext communication.*not permitted.*")) {
                throw new HttpDataSource.d("Unable to connect", e, dataSpec, 1);
            }
            throw new HttpDataSource.b(e, dataSpec);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.BaseDataSource, p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        Response3 response3 = this.f7453m;
        return response3 == null ? Collections.emptyMap() : response3.f29995l.m13652j();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        Response3 response3 = this.f7453m;
        if (response3 == null) {
            return null;
        }
        return Uri.parse(response3.f29990g.f29951b.f30652l);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b A[Catch: IOException -> 0x0042, TryCatch #0 {IOException -> 0x0042, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0021, B:13:0x002b, B:16:0x0032, B:17:0x0037, B:18:0x0038), top: B:23:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[Catch: IOException -> 0x0042, TryCatch #0 {IOException -> 0x0042, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0021, B:13:0x002b, B:16:0x0032, B:17:0x0037, B:18:0x0038), top: B:23:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[Catch: IOException -> 0x0042, TRY_LEAVE, TryCatch #0 {IOException -> 0x0042, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0021, B:13:0x002b, B:16:0x0032, B:17:0x0037, B:18:0x0038), top: B:23:0x0000 }] */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.d {
        int i3;
        try {
            m3705v();
            if (i2 == 0) {
                return 0;
            }
            long j2 = this.f7457q;
            if (j2 != -1) {
                long j3 = j2 - this.f7459s;
                if (j3 != 0) {
                    i2 = (int) Math.min(i2, j3);
                    InputStream inputStream = this.f7454n;
                    int i4 = Util6.f6307a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.f7459s += (long) i3;
                        m2922q(i3);
                        return i3;
                    }
                    if (this.f7457q == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                InputStream inputStream2 = this.f7454n;
                int i5 = Util6.f6307a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.f7459s += (long) i3;
                    m2922q(i3);
                    return i3;
                }
                if (this.f7457q == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            DataSpec dataSpec = this.f7452l;
            Objects.requireNonNull(dataSpec);
            throw new HttpDataSource.d(e, dataSpec, 2);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3704u() {
        Response3 response3 = this.f7453m;
        if (response3 != null) {
            ResponseBody responseBody = response3.f29996m;
            Objects.requireNonNull(responseBody);
            responseBody.close();
            this.f7453m = null;
        }
        this.f7454n = null;
    }

    /* JADX INFO: renamed from: v */
    public final void m3705v() throws IOException {
        if (this.f7458r == this.f7456p) {
            return;
        }
        while (true) {
            long j2 = this.f7458r;
            long j3 = this.f7456p;
            if (j2 == j3) {
                return;
            }
            long j4 = j3 - j2;
            byte[] bArr = f7445e;
            int iMin = (int) Math.min(j4, bArr.length);
            InputStream inputStream = this.f7454n;
            int i = Util6.f6307a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i2 == -1) {
                throw new EOFException();
            }
            this.f7458r += (long) i2;
            m2922q(i2);
        }
    }

    @Deprecated
    public OkHttpDataSource(Call.a aVar, String str) {
        this(aVar, str, null, null);
    }

    @Deprecated
    public OkHttpDataSource(Call.a aVar, String str, CacheControl cacheControl, HttpDataSource.g gVar) {
        this(aVar, str, cacheControl, gVar, null);
    }

    public OkHttpDataSource(Call.a aVar, String str, CacheControl cacheControl, HttpDataSource.g gVar, Predicate2<String> predicate2) {
        super(true);
        Objects.requireNonNull(aVar);
        this.f7446f = aVar;
        this.f7448h = str;
        this.f7449i = cacheControl;
        this.f7450j = gVar;
        this.f7451k = predicate2;
        this.f7447g = new HttpDataSource.g();
    }
}
