package p007c.p190n.p194b.p266d.p298f.p309v;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;

/* JADX INFO: renamed from: c.n.b.d.f.v.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2794c {

    /* JADX INFO: renamed from: a */
    public static C2794c f11959a = new C2794c();

    /* JADX INFO: renamed from: b */
    public C2793b f11960b = null;

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public static C2793b m5637a(@RecentlyNonNull Context context) {
        C2793b c2793b;
        C2794c c2794c = f11959a;
        synchronized (c2794c) {
            if (c2794c.f11960b == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                c2794c.f11960b = new C2793b(context);
            }
            c2793b = c2794c.f11960b;
        }
        return c2793b;
    }
}
