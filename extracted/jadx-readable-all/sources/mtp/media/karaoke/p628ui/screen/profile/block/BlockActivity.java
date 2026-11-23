package mtp.media.karaoke.p628ui.screen.profile.block;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
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
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p573i.p575d0.BlockActivity2;
import p555j.p556a.p557a.p558a.p559a.p573i.p575d0.BlockAdapter;
import p555j.p556a.p557a.p558a.p559a.p573i.p575d0.BlockViewModel;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.BlockActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: BlockActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BlockActivity extends BaseLoadMoreRefreshActivity<BlockActivityBinding, BlockViewModel, User> {

    /* JADX INFO: renamed from: y */
    public static final C7322c f33812y = new C7322c(null);

    /* JADX INFO: renamed from: A */
    public final Lazy3 f33813A;

    /* JADX INFO: renamed from: B */
    public final Lazy3 f33814B;

    /* JADX INFO: renamed from: C */
    public final Lazy3 f33815C;

    /* JADX INFO: renamed from: D */
    public HashMap f33816D;

    /* JADX INFO: renamed from: z */
    public final int f33817z = R.layout.block_activity;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.block.BlockActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7320a extends Lambda implements InterfaceC6153a<BlockViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33818g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33819h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33820i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7320a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33818g = viewModelStoreOwner;
            this.f33819h = qualifier;
            this.f33820i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.d0.e] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public BlockViewModel mo2c() {
            return SkuDao.a.m14107t(this.f33818g, Reflection.m13097a(BlockViewModel.class), this.f33819h, this.f33820i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.block.BlockActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7321b extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33821g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33822h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33823i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7321b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33821g = viewModelStoreOwner;
            this.f33822h = qualifier;
            this.f33823i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33821g, Reflection.m13097a(ProfileViewModel6.class), this.f33822h, this.f33823i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.block.BlockActivity$c */
    /* JADX INFO: compiled from: BlockActivity.kt */
    public static final class C7322c {
        public C7322c() {
        }

        public C7322c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.block.BlockActivity$d */
    /* JADX INFO: compiled from: BlockActivity.kt */
    public static final class C7323d extends Lambda implements InterfaceC6153a<BlockAdapter> {
        public C7323d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public BlockAdapter mo2c() {
            return new BlockAdapter(new BlockActivity2(this));
        }
    }

    public BlockActivity() {
        Lazy4 lazy4 = Lazy4.NONE;
        this.f33813A = LazyJVM.m13020a(lazy4, new C7320a(this, null, null));
        this.f33814B = LazyJVM.m13020a(lazy4, new C7321b(this, null, null));
        this.f33815C = LazyJVM.m13021b(new C7323d());
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33817z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f33816D == null) {
            this.f33816D = new HashMap();
        }
        View view = (View) this.f33816D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33816D.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: W */
    public BaseListAdapter<User, ? extends ViewDataBinding> mo13980W() {
        return (BaseListAdapter) this.f33815C.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: X */
    public void mo13981X() {
        BackgroundMessageView backgroundMessageView = (BackgroundMessageView) mo13978U(R.id.statusView);
        Intrinsics2.m13088d(backgroundMessageView, "statusView");
        SkuDao.a.m14068T(backgroundMessageView);
        ((BackgroundMessageView) mo13978U(R.id.statusView)).m14471b(R.drawable.ic_no_user, R.string.message_block_empty, null);
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public BlockViewModel mo13969R() {
        return (BlockViewModel) this.f33813A.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) mo13978U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) mo13978U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14597q(R.string.title_blocks);
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
