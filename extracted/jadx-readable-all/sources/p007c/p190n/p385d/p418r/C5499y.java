package p007c.p190n.p385d.p418r;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
import p007c.p190n.p194b.p266d.p332m.C4763a;

/* JADX INFO: renamed from: c.n.d.r.y */
/* JADX INFO: compiled from: com.google.firebase:firebase-iid@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5499y {

    /* JADX INFO: renamed from: a */
    public static final long f27114a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: b */
    public static final Object f27115b = new Object();

    /* JADX INFO: renamed from: c */
    public static C4763a f27116c;

    /* JADX INFO: renamed from: a */
    public static ComponentName m12092a(Context context, Intent intent) {
        synchronized (f27115b) {
            if (f27116c == null) {
                C4763a c4763a = new C4763a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
                f27116c = c4763a;
                c4763a.f24657c.setReferenceCounted(true);
                c4763a.f24662h = true;
            }
            boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
            intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
            ComponentName componentNameStartService = context.startService(intent);
            if (componentNameStartService == null) {
                return null;
            }
            if (!booleanExtra) {
                f27116c.m10919a(f27114a);
            }
            return componentNameStartService;
        }
    }
}
