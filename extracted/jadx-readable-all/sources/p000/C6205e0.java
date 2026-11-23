package p000;

import android.content.SharedPreferences;
import java.util.Objects;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import mtp.media.karaoke.p628ui.screen.user.UserActivity;
import p007c.p190n.p430e.GsonBuilder;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p558a.p559a.p573i.ProfileViewModel6;
import p555j.p556a.p557a.p558a.p559a.p583m.LoginFragment2;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: e0 */
/* JADX INFO: compiled from: kotlin-style lambda group */
/* JADX INFO: loaded from: classes.dex */
public final class C6205e0 extends Lambda implements InterfaceC6164l<User, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f29613g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f29614h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6205e0(int i, Object obj) {
        super(1);
        this.f29613g = i;
        this.f29614h = obj;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public final Unit mo3b(User user) {
        int i = this.f29613g;
        if (i == 0) {
            User user2 = user;
            Intrinsics2.m13089e(user2, "it");
            UserActivity userActivity = UserActivity.this;
            UserActivity.C7376c c7376c = UserActivity.f34007y;
            Objects.requireNonNull(userActivity);
            int id = user2.getId();
            SharedPreferences sharedPreferences = ModelPrefs.f32358a;
            if (sharedPreferences == null) {
                Intrinsics2.m13096l("preferences");
                throw null;
            }
            User user3 = (User) new GsonBuilder().m12322a().m12315b(sharedPreferences.getString("current_user", null), User.class);
            if (user3 == null || id != user3.getId()) {
                userActivity.m13971T(ProfileActivity.f33786u.m14415a(userActivity, user2.getId()));
            }
            return Unit.f29502a;
        }
        if (i != 1) {
            throw null;
        }
        User user4 = user;
        Intrinsics2.m13089e(user4, "it");
        UserActivity userActivity2 = UserActivity.this;
        UserActivity.C7376c c7376c2 = UserActivity.f34007y;
        Objects.requireNonNull(userActivity2);
        SharedPreferences sharedPreferences2 = ModelPrefs.f32358a;
        if (sharedPreferences2 == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        if (((User) new GsonBuilder().m12322a().m12315b(sharedPreferences2.getString("current_user", null), User.class)) != null) {
            user4.setFollowStatus(!user4.getFollowStatus());
            ((ProfileViewModel6) userActivity2.f34009B.getValue()).m13921p(user4.getId(), user4.getFollowStatus() ? 1 : 2);
        } else {
            LoginFragment2.f31647t0.m13940a(-1).mo5469c1(userActivity2.m16577C(), "LoginForm");
        }
        return Unit.f29502a;
    }
}
