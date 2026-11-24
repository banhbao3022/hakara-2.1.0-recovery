package mtp.media.karaoke.p628ui.screen.setting;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import java.io.File;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Objects;
import mtp.media.karaoke.R;
import mtp.media.karaoke.p628ui.screen.profile.block.BlockActivity;
import mtp.media.karaoke.p628ui.screen.profile.edit.ProfileEditActivity;
import mtp.media.karaoke.p628ui.screen.profile.level.LevelActivity;
import mtp.media.karaoke.p628ui.screen.wallet.WalletActivity;
import p477d1.Lazy3;
import p477d1.Lazy4;
import p477d1.LazyJVM;
import p477d1.Unit;
import p477d1.p492w.Utils7;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p477d1.p493x.p495c.Reflection;
import p526i1.p536d.p543c.p551n.Qualifier;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p588p.SettingActivity2;
import p555j.p556a.p557a.p558a.p592b.BaseActivity3;
import p555j.p556a.p557a.p558a.p592b.BaseViewModel;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p616i.SettingActivityBinding;
import p555j.p556a.p557a.p619l.LinkUtils2;
import p555j.p556a.p557a.p619l.PathUtils;
import p636z0.p644b.p645c.ActionBar;
import p636z0.p759s.ViewModelStoreOwner;

