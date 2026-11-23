package p555j.p556a.p557a.p558a.p559a.p578j.p580j;

import java.util.ArrayList;
import java.util.HashMap;
import mtp.media.karaoke.data.model.Present;
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
import p555j.p556a.p557a.p606h.p614e.GiftRepository;
import p636z0.p752p.C8310a;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.j.j.c, reason: use source file name */
/* JADX INFO: compiled from: PresentViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PresentViewModel extends BaseLoadMoreRefreshViewModel<Present> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31595s;

    /* JADX INFO: renamed from: t */
    public final GiftRepository f31596t;

    /* JADX INFO: renamed from: j.a.a.a.a.j.j.c$a */
    /* JADX INFO: compiled from: PresentViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.gift.present.PresentViewModel$loadData$2", m13069f = "PresentViewModel.kt", m13070l = {29, 29, 31}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public Object f31597j;

        /* JADX INFO: renamed from: k */
        public int f31598k;

        /* JADX INFO: renamed from: l */
        public int f31599l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31601n;

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ HashMap f31602o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31601n = i;
            this.f31602o = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return PresentViewModel.this.new a(this.f31601n, this.f31602o, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return PresentViewModel.this.new a(this.f31601n, this.f31602o, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            int i;
            PresentViewModel presentViewModel;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i2 = this.f31599l;
            try {
                if (i2 != 0) {
                    if (i2 == 1) {
                        i = this.f31598k;
                        presentViewModel = (PresentViewModel) this.f31597j;
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
                PresentViewModel presentViewModel2 = PresentViewModel.this;
                i = this.f31601n;
                GiftRepository giftRepository = presentViewModel2.f31596t;
                HashMap<String, Object> map = this.f31602o;
                this.f31597j = presentViewModel2;
                this.f31598k = i;
                this.f31599l = 1;
                Object objMo14179a = giftRepository.mo14179a(map, this);
                if (objMo14179a == intrinsics) {
                    return intrinsics;
                }
                presentViewModel = presentViewModel2;
                obj = objMo14179a;
                ArrayList results = ((GetListResponse) obj).getResults();
                this.f31597j = null;
                this.f31599l = 2;
                if (presentViewModel.m13986v(i, results, this) == intrinsics) {
                    return intrinsics;
                }
            } catch (Exception e) {
                PresentViewModel presentViewModel3 = PresentViewModel.this;
                this.f31597j = null;
                this.f31599l = 3;
                if (presentViewModel3.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public PresentViewModel(GiftRepository giftRepository) {
        Intrinsics2.m13089e(giftRepository, "giftRepository");
        this.f31596t = giftRepository;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(0);
        this.f31595s = mutableLiveData;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        HashMap map = new HashMap();
        map.put("page", Integer.valueOf(i));
        Integer numM421d = this.f31595s.m421d();
        if (numM421d != null && Intrinsics2.m13091g(numM421d.intValue(), 0) > 0) {
            Intrinsics2.m13088d(numM421d, "it");
            map.put("receiver_id", numM421d);
        }
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, map, null), 3, null);
    }
}
