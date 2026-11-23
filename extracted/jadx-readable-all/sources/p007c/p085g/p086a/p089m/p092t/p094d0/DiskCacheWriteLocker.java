package p007c.p085g.p086a.p089m.p092t.p094d0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: c.g.a.m.t.d0.c, reason: use source file name */
/* JADX INFO: compiled from: DiskCacheWriteLocker.java */
/* JADX INFO: loaded from: classes.dex */
public final class DiskCacheWriteLocker {

    /* JADX INFO: renamed from: a */
    public final Map<String, a> f3151a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final b f3152b = new b();

    /* JADX INFO: renamed from: c.g.a.m.t.d0.c$a */
    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Lock f3153a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        public int f3154b;
    }

    /* JADX INFO: renamed from: c.g.a.m.t.d0.c$b */
    /* JADX INFO: compiled from: DiskCacheWriteLocker.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final Queue<a> f3155a = new ArrayDeque();
    }

    /* JADX INFO: renamed from: a */
    public void m1778a(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.f3151a.get(str);
            Objects.requireNonNull(aVar2, "Argument must not be null");
            aVar = aVar2;
            int i = aVar.f3154b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f3154b);
            }
            int i2 = i - 1;
            aVar.f3154b = i2;
            if (i2 == 0) {
                a aVarRemove = this.f3151a.remove(str);
                if (!aVarRemove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                }
                b bVar = this.f3152b;
                synchronized (bVar.f3155a) {
                    if (bVar.f3155a.size() < 10) {
                        bVar.f3155a.offer(aVarRemove);
                    }
                }
            }
        }
        aVar.f3153a.unlock();
    }
}
