package mtp.media.karaoke.p628ui.screen.profile.level;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.util.HashMap;
import mtp.media.karaoke.R;
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
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.LevelActivityBinding;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: LevelActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class LevelActivity extends BaseActivity3<LevelActivityBinding, ProfileViewModel6> {

    /* JADX INFO: renamed from: w */
    public static final C7331b f33843w = new C7331b(null);

    /* JADX INFO: renamed from: x */
    public final int f33844x = R.layout.level_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33845y = LazyJVM.m13020a(Lazy4.NONE, new C7330a(this, null, null));

    /* JADX INFO: renamed from: z */
    public HashMap f33846z;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.level.LevelActivity$a */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7330a extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33847g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33848h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33849i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7330a(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33847g = viewModelStoreOwner;
            this.f33848h = qualifier;
            this.f33849i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33847g, Reflection.m13097a(ProfileViewModel6.class), this.f33848h, this.f33849i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.level.LevelActivity$b */
    /* JADX INFO: compiled from: LevelActivity.kt */
    public static final class C7331b {
        public C7331b() {
        }

        public C7331b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33844x;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: R */
    public BaseViewModel mo13969R() {
        return (ProfileViewModel6) this.f33845y.getValue();
    }

    /* JADX INFO: renamed from: U */
    public View m14426U(int i) {
        if (this.f33846z == null) {
            this.f33846z = new HashMap();
        }
        View view = (View) this.f33846z.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33846z.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) m14426U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) m14426U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14598r(null);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
        ((ProfileViewModel6) this.f33845y.getValue()).m13922q();
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
