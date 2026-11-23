package p007c.p190n.p438f.p441j.p442d;

/* JADX INFO: renamed from: c.n.f.j.d.a, reason: use source file name */
/* JADX INFO: compiled from: GenericGF.java */
/* JADX INFO: loaded from: classes.dex */
public final class GenericGF {

    /* JADX INFO: renamed from: a */
    public static final GenericGF f27679a = new GenericGF(4201, 4096, 1);

    /* JADX INFO: renamed from: b */
    public static final GenericGF f27680b = new GenericGF(1033, 1024, 1);

    /* JADX INFO: renamed from: c */
    public static final GenericGF f27681c = new GenericGF(67, 64, 1);

    /* JADX INFO: renamed from: d */
    public static final GenericGF f27682d = new GenericGF(19, 16, 1);

    /* JADX INFO: renamed from: e */
    public static final GenericGF f27683e = new GenericGF(285, 256, 0);

    /* JADX INFO: renamed from: f */
    public static final GenericGF f27684f = new GenericGF(301, 256, 1);

    /* JADX INFO: renamed from: g */
    public final int[] f27685g;

    /* JADX INFO: renamed from: h */
    public final int[] f27686h;

    /* JADX INFO: renamed from: i */
    public final GenericGFPoly f27687i;

    /* JADX INFO: renamed from: j */
    public final int f27688j;

    /* JADX INFO: renamed from: k */
    public final int f27689k;

    /* JADX INFO: renamed from: l */
    public final int f27690l;

    public GenericGF(int i, int i2, int i3) {
        this.f27689k = i;
        this.f27688j = i2;
        this.f27690l = i3;
        this.f27685g = new int[i2];
        this.f27686h = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f27685g[i5] = i4;
            i4 <<= 1;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.f27686h[this.f27685g[i6]] = i6;
        }
        this.f27687i = new GenericGFPoly(this, new int[]{0});
        new GenericGFPoly(this, new int[]{1});
    }

    /* JADX INFO: renamed from: a */
    public int m12351a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f27685g;
        int[] iArr2 = this.f27686h;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f27688j - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f27689k) + ',' + this.f27688j + ')';
    }
}
