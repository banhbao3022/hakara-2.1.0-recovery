package mtp.media.karaoke.p628ui.screen.song;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.duet.DuetActivity;
import mtp.media.karaoke.p628ui.screen.profile.task.TaskActivity;
import mtp.media.karaoke.p628ui.screen.search.SearchActivity;
import mtp.media.karaoke.p628ui.screen.wallet.WalletActivity;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s.Collections2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p569f.SongbookFragment2;
import p555j.p556a.p557a.p558a.p559a.p569f.SongbookViewModel;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p558a.p593c.ReselectableFragment;
import p555j.p556a.p557a.p558a.p596f.MainPagerAdapter;
import p555j.p556a.p557a.p558a.p596f.TabData;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.SongbookFragmentBinding;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: SongbookFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SongbookFragment extends BaseFragment3<SongbookFragmentBinding, SongbookViewModel> {

    /* JADX INFO: renamed from: d0 */
    public final int f33984d0 = R.layout.songbook_fragment;

    /* JADX INFO: renamed from: e0 */
    public final Lazy3 f33985e0 = LazyJVM.m13020a(Lazy4.NONE, new C7369b(this, null, null));

    /* JADX INFO: renamed from: f0 */
    public MainPagerAdapter f33986f0;

    /* JADX INFO: renamed from: g0 */
    public HashMap f33987g0;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.song.SongbookFragment$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7368a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33988g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33989h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7368a(int i, Object obj) {
            super(0);
            this.f33988g = i;
            this.f33989h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            int i = this.f33988g;
            if (i == 0) {
                ((SongbookFragment) this.f33989h).m16555U0(new Intent(((SongbookFragment) this.f33989h).m16562f(), (Class<?>) SearchActivity.class).addFlags(65536));
                FragmentActivity fragmentActivityM16562f = ((SongbookFragment) this.f33989h).m16562f();
                if (fragmentActivityM16562f != null) {
                    fragmentActivityM16562f.overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                }
                return Unit.f29502a;
            }
            if (i == 1) {
                DuetActivity.C7249b c7249b = DuetActivity.f33509w;
                Context contextM16528G0 = ((SongbookFragment) this.f33989h).m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                Objects.requireNonNull(c7249b);
                Intrinsics2.m13089e(contextM16528G0, "context");
                ((SongbookFragment) this.f33989h).m13976b1(new Intent(contextM16528G0, (Class<?>) DuetActivity.class));
                return Unit.f29502a;
            }
            if (i == 2) {
                SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                if (sharedPreferences == null) {
                    Intrinsics2.m13096l("preferences");
                    throw null;
                }
                if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class)) != null) {
                    WalletActivity.C7381b c7381b = WalletActivity.f34028w;
                    Context contextM16528G1 = ((SongbookFragment) this.f33989h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G1, "requireContext()");
                    ((SongbookFragment) this.f33989h).m13976b1(c7381b.m14467a(contextM16528G1));
                } else {
                    SongbookFragment.m14459d1((SongbookFragment) this.f33989h);
                }
                return Unit.f29502a;
            }
            if (i != 3) {
                throw null;
            }
            SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
            if (sharedPreferences2 == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences2.getString("current_user", null), User.class)) != null) {
                TaskActivity.C7333b c7333b = TaskActivity.f33850w;
                Context contextM16528G2 = ((SongbookFragment) this.f33989h).m16528G0();
                Intrinsics2.m13088d(contextM16528G2, "requireContext()");
                Objects.requireNonNull(c7333b);
                Intrinsics2.m13089e(contextM16528G2, "context");
                ((SongbookFragment) this.f33989h).m13976b1(new Intent(contextM16528G2, (Class<?>) TaskActivity.class));
            } else {
                SongbookFragment.m14459d1((SongbookFragment) this.f33989h);
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.song.SongbookFragment$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7369b extends Lambda implements InterfaceC6153a<SongbookViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33990g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33991h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33992i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7369b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33990g = viewModelStoreOwner;
            this.f33991h = qualifier;
            this.f33992i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.f.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public SongbookViewModel mo2c() {
            return SkuDao.a.m14107t(this.f33990g, Reflection.m13097a(SongbookViewModel.class), this.f33991h, this.f33992i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.song.SongbookFragment$c */
    /* JADX INFO: compiled from: SongbookFragment.kt */
    public static final class C7370c implements TabLayout.InterfaceC5966d {
        public C7370c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: a */
        public void mo11027a(TabLayout.C5969g c5969g) {
            MainPagerAdapter mainPagerAdapter = SongbookFragment.this.f33986f0;
            if (mainPagerAdapter != null) {
                LifecycleOwner lifecycleOwnerM13990w = mainPagerAdapter.m13990w(c5969g != null ? c5969g.f29081d : 0);
                if (lifecycleOwnerM13990w instanceof ReselectableFragment) {
                    ((ReselectableFragment) lifecycleOwnerM13990w).m13988a();
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: b */
        public void mo11028b(TabLayout.C5969g c5969g) {
            ViewPager2 viewPager2 = (ViewPager2) SongbookFragment.this.m14460c1(R.id.viewpager);
            Intrinsics2.m13088d(viewPager2, "viewpager");
            viewPager2.setCurrentItem(c5969g != null ? c5969g.f29081d : 0);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: c */
        public void mo11029c(TabLayout.C5969g c5969g) {
        }
    }

    /* JADX INFO: renamed from: d1 */
    public static final void m14459d1(SongbookFragment songbookFragment) {
        Objects.requireNonNull(songbookFragment);
        LoginFragment2 loginFragment2M13940a = LoginFragment2.f31647t0.m13940a(-1);
        FragmentActivity fragmentActivityM16526F0 = songbookFragment.m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        loginFragment2M13940a.mo5469c1(fragmentActivityM16526F0.m16577C(), "LoginForm");
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f33987g0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f33984d0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Z0 */
    public BaseViewModel mo13882Z0() {
        return (SongbookViewModel) this.f33985e0.getValue();
    }

    /* JADX INFO: renamed from: c1 */
    public View m14460c1(int i) {
        if (this.f33987g0 == null) {
            this.f33987g0 = new HashMap();
        }
        View view = (View) this.f33987g0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f33987g0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f33987g0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        FragmentActivity fragmentActivityM16526F0 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        int iM14105r = SkuDao.a.m14105r(fragmentActivityM16526F0);
        Toolbar toolbar = (Toolbar) m14460c1(R.id.toolbar);
        Intrinsics2.m13088d(toolbar, "toolbar");
        SkuDao.a.m14066R(toolbar, iM14105r);
        ConstraintLayout constraintLayout = (ConstraintLayout) m14460c1(R.id.actionIconLayout);
        Intrinsics2.m13088d(constraintLayout, "actionIconLayout");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) m14460c1(R.id.actionIconLayout);
        Intrinsics2.m13088d(constraintLayout2, "actionIconLayout");
        ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        SkuDao.a.m14066R(constraintLayout, iM14105r + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0));
        List listM13038c = Collections2.m13038c(SkuDao.a.m14087g("recommend"), SkuDao.a.m14087g("duet"), SkuDao.a.m14087g("hot"), SkuDao.a.m14087g("trending"));
        FragmentActivity fragmentActivityM16526F1 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F1, "requireActivity()");
        this.f33986f0 = new MainPagerAdapter(listM13038c, fragmentActivityM16526F1);
        ViewPager2 viewPager2 = (ViewPager2) m14460c1(R.id.viewpager);
        Intrinsics2.m13088d(viewPager2, "viewpager");
        viewPager2.setAdapter(this.f33986f0);
        new TabLayoutMediator((TabLayout) m14460c1(R.id.tabLayout), (ViewPager2) m14460c1(R.id.viewpager), SongbookFragment2.f31308a).m11024a();
        ((TabLayout) m14460c1(R.id.tabLayout)).m12825j();
        int size = listM13038c.size();
        for (int i = 0; i < size; i++) {
            TabLayout.C5969g c5969gM12823h = ((TabLayout) m14460c1(R.id.tabLayout)).m12823h();
            c5969gM12823h.m12837a(((TabData) listM13038c.get(i)).f32073b);
            Intrinsics2.m13088d(c5969gM12823h, "tabLayout.newTab()\n     …   .setText(tabs[i].text)");
            TabLayout tabLayout = (TabLayout) m14460c1(R.id.tabLayout);
            tabLayout.m12816a(c5969gM12823h, tabLayout.f29044g.isEmpty());
        }
        TabLayout tabLayout2 = (TabLayout) m14460c1(R.id.tabLayout);
        C7370c c7370c = new C7370c();
        if (!tabLayout2.f29034M.contains(c7370c)) {
            tabLayout2.f29034M.add(c7370c);
        }
        TextView textView = (TextView) m14460c1(R.id.btnSearch);
        Intrinsics2.m13088d(textView, "btnSearch");
        SkuDao.a.m14067S(textView, new C7368a(0, this));
        RelativeLayout relativeLayout = (RelativeLayout) m14460c1(R.id.btnDuet);
        Intrinsics2.m13088d(relativeLayout, "btnDuet");
        SkuDao.a.m14067S(relativeLayout, new C7368a(1, this));
        RelativeLayout relativeLayout2 = (RelativeLayout) m14460c1(R.id.btnWallet);
        Intrinsics2.m13088d(relativeLayout2, "btnWallet");
        SkuDao.a.m14067S(relativeLayout2, new C7368a(2, this));
        RelativeLayout relativeLayout3 = (RelativeLayout) m14460c1(R.id.btnTask);
        Intrinsics2.m13088d(relativeLayout3, "btnTask");
        SkuDao.a.m14067S(relativeLayout3, new C7368a(3, this));
    }
}
