package p500e1.p501a;

/* JADX INFO: renamed from: e1.a.v1 */
/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C6312v1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<AbstractC6290o0> f29812a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b */
    public static final C6312v1 f29813b = null;

    /* JADX INFO: renamed from: a */
    public static final AbstractC6290o0 m13295a() {
        ThreadLocal<AbstractC6290o0> threadLocal = f29812a;
        AbstractC6290o0 abstractC6290o0 = threadLocal.get();
        if (abstractC6290o0 != null) {
            return abstractC6290o0;
        }
        EventLoop eventLoop = new EventLoop(Thread.currentThread());
        threadLocal.set(eventLoop);
        return eventLoop;
    }
}
