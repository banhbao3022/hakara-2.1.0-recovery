package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.EnumC2106b;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2113g;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2115i;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2116j;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2118l;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2120n;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2137w;
import p007c.p190n.p194b.p266d.p267a.p269b0.p271u.C2134a;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.wf */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3657wf extends AbstractBinderC3212kf {

    /* JADX INFO: renamed from: g */
    public final RtbAdapter f21045g;

    /* JADX INFO: renamed from: h */
    public String f21046h = "";

    public BinderC3657wf(RtbAdapter rtbAdapter) {
        this.f21045g = rtbAdapter;
    }

    /* JADX INFO: renamed from: G6 */
    public static final Bundle m8625G6(String str) throws RemoteException {
        String strValueOf = String.valueOf(str);
        C2622l.m5226A3(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e) {
            C2622l.m5438t3("", e);
            throw new RemoteException();
        }
    }

    /* JADX INFO: renamed from: H6 */
    public static final boolean m8626H6(ew2 ew2Var) {
        if (ew2Var.f13718k) {
            return true;
        }
        C3331nn c3331nn = gx2.f14692a.f14693b;
        return C3331nn.m7887e();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: B2 */
    public final void mo7325B2(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3027ff interfaceC3027ff, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        mo7336v6(str, str2, ew2Var, interfaceC2799a, interfaceC3027ff, interfaceC3618vd, null);
    }

    /* JADX INFO: renamed from: F6 */
    public final Bundle m8627F6(ew2 ew2Var) {
        Bundle bundle;
        Bundle bundle2 = ew2Var.f13725r;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f21045g.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: L4 */
    public final void mo7326L4(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3730ye interfaceC3730ye, InterfaceC3618vd interfaceC3618vd, jw2 jw2Var) throws RemoteException {
        try {
            C3471rf c3471rf = new C3471rf(interfaceC3730ye, interfaceC3618vd);
            RtbAdapter rtbAdapter = this.f21045g;
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM8625G6 = m8625G6(str2);
            Bundle bundleM8627F6 = m8627F6(ew2Var);
            boolean zM8626H6 = m8626H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRtbInterscrollerAd(new C2113g(context, str, bundleM8625G6, bundleM8627F6, zM8626H6, location, i, i2, string, new C2177g(jw2Var.f15839j, jw2Var.f15836g, jw2Var.f15835f), this.f21046h), c3471rf);
        } catch (Throwable th) {
            throw outline.m1577a0("Adapter failed to render interscroller ad.", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: X3 */
    public final boolean mo7327X3(InterfaceC2799a interfaceC2799a) throws RemoteException {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: Y0 */
    public final void mo7328Y0(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3138if interfaceC3138if, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        try {
            C3620vf c3620vf = new C3620vf(this, interfaceC3138if, interfaceC3618vd);
            RtbAdapter rtbAdapter = this.f21045g;
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM8625G6 = m8625G6(str2);
            Bundle bundleM8627F6 = m8627F6(ew2Var);
            boolean zM8626H6 = m8626H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRtbRewardedInterstitialAd(new C2120n(context, str, bundleM8625G6, bundleM8627F6, zM8626H6, location, i, i2, string, this.f21046h), c3620vf);
        } catch (Throwable th) {
            throw outline.m1577a0("Adapter failed to render rewarded interstitial ad.", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: d */
    public final C3694xf mo7329d() throws RemoteException {
        return C3694xf.m8733H(this.f21045g.getVersionInfo());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: e5 */
    public final void mo7330e5(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC2878bf interfaceC2878bf, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        try {
            C3508sf c3508sf = new C3508sf(this, interfaceC2878bf, interfaceC3618vd);
            RtbAdapter rtbAdapter = this.f21045g;
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM8625G6 = m8625G6(str2);
            Bundle bundleM8627F6 = m8627F6(ew2Var);
            boolean zM8626H6 = m8626H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRtbInterstitialAd(new C2116j(context, str, bundleM8625G6, bundleM8627F6, zM8626H6, location, i, i2, string, this.f21046h), c3508sf);
        } catch (Throwable th) {
            throw outline.m1577a0("Adapter failed to render interstitial ad.", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: f */
    public final C3694xf mo7331f() throws RemoteException {
        return C3694xf.m8733H(this.f21045g.getSDKVersionInfo());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: g */
    public final InterfaceC3087h1 mo7332g() {
        Object obj = this.f21045g;
        if (obj instanceof InterfaceC2137w) {
            try {
                return ((InterfaceC2137w) obj).getVideoController();
            } catch (Throwable th) {
                C2622l.m5438t3("", th);
            }
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: m4 */
    public final void mo7333m4(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3730ye interfaceC3730ye, InterfaceC3618vd interfaceC3618vd, jw2 jw2Var) throws RemoteException {
        try {
            C3434qf c3434qf = new C3434qf(interfaceC3730ye, interfaceC3618vd);
            RtbAdapter rtbAdapter = this.f21045g;
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM8625G6 = m8625G6(str2);
            Bundle bundleM8627F6 = m8627F6(ew2Var);
            boolean zM8626H6 = m8626H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRtbBannerAd(new C2113g(context, str, bundleM8625G6, bundleM8627F6, zM8626H6, location, i, i2, string, new C2177g(jw2Var.f15839j, jw2Var.f15836g, jw2Var.f15835f), this.f21046h), c3434qf);
        } catch (Throwable th) {
            throw outline.m1577a0("Adapter failed to render banner ad.", th);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0047  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: o2 */
    public final void mo7334o2(InterfaceC2799a interfaceC2799a, String str, Bundle bundle, Bundle bundle2, jw2 jw2Var, InterfaceC3360of interfaceC3360of) throws RemoteException {
        byte b;
        EnumC2106b enumC2106b;
        try {
            C3582uf c3582uf = new C3582uf(interfaceC3360of);
            RtbAdapter rtbAdapter = this.f21045g;
            switch (str) {
                case "banner":
                    b = 0;
                    break;
                case "native":
                    b = 4;
                    break;
                case "rewarded":
                    b = 2;
                    break;
                case "interstitial":
                    b = 1;
                    break;
                case "rewarded_interstitial":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                enumC2106b = EnumC2106b.BANNER;
            } else if (b == 1) {
                enumC2106b = EnumC2106b.INTERSTITIAL;
            } else if (b == 2) {
                enumC2106b = EnumC2106b.REWARDED;
            } else if (b == 3) {
                enumC2106b = EnumC2106b.REWARDED_INTERSTITIAL;
            } else {
                if (b != 4) {
                    throw new IllegalArgumentException("Internal Error");
                }
                enumC2106b = EnumC2106b.NATIVE;
            }
            C2115i c2115i = new C2115i(enumC2106b, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(c2115i);
            rtbAdapter.collectSignals(new C2134a((Context) BinderC2800b.m5639T1(interfaceC2799a), arrayList, bundle, new C2177g(jw2Var.f15839j, jw2Var.f15836g, jw2Var.f15835f)), c3582uf);
        } catch (Throwable th) {
            throw outline.m1577a0("Error generating signals for RTB", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: v5 */
    public final boolean mo7335v5(InterfaceC2799a interfaceC2799a) throws RemoteException {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: v6 */
    public final void mo7336v6(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3027ff interfaceC3027ff, InterfaceC3618vd interfaceC3618vd, C3165j5 c3165j5) throws RemoteException {
        try {
            C3545tf c3545tf = new C3545tf(interfaceC3027ff, interfaceC3618vd);
            RtbAdapter rtbAdapter = this.f21045g;
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM8625G6 = m8625G6(str2);
            Bundle bundleM8627F6 = m8627F6(ew2Var);
            boolean zM8626H6 = m8626H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRtbNativeAd(new C2118l(context, str, bundleM8625G6, bundleM8627F6, zM8626H6, location, i, i2, string, this.f21046h, c3165j5), c3545tf);
        } catch (Throwable th) {
            throw outline.m1577a0("Adapter failed to render native ad.", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: w3 */
    public final void mo7337w3(String str, String str2, ew2 ew2Var, InterfaceC2799a interfaceC2799a, InterfaceC3138if interfaceC3138if, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        try {
            C3620vf c3620vf = new C3620vf(this, interfaceC3138if, interfaceC3618vd);
            RtbAdapter rtbAdapter = this.f21045g;
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM8625G6 = m8625G6(str2);
            Bundle bundleM8627F6 = m8627F6(ew2Var);
            boolean zM8626H6 = m8626H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRtbRewardedAd(new C2120n(context, str, bundleM8625G6, bundleM8627F6, zM8626H6, location, i, i2, string, this.f21046h), c3620vf);
        } catch (Throwable th) {
            throw outline.m1577a0("Adapter failed to render rewarded ad.", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3249lf
    /* JADX INFO: renamed from: z0 */
    public final void mo7338z0(String str) {
        this.f21046h = str;
    }
}
