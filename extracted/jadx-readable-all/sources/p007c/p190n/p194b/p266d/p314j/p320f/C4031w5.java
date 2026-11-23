package p007c.p190n.p194b.p266d.p314j.p320f;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2741k;
import p007c.p190n.p194b.p266d.p298f.p302q.C2751p;

/* JADX INFO: renamed from: c.n.b.d.j.f.w5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4031w5 {

    /* JADX INFO: renamed from: a */
    public static final C2518b f22970a = new C2518b("FeatureUsageAnalytics");

    /* JADX INFO: renamed from: b */
    public static final String f22971b;

    /* JADX INFO: renamed from: c */
    public static C4031w5 f22972c;

    /* JADX INFO: renamed from: d */
    public final C3889i0 f22973d;

    /* JADX INFO: renamed from: e */
    public final SharedPreferences f22974e;

    /* JADX INFO: renamed from: f */
    public final String f22975f;

    /* JADX INFO: renamed from: g */
    public final Runnable f22976g;

    /* JADX INFO: renamed from: h */
    public final Handler f22977h;

    /* JADX INFO: renamed from: i */
    public long f22978i;

    /* JADX INFO: renamed from: j */
    public Set<EnumC3811a2> f22979j;

    /* JADX INFO: renamed from: k */
    public Set<EnumC3811a2> f22980k;

    static {
        String str;
        InputStream resourceAsStream;
        String str2;
        String str3;
        C2751p c2751p = C2751p.f11894b;
        Objects.requireNonNull(c2751p);
        C2622l.m5364f("play-services-cast", "Please provide a valid libraryName");
        if (c2751p.f11895c.containsKey("play-services-cast")) {
            str3 = c2751p.f11895c.get("play-services-cast");
        } else {
            Properties properties = new Properties();
            InputStream inputStream = null;
            property = null;
            String property = null;
            try {
                try {
                    resourceAsStream = C2751p.class.getResourceAsStream(String.format("/%s.properties", "play-services-cast"));
                    try {
                        if (resourceAsStream != null) {
                            properties.load(resourceAsStream);
                            property = properties.getProperty("version", null);
                            C2741k c2741k = C2751p.f11893a;
                            StringBuilder sb = new StringBuilder("play-services-cast".length() + 12 + String.valueOf(property).length());
                            sb.append("play-services-cast");
                            sb.append(" version is ");
                            sb.append(property);
                            String string = sb.toString();
                            if (c2741k.m5601a(2)) {
                                String str4 = c2741k.f11885b;
                                if (str4 != null) {
                                    string = str4.concat(string);
                                }
                                Log.v("LibraryVersion", string);
                            }
                        } else {
                            C2741k c2741k2 = C2751p.f11893a;
                            String strConcat = "play-services-cast".length() != 0 ? "Failed to get app version for libraryName: ".concat("play-services-cast") : new String("Failed to get app version for libraryName: ");
                            if (c2741k2.m5601a(5)) {
                                String str5 = c2741k2.f11885b;
                                if (str5 != null) {
                                    strConcat = str5.concat(strConcat);
                                }
                                Log.w("LibraryVersion", strConcat);
                            }
                        }
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        inputStream = resourceAsStream;
                        str = null;
                        C2741k c2741k3 = C2751p.f11893a;
                        String strConcat2 = "play-services-cast".length() != 0 ? "Failed to get app version for libraryName: ".concat("play-services-cast") : new String("Failed to get app version for libraryName: ");
                        if (c2741k3.m5601a(6)) {
                            String str6 = c2741k3.f11885b;
                            if (str6 != null) {
                                strConcat2 = str6.concat(strConcat2);
                            }
                            Log.e("LibraryVersion", strConcat2, e);
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        property = str;
                    } catch (Throwable th) {
                        th = th;
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    resourceAsStream = null;
                }
            } catch (IOException e2) {
                e = e2;
                str = null;
            }
            if (property == null) {
                C2741k c2741k4 = C2751p.f11893a;
                if (c2741k4.m5601a(3)) {
                    String str7 = c2741k4.f11885b;
                    Log.d("LibraryVersion", str7 != null ? str7.concat(".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used") : ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                }
                str2 = "UNKNOWN";
            } else {
                str2 = property;
            }
            c2751p.f11895c.put("play-services-cast", str2);
            str3 = str2;
        }
        f22971b = str3;
    }

    public C4031w5(SharedPreferences sharedPreferences, C3889i0 c3889i0, String str) {
        EnumC3811a2 enumC3811a2M8923f;
        EnumC3811a2 enumC3811a2M8923f2;
        EnumC3811a2 enumC3811a2 = EnumC3811a2.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        this.f22979j = new HashSet();
        this.f22980k = new HashSet();
        this.f22974e = sharedPreferences;
        this.f22973d = c3889i0;
        this.f22975f = str;
        this.f22977h = new HandlerC4025w(Looper.getMainLooper());
        this.f22976g = new Runnable(this) { // from class: c.n.b.d.j.f.i8

            /* JADX INFO: renamed from: f */
            public final C4031w5 f22706f;

            {
                this.f22706f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4031w5 c4031w5 = this.f22706f;
                if (c4031w5.f22979j.isEmpty()) {
                    return;
                }
                long j2 = c4031w5.f22980k.equals(c4031w5.f22979j) ? 172800000L : 86400000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j3 = c4031w5.f22978i;
                if (j3 == 0 || jCurrentTimeMillis - j3 >= j2) {
                    C4031w5.f22970a.m5119a("Upload the feature usage report.", new Object[0]);
                    C4010u2.a aVarM9233p = C4010u2.m9233p();
                    String str2 = C4031w5.f22971b;
                    if (aVarM9233p.f23003h) {
                        aVarM9233p.m9324n();
                        aVarM9233p.f23003h = false;
                    }
                    C4010u2.m9232o((C4010u2) aVarM9233p.f23002g, str2);
                    String str3 = c4031w5.f22975f;
                    if (aVarM9233p.f23003h) {
                        aVarM9233p.m9324n();
                        aVarM9233p.f23003h = false;
                    }
                    C4010u2.m9231n((C4010u2) aVarM9233p.f23002g, str3);
                    C4010u2 c4010u2 = (C4010u2) ((AbstractC4057z4) aVarM9233p.m9326p());
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(c4031w5.f22979j);
                    C3981r2.a aVarM9205p = C3981r2.m9205p();
                    if (aVarM9205p.f23003h) {
                        aVarM9205p.m9324n();
                        aVarM9205p.f23003h = false;
                    }
                    C3981r2.m9204o((C3981r2) aVarM9205p.f23002g, arrayList);
                    if (aVarM9205p.f23003h) {
                        aVarM9205p.m9324n();
                        aVarM9205p.f23003h = false;
                    }
                    C3981r2.m9203n((C3981r2) aVarM9205p.f23002g, c4010u2);
                    C3981r2 c3981r2 = (C3981r2) ((AbstractC4057z4) aVarM9205p.m9326p());
                    C4055z2.a aVarM9312v = C4055z2.m9312v();
                    if (aVarM9312v.f23003h) {
                        aVarM9312v.m9324n();
                        aVarM9312v.f23003h = false;
                    }
                    C4055z2.m9308q((C4055z2) aVarM9312v.f23002g, c3981r2);
                    c4031w5.f22973d.m9038a((C4055z2) ((AbstractC4057z4) aVarM9312v.m9326p()), EnumC3860f1.API_USAGE_REPORT);
                    SharedPreferences.Editor editorEdit = c4031w5.f22974e.edit();
                    if (!c4031w5.f22980k.equals(c4031w5.f22979j)) {
                        HashSet hashSet = new HashSet(c4031w5.f22979j);
                        c4031w5.f22980k = hashSet;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String string = Integer.toString(((EnumC3811a2) it.next()).f22504K);
                            String strM9291c = c4031w5.m9291c(string);
                            String strM9289b = C4031w5.m9289b("feature_usage_timestamp_reported_feature_", string);
                            if (!TextUtils.equals(strM9291c, strM9289b)) {
                                long j4 = c4031w5.f22974e.getLong(strM9291c, 0L);
                                editorEdit.remove(strM9291c);
                                if (j4 != 0) {
                                    editorEdit.putLong(strM9289b, j4);
                                }
                            }
                        }
                    }
                    c4031w5.f22978i = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                }
            }
        };
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        this.f22979j = new HashSet();
        this.f22980k = new HashSet();
        this.f22978i = 0L;
        if (!f22971b.equals(string) || !str.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(str2);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            m9290a(hashSet);
            this.f22974e.edit().putString("feature_usage_sdk_version", f22971b).putString("feature_usage_package_name", this.f22975f).apply();
            return;
        }
        this.f22978i = sharedPreferences.getLong("feature_usage_last_report_time", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashSet hashSet2 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j2 = this.f22974e.getLong(str3, 0L);
                if (j2 != 0 && jCurrentTimeMillis - j2 > 1209600000) {
                    hashSet2.add(str3);
                } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                    try {
                        enumC3811a2M8923f = EnumC3811a2.m8923f(Integer.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused) {
                        enumC3811a2M8923f = enumC3811a2;
                    }
                    this.f22980k.add(enumC3811a2M8923f);
                    this.f22979j.add(enumC3811a2M8923f);
                } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                    try {
                        enumC3811a2M8923f2 = EnumC3811a2.m8923f(Integer.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused2) {
                        enumC3811a2M8923f2 = enumC3811a2;
                    }
                    this.f22979j.add(enumC3811a2M8923f2);
                }
            }
        }
        m9290a(hashSet2);
        this.f22977h.post(this.f22976g);
    }

    /* JADX INFO: renamed from: b */
    public static String m9289b(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final void m9290a(Set<String> set) {
        if (set.isEmpty()) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f22974e.edit();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            editorEdit.remove(it.next());
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: c */
    public final String m9291c(String str) {
        String strM9289b = m9289b("feature_usage_timestamp_reported_feature_", str);
        return this.f22974e.contains(strM9289b) ? strM9289b : m9289b("feature_usage_timestamp_detected_feature_", str);
    }
}
