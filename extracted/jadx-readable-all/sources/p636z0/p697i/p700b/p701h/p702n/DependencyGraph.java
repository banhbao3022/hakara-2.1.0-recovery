package p636z0.p697i.p700b.p701h.p702n;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p697i.p700b.p701h.ConstraintAnchor;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.ConstraintWidgetContainer;
import p636z0.p697i.p700b.p701h.Guideline2;
import p636z0.p697i.p700b.p701h.HelperWidget;

/* JADX INFO: renamed from: z0.i.b.h.n.e, reason: use source file name */
/* JADX INFO: compiled from: DependencyGraph.java */
/* JADX INFO: loaded from: classes.dex */
public class DependencyGraph {

    /* JADX INFO: renamed from: a */
    public ConstraintWidgetContainer f36958a;

    /* JADX INFO: renamed from: d */
    public ConstraintWidgetContainer f36961d;

    /* JADX INFO: renamed from: f */
    public BasicMeasure.b f36963f;

    /* JADX INFO: renamed from: g */
    public BasicMeasure.a f36964g;

    /* JADX INFO: renamed from: h */
    public ArrayList<RunGroup> f36965h;

    /* JADX INFO: renamed from: b */
    public boolean f36959b = true;

    /* JADX INFO: renamed from: c */
    public boolean f36960c = true;

    /* JADX INFO: renamed from: e */
    public ArrayList<WidgetRun> f36962e = new ArrayList<>();

    public DependencyGraph(ConstraintWidgetContainer constraintWidgetContainer) {
        new ArrayList();
        this.f36963f = null;
        this.f36964g = new BasicMeasure.a();
        this.f36965h = new ArrayList<>();
        this.f36958a = constraintWidgetContainer;
        this.f36961d = constraintWidgetContainer;
    }

