package p555j.p556a.p557a.p558a.p559a.p562c;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Simple3;
import mtp.media.karaoke.data.remote.response.GetListResponse;
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
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.c.i, reason: use source file name */
/* JADX INFO: compiled from: ExploreViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.explore.ExploreViewModel$loadExplores$1", m13069f = "ExploreViewModel.kt", m13070l = {46, 48}, m13071m = "invokeSuspend")
public final class ExploreViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31137j;

    /* JADX INFO: renamed from: k */
    public int f31138k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ExploreViewModel f31139l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreViewModel2(ExploreViewModel exploreViewModel, Continuation continuation) {
        super(2, continuation);
        this.f31139l = exploreViewModel;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new ExploreViewModel2(this.f31139l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new ExploreViewModel2(this.f31139l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        MutableLiveData<ArrayList<Simple3>> mutableLiveData;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31138k;
        try {
            if (i != 0) {
                if (i == 1) {
                    mutableLiveData = (MutableLiveData) this.f31137j;
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
            HashMap<String, Object> map = new HashMap<>();
            ExploreViewModel exploreViewModel = this.f31139l;
            MutableLiveData<ArrayList<Simple3>> mutableLiveData2 = exploreViewModel.f31118l;
            RecordingRepository recordingRepository = exploreViewModel.f31130x;
            this.f31137j = mutableLiveData2;
            this.f31138k = 1;
            obj = recordingRepository.mo14202n(map, this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            mutableLiveData = mutableLiveData2;
            ArrayList<Simple3> results = ((GetListResponse) obj).getResults();
            Intrinsics2.m13087c(results);
            mutableLiveData.mo427j(results);
        } catch (Exception e) {
            ExploreViewModel exploreViewModel2 = this.f31139l;
            this.f31137j = null;
            this.f31138k = 2;
            if (exploreViewModel2.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
