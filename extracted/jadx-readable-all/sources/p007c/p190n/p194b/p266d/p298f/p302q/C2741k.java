package p007c.p190n.p194b.p266d.p298f.p302q;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2741k {

    /* JADX INFO: renamed from: a */
    public final String f11884a;

    /* JADX INFO: renamed from: b */
    public final String f11885b;

    public C2741k(@RecentlyNonNull String str) {
        this(str, null);
    }

    /* JADX INFO: renamed from: a */
    public boolean m5601a(int i) {
        return Log.isLoggable(this.f11884a, i);
    }

    public C2741k(@RecentlyNonNull String str, String str2) {
        C2622l.m5379i(str, "log tag cannot be null");
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.f11884a = str;
        if (str2 == null || str2.length() <= 0) {
            this.f11885b = null;
        } else {
            this.f11885b = str2;
        }
    }
}
