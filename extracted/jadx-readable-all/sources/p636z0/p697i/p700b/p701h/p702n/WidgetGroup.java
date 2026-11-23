package p636z0.p697i.p700b.p701h.p702n;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p697i.p700b.LinearSystem;
import p636z0.p697i.p700b.p701h.Chain;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.ConstraintWidgetContainer;

/* JADX INFO: renamed from: z0.i.b.h.n.o, reason: use source file name */
/* JADX INFO: compiled from: WidgetGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class WidgetGroup {

    /* JADX INFO: renamed from: a */
    public static int f36995a;

    /* JADX INFO: renamed from: c */
    public int f36997c;

    /* JADX INFO: renamed from: d */
    public int f36998d;

    /* JADX INFO: renamed from: b */
    public ArrayList<ConstraintWidget> f36996b = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<a> f36999e = null;

    /* JADX INFO: renamed from: f */
    public int f37000f = -1;

    /* JADX INFO: renamed from: z0.i.b.h.n.o$a */
    /* JADX INFO: compiled from: WidgetGroup.java */
    public class a {
        public a(WidgetGroup widgetGroup, ConstraintWidget constraintWidget, LinearSystem linearSystem, int i) {
            new WeakReference(constraintWidget);
            linearSystem.m15702o(constraintWidget.f36832E);
            linearSystem.m15702o(constraintWidget.f36833F);
            linearSystem.m15702o(constraintWidget.f36834G);
            linearSystem.m15702o(constraintWidget.f36835H);
            linearSystem.m15702o(constraintWidget.f36836I);
        }
    }

    public WidgetGroup(int i) {
        this.f36997c = -1;
        this.f36998d = 0;
        int i2 = f36995a;
        f36995a = i2 + 1;
        this.f36997c = i2;
        this.f36998d = i;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15828a(ConstraintWidget constraintWidget) {
        if (this.f36996b.contains(constraintWidget)) {
            return false;
        }
        this.f36996b.add(constraintWidget);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m15829b(ArrayList<WidgetGroup> arrayList) {
        int size = this.f36996b.size();
        if (this.f37000f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                WidgetGroup widgetGroup = arrayList.get(i);
                if (this.f37000f == widgetGroup.f36997c) {
                    m15831d(this.f36998d, widgetGroup);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m15830c(LinearSystem linearSystem, int i) {
        int iM15702o;
        int iM15702o2;
        if (this.f36996b.size() == 0) {
            return 0;
        }
        ArrayList<ConstraintWidget> arrayList = this.f36996b;
        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) arrayList.get(0).f36844Q;
        linearSystem.m15708u();
        constraintWidgetContainer.mo15722e(linearSystem, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo15722e(linearSystem, false);
        }
        if (i == 0 && constraintWidgetContainer.f36905u0 > 0) {
            Chain.m15724a(constraintWidgetContainer, linearSystem, arrayList, 0);
        }
        if (i == 1 && constraintWidgetContainer.f36906v0 > 0) {
            Chain.m15724a(constraintWidgetContainer, linearSystem, arrayList, 1);
        }
        try {
            linearSystem.m15704q();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f36999e = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f36999e.add(new a(this, arrayList.get(i3), linearSystem, i));
        }
        if (i == 0) {
            iM15702o = linearSystem.m15702o(constraintWidgetContainer.f36832E);
            iM15702o2 = linearSystem.m15702o(constraintWidgetContainer.f36834G);
            linearSystem.m15708u();
        } else {
            iM15702o = linearSystem.m15702o(constraintWidgetContainer.f36833F);
            iM15702o2 = linearSystem.m15702o(constraintWidgetContainer.f36835H);
            linearSystem.m15708u();
        }
        return iM15702o2 - iM15702o;
    }

    /* JADX INFO: renamed from: d */
    public void m15831d(int i, WidgetGroup widgetGroup) {
        for (ConstraintWidget constraintWidget : this.f36996b) {
            widgetGroup.m15828a(constraintWidget);
            if (i == 0) {
                constraintWidget.f36875k0 = widgetGroup.f36997c;
            } else {
                constraintWidget.f36877l0 = widgetGroup.f36997c;
            }
        }
        this.f37000f = widgetGroup.f36997c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.f36998d;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strM1603y = outline.m1603y(sb, this.f36997c, "] <");
        for (ConstraintWidget constraintWidget : this.f36996b) {
            StringBuilder sbM1561L = outline.m1561L(strM1603y, " ");
            sbM1561L.append(constraintWidget.f36863e0);
            strM1603y = sbM1561L.toString();
        }
        return outline.m1599u(strM1603y, " >");
    }
}
