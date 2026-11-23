package p007c.p190n.p194b.p266d.p298f.p299o;

import androidx.annotation.RecentlyNonNull;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2606d;

/* JADX INFO: renamed from: c.n.b.d.f.o.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2640m extends UnsupportedOperationException {

    /* JADX INFO: renamed from: f */
    public final C2606d f11626f;

    public C2640m(@RecentlyNonNull C2606d c2606d) {
        this.f11626f = c2606d;
    }

    @Override // java.lang.Throwable
    @RecentlyNonNull
    public String getMessage() {
        String strValueOf = String.valueOf(this.f11626f);
        return outline.m1550A(new StringBuilder(strValueOf.length() + 8), "Missing ", strValueOf);
    }
}
