package p636z0.p697i.p700b;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.i.b.f, reason: use source file name */
/* JADX INFO: compiled from: PriorityGoalRow.java */
/* JADX INFO: loaded from: classes.dex */
public class PriorityGoalRow extends ArrayRow {

    /* JADX INFO: renamed from: f */
    public int f36757f;

    /* JADX INFO: renamed from: g */
    public SolverVariable[] f36758g;

    /* JADX INFO: renamed from: h */
    public SolverVariable[] f36759h;

    /* JADX INFO: renamed from: i */
    public int f36760i;

    /* JADX INFO: renamed from: j */
    public b f36761j;

    /* JADX INFO: renamed from: z0.i.b.f$a */
    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class a implements Comparator<SolverVariable> {
        public a(PriorityGoalRow priorityGoalRow) {
        }

        @Override // java.util.Comparator
        public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
            return solverVariable.f36767d - solverVariable2.f36767d;
        }
    }

    /* JADX INFO: renamed from: z0.i.b.f$b */
    /* JADX INFO: compiled from: PriorityGoalRow.java */
    public class b implements Comparable {

        /* JADX INFO: renamed from: f */
        public SolverVariable f36762f;

        public b(PriorityGoalRow priorityGoalRow) {
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f36762f.f36767d - ((SolverVariable) obj).f36767d;
        }

        public String toString() {
            String string = "[ ";
            if (this.f36762f != null) {
                for (int i = 0; i < 9; i++) {
                    StringBuilder sbM1556G = outline.m1556G(string);
                    sbM1556G.append(this.f36762f.f36773j[i]);
                    sbM1556G.append(" ");
                    string = sbM1556G.toString();
                }
            }
            StringBuilder sbM1561L = outline.m1561L(string, "] ");
            sbM1561L.append(this.f36762f);
            return sbM1561L.toString();
        }
    }

    public PriorityGoalRow(Cache3 cache3) {
        super(cache3);
        this.f36757f = 128;
        this.f36758g = new SolverVariable[128];
        this.f36759h = new SolverVariable[128];
        this.f36760i = 0;
        this.f36761j = new b(this);
    }

    @Override // p636z0.p697i.p700b.ArrayRow, p636z0.p697i.p700b.LinearSystem.a
    /* JADX INFO: renamed from: a */
    public void mo15676a(SolverVariable solverVariable) {
        this.f36761j.f36762f = solverVariable;
        Arrays.fill(solverVariable.f36773j, 0.0f);
        solverVariable.f36773j[solverVariable.f36769f] = 1.0f;
        m15711m(solverVariable);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    @Override // p636z0.p697i.p700b.ArrayRow, p636z0.p697i.p700b.LinearSystem.a
    /* JADX INFO: renamed from: b */
    public SolverVariable mo15677b(LinearSystem linearSystem, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f36760i; i2++) {
            SolverVariable[] solverVariableArr = this.f36758g;
            SolverVariable solverVariable = solverVariableArr[i2];
            if (!zArr[solverVariable.f36767d]) {
                b bVar = this.f36761j;
                bVar.f36762f = solverVariable;
                int i3 = 8;
                boolean z = true;
                if (i == -1) {
                    Objects.requireNonNull(bVar);
                    while (true) {
                        if (i3 >= 0) {
                            float f = bVar.f36762f.f36773j[i3];
                            if (f <= 0.0f) {
                                if (f < 0.0f) {
                                    break;
                                }
                                i3--;
                            }
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        i = i2;
                    }
                } else {
                    SolverVariable solverVariable2 = solverVariableArr[i];
                    Objects.requireNonNull(bVar);
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = solverVariable2.f36773j[i3];
                            float f3 = bVar.f36762f.f36773j[i3];
                            if (f3 != f2) {
                                if (f3 < f2) {
                                    break;
                                }
                                break;
                            }
                            i3--;
                        }
                        z = false;
                        break;
                    }
                    if (z) {
                        i = i2;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f36758g[i];
    }

    @Override // p636z0.p697i.p700b.ArrayRow, p636z0.p697i.p700b.LinearSystem.a
    public void clear() {
        this.f36760i = 0;
        this.f36729b = 0.0f;
    }

    @Override // p636z0.p697i.p700b.ArrayRow, p636z0.p697i.p700b.LinearSystem.a
    public boolean isEmpty() {
        return this.f36760i == 0;
    }

    @Override // p636z0.p697i.p700b.ArrayRow
    /* JADX INFO: renamed from: l */
    public void mo15687l(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        SolverVariable solverVariable = arrayRow.f36728a;
        if (solverVariable == null) {
            return;
        }
        ArrayRow.a aVar = arrayRow.f36731d;
        int iMo15665a = aVar.mo15665a();
        for (int i = 0; i < iMo15665a; i++) {
            SolverVariable solverVariableMo15666b = aVar.mo15666b(i);
            float fMo15668d = aVar.mo15668d(i);
            b bVar = this.f36761j;
            bVar.f36762f = solverVariableMo15666b;
            boolean z2 = true;
            if (solverVariableMo15666b.f36765b) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = bVar.f36762f.f36773j;
                    fArr[i2] = (solverVariable.f36773j[i2] * fMo15668d) + fArr[i2];
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        bVar.f36762f.f36773j[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    PriorityGoalRow.this.m15712n(bVar.f36762f);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f = solverVariable.f36773j[i3];
                    if (f != 0.0f) {
                        float f2 = f * fMo15668d;
                        if (Math.abs(f2) < 1.0E-4f) {
                            f2 = 0.0f;
                        }
                        bVar.f36762f.f36773j[i3] = f2;
                    } else {
                        bVar.f36762f.f36773j[i3] = 0.0f;
                    }
                }
            }
            if (z2) {
                m15711m(solverVariableMo15666b);
            }
            this.f36729b = (arrayRow.f36729b * fMo15668d) + this.f36729b;
        }
        m15712n(solverVariable);
    }

    /* JADX INFO: renamed from: m */
    public final void m15711m(SolverVariable solverVariable) {
        int i;
        int i2 = this.f36760i + 1;
        SolverVariable[] solverVariableArr = this.f36758g;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f36758g = solverVariableArr2;
            this.f36759h = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f36758g;
        int i3 = this.f36760i;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f36760i = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f36767d > solverVariable.f36767d) {
            int i5 = 0;
            while (true) {
                i = this.f36760i;
                if (i5 >= i) {
                    break;
                }
                this.f36759h[i5] = this.f36758g[i5];
                i5++;
            }
            Arrays.sort(this.f36759h, 0, i, new a(this));
            for (int i6 = 0; i6 < this.f36760i; i6++) {
                this.f36758g[i6] = this.f36759h[i6];
            }
        }
        solverVariable.f36765b = true;
        solverVariable.m15713a(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m15712n(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f36760i) {
            if (this.f36758g[i] == solverVariable) {
                while (true) {
                    int i2 = this.f36760i;
                    if (i >= i2 - 1) {
                        this.f36760i = i2 - 1;
                        solverVariable.f36765b = false;
                        return;
                    } else {
                        SolverVariable[] solverVariableArr = this.f36758g;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // p636z0.p697i.p700b.ArrayRow
    public String toString() {
        StringBuilder sbM1561L = outline.m1561L("", " goal -> (");
        sbM1561L.append(this.f36729b);
        sbM1561L.append(") : ");
        String string = sbM1561L.toString();
        for (int i = 0; i < this.f36760i; i++) {
            this.f36761j.f36762f = this.f36758g[i];
            StringBuilder sbM1556G = outline.m1556G(string);
            sbM1556G.append(this.f36761j);
            sbM1556G.append(" ");
            string = sbM1556G.toString();
        }
        return string;
    }
}
