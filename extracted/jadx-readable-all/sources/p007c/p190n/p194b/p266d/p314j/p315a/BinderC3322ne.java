package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbic;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.EnumC2106b;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2107a;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2124r;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2113g;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2115i;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2116j;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2118l;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2120n;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2122p;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2123q;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2137w;
import p007c.p190n.p194b.p266d.p267a.p279w.InterfaceC2203f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ne */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3322ne extends AbstractBinderC3469rd {

    /* JADX INFO: renamed from: f */
    public final Object f17073f;

    /* JADX INFO: renamed from: g */
    public C3359oe f17074g;

    /* JADX INFO: renamed from: h */
    public InterfaceC3438qj f17075h;

    /* JADX INFO: renamed from: i */
    public InterfaceC2799a f17076i;

    /* JADX INFO: renamed from: j */
    public final String f17077j = "";

    public BinderC3322ne(AbstractC2107a abstractC2107a) {
        this.f17073f = abstractC2107a;
    }

    /* JADX INFO: renamed from: H6 */
    public static final boolean m7818H6(ew2 ew2Var) {
        if (ew2Var.f13718k) {
            return true;
        }
        C3331nn c3331nn = gx2.f14692a.f14693b;
        return C3331nn.m7887e();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: A6 */
    public final void mo7819A6(ew2 ew2Var, String str) throws RemoteException {
        mo7843h2(ew2Var, str, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: D */
    public final C2840ae mo7820D() {
        return null;
    }

    /* JADX INFO: renamed from: F6 */
    public final Bundle m7821F6(String str, ew2 ew2Var, String str2) throws RemoteException {
        String strValueOf = String.valueOf(str);
        C2622l.m5318U2(strValueOf.length() != 0 ? "Server parameters: ".concat(strValueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f17073f instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (ew2Var != null) {
                    bundle.putInt("tagForChildDirectedTreatment", ew2Var.f13719l);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            throw outline.m1577a0("", th);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: G2 */
    public final void mo7822G2(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        if (!(this.f17073f instanceof AbstractC2107a)) {
            String canonicalName = AbstractC2107a.class.getCanonicalName();
            String canonicalName2 = this.f17073f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C2622l.m5226A3(sb.toString());
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting interscroller ad from adapter.");
        try {
            AbstractC2107a abstractC2107a = (AbstractC2107a) this.f17073f;
            C3063ge c3063ge = new C3063ge(this, interfaceC3618vd, abstractC2107a);
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM7821F6 = m7821F6(str, ew2Var, str2);
            Bundle bundleM7823G6 = m7823G6(ew2Var);
            boolean zM7818H6 = m7818H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            int i3 = jw2Var.f15839j;
            int i4 = jw2Var.f15836g;
            C2177g c2177g = new C2177g(i3, i4);
            c2177g.f10571p = true;
            c2177g.f10572q = i4;
            abstractC2107a.loadInterscrollerAd(new C2113g(context, "", bundleM7821F6, bundleM7823G6, zM7818H6, location, i, i2, string, c2177g, ""), c3063ge);
        } catch (Exception e) {
            C2622l.m5438t3("", e);
            throw new RemoteException();
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final Bundle m7823G6(ew2 ew2Var) {
        Bundle bundle;
        Bundle bundle2 = ew2Var.f13725r;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f17073f.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: H0 */
    public final C3694xf mo7824H0() {
        Object obj = this.f17073f;
        if (obj instanceof AbstractC2107a) {
            return C3694xf.m8733H(((AbstractC2107a) obj).getSDKVersionInfo());
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: M3 */
    public final void mo7825M3(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws JSONException, RemoteException {
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
        if (!(this.f17073f instanceof AbstractC2107a)) {
            String canonicalName = AbstractC2107a.class.getCanonicalName();
            String canonicalName2 = this.f17073f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C2622l.m5226A3(sb.toString());
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting rewarded ad from adapter.");
        try {
            AbstractC2107a abstractC2107a = (AbstractC2107a) this.f17073f;
            C3248le c3248le = new C3248le(this, interfaceC3618vd);
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM7821F6 = m7821F6(str, ew2Var, null);
            Bundle bundleM7823G6 = m7823G6(ew2Var);
            boolean zM7818H6 = m7818H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            abstractC2107a.loadRewardedAd(new C2120n(context, "", bundleM7821F6, bundleM7823G6, zM7818H6, location, i, i2, string, ""), c3248le);
        } catch (Exception e) {
            C2622l.m5438t3("", e);
            throw new RemoteException();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: O */
    public final InterfaceC3087h1 mo7828O() {
        Object obj = this.f17073f;
        if (obj instanceof InterfaceC2137w) {
            try {
                return ((InterfaceC2137w) obj).getVideoController();
            } catch (Throwable th) {
                C2622l.m5438t3("", th);
            }
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: T */
    public final InterfaceC3692xd mo7829T() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: U0 */
    public final void mo7830U0(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws JSONException, RemoteException {
        mo7836c1(interfaceC2799a, ew2Var, str, null, interfaceC3618vd);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: U1 */
    public final void mo7831U1(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Object obj = this.f17073f;
        if ((obj instanceof AbstractC2107a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                mo7842g();
                return;
            } else {
                C2622l.m5318U2("Show interstitial ad from adapter.");
                C2622l.m5408n3("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC2107a.class.getCanonicalName();
        String canonicalName3 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
        outline.m1572W(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: W3 */
    public final void mo7832W3(InterfaceC2799a interfaceC2799a, jw2 jw2Var, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws JSONException, RemoteException {
        C2177g c2177g;
        String string;
        String string2;
        Object obj = this.f17073f;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof AbstractC2107a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC2107a.class.getCanonicalName();
            String canonicalName3 = this.f17073f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
            outline.m1572W(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            C2622l.m5226A3(sb.toString());
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting banner ad from adapter.");
        if (jw2Var.f15848s) {
            int i = jw2Var.f15839j;
            int i2 = jw2Var.f15836g;
            C2177g c2177g2 = new C2177g(i, i2);
            c2177g2.f10569n = true;
            c2177g2.f10570o = i2;
            c2177g = c2177g2;
        } else {
            c2177g = new C2177g(jw2Var.f15839j, jw2Var.f15836g, jw2Var.f15835f);
        }
        Object obj2 = this.f17073f;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof AbstractC2107a) {
                try {
                    AbstractC2107a abstractC2107a = (AbstractC2107a) obj2;
                    C3137ie c3137ie = new C3137ie(this, interfaceC3618vd);
                    Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
                    Bundle bundleM7821F6 = m7821F6(str, ew2Var, str2);
                    Bundle bundleM7823G6 = m7823G6(ew2Var);
                    boolean zM7818H6 = m7818H6(ew2Var);
                    Location location = ew2Var.f13723p;
                    int i3 = ew2Var.f13719l;
                    int i4 = ew2Var.f13732y;
                    try {
                        string2 = new JSONObject(str).getString("max_ad_content_rating");
                    } catch (JSONException unused) {
                        string2 = ew2Var.f13733z;
                    }
                    abstractC2107a.loadBannerAd(new C2113g(context, "", bundleM7821F6, bundleM7823G6, zM7818H6, location, i3, i4, string2, c2177g, this.f17077j), c3137ie);
                    return;
                } catch (Throwable th) {
                    throw outline.m1577a0("", th);
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List<String> list = ew2Var.f13717j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = ew2Var.f13714g;
            Date date = j2 == -1 ? null : new Date(j2);
            int i5 = ew2Var.f13716i;
            Location location2 = ew2Var.f13723p;
            boolean zM7818H7 = m7818H6(ew2Var);
            int i6 = ew2Var.f13719l;
            boolean z = ew2Var.f13730w;
            int i7 = ew2Var.f13732y;
            try {
                string = new JSONObject(str).getString("max_ad_content_rating");
            } catch (JSONException unused2) {
                string = ew2Var.f13733z;
            }
            C3026fe c3026fe = new C3026fe(date, i5, hashSet, location2, zM7818H7, i6, z, i7, string);
            Bundle bundle = ew2Var.f13725r;
            mediationBannerAdapter.requestBannerAd((Context) BinderC2800b.m5639T1(interfaceC2799a), new C3359oe(interfaceC3618vd), m7821F6(str, ew2Var, str2), c2177g, c3026fe, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th2) {
            throw outline.m1577a0("", th2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: X */
    public final C3694xf mo7833X() {
        Object obj = this.f17073f;
        if (obj instanceof AbstractC2107a) {
            return C3694xf.m8733H(((AbstractC2107a) obj).getVersionInfo());
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: a2 */
    public final void mo7834a2(InterfaceC2799a interfaceC2799a, InterfaceC2948da interfaceC2948da, List<C3096ha> list) throws RemoteException {
        byte b;
        EnumC2106b enumC2106b;
        if (!(this.f17073f instanceof AbstractC2107a)) {
            throw new RemoteException();
        }
        C3100he c3100he = new C3100he(interfaceC2948da);
        ArrayList arrayList = new ArrayList();
        for (C3096ha c3096ha : list) {
            switch (c3096ha.f14794f) {
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
            } else if (b != 3) {
                enumC2106b = b != 4 ? null : EnumC2106b.NATIVE;
            } else {
                enumC2106b = EnumC2106b.REWARDED_INTERSTITIAL;
            }
            if (enumC2106b != null) {
                arrayList.add(new C2115i(enumC2106b, c3096ha.f14795g));
            }
        }
        ((AbstractC2107a) this.f17073f).initialize((Context) BinderC2800b.m5639T1(interfaceC2799a), c3100he, arrayList);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: b5 */
    public final InterfaceC2952de mo7835b5() {
        AbstractC2124r abstractC2124r;
        Object obj = this.f17073f;
        if (!(obj instanceof MediationNativeAdapter)) {
            boolean z = obj instanceof AbstractC2107a;
            return null;
        }
        C3359oe c3359oe = this.f17074g;
        if (c3359oe == null || (abstractC2124r = c3359oe.f17603b) == null) {
            return null;
        }
        return new BinderC3619ve(abstractC2124r);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: c1 */
    public final void mo7836c1(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd) throws JSONException, RemoteException {
        String str3;
        String string;
        String string2;
        Object obj = this.f17073f;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof AbstractC2107a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC2107a.class.getCanonicalName();
            String canonicalName3 = this.f17073f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
            outline.m1572W(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            C2622l.m5226A3(sb.toString());
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting interstitial ad from adapter.");
        Object obj2 = this.f17073f;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof AbstractC2107a) {
                try {
                    AbstractC2107a abstractC2107a = (AbstractC2107a) obj2;
                    C3174je c3174je = new C3174je(this, interfaceC3618vd);
                    Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
                    Bundle bundleM7821F6 = m7821F6(str, ew2Var, str2);
                    Bundle bundleM7823G6 = m7823G6(ew2Var);
                    boolean zM7818H6 = m7818H6(ew2Var);
                    Location location = ew2Var.f13723p;
                    int i = ew2Var.f13719l;
                    int i2 = ew2Var.f13732y;
                    try {
                        string2 = new JSONObject(str).getString("max_ad_content_rating");
                    } catch (JSONException unused) {
                        string2 = ew2Var.f13733z;
                    }
                    abstractC2107a.loadInterstitialAd(new C2116j(context, "", bundleM7821F6, bundleM7823G6, zM7818H6, location, i, i2, string2, this.f17077j), c3174je);
                    return;
                } catch (Throwable th) {
                    throw outline.m1577a0("", th);
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List<String> list = ew2Var.f13717j;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j2 = ew2Var.f13714g;
            Date date = j2 == -1 ? null : new Date(j2);
            int i3 = ew2Var.f13716i;
            Location location2 = ew2Var.f13723p;
            boolean zM7818H7 = m7818H6(ew2Var);
            int i4 = ew2Var.f13719l;
            boolean z = ew2Var.f13730w;
            try {
                int i5 = ew2Var.f13732y;
                try {
                    string = new JSONObject(str).getString("max_ad_content_rating");
                } catch (JSONException unused2) {
                    string = ew2Var.f13733z;
                }
                C3026fe c3026fe = new C3026fe(date, i3, hashSet, location2, zM7818H7, i4, z, i5, string);
                Bundle bundle = ew2Var.f13725r;
                mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC2800b.m5639T1(interfaceC2799a), new C3359oe(interfaceC3618vd), m7821F6(str, ew2Var, str2), c3026fe, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th2) {
                th = th2;
                str3 = "";
                throw outline.m1577a0(str3, th);
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: c2 */
    public final void mo7837c2(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, String str2, InterfaceC3618vd interfaceC3618vd, C3165j5 c3165j5, List<String> list) throws JSONException, RemoteException {
        String str3;
        String string;
        String string2;
        Object obj = this.f17073f;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof AbstractC2107a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = AbstractC2107a.class.getCanonicalName();
            String canonicalName3 = this.f17073f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
            outline.m1572W(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            C2622l.m5226A3(sb.toString());
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting native ad from adapter.");
        Object obj2 = this.f17073f;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (obj2 instanceof AbstractC2107a) {
                try {
                    AbstractC2107a abstractC2107a = (AbstractC2107a) obj2;
                    C3211ke c3211ke = new C3211ke(this, interfaceC3618vd);
                    Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
                    Bundle bundleM7821F6 = m7821F6(str, ew2Var, str2);
                    Bundle bundleM7823G6 = m7823G6(ew2Var);
                    boolean zM7818H6 = m7818H6(ew2Var);
                    Location location = ew2Var.f13723p;
                    int i = ew2Var.f13719l;
                    int i2 = ew2Var.f13732y;
                    try {
                        string2 = new JSONObject(str).getString("max_ad_content_rating");
                    } catch (JSONException unused) {
                        string2 = ew2Var.f13733z;
                    }
                    abstractC2107a.loadNativeAd(new C2118l(context, "", bundleM7821F6, bundleM7823G6, zM7818H6, location, i, i2, string2, this.f17077j, c3165j5), c3211ke);
                    return;
                } catch (Throwable th) {
                    throw outline.m1577a0("", th);
                }
            }
            return;
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List<String> list2 = ew2Var.f13717j;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j2 = ew2Var.f13714g;
            Date date = j2 == -1 ? null : new Date(j2);
            int i3 = ew2Var.f13716i;
            Location location2 = ew2Var.f13723p;
            boolean zM7818H7 = m7818H6(ew2Var);
            int i4 = ew2Var.f13719l;
            boolean z = ew2Var.f13730w;
            try {
                int i5 = ew2Var.f13732y;
                try {
                    string = new JSONObject(str).getString("max_ad_content_rating");
                } catch (JSONException unused2) {
                    string = ew2Var.f13733z;
                }
                C3433qe c3433qe = new C3433qe(date, i3, hashSet, location2, zM7818H7, i4, c3165j5, list, z, i5, string);
                Bundle bundle = ew2Var.f13725r;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f17074g = new C3359oe(interfaceC3618vd);
                mediationNativeAdapter.requestNativeAd((Context) BinderC2800b.m5639T1(interfaceC2799a), this.f17074g, m7821F6(str, ew2Var, str2), c3433qe, bundle2);
            } catch (Throwable th2) {
                th = th2;
                str3 = "";
                throw outline.m1577a0(str3, th);
            }
        } catch (Throwable th3) {
            th = th3;
            str3 = "";
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: d */
    public final InterfaceC2799a mo7838d() throws RemoteException {
        Object obj = this.f17073f;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new BinderC2800b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                throw outline.m1577a0("", th);
            }
        }
        if (obj instanceof AbstractC2107a) {
            return new BinderC2800b(null);
        }
        String canonicalName = MediationBannerAdapter.class.getCanonicalName();
        String canonicalName2 = AbstractC2107a.class.getCanonicalName();
        String canonicalName3 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
        outline.m1572W(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: d3 */
    public final void mo7839d3(InterfaceC2799a interfaceC2799a, InterfaceC3438qj interfaceC3438qj, List<String> list) throws RemoteException {
        C2622l.m5226A3("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: e0 */
    public final void mo7840e0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
        Object obj = this.f17073f;
        if (obj instanceof InterfaceC2122p) {
            ((InterfaceC2122p) obj).m4611a(context);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: e3 */
    public final void mo7841e3(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3438qj interfaceC3438qj, String str2) throws RemoteException {
        Object obj = this.f17073f;
        if (obj instanceof AbstractC2107a) {
            this.f17076i = interfaceC2799a;
            this.f17075h = interfaceC3438qj;
            interfaceC3438qj.mo8030h0(new BinderC2800b(obj));
            return;
        }
        String canonicalName = AbstractC2107a.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: g */
    public final void mo7842g() throws RemoteException {
        if (this.f17073f instanceof MediationInterstitialAdapter) {
            C2622l.m5318U2("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f17073f).showInterstitial();
                return;
            } catch (Throwable th) {
                throw outline.m1577a0("", th);
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: h2 */
    public final void mo7843h2(ew2 ew2Var, String str, String str2) throws RemoteException {
        Object obj = this.f17073f;
        if (obj instanceof AbstractC2107a) {
            mo7827N1(this.f17076i, ew2Var, str, new BinderC3396pe((AbstractC2107a) obj, this.f17075h));
            return;
        }
        String canonicalName = AbstractC2107a.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: h3 */
    public final void mo7844h3(InterfaceC2799a interfaceC2799a) throws RemoteException {
        if (this.f17073f instanceof AbstractC2107a) {
            C2622l.m5318U2("Show rewarded ad from adapter.");
            C2622l.m5408n3("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC2107a.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: i */
    public final void mo7845i() throws RemoteException {
        Object obj = this.f17073f;
        if (obj instanceof InterfaceC2112f) {
            try {
                ((InterfaceC2112f) obj).onDestroy();
            } catch (Throwable th) {
                throw outline.m1577a0("", th);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: j */
    public final void mo7846j() throws RemoteException {
        Object obj = this.f17073f;
        if (obj instanceof InterfaceC2112f) {
            try {
                ((InterfaceC2112f) obj).onPause();
            } catch (Throwable th) {
                throw outline.m1577a0("", th);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: l */
    public final boolean mo7847l() throws RemoteException {
        if (this.f17073f instanceof AbstractC2107a) {
            return this.f17075h != null;
        }
        String canonicalName = AbstractC2107a.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: m */
    public final void mo7848m() throws RemoteException {
        Object obj = this.f17073f;
        if (obj instanceof InterfaceC2112f) {
            try {
                ((InterfaceC2112f) obj).onResume();
            } catch (Throwable th) {
                throw outline.m1577a0("", th);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: n */
    public final void mo7849n() throws RemoteException {
        if (this.f17073f instanceof AbstractC2107a) {
            C2622l.m5408n3("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = AbstractC2107a.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
        throw new RemoteException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: n5 */
    public final void mo7850n5(InterfaceC2799a interfaceC2799a, ew2 ew2Var, String str, InterfaceC3618vd interfaceC3618vd) throws RemoteException {
        if (!(this.f17073f instanceof AbstractC2107a)) {
            String canonicalName = AbstractC2107a.class.getCanonicalName();
            String canonicalName2 = this.f17073f.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            C2622l.m5226A3(sb.toString());
            throw new RemoteException();
        }
        C2622l.m5318U2("Requesting rewarded interstitial ad from adapter.");
        try {
            AbstractC2107a abstractC2107a = (AbstractC2107a) this.f17073f;
            C3248le c3248le = new C3248le(this, interfaceC3618vd);
            Context context = (Context) BinderC2800b.m5639T1(interfaceC2799a);
            Bundle bundleM7821F6 = m7821F6(str, ew2Var, null);
            Bundle bundleM7823G6 = m7823G6(ew2Var);
            boolean zM7818H6 = m7818H6(ew2Var);
            Location location = ew2Var.f13723p;
            int i = ew2Var.f13719l;
            int i2 = ew2Var.f13732y;
            String string = ew2Var.f13733z;
            try {
                string = new JSONObject(str).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            abstractC2107a.loadRewardedInterstitialAd(new C2120n(context, "", bundleM7821F6, bundleM7823G6, zM7818H6, location, i, i2, string, ""), c3248le);
        } catch (Exception e) {
            C2622l.m5438t3("", e);
            throw new RemoteException();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: o */
    public final Bundle mo7851o() {
        Object obj = this.f17073f;
        if (obj instanceof zzbic) {
            return ((zzbic) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbic.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
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
        Object obj = this.f17073f;
        if (obj instanceof zzbib) {
            return ((zzbib) obj).zza();
        }
        String canonicalName = zzbib.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5226A3(sb.toString());
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: r */
    public final Bundle mo7854r() {
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: s0 */
    public final void mo7855s0(boolean z) throws RemoteException {
        Object obj = this.f17073f;
        if (obj instanceof InterfaceC2123q) {
            try {
                ((InterfaceC2123q) obj).onImmersiveModeUpdated(z);
                return;
            } catch (Throwable th) {
                C2622l.m5438t3("", th);
                return;
            }
        }
        String canonicalName = InterfaceC2123q.class.getCanonicalName();
        String canonicalName2 = this.f17073f.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        C2622l.m5318U2(sb.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3506sd
    /* JADX INFO: renamed from: v */
    public final InterfaceC3129i6 mo7856v() {
        C3359oe c3359oe = this.f17074g;
        if (c3359oe == null) {
            return null;
        }
        InterfaceC2203f interfaceC2203f = c3359oe.f17604c;
        if (interfaceC2203f instanceof C3166j6) {
            return ((C3166j6) interfaceC2203f).f15491a;
        }
        return null;
    }

    public BinderC3322ne(InterfaceC2112f interfaceC2112f) {
        this.f17073f = interfaceC2112f;
    }
}
