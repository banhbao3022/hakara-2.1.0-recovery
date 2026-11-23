package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.wn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3665wn implements InterfaceC3294mn {

    /* JADX INFO: renamed from: a */
    public final String f21265a;

    public C3665wn() {
        this.f21265a = null;
    }

    public C3665wn(String str) {
        this.f21265a = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3294mn
    /* JADX INFO: renamed from: f */
    public final void mo4730f(String str) {
        try {
            String strValueOf = String.valueOf(str);
            C2622l.m5318U2(strValueOf.length() != 0 ? "Pinging URL: ".concat(strValueOf) : new String("Pinging URL: "));
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                C3331nn c3331nn = gx2.f14692a.f14693b;
                String str2 = this.f21265a;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                C3553tn c3553tn = new C3553tn(null);
                c3553tn.m8433a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                c3553tn.m8434b(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
                    sb.append("Received non-success response code ");
                    sb.append(responseCode);
                    sb.append(" from pinging URL: ");
                    sb.append(str);
                    C2622l.m5226A3(sb.toString());
                }
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e) {
            e = e;
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message).length());
            sb2.append("Error while pinging URL: ");
            sb2.append(str);
            sb2.append(". ");
            sb2.append(message);
            C2622l.m5226A3(sb2.toString());
        } catch (IndexOutOfBoundsException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(message2).length());
            sb3.append("Error while parsing ping URL: ");
            sb3.append(str);
            sb3.append(". ");
            sb3.append(message2);
            C2622l.m5226A3(sb3.toString());
        } catch (RuntimeException e3) {
            e = e3;
            String message3 = e.getMessage();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 27 + String.valueOf(message3).length());
            sb4.append("Error while pinging URL: ");
            sb4.append(str);
            sb4.append(". ");
            sb4.append(message3);
            C2622l.m5226A3(sb4.toString());
        }
    }
}
