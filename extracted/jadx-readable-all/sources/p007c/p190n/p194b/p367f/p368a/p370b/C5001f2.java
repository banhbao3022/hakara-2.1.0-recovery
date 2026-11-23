package p007c.p190n.p194b.p367f.p368a.p370b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: renamed from: c.n.b.f.a.b.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5001f2 {

    /* JADX INFO: renamed from: a */
    public final Context f25784a;

    public C5001f2(Context context) {
        this.f25784a = context;
    }

    /* JADX INFO: renamed from: a */
    public static String m11443a(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            return bundle.getString("local_testing_dir");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
