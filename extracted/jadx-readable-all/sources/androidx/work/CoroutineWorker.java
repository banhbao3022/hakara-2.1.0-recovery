package androidx.work;

import android.content.Context;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CompletableJob;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p636z0.p709j0.p710y.p720t.p721s.AbstractFuture;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* JADX INFO: renamed from: k */
    public final CompletableJob f1345k;

    /* JADX INFO: renamed from: l */
    public final SettableFuture<ListenableWorker.AbstractC0224a> f1346l;

    /* JADX INFO: renamed from: m */
    public final CoroutineDispatcher f1347m;

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$a */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    public static final class RunnableC0222a implements Runnable {
        public RunnableC0222a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.f1346l.f37614j instanceof AbstractFuture.c) {
                C5729a.m12453h(CoroutineWorker.this.f1345k, null, 1, null);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$b */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @DebugMetadata(m13068c = "androidx.work.CoroutineWorker$startWork$1", m13069f = "CoroutineWorker.kt", m13070l = {69}, m13071m = "invokeSuspend")
    public static final class C0223b extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f1349j;

        public C0223b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return CoroutineWorker.this.new C0223b(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return CoroutineWorker.this.new C0223b(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f1349j;
            try {
                if (i == 0) {
                    C5729a.m12442O(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f1349j = 1;
                    obj = coroutineWorker.m940a(this);
                    if (obj == intrinsics) {
                        return intrinsics;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                CoroutineWorker.this.f1346l.m16027k((ListenableWorker.AbstractC0224a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.f1346l.m16028l(th);
            }
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        Intrinsics2.m13089e(context, "appContext");
        Intrinsics2.m13089e(workerParameters, "params");
        this.f1345k = C5729a.m12447b(null, 1, null);
        SettableFuture<ListenableWorker.AbstractC0224a> settableFuture = new SettableFuture<>();
        Intrinsics2.m13088d(settableFuture, "SettableFuture.create()");
        this.f1346l = settableFuture;
        RunnableC0222a runnableC0222a = new RunnableC0222a();
        TaskExecutor2 taskExecutor = getTaskExecutor();
        Intrinsics2.m13088d(taskExecutor, "taskExecutor");
        settableFuture.mo11664h(runnableC0222a, ((WorkManagerTaskExecutor) taskExecutor).f37639a);
        this.f1347m = Dispatchers.f29769a;
    }

    /* JADX INFO: renamed from: a */
    public abstract Object m940a(Continuation<? super ListenableWorker.AbstractC0224a> continuation);

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.f1346l.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.AbstractC0224a> startWork() {
        C5729a.m12428A(C5729a.m12446a(this.f1347m.plus(this.f1345k)), null, 0, new C0223b(null), 3, null);
        return this.f1346l;
    }
}
