package p500e1.p501a;

import java.util.concurrent.locks.LockSupport;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.d, reason: use source file name */
/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Builders<T> extends AbstractCoroutine<T> {

    /* JADX INFO: renamed from: i */
    public final Thread f29687i;

    /* JADX INFO: renamed from: j */
    public final AbstractC6290o0 f29688j;

    public Builders(CoroutineContext coroutineContext, Thread thread, AbstractC6290o0 abstractC6290o0) {
        super(coroutineContext, true);
        this.f29687i = thread;
        this.f29688j = abstractC6290o0;
    }

    @Override // p500e1.p501a.C6270h1
    /* JADX INFO: renamed from: d */
    public void mo13162d(Object obj) {
        if (!Intrinsics2.m13085a(Thread.currentThread(), this.f29687i)) {
            LockSupport.unpark(this.f29687i);
        }
    }
}
