package p636z0.p641a0;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.LockSupport;
import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.AbstractC6290o0;
import p500e1.p501a.Builders;
import p500e1.p501a.C6273i1;
import p500e1.p501a.C6312v1;
import p500e1.p501a.CancellableContinuation;
import p500e1.p501a.CompletionState2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.InterfaceC6317x0;
import p500e1.p501a.Job;

/* JADX INFO: renamed from: z0.a0.s, reason: use source file name */
/* JADX INFO: compiled from: RoomDatabase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class RoomDatabase3 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CancellableContinuation f34335f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Executor f34336g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Job f34337h;

    /* JADX INFO: renamed from: z0.a0.s$a */
    /* JADX INFO: compiled from: RoomDatabase.kt */
    @DebugMetadata(m13068c = "androidx.room.RoomDatabaseKt$acquireTransactionThread$2$2$1", m13069f = "RoomDatabase.kt", m13070l = {124}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public /* synthetic */ Object f34338j;

        /* JADX INFO: renamed from: k */
        public int f34339k;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            a aVar = RoomDatabase3.this.new a(continuation);
            aVar.f34338j = obj;
            return aVar;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            a aVar = RoomDatabase3.this.new a(continuation2);
            aVar.f34338j = coroutineScope;
            return aVar.mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f34339k;
            if (i == 0) {
                C5729a.m12442O(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f34338j;
                CancellableContinuation cancellableContinuation = RoomDatabase3.this.f34335f;
                CoroutineContext coroutineContextMo417h = coroutineScope.mo417h();
                int i2 = ContinuationInterceptor.f29532c;
                CoroutineContext.a aVar = coroutineContextMo417h.get(ContinuationInterceptor.a.f29533f);
                Intrinsics2.m13087c(aVar);
                Result.a aVar2 = Result.f29493f;
                cancellableContinuation.mo13056g(aVar);
                Job job = RoomDatabase3.this.f34337h;
                this.f34339k = 1;
                if (job.mo13130u(this) == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            return Unit.f29502a;
        }
    }

    public RoomDatabase3(CancellableContinuation cancellableContinuation, Executor executor, Job job) {
        this.f34335f = cancellableContinuation;
        this.f34336g = executor;
        this.f34337h = job;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InterfaceC6168p aVar = new a(null);
        Thread threadCurrentThread = Thread.currentThread();
        ContinuationInterceptor.a aVar2 = ContinuationInterceptor.a.f29533f;
        Intrinsics2.m13089e(aVar2, "key");
        C6312v1 c6312v1 = C6312v1.f29813b;
        AbstractC6290o0 abstractC6290o0M13295a = C6312v1.m13295a();
        Intrinsics2.m13089e(abstractC6290o0M13295a, "context");
        Intrinsics2.m13089e(abstractC6290o0M13295a, "context");
        CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
        Builders builders = new Builders((abstractC6290o0M13295a == coroutineDispatcher || abstractC6290o0M13295a.get(aVar2) != null) ? abstractC6290o0M13295a : abstractC6290o0M13295a.plus(coroutineDispatcher), threadCurrentThread, abstractC6290o0M13295a);
        builders.m13114U(1, builders, aVar);
        AbstractC6290o0 abstractC6290o0 = builders.f29688j;
        if (abstractC6290o0 != null) {
            int i = AbstractC6290o0.f29776g;
            abstractC6290o0.m13277K0(false);
        }
        while (!Thread.interrupted()) {
            try {
                AbstractC6290o0 abstractC6290o1 = builders.f29688j;
                long jMo13279M0 = abstractC6290o1 != null ? abstractC6290o1.mo13279M0() : Long.MAX_VALUE;
                if (!(builders.m13242x() instanceof InterfaceC6317x0)) {
                    AbstractC6290o0 abstractC6290o2 = builders.f29688j;
                    if (abstractC6290o2 != null) {
                        int i2 = AbstractC6290o0.f29776g;
                        abstractC6290o2.m13274H0(false);
                    }
                    Object objM13259a = C6273i1.m13259a(builders.m13242x());
                    CompletionState2 completionState2 = (CompletionState2) (objM13259a instanceof CompletionState2 ? objM13259a : null);
                    if (completionState2 != null) {
                        throw completionState2.f29810b;
                    }
                    return;
                }
                LockSupport.parkNanos(builders, jMo13279M0);
            } catch (Throwable th) {
                AbstractC6290o0 abstractC6290o3 = builders.f29688j;
                if (abstractC6290o3 != null) {
                    int i3 = AbstractC6290o0.f29776g;
                    abstractC6290o3.m13274H0(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        builders.m13232k(interruptedException);
        throw interruptedException;
    }
}
