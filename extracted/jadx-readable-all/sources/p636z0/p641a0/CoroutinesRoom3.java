package p636z0.p641a0;

import java.util.concurrent.Callable;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: renamed from: z0.a0.f, reason: use source file name */
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(m13068c = "androidx.room.CoroutinesRoom$Companion$execute$2", m13069f = "CoroutinesRoom.kt", m13070l = {}, m13071m = "invokeSuspend")
public final class CoroutinesRoom3<R> extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super R>, Object> {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Callable f34240j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom3(Callable callable, Continuation continuation) {
        super(2, continuation);
        this.f34240j = callable;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new CoroutinesRoom3(this.f34240j, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Object obj) throws Throwable {
        Continuation continuation = (Continuation) obj;
        Intrinsics2.m13089e(continuation, "completion");
        Callable callable = this.f34240j;
        new CoroutinesRoom3(callable, continuation);
        C5729a.m12442O(Unit.f29502a);
        return callable.call();
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        C5729a.m12442O(obj);
        return this.f34240j.call();
    }
}
