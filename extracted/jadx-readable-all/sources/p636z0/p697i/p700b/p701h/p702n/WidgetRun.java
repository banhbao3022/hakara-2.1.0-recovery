package p636z0.p697i.p700b.p701h.p702n;

import p636z0.p697i.p700b.p701h.ConstraintAnchor;
import p636z0.p697i.p700b.p701h.ConstraintWidget;

/* JADX INFO: renamed from: z0.i.b.h.n.p, reason: use source file name */
/* JADX INFO: compiled from: WidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class WidgetRun implements Dependency2 {

    /* JADX INFO: renamed from: a */
    public int f37001a;

    /* JADX INFO: renamed from: b */
    public ConstraintWidget f37002b;

    /* JADX INFO: renamed from: c */
    public RunGroup f37003c;

    /* JADX INFO: renamed from: d */
    public int f37004d;

    /* JADX INFO: renamed from: e */
    public DimensionDependency f37005e = new DimensionDependency(this);

    /* JADX INFO: renamed from: f */
    public int f37006f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f37007g = false;

    /* JADX INFO: renamed from: h */
    public DependencyNode f37008h = new DependencyNode(this);

    /* JADX INFO: renamed from: i */
    public DependencyNode f37009i = new DependencyNode(this);

    /* JADX INFO: renamed from: j */
    public int f37010j = 1;

    public WidgetRun(ConstraintWidget constraintWidget) {
        this.f37002b = constraintWidget;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.Dependency2
    /* JADX INFO: renamed from: a */
    public void mo15794a(Dependency2 dependency2) {
    }

    /* JADX INFO: renamed from: b */
    public final void m15832b(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i) {
        dependencyNode.f36977l.add(dependencyNode2);
        dependencyNode.f36971f = i;
        dependencyNode2.f36976k.add(dependencyNode);
    }

    /* JADX INFO: renamed from: c */
    public final void m15833c(DependencyNode dependencyNode, DependencyNode dependencyNode2, int i, DimensionDependency dimensionDependency) {
        dependencyNode.f36977l.add(dependencyNode2);
        dependencyNode.f36977l.add(this.f37005e);
        dependencyNode.f36973h = i;
        dependencyNode.f36974i = dimensionDependency;
        dependencyNode2.f36976k.add(dependencyNode);
        dimensionDependency.f36976k.add(dependencyNode);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo15795d();

    /* JADX INFO: renamed from: e */
    public abstract void mo15796e();

    /* JADX INFO: renamed from: f */
    public abstract void mo15797f();

    /* JADX INFO: renamed from: g */
    public final int m15834g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            ConstraintWidget constraintWidget = this.f37002b;
            int i3 = constraintWidget.f36882q;
            iMax = Math.max(constraintWidget.f36881p, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            ConstraintWidget constraintWidget2 = this.f37002b;
            int i4 = constraintWidget2.f36885t;
            iMax = Math.max(constraintWidget2.f36884s, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* JADX INFO: renamed from: h */
    public final DependencyNode m15835h(ConstraintAnchor constraintAnchor) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f36814f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f36812d;
        int iOrdinal = constraintAnchor2.f36813e.ordinal();
        if (iOrdinal == 1) {
            return constraintWidget.f36860d.f37008h;
        }
        if (iOrdinal == 2) {
            return constraintWidget.f36862e.f37008h;
        }
        if (iOrdinal == 3) {
            return constraintWidget.f36860d.f37009i;
        }
        if (iOrdinal == 4) {
            return constraintWidget.f36862e.f37009i;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return constraintWidget.f36862e.f36993k;
    }

    /* JADX INFO: renamed from: i */
    public final DependencyNode m15836i(ConstraintAnchor constraintAnchor, int i) {
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f36814f;
        if (constraintAnchor2 == null) {
            return null;
        }
        ConstraintWidget constraintWidget = constraintAnchor2.f36812d;
        WidgetRun widgetRun = i == 0 ? constraintWidget.f36860d : constraintWidget.f36862e;
        int iOrdinal = constraintAnchor2.f36813e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return widgetRun.f37008h;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            return widgetRun.f37009i;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public long mo15798j() {
        DimensionDependency dimensionDependency = this.f37005e;
        if (dimensionDependency.f36975j) {
            return dimensionDependency.f36972g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo15799k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX INFO: renamed from: l */
    public void m15837l(ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i) {
        DimensionDependency dimensionDependency;
        float f;
        int i2;
        DependencyNode dependencyNodeM15835h = m15835h(constraintAnchor);
        DependencyNode dependencyNodeM15835h2 = m15835h(constraintAnchor2);
        if (dependencyNodeM15835h.f36975j && dependencyNodeM15835h2.f36975j) {
            int iM15728d = constraintAnchor.m15728d() + dependencyNodeM15835h.f36972g;
            int iM15728d2 = dependencyNodeM15835h2.f36972g - constraintAnchor2.m15728d();
            int i3 = iM15728d2 - iM15728d;
            DimensionDependency dimensionDependency2 = this.f37005e;
            if (!dimensionDependency2.f36975j && this.f37004d == 3) {
                int i4 = this.f37001a;
                if (i4 == 0) {
                    dimensionDependency2.mo15810c(m15834g(i3, i));
                } else if (i4 == 1) {
                    this.f37005e.mo15810c(Math.min(m15834g(dimensionDependency2.f36987m, i), i3));
                } else if (i4 == 2) {
                    ConstraintWidget constraintWidget = this.f37002b;
                    ConstraintWidget constraintWidget2 = constraintWidget.f36844Q;
                    if (constraintWidget2 != null) {
                        DimensionDependency dimensionDependency3 = (i == 0 ? constraintWidget2.f36860d : constraintWidget2.f36862e).f37005e;
                        if (dimensionDependency3.f36975j) {
                            dimensionDependency2.mo15810c(m15834g((int) ((dimensionDependency3.f36972g * (i == 0 ? constraintWidget.f36883r : constraintWidget.f36886u)) + 0.5f), i));
                        }
                    }
                } else if (i4 == 3) {
                    ConstraintWidget constraintWidget3 = this.f37002b;
                    WidgetRun widgetRun = constraintWidget3.f36860d;
                    if (widgetRun.f37004d == 3 && widgetRun.f37001a == 3) {
                        VerticalWidgetRun verticalWidgetRun = constraintWidget3.f36862e;
                        if (verticalWidgetRun.f37004d != 3 || verticalWidgetRun.f37001a != 3) {
                            if (i == 0) {
                                widgetRun = constraintWidget3.f36862e;
                            }
                            dimensionDependency = widgetRun.f37005e;
                            if (dimensionDependency.f36975j) {
                                f = constraintWidget3.f36847T;
                                if (i == 1) {
                                    i2 = (int) ((dimensionDependency.f36972g / f) + 0.5f);
                                } else {
                                    i2 = (int) ((f * dimensionDependency.f36972g) + 0.5f);
                                }
                                dimensionDependency2.mo15810c(i2);
                            }
                        }
                    } else {
                        if (i == 0) {
                            widgetRun = constraintWidget3.f36862e;
                        }
                        dimensionDependency = widgetRun.f37005e;
                        if (dimensionDependency.f36975j) {
                            f = constraintWidget3.f36847T;
                            if (i == 1) {
                                i2 = (int) ((dimensionDependency.f36972g / f) + 0.5f);
                            } else {
                                i2 = (int) ((f * dimensionDependency.f36972g) + 0.5f);
                            }
                            dimensionDependency2.mo15810c(i2);
                        }
                    }
                }
            }
            DimensionDependency dimensionDependency4 = this.f37005e;
            if (dimensionDependency4.f36975j) {
                int i5 = dimensionDependency4.f36972g;
                if (i5 == i3) {
                    this.f37008h.mo15810c(iM15728d);
                    this.f37009i.mo15810c(iM15728d2);
                    return;
                }
                ConstraintWidget constraintWidget4 = this.f37002b;
                float f2 = i == 0 ? constraintWidget4.f36855a0 : constraintWidget4.f36857b0;
                if (dependencyNodeM15835h == dependencyNodeM15835h2) {
                    iM15728d = dependencyNodeM15835h.f36972g;
                    iM15728d2 = dependencyNodeM15835h2.f36972g;
                    f2 = 0.5f;
                }
                this.f37008h.mo15810c((int) ((((iM15728d2 - iM15728d) - i5) * f2) + iM15728d + 0.5f));
                this.f37009i.mo15810c(this.f37008h.f36972g + this.f37005e.f36972g);
            }
        }
    }
}
