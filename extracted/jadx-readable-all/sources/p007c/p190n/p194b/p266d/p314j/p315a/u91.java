package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class u91 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final String f20246a;

    /* JADX INFO: renamed from: b */
    public final String f20247b;

    /* JADX INFO: renamed from: c */
    public final String f20248c;

    /* JADX INFO: renamed from: d */
    public final String f20249d;

    /* JADX INFO: renamed from: e */
    public final Long f20250e;

    public u91(String str, String str2, String str3, String str4, Long l) {
        this.f20246a = str;
        this.f20247b = str2;
        this.f20248c = str3;
        this.f20249d = str4;
        this.f20250e = l;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        Bundle bundle2 = bundle;
        String str = this.f20246a;
        if (str != null) {
            bundle2.putString("gmp_app_id", str);
        }
        String str2 = this.f20247b;
        if (str2 != null) {
            bundle2.putString("fbs_aiid", str2);
        }
        String str3 = this.f20248c;
        if (str3 != null) {
            bundle2.putString("fbs_aeid", str3);
        }
        String str4 = this.f20249d;
        if (str4 != null) {
            bundle2.putString("apm_id_origin", str4);
        }
        Long l = this.f20250e;
        if (l != null) {
            bundle2.putLong("sai_timeout", l.longValue());
        }
    }
}
