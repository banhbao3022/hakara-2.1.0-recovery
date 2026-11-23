package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.i7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4549i7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final URL f23999f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC4513f7 f24000g;

    /* JADX INFO: renamed from: h */
    public final String f24001h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4525g7 f24002i;

    public RunnableC4549i7(C4525g7 c4525g7, String str, URL url, byte[] bArr, Map<String, String> map, InterfaceC4513f7 interfaceC4513f7) {
        this.f24002i = c4525g7;
        C2622l.m5359e(str);
        Objects.requireNonNull(url, "null reference");
        Objects.requireNonNull(interfaceC4513f7, "null reference");
        this.f23999f = url;
        this.f24000g = interfaceC4513f7;
        this.f24001h = str;
    }

    /* JADX INFO: renamed from: a */
    public final void m10599a(final int i, final Exception exc, final byte[] bArr, final Map<String, List<String>> map) {
        this.f24002i.mo10686n().m10758v(new Runnable(this, i, exc, bArr, map) { // from class: c.n.b.d.k.b.h7

            /* JADX INFO: renamed from: f */
            public final RunnableC4549i7 f23972f;

            /* JADX INFO: renamed from: g */
            public final int f23973g;

            /* JADX INFO: renamed from: h */
            public final Exception f23974h;

            /* JADX INFO: renamed from: i */
            public final byte[] f23975i;

            /* JADX INFO: renamed from: j */
            public final Map f23976j;

            {
                this.f23972f = this;
                this.f23973g = i;
                this.f23974h = exc;
                this.f23975i = bArr;
                this.f23976j = map;
            }

            @Override // java.lang.Runnable
            public final void run() {
                List<ResolveInfo> listQueryIntentActivities;
                RunnableC4549i7 runnableC4549i7 = this.f23972f;
                int i2 = this.f23973g;
                Exception exc2 = this.f23974h;
                byte[] bArr2 = this.f23975i;
                C4707w4 c4707w4 = ((C4740z4) runnableC4549i7.f24000g).f24621a;
                boolean z = true;
                if (!((i2 == 200 || i2 == 204 || i2 == 304) && exc2 == null)) {
                    c4707w4.mo10684l().f24421i.m10813c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), exc2);
                    return;
                }
                c4707w4.m10834k().f23910y.m10593a(true);
                if (bArr2.length == 0) {
                    c4707w4.mo10684l().f24425m.m10811a("Deferred Deep Link response empty.");
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(new String(bArr2));
                    String strOptString = jSONObject.optString("deeplink", "");
                    String strOptString2 = jSONObject.optString("gclid", "");
                    double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                    if (TextUtils.isEmpty(strOptString)) {
                        c4707w4.mo10684l().f24425m.m10811a("Deferred Deep Link is empty.");
                        return;
                    }
                    C4723x9 c4723x9M10837t = c4707w4.m10837t();
                    if (TextUtils.isEmpty(strOptString) || (listQueryIntentActivities = c4723x9M10837t.f24476a.f24528b.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0)) == null || listQueryIntentActivities.isEmpty()) {
                        z = false;
                    }
                    if (!z) {
                        c4707w4.mo10684l().f24421i.m10813c("Deferred Deep Link validation failed. gclid, deep link", strOptString2, strOptString);
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("gclid", strOptString2);
                    bundle.putString("_cis", "ddp");
                    c4707w4.f24543q.m10517H("auto", "_cmp", bundle);
                    C4723x9 c4723x9M10837t2 = c4707w4.m10837t();
                    if (TextUtils.isEmpty(strOptString) || !c4723x9M10837t2.m10887Y(strOptString, dOptDouble)) {
                        return;
                    }
                    c4723x9M10837t2.f24476a.f24528b.sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
                } catch (JSONException e) {
                    c4707w4.mo10684l().f24418f.m10812b("Failed to parse the Deferred Deep Link response. exception", e);
                }
            }
        });
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnectionM10587s;
        Map<String, List<String>> headerFields;
        this.f24002i.mo10380a();
        int responseCode = 0;
        try {
            httpURLConnectionM10587s = this.f24002i.m10587s(this.f23999f);
            try {
                responseCode = httpURLConnectionM10587s.getResponseCode();
                headerFields = httpURLConnectionM10587s.getHeaderFields();
                try {
                    byte[] bArrM10586t = C4525g7.m10586t(httpURLConnectionM10587s);
                    httpURLConnectionM10587s.disconnect();
                    m10599a(responseCode, null, bArrM10586t, headerFields);
                } catch (IOException e) {
                    e = e;
                    if (httpURLConnectionM10587s != null) {
                        httpURLConnectionM10587s.disconnect();
                    }
                    m10599a(responseCode, e, null, headerFields);
                } catch (Throwable th) {
                    th = th;
                    if (httpURLConnectionM10587s != null) {
                        httpURLConnectionM10587s.disconnect();
                    }
                    m10599a(responseCode, null, null, headerFields);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                headerFields = null;
            } catch (Throwable th2) {
                th = th2;
                headerFields = null;
            }
        } catch (IOException e3) {
            e = e3;
            httpURLConnectionM10587s = null;
            headerFields = null;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionM10587s = null;
            headerFields = null;
        }
    }
}
