package p636z0.p709j0.p710y.p720t.p722t;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p636z0.p709j0.p710y.p720t.SerialExecutor;

/* JADX INFO: renamed from: z0.j0.y.t.t.b, reason: use source file name */
/* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkManagerTaskExecutor implements TaskExecutor2 {

    /* JADX INFO: renamed from: a */
    public final SerialExecutor f37639a;

    /* JADX INFO: renamed from: b */
    public final Handler f37640b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public final Executor f37641c = new a();

    /* JADX INFO: renamed from: z0.j0.y.t.t.b$a */
    /* JADX INFO: compiled from: WorkManagerTaskExecutor.java */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.f37640b.post(runnable);
        }
    }

    public WorkManagerTaskExecutor(Executor executor) {
        this.f37639a = new SerialExecutor(executor);
    }
}
