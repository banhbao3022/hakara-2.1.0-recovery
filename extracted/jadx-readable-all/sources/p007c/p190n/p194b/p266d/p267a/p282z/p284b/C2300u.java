package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import java.util.Arrays;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2753q;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2300u {

    /* JADX INFO: renamed from: a */
    public final String f10783a;

    /* JADX INFO: renamed from: b */
    public final double f10784b;

    /* JADX INFO: renamed from: c */
    public final double f10785c;

    /* JADX INFO: renamed from: d */
    public final double f10786d;

    /* JADX INFO: renamed from: e */
    public final int f10787e;

    public C2300u(String str, double d, double d2, double d3, int i) {
        this.f10783a = str;
        this.f10785c = d;
        this.f10784b = d2;
        this.f10786d = d3;
        this.f10787e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2300u)) {
            return false;
        }
        C2300u c2300u = (C2300u) obj;
        return C2622l.m5459y(this.f10783a, c2300u.f10783a) && this.f10784b == c2300u.f10784b && this.f10785c == c2300u.f10785c && this.f10787e == c2300u.f10787e && Double.compare(this.f10786d, c2300u.f10786d) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10783a, Double.valueOf(this.f10784b), Double.valueOf(this.f10785c), Double.valueOf(this.f10786d), Integer.valueOf(this.f10787e)});
    }

    public final String toString() {
        C2753q c2753q = new C2753q(this);
        c2753q.m5608a("name", this.f10783a);
        c2753q.m5608a("minBound", Double.valueOf(this.f10785c));
        c2753q.m5608a("maxBound", Double.valueOf(this.f10784b));
        c2753q.m5608a("percent", Double.valueOf(this.f10786d));
        c2753q.m5608a("count", Integer.valueOf(this.f10787e));
        return c2753q.toString();
    }
}
