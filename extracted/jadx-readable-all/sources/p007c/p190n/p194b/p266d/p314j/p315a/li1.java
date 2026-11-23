package p007c.p190n.p194b.p266d.p314j.p315a;

import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class li1 {

    /* JADX INFO: renamed from: a */
    public final JSONObject f16368a;

    public li1(JSONObject jSONObject) {
        this.f16368a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final int m7588a() {
        int iOptInt = this.f16368a.optInt("media_type", -1);
        if (iOptInt != 0) {
            return iOptInt != 1 ? 3 : 1;
        }
        return 2;
    }
}
