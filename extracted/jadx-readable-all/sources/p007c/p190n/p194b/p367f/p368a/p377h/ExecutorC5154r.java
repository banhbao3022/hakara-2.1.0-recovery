package p007c.p190n.p194b.p367f.p368a.p377h;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.f.a.h.r */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC5154r implements Executor {

    /* JADX INFO: renamed from: f */
    public final Handler f26117f = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f26117f.post(runnable);
    }
}
