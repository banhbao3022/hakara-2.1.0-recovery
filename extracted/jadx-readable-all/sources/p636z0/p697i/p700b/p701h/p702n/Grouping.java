package p636z0.p697i.p700b.p701h.p702n;

import java.util.ArrayList;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.Guideline2;
import p636z0.p697i.p700b.p701h.HelperWidget;

/* JADX INFO: renamed from: z0.i.b.h.n.i, reason: use source file name */
/* JADX INFO: compiled from: Grouping.java */
/* JADX INFO: loaded from: classes.dex */
public class Grouping {
    /* JADX INFO: renamed from: a */
    public static WidgetGroup m15818a(ConstraintWidget constraintWidget, int i, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        int i2;
        int i3 = i == 0 ? constraintWidget.f36875k0 : constraintWidget.f36877l0;
        if (i3 != -1 && (widgetGroup == null || i3 != widgetGroup.f36997c)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                WidgetGroup widgetGroup2 = arrayList.get(i4);
                if (widgetGroup2.f36997c == i3) {
                    if (widgetGroup != null) {
                        widgetGroup.m15831d(i, widgetGroup2);
                        arrayList.remove(widgetGroup);
                    }
                    widgetGroup = widgetGroup2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return widgetGroup;
        }
        if (widgetGroup == null) {
            if (constraintWidget instanceof HelperWidget) {
                HelperWidget helperWidget = (HelperWidget) constraintWidget;
                int i5 = 0;
                while (true) {
                    if (i5 >= helperWidget.f36939n0) {
                        i2 = -1;
                        break;
                    }
                    ConstraintWidget constraintWidget2 = helperWidget.f36938m0[i5];
                    if ((i == 0 && (i2 = constraintWidget2.f36875k0) != -1) || (i == 1 && (i2 = constraintWidget2.f36877l0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        WidgetGroup widgetGroup3 = arrayList.get(i6);
                        if (widgetGroup3.f36997c == i2) {
                            widgetGroup = widgetGroup3;
                            break;
                        }
                    }
                }
            }
            if (widgetGroup == null) {
                widgetGroup = new WidgetGroup(i);
            }
            arrayList.add(widgetGroup);
        }
        if (widgetGroup.m15828a(constraintWidget)) {
            if (constraintWidget instanceof Guideline2) {
                Guideline2 guideline2 = (Guideline2) constraintWidget;
                guideline2.f36935p0.m15726b(guideline2.f36936q0 == 0 ? 1 : 0, arrayList, widgetGroup);
            }
            if (i == 0) {
                constraintWidget.f36875k0 = widgetGroup.f36997c;
                constraintWidget.f36832E.m15726b(i, arrayList, widgetGroup);
                constraintWidget.f36834G.m15726b(i, arrayList, widgetGroup);
            } else {
                constraintWidget.f36877l0 = widgetGroup.f36997c;
                constraintWidget.f36833F.m15726b(i, arrayList, widgetGroup);
                constraintWidget.f36836I.m15726b(i, arrayList, widgetGroup);
                constraintWidget.f36835H.m15726b(i, arrayList, widgetGroup);
            }
            constraintWidget.f36839L.m15726b(i, arrayList, widgetGroup);
        }
        return widgetGroup;
    }

    /* JADX INFO: renamed from: b */
    public static WidgetGroup m15819b(ArrayList<WidgetGroup> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            WidgetGroup widgetGroup = arrayList.get(i2);
            if (i == widgetGroup.f36997c) {
                return widgetGroup;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m15820c(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }
}
