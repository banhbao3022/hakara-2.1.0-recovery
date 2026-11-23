package p636z0.p725k.p735h;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: z0.k.h.b, reason: use source file name */
/* JADX INFO: compiled from: ExecutorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class ExecutorCompat implements Executor {

    /* JADX INFO: renamed from: f */
    public final Handler f37893f;

    public ExecutorCompat(Handler handler) {
        Objects.requireNonNull(handler);
        this.f37893f = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Handler handler = this.f37893f;
        Objects.requireNonNull(runnable);
        if (handler.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.f37893f + " is shutting down");
    }
}
