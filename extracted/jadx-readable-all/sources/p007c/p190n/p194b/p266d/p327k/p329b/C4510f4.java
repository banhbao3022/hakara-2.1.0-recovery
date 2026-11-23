package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.SharedPreferences;
import android.util.Pair;

/* JADX INFO: renamed from: c.n.b.d.k.b.f4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4510f4 extends AbstractC4675t5 {

    /* JADX INFO: renamed from: c */
    public static final Pair<String, Long> f23884c = new Pair<>("", 0L);

    /* JADX INFO: renamed from: A */
    public final C4582l4 f23885A;

    /* JADX INFO: renamed from: B */
    public final C4582l4 f23886B;

    /* JADX INFO: renamed from: C */
    public final C4558j4 f23887C;

    /* JADX INFO: renamed from: D */
    public final C4570k4 f23888D;

    /* JADX INFO: renamed from: d */
    public SharedPreferences f23889d;

    /* JADX INFO: renamed from: e */
    public C4594m4 f23890e;

    /* JADX INFO: renamed from: f */
    public final C4558j4 f23891f;

    /* JADX INFO: renamed from: g */
    public final C4558j4 f23892g;

    /* JADX INFO: renamed from: h */
    public final C4558j4 f23893h;

    /* JADX INFO: renamed from: i */
    public final C4558j4 f23894i;

    /* JADX INFO: renamed from: j */
    public final C4558j4 f23895j;

    /* JADX INFO: renamed from: k */
    public final C4558j4 f23896k;

    /* JADX INFO: renamed from: l */
    public final C4558j4 f23897l;

    /* JADX INFO: renamed from: m */
    public final C4582l4 f23898m;

    /* JADX INFO: renamed from: n */
    public String f23899n;

    /* JADX INFO: renamed from: o */
    public boolean f23900o;

    /* JADX INFO: renamed from: p */
    public long f23901p;

    /* JADX INFO: renamed from: q */
    public final C4558j4 f23902q;

    /* JADX INFO: renamed from: r */
    public final C4558j4 f23903r;

    /* JADX INFO: renamed from: s */
    public final C4534h4 f23904s;

    /* JADX INFO: renamed from: t */
    public final C4582l4 f23905t;

    /* JADX INFO: renamed from: u */
    public final C4534h4 f23906u;

    /* JADX INFO: renamed from: v */
    public final C4558j4 f23907v;

    /* JADX INFO: renamed from: w */
    public boolean f23908w;

    /* JADX INFO: renamed from: x */
    public C4534h4 f23909x;

    /* JADX INFO: renamed from: y */
    public C4534h4 f23910y;

    /* JADX INFO: renamed from: z */
    public C4558j4 f23911z;

    public C4510f4(C4707w4 c4707w4) {
        super(c4707w4);
        this.f23891f = new C4558j4(this, "last_upload", 0L);
        this.f23892g = new C4558j4(this, "last_upload_attempt", 0L);
        this.f23893h = new C4558j4(this, "backoff", 0L);
        this.f23894i = new C4558j4(this, "last_delete_stale", 0L);
        this.f23902q = new C4558j4(this, "time_before_start", 10000L);
        this.f23903r = new C4558j4(this, "session_timeout", 1800000L);
        this.f23904s = new C4534h4(this, "start_new_session", true);
        this.f23907v = new C4558j4(this, "last_pause_time", 0L);
        this.f23905t = new C4582l4(this, "non_personalized_ads", null);
        this.f23906u = new C4534h4(this, "allow_remote_dynamite", false);
        this.f23895j = new C4558j4(this, "midnight_offset", 0L);
        this.f23896k = new C4558j4(this, "first_open_time", 0L);
        this.f23897l = new C4558j4(this, "app_install_time", 0L);
        this.f23898m = new C4582l4(this, "app_instance_id", null);
        this.f23909x = new C4534h4(this, "app_backgrounded", false);
        this.f23910y = new C4534h4(this, "deep_link_retrieval_complete", false);
        this.f23911z = new C4558j4(this, "deep_link_retrieval_attempts", 0L);
        this.f23885A = new C4582l4(this, "firebase_feature_rollouts", null);
        this.f23886B = new C4582l4(this, "deferred_attribution_cache", null);
        this.f23887C = new C4558j4(this, "deferred_attribution_cache_timestamp", 0L);
        this.f23888D = new C4570k4(this, "default_event_parameters", null);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: h */
    public final void mo10532h() {
        SharedPreferences sharedPreferences = this.f24476a.f24528b.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f23889d = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.f23908w = z;
        if (!z) {
            SharedPreferences.Editor editorEdit = this.f23889d.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f23890e = new C4594m4(this, "health_monitor", Math.max(0L, C4647r.f24341c.m10638a(null).longValue()), null);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.AbstractC4675t5
    /* JADX INFO: renamed from: r */
    public final boolean mo10533r() {
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final void m10534s(Boolean bool) {
        mo10381b();
        SharedPreferences.Editor editorEdit = m10538w().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m10535t(int i) {
        return C4481d.m10486e(i, m10538w().getInt("consent_source", 100));
    }

    /* JADX INFO: renamed from: u */
    public final boolean m10536u(long j2) {
        return j2 - this.f23903r.m10610a() > this.f23907v.m10610a();
    }

    /* JADX INFO: renamed from: v */
    public final void m10537v(boolean z) {
        mo10381b();
        mo10684l().f24426n.m10812b("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor editorEdit = m10538w().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: w */
    public final SharedPreferences m10538w() {
        mo10381b();
        m10763k();
        return this.f23889d;
    }

    /* JADX INFO: renamed from: x */
    public final Boolean m10539x() {
        mo10381b();
        if (m10538w().contains("measurement_enabled")) {
            return Boolean.valueOf(m10538w().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public final C4481d m10540y() {
        mo10381b();
        return C4481d.m10484b(m10538w().getString("consent_settings", "G1"));
    }
}
