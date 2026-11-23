package p555j.p556a.p557a.p558a.p559a.p591s;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.SkuDetails;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p072a.p073a.AbstractC0509a;
import p007c.p071d.p072a.p073a.C0517e;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Unit;
import p477d1.p485u.Continuation;
import p477d1.p485u.p486i.Intrinsics;
import p477d1.p485u.p487j.p488a.ContinuationImpl5;
import p477d1.p485u.p487j.p488a.DebugMetadata;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p500e1.p501a.CoroutineScope;
import p500e1.p501a.CoroutineScope2;
import p500e1.p501a.p503c2.MainDispatchers;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p555j.p556a.p557a.p597g.p599b.PAlertDialog;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p611b.SkuEntity;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.DiamondFragmentBinding;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStore;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.s.d, reason: use source file name */
/* JADX INFO: compiled from: DiamondFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DiamondFragment extends BaseFragment3<DiamondFragmentBinding, WalletViewModel5> {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ int f31945d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public final int f31946e0 = R.layout.diamond_fragment;

    /* JADX INFO: renamed from: f0 */
    public final Lazy3 f31947f0 = C8310a.m16436a(this, Reflection.m13097a(WalletViewModel5.class), new a(new g()), null);

    /* JADX INFO: renamed from: g0 */
    public final DiamondAdapter f31948g0 = new DiamondAdapter(new b());

    /* JADX INFO: renamed from: h0 */
    public HashMap f31949h0;

    /* JADX INFO: renamed from: j.a.a.a.a.s.d$a */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    public static final class a extends Lambda implements InterfaceC6153a<ViewModelStore> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC6153a f31950g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31950g = interfaceC6153a;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStore mo2c() {
            ViewModelStore viewModelStoreMo128o = ((ViewModelStoreOwner) this.f31950g.mo2c()).mo128o();
            Intrinsics2.m13088d(viewModelStoreMo128o, "ownerProducer().viewModelStore");
            return viewModelStoreMo128o;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.d$b */
    /* JADX INFO: compiled from: DiamondFragment.kt */
    public static final class b extends Lambda implements InterfaceC6164l<SkuEntity, Unit> {
        public b() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(SkuEntity skuEntity) {
            SkuEntity skuEntity2 = skuEntity;
            Intrinsics2.m13089e(skuEntity2, "it");
            DiamondFragment diamondFragment = DiamondFragment.this;
            int i = DiamondFragment.f31945d0;
            WalletViewModel5 walletViewModel5Mo13882Z0 = diamondFragment.mo13882Z0();
            FragmentActivity fragmentActivityM16526F0 = diamondFragment.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            Objects.requireNonNull(walletViewModel5Mo13882Z0);
            Intrinsics2.m13089e(fragmentActivityM16526F0, "activity");
            Intrinsics2.m13089e(skuEntity2, "skuEntity");
            String str = skuEntity2.f32356k;
            if (str != null) {
                SkuDetails skuDetails = new SkuDetails(str);
                ArrayList<SkuDetails> arrayList = new ArrayList<>();
                arrayList.add(skuDetails);
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("SkuDetails must be provided.");
                }
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = i2 + 1;
                    if (arrayList.get(i2) == null) {
                        throw new IllegalArgumentException("SKU cannot be null.");
                    }
                    i2 = i3;
                }
                if (arrayList.size() > 1) {
                    SkuDetails skuDetails2 = arrayList.get(0);
                    String strM12556b = skuDetails2.m12556b();
                    int size2 = arrayList.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        SkuDetails skuDetails3 = arrayList.get(i4);
                        if (!strM12556b.equals("play_pass_subs") && !skuDetails3.m12556b().equals("play_pass_subs") && !strM12556b.equals(skuDetails3.m12556b())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String strM12557c = skuDetails2.m12557c();
                    int size3 = arrayList.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        SkuDetails skuDetails4 = arrayList.get(i5);
                        if (!strM12556b.equals("play_pass_subs") && !skuDetails4.m12556b().equals("play_pass_subs") && !strM12557c.equals(skuDetails4.m12557c())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                C0517e c0517e = new C0517e();
                c0517e.f2705a = true ^ arrayList.get(0).m12557c().isEmpty();
                c0517e.f2706b = null;
                c0517e.f2709e = null;
                c0517e.f2707c = null;
                c0517e.f2708d = null;
                c0517e.f2710f = 0;
                c0517e.f2711g = arrayList;
                c0517e.f2712h = false;
                Intrinsics2.m13088d(c0517e, "BillingFlowParams.newBui…tails(skuDetails).build()");
                AbstractC0509a abstractC0509a = walletViewModel5Mo13882Z0.f31975l;
                if (abstractC0509a == null) {
                    Intrinsics2.m13096l("playStoreBillingClient");
                    throw null;
                }
                abstractC0509a.mo1530e(fragmentActivityM16526F0, c0517e);
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.d$c */
    /* JADX INFO: compiled from: DiamondFragment.kt */
    public static final class c<T> implements Observer<List<? extends SkuEntity>> {
        public c() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(List<? extends SkuEntity> list) {
            DiamondFragment.this.f31948g0.m13977p(list);
            ProgressBar progressBar = (ProgressBar) DiamondFragment.this.m13952c1(R.id.progress_loading);
            Intrinsics2.m13088d(progressBar, "progress_loading");
            SkuDao.a.m14109v(progressBar);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.d$d */
    /* JADX INFO: compiled from: DiamondFragment.kt */
    public static final class d<T> implements Observer<Integer> {
        public d() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Integer num) {
            Integer num2 = num;
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
            if (user != null) {
                int diamonds = user.getDiamonds();
                Intrinsics2.m13088d(num2, "it");
                user.setDiamonds(num2.intValue() + diamonds);
                Intrinsics2.m13089e("current_user", "key");
                String strM12319f = new GsonBuilder().m12322a().m12319f(user);
                SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
                if (sharedPreferences2 == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                outline.m1564O(sharedPreferences2, "current_user", strM12319f);
                DiamondFragment.this.mo13882Z0().m13955p();
                ViewBinding viewbinding = DiamondFragment.this.f32018c0;
                if (viewbinding == 0) {
                    Intrinsics2.m13096l("viewBinding");
                    throw null;
                }
                ((DiamondFragmentBinding) viewbinding).mo398f();
                DiamondFragment diamondFragment = DiamondFragment.this;
                String strM16546Q = diamondFragment.m16546Q(R.string.msg_payment_success);
                Intrinsics2.m13088d(strM16546Q, "getString(R.string.msg_payment_success)");
                String strM16546Q2 = DiamondFragment.this.m16546Q(R.string.msg_payment_plus_diamond);
                Intrinsics2.m13088d(strM16546Q2, "getString(R.string.msg_payment_plus_diamond)");
                int iIntValue = num2.intValue();
                View viewInflate = LayoutInflater.from(diamondFragment.m16528G0()).inflate(R.layout.layout_popup_diamond_coin_exp, (ViewGroup) null, false);
                Objects.requireNonNull(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                TextView textView = (TextView) linearLayout.findViewById(R.id.message);
                Intrinsics2.m13088d(textView, "layout.message");
                textView.setText(strM16546Q2);
                if (iIntValue > 0) {
                    TextView textView2 = (TextView) linearLayout.findViewById(R.id.diamonds);
                    Intrinsics2.m13088d(textView2, "layout.diamonds");
                    SkuDao.a.m14068T(textView2);
                    ImageView imageView = (ImageView) linearLayout.findViewById(R.id.iconDiamond);
                    Intrinsics2.m13088d(imageView, "layout.iconDiamond");
                    SkuDao.a.m14068T(imageView);
                    TextView textView3 = (TextView) linearLayout.findViewById(R.id.diamonds);
                    Intrinsics2.m13088d(textView3, "layout.diamonds");
                    StringBuilder sb = new StringBuilder();
                    sb.append('+');
                    sb.append(iIntValue);
                    textView3.setText(sb.toString());
                    PAlertDialog pAlertDialog = new PAlertDialog(diamondFragment.m16528G0(), 4);
                    pAlertDialog.m14012i(strM16546Q);
                    pAlertDialog.m14010e(pAlertDialog.getContext().getResources().getDrawable(R.drawable.ic_success_round, diamondFragment.m16528G0().getTheme()));
                    pAlertDialog.m14009d(diamondFragment.m16546Q(R.string.f33401ok));
                    pAlertDialog.m14011f(linearLayout);
                    pAlertDialog.m14008c(pAlertDialog.getContext().getResources().getDrawable(R.drawable.bg_button_basic_corners, diamondFragment.m16528G0().getTheme()));
                    pAlertDialog.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.d$e */
    /* JADX INFO: compiled from: DiamondFragment.kt */
    public static final class e<T> implements Observer<Boolean> {
        public e() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Boolean bool) {
            SkuDao.a.m14069U(DiamondFragment.this.m16526F0(), null, DiamondFragment.this.m16546Q(R.string.msg_payment_fail), DiamondFragment.this.m16546Q(R.string.f33401ok), null, null, null, false, false, 249);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.d$f */
    /* JADX INFO: compiled from: DiamondFragment.kt */
    @DebugMetadata(m13068c = "mtp.media.karaoke.ui.screen.wallet.DiamondFragment$onViewCreated$4", m13069f = "DiamondFragment.kt", m13070l = {62}, m13071m = "invokeSuspend")
    public static final class f extends ContinuationImpl5 implements InterfaceC6168p<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: j */
        public int f31955j;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: a */
        public final Continuation<Unit> mo4a(Object obj, Continuation<?> continuation) {
            Intrinsics2.m13089e(continuation, "completion");
            return DiamondFragment.this.new f(continuation);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6168p
        /* JADX INFO: renamed from: l */
        public final Object mo5l(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            Continuation<? super Unit> continuation2 = continuation;
            Intrinsics2.m13089e(continuation2, "completion");
            return DiamondFragment.this.new f(continuation2).mo6m(Unit.f29502a);
        }

        @Override // p477d1.p485u.p487j.p488a.ContinuationImpl
        /* JADX INFO: renamed from: m */
        public final Object mo6m(Object obj) throws Throwable {
            Intrinsics intrinsics = Intrinsics.COROUTINE_SUSPENDED;
            int i = this.f31955j;
            if (i == 0) {
                C5729a.m12442O(obj);
                this.f31955j = 1;
                if (C5729a.m12457l(5000L, this) == intrinsics) {
                    return intrinsics;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C5729a.m12442O(obj);
            }
            WalletViewModel5 walletViewModel5Mo13882Z0 = DiamondFragment.this.mo13882Z0();
            Objects.requireNonNull(walletViewModel5Mo13882Z0);
            C5729a.m12428A(C8310a.m16440e(walletViewModel5Mo13882Z0), null, 0, new WalletViewModel3(walletViewModel5Mo13882Z0, null), 3, null);
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.s.d$g */
    /* JADX INFO: compiled from: DiamondFragment.kt */
    public static final class g extends Lambda implements InterfaceC6153a<ViewModelStoreOwner> {
        public g() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ViewModelStoreOwner mo2c() {
            FragmentActivity fragmentActivityM16526F0 = DiamondFragment.this.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            return fragmentActivityM16526F0;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31949h0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31946e0;
    }

    /* JADX INFO: renamed from: c1 */
    public View m13952c1(int i) {
        if (this.f31949h0 == null) {
            this.f31949h0 = new HashMap();
        }
        View view = (View) this.f31949h0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31949h0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public WalletViewModel5 mo13882Z0() {
        return (WalletViewModel5) this.f31947f0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f31949h0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        RecyclerView recyclerView = (RecyclerView) m13952c1(R.id.recycler_view);
        if ((recyclerView != null ? recyclerView.getAdapter() : null) == null) {
            RecyclerView recyclerView2 = (RecyclerView) m13952c1(R.id.recycler_view);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(this.f31948g0);
            }
            RecyclerView recyclerView3 = (RecyclerView) m13952c1(R.id.recycler_view);
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(m16571x(), 1, false));
            }
        }
        WalletViewModel5 walletViewModel5Mo13882Z0 = mo13882Z0();
        Objects.requireNonNull(walletViewModel5Mo13882Z0);
        C5729a.m12428A(C8310a.m16440e(walletViewModel5Mo13882Z0), null, 0, new WalletViewModel3(walletViewModel5Mo13882Z0, null), 3, null);
        mo13882Z0().f31978o.mo422e(m16548R(), new c());
        mo13882Z0().f31977n.mo422e(m16548R(), new d());
        mo13882Z0().f31979p.mo422e(m16548R(), new e());
        C5729a.m12428A(CoroutineScope2.f29811f, MainDispatchers.f29666b, 0, new f(null), 2, null);
    }
}
