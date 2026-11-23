package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2107a;
import p007c.p190n.p194b.p266d.p267a.p269b0.AbstractC2124r;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2113g;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2116j;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2118l;
import p007c.p190n.p194b.p266d.p267a.p269b0.C2120n;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2110d;
import p007c.p190n.p194b.p266d.p267a.p269b0.p271u.C2134a;
import p007c.p190n.p194b.p266d.p267a.p269b0.p271u.InterfaceC2135b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC2107a {
    public abstract void collectSignals(@RecentlyNonNull C2134a c2134a, @RecentlyNonNull InterfaceC2135b interfaceC2135b);

    public void loadRtbBannerAd(@RecentlyNonNull C2113g c2113g, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        loadBannerAd(c2113g, interfaceC2110d);
    }

    public void loadRtbInterscrollerAd(@RecentlyNonNull C2113g c2113g, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        interfaceC2110d.mo4603a(new C2103a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@RecentlyNonNull C2116j c2116j, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        loadInterstitialAd(c2116j, interfaceC2110d);
    }

    public void loadRtbNativeAd(@RecentlyNonNull C2118l c2118l, @RecentlyNonNull InterfaceC2110d<AbstractC2124r, ?> interfaceC2110d) {
        loadNativeAd(c2118l, interfaceC2110d);
    }

    public void loadRtbRewardedAd(@RecentlyNonNull C2120n c2120n, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        loadRewardedAd(c2120n, interfaceC2110d);
    }

    public void loadRtbRewardedInterstitialAd(@RecentlyNonNull C2120n c2120n, @RecentlyNonNull InterfaceC2110d<?, ?> interfaceC2110d) {
        loadRewardedInterstitialAd(c2120n, interfaceC2110d);
    }
}
