package p636z0.p709j0.p710y.p720t;

import android.content.Context;
import java.util.UUID;
import p636z0.p709j0.ForegroundInfo;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.Processor;
import p636z0.p709j0.p710y.p718r.SystemForegroundDispatcher2;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p720t.p721s.AbstractFuture;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;

/* JADX INFO: renamed from: z0.j0.y.t.n, reason: use source file name */
/* JADX INFO: compiled from: WorkForegroundUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkForegroundUpdater implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SettableFuture f37586f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ UUID f37587g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ForegroundInfo f37588h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f37589i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ WorkForegroundUpdater2 f37590j;

    public WorkForegroundUpdater(WorkForegroundUpdater2 workForegroundUpdater2, SettableFuture settableFuture, UUID uuid, ForegroundInfo foregroundInfo, Context context) {
        this.f37590j = workForegroundUpdater2;
        this.f37586f = settableFuture;
        this.f37587g = uuid;
        this.f37588h = foregroundInfo;
        this.f37589i = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!(this.f37586f.f37614j instanceof AbstractFuture.c)) {
                String string = this.f37587g.toString();
                WorkInfo workInfoM15989g = ((WorkSpecDao_Impl) this.f37590j.f37593c).m15989g(string);
                if (workInfoM15989g == null || workInfoM15989g.m15892f()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                ((Processor) this.f37590j.f37592b).m15903f(string, this.f37588h);
                this.f37589i.startService(SystemForegroundDispatcher2.m15967a(this.f37589i, string, this.f37588h));
            }
            this.f37586f.m16027k(null);
        } catch (Throwable th) {
            this.f37586f.m16028l(th);
        }
    }
}
