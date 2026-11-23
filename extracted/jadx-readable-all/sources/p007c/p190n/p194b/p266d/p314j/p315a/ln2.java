package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ln2 implements pn2 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f16414a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: b */
    public static final AtomicReference<byte[]> f16415b = new AtomicReference<>();

    /* JADX INFO: renamed from: c */
    public final int f16416c;

    /* JADX INFO: renamed from: d */
    public final int f16417d;

    /* JADX INFO: renamed from: e */
    public final String f16418e;

    /* JADX INFO: renamed from: f */
    public final on2 f16419f;

    /* JADX INFO: renamed from: g */
    public final vn2<? super ln2> f16420g;

    /* JADX INFO: renamed from: h */
    public jn2 f16421h;

    /* JADX INFO: renamed from: i */
    public HttpURLConnection f16422i;

    /* JADX INFO: renamed from: j */
    public InputStream f16423j;

    /* JADX INFO: renamed from: k */
    public boolean f16424k;

    /* JADX INFO: renamed from: l */
    public long f16425l;

    /* JADX INFO: renamed from: m */
    public long f16426m;

    /* JADX INFO: renamed from: n */
    public long f16427n;

    /* JADX INFO: renamed from: o */
    public long f16428o;

    public ln2(String str, fo2<String> fo2Var, vn2<? super ln2> vn2Var, int i, int i2, boolean z, on2 on2Var) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f16418e = str;
        this.f16420g = vn2Var;
        this.f16419f = new on2();
        this.f16416c = i;
        this.f16417d = i2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: a */
    public final long mo6843a(jn2 jn2Var) throws mn2 {
        long j2;
        long jMax;
        this.f16421h = jn2Var;
        long j3 = 0;
        this.f16428o = 0L;
        this.f16427n = 0L;
        try {
            URL url = new URL(jn2Var.f15667a.toString());
            long j4 = jn2Var.f15669c;
            long j5 = jn2Var.f15670d;
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
                httpURLConnection.setConnectTimeout(this.f16416c);
                httpURLConnection.setReadTimeout(this.f16417d);
                for (Map.Entry<String, String> entry : this.f16419f.m8045a().entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                if (j4 != j3 || j5 != -1) {
                    StringBuilder sb2 = new StringBuilder(27);
                    sb2.append("bytes=");
                    sb2.append(j4);
                    sb2.append("-");
                    String string = sb2.toString();
                    if (j5 != -1) {
                        String strValueOf = String.valueOf(string);
                        StringBuilder sb3 = new StringBuilder(strValueOf.length() + 20);
                        sb3.append(strValueOf);
                        sb3.append((j4 + j5) - 1);
                        string = sb3.toString();
                    }
                    httpURLConnection.setRequestProperty("Range", string);
                }
                httpURLConnection.setRequestProperty("User-Agent", this.f16418e);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    this.f16422i = httpURLConnection;
                    try {
                        int responseCode2 = httpURLConnection.getResponseCode();
                        if (responseCode2 < 200 || responseCode2 > 299) {
                            Map<String, List<String>> headerFields = this.f16422i.getHeaderFields();
                            m7593f();
                            nn2 nn2Var = new nn2(responseCode2, headerFields, jn2Var);
                            if (responseCode2 != 416) {
                                throw nn2Var;
                            }
                            nn2Var.initCause(new in2(0));
                            throw nn2Var;
                        }
                        this.f16422i.getContentType();
                        if (responseCode2 == 200) {
                            j2 = jn2Var.f15669c;
                            if (j2 == 0) {
                                j2 = 0;
                            }
                        } else {
                            j2 = 0;
                        }
                        this.f16425l = j2;
                        long j6 = jn2Var.f15670d;
                        if (j6 != -1) {
                            this.f16426m = j6;
                        } else {
                            HttpURLConnection httpURLConnection2 = this.f16422i;
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
                                    Log.e("DefaultHttpDataSource", sb4.toString());
                                    jMax = -1;
                                }
                            }
                            String headerField2 = httpURLConnection2.getHeaderField("Content-Range");
                            if (!TextUtils.isEmpty(headerField2)) {
                                Matcher matcher = f16414a.matcher(headerField2);
                                if (matcher.find()) {
                                    try {
                                        long j7 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                        if (jMax < 0) {
                                            jMax = j7;
                                        } else if (jMax != j7) {
                                            StringBuilder sb5 = new StringBuilder(String.valueOf(headerField).length() + 26 + String.valueOf(headerField2).length());
                                            sb5.append("Inconsistent headers [");
                                            sb5.append(headerField);
                                            sb5.append("] [");
                                            sb5.append(headerField2);
                                            sb5.append("]");
                                            Log.w("DefaultHttpDataSource", sb5.toString());
                                            jMax = Math.max(jMax, j7);
                                        }
                                    } catch (NumberFormatException unused2) {
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(headerField2).length() + 27);
                                        sb6.append("Unexpected Content-Range [");
                                        sb6.append(headerField2);
                                        sb6.append("]");
                                        Log.e("DefaultHttpDataSource", sb6.toString());
                                    }
                                }
                            }
                            this.f16426m = jMax != -1 ? jMax - this.f16425l : -1L;
                        }
                        try {
                            this.f16423j = this.f16422i.getInputStream();
                            this.f16424k = true;
                            vn2<? super ln2> vn2Var = this.f16420g;
                            if (vn2Var != null) {
                                vn2Var.mo6225e(this, jn2Var);
                            }
                            return this.f16426m;
                        } catch (IOException e) {
                            m7593f();
                            throw new mn2(e, jn2Var, 1);
                        }
                    } catch (IOException e2) {
                        m7593f();
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
                j3 = 0;
            }
        } catch (IOException e3) {
            String strValueOf4 = String.valueOf(jn2Var.f15667a.toString());
            throw new mn2(strValueOf4.length() != 0 ? "Unable to connect to ".concat(strValueOf4) : new String("Unable to connect to "), e3, jn2Var, 1);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: b */
    public final Uri mo6844b() {
        HttpURLConnection httpURLConnection = this.f16422i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pn2
    /* JADX INFO: renamed from: c */
    public final Map<String, List<String>> mo7592c() {
        HttpURLConnection httpURLConnection = this.f16422i;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: IOException -> 0x0096, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0092 A[Catch: IOException -> 0x0096, TRY_LEAVE, TryCatch #0 {IOException -> 0x0096, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:38:0x0092, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:15:0x0042, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:43:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: d */
    public final int mo6845d(byte[] bArr, int i, int i2) throws mn2 {
        int i3;
        vn2<? super ln2> vn2Var;
        try {
            if (this.f16427n != this.f16425l) {
                byte[] andSet = f16415b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[4096];
                }
                while (true) {
                    long j2 = this.f16427n;
                    long j3 = this.f16425l;
                    if (j2 == j3) {
                        f16415b.set(andSet);
                        break;
                    }
                    int i4 = this.f16423j.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.f16427n += (long) i4;
                    vn2<? super ln2> vn2Var2 = this.f16420g;
                    if (vn2Var2 != null) {
                        vn2Var2.mo6226h(this, i4);
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j4 = this.f16426m;
            if (j4 != -1) {
                long j5 = j4 - this.f16428o;
                if (j5 != 0) {
                    i2 = (int) Math.min(i2, j5);
                    i3 = this.f16423j.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.f16428o += (long) i3;
                        vn2Var = this.f16420g;
                        if (vn2Var != null) {
                            return i3;
                        }
                        vn2Var.mo6226h(this, i3);
                        return i3;
                    }
                    if (this.f16426m == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.f16423j.read(bArr, i, i2);
                if (i3 == -1) {
                    this.f16428o += (long) i3;
                    vn2Var = this.f16420g;
                    if (vn2Var != null) {
                        return i3;
                    }
                    vn2Var.mo6226h(this, i3);
                    return i3;
                }
                if (this.f16426m == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new mn2(e, this.f16421h, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004e A[Catch: Exception -> 0x0067, all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0002, B:5:0x0006, B:9:0x0014, B:28:0x0067, B:31:0x006e, B:32:0x0076, B:15:0x001f, B:17:0x0027, B:23:0x0036, B:25:0x0046, B:27:0x004e, B:8:0x0011), top: B:43:0x0002, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hn2
    /* JADX INFO: renamed from: e */
    public final void mo6846e() throws mn2 {
        String name;
        try {
            if (this.f16423j != null) {
                HttpURLConnection httpURLConnection = this.f16422i;
                long j2 = this.f16426m;
                if (j2 != -1) {
                    j2 -= this.f16428o;
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
                            this.f16423j = null;
                            m7593f();
                            if (this.f16424k) {
                                this.f16424k = false;
                            }
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
                    this.f16423j.close();
                } catch (IOException e) {
                    throw new mn2(e, this.f16421h, 3);
                }
            }
            this.f16423j = null;
            m7593f();
            if (this.f16424k) {
                this.f16424k = false;
            }
        } catch (Throwable th) {
            this.f16423j = null;
            m7593f();
            if (this.f16424k) {
                this.f16424k = false;
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7593f() {
        HttpURLConnection httpURLConnection = this.f16422i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f16422i = null;
        }
    }
}
