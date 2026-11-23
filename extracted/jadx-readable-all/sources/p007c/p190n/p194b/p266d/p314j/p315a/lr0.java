package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2233p;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2311z0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lr0 implements l60, u70, InterfaceC2235r, InterfaceC2856au {

    /* JADX INFO: renamed from: f */
    public final Context f16463f;

    /* JADX INFO: renamed from: g */
    public final C3702xn f16464g;

    /* JADX INFO: renamed from: h */
    public br0 f16465h;

    /* JADX INFO: renamed from: i */
    public InterfaceC3410ps f16466i;

    /* JADX INFO: renamed from: j */
    public boolean f16467j;

    /* JADX INFO: renamed from: k */
    public boolean f16468k;

    /* JADX INFO: renamed from: l */
    public long f16469l;

    /* JADX INFO: renamed from: m */
    public InterfaceC3605v0 f16470m;

    /* JADX INFO: renamed from: n */
    public boolean f16471n;

    public lr0(Context context, C3702xn c3702xn) {
        this.f16463f = context;
        this.f16464g = c3702xn;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
    /* JADX INFO: renamed from: B */
    public final synchronized void mo4670B(boolean z) {
        try {
            if (z) {
                C2096e.m4590z("Ad inspector loaded.");
                this.f16467j = true;
                m7610c();
            } else {
                C2622l.m5226A3("Ad inspector failed to load.");
                try {
                    InterfaceC3605v0 interfaceC3605v0 = this.f16470m;
                    if (interfaceC3605v0 != null) {
                        interfaceC3605v0.mo5840i0(C2622l.m5285M2(16, null, null));
                    }
                } catch (RemoteException unused) {
                }
                this.f16471n = true;
                this.f16466i.destroy();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: F3 */
    public final synchronized void mo4698F3() {
        this.f16468k = true;
        m7610c();
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: J3 */
    public final synchronized void mo4699J3(int i) {
        this.f16466i.destroy();
        if (!this.f16471n) {
            C2096e.m4590z("Inspector closed.");
            InterfaceC3605v0 interfaceC3605v0 = this.f16470m;
            if (interfaceC3605v0 != null) {
                try {
                    interfaceC3605v0.mo5840i0(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f16468k = false;
        this.f16467j = false;
        this.f16469l = 0L;
        this.f16471n = false;
        this.f16470m = null;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: O5 */
    public final void mo4700O5() {
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m7608a(InterfaceC3605v0 interfaceC3605v0, C3501s8 c3501s8) {
        if (m7609b(interfaceC3605v0)) {
            try {
                C2330u c2330u = C2330u.f10884a;
                C2855at c2855at = c2330u.f10890e;
                InterfaceC3410ps interfaceC3410psM5850a = C2855at.m5850a(this.f16463f, C3005eu.m6687b(), "", false, false, null, null, this.f16464g, null, null, null, new as2(), null, null);
                this.f16466i = interfaceC3410psM5850a;
                InterfaceC2931cu interfaceC2931cuMo6459O0 = ((C2967dt) interfaceC3410psM5850a).mo6459O0();
                if (interfaceC2931cuMo6459O0 == null) {
                    C2622l.m5226A3("Failed to obtain a web view for the ad inspector");
                    try {
                        interfaceC3605v0.mo5840i0(C2622l.m5285M2(16, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.f16470m = interfaceC3605v0;
                ((C3670ws) interfaceC2931cuMo6459O0).m8676b(null, null, null, null, null, false, null, null, null, null, null, null, null, null, c3501s8);
                ((C3670ws) interfaceC2931cuMo6459O0).f21331m = this;
                this.f16466i.loadUrl((String) C2862b.f12493a.f12496d.m6596a(C3052g3.f14407n5));
                C2233p.m4697a(this.f16463f, new AdOverlayInfoParcel(this, this.f16466i, 1, this.f16464g), true);
                this.f16469l = c2330u.f10896k.mo5623c();
            } catch (C3781zs e) {
                C2622l.m5241D3("Failed to obtain a web view for the ad inspector", e);
                try {
                    interfaceC3605v0.mo5840i0(C2622l.m5285M2(16, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        m7610c();
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m7609b(InterfaceC3605v0 interfaceC3605v0) {
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14400m5;
        C2862b c2862b = C2862b.f12493a;
        if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            C2622l.m5226A3("Ad inspector had an internal error.");
            try {
                interfaceC3605v0.mo5840i0(C2622l.m5285M2(15, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f16465h == null) {
            C2622l.m5226A3("Ad inspector had an internal error.");
            try {
                interfaceC3605v0.mo5840i0(C2622l.m5285M2(15, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f16467j && !this.f16468k) {
            if (C2330u.f10884a.f10896k.mo5623c() >= this.f16469l + ((long) ((Integer) c2862b.f12496d.m6596a(C3052g3.f14421p5)).intValue())) {
                return true;
            }
        }
        C2622l.m5226A3("Ad inspector cannot be opened because it is already open.");
        try {
            interfaceC3605v0.mo5840i0(C2622l.m5285M2(18, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m7610c() {
        if (this.f16467j && this.f16468k) {
            C2962do.f13334e.execute(new Runnable(this) { // from class: c.n.b.d.j.a.kr0

                /* JADX INFO: renamed from: f */
                public final lr0 f16022f;

                {
                    this.f16022f = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    lr0 lr0Var = this.f16022f;
                    InterfaceC3410ps interfaceC3410ps = lr0Var.f16466i;
                    br0 br0Var = lr0Var.f16465h;
                    Objects.requireNonNull(br0Var);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("platform", "ANDROID");
                        jSONObject.put("internalSdkVersion", br0Var.f12792f);
                        jSONObject.put("adapters", br0Var.f12790d.m8748a());
                        long j2 = br0Var.f12795i;
                        C2330u c2330u = C2330u.f10884a;
                        if (j2 < c2330u.f10896k.mo5624d() / 1000) {
                            br0Var.f12794h = "{}";
                        }
                        jSONObject.put("networkExtras", br0Var.f12794h);
                        jSONObject.put("adSlots", br0Var.m6077f());
                        jSONObject.put("appInfo", br0Var.f12791e.m7929a());
                        jSONObject.put("cld", new JSONObject(((C2311z0) c2330u.f10893h.m6649f()).mo4818p().f12217e));
                    } catch (JSONException unused) {
                    }
                    interfaceC3410ps.mo6470Z("window.inspectorInfo", jSONObject.toString());
                }
            });
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: i1 */
    public final void mo4701i1() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.l60
    /* JADX INFO: renamed from: o0 */
    public final void mo6216o0(yv2 yv2Var) {
        m7610c();
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: r0 */
    public final void mo4702r0() {
    }
}
