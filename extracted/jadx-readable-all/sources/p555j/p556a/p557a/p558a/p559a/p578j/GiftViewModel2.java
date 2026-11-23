package p555j.p556a.p557a.p558a.p559a.p578j;

import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p614e.GiftRepository;

/* JADX INFO: renamed from: j.a.a.a.a.j.g, reason: use source file name */
/* JADX INFO: compiled from: GiftViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.gift.GiftViewModel$sendGift$1", m13069f = "GiftViewModel.kt", m13070l = {42, 45}, m13071m = "invokeSuspend")
public final class GiftViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31567j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ GiftViewModel3 f31568k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f31569l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f31570m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f31571n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ String f31572o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftViewModel2(GiftViewModel3 giftViewModel3, int i, int i2, int i3, String str, Continuation continuation) {
        super(2, continuation);
        this.f31568k = giftViewModel3;
        this.f31569l = i;
        this.f31570m = i2;
        this.f31571n = i3;
        this.f31572o = str;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new GiftViewModel2(this.f31568k, this.f31569l, this.f31570m, this.f31571n, this.f31572o, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GiftViewModel2) mo4a(coroutineScope, continuation)).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31567j;
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
            GiftRepository giftRepository = this.f31568k.f31576o;
            int i2 = this.f31569l;
            int i3 = this.f31570m;
            int i4 = this.f31571n;
            String str = this.f31572o;
            this.f31567j = 1;
            if (giftRepository.mo14181i(i2, i3, i4, str, this) == intrinsics) {
                return intrinsics;
            }
            this.f31568k.f31575n.mo427j(Boolean.TRUE);
        } catch (Exception e) {
            GiftViewModel3 giftViewModel3 = this.f31568k;
            this.f31567j = 2;
            if (giftViewModel3.mo13964m(e, this) == intrinsics) {
                return intrinsics;
            }
        }
        return Unit.f29502a;
    }
}
