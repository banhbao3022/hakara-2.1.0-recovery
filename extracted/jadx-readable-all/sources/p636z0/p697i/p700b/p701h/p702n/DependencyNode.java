package p636z0.p697i.p700b.p701h.p702n;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.i.b.h.n.f, reason: use source file name */
/* JADX INFO: compiled from: DependencyNode.java */
/* JADX INFO: loaded from: classes.dex */
public class DependencyNode implements Dependency2 {

    /* JADX INFO: renamed from: d */
    public WidgetRun f36969d;

    /* JADX INFO: renamed from: f */
    public int f36971f;

    /* JADX INFO: renamed from: g */
    public int f36972g;

    /* JADX INFO: renamed from: a */
    public Dependency2 f36966a = null;

    /* JADX INFO: renamed from: b */
    public boolean f36967b = false;

    /* JADX INFO: renamed from: c */
    public boolean f36968c = false;

    /* JADX INFO: renamed from: e */
    public a f36970e = a.UNKNOWN;

    /* JADX INFO: renamed from: h */
    public int f36973h = 1;

    /* JADX INFO: renamed from: i */
    public DimensionDependency f36974i = null;

    /* JADX INFO: renamed from: j */
    public boolean f36975j = false;

    /* JADX INFO: renamed from: k */
    public List<Dependency2> f36976k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<DependencyNode> f36977l = new ArrayList();

    /* JADX INFO: renamed from: z0.i.b.h.n.f$a */
    /* JADX INFO: compiled from: DependencyNode.java */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public DependencyNode(WidgetRun widgetRun) {
        this.f36969d = widgetRun;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.Dependency2
    /* JADX INFO: renamed from: a */
    public void mo15794a(Dependency2 dependency2) {
        Iterator<DependencyNode> it = this.f36977l.iterator();
        while (it.hasNext()) {
            if (!it.next().f36975j) {
                return;
            }
        }
        this.f36968c = true;
        Dependency2 dependency3 = this.f36966a;
        if (dependency3 != null) {
            dependency3.mo15794a(this);
        }
        if (this.f36967b) {
            this.f36969d.mo15794a(this);
            return;
        }
        DependencyNode dependencyNode = null;
        int i = 0;
        for (DependencyNode dependencyNode2 : this.f36977l) {
            if (!(dependencyNode2 instanceof DimensionDependency)) {
                i++;
                dependencyNode = dependencyNode2;
            }
        }
        if (dependencyNode != null && i == 1 && dependencyNode.f36975j) {
            DimensionDependency dimensionDependency = this.f36974i;
            if (dimensionDependency != null) {
                if (!dimensionDependency.f36975j) {
                    return;
                } else {
                    this.f36971f = this.f36973h * dimensionDependency.f36972g;
                }
            }
            mo15810c(dependencyNode.f36972g + this.f36971f);
        }
        Dependency2 dependency4 = this.f36966a;
        if (dependency4 != null) {
            dependency4.mo15794a(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15809b() {
        this.f36977l.clear();
        this.f36976k.clear();
        this.f36975j = false;
        this.f36972g = 0;
        this.f36968c = false;
        this.f36967b = false;
    }

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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36969d.f37002b.f36863e0);
        sb.append(":");
        sb.append(this.f36970e);
        sb.append("(");
        sb.append(this.f36975j ? Integer.valueOf(this.f36972g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f36977l.size());
        sb.append(":d=");
        sb.append(this.f36976k.size());
        sb.append(">");
        return sb.toString();
    }
}
