package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2117k;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2223f;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C2830a4;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2961dn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3359oe;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.C3768zf;
import p007c.p190n.p194b.p266d.p314j.p315a.RunnableC2842ag;
import p636z0.p663d.p664a.CustomTabsIntent;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzasz implements MediationInterstitialAdapter {

    /* JADX INFO: renamed from: a */
    public Activity f28689a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2117k f28690b;

    /* JADX INFO: renamed from: c */
    public Uri f28691c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onDestroy() {
        C2622l.m5318U2("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onPause() {
        C2622l.m5318U2("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void onResume() {
        C2622l.m5318U2("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, InterfaceC2117k interfaceC2117k, Bundle bundle, InterfaceC2111e interfaceC2111e, Bundle bundle2) {
        this.f28690b = interfaceC2117k;
        if (interfaceC2117k == null) {
            C2622l.m5226A3("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            C2622l.m5226A3("AdMobCustomTabs can only work with Activity context. Bailing out.");
            ((C3359oe) this.f28690b).m7999c(this, 0);
            return;
        }
        if (!C2830a4.m5684a(context)) {
            C2622l.m5226A3("Default browser does not support custom tabs. Bailing out.");
            ((C3359oe) this.f28690b).m7999c(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            C2622l.m5226A3("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            ((C3359oe) this.f28690b).m7999c(this, 0);
        } else {
            this.f28689a = (Activity) context;
            this.f28691c = Uri.parse(string);
            ((C3359oe) this.f28690b).m8002f(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        CustomTabsIntent customTabsIntentM15061a = new CustomTabsIntent.a().m15061a();
        customTabsIntentM15061a.f35369a.setData(this.f28691c);
        C2267h1.f10713a.post(new RunnableC2842ag(this, new AdOverlayInfoParcel(new C2223f(customTabsIntentM15061a.f35369a, null), null, new C3768zf(this), null, new C3702xn(0, 0, false, false, false), null)));
        C2330u c2330u = C2330u.f10884a;
        C2961dn c2961dn = c2330u.f10893h.f13621j;
        Objects.requireNonNull(c2961dn);
        long jMo5623c = c2330u.f10896k.mo5623c();
        synchronized (c2961dn.f13322a) {
            if (c2961dn.f13324c == 3) {
                if (c2961dn.f13323b + ((Long) C2862b.f12493a.f12496d.m6596a(C3052g3.f14160B3)).longValue() <= jMo5623c) {
                    c2961dn.f13324c = 1;
                }
            }
        }
        long jMo5623c2 = c2330u.f10896k.mo5623c();
        synchronized (c2961dn.f13322a) {
            if (c2961dn.f13324c != 2) {
                return;
            }
            c2961dn.f13324c = 3;
            if (c2961dn.f13324c == 3) {
                c2961dn.f13323b = jMo5623c2;
            }
        }
    }
}