    /* JADX INFO: renamed from: a */
    public final void m15802a(DependencyNode dependencyNode, int i, int i2, DependencyNode dependencyNode2, ArrayList<RunGroup> arrayList, RunGroup runGroup) {
        WidgetRun widgetRun = dependencyNode.f36969d;
        if (widgetRun.f37003c == null) {
            ConstraintWidgetContainer constraintWidgetContainer = this.f36958a;
            if (widgetRun == constraintWidgetContainer.f36860d || widgetRun == constraintWidgetContainer.f36862e) {
                return;
            }
            if (runGroup == null) {
                runGroup = new RunGroup(widgetRun, i2);
                arrayList.add(runGroup);
            }
            widgetRun.f37003c = runGroup;
            runGroup.f36992c.add(widgetRun);
            for (Dependency2 dependency2 : widgetRun.f37008h.f36976k) {
                if (dependency2 instanceof DependencyNode) {
                    m15802a((DependencyNode) dependency2, i, 0, dependencyNode2, arrayList, runGroup);
                }
            }
            for (Dependency2 dependency3 : widgetRun.f37009i.f36976k) {
                if (dependency3 instanceof DependencyNode) {
                    m15802a((DependencyNode) dependency3, i, 1, dependencyNode2, arrayList, runGroup);
                }
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                for (Dependency2 dependency4 : ((VerticalWidgetRun) widgetRun).f36993k.f36976k) {
                    if (dependency4 instanceof DependencyNode) {
                        m15802a((DependencyNode) dependency4, i, 2, dependencyNode2, arrayList, runGroup);
                    }
                }
            }
            Iterator<DependencyNode> it = widgetRun.f37008h.f36977l.iterator();
            while (it.hasNext()) {
                m15802a(it.next(), i, 0, dependencyNode2, arrayList, runGroup);
            }
            Iterator<DependencyNode> it2 = widgetRun.f37009i.f36977l.iterator();
            while (it2.hasNext()) {
                m15802a(it2.next(), i, 1, dependencyNode2, arrayList, runGroup);
            }
            if (i == 1 && (widgetRun instanceof VerticalWidgetRun)) {
                Iterator<DependencyNode> it3 = ((VerticalWidgetRun) widgetRun).f36993k.f36977l.iterator();
                while (it3.hasNext()) {
                    m15802a(it3.next(), i, 2, dependencyNode2, arrayList, runGroup);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15803b(ConstraintWidgetContainer constraintWidgetContainer) {
        int iM15766s;
        int i;
        int iM15760m;
        int i2;
        for (ConstraintWidget constraintWidget : constraintWidgetContainer.f36942m0) {
            int[] iArr = constraintWidget.f36843P;
            int i3 = iArr[0];
            int i4 = iArr[1];
            if (constraintWidget.f36861d0 == 8) {
                constraintWidget.f36854a = true;
            } else {
                float f = constraintWidget.f36883r;
                if (f < 1.0f && i3 == 3) {
                    constraintWidget.f36878m = 2;
                }
                float f2 = constraintWidget.f36886u;
                if (f2 < 1.0f && i4 == 3) {
                    constraintWidget.f36879n = 2;
                }
                if (constraintWidget.f36847T > 0.0f) {
                    if (i3 == 3 && (i4 == 2 || i4 == 1)) {
                        constraintWidget.f36878m = 3;
                    } else if (i4 == 3 && (i3 == 2 || i3 == 1)) {
                        constraintWidget.f36879n = 3;
                    } else if (i3 == 3 && i4 == 3) {
                        if (constraintWidget.f36878m == 0) {
                            constraintWidget.f36878m = 3;
                        }
                        if (constraintWidget.f36879n == 0) {
                            constraintWidget.f36879n = 3;
                        }
                    }
                }
                int i5 = (i3 == 3 && constraintWidget.f36878m == 1 && (constraintWidget.f36832E.f36814f == null || constraintWidget.f36834G.f36814f == null)) ? 2 : i3;
                int i6 = (i4 == 3 && constraintWidget.f36879n == 1 && (constraintWidget.f36833F.f36814f == null || constraintWidget.f36835H.f36814f == null)) ? 2 : i4;
                HorizontalWidgetRun horizontalWidgetRun = constraintWidget.f36860d;
                horizontalWidgetRun.f37004d = i5;
                int i7 = constraintWidget.f36878m;
                horizontalWidgetRun.f37001a = i7;
                VerticalWidgetRun verticalWidgetRun = constraintWidget.f36862e;
                verticalWidgetRun.f37004d = i6;
                int i8 = constraintWidget.f36879n;
                verticalWidgetRun.f37001a = i8;
                if ((i5 == 4 || i5 == 1 || i5 == 2) && (i6 == 4 || i6 == 1 || i6 == 2)) {
                    int iM15766s2 = constraintWidget.m15766s();
                    if (i5 == 4) {
                        iM15766s = (constraintWidgetContainer.m15766s() - constraintWidget.f36832E.f36815g) - constraintWidget.f36834G.f36815g;
                        i = 1;
                    } else {
                        iM15766s = iM15766s2;
                        i = i5;
                    }
                    int iM15760m2 = constraintWidget.m15760m();
                    if (i6 == 4) {
                        iM15760m = (constraintWidgetContainer.m15760m() - constraintWidget.f36833F.f36815g) - constraintWidget.f36835H.f36815g;
                        i2 = 1;
                    } else {
                        iM15760m = iM15760m2;
                        i2 = i6;
                    }
                    m15807f(constraintWidget, i, iM15766s, i2, iM15760m);
                    constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                    constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                    constraintWidget.f36854a = true;
                } else {
                    if (i5 == 3 && (i6 == 2 || i6 == 1)) {
                        if (i7 == 3) {
                            if (i6 == 2) {
                                m15807f(constraintWidget, 2, 0, 2, 0);
                            }
                            int iM15760m3 = constraintWidget.m15760m();
                            m15807f(constraintWidget, 1, (int) ((iM15760m3 * constraintWidget.f36847T) + 0.5f), 1, iM15760m3);
                            constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                            constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                            constraintWidget.f36854a = true;
                        } else if (i7 == 1) {
                            m15807f(constraintWidget, 2, 0, i6, 0);
                            constraintWidget.f36860d.f37005e.f36987m = constraintWidget.m15766s();
                        } else if (i7 == 2) {
                            int[] iArr2 = constraintWidgetContainer.f36843P;
                            if (iArr2[0] == 1 || iArr2[0] == 4) {
                                m15807f(constraintWidget, 1, (int) ((f * constraintWidgetContainer.m15766s()) + 0.5f), i6, constraintWidget.m15760m());
                                constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                                constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                                constraintWidget.f36854a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr = constraintWidget.f36840M;
                            if (constraintAnchorArr[0].f36814f == null || constraintAnchorArr[1].f36814f == null) {
                                m15807f(constraintWidget, 2, 0, i6, 0);
                                constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                                constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                                constraintWidget.f36854a = true;
                            }
                        }
                    }
                    if (i6 == 3 && (i5 == 2 || i5 == 1)) {
                        if (i8 == 3) {
                            if (i5 == 2) {
                                m15807f(constraintWidget, 2, 0, 2, 0);
                            }
                            int iM15766s3 = constraintWidget.m15766s();
                            float f3 = constraintWidget.f36847T;
                            if (constraintWidget.f36848U == -1) {
                                f3 = 1.0f / f3;
                            }
                            m15807f(constraintWidget, 1, iM15766s3, 1, (int) ((iM15766s3 * f3) + 0.5f));
                            constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                            constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                            constraintWidget.f36854a = true;
                        } else if (i8 == 1) {
                            m15807f(constraintWidget, i5, 0, 2, 0);
                            constraintWidget.f36862e.f37005e.f36987m = constraintWidget.m15760m();
                        } else if (i8 == 2) {
                            int[] iArr3 = constraintWidgetContainer.f36843P;
                            if (iArr3[1] == 1 || iArr3[1] == 4) {
                                m15807f(constraintWidget, i5, constraintWidget.m15766s(), 1, (int) ((f2 * constraintWidgetContainer.m15760m()) + 0.5f));
                                constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                                constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                                constraintWidget.f36854a = true;
                            }
                        } else {
                            ConstraintAnchor[] constraintAnchorArr2 = constraintWidget.f36840M;
                            if (constraintAnchorArr2[2].f36814f == null || constraintAnchorArr2[3].f36814f == null) {
                                m15807f(constraintWidget, 2, 0, i6, 0);
                                constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                                constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                                constraintWidget.f36854a = true;
                            }
                        }
                    }
                    if (i5 == 3 && i6 == 3) {
                        if (i7 == 1 || i8 == 1) {
                            m15807f(constraintWidget, 2, 0, 2, 0);
                            constraintWidget.f36860d.f37005e.f36987m = constraintWidget.m15766s();
                            constraintWidget.f36862e.f37005e.f36987m = constraintWidget.m15760m();
                        } else if (i8 == 2 && i7 == 2) {
                            int[] iArr4 = constraintWidgetContainer.f36843P;
                            if (iArr4[0] == 1 || iArr4[0] == 1) {
                                if (iArr4[1] == 1 || iArr4[1] == 1) {
                                    m15807f(constraintWidget, 1, (int) ((f * constraintWidgetContainer.m15766s()) + 0.5f), 1, (int) ((f2 * constraintWidgetContainer.m15760m()) + 0.5f));
                                    constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                                    constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                                    constraintWidget.f36854a = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m15804c() {
        ArrayList<WidgetRun> arrayList = this.f36962e;
        arrayList.clear();
        this.f36961d.f36860d.mo15797f();
        this.f36961d.f36862e.mo15797f();
        arrayList.add(this.f36961d.f36860d);
        arrayList.add(this.f36961d.f36862e);
        HashSet hashSet = null;
        for (ConstraintWidget constraintWidget : this.f36961d.f36942m0) {
            if (constraintWidget instanceof Guideline2) {
                arrayList.add(new GuidelineReference(constraintWidget));
            } else {
                if (constraintWidget.m15771x()) {
                    if (constraintWidget.f36856b == null) {
                        constraintWidget.f36856b = new ChainRun(constraintWidget, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f36856b);
                } else {
                    arrayList.add(constraintWidget.f36860d);
                }
                if (constraintWidget.m15772y()) {
                    if (constraintWidget.f36858c == null) {
                        constraintWidget.f36858c = new ChainRun(constraintWidget, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(constraintWidget.f36858c);
                } else {
                    arrayList.add(constraintWidget.f36862e);
                }
                if (constraintWidget instanceof HelperWidget) {
                    arrayList.add(new HelperReferences(constraintWidget));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().mo15797f();
        }
        for (WidgetRun widgetRun : arrayList) {
            if (widgetRun.f37002b != this.f36961d) {
                widgetRun.mo15795d();
            }
        }
        this.f36965h.clear();
        RunGroup.f36990a = 0;
        m15806e(this.f36958a.f36860d, 0, this.f36965h);
        m15806e(this.f36958a.f36862e, 1, this.f36965h);
        this.f36959b = false;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:22:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX INFO: renamed from: d */
    public final int m15805d(ConstraintWidgetContainer constraintWidgetContainer, int i) {
        WidgetRun widgetRun;
        WidgetRun widgetRun2;
        boolean zContains;
        boolean zContains2;
        long jMo15798j;
        float f;
        long j2;
        DependencyGraph dependencyGraph = this;
        int size = dependencyGraph.f36965h.size();
        long jMax = 0;
        long jMo15798j2 = 0;
        int i2 = 0;
        while (i2 < size) {
            RunGroup runGroup = dependencyGraph.f36965h.get(i2);
            WidgetRun widgetRun3 = runGroup.f36991b;
            if (widgetRun3 instanceof ChainRun) {
                if (((ChainRun) widgetRun3).f37006f == i) {
                    if (i == 0) {
                        widgetRun = constraintWidgetContainer.f36860d;
                    } else {
                        widgetRun = constraintWidgetContainer.f36862e;
                    }
                    DependencyNode dependencyNode = widgetRun.f37008h;
                    if (i == 0) {
                        widgetRun2 = constraintWidgetContainer.f36860d;
                    } else {
                        widgetRun2 = constraintWidgetContainer.f36862e;
                    }
                    DependencyNode dependencyNode2 = widgetRun2.f37009i;
                    zContains = widgetRun3.f37008h.f36977l.contains(dependencyNode);
                    zContains2 = runGroup.f36991b.f37009i.f36977l.contains(dependencyNode2);
                    jMo15798j = runGroup.f36991b.mo15798j();
                    if (!zContains && zContains2) {
                        long jM15826b = runGroup.m15826b(runGroup.f36991b.f37008h, jMo15798j2);
                        long jM15825a = runGroup.m15825a(runGroup.f36991b.f37009i, jMo15798j2);
                        long j3 = jM15826b - jMo15798j;
                        WidgetRun widgetRun4 = runGroup.f36991b;
                        int i3 = widgetRun4.f37009i.f36971f;
                        if (j3 >= (-i3)) {
                            j3 += (long) i3;
                        }
                        long j4 = (-jM15825a) - jMo15798j;
                        long j5 = widgetRun4.f37008h.f36971f;
                        long j6 = j4 - j5;
                        if (j6 >= j5) {
                            j6 -= j5;
                        }
                        ConstraintWidget constraintWidget = widgetRun4.f37002b;
                        Objects.requireNonNull(constraintWidget);
                        if (i == 0) {
                            f = constraintWidget.f36855a0;
                        } else {
                            f = i == 1 ? constraintWidget.f36857b0 : -1.0f;
                        }
                        if (f > 0.0f) {
                            j2 = (long) ((j3 / (1.0f - f)) + (j6 / f));
                        } else {
                            j2 = 0;
                        }
                        float f2 = j2;
                        long jM1576a = ((long) ((f2 * f) + 0.5f)) + jMo15798j + ((long) outline.m1576a(1.0f, f, f2, 0.5f));
                        WidgetRun widgetRun5 = runGroup.f36991b;
                        jMo15798j2 = (((long) widgetRun5.f37008h.f36971f) + jM1576a) - ((long) widgetRun5.f37009i.f36971f);
                    } else if (zContains) {
                        DependencyNode dependencyNode3 = runGroup.f36991b.f37008h;
                        jMo15798j2 = Math.max(runGroup.m15826b(dependencyNode3, dependencyNode3.f36971f), ((long) runGroup.f36991b.f37008h.f36971f) + jMo15798j);
                    } else if (zContains2) {
                        DependencyNode dependencyNode4 = runGroup.f36991b.f37009i;
                        jMo15798j2 = Math.max(-runGroup.m15825a(dependencyNode4, dependencyNode4.f36971f), ((long) (-runGroup.f36991b.f37009i.f36971f)) + jMo15798j);
                    } else {
                        WidgetRun widgetRun6 = runGroup.f36991b;
                        jMo15798j2 = (widgetRun6.mo15798j() + ((long) widgetRun6.f37008h.f36971f)) - ((long) runGroup.f36991b.f37009i.f36971f);
                    }
                }
            } else if (i == 0) {
                if (widgetRun3 instanceof HorizontalWidgetRun) {
                    if (i == 0) {
                        widgetRun = constraintWidgetContainer.f36860d;
                    } else {
                        widgetRun = constraintWidgetContainer.f36862e;
                    }
                    DependencyNode dependencyNode5 = widgetRun.f37008h;
                    if (i == 0) {
                        widgetRun2 = constraintWidgetContainer.f36860d;
                    } else {
                        widgetRun2 = constraintWidgetContainer.f36862e;
                    }
                    DependencyNode dependencyNode6 = widgetRun2.f37009i;
                    zContains = widgetRun3.f37008h.f36977l.contains(dependencyNode5);
                    zContains2 = runGroup.f36991b.f37009i.f36977l.contains(dependencyNode6);
                    jMo15798j = runGroup.f36991b.mo15798j();
                    if (!zContains) {
                        if (zContains) {
                            DependencyNode dependencyNode7 = runGroup.f36991b.f37008h;
                            jMo15798j2 = Math.max(runGroup.m15826b(dependencyNode7, dependencyNode7.f36971f), ((long) runGroup.f36991b.f37008h.f36971f) + jMo15798j);
                        } else if (zContains2) {
                            DependencyNode dependencyNode8 = runGroup.f36991b.f37009i;
                            jMo15798j2 = Math.max(-runGroup.m15825a(dependencyNode8, dependencyNode8.f36971f), ((long) (-runGroup.f36991b.f37009i.f36971f)) + jMo15798j);
                        } else {
                            WidgetRun widgetRun7 = runGroup.f36991b;
                            jMo15798j2 = (widgetRun7.mo15798j() + ((long) widgetRun7.f37008h.f36971f)) - ((long) runGroup.f36991b.f37009i.f36971f);
                        }
                    } else if (zContains) {
                        DependencyNode dependencyNode9 = runGroup.f36991b.f37008h;
                        jMo15798j2 = Math.max(runGroup.m15826b(dependencyNode9, dependencyNode9.f36971f), ((long) runGroup.f36991b.f37008h.f36971f) + jMo15798j);
                    } else if (zContains2) {
                        DependencyNode dependencyNode10 = runGroup.f36991b.f37009i;
                        jMo15798j2 = Math.max(-runGroup.m15825a(dependencyNode10, dependencyNode10.f36971f), ((long) (-runGroup.f36991b.f37009i.f36971f)) + jMo15798j);
                    } else {
                        WidgetRun widgetRun8 = runGroup.f36991b;
                        jMo15798j2 = (widgetRun8.mo15798j() + ((long) widgetRun8.f37008h.f36971f)) - ((long) runGroup.f36991b.f37009i.f36971f);
                    }
                }
            } else if (widgetRun3 instanceof VerticalWidgetRun) {
                if (i == 0) {
                    widgetRun = constraintWidgetContainer.f36860d;
                } else {
                    widgetRun = constraintWidgetContainer.f36862e;
                }
                DependencyNode dependencyNode11 = widgetRun.f37008h;
                if (i == 0) {
                    widgetRun2 = constraintWidgetContainer.f36860d;
                } else {
                    widgetRun2 = constraintWidgetContainer.f36862e;
                }
                DependencyNode dependencyNode12 = widgetRun2.f37009i;
                zContains = widgetRun3.f37008h.f36977l.contains(dependencyNode11);
                zContains2 = runGroup.f36991b.f37009i.f36977l.contains(dependencyNode12);
                jMo15798j = runGroup.f36991b.mo15798j();
                if (!zContains) {
                    if (zContains) {
                        DependencyNode dependencyNode13 = runGroup.f36991b.f37008h;
                        jMo15798j2 = Math.max(runGroup.m15826b(dependencyNode13, dependencyNode13.f36971f), ((long) runGroup.f36991b.f37008h.f36971f) + jMo15798j);
                    } else if (zContains2) {
                        DependencyNode dependencyNode14 = runGroup.f36991b.f37009i;
                        jMo15798j2 = Math.max(-runGroup.m15825a(dependencyNode14, dependencyNode14.f36971f), ((long) (-runGroup.f36991b.f37009i.f36971f)) + jMo15798j);
                    } else {
                        WidgetRun widgetRun9 = runGroup.f36991b;
                        jMo15798j2 = (widgetRun9.mo15798j() + ((long) widgetRun9.f37008h.f36971f)) - ((long) runGroup.f36991b.f37009i.f36971f);
                    }
                } else if (zContains) {
                    DependencyNode dependencyNode15 = runGroup.f36991b.f37008h;
                    jMo15798j2 = Math.max(runGroup.m15826b(dependencyNode15, dependencyNode15.f36971f), ((long) runGroup.f36991b.f37008h.f36971f) + jMo15798j);
                } else if (zContains2) {
                    DependencyNode dependencyNode16 = runGroup.f36991b.f37009i;
                    jMo15798j2 = Math.max(-runGroup.m15825a(dependencyNode16, dependencyNode16.f36971f), ((long) (-runGroup.f36991b.f37009i.f36971f)) + jMo15798j);
                } else {
                    WidgetRun widgetRun10 = runGroup.f36991b;
                    jMo15798j2 = (widgetRun10.mo15798j() + ((long) widgetRun10.f37008h.f36971f)) - ((long) runGroup.f36991b.f37009i.f36971f);
                }
            }
            jMax = Math.max(jMax, jMo15798j2);
            i2++;
            jMo15798j2 = 0;
            dependencyGraph = this;
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: e */
    public final void m15806e(WidgetRun widgetRun, int i, ArrayList<RunGroup> arrayList) {
        for (Dependency2 dependency2 : widgetRun.f37008h.f36976k) {
            if (dependency2 instanceof DependencyNode) {
                m15802a((DependencyNode) dependency2, i, 0, widgetRun.f37009i, arrayList, null);
            } else if (dependency2 instanceof WidgetRun) {
                m15802a(((WidgetRun) dependency2).f37008h, i, 0, widgetRun.f37009i, arrayList, null);
            }
        }
        for (Dependency2 dependency3 : widgetRun.f37009i.f36976k) {
            if (dependency3 instanceof DependencyNode) {
                m15802a((DependencyNode) dependency3, i, 1, widgetRun.f37008h, arrayList, null);
            } else if (dependency3 instanceof WidgetRun) {
                m15802a(((WidgetRun) dependency3).f37009i, i, 1, widgetRun.f37008h, arrayList, null);
            }
        }
        if (i == 1) {
            for (Dependency2 dependency4 : ((VerticalWidgetRun) widgetRun).f36993k.f36976k) {
                if (dependency4 instanceof DependencyNode) {
                    m15802a((DependencyNode) dependency4, i, 2, null, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m15807f(ConstraintWidget constraintWidget, int i, int i2, int i3, int i4) {
        BasicMeasure.a aVar = this.f36964g;
        aVar.f36946a = i;
        aVar.f36947b = i3;
        aVar.f36948c = i2;
        aVar.f36949d = i4;
        ((ConstraintLayout.C0095b) this.f36963f).m286b(constraintWidget, aVar);
        constraintWidget.m15748N(this.f36964g.f36950e);
        constraintWidget.m15743I(this.f36964g.f36951f);
        BasicMeasure.a aVar2 = this.f36964g;
        constraintWidget.f36891z = aVar2.f36953h;
        constraintWidget.m15740F(aVar2.f36952g);
    }

    /* JADX INFO: renamed from: g */
    public void m15808g() {
        DimensionDependency dimensionDependency;
        for (ConstraintWidget constraintWidget : this.f36958a.f36942m0) {
            if (!constraintWidget.f36854a) {
                int[] iArr = constraintWidget.f36843P;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = constraintWidget.f36878m;
                int i4 = constraintWidget.f36879n;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                DimensionDependency dimensionDependency2 = constraintWidget.f36860d.f37005e;
                boolean z3 = dimensionDependency2.f36975j;
                DimensionDependency dimensionDependency3 = constraintWidget.f36862e.f37005e;
                boolean z4 = dimensionDependency3.f36975j;
                if (z3 && z4) {
                    m15807f(constraintWidget, 1, dimensionDependency2.f36972g, 1, dimensionDependency3.f36972g);
                    constraintWidget.f36854a = true;
                } else if (z3 && z) {
                    m15807f(constraintWidget, 1, dimensionDependency2.f36972g, 2, dimensionDependency3.f36972g);
                    if (i2 == 3) {
                        constraintWidget.f36862e.f37005e.f36987m = constraintWidget.m15760m();
                    } else {
                        constraintWidget.f36862e.f37005e.mo15810c(constraintWidget.m15760m());
                        constraintWidget.f36854a = true;
                    }
                } else if (z4 && z2) {
                    m15807f(constraintWidget, 2, dimensionDependency2.f36972g, 1, dimensionDependency3.f36972g);
                    if (i == 3) {
                        constraintWidget.f36860d.f37005e.f36987m = constraintWidget.m15766s();
                    } else {
                        constraintWidget.f36860d.f37005e.mo15810c(constraintWidget.m15766s());
                        constraintWidget.f36854a = true;
                    }
                }
                if (constraintWidget.f36854a && (dimensionDependency = constraintWidget.f36862e.f36994l) != null) {
                    dimensionDependency.mo15810c(constraintWidget.f36851X);
                }
            }
        }
    }
}
