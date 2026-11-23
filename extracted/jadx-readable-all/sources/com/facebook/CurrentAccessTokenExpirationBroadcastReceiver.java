package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p007c.p165l.AccessToken;
import p007c.p165l.AccessTokenManager2;
import p007c.p165l.FacebookSdk;

/* JADX INFO: loaded from: classes.dex */
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && FacebookSdk.m2664f()) {
            AccessTokenManager2 accessTokenManager2M2259a = AccessTokenManager2.m2259a();
            AccessToken accessToken = accessTokenManager2M2259a.f4523d;
            accessTokenManager2M2259a.m2261c(accessToken, accessToken);
        }
    }
}
