package p555j.p556a.p557a.p558a.p559a.p578j;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.addon.snaprecycleview.view.indicator.CircleRecyclerPageIndicator;
import mtp.media.karaoke.data.model.Gift;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.level.LevelActivity;
import mtp.media.karaoke.p628ui.screen.wallet.WalletActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3;
import p555j.p556a.p557a.p597g.p601d.GravitySnapHelper;
import p555j.p556a.p557a.p597g.p601d.PageIndicatorHelper;
import p555j.p556a.p557a.p597g.p601d.p602e.InvertRowColumnDataTransform;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.GiftFragmentBinding;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.j.a, reason: use source file name */
/* JADX INFO: compiled from: GiftFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GiftFragment extends BaseBottomSheetDialogFragment3<GiftFragmentBinding, GiftViewModel3> {

    /* JADX INFO: renamed from: t0 */
    public static final c f31535t0 = new c(null);

    /* JADX INFO: renamed from: A0 */
    public Gift f31536A0;

    /* JADX INFO: renamed from: C0 */
    public int f31538C0;

    /* JADX INFO: renamed from: D0 */
    public HashMap f31539D0;

    /* JADX INFO: renamed from: w0 */
    public d f31542w0;

    /* JADX INFO: renamed from: y0 */
    public List<Gift> f31544y0;

    /* JADX INFO: renamed from: u0 */
    public final int f31540u0 = R.layout.gift_fragment;

    /* JADX INFO: renamed from: v0 */
    public final Lazy3 f31541v0 = LazyJVM.m13020a(Lazy4.NONE, new b(this, null, null));

    /* JADX INFO: renamed from: x0 */
    public final GiftAdapter f31543x0 = new GiftAdapter(new e());

    /* JADX INFO: renamed from: z0 */
    public String[] f31545z0 = {"x1", "x5", "x10", "x50", "x100", "x500", "x999"};

    /* JADX INFO: renamed from: B0 */
    public int f31537B0 = 1;

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f31546g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f31547h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj) {
            super(0);
            this.f31546g = i;
            this.f31547h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f31546g;
            if (i != 0) {
                if (i != 1) {
                    throw null;
                }
                WalletActivity.C7381b c7381b = WalletActivity.f34028w;
                Context contextM16528G0 = ((GiftFragment) this.f31547h).m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                ((GiftFragment) this.f31547h).m13973h1(c7381b.m14467a(contextM16528G0));
                return Unit.f29502a;
            }
            LevelActivity.C7331b c7331b = LevelActivity.f33843w;
            Context contextM16528G1 = ((GiftFragment) this.f31547h).m16528G0();
            Intrinsics2.m13088d(contextM16528G1, "requireContext()");
            Objects.requireNonNull(c7331b);
            Intrinsics2.m13089e(contextM16528G1, "context");
            ((GiftFragment) this.f31547h).m13973h1(new Intent(contextM16528G1, (Class<?>) LevelActivity.class));
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class b extends Lambda implements InterfaceC6153a<GiftViewModel3> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31548g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31549h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31550i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31548g = viewModelStoreOwner;
            this.f31549h = qualifier;
            this.f31550i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.j.h] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public GiftViewModel3 mo2c() {
            return SkuDao.a.m14107t(this.f31548g, Reflection.m13097a(GiftViewModel3.class), this.f31549h, this.f31550i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$c */
    /* JADX INFO: compiled from: GiftFragment.kt */
    public static final class c {
        public c() {
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$d */
    /* JADX INFO: compiled from: GiftFragment.kt */
    public interface d {
        /* JADX INFO: renamed from: r */
        void mo13930r(Present present);
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$e */
    /* JADX INFO: compiled from: GiftFragment.kt */
    public static final class e extends Lambda implements InterfaceC6164l<Gift, Unit> {
        public e() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Gift gift) {
            Gift gift2 = gift;
            Intrinsics2.m13089e(gift2, "it");
            GiftFragment giftFragment = GiftFragment.this;
            giftFragment.f31536A0 = gift2;
            giftFragment.m13929k1();
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$f */
    /* JADX INFO: compiled from: GiftFragment.kt */
    public static final class f<T> implements Observer<ArrayList<Gift>> {
        public f() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(ArrayList<Gift> arrayList) {
            GiftFragment giftFragment = GiftFragment.this;
            giftFragment.f31544y0 = arrayList;
            ((RecyclerView) giftFragment.m13927i1(R.id.recycler_view)).setHasFixedSize(true);
            RecyclerView recyclerView = (RecyclerView) giftFragment.m13927i1(R.id.recycler_view);
            Intrinsics2.m13088d(recyclerView, "recycler_view");
            if (recyclerView.getAdapter() == null) {
                RecyclerView recyclerView2 = (RecyclerView) giftFragment.m13927i1(R.id.recycler_view);
                Intrinsics2.m13088d(recyclerView2, "recycler_view");
                recyclerView2.setAdapter(giftFragment.f31543x0);
            }
            RecyclerView recyclerView3 = (RecyclerView) giftFragment.m13927i1(R.id.recycler_view);
            Intrinsics2.m13088d(recyclerView3, "recycler_view");
            recyclerView3.setLayoutManager(new GridLayoutManager(giftFragment.m16528G0(), 2, 0, false));
            InvertRowColumnDataTransform invertRowColumnDataTransform = new InvertRowColumnDataTransform(4, 2);
            List<Gift> list = giftFragment.f31544y0;
            if (list == null || list.size() == 0) {
                throw new IllegalArgumentException("data list must be not null or size must > 0");
            }
            ArrayList arrayList2 = new ArrayList();
            int i = invertRowColumnDataTransform.f32191a * invertRowColumnDataTransform.f32192b;
            int size = list.size();
            int i2 = size < i ? i : size % i == 0 ? size : ((size / i) + 1) * i;
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (i3 / i) * i;
                int i5 = i3 - i4;
                int i6 = invertRowColumnDataTransform.f32191a;
                int iM1591m = outline.m1591m(i5 % i6, invertRowColumnDataTransform.f32192b, i5 / i6, i4);
                if (iM1591m < 0 || iM1591m >= size) {
                    arrayList2.add(null);
                } else {
                    arrayList2.add(list.get(iM1591m));
                }
            }
            giftFragment.f31544y0 = arrayList2;
            giftFragment.f31543x0.m13977p(arrayList2);
            GiftAdapter giftAdapter = giftFragment.f31543x0;
            FragmentActivity fragmentActivityM16526F0 = giftFragment.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            giftAdapter.f31556f = SkuDao.a.m14104q(fragmentActivityM16526F0) / 4;
            GravitySnapHelper gravitySnapHelper = new GravitySnapHelper(17);
            gravitySnapHelper.f32183f.f32180h = 4;
            gravitySnapHelper.mo14020b((RecyclerView) giftFragment.m13927i1(R.id.recycler_view));
            gravitySnapHelper.f32184g = true;
            ((CircleRecyclerPageIndicator) giftFragment.m13927i1(R.id.pagingCenter)).setRecyclerView((RecyclerView) giftFragment.m13927i1(R.id.recycler_view));
            ((CircleRecyclerPageIndicator) giftFragment.m13927i1(R.id.pagingCenter)).setPageColumn(4);
            PageIndicatorHelper pageIndicatorHelper = new PageIndicatorHelper();
            pageIndicatorHelper.f32186b = 4;
            RecyclerView recyclerView4 = (RecyclerView) giftFragment.m13927i1(R.id.recycler_view);
            RecyclerView recyclerView5 = pageIndicatorHelper.f32187c;
            if (recyclerView5 != recyclerView4) {
                if (recyclerView5 != null) {
                    recyclerView5.m602e0(pageIndicatorHelper.f32189e);
                }
                if (recyclerView4.getAdapter() == null) {
                    throw new IllegalStateException("RecyclerView does not have adapter instance.");
                }
                pageIndicatorHelper.f32187c = recyclerView4;
                recyclerView4.m607h(pageIndicatorHelper.f32189e);
            }
            pageIndicatorHelper.f32185a = new GiftFragment3();
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$g */
    /* JADX INFO: compiled from: GiftFragment.kt */
    public static final class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
            Intrinsics2.m13089e(adapterView, "parent");
            Intrinsics2.m13089e(view, "view");
            switch (i) {
                case 0:
                    GiftFragment.this.f31537B0 = 1;
                    break;
                case 1:
                    GiftFragment.this.f31537B0 = 5;
                    break;
                case 2:
                    GiftFragment.this.f31537B0 = 10;
                    break;
                case 3:
                    GiftFragment.this.f31537B0 = 50;
                    break;
                case 4:
                    GiftFragment.this.f31537B0 = 100;
                    break;
                case 5:
                    GiftFragment.this.f31537B0 = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
                    break;
                case 6:
                    GiftFragment.this.f31537B0 = 999;
                    break;
            }
            GiftFragment giftFragment = GiftFragment.this;
            c cVar = GiftFragment.f31535t0;
            giftFragment.m13929k1();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            Intrinsics2.m13089e(adapterView, "parent");
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$h */
    /* JADX INFO: compiled from: GiftFragment.kt */
    public static final class h extends Lambda implements InterfaceC6153a<Unit> {
        public h() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            GiftFragment giftFragment;
            Gift gift;
            User userM421d = GiftFragment.this.mo13926g1().f31573l.m421d();
            if (userM421d != null && (gift = (giftFragment = GiftFragment.this).f31536A0) != null && giftFragment.f31538C0 > 0) {
                int type = gift.getType();
                boolean z = false;
                if (type == 1) {
                    int diamonds = userM421d.getDiamonds();
                    int amount = gift.getAmount();
                    GiftFragment giftFragment2 = GiftFragment.this;
                    if (diamonds >= amount * giftFragment2.f31537B0) {
                        userM421d.setDiamonds(userM421d.getDiamonds() - (gift.getAmount() * GiftFragment.this.f31537B0));
                        z = true;
                    } else {
                        SkuDao.a.m14069U(giftFragment2.m16571x(), null, GiftFragment.this.m16546Q(R.string.msg_not_enough_diamonds), GiftFragment.this.m16546Q(R.string.msg_recharge), new GiftFragment2(userM421d, this), GiftFragment.this.m16546Q(R.string.msg_cancel), null, false, false, 225);
                    }
                } else if (type == 2) {
                    int coins = userM421d.getCoins();
                    int amount2 = gift.getAmount();
                    GiftFragment giftFragment3 = GiftFragment.this;
                    if (coins >= amount2 * giftFragment3.f31537B0) {
                        userM421d.setCoins(userM421d.getCoins() - (gift.getAmount() * GiftFragment.this.f31537B0));
                        z = true;
                    } else {
                        FragmentActivity fragmentActivityM16562f = giftFragment3.m16562f();
                        String strM16546Q = GiftFragment.this.m16546Q(R.string.msg_not_enough_coins);
                        Intrinsics2.m13088d(strM16546Q, "getString(R.string.msg_not_enough_coins)");
                        SkuDao.a.m14094j0(fragmentActivityM16562f, strM16546Q, 0, 2);
                    }
                }
                if (z) {
                    GiftViewModel3 giftViewModel3Mo13926g1 = GiftFragment.this.mo13926g1();
                    int i = GiftFragment.this.f31538C0;
                    int id = gift.getId();
                    GiftFragment giftFragment4 = GiftFragment.this;
                    int i2 = giftFragment4.f31537B0;
                    String strM14247a = DeviceUtils.f33080a.m14247a(giftFragment4.m16528G0());
                    Objects.requireNonNull(giftViewModel3Mo13926g1);
                    Intrinsics2.m13089e(strM14247a, "uniqueId");
                    C5729a.m12428A(C8310a.m16440e(giftViewModel3Mo13926g1), null, 0, new GiftViewModel2(giftViewModel3Mo13926g1, i, id, i2, strM14247a, null), 3, null);
                }
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.j.a$i */
    /* JADX INFO: compiled from: GiftFragment.kt */
    public static final class i<T> implements Observer<Boolean> {
        public i() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(Boolean bool) {
            Gift gift;
            User userM421d = GiftFragment.this.mo13926g1().f31573l.m421d();
            if (userM421d == null || (gift = GiftFragment.this.f31536A0) == null) {
                return;
            }
            Intrinsics2.m13089e("current_user", "key");
            String strM12319f = new GsonBuilder().m12322a().m12319f(userM421d);
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            outline.m1564O(sharedPreferences, "current_user", strM12319f);
            ViewBinding viewbinding = GiftFragment.this.f32015s0;
            if (viewbinding == 0) {
                Intrinsics2.m13096l("viewBinding");
                throw null;
            }
            ((GiftFragmentBinding) viewbinding).mo398f();
            Present present = new Present(0, userM421d.getId(), userM421d, 0, gift.getId(), gift, GiftFragment.this.f31537B0, 0, "", "");
            Intrinsics2.m13089e("isSendSuccess", "message");
            d dVar = GiftFragment.this.f31542w0;
            if (dVar != null) {
                dVar.mo13930r(present);
            }
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment
    /* JADX INFO: renamed from: Y0 */
    public int mo13868Y0() {
        return R.style.AppBottomSheetDialogThemeGift;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof d) {
            this.f31542w0 = (d) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f31538C0 = bundle2.getInt("recording_id");
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: d1 */
    public void mo13924d1() {
        HashMap map = this.f31539D0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: f1 */
    public int mo13925f1() {
        return this.f31540u0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3, p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f31539D0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.DialogFragment, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        super.mo1957i0();
        this.f31542w0 = null;
    }

    /* JADX INFO: renamed from: i1 */
    public View m13927i1(int i2) {
        if (this.f31539D0 == null) {
            this.f31539D0 = new HashMap();
        }
        View view = (View) this.f31539D0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i2);
        this.f31539D0.put(Integer.valueOf(i2), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public GiftViewModel3 mo13926g1() {
        return (GiftViewModel3) this.f31541v0.getValue();
    }

    /* JADX INFO: renamed from: k1 */
    public final void m13929k1() {
        Gift gift = this.f31536A0;
        if (gift != null) {
            if (gift.getExp() > 0) {
                TextView textView = (TextView) m13927i1(R.id.lblExpSendGift);
                Intrinsics2.m13088d(textView, "lblExpSendGift");
                String strM16546Q = m16546Q(R.string.msg_exp_send_gift);
                Intrinsics2.m13088d(strM16546Q, "getString(R.string.msg_exp_send_gift)");
                outline.m1574Y(new Object[]{Integer.valueOf(gift.getExp() * this.f31537B0)}, 1, strM16546Q, "java.lang.String.format(format, *args)", textView);
                return;
            }
            User userM421d = mo13926g1().f31573l.m421d();
            if (userM421d != null) {
                TextView textView2 = (TextView) m13927i1(R.id.lblExpSendGift);
                Intrinsics2.m13088d(textView2, "lblExpSendGift");
                String strM16546Q2 = m16546Q(R.string.msg_no_exp_send_gift);
                Intrinsics2.m13088d(strM16546Q2, "getString(R.string.msg_no_exp_send_gift)");
                outline.m1574Y(new Object[]{Integer.valueOf(userM421d.getExps())}, 1, strM16546Q2, "java.lang.String.format(format, *args)", textView2);
                return;
            }
            TextView textView3 = (TextView) m13927i1(R.id.lblExpSendGift);
            Intrinsics2.m13088d(textView3, "lblExpSendGift");
            String strM16546Q3 = m16546Q(R.string.msg_no_exp_send_gift);
            Intrinsics2.m13088d(strM16546Q3, "getString(R.string.msg_no_exp_send_gift)");
            outline.m1574Y(new Object[]{0}, 1, strM16546Q3, "java.lang.String.format(format, *args)", textView3);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseBottomSheetDialogFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        GiftViewModel3 giftViewModel3Mo13926g1 = mo13926g1();
        Objects.requireNonNull(giftViewModel3Mo13926g1);
        C5729a.m12428A(C8310a.m16440e(giftViewModel3Mo13926g1), null, 0, new GiftViewModel(giftViewModel3Mo13926g1, null), 3, null);
        MutableLiveData<User> mutableLiveData = giftViewModel3Mo13926g1.f31573l;
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        mutableLiveData.mo427j((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class));
        TextView textView = (TextView) m13927i1(R.id.lblExpSendGift);
        Intrinsics2.m13088d(textView, "lblExpSendGift");
        String strM16546Q = m16546Q(R.string.msg_no_exp_send_gift);
        Intrinsics2.m13088d(strM16546Q, "getString(R.string.msg_no_exp_send_gift)");
        Object[] objArr = new Object[1];
        SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
        if (sharedPreferences2 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) outline.m1584f(sharedPreferences2.getString("current_user", null), User.class);
        objArr[0] = Integer.valueOf(user != null ? user.getExps() : 0);
        String str = String.format(strM16546Q, Arrays.copyOf(objArr, 1));
        Intrinsics2.m13088d(str, "java.lang.String.format(format, *args)");
        textView.setText(str);
        mo13926g1().f31574m.mo422e(this, new f());
        ArrayAdapter arrayAdapter = new ArrayAdapter(m16528G0(), R.layout.spinner_item, this.f31545z0);
        Spinner spinner = (Spinner) m13927i1(R.id.spinner);
        Intrinsics2.m13088d(spinner, "spinner");
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        Spinner spinner2 = (Spinner) m13927i1(R.id.spinner);
        Intrinsics2.m13088d(spinner2, "spinner");
        spinner2.setOnItemSelectedListener(new g());
        TextView textView2 = (TextView) m13927i1(R.id.lblExpSendGift);
        Intrinsics2.m13088d(textView2, "lblExpSendGift");
        textView2.setSelected(true);
        RelativeLayout relativeLayout = (RelativeLayout) m13927i1(R.id.toLevelScreen);
        Intrinsics2.m13088d(relativeLayout, "toLevelScreen");
        SkuDao.a.m14067S(relativeLayout, new a(0, this));
        TextView textView3 = (TextView) m13927i1(R.id.btnRecharge);
        Intrinsics2.m13088d(textView3, "btnRecharge");
        SkuDao.a.m14067S(textView3, new a(1, this));
        TextView textView4 = (TextView) m13927i1(R.id.btnActionSendGift);
        Intrinsics2.m13088d(textView4, "btnActionSendGift");
        SkuDao.a.m14067S(textView4, new h());
        mo13926g1().f31575n.mo422e(m16548R(), new i());
    }
}
