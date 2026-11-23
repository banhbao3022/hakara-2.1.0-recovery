package p007c.p190n.p194b.p266d.p298f.p309v;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.v.a */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2792a {

    /* JADX INFO: renamed from: a */
    public static Context f11956a;

    /* JADX INFO: renamed from: b */
    public static Boolean f11957b;

    /* JADX INFO: renamed from: a */
    public static synchronized boolean m5632a(@RecentlyNonNull Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f11956a;
        if (context2 != null && (bool = f11957b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f11957b = null;
        if (C2622l.m5464z()) {
            f11957b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f11957b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f11957b = Boolean.FALSE;
            }
        }
        f11956a = applicationContext;
        return f11957b.booleanValue();
    }
}
