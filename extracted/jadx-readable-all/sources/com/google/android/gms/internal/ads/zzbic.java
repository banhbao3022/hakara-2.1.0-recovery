package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface zzbic extends MediationInterstitialAdapter {
    Bundle getInterstitialAdapterInfo();

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();
}
