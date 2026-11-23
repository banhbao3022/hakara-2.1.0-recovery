package mtp.media.karaoke.p628ui.screen.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.ViewDataBinding;
import com.cgfay.media.CainMediaMetadataRetriever;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.widgets.BackgroundMessageView;
import p000.C6205e0;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p561b.UserAdapter;
import p555j.p556a.p557a.p558a.p559a.p561b.UserViewModel;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p558a.p592b.BaseListAdapter;
import p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.FragmentLoadmoreRefreshBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: UserActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class UserActivity extends BaseLoadMoreRefreshActivity<FragmentLoadmoreRefreshBinding, UserViewModel, User> implements LoginFragment2.c {

    /* JADX INFO: renamed from: y */
    public static final C7376c f34007y = new C7376c(null);

    /* JADX INFO: renamed from: A */
    public final Lazy3 f34008A;

    /* JADX INFO: renamed from: B */
    public final Lazy3 f34009B;

    /* JADX INFO: renamed from: C */
    public final Lazy3 f34010C;

    /* JADX INFO: renamed from: D */
    public HashMap f34011D;

    /* JADX INFO: renamed from: z */
    public final int f34012z = R.layout.user_activity;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.user.UserActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7374a extends Lambda implements InterfaceC6153a<UserViewModel> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f34013g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f34014h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f34015i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7374a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f34013g = viewModelStoreOwner;
            this.f34014h = qualifier;
            this.f34015i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.b.g] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public UserViewModel mo2c() {
            return SkuDao.a.m14107t(this.f34013g, Reflection.m13097a(UserViewModel.class), this.f34014h, this.f34015i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.user.UserActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7375b extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f34016g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f34017h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f34018i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7375b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f34016g = viewModelStoreOwner;
            this.f34017h = qualifier;
            this.f34018i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f34016g, Reflection.m13097a(ProfileViewModel6.class), this.f34017h, this.f34018i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.user.UserActivity$c */
    /* JADX INFO: compiled from: UserActivity.kt */
    public static final class C7376c {
        public C7376c() {
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14464a(Context context, int i, int i2, String str) {
            Intrinsics2.m13089e(context, "context");
            Intent intent = new Intent(context, (Class<?>) UserActivity.class);
            intent.putExtra("mode", i);
            intent.putExtra("id", i2);
            intent.putExtra(CainMediaMetadataRetriever.METADATA_KEY_TITLE, str);
            return intent;
        }

        public C7376c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.user.UserActivity$d */
    /* JADX INFO: compiled from: UserActivity.kt */
    public static final class C7377d extends Lambda implements InterfaceC6153a<UserAdapter> {
        public C7377d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public UserAdapter mo2c() {
            return new UserAdapter(new C6205e0(0, this), new C6205e0(1, this));
        }
    }

    public UserActivity() {
        Lazy4 lazy4 = Lazy4.NONE;
        this.f34008A = LazyJVM.m13020a(lazy4, new C7374a(this, null, null));
        this.f34009B = LazyJVM.m13020a(lazy4, new C7375b(this, null, null));
        this.f34010C = LazyJVM.m13021b(new C7377d());
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f34012z;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: U */
    public View mo13978U(int i) {
        if (this.f34011D == null) {
            this.f34011D = new HashMap();
        }
        View view = (View) this.f34011D.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f34011D.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity
    /* JADX INFO: renamed from: W */
    public BaseListAdapter<User, ? extends ViewDataBinding> mo13980W() {
        return (BaseListAdapter) this.f34010C.getValue();
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
            backgroundMessageView2.m14471b(R.drawable.ic_no_user, R.string.message_user_empty, null);
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public UserViewModel mo13969R() {
        return (UserViewModel) this.f34008A.getValue();
    }

    @Override // p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2.c
    /* JADX INFO: renamed from: g */
    public void mo13941g(int i) {
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseLoadMoreRefreshActivity, p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        mo13969R().f31082s.mo427j(Integer.valueOf(getIntent().getIntExtra("mode", 1)));
        int intExtra = getIntent().getIntExtra("id", 0);
        if (intExtra > 0) {
            mo13969R().f31083t.mo427j(Integer.valueOf(intExtra));
        }
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) mo13978U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) mo13978U(R.id.toolbar));
        String stringExtra = getIntent().getStringExtra(CainMediaMetadataRetriever.METADATA_KEY_TITLE);
        if (stringExtra == null) {
            ActionBar actionBarM14610I = m14610I();
            if (actionBarM14610I != null) {
                actionBarM14610I.mo14597q(R.string.title_find_friend);
            }
        } else {
            ActionBar actionBarM14610I2 = m14610I();
            if (actionBarM14610I2 != null) {
                actionBarM14610I2.mo14598r(stringExtra);
            }
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14593m(true);
        }
        ActionBar actionBarM14610I4 = m14610I();
        if (actionBarM14610I4 != null) {
            actionBarM14610I4.mo14594n(true);
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
