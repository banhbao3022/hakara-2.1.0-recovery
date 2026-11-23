package p500e1.p501a.p503c2;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.c2.u, reason: use source file name */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadContext3 implements CoroutineContext.b<ThreadContext2<?>> {

    /* JADX INFO: renamed from: f */
    public final ThreadLocal<?> f29681f;

    public ThreadContext3(ThreadLocal<?> threadLocal) {
        this.f29681f = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ThreadContext3) && Intrinsics2.m13085a(this.f29681f, ((ThreadContext3) obj).f29681f);
        }
        return true;
    }

    public int hashCode() {
        ThreadLocal<?> threadLocal = this.f29681f;
        if (threadLocal != null) {
            return threadLocal.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ThreadLocalKey(threadLocal=");
        sbM1556G.append(this.f29681f);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }
}
