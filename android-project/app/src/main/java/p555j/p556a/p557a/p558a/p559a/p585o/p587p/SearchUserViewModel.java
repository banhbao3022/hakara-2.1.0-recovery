package p555j.p556a.p557a.p558a.p559a.p585o.p587p;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.User;
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
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel;
import p555j.p556a.p557a.p606h.p614e.SearchRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.o.p.c, reason: use source file name */
/* JADX INFO: compiled from: SearchUserViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchUserViewModel extends BaseLoadMoreRefreshViewModel<User> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<String> f31769s;

    /* JADX INFO: renamed from: t */
    public final SearchRepository f31770t;

    /* JADX INFO: renamed from: j.a.a.a.a.o.p.c$a */
    /* JADX INFO: compiled from: SearchUserViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.search.user.SearchUserViewModel$loadData$1$1", m13069f = "SearchUserViewModel.kt", m13070l = {21, 21, 23}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31771j;

        /* JADX INFO: renamed from: k */
        public int f31772k;

        /* JADX INFO: renamed from: l */
        public int f31773l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ String f31774m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ SearchUserViewModel f31775n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ int f31776o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation, SearchUserViewModel searchUserViewModel, int i) {
            super(2, continuation);
            this.f31774m = str;
            this.f31775n = searchUserViewModel;
            this.f31776o = i;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new a(this.f31774m, continuation, this.f31775n, this.f31776o);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return new a(this.f31774m, continuation2, this.f31775n, this.f31776o).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            SearchUserViewModel searchUserViewModel;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31773l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31772k;
                        searchUserViewModel = (SearchUserViewModel) this.f31771j;
                        C5729a.m12442O(obj);
                    } else {
                        if (i2 != 2 && i2 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C5729a.m12442O(obj);
                    }
                    return Unit.f29502a;
                }
                C5729a.m12442O(obj);
                SearchUserViewModel searchUserViewModel2 = this.f31775n;
                i = this.f31776o;
                SearchRepository searchRepository = searchUserViewModel2.f31770t;
                String str = this.f31774m;
                Intrinsics2.m13088d(str, "it");
                int i3 = this.f31776o;
                this.f31771j = searchUserViewModel2;
                this.f31772k = i;
                this.f31773l = 1;
                Object objMo14210a = searchRepository.mo14210a(str, i3, this);
                if (objMo14210a == intrinsics) {
                    return intrinsics;
                }
                searchUserViewModel = searchUserViewModel2;
                obj = objMo14210a;
                ArrayList results = ((GetListResponse) obj).getResults();
                this.f31771j = null;
                this.f31773l = 2;
                if (searchUserViewModel.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                SearchUserViewModel searchUserViewModel3 = this.f31775n;
                this.f31771j = null;
                this.f31773l = 3;
                if (searchUserViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public SearchUserViewModel(SearchRepository searchRepository) {
        Intrinsics2.m13089e(searchRepository, "searchRepository");
        this.f31770t = searchRepository;
        this.f31769s = new MutableLiveData<>();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        String strM421d;
        if (Intrinsics2.m13085a(this.f31769s.m421d(), "null") || (strM421d = this.f31769s.m421d()) == null) {
            return;
        }
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(strM421d, null, this, i), 3, null);
    }
}
