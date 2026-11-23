package p555j.p556a.p557a.p558a.p559a.p571g;

import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.CommentRepository;

/* JADX INFO: renamed from: j.a.a.a.a.g.d, reason: use source file name */
/* JADX INFO: compiled from: CommentViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.comment.CommentViewModel$deleteComment$1", m13069f = "CommentViewModel.kt", m13070l = {67}, m13071m = "invokeSuspend")
public final class CommentViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31343j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CommentViewModel3 f31344k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31345l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewModel2(CommentViewModel3 commentViewModel3, int i, Continuation continuation) {
        super(2, continuation);
        this.f31344k = commentViewModel3;
        this.f31345l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new CommentViewModel2(this.f31344k, this.f31345l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new CommentViewModel2(this.f31344k, this.f31345l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31343j;
        if (i == 0) {
            C5729a.m12442O(obj);
            CommentRepository commentRepository = this.f31344k.f31349v;
            int i2 = this.f31345l;
            this.f31343j = 1;
            if (commentRepository.mo14177v(i2, this) == intrinsics) {
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
