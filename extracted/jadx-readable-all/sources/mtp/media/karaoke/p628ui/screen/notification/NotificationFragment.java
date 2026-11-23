package mtp.media.karaoke.p628ui.screen.notification;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.MainApplication;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C7154j0;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p572h.NotificationAdapter;
import p555j.p556a.p557a.p558a.p559a.p572h.NotificationViewModel2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.NotificationFragmentBinding;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: NotificationFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class NotificationFragment extends BaseLoadMoreRefreshFragment<NotificationFragmentBinding, NotificationViewModel2, Notification> {

    /* JADX INFO: renamed from: f0 */
    public static final /* synthetic */ int f33631f0 = 0;

    /* JADX INFO: renamed from: i0 */
    public boolean f33634i0;

    /* JADX INFO: renamed from: j0 */
    public boolean f33635j0;

    /* JADX INFO: renamed from: k0 */
    public int f33636k0;

    /* JADX INFO: renamed from: m0 */
    public HashMap f33638m0;

    /* JADX INFO: renamed from: g0 */
    public final int f33632g0 = R.layout.notification_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f33633h0 = LazyJVM.m13020a(Lazy4.NONE, new C7284a(this, null, null));

    /* JADX INFO: renamed from: l0 */
    public final Lazy3 f33637l0 = LazyJVM.m13021b(new C7285b());

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.notification.NotificationFragment$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7284a extends Lambda implements InterfaceC6153a<NotificationViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33639g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33640h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33641i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7284a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33639g = viewModelStoreOwner;
            this.f33640h = qualifier;
            this.f33641i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.h.d] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public NotificationViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f33639g, Reflection.m13097a(NotificationViewModel2.class), this.f33640h, this.f33641i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.notification.NotificationFragment$b */
    /* JADX INFO: compiled from: NotificationFragment.kt */
    public static final class C7285b extends Lambda implements InterfaceC6153a<NotificationAdapter> {
        public C7285b() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public NotificationAdapter mo2c() {
            return new NotificationAdapter(new C7154j0(0, this), new C7154j0(1, this));
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.notification.NotificationFragment$c */
    /* JADX INFO: compiled from: NotificationFragment.kt */
    public static final class C7286c extends Lambda implements InterfaceC6153a<Unit> {
        public C7286c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            NotificationFragment notificationFragment = NotificationFragment.this;
            if (notificationFragment.f33636k0 > 0) {
                PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
                Context contextM16528G0 = notificationFragment.m16528G0();
                Intrinsics2.m13088d(contextM16528G0, "requireContext()");
                NotificationFragment.this.m13976b1(PlayingActivity.C7291e.m14396b(c7291e, contextM16528G0, NotificationFragment.this.f33636k0, null, null, null, null, 60));
            }
            return Unit.f29502a;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f33638m0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f33632g0;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f33638m0 == null) {
            this.f33638m0 = new HashMap();
        }
        View view = (View) this.f33638m0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f33638m0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Notification, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f33637l0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: f1 */
    public void mo13897f1() {
        BackgroundMessageView backgroundMessageView = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView != null) {
            SkuDao.a.m14068T(backgroundMessageView);
        }
        BackgroundMessageView backgroundMessageView2 = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView2 != null) {
            backgroundMessageView2.m14471b(R.drawable.ic_no_notification, R.string.message_notification_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public NotificationViewModel2 mo13882Z0() {
        return (NotificationViewModel2) this.f33633h0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m14373h1() {
        if (this.f33635j0) {
            if (this.f33634i0) {
                return;
            }
            this.f33634i0 = true;
            ((LottieAnimationView) mo13891c1(R.id.f33394eq)).m12552i();
            return;
        }
        if (this.f33634i0) {
            this.f33634i0 = false;
            ((LottieAnimationView) mo13891c1(R.id.f33394eq)).m12550g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        FragmentActivity fragmentActivityM16526F0 = m16526F0();
        Intrinsics2.m13088d(fragmentActivityM16526F0, "requireActivity()");
        int iM14105r = SkuDao.a.m14105r(fragmentActivityM16526F0);
        AppBarLayout appBarLayout = (AppBarLayout) mo13891c1(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        NotificationViewModel2 notificationViewModel2Mo13882Z0 = mo13882Z0();
        notificationViewModel2Mo13882Z0.f31367s.mo427j(Boolean.TRUE);
        notificationViewModel2Mo13882Z0.m13985r();
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            BaseListAdapter<Notification, ? extends ViewDataBinding> baseListAdapterMo13892e1 = mo13892e1();
            Objects.requireNonNull(baseListAdapterMo13892e1, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.notification.NotificationAdapter");
            ((NotificationAdapter) baseListAdapterMo13892e1).f31355f = ContextCompat.m16134b(fragmentActivityM16562f, R.color.white);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13891c1(R.id.f33394eq);
        Intrinsics2.m13088d(lottieAnimationView, "eq");
        SkuDao.a.m14067S(lottieAnimationView, new C7286c());
        FragmentActivity fragmentActivityM16562f2 = m16562f();
        if (fragmentActivityM16562f2 != null) {
            Intrinsics2.m13088d(fragmentActivityM16562f2, "it");
            Context applicationContext = fragmentActivityM16562f2.getApplicationContext();
            Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
            PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
            this.f33635j0 = playlistManagerM14331a.m1274c() == PlaybackState.PLAYING;
            MediaItem4 mediaItem4 = (MediaItem4) playlistManagerM14331a.m1273b();
            this.f33636k0 = mediaItem4 != null ? (int) mediaItem4.f32262a.f32256a : 0;
            m14373h1();
        }
    }
}
