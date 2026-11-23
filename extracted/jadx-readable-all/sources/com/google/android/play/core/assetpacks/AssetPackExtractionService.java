package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p194b.p367f.p368a.p370b.BinderC5071z;

/* JADX INFO: loaded from: classes.dex */
public class AssetPackExtractionService extends Service {

    /* JADX INFO: renamed from: f */
    public BinderC5071z f29264f;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f29264f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f29264f = C4799a.m10985e0(getApplicationContext()).f25781z.mo11416a();
    }
}
