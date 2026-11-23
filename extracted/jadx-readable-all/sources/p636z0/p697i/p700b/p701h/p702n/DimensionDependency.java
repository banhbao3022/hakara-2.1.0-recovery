package p636z0.p697i.p700b.p701h.p702n;

/* JADX INFO: renamed from: z0.i.b.h.n.g, reason: use source file name */
/* JADX INFO: compiled from: DimensionDependency.java */
/* JADX INFO: loaded from: classes.dex */
public class DimensionDependency extends DependencyNode {

    /* JADX INFO: renamed from: m */
    public int f36987m;

    public DimensionDependency(WidgetRun widgetRun) {
        super(widgetRun);
        if (widgetRun instanceof HorizontalWidgetRun) {
            this.f36970e = DependencyNode.a.HORIZONTAL_DIMENSION;
        } else {
            this.f36970e = DependencyNode.a.VERTICAL_DIMENSION;
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.DependencyNode
    /* JADX INFO: renamed from: c */
    public void mo15810c(int i) {
        if (this.f36975j) {
            return;
        }
        this.f36975j = true;
        this.f36972g = i;
        for (Dependency2 dependency2 : this.f36976k) {
            dependency2.mo15794a(dependency2);
        }
    }
}
