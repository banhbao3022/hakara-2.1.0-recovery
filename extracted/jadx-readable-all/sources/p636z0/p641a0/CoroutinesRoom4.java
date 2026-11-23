package p636z0.p641a0;

import android.os.CancellationSignal;
import java.util.Objects;
import java.util.concurrent.Callable;
import p007c.p451o.p452a.C5729a;
import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CancellableContinuationImpl4;
import p500e1.p501a.CoroutineScope2;
import p636z0.p770y.p773v.C8462c;

/* JADX INFO: renamed from: z0.a0.g, reason: use source file name */
/* JADX INFO: compiled from: CoroutinesRoom.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutinesRoom4 {

    /* JADX INFO: renamed from: a */
    public static final a f34241a = new a(null);

    /* JADX INFO: renamed from: z0.a0.g$a */
    /* JADX INFO: compiled from: CoroutinesRoom.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final <R> Object m14510a(RoomDatabase roomDatabase, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, Continuation<? super R> continuation) {
        ContinuationInterceptor continuationInterceptorM16944k;
        Objects.requireNonNull(f34241a);
        if (roomDatabase.m14535l() && roomDatabase.m14531h()) {
            return callable.call();
        }
        RoomDatabase4 roomDatabase4 = (RoomDatabase4) continuation.getContext().get(RoomDatabase4.f34368f);
        if (roomDatabase4 == null || (continuationInterceptorM16944k = roomDatabase4.f34371i) == null) {
            continuationInterceptorM16944k = z ? C8462c.m16944k(roomDatabase) : C8462c.m16943j(roomDatabase);
        }
        CancellableContinuationImpl4 cancellableContinuationImpl4 = new CancellableContinuationImpl4(IntrinsicsJvm.m13064b(continuation), 1);
        cancellableContinuationImpl4.m13271x();
        cancellableContinuationImpl4.mo13254i(new CoroutinesRoom2(C5729a.m12428A(CoroutineScope2.f29811f, continuationInterceptorM16944k, 0, new CoroutinesRoom(cancellableContinuationImpl4, null, continuationInterceptorM16944k, callable, cancellationSignal), 2, null), continuationInterceptorM16944k, callable, cancellationSignal));
        Object objM13268s = cancellableContinuationImpl4.m13268s();
        if (objM13268s != Intrinsics.COROUTINE_SUSPENDED) {
            return objM13268s;
        }
        Intrinsics2.m13089e(continuation, "frame");
        return objM13268s;
    }

    /* JADX INFO: renamed from: b */
    public static final <R> Object m14511b(RoomDatabase roomDatabase, boolean z, Callable<R> callable, Continuation<? super R> continuation) {
        ContinuationInterceptor continuationInterceptorM16944k;
        Objects.requireNonNull(f34241a);
        if (roomDatabase.m14535l() && roomDatabase.m14531h()) {
            return callable.call();
        }
        RoomDatabase4 roomDatabase4 = (RoomDatabase4) continuation.getContext().get(RoomDatabase4.f34368f);
        if (roomDatabase4 == null || (continuationInterceptorM16944k = roomDatabase4.f34371i) == null) {
            continuationInterceptorM16944k = z ? C8462c.m16944k(roomDatabase) : C8462c.m16943j(roomDatabase);
        }
        return C5729a.m12445R(continuationInterceptorM16944k, new CoroutinesRoom3(callable, null), continuation);
    }
}
