package p555j.p556a.p557a.p558a.p559a.p573i;

import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;

/* JADX INFO: renamed from: j.a.a.a.a.i.o */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.ProfileRecordingFragment$moreAction$1$2", m13069f = "ProfileRecordingFragment.kt", m13070l = {232}, m13071m = "invokeSuspend")
public final class C6697o extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31479j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C6698p f31480k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31481l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6697o(C6698p c6698p, int i, Continuation continuation) {
        super(2, continuation);
        this.f31480k = c6698p;
        this.f31481l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new C6697o(this.f31480k, this.f31481l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new C6697o(this.f31480k, this.f31481l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31479j;
        if (i == 0) {
            C5729a.m12442O(obj);
            this.f31479j = 1;
            if (C5729a.m12457l(100L, this) == intrinsics) {
                return intrinsics;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5729a.m12442O(obj);
        }
        this.f31480k.f31482g.mo13892e1().m664f(this.f31481l);
        return Unit.f29502a;
    }
}
