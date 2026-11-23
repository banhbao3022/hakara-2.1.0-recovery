package mtp.media.karaoke;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.messaging.FirebaseMessaging;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;
import java.util.TimeZone;
import mtp.media.karaoke.data.model.Notification;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.explore.ExploreFragment;
import mtp.media.karaoke.p628ui.screen.feed.FeedFragment;
import mtp.media.karaoke.p628ui.screen.notification.NotificationFragment;
import mtp.media.karaoke.p628ui.screen.profile.ProfileFragment;
import p007c.p008a.p009a.p029b.p030a.PlaylistItem;
import p007c.p008a.p009a.p029b.p038c.PlaybackState;
import p007c.p008a.p009a.p029b.p039d.PlaylistListener;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p333n.AbstractC4781i;
import p007c.p190n.p194b.p266d.p333n.InterfaceC4771d;
import p007c.p190n.p385d.FirebaseApp2;
import p007c.p190n.p385d.p428w.C5545j;
import p007c.p451o.p452a.C5729a;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.MainViewModel;
import p555j.p556a.p557a.MainViewModel3;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingFragment;
import p555j.p556a.p557a.p558a.p559a.p569f.SongFragment;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p595e.KeepStateNavigator;
import p555j.p556a.p557a.p558a.p596f.PlaylistManager;
import p555j.p556a.p557a.p606h.p607a.MediaItem4;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p555j.p556a.p557a.p616i.MainActivityBinding;
import p555j.p556a.p557a.p619l.DeviceUtils;
import p636z0.p725k.p726c.ActivityCompat;
import p636z0.p725k.p727d.ContextCompat;
import p636z0.p752p.C8310a;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentManager;
import p636z0.p759s.MutableLiveData;
import p636z0.p759s.ViewModelStoreOwner;
import p636z0.p770y.NavBackStackEntry;
import p636z0.p770y.p773v.NavigationUI;
import p636z0.p770y.p773v.NavigationUI2;

