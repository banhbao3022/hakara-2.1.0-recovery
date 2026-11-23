package mtp.media.karaoke.p628ui.screen.feed;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import mtp.media.karaoke.MainApplication;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
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
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingFragment;
import p555j.p556a.p557a.p558a.p559a.p581k.FeedFragment2;
import p555j.p556a.p557a.p558a.p559a.p581k.FeedViewModel;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p558a.p593c.ReselectableFragment;
import p555j.p556a.p557a.p558a.p596f.MainPagerAdapter;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p558a.p596f.TabData;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FeedFragmentBinding;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: FeedFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FeedFragment extends BaseFragment3<FeedFragmentBinding, FeedViewModel> {

    /* JADX INFO: renamed from: d0 */
    public final int f33579d0 = R.layout.feed_fragment;

    /* JADX INFO: renamed from: e0 */
    public final Lazy3 f33580e0 = LazyJVM.m13020a(Lazy4.NONE, new C7270a(this, null, null));

    /* JADX INFO: renamed from: f0 */
    public MainPagerAdapter f33581f0;

    /* JADX INFO: renamed from: g0 */
    public PlaylistManager f33582g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f33583h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f33584i0;

    /* JADX INFO: renamed from: j0 */
    public int f33585j0;

    /* JADX INFO: renamed from: k0 */
    public HashMap f33586k0;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.feed.FeedFragment$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7270a extends Lambda implements InterfaceC6153a<FeedViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33587g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33588h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33589i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7270a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33587g = viewModelStoreOwner;
            this.f33588h = qualifier;
            this.f33589i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.k.b] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public FeedViewModel mo2c() {
            return SkuDao.a.m14107t(this.f33587g, Reflection.m13097a(FeedViewModel.class), this.f33588h, this.f33589i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.feed.FeedFragment$b */
    /* JADX INFO: compiled from: FeedFragment.kt */
    public static final class C7271b extends Lambda implements InterfaceC6153a<Unit> {
        public C7271b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            FeedFragment feedFragment = FeedFragment.this;
            if (feedFragment.f33585j0 > 0) {
                PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
                Context contextM16528G0 = feedFragment.m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                FeedFragment.this.m13976b1(PlayingActivity.C7291e.m14396b(c7291e, contextM16528G0, FeedFragment.this.f33585j0, null, null, null, null, 60));
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.feed.FeedFragment$c */
    /* JADX INFO: compiled from: FeedFragment.kt */
    public static final class C7272c implements TabLayout.InterfaceC5966d {
        public C7272c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: a */
        public void mo11027a(TabLayout.C5969g c5969g) {
            MainPagerAdapter mainPagerAdapter = FeedFragment.this.f33581f0;
            if (mainPagerAdapter != null) {
                Intrinsics2.m13087c(mainPagerAdapter);
                Intrinsics2.m13087c(c5969g);
                LifecycleOwner lifecycleOwnerM13990w = mainPagerAdapter.m13990w(c5969g.f29081d);
                if (lifecycleOwnerM13990w instanceof ReselectableFragment) {
                    ((ReselectableFragment) lifecycleOwnerM13990w).m13988a();
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: b */
        public void mo11028b(TabLayout.C5969g c5969g) {
            ViewPager2 viewPager2 = (ViewPager2) FeedFragment.this.m14365c1(R.id.viewpager);
            Intrinsics2.m13088d(viewPager2, "viewpager");
            Intrinsics2.m13087c(c5969g);
            viewPager2.setCurrentItem(c5969g.f29081d);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: c */
        public void mo11029c(TabLayout.C5969g c5969g) {
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f33586k0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f33579d0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Z0 */
    public BaseViewModel mo13882Z0() {
        return (FeedViewModel) this.f33580e0.getValue();
    }

    /* JADX INFO: renamed from: c1 */
    public View m14365c1(int i) {
        if (this.f33586k0 == null) {
            this.f33586k0 = new HashMap();
        }
        View view = (View) this.f33586k0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f33586k0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    /* JADX INFO: renamed from: d1 */
    public final void m14366d1() {
        Intrinsics2.m13089e("updateEq", "message");
        if (this.f33584i0) {
            if (this.f33583h0) {
                return;
            }
            this.f33583h0 = true;
            ((LottieAnimationView) m14365c1(R.id.f33394eq)).m12552i();
            return;
        }
        if (this.f33583h0) {
            this.f33583h0 = false;
            ((LottieAnimationView) m14365c1(R.id.f33394eq)).m12550g();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f33586k0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: r0 */
    public void mo2075r0(int i, String[] strArr, int[] iArr) {
        Intrinsics2.m13089e(strArr, "permissions");
        Intrinsics2.m13089e(iArr, "grantResults");
        try {
            MainPagerAdapter mainPagerAdapter = this.f33581f0;
            Fragment fragmentM13990w = mainPagerAdapter != null ? mainPagerAdapter.m13990w(1) : null;
            if (fragmentM13990w == null) {
                throw new NullPointerException("null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingFragment");
            }
            ((RecordingFragment) fragmentM13990w).mo2075r0(i, strArr, iArr);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        FragmentActivity fragmentActivityM16526F0 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        int iM14105r = SkuDao.a.m14105r(fragmentActivityM16526F0);
        AppBarLayout appBarLayout = (AppBarLayout) m14365c1(R.id.app_bar);
        Intrinsics2.m13088d(appBarLayout, "app_bar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        List listM13038c = Collections2.m13038c(SkuDao.a.m14087g("following"), SkuDao.a.m14087g("nearby"));
        FragmentActivity fragmentActivityM16526F1 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F1, "requireActivity()");
        this.f33581f0 = new MainPagerAdapter(listM13038c, fragmentActivityM16526F1);
        ViewPager2 viewPager2 = (ViewPager2) m14365c1(R.id.viewpager);
        Intrinsics2.m13088d(viewPager2, "viewpager");
        viewPager2.setAdapter(this.f33581f0);
        new TabLayoutMediator((TabLayout) m14365c1(R.id.tabLayout), (ViewPager2) m14365c1(R.id.viewpager), FeedFragment2.f31603a).m11024a();
        ((TabLayout) m14365c1(R.id.tabLayout)).m12825j();
        int size = listM13038c.size();
        for (int i = 0; i < size; i++) {
            TabLayout.C5969g c5969gM12823h = ((TabLayout) m14365c1(R.id.tabLayout)).m12823h();
            c5969gM12823h.m12837a(((TabData) listM13038c.get(i)).f32073b);
            Intrinsics2.m13088d(c5969gM12823h, "tabLayout.newTab()\n     …   .setText(tabs[i].text)");
            TabLayout tabLayout = (TabLayout) m14365c1(R.id.tabLayout);
            tabLayout.m12816a(c5969gM12823h, tabLayout.f29044g.isEmpty());
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m14365c1(R.id.f33394eq);
        Intrinsics2.m13088d(lottieAnimationView, "eq");
        SkuDao.a.m14067S(lottieAnimationView, new C7271b());
        TabLayout tabLayout2 = (TabLayout) m14365c1(R.id.tabLayout);
        C7272c c7272c = new C7272c();
        if (!tabLayout2.f29034M.contains(c7272c)) {
            tabLayout2.f29034M.add(c7272c);
        }
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            Intrinsics2.m13088d(fragmentActivityM16562f, "it");
            Context applicationContext = fragmentActivityM16562f.getApplicationContext();
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
            PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
            this.f33582g0 = playlistManagerM14331a;
            if (playlistManagerM14331a == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            this.f33584i0 = playlistManagerM14331a.m1274c() == PlaybackState.PLAYING;
            PlaylistManager playlistManager = this.f33582g0;
            if (playlistManager == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            MediaItem4 mediaItem4 = (MediaItem4) playlistManager.m1273b();
            this.f33585j0 = mediaItem4 != null ? (int) mediaItem4.f32262a.f32256a : 0;
            m14366d1();
        }
    }
}
