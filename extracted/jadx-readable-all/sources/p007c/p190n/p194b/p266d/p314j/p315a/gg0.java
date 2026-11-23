package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2269i0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends hg0 {

    /* JADX INFO: renamed from: b */
    public final JSONObject f14571b;

    /* JADX INFO: renamed from: c */
    public final boolean f14572c;

    /* JADX INFO: renamed from: d */
    public final boolean f14573d;

    /* JADX INFO: renamed from: e */
    public final boolean f14574e;

    /* JADX INFO: renamed from: f */
    public final boolean f14575f;

    public gg0(rh1 rh1Var, JSONObject jSONObject) {
        super(rh1Var);
        this.f14571b = C2269i0.m4780h(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f14572c = C2269i0.m4781i(false, jSONObject, "allow_pub_owned_ad_view");
        this.f14573d = C2269i0.m4781i(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f14574e = C2269i0.m4781i(false, jSONObject, "enable_omid");
        this.f14575f = jSONObject.optJSONObject("overlay") != null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg0
    /* JADX INFO: renamed from: a */
    public final boolean mo6997a() {
        return this.f14575f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg0
    /* JADX INFO: renamed from: b */
    public final boolean mo6998b() {
        return this.f14572c;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg0
    /* JADX INFO: renamed from: c */
    public final boolean mo6999c() {
        return this.f14574e;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.hg0
    /* JADX INFO: renamed from: d */
    public final boolean mo7000d() {
        return this.f14573d;
    }
}
