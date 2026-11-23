package com.google.ads.mediation.customevent;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p191a.p192d.C1255a;
import p007c.p190n.p191a.p192d.p193g.InterfaceC1262b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface CustomEventInterstitial {
    /* synthetic */ void destroy();

    void requestInterstitialAd(@RecentlyNonNull InterfaceC1262b interfaceC1262b, @RecentlyNonNull Activity activity, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull C1255a c1255a, @RecentlyNonNull Object obj);

    void showInterstitial();
}
