package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.u2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3569u2 extends AbstractC3718y2<Integer> {
    public C3569u2(String str, Integer num) {
        super(1, str, num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: a */
    public final Integer mo8391a(Bundle bundle) {
        String str = this.f21731b;
        if (!bundle.containsKey(str.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str) : new String("com.google.android.gms.ads.flag."))) {
            return (Integer) this.f21732c;
        }
        String str2 = this.f21731b;
        return Integer.valueOf(bundle.getInt(str2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(str2) : new String("com.google.android.gms.ads.flag.")));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: b */
    public final void mo8392b(SharedPreferences.Editor editor, Integer num) {
        editor.putInt(this.f21731b, num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: c */
    public final Integer mo8393c(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(this.f21731b, ((Integer) this.f21732c).intValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2
    /* JADX INFO: renamed from: d */
    public final Integer mo8394d(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(this.f21731b, ((Integer) this.f21732c).intValue()));
    }
}
