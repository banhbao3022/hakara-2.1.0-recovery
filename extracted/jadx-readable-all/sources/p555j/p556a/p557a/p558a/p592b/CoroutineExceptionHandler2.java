package p555j.p556a.p557a.p558a.p592b;

import kotlinx.coroutines.CoroutineExceptionHandler;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.CoroutineContextImpl;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.b.u, reason: use source file name */
/* JADX INFO: compiled from: CoroutineExceptionHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CoroutineExceptionHandler2 extends CoroutineContextImpl implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BaseViewModel.c f32044f;

    /* JADX INFO: renamed from: j.a.a.a.b.u$a */
    /* JADX INFO: compiled from: BaseViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.base.BaseViewModel$exceptionHandler$2$1$1", m13069f = "BaseViewModel.kt", m13070l = {34}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f32045j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Throwable f32046k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ CoroutineExceptionHandler2 f32047l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Throwable th, Continuation continuation, CoroutineExceptionHandler2 coroutineExceptionHandler2) {
            super(2, continuation);
            this.f32046k = th;
            this.f32047l = coroutineExceptionHandler2;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new a(this.f32046k, continuation, this.f32047l);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return new a(this.f32046k, continuation2, this.f32047l).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f32045j;
            if (i == 0) {
                C5729a.m12442O(obj);
                BaseViewModel baseViewModel = BaseViewModel.this;
                Throwable th = this.f32046k;
                this.f32045j = 1;
                if (baseViewModel.mo13964m(th, this) == intrinsics) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineExceptionHandler2(CoroutineContext.b bVar, BaseViewModel.c cVar) {
        super(bVar);
        this.f32044f = cVar;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public void handleException(CoroutineContext coroutineContext, Throwable th) {
        C5729a.m12428A(C8310a.m16440e(BaseViewModel.this), null, 0, new a(th, null, this), 3, null);
    }
}
