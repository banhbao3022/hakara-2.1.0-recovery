package p555j.p556a.p557a.p558a.p559a.p585o.p586o;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Song;
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

/* JADX INFO: renamed from: j.a.a.a.a.o.o.b, reason: use source file name */
/* JADX INFO: compiled from: SearchSongViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SearchSongViewModel extends BaseLoadMoreRefreshViewModel<Song> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<String> f31748s;

    /* JADX INFO: renamed from: t */
    public final SearchRepository f31749t;

    /* JADX INFO: renamed from: j.a.a.a.a.o.o.b$a */
    /* JADX INFO: compiled from: SearchSongViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.search.song.SearchSongViewModel$loadData$1$1", m13069f = "SearchSongViewModel.kt", m13070l = {21, 21, 23}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31750j;

        /* JADX INFO: renamed from: k */
        public int f31751k;

        /* JADX INFO: renamed from: l */
        public int f31752l;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ String f31753m;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ SearchSongViewModel f31754n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ int f31755o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation continuation, SearchSongViewModel searchSongViewModel, int i) {
            super(2, continuation);
            this.f31753m = str;
            this.f31754n = searchSongViewModel;
            this.f31755o = i;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new a(this.f31753m, continuation, this.f31754n, this.f31755o);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return new a(this.f31753m, continuation2, this.f31754n, this.f31755o).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            SearchSongViewModel searchSongViewModel;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31752l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31751k;
                        searchSongViewModel = (SearchSongViewModel) this.f31750j;
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
                SearchSongViewModel searchSongViewModel2 = this.f31754n;
                i = this.f31755o;
                SearchRepository searchRepository = searchSongViewModel2.f31749t;
                String str = this.f31753m;
                Intrinsics2.m13088d(str, "it");
                int i3 = this.f31755o;
                this.f31750j = searchSongViewModel2;
                this.f31751k = i;
                this.f31752l = 1;
                Object objMo14217h = searchRepository.mo14217h(str, i3, this);
                if (objMo14217h == intrinsics) {
                    return intrinsics;
                }
                searchSongViewModel = searchSongViewModel2;
                obj = objMo14217h;
                ArrayList results = ((GetListResponse) obj).getResults();
                this.f31750j = null;
                this.f31752l = 2;
                if (searchSongViewModel.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                SearchSongViewModel searchSongViewModel3 = this.f31754n;
                this.f31750j = null;
                this.f31752l = 3;
                if (searchSongViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public SearchSongViewModel(SearchRepository searchRepository) {
        Intrinsics2.m13089e(searchRepository, "searchRepository");
        this.f31749t = searchRepository;
        this.f31748s = new MutableLiveData<>();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        String strM421d;
        if (Intrinsics2.m13085a(this.f31748s.m421d(), "null") || (strM421d = this.f31748s.m421d()) == null) {
            return;
        }
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(strM421d, null, this, i), 3, null);
    }
}
