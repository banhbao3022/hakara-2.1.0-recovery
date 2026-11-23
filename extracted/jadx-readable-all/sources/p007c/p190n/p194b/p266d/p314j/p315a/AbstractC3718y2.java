package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.y2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3718y2<T> {

    /* JADX INFO: renamed from: a */
    public final int f21730a;

    /* JADX INFO: renamed from: b */
    public final String f21731b;

    /* JADX INFO: renamed from: c */
    public final T f21732c;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC3718y2(int i, String str, Object obj) {
        this.f21730a = i;
        this.f21731b = str;
        this.f21732c = obj;
        C2862b.f12493a.f12494b.f22156a.add(this);
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC3718y2<Boolean> m8764e(int i, String str, Boolean bool) {
        return new C3532t2(i, str, bool);
    }

    /* JADX INFO: renamed from: f */
    public static AbstractC3718y2<Integer> m8765f(int i, String str, int i2) {
        return new C3569u2(str, Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC3718y2<Long> m8766g(int i, String str, long j2) {
        return new C3607v2(str, Long.valueOf(j2));
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC3718y2<Float> m8767h(int i, String str, float f) {
        return new C3644w2(str, Float.valueOf(f));
    }

    /* JADX INFO: renamed from: i */
    public static AbstractC3718y2<String> m8768i(int i, String str, String str2) {
        return new C3681x2(str, str2);
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC3718y2 m8769j(int i) {
        C3681x2 c3681x2 = new C3681x2("gads:sdk_core_constants:experiment_id", null);
        C2862b.f12493a.f12494b.f22157b.add(c3681x2);
        return c3681x2;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo8391a(Bundle bundle);

    /* JADX INFO: renamed from: b */
    public abstract void mo8392b(SharedPreferences.Editor editor, T t);

    /* JADX INFO: renamed from: c */
    public abstract T mo8393c(JSONObject jSONObject);

    /* JADX INFO: renamed from: d */
    public abstract T mo8394d(SharedPreferences sharedPreferences);
}
