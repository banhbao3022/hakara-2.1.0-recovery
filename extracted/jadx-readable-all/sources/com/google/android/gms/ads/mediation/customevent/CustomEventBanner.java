package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.C2177g;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2111e;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.InterfaceC2126a;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.InterfaceC2127b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface CustomEventBanner extends InterfaceC2126a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2127b interfaceC2127b, String str, @RecentlyNonNull C2177g c2177g, @RecentlyNonNull InterfaceC2111e interfaceC2111e, Bundle bundle);
}
