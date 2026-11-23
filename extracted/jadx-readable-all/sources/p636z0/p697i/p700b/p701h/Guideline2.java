package p636z0.p697i.p700b.p701h;

import p636z0.p697i.p700b.ArrayRow;
import p636z0.p697i.p700b.LinearSystem;
import p636z0.p697i.p700b.SolverVariable;

/* JADX INFO: renamed from: z0.i.b.h.h, reason: use source file name */
/* JADX INFO: compiled from: Guideline.java */
/* JADX INFO: loaded from: classes.dex */
public class Guideline2 extends ConstraintWidget {

    /* JADX INFO: renamed from: m0 */
    public float f36932m0 = -1.0f;

    /* JADX INFO: renamed from: n0 */
    public int f36933n0 = -1;

    /* JADX INFO: renamed from: o0 */
    public int f36934o0 = -1;

    /* JADX INFO: renamed from: p0 */
    public ConstraintAnchor f36935p0 = this.f36833F;

    /* JADX INFO: renamed from: q0 */
    public int f36936q0 = 0;

    /* JADX INFO: renamed from: r0 */
    public boolean f36937r0;

    public Guideline2() {
        this.f36841N.clear();
        this.f36841N.add(this.f36935p0);
        int length = this.f36840M.length;
        for (int i = 0; i < length; i++) {
            this.f36840M[i] = this.f36935p0;
        }
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: A */
    public boolean mo15718A() {
        return this.f36937r0;
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: B */
    public boolean mo15719B() {
        return this.f36937r0;
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: P */
    public void mo15750P(LinearSystem linearSystem, boolean z) {
        if (this.f36844Q == null) {
            return;
        }
        int iM15702o = linearSystem.m15702o(this.f36935p0);
        if (this.f36936q0 == 1) {
            this.f36849V = iM15702o;
            this.f36850W = 0;
            m15743I(this.f36844Q.m15760m());
            m15748N(0);
            return;
        }
        this.f36849V = 0;
        this.f36850W = iM15702o;
        m15748N(this.f36844Q.m15766s());
        m15743I(0);
    }

    /* JADX INFO: renamed from: Q */
    public void m15785Q(int i) {
        ConstraintAnchor constraintAnchor = this.f36935p0;
        constraintAnchor.f36810b = i;
        constraintAnchor.f36811c = true;
        this.f36937r0 = true;
    }

    /* JADX INFO: renamed from: R */
    public void m15786R(int i) {
        if (this.f36936q0 == i) {
            return;
        }
        this.f36936q0 = i;
        this.f36841N.clear();
        if (this.f36936q0 == 1) {
            this.f36935p0 = this.f36832E;
        } else {
            this.f36935p0 = this.f36833F;
        }
        this.f36841N.add(this.f36935p0);
        int length = this.f36840M.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f36840M[i2] = this.f36935p0;
        }
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: e */
    public void mo15722e(LinearSystem linearSystem, boolean z) {
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) this.f36844Q;
        if (constraintWidgetContainer == null) {
            return;
        }
        Object objMo15757j = constraintWidgetContainer.mo15757j(ConstraintAnchor.a.LEFT);
        Object objMo15757j2 = constraintWidgetContainer.mo15757j(ConstraintAnchor.a.RIGHT);
        ConstraintWidget constraintWidget = this.f36844Q;
        boolean z2 = constraintWidget != null && constraintWidget.f36843P[0] == 2;
        if (this.f36936q0 == 0) {
            objMo15757j = constraintWidgetContainer.mo15757j(ConstraintAnchor.a.TOP);
            objMo15757j2 = constraintWidgetContainer.mo15757j(ConstraintAnchor.a.BOTTOM);
            ConstraintWidget constraintWidget2 = this.f36844Q;
            z2 = constraintWidget2 != null && constraintWidget2.f36843P[1] == 2;
        }
        if (this.f36937r0) {
            ConstraintAnchor constraintAnchor = this.f36935p0;
            if (constraintAnchor.f36811c) {
                SolverVariable solverVariableM15699l = linearSystem.m15699l(constraintAnchor);
                linearSystem.m15692e(solverVariableM15699l, this.f36935p0.m15727c());
                if (this.f36933n0 != -1) {
                    if (z2) {
                        linearSystem.m15693f(linearSystem.m15699l(objMo15757j2), solverVariableM15699l, 0, 5);
                    }
                } else if (this.f36934o0 != -1 && z2) {
                    SolverVariable solverVariableM15699l2 = linearSystem.m15699l(objMo15757j2);
                    linearSystem.m15693f(solverVariableM15699l, linearSystem.m15699l(objMo15757j), 0, 5);
                    linearSystem.m15693f(solverVariableM15699l2, solverVariableM15699l, 0, 5);
                }
                this.f36937r0 = false;
                return;
            }
        }
        if (this.f36933n0 != -1) {
            SolverVariable solverVariableM15699l3 = linearSystem.m15699l(this.f36935p0);
            linearSystem.m15691d(solverVariableM15699l3, linearSystem.m15699l(objMo15757j), this.f36933n0, 8);
            if (z2) {
                linearSystem.m15693f(linearSystem.m15699l(objMo15757j2), solverVariableM15699l3, 0, 5);
                return;
            }
            return;
        }
        if (this.f36934o0 != -1) {
            SolverVariable solverVariableM15699l4 = linearSystem.m15699l(this.f36935p0);
            SolverVariable solverVariableM15699l5 = linearSystem.m15699l(objMo15757j2);
            linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l5, -this.f36934o0, 8);
            if (z2) {
                linearSystem.m15693f(solverVariableM15699l4, linearSystem.m15699l(objMo15757j), 0, 5);
                linearSystem.m15693f(solverVariableM15699l5, solverVariableM15699l4, 0, 5);
                return;
            }
            return;
        }
        if (this.f36932m0 != -1.0f) {
            SolverVariable solverVariableM15699l6 = linearSystem.m15699l(this.f36935p0);
            SolverVariable solverVariableM15699l7 = linearSystem.m15699l(objMo15757j2);
            float f = this.f36932m0;
            ArrayRow arrayRowM15700m = linearSystem.m15700m();
            arrayRowM15700m.f36731d.mo15673i(solverVariableM15699l6, -1.0f);
            arrayRowM15700m.f36731d.mo15673i(solverVariableM15699l7, f);
            linearSystem.m15690c(arrayRowM15700m);
        }
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: f */
    public boolean mo15723f() {
        return true;
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: j */
    public ConstraintAnchor mo15757j(ConstraintAnchor.a aVar) {
        switch (aVar) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
            case RIGHT:
                if (this.f36936q0 == 1) {
                    return this.f36935p0;
                }
                break;
            case TOP:
            case BOTTOM:
                if (this.f36936q0 == 0) {
                    return this.f36935p0;
                }
                break;
        }
        throw new AssertionError(aVar.name());
    }
}
