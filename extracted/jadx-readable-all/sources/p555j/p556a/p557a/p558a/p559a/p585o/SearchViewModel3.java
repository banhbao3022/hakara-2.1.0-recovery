package p555j.p556a.p557a.p558a.p559a.p585o;

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

/* JADX INFO: renamed from: j.a.a.a.a.o.j, reason: use source file name */
/* JADX INFO: compiled from: SearchViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.search.SearchViewModel$insertRecentKeyword$1", m13069f = "SearchViewModel.kt", m13070l = {37, 43}, m13071m = "invokeSuspend")
public final class SearchViewModel3 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31712j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ SearchViewModel7 f31713k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ String f31714l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ long f31715m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel3(SearchViewModel7 searchViewModel7, String str, long j2, Continuation continuation) {
        super(2, continuation);
        this.f31713k = searchViewModel7;
        this.f31714l = str;
        this.f31715m = j2;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new SearchViewModel3(this.f31713k, this.f31714l, this.f31715m, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new SearchViewModel3(this.f31713k, this.f31714l, this.f31715m, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31712j;
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
        SearchRepository searchRepository = this.f31713k.f31735q;
        String str = this.f31714l;
        this.f31712j = 1;
        obj = searchRepository.mo14211b(str, this);
        if (obj == intrinsics) {
            return intrinsics;
        }
        KeywordEntity keywordEntity = (KeywordEntity) obj;
        if (keywordEntity == null) {
            String str2 = this.f31714l;
            long j2 = this.f31715m;
            keywordEntity = new KeywordEntity(null, str2, j2, j2, 1, null);
        } else {
            keywordEntity.f32326i = this.f31715m;
        }
        SearchRepository searchRepository2 = this.f31713k.f31735q;
        this.f31712j = 2;
        if (searchRepository2.mo14212c(keywordEntity, this) == intrinsics) {
            return intrinsics;
        }
        return Unit.f29502a;
    }
}
