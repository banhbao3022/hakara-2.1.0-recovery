package p555j.p556a.p557a.p558a.p559a.p591s;

import java.util.List;
import java.util.Objects;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.s.i, reason: use source file name */
/* JADX INFO: compiled from: WalletViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.wallet.WalletViewModel$getSkuDiamonds$1", m13069f = "WalletViewModel.kt", m13070l = {61}, m13071m = "invokeSuspend")
public final class WalletViewModel3 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public int f31971j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ WalletViewModel5 f31972k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel3(WalletViewModel5 walletViewModel5, Continuation continuation) {
        super(2, continuation);
        this.f31972k = walletViewModel5;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new WalletViewModel3(this.f31972k, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new WalletViewModel3(this.f31972k, continuation2).mo6m(Unit.f29502a);
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31971j;
        boolean z = true;
        if (i == 0) {
            C5729a.m12442O(obj);
            SkuDao skuDao = this.f31972k.f31980q;
            this.f31971j = 1;
            obj = skuDao.mo14046a(this);
            if (obj == intrinsics) {
                return intrinsics;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C5729a.m12442O(obj);
        }
        List<SkuEntity> list = (List) obj;
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            WalletViewModel5 walletViewModel5 = this.f31972k;
            Objects.requireNonNull(walletViewModel5);
            C5729a.m12428A(C8310a.m16440e(walletViewModel5), null, 0, new WalletViewModel2(walletViewModel5, null), 3, null);
        } else {
            this.f31972k.f31978o.mo427j(list);
        }
        return Unit.f29502a;
    }
}
