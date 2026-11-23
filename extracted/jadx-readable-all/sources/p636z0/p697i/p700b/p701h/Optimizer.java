package p636z0.p697i.p700b.p701h;

import p636z0.p697i.p700b.LinearSystem;

/* JADX INFO: renamed from: z0.i.b.h.k, reason: use source file name */
/* JADX INFO: compiled from: Optimizer.java */
/* JADX INFO: loaded from: classes.dex */
public class Optimizer {

    /* JADX INFO: renamed from: a */
    public static boolean[] f36940a = new boolean[3];

    /* JADX INFO: renamed from: a */
    public static void m15789a(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ConstraintWidget constraintWidget) {
        constraintWidget.f36874k = -1;
        constraintWidget.f36876l = -1;
        if (constraintWidgetContainer.f36843P[0] != 2 && constraintWidget.f36843P[0] == 4) {
            int i = constraintWidget.f36832E.f36815g;
            int iM15766s = constraintWidgetContainer.m15766s() - constraintWidget.f36834G.f36815g;
            ConstraintAnchor constraintAnchor = constraintWidget.f36832E;
            constraintAnchor.f36817i = linearSystem.m15699l(constraintAnchor);
            ConstraintAnchor constraintAnchor2 = constraintWidget.f36834G;
            constraintAnchor2.f36817i = linearSystem.m15699l(constraintAnchor2);
            linearSystem.m15692e(constraintWidget.f36832E.f36817i, i);
            linearSystem.m15692e(constraintWidget.f36834G.f36817i, iM15766s);
            constraintWidget.f36874k = 2;
            constraintWidget.f36849V = i;
            int i2 = iM15766s - i;
            constraintWidget.f36845R = i2;
            int i3 = constraintWidget.f36852Y;
            if (i2 < i3) {
                constraintWidget.f36845R = i3;
            }
        }
        if (constraintWidgetContainer.f36843P[1] == 2 || constraintWidget.f36843P[1] != 4) {
            return;
        }
        int i4 = constraintWidget.f36833F.f36815g;
        int iM15760m = constraintWidgetContainer.m15760m() - constraintWidget.f36835H.f36815g;
        ConstraintAnchor constraintAnchor3 = constraintWidget.f36833F;
        constraintAnchor3.f36817i = linearSystem.m15699l(constraintAnchor3);
        ConstraintAnchor constraintAnchor4 = constraintWidget.f36835H;
        constraintAnchor4.f36817i = linearSystem.m15699l(constraintAnchor4);
        linearSystem.m15692e(constraintWidget.f36833F.f36817i, i4);
        linearSystem.m15692e(constraintWidget.f36835H.f36817i, iM15760m);
        if (constraintWidget.f36851X > 0 || constraintWidget.f36861d0 == 8) {
            ConstraintAnchor constraintAnchor5 = constraintWidget.f36836I;
            constraintAnchor5.f36817i = linearSystem.m15699l(constraintAnchor5);
            linearSystem.m15692e(constraintWidget.f36836I.f36817i, constraintWidget.f36851X + i4);
        }
        constraintWidget.f36876l = 2;
        constraintWidget.f36850W = i4;
        int i5 = iM15760m - i4;
        constraintWidget.f36846S = i5;
        int i6 = constraintWidget.f36853Z;
        if (i5 < i6) {
            constraintWidget.f36846S = i6;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m15790b(int i, int i2) {
        return (i & i2) == i2;
    }
}
