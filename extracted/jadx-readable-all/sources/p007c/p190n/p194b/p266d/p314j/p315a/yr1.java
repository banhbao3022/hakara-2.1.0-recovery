package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yr1 {

    /* JADX INFO: renamed from: a */
    public static final int f21981a;

    /* JADX INFO: renamed from: b */
    public static final ClipData f21982b;

    static {
        f21981a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        f21982b = ClipData.newIntent("", new Intent());
    }

    /* JADX INFO: renamed from: a */
    public static PendingIntent m8828a(Context context, int i, Intent intent, int i2) {
        boolean z = true;
        C2622l.m5371g1((i2 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        C2622l.m5371g1(intent.getComponent() != null, "Must set component on Intent.");
        if (m8829b(0, 1)) {
            C2622l.m5371g1(!m8829b(i2, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !m8829b(i2, 67108864)) {
                z = false;
            }
            C2622l.m5371g1(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !m8829b(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!m8829b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!m8829b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!m8829b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!m8829b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(f21982b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m8829b(int i, int i2) {
        return (i & i2) == i2;
    }
}
