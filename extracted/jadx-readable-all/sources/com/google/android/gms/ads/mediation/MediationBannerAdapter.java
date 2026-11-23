package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2114h;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationBannerAdapter extends InterfaceC2112f {
    @RecentlyNonNull
    View getBannerView();

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzbic, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2114h interfaceC2114h, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C2177g c2177g, @RecentlyNonNull InterfaceC2111e interfaceC2111e, @RecentlyNonNull Bundle bundle2);
}
