package p555j.p556a.p557a.p558a.p559a.p573i.p574a;

import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;

/* JADX INFO: renamed from: j.a.a.a.a.i.a.f, reason: use source file name */
/* JADX INFO: compiled from: DraftViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.profile.draft.DraftViewModel$deleteDraft$1", m13069f = "DraftViewModel.kt", m13070l = {28}, m13071m = "invokeSuspend")
public final class DraftViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31401j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ DraftViewModel2 f31402k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ long f31403l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftViewModel(DraftViewModel2 draftViewModel2, long j2, Continuation continuation) {
        super(2, continuation);
        this.f31402k = draftViewModel2;
        this.f31403l = j2;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new DraftViewModel(this.f31402k, this.f31403l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new DraftViewModel(this.f31402k, this.f31403l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31401j;
        if (i == 0) {
            C5729a.m12442O(obj);
            RecordingRepository recordingRepository = this.f31402k.f31404s;
            long j2 = this.f31403l;
            this.f31401j = 1;
            if (recordingRepository.mo14203o(j2, this) == intrinsics) {
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
