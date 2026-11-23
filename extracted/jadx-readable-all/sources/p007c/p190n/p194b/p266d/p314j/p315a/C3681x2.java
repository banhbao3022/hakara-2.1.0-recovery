package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.x2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3681x2 extends AbstractC3718y2<String> {
    public C3681x2(String str, String str2) {
        super(1, str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: a */
    public final String mo8391a(Bundle bundle) {
        String str = this.f21731b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (String) this.f21732c;
        }
        String str2 = this.f21731b;
        return bundle.getString(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag."));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: b */
    public final void mo8392b(SharedPreferences.Editor editor, String str) {
        editor.putString(this.f21731b, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: c */
    public final String mo8393c(JSONObject jSONObject) {
        return jSONObject.optString(this.f21731b, (String) this.f21732c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: d */
    public final String mo8394d(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(this.f21731b, (String) this.f21732c);
    }
}
