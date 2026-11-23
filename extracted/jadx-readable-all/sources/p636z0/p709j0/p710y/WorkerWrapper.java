package p636z0.p709j0.p710y;

import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;

/* JADX INFO: renamed from: z0.j0.y.m, reason: use source file name */
/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkerWrapper implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SettableFuture f37350f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ WorkerWrapper3 f37351g;

    public WorkerWrapper(WorkerWrapper3 workerWrapper3, SettableFuture settableFuture) {
        this.f37351g = workerWrapper3;
        this.f37350f = settableFuture;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Logger9.m15885c().mo15887a(WorkerWrapper3.f37355f, String.format("Starting work for %s", this.f37351g.f37360k.f37526c), new Throwable[0]);
            WorkerWrapper3 workerWrapper3 = this.f37351g;
            workerWrapper3.f37373x = workerWrapper3.f37361l.startWork();
            this.f37350f.m16029m(this.f37351g.f37373x);
        } catch (Throwable th) {
            this.f37350f.m16028l(th);
        }
    }
}
