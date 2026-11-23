package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class f71 implements ia1<g71> {

    /* JADX INFO: renamed from: a */
    public final lv1 f13983a;

    /* JADX INFO: renamed from: b */
    public final rm0 f13984b;

    /* JADX INFO: renamed from: c */
    public final String f13985c;

    /* JADX INFO: renamed from: d */
    public final ii1 f13986d;

    public f71(lv1 lv1Var, rm0 rm0Var, ii1 ii1Var, String str) {
        this.f13983a = lv1Var;
        this.f13984b = rm0Var;
        this.f13986d = ii1Var;
        this.f13985c = str;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ia1
    public final kv1<g71> zza() {
        return this.f13983a.mo6691u0(new Callable(this) { // from class: c.n.b.d.j.a.e71

            /* JADX INFO: renamed from: a */
            public final f71 f13526a;

            {
                this.f13526a = this;
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0052  */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                JSONObject jSONObject;
                f71 f71Var = this.f13526a;
                rm0 rm0Var = f71Var.f13984b;
                String str = f71Var.f13986d.f15193f;
                String str2 = f71Var.f13985c;
                Objects.requireNonNull(rm0Var);
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14300Y1;
                C2862b c2862b = C2862b.f12493a;
                if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() || str == null || str2 == null) {
                    jSONObject = null;
                } else {
                    if (!rm0Var.f18953d) {
                        rm0Var.m8296a();
                    }
                    Map<String, JSONObject> map = rm0Var.f18950a.get(str2);
                    if (map != null) {
                        jSONObject = map.get(str);
                        if (jSONObject == null) {
                            String strM5288N0 = C2622l.m5288N0(rm0Var.f18954e, str, str2);
                            if (strM5288N0 == null) {
                                jSONObject = null;
                            } else {
                                jSONObject = map.get(strM5288N0);
                            }
                        }
                    } else {
                        jSONObject = null;
                    }
                }
                rm0 rm0Var2 = f71Var.f13984b;
                Objects.requireNonNull(rm0Var2);
                return new g71(jSONObject, ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14306Z1)).booleanValue() ? rm0Var2.f18951b : null);
            }
        });
    }
}
