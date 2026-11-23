package p636z0.p697i.p700b.p701h;

import p007c.p071d.p078c.p079a.outline;
import p636z0.p697i.p700b.ArrayRow;
import p636z0.p697i.p700b.LinearSystem;
import p636z0.p697i.p700b.SolverVariable;

/* JADX INFO: renamed from: z0.i.b.h.a, reason: use source file name */
/* JADX INFO: compiled from: Barrier.java */
/* JADX INFO: loaded from: classes.dex */
public class Barrier2 extends HelperWidget {

    /* JADX INFO: renamed from: o0 */
    public int f36785o0 = 0;

    /* JADX INFO: renamed from: p0 */
    public boolean f36786p0 = true;

    /* JADX INFO: renamed from: q0 */
    public int f36787q0 = 0;

    /* JADX INFO: renamed from: r0 */
    public boolean f36788r0 = false;

    public Barrier2() {
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: A */
    public boolean mo15718A() {
        return this.f36788r0;
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: B */
    public boolean mo15719B() {
        return this.f36788r0;
    }

    /* JADX INFO: renamed from: R */
    public boolean m15720R() {
        int i;
        int i2;
        int i3;
        ConstraintAnchor.a aVar = ConstraintAnchor.a.BOTTOM;
        ConstraintAnchor.a aVar2 = ConstraintAnchor.a.TOP;
        ConstraintAnchor.a aVar3 = ConstraintAnchor.a.RIGHT;
        ConstraintAnchor.a aVar4 = ConstraintAnchor.a.LEFT;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.f36939n0;
            if (i4 >= i) {
                break;
            }
            ConstraintWidget constraintWidget = this.f36938m0[i4];
            if ((this.f36786p0 || constraintWidget.mo15723f()) && ((((i2 = this.f36785o0) == 0 || i2 == 1) && !constraintWidget.mo15718A()) || (((i3 = this.f36785o0) == 2 || i3 == 3) && !constraintWidget.mo15719B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f36939n0; i5++) {
            ConstraintWidget constraintWidget2 = this.f36938m0[i5];
            if (this.f36786p0 || constraintWidget2.mo15723f()) {
                if (!z2) {
                    int i6 = this.f36785o0;
                    if (i6 == 0) {
                        iMax = constraintWidget2.mo15757j(aVar4).m15727c();
                    } else if (i6 == 1) {
                        iMax = constraintWidget2.mo15757j(aVar3).m15727c();
                    } else if (i6 == 2) {
                        iMax = constraintWidget2.mo15757j(aVar2).m15727c();
                    } else if (i6 == 3) {
                        iMax = constraintWidget2.mo15757j(aVar).m15727c();
                    }
                    z2 = true;
                }
                int i7 = this.f36785o0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, constraintWidget2.mo15757j(aVar4).m15727c());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, constraintWidget2.mo15757j(aVar3).m15727c());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, constraintWidget2.mo15757j(aVar2).m15727c());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, constraintWidget2.mo15757j(aVar).m15727c());
                }
            }
        }
        int i8 = iMax + this.f36787q0;
        int i9 = this.f36785o0;
        if (i9 == 0 || i9 == 1) {
            m15741G(i8, i8);
        } else {
            m15742H(i8, i8);
        }
        this.f36788r0 = true;
        return true;
    }

    /* JADX INFO: renamed from: S */
    public int m15721S() {
        int i = this.f36785o0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: e */
    public void mo15722e(LinearSystem linearSystem, boolean z) {
        ConstraintAnchor[] constraintAnchorArr;
        boolean z2;
        int i;
        int i2;
        int i3;
        ConstraintAnchor[] constraintAnchorArr2 = this.f36840M;
        constraintAnchorArr2[0] = this.f36832E;
        constraintAnchorArr2[2] = this.f36833F;
        constraintAnchorArr2[1] = this.f36834G;
        constraintAnchorArr2[3] = this.f36835H;
        int i4 = 0;
        while (true) {
            constraintAnchorArr = this.f36840M;
            if (i4 >= constraintAnchorArr.length) {
                break;
            }
            constraintAnchorArr[i4].f36817i = linearSystem.m15699l(constraintAnchorArr[i4]);
            i4++;
        }
        int i5 = this.f36785o0;
        if (i5 < 0 || i5 >= 4) {
            return;
        }
        ConstraintAnchor constraintAnchor = constraintAnchorArr[i5];
        if (!this.f36788r0) {
            m15720R();
        }
        if (this.f36788r0) {
            this.f36788r0 = false;
            int i6 = this.f36785o0;
            if (i6 == 0 || i6 == 1) {
                linearSystem.m15692e(this.f36832E.f36817i, this.f36849V);
                linearSystem.m15692e(this.f36834G.f36817i, this.f36849V);
                return;
            } else {
                if (i6 == 2 || i6 == 3) {
                    linearSystem.m15692e(this.f36833F.f36817i, this.f36850W);
                    linearSystem.m15692e(this.f36835H.f36817i, this.f36850W);
                    return;
                }
                return;
            }
        }
        int i7 = 0;
        while (true) {
            if (i7 >= this.f36939n0) {
                z2 = false;
                break;
            }
            ConstraintWidget constraintWidget = this.f36938m0[i7];
            if ((this.f36786p0 || constraintWidget.mo15723f()) && ((((i2 = this.f36785o0) == 0 || i2 == 1) && constraintWidget.m15761n() == 3 && constraintWidget.f36832E.f36814f != null && constraintWidget.f36834G.f36814f != null) || (((i3 = this.f36785o0) == 2 || i3 == 3) && constraintWidget.m15765r() == 3 && constraintWidget.f36833F.f36814f != null && constraintWidget.f36835H.f36814f != null))) {
                z2 = true;
                break;
            }
            i7++;
        }
        boolean z3 = this.f36832E.m15730f() || this.f36834G.m15730f();
        boolean z4 = this.f36833F.m15730f() || this.f36835H.m15730f();
        int i8 = !z2 && (((i = this.f36785o0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i9 = 0; i9 < this.f36939n0; i9++) {
            ConstraintWidget constraintWidget2 = this.f36938m0[i9];
            if (this.f36786p0 || constraintWidget2.mo15723f()) {
                SolverVariable solverVariableM15699l = linearSystem.m15699l(constraintWidget2.f36840M[this.f36785o0]);
                ConstraintAnchor[] constraintAnchorArr3 = constraintWidget2.f36840M;
                int i10 = this.f36785o0;
                constraintAnchorArr3[i10].f36817i = solverVariableM15699l;
                int i11 = (constraintAnchorArr3[i10].f36814f == null || constraintAnchorArr3[i10].f36814f.f36812d != this) ? 0 : constraintAnchorArr3[i10].f36815g + 0;
                if (i10 == 0 || i10 == 2) {
                    SolverVariable solverVariable = constraintAnchor.f36817i;
                    int i12 = this.f36787q0 - i11;
                    ArrayRow arrayRowM15700m = linearSystem.m15700m();
                    SolverVariable solverVariableM15701n = linearSystem.m15701n();
                    solverVariableM15701n.f36769f = 0;
                    arrayRowM15700m.m15681f(solverVariable, solverVariableM15699l, solverVariableM15701n, i12);
                    linearSystem.m15690c(arrayRowM15700m);
                } else {
                    SolverVariable solverVariable2 = constraintAnchor.f36817i;
                    int i13 = this.f36787q0 + i11;
                    ArrayRow arrayRowM15700m2 = linearSystem.m15700m();
                    SolverVariable solverVariableM15701n2 = linearSystem.m15701n();
                    solverVariableM15701n2.f36769f = 0;
                    arrayRowM15700m2.m15680e(solverVariable2, solverVariableM15699l, solverVariableM15701n2, i13);
                    linearSystem.m15690c(arrayRowM15700m2);
                }
                linearSystem.m15691d(constraintAnchor.f36817i, solverVariableM15699l, this.f36787q0 + i11, i8);
            }
        }
        int i14 = this.f36785o0;
        if (i14 == 0) {
            linearSystem.m15691d(this.f36834G.f36817i, this.f36832E.f36817i, 0, 8);
            linearSystem.m15691d(this.f36832E.f36817i, this.f36844Q.f36834G.f36817i, 0, 4);
            linearSystem.m15691d(this.f36832E.f36817i, this.f36844Q.f36832E.f36817i, 0, 0);
            return;
        }
        if (i14 == 1) {
            linearSystem.m15691d(this.f36832E.f36817i, this.f36834G.f36817i, 0, 8);
            linearSystem.m15691d(this.f36832E.f36817i, this.f36844Q.f36832E.f36817i, 0, 4);
            linearSystem.m15691d(this.f36832E.f36817i, this.f36844Q.f36834G.f36817i, 0, 0);
        } else if (i14 == 2) {
            linearSystem.m15691d(this.f36835H.f36817i, this.f36833F.f36817i, 0, 8);
            linearSystem.m15691d(this.f36833F.f36817i, this.f36844Q.f36835H.f36817i, 0, 4);
            linearSystem.m15691d(this.f36833F.f36817i, this.f36844Q.f36833F.f36817i, 0, 0);
        } else if (i14 == 3) {
            linearSystem.m15691d(this.f36833F.f36817i, this.f36835H.f36817i, 0, 8);
            linearSystem.m15691d(this.f36833F.f36817i, this.f36844Q.f36833F.f36817i, 0, 4);
            linearSystem.m15691d(this.f36833F.f36817i, this.f36844Q.f36835H.f36817i, 0, 0);
        }
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: f */
    public boolean mo15723f() {
        return true;
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    public String toString() {
        String strM1550A = outline.m1550A(outline.m1556G("[Barrier] "), this.f36863e0, " {");
        for (int i = 0; i < this.f36939n0; i++) {
            ConstraintWidget constraintWidget = this.f36938m0[i];
            if (i > 0) {
                strM1550A = outline.m1599u(strM1550A, ", ");
            }
            StringBuilder sbM1556G = outline.m1556G(strM1550A);
            sbM1556G.append(constraintWidget.f36863e0);
            strM1550A = sbM1556G.toString();
        }
        return outline.m1599u(strM1550A, "}");
    }

    public Barrier2(String str) {
        this.f36863e0 = str;
    }
}
