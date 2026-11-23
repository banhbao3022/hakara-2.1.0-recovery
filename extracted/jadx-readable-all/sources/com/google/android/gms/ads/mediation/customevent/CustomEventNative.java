package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2121o;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.InterfaceC2126a;
import p007c.p190n.p194b.p266d.p267a.p269b0.p270t.InterfaceC2130e;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface CustomEventNative extends InterfaceC2126a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull InterfaceC2130e interfaceC2130e, String str, @RecentlyNonNull InterfaceC2121o interfaceC2121o, Bundle bundle);
}
