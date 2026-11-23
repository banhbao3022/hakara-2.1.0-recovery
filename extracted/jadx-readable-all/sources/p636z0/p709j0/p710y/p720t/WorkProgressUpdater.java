package p636z0.p709j0.p710y.p720t;

import java.util.UUID;
import p636z0.p709j0.Data;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.p719s.WorkProgress;
import p636z0.p709j0.p710y.p719s.WorkProgressDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;

/* JADX INFO: renamed from: z0.j0.y.t.p, reason: use source file name */
/* JADX INFO: compiled from: WorkProgressUpdater.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkProgressUpdater implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UUID f37594f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Data f37595g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SettableFuture f37596h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ WorkProgressUpdater2 f37597i;

    public WorkProgressUpdater(WorkProgressUpdater2 workProgressUpdater2, UUID uuid, Data data, SettableFuture settableFuture) {
        this.f37597i = workProgressUpdater2;
        this.f37594f = uuid;
        this.f37595g = data;
        this.f37596h = settableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        String string = this.f37594f.toString();
        Logger9 logger9M15885c = Logger9.m15885c();
        String str = WorkProgressUpdater2.f37598a;
        logger9M15885c.mo15887a(str, String.format("Updating progress for %s (%s)", this.f37594f, this.f37595g), new Throwable[0]);
        this.f37597i.f37599b.m14529c();
        try {
            WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) this.f37597i.f37599b.mo946u()).m15992j(string);
            if (workSpecM15992j == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (workSpecM15992j.f37525b == WorkInfo.RUNNING) {
                WorkProgress workProgress = new WorkProgress(string, this.f37595g);
                WorkProgressDao_Impl workProgressDao_Impl = (WorkProgressDao_Impl) this.f37597i.f37599b.mo945t();
                workProgressDao_Impl.f37520a.m14528b();
                workProgressDao_Impl.f37520a.m14529c();
                try {
                    workProgressDao_Impl.f37521b.m14513f(workProgress);
                    workProgressDao_Impl.f37520a.m14537n();
                    workProgressDao_Impl.f37520a.m14530f();
                } catch (Throwable th) {
                    workProgressDao_Impl.f37520a.m14530f();
                    throw th;
                }
            } else {
                Logger9.m15885c().mo15891g(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
            }
            this.f37596h.m16027k(null);
            this.f37597i.f37599b.m14537n();
        } catch (Throwable th2) {
            try {
                Logger9.m15885c().mo15888b(WorkProgressUpdater2.f37598a, "Error updating Worker progress", th2);
                this.f37596h.m16028l(th2);
            } finally {
                this.f37597i.f37599b.m14530f();
            }
        }
    }
}
