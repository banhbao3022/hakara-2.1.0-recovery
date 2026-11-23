package p636z0.p697i.p700b.p701h.p702n;

import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p697i.p700b.p701h.ConstraintAnchor;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.Helper;

/* JADX INFO: renamed from: z0.i.b.h.n.l, reason: use source file name */
/* JADX INFO: compiled from: HorizontalWidgetRun.java */
/* JADX INFO: loaded from: classes.dex */
public class HorizontalWidgetRun extends WidgetRun {

    /* JADX INFO: renamed from: k */
    public static int[] f36989k = new int[2];

    public HorizontalWidgetRun(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        this.f37008h.f36970e = DependencyNode.a.LEFT;
        this.f37009i.f36970e = DependencyNode.a.RIGHT;
        this.f37006f = 0;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x0164  */
    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun, p636z0.p697i.p700b.p701h.p702n.Dependency2
    /* JADX INFO: renamed from: a */
    public void mo15794a(Dependency2 dependency2) {
        int iM15834g;
        int i;
        int iM15834g2;
        float f;
        float f2;
        float f3;
        int i2;
        int iM15315d = C7804v0.m15315d(this.f37010j);
        if (iM15315d != 1 && iM15315d != 2 && iM15315d == 3) {
            ConstraintWidget constraintWidget = this.f37002b;
            m15837l(constraintWidget.f36832E, constraintWidget.f36834G, 0);
            return;
        }
        DimensionDependency dimensionDependency = this.f37005e;
        if (!dimensionDependency.f36975j && this.f37004d == 3) {
            ConstraintWidget constraintWidget2 = this.f37002b;
            int i3 = constraintWidget2.f36878m;
            if (i3 == 2) {
                ConstraintWidget constraintWidget3 = constraintWidget2.f36844Q;
                if (constraintWidget3 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget3.f36860d.f37005e;
                    if (dimensionDependency2.f36975j) {
                        dimensionDependency.mo15810c((int) ((dimensionDependency2.f36972g * constraintWidget2.f36883r) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = constraintWidget2.f36879n;
                if (i4 == 0 || i4 == 3) {
                    VerticalWidgetRun verticalWidgetRun = constraintWidget2.f36862e;
                    DependencyNode dependencyNode = verticalWidgetRun.f37008h;
                    DependencyNode dependencyNode2 = verticalWidgetRun.f37009i;
                    boolean z = constraintWidget2.f36832E.f36814f != null;
                    boolean z2 = constraintWidget2.f36833F.f36814f != null;
                    boolean z3 = constraintWidget2.f36834G.f36814f != null;
                    boolean z4 = constraintWidget2.f36835H.f36814f != null;
                    int i5 = constraintWidget2.f36848U;
                    if (z && z2 && z3 && z4) {
                        float f4 = constraintWidget2.f36847T;
                        if (dependencyNode.f36975j && dependencyNode2.f36975j) {
                            DependencyNode dependencyNode3 = this.f37008h;
                            if (dependencyNode3.f36968c && this.f37009i.f36968c) {
                                m15823m(f36989k, dependencyNode3.f36977l.get(0).f36972g + this.f37008h.f36971f, this.f37009i.f36977l.get(0).f36972g - this.f37009i.f36971f, dependencyNode.f36972g + dependencyNode.f36971f, dependencyNode2.f36972g - dependencyNode2.f36971f, f4, i5);
                                this.f37005e.mo15810c(f36989k[0]);
                                this.f37002b.f36862e.f37005e.mo15810c(f36989k[1]);
                                return;
                            }
                            return;
                        }
                        DependencyNode dependencyNode4 = this.f37008h;
                        if (dependencyNode4.f36975j) {
                            DependencyNode dependencyNode5 = this.f37009i;
                            if (dependencyNode5.f36975j) {
                                if (!dependencyNode.f36968c || !dependencyNode2.f36968c) {
                                    return;
                                }
                                m15823m(f36989k, dependencyNode4.f36972g + dependencyNode4.f36971f, dependencyNode5.f36972g - dependencyNode5.f36971f, dependencyNode.f36977l.get(0).f36972g + dependencyNode.f36971f, dependencyNode2.f36977l.get(0).f36972g - dependencyNode2.f36971f, f4, i5);
                                this.f37005e.mo15810c(f36989k[0]);
                                this.f37002b.f36862e.f37005e.mo15810c(f36989k[1]);
                            }
                        }
                        DependencyNode dependencyNode6 = this.f37008h;
                        if (!dependencyNode6.f36968c || !this.f37009i.f36968c || !dependencyNode.f36968c || !dependencyNode2.f36968c) {
                            return;
                        }
                        m15823m(f36989k, dependencyNode6.f36977l.get(0).f36972g + this.f37008h.f36971f, this.f37009i.f36977l.get(0).f36972g - this.f37009i.f36971f, dependencyNode.f36977l.get(0).f36972g + dependencyNode.f36971f, dependencyNode2.f36977l.get(0).f36972g - dependencyNode2.f36971f, f4, i5);
                        this.f37005e.mo15810c(f36989k[0]);
                        this.f37002b.f36862e.f37005e.mo15810c(f36989k[1]);
                    } else if (z && z3) {
                        DependencyNode dependencyNode7 = this.f37008h;
                        if (!dependencyNode7.f36968c || !this.f37009i.f36968c) {
                            return;
                        }
                        float f5 = constraintWidget2.f36847T;
                        int i6 = dependencyNode7.f36977l.get(0).f36972g + this.f37008h.f36971f;
                        int i7 = this.f37009i.f36977l.get(0).f36972g - this.f37009i.f36971f;
                        if (i5 == -1 || i5 == 0) {
                            int iM15834g3 = m15834g(i7 - i6, 0);
                            int i8 = (int) ((iM15834g3 * f5) + 0.5f);
                            int iM15834g4 = m15834g(i8, 1);
                            if (i8 != iM15834g4) {
                                iM15834g3 = (int) ((iM15834g4 / f5) + 0.5f);
                            }
                            this.f37005e.mo15810c(iM15834g3);
                            this.f37002b.f36862e.f37005e.mo15810c(iM15834g4);
                        } else if (i5 == 1) {
                            int iM15834g5 = m15834g(i7 - i6, 0);
                            int i9 = (int) ((iM15834g5 / f5) + 0.5f);
                            int iM15834g6 = m15834g(i9, 1);
                            if (i9 != iM15834g6) {
                                iM15834g5 = (int) ((iM15834g6 * f5) + 0.5f);
                            }
                            this.f37005e.mo15810c(iM15834g5);
                            this.f37002b.f36862e.f37005e.mo15810c(iM15834g6);
                        }
                    } else if (z2 && z4) {
                        if (!dependencyNode.f36968c || !dependencyNode2.f36968c) {
                            return;
                        }
                        float f6 = constraintWidget2.f36847T;
                        int i10 = dependencyNode.f36977l.get(0).f36972g + dependencyNode.f36971f;
                        int i11 = dependencyNode2.f36977l.get(0).f36972g - dependencyNode2.f36971f;
                        if (i5 == -1) {
                            iM15834g = m15834g(i11 - i10, 1);
                            i = (int) ((iM15834g / f6) + 0.5f);
                            iM15834g2 = m15834g(i, 0);
                            if (i != iM15834g2) {
                                iM15834g = (int) ((iM15834g2 * f6) + 0.5f);
                            }
                            this.f37005e.mo15810c(iM15834g2);
                            this.f37002b.f36862e.f37005e.mo15810c(iM15834g);
                        } else if (i5 == 0) {
                            int iM15834g7 = m15834g(i11 - i10, 1);
                            int i12 = (int) ((iM15834g7 * f6) + 0.5f);
                            int iM15834g8 = m15834g(i12, 0);
                            if (i12 != iM15834g8) {
                                iM15834g7 = (int) ((iM15834g8 / f6) + 0.5f);
                            }
                            this.f37005e.mo15810c(iM15834g8);
                            this.f37002b.f36862e.f37005e.mo15810c(iM15834g7);
                        } else if (i5 == 1) {
                            iM15834g = m15834g(i11 - i10, 1);
                            i = (int) ((iM15834g / f6) + 0.5f);
                            iM15834g2 = m15834g(i, 0);
                            if (i != iM15834g2) {
                                iM15834g = (int) ((iM15834g2 * f6) + 0.5f);
                            }
                            this.f37005e.mo15810c(iM15834g2);
                            this.f37002b.f36862e.f37005e.mo15810c(iM15834g);
                        }
                    }
                } else {
                    int i13 = constraintWidget2.f36848U;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f3 = constraintWidget2.f36862e.f37005e.f36972g / constraintWidget2.f36847T;
                            i2 = (int) (f3 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f = constraintWidget2.f36862e.f37005e.f36972g;
                            f2 = constraintWidget2.f36847T;
                        }
                        dimensionDependency.mo15810c(i2);
                    } else {
                        f = constraintWidget2.f36862e.f37005e.f36972g;
                        f2 = constraintWidget2.f36847T;
                    }
                    f3 = f * f2;
                    i2 = (int) (f3 + 0.5f);
                    dimensionDependency.mo15810c(i2);
                }
            }
        }
        DependencyNode dependencyNode8 = this.f37008h;
        if (dependencyNode8.f36968c) {
            DependencyNode dependencyNode9 = this.f37009i;
            if (dependencyNode9.f36968c) {
                if (dependencyNode8.f36975j && dependencyNode9.f36975j && this.f37005e.f36975j) {
                    return;
                }
                if (!this.f37005e.f36975j && this.f37004d == 3) {
                    ConstraintWidget constraintWidget4 = this.f37002b;
                    if (constraintWidget4.f36878m == 0 && !constraintWidget4.m15771x()) {
                        DependencyNode dependencyNode10 = this.f37008h.f36977l.get(0);
                        DependencyNode dependencyNode11 = this.f37009i.f36977l.get(0);
                        int i14 = dependencyNode10.f36972g;
                        DependencyNode dependencyNode12 = this.f37008h;
                        int i15 = i14 + dependencyNode12.f36971f;
                        int i16 = dependencyNode11.f36972g + this.f37009i.f36971f;
                        dependencyNode12.mo15810c(i15);
                        this.f37009i.mo15810c(i16);
                        this.f37005e.mo15810c(i16 - i15);
                        return;
                    }
                }
                if (!this.f37005e.f36975j && this.f37004d == 3 && this.f37001a == 1 && this.f37008h.f36977l.size() > 0 && this.f37009i.f36977l.size() > 0) {
                    int iMin = Math.min((this.f37009i.f36977l.get(0).f36972g + this.f37009i.f36971f) - (this.f37008h.f36977l.get(0).f36972g + this.f37008h.f36971f), this.f37005e.f36987m);
                    ConstraintWidget constraintWidget5 = this.f37002b;
                    int i17 = constraintWidget5.f36882q;
                    int iMax = Math.max(constraintWidget5.f36881p, iMin);
                    if (i17 > 0) {
                        iMax = Math.min(i17, iMax);
                    }
                    this.f37005e.mo15810c(iMax);
                }
                if (this.f37005e.f36975j) {
                    DependencyNode dependencyNode13 = this.f37008h.f36977l.get(0);
                    DependencyNode dependencyNode14 = this.f37009i.f36977l.get(0);
                    int i18 = dependencyNode13.f36972g;
                    DependencyNode dependencyNode15 = this.f37008h;
                    int i19 = dependencyNode15.f36971f + i18;
                    int i20 = dependencyNode14.f36972g;
                    int i21 = this.f37009i.f36971f + i20;
                    float f7 = this.f37002b.f36855a0;
                    if (dependencyNode13 == dependencyNode14) {
                        f7 = 0.5f;
                    } else {
                        i18 = i19;
                        i20 = i21;
                    }
                    dependencyNode15.mo15810c((int) ((((i20 - i18) - this.f37005e.f36972g) * f7) + i18 + 0.5f));
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
            this.f37005e.mo15810c(constraintWidget4.m15766s());
        }
        if (!this.f37005e.f36975j) {
            int iM15761n = this.f37002b.m15761n();
            this.f37004d = iM15761n;
            if (iM15761n != 3) {
                if (iM15761n == 4 && (((constraintWidget3 = this.f37002b.f36844Q) != null && constraintWidget3.m15761n() == 1) || constraintWidget3.m15761n() == 4)) {
                    int iM15766s = (constraintWidget3.m15766s() - this.f37002b.f36832E.m15728d()) - this.f37002b.f36834G.m15728d();
                    m15832b(this.f37008h, constraintWidget3.f36860d.f37008h, this.f37002b.f36832E.m15728d());
                    m15832b(this.f37009i, constraintWidget3.f36860d.f37009i, -this.f37002b.f36834G.m15728d());
                    this.f37005e.mo15810c(iM15766s);
                    return;
                }
                if (this.f37004d == 1) {
                    this.f37005e.mo15810c(this.f37002b.m15766s());
                }
            }
        } else if (this.f37004d == 4 && (((constraintWidget = this.f37002b.f36844Q) != null && constraintWidget.m15761n() == 1) || constraintWidget.m15761n() == 4)) {
            m15832b(this.f37008h, constraintWidget.f36860d.f37008h, this.f37002b.f36832E.m15728d());
            m15832b(this.f37009i, constraintWidget.f36860d.f37009i, -this.f37002b.f36834G.m15728d());
            return;
        }
        DimensionDependency dimensionDependency = this.f37005e;
        if (dimensionDependency.f36975j) {
            ConstraintWidget constraintWidget5 = this.f37002b;
            if (constraintWidget5.f36854a) {
                ConstraintAnchor[] constraintAnchorArr = constraintWidget5.f36840M;
                if (constraintAnchorArr[0].f36814f != null && constraintAnchorArr[1].f36814f != null) {
                    if (constraintWidget5.m15771x()) {
                        this.f37008h.f36971f = this.f37002b.f36840M[0].m15728d();
                        this.f37009i.f36971f = -this.f37002b.f36840M[1].m15728d();
                        return;
                    }
                    DependencyNode dependencyNodeM15835h = m15835h(this.f37002b.f36840M[0]);
                    if (dependencyNodeM15835h != null) {
                        DependencyNode dependencyNode = this.f37008h;
                        int iM15728d = this.f37002b.f36840M[0].m15728d();
                        dependencyNode.f36977l.add(dependencyNodeM15835h);
                        dependencyNode.f36971f = iM15728d;
                        dependencyNodeM15835h.f36976k.add(dependencyNode);
                    }
                    DependencyNode dependencyNodeM15835h2 = m15835h(this.f37002b.f36840M[1]);
                    if (dependencyNodeM15835h2 != null) {
                        DependencyNode dependencyNode2 = this.f37009i;
                        int i = -this.f37002b.f36840M[1].m15728d();
                        dependencyNode2.f36977l.add(dependencyNodeM15835h2);
                        dependencyNode2.f36971f = i;
                        dependencyNodeM15835h2.f36976k.add(dependencyNode2);
                    }
                    this.f37008h.f36967b = true;
                    this.f37009i.f36967b = true;
                    return;
                }
                if (constraintAnchorArr[0].f36814f != null) {
                    DependencyNode dependencyNodeM15835h3 = m15835h(constraintAnchorArr[0]);
                    if (dependencyNodeM15835h3 != null) {
                        DependencyNode dependencyNode3 = this.f37008h;
                        int iM15728d2 = this.f37002b.f36840M[0].m15728d();
                        dependencyNode3.f36977l.add(dependencyNodeM15835h3);
                        dependencyNode3.f36971f = iM15728d2;
                        dependencyNodeM15835h3.f36976k.add(dependencyNode3);
                        m15832b(this.f37009i, this.f37008h, this.f37005e.f36972g);
                        return;
                    }
                    return;
                }
                if (constraintAnchorArr[1].f36814f == null) {
                    if ((constraintWidget5 instanceof Helper) || constraintWidget5.f36844Q == null || constraintWidget5.mo15757j(ConstraintAnchor.a.CENTER).f36814f != null) {
                        return;
                    }
                    ConstraintWidget constraintWidget6 = this.f37002b;
                    m15832b(this.f37008h, constraintWidget6.f36844Q.f36860d.f37008h, constraintWidget6.m15767t());
                    m15832b(this.f37009i, this.f37008h, this.f37005e.f36972g);
                    return;
                }
                DependencyNode dependencyNodeM15835h4 = m15835h(constraintAnchorArr[1]);
                if (dependencyNodeM15835h4 != null) {
                    DependencyNode dependencyNode4 = this.f37009i;
                    int i2 = -this.f37002b.f36840M[1].m15728d();
                    dependencyNode4.f36977l.add(dependencyNodeM15835h4);
                    dependencyNode4.f36971f = i2;
                    dependencyNodeM15835h4.f36976k.add(dependencyNode4);
                    m15832b(this.f37008h, this.f37009i, -this.f37005e.f36972g);
                    return;
                }
                return;
            }
        }
        if (this.f37004d == 3) {
            ConstraintWidget constraintWidget7 = this.f37002b;
            int i3 = constraintWidget7.f36878m;
            if (i3 == 2) {
                ConstraintWidget constraintWidget8 = constraintWidget7.f36844Q;
                if (constraintWidget8 != null) {
                    DimensionDependency dimensionDependency2 = constraintWidget8.f36862e.f37005e;
                    dimensionDependency.f36977l.add(dimensionDependency2);
                    dimensionDependency2.f36976k.add(this.f37005e);
                    DimensionDependency dimensionDependency3 = this.f37005e;
                    dimensionDependency3.f36967b = true;
                    dimensionDependency3.f36976k.add(this.f37008h);
                    this.f37005e.f36976k.add(this.f37009i);
                }
            } else if (i3 == 3) {
                if (constraintWidget7.f36879n == 3) {
                    this.f37008h.f36966a = this;
                    this.f37009i.f36966a = this;
                    VerticalWidgetRun verticalWidgetRun = constraintWidget7.f36862e;
                    verticalWidgetRun.f37008h.f36966a = this;
                    verticalWidgetRun.f37009i.f36966a = this;
                    dimensionDependency.f36966a = this;
                    if (constraintWidget7.m15772y()) {
                        this.f37005e.f36977l.add(this.f37002b.f36862e.f37005e);
                        this.f37002b.f36862e.f37005e.f36976k.add(this.f37005e);
                        VerticalWidgetRun verticalWidgetRun2 = this.f37002b.f36862e;
                        verticalWidgetRun2.f37005e.f36966a = this;
                        this.f37005e.f36977l.add(verticalWidgetRun2.f37008h);
                        this.f37005e.f36977l.add(this.f37002b.f36862e.f37009i);
                        this.f37002b.f36862e.f37008h.f36976k.add(this.f37005e);
                        this.f37002b.f36862e.f37009i.f36976k.add(this.f37005e);
                    } else if (this.f37002b.m15771x()) {
                        this.f37002b.f36862e.f37005e.f36977l.add(this.f37005e);
                        this.f37005e.f36976k.add(this.f37002b.f36862e.f37005e);
                    } else {
                        this.f37002b.f36862e.f37005e.f36977l.add(this.f37005e);
                    }
                } else {
                    DimensionDependency dimensionDependency4 = constraintWidget7.f36862e.f37005e;
                    dimensionDependency.f36977l.add(dimensionDependency4);
                    dimensionDependency4.f36976k.add(this.f37005e);
                    this.f37002b.f36862e.f37008h.f36976k.add(this.f37005e);
                    this.f37002b.f36862e.f37009i.f36976k.add(this.f37005e);
                    DimensionDependency dimensionDependency5 = this.f37005e;
                    dimensionDependency5.f36967b = true;
                    dimensionDependency5.f36976k.add(this.f37008h);
                    this.f37005e.f36976k.add(this.f37009i);
                    this.f37008h.f36977l.add(this.f37005e);
                    this.f37009i.f36977l.add(this.f37005e);
                }
            }
        }
        ConstraintWidget constraintWidget9 = this.f37002b;
        ConstraintAnchor[] constraintAnchorArr2 = constraintWidget9.f36840M;
        if (constraintAnchorArr2[0].f36814f != null && constraintAnchorArr2[1].f36814f != null) {
            if (constraintWidget9.m15771x()) {
                this.f37008h.f36971f = this.f37002b.f36840M[0].m15728d();
                this.f37009i.f36971f = -this.f37002b.f36840M[1].m15728d();
                return;
            }
            DependencyNode dependencyNodeM15835h5 = m15835h(this.f37002b.f36840M[0]);
            DependencyNode dependencyNodeM15835h6 = m15835h(this.f37002b.f36840M[1]);
            dependencyNodeM15835h5.f36976k.add(this);
            if (dependencyNodeM15835h5.f36975j) {
                mo15794a(this);
            }
            dependencyNodeM15835h6.f36976k.add(this);
            if (dependencyNodeM15835h6.f36975j) {
                mo15794a(this);
            }
            this.f37010j = 4;
            return;
        }
        if (constraintAnchorArr2[0].f36814f != null) {
            DependencyNode dependencyNodeM15835h7 = m15835h(constraintAnchorArr2[0]);
            if (dependencyNodeM15835h7 != null) {
                DependencyNode dependencyNode5 = this.f37008h;
                int iM15728d3 = this.f37002b.f36840M[0].m15728d();
                dependencyNode5.f36977l.add(dependencyNodeM15835h7);
                dependencyNode5.f36971f = iM15728d3;
                dependencyNodeM15835h7.f36976k.add(dependencyNode5);
                m15833c(this.f37009i, this.f37008h, 1, this.f37005e);
                return;
            }
            return;
        }
        if (constraintAnchorArr2[1].f36814f == null) {
            if ((constraintWidget9 instanceof Helper) || (constraintWidget2 = constraintWidget9.f36844Q) == null) {
                return;
            }
            m15832b(this.f37008h, constraintWidget2.f36860d.f37008h, constraintWidget9.m15767t());
            m15833c(this.f37009i, this.f37008h, 1, this.f37005e);
            return;
        }
        DependencyNode dependencyNodeM15835h8 = m15835h(constraintAnchorArr2[1]);
        if (dependencyNodeM15835h8 != null) {
            DependencyNode dependencyNode6 = this.f37009i;
            int i4 = -this.f37002b.f36840M[1].m15728d();
            dependencyNode6.f36977l.add(dependencyNodeM15835h8);
            dependencyNode6.f36971f = i4;
            dependencyNodeM15835h8.f36976k.add(dependencyNode6);
            m15833c(this.f37008h, this.f37009i, -1, this.f37005e);
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: e */
    public void mo15796e() {
        DependencyNode dependencyNode = this.f37008h;
        if (dependencyNode.f36975j) {
            this.f37002b.f36849V = dependencyNode.f36972g;
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: f */
    public void mo15797f() {
        this.f37003c = null;
        this.f37008h.m15809b();
        this.f37009i.m15809b();
        this.f37005e.m15809b();
        this.f37007g = false;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: k */
    public boolean mo15799k() {
        return this.f37004d != 3 || this.f37002b.f36878m == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m15823m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i6 > i6 || i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m15824n() {
        this.f37007g = false;
        this.f37008h.m15809b();
        this.f37008h.f36975j = false;
        this.f37009i.m15809b();
        this.f37009i.f36975j = false;
        this.f37005e.f36975j = false;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("HorizontalRun ");
        sbM1556G.append(this.f37002b.f36863e0);
        return sbM1556G.toString();
    }
}