/* JADX INFO: compiled from: MainActivity.kt */
/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends BaseActivity3<MainActivityBinding, MainViewModel3> implements LoginFragment2.c, ProfileFragment.InterfaceC7316d, PlaylistListener<MediaItem4> {

    /* JADX INFO: renamed from: w */
    public static final C7230b f33373w = new C7230b(null);

    /* JADX INFO: renamed from: A */
    public Notification f33374A;

    /* JADX INFO: renamed from: B */
    public NavController f33375B;

    /* JADX INFO: renamed from: C */
    public PlaylistManager f33376C;

    /* JADX INFO: renamed from: E */
    public HashMap f33378E;

    /* JADX INFO: renamed from: z */
    public long f33381z;

    /* JADX INFO: renamed from: x */
    public final int f33379x = R.layout.main_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33380y = LazyJVM.m13020a(Lazy4.NONE, new C7229a(this, null, null));

    /* JADX INFO: renamed from: D */
    public final BottomNavigationView.InterfaceC5922c f33377D = new C7231c();

    /* JADX INFO: renamed from: mtp.media.karaoke.MainActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7229a extends Lambda implements InterfaceC6153a<MainViewModel3> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33382g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33383h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33384i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7229a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33382g = viewModelStoreOwner;
            this.f33383h = qualifier;
            this.f33384i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public MainViewModel3 mo2c() {
            return SkuDao.a.m14107t(this.f33382g, Reflection.m13097a(MainViewModel3.class), this.f33383h, this.f33384i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.MainActivity$b */
    /* JADX INFO: compiled from: MainActivity.kt */
    public static final class C7230b {
        public C7230b() {
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14330a(Context context, Notification notification) {
            Intrinsics2.m13089e(context, "context");
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.putExtra("notification", notification);
            return intent;
        }

        public C7230b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.MainActivity$c */
    /* JADX INFO: compiled from: MainActivity.kt */
    public static final class C7231c implements BottomNavigationView.InterfaceC5922c {
        public C7231c() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.android.material.bottomnavigation.BottomNavigationView.InterfaceC5922c
        /* JADX INFO: renamed from: a */
        public final boolean mo12730a(MenuItem menuItem) {
            RecyclerView recyclerView;
            RecyclerView recyclerView2;
            RecyclerView recyclerView3;
            Intrinsics2.m13089e(menuItem, "item");
            switch (menuItem.getItemId()) {
                case R.id.exploreFragment /* 2131362272 */:
                    BottomNavigationView bottomNavigationView = (BottomNavigationView) MainActivity.this.m14327U(R.id.navigation);
                    Intrinsics2.m13088d(bottomNavigationView, "navigation");
                    if (bottomNavigationView.getSelectedItemId() != R.id.exploreFragment) {
                        SkuDao.a.m14056H(MainActivity.this, false, false, 3);
                        NavController navController = MainActivity.this.f33375B;
                        if (navController != null) {
                            navController.m449d(R.id.exploreFragment, null, null);
                        }
                        return true;
                    }
                    Fragment fragmentM16655H = MainActivity.this.m16577C().m16655H(R.id.navHostFragment);
                    Intrinsics2.m13087c(fragmentM16655H);
                    Intrinsics2.m13088d(fragmentM16655H, "supportFragmentManager.f…d(R.id.navHostFragment)!!");
                    Fragment fragmentM16656I = fragmentM16655H.m16570w().m16656I(String.valueOf(R.id.exploreFragment));
                    if ((fragmentM16656I instanceof ExploreFragment) && (recyclerView = (RecyclerView) ((ExploreFragment) fragmentM16656I).m14361c1(R.id.recycler_view)) != null) {
                        recyclerView.m617m0(0);
                    }
                    return false;
                case R.id.feedFragment /* 2131362275 */:
                    SharedPreferences sharedPreferences = ModelPrefs.f32358a;
                    if (sharedPreferences == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    if (((User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class)) != null) {
                        BottomNavigationView bottomNavigationView2 = (BottomNavigationView) MainActivity.this.m14327U(R.id.navigation);
                        Intrinsics2.m13088d(bottomNavigationView2, "navigation");
                        if (bottomNavigationView2.getSelectedItemId() != R.id.feedFragment) {
                            SkuDao.a.m14056H(MainActivity.this, false, false, 3);
                            NavController navController2 = MainActivity.this.f33375B;
                            if (navController2 != null) {
                                navController2.m449d(R.id.feedFragment, null, null);
                            }
                            return true;
                        }
                        FragmentManager fragmentManagerM16577C = MainActivity.this.m16577C();
                        Intrinsics2.m13088d(fragmentManagerM16577C, "supportFragmentManager");
                        for (Fragment fragment : fragmentManagerM16577C.m16659L()) {
                            if (fragment instanceof RecordingFragment) {
                                RecordingFragment recordingFragment = (RecordingFragment) fragment;
                                if (recordingFragment.f31229i0 && (recyclerView2 = (RecyclerView) recordingFragment.mo13891c1(R.id.recycler_view)) != null) {
                                    recyclerView2.m617m0(0);
                                }
                            }
                        }
                    } else {
                        MainActivity.m14326V(MainActivity.this, 0);
                    }
                    return false;
                case R.id.notificationFragment /* 2131362601 */:
                    SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
                    if (sharedPreferences2 == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    if (((User) outline.m1584f(sharedPreferences2.getString("current_user", null), User.class)) != null) {
                        BottomNavigationView bottomNavigationView3 = (BottomNavigationView) MainActivity.this.m14327U(R.id.navigation);
                        Intrinsics2.m13088d(bottomNavigationView3, "navigation");
                        if (bottomNavigationView3.getSelectedItemId() != R.id.notificationFragment) {
                            SkuDao.a.m14056H(MainActivity.this, false, false, 3);
                            NavController navController3 = MainActivity.this.f33375B;
                            if (navController3 != null) {
                                navController3.m449d(R.id.notificationFragment, null, null);
                            }
                            return true;
                        }
                        Fragment fragmentM16655H2 = MainActivity.this.m16577C().m16655H(R.id.navHostFragment);
                        Intrinsics2.m13087c(fragmentM16655H2);
                        Intrinsics2.m13088d(fragmentM16655H2, "supportFragmentManager.f…d(R.id.navHostFragment)!!");
                        Fragment fragmentM16656I2 = fragmentM16655H2.m16570w().m16656I(String.valueOf(R.id.notificationFragment));
                        if (fragmentM16656I2 instanceof NotificationFragment) {
                            ((RecyclerView) ((NotificationFragment) fragmentM16656I2).mo13891c1(R.id.recycler_view)).m617m0(0);
                        }
                    } else {
                        MainActivity.m14326V(MainActivity.this, 3);
                    }
                    return false;
                case R.id.profileFragment /* 2131362658 */:
                    SharedPreferences sharedPreferences3 = ModelPrefs.f32358a;
                    if (sharedPreferences3 == null) {
                        Intrinsics2.m13096l("preferences");
                        throw null;
                    }
                    if (((User) outline.m1584f(sharedPreferences3.getString("current_user", null), User.class)) == null) {
                        MainActivity.m14326V(MainActivity.this, 4);
                        return false;
                    }
                    Fragment fragmentM16655H3 = MainActivity.this.m16577C().m16655H(R.id.navHostFragment);
                    Intrinsics2.m13087c(fragmentM16655H3);
                    Intrinsics2.m13088d(fragmentM16655H3, "supportFragmentManager.f…d(R.id.navHostFragment)!!");
                    Fragment fragmentM16656I3 = fragmentM16655H3.m16570w().m16656I(String.valueOf(R.id.profileFragment));
                    if (fragmentM16656I3 instanceof ProfileFragment) {
                        ((ProfileFragment) fragmentM16656I3).m14419f1();
                    }
                    NavController navController4 = MainActivity.this.f33375B;
                    if (navController4 != null) {
                        navController4.m449d(R.id.profileFragment, null, null);
                    }
                    return true;
                case R.id.songbookFragment /* 2131362776 */:
                    BottomNavigationView bottomNavigationView4 = (BottomNavigationView) MainActivity.this.m14327U(R.id.navigation);
                    Intrinsics2.m13088d(bottomNavigationView4, "navigation");
                    if (bottomNavigationView4.getSelectedItemId() != R.id.songbookFragment) {
                        SkuDao.a.m14056H(MainActivity.this, false, false, 3);
                        NavController navController5 = MainActivity.this.f33375B;
                        if (navController5 != null) {
                            navController5.m449d(R.id.songbookFragment, null, null);
                        }
                        return true;
                    }
                    FragmentManager fragmentManagerM16577C2 = MainActivity.this.m16577C();
                    Intrinsics2.m13088d(fragmentManagerM16577C2, "supportFragmentManager");
                    for (Fragment fragment2 : fragmentManagerM16577C2.m16659L()) {
                        if (fragment2 instanceof SongFragment) {
                            SongFragment songFragment = (SongFragment) fragment2;
                            if (songFragment.f31293m0 && (recyclerView3 = (RecyclerView) songFragment.mo13891c1(R.id.recycler_view)) != null) {
                                recyclerView3.m617m0(0);
                            }
                        }
                    }
                    return false;
                default:
                    return false;
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.MainActivity$d */
    /* JADX INFO: compiled from: MainActivity.kt */
    public static final class C7232d<TResult> implements InterfaceC4771d<String> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ HashMap f33387b;

        public C7232d(HashMap map) {
            this.f33387b = map;
        }

        @Override // p007c.p190n.p194b.p266d.p333n.InterfaceC4771d
        /* JADX INFO: renamed from: b */
        public final void mo5171b(AbstractC4781i<String> abstractC4781i) {
            Intrinsics2.m13089e(abstractC4781i, "task");
            if (abstractC4781i.mo10941n()) {
                String strMo10937j = abstractC4781i.mo10937j();
                Intrinsics2.m13089e("token: " + strMo10937j, "message");
                this.f33387b.put("fcm_token", String.valueOf(strMo10937j));
            }
            MainViewModel3 mainViewModel3Mo13969R = MainActivity.this.mo13969R();
            HashMap map = this.f33387b;
            Context applicationContext = MainActivity.this.getApplicationContext();
            Intrinsics2.m13088d(applicationContext, "applicationContext");
            Objects.requireNonNull(mainViewModel3Mo13969R);
            Intrinsics2.m13089e(map, "hashMap");
            Intrinsics2.m13089e(applicationContext, "context");
            map.put("os", "2");
            DeviceUtils.a aVar = DeviceUtils.f33080a;
            aVar.m14250d();
            map.put("os_version", Build.VERSION.RELEASE);
            map.put("app_version", "2.1.0");
            StringBuilder sb = new StringBuilder();
            String str = Build.MANUFACTURER;
            Intrinsics2.m13088d(str, "Build.MANUFACTURER");
            sb.append(str);
            sb.append(" ");
            sb.append(Build.MODEL);
            map.put("device_name", sb.toString());
            map.put("unique_id", aVar.m14247a(applicationContext));
            TimeZone timeZone = TimeZone.getDefault();
            Intrinsics2.m13088d(timeZone, "TimeZone.getDefault()");
            String id = timeZone.getID();
            Intrinsics2.m13088d(id, "TimeZone.getDefault().id");
            map.put("timezone", id);
            Resources system = Resources.getSystem();
            Intrinsics2.m13088d(system, "Resources.getSystem()");
            map.put("screen_width", String.valueOf(system.getDisplayMetrics().widthPixels));
            Resources system2 = Resources.getSystem();
            Intrinsics2.m13088d(system2, "Resources.getSystem()");
            map.put("screen_height", String.valueOf(system2.getDisplayMetrics().heightPixels));
            Intrinsics2.m13088d(str, "Build.MANUFACTURER");
            map.put("brand", str);
            C5729a.m12428A(C8310a.m16440e(mainViewModel3Mo13969R), null, 0, new MainViewModel(mainViewModel3Mo13969R, map, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m14326V(MainActivity mainActivity, int i) {
        Objects.requireNonNull(mainActivity);
        LoginFragment2.f31647t0.m13940a(i).mo5469c1(mainActivity.m16577C(), "LoginForm");
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33379x;
    }

    /* JADX INFO: renamed from: U */
    public View m14327U(int i) {
        if (this.f33378E == null) {
            this.f33378E = new HashMap();
        }
        View view = (View) this.f33378E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33378E.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public MainViewModel3 mo13969R() {
        return (MainViewModel3) this.f33380y.getValue();
    }

    @Override // mtp.media.karaoke.p628ui.screen.profile.ProfileFragment.InterfaceC7316d
    /* JADX INFO: renamed from: a */
    public void mo14329a() {
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2.c
    /* JADX INFO: renamed from: g */
    public void mo13941g(int i) {
        if (i == 0) {
            NavController navController = this.f33375B;
            if (navController != null) {
                navController.m449d(R.id.feedFragment, null, null);
            }
            BottomNavigationView bottomNavigationView = (BottomNavigationView) m14327U(R.id.navigation);
            Intrinsics2.m13088d(bottomNavigationView, "navigation");
            bottomNavigationView.setSelectedItemId(R.id.feedFragment);
            return;
        }
        if (i == 1) {
            NavController navController2 = this.f33375B;
            if (navController2 != null) {
                navController2.m449d(R.id.exploreFragment, null, null);
            }
            BottomNavigationView bottomNavigationView2 = (BottomNavigationView) m14327U(R.id.navigation);
            Intrinsics2.m13088d(bottomNavigationView2, "navigation");
            bottomNavigationView2.setSelectedItemId(R.id.exploreFragment);
            return;
        }
        if (i == 2) {
            NavController navController3 = this.f33375B;
            if (navController3 != null) {
                navController3.m449d(R.id.songbookFragment, null, null);
            }
            BottomNavigationView bottomNavigationView3 = (BottomNavigationView) m14327U(R.id.navigation);
            Intrinsics2.m13088d(bottomNavigationView3, "navigation");
            bottomNavigationView3.setSelectedItemId(R.id.songbookFragment);
            return;
        }
        if (i == 3) {
            NavController navController4 = this.f33375B;
            if (navController4 != null) {
                navController4.m449d(R.id.notificationFragment, null, null);
            }
            BottomNavigationView bottomNavigationView4 = (BottomNavigationView) m14327U(R.id.navigation);
            Intrinsics2.m13088d(bottomNavigationView4, "navigation");
            bottomNavigationView4.setSelectedItemId(R.id.notificationFragment);
            return;
        }
        if (i != 4) {
            return;
        }
        NavController navController5 = this.f33375B;
        if (navController5 != null) {
            navController5.m449d(R.id.profileFragment, null, null);
        }
        BottomNavigationView bottomNavigationView5 = (BottomNavigationView) m14327U(R.id.navigation);
        Intrinsics2.m13088d(bottomNavigationView5, "navigation");
        bottomNavigationView5.setSelectedItemId(R.id.profileFragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: n */
    public boolean mo1268n(PlaybackState playbackState) {
        Intrinsics2.m13089e(playbackState, "playbackState");
        MutableLiveData<Boolean> mutableLiveData = mo13969R().f32089m;
        PlaybackState playbackState2 = PlaybackState.PLAYING;
        mutableLiveData.mo427j(Boolean.valueOf(playbackState == playbackState2));
        Fragment fragmentM16655H = m16577C().m16655H(R.id.navHostFragment);
        Intrinsics2.m13087c(fragmentM16655H);
        Intrinsics2.m13088d(fragmentM16655H, "supportFragmentManager.f…d(R.id.navHostFragment)!!");
        Fragment fragmentM16656I = fragmentM16655H.m16570w().m16656I(String.valueOf(R.id.feedFragment));
        if (fragmentM16656I instanceof FeedFragment) {
            FeedFragment feedFragment = (FeedFragment) fragmentM16656I;
            PlaylistManager playlistManager = this.f33376C;
            if (playlistManager == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            MediaItem4 mediaItem4 = (MediaItem4) playlistManager.m1273b();
            feedFragment.f33585j0 = mediaItem4 != null ? (int) mediaItem4.f32262a.f32256a : 0;
            feedFragment.f33584i0 = playbackState == playbackState2;
            feedFragment.m14366d1();
        }
        Fragment fragmentM16656I2 = fragmentM16655H.m16570w().m16656I(String.valueOf(R.id.exploreFragment));
        if (fragmentM16656I2 instanceof ExploreFragment) {
            ExploreFragment exploreFragment = (ExploreFragment) fragmentM16656I2;
            PlaylistManager playlistManager2 = this.f33376C;
            if (playlistManager2 == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            MediaItem4 mediaItem5 = (MediaItem4) playlistManager2.m1273b();
            exploreFragment.f33555k0 = mediaItem5 != null ? (int) mediaItem5.f32262a.f32256a : 0;
            exploreFragment.f33554j0 = playbackState == playbackState2;
            exploreFragment.m14363e1();
        }
        Fragment fragmentM16656I3 = fragmentM16655H.m16570w().m16656I(String.valueOf(R.id.notificationFragment));
        if (fragmentM16656I3 instanceof NotificationFragment) {
            NotificationFragment notificationFragment = (NotificationFragment) fragmentM16656I3;
            PlaylistManager playlistManager3 = this.f33376C;
            if (playlistManager3 == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            MediaItem4 mediaItem6 = (MediaItem4) playlistManager3.m1273b();
            notificationFragment.f33636k0 = mediaItem6 != null ? (int) mediaItem6.f32262a.f32256a : 0;
            notificationFragment.f33635j0 = playbackState == playbackState2;
            notificationFragment.m14373h1();
        }
        Fragment fragmentM16656I4 = fragmentM16655H.m16570w().m16656I(String.valueOf(R.id.profileFragment));
        if (fragmentM16656I4 instanceof ProfileFragment) {
            ProfileFragment profileFragment = (ProfileFragment) fragmentM16656I4;
            PlaylistManager playlistManager4 = this.f33376C;
            if (playlistManager4 == null) {
                Intrinsics2.m13096l("playlistManager");
                throw null;
            }
            MediaItem4 mediaItem7 = (MediaItem4) playlistManager4.m1273b();
            profileFragment.f33801q0 = mediaItem7 != null ? (int) mediaItem7.f32262a.f32256a : 0;
            profileFragment.f33800p0 = playbackState == playbackState2;
            profileFragment.m14420g1();
        }
        return true;
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentManager fragmentManagerM16577C = m16577C();
        Intrinsics2.m13088d(fragmentManagerM16577C, "supportFragmentManager");
        for (Fragment fragment : fragmentManagerM16577C.m16659L()) {
            if (fragment instanceof LoginFragment2) {
                fragment.mo2588X(i, i2, intent);
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f33381z <= 5000) {
            this.f143l.m133b();
            return;
        }
        try {
            SkuDao.a.m14092i0(this, R.string.txt_cancel_app, 0, 2);
            this.f33381z = jCurrentTimeMillis;
        } catch (Exception unused) {
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        View viewFindViewById;
        FirebaseMessaging firebaseMessaging;
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        Intrinsics2.m13090f(this, "$this$findNavController");
        int i = ActivityCompat.f37660b;
        if (Build.VERSION.SDK_INT >= 28) {
            viewFindViewById = requireViewById(R.id.navHostFragment);
        } else {
            viewFindViewById = findViewById(R.id.navHostFragment);
            if (viewFindViewById == null) {
                throw new IllegalArgumentException("ID does not reference a View inside this Activity");
            }
        }
        NavController navControllerM16439d = C8310a.m16439d(viewFindViewById);
        if (navControllerM16439d == null) {
            throw new IllegalStateException("Activity " + this + " does not have a NavController set on " + R.id.navHostFragment);
        }
        Intrinsics2.m13086b(navControllerM16439d, "Navigation.findNavController(this, viewId)");
        this.f33375B = navControllerM16439d;
        Fragment fragmentM16655H = m16577C().m16655H(R.id.navHostFragment);
        Intrinsics2.m13087c(fragmentM16655H);
        Intrinsics2.m13088d(fragmentM16655H, "supportFragmentManager.f…d(R.id.navHostFragment)!!");
        FragmentManager fragmentManagerM16570w = fragmentM16655H.m16570w();
        Intrinsics2.m13088d(fragmentManagerM16570w, "navHostFragment.childFragmentManager");
        KeepStateNavigator keepStateNavigator = new KeepStateNavigator(this, fragmentManagerM16570w, R.id.navHostFragment);
        NavController navController = this.f33375B;
        if (navController != null) {
            navController.f840k.m16928a(keepStateNavigator);
            navController.m453h(R.navigation.nav_graph, null);
            BottomNavigationView bottomNavigationView = m13968Q().f32886u;
            Intrinsics2.m13088d(bottomNavigationView, "viewBinding.navigation");
            Intrinsics2.m13090f(bottomNavigationView, "$this$setupWithNavController");
            Intrinsics2.m13090f(navController, "navController");
            bottomNavigationView.setOnNavigationItemSelectedListener(new NavigationUI(navController));
            NavigationUI2 navigationUI2 = new NavigationUI2(new WeakReference(bottomNavigationView), navController);
            if (!navController.f837h.isEmpty()) {
                NavBackStackEntry navBackStackEntryPeekLast = navController.f837h.peekLast();
                navigationUI2.mo456a(navController, navBackStackEntryPeekLast.f39000g, navBackStackEntryPeekLast.f39001h);
            }
            navController.f841l.add(navigationUI2);
        }
        ((BottomNavigationView) m14327U(R.id.navigation)).setOnNavigationItemSelectedListener(this.f33377D);
        HashMap map = new HashMap();
        if (ContextCompat.m16133a(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.m16133a(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            Object systemService = getSystemService("location");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
            Location lastKnownLocation = ((LocationManager) systemService).getLastKnownLocation("gps");
            if (lastKnownLocation != null) {
                map.put("lat", String.valueOf(lastKnownLocation.getLatitude()));
                map.put("long", String.valueOf(lastKnownLocation.getLongitude()));
            }
        }
        FirebaseApp2.m11666e(this);
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(FirebaseApp2.m11665b());
        }
        Intrinsics2.m13086b(firebaseMessaging, "FirebaseMessaging.getInstance()");
        firebaseMessaging.f29287d.m12920f().mo10933f(C5545j.f27275a).mo10929b(new C7232d(map));
        Intent intent = getIntent();
        Intrinsics2.m13088d(intent, "intent");
        Bundle extras = intent.getExtras();
        Notification notification = extras != null ? (Notification) extras.getParcelable("notification") : null;
        this.f33374A = notification;
        if (notification != null) {
            Intrinsics2.m13089e("Main notification: " + notification, "message");
            Intent intentM14108u = SkuDao.a.m14108u(this, notification.getType(), notification.getContentId(), notification.getSubContentId());
            if (intentM14108u != null) {
                m13971T(intentM14108u);
            }
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        PlaylistManager playlistManager = this.f33376C;
        if (playlistManager != null) {
            playlistManager.m1283m(this);
        } else {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics2.m13089e(strArr, "permissions");
        Intrinsics2.m13089e(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        FragmentManager fragmentManagerM16577C = m16577C();
        Intrinsics2.m13088d(fragmentManagerM16577C, "supportFragmentManager");
        for (Fragment fragment : fragmentManagerM16577C.m16659L()) {
            if (fragment instanceof RecordingFragment) {
                fragment.mo2075r0(i, strArr, iArr);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p752p.p753c.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Context applicationContext = getApplicationContext();
        Objects.requireNonNull(applicationContext, "null cannot be cast to non-null type mtp.media.karaoke.MainApplication");
        PlaylistManager playlistManagerM14331a = ((MainApplication) applicationContext).m14331a();
        this.f33376C = playlistManagerM14331a;
        if (playlistManagerM14331a == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        playlistManagerM14331a.m1280i(this);
        PlaylistManager playlistManager = this.f33376C;
        if (playlistManager == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        mo1268n(playlistManager.m1274c());
        MutableLiveData<Integer> mutableLiveData = mo13969R().f32090n;
        PlaylistManager playlistManager2 = this.f33376C;
        if (playlistManager2 == null) {
            Intrinsics2.m13096l("playlistManager");
            throw null;
        }
        MediaItem4 mediaItem4 = (MediaItem4) playlistManager2.m1273b();
        mutableLiveData.mo427j(Integer.valueOf(mediaItem4 != null ? (int) mediaItem4.f32262a.f32256a : 0));
    }

    @Override // p007c.p008a.p009a.p029b.p039d.PlaylistListener
    /* JADX INFO: renamed from: y */
    public /* bridge */ /* synthetic */ boolean mo1269y(PlaylistItem playlistItem, boolean z, boolean z2) {
        return true;
    }
}
