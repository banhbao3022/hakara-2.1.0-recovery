package p500e1.p501a.p503c2;

import java.util.Objects;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p500e1.p501a.ThreadContextElement;

/* JADX INFO: renamed from: e1.a.c2.s, reason: use source file name */
/* JADX INFO: compiled from: ThreadContext.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadContext {

    /* JADX INFO: renamed from: a */
    public static final Symbol f29671a = new Symbol("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6168p<Object, CoroutineContext.a, Object> f29672b = a.f29675g;

    /* JADX INFO: renamed from: c */
    public static final InterfaceC6168p<ThreadContextElement<?>, CoroutineContext.a, ThreadContextElement<?>> f29673c = b.f29676g;

    /* JADX INFO: renamed from: d */
    public static final InterfaceC6168p<ThreadContext4, CoroutineContext.a, ThreadContext4> f29674d = c.f29677g;

    /* JADX INFO: renamed from: e1.a.c2.s$a */
    /* JADX INFO: compiled from: ThreadContext.kt */
    public static final class a extends Lambda implements InterfaceC6168p<Object, CoroutineContext.a, Object> {

        /* JADX INFO: renamed from: g */
        public static final a f29675g = new a();

        public a() {
            super(2);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public Object mo5l(Object obj, CoroutineContext.a aVar) {
            CoroutineContext.a aVar2 = aVar;
            if (!(aVar2 instanceof ThreadContextElement)) {
                return obj;
            }
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? aVar2 : Integer.valueOf(iIntValue + 1);
        }
    }

    /* JADX INFO: renamed from: e1.a.c2.s$b */
    /* JADX INFO: compiled from: ThreadContext.kt */
    public static final class b extends Lambda implements InterfaceC6168p<ThreadContextElement<?>, CoroutineContext.a, ThreadContextElement<?>> {

        /* JADX INFO: renamed from: g */
        public static final b f29676g = new b();

        public b() {
            super(2);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public ThreadContextElement<?> mo5l(ThreadContextElement<?> threadContextElement, CoroutineContext.a aVar) {
            ThreadContextElement<?> threadContextElement2 = threadContextElement;
            CoroutineContext.a aVar2 = aVar;
            if (threadContextElement2 != null) {
                return threadContextElement2;
            }
            if (!(aVar2 instanceof ThreadContextElement)) {
                aVar2 = null;
            }
            return (ThreadContextElement) aVar2;
        }
    }

    /* JADX INFO: renamed from: e1.a.c2.s$c */
    /* JADX INFO: compiled from: ThreadContext.kt */
    public static final class c extends Lambda implements InterfaceC6168p<ThreadContext4, CoroutineContext.a, ThreadContext4> {

        /* JADX INFO: renamed from: g */
        public static final c f29677g = new c();

        public c() {
            super(2);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public ThreadContext4 mo5l(ThreadContext4 threadContext4, CoroutineContext.a aVar) {
            ThreadContext4 threadContext5 = threadContext4;
            CoroutineContext.a aVar2 = aVar;
            if (aVar2 instanceof ThreadContextElement) {
                ThreadContextElement<Object> threadContextElement = (ThreadContextElement) aVar2;
                Object objMo13166z0 = threadContextElement.mo13166z0(threadContext5.f29686d);
                Object[] objArr = threadContext5.f29683a;
                int i = threadContext5.f29685c;
                objArr[i] = objMo13166z0;
                ThreadContextElement<Object>[] threadContextElementArr = threadContext5.f29684b;
                threadContext5.f29685c = i + 1;
                threadContextElementArr[i] = threadContextElement;
            }
            return threadContext5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m13163a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f29671a) {
            return;
        }
        if (!(obj instanceof ThreadContext4)) {
            Object objFold = coroutineContext.fold(null, f29673c);
            Objects.requireNonNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((ThreadContextElement) objFold).mo13165f0(coroutineContext, obj);
            return;
        }
        ThreadContext4 threadContext4 = (ThreadContext4) obj;
        int length = threadContext4.f29684b.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            ThreadContextElement<Object> threadContextElement = threadContext4.f29684b[length];
            Intrinsics2.m13087c(threadContextElement);
            threadContextElement.mo13165f0(coroutineContext, threadContext4.f29683a[length]);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m13164b(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, f29672b);
            Intrinsics2.m13087c(obj);
        }
        if (obj == 0) {
            return f29671a;
        }
        return obj instanceof Integer ? coroutineContext.fold(new ThreadContext4(coroutineContext, ((Number) obj).intValue()), f29674d) : ((ThreadContextElement) obj).mo13166z0(coroutineContext);
    }
}
