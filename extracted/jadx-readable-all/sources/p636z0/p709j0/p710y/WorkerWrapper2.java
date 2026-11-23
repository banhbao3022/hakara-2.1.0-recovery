package p636z0.p709j0.p710y;

import android.annotation.SuppressLint;
import androidx.work.ListenableWorker;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;

/* JADX INFO: renamed from: z0.j0.y.n, reason: use source file name */
/* JADX INFO: compiled from: WorkerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkerWrapper2 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SettableFuture f37352f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f37353g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ WorkerWrapper3 f37354h;

    public WorkerWrapper2(WorkerWrapper3 workerWrapper3, SettableFuture settableFuture, String str) {
        this.f37354h = workerWrapper3;
        this.f37352f = settableFuture;
        this.f37353g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public void run() {
        try {
            try {
                ListenableWorker.AbstractC0224a abstractC0224a = (ListenableWorker.AbstractC0224a) this.f37352f.get();
                if (abstractC0224a == null) {
                    Logger9.m15885c().mo15888b(WorkerWrapper3.f37355f, String.format("%s returned a null result. Treating it as a failure.", this.f37354h.f37360k.f37526c), new Throwable[0]);
                } else {
                    Logger9.m15885c().mo15887a(WorkerWrapper3.f37355f, String.format("%s returned a %s result.", this.f37354h.f37360k.f37526c, abstractC0224a), new Throwable[0]);
                    this.f37354h.f37362m = abstractC0224a;
                }
            } catch (InterruptedException e) {
                e = e;
                Logger9.m15885c().mo15888b(WorkerWrapper3.f37355f, String.format("%s failed because it threw an exception/error", this.f37353g), e);
            } catch (CancellationException e2) {
                Logger9.m15885c().mo15889d(WorkerWrapper3.f37355f, String.format("%s was cancelled", this.f37353g), e2);
            } catch (ExecutionException e3) {
                e = e3;
                Logger9.m15885c().mo15888b(WorkerWrapper3.f37355f, String.format("%s failed because it threw an exception/error", this.f37353g), e);
            }
            this.f37354h.m15922c();
        } catch (Throwable th) {
            this.f37354h.m15922c();
            throw th;
        }
    }
}
