package p636z0.p697i.p700b;

import java.util.ArrayList;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.i.b.b, reason: use source file name */
/* JADX INFO: compiled from: ArrayRow.java */
/* JADX INFO: loaded from: classes.dex */
public class ArrayRow implements LinearSystem.a {

    /* JADX INFO: renamed from: d */
    public a f36731d;

    /* JADX INFO: renamed from: a */
    public SolverVariable f36728a = null;

    /* JADX INFO: renamed from: b */
    public float f36729b = 0.0f;

    /* JADX INFO: renamed from: c */
    public ArrayList<SolverVariable> f36730c = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public boolean f36732e = false;

    /* JADX INFO: renamed from: z0.i.b.b$a */
    /* JADX INFO: compiled from: ArrayRow.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        int mo15665a();

        /* JADX INFO: renamed from: b */
        SolverVariable mo15666b(int i);

        /* JADX INFO: renamed from: c */
        void mo15667c();

        void clear();

        /* JADX INFO: renamed from: d */
        float mo15668d(int i);

        /* JADX INFO: renamed from: e */
        void mo15669e(SolverVariable solverVariable, float f, boolean z);

        /* JADX INFO: renamed from: f */
        float mo15670f(SolverVariable solverVariable);

        /* JADX INFO: renamed from: g */
        boolean mo15671g(SolverVariable solverVariable);

        /* JADX INFO: renamed from: h */
        float mo15672h(ArrayRow arrayRow, boolean z);

        /* JADX INFO: renamed from: i */
        void mo15673i(SolverVariable solverVariable, float f);

        /* JADX INFO: renamed from: j */
        float mo15674j(SolverVariable solverVariable, boolean z);

