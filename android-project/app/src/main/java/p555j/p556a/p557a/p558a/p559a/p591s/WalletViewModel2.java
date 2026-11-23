package p555j.p556a.p557a.p558a.p559a.p591s;

import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p007c.p071d.p072a.p073a.AbstractC0509a;
import p007c.p071d.p072a.p073a.C0513c;
import p007c.p071d.p072a.p073a.C0527j;
import p007c.p071d.p072a.p073a.C0530l;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p483s.Collections4;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CompletableDeferred2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p608b.Constants;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.s.h, reason: use source file name */
/* JADX INFO: compiled from: WalletViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.wallet.WalletViewModel$getServerSkuDiamonds$1", m13069f = "WalletViewModel.kt", m13070l = {74, 77, 80}, m13071m = "invokeSuspend")
public final class WalletViewModel2 extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public Object f31968j;

    /* JADX INFO: renamed from: k */
    public int f31969k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ WalletViewModel5 f31970l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel2(WalletViewModel5 walletViewModel5, Continuation continuation) {
        super(2, continuation);
        this.f31970l = walletViewModel5;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new WalletViewModel2(this.f31970l, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        return new WalletViewModel2(this.f31970l, continuation2).mo6m(Unit.f29502a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:26:0x007d->B:43:?, LOOP_END, SYNTHETIC] */
    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        Iterator it;
        MutableLiveData<List<SkuEntity>> mutableLiveData;
        MutableLiveData mutableLiveData2;
        SkuDetails skuDetails;
        SkuDao skuDao;
        Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
        int i = this.f31969k;
        if (i != 0) {
            if (i == 1) {
                C5729a.m12442O(obj);
            } else if (i == 2) {
                it = (Iterator) this.f31968j;
                C5729a.m12442O(obj);
                while (it.hasNext()) {
                    skuDetails = (SkuDetails) it.next();
                    skuDao = this.f31970l.f31980q;
                    this.f31968j = it;
                    this.f31969k = 2;
                    if (skuDao.mo14048c(skuDetails, this) == intrinsics) {
                        return intrinsics;
                    }
                }
                Intrinsics2.m13089e("getServerSkuDiamonds", "message");
                WalletViewModel5 walletViewModel5 = this.f31970l;
                mutableLiveData = walletViewModel5.f31978o;
                SkuDao skuDao2 = walletViewModel5.f31980q;
                this.f31968j = mutableLiveData;
                this.f31969k = 3;
                obj = skuDao2.mo14046a(this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                mutableLiveData2 = mutableLiveData;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData2 = (MutableLiveData) this.f31968j;
                C5729a.m12442O(obj);
            }
            mutableLiveData2.mo427j(obj);
            return Unit.f29502a;
        }
        C5729a.m12442O(obj);
        Constants constants = Constants.f32272c;
        ArrayList arrayList = new ArrayList(Constants.f32270a);
        C0527j c0527j = new C0527j();
        c0527j.f2733a = "inapp";
        c0527j.f2734b = arrayList;
        Intrinsics2.m13088d(c0527j, "SkuDetailsParams.newBuil…nt.SkuType.INAPP).build()");
        AbstractC0509a abstractC0509a = this.f31970l.f31975l;
        if (abstractC0509a == null) {
            Intrinsics2.m13096l("playStoreBillingClient");
            throw null;
        }
        this.f31969k = 1;
        CompletableDeferred2 completableDeferred2 = new CompletableDeferred2(null);
        abstractC0509a.mo1532g(c0527j, new C0513c(completableDeferred2));
        obj = completableDeferred2.m13290R(this);
        if (obj == intrinsics) {
            return intrinsics;
        }
        C0530l c0530l = (C0530l) obj;
        Collection collection = c0530l.f2739b;
        if (collection == null) {
            collection = Collections4.f29519f;
        }
        if (!collection.isEmpty()) {
            List<SkuDetails> list = c0530l.f2739b;
            if (list != null) {
                it = list.iterator();
                while (it.hasNext()) {
                    skuDetails = (SkuDetails) it.next();
                    skuDao = this.f31970l.f31980q;
                    this.f31968j = it;
                    this.f31969k = 2;
                    if (skuDao.mo14048c(skuDetails, this) == intrinsics) {
                        return intrinsics;
                    }
                }
            }
            Intrinsics2.m13089e("getServerSkuDiamonds", "message");
            WalletViewModel5 walletViewModel6 = this.f31970l;
            mutableLiveData = walletViewModel6.f31978o;
            SkuDao skuDao3 = walletViewModel6.f31980q;
            this.f31968j = mutableLiveData;
            this.f31969k = 3;
            obj = skuDao3.mo14046a(this);
            if (obj == intrinsics) {
                return intrinsics;
            }
            mutableLiveData2 = mutableLiveData;
            mutableLiveData2.mo427j(obj);
        }
        return Unit.f29502a;
    }
}
