package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.w2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3644w2 extends AbstractC3718y2<Float> {
    public C3644w2(String str, Float f) {
        super(1, str, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: a */
    public final Float mo8391a(Bundle bundle) {
        String str = this.f21731b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (Float) this.f21732c;
        }
        String str2 = this.f21731b;
        return Float.valueOf(bundle.getFloat(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: b */
    public final void mo8392b(SharedPreferences.Editor editor, Float f) {
        editor.putFloat(this.f21731b, f.floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: c */
    public final Float mo8393c(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(this.f21731b, ((Float) this.f21732c).floatValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: d */
    public final Float mo8394d(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(this.f21731b, ((Float) this.f21732c).floatValue()));
    }
}