        /* JADX INFO: renamed from: k */
        void mo15675k(float f);
    }

    public ArrayRow() {
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0021  */
    @Override // p636z0.p697i.p700b.LinearSystem.a
    /* JADX INFO: renamed from: a */
    public void mo15676a(SolverVariable solverVariable) {
        float f;
        int i = solverVariable.f36769f;
        if (i == 1) {
            f = 1.0f;
        } else if (i == 2) {
            f = 1000.0f;
        } else if (i == 3) {
            f = 1000000.0f;
        } else if (i == 4) {
            f = 1.0E9f;
        } else if (i == 5) {
            f = 1.0E12f;
        } else {
            f = 1.0f;
        }
        this.f36731d.mo15673i(solverVariable, f);
    }

    @Override // p636z0.p697i.p700b.LinearSystem.a
    /* JADX INFO: renamed from: b */
    public SolverVariable mo15677b(LinearSystem linearSystem, boolean[] zArr) {
        return m15684i(zArr, null);
    }

    /* JADX INFO: renamed from: c */
    public ArrayRow m15678c(LinearSystem linearSystem, int i) {
        this.f36731d.mo15673i(linearSystem.m15698k(i, "ep"), 1.0f);
        this.f36731d.mo15673i(linearSystem.m15698k(i, "em"), -1.0f);
        return this;
    }

    @Override // p636z0.p697i.p700b.LinearSystem.a
    public void clear() {
        this.f36731d.clear();
        this.f36728a = null;
        this.f36729b = 0.0f;
    }

    /* JADX INFO: renamed from: d */
    public ArrayRow m15679d(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f36731d.mo15673i(solverVariable, -1.0f);
        this.f36731d.mo15673i(solverVariable2, 1.0f);
        this.f36731d.mo15673i(solverVariable3, f);
        this.f36731d.mo15673i(solverVariable4, -f);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public ArrayRow m15680e(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f36729b = i;
        }
        if (z) {
            this.f36731d.mo15673i(solverVariable, 1.0f);
            this.f36731d.mo15673i(solverVariable2, -1.0f);
            this.f36731d.mo15673i(solverVariable3, -1.0f);
        } else {
            this.f36731d.mo15673i(solverVariable, -1.0f);
            this.f36731d.mo15673i(solverVariable2, 1.0f);
            this.f36731d.mo15673i(solverVariable3, 1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: f */
    public ArrayRow m15681f(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f36729b = i;
        }
        if (z) {
            this.f36731d.mo15673i(solverVariable, 1.0f);
            this.f36731d.mo15673i(solverVariable2, -1.0f);
            this.f36731d.mo15673i(solverVariable3, 1.0f);
        } else {
            this.f36731d.mo15673i(solverVariable, -1.0f);
            this.f36731d.mo15673i(solverVariable2, 1.0f);
            this.f36731d.mo15673i(solverVariable3, -1.0f);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ArrayRow m15682g(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f36731d.mo15673i(solverVariable3, 0.5f);
        this.f36731d.mo15673i(solverVariable4, 0.5f);
        this.f36731d.mo15673i(solverVariable, -0.5f);
        this.f36731d.mo15673i(solverVariable2, -0.5f);
        this.f36729b = -f;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15683h(SolverVariable solverVariable) {
        return solverVariable.f36777n <= 1;
    }

    /* JADX INFO: renamed from: i */
    public final SolverVariable m15684i(boolean[] zArr, SolverVariable solverVariable) {
        SolverVariable.a aVar;
        int iMo15665a = this.f36731d.mo15665a();
        SolverVariable solverVariable2 = null;
        float f = 0.0f;
        for (int i = 0; i < iMo15665a; i++) {
            float fMo15668d = this.f36731d.mo15668d(i);
            if (fMo15668d < 0.0f) {
                SolverVariable solverVariableMo15666b = this.f36731d.mo15666b(i);
                if ((zArr == null || !zArr[solverVariableMo15666b.f36767d]) && solverVariableMo15666b != solverVariable && (((aVar = solverVariableMo15666b.f36774k) == SolverVariable.a.SLACK || aVar == SolverVariable.a.ERROR) && fMo15668d < f)) {
                    f = fMo15668d;
                    solverVariable2 = solverVariableMo15666b;
                }
            }
        }
        return solverVariable2;
    }

    @Override // p636z0.p697i.p700b.LinearSystem.a
    public boolean isEmpty() {
        return this.f36728a == null && this.f36729b == 0.0f && this.f36731d.mo15665a() == 0;
    }

    /* JADX INFO: renamed from: j */
    public void m15685j(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f36728a;
        if (solverVariable2 != null) {
            this.f36731d.mo15673i(solverVariable2, -1.0f);
            this.f36728a.f36768e = -1;
            this.f36728a = null;
        }
        float fMo15674j = this.f36731d.mo15674j(solverVariable, true) * (-1.0f);
        this.f36728a = solverVariable;
        if (fMo15674j == 1.0f) {
            return;
        }
        this.f36729b /= fMo15674j;
        this.f36731d.mo15675k(fMo15674j);
    }

    /* JADX INFO: renamed from: k */
    public void m15686k(LinearSystem linearSystem, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f36771h) {
            float fMo15670f = this.f36731d.mo15670f(solverVariable);
            this.f36729b = (solverVariable.f36770g * fMo15670f) + this.f36729b;
            this.f36731d.mo15674j(solverVariable, z);
            if (z) {
                solverVariable.m15714b(this);
            }
            if (this.f36731d.mo15665a() == 0) {
                this.f36732e = true;
                linearSystem.f36740d = true;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo15687l(LinearSystem linearSystem, ArrayRow arrayRow, boolean z) {
        float fMo15672h = this.f36731d.mo15672h(arrayRow, z);
        this.f36729b = (arrayRow.f36729b * fMo15672h) + this.f36729b;
        if (z) {
            arrayRow.f36728a.m15714b(this);
        }
        if (this.f36728a == null || this.f36731d.mo15665a() != 0) {
            return;
        }
        this.f36732e = true;
        linearSystem.f36740d = true;
    }

    public String toString() {
        String string;
        boolean z;
        if (this.f36728a == null) {
            string = "0";
        } else {
            StringBuilder sbM1556G = outline.m1556G("");
            sbM1556G.append(this.f36728a);
            string = sbM1556G.toString();
        }
        String strM1599u = outline.m1599u(string, " = ");
        if (this.f36729b != 0.0f) {
            StringBuilder sbM1556G2 = outline.m1556G(strM1599u);
            sbM1556G2.append(this.f36729b);
            strM1599u = sbM1556G2.toString();
            z = true;
        } else {
            z = false;
        }
        int iMo15665a = this.f36731d.mo15665a();
        for (int i = 0; i < iMo15665a; i++) {
            SolverVariable solverVariableMo15666b = this.f36731d.mo15666b(i);
            if (solverVariableMo15666b != null) {
                float fMo15668d = this.f36731d.mo15668d(i);
                if (fMo15668d != 0.0f) {
                    String string2 = solverVariableMo15666b.toString();
                    if (z) {
                        if (fMo15668d > 0.0f) {
                            strM1599u = outline.m1599u(strM1599u, " + ");
                        } else {
                            strM1599u = outline.m1599u(strM1599u, " - ");
                            fMo15668d *= -1.0f;
                        }
                    } else if (fMo15668d < 0.0f) {
                        strM1599u = outline.m1599u(strM1599u, "- ");
                        fMo15668d *= -1.0f;
                    }
                    strM1599u = fMo15668d == 1.0f ? outline.m1599u(strM1599u, string2) : strM1599u + fMo15668d + " " + string2;
                    z = true;
                }
            }
        }
        return !z ? outline.m1599u(strM1599u, "0.0") : strM1599u;
    }

    public ArrayRow(Cache3 cache3) {
        this.f36731d = new ArrayLinkedVariables(this, cache3);
    }
}
