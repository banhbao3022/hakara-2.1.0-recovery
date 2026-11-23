package mtp.media.karaoke.p628ui.screen.wallet;

import android.content.Context;
import android.content.Intent;
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
import java.util.Objects;
import mtp.media.karaoke.R;
import p007c.p071d.p072a.p073a.AbstractC0509a;
import p007c.p071d.p072a.p073a.C0511b;
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
import p555j.p556a.p557a.p558a.p559a.p591s.WalletActivity2;
import p555j.p556a.p557a.p558a.p559a.p591s.WalletViewModel5;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p593c.ReselectableFragment;
import p555j.p556a.p557a.p558a.p596f.MainPagerAdapter;
import p555j.p556a.p557a.p558a.p596f.TabData;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.WalletActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: WalletActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WalletActivity extends BaseActivity3<WalletActivityBinding, WalletViewModel5> {

    /* JADX INFO: renamed from: w */
    public static final C7381b f34028w = new C7381b(null);

    /* JADX INFO: renamed from: A */
    public HashMap f34029A;

    /* JADX INFO: renamed from: x */
    public final int f34030x = R.layout.wallet_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f34031y = LazyJVM.m13020a(Lazy4.NONE, new C7380a(this, null, null));

    /* JADX INFO: renamed from: z */
    public MainPagerAdapter f34032z;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.wallet.WalletActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7380a extends Lambda implements InterfaceC6153a<WalletViewModel5> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f34033g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f34034h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f34035i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7380a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f34033g = viewModelStoreOwner;
            this.f34034h = qualifier;
            this.f34035i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.s.k] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public WalletViewModel5 mo2c() {
            return SkuDao.a.m14107t(this.f34033g, Reflection.m13097a(WalletViewModel5.class), this.f34034h, this.f34035i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.wallet.WalletActivity$b */
    /* JADX INFO: compiled from: WalletActivity.kt */
    public static final class C7381b {
        public C7381b() {
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14467a(Context context) {
            Intrinsics2.m13089e(context, "context");
            return new Intent(context, (Class<?>) WalletActivity.class);
        }

        public C7381b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.wallet.WalletActivity$c */
    /* JADX INFO: compiled from: WalletActivity.kt */
    public static final class C7382c implements TabLayout.InterfaceC5966d {
        public C7382c() {
        }

        @Override // com.google.android.material.tabs.TabLayout.InterfaceC5965c
        /* JADX INFO: renamed from: a */
        public void mo11027a(TabLayout.C5969g c5969g) {
            MainPagerAdapter mainPagerAdapter = WalletActivity.this.f34032z;
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
            ViewPager2 viewPager2 = (ViewPager2) WalletActivity.this.m14465U(R.id.viewpager);
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
        return this.f34030x;
    }

    /* JADX INFO: renamed from: U */
    public View m14465U(int i) {
        if (this.f34029A == null) {
            this.f34029A = new HashMap();
        }
        View view = (View) this.f34029A.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f34029A.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public WalletViewModel5 mo13969R() {
        return (WalletViewModel5) this.f34031y.getValue();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WalletViewModel5 walletViewModel5Mo13969R = mo13969R();
        Objects.requireNonNull(walletViewModel5Mo13969R);
        Intrinsics2.m13089e("endConnections", "message");
        AbstractC0509a abstractC0509a = walletViewModel5Mo13969R.f31975l;
        if (abstractC0509a == null) {
            Intrinsics2.m13096l("playStoreBillingClient");
            throw null;
        }
        abstractC0509a.mo1527b();
        this.f143l.m133b();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) m14465U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        TextView textView = (TextView) m14465U(R.id.toolbarTitle);
        Intrinsics2.m13088d(textView, "toolbarTitle");
        textView.setText(getString(R.string.txt_wallet));
        m14615N((Toolbar) m14465U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14593m(true);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14594n(true);
        }
        WalletViewModel5 walletViewModel5Mo13969R = mo13969R();
        Objects.requireNonNull(walletViewModel5Mo13969R);
        Intrinsics2.m13089e("startConnections", "message");
        Context applicationContext = walletViewModel5Mo13969R.f31981r.getApplicationContext();
        if (applicationContext == null) {
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
        C0511b c0511b = new C0511b(null, applicationContext, walletViewModel5Mo13969R);
        Intrinsics2.m13088d(c0511b, "BillingClient.newBuilder…setListener(this).build()");
        walletViewModel5Mo13969R.f31975l = c0511b;
        walletViewModel5Mo13969R.m13954o();
        mo13969R().m13955p();
        List listM13038c = Collections2.m13038c(SkuDao.a.m14087g("diamond"), SkuDao.a.m14087g("coin"), SkuDao.a.m14087g("star"));
        this.f34032z = new MainPagerAdapter(listM13038c, this);
        ViewPager2 viewPager2 = (ViewPager2) m14465U(R.id.viewpager);
        Intrinsics2.m13088d(viewPager2, "viewpager");
        viewPager2.setAdapter(this.f34032z);
        new TabLayoutMediator((TabLayout) m14465U(R.id.tabLayout), (ViewPager2) m14465U(R.id.viewpager), WalletActivity2.f31962a).m11024a();
        ((TabLayout) m14465U(R.id.tabLayout)).m12825j();
        int size = listM13038c.size();
        for (int i = 0; i < size; i++) {
            TabLayout.C5969g c5969gM12823h = ((TabLayout) m14465U(R.id.tabLayout)).m12823h();
            c5969gM12823h.m12837a(((TabData) listM13038c.get(i)).f32073b);
            Intrinsics2.m13088d(c5969gM12823h, "tabLayout.newTab()\n     …   .setText(tabs[i].text)");
            TabLayout tabLayout = (TabLayout) m14465U(R.id.tabLayout);
            tabLayout.m12816a(c5969gM12823h, tabLayout.f29044g.isEmpty());
        }
        TabLayout tabLayout2 = (TabLayout) m14465U(R.id.tabLayout);
        C7382c c7382c = new C7382c();
        if (tabLayout2.f29034M.contains(c7382c)) {
            return;
        }
        tabLayout2.f29034M.add(c7382c);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intrinsics2.m13089e(menuItem, "item");
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
