package mtp.media.karaoke.p628ui.screen.gift.present;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import java.util.Objects;
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
import p555j.p556a.p557a.p558a.p559a.p578j.p580j.PresentAdapter;
import p555j.p556a.p557a.p558a.p559a.p578j.p580j.PresentViewModel;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.PresentActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: PresentActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PresentActivity extends BaseLoadMoreRefreshActivity<PresentActivityBinding, PresentViewModel, Present> {

    /* JADX INFO: renamed from: y */
    public static final C7277b f33603y = new C7277b(null);

    /* JADX INFO: renamed from: C */
    public int f33606C;

    /* JADX INFO: renamed from: D */
    public HashMap f33607D;

    /* JADX INFO: renamed from: z */
    public final int f33608z = R.layout.present_activity;

    /* JADX INFO: renamed from: A */
    public final Lazy3 f33604A = LazyJVM.m13020a(Lazy4.NONE, new C7276a(this, null, null));

    /* JADX INFO: renamed from: B */
    public final Lazy3 f33605B = LazyJVM.m13021b(C7278c.f33612g);

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.gift.present.PresentActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7276a extends Lambda implements InterfaceC6153a<PresentViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33609g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33610h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33611i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7276a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33609g = viewModelStoreOwner;
            this.f33610h = qualifier;
            this.f33611i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.j.j.c] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public PresentViewModel mo2c() {
            return SkuDao.a.m14107t(this.f33609g, Reflection.m13097a(PresentViewModel.class), this.f33610h, this.f33611i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.gift.present.PresentActivity$b */
    /* JADX INFO: compiled from: PresentActivity.kt */
    public static final class C7277b {
        public C7277b() {
        }

        public C7277b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.gift.present.PresentActivity$c */
    /* JADX INFO: compiled from: PresentActivity.kt */
    public static final class C7278c extends Lambda implements InterfaceC6153a<PresentAdapter> {

        /* JADX INFO: renamed from: g */
        public static final C7278c f33612g = new C7278c();

        public C7278c() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public PresentAdapter mo2c() {
            return new PresentAdapter(null, 1, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33608z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: R */
    public BaseViewModel mo13969R() {
        return (PresentViewModel) this.f33604A.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f33607D == null) {
            this.f33607D = new HashMap();
        }
        View view = (View) this.f33607D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33607D.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: V */
    public RecyclerView.AbstractC0160m mo13979V() {
        return new GridLayoutManager(this, 3);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: W */
    public BaseListAdapter<Present, ? extends ViewDataBinding> mo13980W() {
        return (BaseListAdapter) this.f33605B.getValue();
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
        this.f33606C = getIntent().getIntExtra("receiver_id", 0);
        ((PresentViewModel) this.f33604A.getValue()).f31595s.mo427j(Integer.valueOf(this.f33606C));
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) mo13978U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) mo13978U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14597q(R.string.txt_gifts);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
        BaseListAdapter<Present, ? extends ViewDataBinding> baseListAdapterMo13980W = mo13980W();
        Objects.requireNonNull(baseListAdapterMo13980W, "null cannot be cast to non-null type mtp.media.karaoke.ui.screen.gift.present.PresentAdapter");
        ((PresentAdapter) baseListAdapterMo13980W).f31590f = (SkuDao.a.m14104q(this) / 3) - 6;
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
