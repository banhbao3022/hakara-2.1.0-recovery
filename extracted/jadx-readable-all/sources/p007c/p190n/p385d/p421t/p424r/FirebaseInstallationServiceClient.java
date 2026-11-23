package p007c.p190n.p385d.p421t.p424r;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.inspector.network.DecompressionHelper;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p307u.C2781a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2785e;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;
import p007c.p190n.p385d.p417q.HeartBeatInfo;
import p007c.p190n.p385d.p420s.Provider2;
import p007c.p190n.p385d.p421t.FirebaseInstallationsException;
import p007c.p190n.p385d.p429x.UserAgentPublisher;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.d.t.r.c, reason: use source file name */
/* JADX INFO: compiled from: FirebaseInstallationServiceClient.java */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationServiceClient {

    /* JADX INFO: renamed from: a */
    public static final Pattern f27202a = Pattern.compile("[0-9]+s");

    /* JADX INFO: renamed from: b */
    public static final Charset f27203b = Charset.forName(Utf8Charset.NAME);

    /* JADX INFO: renamed from: c */
    public final Context f27204c;

    /* JADX INFO: renamed from: d */
    public final Provider2<UserAgentPublisher> f27205d;

    /* JADX INFO: renamed from: e */
    public final Provider2<HeartBeatInfo> f27206e;

    /* JADX INFO: renamed from: f */
    public final RequestLimiter f27207f = new RequestLimiter();

    public FirebaseInstallationServiceClient(Context context, Provider2<UserAgentPublisher> provider2, Provider2<HeartBeatInfo> provider3) {
        this.f27204c = context;
        this.f27205d = provider2;
        this.f27206e = provider3;
    }

    /* JADX INFO: renamed from: b */
    public static void m12152b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f27203b));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        objArr[2] = TextUtils.isEmpty(str) ? "" : outline.m1599u(", ", str);
        Log.w("Firebase-Installations", String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr));
    }

    /* JADX INFO: renamed from: d */
    public static long m12153d(String str) {
        C2622l.m5344b(f27202a.matcher(str).matches(), "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    /* JADX INFO: renamed from: i */
    public static void m12154i(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final URL m12155a(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", "firebaseinstallations.googleapis.com", "v1", str));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: c */
    public final HttpURLConnection m12156c(URL url, String str) throws FirebaseInstallationsException {
        MessageDigest messageDigestM5620a;
        int iMo12059a;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", DecompressionHelper.GZIP_ENCODING);
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty("X-Android-Package", this.f27204c.getPackageName());
            if (this.f27206e.get() != null && this.f27205d.get() != null && (iMo12059a = this.f27206e.get().mo12059a("fire-installations-id")) != 1) {
                httpURLConnection.addRequestProperty("x-firebase-client", this.f27205d.get().mo12210a());
                httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(C7804v0.m15315d(iMo12059a)));
            }
            String string = null;
            try {
                Context context = this.f27204c;
                PackageInfo packageInfo = C2794c.m5637a(context).f11958a.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                Signature[] signatureArr = packageInfo.signatures;
                byte[] bArrDigest = (signatureArr == null || signatureArr.length != 1 || (messageDigestM5620a = C2781a.m5620a("SHA1")) == null) ? null : messageDigestM5620a.digest(packageInfo.signatures[0].toByteArray());
                if (bArrDigest == null) {
                    Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.f27204c.getPackageName());
                } else {
                    int length = bArrDigest.length;
                    StringBuilder sb = new StringBuilder(length + length);
                    for (int i = 0; i < length; i++) {
                        char[] cArr = C2785e.f11945a;
                        sb.append(cArr[(bArrDigest[i] & 240) >>> 4]);
                        sb.append(cArr[bArrDigest[i] & 15]);
                    }
                    string = sb.toString();
                }
            } catch (PackageManager.NameNotFoundException e) {
                StringBuilder sbM1556G = outline.m1556G("No such package: ");
                sbM1556G.append(this.f27204c.getPackageName());
                Log.e("ContentValues", sbM1556G.toString(), e);
            }
            httpURLConnection.addRequestProperty("X-Android-Cert", string);
            httpURLConnection.addRequestProperty("x-goog-api-key", str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
    }

    /* JADX INFO: renamed from: e */
    public final InstallationResponse m12157e(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f27203b));
        TokenResult.a aVarM12163a = TokenResult.m12163a();
        AutoValue_InstallationResponse.b bVar = new AutoValue_InstallationResponse.b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                bVar.f27191a = jsonReader.nextString();
            } else if (strNextName.equals("fid")) {
                bVar.f27192b = jsonReader.nextString();
            } else if (strNextName.equals("refreshToken")) {
                bVar.f27193c = jsonReader.nextString();
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        ((AutoValue_TokenResult.b) aVarM12163a).f27199a = jsonReader.nextString();
                    } else if (strNextName2.equals("expiresIn")) {
                        aVarM12163a.mo12151b(m12153d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                bVar.f27194d = aVarM12163a.mo12150a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        InstallationResponse.b bVar2 = InstallationResponse.b.OK;
        bVar.f27195e = bVar2;
        return new AutoValue_InstallationResponse(bVar.f27191a, bVar.f27192b, bVar.f27193c, bVar.f27194d, bVar2, null);
    }

    /* JADX INFO: renamed from: f */
    public final TokenResult m12158f(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f27203b));
        TokenResult.a aVarM12163a = TokenResult.m12163a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                ((AutoValue_TokenResult.b) aVarM12163a).f27199a = jsonReader.nextString();
            } else if (strNextName.equals("expiresIn")) {
                aVarM12163a.mo12151b(m12153d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        AutoValue_TokenResult.b bVar = (AutoValue_TokenResult.b) aVarM12163a;
        bVar.f27201c = TokenResult.b.OK;
        return bVar.mo12150a();
    }

    /* JADX INFO: renamed from: g */
    public final void m12159g(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:16.3.5");
            m12154i(httpURLConnection, jSONObject.toString().getBytes(Utf8Charset.NAME));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m12160h(HttpURLConnection httpURLConnection) throws IOException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:16.3.5");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            m12154i(httpURLConnection, jSONObject2.toString().getBytes(Utf8Charset.NAME));
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
