package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y91 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final boolean f21816a;

    /* JADX INFO: renamed from: b */
    public final boolean f21817b;

    /* JADX INFO: renamed from: c */
    public final String f21818c;

    /* JADX INFO: renamed from: d */
    public final boolean f21819d;

    /* JADX INFO: renamed from: e */
    public final int f21820e;

    /* JADX INFO: renamed from: f */
    public final int f21821f;

    /* JADX INFO: renamed from: g */
    public final int f21822g;

    public y91(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f21816a = z;
        this.f21817b = z2;
        this.f21818c = str;
        this.f21819d = z3;
        this.f21820e = i;
        this.f21821f = i2;
        this.f21822g = i3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        bundle2.putString("js", this.f21818c);
        bundle2.putBoolean("is_nonagon", true);
        bundle2.putString("extra_caps", (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14222L1));
        bundle2.putInt("target_api", this.f21820e);
        bundle2.putInt("dv", this.f21821f);
        bundle2.putInt("lv", this.f21822g);
        Bundle bundle3 = bundle2.getBundle("sdk_env");
        if (bundle3 == null) {
            bundle3 = new Bundle();
        }
        bundle3.putBoolean("mf", C3423q4.f18189a.m6603d().booleanValue());
        bundle3.putBoolean("instant_app", this.f21816a);
        bundle3.putBoolean("lite", this.f21817b);
        bundle3.putBoolean("is_privileged_process", this.f21819d);
        bundle2.putBundle("sdk_env", bundle3);
        Bundle bundle4 = bundle3.getBundle("build_meta");
        if (bundle4 == null) {
            bundle4 = new Bundle();
        }
        bundle4.putString("cl", "367272508");
        bundle4.putString("rapid_rc", "dev");
        bundle4.putString("rapid_rollup", "HEAD");
        bundle3.putBundle("build_meta", bundle4);
    }
}
