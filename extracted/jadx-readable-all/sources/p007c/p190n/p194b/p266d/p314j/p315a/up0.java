package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class up0 extends AbstractBinderC3085h {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ pp0 f20396f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vp0 f20397g;

    public up0(vp0 vp0Var, pp0 pp0Var) {
        this.f20397g = vp0Var;
        this.f20396f = pp0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: D0 */
    public final void mo5870D0(yv2 yv2Var) throws RemoteException {
        this.f20396f.m8140b(this.f20397g.f20899a, yv2Var.f22116f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: L */
    public final void mo5871L(int i) throws RemoteException {
        this.f20396f.m8140b(this.f20397g.f20899a, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: a */
    public final void mo5872a() throws RemoteException {
        pp0 pp0Var = this.f20396f;
        long j2 = this.f20397g.f20899a;
        Objects.requireNonNull(pp0Var);
        op0 op0Var = new op0("interstitial");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onAdClosed";
        pp0Var.m8143e(op0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: c */
    public final void mo5873c() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: d */
    public final void mo5874d() throws RemoteException {
        pp0 pp0Var = this.f20396f;
        long j2 = this.f20397g.f20899a;
        Objects.requireNonNull(pp0Var);
        op0 op0Var = new op0("interstitial");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onAdLoaded";
        pp0Var.m8143e(op0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: f */
    public final void mo5875f() throws RemoteException {
        pp0 pp0Var = this.f20396f;
        long j2 = this.f20397g.f20899a;
        Objects.requireNonNull(pp0Var);
        op0 op0Var = new op0("interstitial");
        op0Var.f17713a = Long.valueOf(j2);
        op0Var.f17715c = "onAdOpened";
        pp0Var.m8143e(op0Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: g */
    public final void mo5876g() throws RemoteException {
        pp0 pp0Var = this.f20396f;
        Long lValueOf = Long.valueOf(this.f20397g.f20899a);
        InterfaceC3169j9 interfaceC3169j9 = pp0Var.f18051a;
        String str = (String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14183E5);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", lValueOf);
            jSONObject.put("eventCategory", "interstitial");
            jSONObject.putOpt("event", "onAdClicked");
            jSONObject.putOpt("errorCode", null);
            jSONObject.putOpt("rewardType", null);
            jSONObject.putOpt("rewardAmount", null);
        } catch (JSONException unused) {
            C2622l.m5226A3("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        interfaceC3169j9.mo7219t(outline.m1553D(new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(string).length()), str, "(\"h5adsEvent\",", string, ");"));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i
    /* JADX INFO: renamed from: i */
    public final void mo5877i() {
    }
}
