package p636z0.p697i.p700b.p701h.p702n;

import java.util.Iterator;
import p636z0.p697i.p700b.p701h.Barrier2;
import p636z0.p697i.p700b.p701h.ConstraintWidget;

/* JADX INFO: renamed from: z0.i.b.h.n.k, reason: use source file name */
/* JADX INFO: compiled from: HelperReferences.java */
/* JADX INFO: loaded from: classes.dex */
public class HelperReferences extends WidgetRun {
    public HelperReferences(ConstraintWidget constraintWidget) {
        super(constraintWidget);
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun, p636z0.p697i.p700b.p701h.p702n.Dependency2
    /* JADX INFO: renamed from: a */
    public void mo15794a(Dependency2 dependency2) {
        Barrier2 barrier2 = (Barrier2) this.f37002b;
        int i = barrier2.f36785o0;
        int i2 = 0;
        Iterator<DependencyNode> it = this.f37008h.f36977l.iterator();
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = it.next().f36972g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            this.f37008h.mo15810c(i3 + barrier2.f36787q0);
        } else {
            this.f37008h.mo15810c(i2 + barrier2.f36787q0);
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: d */
    public void mo15795d() {
        ConstraintWidget constraintWidget = this.f37002b;
        if (constraintWidget instanceof Barrier2) {
            DependencyNode dependencyNode = this.f37008h;
            dependencyNode.f36967b = true;
            Barrier2 barrier2 = (Barrier2) constraintWidget;
            int i = barrier2.f36785o0;
            boolean z = barrier2.f36786p0;
            int i2 = 0;
            if (i == 0) {
                dependencyNode.f36970e = DependencyNode.a.LEFT;
                while (i2 < barrier2.f36939n0) {
                    ConstraintWidget constraintWidget2 = barrier2.f36938m0[i2];
                    if (z || constraintWidget2.f36861d0 != 8) {
                        DependencyNode dependencyNode2 = constraintWidget2.f36860d.f37008h;
                        dependencyNode2.f36976k.add(this.f37008h);
                        this.f37008h.f36977l.add(dependencyNode2);
                    }
                    i2++;
                }
                m15822m(this.f37002b.f36860d.f37008h);
                m15822m(this.f37002b.f36860d.f37009i);
                return;
            }
            if (i == 1) {
                dependencyNode.f36970e = DependencyNode.a.RIGHT;
                while (i2 < barrier2.f36939n0) {
                    ConstraintWidget constraintWidget3 = barrier2.f36938m0[i2];
                    if (z || constraintWidget3.f36861d0 != 8) {
                        DependencyNode dependencyNode3 = constraintWidget3.f36860d.f37009i;
                        dependencyNode3.f36976k.add(this.f37008h);
                        this.f37008h.f36977l.add(dependencyNode3);
                    }
                    i2++;
                }
                m15822m(this.f37002b.f36860d.f37008h);
                m15822m(this.f37002b.f36860d.f37009i);
                return;
            }
            if (i == 2) {
                dependencyNode.f36970e = DependencyNode.a.TOP;
                while (i2 < barrier2.f36939n0) {
                    ConstraintWidget constraintWidget4 = barrier2.f36938m0[i2];
                    if (z || constraintWidget4.f36861d0 != 8) {
                        DependencyNode dependencyNode4 = constraintWidget4.f36862e.f37008h;
                        dependencyNode4.f36976k.add(this.f37008h);
                        this.f37008h.f36977l.add(dependencyNode4);
                    }
                    i2++;
                }
                m15822m(this.f37002b.f36862e.f37008h);
                m15822m(this.f37002b.f36862e.f37009i);
                return;
            }
            if (i != 3) {
                return;
            }
            dependencyNode.f36970e = DependencyNode.a.BOTTOM;
            while (i2 < barrier2.f36939n0) {
                ConstraintWidget constraintWidget5 = barrier2.f36938m0[i2];
                if (z || constraintWidget5.f36861d0 != 8) {
                    DependencyNode dependencyNode5 = constraintWidget5.f36862e.f37009i;
                    dependencyNode5.f36976k.add(this.f37008h);
                    this.f37008h.f36977l.add(dependencyNode5);
                }
                i2++;
            }
            m15822m(this.f37002b.f36862e.f37008h);
            m15822m(this.f37002b.f36862e.f37009i);
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: e */
    public void mo15796e() {
        ConstraintWidget constraintWidget = this.f37002b;
        if (constraintWidget instanceof Barrier2) {
            int i = ((Barrier2) constraintWidget).f36785o0;
            if (i == 0 || i == 1) {
                constraintWidget.f36849V = this.f37008h.f36972g;
            } else {
                constraintWidget.f36850W = this.f37008h.f36972g;
            }
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: f */
    public void mo15797f() {
        this.f37003c = null;
        this.f37008h.m15809b();
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: k */
    public boolean mo15799k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m15822m(DependencyNode dependencyNode) {
        this.f37008h.f36976k.add(dependencyNode);
        dependencyNode.f36977l.add(this.f37008h);
    }
}
