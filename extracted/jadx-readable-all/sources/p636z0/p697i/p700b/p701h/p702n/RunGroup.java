package p636z0.p697i.p700b.p701h.p702n;

import java.util.ArrayList;

/* JADX INFO: renamed from: z0.i.b.h.n.m, reason: use source file name */
/* JADX INFO: compiled from: RunGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class RunGroup {

    /* JADX INFO: renamed from: a */
    public static int f36990a;

    /* JADX INFO: renamed from: b */
    public WidgetRun f36991b;

    /* JADX INFO: renamed from: c */
    public ArrayList<WidgetRun> f36992c = new ArrayList<>();

    public RunGroup(WidgetRun widgetRun, int i) {
        this.f36991b = null;
        f36990a++;
        this.f36991b = widgetRun;
    }

    /* JADX INFO: renamed from: a */
    public final long m15825a(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.f36969d;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.f36976k.size();
        long jMin = j2;
        for (int i = 0; i < size; i++) {
            Dependency2 dependency2 = dependencyNode.f36976k.get(i);
            if (dependency2 instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency2;
                if (dependencyNode2.f36969d != widgetRun) {
                    jMin = Math.min(jMin, m15825a(dependencyNode2, ((long) dependencyNode2.f36971f) + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.f37009i) {
            return jMin;
        }
        long jMo15798j = j2 - widgetRun.mo15798j();
        return Math.min(Math.min(jMin, m15825a(widgetRun.f37008h, jMo15798j)), jMo15798j - ((long) widgetRun.f37008h.f36971f));
    }

    /* JADX INFO: renamed from: b */
    public final long m15826b(DependencyNode dependencyNode, long j2) {
        WidgetRun widgetRun = dependencyNode.f36969d;
        if (widgetRun instanceof HelperReferences) {
            return j2;
        }
        int size = dependencyNode.f36976k.size();
        long jMax = j2;
        for (int i = 0; i < size; i++) {
            Dependency2 dependency2 = dependencyNode.f36976k.get(i);
            if (dependency2 instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency2;
                if (dependencyNode2.f36969d != widgetRun) {
                    jMax = Math.max(jMax, m15826b(dependencyNode2, ((long) dependencyNode2.f36971f) + j2));
                }
            }
        }
        if (dependencyNode != widgetRun.f37008h) {
            return jMax;
        }
        long jMo15798j = j2 + widgetRun.mo15798j();
        return Math.max(Math.max(jMax, m15826b(widgetRun.f37009i, jMo15798j)), jMo15798j - ((long) widgetRun.f37009i.f36971f));
    }
}
