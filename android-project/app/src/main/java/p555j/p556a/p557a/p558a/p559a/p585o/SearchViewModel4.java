package p555j.p556a.p557a.p558a.p559a.p585o;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Keyword;
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
import p555j.p556a.p557a.p606h.p614e.SearchRepository;

/* JADX INFO: renamed from: j.a.a.a.a.o.k, reason: use source file name */
/* JADX INFO: compiled from: SearchViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.search.SearchViewModel$loadMostKeywords$1", m13069f = "SearchViewModel.kt", m13070l = {75, 80}, m13071m = "invokeSuspend")
public final class SearchViewModel4 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31716j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ SearchViewModel7 f31717k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel4(SearchViewModel7 searchViewModel7, Continuation continuation) {
        super(2, continuation);
        this.f31717k = searchViewModel7;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new SearchViewModel4(this.f31717k, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new SearchViewModel4(this.f31717k, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31716j;
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
            SearchRepository searchRepository = this.f31717k.f31735q;
            this.f31716j = 1;
            obj = searchRepository.mo14213d(1, "search_count DESC", this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            ArrayList<Keyword> results = ((GetListResponse) obj).getResults();
            if (results != null) {
                this.f31717k.f31731m.mo427j(results);
            }
        } catch (Exception e) {
            SearchViewModel7 searchViewModel7 = this.f31717k;
            this.f31716j = 2;
            if (searchViewModel7.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
