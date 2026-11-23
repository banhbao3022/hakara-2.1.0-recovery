package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.wp */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3667wp {

    /* JADX INFO: renamed from: a */
    public final boolean f21282a;

    /* JADX INFO: renamed from: b */
    public final int f21283b;

    /* JADX INFO: renamed from: c */
    public final int f21284c;

    /* JADX INFO: renamed from: d */
    public final int f21285d;

    /* JADX INFO: renamed from: e */
    public final int f21286e;

    /* JADX INFO: renamed from: f */
    public final int f21287f;

    /* JADX INFO: renamed from: g */
    public final int f21288g;

    /* JADX INFO: renamed from: h */
    public final int f21289h;

    /* JADX INFO: renamed from: i */
    public final boolean f21290i;

    /* JADX INFO: renamed from: j */
    public final int f21291j;

    /* JADX INFO: renamed from: k */
    public final boolean f21292k;

    public C3667wp(String str) {
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f21282a = m8664a(jSONObject, "aggressive_media_codec_release", C3052g3.f14149A);
        this.f21283b = m8665b(jSONObject, "byte_buffer_precache_limit", C3052g3.f14352g);
        this.f21284c = m8665b(jSONObject, "exo_cache_buffer_size", C3052g3.f14415p);
        this.f21285d = m8665b(jSONObject, "exo_connect_timeout_millis", C3052g3.f14324c);
        AbstractC3718y2<String> abstractC3718y2 = C3052g3.f14317b;
        if (jSONObject != null) {
            try {
                jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
        }
        this.f21286e = m8665b(jSONObject, "exo_read_timeout_millis", C3052g3.f14331d);
        this.f21287f = m8665b(jSONObject, "load_check_interval_bytes", C3052g3.f14338e);
        this.f21288g = m8665b(jSONObject, "player_precache_limit", C3052g3.f14345f);
        this.f21289h = m8665b(jSONObject, "socket_receive_buffer_size", C3052g3.f14359h);
        this.f21290i = m8664a(jSONObject, "use_cache_data_source", C3052g3.f14362h2);
        this.f21291j = m8665b(jSONObject, "min_retry_count", C3052g3.f14373j);
        this.f21292k = m8664a(jSONObject, "treat_load_exception_as_non_fatal", C3052g3.f14394m);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m8664a(JSONObject jSONObject, String str, AbstractC3718y2<Boolean> abstractC3718y2) {
        boolean zBooleanValue = ((Boolean) C2862b.f12493a.f12496d.m6596a(abstractC3718y2)).booleanValue();
        if (jSONObject == null) {
            return zBooleanValue;
        }
        try {
            return jSONObject.getBoolean(str);
        } catch (JSONException unused) {
            return zBooleanValue;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m8665b(JSONObject jSONObject, String str, AbstractC3718y2<Integer> abstractC3718y2) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) C2862b.f12493a.f12496d.m6596a(abstractC3718y2)).intValue();
    }
}
