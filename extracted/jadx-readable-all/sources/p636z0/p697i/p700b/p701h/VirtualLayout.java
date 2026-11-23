package p636z0.p697i.p700b.p701h;

import p636z0.p697i.p700b.p701h.p702n.BasicMeasure;

/* JADX INFO: renamed from: z0.i.b.h.l, reason: use source file name */
/* JADX INFO: compiled from: VirtualLayout.java */
/* JADX INFO: loaded from: classes.dex */
public class VirtualLayout extends HelperWidget {

    /* JADX INFO: renamed from: o0 */
    public boolean f36941o0 = false;

    public VirtualLayout() {
        new BasicMeasure.a();
    }

    @Override // p636z0.p697i.p700b.p701h.HelperWidget, p636z0.p697i.p700b.p701h.Helper
    /* JADX INFO: renamed from: a */
    public void mo15787a(ConstraintWidgetContainer constraintWidgetContainer) {
        for (int i = 0; i < this.f36939n0; i++) {
            ConstraintWidget constraintWidget = this.f36938m0[i];
            if (constraintWidget != null) {
                constraintWidget.f36829B = true;
            }
        }
    }
}
