package p007c.p190n.p194b.p266d.p298f.p306t;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: renamed from: c.n.b.d.f.t.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class C2779b {
    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public static String m5619a(@RecentlyNonNull PowerManager.WakeLock wakeLock, @RecentlyNonNull String str) {
        String strValueOf = String.valueOf(String.valueOf(((long) System.identityHashCode(wakeLock)) | (((long) Process.myPid()) << 32)));
        String strValueOf2 = String.valueOf(true == TextUtils.isEmpty(null) ? "" : null);
        return strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
    }
}
