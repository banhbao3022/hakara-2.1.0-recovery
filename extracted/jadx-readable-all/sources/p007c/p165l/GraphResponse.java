package p007c.p165l;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p007c.p165l.p178k0.Logger3;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.w, reason: use source file name */
/* JADX INFO: compiled from: GraphResponse.java */
/* JADX INFO: loaded from: classes.dex */
public class GraphResponse {

    /* JADX INFO: renamed from: a */
    public static final String f5406a = "w";

    /* JADX INFO: renamed from: b */
    public final HttpURLConnection f5407b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f5408c;

    /* JADX INFO: renamed from: d */
    public final FacebookRequestError f5409d;

    public GraphResponse(GraphRequest2 graphRequest2, HttpURLConnection httpURLConnection, FacebookRequestError facebookRequestError) {
        this.f5407b = httpURLConnection;
        this.f5408c = null;
        this.f5409d = facebookRequestError;
    }

    /* JADX INFO: renamed from: a */
    public static List<GraphResponse> m2704a(List<GraphRequest2> list, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new GraphResponse(list.get(i), httpURLConnection, new FacebookRequestError(httpURLConnection, facebookException)));
        }
        return arrayList;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5601. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: b */
    public static p007c.p165l.GraphResponse m2705b(p007c.p165l.GraphRequest2 r23, java.net.HttpURLConnection r24, java.lang.Object r25, java.lang.Object r26) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p165l.GraphResponse.m2705b(c.l.s, java.net.HttpURLConnection, java.lang.Object, java.lang.Object):c.l.w");
    }

    /* JADX INFO: renamed from: c */
    public static List<GraphResponse> m2706c(InputStream inputStream, HttpURLConnection httpURLConnection, GraphRequestBatch graphRequestBatch) throws Throwable {
        Object obj;
        String strM2436I = Utility.m2436I(inputStream);
        strM2436I.length();
        HashMap<String, String> map = Logger3.f5043a;
        synchronized (FacebookSdk.f5352a) {
        }
        Object objNextValue = new JSONTokener(strM2436I).nextValue();
        int size = graphRequestBatch.size();
        ArrayList arrayList = new ArrayList(size);
        if (size == 1) {
            GraphRequest2 graphRequest2 = (GraphRequest2) graphRequestBatch.get(0);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("body", objNextValue);
                jSONObject.put("code", httpURLConnection.getResponseCode());
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                obj = jSONArray;
            } catch (IOException e) {
                arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e)));
                obj = objNextValue;
            } catch (JSONException e2) {
                arrayList.add(new GraphResponse(graphRequest2, httpURLConnection, new FacebookRequestError(httpURLConnection, e2)));
                obj = objNextValue;
            }
        } else {
            obj = objNextValue;
        }
        if (obj instanceof JSONArray) {
            JSONArray jSONArray2 = (JSONArray) obj;
            if (jSONArray2.length() == size) {
                for (int i = 0; i < jSONArray2.length(); i++) {
                    GraphRequest2 graphRequest3 = (GraphRequest2) graphRequestBatch.get(i);
                    try {
                        arrayList.add(m2705b(graphRequest3, httpURLConnection, jSONArray2.get(i), objNextValue));
                    } catch (FacebookException e3) {
                        arrayList.add(new GraphResponse(graphRequest3, httpURLConnection, new FacebookRequestError(httpURLConnection, e3)));
                    } catch (JSONException e4) {
                        arrayList.add(new GraphResponse(graphRequest3, httpURLConnection, new FacebookRequestError(httpURLConnection, e4)));
                    }
                }
                strM2436I.length();
                HashMap<String, String> map2 = Logger3.f5043a;
                synchronized (FacebookSdk.f5352a) {
                }
                return arrayList;
            }
        }
        throw new FacebookException("Unexpected number of results");
    }

    public String toString() {
        String str;
        try {
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            HttpURLConnection httpURLConnection = this.f5407b;
            objArr[0] = Integer.valueOf(httpURLConnection != null ? httpURLConnection.getResponseCode() : 200);
            str = String.format(locale, "%d", objArr);
        } catch (IOException unused) {
            str = "unknown";
        }
        return "{Response:  responseCode: " + str + ", graphObject: " + this.f5408c + ", error: " + this.f5409d + "}";
    }

    public GraphResponse(GraphRequest2 graphRequest2, HttpURLConnection httpURLConnection, String str, JSONArray jSONArray) {
        this.f5407b = httpURLConnection;
        this.f5408c = null;
        this.f5409d = null;
    }

    public GraphResponse(GraphRequest2 graphRequest2, HttpURLConnection httpURLConnection, String str, JSONObject jSONObject) {
        this.f5407b = httpURLConnection;
        this.f5408c = jSONObject;
        this.f5409d = null;
    }
}
