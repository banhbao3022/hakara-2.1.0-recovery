package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2112f;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2119m;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2121o;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface MediationNativeAdapter extends InterfaceC2112f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2119m interfaceC2119m, @RecentlyNonNull Bundle bundle, @RecentlyNonNull InterfaceC2121o interfaceC2121o, @RecentlyNonNull Bundle bundle2);
}
