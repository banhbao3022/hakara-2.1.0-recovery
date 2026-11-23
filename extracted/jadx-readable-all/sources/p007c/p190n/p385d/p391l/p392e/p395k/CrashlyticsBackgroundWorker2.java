package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.d.l.e.k.i, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsBackgroundWorker.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsBackgroundWorker2 implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f26522a;

    public CrashlyticsBackgroundWorker2(CrashlyticsBackgroundWorker crashlyticsBackgroundWorker, Runnable runnable) {
        this.f26522a = runnable;
    }

    @Override // java.util.concurrent.Callable
    public Void call() throws Exception {
        this.f26522a.run();
        return null;
    }
}
