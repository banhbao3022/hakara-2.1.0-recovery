package p007c.p085g.p086a.p089m.p090s;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p085g.p086a.Priority;
import p007c.p085g.p086a.p089m.DataSource;
import p007c.p085g.p086a.p089m.HttpException;
import p007c.p085g.p086a.p089m.p096u.GlideUrl;
import p007c.p085g.p086a.p112s.ContentLengthInputStream;
import p007c.p085g.p086a.p112s.LogTime;

/* JADX INFO: renamed from: c.g.a.m.s.j, reason: use source file name */
/* JADX INFO: compiled from: HttpUrlFetcher.java */
/* JADX INFO: loaded from: classes.dex */
public class HttpUrlFetcher implements DataFetcher<InputStream> {

    /* JADX INFO: renamed from: f */
    public static final b f3058f = new a();

    /* JADX INFO: renamed from: g */
    public final GlideUrl f3059g;

    /* JADX INFO: renamed from: h */
    public final int f3060h;

    /* JADX INFO: renamed from: i */
    public final b f3061i;

    /* JADX INFO: renamed from: j */
    public HttpURLConnection f3062j;

    /* JADX INFO: renamed from: k */
    public InputStream f3063k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f3064l;

    /* JADX INFO: renamed from: c.g.a.m.s.j$a */
    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public static class a implements b {
    }

    /* JADX INFO: renamed from: c.g.a.m.s.j$b */
    /* JADX INFO: compiled from: HttpUrlFetcher.java */
    public interface b {
    }

    public HttpUrlFetcher(GlideUrl glideUrl, int i) {
        b bVar = f3058f;
        this.f3059g = glideUrl;
        this.f3060h = i;
        this.f3061i = bVar;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: a */
    public Class<InputStream> mo1712a() {
        return InputStream.class;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: b */
    public void mo1715b() {
        InputStream inputStream = this.f3063k;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f3062j;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f3062j = null;
    }

    /* JADX INFO: renamed from: c */
    public final InputStream m1726c(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        if (i >= 5) {
            throw new HttpException("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        Objects.requireNonNull((a) this.f3061i);
        this.f3062j = (HttpURLConnection) url.openConnection();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f3062j.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f3062j.setConnectTimeout(this.f3060h);
        this.f3062j.setReadTimeout(this.f3060h);
        this.f3062j.setUseCaches(false);
        this.f3062j.setDoInput(true);
        this.f3062j.setInstanceFollowRedirects(false);
        this.f3062j.connect();
        this.f3063k = this.f3062j.getInputStream();
        if (this.f3064l) {
            return null;
        }
        int responseCode = this.f3062j.getResponseCode();
        int i2 = responseCode / 100;
        if (i2 == 2) {
            HttpURLConnection httpURLConnection = this.f3062j;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f3063k = new ContentLengthInputStream(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sbM1556G = outline.m1556G("Got non empty content encoding: ");
                    sbM1556G.append(httpURLConnection.getContentEncoding());
                    Log.d("HttpUrlFetcher", sbM1556G.toString());
                }
                this.f3063k = httpURLConnection.getInputStream();
            }
            return this.f3063k;
        }
        if (!(i2 == 3)) {
            if (responseCode == -1) {
                throw new HttpException(responseCode);
            }
            throw new HttpException(this.f3062j.getResponseMessage(), responseCode);
        }
        String headerField = this.f3062j.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new HttpException("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        mo1715b();
        return m1726c(url3, i + 1, url, map);
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    public void cancel() {
        this.f3064l = true;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: d */
    public DataSource mo1717d() {
        return DataSource.REMOTE;
    }

    @Override // p007c.p085g.p086a.p089m.p090s.DataFetcher
    /* JADX INFO: renamed from: e */
    public void mo1718e(Priority priority, DataFetcher.a<? super InputStream> aVar) {
        StringBuilder sb;
        int i = LogTime.f3820b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.mo1721f(m1726c(this.f3059g.m1857d(), 0, null, this.f3059g.f3409b.mo1858a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(LogTime.m2040a(jElapsedRealtimeNanos));
                String string = sb.toString();
            }
        } catch (IOException e) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e);
            }
            aVar.mo1720c(e);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sbM1556G = outline.m1556G("Finished http url fetcher fetch in ");
                sbM1556G.append(LogTime.m2040a(jElapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sbM1556G.toString());
            }
        }
    }
}
