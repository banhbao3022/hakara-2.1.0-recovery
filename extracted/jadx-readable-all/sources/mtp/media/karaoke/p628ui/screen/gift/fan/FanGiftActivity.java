package mtp.media.karaoke.p628ui.screen.gift.fan;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p578j.p579i.FanGiftActivity2;
import p555j.p556a.p557a.p558a.p559a.p578j.p579i.FanGiftAdapter;
import p555j.p556a.p557a.p558a.p559a.p578j.p579i.FanGiftViewModel;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FanGiftActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: FanGiftActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FanGiftActivity extends BaseLoadMoreRefreshActivity<FanGiftActivityBinding, FanGiftViewModel, Present> {

    /* JADX INFO: renamed from: y */
    public static final C7274b f33592y = new C7274b(null);

    /* JADX INFO: renamed from: C */
    public int f33595C;

    /* JADX INFO: renamed from: D */
    public int f33596D;

    /* JADX INFO: renamed from: E */
    public HashMap f33597E;

    /* JADX INFO: renamed from: z */
    public final int f33598z = R.layout.fan_gift_activity;

    /* JADX INFO: renamed from: A */
    public final Lazy3 f33593A = LazyJVM.m13020a(Lazy4.NONE, new C7273a(this, null, null));

    /* JADX INFO: renamed from: B */
    public final Lazy3 f33594B = LazyJVM.m13021b(new C7275c());

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.gift.fan.FanGiftActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7273a extends Lambda implements InterfaceC6153a<FanGiftViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33599g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33600h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33601i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7273a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33599g = viewModelStoreOwner;
            this.f33600h = qualifier;
            this.f33601i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.j.i.d] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public FanGiftViewModel mo2c() {
            return SkuDao.a.m14107t(this.f33599g, Reflection.m13097a(FanGiftViewModel.class), this.f33600h, this.f33601i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.gift.fan.FanGiftActivity$b */
    /* JADX INFO: compiled from: FanGiftActivity.kt */
    public static final class C7274b {
        public C7274b() {
        }

        public C7274b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.gift.fan.FanGiftActivity$c */
    /* JADX INFO: compiled from: FanGiftActivity.kt */
    public static final class C7275c extends Lambda implements InterfaceC6153a<FanGiftAdapter> {
        public C7275c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public FanGiftAdapter mo2c() {
            return new FanGiftAdapter(new FanGiftActivity2(this));
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33598z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: R */
    public BaseViewModel mo13969R() {
        return (FanGiftViewModel) this.f33593A.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f33597E == null) {
            this.f33597E = new HashMap();
        }
        View view = (View) this.f33597E.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33597E.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: W */
    public BaseListAdapter<Present, ? extends ViewDataBinding> mo13980W() {
        return (BaseListAdapter) this.f33594B.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: X */
    public void mo13981X() {
        BackgroundMessageView backgroundMessageView = (BackgroundMessageView) mo13978U(R.id.statusView);
        if (backgroundMessageView != null) {
            SkuDao.a.m14068T(backgroundMessageView);
        }
        BackgroundMessageView backgroundMessageView2 = (BackgroundMessageView) mo13978U(R.id.statusView);
        if (backgroundMessageView2 != null) {
            backgroundMessageView2.m14471b(R.drawable.ic_no_gift, R.string.message_gift_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f33595C = getIntent().getIntExtra("mode", 0);
        this.f33596D = getIntent().getIntExtra("id", 0);
        FanGiftViewModel fanGiftViewModel = (FanGiftViewModel) this.f33593A.getValue();
        fanGiftViewModel.f31583t.mo427j(Integer.valueOf(this.f33595C));
        fanGiftViewModel.f31582s.mo427j(Integer.valueOf(this.f33596D));
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) mo13978U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) mo13978U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14597q(R.string.title_fan_gift);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
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
