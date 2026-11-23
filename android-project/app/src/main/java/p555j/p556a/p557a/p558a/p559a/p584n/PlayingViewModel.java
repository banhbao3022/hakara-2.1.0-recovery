package p555j.p556a.p557a.p558a.p559a.p584n;

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

/* JADX INFO: renamed from: j.a.a.a.a.n.j, reason: use source file name */
/* JADX INFO: compiled from: PlayingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.playing.PlayingViewModel$getRecordingDetail$1", m13069f = "PlayingViewModel.kt", m13070l = {22, 27}, m13071m = "invokeSuspend")
public final class PlayingViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31687j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ PlayingViewModel4 f31688k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31689l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayingViewModel(PlayingViewModel4 playingViewModel4, int i, Continuation continuation) {
        super(2, continuation);
        this.f31688k = playingViewModel4;
        this.f31689l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new PlayingViewModel(this.f31688k, this.f31689l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new PlayingViewModel(this.f31688k, this.f31689l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31687j;
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
            RecordingRepository recordingRepository = this.f31688k.f31698n;
            int i2 = this.f31689l;
            this.f31687j = 1;
            obj = recordingRepository.mo14207s(i2, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            Recording recording = (Recording) ((GetItemResponse) obj).getResults();
            if (recording != null) {
                this.f31688k.f31696l.mo427j(recording);
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
            PlayingViewModel4 playingViewModel4 = this.f31688k;
            this.f31687j = 2;
            if (playingViewModel4.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
