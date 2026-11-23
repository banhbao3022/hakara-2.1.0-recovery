package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p191a.C1254c;
import p007c.p190n.p191a.p192d.AbstractC1259e;
import p007c.p190n.p191a.p192d.InterfaceC1256b;
import p007c.p190n.p191a.p192d.InterfaceC1260f;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.re */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3470re<NETWORK_EXTRAS extends InterfaceC1260f, SERVER_PARAMETERS extends AbstractC1259e> extends AbstractBinderC3469rd {

    /* JADX INFO: renamed from: f */
    public final InterfaceC1256b<NETWORK_EXTRAS, SERVER_PARAMETERS> f18751f;

    /* JADX INFO: renamed from: g */
    public final NETWORK_EXTRAS f18752g;

    public BinderC3470re(InterfaceC1256b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC1256b, NETWORK_EXTRAS network_extras) {
        this.f18751f = interfaceC1256b;
        this.f18752g = network_extras;
    }

    /* JADX INFO: renamed from: G6 */
    public static final boolean m8274G6(ew2 ew2Var) {
        if (ew2Var.f13718k) {
            return true;
        }
        C3331nn c3331nn = gx2.f14692a.f14693b;
        return C3331nn.m7887e();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: A6 */
    public final void mo7819A6(ew2 ew2Var, String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: D */
    public final C2840ae mo7820D() {
        return null;
    }

    /* JADX INFO: renamed from: F6 */
    public final SERVER_PARAMETERS m8275F6(String str) throws RemoteException {
        HashMap map;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                map = new HashMap(jSONObject.length());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.getString(next));
                }
            } else {
                map = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f18751f.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS server_parametersNewInstance = serverParametersType.newInstance();
            server_parametersNewInstance.m2732a(map);
            return server_parametersNewInstance;
        } catch (Throwable th) {
            throw outline.m1577a0("", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: G2 */
    public final void mo7822G2(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: H0 */
    public final C3694xf mo7824H0() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: M3 */
    public final void mo7825M3(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        mo7832W3(interfaceC2799a, jw2Var, ew2Var, str, null, interfaceC3618vd);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: N */
    public final boolean mo7826N() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: N1 */
    public final void mo7827N1(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: O */
    public final InterfaceC3087h1 mo7828O() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: T */
    public final InterfaceC3692xd mo7829T() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: U0 */
    public final void mo7830U0(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        mo7836c1(interfaceC2799a, ew2Var, str, null, interfaceC3618vd);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: U1 */
    public final void mo7831U1(InterfaceC2799a interfaceC2799a) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: W3 */
    public final void mo7832W3(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        C1254c c1254c;
        InterfaceC1256b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC1256b = this.f18751f;
        if (!(interfaceC1256b instanceof MediationBannerAdapter)) {
            String strValueOf = String.valueOf(interfaceC1256b.getClass().getCanonicalName());
            C2622l.m5226A3(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f18751f;
            C3581ue c3581ue = new C3581ue(interfaceC3618vd);
            Activity activity = (Activity) BinderC2800b.m5639T1(interfaceC2799a);
            AbstractC1259e abstractC1259eM8275F6 = m8275F6(str);
            C1254c[] c1254cArr = {C1254c.f5497a, C1254c.f5498b, C1254c.f5499c, C1254c.f5500d, C1254c.f5501e, C1254c.f5502f};
            for (int i = 0; i < 6; i++) {
                if (c1254cArr[i].f5503g.f10566k == jw2Var.f15839j && c1254cArr[i].f5503g.f10567l == jw2Var.f15836g) {
                    c1254c = c1254cArr[i];
                    mediationBannerAdapter.requestBannerAd(c3581ue, activity, abstractC1259eM8275F6, c1254c, C2622l.m5264I1(ew2Var, m8274G6(ew2Var)), this.f18752g);
                }
            }
            c1254c = new C1254c(new C2177g(jw2Var.f15839j, jw2Var.f15836g, jw2Var.f15835f));
            mediationBannerAdapter.requestBannerAd(c3581ue, activity, abstractC1259eM8275F6, c1254c, C2622l.m5264I1(ew2Var, m8274G6(ew2Var)), this.f18752g);
        } catch (Throwable th) {
            throw outline.m1577a0("", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: X */
    public final C3694xf mo7833X() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: a2 */
    public final void mo7834a2(InterfaceC2799a interfaceC2799a, InterfaceC2948da interfaceC2948da, List<C3096ha> list) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: b5 */
    public final InterfaceC2952de mo7835b5() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: c1 */
    public final void mo7836c1(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        InterfaceC1256b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC1256b = this.f18751f;
        if (!(interfaceC1256b instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(interfaceC1256b.getClass().getCanonicalName());
            C2622l.m5226A3(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f18751f).requestInterstitialAd(new C3581ue(interfaceC3618vd), (Activity) BinderC2800b.m5639T1(interfaceC2799a), m8275F6(str), C2622l.m5264I1(ew2Var, m8274G6(ew2Var)), this.f18752g);
        } catch (Throwable th) {
            throw outline.m1577a0("", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: c2 */
    public final void mo7837c2(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd, C3165j5 c3165j5, List<String> list) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: d */
    public final InterfaceC2799a mo7838d() throws RemoteException {
        InterfaceC1256b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC1256b = this.f18751f;
        if (interfaceC1256b instanceof MediationBannerAdapter) {
            try {
                return new BinderC2800b(((MediationBannerAdapter) interfaceC1256b).getBannerView());
            } catch (Throwable th) {
                throw outline.m1577a0("", th);
            }
        }
        String strValueOf = String.valueOf(interfaceC1256b.getClass().getCanonicalName());
        C2622l.m5226A3(strValueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(strValueOf) : new String("Not a MediationBannerAdapter: "));
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: d3 */
    public final void mo7839d3(InterfaceC2799a interfaceC2799a, InterfaceC3438qj interfaceC3438qj, List<String> list) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: e0 */
    public final void mo7840e0(InterfaceC2799a interfaceC2799a) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: e3 */
    public final void mo7841e3(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3438qj interfaceC3438qj, String str2) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: g */
    public final void mo7842g() throws RemoteException {
        InterfaceC1256b<NETWORK_EXTRAS, SERVER_PARAMETERS> interfaceC1256b = this.f18751f;
        if (!(interfaceC1256b instanceof MediationInterstitialAdapter)) {
            String strValueOf = String.valueOf(interfaceC1256b.getClass().getCanonicalName());
            C2622l.m5226A3(strValueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(strValueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        C2622l.m5318U2("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f18751f).showInterstitial();
        } catch (Throwable th) {
            throw outline.m1577a0("", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: h2 */
    public final void mo7843h2(ew2 ew2Var, String str, String str2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: h3 */
    public final void mo7844h3(InterfaceC2799a interfaceC2799a) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: i */
    public final void mo7845i() throws RemoteException {
        try {
            this.f18751f.destroy();
        } catch (Throwable th) {
            throw outline.m1577a0("", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: j */
    public final void mo7846j() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: l */
    public final boolean mo7847l() {
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: m */
    public final void mo7848m() throws RemoteException {
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: n */
    public final void mo7849n() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: n5 */
    public final void mo7850n5(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: o */
    public final Bundle mo7851o() {
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: p0 */
    public final C3766zd mo7852p0() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: q */
    public final Bundle mo7853q() {
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: r */
    public final Bundle mo7854r() {
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: s0 */
    public final void mo7855s0(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: v */
    public final InterfaceC3129i6 mo7856v() {
        return null;
    }
}
