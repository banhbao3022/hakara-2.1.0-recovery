package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.k.b.p4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4630p4 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4663s4 f24267a;

    public C4630p4(InterfaceC4663s4 interfaceC4663s4) {
        Objects.requireNonNull(interfaceC4663s4, "null reference");
        this.f24267a = interfaceC4663s4;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10714a(Context context) {
        ActivityInfo receiverInfo;
        Objects.requireNonNull(context, "null reference");
        try {
            PackageManager packageManager = context.getPackageManager();
            return (packageManager == null || (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) == null || !receiverInfo.enabled) ? false : true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
