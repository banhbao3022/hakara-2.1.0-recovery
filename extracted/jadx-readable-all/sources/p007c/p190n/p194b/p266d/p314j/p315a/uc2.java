package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uc2 {

    /* JADX INFO: renamed from: a */
    public static final uc2 f20269a = new uc2(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: b */
    public static final uc2 f20270b = new uc2(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: c */
    public static final uc2 f20271c = new uc2(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: d */
    public static final uc2 f20272d = new uc2(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: e */
    public final double f20273e;

    /* JADX INFO: renamed from: f */
    public final double f20274f;

    /* JADX INFO: renamed from: g */
    public final double f20275g;

    /* JADX INFO: renamed from: h */
    public final double f20276h;

    /* JADX INFO: renamed from: i */
    public final double f20277i;

    /* JADX INFO: renamed from: j */
    public final double f20278j;

    /* JADX INFO: renamed from: k */
    public final double f20279k;

    /* JADX INFO: renamed from: l */
    public final double f20280l;

    /* JADX INFO: renamed from: m */
    public final double f20281m;

    public uc2(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f20273e = d5;
        this.f20274f = d6;
        this.f20275g = d7;
        this.f20276h = d;
        this.f20277i = d2;
        this.f20278j = d3;
        this.f20279k = d4;
        this.f20280l = d8;
        this.f20281m = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uc2.class != obj.getClass()) {
            return false;
        }
        uc2 uc2Var = (uc2) obj;
        return Double.compare(uc2Var.f20276h, this.f20276h) == 0 && Double.compare(uc2Var.f20277i, this.f20277i) == 0 && Double.compare(uc2Var.f20278j, this.f20278j) == 0 && Double.compare(uc2Var.f20279k, this.f20279k) == 0 && Double.compare(uc2Var.f20280l, this.f20280l) == 0 && Double.compare(uc2Var.f20281m, this.f20281m) == 0 && Double.compare(uc2Var.f20273e, this.f20273e) == 0 && Double.compare(uc2Var.f20274f, this.f20274f) == 0 && Double.compare(uc2Var.f20275g, this.f20275g) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f20273e);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f20274f);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f20275g);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f20276h);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f20277i);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f20278j);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f20279k);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f20280l);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f20281m);
        return (((((((((((((((((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31) + ((int) ((jDoubleToLongBits4 >>> 32) ^ jDoubleToLongBits4))) * 31) + ((int) ((jDoubleToLongBits5 >>> 32) ^ jDoubleToLongBits5))) * 31) + ((int) ((jDoubleToLongBits6 >>> 32) ^ jDoubleToLongBits6))) * 31) + ((int) ((jDoubleToLongBits7 >>> 32) ^ jDoubleToLongBits7))) * 31) + ((int) (jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32)))) * 31) + ((int) ((jDoubleToLongBits9 >>> 32) ^ jDoubleToLongBits9));
    }

    public final String toString() {
        if (equals(f20269a)) {
            return "Rotate 0°";
        }
        if (equals(f20270b)) {
            return "Rotate 90°";
        }
        if (equals(f20271c)) {
            return "Rotate 180°";
        }
        if (equals(f20272d)) {
            return "Rotate 270°";
        }
        double d = this.f20273e;
        double d2 = this.f20274f;
        double d3 = this.f20275g;
        double d4 = this.f20276h;
        double d5 = this.f20277i;
        double d6 = this.f20278j;
        double d7 = this.f20279k;
        double d8 = this.f20280l;
        double d9 = this.f20281m;
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(d);
        sb.append(", v=");
        sb.append(d2);
        sb.append(", w=");
        sb.append(d3);
        sb.append(", a=");
        sb.append(d4);
        sb.append(", b=");
        sb.append(d5);
        sb.append(", c=");
        sb.append(d6);
        sb.append(", d=");
        sb.append(d7);
        sb.append(", tx=");
        sb.append(d8);
        sb.append(", ty=");
        sb.append(d9);
        sb.append("}");
        return sb.toString();
    }
}
