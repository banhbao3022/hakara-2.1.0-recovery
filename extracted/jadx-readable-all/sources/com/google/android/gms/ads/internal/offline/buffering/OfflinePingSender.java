package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import p007c.p190n.p194b.p266d.p314j.p315a.BinderC3247ld;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3435qg;
import p007c.p190n.p194b.p266d.p314j.p315a.gx2;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class OfflinePingSender extends Worker {

    /* JADX INFO: renamed from: l */
    public final InterfaceC3435qg f28464l;

    public OfflinePingSender(@RecentlyNonNull Context context, @RecentlyNonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f28464l = gx2.f14692a.f14694c.m6697a(context, new BinderC3247ld());
    }

    @Override // androidx.work.Worker
    @RecentlyNonNull
    public final ListenableWorker.AbstractC0224a doWork() {
        try {
            this.f28464l.mo8007f();
            return new ListenableWorker.AbstractC0224a.c();
        } catch (RemoteException unused) {
            return new ListenableWorker.AbstractC0224a.a();
        }
    }
}
