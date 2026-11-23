package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3247ld;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class OfflineNotificationPoster extends Worker {

    /* JADX INFO: renamed from: l */
    public final InterfaceC3435qg f28463l;

    public OfflineNotificationPoster(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28463l = gx2.f14692a.f14694c.m6697a(context, new BinderC3247ld());
    }

    @Override // androidx.work.Worker
    @RecentlyNonNull
    public final ListenableWorker.AbstractC0224a doWork() {
        try {
            this.f28463l.mo8006O0(new BinderC2800b(getApplicationContext()), getInputData().m15880b("uri"), getInputData().m15880b("gws_query_id"));
            return new ListenableWorker.AbstractC0224a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.AbstractC0224a.a();
        }
    }
}
