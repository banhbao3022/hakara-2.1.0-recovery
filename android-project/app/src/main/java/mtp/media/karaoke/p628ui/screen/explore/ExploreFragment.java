package mtp.media.karaoke.p628ui.screen.explore;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.MainApplication;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.Simple3;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import mtp.media.karaoke.p628ui.screen.user.UserActivity;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p190n.p430e.GsonBuilder;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreAdapter;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreViewModel;
import p555j.p556a.p557a.p558a.p559a.p562c.ExploreViewModel2;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p555j.p556a.p557a.p558a.p594d.UserEvent;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.ExploreFragmentBinding;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: ExploreFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreFragment extends BaseFragment3<ExploreFragmentBinding, ExploreViewModel> {

    /* JADX INFO: renamed from: d0 */
    public static final /* synthetic */ int f33548d0 = 0;

    /* JADX INFO: renamed from: e0 */
    public final int f33549e0 = R.layout.explore_fragment;

    /* JADX INFO: renamed from: f0 */
    public final Lazy3 f33550f0;

    /* JADX INFO: renamed from: g0 */
    public final Lazy3 f33551g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f33552h0;

    /* JADX INFO: renamed from: i0 */
    public ExploreAdapter f33553i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f33554j0;

    /* JADX INFO: renamed from: k0 */
    public int f33555k0;

    /* JADX INFO: renamed from: l0 */
    public HashMap f33556l0;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7259a extends Lambda implements InterfaceC6164l<User, Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33557g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33558h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7259a(int i, Object obj) {
            super(1);
            this.f33557g = i;
            this.f33558h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public final Unit mo3b(User user) {
            int i = this.f33557g;
            if (i == 0) {
                User user2 = user;
                Intrinsics2.m13089e(user2, "it");
                ExploreFragment exploreFragment = (ExploreFragment) this.f33558h;
                int i2 = ExploreFragment.f33548d0;
                Objects.requireNonNull(exploreFragment);
                ProfileActivity.C7312a c7312a = ProfileActivity.f33786u;
                Context contextM16528G0 = exploreFragment.m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                exploreFragment.m13976b1(c7312a.m14415a(contextM16528G0, user2.getId()));
                return Unit.f29502a;
            }
            if (i != 1) {
                throw null;
            }
            User user3 = user;
            Intrinsics2.m13089e(user3, "it");
            ExploreFragment exploreFragment2 = (ExploreFragment) this.f33558h;
            int i3 = ExploreFragment.f33548d0;
            Objects.requireNonNull(exploreFragment2);
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class)) != null) {
                user3.setFollowStatus(!user3.getFollowStatus());
                ((ProfileViewModel6) exploreFragment2.f33551g0.getValue()).m13921p(user3.getId(), user3.getFollowStatus() ? 1 : 2);
                EventBus3.m13810b().m13815g(new UserEvent(user3.getId(), user3.getFollowStatus(), user3.getFollowerCount()));
            } else {
                LoginFragment2 loginFragment2M13940a = LoginFragment2.f31647t0.m13940a(-1);
                FragmentActivity fragmentActivityM16526F0 = exploreFragment2.m16526F0();
                Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
                loginFragment2M13940a.mo5469c1(fragmentActivityM16526F0.m16577C(), "LoginForm");
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7260b extends Lambda implements InterfaceC6153a<ExploreViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33559g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33560h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33561i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7260b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33559g = viewModelStoreOwner;
            this.f33560h = qualifier;
            this.f33561i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.c.h] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ExploreViewModel mo2c() {
            return SkuDao.a.m14107t(this.f33559g, Reflection.m13097a(ExploreViewModel.class), this.f33560h, this.f33561i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$c */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7261c extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33562g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33563h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33564i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7261c(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33562g = viewModelStoreOwner;
            this.f33563h = qualifier;
            this.f33564i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33562g, Reflection.m13097a(ProfileViewModel6.class), this.f33563h, this.f33564i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$d */
    /* JADX INFO: compiled from: ExploreFragment.kt */
    public static final class C7262d extends Lambda implements InterfaceC6164l<Recording, Unit> {
        public C7262d() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Recording recording) {
            Recording recording2 = recording;
            Intrinsics2.m13089e(recording2, "it");
            ExploreFragment exploreFragment = ExploreFragment.this;
            int i = ExploreFragment.f33548d0;
            Objects.requireNonNull(exploreFragment);
            PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
            Context contextM16528G0 = exploreFragment.m16528G0();
            Intrinsics2.m13088d(contextM16528G0, "requireContext()");
            exploreFragment.m13976b1(PlayingActivity.C7291e.m14396b(c7291e, contextM16528G0, recording2.getId(), recording2.getThumbnail(), Integer.valueOf(recording2.getFormat()), Integer.valueOf(recording2.getVideoRatio()), null, 32));
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$e */
    /* JADX INFO: compiled from: ExploreFragment.kt */
    public static final class C7263e extends Lambda implements InterfaceC6164l<Simple3, Unit> {
        public C7263e() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public Unit mo3b(Simple3 simple3) {
            Simple3 simple4 = simple3;
            Intrinsics2.m13089e(simple4, "it");
            ExploreFragment exploreFragment = ExploreFragment.this;
            int i = ExploreFragment.f33548d0;
            Objects.requireNonNull(exploreFragment);
            if (simple4.getType() != 0) {
                ExploreRecordingActivity.C7268b c7268b = ExploreRecordingActivity.f33570y;
                Context contextM16528G0 = exploreFragment.m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                int type = simple4.getType();
                String name = simple4.getName();
                Objects.requireNonNull(c7268b);
                Intrinsics2.m13089e(contextM16528G0, "context");
                Intrinsics2.m13089e(name, CainMediaMetadataRetriever.METADATA_KEY_TITLE);
                Intent intent = new Intent(contextM16528G0, (Class<?>) ExploreRecordingActivity.class);
                intent.putExtra(CainMediaMetadataRetriever.METADATA_KEY_TITLE, name);
                intent.putExtra("sub_mode", type);
                exploreFragment.m13976b1(intent);
            } else {
                UserActivity.C7376c c7376c = UserActivity.f34007y;
                Context contextM16528G1 = exploreFragment.m16528G0();
                Intrinsics2.m13088d(contextM16528G1, "requireContext()");
                exploreFragment.m13976b1(c7376c.m14464a(contextM16528G1, 1, 0, null));
            }
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$f */
    /* JADX INFO: compiled from: ExploreFragment.kt */
    public static final class C7264f<T> implements Observer<ArrayList<Simple3>> {
        public C7264f() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(ArrayList<Simple3> arrayList) {
            ArrayList<Simple3> arrayList2 = arrayList;
            ExploreAdapter exploreAdapter = ExploreFragment.this.f33553i0;
            if (exploreAdapter != null) {
                exploreAdapter.m13977p(arrayList2);
            }
            ExploreAdapter exploreAdapter2 = ExploreFragment.this.f33553i0;
            if (exploreAdapter2 != null) {
                exploreAdapter2.f1023a.m673b();
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$g */
    /* JADX INFO: compiled from: ExploreFragment.kt */
    public static final class C7265g implements SwipeRefreshLayout.InterfaceC0190h {
        public C7265g() {
        }

        @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0190h
        /* JADX INFO: renamed from: a */
        public final void mo881a() {
            ExploreViewModel exploreViewModelMo13882Z0 = ExploreFragment.this.mo13882Z0();
            Objects.requireNonNull(exploreViewModelMo13882Z0);
            C5729a.m12428A(C8310a.m16440e(exploreViewModelMo13882Z0), null, 0, new ExploreViewModel2(exploreViewModelMo13882Z0, null), 3, null);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ExploreFragment.this.m14361c1(R.id.refresh_layout);
            Intrinsics2.m13088d(swipeRefreshLayout, "refresh_layout");
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.explore.ExploreFragment$h */
    /* JADX INFO: compiled from: ExploreFragment.kt */
    public static final class C7266h extends Lambda implements InterfaceC6153a<Unit> {
        public C7266h() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            ExploreFragment exploreFragment = ExploreFragment.this;
            if (exploreFragment.f33555k0 > 0) {
                PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
                Context contextM16528G0 = exploreFragment.m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                ExploreFragment.this.m13976b1(PlayingActivity.C7291e.m14396b(c7291e, contextM16528G0, ExploreFragment.this.f33555k0, null, null, null, null, 60));
            }
            return Unit.f29502a;
        }
    }

    public ExploreFragment() {
        Lazy4 lazy4 = Lazy4.NONE;
        this.f33550f0 = LazyJVM.m13020a(lazy4, new C7260b(this, null, null));
        this.f33551g0 = LazyJVM.m13020a(lazy4, new C7261c(this, null, null));
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f33556l0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f33549e0;
    }

    /* JADX INFO: renamed from: c1 */
    public View m14361c1(int i) {
        if (this.f33556l0 == null) {
            this.f33556l0 = new HashMap();
        }
        View view = (View) this.f33556l0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f33556l0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public ExploreViewModel mo13882Z0() {
        return (ExploreViewModel) this.f33550f0.getValue();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m14363e1() {
        Intrinsics2.m13089e("updateEq", "message");
        if (this.f33554j0) {
            if (this.f33552h0) {
                return;
            }
            this.f33552h0 = true;
            ((LottieAnimationView) m14361c1(R.id.f33394eq)).m12552i();
            return;
        }
        if (this.f33552h0) {
            this.f33552h0 = false;
            ((LottieAnimationView) m14361c1(R.id.f33394eq)).m12550g();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        RecyclerView recyclerView = (RecyclerView) m14361c1(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        HashMap map = this.f33556l0;
        if (map != null) {
            map.clear();
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
        AppBarLayout appBarLayout = (AppBarLayout) m14361c1(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        ExploreViewModel exploreViewModelMo13882Z0 = mo13882Z0();
        LifecycleOwner lifecycleOwnerM16548R = m16548R();
        Intrinsics2.m13088d(lifecycleOwnerM16548R, "viewLifecycleOwner");
        FragmentActivity fragmentActivityM16526F1 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F1, "requireActivity()");
        this.f33553i0 = new ExploreAdapter(exploreViewModelMo13882Z0, lifecycleOwnerM16548R, SkuDao.a.m14104q(fragmentActivityM16526F1), new C7259a(0, this), new C7262d(), new C7263e(), new C7259a(1, this));
        RecyclerView recyclerView = (RecyclerView) m14361c1(R.id.recycler_view);
        Intrinsics2.m13088d(recyclerView, "recycler_view");
        recyclerView.setAdapter(this.f33553i0);
        RecyclerView recyclerView2 = (RecyclerView) m14361c1(R.id.recycler_view);
        Intrinsics2.m13088d(recyclerView2, "recycler_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(m16528G0(), 1, false));
        ((RecyclerView) m14361c1(R.id.recycler_view)).setItemViewCacheSize(20);
        ExploreViewModel exploreViewModelMo13882Z1 = mo13882Z0();
        Objects.requireNonNull(exploreViewModelMo13882Z1);
        C5729a.m12428A(C8310a.m16440e(exploreViewModelMo13882Z1), null, 0, new ExploreViewModel2(exploreViewModelMo13882Z1, null), 3, null);
        mo13882Z0().f31118l.mo422e(m16548R(), new C7264f());
        ((SwipeRefreshLayout) m14361c1(R.id.refresh_layout)).setColorSchemeResources(R.color.header_color);
        ((SwipeRefreshLayout) m14361c1(R.id.refresh_layout)).setOnRefreshListener(new C7265g());
        LottieAnimationView lottieAnimationView = (LottieAnimationView) m14361c1(R.id.f33394eq);
        Intrinsics2.m13088d(lottieAnimationView, "eq");
        SkuDao.a.m14067S(lottieAnimationView, new C7266h());
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            Intrinsics2.m13088d(fragmentActivityM16562f, "it");
            Context applicationContext = fragmentActivityM16562f.getApplicationContext();
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
            PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
            this.f33554j0 = playlistManagerM14331a.m1274c() == PlaybackState.PLAYING;
            MediaItem4 mediaItem4 = (MediaItem4) playlistManagerM14331a.m1273b();
            this.f33555k0 = mediaItem4 != null ? (int) mediaItem4.f32262a.f32256a : 0;
            m14363e1();
        }
    }
}
