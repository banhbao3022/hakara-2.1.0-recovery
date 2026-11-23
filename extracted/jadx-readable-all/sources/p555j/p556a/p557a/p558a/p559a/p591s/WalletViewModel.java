package p555j.p556a.p557a.p558a.p559a.p591s;

import com.android.billingclient.api.Purchase;
import com.cgfay.media.CainMediaMetadataRetriever;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import mtp.media.karaoke.data.remote.response.GetAnyResponse3;
import p007c.p451o.p452a.C5729a;
import p477d1.Unit;
import p477d1.p481d0.StringsJVM;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.CoroutineScope;
import p555j.p556a.p557a.p606h.p608b.Constants;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p752p.C8310a;

/* JADX INFO: renamed from: j.a.a.a.a.s.g, reason: use source file name */
/* JADX INFO: compiled from: WalletViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.wallet.WalletViewModel$disburseConsumableDiamonds$1", m13069f = "WalletViewModel.kt", m13070l = {}, m13071m = "invokeSuspend")
public final class WalletViewModel extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ WalletViewModel5 f31963j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Purchase f31964k;

    /* JADX INFO: renamed from: j.a.a.a.a.s.g$a */
    /* JADX INFO: compiled from: WalletViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.wallet.WalletViewModel$disburseConsumableDiamonds$1$1", m13069f = "WalletViewModel.kt", m13070l = {111, 118}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31965j;

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ HashMap f31967l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HashMap map, Continuation continuation) {
            super(2, continuation);
            this.f31967l = map;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return WalletViewModel.this.new a(this.f31967l, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return WalletViewModel.this.new a(this.f31967l, continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31965j;
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
                UserRepository userRepository = WalletViewModel.this.f31963j.f31982s;
                HashMap<String, Object> map = this.f31967l;
                this.f31965j = 1;
                obj = userRepository.mo14237u(map, this);
                if (obj == intrinsics) {
                    return intrinsics;
                }
                GetAnyResponse3 getAnyResponse3 = (GetAnyResponse3) obj;
                if (getAnyResponse3.getStatus() == 201) {
                    WalletViewModel.this.f31963j.f31977n.mo427j(new Integer(getAnyResponse3.getAmount()));
                } else {
                    WalletViewModel.this.f31963j.f31979p.mo427j(Boolean.TRUE);
                }
            } catch (Exception e) {
                WalletViewModel5 walletViewModel5 = WalletViewModel.this.f31963j;
                this.f31965j = 2;
                if (walletViewModel5.mo13964m(e, this) == intrinsics) {
                    return intrinsics;
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel(WalletViewModel5 walletViewModel5, Purchase purchase, Continuation continuation) {
        super(2, continuation);
        this.f31963j = walletViewModel5;
        this.f31964k = purchase;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: a */
    public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
        Intrinsics2.m13089e(continuation, "completion");
        return new WalletViewModel(this.f31963j, this.f31964k, continuation);
    }

    @Override // p477d1.p493x.p494b.InterfaceC6168p
    /* JADX INFO: renamed from: l */
    public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
        Continuation<? super Unit> continuation2 = continuation;
        Intrinsics2.m13089e(continuation2, "completion");
        WalletViewModel walletViewModel = new WalletViewModel(this.f31963j, this.f31964k, continuation2);
        Unit unit = Unit.f29502a;
        walletViewModel.mo6m(unit);
        return unit;
    }

    @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
    /* JADX INFO: renamed from: m */
    public final Object mo6m(Object obj) throws Throwable {
        String str;
        C5729a.m12442O(obj);
        Constants constants = Constants.f32272c;
        if (Constants.f32270a.contains(this.f31964k.m12554a())) {
            HashMap map = new HashMap();
            String strOptString = this.f31964k.f28130c.optString("orderId");
            Intrinsics2.m13088d(strOptString, "purchase.orderId");
            map.put("transaction_id", strOptString);
            String strM12554a = this.f31964k.m12554a();
            Intrinsics2.m13088d(strM12554a, "purchase.sku");
            map.put("product_id", strM12554a);
            long jOptLong = this.f31964k.f28130c.optLong("purchaseTime");
            Locale locale = Locale.getDefault();
            Intrinsics2.m13088d(locale, "Locale.getDefault()");
            Intrinsics2.m13089e("yyyy-MM-dd HH:mm:ss", "format");
            Intrinsics2.m13089e(locale, "locale");
            if (StringsJVM.m12990g("yyyy-MM-dd HH:mm:ss")) {
                str = null;
            } else {
                try {
                    str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).format(new Date(jOptLong));
                } catch (Exception e) {
                    Intrinsics2.m13089e(e, "$this$safeLog");
                    str = null;
                }
            }
            map.put(CainMediaMetadataRetriever.METADATA_KEY_DATE, String.valueOf(str));
            map.put("state", "purchased");
            map.put("unique_id", DeviceUtils.f33080a.m14247a(this.f31963j.f31981r.getApplicationContext()));
            C5729a.m12428A(C8310a.m16440e(this.f31963j), null, 0, new a(map, null), 3, null);
        }
        return Unit.f29502a;
    }
}
