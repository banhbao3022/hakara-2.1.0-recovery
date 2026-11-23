package p477d1.p485u.p486i;

import java.util.Objects;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.ContinuationInterceptor;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl4;
import p477d1.p485u.p487j.p488a.ContinuationImpl;
import p477d1.p485u.p487j.p488a.ContinuationImpl3;
import p477d1.p485u.p487j.p488a.ContinuationImpl4;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.TypeIntrinsics;

/* JADX INFO: renamed from: d1.u.i.b, reason: use source file name */
/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes.dex */
public class IntrinsicsJvm {

    /* JADX INFO: renamed from: d1.u.i.b$a */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class a extends ContinuationImpl4 {

        /* JADX INFO: renamed from: g */
        public int f29538g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Continuation f29539h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6168p f29540i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Object f29541j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Continuation continuation, Continuation continuation2, InterfaceC6168p interfaceC6168p, Object obj) {
            super(continuation2);
            this.f29539h = continuation;
            this.f29540i = interfaceC6168p;
            this.f29541j = obj;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public Object mo6m(Object obj) throws Throwable {
            int i = this.f29538g;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f29538g = 2;
                C5729a.m12442O(obj);
                return obj;
            }
            this.f29538g = 1;
            C5729a.m12442O(obj);
            InterfaceC6168p interfaceC6168p = this.f29540i;
            Objects.requireNonNull(interfaceC6168p, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            TypeIntrinsics.m13099a(interfaceC6168p, 2);
            return interfaceC6168p.mo5l(this.f29541j, this);
        }
    }

    /* JADX INFO: renamed from: d1.u.i.b$b */
    /* JADX INFO: compiled from: IntrinsicsJvm.kt */
    public static final class b extends ContinuationImpl3 {

        /* JADX INFO: renamed from: i */
        public int f29542i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ Continuation f29543j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ CoroutineContext f29544k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ InterfaceC6168p f29545l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ Object f29546m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Continuation continuation, CoroutineContext coroutineContext, Continuation continuation2, CoroutineContext coroutineContext2, InterfaceC6168p interfaceC6168p, Object obj) {
            super(continuation2, coroutineContext2);
            this.f29543j = continuation;
            this.f29544k = coroutineContext;
            this.f29545l = interfaceC6168p;
            this.f29546m = obj;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public Object mo6m(Object obj) throws Throwable {
            int i = this.f29542i;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f29542i = 2;
                C5729a.m12442O(obj);
                return obj;
            }
            this.f29542i = 1;
            C5729a.m12442O(obj);
            InterfaceC6168p interfaceC6168p = this.f29545l;
            Objects.requireNonNull(interfaceC6168p, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            TypeIntrinsics.m13099a(interfaceC6168p, 2);
            return interfaceC6168p.mo5l(this.f29546m, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static final <R, T> Continuation<Unit> m13063a(InterfaceC6168p<? super R, ? super Continuation<? super T>, ? extends Object> interfaceC6168p, R r, Continuation<? super T> continuation) {
        Intrinsics2.m13089e(interfaceC6168p, "$this$createCoroutineUnintercepted");
        Intrinsics2.m13089e(continuation, "completion");
        Intrinsics2.m13089e(continuation, "completion");
        if (interfaceC6168p instanceof ContinuationImpl) {
            return ((ContinuationImpl) interfaceC6168p).mo4a(r, continuation);
        }
        CoroutineContext context = continuation.getContext();
        return context == CoroutineContextImpl4.f29535f ? new a(continuation, continuation, interfaceC6168p, r) : new b(continuation, context, continuation, context, interfaceC6168p, r);
    }

    /* JADX INFO: renamed from: b */
    public static final <T> Continuation<T> m13064b(Continuation<? super T> continuation) {
        Intrinsics2.m13089e(continuation, "$this$intercepted");
        ContinuationImpl3 continuationImpl3 = (ContinuationImpl3) (!(continuation instanceof ContinuationImpl3) ? null : continuation);
        if (continuationImpl3 != null && (continuation = (Continuation<T>) continuationImpl3.f29549g) == null) {
            CoroutineContext coroutineContext = continuationImpl3.f29550h;
            Intrinsics2.m13087c(coroutineContext);
            int i = ContinuationInterceptor.f29532c;
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContext.get(ContinuationInterceptor.a.f29533f);
            if (continuationInterceptor == null || (continuation = (Continuation<T>) continuationInterceptor.mo13058f(continuationImpl3)) == null) {
                continuation = continuationImpl3;
            }
            continuationImpl3.f29549g = continuation;
        }
        return (Continuation<T>) continuation;
    }
}
