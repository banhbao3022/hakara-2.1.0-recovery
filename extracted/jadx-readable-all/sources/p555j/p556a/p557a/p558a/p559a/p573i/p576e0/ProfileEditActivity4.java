package p555j.p556a.p557a.p558a.p559a.p573i.p576e0;

import android.content.SharedPreferences;
import mtp.media.karaoke.R;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.edit.ProfileEditActivity;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p530b.p531a.EventBus3;
import p555j.p556a.p557a.p558a.p594d.UpdateProfileEvent;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;
import p636z0.p759s.Observer;

/* JADX INFO: renamed from: j.a.a.a.a.i.e0.c, reason: use source file name */
/* JADX INFO: compiled from: ProfileEditActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ProfileEditActivity4<T> implements Observer<User> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ProfileEditActivity.C7329f f31444a;

    public ProfileEditActivity4(ProfileEditActivity.C7329f c7329f) {
        this.f31444a = c7329f;
    }

    @Override // p636z0.p759s.Observer
    /* JADX INFO: renamed from: d */
    public void mo410d(User user) {
        User user2 = user;
        if (user2 != null) {
            Intrinsics2.m13089e("current_user", "key");
            String strM12319f = new GsonBuilder().m12322a().m12319f(user2);
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            outline.m1564O(sharedPreferences, "current_user", strM12319f);
        }
        SkuDao.a.m14092i0(ProfileEditActivity.this, R.string.msg_update_success, 0, 2);
        EventBus3.m13810b().m13815g(new UpdateProfileEvent(true));
    }
}
