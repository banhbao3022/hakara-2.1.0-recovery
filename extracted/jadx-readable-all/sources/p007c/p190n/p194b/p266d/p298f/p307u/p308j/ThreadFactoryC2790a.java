package p007c.p190n.p194b.p266d.p298f.p307u.p308j;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.u.j.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC2790a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final String f11953a;

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f11954b = Executors.defaultThreadFactory();

    public ThreadFactoryC2790a(@RecentlyNonNull String str) {
        C2622l.m5379i(str, "Name must not be null");
        this.f11953a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @RecentlyNonNull
    public final Thread newThread(@RecentlyNonNull Runnable runnable) {
        Thread threadNewThread = this.f11954b.newThread(new RunnableC2791b(runnable, 0));
        threadNewThread.setName(this.f11953a);
        return threadNewThread;
    }
}
