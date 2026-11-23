package mtp.media.karaoke.p628ui.screen.profile;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.MainApplication;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.gift.present.PresentActivity;
import mtp.media.karaoke.p628ui.screen.image.ImageActivity;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.screen.profile.edit.ProfileEditActivity;
import mtp.media.karaoke.p628ui.screen.profile.task.TaskActivity;
import mtp.media.karaoke.p628ui.screen.setting.SettingActivity;
import mtp.media.karaoke.p628ui.screen.user.UserActivity;
import mtp.media.karaoke.p628ui.screen.wallet.WalletActivity;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p056c.p057a.LottieProperty;
import p007c.p056c.p057a.SimpleColorFilter;
import p007c.p056c.p057a.p059b0.KeyPath;
import p007c.p056c.p057a.p067f0.LottieValueCallback;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p007c.p190n.p194b.p334e.p348i.BottomSheetDialog;
import p007c.p451o.p452a.C5729a;
import p007c.p451o.p452a.StfalconImageViewer;
import p007c.p451o.p452a.p461e.p463b.BuilderData;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p483s.CollectionsJVM;
import p477d1.p483s._Collections;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p530b.p531a.Subscribe;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileFragment2;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileFragment4;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileFragment5;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileFragment6;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileFragment7;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileFragment8;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileFragment9;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfilePagerAdapter;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p592b.BaseFragment3;
import p555j.p556a.p557a.p558a.p594d.RecordingEvent2;
import p555j.p556a.p557a.p558a.p594d.RecordingEvent3;
import p555j.p556a.p557a.p558a.p594d.UpdateProfileEvent;
import p555j.p556a.p557a.p558a.p594d.UserEvent;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.ProfileFragmentBinding;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: ProfileFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileFragment extends BaseFragment3<ProfileFragmentBinding, ProfileViewModel6> {

    /* JADX INFO: renamed from: d0 */
    public static final C7315c f33788d0 = new C7315c(null);

    /* JADX INFO: renamed from: g0 */
    public int f33791g0;

    /* JADX INFO: renamed from: h0 */
    public float f33792h0;

    /* JADX INFO: renamed from: j0 */
    public boolean f33794j0;

    /* JADX INFO: renamed from: k0 */
    public int f33795k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f33796l0;

    /* JADX INFO: renamed from: m0 */
    public InterfaceC7316d f33797m0;

    /* JADX INFO: renamed from: n0 */
    public ProfilePagerAdapter f33798n0;

    /* JADX INFO: renamed from: o0 */
    public boolean f33799o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f33800p0;

    /* JADX INFO: renamed from: q0 */
    public int f33801q0;

    /* JADX INFO: renamed from: r0 */
    public HashMap f33802r0;

    /* JADX INFO: renamed from: e0 */
    public final int f33789e0 = R.layout.profile_fragment;

    /* JADX INFO: renamed from: f0 */
    public final Lazy3 f33790f0 = LazyJVM.m13020a(Lazy4.NONE, new C7314b(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public int f33793i0 = 440;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileFragment$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    public static final class C7313a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33803g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33804h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7313a(int i, Object obj) {
            super(0);
            this.f33803g = i;
            this.f33804h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            switch (this.f33803g) {
                case 0:
                    WalletActivity.C7381b c7381b = WalletActivity.f34028w;
                    Context contextM16528G0 = ((ProfileFragment) this.f33804h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                    ((ProfileFragment) this.f33804h).m13976b1(c7381b.m14467a(contextM16528G0));
                    return Unit.f29502a;
                case 1:
                    PresentActivity.C7277b c7277b = PresentActivity.f33603y;
                    Context contextM16528G1 = ((ProfileFragment) this.f33804h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G1, "requireContext()");
                    int i = ((ProfileFragment) this.f33804h).f33795k0;
                    Objects.requireNonNull(c7277b);
                    Intrinsics2.m13089e(contextM16528G1, "context");
                    Intent intent = new Intent(contextM16528G1, (Class<?>) PresentActivity.class);
                    intent.putExtra("receiver_id", i);
                    ((ProfileFragment) this.f33804h).m13976b1(intent);
                    return Unit.f29502a;
                case 2:
                    TaskActivity.C7333b c7333b = TaskActivity.f33850w;
                    Context contextM16528G2 = ((ProfileFragment) this.f33804h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G2, "requireContext()");
                    Objects.requireNonNull(c7333b);
                    Intrinsics2.m13089e(contextM16528G2, "context");
                    ((ProfileFragment) this.f33804h).m13976b1(new Intent(contextM16528G2, (Class<?>) TaskActivity.class));
                    return Unit.f29502a;
                case 3:
                    SettingActivity.C7345c c7345c = SettingActivity.f33886w;
                    Context contextM16528G3 = ((ProfileFragment) this.f33804h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G3, "requireContext()");
                    Objects.requireNonNull(c7345c);
                    Intrinsics2.m13089e(contextM16528G3, "context");
                    ((ProfileFragment) this.f33804h).m13976b1(new Intent(contextM16528G3, (Class<?>) SettingActivity.class));
                    return Unit.f29502a;
                case 4:
                    ProfileFragment profileFragment = (ProfileFragment) this.f33804h;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) profileFragment.m14416c1(R.id.avatar);
                    Intrinsics2.m13088d(appCompatImageView, "avatar");
                    User userM421d = profileFragment.mo13882Z0().f31515m.m421d();
                    if (userM421d != null) {
                        StfalconImageViewer.a aVar = new StfalconImageViewer.a(profileFragment.m16528G0(), _Collections.m13050o(CollectionsJVM.m13036a(userM421d.getAvatar())), new ProfileFragment6(new ProfileFragment5(profileFragment)));
                        BuilderData<T> builderData = aVar.f27816b;
                        builderData.f27870b = 0;
                        builderData.f27875g = appCompatImageView;
                        builderData.f27872d = false;
                        aVar.m12472a();
                    }
                    return Unit.f29502a;
                case 5:
                    ProfileFragment profileFragment2 = (ProfileFragment) this.f33804h;
                    if (profileFragment2.f33801q0 > 0) {
                        PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
                        Context contextM16528G4 = profileFragment2.m16528G0();
                        Intrinsics2.m13088d(contextM16528G4, "requireContext()");
                        ((ProfileFragment) this.f33804h).m13976b1(PlayingActivity.C7291e.m14396b(c7291e, contextM16528G4, ((ProfileFragment) this.f33804h).f33801q0, null, null, null, null, 60));
                    }
                    return Unit.f29502a;
                case 6:
                    ProfileFragment profileFragment3 = (ProfileFragment) this.f33804h;
                    if (profileFragment3.f33794j0) {
                        User userM421d2 = profileFragment3.mo13882Z0().f31515m.m421d();
                        if (userM421d2 != null) {
                            userM421d2.setFollowStatus(!userM421d2.getFollowStatus());
                            ((ProfileFragment) this.f33804h).mo13882Z0().m13921p(userM421d2.getId(), userM421d2.getFollowStatus() ? 1 : 2);
                            ViewBinding viewbinding = ((ProfileFragment) this.f33804h).f32018c0;
                            if (viewbinding == 0) {
                                Intrinsics2.m13096l("viewBinding");
                                throw null;
                            }
                            ((ProfileFragmentBinding) viewbinding).mo398f();
                            EventBus3.m13810b().m13815g(new UserEvent(userM421d2.getId(), userM421d2.getFollowStatus(), userM421d2.getFollowerCount()));
                        }
                    } else {
                        ProfileEditActivity.C7326c c7326c = ProfileEditActivity.f33825w;
                        Context contextM16528G5 = profileFragment3.m16528G0();
                        Intrinsics2.m13088d(contextM16528G5, "requireContext()");
                        Objects.requireNonNull(c7326c);
                        Intrinsics2.m13089e(contextM16528G5, "context");
                        ((ProfileFragment) this.f33804h).m13976b1(new Intent(contextM16528G5, (Class<?>) ProfileEditActivity.class));
                    }
                    return Unit.f29502a;
                case 7:
                    ProfileFragment profileFragment4 = (ProfileFragment) this.f33804h;
                    if (profileFragment4.f33794j0) {
                        InterfaceC7316d interfaceC7316d = profileFragment4.f33797m0;
                        if (interfaceC7316d != null) {
                            interfaceC7316d.mo14329a();
                        }
                    } else {
                        UserActivity.C7376c c7376c = UserActivity.f34007y;
                        Context contextM16528G6 = profileFragment4.m16528G0();
                        Intrinsics2.m13088d(contextM16528G6, "requireContext()");
                        ((ProfileFragment) this.f33804h).m13976b1(c7376c.m14464a(contextM16528G6, 1, 0, null));
                    }
                    return Unit.f29502a;
                case 8:
                    UserActivity.C7376c c7376c2 = UserActivity.f34007y;
                    Context contextM16528G7 = ((ProfileFragment) this.f33804h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G7, "requireContext()");
                    ProfileFragment profileFragment5 = (ProfileFragment) this.f33804h;
                    ((ProfileFragment) this.f33804h).m13976b1(c7376c2.m14464a(contextM16528G7, 3, profileFragment5.f33795k0, profileFragment5.m16546Q(R.string.txt_followers)));
                    return Unit.f29502a;
                case 9:
                    UserActivity.C7376c c7376c3 = UserActivity.f34007y;
                    Context contextM16528G8 = ((ProfileFragment) this.f33804h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G8, "requireContext()");
                    ProfileFragment profileFragment6 = (ProfileFragment) this.f33804h;
                    ((ProfileFragment) this.f33804h).m13976b1(c7376c3.m14464a(contextM16528G8, 2, profileFragment6.f33795k0, profileFragment6.m16546Q(R.string.txt_following)));
                    return Unit.f29502a;
                case 10:
                    ImageActivity.C7282d c7282d = ImageActivity.f33613y;
                    Context contextM16528G9 = ((ProfileFragment) this.f33804h).m16528G0();
                    Intrinsics2.m13088d(contextM16528G9, "requireContext()");
                    ((ProfileFragment) this.f33804h).m13976b1(ImageActivity.C7282d.m14371a(c7282d, contextM16528G9, false, false, 6));
                    return Unit.f29502a;
                default:
                    throw null;
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileFragment$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7314b extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33805g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33806h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33807i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7314b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33805g = viewModelStoreOwner;
            this.f33806h = qualifier;
            this.f33807i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33805g, Reflection.m13097a(ProfileViewModel6.class), this.f33806h, this.f33807i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileFragment$c */
    /* JADX INFO: compiled from: ProfileFragment.kt */
    public static final class C7315c {
        public C7315c() {
        }

        public C7315c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileFragment$d */
    /* JADX INFO: compiled from: ProfileFragment.kt */
    public interface InterfaceC7316d {
        /* JADX INFO: renamed from: a */
        void mo14329a();
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileFragment$e */
    /* JADX INFO: compiled from: ProfileFragment.kt */
    public static final class C7317e extends Lambda implements InterfaceC6153a<Unit> {
        public C7317e() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            View viewInflate = ProfileFragment.this.m16524E().inflate(R.layout.bottom_sheet_block_menu, (ViewGroup) null);
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(ProfileFragment.this.m16528G0());
            LinearLayout linearLayout = (LinearLayout) outline.m1579b0(bottomSheetDialog, viewInflate, viewInflate, "viewSheet", R.id.menuReport);
            Intrinsics2.m13088d(linearLayout, "viewSheet.menuReport");
            SkuDao.a.m14067S(linearLayout, new ProfileFragment2(this, bottomSheetDialog));
            LinearLayout linearLayout2 = (LinearLayout) viewInflate.findViewById(R.id.menuBlock);
            Intrinsics2.m13088d(linearLayout2, "viewSheet.menuBlock");
            SkuDao.a.m14067S(linearLayout2, new ProfileFragment4(this, bottomSheetDialog));
            return Unit.f29502a;
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileFragment$f */
    /* JADX INFO: compiled from: ProfileFragment.kt */
    public static final class C7318f<T> implements Observer<User> {
        public C7318f() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(User user) {
            ProfileFragment profileFragment = ProfileFragment.this;
            if (profileFragment.f33796l0) {
                return;
            }
            profileFragment.f33796l0 = true;
            int i = profileFragment.f33795k0 <= 0 ? 4 : 3;
            FragmentActivity fragmentActivityM16526F0 = profileFragment.m16526F0();
            Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
            profileFragment.f33798n0 = new ProfilePagerAdapter(fragmentActivityM16526F0, profileFragment.f33795k0, i);
            ViewPager2 viewPager2 = (ViewPager2) profileFragment.m14416c1(R.id.pages);
            Intrinsics2.m13088d(viewPager2, "pages");
            ProfilePagerAdapter profilePagerAdapter = profileFragment.f33798n0;
            if (profilePagerAdapter == null) {
                Intrinsics2.m13096l("adapterPager");
                throw null;
            }
            viewPager2.setAdapter(profilePagerAdapter);
            new TabLayoutMediator((TabLayout) profileFragment.m14416c1(R.id.tabs), (ViewPager2) profileFragment.m14416c1(R.id.pages), new ProfileFragment9(profileFragment)).m11024a();
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileFragment$g */
    /* JADX INFO: compiled from: ProfileFragment.kt */
    public static final class C7319g implements AppBarLayout.InterfaceC5907d {

        /* JADX INFO: renamed from: a */
        public int f33810a = R.attr.account_toolbar_icon_tint_uncollapsed;

        public C7319g() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC5905b
        /* JADX INFO: renamed from: a */
        public void mo12696a(AppBarLayout appBarLayout, int i) {
            Intrinsics2.m13089e(appBarLayout, "appBarLayout");
            ProfileFragment profileFragment = ProfileFragment.this;
            int i2 = profileFragment.f33791g0 + i < 0 ? R.attr.account_toolbar_icon_tint_collapsed : R.attr.account_toolbar_icon_tint_uncollapsed;
            if (i2 != this.f33810a) {
                this.f33810a = i2;
            }
            float fAbs = Math.abs(i);
            ProfileFragment profileFragment2 = ProfileFragment.this;
            int i3 = profileFragment2.f33791g0;
            float f = fAbs / i3;
            if (f > 1.0f) {
                f = 1.0f;
            }
            profileFragment.f33792h0 = f;
            profileFragment2.f33793i0 = i3 + i;
            profileFragment2.m14419f1();
            Object objEvaluate = new ArgbEvaluator().evaluate(ProfileFragment.this.f33792h0, 0, Integer.valueOf(ContextCompat.m16134b(ProfileFragment.this.m16526F0(), R.color.white)));
            Objects.requireNonNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) objEvaluate).intValue();
            Object objEvaluate2 = new ArgbEvaluator().evaluate(ProfileFragment.this.f33792h0, 0, Integer.valueOf(ContextCompat.m16134b(ProfileFragment.this.m16526F0(), R.color.title_color)));
            Objects.requireNonNull(objEvaluate2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) objEvaluate2).intValue();
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            ProfileFragment profileFragment3 = ProfileFragment.this;
            Object objEvaluate3 = argbEvaluator.evaluate(profileFragment3.f33792h0, Integer.valueOf(ContextCompat.m16134b(profileFragment3.m16526F0(), R.color.white_light)), Integer.valueOf(ContextCompat.m16134b(ProfileFragment.this.m16526F0(), R.color.title_color)));
            Objects.requireNonNull(objEvaluate3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue3 = ((Integer) objEvaluate3).intValue();
            Object objEvaluate4 = new ArgbEvaluator().evaluate(ProfileFragment.this.f33792h0, 0, Integer.valueOf(ContextCompat.m16134b(ProfileFragment.this.m16526F0(), R.color.line)));
            Objects.requireNonNull(objEvaluate4, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue4 = ((Integer) objEvaluate4).intValue();
            ((Toolbar) ProfileFragment.this.m14416c1(R.id.profileToolbar)).setBackgroundColor(iIntValue);
            ((TextView) ProfileFragment.this.m14416c1(R.id.toolbarTitle)).setTextColor(iIntValue2);
            ProfileFragment.this.m14416c1(R.id.toolbarLine).setBackgroundColor(iIntValue4);
            ((ImageView) ProfileFragment.this.m14416c1(R.id.btnBackOrAddFriend)).setColorFilter(iIntValue3);
            ((ImageView) ProfileFragment.this.m14416c1(R.id.btnSetting)).setColorFilter(iIntValue3);
            ((ImageView) ProfileFragment.this.m14416c1(R.id.btnMore)).setColorFilter(iIntValue3);
            ((LottieAnimationView) ProfileFragment.this.m14416c1(R.id.f33394eq)).f28104n.m1462a(new KeyPath("**"), LottieProperty.f2451C, new LottieValueCallback(new SimpleColorFilter(iIntValue3)));
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ProfileFragment.this.m14416c1(R.id.swipeToRefreshLayout);
            Intrinsics2.m13088d(swipeRefreshLayout, "swipeToRefreshLayout");
            swipeRefreshLayout.setEnabled(i == 0);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: P0 */
    public void mo13901P0(boolean z) {
        if (this.f38413J != z) {
            this.f38413J = z;
        }
        Intrinsics2.m13089e("setMenuVisibility " + z, "message");
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f33802r0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f33789e0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: Z */
    public void mo463Z(Context context) {
        Intrinsics2.m13089e(context, "context");
        super.mo463Z(context);
        if (context instanceof InterfaceC7316d) {
            this.f33797m0 = (InterfaceC7316d) context;
            return;
        }
        throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f33794j0 = bundle2.getBoolean("viewer");
            this.f33795k0 = bundle2.getInt("user_view_id");
        }
    }

    /* JADX INFO: renamed from: c1 */
    public View m14416c1(int i) {
        if (this.f33802r0 == null) {
            this.f33802r0 = new HashMap();
        }
        View view = (View) this.f33802r0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f33802r0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
    public ProfileViewModel6 mo13882Z0() {
        return (ProfileViewModel6) this.f33790f0.getValue();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m14418e1() {
        m14419f1();
        this.f33791g0 = m16539M().getDimensionPixelSize(R.dimen.dp_220);
        ((AppBarLayout) m14416c1(R.id.profileAppBarLayout)).m12678a(new C7319g());
    }

    /* JADX INFO: renamed from: f1 */
    public final void m14419f1() {
        Window window;
        if (this.f33793i0 >= 110) {
            FragmentActivity fragmentActivityM16562f = m16562f();
            if (fragmentActivityM16562f != null) {
                SkuDao.a.m14056H(fragmentActivityM16562f, true, false, 2);
            }
        } else {
            FragmentActivity fragmentActivityM16562f2 = m16562f();
            if (fragmentActivityM16562f2 != null) {
                SkuDao.a.m14056H(fragmentActivityM16562f2, false, false, 3);
            }
        }
        FragmentActivity fragmentActivityM16562f3 = m16562f();
        if (fragmentActivityM16562f3 == null || (window = fragmentActivityM16562f3.getWindow()) == null) {
            return;
        }
        Object objEvaluate = new ArgbEvaluator().evaluate(this.f33792h0, 0, Integer.valueOf(ContextCompat.m16134b(m16526F0(), R.color.white)));
        Objects.requireNonNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
        window.setStatusBarColor(((Integer) objEvaluate).intValue());
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo1956g0() {
        EventBus3.m13810b().m13821m(this);
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m14420g1() {
        if (this.f33800p0) {
            if (this.f33799o0) {
                return;
            }
            this.f33799o0 = true;
            ((LottieAnimationView) m14416c1(R.id.f33394eq)).m12552i();
            return;
        }
        if (this.f33799o0) {
            this.f33799o0 = false;
            ((LottieAnimationView) m14416c1(R.id.f33394eq)).m12550g();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public void mo467h0() {
        super.mo467h0();
        HashMap map = this.f33802r0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: i0 */
    public void mo1957i0() {
        this.f38414K = true;
        this.f33797m0 = null;
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: o0 */
    public void mo2074o0() {
        this.f38414K = true;
        Intrinsics2.m13089e("onPause", "message");
    }

    @Subscribe
    public final void onPostRecordingEvent(RecordingEvent2 recordingEvent2) {
        Intrinsics2.m13089e(recordingEvent2, "event");
        if (recordingEvent2.f32055a) {
            ProfilePagerAdapter profilePagerAdapter = this.f33798n0;
            if (profilePagerAdapter != null) {
                profilePagerAdapter.m13917x();
            } else {
                Intrinsics2.m13096l("adapterPager");
                throw null;
            }
        }
    }

    @Subscribe
    public final void onSaveDaftEvent(RecordingEvent3 recordingEvent3) {
        Intrinsics2.m13089e(recordingEvent3, "event");
        ProfilePagerAdapter profilePagerAdapter = this.f33798n0;
        if (profilePagerAdapter != null) {
            profilePagerAdapter.m13917x();
        } else {
            Intrinsics2.m13096l("adapterPager");
            throw null;
        }
    }

    @Subscribe
    public final void onUpdateUserEvent(UpdateProfileEvent updateProfileEvent) {
        Intrinsics2.m13089e(updateProfileEvent, "event");
        if (updateProfileEvent.f32056a) {
            mo13882Z0().m13922q();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: s0 */
    public void mo2076s0() {
        this.f38414K = true;
        Intrinsics2.m13089e("onResume", "message");
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: u0 */
    public void mo1958u0() {
        this.f38414K = true;
        if (EventBus3.m13810b().m13814f(this)) {
            return;
        }
        EventBus3.m13810b().m13819k(this);
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
        Toolbar toolbar = (Toolbar) m14416c1(R.id.profileToolbar);
        Intrinsics2.m13088d(toolbar, "profileToolbar");
        SkuDao.a.m14066R(toolbar, iM14105r);
        TextView textView = (TextView) m14416c1(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        textView.setSelected(true);
        m14418e1();
        if (!this.f33794j0 && mo13882Z0().f31515m.m421d() == null) {
            MutableLiveData<User> mutableLiveData = mo13882Z0().f31515m;
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            mutableLiveData.mo427j((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class));
        }
        if (this.f33794j0) {
            mo13882Z0().f31514l.mo427j(Boolean.TRUE);
            ProfileViewModel6 profileViewModel6Mo13882Z0 = mo13882Z0();
            int i = this.f33795k0;
            Objects.requireNonNull(profileViewModel6Mo13882Z0);
            C5729a.m12428A(C8310a.m16440e(profileViewModel6Mo13882Z0), null, 0, new ProfileViewModel(profileViewModel6Mo13882Z0, i, null), 3, null);
            m14418e1();
            ConstraintLayout constraintLayout = (ConstraintLayout) m14416c1(R.id.actionIconLayout);
            Intrinsics2.m13088d(constraintLayout, "actionIconLayout");
            SkuDao.a.m14061M(constraintLayout);
            ImageView imageView = (ImageView) m14416c1(R.id.btnSetting);
            Intrinsics2.m13088d(imageView, "btnSetting");
            SkuDao.a.m14061M(imageView);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) m14416c1(R.id.f33394eq);
            Intrinsics2.m13088d(lottieAnimationView, "eq");
            SkuDao.a.m14061M(lottieAnimationView);
            ImageView imageView2 = (ImageView) m14416c1(R.id.btnMore);
            Intrinsics2.m13088d(imageView2, "btnMore");
            SkuDao.a.m14067S(imageView2, new C7317e());
        } else {
            mo13882Z0().f31514l.mo427j(Boolean.FALSE);
            mo13882Z0().m13922q();
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) m14416c1(R.id.f33394eq);
            Intrinsics2.m13088d(lottieAnimationView2, "eq");
            SkuDao.a.m14067S(lottieAnimationView2, new C7313a(5, this));
            FragmentActivity fragmentActivityM16562f = m16562f();
            if (fragmentActivityM16562f != null) {
                Intrinsics2.m13088d(fragmentActivityM16562f, "it");
                Context applicationContext = fragmentActivityM16562f.getApplicationContext();
                Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
                PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
                this.f33800p0 = playlistManagerM14331a.m1274c() == PlaybackState.PLAYING;
                MediaItem4 mediaItem4 = (MediaItem4) playlistManagerM14331a.m1273b();
                this.f33801q0 = mediaItem4 != null ? (int) mediaItem4.f32262a.f32256a : 0;
                m14420g1();
            }
            ImageView imageView3 = (ImageView) m14416c1(R.id.btnMore);
            Intrinsics2.m13088d(imageView3, "btnMore");
            SkuDao.a.m14061M(imageView3);
        }
        mo13882Z0().f31515m.mo422e(m16548R(), new C7318f());
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) m14416c1(R.id.swipeToRefreshLayout);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setColorSchemeResources(R.color.header_color);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) m14416c1(R.id.swipeToRefreshLayout);
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setOnRefreshListener(new ProfileFragment7(this));
        }
        mo13882Z0().f31520r.mo422e(m16548R(), new ProfileFragment8(this));
        TextView textView2 = (TextView) m14416c1(R.id.btnEditOrFollow);
        Intrinsics2.m13088d(textView2, "btnEditOrFollow");
        SkuDao.a.m14067S(textView2, new C7313a(6, this));
        ImageView imageView4 = (ImageView) m14416c1(R.id.btnBackOrAddFriend);
        Intrinsics2.m13088d(imageView4, "btnBackOrAddFriend");
        SkuDao.a.m14067S(imageView4, new C7313a(7, this));
        LinearLayout linearLayout = (LinearLayout) m14416c1(R.id.btnViewFollower);
        Intrinsics2.m13088d(linearLayout, "btnViewFollower");
        SkuDao.a.m14067S(linearLayout, new C7313a(8, this));
        LinearLayout linearLayout2 = (LinearLayout) m14416c1(R.id.btnViewFollowing);
        Intrinsics2.m13088d(linearLayout2, "btnViewFollowing");
        SkuDao.a.m14067S(linearLayout2, new C7313a(9, this));
        LinearLayout linearLayout3 = (LinearLayout) m14416c1(R.id.btnViewImage);
        Intrinsics2.m13088d(linearLayout3, "btnViewImage");
        SkuDao.a.m14067S(linearLayout3, new C7313a(10, this));
        LinearLayout linearLayout4 = (LinearLayout) m14416c1(R.id.btnWallet);
        Intrinsics2.m13088d(linearLayout4, "btnWallet");
        SkuDao.a.m14067S(linearLayout4, new C7313a(0, this));
        LinearLayout linearLayout5 = (LinearLayout) m14416c1(R.id.btnViewGifts);
        Intrinsics2.m13088d(linearLayout5, "btnViewGifts");
        SkuDao.a.m14067S(linearLayout5, new C7313a(1, this));
        LinearLayout linearLayout6 = (LinearLayout) m14416c1(R.id.btnTask);
        Intrinsics2.m13088d(linearLayout6, "btnTask");
        SkuDao.a.m14067S(linearLayout6, new C7313a(2, this));
        ImageView imageView5 = (ImageView) m14416c1(R.id.btnSetting);
        Intrinsics2.m13088d(imageView5, "btnSetting");
        SkuDao.a.m14067S(imageView5, new C7313a(3, this));
        AppCompatImageView appCompatImageView = (AppCompatImageView) m14416c1(R.id.avatar);
        Intrinsics2.m13088d(appCompatImageView, "avatar");
        SkuDao.a.m14067S(appCompatImageView, new C7313a(4, this));
    }
}
