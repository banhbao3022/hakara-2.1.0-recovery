package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rq0 implements l60, z80, y70 {

    /* JADX INFO: renamed from: f */
    public final br0 f19026f;

    /* JADX INFO: renamed from: g */
    public final String f19027g;

    /* JADX INFO: renamed from: h */
    public int f19028h = 0;

    /* JADX INFO: renamed from: i */
    public qq0 f19029i = qq0.AD_REQUESTED;

    /* JADX INFO: renamed from: j */
    public a60 f19030j;

    /* JADX INFO: renamed from: k */
    public yv2 f19031k;

    public rq0(br0 br0Var, ii1 ii1Var) {
        this.f19026f = br0Var;
        this.f19027g = ii1Var.f15193f;
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m8319b(a60 a60Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", a60Var.f12023f);
        jSONObject.put("responseSecsSinceEpoch", a60Var.f12026i);
        jSONObject.put("responseId", a60Var.f12024g);
        JSONArray jSONArray = new JSONArray();
        List<ow2> listMo5695f = a60Var.mo5695f();
        if (listMo5695f != null) {
            for (ow2 ow2Var : listMo5695f) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", ow2Var.f17774f);
                jSONObject2.put("latencyMillis", ow2Var.f17775g);
                yv2 yv2Var = ow2Var.f17776h;
                jSONObject2.put("error", yv2Var == null ? null : m8320c(yv2Var));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public static JSONObject m8320c(yv2 yv2Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", yv2Var.f22118h);
        jSONObject.put("errorCode", yv2Var.f22116f);
        jSONObject.put("errorDescription", yv2Var.f22117g);
        yv2 yv2Var2 = yv2Var.f22119i;
        jSONObject.put("underlyingError", yv2Var2 == null ? null : m8320c(yv2Var2));
        return jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: Q */
    public final void mo6214Q(di1 di1Var) {
        this.f19028h = di1Var.f13281b.f12694a.get(0).f18805b;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m8321a() throws JSONException {
        String str;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f19029i);
        switch (this.f19028h) {
            case 1:
                str = "BANNER";
                break;
            case 2:
                str = "INTERSTITIAL";
                break;
            case 3:
                str = "NATIVE_EXPRESS";
                break;
            case 4:
                str = "NATIVE";
                break;
            case 5:
                str = "REWARDED";
                break;
            case 6:
                str = "APP_OPEN_AD";
                break;
            case 7:
                str = "REWARDED_INTERSTITIAL";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        jSONObject.put("format", str);
        a60 a60Var = this.f19030j;
        JSONObject jSONObjectM8319b = null;
        if (a60Var != null) {
            jSONObjectM8319b = m8319b(a60Var);
        } else {
            yv2 yv2Var = this.f19031k;
            if (yv2Var != null && (iBinder = yv2Var.f22120j) != null) {
                a60 a60Var2 = (a60) iBinder;
                jSONObjectM8319b = m8319b(a60Var2);
                List<ow2> listMo5695f = a60Var2.mo5695f();
                if (listMo5695f != null && listMo5695f.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m8320c(this.f19031k));
                    jSONObjectM8319b.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObjectM8319b);
        return jSONObject;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.z80
    /* JADX INFO: renamed from: m */
    public final void mo6215m(C3437qi c3437qi) {
        br0 br0Var = this.f19026f;
        String str = this.f19027g;
        synchronized (br0Var) {
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14400m5;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && br0Var.f12797k) {
                if (br0Var.f12798l >= ((Integer) c2862b.f12496d.m6596a(C3052g3.f14414o5)).intValue()) {
                    C2622l.m5226A3("Maximum number of ad requests stored reached. Dropping the current request.");
                    return;
                }
                if (!br0Var.f12793g.containsKey(str)) {
                    br0Var.f12793g.put(str, new ArrayList());
                }
                br0Var.f12798l++;
                br0Var.f12793g.get(str).add(this);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(yv2 yv2Var) {
        this.f19029i = qq0.AD_LOAD_FAILED;
        this.f19031k = yv2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.y70
    /* JADX INFO: renamed from: p */
    public final void mo8322p(m20 m20Var) {
        this.f19030j = m20Var.f16669f;
        this.f19029i = qq0.AD_LOADED;
    }
}
