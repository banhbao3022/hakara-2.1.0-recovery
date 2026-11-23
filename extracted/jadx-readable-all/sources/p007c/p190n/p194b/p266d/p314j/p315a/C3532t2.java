package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.t2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3532t2 extends AbstractC3718y2<Boolean> {
    public C3532t2(int i, String str, Boolean bool) {
        super(i, str, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: a */
    public final Boolean mo8391a(Bundle bundle) {
        String str = this.f21731b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (Boolean) this.f21732c;
        }
        String str2 = this.f21731b;
        return Boolean.valueOf(bundle.getBoolean(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: b */
    public final void mo8392b(SharedPreferences.Editor editor, Boolean bool) {
        editor.putBoolean(this.f21731b, bool.booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: c */
    public final Boolean mo8393c(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(this.f21731b, ((Boolean) this.f21732c).booleanValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: d */
    public final Boolean mo8394d(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(this.f21731b, ((Boolean) this.f21732c).booleanValue()));
    }
}
