package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3247ld;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            gx2.f14692a.f14694c.m6697a(this, new BinderC3247ld()).mo8005I0(intent);
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 50);
            sb.append("RemoteException calling handleNotificationIntent: ");
            sb.append(strValueOf);
            C2622l.m5408n3(sb.toString());
        }
    }
}
