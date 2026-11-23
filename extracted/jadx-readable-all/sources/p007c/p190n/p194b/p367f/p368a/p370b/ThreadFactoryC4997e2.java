package p007c.p190n.p194b.p367f.p368a.p370b;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: c.n.b.f.a.b.e2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ThreadFactoryC4997e2 implements ThreadFactory {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f25752c = 0;

    /* JADX INFO: renamed from: b */
    public static final ThreadFactory f25751b = new ThreadFactoryC4997e2(null);

    /* JADX INFO: renamed from: a */
    public static final ThreadFactory f25750a = new ThreadFactoryC4997e2();

    public ThreadFactoryC4997e2() {
    }

    public ThreadFactoryC4997e2(byte[] bArr) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return this.f25752c != 0 ? new Thread(runnable, "AssetPackBackgroundExecutor") : new Thread(runnable, "UpdateListenerExecutor");
    }
}
