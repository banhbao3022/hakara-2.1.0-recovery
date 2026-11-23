package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;
import java.util.Set;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ur1 extends or1 {

    /* JADX INFO: renamed from: f */
    public ls1<Integer> f20412f;

    /* JADX INFO: renamed from: g */
    public ls1<Integer> f20413g;

    /* JADX INFO: renamed from: h */
    public C3743yr f20414h;

    /* JADX INFO: renamed from: i */
    public HttpURLConnection f20415i;

    public ur1() {
        ls1<Integer> ls1Var = qr1.f18421a;
        ls1<Integer> ls1Var2 = rr1.f19051a;
        this.f20412f = ls1Var;
        this.f20413g = ls1Var2;
        this.f20414h = null;
    }

    /* JADX INFO: renamed from: a */
    public final HttpURLConnection m8518a(C3743yr c3743yr, int i) throws IOException {
        ls1<Integer> ls1Var = new ls1() { // from class: c.n.b.d.j.a.sr1
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ls1
            public final Object zza() {
                return 265;
            }
        };
        this.f20412f = ls1Var;
        this.f20413g = new ls1() { // from class: c.n.b.d.j.a.tr1
            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ls1
            public final Object zza() {
                return -1;
            }
        };
        this.f20414h = c3743yr;
        ls1Var.zza().intValue();
        this.f20413g.zza().intValue();
        nr1 nr1Var = pr1.f18084a;
        C3743yr c3743yr2 = this.f20414h;
        Objects.requireNonNull(c3743yr2);
        String str = c3743yr2.f21978a;
        Set<String> set = C3780zr.f22390i;
        C3184jo c3184jo = C2330u.f10884a.f10901p;
        int iIntValue = ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14436s)).intValue();
        URL url = new URL(str);
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
            uRLConnectionOpenConnection.setReadTimeout(iIntValue);
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            C3553tn c3553tn = new C3553tn(null);
            c3553tn.m8433a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            c3553tn.m8434b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f20415i = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
            }
            C2622l.m5318U2(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f20415i;
        nr1 nr1Var = pr1.f18084a;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
