package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import java.util.Arrays;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a.d;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2644b<O extends C2628a.d> {

    /* JADX INFO: renamed from: a */
    public final int f11629a;

    /* JADX INFO: renamed from: b */
    public final C2628a<O> f11630b;

    /* JADX INFO: renamed from: c */
    public final O f11631c;

    public C2644b(C2628a<O> c2628a, O o) {
        this.f11630b = c2628a;
        this.f11631c = o;
        this.f11629a = Arrays.hashCode(new Object[]{c2628a, o});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2644b)) {
            return false;
        }
        C2644b c2644b = (C2644b) obj;
        Objects.requireNonNull(c2644b);
        return C2622l.m5459y(this.f11630b, c2644b.f11630b) && C2622l.m5459y(this.f11631c, c2644b.f11631c);
    }

    public final int hashCode() {
        return this.f11629a;
    }
}
