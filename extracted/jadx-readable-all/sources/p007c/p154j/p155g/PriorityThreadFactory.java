package p007c.p154j.p155g;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: c.j.g.g, reason: use source file name */
/* JADX INFO: compiled from: PriorityThreadFactory.java */
/* JADX INFO: loaded from: classes.dex */
public class PriorityThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: c.j.g.g$a */
    /* JADX INFO: compiled from: PriorityThreadFactory.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Runnable f4423f;

        public a(Runnable runnable) {
            this.f4423f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Objects.requireNonNull(PriorityThreadFactory.this);
                Process.setThreadPriority(10);
            } catch (Throwable unused) {
            }
            this.f4423f.run();
        }
    }

    public PriorityThreadFactory(int i) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(new a(runnable));
    }
}
