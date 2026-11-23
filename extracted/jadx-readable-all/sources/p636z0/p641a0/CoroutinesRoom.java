package p636z0.p641a0;

import android.os.CancellationSignal;
import java.util.concurrent.Callable;
import p007c.p451o.p452a.C5729a;
import p477d1.Result;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CancellableContinuation;
import p500e1.p501a.CoroutineScope;

/* JADX INFO: renamed from: z0.a0.d, reason: use source file name */
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(m13068c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", m13069f = "CoroutinesRoom.kt", m13070l = {}, m13071m = "invokeSuspend")
public final class CoroutinesRoom extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CancellableContinuation f34233j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ContinuationInterceptor f34234k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Callable f34235l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ CancellationSignal f34236m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom(CancellableContinuation cancellableContinuation, Continuation continuation, ContinuationInterceptor continuationInterceptor, Callable callable, CancellationSignal cancellationSignal) {
        super(2, continuation);
        this.f34233j = cancellableContinuation;
        this.f34234k = continuationInterceptor;
        this.f34235l = callable;
        this.f34236m = cancellationSignal;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new CoroutinesRoom(this.f34233j, continuation, this.f34234k, this.f34235l, this.f34236m);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        CoroutinesRoom coroutinesRoom = (CoroutinesRoom) mo4a(coroutineScope, continuation);
        Unit unit = Unit.f29502a;
        coroutinesRoom.mo6m(unit);
        return unit;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        C5729a.m12442O(obj);
        try {
            Object objCall = this.f34235l.call();
            CancellableContinuation cancellableContinuation = this.f34233j;
            Result.a aVar = Result.f29493f;
            cancellableContinuation.mo13056g(objCall);
        } catch (Throwable th) {
            CancellableContinuation cancellableContinuation2 = this.f34233j;
            Result.a aVar2 = Result.f29493f;
            cancellableContinuation2.mo13056g(C5729a.m12456k(th));
        }
        return Unit.f29502a;
    }
}
