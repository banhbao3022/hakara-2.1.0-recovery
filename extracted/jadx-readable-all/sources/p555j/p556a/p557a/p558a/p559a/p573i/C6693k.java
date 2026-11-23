package p555j.p556a.p557a.p558a.p559a.p573i;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Recording;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.playing.PlayingActivity;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C6456h0;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingAdapter;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p558a.p593c.RefreshableFragment;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.ProfileRecordingFragmentBinding;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.i.k */
/* JADX INFO: compiled from: ProfileRecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6693k extends BaseLoadMoreRefreshFragment<ProfileRecordingFragmentBinding, RecordingViewModel2, Recording> implements RefreshableFragment {

    /* JADX INFO: renamed from: f0 */
    public static final b f31460f0 = new b(null);

    /* JADX INFO: renamed from: j0 */
    public float f31464j0;

    /* JADX INFO: renamed from: k0 */
    public float f31465k0;

    /* JADX INFO: renamed from: m0 */
    public HashMap f31467m0;

    /* JADX INFO: renamed from: g0 */
    public final int f31461g0 = R.layout.profile_recording_fragment;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31462h0 = LazyJVM.m13020a(Lazy4.NONE, new a(this, null, null));

    /* JADX INFO: renamed from: i0 */
    public final int f31463i0 = 10;

    /* JADX INFO: renamed from: l0 */
    public final Lazy3 f31466l0 = LazyJVM.m13021b(new c());

    /* JADX INFO: renamed from: j.a.a.a.a.i.k$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<RecordingViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31468g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31469h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31470i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31468g = viewModelStoreOwner;
            this.f31469h = qualifier;
            this.f31470i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.e.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f31468g, Reflection.m13097a(RecordingViewModel2.class), this.f31469h, this.f31470i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.k$b */
    /* JADX INFO: compiled from: ProfileRecordingFragment.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.k$c */
    /* JADX INFO: compiled from: ProfileRecordingFragment.kt */
    public static final class c extends Lambda implements InterfaceC6153a<RecordingAdapter> {
        public c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingAdapter mo2c() {
            return new RecordingAdapter(new C6456h0(0, this), new C6456h0(1, this), new C6456h0(2, this), new C6456h0(3, this), new C6456h0(4, this), new C6456h0(5, this), null, new C6456h0(7, this), new C6456h0(6, this), 64, null);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.i.k$d */
    /* JADX INFO: compiled from: ProfileRecordingFragment.kt */
    public static final class d implements RecyclerView.InterfaceC0164q {
        public d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
        /* JADX INFO: renamed from: a */
        public void mo778a(RecyclerView recyclerView, MotionEvent motionEvent) {
            Intrinsics2.m13089e(recyclerView, "p0");
            Intrinsics2.m13089e(motionEvent, "p1");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
        /* JADX INFO: renamed from: b */
        public boolean mo779b(RecyclerView recyclerView, MotionEvent motionEvent) {
            Intrinsics2.m13089e(recyclerView, "rv");
            Intrinsics2.m13089e(motionEvent, "e");
            int action = motionEvent.getAction();
            if (action == 0) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (action == 2) {
                if (Math.abs(motionEvent.getX() - C6693k.this.f31464j0) > Math.abs(motionEvent.getY() - C6693k.this.f31465k0)) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                } else if (Math.abs(motionEvent.getY() - C6693k.this.f31465k0) > C6693k.this.f31463i0) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            C6693k.this.f31464j0 = motionEvent.getX();
            C6693k.this.f31465k0 = motionEvent.getY();
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
        /* JADX INFO: renamed from: c */
        public void mo780c(boolean z) {
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31467m0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: Y0 */
    public int mo13881Y0() {
        return this.f31461g0;
    }

    @Override // p555j.p556a.p557a.p558a.p593c.RefreshableFragment
    /* JADX INFO: renamed from: c */
    public void mo13910c() {
        Intrinsics2.m13089e("ProfileRecordingFragment: refreshContent", "message");
        ArrayList arrayList = (ArrayList) mo13882Z0().f32034q.m421d();
        if (arrayList != null) {
            arrayList.clear();
        }
        mo13892e1().m13977p(null);
        mo13882Z0().m13984q();
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            mo13882Z0().f31254u.mo427j(Integer.valueOf(bundle2.getInt("kind")));
            int i = bundle2.getInt("user_id");
            if (i > 0) {
                mo13882Z0().f31252s.mo427j(Integer.valueOf(i));
                BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13892e1 = mo13892e1();
                Objects.requireNonNull(baseListAdapterMo13892e1, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingAdapter");
                ((RecordingAdapter) baseListAdapterMo13892e1).f31180g = true;
            } else {
                BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13892e2 = mo13892e1();
                Objects.requireNonNull(baseListAdapterMo13892e2, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingAdapter");
                ((RecordingAdapter) baseListAdapterMo13892e2).f31180g = false;
                BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13892e3 = mo13892e1();
                Objects.requireNonNull(baseListAdapterMo13892e3, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingAdapter");
                ((RecordingAdapter) baseListAdapterMo13892e3).f31181h = true;
            }
            BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13892e4 = mo13892e1();
            Objects.requireNonNull(baseListAdapterMo13892e4, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingAdapter");
            ((RecordingAdapter) baseListAdapterMo13892e4).f31181h = false;
        }
        BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13892e5 = mo13892e1();
        Objects.requireNonNull(baseListAdapterMo13892e5, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingAdapter");
        ((RecordingAdapter) baseListAdapterMo13892e5).f31179f = true;
        BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13892e6 = mo13892e1();
        Objects.requireNonNull(baseListAdapterMo13892e6, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingAdapter");
        RecordingAdapter recordingAdapter = (RecordingAdapter) baseListAdapterMo13892e6;
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        recordingAdapter.f31182i = user != null ? Integer.valueOf(user.getId()) : null;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: c1 */
    public View mo13891c1(int i) {
        if (this.f31467m0 == null) {
            this.f31467m0 = new HashMap();
        }
        View view = (View) this.f31467m0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31467m0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Recording, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31466l0.getValue();
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
            backgroundMessageView2.m14471b(R.drawable.ic_no_song, R.string.message_recording_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public RecordingViewModel2 mo13882Z0() {
        return (RecordingViewModel2) this.f31462h0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m13919h1(Recording recording) {
        PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
        Context contextM16528G0 = m16528G0();
        Intrinsics2.m13088d(contextM16528G0, "requireContext()");
        Intent intentM14397a = c7291e.m14397a(contextM16528G0, recording.getId(), recording.getThumbnail(), Integer.valueOf(recording.getFormat()), Integer.valueOf(recording.getVideoRatio()), SkuDao.a.m14052D(recording, (ArrayList) mo13882Z0().f32034q.m421d()));
        intentM14397a.setFlags(67108864);
        m13976b1(intentM14397a);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo13891c1(R.id.recycler_view);
        recyclerView.f918B.add(new d());
    }
}
