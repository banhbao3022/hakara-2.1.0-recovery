package p555j.p556a.p557a.p558a.p559a.p567e;

import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p623k1.Response4;

/* JADX INFO: renamed from: j.a.a.a.a.e.d, reason: use source file name */
/* JADX INFO: compiled from: RecordingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.recording.RecordingViewModel$deleteRecording$1", m13069f = "RecordingViewModel.kt", m13070l = {155, 159}, m13071m = "invokeSuspend")
public final class RecordingViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31247j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ RecordingViewModel2 f31248k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31249l;

    /* JADX INFO: renamed from: j.a.a.a.a.e.d$a */
    /* JADX INFO: compiled from: RecordingViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.recording.RecordingViewModel$deleteRecording$1$1", m13069f = "RecordingViewModel.kt", m13070l = {156}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Boolean>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31250j;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return RecordingViewModel.this.new a(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            Continuation<? super Boolean> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return RecordingViewModel.this.new a(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31250j;
            if (i == 0) {
                C5729a.m12442O(obj);
                RecordingViewModel recordingViewModel = RecordingViewModel.this;
                RecordingRepository recordingRepository = recordingViewModel.f31248k.f31259z;
                int i2 = recordingViewModel.f31249l;
                this.f31250j = 1;
                obj = recordingRepository.mo14206r(i2, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            return Boolean.valueOf(((Response4) obj).m14315a());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecordingViewModel(RecordingViewModel2 recordingViewModel2, int i, Continuation continuation) {
        super(2, continuation);
        this.f31248k = recordingViewModel2;
        this.f31249l = i;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new RecordingViewModel(this.f31248k, this.f31249l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new RecordingViewModel(this.f31248k, this.f31249l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31247j;
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
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
            a aVar = new a(null);
            this.f31247j = 1;
            if (C5729a.m12445R(mainCoroutineDispatcher, aVar, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            RecordingViewModel2 recordingViewModel2 = this.f31248k;
            this.f31247j = 2;
            if (recordingViewModel2.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
