package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2849an;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3164j4;
import p007c.p190n.p194b.p266d.p314j.p315a.iq2;
import p007c.p190n.p194b.p266d.p314j.p315a.kv1;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.z0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2311z0 implements InterfaceC2305w0 {

    /* JADX INFO: renamed from: b */
    public boolean f10806b;

    /* JADX INFO: renamed from: d */
    public kv1<?> f10808d;

    /* JADX INFO: renamed from: f */
    public SharedPreferences f10810f;

    /* JADX INFO: renamed from: g */
    public SharedPreferences.Editor f10811g;

    /* JADX INFO: renamed from: i */
    public String f10813i;

    /* JADX INFO: renamed from: j */
    public String f10814j;

    /* JADX INFO: renamed from: a */
    public final Object f10805a = new Object();

    /* JADX INFO: renamed from: c */
    public final List<Runnable> f10807c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public iq2 f10809e = null;

    /* JADX INFO: renamed from: h */
    public boolean f10812h = true;

    /* JADX INFO: renamed from: k */
    public boolean f10815k = true;

    /* JADX INFO: renamed from: l */
    public C2849an f10816l = new C2849an("", 0);

    /* JADX INFO: renamed from: m */
    public long f10817m = 0;

    /* JADX INFO: renamed from: n */
    public long f10818n = 0;

    /* JADX INFO: renamed from: o */
    public int f10819o = -1;

    /* JADX INFO: renamed from: p */
    public int f10820p = 0;

    /* JADX INFO: renamed from: q */
    public Set<String> f10821q = Collections.emptySet();

    /* JADX INFO: renamed from: r */
    public JSONObject f10822r = new JSONObject();

    /* JADX INFO: renamed from: s */
    public boolean f10823s = true;

    /* JADX INFO: renamed from: t */
    public boolean f10824t = true;

    /* JADX INFO: renamed from: u */
    public String f10825u = null;

    /* JADX INFO: renamed from: v */
    public String f10826v = "";

    /* JADX INFO: renamed from: w */
    public int f10827w = -1;

    /* JADX INFO: renamed from: x */
    public int f10828x = -1;

    /* JADX INFO: renamed from: y */
    public long f10829y = 0;

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: B */
    public final JSONObject mo4809B() {
        JSONObject jSONObject;
        m4831a();
        synchronized (this.f10805a) {
            jSONObject = this.f10822r;
        }
        return jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: N */
    public final void mo4810N() {
        m4831a();
        synchronized (this.f10805a) {
            this.f10822r = new JSONObject();
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: O */
    public final boolean mo4811O() {
        boolean z;
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14381k0)).booleanValue()) {
            return false;
        }
        m4831a();
        synchronized (this.f10805a) {
            z = this.f10815k;
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public final void m4831a() {
        kv1<?> kv1Var = this.f10808d;
        if (kv1Var == null || kv1Var.isDone()) {
            return;
        }
        try {
            this.f10808d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C2622l.m5241D3("Interrupted while waiting for preferences loaded.", e);
        } catch (CancellationException e2) {
            e = e2;
            C2622l.m5438t3("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e3) {
            e = e3;
            C2622l.m5438t3("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e4) {
            e = e4;
            C2622l.m5438t3("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: a0 */
    public final void mo4812a0(boolean z) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10824t == z) {
                return;
            }
            this.f10824t = z;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4832b() {
        C2962do.f13330a.execute(new Runnable(this) { // from class: c.n.b.d.a.z.b.y0

            /* JADX INFO: renamed from: f */
            public final C2311z0 f10801f;

            {
                this.f10801f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f10801f.m4834d();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final void m4833c(final Context context) {
        synchronized (this.f10805a) {
            if (this.f10810f != null) {
                return;
            }
            this.f10808d = C2962do.f13330a.mo6692x0(new Runnable(this, context) { // from class: c.n.b.d.a.z.b.x0

                /* JADX INFO: renamed from: f */
                public final C2311z0 f10797f;

                /* JADX INFO: renamed from: g */
                public final Context f10798g;

                {
                    this.f10797f = this;
                    this.f10798g = context;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C2311z0 c2311z0 = this.f10797f;
                    Context context2 = this.f10798g;
                    Objects.requireNonNull(c2311z0);
                    SharedPreferences sharedPreferences = context2.getSharedPreferences("admob", 0);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    synchronized (c2311z0.f10805a) {
                        c2311z0.f10810f = sharedPreferences;
                        c2311z0.f10811g = editorEdit;
                        if (Build.VERSION.SDK_INT >= 23) {
                            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                        }
                        c2311z0.f10812h = c2311z0.f10810f.getBoolean("use_https", c2311z0.f10812h);
                        c2311z0.f10823s = c2311z0.f10810f.getBoolean("content_url_opted_out", c2311z0.f10823s);
                        c2311z0.f10813i = c2311z0.f10810f.getString("content_url_hashes", c2311z0.f10813i);
                        c2311z0.f10815k = c2311z0.f10810f.getBoolean("gad_idless", c2311z0.f10815k);
                        c2311z0.f10824t = c2311z0.f10810f.getBoolean("content_vertical_opted_out", c2311z0.f10824t);
                        c2311z0.f10814j = c2311z0.f10810f.getString("content_vertical_hashes", c2311z0.f10814j);
                        c2311z0.f10820p = c2311z0.f10810f.getInt("version_code", c2311z0.f10820p);
                        c2311z0.f10816l = new C2849an(c2311z0.f10810f.getString("app_settings_json", c2311z0.f10816l.f12217e), c2311z0.f10810f.getLong("app_settings_last_update_ms", c2311z0.f10816l.f12218f));
                        c2311z0.f10817m = c2311z0.f10810f.getLong("app_last_background_time_ms", c2311z0.f10817m);
                        c2311z0.f10819o = c2311z0.f10810f.getInt("request_in_session_count", c2311z0.f10819o);
                        c2311z0.f10818n = c2311z0.f10810f.getLong("first_ad_req_time_ms", c2311z0.f10818n);
                        c2311z0.f10821q = c2311z0.f10810f.getStringSet("never_pool_slots", c2311z0.f10821q);
                        c2311z0.f10825u = c2311z0.f10810f.getString("display_cutout", c2311z0.f10825u);
                        c2311z0.f10827w = c2311z0.f10810f.getInt("app_measurement_npa", c2311z0.f10827w);
                        c2311z0.f10828x = c2311z0.f10810f.getInt("sd_app_measure_npa", c2311z0.f10828x);
                        c2311z0.f10829y = c2311z0.f10810f.getLong("sd_app_measure_npa_ts", c2311z0.f10829y);
                        c2311z0.f10826v = c2311z0.f10810f.getString("inspector_info", c2311z0.f10826v);
                        try {
                            c2311z0.f10822r = new JSONObject(c2311z0.f10810f.getString("native_advanced_settings", "{}"));
                        } catch (JSONException e) {
                            C2622l.m5241D3("Could not convert native advanced settings to json object", e);
                        }
                        c2311z0.m4832b();
                    }
                }
            });
            this.f10806b = true;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: c0 */
    public final void mo4813c0(int i) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10828x == i) {
                return;
            }
            this.f10828x = i;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    /* JADX INFO: renamed from: d */
    public final iq2 m4834d() {
        if (!this.f10806b) {
            return null;
        }
        if ((m4835e() && m4837g()) || !C3164j4.f15467b.m6603d().booleanValue()) {
            return null;
        }
        synchronized (this.f10805a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f10809e == null) {
                this.f10809e = new iq2();
            }
            iq2 iq2Var = this.f10809e;
            synchronized (iq2Var.f15342h) {
                if (iq2Var.f15340f) {
                    C2622l.m5318U2("Content hash thread already started, quiting...");
                } else {
                    iq2Var.f15340f = true;
                    iq2Var.start();
                }
            }
            C2622l.m5458x3("start fetching content...");
            return this.f10809e;
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m4835e() {
        boolean z;
        m4831a();
        synchronized (this.f10805a) {
            z = this.f10823s;
        }
        return z;
    }

    /* JADX INFO: renamed from: f */
    public final void m4836f(String str) {
        m4831a();
        synchronized (this.f10805a) {
            if (str.equals(this.f10813i)) {
                return;
            }
            this.f10813i = str;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m4837g() {
        boolean z;
        m4831a();
        synchronized (this.f10805a) {
            z = this.f10824t;
        }
        return z;
    }

    /* JADX INFO: renamed from: h */
    public final void m4838h(String str) {
        m4831a();
        synchronized (this.f10805a) {
            if (str.equals(this.f10814j)) {
                return;
            }
            this.f10814j = str;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    /* JADX INFO: renamed from: i */
    public final String m4839i() {
        String str;
        m4831a();
        synchronized (this.f10805a) {
            str = this.f10814j;
        }
        return str;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: j */
    public final int mo4814j() {
        int i;
        m4831a();
        synchronized (this.f10805a) {
            i = this.f10820p;
        }
        return i;
    }

    /* JADX INFO: renamed from: k */
    public final String m4840k() {
        String str;
        m4831a();
        synchronized (this.f10805a) {
            str = this.f10825u;
        }
        return str;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: l */
    public final long mo4815l() {
        long j2;
        m4831a();
        synchronized (this.f10805a) {
            j2 = this.f10817m;
        }
        return j2;
    }

    /* JADX INFO: renamed from: m */
    public final void m4841m(String str) {
        m4831a();
        synchronized (this.f10805a) {
            if (TextUtils.equals(this.f10825u, str)) {
                return;
            }
            this.f10825u = str;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: n0 */
    public final void mo4816n0(int i) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10820p == i) {
                return;
            }
            this.f10820p = i;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putInt("version_code", i);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: o0 */
    public final long mo4817o0() {
        long j2;
        m4831a();
        synchronized (this.f10805a) {
            j2 = this.f10829y;
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: p */
    public final C2849an mo4818p() {
        C2849an c2849an;
        m4831a();
        synchronized (this.f10805a) {
            c2849an = this.f10816l;
        }
        return c2849an;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: q */
    public final int mo4819q() {
        int i;
        m4831a();
        synchronized (this.f10805a) {
            i = this.f10819o;
        }
        return i;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: r */
    public final long mo4820r() {
        long j2;
        m4831a();
        synchronized (this.f10805a) {
            j2 = this.f10818n;
        }
        return j2;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: s0 */
    public final void mo4821s0(boolean z) {
        m4831a();
        synchronized (this.f10805a) {
            if (z == this.f10815k) {
                return;
            }
            this.f10815k = z;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: t0 */
    public final void mo4822t0(boolean z) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10823s == z) {
                return;
            }
            this.f10823s = z;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: u0 */
    public final void mo4823u0(long j2) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10818n == j2) {
                return;
            }
            this.f10818n = j2;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j2);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: v0 */
    public final void mo4824v0(String str, String str2, boolean z) {
        m4831a();
        synchronized (this.f10805a) {
            JSONArray jSONArrayOptJSONArray = this.f10822r.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject == null) {
                    return;
                }
                if (str2.equals(jSONObjectOptJSONObject.optString("template_id"))) {
                    if (z && jSONObjectOptJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i;
                    break;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z);
                jSONObject.put("timestamp_ms", C2330u.f10884a.f10896k.mo5623c());
                jSONArrayOptJSONArray.put(length, jSONObject);
                this.f10822r.put(str, jSONArrayOptJSONArray);
            } catch (JSONException e) {
                C2622l.m5241D3("Could not update native advanced settings", e);
            }
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f10822r.toString());
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: w0 */
    public final void mo4825w0(int i) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10819o == i) {
                return;
            }
            this.f10819o = i;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: x0 */
    public final void mo4826x0(long j2) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10829y == j2) {
                return;
            }
            this.f10829y = j2;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j2);
                this.f10811g.apply();
            }
            m4832b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0
    /* JADX INFO: renamed from: y0 */
    public final void mo4827y0(long j2) {
        m4831a();
        synchronized (this.f10805a) {
            if (this.f10817m == j2) {
                return;
            }
            this.f10817m = j2;
            SharedPreferences.Editor editor = this.f10811g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j2);
                this.f10811g.apply();
            }
            m4832b();
        }
    }
}
