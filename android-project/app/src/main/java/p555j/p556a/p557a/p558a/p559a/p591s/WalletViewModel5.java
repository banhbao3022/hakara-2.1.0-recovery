package p555j.p556a.p557a.p558a.p559a.p591s;

import android.app.Application;
import android.content.SharedPreferences;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import mtp.media.karaoke.data.model.User;
import org.json.JSONObject;
import p007c.p071d.p072a.p073a.AbstractC0509a;
import p007c.p071d.p072a.p073a.C0519f;
import p007c.p071d.p072a.p073a.C0521g;
import p007c.p071d.p072a.p073a.C0527j;
import p007c.p071d.p072a.p073a.InterfaceC0515d;
import p007c.p071d.p072a.p073a.InterfaceC0525i;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.Tuples;
import p477d1.Unit;
import p477d1.p483s._Collections;
import p477d1.p485u.Continuation;
import p477d1.p485u.CoroutineContext;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.C6270h1;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.Dispatchers;
import p500e1.p501a.Job;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p608b.Constants;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p606h.p614e.UserRepository;
import p636z0.p759s.MutableLiveData;

/* JADX INFO: renamed from: j.a.a.a.a.s.k, reason: use source file name */
/* JADX INFO: compiled from: WalletViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletViewModel5 extends BaseViewModel implements InterfaceC0525i, InterfaceC0515d {

    /* JADX INFO: renamed from: l */
    public AbstractC0509a f31975l;

    /* JADX INFO: renamed from: m */
    public final MutableLiveData<User> f31976m;

    /* JADX INFO: renamed from: n */
    public final MutableLiveData<Integer> f31977n;

    /* JADX INFO: renamed from: o */
    public final MutableLiveData<List<SkuEntity>> f31978o;

    /* JADX INFO: renamed from: p */
    public final MutableLiveData<Boolean> f31979p;

    /* JADX INFO: renamed from: q */
    public final SkuDao f31980q;

    /* JADX INFO: renamed from: r */
    public final Application f31981r;

    /* JADX INFO: renamed from: s */
    public final UserRepository f31982s;

    /* JADX INFO: renamed from: j.a.a.a.a.s.k$a */
    /* JADX INFO: compiled from: WalletViewModel.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.wallet.WalletViewModel$processPurchases$1", m13069f = "WalletViewModel.kt", m13070l = {}, m13071m = "invokeSuspend")
    public static final class a extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ Set f31984k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Continuation continuation) {
            super(2, continuation);
            this.f31984k = set;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return WalletViewModel5.this.new a(this.f31984k, continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) throws Throwable {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            a aVar = WalletViewModel5.this.new a(this.f31984k, continuation2);
            Unit unit = Unit.f29502a;
            aVar.mo6m(unit);
            return unit;
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            C5729a.m12442O(obj);
            Intrinsics2.m13089e("processPurchases called", "message");
            HashSet hashSet = new HashSet(this.f31984k.size());
            for (Purchase purchase : this.f31984k) {
                if ((purchase.f28130c.optInt("purchaseState", 1) != 4 ? (char) 1 : (char) 2) == 1) {
                    hashSet.add(purchase);
                } else {
                    purchase.f28130c.optInt("purchaseState", 1);
                }
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : hashSet) {
                Constants constants = Constants.f32272c;
                if (Boolean.valueOf(Constants.f32270a.contains(((Purchase) obj2).m12554a())).booleanValue()) {
                    arrayList.add(obj2);
                } else {
                    arrayList2.add(obj2);
                }
            }
            Tuples tuples = new Tuples(arrayList, arrayList2);
            List<Purchase> list = (List) tuples.f29491f;
            WalletViewModel5 walletViewModel5 = WalletViewModel5.this;
            Objects.requireNonNull(walletViewModel5);
            Intrinsics2.m13089e("handleConsumablePurchasesAsync called", "message");
            for (Purchase purchase2 : list) {
                JSONObject jSONObject = purchase2.f28130c;
                String strOptString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                if (strOptString == null) {
                    throw new IllegalArgumentException("Purchase token must be set");
                }
                C0521g c0521g = new C0521g();
                c0521g.f2720a = strOptString;
                Intrinsics2.m13088d(c0521g, "ConsumeParams.newBuilder…it.purchaseToken).build()");
                AbstractC0509a abstractC0509a = walletViewModel5.f31975l;
                if (abstractC0509a == null) {
                    Intrinsics2.m13096l("playStoreBillingClient");
                    throw null;
                }
                abstractC0509a.mo1526a(c0521g, new WalletViewModel4(purchase2, walletViewModel5));
            }
            return Unit.f29502a;
        }
    }

    public WalletViewModel5(SkuDao skuDao, Application application, UserRepository userRepository) {
        Intrinsics2.m13089e(skuDao, "skuDao");
        Intrinsics2.m13089e(application, "application");
        Intrinsics2.m13089e(userRepository, "userRepository");
        this.f31980q = skuDao;
        this.f31981r = application;
        this.f31982s = userRepository;
        this.f31976m = new MutableLiveData<>();
        this.f31977n = new MutableLiveData<>();
        this.f31978o = new MutableLiveData<>();
        this.f31979p = new MutableLiveData<>();
    }

    @Override // p007c.p071d.p072a.p073a.InterfaceC0525i
    /* JADX INFO: renamed from: a */
    public void mo1543a(C0519f c0519f, List<Purchase> list) {
        Intrinsics2.m13089e(c0519f, "billingResult");
        int i = c0519f.f2715a;
        if (i == -1) {
            m13954o();
            return;
        }
        if (i == 0) {
            if (list != null) {
                m13956q(_Collections.m13051p(list));
            }
        } else if (i != 7) {
            StringBuilder sbM1556G = outline.m1556G("6- ");
            sbM1556G.append(c0519f.f2716b);
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
        } else {
            StringBuilder sbM1556G2 = outline.m1556G("5- ");
            sbM1556G2.append(c0519f.f2716b);
            Intrinsics2.m13089e(sbM1556G2.toString(), "message");
            m13957r();
        }
    }

    @Override // p007c.p071d.p072a.p073a.InterfaceC0515d
    /* JADX INFO: renamed from: b */
    public void mo1540b(C0519f c0519f) {
        Intrinsics2.m13089e(c0519f, "billingResult");
        int i = c0519f.f2715a;
        if (i != 0) {
            if (i != 3) {
                StringBuilder sbM1556G = outline.m1556G("2- ");
                sbM1556G.append(c0519f.f2716b);
                Intrinsics2.m13089e(sbM1556G.toString(), "message");
                return;
            } else {
                StringBuilder sbM1556G2 = outline.m1556G("1- ");
                sbM1556G2.append(c0519f.f2716b);
                Intrinsics2.m13089e(sbM1556G2.toString(), "message");
                return;
            }
        }
        Intrinsics2.m13089e("onBillingSetupFinished successfully", "message");
        Constants constants = Constants.f32272c;
        ArrayList arrayList = new ArrayList(Constants.f32270a);
        C0527j c0527j = new C0527j();
        c0527j.f2733a = "inapp";
        c0527j.f2734b = arrayList;
        Intrinsics2.m13088d(c0527j, "SkuDetailsParams.newBuil….setType(skuType).build()");
        AbstractC0509a abstractC0509a = this.f31975l;
        if (abstractC0509a == null) {
            Intrinsics2.m13096l("playStoreBillingClient");
            throw null;
        }
        abstractC0509a.mo1532g(c0527j, new WalletViewModel6(this));
        m13957r();
    }

    @Override // p007c.p071d.p072a.p073a.InterfaceC0515d
    /* JADX INFO: renamed from: c */
    public void mo1541c() {
        m13954o();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13954o() {
        Intrinsics2.m13089e("connectToPlayBillingService", "message");
        AbstractC0509a abstractC0509a = this.f31975l;
        if (abstractC0509a == null) {
            Intrinsics2.m13096l("playStoreBillingClient");
            throw null;
        }
        if (abstractC0509a.mo1529d()) {
            return false;
        }
        AbstractC0509a abstractC0509a2 = this.f31975l;
        if (abstractC0509a2 != null) {
            abstractC0509a2.mo1533h(this);
            return true;
        }
        Intrinsics2.m13096l("playStoreBillingClient");
        throw null;
    }

    /* JADX INFO: renamed from: p */
    public final void m13955p() {
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        if (user != null) {
            this.f31976m.mo427j(user);
        }
    }

    /* JADX INFO: renamed from: q */
    public final Job m13956q(Set<? extends Purchase> set) {
        return C5729a.m12428A(C5729a.m12446a(CoroutineContext.a.C8537a.m13062d((C6270h1) C5729a.m12447b(null, 1, null), Dispatchers.f29770b)), null, 0, new a(set, null), 3, null);
    }

    /* JADX INFO: renamed from: r */
    public final void m13957r() {
        Intrinsics2.m13089e("queryPurchasesAsync called", "message");
        HashSet hashSet = new HashSet();
        AbstractC0509a abstractC0509a = this.f31975l;
        if (abstractC0509a == null) {
            Intrinsics2.m13096l("playStoreBillingClient");
            throw null;
        }
        Purchase.C5777a c5777aMo1531f = abstractC0509a.mo1531f("inapp");
        Intrinsics2.m13088d(c5777aMo1531f, "playStoreBillingClient.q…lingClient.SkuType.INAPP)");
        List<Purchase> list = c5777aMo1531f.f28131a;
        if (list != null) {
            hashSet.addAll(list);
        }
        AbstractC0509a abstractC0509a2 = this.f31975l;
        if (abstractC0509a2 == null) {
            Intrinsics2.m13096l("playStoreBillingClient");
            throw null;
        }
        C0519f c0519fMo1528c = abstractC0509a2.mo1528c("subscriptions");
        Intrinsics2.m13088d(c0519fMo1528c, "playStoreBillingClient.i…eatureType.SUBSCRIPTIONS)");
        boolean z = false;
        int i = c0519fMo1528c.f2715a;
        if (i == -1) {
            m13954o();
        } else if (i != 0) {
            StringBuilder sbM1556G = outline.m1556G("isSubscriptionSupported() error: ");
            sbM1556G.append(c0519fMo1528c.f2716b);
            Intrinsics2.m13089e(sbM1556G.toString(), "message");
        } else {
            z = true;
        }
        if (z) {
            AbstractC0509a abstractC0509a3 = this.f31975l;
            if (abstractC0509a3 == null) {
                Intrinsics2.m13096l("playStoreBillingClient");
                throw null;
            }
            Purchase.C5777a c5777aMo1531f2 = abstractC0509a3.mo1531f("subs");
            Intrinsics2.m13088d(c5777aMo1531f2, "playStoreBillingClient.q…llingClient.SkuType.SUBS)");
            List<Purchase> list2 = c5777aMo1531f2.f28131a;
            if (list2 != null) {
                hashSet.addAll(list2);
            }
        }
        m13956q(hashSet);
    }
}
