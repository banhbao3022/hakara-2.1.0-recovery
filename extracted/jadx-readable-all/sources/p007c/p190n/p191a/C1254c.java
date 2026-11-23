package p007c.p190n.p191a;

import androidx.annotation.RecentlyNonNull;
import p007c.p190n.p194b.p266d.p267a.C2177g;

/* JADX INFO: renamed from: c.n.a.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class C1254c {

    /* JADX INFO: renamed from: a */
    @RecentlyNonNull
    public static final C1254c f5497a = new C1254c(-1, -2, "mb");

    /* JADX INFO: renamed from: b */
    @RecentlyNonNull
    public static final C1254c f5498b = new C1254c(320, 50, "mb");

    /* JADX INFO: renamed from: c */
    @RecentlyNonNull
    public static final C1254c f5499c = new C1254c(300, 250, "as");

    /* JADX INFO: renamed from: d */
    @RecentlyNonNull
    public static final C1254c f5500d = new C1254c(468, 60, "as");

    /* JADX INFO: renamed from: e */
    @RecentlyNonNull
    public static final C1254c f5501e = new C1254c(728, 90, "as");

    /* JADX INFO: renamed from: f */
    @RecentlyNonNull
    public static final C1254c f5502f = new C1254c(160, 600, "as");

    /* JADX INFO: renamed from: g */
    public final C2177g f5503g;

    public C1254c(int i, int i2) {
        this(new C2177g(i, i2));
    }

    public C1254c(@RecentlyNonNull C2177g c2177g) {
        this.f5503g = c2177g;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof C1254c) {
            return this.f5503g.equals(((C1254c) obj).f5503g);
        }
        return false;
    }

    public int hashCode() {
        return this.f5503g.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f5503g.f10568m;
    }

    public C1254c(int i, int i2, String str) {
        this(new C2177g(i, i2));
    }
}
