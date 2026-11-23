package p007c.p190n.p194b.p266d.p298f.p302q;

import android.content.Context;
import android.content.ServiceConnection;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: renamed from: c.n.b.d.f.q.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2738j {

    /* JADX INFO: renamed from: a */
    public static final Object f11881a = new Object();

    /* JADX INFO: renamed from: b */
    public static AbstractC2738j f11882b;

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public static AbstractC2738j m5599a(@RecentlyNonNull Context context) {
        synchronized (f11881a) {
            if (f11882b == null) {
                f11882b = new C2722d1(context.getApplicationContext());
            }
        }
        return f11882b;
    }

    /* JADX INFO: renamed from: b */
    public abstract boolean mo5585b(C2713a1 c2713a1, ServiceConnection serviceConnection, String str);

    /* JADX INFO: renamed from: c */
    public abstract void mo5586c(C2713a1 c2713a1, ServiceConnection serviceConnection, String str);
}
