package p555j.p556a.p557a.p558a.p559a.p578j.p579i;

import java.util.ArrayList;
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

/* JADX INFO: renamed from: j.a.a.a.a.j.i.d, reason: use source file name */
/* JADX INFO: compiled from: FanGiftViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FanGiftViewModel extends BaseLoadMoreRefreshViewModel<Present> {

    /* JADX INFO: renamed from: s */
    public final MutableLiveData<Integer> f31582s;

    /* JADX INFO: renamed from: t */
    public final MutableLiveData<Integer> f31583t;

    /* JADX INFO: renamed from: u */
    public final GiftRepository f31584u;

    /* JADX INFO: renamed from: j.a.a.a.a.j.i.d$a */
    /* JADX INFO: compiled from: FanGiftViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.gift.fan.FanGiftViewModel$loadData$1", m13069f = "FanGiftViewModel.kt", m13070l = {27, 27, 29, 29, 33}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31585j;

        /* JADX INFO: renamed from: k */
        public Object f31586k;

        /* JADX INFO: renamed from: l */
        public int f31587l;

        /* JADX INFO: renamed from: n */
        public final /* synthetic */ int f31589n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation continuation) {
            super(2, continuation);
            this.f31589n = i;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return FanGiftViewModel.this.new a(this.f31589n, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return FanGiftViewModel.this.new a(this.f31589n, continuation2).mo6m(Unit.f29502a);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x008d A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x00bc A[RETURN] */
        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            FanGiftViewModel fanGiftViewModel;
            int i;
            FanGiftViewModel fanGiftViewModel2;
            int i2;
            ArrayList results;
            ArrayList results2;
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i3 = this.f31587l;
            try {
                if (i3 == 0) {
                    C5729a.m12442O(obj);
                    Integer numM421d = FanGiftViewModel.this.f31582s.m421d();
                    if (numM421d != null) {
                        Integer numM421d2 = FanGiftViewModel.this.f31583t.m421d();
                        if (numM421d2 != null && numM421d2.intValue() == 1) {
                            fanGiftViewModel2 = FanGiftViewModel.this;
                            i2 = this.f31589n;
                            GiftRepository giftRepository = fanGiftViewModel2.f31584u;
                            Intrinsics2.m13088d(numM421d, "it");
                            int iIntValue = numM421d.intValue();
                            int i4 = this.f31589n;
                            this.f31586k = fanGiftViewModel2;
                            this.f31585j = i2;
                            this.f31587l = 1;
                            obj = giftRepository.mo14178B(iIntValue, i4, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            results = ((GetListResponse) obj).getResults();
                            this.f31586k = null;
                            this.f31587l = 2;
                            if (fanGiftViewModel2.m13986v(i2, results, this) == intrinsics) {
                                return intrinsics;
                            }
                        } else {
                            FanGiftViewModel fanGiftViewModel3 = FanGiftViewModel.this;
                            int i5 = this.f31589n;
                            GiftRepository giftRepository2 = fanGiftViewModel3.f31584u;
                            Intrinsics2.m13088d(numM421d, "it");
                            int iIntValue2 = numM421d.intValue();
                            int i6 = this.f31589n;
                            this.f31586k = fanGiftViewModel3;
                            this.f31585j = i5;
                            this.f31587l = 3;
                            obj = giftRepository2.mo14182w(iIntValue2, i6, this);
                            if (obj == intrinsics) {
                                return intrinsics;
                            }
                            fanGiftViewModel = fanGiftViewModel3;
                            i = i5;
                            results2 = ((GetListResponse) obj).getResults();
                            this.f31586k = null;
                            this.f31587l = 4;
                            if (fanGiftViewModel.m13986v(i, results2, this) == intrinsics) {
                                return intrinsics;
                            }
                        }
                    }
                } else if (i3 == 1) {
                    i2 = this.f31585j;
                    fanGiftViewModel2 = (FanGiftViewModel) this.f31586k;
                    C5729a.m12442O(obj);
                    results = ((GetListResponse) obj).getResults();
                    this.f31586k = null;
                    this.f31587l = 2;
                    if (fanGiftViewModel2.m13986v(i2, results, this) == intrinsics) {
                        return intrinsics;
                    }
                } else if (i3 == 2) {
                    C5729a.m12442O(obj);
                } else if (i3 == 3) {
                    i = this.f31585j;
                    fanGiftViewModel = (FanGiftViewModel) this.f31586k;
                    C5729a.m12442O(obj);
                    results2 = ((GetListResponse) obj).getResults();
                    this.f31586k = null;
                    this.f31587l = 4;
                    if (fanGiftViewModel.m13986v(i, results2, this) == intrinsics) {
                        return intrinsics;
                    }
                } else {
                    if (i3 != 4 && i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C5729a.m12442O(obj);
                }
            } catch (Exception e) {
                FanGiftViewModel fanGiftViewModel4 = FanGiftViewModel.this;
                this.f31586k = null;
                this.f31587l = 5;
                if (fanGiftViewModel4.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    public FanGiftViewModel(GiftRepository giftRepository) {
        Intrinsics2.m13089e(giftRepository, "giftRepository");
        this.f31584u = giftRepository;
        this.f31582s = new MutableLiveData<>();
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.mo427j(1);
        this.f31583t = mutableLiveData;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshViewModel
    /* JADX INFO: renamed from: u */
    public void mo13895u(int i) {
        C5729a.m12428A(C8310a.m16440e(this), null, 0, new a(i, null), 3, null);
    }
}
