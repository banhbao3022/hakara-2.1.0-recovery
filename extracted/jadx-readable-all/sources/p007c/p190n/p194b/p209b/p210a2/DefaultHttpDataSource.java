package p007c.p190n.p194b.p209b.p210a2;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p378c.p379a.Predicate2;

/* JADX INFO: renamed from: c.n.b.b.a2.u, reason: use source file name */
/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {

    /* JADX INFO: renamed from: e */
    public static final Pattern f6207e = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: f */
    public final boolean f6208f;

    /* JADX INFO: renamed from: g */
    public final int f6209g;

    /* JADX INFO: renamed from: h */
    public final int f6210h;

    /* JADX INFO: renamed from: i */
    public final String f6211i;

    /* JADX INFO: renamed from: j */
    public final HttpDataSource.g f6212j;

    /* JADX INFO: renamed from: k */
    public final HttpDataSource.g f6213k;

    /* JADX INFO: renamed from: l */
    public Predicate2<String> f6214l;

    /* JADX INFO: renamed from: m */
    public DataSpec f6215m;

    /* JADX INFO: renamed from: n */
    public HttpURLConnection f6216n;

    /* JADX INFO: renamed from: o */
    public InputStream f6217o;

    /* JADX INFO: renamed from: p */
    public byte[] f6218p;

    /* JADX INFO: renamed from: q */
    public boolean f6219q;

    /* JADX INFO: renamed from: r */
    public int f6220r;

    /* JADX INFO: renamed from: s */
    public long f6221s;

    /* JADX INFO: renamed from: t */
    public long f6222t;

    /* JADX INFO: renamed from: u */
    public long f6223u;

    /* JADX INFO: renamed from: v */
    public long f6224v;

    /* JADX INFO: renamed from: c.n.b.b.a2.u$a */
    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static final class a implements HttpDataSource.c {

        /* JADX INFO: renamed from: b */
        public String f6226b;

        /* JADX INFO: renamed from: e */
        public boolean f6229e;

        /* JADX INFO: renamed from: a */
        public final HttpDataSource.g f6225a = new HttpDataSource.g();

        /* JADX INFO: renamed from: c */
        public int f6227c = 8000;

        /* JADX INFO: renamed from: d */
        public int f6228d = 8000;

        @Override // p007c.p190n.p194b.p209b.p210a2.HttpDataSource.c, p007c.p190n.p194b.p209b.p210a2.DataSource3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultHttpDataSource mo2953a() {
            return new DefaultHttpDataSource(this.f6226b, this.f6227c, this.f6228d, this.f6229e, this.f6225a, null);
        }
    }

    @Deprecated
    public DefaultHttpDataSource() {
        this(null, 8000, 8000);
    }

    /* JADX INFO: renamed from: v */
    public static URL m3016v(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException(outline.m1599u("Unsupported protocol redirect: ", protocol));
    }

    /* JADX INFO: renamed from: y */
    public static void m3017y(HttpURLConnection httpURLConnection, long j2) {
        int i;
        if (httpURLConnection == null || (i = Util6.f6307a) < 19 || i > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j2 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j2 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                Objects.requireNonNull(superclass);
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    public void close() throws HttpDataSource.d {
        try {
            InputStream inputStream = this.f6217o;
            if (inputStream != null) {
                HttpURLConnection httpURLConnection = this.f6216n;
                long j2 = this.f6222t;
                if (j2 != -1) {
                    j2 -= this.f6224v;
                }
                m3017y(httpURLConnection, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    DataSpec dataSpec = this.f6215m;
                    int i = Util6.f6307a;
                    throw new HttpDataSource.d(e, dataSpec, 3);
                }
            }
            this.f6217o = null;
            m3018u();
            if (this.f6219q) {
                this.f6219q = false;
                m2923r();
            }
        } catch (Throwable th) {
            this.f6217o = null;
            m3018u();
            if (this.f6219q) {
                this.f6219q = false;
                m2923r();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: h */
    public long mo2913h(DataSpec dataSpec) throws HttpDataSource.d {
        byte[] bArrM3110S;
        long j2;
        long jMax;
        this.f6215m = dataSpec;
        this.f6224v = 0L;
        this.f6223u = 0L;
        m2924s(dataSpec);
        try {
            HttpURLConnection httpURLConnectionM3019w = m3019w(dataSpec);
            this.f6216n = httpURLConnectionM3019w;
            try {
                this.f6220r = httpURLConnectionM3019w.getResponseCode();
                String responseMessage = httpURLConnectionM3019w.getResponseMessage();
                int i = this.f6220r;
                if (i < 200 || i > 299) {
                    Map<String, List<String>> headerFields = httpURLConnectionM3019w.getHeaderFields();
                    InputStream errorStream = httpURLConnectionM3019w.getErrorStream();
                    try {
                        bArrM3110S = errorStream != null ? Util6.m3110S(errorStream) : Util6.f6312f;
                    } catch (IOException unused) {
                        bArrM3110S = Util6.f6312f;
                    }
                    m3018u();
                    HttpDataSource.f fVar = new HttpDataSource.f(this.f6220r, responseMessage, headerFields, dataSpec, bArrM3110S);
                    if (this.f6220r != 416) {
                        throw fVar;
                    }
                    fVar.initCause(new DataSourceException(0));
                    throw fVar;
                }
                String contentType = httpURLConnectionM3019w.getContentType();
                Predicate2<String> predicate2 = this.f6214l;
                if (predicate2 != null && !predicate2.apply(contentType)) {
                    m3018u();
                    throw new HttpDataSource.e(contentType, dataSpec);
                }
                if (this.f6220r == 200) {
                    j2 = dataSpec.f6142f;
                    if (j2 == 0) {
                        j2 = 0;
                    }
                } else {
                    j2 = 0;
                }
                this.f6221s = j2;
                boolean zEqualsIgnoreCase = DecompressionHelper.GZIP_ENCODING.equalsIgnoreCase(httpURLConnectionM3019w.getHeaderField("Content-Encoding"));
                if (zEqualsIgnoreCase) {
                    this.f6222t = dataSpec.f6143g;
                } else {
                    long j3 = dataSpec.f6143g;
                    if (j3 != -1) {
                        this.f6222t = j3;
                    } else {
                        String headerField = httpURLConnectionM3019w.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                        if (TextUtils.isEmpty(headerField)) {
                            jMax = -1;
                        } else {
                            try {
                                jMax = Long.parseLong(headerField);
                            } catch (NumberFormatException unused2) {
                                Log.e("DefaultHttpDataSource", "Unexpected Content-Length [" + headerField + "]");
                                jMax = -1;
                            }
                        }
                        String headerField2 = httpURLConnectionM3019w.getHeaderField("Content-Range");
                        if (!TextUtils.isEmpty(headerField2)) {
                            Matcher matcher = f6207e.matcher(headerField2);
                            if (matcher.find()) {
                                try {
                                    String strGroup = matcher.group(2);
                                    Objects.requireNonNull(strGroup);
                                    long j4 = Long.parseLong(strGroup);
                                    String strGroup2 = matcher.group(1);
                                    Objects.requireNonNull(strGroup2);
                                    long j5 = (j4 - Long.parseLong(strGroup2)) + 1;
                                    if (jMax < 0) {
                                        jMax = j5;
                                    } else if (jMax != j5) {
                                        Log.w("DefaultHttpDataSource", "Inconsistent headers [" + headerField + "] [" + headerField2 + "]");
                                        jMax = Math.max(jMax, j5);
                                    }
                                } catch (NumberFormatException unused3) {
                                    Log.e("DefaultHttpDataSource", "Unexpected Content-Range [" + headerField2 + "]");
                                }
                            }
                        }
                        this.f6222t = jMax != -1 ? jMax - this.f6221s : -1L;
                    }
                }
                try {
                    this.f6217o = httpURLConnectionM3019w.getInputStream();
                    if (zEqualsIgnoreCase) {
                        this.f6217o = new GZIPInputStream(this.f6217o);
                    }
                    this.f6219q = true;
                    m2925t(dataSpec);
                    return this.f6222t;
                } catch (IOException e) {
                    m3018u();
                    throw new HttpDataSource.d(e, dataSpec, 1);
                }
            } catch (IOException e2) {
                m3018u();
                throw new HttpDataSource.d("Unable to connect", e2, dataSpec, 1);
            }
        } catch (IOException e3) {
            String message = e3.getMessage();
            if (message == null || !Util6.m3111T(message).matches("cleartext http traffic.*not permitted.*")) {
                throw new HttpDataSource.d("Unable to connect", e3, dataSpec, 1);
            }
            throw new HttpDataSource.b(e3, dataSpec);
        }
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.BaseDataSource, p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: j */
    public Map<String, List<String>> mo2916j() {
        HttpURLConnection httpURLConnection = this.f6216n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // p007c.p190n.p194b.p209b.p210a2.DataSource3
    /* JADX INFO: renamed from: n */
    public Uri mo2914n() {
        HttpURLConnection httpURLConnection = this.f6216n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b A[Catch: IOException -> 0x0042, TryCatch #0 {IOException -> 0x0042, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0021, B:13:0x002b, B:16:0x0032, B:17:0x0037, B:18:0x0038), top: B:23:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032 A[Catch: IOException -> 0x0042, TryCatch #0 {IOException -> 0x0042, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0021, B:13:0x002b, B:16:0x0032, B:17:0x0037, B:18:0x0038), top: B:23:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038 A[Catch: IOException -> 0x0042, TRY_LEAVE, TryCatch #0 {IOException -> 0x0042, blocks: (B:2:0x0000, B:5:0x0007, B:7:0x0010, B:10:0x001b, B:11:0x0021, B:13:0x002b, B:16:0x0032, B:17:0x0037, B:18:0x0038), top: B:23:0x0000 }] */
    @Override // p007c.p190n.p194b.p209b.p210a2.DataReader
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.d {
        int i3;
        try {
            m3021z();
            if (i2 == 0) {
                return 0;
            }
            long j2 = this.f6222t;
            if (j2 != -1) {
                long j3 = j2 - this.f6224v;
                if (j3 != 0) {
                    i2 = (int) Math.min(i2, j3);
                    InputStream inputStream = this.f6217o;
                    int i4 = Util6.f6307a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.f6224v += (long) i3;
                        m2922q(i3);
                        return i3;
                    }
                    if (this.f6222t == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                InputStream inputStream2 = this.f6217o;
                int i5 = Util6.f6307a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.f6224v += (long) i3;
                    m2922q(i3);
                    return i3;
                }
                if (this.f6222t == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            DataSpec dataSpec = this.f6215m;
            int i6 = Util6.f6307a;
            throw new HttpDataSource.d(e, dataSpec, 2);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m3018u() {
        HttpURLConnection httpURLConnection = this.f6216n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                p007c.p190n.p194b.p209b.p212b2.Log.m3154b("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f6216n = null;
        }
    }

    /* JADX INFO: renamed from: w */
    public final HttpURLConnection m3019w(DataSpec dataSpec) throws IOException {
        DataSpec dataSpec2 = dataSpec;
        URL url = new URL(dataSpec2.f6137a.toString());
        int i = dataSpec2.f6139c;
        byte[] bArr = dataSpec2.f6140d;
        long j2 = dataSpec2.f6142f;
        long j3 = dataSpec2.f6143g;
        boolean zM3002c = dataSpec2.m3002c(1);
        if (!this.f6208f) {
            return m3020x(url, i, bArr, j2, j3, zM3002c, true, dataSpec2.f6141e);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 > 20) {
                throw new NoRouteToHostException(outline.m1590l("Too many redirects: ", i3));
            }
            long j4 = j3;
            long j5 = j2;
            HttpURLConnection httpURLConnectionM3020x = m3020x(url, i, bArr, j2, j3, zM3002c, false, dataSpec2.f6141e);
            int responseCode = httpURLConnectionM3020x.getResponseCode();
            String headerField = httpURLConnectionM3020x.getHeaderField("Location");
            if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionM3020x.disconnect();
                url = m3016v(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionM3020x;
                }
                httpURLConnectionM3020x.disconnect();
                url = m3016v(url, headerField);
                i = 1;
                bArr = null;
            }
            dataSpec2 = dataSpec;
            i2 = i3;
            j3 = j4;
            j2 = j5;
        }
    }

    /* JADX INFO: renamed from: x */
    public final HttpURLConnection m3020x(URL url, int i, byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f6209g);
        httpURLConnection.setReadTimeout(this.f6210h);
        HashMap map2 = new HashMap();
        HttpDataSource.g gVar = this.f6212j;
        if (gVar != null) {
            map2.putAll(gVar.m3028a());
        }
        map2.putAll(this.f6213k.m3028a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j2 != 0 || j3 != -1) {
            String strM1595q = outline.m1595q("bytes=", j2, "-");
            if (j3 != -1) {
                StringBuilder sbM1556G = outline.m1556G(strM1595q);
                sbM1556G.append((j2 + j3) - 1);
                strM1595q = sbM1556G.toString();
            }
            httpURLConnection.setRequestProperty("Range", strM1595q);
        }
        String str = this.f6211i;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? DecompressionHelper.GZIP_ENCODING : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(DataSpec.m3000b(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: z */
    public final void m3021z() throws IOException {
        if (this.f6223u == this.f6221s) {
            return;
        }
        if (this.f6218p == null) {
            this.f6218p = new byte[4096];
        }
        while (true) {
            long j2 = this.f6223u;
            long j3 = this.f6221s;
            if (j2 == j3) {
                return;
            }
            int iMin = (int) Math.min(j3 - j2, this.f6218p.length);
            InputStream inputStream = this.f6217o;
            int i = Util6.f6307a;
            int i2 = inputStream.read(this.f6218p, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i2 == -1) {
                throw new EOFException();
            }
            this.f6223u += (long) i2;
            m2922q(i2);
        }
    }

    @Deprecated
    public DefaultHttpDataSource(String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public DefaultHttpDataSource(String str, int i, int i2, boolean z, HttpDataSource.g gVar) {
        this(str, i, i2, z, gVar, null);
    }

    public DefaultHttpDataSource(String str, int i, int i2, boolean z, HttpDataSource.g gVar, Predicate2<String> predicate2) {
        super(true);
        this.f6211i = str;
        this.f6209g = i;
        this.f6210h = i2;
        this.f6208f = z;
        this.f6212j = gVar;
        this.f6214l = predicate2;
        this.f6213k = new HttpDataSource.g();
    }
}
