package p636z0.p697i.p700b.p701h.p702n;

import java.util.ArrayList;
import java.util.Iterator;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p697i.p700b.p701h.ConstraintAnchor;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.ConstraintWidgetContainer;

/* JADX INFO: renamed from: z0.i.b.h.n.c, reason: use source file name */
/* JADX INFO: compiled from: ChainRun.java */
/* JADX INFO: loaded from: classes.dex */
public class ChainRun extends WidgetRun {

    /* JADX INFO: renamed from: k */
    public ArrayList<WidgetRun> f36956k;

    /* JADX INFO: renamed from: l */
    public int f36957l;

    public ChainRun(ConstraintWidget constraintWidget, int i) {
        ConstraintWidget constraintWidget2;
        super(constraintWidget);
        this.f36956k = new ArrayList<>();
        this.f37006f = i;
        ConstraintWidget constraintWidget3 = this.f37002b;
        ConstraintWidget constraintWidgetM15763p = constraintWidget3.m15763p(i);
        while (true) {
            ConstraintWidget constraintWidget4 = constraintWidgetM15763p;
            constraintWidget2 = constraintWidget3;
            constraintWidget3 = constraintWidget4;
            if (constraintWidget3 == null) {
                break;
            } else {
                constraintWidgetM15763p = constraintWidget3.m15763p(this.f37006f);
            }
        }
        this.f37002b = constraintWidget2;
        ArrayList<WidgetRun> arrayList = this.f36956k;
        int i2 = this.f37006f;
        arrayList.add(i2 == 0 ? constraintWidget2.f36860d : i2 == 1 ? constraintWidget2.f36862e : null);
        ConstraintWidget constraintWidgetM15762o = constraintWidget2.m15762o(this.f37006f);
        while (constraintWidgetM15762o != null) {
            ArrayList<WidgetRun> arrayList2 = this.f36956k;
            int i3 = this.f37006f;
            arrayList2.add(i3 == 0 ? constraintWidgetM15762o.f36860d : i3 == 1 ? constraintWidgetM15762o.f36862e : null);
            constraintWidgetM15762o = constraintWidgetM15762o.m15762o(this.f37006f);
        }
        for (WidgetRun widgetRun : this.f36956k) {
            int i4 = this.f37006f;
            if (i4 == 0) {
                widgetRun.f37002b.f36856b = this;
            } else if (i4 == 1) {
                widgetRun.f37002b.f36858c = this;
            }
        }
        if ((this.f37006f == 0 && ((ConstraintWidgetContainer) this.f37002b.f36844Q).f36901q0) && this.f36956k.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.f36956k;
            this.f37002b = arrayList3.get(arrayList3.size() - 1).f37002b;
        }
        this.f36957l = this.f37006f == 0 ? this.f37002b.f36865f0 : this.f37002b.f36867g0;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:303:0x00e2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00da A[ADDED_TO_REGION] */
    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun, p636z0.p697i.p700b.p701h.p702n.Dependency2
    /* JADX INFO: renamed from: a */
    public void mo15794a(Dependency2 dependency2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        int i11;
        float f3;
        DependencyNode dependencyNode = this.f37008h;
        if (dependencyNode.f36975j) {
            DependencyNode dependencyNode2 = this.f37009i;
            if (dependencyNode2.f36975j) {
                ConstraintWidget constraintWidget = this.f37002b.f36844Q;
                boolean z2 = (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? false : ((ConstraintWidgetContainer) constraintWidget).f36901q0;
                int i12 = dependencyNode2.f36972g - dependencyNode.f36972g;
                int size = this.f36956k.size();
                int i13 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (this.f36956k.get(i13).f37002b.f36861d0 != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                for (int i15 = i14; i15 >= 0; i15--) {
                    if (this.f36956k.get(i15).f37002b.f36861d0 != 8) {
                        i = i15;
                        break;
                    }
                }
                int i16 = 0;
                while (true) {
                    int i17 = 3;
                    if (i16 >= 2) {
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        f = 0.0f;
                        break;
                    }
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    f = 0.0f;
                    while (i18 < size) {
                        WidgetRun widgetRun = this.f36956k.get(i18);
                        ConstraintWidget constraintWidget2 = widgetRun.f37002b;
                        if (constraintWidget2.f36861d0 != i2) {
                            i20++;
                            if (i18 > 0 && i18 >= i13) {
                                i5 += widgetRun.f37008h.f36971f;
                            }
                            DimensionDependency dimensionDependency = widgetRun.f37005e;
                            int i21 = dimensionDependency.f36972g;
                            boolean z3 = widgetRun.f37004d != i17;
                            if (z3) {
                                int i22 = this.f37006f;
                                if (i22 == 0 && !constraintWidget2.f36860d.f37005e.f36975j) {
                                    return;
                                }
                                if (i22 == 1 && !constraintWidget2.f36862e.f37005e.f36975j) {
                                    return;
                                } else {
                                    i10 = i21;
                                }
                            } else {
                                i10 = i21;
                                if (widgetRun.f37001a == 1 && i16 == 0) {
                                    i11 = dimensionDependency.f36987m;
                                    i19++;
                                } else {
                                    if (dimensionDependency.f36975j) {
                                        i11 = i10;
                                    }
                                    if (z3) {
                                        i5 += i11;
                                    } else {
                                        i19++;
                                        f3 = constraintWidget2.f36869h0[this.f37006f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i14 && i18 < i) {
                                        i5 += -widgetRun.f37009i.f36971f;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                    i19++;
                                    f3 = constraintWidget2.f36869h0[this.f37006f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i11;
                                }
                                if (i18 >= i14) {
                                }
                            }
                            i11 = i10;
                            if (z3) {
                                i19++;
                                f3 = constraintWidget2.f36869h0[this.f37006f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i11;
                            }
                            if (i18 >= i14) {
                            }
                        }
                        i18++;
                        i2 = 8;
                        i17 = 3;
                    }
                    if (i5 < i12 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i16++;
                        i2 = 8;
                    }
                }
                int i23 = this.f37008h.f36972g;
                if (z2) {
                    i23 = this.f37009i.f36972g;
                }
                if (i5 > i12) {
                    int i24 = (int) (((i5 - i12) / 2.0f) + 0.5f);
                    i23 = z2 ? i23 + i24 : i23 - i24;
                }
                if (i3 > 0) {
                    float f4 = i12 - i5;
                    int i25 = (int) ((f4 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        WidgetRun widgetRun2 = this.f36956k.get(i26);
                        int i28 = i25;
                        ConstraintWidget constraintWidget3 = widgetRun2.f37002b;
                        int i29 = i5;
                        int i30 = i23;
                        if (constraintWidget3.f36861d0 != 8 && widgetRun2.f37004d == 3) {
                            DimensionDependency dimensionDependency2 = widgetRun2.f37005e;
                            if (dimensionDependency2.f36975j) {
                                z2 = z2;
                                i9 = i4;
                                f2 = f4;
                            } else {
                                int i31 = f > 0.0f ? (int) (((constraintWidget3.f36869h0[this.f37006f] * f4) / f) + 0.5f) : i28;
                                if (this.f37006f == 0) {
                                    int i32 = constraintWidget3.f36882q;
                                    f2 = f4;
                                    i9 = i4;
                                    int iMax = Math.max(constraintWidget3.f36881p, widgetRun2.f37001a == 1 ? Math.min(i31, dimensionDependency2.f36987m) : i31);
                                    if (i32 > 0) {
                                        iMax = Math.min(i32, iMax);
                                    }
                                    if (iMax != i31) {
                                        i27++;
                                        i31 = iMax;
                                    }
                                } else {
                                    i9 = i4;
                                    f2 = f4;
                                    int i33 = constraintWidget3.f36885t;
                                    int iMax2 = Math.max(constraintWidget3.f36884s, widgetRun2.f37001a == 1 ? Math.min(i31, dimensionDependency2.f36987m) : i31);
                                    if (i33 > 0) {
                                        iMax2 = Math.min(i33, iMax2);
                                    }
                                    if (iMax2 != i31) {
                                        i27++;
                                        i31 = iMax2;
                                    }
                                }
                                widgetRun2.f37005e.mo15810c(i31);
                            }
                        } else {
                            z2 = z2;
                            i9 = i4;
                            f2 = f4;
                        }
                        i26++;
                        i25 = i28;
                        i5 = i29;
                        i23 = i30;
                        z2 = z2;
                        f4 = f2;
                        i4 = i9;
                    }
                    z = z2;
                    i6 = i4;
                    i7 = i23;
                    int i34 = i5;
                    if (i27 > 0) {
                        i3 -= i27;
                        int i35 = 0;
                        for (int i36 = 0; i36 < size; i36++) {
                            WidgetRun widgetRun3 = this.f36956k.get(i36);
                            if (widgetRun3.f37002b.f36861d0 != 8) {
                                if (i36 > 0 && i36 >= i13) {
                                    i35 += widgetRun3.f37008h.f36971f;
                                }
                                i35 += widgetRun3.f37005e.f36972g;
                                if (i36 < i14 && i36 < i) {
                                    i35 += -widgetRun3.f37009i.f36971f;
                                }
                            }
                        }
                        i5 = i35;
                    } else {
                        i5 = i34;
                    }
                    i8 = 2;
                    if (this.f36957l == 2 && i27 == 0) {
                        this.f36957l = 0;
                    }
                } else {
                    z = z2;
                    i6 = i4;
                    i7 = i23;
                    i8 = 2;
                }
                if (i5 > i12) {
                    this.f36957l = i8;
                }
                if (i6 > 0 && i3 == 0 && i13 == i) {
                    this.f36957l = i8;
                }
                int i37 = this.f36957l;
                if (i37 == 1) {
                    int i38 = i6;
                    int i39 = i38 > 1 ? (i12 - i5) / (i38 - 1) : i38 == 1 ? (i12 - i5) / 2 : 0;
                    if (i3 > 0) {
                        i39 = 0;
                    }
                    int i40 = i7;
                    for (int i41 = 0; i41 < size; i41++) {
                        WidgetRun widgetRun4 = this.f36956k.get(z ? size - (i41 + 1) : i41);
                        if (widgetRun4.f37002b.f36861d0 == 8) {
                            widgetRun4.f37008h.mo15810c(i40);
                            widgetRun4.f37009i.mo15810c(i40);
                        } else {
                            if (i41 > 0) {
                                i40 = z ? i40 - i39 : i40 + i39;
                            }
                            if (i41 > 0 && i41 >= i13) {
                                i40 = z ? i40 - widgetRun4.f37008h.f36971f : i40 + widgetRun4.f37008h.f36971f;
                            }
                            if (z) {
                                widgetRun4.f37009i.mo15810c(i40);
                            } else {
                                widgetRun4.f37008h.mo15810c(i40);
                            }
                            DimensionDependency dimensionDependency3 = widgetRun4.f37005e;
                            int i42 = dimensionDependency3.f36972g;
                            if (widgetRun4.f37004d == 3 && widgetRun4.f37001a == 1) {
                                i42 = dimensionDependency3.f36987m;
                            }
                            i40 = z ? i40 - i42 : i40 + i42;
                            if (z) {
                                widgetRun4.f37008h.mo15810c(i40);
                            } else {
                                widgetRun4.f37009i.mo15810c(i40);
                            }
                            widgetRun4.f37007g = true;
                            if (i41 < i14 && i41 < i) {
                                i40 = z ? i40 - (-widgetRun4.f37009i.f36971f) : i40 + (-widgetRun4.f37009i.f36971f);
                            }
                        }
                    }
                    return;
                }
                int i43 = i6;
                if (i37 == 0) {
                    int i44 = (i12 - i5) / (i43 + 1);
                    if (i3 > 0) {
                        i44 = 0;
                    }
                    int i45 = i7;
                    for (int i46 = 0; i46 < size; i46++) {
                        WidgetRun widgetRun5 = this.f36956k.get(z ? size - (i46 + 1) : i46);
                        if (widgetRun5.f37002b.f36861d0 == 8) {
                            widgetRun5.f37008h.mo15810c(i45);
                            widgetRun5.f37009i.mo15810c(i45);
                        } else {
                            int i47 = z ? i45 - i44 : i45 + i44;
                            if (i46 > 0 && i46 >= i13) {
                                i47 = z ? i47 - widgetRun5.f37008h.f36971f : i47 + widgetRun5.f37008h.f36971f;
                            }
                            if (z) {
                                widgetRun5.f37009i.mo15810c(i47);
                            } else {
                                widgetRun5.f37008h.mo15810c(i47);
                            }
                            DimensionDependency dimensionDependency4 = widgetRun5.f37005e;
                            int iMin = dimensionDependency4.f36972g;
                            if (widgetRun5.f37004d == 3 && widgetRun5.f37001a == 1) {
                                iMin = Math.min(iMin, dimensionDependency4.f36987m);
                            }
                            i45 = z ? i47 - iMin : i47 + iMin;
                            if (z) {
                                widgetRun5.f37008h.mo15810c(i45);
                            } else {
                                widgetRun5.f37009i.mo15810c(i45);
                            }
                            if (i46 < i14 && i46 < i) {
                                i45 = z ? i45 - (-widgetRun5.f37009i.f36971f) : i45 + (-widgetRun5.f37009i.f36971f);
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float f5 = this.f37006f == 0 ? this.f37002b.f36855a0 : this.f37002b.f36857b0;
                    if (z) {
                        f5 = 1.0f - f5;
                    }
                    int i48 = (int) (((i12 - i5) * f5) + 0.5f);
                    if (i48 < 0 || i3 > 0) {
                        i48 = 0;
                    }
                    int i49 = z ? i7 - i48 : i7 + i48;
                    for (int i50 = 0; i50 < size; i50++) {
                        WidgetRun widgetRun6 = this.f36956k.get(z ? size - (i50 + 1) : i50);
                        if (widgetRun6.f37002b.f36861d0 == 8) {
                            widgetRun6.f37008h.mo15810c(i49);
                            widgetRun6.f37009i.mo15810c(i49);
                        } else {
                            if (i50 > 0 && i50 >= i13) {
                                i49 = z ? i49 - widgetRun6.f37008h.f36971f : i49 + widgetRun6.f37008h.f36971f;
                            }
                            if (z) {
                                widgetRun6.f37009i.mo15810c(i49);
                            } else {
                                widgetRun6.f37008h.mo15810c(i49);
                            }
                            DimensionDependency dimensionDependency5 = widgetRun6.f37005e;
                            int i51 = dimensionDependency5.f36972g;
                            if (widgetRun6.f37004d == 3 && widgetRun6.f37001a == 1) {
                                i51 = dimensionDependency5.f36987m;
                            }
                            i49 = z ? i49 - i51 : i49 + i51;
                            if (z) {
                                widgetRun6.f37008h.mo15810c(i49);
                            } else {
                                widgetRun6.f37009i.mo15810c(i49);
                            }
                            if (i50 < i14 && i50 < i) {
                                i49 = z ? i49 - (-widgetRun6.f37009i.f36971f) : i49 + (-widgetRun6.f37009i.f36971f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: d */
    public void mo15795d() {
        Iterator<WidgetRun> it = this.f36956k.iterator();
        while (it.hasNext()) {
            it.next().mo15795d();
        }
        int size = this.f36956k.size();
        if (size < 1) {
            return;
        }
        ConstraintWidget constraintWidget = this.f36956k.get(0).f37002b;
        ConstraintWidget constraintWidget2 = this.f36956k.get(size - 1).f37002b;
        if (this.f37006f == 0) {
            ConstraintAnchor constraintAnchor = constraintWidget.f36832E;
            ConstraintAnchor constraintAnchor2 = constraintWidget2.f36834G;
            DependencyNode dependencyNodeM15836i = m15836i(constraintAnchor, 0);
            int iM15728d = constraintAnchor.m15728d();
            ConstraintWidget constraintWidgetM15800m = m15800m();
            if (constraintWidgetM15800m != null) {
                iM15728d = constraintWidgetM15800m.f36832E.m15728d();
            }
            if (dependencyNodeM15836i != null) {
                DependencyNode dependencyNode = this.f37008h;
                dependencyNode.f36977l.add(dependencyNodeM15836i);
                dependencyNode.f36971f = iM15728d;
                dependencyNodeM15836i.f36976k.add(dependencyNode);
            }
            DependencyNode dependencyNodeM15836i2 = m15836i(constraintAnchor2, 0);
            int iM15728d2 = constraintAnchor2.m15728d();
            ConstraintWidget constraintWidgetM15801n = m15801n();
            if (constraintWidgetM15801n != null) {
                iM15728d2 = constraintWidgetM15801n.f36834G.m15728d();
            }
            if (dependencyNodeM15836i2 != null) {
                DependencyNode dependencyNode2 = this.f37009i;
                dependencyNode2.f36977l.add(dependencyNodeM15836i2);
                dependencyNode2.f36971f = -iM15728d2;
                dependencyNodeM15836i2.f36976k.add(dependencyNode2);
            }
        } else {
            ConstraintAnchor constraintAnchor3 = constraintWidget.f36833F;
            ConstraintAnchor constraintAnchor4 = constraintWidget2.f36835H;
            DependencyNode dependencyNodeM15836i3 = m15836i(constraintAnchor3, 1);
            int iM15728d3 = constraintAnchor3.m15728d();
            ConstraintWidget constraintWidgetM15800m2 = m15800m();
            if (constraintWidgetM15800m2 != null) {
                iM15728d3 = constraintWidgetM15800m2.f36833F.m15728d();
            }
            if (dependencyNodeM15836i3 != null) {
                DependencyNode dependencyNode3 = this.f37008h;
                dependencyNode3.f36977l.add(dependencyNodeM15836i3);
                dependencyNode3.f36971f = iM15728d3;
                dependencyNodeM15836i3.f36976k.add(dependencyNode3);
            }
            DependencyNode dependencyNodeM15836i4 = m15836i(constraintAnchor4, 1);
            int iM15728d4 = constraintAnchor4.m15728d();
            ConstraintWidget constraintWidgetM15801n2 = m15801n();
            if (constraintWidgetM15801n2 != null) {
                iM15728d4 = constraintWidgetM15801n2.f36835H.m15728d();
            }
            if (dependencyNodeM15836i4 != null) {
                DependencyNode dependencyNode4 = this.f37009i;
                dependencyNode4.f36977l.add(dependencyNodeM15836i4);
                dependencyNode4.f36971f = -iM15728d4;
                dependencyNodeM15836i4.f36976k.add(dependencyNode4);
            }
        }
        this.f37008h.f36966a = this;
        this.f37009i.f36966a = this;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: e */
    public void mo15796e() {
        for (int i = 0; i < this.f36956k.size(); i++) {
            this.f36956k.get(i).mo15796e();
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: f */
    public void mo15797f() {
        this.f37003c = null;
        Iterator<WidgetRun> it = this.f36956k.iterator();
        while (it.hasNext()) {
            it.next().mo15797f();
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: j */
    public long mo15798j() {
        int size = this.f36956k.size();
        long jMo15798j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.f36956k.get(i);
            jMo15798j = ((long) widgetRun.f37009i.f36971f) + widgetRun.mo15798j() + jMo15798j + ((long) widgetRun.f37008h.f36971f);
        }
        return jMo15798j;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: k */
    public boolean mo15799k() {
        int size = this.f36956k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f36956k.get(i).mo15799k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final ConstraintWidget m15800m() {
        for (int i = 0; i < this.f36956k.size(); i++) {
            ConstraintWidget constraintWidget = this.f36956k.get(i).f37002b;
            if (constraintWidget.f36861d0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final ConstraintWidget m15801n() {
        for (int size = this.f36956k.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.f36956k.get(size).f37002b;
            if (constraintWidget.f36861d0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ChainRun ");
        sbM1556G.append(this.f37006f == 0 ? "horizontal : " : "vertical : ");
        String string = sbM1556G.toString();
        for (WidgetRun widgetRun : this.f36956k) {
            string = outline.m1599u(outline.m1599u(string, "<") + widgetRun, "> ");
        }
        return string;
    }
}
