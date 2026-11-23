package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vb1 implements ia1<ha1<JSONObject>> {

    /* JADX INFO: renamed from: a */
    public final JSONObject f20730a;

    public vb1(Context context) {
        this.f20730a = C2845aj.m5816b(context);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<ha1<JSONObject>> zza() {
        return cw0.m6231a(new ha1(this) { // from class: c.n.b.d.j.a.ub1

            /* JADX INFO: renamed from: a */
            public final vb1 f20258a;

            {
                this.f20258a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
            /* JADX INFO: renamed from: d */
            public final void mo5696d(Object obj) {
                vb1 vb1Var = this.f20258a;
                JSONObject jSONObject = (JSONObject) obj;
                Objects.requireNonNull(vb1Var);
                try {
                    jSONObject.put("gms_sdk_env", vb1Var.f20730a);
                } catch (JSONException unused) {
                    C2096e.m4590z("Failed putting version constants.");
                }
            }
        });
    }
}
