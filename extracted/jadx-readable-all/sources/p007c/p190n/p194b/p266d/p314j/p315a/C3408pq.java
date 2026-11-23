package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.pq */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3408pq implements pn2 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f18053a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: b */
    public static final AtomicReference<byte[]> f18054b = new AtomicReference<>();

    /* JADX INFO: renamed from: d */
    public final int f18056d;

    /* JADX INFO: renamed from: e */
    public final int f18057e;

    /* JADX INFO: renamed from: f */
    public final String f18058f;

    /* JADX INFO: renamed from: g */
    public final on2 f18059g;

    /* JADX INFO: renamed from: h */
    public final vn2<? super C3408pq> f18060h;

    /* JADX INFO: renamed from: i */
    public jn2 f18061i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f18062j;

    /* JADX INFO: renamed from: k */
    public InputStream f18063k;

    /* JADX INFO: renamed from: l */
    public boolean f18064l;

    /* JADX INFO: renamed from: m */
    public long f18065m;

    /* JADX INFO: renamed from: n */
    public long f18066n;

    /* JADX INFO: renamed from: o */
    public long f18067o;

    /* JADX INFO: renamed from: p */
    public long f18068p;

    /* JADX INFO: renamed from: q */
    public int f18069q;

    /* JADX INFO: renamed from: c */
    public final SSLSocketFactory f18055c = new C3371oq(this);

    /* JADX INFO: renamed from: r */
    public final Set<Socket> f18070r = new HashSet();

    public C3408pq(String str, vn2<? super C3408pq> vn2Var, int i, int i2, int i3) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f18058f = str;
        this.f18060h = vn2Var;
        this.f18059g = new on2();
        this.f18056d = i;
        this.f18057e = i2;
        this.f18069q = i3;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x010b  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: a */
    public final long mo6843a(jn2 jn2Var) throws mn2 {
        long j2;
        long jMax;
        this.f18061i = jn2Var;
        this.f18068p = 0L;
        this.f18067o = 0L;
        try {
            URL url = new URL(jn2Var.f15667a.toString());
            long j3 = jn2Var.f15669c;
            long j4 = jn2Var.f15670d;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Too many redirects: ");
                    sb.append(i2);
                    throw new NoRouteToHostException(sb.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f18055c);
                }
                httpURLConnection.setConnectTimeout(this.f18056d);
                httpURLConnection.setReadTimeout(this.f18057e);
                for (Map.Entry<String, String> entry : this.f18059g.m8045a().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (j3 == 0 && j4 == -1) {
                    j3 = j3;
                } else {
                    StringBuilder sb2 = new StringBuilder(27);
                    sb2.append("bytes=");
                    sb2.append(j3);
                    sb2.append("-");
                    String string = sb2.toString();
                    if (j4 != -1) {
                        String strValueOf = String.valueOf(string);
                        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 20);
                        sb3.append(strValueOf);
                        sb3.append((j3 + j4) - 1);
                        string = sb3.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", string);
                }
                httpURLConnection.setRequestProperty("User-Agent", this.f18058f);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    this.f18062j = httpURLConnection;
                    try {
                        int responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 < 200 || responseCode2 > 299) {
                            Map<String, List<String>> headerFields = this.f18062j.getHeaderFields();
                            m8147f();
                            nn2 nn2Var = new nn2(responseCode2, headerFields, jn2Var);
                            if (responseCode2 != 416) {
                                throw nn2Var;
                            }
                            nn2Var.initCause(new in2(0));
                            throw nn2Var;
                        }
                        if (responseCode2 == 200) {
                            j2 = jn2Var.f15669c;
                            if (j2 == 0) {
                                j2 = 0;
                            }
                        } else {
                            j2 = 0;
                        }
                        this.f18065m = j2;
                        long j5 = jn2Var.f15670d;
                        if (j5 != -1) {
                            this.f18066n = j5;
                        } else {
                            HttpURLConnection httpURLConnection2 = this.f18062j;
                            String headerField = httpURLConnection2.getHeaderField(HttpHeaders.CONTENT_LENGTH);
                            if (TextUtils.isEmpty(headerField)) {
                                jMax = -1;
                            } else {
                                try {
                                    jMax = Long.parseLong(headerField);
                                } catch (NumberFormatException unused) {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField).length() + 28);
                                    sb4.append("Unexpected Content-Length [");
                                    sb4.append(headerField);
                                    sb4.append("]");
                                    C2622l.m5408n3(sb4.toString());
                                    jMax = -1;
                                }
                            }
                            String headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField2)) {
                                Matcher matcher = f18053a.matcher(headerField2);
                                if (matcher.find()) {
                                    try {
                                        long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                        if (jMax < 0) {
                                            jMax = j6;
                                        } else if (jMax != j6) {
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
                                            sb5.append("Inconsistent headers [");
                                            sb5.append(headerField);
                                            sb5.append("] [");
                                            sb5.append(headerField2);
                                            sb5.append("]");
                                            C2622l.m5226A3(sb5.toString());
                                            jMax = Math.max(jMax, j6);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                        sb6.append("Unexpected Content-Range [");
                                        sb6.append(headerField2);
                                        sb6.append("]");
                                        C2622l.m5408n3(sb6.toString());
                                    }
                                }
                            }
                            this.f18066n = jMax != -1 ? jMax - this.f18065m : -1L;
                        }
                        try {
                            this.f18063k = this.f18062j.getInputStream();
                            this.f18064l = true;
                            vn2<? super C3408pq> vn2Var = this.f18060h;
                            if (vn2Var != null) {
                                ((C3002er) vn2Var).mo6225e(this, jn2Var);
                            }
                            return this.f18066n;
                        } catch (IOException e) {
                            m8147f();
                            throw new mn2(e, jn2Var, 1);
                        }
                    } catch (IOException e2) {
                        m8147f();
                        String strValueOf2 = String.valueOf(jn2Var.f15667a.toString());
                        throw new mn2(strValueOf2.length() != 0 ? "Unable to connect to ".concat(strValueOf2) : new String("Unable to connect to "), e2, jn2Var, 1);
                    }
                }
                String headerField3 = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField3 == null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url2 = new URL(url, headerField3);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    String strValueOf3 = String.valueOf(protocol);
                    throw new ProtocolException(strValueOf3.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf3) : new String("Unsupported protocol redirect: "));
                }
                url = url2;
                i = i2;
                j3 = j3;
            }
        } catch (IOException e3) {
            String strValueOf4 = String.valueOf(jn2Var.f15667a.toString());
            throw new mn2(strValueOf4.length() != 0 ? "Unable to connect to ".concat(strValueOf4) : new String("Unable to connect to "), e3, jn2Var, 1);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: b */
    public final Uri mo6844b() {
        HttpURLConnection httpURLConnection = this.f18062j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pn2
    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> mo7592c() {
        HttpURLConnection httpURLConnection = this.f18062j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007d A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084 A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x008a A[Catch: IOException -> 0x009a, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: IOException -> 0x009a, TRY_LEAVE, TryCatch #0 {IOException -> 0x009a, blocks: (B:2:0x0000, B:23:0x005c, B:25:0x0064, B:28:0x006f, B:29:0x0075, B:31:0x007d, B:34:0x0084, B:35:0x0089, B:36:0x008a, B:38:0x0094, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0048, B:17:0x004d, B:18:0x004e, B:19:0x0053, B:20:0x0054), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: d */
    public final int mo6845d(byte[] bArr, int i, int i2) throws mn2 {
        int i3;
        vn2<? super C3408pq> vn2Var;
        try {
            if (this.f18067o != this.f18065m) {
                byte[] andSet = f18054b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j2 = this.f18067o;
                    long j3 = this.f18065m;
                    if (j2 == j3) {
                        f18054b.set(andSet);
                        break;
                    }
                    int i4 = this.f18063k.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.f18067o += (long) i4;
                    vn2<? super C3408pq> vn2Var2 = this.f18060h;
                    if (vn2Var2 != null) {
                        ((C3002er) vn2Var2).m6667j(i4);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j4 = this.f18066n;
            if (j4 != -1) {
                long j5 = j4 - this.f18068p;
                if (j5 != 0) {
                    i2 = (int) Math.min(i2, j5);
                    i3 = this.f18063k.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.f18068p += (long) i3;
                        vn2Var = this.f18060h;
                        if (vn2Var != null) {
                            return i3;
                        }
                        ((C3002er) vn2Var).m6667j(i3);
                        return i3;
                    }
                    if (this.f18066n == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.f18063k.read(bArr, i, i2);
                if (i3 == -1) {
                    this.f18068p += (long) i3;
                    vn2Var = this.f18060h;
                    if (vn2Var != null) {
                        return i3;
                    }
                    ((C3002er) vn2Var).m6667j(i3);
                    return i3;
                }
                if (this.f18066n == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new mn2(e, this.f18061i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e A[Catch: Exception -> 0x0067, all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:28:0x0067, B:31:0x006e, B:32:0x0076, B:15:0x001f, B:17:0x0027, B:23:0x0036, B:25:0x0046, B:27:0x004e, B:8:0x0011), top: B:45:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: e */
    public final void mo6846e() throws mn2 {
        String name;
        try {
            if (this.f18063k != null) {
                HttpURLConnection httpURLConnection = this.f18062j;
                long j2 = this.f18066n;
                if (j2 != -1) {
                    j2 -= this.f18068p;
                }
                int i = jo2.f15673a;
                if (i == 19 || i == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j2 == -1) {
                            if (inputStream.read() != -1) {
                                name = inputStream.getClass().getName();
                                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream, new Object[0]);
                                }
                            }
                            this.f18063k = null;
                            m8147f();
                            if (this.f18064l) {
                                this.f18064l = false;
                            }
                            this.f18070r.clear();
                            throw th;
                        }
                        if (j2 > 2048) {
                            name = inputStream.getClass().getName();
                            if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream")) {
                                Method declaredMethod2 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod2.setAccessible(true);
                                declaredMethod2.invoke(inputStream, new Object[0]);
                            } else {
                                Method declaredMethod3 = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                declaredMethod3.setAccessible(true);
                                declaredMethod3.invoke(inputStream, new Object[0]);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.f18063k.close();
                } catch (IOException e) {
                    throw new mn2(e, this.f18061i, 3);
                }
            }
            this.f18063k = null;
            m8147f();
            if (this.f18064l) {
                this.f18064l = false;
            }
            this.f18070r.clear();
        } catch (Throwable th) {
            this.f18063k = null;
            m8147f();
            if (this.f18064l) {
                this.f18064l = false;
            }
            this.f18070r.clear();
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8147f() {
        HttpURLConnection httpURLConnection = this.f18062j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                C2622l.m5438t3("Unexpected error while disconnecting", e);
            }
            this.f18062j = null;
        }
    }
}
