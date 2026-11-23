package com.google.ads.mediation;

import android.app.Activity;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p191a.C1254c;
import p007c.p190n.p191a.p192d.AbstractC1259e;
import p007c.p190n.p191a.p192d.C1255a;
import p007c.p190n.p191a.p192d.InterfaceC1256b;
import p007c.p190n.p191a.p192d.InterfaceC1257c;
import p007c.p190n.p191a.p192d.InterfaceC1260f;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationBannerAdapter<ADDITIONAL_PARAMETERS extends InterfaceC1260f, SERVER_PARAMETERS extends AbstractC1259e> extends InterfaceC1256b<ADDITIONAL_PARAMETERS, SERVER_PARAMETERS> {
    @Override // p007c.p190n.p191a.p192d.InterfaceC1256b
    /* synthetic */ void destroy();

    @Override // p007c.p190n.p191a.p192d.InterfaceC1256b
    @RecentlyNonNull
    /* synthetic */ Class<ADDITIONAL_PARAMETERS> getAdditionalParametersType();

    @RecentlyNonNull
    View getBannerView();

    @Override // p007c.p190n.p191a.p192d.InterfaceC1256b
    @RecentlyNonNull
    /* synthetic */ Class<SERVER_PARAMETERS> getServerParametersType();

    void requestBannerAd(@RecentlyNonNull InterfaceC1257c interfaceC1257c, @RecentlyNonNull Activity activity, @RecentlyNonNull SERVER_PARAMETERS server_parameters, @RecentlyNonNull C1254c c1254c, @RecentlyNonNull C1255a c1255a, @RecentlyNonNull ADDITIONAL_PARAMETERS additional_parameters);
}
