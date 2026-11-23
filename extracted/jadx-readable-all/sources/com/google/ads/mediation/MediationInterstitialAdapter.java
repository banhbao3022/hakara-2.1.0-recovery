package com.google.ads.mediation;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p191a.p192d.AbstractC1259e;
import p007c.p190n.p191a.p192d.C1255a;
import p007c.p190n.p191a.p192d.InterfaceC1256b;
import p007c.p190n.p191a.p192d.InterfaceC1258d;
import p007c.p190n.p191a.p192d.InterfaceC1260f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationInterstitialAdapter<ADDITIONAL_PARAMETERS extends InterfaceC1260f, SERVER_PARAMETERS extends AbstractC1259e> extends InterfaceC1256b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // p007c.p190n.p191a.p192d.InterfaceC1256b
    /* synthetic */ void destroy();

    @Override // p007c.p190n.p191a.p192d.InterfaceC1256b
    @RecentlyNonNull
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @Override // p007c.p190n.p191a.p192d.InterfaceC1256b
    @RecentlyNonNull
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestInterstitialAd(@RecentlyNonNull InterfaceC1258d interfaceC1258d, @RecentlyNonNull Activity activity, @RecentlyNonNull SERVER_PARAMETERS server_parameters, @RecentlyNonNull C1255a c1255a, @RecentlyNonNull ADDITIONAL_PARAMETERS additional_parameters);

    void showInterstitial();
}
