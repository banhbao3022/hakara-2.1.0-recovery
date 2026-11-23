package p555j.p556a.p557a.p558a.p559a.p578j.p579i;

import android.content.SharedPreferences;
import java.util.Objects;
import mtp.media.karaoke.data.model.Present;
import mtp.media.karaoke.data.model.User;
import mtp.media.karaoke.p628ui.screen.gift.fan.FanGiftActivity;
import mtp.media.karaoke.p628ui.screen.profile.ProfileActivity;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Unit;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.a.a.j.i.a, reason: use source file name */
/* JADX INFO: compiled from: FanGiftActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FanGiftActivity2 extends Lambda implements InterfaceC6164l<Present, Unit> {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ FanGiftActivity.C7275c f31577g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FanGiftActivity2(FanGiftActivity.C7275c c7275c) {
        super(1);
        this.f31577g = c7275c;
    }

    @Override // p477d1.p493x.p494b.InterfaceC6164l
    /* JADX INFO: renamed from: b */
    public Unit mo3b(Present present) {
        Present present2 = present;
        Intrinsics2.m13089e(present2, "it");
        FanGiftActivity fanGiftActivity = FanGiftActivity.this;
        FanGiftActivity.C7274b c7274b = FanGiftActivity.f33592y;
        Objects.requireNonNull(fanGiftActivity);
        int userId = present2.getUserId();
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences == null) {
            Intrinsics2.m13096l("preferences");
            throw null;
        }
        User user = (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        if (user == null || userId != user.getId()) {
            fanGiftActivity.m13971T(ProfileActivity.f33786u.m14415a(fanGiftActivity, present2.getUserId()));
        }
        return Unit.f29502a;
    }
}
