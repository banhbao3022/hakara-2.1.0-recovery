package p007c.p190n.p194b.p266d.p298f.p307u;

import android.content.Context;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.f.u.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2783c {
    /* JADX INFO: renamed from: a */
    public static boolean m5625a(@RecentlyNonNull Context context, @RecentlyNonNull Throwable th) {
        try {
            Objects.requireNonNull(context, "null reference");
            Objects.requireNonNull(th, "null reference");
            return false;
        } catch (Exception e) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e);
            return false;
        }
    }
}
