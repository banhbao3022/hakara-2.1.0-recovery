package p007c.p154j.p158j;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import p007c.p154j.p159k.ComponentHolder;
import p007c.p154j.p161l.DownloadRequest;

/* JADX INFO: renamed from: c.j.j.a, reason: use source file name */
/* JADX INFO: compiled from: DefaultHttpClient.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultHttpClient implements HttpClient {

    /* JADX INFO: renamed from: f */
    public URLConnection f4429f;

    /* JADX INFO: renamed from: a */
    public void m2226a(DownloadRequest downloadRequest) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(downloadRequest.f4458b).openConnection();
        this.f4429f = uRLConnectionOpenConnection;
        uRLConnectionOpenConnection.setReadTimeout(downloadRequest.f4465i);
        this.f4429f.setConnectTimeout(downloadRequest.f4466j);
        this.f4429f.addRequestProperty("Range", String.format(Locale.ENGLISH, "bytes=%d-", Long.valueOf(downloadRequest.f4463g)));
        URLConnection uRLConnection = this.f4429f;
        if (downloadRequest.f4467k == null) {
            ComponentHolder componentHolder = ComponentHolder.f4430a;
            if (componentHolder.f4433d == null) {
                synchronized (ComponentHolder.class) {
                    if (componentHolder.f4433d == null) {
                        componentHolder.f4433d = "PRDownloader";
                    }
                }
            }
            downloadRequest.f4467k = componentHolder.f4433d;
        }
        uRLConnection.addRequestProperty("User-Agent", downloadRequest.f4467k);
        this.f4429f.connect();
    }

    /* JADX INFO: renamed from: b */
    public int m2227b() throws IOException {
        URLConnection uRLConnection = this.f4429f;
        if (uRLConnection instanceof HttpURLConnection) {
            return ((HttpURLConnection) uRLConnection).getResponseCode();
        }
        return 0;
    }

    public Object clone() throws CloneNotSupportedException {
        return new DefaultHttpClient();
    }
}