/* JADX INFO: compiled from: SettingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SettingActivity extends BaseActivity3<SettingActivityBinding, ProfileViewModel6> {

    /* JADX INFO: renamed from: w */
    public static final C7345c f33886w = new C7345c(null);

    /* JADX INFO: renamed from: x */
    public final int f33887x = R.layout.setting_activity;

    /* JADX INFO: renamed from: y */
    public final Lazy3 f33888y = LazyJVM.m13020a(Lazy4.NONE, new C7344b(this, null, null));

    /* JADX INFO: renamed from: z */
    public HashMap f33889z;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.setting.SettingActivity$a */
    /* JADX INFO: compiled from: kotlin-style lambda group */
    /* JADX INFO: loaded from: classes.dex */
    public static final class C7343a extends Lambda implements InterfaceC6153a<Unit> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f33890g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Object f33891h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7343a(int i, Object obj) {
            super(0);
            this.f33890g = i;
            this.f33891h = obj;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final Unit mo2c() {
            switch (this.f33890g) {
                case 0:
                    ProfileEditActivity.C7326c c7326c = ProfileEditActivity.f33825w;
                    SettingActivity settingActivity = (SettingActivity) this.f33891h;
                    Objects.requireNonNull(c7326c);
                    Intrinsics2.m13089e(settingActivity, "context");
                    ((SettingActivity) this.f33891h).m13971T(new Intent(settingActivity, (Class<?>) ProfileEditActivity.class));
                    return Unit.f29502a;
                case 1:
                    ((SettingActivity) this.f33891h).m13971T(WalletActivity.f34028w.m14467a((SettingActivity) this.f33891h));
                    return Unit.f29502a;
                case 2:
                    LevelActivity.C7331b c7331b = LevelActivity.f33843w;
                    SettingActivity settingActivity2 = (SettingActivity) this.f33891h;
                    Objects.requireNonNull(c7331b);
                    Intrinsics2.m13089e(settingActivity2, "context");
                    ((SettingActivity) this.f33891h).m13971T(new Intent(settingActivity2, (Class<?>) LevelActivity.class));
                    return Unit.f29502a;
                case 3:
                    BlockActivity.C7322c c7322c = BlockActivity.f33812y;
                    SettingActivity settingActivity3 = (SettingActivity) this.f33891h;
                    Objects.requireNonNull(c7322c);
                    Intrinsics2.m13089e(settingActivity3, "context");
                    ((SettingActivity) this.f33891h).m13971T(new Intent(settingActivity3, (Class<?>) BlockActivity.class));
                    return Unit.f29502a;
                case 4:
                    Utils7.m13078a(new File(PathUtils.m14258d((SettingActivity) this.f33891h)));
                    TextView textView = (TextView) ((SettingActivity) this.f33891h).m14433U(R.id.lblCapacity);
                    Intrinsics2.m13088d(textView, "lblCapacity");
                    textView.setText("0 MB");
                    SkuDao.a.m14092i0((SettingActivity) this.f33891h, R.string.text_clear_cache_success, 0, 2);
                    return Unit.f29502a;
                case 5:
                    LinkUtils2.m14254a("http://10.0.2.2:3000/privacy", (SettingActivity) this.f33891h);
                    return Unit.f29502a;
                case 6:
                    LinkUtils2.m14254a("http://10.0.2.2:3000/terms", (SettingActivity) this.f33891h);
                    return Unit.f29502a;
                case 7:
                    ((SettingActivity) this.f33891h).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.me/296638503839388")));
                    return Unit.f29502a;
                default:
                    throw null;
            }
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.setting.SettingActivity$b */
    /* JADX INFO: compiled from: ViewModelStoreOwnerExt.kt */
    public static final class C7344b extends Lambda implements InterfaceC6153a<ProfileViewModel6> {

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ViewModelStoreOwner f33892g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f33893h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ InterfaceC6153a f33894i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7344b(ViewModelStoreOwner viewModelStoreOwner, Qualifier qualifier, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f33892g = viewModelStoreOwner;
            this.f33893h = qualifier;
            this.f33894i = interfaceC6153a;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, j.a.a.a.a.i.z] */
        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public ProfileViewModel6 mo2c() {
            return SkuDao.a.m14107t(this.f33892g, Reflection.m13097a(ProfileViewModel6.class), this.f33893h, this.f33894i);
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.setting.SettingActivity$c */
    /* JADX INFO: compiled from: SettingActivity.kt */
    public static final class C7345c {
        public C7345c() {
        }

        public C7345c(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.setting.SettingActivity$d */
    /* JADX INFO: compiled from: SettingActivity.kt */
    public static final class C7346d extends Lambda implements InterfaceC6153a<Unit> {
        public C7346d() {
            super(0);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public Unit mo2c() {
            SettingActivity settingActivity = SettingActivity.this;
            SkuDao.a.m14069U(settingActivity, settingActivity.getString(R.string.text_logout), SettingActivity.this.getString(R.string.text_message_logout), SettingActivity.this.getString(R.string.text_yes), new SettingActivity2(this), SettingActivity.this.getString(R.string.text_no), null, false, true, 96);
            return Unit.f29502a;
        }
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: P */
    public int mo13967P() {
        return this.f33887x;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3
    /* JADX INFO: renamed from: R */
    public BaseViewModel mo13969R() {
        return (ProfileViewModel6) this.f33888y.getValue();
    }

    /* JADX INFO: renamed from: U */
    public View m14433U(int i) {
        if (this.f33889z == null) {
            this.f33889z = new HashMap();
        }
        View view = (View) this.f33889z.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        this.f33889z.put(Integer.valueOf(i), viewFindViewById);
        return viewFindViewById;
    }

    @Override // p555j.p556a.p557a.p558a.p592b.BaseActivity3, p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) throws PackageManager.NameNotFoundException {
        String str;
        super.onCreate(bundle);
        SkuDao.a.m14056H(this, false, false, 3);
        int iM14105r = SkuDao.a.m14105r(this);
        AppBarLayout appBarLayout = (AppBarLayout) m14433U(R.id.appBar);
        Intrinsics2.m13088d(appBarLayout, "appBar");
        SkuDao.a.m14066R(appBarLayout, iM14105r);
        m14615N((Toolbar) m14433U(R.id.toolbar));
        ActionBar actionBarM14610I = m14610I();
        if (actionBarM14610I != null) {
            actionBarM14610I.mo14597q(R.string.txt_setting);
        }
        ActionBar actionBarM14610I2 = m14610I();
        if (actionBarM14610I2 != null) {
            actionBarM14610I2.mo14593m(true);
        }
        ActionBar actionBarM14610I3 = m14610I();
        if (actionBarM14610I3 != null) {
            actionBarM14610I3.mo14594n(true);
        }
        TextView textView = (TextView) m14433U(R.id.editProfile);
        Intrinsics2.m13088d(textView, "editProfile");
        SkuDao.a.m14067S(textView, new C7343a(0, this));
        TextView textView2 = (TextView) m14433U(R.id.btnWallet);
        Intrinsics2.m13088d(textView2, "btnWallet");
        SkuDao.a.m14067S(textView2, new C7343a(1, this));
        TextView textView3 = (TextView) m14433U(R.id.btnLevel);
        Intrinsics2.m13088d(textView3, "btnLevel");
        SkuDao.a.m14067S(textView3, new C7343a(2, this));
        TextView textView4 = (TextView) m14433U(R.id.btnBlocks);
        Intrinsics2.m13088d(textView4, "btnBlocks");
        SkuDao.a.m14067S(textView4, new C7343a(3, this));
        TextView textView5 = (TextView) m14433U(R.id.lblCapacity);
        Intrinsics2.m13088d(textView5, "lblCapacity");
        long jM14257c = PathUtils.m14257c(new File(PathUtils.m14258d(this)));
        if (jM14257c <= 0) {
            str = "0 MB";
        } else {
            double d = jM14257c;
            int iLog10 = (int) (Math.log10(d) / Math.log10(1024.0d));
            str = new DecimalFormat("#,##0.#").format(d / Math.pow(1024.0d, iLog10)) + " " + new String[]{"B", "KB", "MB", "GB", "TB"}[iLog10];
        }
        textView5.setText(str);
        RelativeLayout relativeLayout = (RelativeLayout) m14433U(R.id.clearCache);
        Intrinsics2.m13088d(relativeLayout, "clearCache");
        SkuDao.a.m14067S(relativeLayout, new C7343a(4, this));
        PackageInfo packageInfo = getPackageManager().getPackageInfo(getPackageName(), 1);
        TextView textView6 = (TextView) m14433U(R.id.checkVersion);
        Intrinsics2.m13088d(textView6, "checkVersion");
        textView6.setText(packageInfo.versionName);
        TextView textView7 = (TextView) m14433U(R.id.btnPrivacy);
        Intrinsics2.m13088d(textView7, "btnPrivacy");
        SkuDao.a.m14067S(textView7, new C7343a(5, this));
        TextView textView8 = (TextView) m14433U(R.id.btnTerms);
        Intrinsics2.m13088d(textView8, "btnTerms");
        SkuDao.a.m14067S(textView8, new C7343a(6, this));
        TextView textView9 = (TextView) m14433U(R.id.btnSupport);
        Intrinsics2.m13088d(textView9, "btnSupport");
        SkuDao.a.m14067S(textView9, new C7343a(7, this));
        TextView textView10 = (TextView) m14433U(R.id.btnLogout);
        Intrinsics2.m13088d(textView10, "btnLogout");
        SkuDao.a.m14067S(textView10, new C7346d());
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
