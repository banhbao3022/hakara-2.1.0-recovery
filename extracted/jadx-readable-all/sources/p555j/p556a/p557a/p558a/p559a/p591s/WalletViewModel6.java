package p555j.p556a.p557a.p558a.p559a.p591s;

import com.android.billingclient.api.SkuDetails;
import java.util.Iterator;
import java.util.List;
import p007c.p071d.p072a.p073a.C0519f;
import p007c.p071d.p072a.p073a.InterfaceC0529k;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p483s.Collections4;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.C6270h1;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: j.a.a.a.a.s.l, reason: use source file name */
/* JADX INFO: compiled from: WalletViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletViewModel6 implements InterfaceC0529k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WalletViewModel5 f31985a;

    /* JADX INFO: renamed from: j.a.a.a.a.s.l$a */
    /* JADX INFO: compiled from: WalletViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.wallet.WalletViewModel$querySkuDetailsAsync$1$1$1", m13069f = "WalletViewModel.kt", m13070l = {192}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31986j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ SkuDetails f31987k;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ WalletViewModel6 f31988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SkuDetails skuDetails, Continuation continuation, WalletViewModel6 walletViewModel6) {
            super(2, continuation);
            this.f31987k = skuDetails;
            this.f31988l = walletViewModel6;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return new a(this.f31987k, continuation, this.f31988l);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return new a(this.f31987k, continuation2, this.f31988l).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31986j;
            if (i == 0) {
                C5729a.m12442O(obj);
                SkuDao skuDao = this.f31988l.f31985a.f31980q;
                SkuDetails skuDetails = this.f31987k;
                Intrinsics2.m13088d(skuDetails, "it");
                this.f31986j = 1;
                if (skuDao.mo14048c(skuDetails, this) == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            return Unit.f29502a;
        }
    }

    public WalletViewModel6(WalletViewModel5 walletViewModel5) {
        this.f31985a = walletViewModel5;
    }

    @Override // p007c.p071d.p072a.p073a.InterfaceC0529k
    /* JADX INFO: renamed from: a */
    public final void mo1539a(C0519f c0519f, List<SkuDetails> list) {
        Intrinsics2.m13089e(c0519f, "billingResult");
        if (c0519f.f2715a != 0) {
            StringBuilder sbM1556G = outline.m1556G("3- ");
            sbM1556G.append(c0519f.f2716b);
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
            return;
        }
        Intrinsics2.m13089e("BillingResponseCode ok", "message");
        if (!(!(list != null ? list : Collections4.f29519f).isEmpty()) || list == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C5729a.m12428A(C5729a.m12446a(CoroutineContext.a.C8537a.m13062d((C6270h1) C5729a.m12447b(null, 1, null), Dispatchers.f29770b)), null, 0, new a((SkuDetails) it.next(), null, this), 3, null);
        }
    }
}
