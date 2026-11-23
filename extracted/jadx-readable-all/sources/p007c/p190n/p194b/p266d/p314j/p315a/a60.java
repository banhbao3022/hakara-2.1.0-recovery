package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;
import org.json.JSONException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class a60 extends AbstractBinderC2939d1 {

    /* JADX INFO: renamed from: f */
    public final String f12023f;

    /* JADX INFO: renamed from: g */
    public final String f12024g;

    /* JADX INFO: renamed from: h */
    public final List<ow2> f12025h;

    /* JADX INFO: renamed from: i */
    public final long f12026i;

    public a60(rh1 rh1Var, String str, hx0 hx0Var) {
        String string = null;
        this.f12024g = rh1Var == null ? null : rh1Var.f18798V;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                string = rh1Var.f18830u.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.f12023f = string != null ? string : str;
        this.f12025h = hx0Var.f15044a;
        this.f12026i = C2330u.f10884a.f10896k.mo5623c() / 1000;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1
    /* JADX INFO: renamed from: c */
    public final String mo5693c() {
        return this.f12023f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1
    /* JADX INFO: renamed from: d */
    public final String mo5694d() {
        return this.f12024g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1
    /* JADX INFO: renamed from: f */
    public final List<ow2> mo5695f() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14279U4)).booleanValue()) {
            return this.f12025h;
        }
        return null;
    }
}
