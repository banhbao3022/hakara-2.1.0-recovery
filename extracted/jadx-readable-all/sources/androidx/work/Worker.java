package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;

/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {

    /* JADX INFO: renamed from: k */
    public SettableFuture<ListenableWorker.AbstractC0224a> f1358k;

    /* JADX INFO: renamed from: androidx.work.Worker$a */
    public class RunnableC0225a implements Runnable {
        public RunnableC0225a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f1358k.m16027k(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f1358k.m16028l(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.AbstractC0224a doWork();

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.AbstractC0224a> startWork() {
        this.f1358k = new SettableFuture<>();
        getBackgroundExecutor().execute(new RunnableC0225a());
        return this.f1358k;
    }
}
