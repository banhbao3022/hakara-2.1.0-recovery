package p555j.p556a.p557a.p558a.p559a.p567e;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import android.location.LocationManager;
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
import p000.C7402u;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p530b.p531a.EventBus3;
import p526i1.p530b.p531a.Subscribe;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment;
import p555j.p556a.p557a.p558a.p594d.RecordingEvent;
import p555j.p556a.p557a.p558a.p594d.UserEvent;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.p753c.FragmentActivity;
import p636z0.p759s.Observer;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: renamed from: j.a.a.a.a.e.c, reason: use source file name */
/* JADX INFO: compiled from: RecordingFragment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class RecordingFragment extends BaseLoadMoreRefreshFragment<FragmentLoadmoreRefreshBinding, RecordingViewModel2, Recording> {

    /* JADX INFO: renamed from: f0 */
    public static final c f31226f0 = new c(null);

    /* JADX INFO: renamed from: g0 */
    public final Lazy3 f31227g0;

    /* JADX INFO: renamed from: h0 */
    public final Lazy3 f31228h0;

    /* JADX INFO: renamed from: i0 */
    public boolean f31229i0;

    /* JADX INFO: renamed from: j0 */
    public final int f31230j0;

    /* JADX INFO: renamed from: k0 */
    public float f31231k0;

    /* JADX INFO: renamed from: l0 */
    public float f31232l0;

    /* JADX INFO: renamed from: m0 */
    public final Lazy3 f31233m0;

    /* JADX INFO: renamed from: n0 */
    public Integer f31234n0;

    /* JADX INFO: renamed from: o0 */
    public LocationManager f31235o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f31236p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f31237q0;

    /* JADX INFO: renamed from: j.a.a.a.a.e.c$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class a extends Lambda implements InterfaceC6153a<RecordingViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31238g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31239h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31240i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31238g = viewModelStoreOwner;
            this.f31239h = qualifier;
            this.f31240i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.e.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f31238g, Reflection.m13097a(RecordingViewModel2.class), this.f31239h, this.f31240i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.c$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class b extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f31241g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f31242h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f31243i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f31241g = viewModelStoreOwner;
            this.f31242h = qualifier;
            this.f31243i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f31241g, Reflection.m13097a(ProfileViewModel6.class), this.f31242h, this.f31243i);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.c$c */
    /* JADX INFO: compiled from: RecordingFragment.kt */
    public static final class c {
        public c() {
        }

        /* JADX INFO: renamed from: a */
        public static RecordingFragment m13905a(c cVar, int i, int i2, int i3) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            Objects.requireNonNull(cVar);
            RecordingFragment recordingFragment = new RecordingFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("kind", i);
            bundle.putInt("user_id", i2);
            recordingFragment.m16540M0(bundle);
            return recordingFragment;
        }

        public c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.c$d */
    /* JADX INFO: compiled from: RecordingFragment.kt */
    public static final class d extends Lambda implements InterfaceC6153a<RecordingAdapter> {
        public d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingAdapter mo2c() {
            return new RecordingAdapter(new C7402u(0, this), new C7402u(1, this), new C7402u(2, this), new C7402u(3, this), new C7402u(4, this), new C7402u(5, this), new C7402u(6, this), new C7402u(7, this), null, 256, null);
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.c$e */
    /* JADX INFO: compiled from: RecordingFragment.kt */
    public static final class e<T> implements Observer<ArrayList<Recording>> {
        public e() {
        }

        @Override // p636z0.p759s.Observer
        /* JADX INFO: renamed from: d */
        public void mo410d(ArrayList<Recording> arrayList) {
            ArrayList<Recording> arrayList2 = arrayList;
            Intrinsics2.m13088d(arrayList2, "it");
            if (!arrayList2.isEmpty()) {
                RecordingFragment.this.f31236p0 = true;
            }
        }
    }

    /* JADX INFO: renamed from: j.a.a.a.a.e.c$f */
    /* JADX INFO: compiled from: RecordingFragment.kt */
    public static final class f implements RecyclerView.InterfaceC0164q {
        public f() {
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
                if (Math.abs(motionEvent.getX() - RecordingFragment.this.f31231k0) > Math.abs(motionEvent.getY() - RecordingFragment.this.f31232l0)) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
                } else if (Math.abs(motionEvent.getY() - RecordingFragment.this.f31232l0) > RecordingFragment.this.f31230j0) {
                    recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
                }
            }
            RecordingFragment.this.f31231k0 = motionEvent.getX();
            RecordingFragment.this.f31232l0 = motionEvent.getY();
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
        /* JADX INFO: renamed from: c */
        public void mo780c(boolean z) {
        }
    }

    public RecordingFragment() {
        Lazy4 lazy4 = Lazy4.NONE;
        this.f31227g0 = LazyJVM.m13020a(lazy4, new a(this, null, null));
        this.f31228h0 = LazyJVM.m13020a(lazy4, new b(this, null, null));
        this.f31230j0 = 10;
        this.f31233m0 = LazyJVM.m13021b(new d());
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: P0 */
    public void mo13901P0(boolean z) {
        Integer num;
        if (this.f38413J != z) {
            this.f38413J = z;
        }
        if (z && (num = this.f31234n0) != null && num.intValue() == 2) {
            m13902g1();
        }
        this.f31229i0 = z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: W0 */
    public void mo13880W0() {
        HashMap map = this.f31237q0;
        if (map != null) {
            map.clear();
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: c0 */
    public void mo465c0(Bundle bundle) {
        super.mo465c0(bundle);
        Bundle bundle2 = this.f38438m;
        if (bundle2 != null) {
            this.f31234n0 = Integer.valueOf(bundle2.getInt("kind"));
            mo13882Z0().f31254u.mo427j(Integer.valueOf(bundle2.getInt("kind")));
            int i = bundle2.getInt("user_id");
            if (i > 0) {
                mo13882Z0().f31252s.mo427j(Integer.valueOf(i));
            }
        }
        BaseListAdapter<Recording, ? extends ViewDataBinding> baseListAdapterMo13892e1 = mo13892e1();
        Objects.requireNonNull(baseListAdapterMo13892e1, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.recording.RecordingAdapter");
        RecordingAdapter recordingAdapter = (RecordingAdapter) baseListAdapterMo13892e1;
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
        if (this.f31237q0 == null) {
            this.f31237q0 = new HashMap();
        }
        View view = (View) this.f31237q0.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = this.f38416M;
        if (view2 == null) {
            return null;
        }
        View viewFindViewById = view2.findViewById(i);
        this.f31237q0.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: e1 */
    public BaseListAdapter<Recording, ? extends ViewDataBinding> mo13892e1() {
        return (BaseListAdapter) this.f31233m0.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment
    /* JADX INFO: renamed from: f1 */
    public void mo13897f1() {
        Integer num = this.f31234n0;
        if (num != null && num.intValue() == 2) {
            return;
        }
        BackgroundMessageView backgroundMessageView = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView != null) {
            SkuDao.a.m14068T(backgroundMessageView);
        }
        BackgroundMessageView backgroundMessageView2 = (BackgroundMessageView) mo13891c1(R.id.statusView);
        if (backgroundMessageView2 != null) {
            backgroundMessageView2.m14471b(R.drawable.ic_no_song, R.string.message_recording_empty, null);
        }
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: g0 */
    public void mo1956g0() {
        EventBus3.m13810b().m13821m(this);
        this.f38414K = true;
    }

    /* JADX INFO: renamed from: g1 */
    public final void m13902g1() {
        FragmentActivity fragmentActivityM16562f = m16562f();
        if (fragmentActivityM16562f != null) {
            if (ContextCompat.m16133a(fragmentActivityM16562f, "android.permission.ACCESS_COARSE_LOCATION") != 0 && ContextCompat.m16133a(fragmentActivityM16562f, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                ActivityCompat.m16082c(fragmentActivityM16562f, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 101);
                return;
            }
            Object systemService = fragmentActivityM16562f.getSystemService("location");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            LocationManager locationManager = (LocationManager) systemService;
            this.f31235o0 = locationManager;
            if ((locationManager != null ? Boolean.valueOf(locationManager.isProviderEnabled("gps")) : null) == null) {
                m16555U0(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return;
            }
            LocationManager locationManager2 = this.f31235o0;
            Location lastKnownLocation = locationManager2 != null ? locationManager2.getLastKnownLocation("gps") : null;
            if (lastKnownLocation == null) {
                LocationManager locationManager3 = this.f31235o0;
                lastKnownLocation = locationManager3 != null ? locationManager3.getLastKnownLocation("network") : null;
            }
            if (lastKnownLocation != null) {
                StringBuilder sbM1556G = outline.m1556G("Lat: ");
                sbM1556G.append(lastKnownLocation.getLatitude());
                Intrinsics2.m13089e(sbM1556G.toString(), "message");
                Intrinsics2.m13089e("Long: " + lastKnownLocation.getLongitude(), "message");
                RecordingViewModel2 recordingViewModel2Mo13882Z0 = mo13882Z0();
                recordingViewModel2Mo13882Z0.f31255v.mo427j(Double.valueOf(lastKnownLocation.getLatitude()));
                recordingViewModel2Mo13882Z0.f31256w.mo427j(Double.valueOf(lastKnownLocation.getLongitude()));
                if (this.f31236p0) {
                    return;
                }
                recordingViewModel2Mo13882Z0.m13965n();
                recordingViewModel2Mo13882Z0.mo13895u(1);
            }
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: h0 */
    public /* synthetic */ void mo467h0() {
        super.mo467h0();
        mo13880W0();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseFragment3
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public RecordingViewModel2 mo13882Z0() {
        return (RecordingViewModel2) this.f31227g0.getValue();
    }

    /* JADX INFO: renamed from: i1 */
    public final void m13904i1(Recording recording) {
        PlayingActivity.C7291e c7291e = PlayingActivity.f33644w;
        Context contextM16528G0 = m16528G0();
        Intrinsics2.m13088d(contextM16528G0, "requireContext()");
        m13976b1(c7291e.m14397a(contextM16528G0, recording.getId(), recording.getThumbnail(), Integer.valueOf(recording.getFormat()), Integer.valueOf(recording.getVideoRatio()), SkuDao.a.m14052D(recording, (ArrayList) mo13882Z0().f32034q.m421d())));
    }

    @Subscribe
    public final void onFollowEvent(UserEvent userEvent) {
        Intrinsics2.m13089e(userEvent, "event");
        ArrayList arrayList = (ArrayList) mo13882Z0().f32034q.m421d();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                User user = ((Recording) arrayList.get(i)).getUser();
                if (user != null && user.getId() == userEvent.f32048a) {
                    User user2 = ((Recording) arrayList.get(i)).getUser();
                    if (user2 != null) {
                        user2.setFollowStatus(userEvent.f32049b);
                    }
                    User user3 = ((Recording) arrayList.get(i)).getUser();
                    if (user3 != null) {
                        user3.setFollowerCount(userEvent.f32050c);
                    }
                    mo13892e1().m664f(i);
                }
            }
        }
    }

    @Subscribe
    public final void onLikeEvent(RecordingEvent recordingEvent) {
        int i;
        ArrayList arrayList;
        Intrinsics2.m13089e(recordingEvent, "event");
        int i2 = recordingEvent.f32052a;
        ArrayList arrayList2 = (ArrayList) mo13882Z0().f32034q.m421d();
        if (arrayList2 == null) {
            i = -1;
            break;
        }
        i = 0;
        int size = arrayList2.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList2.get(i);
            Intrinsics2.m13088d(obj, "recordings[i]");
            if (i2 == ((Recording) obj).getId()) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0 || (arrayList = (ArrayList) mo13882Z0().f32034q.m421d()) == null) {
            return;
        }
        ((Recording) arrayList.get(i)).setLikeStatus(recordingEvent.f32053b);
        ((Recording) arrayList.get(i)).setLikeCount(recordingEvent.f32054c);
        mo13892e1().m664f(i);
    }

    @Override // p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: r0 */
    public void mo2075r0(int i, String[] strArr, int[] iArr) {
        Intrinsics2.m13089e(strArr, "permissions");
        Intrinsics2.m13089e(iArr, "grantResults");
        if (i != 101) {
            return;
        }
        Intrinsics2.m13089e(strArr, "grantPermissions");
        Intrinsics2.m13089e(iArr, "grantResults");
        Intrinsics2.m13089e("android.permission.ACCESS_FINE_LOCATION", "permission");
        int length = strArr.length;
        boolean z = false;
        for (int i2 = 0; i2 < length; i2++) {
            if (Intrinsics2.m13085a("android.permission.ACCESS_FINE_LOCATION", strArr[i2])) {
                if (iArr[i2] != 0) {
                    break;
                }
                z = true;
                break;
            }
        }
        if (z) {
            m13902g1();
        }
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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshFragment, p555j.p556a.p557a.p558a.p592b.BaseFragment3, p636z0.p752p.p753c.Fragment
    /* JADX INFO: renamed from: w0 */
    public void mo471w0(View view, Bundle bundle) {
        Intrinsics2.m13089e(view, "view");
        super.mo471w0(view, bundle);
        mo13882Z0().f32034q.mo422e(m16548R(), new e());
        RecyclerView recyclerView = (RecyclerView) mo13891c1(R.id.recycler_view);
        recyclerView.f918B.add(new f());
    }
}
