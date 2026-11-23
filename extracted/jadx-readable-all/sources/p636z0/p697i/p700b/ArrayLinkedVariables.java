package p636z0.p697i.p700b;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.i.b.a, reason: use source file name */
/* JADX INFO: compiled from: ArrayLinkedVariables.java */
/* JADX INFO: loaded from: classes.dex */
public class ArrayLinkedVariables implements ArrayRow.a {

    /* JADX INFO: renamed from: b */
    public final ArrayRow f36719b;

    /* JADX INFO: renamed from: c */
    public final Cache3 f36720c;

    /* JADX INFO: renamed from: a */
    public int f36718a = 0;

    /* JADX INFO: renamed from: d */
    public int f36721d = 8;

    /* JADX INFO: renamed from: e */
    public int[] f36722e = new int[8];

    /* JADX INFO: renamed from: f */
    public int[] f36723f = new int[8];

    /* JADX INFO: renamed from: g */
    public float[] f36724g = new float[8];

    /* JADX INFO: renamed from: h */
    public int f36725h = -1;

    /* JADX INFO: renamed from: i */
    public int f36726i = -1;

    /* JADX INFO: renamed from: j */
    public boolean f36727j = false;

    public ArrayLinkedVariables(ArrayRow arrayRow, Cache3 cache3) {
        this.f36719b = arrayRow;
        this.f36720c = cache3;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: a */
    public int mo15665a() {
        return this.f36718a;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: b */
    public SolverVariable mo15666b(int i) {
        int i2 = this.f36725h;
        for (int i3 = 0; i2 != -1 && i3 < this.f36718a; i3++) {
            if (i3 == i) {
                return this.f36720c.f36736d[this.f36722e[i2]];
            }
            i2 = this.f36723f[i2];
        }
        return null;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: c */
    public void mo15667c() {
        int i = this.f36725h;
        for (int i2 = 0; i != -1 && i2 < this.f36718a; i2++) {
            float[] fArr = this.f36724g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f36723f[i];
        }
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    public final void clear() {
        int i = this.f36725h;
        for (int i2 = 0; i != -1 && i2 < this.f36718a; i2++) {
            SolverVariable solverVariable = this.f36720c.f36736d[this.f36722e[i]];
            if (solverVariable != null) {
                solverVariable.m15714b(this.f36719b);
            }
            i = this.f36723f[i];
        }
        this.f36725h = -1;
        this.f36726i = -1;
        this.f36727j = false;
        this.f36718a = 0;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: d */
    public float mo15668d(int i) {
        int i2 = this.f36725h;
        for (int i3 = 0; i2 != -1 && i3 < this.f36718a; i3++) {
            if (i3 == i) {
                return this.f36724g[i2];
            }
            i2 = this.f36723f[i2];
        }
        return 0.0f;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: e */
    public void mo15669e(SolverVariable solverVariable, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f36725h;
            if (i == -1) {
                this.f36725h = 0;
                this.f36724g[0] = f;
                this.f36722e[0] = solverVariable.f36767d;
                this.f36723f[0] = -1;
                solverVariable.f36777n++;
                solverVariable.m15713a(this.f36719b);
                this.f36718a++;
                if (this.f36727j) {
                    return;
                }
                int i2 = this.f36726i + 1;
                this.f36726i = i2;
                int[] iArr = this.f36722e;
                if (i2 >= iArr.length) {
                    this.f36727j = true;
                    this.f36726i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f36718a; i4++) {
                int[] iArr2 = this.f36722e;
                int i5 = iArr2[i];
                int i6 = solverVariable.f36767d;
                if (i5 == i6) {
                    float[] fArr = this.f36724g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f36725h) {
                            this.f36725h = this.f36723f[i];
                        } else {
                            int[] iArr3 = this.f36723f;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            solverVariable.m15714b(this.f36719b);
                        }
                        if (this.f36727j) {
                            this.f36726i = i;
                        }
                        solverVariable.f36777n--;
                        this.f36718a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f36723f[i];
            }
            int length = this.f36726i;
            int i7 = length + 1;
            if (this.f36727j) {
                int[] iArr4 = this.f36722e;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i7;
            }
            int[] iArr5 = this.f36722e;
            if (length >= iArr5.length && this.f36718a < iArr5.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr6 = this.f36722e;
                    if (i8 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr7 = this.f36722e;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i9 = this.f36721d * 2;
                this.f36721d = i9;
                this.f36727j = false;
                this.f36726i = length - 1;
                this.f36724g = Arrays.copyOf(this.f36724g, i9);
                this.f36722e = Arrays.copyOf(this.f36722e, this.f36721d);
                this.f36723f = Arrays.copyOf(this.f36723f, this.f36721d);
            }
            this.f36722e[length] = solverVariable.f36767d;
            this.f36724g[length] = f;
            if (i3 != -1) {
                int[] iArr8 = this.f36723f;
                iArr8[length] = iArr8[i3];
                iArr8[i3] = length;
            } else {
                this.f36723f[length] = this.f36725h;
                this.f36725h = length;
            }
            solverVariable.f36777n++;
            solverVariable.m15713a(this.f36719b);
            this.f36718a++;
            if (!this.f36727j) {
                this.f36726i++;
            }
            int i10 = this.f36726i;
            int[] iArr9 = this.f36722e;
            if (i10 >= iArr9.length) {
                this.f36727j = true;
                this.f36726i = iArr9.length - 1;
            }
        }
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: f */
    public final float mo15670f(SolverVariable solverVariable) {
        int i = this.f36725h;
        for (int i2 = 0; i != -1 && i2 < this.f36718a; i2++) {
            if (this.f36722e[i] == solverVariable.f36767d) {
                return this.f36724g[i];
            }
            i = this.f36723f[i];
        }
        return 0.0f;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: g */
    public boolean mo15671g(SolverVariable solverVariable) {
        int i = this.f36725h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f36718a; i2++) {
            if (this.f36722e[i] == solverVariable.f36767d) {
                return true;
            }
            i = this.f36723f[i];
        }
        return false;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: h */
    public float mo15672h(ArrayRow arrayRow, boolean z) {
        float fMo15670f = mo15670f(arrayRow.f36728a);
        mo15674j(arrayRow.f36728a, z);
        ArrayRow.a aVar = arrayRow.f36731d;
        int iMo15665a = aVar.mo15665a();
        for (int i = 0; i < iMo15665a; i++) {
            SolverVariable solverVariableMo15666b = aVar.mo15666b(i);
            mo15669e(solverVariableMo15666b, aVar.mo15670f(solverVariableMo15666b) * fMo15670f, z);
        }
        return fMo15670f;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: i */
    public final void mo15673i(SolverVariable solverVariable, float f) {
        if (f == 0.0f) {
            mo15674j(solverVariable, true);
            return;
        }
        int i = this.f36725h;
        if (i == -1) {
            this.f36725h = 0;
            this.f36724g[0] = f;
            this.f36722e[0] = solverVariable.f36767d;
            this.f36723f[0] = -1;
            solverVariable.f36777n++;
            solverVariable.m15713a(this.f36719b);
            this.f36718a++;
            if (this.f36727j) {
                return;
            }
            int i2 = this.f36726i + 1;
            this.f36726i = i2;
            int[] iArr = this.f36722e;
            if (i2 >= iArr.length) {
                this.f36727j = true;
                this.f36726i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f36718a; i4++) {
            int[] iArr2 = this.f36722e;
            int i5 = iArr2[i];
            int i6 = solverVariable.f36767d;
            if (i5 == i6) {
                this.f36724g[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f36723f[i];
        }
        int length = this.f36726i;
        int i7 = length + 1;
        if (this.f36727j) {
            int[] iArr3 = this.f36722e;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.f36722e;
        if (length >= iArr4.length && this.f36718a < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.f36722e;
                if (i8 >= iArr5.length) {
                    break;
                }
                if (iArr5[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr6 = this.f36722e;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.f36721d * 2;
            this.f36721d = i9;
            this.f36727j = false;
            this.f36726i = length - 1;
            this.f36724g = Arrays.copyOf(this.f36724g, i9);
            this.f36722e = Arrays.copyOf(this.f36722e, this.f36721d);
            this.f36723f = Arrays.copyOf(this.f36723f, this.f36721d);
        }
        this.f36722e[length] = solverVariable.f36767d;
        this.f36724g[length] = f;
        if (i3 != -1) {
            int[] iArr7 = this.f36723f;
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            this.f36723f[length] = this.f36725h;
            this.f36725h = length;
        }
        solverVariable.f36777n++;
        solverVariable.m15713a(this.f36719b);
        int i10 = this.f36718a + 1;
        this.f36718a = i10;
        if (!this.f36727j) {
            this.f36726i++;
        }
        int[] iArr8 = this.f36722e;
        if (i10 >= iArr8.length) {
            this.f36727j = true;
        }
        if (this.f36726i >= iArr8.length) {
            this.f36727j = true;
            this.f36726i = iArr8.length - 1;
        }
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: j */
    public final float mo15674j(SolverVariable solverVariable, boolean z) {
        int i = this.f36725h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f36718a) {
            if (this.f36722e[i] == solverVariable.f36767d) {
                if (i == this.f36725h) {
                    this.f36725h = this.f36723f[i];
                } else {
                    int[] iArr = this.f36723f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.m15714b(this.f36719b);
                }
                solverVariable.f36777n--;
                this.f36718a--;
                this.f36722e[i] = -1;
                if (this.f36727j) {
                    this.f36726i = i;
                }
                return this.f36724g[i];
            }
            i2++;
            i3 = i;
            i = this.f36723f[i];
        }
        return 0.0f;
    }

    @Override // p636z0.p697i.p700b.ArrayRow.a
    /* JADX INFO: renamed from: k */
    public void mo15675k(float f) {
        int i = this.f36725h;
        for (int i2 = 0; i != -1 && i2 < this.f36718a; i2++) {
            float[] fArr = this.f36724g;
            fArr[i] = fArr[i] / f;
            i = this.f36723f[i];
        }
    }

    public String toString() {
        int i = this.f36725h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f36718a; i2++) {
            StringBuilder sbM1556G = outline.m1556G(outline.m1599u(string, " -> "));
            sbM1556G.append(this.f36724g[i]);
            sbM1556G.append(" : ");
            StringBuilder sbM1556G2 = outline.m1556G(sbM1556G.toString());
            sbM1556G2.append(this.f36720c.f36736d[this.f36722e[i]]);
            string = sbM1556G2.toString();
            i = this.f36723f[i];
        }
        return string;
    }
}
