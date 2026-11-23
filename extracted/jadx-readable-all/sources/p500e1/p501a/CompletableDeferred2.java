package p500e1.p501a;

import p007c.p451o.p452a.C5729a;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p486i.IntrinsicsJvm;
import p477d1.p485u.p487j.p488a.ContinuationImpl3;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: e1.a.s, reason: use source file name */
/* JADX INFO: compiled from: CompletableDeferred.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CompletableDeferred2<T> extends C6270h1 implements CompletableDeferred<T> {

    /* JADX INFO: renamed from: e1.a.s$a */
    /* JADX INFO: compiled from: CompletableDeferred.kt */
    @DebugMetadata(m13068c = "kotlinx.coroutines.CompletableDeferredImpl", m13069f = "CompletableDeferred.kt", m13070l = {86}, m13071m = "await")
    public static final class a extends ContinuationImpl3 {

        /* JADX INFO: renamed from: i */
        public /* synthetic */ Object f29798i;

        /* JADX INFO: renamed from: j */
        public int f29799j;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) {
            this.f29798i = obj;
            this.f29799j |= Integer.MIN_VALUE;
            return CompletableDeferred2.this.m13290R(this);
        }
    }

    public CompletableDeferred2(Job job) {
        super(true);
        m13220A(job);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: R */
    public Object m13290R(Continuation<? super T> continuation) throws Throwable {
        a aVar;
        Object objM13242x;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.f29799j;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.f29799j = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objM13259a = aVar.f29798i;
        int i2 = aVar.f29799j;
        if (i2 == 0) {
            C5729a.m12442O(objM13259a);
            aVar.f29799j = 1;
            do {
                objM13242x = m13242x();
                if (!(objM13242x instanceof InterfaceC6317x0)) {
                    if (objM13242x instanceof CompletionState2) {
                        throw ((CompletionState2) objM13242x).f29810b;
                    }
                    objM13259a = C6273i1.m13259a(objM13242x);
                }
                if (objM13259a == intrinsics) {
                    return intrinsics;
                }
            } while (m13225L(objM13242x) < 0);
            C6270h1.a aVar2 = new C6270h1.a(IntrinsicsJvm.m13064b(aVar), this);
            C5729a.m12458m(aVar2, mo13125D(false, true, new C6294p1(aVar2)));
            objM13259a = aVar2.m13268s();
            if (objM13259a == intrinsics) {
                Intrinsics2.m13089e(aVar, "frame");
            }
            if (objM13259a == intrinsics) {
                return intrinsics;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5729a.m12442O(objM13259a);
        }
        return objM13259a;
    }

    @Override // p500e1.p501a.CompletableDeferred
    /* JADX INFO: renamed from: g0 */
    public boolean mo13289g0(T t) throws Throwable {
        Object objM13229P;
        do {
            objM13229P = m13229P(m13242x(), t);
            if (objM13229P == C6273i1.f29755a) {
                return false;
            }
            if (objM13229P == C6273i1.f29756b) {
                break;
            }
        } while (objM13229P == C6273i1.f29757c);
        return true;
    }
}
