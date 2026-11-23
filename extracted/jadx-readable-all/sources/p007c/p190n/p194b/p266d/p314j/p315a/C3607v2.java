package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.v2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3607v2 extends AbstractC3718y2<Long> {
    public C3607v2(String str, Long l) {
        super(1, str, l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: a */
    public final Long mo8391a(Bundle bundle) {
        String str = this.f21731b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (Long) this.f21732c;
        }
        String str2 = this.f21731b;
        return Long.valueOf(bundle.getLong(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: b */
    public final void mo8392b(SharedPreferences.Editor editor, Long l) {
        editor.putLong(this.f21731b, l.longValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: c */
    public final Long mo8393c(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(this.f21731b, ((Long) this.f21732c).longValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: d */
    public final Long mo8394d(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(this.f21731b, ((Long) this.f21732c).longValue()));
    }
}
