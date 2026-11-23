package p007c.p085g.p086a.p112s;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.g.a.s.e, reason: use source file name */
/* JADX INFO: compiled from: Executors.java */
/* JADX INFO: loaded from: classes.dex */
public final class Executors {

    /* JADX INFO: renamed from: a */
    public static final Executor f3816a = new a();

    /* JADX INFO: renamed from: b */
    public static final Executor f3817b = new b();

    /* JADX INFO: renamed from: c.g.a.s.e$a */
    /* JADX INFO: compiled from: Executors.java */
    public class a implements Executor {

        /* JADX INFO: renamed from: f */
        public final Handler f3818f = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f3818f.post(runnable);
        }
    }

    /* JADX INFO: renamed from: c.g.a.s.e$b */
    /* JADX INFO: compiled from: Executors.java */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
