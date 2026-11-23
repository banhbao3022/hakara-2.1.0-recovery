package p636z0.p697i.p700b.p701h;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p636z0.p697i.p700b.LinearSystem;
import p636z0.p697i.p700b.p701h.p702n.BasicMeasure;
import p636z0.p697i.p700b.p701h.p702n.ChainRun;
import p636z0.p697i.p700b.p701h.p702n.DependencyGraph;
import p636z0.p697i.p700b.p701h.p702n.Direct;
import p636z0.p697i.p700b.p701h.p702n.Grouping;
import p636z0.p697i.p700b.p701h.p702n.WidgetGroup;
import p636z0.p697i.p700b.p701h.p702n.WidgetRun;

/* JADX INFO: renamed from: z0.i.b.h.f, reason: use source file name */
/* JADX INFO: compiled from: ConstraintWidgetContainer.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidgetContainer extends WidgetContainer {

    /* JADX INFO: renamed from: A0 */
    public boolean f36892A0;

    /* JADX INFO: renamed from: B0 */
    public WeakReference<ConstraintAnchor> f36893B0;

    /* JADX INFO: renamed from: C0 */
    public WeakReference<ConstraintAnchor> f36894C0;

    /* JADX INFO: renamed from: D0 */
    public WeakReference<ConstraintAnchor> f36895D0;

    /* JADX INFO: renamed from: E0 */
    public WeakReference<ConstraintAnchor> f36896E0;

    /* JADX INFO: renamed from: F0 */
    public BasicMeasure.a f36897F0;

    /* JADX INFO: renamed from: n0 */
    public BasicMeasure f36898n0;

    /* JADX INFO: renamed from: o0 */
    public DependencyGraph f36899o0;

    /* JADX INFO: renamed from: p0 */
    public BasicMeasure.b f36900p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f36901q0;

    /* JADX INFO: renamed from: r0 */
    public LinearSystem f36902r0;

    /* JADX INFO: renamed from: s0 */
    public int f36903s0;

    /* JADX INFO: renamed from: t0 */
    public int f36904t0;

    /* JADX INFO: renamed from: u0 */
    public int f36905u0;

    /* JADX INFO: renamed from: v0 */
    public int f36906v0;

    /* JADX INFO: renamed from: w0 */
    public ChainHead[] f36907w0;

    /* JADX INFO: renamed from: x0 */
    public ChainHead[] f36908x0;

    /* JADX INFO: renamed from: y0 */
    public int f36909y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f36910z0;

    public ConstraintWidgetContainer() {
        this.f36898n0 = new BasicMeasure(this);
        this.f36899o0 = new DependencyGraph(this);
        this.f36900p0 = null;
        this.f36901q0 = false;
        this.f36902r0 = new LinearSystem();
        this.f36905u0 = 0;
        this.f36906v0 = 0;
        this.f36907w0 = new ChainHead[4];
        this.f36908x0 = new ChainHead[4];
        this.f36909y0 = 257;
        this.f36910z0 = false;
        this.f36892A0 = false;
        this.f36893B0 = null;
        this.f36894C0 = null;
        this.f36895D0 = null;
        this.f36896E0 = null;
        this.f36897F0 = new BasicMeasure.a();
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m15774Y(ConstraintWidget constraintWidget, BasicMeasure.b bVar, BasicMeasure.a aVar, int i) {
        int i2;
        int i3;
        if (bVar == null) {
            return false;
        }
        aVar.f36946a = constraintWidget.m15761n();
        aVar.f36947b = constraintWidget.m15765r();
        aVar.f36948c = constraintWidget.m15766s();
        aVar.f36949d = constraintWidget.m15760m();
        aVar.f36954i = false;
        aVar.f36955j = i;
        boolean z = aVar.f36946a == 3;
        boolean z2 = aVar.f36947b == 3;
        boolean z3 = z && constraintWidget.f36847T > 0.0f;
        boolean z4 = z2 && constraintWidget.f36847T > 0.0f;
        if (z && constraintWidget.m15769v(0) && constraintWidget.f36878m == 0 && !z3) {
            aVar.f36946a = 2;
            if (z2 && constraintWidget.f36879n == 0) {
                aVar.f36946a = 1;
            }
            z = false;
        }
        if (z2 && constraintWidget.m15769v(1) && constraintWidget.f36879n == 0 && !z4) {
            aVar.f36947b = 2;
            if (z && constraintWidget.f36878m == 0) {
                aVar.f36947b = 1;
            }
            z2 = false;
        }
        if (constraintWidget.mo15718A()) {
            aVar.f36946a = 1;
            z = false;
        }
        if (constraintWidget.mo15719B()) {
            aVar.f36947b = 1;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.f36880o[0] == 4) {
                aVar.f36946a = 1;
            } else if (!z2) {
                if (aVar.f36947b == 1) {
                    i3 = aVar.f36949d;
                } else {
                    aVar.f36946a = 2;
                    ((ConstraintLayout.C0095b) bVar).m286b(constraintWidget, aVar);
                    i3 = aVar.f36951f;
                }
                aVar.f36946a = 1;
                int i4 = constraintWidget.f36848U;
                if (i4 == 0 || i4 == -1) {
                    aVar.f36948c = (int) (constraintWidget.f36847T * i3);
                } else {
                    aVar.f36948c = (int) (constraintWidget.f36847T / i3);
                }
            }
        }
        if (z4) {
            if (constraintWidget.f36880o[1] == 4) {
                aVar.f36947b = 1;
            } else if (!z) {
                if (aVar.f36946a == 1) {
                    i2 = aVar.f36948c;
                } else {
                    aVar.f36947b = 2;
                    ((ConstraintLayout.C0095b) bVar).m286b(constraintWidget, aVar);
                    i2 = aVar.f36950e;
                }
                aVar.f36947b = 1;
                int i5 = constraintWidget.f36848U;
                if (i5 == 0 || i5 == -1) {
                    aVar.f36949d = (int) (i2 / constraintWidget.f36847T);
                } else {
                    aVar.f36949d = (int) (i2 * constraintWidget.f36847T);
                }
            }
        }
        ((ConstraintLayout.C0095b) bVar).m286b(constraintWidget, aVar);
        constraintWidget.m15748N(aVar.f36950e);
        constraintWidget.m15743I(aVar.f36951f);
        constraintWidget.f36891z = aVar.f36953h;
        constraintWidget.m15740F(aVar.f36952g);
        aVar.f36955j = 0;
        return aVar.f36954i;
    }

    @Override // p636z0.p697i.p700b.p701h.WidgetContainer, p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: C */
    public void mo15737C() {
        this.f36902r0.m15708u();
        this.f36903s0 = 0;
        this.f36904t0 = 0;
        super.mo15737C();
    }

    @Override // p636z0.p697i.p700b.p701h.ConstraintWidget
    /* JADX INFO: renamed from: O */
    public void mo15749O(boolean z, boolean z2) {
        super.mo15749O(z, z2);
        int size = this.f36942m0.size();
        for (int i = 0; i < size; i++) {
            this.f36942m0.get(i).mo15749O(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:321:0x0579  */
    /* JADX WARN: Code duplicated, block: B:336:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:354:0x05de  */
    /* JADX WARN: Code duplicated, block: B:359:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:371:0x061e  */
    /* JADX WARN: Code duplicated, block: B:382:0x0643  */
    /* JADX WARN: Code duplicated, block: B:385:0x064e  */
    /* JADX WARN: Code duplicated, block: B:387:0x065a  */
    /* JADX WARN: Code duplicated, block: B:391:0x066b  */
    /* JADX WARN: Code duplicated, block: B:394:0x0680 A[Catch: Exception -> 0x074b, LOOP:12: B:393:0x067e->B:394:0x0680, LOOP_END, TryCatch #1 {Exception -> 0x074b, blocks: (B:392:0x066e, B:394:0x0680, B:395:0x0690), top: B:487:0x066e }] */
    /* JADX WARN: Code duplicated, block: B:421:0x0740  */
    /* JADX WARN: Code duplicated, block: B:430:0x0768  */
    /* JADX WARN: Code duplicated, block: B:432:0x0782 A[LOOP:13: B:431:0x0780->B:432:0x0782, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:433:0x0792  */
    /* JADX WARN: Code duplicated, block: B:435:0x079a A[LOOP:15: B:434:0x0798->B:435:0x079a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:454:0x0812  */
    /* JADX WARN: Code duplicated, block: B:457:0x0823  */
    /* JADX WARN: Code duplicated, block: B:458:0x0830  */
    /* JADX WARN: Code duplicated, block: B:461:0x0843  */
    /* JADX WARN: Code duplicated, block: B:462:0x084d  */
    /* JADX WARN: Code duplicated, block: B:464:0x0851  */
    /* JADX WARN: Code duplicated, block: B:470:0x086d  */
    /* JADX WARN: Code duplicated, block: B:477:0x088d  */
    /* JADX WARN: Code duplicated, block: B:482:0x089e  */
    /* JADX WARN: Code duplicated, block: B:539:0x065f A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // p636z0.p697i.p700b.p701h.WidgetContainer
    /* JADX INFO: renamed from: Q */
    public void mo15775Q() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        LinearSystem linearSystem;
        int i6;
        boolean z3;
        int i7;
        int i8;
        boolean zM15783Z;
        boolean z4;
        int i9;
        boolean z5;
        int i10;
        boolean z6;
        int iMax;
        ?? r6;
        boolean z7;
        int iMax2;
        boolean z8;
        boolean z9;
        boolean z10;
        LinearSystem linearSystem2;
        boolean zM15783Z2;
        int size;
        int i11;
        int i12;
        WeakReference<ConstraintAnchor> weakReference;
        WeakReference<ConstraintAnchor> weakReference2;
        WeakReference<ConstraintAnchor> weakReference3;
        WeakReference<ConstraintAnchor> weakReference4;
        ConstraintWidget constraintWidget;
        int i13;
        int i14;
        int i15;
        int i16;
        WidgetGroup widgetGroup;
        WidgetGroup widgetGroup2;
        boolean z11;
        int iM15830c;
        int iM15830c2;
        int i17;
        int iM15766s;
        int i18;
        int iM15760m;
        this.f36849V = 0;
        this.f36850W = 0;
        this.f36910z0 = false;
        this.f36892A0 = false;
        int size2 = this.f36942m0.size();
        int iMax3 = Math.max(0, m15766s());
        int iMax4 = Math.max(0, m15760m());
        int[] iArr = this.f36843P;
        int i19 = iArr[1];
        int i20 = iArr[0];
        if (Optimizer.m15790b(this.f36909y0, 1)) {
            BasicMeasure.b bVar = this.f36900p0;
            BasicMeasure.a aVar = Direct.f36988a;
            int iM15761n = m15761n();
            int iM15765r = m15765r();
            m15738D();
            ArrayList<ConstraintWidget> arrayList = this.f36942m0;
            int size3 = arrayList.size();
            for (int i21 = 0; i21 < size3; i21++) {
                arrayList.get(i21).m15738D();
            }
            boolean z12 = this.f36901q0;
            if (iM15761n == 1) {
                m15741G(0, m15766s());
            } else {
                ConstraintAnchor constraintAnchor = this.f36832E;
                constraintAnchor.f36810b = 0;
                constraintAnchor.f36811c = true;
                this.f36849V = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i22 = 0; i22 < size3; i22++) {
                ConstraintWidget constraintWidget2 = arrayList.get(i22);
                if (constraintWidget2 instanceof Guideline2) {
                    Guideline2 guideline2 = (Guideline2) constraintWidget2;
                    if (guideline2.f36936q0 == 1) {
                        int i23 = guideline2.f36933n0;
                        if (i23 != -1) {
                            guideline2.m15785Q(i23);
                        } else if (guideline2.f36934o0 != -1 && mo15718A()) {
                            guideline2.m15785Q(m15766s() - guideline2.f36934o0);
                        } else if (mo15718A()) {
                            guideline2.m15785Q((int) ((guideline2.f36932m0 * m15766s()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((constraintWidget2 instanceof Barrier2) && ((Barrier2) constraintWidget2).m15721S() == 0) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i24 = 0; i24 < size3; i24++) {
                    ConstraintWidget constraintWidget3 = arrayList.get(i24);
                    if (constraintWidget3 instanceof Guideline2) {
                        Guideline2 guideline3 = (Guideline2) constraintWidget3;
                        if (guideline3.f36936q0 == 1) {
                            Direct.m15812b(guideline3, bVar, z12);
                        }
                    }
                }
            }
            Direct.m15812b(this, bVar, z12);
            if (z14) {
                for (int i25 = 0; i25 < size3; i25++) {
                    ConstraintWidget constraintWidget4 = arrayList.get(i25);
                    if (constraintWidget4 instanceof Barrier2) {
                        Barrier2 barrier2 = (Barrier2) constraintWidget4;
                        if (barrier2.m15721S() == 0 && barrier2.m15720R()) {
                            Direct.m15812b(barrier2, bVar, z12);
                        }
                    }
                }
            }
            if (iM15765r == 1) {
                m15742H(0, m15760m());
            } else {
                ConstraintAnchor constraintAnchor2 = this.f36833F;
                constraintAnchor2.f36810b = 0;
                constraintAnchor2.f36811c = true;
                this.f36850W = 0;
            }
            boolean z15 = false;
            boolean z16 = false;
            for (int i26 = 0; i26 < size3; i26++) {
                ConstraintWidget constraintWidget5 = arrayList.get(i26);
                if (constraintWidget5 instanceof Guideline2) {
                    Guideline2 guideline4 = (Guideline2) constraintWidget5;
                    if (guideline4.f36936q0 == 0) {
                        int i27 = guideline4.f36933n0;
                        if (i27 != -1) {
                            guideline4.m15785Q(i27);
                        } else if (guideline4.f36934o0 != -1 && mo15719B()) {
                            guideline4.m15785Q(m15760m() - guideline4.f36934o0);
                        } else if (mo15719B()) {
                            guideline4.m15785Q((int) ((guideline4.f36932m0 * m15760m()) + 0.5f));
                        }
                        z15 = true;
                    }
                } else if ((constraintWidget5 instanceof Barrier2) && ((Barrier2) constraintWidget5).m15721S() == 1) {
                    z16 = true;
                }
            }
            if (z15) {
                for (int i28 = 0; i28 < size3; i28++) {
                    ConstraintWidget constraintWidget6 = arrayList.get(i28);
                    if (constraintWidget6 instanceof Guideline2) {
                        Guideline2 guideline5 = (Guideline2) constraintWidget6;
                        if (guideline5.f36936q0 == 0) {
                            Direct.m15817g(guideline5, bVar);
                        }
                    }
                }
            }
            Direct.m15817g(this, bVar);
            if (z16) {
                for (int i29 = 0; i29 < size3; i29++) {
                    ConstraintWidget constraintWidget7 = arrayList.get(i29);
                    if (constraintWidget7 instanceof Barrier2) {
                        Barrier2 barrier3 = (Barrier2) constraintWidget7;
                        if (barrier3.m15721S() == 1 && barrier3.m15720R()) {
                            Direct.m15817g(barrier3, bVar);
                        }
                    }
                }
            }
            for (int i30 = 0; i30 < size3; i30++) {
                ConstraintWidget constraintWidget8 = arrayList.get(i30);
                if (constraintWidget8.m15773z() && Direct.m15811a(constraintWidget8)) {
                    m15774Y(constraintWidget8, bVar, Direct.f36988a, 0);
                    Direct.m15812b(constraintWidget8, bVar, z12);
                    Direct.m15817g(constraintWidget8, bVar);
                }
            }
            for (int i31 = 0; i31 < size2; i31++) {
                ConstraintWidget constraintWidget9 = this.f36942m0.get(i31);
                if (constraintWidget9.m15773z() && !(constraintWidget9 instanceof Guideline2) && !(constraintWidget9 instanceof Barrier2) && !(constraintWidget9 instanceof VirtualLayout) && !constraintWidget9.f36829B) {
                    if (!(constraintWidget9.m15759l(0) == 3 && constraintWidget9.f36878m != 1 && constraintWidget9.m15759l(1) == 3 && constraintWidget9.f36879n != 1)) {
                        m15774Y(constraintWidget9, this.f36900p0, new BasicMeasure.a(), 0);
                    }
                }
            }
        }
        if (size2 > 2 && ((i20 == 2 || i19 == 2) && Optimizer.m15790b(this.f36909y0, 1024))) {
            BasicMeasure.b bVar2 = this.f36900p0;
            ConstraintAnchor.a aVar2 = ConstraintAnchor.a.CENTER;
            ArrayList<ConstraintWidget> arrayList2 = this.f36942m0;
            int size4 = arrayList2.size();
            int i32 = 0;
            while (true) {
                if (i32 >= size4) {
                    i = size2;
                    ArrayList arrayList3 = null;
                    int i33 = 0;
                    ArrayList<HelperWidget> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<HelperWidget> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    while (i33 < size4) {
                        int i34 = iMax4;
                        ConstraintWidget constraintWidget10 = arrayList2.get(i33);
                        int i35 = i19;
                        int i36 = iMax3;
                        int i37 = i20;
                        ArrayList<ConstraintWidget> arrayList9 = arrayList2;
                        if (!Grouping.m15820c(m15761n(), m15765r(), constraintWidget10.m15761n(), constraintWidget10.m15765r())) {
                            m15774Y(constraintWidget10, bVar2, this.f36897F0, 0);
                        }
                        boolean z17 = constraintWidget10 instanceof Guideline2;
                        if (z17) {
                            Guideline2 guideline6 = (Guideline2) constraintWidget10;
                            if (guideline6.f36936q0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(guideline6);
                            }
                            if (guideline6.f36936q0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(guideline6);
                            }
                        }
                        if (constraintWidget10 instanceof HelperWidget) {
                            if (constraintWidget10 instanceof Barrier2) {
                                Barrier2 barrier4 = (Barrier2) constraintWidget10;
                                if (barrier4.m15721S() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(barrier4);
                                }
                                if (barrier4.m15721S() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(barrier4);
                                }
                            } else {
                                HelperWidget helperWidget = (HelperWidget) constraintWidget10;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(helperWidget);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(helperWidget);
                            }
                        }
                        if (constraintWidget10.f36832E.f36814f == null && constraintWidget10.f36834G.f36814f == null && !z17 && !(constraintWidget10 instanceof Barrier2)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(constraintWidget10);
                        }
                        if (constraintWidget10.f36833F.f36814f == null && constraintWidget10.f36835H.f36814f == null && constraintWidget10.f36836I.f36814f == null && !z17 && !(constraintWidget10 instanceof Barrier2)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(constraintWidget10);
                        }
                        i33++;
                        i19 = i35;
                        iMax4 = i34;
                        iMax3 = i36;
                        i20 = i37;
                        arrayList2 = arrayList9;
                    }
                    i13 = iMax3;
                    i14 = iMax4;
                    i15 = i20;
                    i16 = i19;
                    ArrayList<ConstraintWidget> arrayList10 = arrayList2;
                    ArrayList<WidgetGroup> arrayList11 = new ArrayList<>();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            Grouping.m15818a((Guideline2) it.next(), 0, arrayList11, null);
                        }
                    }
                    WidgetGroup widgetGroup3 = null;
                    int i38 = 0;
                    if (arrayList4 != null) {
                        for (HelperWidget helperWidget2 : arrayList4) {
                            WidgetGroup widgetGroupM15818a = Grouping.m15818a(helperWidget2, i38, arrayList11, widgetGroup3);
                            helperWidget2.m15788Q(arrayList11, i38, widgetGroupM15818a);
                            widgetGroupM15818a.m15829b(arrayList11);
                            widgetGroup3 = null;
                            i38 = 0;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet = mo15757j(ConstraintAnchor.a.LEFT).f36809a;
                    if (hashSet != null) {
                        Iterator<ConstraintAnchor> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            Grouping.m15818a(it2.next().f36812d, 0, arrayList11, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet2 = mo15757j(ConstraintAnchor.a.RIGHT).f36809a;
                    if (hashSet2 != null) {
                        Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            Grouping.m15818a(it3.next().f36812d, 0, arrayList11, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet3 = mo15757j(aVar2).f36809a;
                    if (hashSet3 != null) {
                        Iterator<ConstraintAnchor> it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            Grouping.m15818a(it4.next().f36812d, 0, arrayList11, null);
                        }
                    }
                    WidgetGroup widgetGroup4 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            Grouping.m15818a((ConstraintWidget) it5.next(), 0, arrayList11, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            Grouping.m15818a((Guideline2) it6.next(), 1, arrayList11, null);
                        }
                    }
                    int i39 = 1;
                    if (arrayList6 != null) {
                        for (HelperWidget helperWidget3 : arrayList6) {
                            WidgetGroup widgetGroupM15818a2 = Grouping.m15818a(helperWidget3, i39, arrayList11, widgetGroup4);
                            helperWidget3.m15788Q(arrayList11, i39, widgetGroupM15818a2);
                            widgetGroupM15818a2.m15829b(arrayList11);
                            widgetGroup4 = null;
                            i39 = 1;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet4 = mo15757j(ConstraintAnchor.a.TOP).f36809a;
                    if (hashSet4 != null) {
                        Iterator<ConstraintAnchor> it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            Grouping.m15818a(it7.next().f36812d, 1, arrayList11, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet5 = mo15757j(ConstraintAnchor.a.BASELINE).f36809a;
                    if (hashSet5 != null) {
                        Iterator<ConstraintAnchor> it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            Grouping.m15818a(it8.next().f36812d, 1, arrayList11, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet6 = mo15757j(ConstraintAnchor.a.BOTTOM).f36809a;
                    if (hashSet6 != null) {
                        Iterator<ConstraintAnchor> it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            Grouping.m15818a(it9.next().f36812d, 1, arrayList11, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet7 = mo15757j(aVar2).f36809a;
                    if (hashSet7 != null) {
                        Iterator<ConstraintAnchor> it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            Grouping.m15818a(it10.next().f36812d, 1, arrayList11, null);
                        }
                    }
                    char c2 = 1;
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            Grouping.m15818a((ConstraintWidget) it11.next(), 1, arrayList11, null);
                        }
                    }
                    int i40 = 0;
                    while (i40 < size4) {
                        ArrayList<ConstraintWidget> arrayList12 = arrayList10;
                        ConstraintWidget constraintWidget11 = arrayList12.get(i40);
                        int[] iArr2 = constraintWidget11.f36843P;
                        if (iArr2[0] == 3 && iArr2[c2] == 3) {
                            WidgetGroup widgetGroupM15819b = Grouping.m15819b(arrayList11, constraintWidget11.f36875k0);
                            WidgetGroup widgetGroupM15819b2 = Grouping.m15819b(arrayList11, constraintWidget11.f36877l0);
                            if (widgetGroupM15819b != null && widgetGroupM15819b2 != null) {
                                widgetGroupM15819b.m15831d(0, widgetGroupM15819b2);
                                widgetGroupM15819b2.f36998d = 2;
                                arrayList11.remove(widgetGroupM15819b);
                            }
                        }
                        i40++;
                        arrayList10 = arrayList12;
                        c2 = 1;
                    }
                    if (arrayList11.size() > 1) {
                        if (m15761n() == 2) {
                            widgetGroup = null;
                            int i41 = 0;
                            for (WidgetGroup widgetGroup5 : arrayList11) {
                                if (widgetGroup5.f36998d != 1 && (iM15830c2 = widgetGroup5.m15830c(this.f36902r0, 0)) > i41) {
                                    widgetGroup = widgetGroup5;
                                    i41 = iM15830c2;
                                }
                            }
                            if (widgetGroup != null) {
                                this.f36843P[0] = 1;
                                m15748N(i41);
                            } else {
                                widgetGroup = null;
                            }
                        } else {
                            widgetGroup = null;
                        }
                        if (m15765r() == 2) {
                            widgetGroup2 = null;
                            int i42 = 0;
                            for (WidgetGroup widgetGroup6 : arrayList11) {
                                if (widgetGroup6.f36998d != 0 && (iM15830c = widgetGroup6.m15830c(this.f36902r0, 1)) > i42) {
                                    widgetGroup2 = widgetGroup6;
                                    i42 = iM15830c;
                                }
                            }
                            if (widgetGroup2 != null) {
                                this.f36843P[1] = 1;
                                m15743I(i42);
                            } else {
                                widgetGroup2 = null;
                            }
                        } else {
                            widgetGroup2 = null;
                        }
                        if (widgetGroup != null || widgetGroup2 != null) {
                            z11 = true;
                            break;
                        }
                    }
                } else {
                    ConstraintWidget constraintWidget12 = arrayList2.get(i32);
                    if (Grouping.m15820c(m15761n(), m15765r(), constraintWidget12.m15761n(), constraintWidget12.m15765r()) && !(constraintWidget12 instanceof Flow)) {
                        i32++;
                    } else {
                        i13 = iMax3;
                        i = size2;
                        i14 = iMax4;
                        i15 = i20;
                        i16 = i19;
                    }
                }
                z11 = false;
                break;
            }
            if (z11) {
                i2 = i15;
                if (i2 == 2) {
                    i17 = i13;
                    if (i17 >= m15766s() || i17 <= 0) {
                        iM15766s = m15766s();
                    } else {
                        m15748N(i17);
                        this.f36910z0 = true;
                    }
                    i5 = i16;
                    if (i5 == 2) {
                        i18 = i14;
                        if (i18 < m15760m() || i18 <= 0) {
                            iM15760m = m15760m();
                        } else {
                            m15743I(i18);
                            this.f36892A0 = true;
                        }
                        i4 = iM15760m;
                        i3 = iM15766s;
                        z = true;
                    } else {
                        i18 = i14;
                    }
                    iM15760m = i18;
                    i4 = iM15760m;
                    i3 = iM15766s;
                    z = true;
                } else {
                    i17 = i13;
                }
                iM15766s = i17;
                i5 = i16;
                if (i5 == 2) {
                    i18 = i14;
                    if (i18 < m15760m()) {
                    }
                    iM15760m = m15760m();
                    i4 = iM15760m;
                    i3 = iM15766s;
                    z = true;
                } else {
                    i18 = i14;
                }
                iM15760m = i18;
                i4 = iM15760m;
                i3 = iM15766s;
                z = true;
            } else {
                i5 = i16;
                i4 = i14;
                i3 = i13;
                i2 = i15;
            }
            if (!m15783Z(64) || m15783Z(128)) {
                z2 = true;
            } else {
                z2 = false;
            }
            linearSystem = this.f36902r0;
            Objects.requireNonNull(linearSystem);
            linearSystem.f36746j = false;
            if (this.f36909y0 != 0 && z2) {
                linearSystem.f36746j = true;
            }
            ArrayList<ConstraintWidget> arrayList13 = this.f36942m0;
            if (m15761n() != 2 || m15765r() == 2) {
                i6 = 0;
                z3 = true;
            } else {
                i6 = 0;
                z3 = false;
            }
            this.f36905u0 = i6;
            this.f36906v0 = i6;
            i7 = i;
            for (i8 = 0; i8 < i7; i8++) {
                constraintWidget = this.f36942m0.get(i8);
                if (constraintWidget instanceof WidgetContainer) {
                    ((WidgetContainer) constraintWidget).mo15775Q();
                }
            }
            zM15783Z = m15783Z(64);
            z4 = z;
            i9 = 0;
            z5 = true;
            while (z5) {
                int i43 = i9 + 1;
                try {
                    this.f36902r0.m15708u();
                    this.f36905u0 = 0;
                    this.f36906v0 = 0;
                    m15755h(this.f36902r0);
                    for (i12 = 0; i12 < i7; i12++) {
                        this.f36942m0.get(i12).m15755h(this.f36902r0);
                    }
                    m15777S(this.f36902r0);
                    try {
                        weakReference = this.f36893B0;
                        if (weakReference != null && weakReference.get() != null) {
                            this.f36902r0.m15693f(this.f36902r0.m15699l(this.f36893B0.get()), this.f36902r0.m15699l(this.f36833F), 0, 5);
                            this.f36893B0 = null;
                        }
                        weakReference2 = this.f36895D0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            this.f36902r0.m15693f(this.f36902r0.m15699l(this.f36835H), this.f36902r0.m15699l(this.f36895D0.get()), 0, 5);
                            this.f36895D0 = null;
                        }
                        weakReference3 = this.f36894C0;
                        if (weakReference3 != null && weakReference3.get() != null) {
                            this.f36902r0.m15693f(this.f36902r0.m15699l(this.f36894C0.get()), this.f36902r0.m15699l(this.f36832E), 0, 5);
                            this.f36894C0 = null;
                        }
                        weakReference4 = this.f36896E0;
                        if (weakReference4 == null && weakReference4.get() != null) {
                            this.f36902r0.m15693f(this.f36902r0.m15699l(this.f36834G), this.f36902r0.m15699l(this.f36896E0.get()), 0, 5);
                            try {
                                this.f36896E0 = null;
                            } catch (Exception e) {
                                e = e;
                                z5 = true;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                            }
                        }
                        this.f36902r0.m15704q();
                        z5 = true;
                    } catch (Exception e2) {
                        e = e2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
                if (z5) {
                    linearSystem2 = this.f36902r0;
                    Optimizer.f36940a[2] = false;
                    zM15783Z2 = m15783Z(64);
                    mo15750P(linearSystem2, zM15783Z2);
                    size = this.f36942m0.size();
                    for (i11 = 0; i11 < size; i11++) {
                        this.f36942m0.get(i11).mo15750P(linearSystem2, zM15783Z2);
                    }
                } else {
                    mo15750P(this.f36902r0, zM15783Z);
                    for (i10 = 0; i10 < i7; i10++) {
                        this.f36942m0.get(i10).mo15750P(this.f36902r0, zM15783Z);
                    }
                }
                if (z3 || i43 >= 8 || !Optimizer.f36940a[2]) {
                    z6 = false;
                } else {
                    int iMax5 = 0;
                    int iMax6 = 0;
                    for (int i44 = 0; i44 < i7; i44++) {
                        ConstraintWidget constraintWidget13 = this.f36942m0.get(i44);
                        iMax5 = Math.max(iMax5, constraintWidget13.m15766s() + constraintWidget13.f36849V);
                        iMax6 = Math.max(iMax6, constraintWidget13.m15760m() + constraintWidget13.f36850W);
                    }
                    int iMax7 = Math.max(this.f36852Y, iMax5);
                    int iMax8 = Math.max(this.f36853Z, iMax6);
                    if (i2 != 2 || m15766s() >= iMax7) {
                        z6 = false;
                    } else {
                        m15748N(iMax7);
                        this.f36843P[0] = 2;
                        z6 = true;
                        z4 = true;
                    }
                    if (i5 == 2 && m15760m() < iMax8) {
                        m15743I(iMax8);
                        this.f36843P[1] = 2;
                        z6 = true;
                        z4 = true;
                    }
                }
                iMax = Math.max(this.f36852Y, m15766s());
                if (iMax > m15766s()) {
                    m15748N(iMax);
                    r6 = 1;
                    this.f36843P[0] = 1;
                    z6 = true;
                    z7 = true;
                } else {
                    r6 = 1;
                    z7 = z4;
                }
                iMax2 = Math.max(this.f36853Z, m15760m());
                if (iMax2 > m15760m()) {
                    m15743I(iMax2);
                    this.f36843P[r6] = r6;
                    z6 = true;
                    z8 = true;
                } else {
                    z8 = z7;
                }
                if (z8) {
                    boolean z18 = z8;
                    z9 = z6;
                    z10 = z18;
                } else {
                    if (this.f36843P[0] == 2 || i3 <= 0 || m15766s() <= i3) {
                        boolean z19 = z8;
                        z9 = z6;
                        z10 = z19;
                    } else {
                        this.f36910z0 = r6;
                        this.f36843P[0] = r6;
                        m15748N(i3);
                        z10 = true;
                        z9 = true;
                    }
                    if (this.f36843P[r6] != 2 && i4 > 0 && m15760m() > i4) {
                        this.f36892A0 = r6;
                        this.f36843P[r6] = r6;
                        m15743I(i4);
                        z4 = true;
                        z5 = true;
                    }
                    i9 = i43;
                }
                z5 = z9;
                z4 = z10;
                i9 = i43;
            }
            this.f36942m0 = arrayList13;
            if (z4) {
                int[] iArr3 = this.f36843P;
                iArr3[0] = i2;
                iArr3[1] = i5;
            }
            mo15739E(this.f36902r0.f36751o);
        }
        i = size2;
        i2 = i20;
        i3 = iMax3;
        i4 = iMax4;
        i5 = i19;
        z = false;
        if (m15783Z(64)) {
            z2 = true;
        } else {
            z2 = true;
        }
        linearSystem = this.f36902r0;
        Objects.requireNonNull(linearSystem);
        linearSystem.f36746j = false;
        if (this.f36909y0 != 0) {
            linearSystem.f36746j = true;
        }
        ArrayList<ConstraintWidget> arrayList14 = this.f36942m0;
        if (m15761n() != 2) {
            i6 = 0;
            z3 = true;
        } else {
            i6 = 0;
            z3 = true;
        }
        this.f36905u0 = i6;
        this.f36906v0 = i6;
        i7 = i;
        while (i8 < i7) {
            constraintWidget = this.f36942m0.get(i8);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).mo15775Q();
            }
        }
        zM15783Z = m15783Z(64);
        z4 = z;
        i9 = 0;
        z5 = true;
        while (z5) {
            int i45 = i9 + 1;
            this.f36902r0.m15708u();
            this.f36905u0 = 0;
            this.f36906v0 = 0;
            m15755h(this.f36902r0);
            while (i12 < i7) {
                this.f36942m0.get(i12).m15755h(this.f36902r0);
            }
            m15777S(this.f36902r0);
            weakReference = this.f36893B0;
            if (weakReference != null) {
                this.f36902r0.m15693f(this.f36902r0.m15699l(this.f36893B0.get()), this.f36902r0.m15699l(this.f36833F), 0, 5);
                this.f36893B0 = null;
            }
            weakReference2 = this.f36895D0;
            if (weakReference2 != null) {
                this.f36902r0.m15693f(this.f36902r0.m15699l(this.f36835H), this.f36902r0.m15699l(this.f36895D0.get()), 0, 5);
                this.f36895D0 = null;
            }
            weakReference3 = this.f36894C0;
            if (weakReference3 != null) {
                this.f36902r0.m15693f(this.f36902r0.m15699l(this.f36894C0.get()), this.f36902r0.m15699l(this.f36832E), 0, 5);
                this.f36894C0 = null;
            }
            weakReference4 = this.f36896E0;
            if (weakReference4 == null) {
            }
            this.f36902r0.m15704q();
            z5 = true;
            if (z5) {
                linearSystem2 = this.f36902r0;
                Optimizer.f36940a[2] = false;
                zM15783Z2 = m15783Z(64);
                mo15750P(linearSystem2, zM15783Z2);
                size = this.f36942m0.size();
                while (i11 < size) {
                    this.f36942m0.get(i11).mo15750P(linearSystem2, zM15783Z2);
                }
            } else {
                mo15750P(this.f36902r0, zM15783Z);
                while (i10 < i7) {
                    this.f36942m0.get(i10).mo15750P(this.f36902r0, zM15783Z);
                }
            }
            if (z3) {
                z6 = false;
            } else {
                z6 = false;
            }
            iMax = Math.max(this.f36852Y, m15766s());
            if (iMax > m15766s()) {
                m15748N(iMax);
                r6 = 1;
                this.f36843P[0] = 1;
                z6 = true;
                z7 = true;
            } else {
                r6 = 1;
                z7 = z4;
            }
            iMax2 = Math.max(this.f36853Z, m15760m());
            if (iMax2 > m15760m()) {
                m15743I(iMax2);
                this.f36843P[r6] = r6;
                z6 = true;
                z8 = true;
            } else {
                z8 = z7;
            }
            if (z8) {
                if (this.f36843P[0] == 2) {
                    boolean z110 = z8;
                    z9 = z6;
                    z10 = z110;
                } else {
                    boolean z111 = z8;
                    z9 = z6;
                    z10 = z111;
                }
                if (this.f36843P[r6] != 2) {
                }
                i9 = i45;
            } else {
                boolean z112 = z8;
                z9 = z6;
                z10 = z112;
            }
            z5 = z9;
            z4 = z10;
            i9 = i45;
        }
        this.f36942m0 = arrayList14;
        if (z4) {
            int[] iArr4 = this.f36843P;
            iArr4[0] = i2;
            iArr4[1] = i5;
        }
        mo15739E(this.f36902r0.f36751o);
    }

    /* JADX INFO: renamed from: R */
    public void m15776R(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            int i2 = this.f36905u0 + 1;
            ChainHead[] chainHeadArr = this.f36908x0;
            if (i2 >= chainHeadArr.length) {
                this.f36908x0 = (ChainHead[]) Arrays.copyOf(chainHeadArr, chainHeadArr.length * 2);
            }
            this.f36908x0[this.f36905u0] = new ChainHead(constraintWidget, 0, this.f36901q0);
            this.f36905u0++;
            return;
        }
        if (i == 1) {
            int i3 = this.f36906v0 + 1;
            ChainHead[] chainHeadArr2 = this.f36907w0;
            if (i3 >= chainHeadArr2.length) {
                this.f36907w0 = (ChainHead[]) Arrays.copyOf(chainHeadArr2, chainHeadArr2.length * 2);
            }
            this.f36907w0[this.f36906v0] = new ChainHead(constraintWidget, 1, this.f36901q0);
            this.f36906v0++;
        }
    }

    /* JADX INFO: renamed from: S */
    public boolean m15777S(LinearSystem linearSystem) {
        boolean zM15783Z = m15783Z(64);
        mo15722e(linearSystem, zM15783Z);
        int size = this.f36942m0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = this.f36942m0.get(i);
            boolean[] zArr = constraintWidget.f36842O;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof Barrier2) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                ConstraintWidget constraintWidget2 = this.f36942m0.get(i2);
                if (constraintWidget2 instanceof Barrier2) {
                    Barrier2 barrier2 = (Barrier2) constraintWidget2;
                    for (int i3 = 0; i3 < barrier2.f36939n0; i3++) {
                        ConstraintWidget constraintWidget3 = barrier2.f36938m0[i3];
                        int i4 = barrier2.f36785o0;
                        if (i4 == 0 || i4 == 1) {
                            constraintWidget3.f36842O[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            constraintWidget3.f36842O[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            ConstraintWidget constraintWidget4 = this.f36942m0.get(i5);
            if (constraintWidget4.m15753d()) {
                constraintWidget4.mo15722e(linearSystem, zM15783Z);
            }
        }
        if (LinearSystem.f36737a) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = this.f36942m0.get(i6);
                if (!constraintWidget5.m15753d()) {
                    hashSet.add(constraintWidget5);
                }
            }
            m15752c(this, linearSystem, hashSet, m15761n() == 2 ? 0 : 1, false);
            for (ConstraintWidget constraintWidget6 : hashSet) {
                Optimizer.m15789a(this, linearSystem, constraintWidget6);
                constraintWidget6.mo15722e(linearSystem, zM15783Z);
            }
        } else {
            for (int i7 = 0; i7 < size; i7++) {
                ConstraintWidget constraintWidget7 = this.f36942m0.get(i7);
                if (constraintWidget7 instanceof ConstraintWidgetContainer) {
                    int[] iArr = constraintWidget7.f36843P;
                    int i8 = iArr[0];
                    int i9 = iArr[1];
                    if (i8 == 2) {
                        iArr[0] = 1;
                    }
                    if (i9 == 2) {
                        iArr[1] = 1;
                    }
                    constraintWidget7.mo15722e(linearSystem, zM15783Z);
                    if (i8 == 2) {
                        constraintWidget7.m15744J(i8);
                    }
                    if (i9 == 2) {
                        constraintWidget7.m15747M(i9);
                    }
                } else {
                    Optimizer.m15789a(this, linearSystem, constraintWidget7);
                    if (!constraintWidget7.m15753d()) {
                        constraintWidget7.mo15722e(linearSystem, zM15783Z);
                    }
                }
            }
        }
        if (this.f36905u0 > 0) {
            Chain.m15724a(this, linearSystem, null, 0);
        }
        if (this.f36906v0 > 0) {
            Chain.m15724a(this, linearSystem, null, 1);
        }
        return true;
    }

    /* JADX INFO: renamed from: T */
    public void m15778T(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f36896E0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.m15727c() > this.f36896E0.get().m15727c()) {
            this.f36896E0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX INFO: renamed from: U */
    public void m15779U(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f36895D0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.m15727c() > this.f36895D0.get().m15727c()) {
            this.f36895D0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m15780V(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.f36893B0;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.m15727c() > this.f36893B0.get().m15727c()) {
            this.f36893B0 = new WeakReference<>(constraintAnchor);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX INFO: renamed from: W */
    public boolean m15781W(boolean z, int i) {
        boolean z2;
        DependencyGraph dependencyGraph = this.f36899o0;
        boolean z3 = true;
        boolean z4 = z & true;
        int iM15759l = dependencyGraph.f36958a.m15759l(0);
        int iM15759l2 = dependencyGraph.f36958a.m15759l(1);
        int iM15767t = dependencyGraph.f36958a.m15767t();
        int iM15768u = dependencyGraph.f36958a.m15768u();
        if (z4 && (iM15759l == 2 || iM15759l2 == 2)) {
            for (WidgetRun widgetRun : dependencyGraph.f36962e) {
                if (widgetRun.f37006f == i && !widgetRun.mo15799k()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && iM15759l == 2) {
                    ConstraintWidgetContainer constraintWidgetContainer = dependencyGraph.f36958a;
                    constraintWidgetContainer.f36843P[0] = 1;
                    constraintWidgetContainer.m15748N(dependencyGraph.m15805d(constraintWidgetContainer, 0));
                    ConstraintWidgetContainer constraintWidgetContainer2 = dependencyGraph.f36958a;
                    constraintWidgetContainer2.f36860d.f37005e.mo15810c(constraintWidgetContainer2.m15766s());
                }
            } else if (z4 && iM15759l2 == 2) {
                ConstraintWidgetContainer constraintWidgetContainer3 = dependencyGraph.f36958a;
                constraintWidgetContainer3.f36843P[1] = 1;
                constraintWidgetContainer3.m15743I(dependencyGraph.m15805d(constraintWidgetContainer3, 1));
                ConstraintWidgetContainer constraintWidgetContainer4 = dependencyGraph.f36958a;
                constraintWidgetContainer4.f36862e.f37005e.mo15810c(constraintWidgetContainer4.m15760m());
            }
        }
        if (i == 0) {
            ConstraintWidgetContainer constraintWidgetContainer5 = dependencyGraph.f36958a;
            int[] iArr = constraintWidgetContainer5.f36843P;
            if (iArr[0] == 1 || iArr[0] == 4) {
                int iM15766s = constraintWidgetContainer5.m15766s() + iM15767t;
                dependencyGraph.f36958a.f36860d.f37009i.mo15810c(iM15766s);
                dependencyGraph.f36958a.f36860d.f37005e.mo15810c(iM15766s - iM15767t);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            ConstraintWidgetContainer constraintWidgetContainer6 = dependencyGraph.f36958a;
            int[] iArr2 = constraintWidgetContainer6.f36843P;
            if (iArr2[1] == 1 || iArr2[1] == 4) {
                int iM15760m = constraintWidgetContainer6.m15760m() + iM15768u;
                dependencyGraph.f36958a.f36862e.f37009i.mo15810c(iM15760m);
                dependencyGraph.f36958a.f36862e.f37005e.mo15810c(iM15760m - iM15768u);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        dependencyGraph.m15808g();
        for (WidgetRun widgetRun2 : dependencyGraph.f36962e) {
            if (widgetRun2.f37006f == i && (widgetRun2.f37002b != dependencyGraph.f36958a || widgetRun2.f37007g)) {
                widgetRun2.mo15796e();
            }
        }
        for (WidgetRun widgetRun3 : dependencyGraph.f36962e) {
            if (widgetRun3.f37006f == i && (z2 || widgetRun3.f37002b != dependencyGraph.f36958a)) {
                if (!widgetRun3.f37008h.f36975j || !widgetRun3.f37009i.f36975j || (!(widgetRun3 instanceof ChainRun) && !widgetRun3.f37005e.f36975j)) {
                    z3 = false;
                    break;
                }
            }
        }
        dependencyGraph.f36958a.m15744J(iM15759l);
        dependencyGraph.f36958a.m15747M(iM15759l2);
        return z3;
    }

    /* JADX INFO: renamed from: X */
    public void m15782X() {
        this.f36899o0.f36959b = true;
    }

    /* JADX INFO: renamed from: Z */
    public boolean m15783Z(int i) {
        return (this.f36909y0 & i) == i;
    }

    /* JADX INFO: renamed from: a0 */
    public void m15784a0(int i) {
        this.f36909y0 = i;
        LinearSystem.f36737a = m15783Z(512);
    }

    public ConstraintWidgetContainer(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.f36898n0 = new BasicMeasure(this);
        this.f36899o0 = new DependencyGraph(this);
        this.f36900p0 = null;
        this.f36901q0 = false;
        this.f36902r0 = new LinearSystem();
        this.f36905u0 = 0;
        this.f36906v0 = 0;
        this.f36907w0 = new ChainHead[4];
        this.f36908x0 = new ChainHead[4];
        this.f36909y0 = 257;
        this.f36910z0 = false;
        this.f36892A0 = false;
        this.f36893B0 = null;
        this.f36894C0 = null;
        this.f36895D0 = null;
        this.f36896E0 = null;
        this.f36897F0 = new BasicMeasure.a();
    }

    public ConstraintWidgetContainer(int i, int i2) {
        super(i, i2);
        this.f36898n0 = new BasicMeasure(this);
        this.f36899o0 = new DependencyGraph(this);
        this.f36900p0 = null;
        this.f36901q0 = false;
        this.f36902r0 = new LinearSystem();
        this.f36905u0 = 0;
        this.f36906v0 = 0;
        this.f36907w0 = new ChainHead[4];
        this.f36908x0 = new ChainHead[4];
        this.f36909y0 = 257;
        this.f36910z0 = false;
        this.f36892A0 = false;
        this.f36893B0 = null;
        this.f36894C0 = null;
        this.f36895D0 = null;
        this.f36896E0 = null;
        this.f36897F0 = new BasicMeasure.a();
    }

    public ConstraintWidgetContainer(String str, int i, int i2) {
        super(i, i2);
        this.f36898n0 = new BasicMeasure(this);
        this.f36899o0 = new DependencyGraph(this);
        this.f36900p0 = null;
        this.f36901q0 = false;
        this.f36902r0 = new LinearSystem();
        this.f36905u0 = 0;
        this.f36906v0 = 0;
        this.f36907w0 = new ChainHead[4];
        this.f36908x0 = new ChainHead[4];
        this.f36909y0 = 257;
        this.f36910z0 = false;
        this.f36892A0 = false;
        this.f36893B0 = null;
        this.f36894C0 = null;
        this.f36895D0 = null;
        this.f36896E0 = null;
        this.f36897F0 = new BasicMeasure.a();
        this.f36863e0 = str;
    }
}
