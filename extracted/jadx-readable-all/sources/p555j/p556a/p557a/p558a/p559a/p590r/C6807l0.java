package p555j.p556a.p557a.p558a.p559a.p590r;

import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.remote.response.GetItemResponse;
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

/* JADX INFO: renamed from: j.a.a.a.a.r.l0 */
/* JADX INFO: compiled from: SingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.sing.SingViewModel$getRecordingDuetInvite$1", m13069f = "SingViewModel.kt", m13070l = {192, 198}, m13071m = "invokeSuspend")
public final class C6807l0 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31898j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C6799h0 f31899k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31900l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6807l0(C6799h0 c6799h0, int i, Continuation continuation) {
        super(2, continuation);
        this.f31899k = c6799h0;
        this.f31900l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new C6807l0(this.f31899k, this.f31900l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new C6807l0(this.f31899k, this.f31900l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31898j;
        try {
            if (i != 0) {
                if (i == 1) {
                    C5729a.m12442O(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
                return Unit.f29502a;
            }
            C5729a.m12442O(obj);
            RecordingRepository recordingRepository = this.f31899k.f31871z;
            int i2 = this.f31900l;
            this.f31898j = 1;
            obj = recordingRepository.mo14194f(i2, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            Recording recording = (Recording) ((GetItemResponse) obj).getResults();
            if (recording != null) {
                this.f31899k.f31859n.mo427j(recording);
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            C6799h0 c6799h0 = this.f31899k;
            this.f31898j = 2;
            if (c6799h0.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
