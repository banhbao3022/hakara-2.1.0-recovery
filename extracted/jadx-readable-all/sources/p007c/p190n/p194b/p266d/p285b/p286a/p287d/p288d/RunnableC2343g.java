package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.AbstractC2632e;
import p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2685q;
import p007c.p190n.p194b.p266d.p298f.p304r.C2775a;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.g */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2343g implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final C2775a f10942f = new C2775a("RevokeAccessOperation", new String[0]);

    /* JADX INFO: renamed from: g */
    public final String f10943g;

    /* JADX INFO: renamed from: h */
    public final C2685q f10944h;

    public RunnableC2343g(String str) {
        C2622l.m5359e(str);
        this.f10943g = str;
        this.f10944h = new C2685q((AbstractC2632e) null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.f28650h;
        try {
            String strValueOf = String.valueOf(this.f10943g);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strValueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(strValueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f28648f;
            } else {
                f10942f.m5614b("Unable to revoke access!", new Object[0]);
            }
            C2775a c2775a = f10942f;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            c2775a.m5613a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            C2775a c2775a2 = f10942f;
            String strValueOf2 = String.valueOf(e.toString());
            c2775a2.m5614b(strValueOf2.length() != 0 ? "IOException when revoking access: ".concat(strValueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            C2775a c2775a3 = f10942f;
            String strValueOf3 = String.valueOf(e2.toString());
            c2775a3.m5614b(strValueOf3.length() != 0 ? "Exception when revoking access: ".concat(strValueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f10944h.mo4931a(status);
    }
}
