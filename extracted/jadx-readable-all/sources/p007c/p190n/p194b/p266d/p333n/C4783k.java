package p007c.p190n.p194b.p266d.p333n;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.k */
/* JADX INFO: loaded from: classes.dex */
public final class C4783k {

    /* JADX INFO: renamed from: a */
    public static final Executor f24684a = new a();

    /* JADX INFO: renamed from: b */
    public static final Executor f24685b = new ExecutorC4776f0();

    /* JADX INFO: renamed from: c.n.b.d.n.k$a */
    public static final class a implements Executor {

        /* JADX INFO: renamed from: f */
        public final Handler f24686f = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f24686f.post(runnable);
        }
    }
}
