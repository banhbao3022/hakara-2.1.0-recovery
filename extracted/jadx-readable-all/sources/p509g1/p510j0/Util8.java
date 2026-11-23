package p509g1.p510j0;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: g1.j0.b, reason: use source file name */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Util8 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f30068a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f30069b;

    public Util8(String str, boolean z) {
        this.f30068a = str;
        this.f30069b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.f30068a);
        thread.setDaemon(this.f30069b);
        return thread;
    }
}
