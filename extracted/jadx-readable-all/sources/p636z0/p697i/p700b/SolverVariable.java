package p636z0.p697i.p700b;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.i.b.g, reason: use source file name */
/* JADX INFO: compiled from: SolverVariable.java */
/* JADX INFO: loaded from: classes.dex */
public class SolverVariable {

    /* JADX INFO: renamed from: a */
    public static int f36764a = 1;

    /* JADX INFO: renamed from: b */
    public boolean f36765b;

    /* JADX INFO: renamed from: c */
    public String f36766c;

    /* JADX INFO: renamed from: d */
    public int f36767d;

    /* JADX INFO: renamed from: e */
    public int f36768e;

    /* JADX INFO: renamed from: f */
    public int f36769f;

    /* JADX INFO: renamed from: g */
    public float f36770g;

    /* JADX INFO: renamed from: h */
    public boolean f36771h;

    /* JADX INFO: renamed from: i */
    public float[] f36772i;

    /* JADX INFO: renamed from: j */
    public float[] f36773j;

    /* JADX INFO: renamed from: k */
    public a f36774k;

    /* JADX INFO: renamed from: l */
    public ArrayRow[] f36775l;

    /* JADX INFO: renamed from: m */
    public int f36776m;

    /* JADX INFO: renamed from: n */
    public int f36777n;

    /* JADX INFO: renamed from: o */
    public int f36778o;

    /* JADX INFO: renamed from: z0.i.b.g$a */
    /* JADX INFO: compiled from: SolverVariable.java */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, a aVar) {
        this.f36767d = -1;
        this.f36768e = -1;
        this.f36769f = 0;
        this.f36771h = false;
        this.f36772i = new float[9];
        this.f36773j = new float[9];
        this.f36775l = new ArrayRow[16];
        this.f36776m = 0;
        this.f36777n = 0;
        this.f36778o = -1;
        this.f36766c = str;
        this.f36774k = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m15713a(ArrayRow arrayRow) {
        int i = 0;
        while (true) {
            int i2 = this.f36776m;
            if (i >= i2) {
                ArrayRow[] arrayRowArr = this.f36775l;
                if (i2 >= arrayRowArr.length) {
                    this.f36775l = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.f36775l;
                int i3 = this.f36776m;
                arrayRowArr2[i3] = arrayRow;
                this.f36776m = i3 + 1;
                return;
            }
            if (this.f36775l[i] == arrayRow) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15714b(ArrayRow arrayRow) {
        int i = this.f36776m;
        int i2 = 0;
        while (i2 < i) {
            if (this.f36775l[i2] == arrayRow) {
                while (i2 < i - 1) {
                    ArrayRow[] arrayRowArr = this.f36775l;
                    int i3 = i2 + 1;
                    arrayRowArr[i2] = arrayRowArr[i3];
                    i2 = i3;
                }
                this.f36776m--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15715c() {
        this.f36766c = null;
        this.f36774k = a.UNKNOWN;
        this.f36769f = 0;
        this.f36767d = -1;
        this.f36768e = -1;
        this.f36770g = 0.0f;
        this.f36771h = false;
        this.f36778o = -1;
        int i = this.f36776m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f36775l[i2] = null;
        }
        this.f36776m = 0;
        this.f36777n = 0;
        this.f36765b = false;
        Arrays.fill(this.f36773j, 0.0f);
    }

    /* JADX INFO: renamed from: d */
    public void m15716d(LinearSystem linearSystem, float f) {
        this.f36770g = f;
        this.f36771h = true;
        this.f36778o = -1;
        int i = this.f36776m;
        this.f36768e = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f36775l[i2].m15686k(linearSystem, this, false);
        }
        this.f36776m = 0;
    }

    /* JADX INFO: renamed from: e */
    public final void m15717e(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i = this.f36776m;
        for (int i2 = 0; i2 < i; i2++) {
            this.f36775l[i2].mo15687l(linearSystem, arrayRow, false);
        }
        this.f36776m = 0;
    }

    public String toString() {
        if (this.f36766c != null) {
            StringBuilder sbM1556G = outline.m1556G("");
            sbM1556G.append(this.f36766c);
            return sbM1556G.toString();
        }
        StringBuilder sbM1556G2 = outline.m1556G("");
        sbM1556G2.append(this.f36767d);
        return sbM1556G2.toString();
    }

    public SolverVariable(a aVar, String str) {
        this.f36767d = -1;
        this.f36768e = -1;
        this.f36769f = 0;
        this.f36771h = false;
        this.f36772i = new float[9];
        this.f36773j = new float[9];
        this.f36775l = new ArrayRow[16];
        this.f36776m = 0;
        this.f36777n = 0;
        this.f36778o = -1;
        this.f36774k = aVar;
    }
}
