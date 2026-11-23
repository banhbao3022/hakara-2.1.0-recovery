package p555j.p556a.p557a.p558a.p559a.p567e.p568b;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.remote.response.GetRecordingListResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p614e.RecordingRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.e.b.d, reason: use source file name */
/* JADX INFO: compiled from: RecordingRankingViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingRankingViewModel extends BaseLoadMoreRefreshViewModel<Recording> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31217s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Integer> f31218t;

    /* JADX INFO: renamed from: u */
    public final RecordingRepository f31219u;

    /* JADX INFO: renamed from: j.a.a.a.a.e.b.d$a */
    /* JADX INFO: compiled from: RecordingRankingViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.recording.ranking.RecordingRankingViewModel$loadData$1", m13069f = "RecordingRankingViewModel.kt", m13070l = {30, 30, 33}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31220j;

        /* JADX INFO: renamed from: k */
        public Object f31221k;

        /* JADX INFO: renamed from: l */
        public int f31222l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31224n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ HashMap f31225o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31224n = i;
            this.f31225o = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return RecordingRankingViewModel.this.new a(this.f31224n, this.f31225o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return RecordingRankingViewModel.this.new a(this.f31224n, this.f31225o, continuation2).mo6m(Unit.f29502a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0069 A[RETURN] */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            RecordingRankingViewModel recordingRankingViewModel;
            int i;
            ArrayList<Recording> results;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31222l;
            try {
                if (i2 == 0) {
                    C5729a.m12442O(obj);
                    Integer numM421d = RecordingRankingViewModel.this.f31217s.m421d();
                    if (numM421d != null) {
                        RecordingRankingViewModel recordingRankingViewModel2 = RecordingRankingViewModel.this;
                        int i3 = this.f31224n;
                        RecordingRepository recordingRepository = recordingRankingViewModel2.f31219u;
                        Intrinsics2.m13088d(numM421d, "it");
                        int iIntValue = numM421d.intValue();
                        HashMap<String, Object> map = this.f31225o;
                        this.f31221k = recordingRankingViewModel2;
                        this.f31220j = i3;
                        this.f31222l = 1;
                        obj = recordingRepository.mo14208t(iIntValue, map, this);
                        if (obj == intrinsics) {
                            return intrinsics;
                        }
                        recordingRankingViewModel = recordingRankingViewModel2;
                        i = i3;
                        results = ((GetRecordingListResponse) obj).getResults();
                        this.f31221k = null;
                        this.f31222l = 2;
                        if (recordingRankingViewModel.m13986v(i, results, this) == intrinsics) {
                            return intrinsics;
                        }
                    }
                } else if (i2 == 1) {
                    i = this.f31220j;
                    recordingRankingViewModel = (RecordingRankingViewModel) this.f31221k;
                    C5729a.m12442O(obj);
                    results = ((GetRecordingListResponse) obj).getResults();
                    this.f31221k = null;
                    this.f31222l = 2;
                    if (recordingRankingViewModel.m13986v(i, results, this) == intrinsics) {
                        return intrinsics;
                    }
                } else {
                    if (i2 != 2 && i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
            } catch (Exception e) {
                RecordingRankingViewModel recordingRankingViewModel3 = RecordingRankingViewModel.this;
                this.f31221k = null;
                this.f31222l = 3;
                if (recordingRankingViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public RecordingRankingViewModel(RecordingRepository recordingRepository) {
        Intrinsics2.m13089e(recordingRepository, "recordingRepository");
        this.f31219u = recordingRepository;
        this.f31217s = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(2);
        this.f31218t = mutableLiveData;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", Integer.valueOf(i));
        Integer numM421d = this.f31218t.m421d();
        if (numM421d != null && numM421d.intValue() == 2) {
            map.put("type", "monthly");
        }
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, map, null), 3, null);
    }
}
