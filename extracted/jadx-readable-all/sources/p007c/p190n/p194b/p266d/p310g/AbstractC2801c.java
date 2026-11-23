package p007c.p190n.p194b.p266d.p310g;

import android.content.Context;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2618j;

/* JADX INFO: renamed from: c.n.b.d.g.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2801c<T> {

    /* JADX INFO: renamed from: a */
    public final String f11965a;

    /* JADX INFO: renamed from: b */
    public T f11966b;

    /* JADX INFO: renamed from: c.n.b.d.g.c$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public static class a extends Exception {
        public a(@RecentlyNonNull String str) {
            super(str);
        }

        public a(@RecentlyNonNull String str, @RecentlyNonNull Throwable th) {
            super(str, th);
        }
    }

    public AbstractC2801c(@RecentlyNonNull String str) {
        this.f11965a = str;
    }

    @RecentlyNonNull
    /* JADX INFO: renamed from: a */
    public abstract T mo5640a(@RecentlyNonNull IBinder iBinder);

    @RecentlyNonNull
    /* JADX INFO: renamed from: b */
    public final T m5641b(@RecentlyNonNull Context context) throws a {
        if (this.f11966b == null) {
            Objects.requireNonNull(context, "null reference");
            Context contextM5215a = C2618j.m5215a(context);
            if (contextM5215a == null) {
                throw new a("Could not get remote context.");
            }
            try {
                this.f11966b = mo5640a((IBinder) contextM5215a.getClassLoader().loadClass(this.f11965a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new a("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new a("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new a("Could not instantiate creator.", e3);
            }
        }
        return this.f11966b;
    }
}
