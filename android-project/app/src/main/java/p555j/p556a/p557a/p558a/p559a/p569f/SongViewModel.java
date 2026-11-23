package p555j.p556a.p557a.p558a.p559a.p569f;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Song;
import mtp.media.karaoke.data.remote.response.GetSongListResponse;
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
import p555j.p556a.p557a.p606h.p614e.SongRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.f.c, reason: use source file name */
/* JADX INFO: compiled from: SongViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongViewModel extends BaseLoadMoreRefreshViewModel<Song> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<String> f31300s;

    /* JADX INFO: renamed from: t */
    public final SongRepository f31301t;

    /* JADX INFO: renamed from: j.a.a.a.a.f.c$a */
    /* JADX INFO: compiled from: SongViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.song.SongViewModel$loadData$1", m13069f = "SongViewModel.kt", m13070l = {33, 33, 35}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31302j;

        /* JADX INFO: renamed from: k */
        public int f31303k;

        /* JADX INFO: renamed from: l */
        public int f31304l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31306n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ HashMap f31307o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31306n = i;
            this.f31307o = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return SongViewModel.this.new a(this.f31306n, this.f31307o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return SongViewModel.this.new a(this.f31306n, this.f31307o, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            SongViewModel songViewModel;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31304l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31303k;
                        songViewModel = (SongViewModel) this.f31302j;
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
                SongViewModel songViewModel2 = SongViewModel.this;
                i = this.f31306n;
                SongRepository songRepository = songViewModel2.f31301t;
                HashMap<String, String> map = this.f31307o;
                this.f31302j = songViewModel2;
                this.f31303k = i;
                this.f31304l = 1;
                Object objMo14221c = songRepository.mo14221c(map, this);
                if (objMo14221c == intrinsics) {
                    return intrinsics;
                }
                songViewModel = songViewModel2;
                obj = objMo14221c;
                ArrayList<Song> results = ((GetSongListResponse) obj).getResults();
                this.f31302j = null;
                this.f31304l = 2;
                if (songViewModel.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                SongViewModel songViewModel3 = SongViewModel.this;
                this.f31302j = null;
                this.f31304l = 3;
                if (songViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public SongViewModel(SongRepository songRepository) {
        Intrinsics2.m13089e(songRepository, "songRepository");
        this.f31301t = songRepository;
        MutableLiveData<String> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j("recommend");
        this.f31300s = mutableLiveData;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: s */
    public int mo13909s() {
        return 15;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: t */
    public int mo13906t() {
        return 100;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", String.valueOf(i));
        map.put("type", String.valueOf(this.f31300s.m421d()));
        map.put("per_page", String.valueOf(100));
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, map, null), 3, null);
    }
}
