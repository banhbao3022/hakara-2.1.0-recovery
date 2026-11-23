package p636z0.p725k.p729e;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.k.e.b, reason: use source file name */
/* JADX INFO: compiled from: Insets.java */
/* JADX INFO: loaded from: classes.dex */
public final class Insets {

    /* JADX INFO: renamed from: a */
    public static final Insets f37850a = new Insets(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    public final int f37851b;

    /* JADX INFO: renamed from: c */
    public final int f37852c;

    /* JADX INFO: renamed from: d */
    public final int f37853d;

    /* JADX INFO: renamed from: e */
    public final int f37854e;

    public Insets(int i, int i2, int i3, int i4) {
        this.f37851b = i;
        this.f37852c = i2;
        this.f37853d = i3;
        this.f37854e = i4;
    }

    /* JADX INFO: renamed from: a */
    public static Insets m16166a(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f37850a : new Insets(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static Insets m16167b(android.graphics.Insets insets) {
        return m16166a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: c */
    public android.graphics.Insets m16168c() {
        return android.graphics.Insets.of(this.f37851b, this.f37852c, this.f37853d, this.f37854e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Insets.class != obj.getClass()) {
            return false;
        }
        Insets insets = (Insets) obj;
        return this.f37854e == insets.f37854e && this.f37851b == insets.f37851b && this.f37853d == insets.f37853d && this.f37852c == insets.f37852c;
    }

    public int hashCode() {
        return (((((this.f37851b * 31) + this.f37852c) * 31) + this.f37853d) * 31) + this.f37854e;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Insets{left=");
        sbM1556G.append(this.f37851b);
        sbM1556G.append(", top=");
        sbM1556G.append(this.f37852c);
        sbM1556G.append(", right=");
        sbM1556G.append(this.f37853d);
        sbM1556G.append(", bottom=");
        sbM1556G.append(this.f37854e);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }
}
