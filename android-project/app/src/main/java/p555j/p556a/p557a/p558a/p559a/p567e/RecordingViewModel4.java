package p555j.p556a.p557a.p558a.p559a.p567e;

import java.util.HashMap;
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

/* JADX INFO: renamed from: j.a.a.a.a.e.g, reason: use source file name */
/* JADX INFO: compiled from: RecordingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.recording.RecordingViewModel$updateRecording$1", m13069f = "RecordingViewModel.kt", m13070l = {145, 147}, m13071m = "invokeSuspend")
public final class RecordingViewModel4 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31277j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ RecordingViewModel2 f31278k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31279l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ HashMap f31280m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingViewModel4(RecordingViewModel2 recordingViewModel2, int i, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.f31278k = recordingViewModel2;
        this.f31279l = i;
        this.f31280m = map;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new RecordingViewModel4(this.f31278k, this.f31279l, this.f31280m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new RecordingViewModel4(this.f31278k, this.f31279l, this.f31280m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31277j;
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
            RecordingRepository recordingRepository = this.f31278k.f31259z;
            int i2 = this.f31279l;
            HashMap<String, String> map = this.f31280m;
            this.f31277j = 1;
            if (recordingRepository.mo14200l(i2, map, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            RecordingViewModel2 recordingViewModel2 = this.f31278k;
            this.f31277j = 2;
            if (recordingViewModel2.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
