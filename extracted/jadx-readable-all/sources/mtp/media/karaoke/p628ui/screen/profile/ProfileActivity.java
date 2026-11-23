package mtp.media.karaoke.p628ui.screen.profile;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.Objects;
import mtp.media.karaoke.R;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p636z0.p644b.p645c.AppCompatActivity;
import p636z0.p752p.p753c.BackStackRecord;

/* JADX INFO: compiled from: ProfileActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileActivity extends AppCompatActivity implements ProfileFragment.InterfaceC7316d {

    /* JADX INFO: renamed from: u */
    public static final C7312a f33786u = new C7312a(null);

    /* JADX INFO: renamed from: v */
    public ProfileFragment f33787v;

    /* JADX INFO: renamed from: mtp.media.karaoke.ui.screen.profile.ProfileActivity$a */
    /* JADX INFO: compiled from: ProfileActivity.kt */
    public static final class C7312a {
        public C7312a() {
        }

        /* JADX INFO: renamed from: a */
        public final Intent m14415a(Context context, int i) {
            Intrinsics2.m13089e(context, "context");
            Intent intent = new Intent(context, (Class<?>) ProfileActivity.class);
            intent.putExtra("user_view_id", i);
            return intent;
        }

        public C7312a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // mtp.media.karaoke.p628ui.screen.profile.ProfileFragment.InterfaceC7316d
    /* JADX INFO: renamed from: a */
    public void mo14329a() {
        this.f143l.m133b();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    @Override // p636z0.p752p.p753c.FragmentActivity, androidx.activity.ComponentActivity, p636z0.p725k.p726c.ComponentActivity2, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.profile_activity);
        SkuDao.a.m14056H(this, false, false, 3);
        int intExtra = getIntent().getIntExtra("user_view_id", 0);
        ProfileFragment profileFragment = (ProfileFragment) m16577C().m16656I("ProfileFragment_" + intExtra);
        this.f33787v = profileFragment;
        if (profileFragment == null) {
            Objects.requireNonNull(ProfileFragment.f33788d0);
            ProfileFragment profileFragment2 = new ProfileFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("viewer", true);
            bundle2.putInt("user_view_id", intExtra);
            profileFragment2.m16540M0(bundle2);
            this.f33787v = profileFragment2;
        }
        BackStackRecord backStackRecord = new BackStackRecord(m16577C());
        Intrinsics2.m13088d(backStackRecord, "supportFragmentManager.beginTransaction()");
        ProfileFragment profileFragment3 = this.f33787v;
        Intrinsics2.m13087c(profileFragment3);
        backStackRecord.m16506i(R.id.fragment_container, profileFragment3, "ProfileFragment_" + intExtra);
        backStackRecord.mo16444c();
    }
}
