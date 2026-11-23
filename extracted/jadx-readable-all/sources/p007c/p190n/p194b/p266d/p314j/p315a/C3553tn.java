package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.tn */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3553tn {

    /* JADX INFO: renamed from: b */
    public static boolean f19922b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f19923c = false;

    /* JADX INFO: renamed from: e */
    public final List<String> f19925e;

    /* JADX INFO: renamed from: a */
    public static final Object f19921a = new Object();

    /* JADX INFO: renamed from: d */
    public static final Set<String> f19924d = new HashSet(Arrays.asList(new String[0]));

    public C3553tn() {
        this(null);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8431d() {
        boolean z;
        synchronized (f19921a) {
            z = false;
            if (f19922b && f19923c) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: e */
    public static void m8432e(JsonWriter jsonWriter, Map<String, ?> map) throws IOException {
        if (map == null) {
            return;
        }
        jsonWriter.name("headers").beginArray();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!f19924d.contains(key)) {
                if (!(entry.getValue() instanceof List)) {
                    if (!(entry.getValue() instanceof String)) {
                        C2622l.m5408n3("Connection headers should be either Map<String, String> or Map<String, List<String>>");
                        break;
                    }
                    jsonWriter.beginObject();
                    jsonWriter.name("name").value(key);
                    jsonWriter.name("value").value((String) entry.getValue());
                    jsonWriter.endObject();
                } else {
                    for (String str : (List) entry.getValue()) {
                        jsonWriter.beginObject();
                        jsonWriter.name("name").value(key);
                        jsonWriter.name("value").value(str);
                        jsonWriter.endObject();
                    }
                }
            }
        }
        jsonWriter.endArray();
    }

    /* JADX INFO: renamed from: a */
    public final void m8433a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (m8431d()) {
            m8436f("onNetworkRequest", new C3368on(new String(httpURLConnection.getURL().toString()), new String(httpURLConnection.getRequestMethod()), httpURLConnection.getRequestProperties() == null ? null : new HashMap(httpURLConnection.getRequestProperties()), bArr));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m8434b(HttpURLConnection httpURLConnection, int i) {
        if (m8431d()) {
            String responseMessage = null;
            m8436f("onNetworkResponse", new C3405pn(i, httpURLConnection.getHeaderFields() == null ? null : new HashMap(httpURLConnection.getHeaderFields())));
            if (i < 200 || i >= 300) {
                try {
                    responseMessage = httpURLConnection.getResponseMessage();
                } catch (IOException e) {
                    String strValueOf = String.valueOf(e.getMessage());
                    C2622l.m5226A3(strValueOf.length() != 0 ? "Can not get error message from error HttpURLConnection\n".concat(strValueOf) : new String("Can not get error message from error HttpURLConnection\n"));
                }
                m8436f("onNetworkRequestError", new C3479rn(responseMessage));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8435c(String str) {
        if (m8431d() && str != null) {
            m8436f("onNetworkResponseBody", new C3442qn(str.getBytes()));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8436f(String str, InterfaceC3516sn interfaceC3516sn) {
        StringWriter stringWriter = new StringWriter();
        JsonWriter jsonWriter = new JsonWriter(stringWriter);
        try {
            jsonWriter.beginObject();
            jsonWriter.name("timestamp").value(System.currentTimeMillis());
            jsonWriter.name("event").value(str);
            jsonWriter.name("components").beginArray();
            Iterator<String> it = this.f19925e.iterator();
            while (it.hasNext()) {
                jsonWriter.value(it.next());
            }
            jsonWriter.endArray();
            interfaceC3516sn.mo8044a(jsonWriter);
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        } catch (IOException e) {
            C2622l.m5438t3("unable to log", e);
        }
        String string = stringWriter.toString();
        synchronized (C3553tn.class) {
            C2622l.m5458x3("GMA Debug BEGIN");
            int i = 0;
            while (i < string.length()) {
                int i2 = i + 4000;
                String strValueOf = String.valueOf(string.substring(i, Math.min(i2, string.length())));
                C2622l.m5458x3(strValueOf.length() != 0 ? "GMA Debug CONTENT ".concat(strValueOf) : new String("GMA Debug CONTENT "));
                i = i2;
            }
            C2622l.m5458x3("GMA Debug FINISH");
        }
    }

    public C3553tn(String str) {
        List<String> listAsList;
        if (m8431d()) {
            String[] strArr = new String[1];
            String strValueOf = String.valueOf(UUID.randomUUID().toString());
            strArr[0] = strValueOf.length() != 0 ? "network_request_".concat(strValueOf) : new String("network_request_");
            listAsList = Arrays.asList(strArr);
        } else {
            listAsList = new ArrayList<>();
        }
        this.f19925e = listAsList;
    }
}
