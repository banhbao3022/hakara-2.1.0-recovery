package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2117k;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialAdapter extends InterfaceC2112f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2117k interfaceC2117k, @RecentlyNonNull Bundle bundle, @RecentlyNonNull InterfaceC2111e interfaceC2111e, @RecentlyNonNull Bundle bundle2);

    void showInterstitial();
}
