package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.InterfaceC2126a;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.InterfaceC2129d;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface CustomEventInterstitial extends InterfaceC2126a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2129d interfaceC2129d, String str, @RecentlyNonNull InterfaceC2111e interfaceC2111e, Bundle bundle);

    void showInterstitial();
}
