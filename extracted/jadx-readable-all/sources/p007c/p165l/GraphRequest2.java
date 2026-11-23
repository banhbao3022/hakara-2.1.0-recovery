package p007c.p165l;

import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.ServerProtocol;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.s, reason: use source file name */
/* JADX INFO: compiled from: GraphRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class GraphRequest2 {

    /* JADX INFO: renamed from: a */
    public static final String f5372a;

    /* JADX INFO: renamed from: b */
    public static Pattern f5373b = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");

    /* JADX INFO: renamed from: c */
    public static volatile String f5374c;

    /* JADX INFO: renamed from: d */
    public AccessToken f5375d;

    /* JADX INFO: renamed from: e */
    public HttpMethod f5376e;

    /* JADX INFO: renamed from: f */
    public String f5377f;

    /* JADX INFO: renamed from: g */
    public JSONObject f5378g;

    /* JADX INFO: renamed from: h */
    public boolean f5379h;

    /* JADX INFO: renamed from: i */
    public Bundle f5380i;

    /* JADX INFO: renamed from: j */
    public c f5381j;

    /* JADX INFO: renamed from: k */
    public Object f5382k;

    /* JADX INFO: renamed from: l */
    public String f5383l;

    /* JADX INFO: renamed from: m */
    public boolean f5384m;

    /* JADX INFO: renamed from: c.l.s$a */
    /* JADX INFO: compiled from: GraphRequest.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f5385f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ GraphRequestBatch f5386g;

        public a(ArrayList arrayList, GraphRequestBatch graphRequestBatch) {
            this.f5385f = arrayList;
            this.f5386g = graphRequestBatch;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (Pair pair : this.f5385f) {
                ((c) pair.first).mo2263b((GraphResponse) pair.second);
            }
            Iterator<GraphRequestBatch.a> it = this.f5386g.f5405k.iterator();
            while (it.hasNext()) {
                it.next().mo2264a(this.f5386g);
            }
        }
    }

    /* JADX INFO: renamed from: c.l.s$b */
    /* JADX INFO: compiled from: GraphRequest.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final GraphRequest2 f5387a;

        /* JADX INFO: renamed from: b */
        public final Object f5388b;

        public b(GraphRequest2 graphRequest2, Object obj) {
            this.f5387a = graphRequest2;
            this.f5388b = obj;
        }
    }

    /* JADX INFO: renamed from: c.l.s$c */
    /* JADX INFO: compiled from: GraphRequest.java */
    public interface c {
        /* JADX INFO: renamed from: b */
        void mo2263b(GraphResponse graphResponse);
    }

    /* JADX INFO: renamed from: c.l.s$d */
    /* JADX INFO: compiled from: GraphRequest.java */
    public interface d {
        /* JADX INFO: renamed from: a */
        void mo2692a(JSONObject jSONObject, GraphResponse graphResponse);
    }

    /* JADX INFO: renamed from: c.l.s$e */
    /* JADX INFO: compiled from: GraphRequest.java */
    public interface e {
        /* JADX INFO: renamed from: a */
        void mo2693a(String str, String str2) throws IOException;
    }

    /* JADX INFO: renamed from: c.l.s$f */
    /* JADX INFO: compiled from: GraphRequest.java */
    public interface f extends c {
        /* JADX INFO: renamed from: a */
        void m2694a(long j2, long j3);
    }

    /* JADX INFO: renamed from: c.l.s$h */
    /* JADX INFO: compiled from: GraphRequest.java */
    public static class h implements e {

        /* JADX INFO: renamed from: a */
        public final OutputStream f5391a;

        /* JADX INFO: renamed from: b */
        public final Logger3 f5392b;

        /* JADX INFO: renamed from: c */
        public boolean f5393c = true;

        /* JADX INFO: renamed from: d */
        public boolean f5394d;

        public h(OutputStream outputStream, Logger3 logger3, boolean z) {
            this.f5394d = false;
            this.f5391a = outputStream;
            this.f5392b = logger3;
            this.f5394d = z;
        }

        @Override // p007c.p165l.GraphRequest2.e
        /* JADX INFO: renamed from: a */
        public void mo2693a(String str, String str2) throws IOException {
            m2696c(str, null, null);
            m2699f("%s", str2);
            m2701h();
            Logger3 logger3 = this.f5392b;
            if (logger3 != null) {
                FacebookSdk.m2665g(logger3.f5044b);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m2695b(String str, Object... objArr) throws IOException {
            if (this.f5394d) {
                this.f5391a.write(URLEncoder.encode(String.format(Locale.US, str, objArr), Utf8Charset.NAME).getBytes());
                return;
            }
            if (this.f5393c) {
                this.f5391a.write("--".getBytes());
                this.f5391a.write(GraphRequest2.f5372a.getBytes());
                this.f5391a.write("\r\n".getBytes());
                this.f5393c = false;
            }
            this.f5391a.write(String.format(str, objArr).getBytes());
        }

        /* JADX INFO: renamed from: c */
        public void m2696c(String str, String str2, String str3) throws IOException {
            if (this.f5394d) {
                this.f5391a.write(String.format("%s=", str).getBytes());
                return;
            }
            m2695b("Content-Disposition: form-data; name=\"%s\"", str);
            if (str2 != null) {
                m2695b("; filename=\"%s\"", str2);
            }
            m2699f("", new Object[0]);
            if (str3 != null) {
                m2699f("%s: %s", HttpHeaders.CONTENT_TYPE, str3);
            }
            m2699f("", new Object[0]);
        }

        /* JADX INFO: renamed from: d */
        public void m2697d(String str, Uri uri, String str2) throws IOException {
            int iM2447f;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m2696c(str, str, str2);
            if (this.f5391a instanceof ProgressNoopOutputStream) {
                Cursor cursorQuery = null;
                try {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                    Validate.m2479h();
                    cursorQuery = FacebookSdk.f5360i.getContentResolver().query(uri, null, null, null, null);
                    int columnIndex = cursorQuery.getColumnIndex("_size");
                    cursorQuery.moveToFirst();
                    long j2 = cursorQuery.getLong(columnIndex);
                    cursorQuery.close();
                    ((ProgressNoopOutputStream) this.f5391a).m2258c(j2);
                    iM2447f = 0;
                } catch (Throwable th) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } else {
                HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                Validate.m2479h();
                iM2447f = Utility.m2447f(FacebookSdk.f5360i.getContentResolver().openInputStream(uri), this.f5391a) + 0;
            }
            m2699f("", new Object[0]);
            m2701h();
            Logger3 logger3 = this.f5392b;
            if (logger3 != null) {
                String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(iM2447f));
                FacebookSdk.m2665g(logger3.f5044b);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m2698e(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
            int iM2447f;
            if (str2 == null) {
                str2 = "content/unknown";
            }
            m2696c(str, str, str2);
            OutputStream outputStream = this.f5391a;
            if (outputStream instanceof ProgressNoopOutputStream) {
                ((ProgressNoopOutputStream) outputStream).m2258c(parcelFileDescriptor.getStatSize());
                iM2447f = 0;
            } else {
                iM2447f = Utility.m2447f(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.f5391a) + 0;
            }
            m2699f("", new Object[0]);
            m2701h();
            Logger3 logger3 = this.f5392b;
            if (logger3 != null) {
                String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(iM2447f));
                FacebookSdk.m2665g(logger3.f5044b);
            }
        }

        /* JADX INFO: renamed from: f */
        public void m2699f(String str, Object... objArr) throws IOException {
            m2695b(str, objArr);
            if (this.f5394d) {
                return;
            }
            m2695b("\r\n", new Object[0]);
        }

        /* JADX INFO: renamed from: g */
        public void m2700g(String str, Object obj, GraphRequest2 graphRequest2) throws IOException {
            Closeable closeable = this.f5391a;
            if (closeable instanceof RequestOutputStream) {
                ((RequestOutputStream) closeable).mo2257a(graphRequest2);
            }
            if (GraphRequest2.m2674k(obj)) {
                mo2693a(str, GraphRequest2.m2677n(obj));
                return;
            }
            if (obj instanceof Bitmap) {
                m2696c(str, str, "image/png");
                ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, this.f5391a);
                m2699f("", new Object[0]);
                m2701h();
                Logger3 logger3 = this.f5392b;
                if (logger3 != null) {
                    FacebookSdk.m2665g(logger3.f5044b);
                    return;
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                m2696c(str, str, "content/unknown");
                this.f5391a.write(bArr);
                m2699f("", new Object[0]);
                m2701h();
                Logger3 logger4 = this.f5392b;
                if (logger4 != null) {
                    String.format(Locale.ROOT, "<Data: %d>", Integer.valueOf(bArr.length));
                    FacebookSdk.m2665g(logger4.f5044b);
                    return;
                }
                return;
            }
            if (obj instanceof Uri) {
                m2697d(str, (Uri) obj, null);
                return;
            }
            if (obj instanceof ParcelFileDescriptor) {
                m2698e(str, (ParcelFileDescriptor) obj, null);
                return;
            }
            if (!(obj instanceof g)) {
                throw new IllegalArgumentException("value is not a supported type.");
            }
            g gVar = (g) obj;
            RESOURCE resource = gVar.f5390g;
            String str2 = gVar.f5389f;
            if (resource instanceof ParcelFileDescriptor) {
                m2698e(str, (ParcelFileDescriptor) resource, str2);
            } else {
                if (!(resource instanceof Uri)) {
                    throw new IllegalArgumentException("value is not a supported type.");
                }
                m2697d(str, (Uri) resource, str2);
            }
        }

        /* JADX INFO: renamed from: h */
        public void m2701h() throws IOException {
            if (this.f5394d) {
                this.f5391a.write("&".getBytes());
            } else {
                m2699f("--%s", GraphRequest2.f5372a);
            }
        }
    }

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(11) + 30;
        for (int i = 0; i < iNextInt; i++) {
            sb.append(charArray[secureRandom.nextInt(charArray.length)]);
        }
        f5372a = sb.toString();
    }

    public GraphRequest2() {
        this(null, null, null, null, null);
    }

    /* JADX INFO: renamed from: c */
    public static HttpURLConnection m2670c(URL url) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        if (f5374c == null) {
            f5374c = String.format("%s.%s", "FBAndroidSDK", "5.15.3");
            if (!Utility.m2466y(null)) {
                f5374c = String.format(Locale.ROOT, "%s/%s", f5374c, null);
            }
        }
        httpURLConnection.setRequestProperty("User-Agent", f5374c);
        httpURLConnection.setRequestProperty("Accept-Language", Locale.getDefault().toString());
        httpURLConnection.setChunkedStreamingMode(0);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: f */
    public static List<GraphResponse> m2671f(GraphRequestBatch graphRequestBatch) {
        Validate.m2476e(graphRequestBatch, "requests");
        try {
            try {
                HttpURLConnection httpURLConnectionM2684v = m2684v(graphRequestBatch);
                List<GraphResponse> listM2672g = m2672g(httpURLConnectionM2684v, graphRequestBatch);
                Utility.m2449h(httpURLConnectionM2684v);
                return listM2672g;
            } catch (Exception e2) {
                List<GraphResponse> listM2704a = GraphResponse.m2704a(graphRequestBatch.f5402h, null, new FacebookException(e2));
                m2681r(graphRequestBatch, listM2704a);
                Utility.m2449h(null);
                return listM2704a;
            }
        } catch (Throwable th) {
            Utility.m2449h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0067 A[EXC_TOP_SPLITTER, PHI: r1 r2
  0x0067: PHI (r1v4 java.util.List<c.l.w>) = (r1v3 java.util.List<c.l.w>), (r1v7 java.util.List<c.l.w>) binds: [B:29:0x0053, B:40:0x0065] A[DONT_GENERATE, DONT_INLINE]
  0x0067: PHI (r2v4 java.io.InputStream) = (r2v3 java.io.InputStream), (r2v6 java.io.InputStream) binds: [B:29:0x0053, B:40:0x0065] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static List<GraphResponse> m2672g(HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) throws Throwable {
        InputStream inputStream;
        List<GraphResponse> listM2704a;
        List<GraphResponse> listM2706c;
        boolean z;
        String str = GraphResponse.f5406a;
        InputStream inputStream2 = null;
        try {
            try {
                if (!FacebookSdk.m2663e()) {
                    Log.e(GraphResponse.f5406a, "GraphRequest can't be used when Facebook SDK isn't fully initialized");
                    throw new FacebookException("GraphRequest can't be used when Facebook SDK isn't fully initialized");
                }
                InputStream errorStream = httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
                try {
                    listM2706c = GraphResponse.m2706c(errorStream, httpURLConnection, graphRequestBatch);
                    if (errorStream != null) {
                        try {
                            errorStream.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (FacebookException e2) {
                    inputStream = errorStream;
                    e = e2;
                    HashMap<String, String> map = Logger3.f5043a;
                    synchronized (FacebookSdk.f5352a) {
                    }
                    listM2704a = GraphResponse.m2704a(graphRequestBatch, httpURLConnection, e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    listM2706c = listM2704a;
                } catch (Exception e3) {
                    inputStream = errorStream;
                    e = e3;
                    HashMap<String, String> map2 = Logger3.f5043a;
                    synchronized (FacebookSdk.f5352a) {
                    }
                    listM2704a = GraphResponse.m2704a(graphRequestBatch, httpURLConnection, new FacebookException(e));
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    listM2706c = listM2704a;
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = errorStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
                Utility.m2449h(httpURLConnection);
                int size = graphRequestBatch.size();
                if (size != listM2706c.size()) {
                    throw new FacebookException(String.format(Locale.US, "Received %d responses while expecting %d", Integer.valueOf(listM2706c.size()), Integer.valueOf(size)));
                }
                m2681r(graphRequestBatch, listM2706c);
                AccessTokenManager2 accessTokenManager2M2259a = AccessTokenManager2.m2259a();
                if (accessTokenManager2M2259a.f4523d != null) {
                    Long lValueOf = Long.valueOf(new Date().getTime());
                    z = accessTokenManager2M2259a.f4523d.f4500o.f4562p && lValueOf.longValue() - accessTokenManager2M2259a.f4525f.getTime() > 3600000 && lValueOf.longValue() - accessTokenManager2M2259a.f4523d.f4501p.getTime() > 86400000;
                }
                if (z) {
                    if (Looper.getMainLooper().equals(Looper.myLooper())) {
                        accessTokenManager2M2259a.m2260b(null);
                    } else {
                        new Handler(Looper.getMainLooper()).post(new AccessTokenManager(accessTokenManager2M2259a, null));
                    }
                }
                return listM2706c;
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (FacebookException e4) {
            e = e4;
            inputStream = null;
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m2673j(Object obj) {
        return (obj instanceof Bitmap) || (obj instanceof byte[]) || (obj instanceof Uri) || (obj instanceof ParcelFileDescriptor) || (obj instanceof g);
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2674k(Object obj) {
        return (obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Number) || (obj instanceof Date);
    }

    /* JADX INFO: renamed from: l */
    public static GraphRequest2 m2675l(AccessToken accessToken, String str, c cVar) {
        return new GraphRequest2(null, str, null, null, null);
    }

    /* JADX INFO: renamed from: m */
    public static GraphRequest2 m2676m(AccessToken accessToken, String str, JSONObject jSONObject, c cVar) {
        GraphRequest2 graphRequest2 = new GraphRequest2(accessToken, str, null, HttpMethod.POST, cVar);
        graphRequest2.f5378g = jSONObject;
        return graphRequest2;
    }

    /* JADX INFO: renamed from: n */
    public static String m2677n(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj.toString();
        }
        if (obj instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format(obj);
        }
        throw new IllegalArgumentException("Unsupported parameter type.");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX INFO: renamed from: o */
    public static void m2678o(JSONObject jSONObject, String str, e eVar) throws IOException {
        boolean z;
        Matcher matcher = f5373b.matcher(str);
        String strGroup = matcher.matches() ? matcher.group(1) : str;
        if (strGroup.startsWith("me/") || strGroup.startsWith("/me/")) {
            int iIndexOf = str.indexOf(":");
            int iIndexOf2 = str.indexOf("?");
            if (iIndexOf <= 3 || (iIndexOf2 != -1 && iIndexOf >= iIndexOf2)) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m2679p(next, jSONObject.opt(next), eVar, z && next.equalsIgnoreCase("image"));
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m2679p(String str, Object obj, e eVar, boolean z) throws IOException {
        Class<?> cls = obj.getClass();
        if (JSONObject.class.isAssignableFrom(cls)) {
            JSONObject jSONObject = (JSONObject) obj;
            if (z) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    m2679p(String.format("%s[%s]", str, next), jSONObject.opt(next), eVar, z);
                }
                return;
            }
            if (jSONObject.has("id")) {
                m2679p(str, jSONObject.optString("id"), eVar, z);
                return;
            } else if (jSONObject.has("url")) {
                m2679p(str, jSONObject.optString("url"), eVar, z);
                return;
            } else {
                if (jSONObject.has("fbsdk:create_object")) {
                    m2679p(str, jSONObject.toString(), eVar, z);
                    return;
                }
                return;
            }
        }
        if (JSONArray.class.isAssignableFrom(cls)) {
            JSONArray jSONArray = (JSONArray) obj;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                m2679p(String.format(Locale.ROOT, "%s[%d]", str, Integer.valueOf(i)), jSONArray.opt(i), eVar, z);
            }
            return;
        }
        if (String.class.isAssignableFrom(cls) || Number.class.isAssignableFrom(cls) || Boolean.class.isAssignableFrom(cls)) {
            eVar.mo2693a(str, obj.toString());
        } else if (Date.class.isAssignableFrom(cls)) {
            eVar.mo2693a(str, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.US).format((Date) obj));
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b2 A[EDGE_INSN: B:36:0x00b2->B:38:0x00bb BREAK  A[LOOP:2: B:27:0x0097->B:93:0x0097]] */
    /* JADX INFO: renamed from: q */
    public static void m2680q(GraphRequestBatch graphRequestBatch, Logger3 logger3, int i, URL url, OutputStream outputStream, boolean z) throws JSONException, IOException {
        String str;
        h hVar = new h(outputStream, logger3, z);
        char c2 = 1;
        if (i == 1) {
            GraphRequest2 graphRequest2M2702c = graphRequestBatch.m2702c(0);
            HashMap map = new HashMap();
            for (String str2 : graphRequest2M2702c.f5380i.keySet()) {
                Object obj = graphRequest2M2702c.f5380i.get(str2);
                if (m2673j(obj)) {
                    map.put(str2, new b(graphRequest2M2702c, obj));
                }
            }
            if (logger3 != null) {
                FacebookSdk.m2665g(logger3.f5044b);
            }
            Bundle bundle = graphRequest2M2702c.f5380i;
            for (String str3 : bundle.keySet()) {
                Object obj2 = bundle.get(str3);
                if (m2674k(obj2)) {
                    hVar.m2700g(str3, obj2, graphRequest2M2702c);
                }
            }
            if (logger3 != null) {
                FacebookSdk.m2665g(logger3.f5044b);
            }
            m2682s(map, hVar);
            JSONObject jSONObject = graphRequest2M2702c.f5378g;
            if (jSONObject != null) {
                m2678o(jSONObject, url.getPath(), hVar);
                return;
            }
            return;
        }
        if (!Utility.m2466y(null)) {
            str = null;
            break;
        }
        Iterator<GraphRequest2> it = graphRequestBatch.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (!Utility.m2466y(null)) {
                    str = null;
                    break;
                }
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                str = FacebookSdk.f5354c;
                break;
            }
            AccessToken accessToken = it.next().f5375d;
            if (accessToken != null && (str = accessToken.f4502q) != null) {
                break;
            }
        }
        if (Utility.m2466y(str)) {
            throw new FacebookException("App ID was not specified at the request or Settings.");
        }
        hVar.mo2693a("batch_app_id", str);
        HashMap map2 = new HashMap();
        JSONArray jSONArray = new JSONArray();
        for (GraphRequest2 graphRequest2 : graphRequestBatch) {
            Objects.requireNonNull(graphRequest2);
            JSONObject jSONObject2 = new JSONObject();
            int i2 = 2;
            Object[] objArr = new Object[2];
            objArr[0] = ServerProtocol.m2422b();
            objArr[c2] = graphRequest2.m2689h();
            String str4 = String.format("%s/%s", objArr);
            graphRequest2.m2685a();
            Uri uri = Uri.parse(graphRequest2.m2686b(str4, Boolean.TRUE));
            Object[] objArr2 = new Object[2];
            objArr2[0] = uri.getPath();
            objArr2[c2] = uri.getQuery();
            String str5 = String.format("%s?%s", objArr2);
            jSONObject2.put("relative_url", str5);
            jSONObject2.put("method", graphRequest2.f5376e);
            AccessToken accessToken2 = graphRequest2.f5375d;
            if (accessToken2 != null) {
                Logger3.m2532a(accessToken2.f4499n);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<String> it2 = graphRequest2.f5380i.keySet().iterator();
            while (it2.hasNext()) {
                Object obj3 = graphRequest2.f5380i.get(it2.next());
                if (m2673j(obj3)) {
                    Locale locale = Locale.ROOT;
                    Object[] objArr3 = new Object[i2];
                    objArr3[0] = "file";
                    objArr3[1] = Integer.valueOf(map2.size());
                    String str6 = String.format(locale, "%s%d", objArr3);
                    arrayList.add(str6);
                    map2.put(str6, new b(graphRequest2, obj3));
                    i2 = 2;
                }
            }
            if (!arrayList.isEmpty()) {
                jSONObject2.put("attached_files", TextUtils.join(",", arrayList));
            }
            if (graphRequest2.f5378g != null) {
                ArrayList arrayList2 = new ArrayList();
                m2678o(graphRequest2.f5378g, str5, new GraphRequest3(graphRequest2, arrayList2));
                jSONObject2.put("body", TextUtils.join("&", arrayList2));
            }
            jSONArray.put(jSONObject2);
            c2 = 1;
        }
        Closeable closeable = hVar.f5391a;
        if (closeable instanceof RequestOutputStream) {
            RequestOutputStream requestOutputStream = (RequestOutputStream) closeable;
            hVar.m2696c("batch", null, null);
            hVar.m2695b("[", new Object[0]);
            int i3 = 0;
            for (GraphRequest2 graphRequest3 : graphRequestBatch) {
                JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
                requestOutputStream.mo2257a(graphRequest3);
                if (i3 > 0) {
                    hVar.m2695b(",%s", jSONObject3.toString());
                } else {
                    hVar.m2695b("%s", jSONObject3.toString());
                }
                i3++;
            }
            hVar.m2695b("]", new Object[0]);
            Logger3 logger4 = hVar.f5392b;
            if (logger4 != null) {
                jSONArray.toString();
                FacebookSdk.m2665g(logger4.f5044b);
            }
        } else {
            hVar.mo2693a("batch", jSONArray.toString());
        }
        if (logger3 != null) {
            FacebookSdk.m2665g(logger3.f5044b);
        }
        m2682s(map2, hVar);
    }

    /* JADX INFO: renamed from: r */
    public static void m2681r(GraphRequestBatch graphRequestBatch, List<GraphResponse> list) {
        int size = graphRequestBatch.size();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            GraphRequest2 graphRequest2M2702c = graphRequestBatch.m2702c(i);
            if (graphRequest2M2702c.f5381j != null) {
                arrayList.add(new Pair(graphRequest2M2702c.f5381j, list.get(i)));
            }
        }
        if (arrayList.size() > 0) {
            a aVar = new a(arrayList, graphRequestBatch);
            Handler handler = graphRequestBatch.f5401g;
            if (handler == null) {
                aVar.run();
            } else {
                handler.post(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m2682s(Map<String, b> map, h hVar) throws IOException {
        for (String str : map.keySet()) {
            b bVar = map.get(str);
            if (m2673j(bVar.f5388b)) {
                hVar.m2700g(str, bVar.f5388b, bVar.f5387a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0154  */
    /* JADX INFO: renamed from: t */
    public static final void m2683t(GraphRequestBatch graphRequestBatch, HttpURLConnection httpURLConnection) throws Throwable {
        boolean z;
        boolean z2;
        OutputStream gZIPOutputStream;
        HttpMethod httpMethod = HttpMethod.POST;
        Logger3 logger3 = new Logger3(LoggingBehavior.REQUESTS, "Request");
        int size = graphRequestBatch.size();
        Iterator<GraphRequest2> it = graphRequestBatch.iterator();
        loop0: while (true) {
            z = false;
            if (!it.hasNext()) {
                z2 = true;
                break;
            }
            GraphRequest2 next = it.next();
            Iterator<String> it2 = next.f5380i.keySet().iterator();
            while (it2.hasNext()) {
                if (m2673j(next.f5380i.get(it2.next()))) {
                    z2 = false;
                    break loop0;
                }
            }
        }
        HttpMethod httpMethod2 = size == 1 ? graphRequestBatch.m2702c(0).f5376e : httpMethod;
        httpURLConnection.setRequestMethod(httpMethod2.name());
        if (z2) {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            httpURLConnection.setRequestProperty("Content-Encoding", DecompressionHelper.GZIP_ENCODING);
        } else {
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, String.format("multipart/form-data; boundary=%s", f5372a));
        }
        URL url = httpURLConnection.getURL();
        FacebookSdk.m2665g(logger3.f5044b);
        FacebookSdk.m2665g(logger3.f5044b);
        FacebookSdk.m2665g(logger3.f5044b);
        httpURLConnection.getRequestMethod();
        FacebookSdk.m2665g(logger3.f5044b);
        httpURLConnection.getRequestProperty("User-Agent");
        FacebookSdk.m2665g(logger3.f5044b);
        httpURLConnection.getRequestProperty(HttpHeaders.CONTENT_TYPE);
        FacebookSdk.m2665g(logger3.f5044b);
        httpURLConnection.setConnectTimeout(graphRequestBatch.f5403i);
        httpURLConnection.setReadTimeout(graphRequestBatch.f5403i);
        if (!(httpMethod2 == httpMethod)) {
            logger3.f5046d.toString();
            FacebookSdk.m2665g(logger3.f5044b);
            logger3.f5046d = new StringBuilder();
            return;
        }
        httpURLConnection.setDoOutput(true);
        OutputStream outputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
            if (z2) {
                try {
                    gZIPOutputStream = new GZIPOutputStream(bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    outputStream = bufferedOutputStream;
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    throw th;
                }
            } else {
                gZIPOutputStream = bufferedOutputStream;
            }
            try {
                Iterator<GraphRequestBatch.a> it3 = graphRequestBatch.f5405k.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator<GraphRequest2> it4 = graphRequestBatch.iterator();
                        while (it4.hasNext()) {
                            if (it4.next().f5381j instanceof f) {
                            }
                        }
                        break;
                    }
                    if (it3.next() instanceof GraphRequestBatch.b) {
                    }
                    z = true;
                    break;
                }
                if (z) {
                    ProgressNoopOutputStream progressNoopOutputStream = new ProgressNoopOutputStream(graphRequestBatch.f5401g);
                    m2680q(graphRequestBatch, null, size, url, progressNoopOutputStream, z2);
                    gZIPOutputStream = new ProgressOutputStream(gZIPOutputStream, graphRequestBatch, progressNoopOutputStream.f4515f, progressNoopOutputStream.f4519j);
                }
                m2680q(graphRequestBatch, logger3, size, url, gZIPOutputStream, z2);
                gZIPOutputStream.close();
                logger3.f5046d.toString();
                FacebookSdk.m2665g(logger3.f5044b);
                logger3.f5046d = new StringBuilder();
            } catch (Throwable th2) {
                th = th2;
                outputStream = gZIPOutputStream;
                if (outputStream != null) {
                    outputStream.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: v */
    public static HttpURLConnection m2684v(GraphRequestBatch graphRequestBatch) {
        Iterator<GraphRequest2> it = graphRequestBatch.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                try {
                    break;
                } catch (MalformedURLException e2) {
                    throw new FacebookException("could not construct URL for request", e2);
                }
            }
            GraphRequest2 next = it.next();
            if (HttpMethod.GET.equals(next.f5376e)) {
                String strSubstring = next.f5383l;
                if (!Utility.m2466y(strSubstring)) {
                    if (strSubstring.startsWith("v")) {
                        strSubstring = strSubstring.substring(1);
                    }
                    String[] strArrSplit = strSubstring.split("\\.");
                    if ((strArrSplit.length < 2 || Integer.parseInt(strArrSplit[0]) <= 2) && (Integer.parseInt(strArrSplit[0]) < 2 || Integer.parseInt(strArrSplit[1]) < 4)) {
                        z = false;
                    }
                }
                if (z) {
                    Bundle bundle = next.f5380i;
                    if (!bundle.containsKey("fields") || Utility.m2466y(bundle.getString("fields"))) {
                        HashMap<String, String> map = Logger3.f5043a;
                        synchronized (FacebookSdk.f5352a) {
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        HttpURLConnection httpURLConnectionM2670c = null;
        try {
            httpURLConnectionM2670c = m2670c(graphRequestBatch.size() == 1 ? new URL(graphRequestBatch.m2702c(0).m2690i()) : new URL(ServerProtocol.m2422b()));
            m2683t(graphRequestBatch, httpURLConnectionM2670c);
            return httpURLConnectionM2670c;
        } catch (IOException | JSONException e3) {
            Utility.m2449h(httpURLConnectionM2670c);
            throw new FacebookException("could not construct request body", e3);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2685a() {
        if (this.f5375d != null) {
            if (!this.f5380i.containsKey("access_token")) {
                String str = this.f5375d.f4499n;
                Logger3.m2532a(str);
                this.f5380i.putString("access_token", str);
            }
        } else if (!this.f5384m && !this.f5380i.containsKey("access_token")) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            String str2 = FacebookSdk.f5354c;
            Validate.m2479h();
            String str3 = FacebookSdk.f5356e;
            if (!Utility.m2466y(str2) && !Utility.m2466y(str3)) {
                this.f5380i.putString("access_token", outline.m1600v(str2, "|", str3));
            }
        }
        this.f5380i.putString("sdk", "android");
        this.f5380i.putString("format", "json");
        HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
        synchronized (hashSet2) {
        }
        synchronized (hashSet2) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m2686b(String str, Boolean bool) {
        if (!bool.booleanValue() && this.f5376e == HttpMethod.POST) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f5380i.keySet()) {
            Object obj = this.f5380i.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (m2674k(obj)) {
                builderBuildUpon.appendQueryParameter(str2, m2677n(obj).toString());
            } else if (this.f5376e == HttpMethod.GET) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", obj.getClass().getSimpleName()));
            }
        }
        return builderBuildUpon.toString();
    }

    /* JADX INFO: renamed from: d */
    public final GraphResponse m2687d() {
        GraphRequest2[] graphRequest2Arr = {this};
        Validate.m2477f(graphRequest2Arr, "requests");
        List<GraphResponse> listM2671f = m2671f(new GraphRequestBatch(Arrays.asList(graphRequest2Arr)));
        if (listM2671f.size() == 1) {
            return listM2671f.get(0);
        }
        throw new FacebookException("invalid state: expected a single response");
    }

    /* JADX INFO: renamed from: e */
    public final GraphRequestAsyncTask m2688e() {
        GraphRequest2[] graphRequest2Arr = {this};
        Validate.m2477f(graphRequest2Arr, "requests");
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch(Arrays.asList(graphRequest2Arr));
        Validate.m2476e(graphRequestBatch, "requests");
        GraphRequestAsyncTask graphRequestAsyncTask = new GraphRequestAsyncTask(graphRequestBatch);
        graphRequestAsyncTask.executeOnExecutor(FacebookSdk.m2660b(), new Void[0]);
        return graphRequestAsyncTask;
    }

    /* JADX INFO: renamed from: h */
    public final String m2689h() {
        return f5373b.matcher(this.f5377f).matches() ? this.f5377f : String.format("%s/%s", this.f5383l, this.f5377f);
    }

    /* JADX INFO: renamed from: i */
    public final String m2690i() {
        String strM2422b;
        String str;
        if (this.f5376e == HttpMethod.POST && (str = this.f5377f) != null && str.endsWith("/videos")) {
            Collection<String> collection = ServerProtocol.f4898a;
            strM2422b = String.format("https://graph-video.%s", FacebookSdk.m2661c());
        } else {
            strM2422b = ServerProtocol.m2422b();
        }
        String str2 = String.format("%s/%s", strM2422b, m2689h());
        m2685a();
        return m2686b(str2, Boolean.FALSE);
    }

    public String toString() {
        StringBuilder sbM1561L = outline.m1561L("{Request: ", " accessToken: ");
        Object obj = this.f5375d;
        if (obj == null) {
            obj = "null";
        }
        sbM1561L.append(obj);
        sbM1561L.append(", graphPath: ");
        sbM1561L.append(this.f5377f);
        sbM1561L.append(", graphObject: ");
        sbM1561L.append(this.f5378g);
        sbM1561L.append(", httpMethod: ");
        sbM1561L.append(this.f5376e);
        sbM1561L.append(", parameters: ");
        sbM1561L.append(this.f5380i);
        sbM1561L.append("}");
        return sbM1561L.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m2691u(c cVar) {
        synchronized (FacebookSdk.f5352a) {
        }
        synchronized (FacebookSdk.f5352a) {
        }
        this.f5381j = cVar;
    }

    public GraphRequest2(AccessToken accessToken, String str) {
        this(accessToken, str, null, null, null);
    }

    /* JADX INFO: renamed from: c.l.s$g */
    /* JADX INFO: compiled from: GraphRequest.java */
    public static class g<RESOURCE extends Parcelable> implements Parcelable {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public final String f5389f;

        /* JADX INFO: renamed from: g */
        public final RESOURCE f5390g;

        /* JADX INFO: renamed from: c.l.s$g$a */
        /* JADX INFO: compiled from: GraphRequest.java */
        public static class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (GraphRequest) null);
            }

            @Override // android.os.Parcelable.Creator
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(RESOURCE resource, String str) {
            this.f5389f = str;
            this.f5390g = resource;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5389f);
            parcel.writeParcelable(this.f5390g, i);
        }

        public g(Parcel parcel, GraphRequest graphRequest) {
            this.f5389f = parcel.readString();
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            this.f5390g = (RESOURCE) parcel.readParcelable(FacebookSdk.f5360i.getClassLoader());
        }
    }

    public GraphRequest2(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod) {
        this(accessToken, str, bundle, httpMethod, null);
    }

    public GraphRequest2(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, c cVar) {
        this(accessToken, str, bundle, httpMethod, cVar, null);
    }

    public GraphRequest2(AccessToken accessToken, String str, Bundle bundle, HttpMethod httpMethod, c cVar, String str2) {
        this.f5379h = true;
        this.f5384m = false;
        this.f5375d = accessToken;
        this.f5377f = str;
        this.f5383l = str2;
        m2691u(cVar);
        this.f5376e = httpMethod == null ? HttpMethod.GET : httpMethod;
        if (bundle != null) {
            this.f5380i = new Bundle(bundle);
        } else {
            this.f5380i = new Bundle();
        }
        if (this.f5383l == null) {
            this.f5383l = FacebookSdk.m2662d();
        }
    }
}
