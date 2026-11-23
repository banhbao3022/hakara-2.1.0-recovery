package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import p007c.p190n.p194b.p195a.p198j.AutoValue_TransportContext;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.TransportRuntime;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader6;
import p007c.p190n.p194b.p195a.p198j.p208y.PriorityMapping;

/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f28310a = 0;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        TransportRuntime.m2821b(context);
        TransportContext.a aVarM2819a = TransportContext.m2819a();
        aVarM2819a.mo2812b(queryParameter);
        aVarM2819a.mo2814d(PriorityMapping.m2880b(iIntValue));
        if (queryParameter2 != null) {
            ((AutoValue_TransportContext.b) aVarM2819a).f5721b = Base64.decode(queryParameter2, 0);
        }
        Uploader6 uploader6 = TransportRuntime.m2820a().f5753e;
        uploader6.f5852e.execute(new Uploader(uploader6, aVarM2819a.mo2811a(), i, new Runnable() { // from class: c.n.b.a.j.v.h.a
            @Override // java.lang.Runnable
            public void run() {
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f28310a;
            }
        }));
    }
}
