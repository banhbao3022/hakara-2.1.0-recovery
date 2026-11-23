package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p007c.p190n.p194b.p266d.p298f.p309v.C2794c;

/* JADX INFO: renamed from: c.n.b.d.f.q.n0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2748n0 {

    /* JADX INFO: renamed from: a */
    public static final Object f11889a = new Object();

    /* JADX INFO: renamed from: b */
    public static boolean f11890b;

    /* JADX INFO: renamed from: c */
    public static String f11891c;

    /* JADX INFO: renamed from: d */
    public static int f11892d;

    /* JADX INFO: renamed from: a */
    public static void m5606a(Context context) {
        synchronized (f11889a) {
            if (f11890b) {
                return;
            }
            f11890b = true;
            try {
                Bundle bundle = C2794c.m5637a(context).m5633a(context.getPackageName(), 128).metaData;
                if (bundle == null) {
                    return;
                }
                f11891c = bundle.getString("com.google.app.id");
                f11892d = bundle.getInt("com.google.android.gms.version");
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("MetadataValueReader", "This should never happen.", e);
            }
        }
    }
}
