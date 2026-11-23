package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class br0 implements mr0, oq0 {

    /* JADX INFO: renamed from: a */
    public final lr0 f12787a;

    /* JADX INFO: renamed from: b */
    public final nr0 f12788b;

    /* JADX INFO: renamed from: c */
    public final pq0 f12789c;

    /* JADX INFO: renamed from: d */
    public final xq0 f12790d;

    /* JADX INFO: renamed from: e */
    public final nq0 f12791e;

    /* JADX INFO: renamed from: f */
    public final String f12792f;

    /* JADX INFO: renamed from: k */
    public boolean f12797k;

    /* JADX INFO: renamed from: l */
    public int f12798l;

    /* JADX INFO: renamed from: m */
    public boolean f12799m;

    /* JADX INFO: renamed from: h */
    public String f12794h = "{}";

    /* JADX INFO: renamed from: i */
    public long f12795i = Long.MAX_VALUE;

    /* JADX INFO: renamed from: j */
    public yq0 f12796j = yq0.NONE;

    /* JADX INFO: renamed from: g */
    public final Map<String, List<rq0>> f12793g = new HashMap();

    public br0(lr0 lr0Var, nr0 nr0Var, pq0 pq0Var, Context context, C3702xn c3702xn, xq0 xq0Var) {
        this.f12787a = lr0Var;
        this.f12788b = nr0Var;
        this.f12789c = pq0Var;
        this.f12791e = new nq0(context);
        this.f12792f = c3702xn.f21615f;
        this.f12790d = xq0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m6072a() {
        String str;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue()) {
            C2311z0 c2311z0 = (C2311z0) C2330u.f10884a.f10893h.m6649f();
            c2311z0.m4831a();
            synchronized (c2311z0.f10805a) {
                str = c2311z0.f10826v;
            }
            if (str != null) {
                try {
                    if (new JSONObject(str).optBoolean("isTestMode", false)) {
                        m6078g();
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6073b(boolean z) {
        if (!this.f12799m && z) {
            m6078g();
        }
        m6075d(z, true);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m6074c(InterfaceC3605v0 interfaceC3605v0) {
        if (!this.f12797k) {
            try {
                interfaceC3605v0.mo5840i0(C2622l.m5285M2(17, null, null));
                return;
            } catch (RemoteException unused) {
                C2622l.m5226A3("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue()) {
            this.f12787a.m7608a(interfaceC3605v0, new C3501s8(this));
            return;
        }
        try {
            interfaceC3605v0.mo5840i0(C2622l.m5285M2(1, null, null));
            return;
        } catch (RemoteException unused2) {
            C2622l.m5226A3("Ad inspector had an internal error.");
            return;
        }
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6075d(boolean z, boolean z2) {
        if (this.f12797k == z) {
            return;
        }
        this.f12797k = z;
        if (z) {
            m6079h();
        } else {
            m6080i();
        }
        if (z2) {
            m6081j();
        }
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6076e(yq0 yq0Var, boolean z) {
        if (this.f12796j == yq0Var) {
            return;
        }
        if (this.f12797k) {
            m6080i();
        }
        this.f12796j = yq0Var;
        if (this.f12797k) {
            m6079h();
        }
        if (z) {
            m6081j();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized JSONObject m6077f() throws JSONException {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, List<rq0>> entry : this.f12793g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (rq0 rq0Var : entry.getValue()) {
                if (rq0Var.f19029i != qq0.AD_REQUESTED) {
                    jSONArray.put(rq0Var.m8321a());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    public final void m6078g() {
        String str;
        this.f12799m = true;
        xq0 xq0Var = this.f12790d;
        lq0 lq0Var = xq0Var.f21656a;
        vq0 vq0Var = new vq0(xq0Var);
        C3147io<Boolean> c3147io = lq0Var.f16446e;
        c3147io.f15328f.mo6230f(new zp0(lq0Var, vq0Var), lq0Var.f16451j);
        this.f12787a.f16465h = this;
        this.f12788b.f17254f = this;
        this.f12789c.f18079i = this;
        C2311z0 c2311z0 = (C2311z0) C2330u.f10884a.f10893h.m6649f();
        c2311z0.m4831a();
        synchronized (c2311z0.f10805a) {
            str = c2311z0.f10826v;
        }
        synchronized (this) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                m6075d(jSONObject.optBoolean("isTestMode", false), false);
                m6076e((yq0) Enum.valueOf(yq0.class, jSONObject.optString("gesture", "NONE")), false);
                this.f12794h = jSONObject.optString("networkExtras", "{}");
                this.f12795i = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m6079h() {
        int iOrdinal = this.f12796j.ordinal();
        if (iOrdinal == 1) {
            this.f12788b.m7931a();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f12789c.m8148a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m6080i() {
        SensorManager sensorManager;
        Sensor sensor;
        int iOrdinal = this.f12796j.ordinal();
        if (iOrdinal == 1) {
            nr0 nr0Var = this.f12788b;
            synchronized (nr0Var) {
                if (nr0Var.f17255g) {
                    SensorManager sensorManager2 = nr0Var.f17250b;
                    if (sensorManager2 != null) {
                        sensorManager2.unregisterListener(nr0Var, nr0Var.f17251c);
                        C2096e.m4590z("Stopped listening for shake gestures.");
                    }
                    nr0Var.f17255g = false;
                }
            }
            return;
        }
        if (iOrdinal != 2) {
            return;
        }
        pq0 pq0Var = this.f12789c;
        synchronized (pq0Var) {
            if (pq0Var.f18080j && (sensorManager = pq0Var.f18071a) != null && (sensor = pq0Var.f18072b) != null) {
                sensorManager.unregisterListener(pq0Var, sensor);
                pq0Var.f18080j = false;
                C2096e.m4590z("Stopped listening for flick gestures.");
            }
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: j */
    public final void m6081j() {
        String string;
        C2330u c2330u = C2330u.f10884a;
        InterfaceC2305w0 interfaceC2305w0M6649f = c2330u.f10893h.m6649f();
        synchronized (this) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("isTestMode", this.f12797k);
                jSONObject.put("gesture", this.f12796j);
                if (this.f12795i > c2330u.f10896k.mo5624d() / 1000) {
                    jSONObject.put("networkExtras", this.f12794h);
                    jSONObject.put("networkExtrasExpirationSecs", this.f12795i);
                }
            } catch (JSONException unused) {
            }
            string = jSONObject.toString();
        }
        C2311z0 c2311z0 = (C2311z0) interfaceC2305w0M6649f;
        Objects.requireNonNull(c2311z0);
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue()) {
            c2311z0.m4831a();
            synchronized (c2311z0.f10805a) {
                if (c2311z0.f10826v.equals(string)) {
                    return;
                }
                c2311z0.f10826v = string;
                SharedPreferences.Editor editor = c2311z0.f10811g;
                if (editor != null) {
                    editor.putString("inspector_info", string);
                    c2311z0.f10811g.apply();
                }
                c2311z0.m4832b();
            }
        }
    }
}
