package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: renamed from: c.n.b.d.j.a.jn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3183jn extends FilterInputStream {

    /* JADX INFO: renamed from: f */
    public final HttpURLConnection f15665f;

    /* JADX WARN: Illegal instructions before constructor call */
    public C3183jn(HttpURLConnection httpURLConnection) {
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        super(errorStream);
        this.f15665f = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f15665f.disconnect();
    }
}
