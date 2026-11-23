package p007c.p190n.p385d.p418r;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p691g.ArrayMap;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: c.n.d.r.w */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5497w {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f27101a;

    /* JADX INFO: renamed from: b */
    public final Context f27102b;

    /* JADX INFO: renamed from: c */
    public final Map<String, Long> f27103c = new ArrayMap();

    /* JADX INFO: renamed from: c.n.d.r.w$a */
    /* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final long f27104a = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int f27105b = 0;

        /* JADX INFO: renamed from: c */
        public final String f27106c;

        /* JADX INFO: renamed from: d */
        public final String f27107d;

        /* JADX INFO: renamed from: e */
        public final long f27108e;

        public a(String str, String str2, long j2) {
            this.f27106c = str;
            this.f27107d = str2;
            this.f27108e = j2;
        }

        /* JADX INFO: renamed from: a */
        public static String m12085a(String str, String str2, long j2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j2);
                return jSONObject.toString();
            } catch (JSONException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 24);
                sb.append("Failed to encode token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }

        /* JADX INFO: renamed from: b */
        public static a m12086b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String strValueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(strValueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
    }

    public C5497w(Context context) {
        boolean zIsEmpty;
        this.f27102b = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f27101a = sharedPreferences;
        Object obj = ContextCompat.f37815a;
        File file = new File(ContextCompat.c.m16142c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseInstanceId", "App restored, clearing state");
                m12083c();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String strValueOf = String.valueOf(e.getMessage());
                Log.d("FirebaseInstanceId", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m12081a(String str, String str2) {
        return outline.m1552C(new StringBuilder(String.valueOf(str).length() + 6), str, "|S|", "cre");
    }

    /* JADX INFO: renamed from: b */
    public final String m12082b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(str).length(), 4, String.valueOf(str2).length(), String.valueOf(str3).length()));
        outline.m1572W(sb, str, "|T|", str2, "|");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m12083c() {
        this.f27103c.clear();
        this.f27101a.edit().clear().commit();
    }

    /* JADX INFO: renamed from: d */
    public final long m12084d(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f27101a.contains(m12081a(str, "cre"))) {
            String string = this.f27101a.getString(m12081a(str, "cre"), null);
            if (string != null) {
                try {
                    return Long.parseLong(string);
                } catch (NumberFormatException unused) {
                }
            }
            return 0L;
        }
        SharedPreferences.Editor editorEdit = this.f27101a.edit();
        editorEdit.putString(m12081a(str, "cre"), String.valueOf(jCurrentTimeMillis));
        editorEdit.commit();
        return jCurrentTimeMillis;
    }
}
