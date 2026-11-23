package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2114h;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2117k;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2119m;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2121o;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.C2131f;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.C2132g;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.C2133h;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3359oe;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@KeepName
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* JADX INFO: renamed from: a */
    public static final C2103a f28488a = new C2103a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* JADX INFO: renamed from: b */
    public CustomEventBanner f28489b;

    /* JADX INFO: renamed from: c */
    public CustomEventInterstitial f28490c;

    /* JADX INFO: renamed from: d */
    public CustomEventNative f28491d;

    /* JADX INFO: renamed from: a */
    public static <T> T m12637a(Class<T> cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(str.length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            C2622l.m5226A3(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f28489b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f28490c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f28491d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f28489b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f28490c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f28491d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f28489b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f28490c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f28491d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2114h interfaceC2114h, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C2177g c2177g, @RecentlyNonNull InterfaceC2111e interfaceC2111e, @RecentlyNonNull Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) m12637a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f28489b = customEventBanner;
        if (customEventBanner == null) {
            ((C3359oe) interfaceC2114h).m7998b(this, f28488a);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f28489b;
        Objects.requireNonNull(customEventBanner2);
        customEventBanner2.requestBannerAd(context, new C2131f(this, interfaceC2114h), bundle.getString("parameter"), c2177g, interfaceC2111e, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2117k interfaceC2117k, @RecentlyNonNull Bundle bundle, @RecentlyNonNull InterfaceC2111e interfaceC2111e, @RecentlyNonNull Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m12637a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f28490c = customEventInterstitial;
        if (customEventInterstitial == null) {
            ((C3359oe) interfaceC2117k).m8000d(this, f28488a);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f28490c;
        Objects.requireNonNull(customEventInterstitial2);
        customEventInterstitial2.requestInterstitialAd(context, new C2132g(this, this, interfaceC2117k), bundle.getString("parameter"), interfaceC2111e, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2119m interfaceC2119m, @RecentlyNonNull Bundle bundle, @RecentlyNonNull InterfaceC2121o interfaceC2121o, @RecentlyNonNull Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) m12637a(CustomEventNative.class, bundle.getString("class_name"));
        this.f28491d = customEventNative;
        if (customEventNative == null) {
            ((C3359oe) interfaceC2119m).m8001e(this, f28488a);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f28491d;
        Objects.requireNonNull(customEventNative2);
        customEventNative2.requestNativeAd(context, new C2133h(this, interfaceC2119m), bundle.getString("parameter"), interfaceC2121o, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f28490c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
