package p636z0.p697i.p700b.p701h;

import java.util.ArrayList;
import p636z0.p697i.p700b.p701h.p702n.Grouping;
import p636z0.p697i.p700b.p701h.p702n.WidgetGroup;

/* JADX INFO: renamed from: z0.i.b.h.j, reason: use source file name */
/* JADX INFO: compiled from: HelperWidget.java */
/* JADX INFO: loaded from: classes.dex */
public class HelperWidget extends ConstraintWidget implements Helper {

    /* JADX INFO: renamed from: m0 */
    public ConstraintWidget[] f36938m0 = new ConstraintWidget[4];

    /* JADX INFO: renamed from: n0 */
    public int f36939n0 = 0;

    /* JADX INFO: renamed from: Q */
    public void m15788Q(ArrayList<WidgetGroup> arrayList, int i, WidgetGroup widgetGroup) {
        for (int i2 = 0; i2 < this.f36939n0; i2++) {
            widgetGroup.m15828a(this.f36938m0[i2]);
        }
        for (int i3 = 0; i3 < this.f36939n0; i3++) {
            Grouping.m15818a(this.f36938m0[i3], i, arrayList, widgetGroup);
        }
    }

    @Override // p636z0.p697i.p700b.p701h.Helper
    /* JADX INFO: renamed from: a */
    public void mo15787a(ConstraintWidgetContainer constraintWidgetContainer) {
    }
}
