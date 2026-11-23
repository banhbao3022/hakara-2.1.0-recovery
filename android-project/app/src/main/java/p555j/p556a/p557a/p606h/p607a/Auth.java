package p555j.p556a.p557a.p606h.p607a;

import android.content.SharedPreferences;
import mtp.media.karaoke.data.model.User;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p612c.ModelPrefs;

/* JADX INFO: renamed from: j.a.a.h.a.b, reason: use source file name */
/* JADX INFO: compiled from: Auth.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Auth {
    /* JADX INFO: renamed from: a */
    public static final User m14033a() {
        SharedPreferences sharedPreferences = ModelPrefs.f32358a;
        if (sharedPreferences != null) {
            return (User) outline.m1584f(sharedPreferences.getString("current_user", null), User.class);
        }
        Intrinsics2.m13096l("preferences");
        throw null;
    }
}
