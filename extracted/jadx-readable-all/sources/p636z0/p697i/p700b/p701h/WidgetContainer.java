package p636z0.p697i.p700b.p701h;

import java.util.ArrayList;
import p636z0.p697i.p700b.Cache3;

/* JADX INFO: renamed from: z0.i.b.h.m, reason: use source file name */
/* JADX INFO: compiled from: WidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class WidgetContainer extends ConstraintWidget {

    /* JADX INFO: renamed from: m0 */
    public ArrayList<ConstraintWidget> f36942m0;

    public WidgetContainer() {
        this.f36942m0 = new ArrayList<>();
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: C */
    public void mo15737C() {
        this.f36942m0.clear();
        super.mo15737C();
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: E */
    public void mo15739E(Cache3 cache3) {
        super.mo15739E(cache3);
        int size = this.f36942m0.size();
        for (int i = 0; i < size; i++) {
            this.f36942m0.get(i).mo15739E(cache3);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void mo15775Q() {
        ArrayList<ConstraintWidget> arrayList = this.f36942m0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f36942m0.get(i);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).mo15775Q();
            }
        }
    }

    public WidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f36942m0 = new ArrayList<>();
    }

    public WidgetContainer(int i, int i2) {
        super(i, i2);
        this.f36942m0 = new ArrayList<>();
    }
}
