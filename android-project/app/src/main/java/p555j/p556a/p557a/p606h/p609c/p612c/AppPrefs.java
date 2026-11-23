package p555j.p556a.p557a.p606h.p609c.p612c;

import android.content.SharedPreferences;
import p007c.p190n.p430e.Gson6;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.h.c.c.a, reason: use source file name */
/* JADX INFO: compiled from: AppPrefs.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AppPrefs implements PrefHelper {

    /* JADX INFO: renamed from: j.a.a.h.c.c.a$a */
    /* JADX INFO: compiled from: AppPrefs.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        new a(null);
    }

    public AppPrefs(SharedPreferences sharedPreferences, Gson6 gson6) {
        Intrinsics2.m13089e(sharedPreferences, "sharedPreferences");
        Intrinsics2.m13089e(gson6, "gson");
    }
}
