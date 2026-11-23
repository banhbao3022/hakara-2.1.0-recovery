package p555j.p556a.p557a.p558a.p559a.p578j;

import java.util.ArrayList;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.remote.response.GetListResponse;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineDispatcher;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.MainCoroutineDispatcher;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p606h.p614e.GiftRepository;

/* JADX INFO: renamed from: j.a.a.a.a.j.f, reason: use source file name */
/* JADX INFO: compiled from: GiftViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.gift.GiftViewModel$loadGifts$1", m13069f = "GiftViewModel.kt", m13070l = {28, 34}, m13071m = "invokeSuspend")
public final class GiftViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31563j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ GiftViewModel3 f31564k;

    /* JADX INFO: renamed from: j.a.a.a.a.j.f$a */
    /* JADX INFO: compiled from: GiftViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.gift.GiftViewModel$loadGifts$1$1", m13069f = "GiftViewModel.kt", m13070l = {29}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31565j;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return GiftViewModel.this.new a(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return GiftViewModel.this.new a(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31565j;
            if (i == 0) {
                C5729a.m12442O(obj);
                GiftRepository giftRepository = GiftViewModel.this.f31564k.f31576o;
                this.f31565j = 1;
                obj = giftRepository.mo14180b(this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            ArrayList<Gift> results = ((GetListResponse) obj).getResults();
            if (results == null) {
                return null;
            }
            GiftViewModel.this.f31564k.f31574m.mo427j(results);
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftViewModel(GiftViewModel3 giftViewModel3, Continuation continuation) {
        super(2, continuation);
        this.f31564k = giftViewModel3;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new GiftViewModel(this.f31564k, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new GiftViewModel(this.f31564k, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31563j;
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
            CoroutineDispatcher coroutineDispatcher = Dispatchers.f29769a;
            MainCoroutineDispatcher mainCoroutineDispatcher = MainDispatchers.f29666b;
            a aVar = new a(null);
            this.f31563j = 1;
            if (C5729a.m12445R(mainCoroutineDispatcher, aVar, this) == intrinsics) {
                return intrinsics;
            }
        } catch (Exception e) {
            GiftViewModel3 giftViewModel3 = this.f31564k;
            this.f31563j = 2;
            if (giftViewModel3.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
