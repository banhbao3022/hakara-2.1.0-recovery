package p555j.p556a.p557a.p558a.p559a.p585o;

import java.util.List;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p609c.p611b.KeywordEntity;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.o.l, reason: use source file name */
/* JADX INFO: compiled from: SearchViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.search.SearchViewModel$loadRecentKeywords$1", m13069f = "SearchViewModel.kt", m13070l = {58}, m13071m = "invokeSuspend")
public final class SearchViewModel5 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31718j;

    /* JADX INFO: renamed from: k */
    public int f31719k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ SearchViewModel7 f31720l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel5(SearchViewModel7 searchViewModel7, Continuation continuation) {
        super(2, continuation);
        this.f31720l = searchViewModel7;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new SearchViewModel5(this.f31720l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new SearchViewModel5(this.f31720l, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31719k;
        try {
            if (i == 0) {
                C5729a.m12442O(obj);
                SearchViewModel7 searchViewModel7 = this.f31720l;
                MutableLiveData<List<KeywordEntity>> mutableLiveData2 = searchViewModel7.f31733o;
                SearchRepository searchRepository = searchViewModel7.f31735q;
                this.f31718j = mutableLiveData2;
                this.f31719k = 1;
                obj = searchRepository.mo14218i(5, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                mutableLiveData = mutableLiveData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.f31718j;
                C5729a.m12442O(obj);
            }
            mutableLiveData.mo427j(obj);
            List<KeywordEntity> listM421d = this.f31720l.f31733o.m421d();
            if (listM421d != null) {
                Intrinsics2.m13088d(listM421d, "it");
                if (!listM421d.isEmpty()) {
                    this.f31720l.f31734p = true;
                }
            }
        } catch (Exception e) {
            Intrinsics2.m13089e(String.valueOf(e.getMessage()), "message");
        }
        return Unit.f29502a;
    }
}
