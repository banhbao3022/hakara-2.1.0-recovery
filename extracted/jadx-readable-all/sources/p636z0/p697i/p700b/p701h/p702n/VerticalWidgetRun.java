package p636z0.p697i.p700b.p701h.p702n;

import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p697i.p700b.p701h.ConstraintAnchor;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.Helper;

/* JADX INFO: renamed from: z0.i.b.h.n.n, reason: use source file name */
/* JADX INFO: compiled from: VerticalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class VerticalWidgetRun extends WidgetRun {

    /* JADX INFO: renamed from: k */
    public DependencyNode f36993k;

    /* JADX INFO: renamed from: l */
    public DimensionDependency f36994l;

    public VerticalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        DependencyNode dependencyNode = new DependencyNode(this);
        this.f36993k = dependencyNode;
        this.f36994l = null;
        this.f37008h.f36970e = DependencyNode.a.TOP;
        this.f37009i.f36970e = DependencyNode.a.BOTTOM;
        dependencyNode.f36970e = DependencyNode.a.BASELINE;
        this.f37006f = 1;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun, p636z0.p697i.p700b.p701h.p702n.Dependency2
    /* JADX INFO: renamed from: a */
    public void mo15794a(Dependency2 dependency2) {
        float f;
        float f2;
        float f3;
        int i;
        int iM15315d = C7804v0.m15315d(this.f37010j);
        if (iM15315d != 1 && iM15315d != 2 && iM15315d == 3) {
            ConstraintWidget constraintWidget = this.f37002b;
            m15837l(constraintWidget.f36833F, constraintWidget.f36835H, 1);
            return;
        }
        DimensionDependency dimensionDependency = this.f37005e;
        if (dimensionDependency.f36968c && !dimensionDependency.f36975j && this.f37004d == 3) {
            ConstraintWidget constraintWidget2 = this.f37002b;
            int i2 = constraintWidget2.f36879n;
            if (i2 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f36844Q;
                if (constraintWidget3 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget3.f36862e.f37005e;
                    if (dimensionDependency2.f36975j) {
                        dimensionDependency.mo15810c((int) ((dimensionDependency2.f36972g * constraintWidget2.f36886u) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                DimensionDependency dimensionDependency3 = constraintWidget2.f36860d.f37005e;
                if (dimensionDependency3.f36975j) {
                    int i3 = constraintWidget2.f36848U;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = dimensionDependency3.f36972g * constraintWidget2.f36847T;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = dimensionDependency3.f36972g;
                            f2 = constraintWidget2.f36847T;
                        }
                        dimensionDependency.mo15810c(i);
                    } else {
                        f = dimensionDependency3.f36972g;
                        f2 = constraintWidget2.f36847T;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    dimensionDependency.mo15810c(i);
                }
            }
        }
        DependencyNode dependencyNode = this.f37008h;
        if (dependencyNode.f36968c) {
            DependencyNode dependencyNode2 = this.f37009i;
            if (dependencyNode2.f36968c) {
                if (dependencyNode.f36975j && dependencyNode2.f36975j && this.f37005e.f36975j) {
                    return;
                }
                if (!this.f37005e.f36975j && this.f37004d == 3) {
                    ConstraintWidget constraintWidget4 = this.f37002b;
                    if (constraintWidget4.f36878m == 0 && !constraintWidget4.m15772y()) {
                        DependencyNode dependencyNode3 = this.f37008h.f36977l.get(0);
                        DependencyNode dependencyNode4 = this.f37009i.f36977l.get(0);
                        int i4 = dependencyNode3.f36972g;
                        DependencyNode dependencyNode5 = this.f37008h;
                        int i5 = i4 + dependencyNode5.f36971f;
                        int i6 = dependencyNode4.f36972g + this.f37009i.f36971f;
                        dependencyNode5.mo15810c(i5);
                        this.f37009i.mo15810c(i6);
                        this.f37005e.mo15810c(i6 - i5);
                        return;
                    }
                }
                if (!this.f37005e.f36975j && this.f37004d == 3 && this.f37001a == 1 && this.f37008h.f36977l.size() > 0 && this.f37009i.f36977l.size() > 0) {
                    DependencyNode dependencyNode6 = this.f37008h.f36977l.get(0);
                    int i7 = (this.f37009i.f36977l.get(0).f36972g + this.f37009i.f36971f) - (dependencyNode6.f36972g + this.f37008h.f36971f);
                    DimensionDependency dimensionDependency4 = this.f37005e;
                    int i8 = dimensionDependency4.f36987m;
                    if (i7 < i8) {
                        dimensionDependency4.mo15810c(i7);
                    } else {
                        dimensionDependency4.mo15810c(i8);
                    }
                }
                if (this.f37005e.f36975j && this.f37008h.f36977l.size() > 0 && this.f37009i.f36977l.size() > 0) {
                    DependencyNode dependencyNode7 = this.f37008h.f36977l.get(0);
                    DependencyNode dependencyNode8 = this.f37009i.f36977l.get(0);
                    int i9 = dependencyNode7.f36972g;
                    DependencyNode dependencyNode9 = this.f37008h;
                    int i10 = dependencyNode9.f36971f + i9;
                    int i11 = dependencyNode8.f36972g;
                    int i12 = this.f37009i.f36971f + i11;
                    float f4 = this.f37002b.f36857b0;
                    if (dependencyNode7 == dependencyNode8) {
                        f4 = 0.5f;
                    } else {
                        i9 = i10;
                        i11 = i12;
                    }
                    dependencyNode9.mo15810c((int) ((((i11 - i9) - this.f37005e.f36972g) * f4) + i9 + 0.5f));
                    this.f37009i.mo15810c(this.f37008h.f36972g + this.f37005e.f36972g);
                }
            }
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: d */
    public void mo15795d() {
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4 = this.f37002b;
        if (constraintWidget4.f36854a) {
            this.f37005e.mo15810c(constraintWidget4.m15760m());
        }
        if (!this.f37005e.f36975j) {
            this.f37004d = this.f37002b.m15765r();
            if (this.f37002b.f36891z) {
                this.f36994l = new BaselineDimensionDependency(this);
            }
            int i = this.f37004d;
            if (i != 3) {
                if (i == 4 && (constraintWidget3 = this.f37002b.f36844Q) != null && constraintWidget3.m15765r() == 1) {
                    int iM15760m = (constraintWidget3.m15760m() - this.f37002b.f36833F.m15728d()) - this.f37002b.f36835H.m15728d();
                    m15832b(this.f37008h, constraintWidget3.f36862e.f37008h, this.f37002b.f36833F.m15728d());
                    m15832b(this.f37009i, constraintWidget3.f36862e.f37009i, -this.f37002b.f36835H.m15728d());
                    this.f37005e.mo15810c(iM15760m);
                    return;
                }
                if (this.f37004d == 1) {
                    this.f37005e.mo15810c(this.f37002b.m15760m());
                }
            }
        } else if (this.f37004d == 4 && (constraintWidget = this.f37002b.f36844Q) != null && constraintWidget.m15765r() == 1) {
            m15832b(this.f37008h, constraintWidget.f36862e.f37008h, this.f37002b.f36833F.m15728d());
            m15832b(this.f37009i, constraintWidget.f36862e.f37009i, -this.f37002b.f36835H.m15728d());
            return;
        }
        DimensionDependency dimensionDependency = this.f37005e;
        boolean z = dimensionDependency.f36975j;
        if (z) {
            ConstraintWidget constraintWidget5 = this.f37002b;
            if (constraintWidget5.f36854a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.f36840M;
                if (constraintAnchorArr[2].f36814f != null && constraintAnchorArr[3].f36814f != null) {
                    if (constraintWidget5.m15772y()) {
                        this.f37008h.f36971f = this.f37002b.f36840M[2].m15728d();
                        this.f37009i.f36971f = -this.f37002b.f36840M[3].m15728d();
                    } else {
                        DependencyNode dependencyNodeM15835h = m15835h(this.f37002b.f36840M[2]);
                        if (dependencyNodeM15835h != null) {
                            DependencyNode dependencyNode = this.f37008h;
                            int iM15728d = this.f37002b.f36840M[2].m15728d();
                            dependencyNode.f36977l.add(dependencyNodeM15835h);
                            dependencyNode.f36971f = iM15728d;
                            dependencyNodeM15835h.f36976k.add(dependencyNode);
                        }
                        DependencyNode dependencyNodeM15835h2 = m15835h(this.f37002b.f36840M[3]);
                        if (dependencyNodeM15835h2 != null) {
                            DependencyNode dependencyNode2 = this.f37009i;
                            int i2 = -this.f37002b.f36840M[3].m15728d();
                            dependencyNode2.f36977l.add(dependencyNodeM15835h2);
                            dependencyNode2.f36971f = i2;
                            dependencyNodeM15835h2.f36976k.add(dependencyNode2);
                        }
                        this.f37008h.f36967b = true;
                        this.f37009i.f36967b = true;
                    }
                    ConstraintWidget constraintWidget6 = this.f37002b;
                    if (constraintWidget6.f36891z) {
                        m15832b(this.f36993k, this.f37008h, constraintWidget6.f36851X);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[2].f36814f != null) {
                    DependencyNode dependencyNodeM15835h3 = m15835h(constraintAnchorArr[2]);
                    if (dependencyNodeM15835h3 != null) {
                        DependencyNode dependencyNode3 = this.f37008h;
                        int iM15728d2 = this.f37002b.f36840M[2].m15728d();
                        dependencyNode3.f36977l.add(dependencyNodeM15835h3);
                        dependencyNode3.f36971f = iM15728d2;
                        dependencyNodeM15835h3.f36976k.add(dependencyNode3);
                        m15832b(this.f37009i, this.f37008h, this.f37005e.f36972g);
                        ConstraintWidget constraintWidget7 = this.f37002b;
                        if (constraintWidget7.f36891z) {
                            m15832b(this.f36993k, this.f37008h, constraintWidget7.f36851X);
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[3].f36814f != null) {
                    DependencyNode dependencyNodeM15835h4 = m15835h(constraintAnchorArr[3]);
                    if (dependencyNodeM15835h4 != null) {
                        DependencyNode dependencyNode4 = this.f37009i;
                        int i3 = -this.f37002b.f36840M[3].m15728d();
                        dependencyNode4.f36977l.add(dependencyNodeM15835h4);
                        dependencyNode4.f36971f = i3;
                        dependencyNodeM15835h4.f36976k.add(dependencyNode4);
                        m15832b(this.f37008h, this.f37009i, -this.f37005e.f36972g);
                    }
                    ConstraintWidget constraintWidget8 = this.f37002b;
                    if (constraintWidget8.f36891z) {
                        m15832b(this.f36993k, this.f37008h, constraintWidget8.f36851X);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[4].f36814f != null) {
                    DependencyNode dependencyNodeM15835h5 = m15835h(constraintAnchorArr[4]);
                    if (dependencyNodeM15835h5 != null) {
                        DependencyNode dependencyNode5 = this.f36993k;
                        dependencyNode5.f36977l.add(dependencyNodeM15835h5);
                        dependencyNode5.f36971f = 0;
                        dependencyNodeM15835h5.f36976k.add(dependencyNode5);
                        m15832b(this.f37008h, this.f36993k, -this.f37002b.f36851X);
                        m15832b(this.f37009i, this.f37008h, this.f37005e.f36972g);
                        return;
                    }
                    return;
                }
                if ((constraintWidget5 instanceof Helper) || constraintWidget5.f36844Q == null || constraintWidget5.mo15757j(ConstraintAnchor.a.CENTER).f36814f != null) {
                    return;
                }
                ConstraintWidget constraintWidget9 = this.f37002b;
                m15832b(this.f37008h, constraintWidget9.f36844Q.f36862e.f37008h, constraintWidget9.m15768u());
                m15832b(this.f37009i, this.f37008h, this.f37005e.f36972g);
                ConstraintWidget constraintWidget10 = this.f37002b;
                if (constraintWidget10.f36891z) {
                    m15832b(this.f36993k, this.f37008h, constraintWidget10.f36851X);
                    return;
                }
                return;
            }
        }
        if (z || this.f37004d != 3) {
            dimensionDependency.f36976k.add(this);
            if (dimensionDependency.f36975j) {
                mo15794a(this);
            }
        } else {
            ConstraintWidget constraintWidget11 = this.f37002b;
            int i4 = constraintWidget11.f36879n;
            if (i4 == 2) {
                ConstraintWidget constraintWidget12 = constraintWidget11.f36844Q;
                if (constraintWidget12 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget12.f36862e.f37005e;
                    dimensionDependency.f36977l.add(dimensionDependency2);
                    dimensionDependency2.f36976k.add(this.f37005e);
                    DimensionDependency dimensionDependency3 = this.f37005e;
                    dimensionDependency3.f36967b = true;
                    dimensionDependency3.f36976k.add(this.f37008h);
                    this.f37005e.f36976k.add(this.f37009i);
                }
            } else if (i4 == 3 && !constraintWidget11.m15772y()) {
                ConstraintWidget constraintWidget13 = this.f37002b;
                if (constraintWidget13.f36878m != 3) {
                    DimensionDependency dimensionDependency4 = constraintWidget13.f36860d.f37005e;
                    this.f37005e.f36977l.add(dimensionDependency4);
                    dimensionDependency4.f36976k.add(this.f37005e);
                    DimensionDependency dimensionDependency5 = this.f37005e;
                    dimensionDependency5.f36967b = true;
                    dimensionDependency5.f36976k.add(this.f37008h);
                    this.f37005e.f36976k.add(this.f37009i);
                }
            }
        }
        ConstraintWidget constraintWidget14 = this.f37002b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget14.f36840M;
        if (constraintAnchorArr2[2].f36814f != null && constraintAnchorArr2[3].f36814f != null) {
            if (constraintWidget14.m15772y()) {
                this.f37008h.f36971f = this.f37002b.f36840M[2].m15728d();
                this.f37009i.f36971f = -this.f37002b.f36840M[3].m15728d();
            } else {
                DependencyNode dependencyNodeM15835h6 = m15835h(this.f37002b.f36840M[2]);
                DependencyNode dependencyNodeM15835h7 = m15835h(this.f37002b.f36840M[3]);
                dependencyNodeM15835h6.f36976k.add(this);
                if (dependencyNodeM15835h6.f36975j) {
                    mo15794a(this);
                }
                dependencyNodeM15835h7.f36976k.add(this);
                if (dependencyNodeM15835h7.f36975j) {
                    mo15794a(this);
                }
                this.f37010j = 4;
            }
            if (this.f37002b.f36891z) {
                m15833c(this.f36993k, this.f37008h, 1, this.f36994l);
            }
        } else if (constraintAnchorArr2[2].f36814f != null) {
            DependencyNode dependencyNodeM15835h8 = m15835h(constraintAnchorArr2[2]);
            if (dependencyNodeM15835h8 != null) {
                DependencyNode dependencyNode6 = this.f37008h;
                int iM15728d3 = this.f37002b.f36840M[2].m15728d();
                dependencyNode6.f36977l.add(dependencyNodeM15835h8);
                dependencyNode6.f36971f = iM15728d3;
                dependencyNodeM15835h8.f36976k.add(dependencyNode6);
                m15833c(this.f37009i, this.f37008h, 1, this.f37005e);
                if (this.f37002b.f36891z) {
                    m15833c(this.f36993k, this.f37008h, 1, this.f36994l);
                }
                if (this.f37004d == 3) {
                    ConstraintWidget constraintWidget15 = this.f37002b;
                    if (constraintWidget15.f36847T > 0.0f) {
                        HorizontalWidgetRun horizontalWidgetRun = constraintWidget15.f36860d;
                        if (horizontalWidgetRun.f37004d == 3) {
                            horizontalWidgetRun.f37005e.f36976k.add(this.f37005e);
                            this.f37005e.f36977l.add(this.f37002b.f36860d.f37005e);
                            this.f37005e.f36966a = this;
                        }
                    }
                }
            }
        } else if (constraintAnchorArr2[3].f36814f != null) {
            DependencyNode dependencyNodeM15835h9 = m15835h(constraintAnchorArr2[3]);
            if (dependencyNodeM15835h9 != null) {
                DependencyNode dependencyNode7 = this.f37009i;
                int i5 = -this.f37002b.f36840M[3].m15728d();
                dependencyNode7.f36977l.add(dependencyNodeM15835h9);
                dependencyNode7.f36971f = i5;
                dependencyNodeM15835h9.f36976k.add(dependencyNode7);
                m15833c(this.f37008h, this.f37009i, -1, this.f37005e);
                if (this.f37002b.f36891z) {
                    m15833c(this.f36993k, this.f37008h, 1, this.f36994l);
                }
            }
        } else if (constraintAnchorArr2[4].f36814f != null) {
            DependencyNode dependencyNodeM15835h10 = m15835h(constraintAnchorArr2[4]);
            if (dependencyNodeM15835h10 != null) {
                DependencyNode dependencyNode8 = this.f36993k;
                dependencyNode8.f36977l.add(dependencyNodeM15835h10);
                dependencyNode8.f36971f = 0;
                dependencyNodeM15835h10.f36976k.add(dependencyNode8);
                m15833c(this.f37008h, this.f36993k, -1, this.f36994l);
                m15833c(this.f37009i, this.f37008h, 1, this.f37005e);
            }
        } else if (!(constraintWidget14 instanceof Helper) && (constraintWidget2 = constraintWidget14.f36844Q) != null) {
            m15832b(this.f37008h, constraintWidget2.f36862e.f37008h, constraintWidget14.m15768u());
            m15833c(this.f37009i, this.f37008h, 1, this.f37005e);
            if (this.f37002b.f36891z) {
                m15833c(this.f36993k, this.f37008h, 1, this.f36994l);
            }
            if (this.f37004d == 3) {
                ConstraintWidget constraintWidget16 = this.f37002b;
                if (constraintWidget16.f36847T > 0.0f) {
                    HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget16.f36860d;
                    if (horizontalWidgetRun2.f37004d == 3) {
                        horizontalWidgetRun2.f37005e.f36976k.add(this.f37005e);
                        this.f37005e.f36977l.add(this.f37002b.f36860d.f37005e);
                        this.f37005e.f36966a = this;
                    }
                }
            }
        }
        if (this.f37005e.f36977l.size() == 0) {
            this.f37005e.f36968c = true;
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: e */
    public void mo15796e() {
        DependencyNode dependencyNode = this.f37008h;
        if (dependencyNode.f36975j) {
            this.f37002b.f36850W = dependencyNode.f36972g;
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: f */
    public void mo15797f() {
        this.f37003c = null;
        this.f37008h.m15809b();
        this.f37009i.m15809b();
        this.f36993k.m15809b();
        this.f37005e.m15809b();
        this.f37007g = false;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: k */
    public boolean mo15799k() {
        return this.f37004d != 3 || this.f37002b.f36879n == 0;
    }

    /* JADX INFO: renamed from: m */
    public void m15827m() {
        this.f37007g = false;
        this.f37008h.m15809b();
        this.f37008h.f36975j = false;
        this.f37009i.m15809b();
        this.f37009i.f36975j = false;
        this.f36993k.m15809b();
        this.f36993k.f36975j = false;
        this.f37005e.f36975j = false;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("VerticalRun ");
        sbM1556G.append(this.f37002b.f36863e0);
        return sbM1556G.toString();
    }
}
