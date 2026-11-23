package p007c.p154j.p155g;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.j.g.f, reason: use source file name */
/* JADX INFO: compiled from: MainThreadExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class MainThreadExecutor implements Executor {

    /* JADX INFO: renamed from: f */
    public final Handler f4422f = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4422f.post(runnable);
    }
}
