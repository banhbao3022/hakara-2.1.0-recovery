package p636z0.p725k.p736i;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: z0.k.i.n, reason: use source file name */
/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class RequestExecutor implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public String f37931a;

    /* JADX INFO: renamed from: b */
    public int f37932b;

    /* JADX INFO: renamed from: z0.k.i.n$a */
    /* JADX INFO: compiled from: RequestExecutor.java */
    public static class a extends Thread {

        /* JADX INFO: renamed from: f */
        public final int f37933f;

        public a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f37933f = i;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(this.f37933f);
            super.run();
        }
    }

    public RequestExecutor(String str, int i) {
        this.f37931a = str;
        this.f37932b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new a(runnable, this.f37931a, this.f37932b);
    }
}
