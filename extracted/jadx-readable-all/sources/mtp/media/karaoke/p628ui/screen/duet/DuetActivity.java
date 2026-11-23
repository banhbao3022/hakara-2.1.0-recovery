package mtp.media.karaoke.p628ui.screen.duet;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.List;
import mtp.media.karaoke.R;
import p007c.p190n.p194b.p334e.p336b0.TabLayoutMediator;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p483s.Collections2;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p563d.DuetActivity2;
import p555j.p556a.p557a.p558a.p559a.p567e.RecordingViewModel2;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p558a.p593c.ReselectableFragment;
import p555j.p556a.p557a.p558a.p596f.MainPagerAdapter;
import p555j.p556a.p557a.p558a.p596f.TabData;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.DuetActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: DuetActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class DuetActivity extends BaseActivity3<DuetActivityBinding, RecordingViewModel2> implements LoginFragment2.c {

    /* JADX INFO: renamed from: w */
    public static final C7249b f33509w = new C7249b(null);

    /* JADX INFO: renamed from: A */
    public HashMap f33510A;

    /* JADX INFO: renamed from: x */
    public final int f33511x = R.layout.duet_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33512y = LazyJVM.m13020a(Lazy4.NONE, new C7248a(this, null, null));

    /* JADX INFO: renamed from: z */
    public MainPagerAdapter f33513z;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.DuetActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7248a extends Lambda implements InterfaceC6153a<RecordingViewModel2> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33514g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33515h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33516i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7248a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33514g = viewModelStoreOwner;
            this.f33515h = qualifier;
            this.f33516i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.e.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public RecordingViewModel2 mo2c() {
            return SkuDao.a.m14107t(this.f33514g, Reflection.m13097a(RecordingViewModel2.class), this.f33515h, this.f33516i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.DuetActivity$b */
    /* JADX INFO: compiled from: DuetActivity.kt */
    public static final class C7249b {
        public C7249b() {
        }

        public C7249b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.duet.DuetActivity$c */
    /* JADX INFO: compiled from: DuetActivity.kt */
    public static final class C7250c implements TabLayout.InterfaceC5966d {
        public C7250c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: a */
        public void mo11027a(TabLayout.C5969g c5969g) {
            MainPagerAdapter mainPagerAdapter = DuetActivity.this.f33513z;
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
            ViewPager2 viewPager2 = (ViewPager2) DuetActivity.this.m14352U(R.id.viewpager);
            Intrinsics2.m13088d(viewPager2, "viewpager");
            viewPager2.setCurrentItem(c5969g != null ? c5969g.f29081d : 0);
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: c */
        public void mo11029c(TabLayout.C5969g c5969g) {
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33511x;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: R */
    public BaseViewModel mo13969R() {
        return (RecordingViewModel2) this.f33512y.getValue();
    }

    /* JADX INFO: renamed from: U */
    public View m14352U(int i) {
        if (this.f33510A == null) {
            this.f33510A = new HashMap();
        }
        View view = (View) this.f33510A.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33510A.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2.c
    /* JADX INFO: renamed from: g */
    public void mo13941g(int i) {
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) m14352U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        TextView textView = (TextView) m14352U(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        textView.setText(getString(R.string.txt_join_duet));
        m14615N((Toolbar) m14352U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14594n(true);
        }
        List listM13038c = Collections2.m13038c(SkuDao.a.m14087g("new"), SkuDao.a.m14087g("top"));
        this.f33513z = new MainPagerAdapter(listM13038c, this);
        ViewPager2 viewPager2 = (ViewPager2) m14352U(R.id.viewpager);
        Intrinsics2.m13088d(viewPager2, "viewpager");
        viewPager2.setAdapter(this.f33513z);
        new TabLayoutMediator((TabLayout) m14352U(R.id.tabLayout), (ViewPager2) m14352U(R.id.viewpager), DuetActivity2.f31170a).m11024a();
        ((TabLayout) m14352U(R.id.tabLayout)).m12825j();
        int size = listM13038c.size();
        for (int i = 0; i < size; i++) {
            TabLayout.C5969g c5969gM12823h = ((TabLayout) m14352U(R.id.tabLayout)).m12823h();
            c5969gM12823h.m12837a(((TabData) listM13038c.get(i)).f32073b);
            Intrinsics2.m13088d(c5969gM12823h, "tabLayout.newTab()\n     …   .setText(tabs[i].text)");
            TabLayout tabLayout = (TabLayout) m14352U(R.id.tabLayout);
            tabLayout.m12816a(c5969gM12823h, tabLayout.f29044g.isEmpty());
        }
        TabLayout tabLayout2 = (TabLayout) m14352U(R.id.tabLayout);
        C7250c c7250c = new C7250c();
        if (tabLayout2.f29034M.contains(c7250c)) {
            return;
        }
        tabLayout2.f29034M.add(c7250c);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f143l.m133b();
        return true;
    }
}
