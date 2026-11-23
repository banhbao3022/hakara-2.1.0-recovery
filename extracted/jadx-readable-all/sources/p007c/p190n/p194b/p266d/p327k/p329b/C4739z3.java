package p007c.p190n.p194b.p266d.p327k.p329b;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: renamed from: c.n.b.d.k.b.z3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4739z3 extends AbstractC4587l9 {
    public C4739z3(C4611n9 c4611n9) {
        super(c4611n9);
    }

    /* JADX INFO: renamed from: t */
    public static byte[] m10911t(HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            inputStream = httpURLConnection.getInputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inputStream.close();
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4587l9
    /* JADX INFO: renamed from: p */
    public final boolean mo10577p() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final HttpURLConnection m10912s(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
            throw new IOException("Failed to obtain HTTP connection");
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setDefaultUseCaches(false);
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setReadTimeout(61000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10913u() {
        m10642i();
        NetworkInfo activeNetworkInfo = null;
        try {
            activeNetworkInfo = ((ConnectivityManager) this.f24476a.f24528b.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
