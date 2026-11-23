package p636z0.p697i.p700b.p701h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p697i.p700b.ArrayRow;
import p636z0.p697i.p700b.Cache3;
import p636z0.p697i.p700b.LinearSystem;
import p636z0.p697i.p700b.SolverVariable;
import p636z0.p697i.p700b.p701h.p702n.ChainRun;
import p636z0.p697i.p700b.p701h.p702n.DependencyNode;
import p636z0.p697i.p700b.p701h.p702n.HorizontalWidgetRun;
import p636z0.p697i.p700b.p701h.p702n.VerticalWidgetRun;

/* JADX INFO: renamed from: z0.i.b.h.e, reason: use source file name */
/* JADX INFO: compiled from: ConstraintWidget.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintWidget {

    /* JADX INFO: renamed from: A */
    public boolean f36828A;

    /* JADX INFO: renamed from: B */
    public boolean f36829B;

    /* JADX INFO: renamed from: C */
    public int f36830C;

    /* JADX INFO: renamed from: D */
    public int f36831D;

    /* JADX INFO: renamed from: E */
    public ConstraintAnchor f36832E;

    /* JADX INFO: renamed from: F */
    public ConstraintAnchor f36833F;

    /* JADX INFO: renamed from: G */
    public ConstraintAnchor f36834G;

    /* JADX INFO: renamed from: H */
    public ConstraintAnchor f36835H;

    /* JADX INFO: renamed from: I */
    public ConstraintAnchor f36836I;

    /* JADX INFO: renamed from: J */
    public ConstraintAnchor f36837J;

    /* JADX INFO: renamed from: K */
    public ConstraintAnchor f36838K;

    /* JADX INFO: renamed from: L */
    public ConstraintAnchor f36839L;

    /* JADX INFO: renamed from: M */
    public ConstraintAnchor[] f36840M;

    /* JADX INFO: renamed from: N */
    public ArrayList<ConstraintAnchor> f36841N;

    /* JADX INFO: renamed from: O */
    public boolean[] f36842O;

    /* JADX INFO: renamed from: P */
    public int[] f36843P;

    /* JADX INFO: renamed from: Q */
    public ConstraintWidget f36844Q;

    /* JADX INFO: renamed from: R */
    public int f36845R;

    /* JADX INFO: renamed from: S */
    public int f36846S;

    /* JADX INFO: renamed from: T */
    public float f36847T;

    /* JADX INFO: renamed from: U */
    public int f36848U;

    /* JADX INFO: renamed from: V */
    public int f36849V;

    /* JADX INFO: renamed from: W */
    public int f36850W;

    /* JADX INFO: renamed from: X */
    public int f36851X;

    /* JADX INFO: renamed from: Y */
    public int f36852Y;

    /* JADX INFO: renamed from: Z */
    public int f36853Z;

    /* JADX INFO: renamed from: a */
    public boolean f36854a;

    /* JADX INFO: renamed from: a0 */
    public float f36855a0;

    /* JADX INFO: renamed from: b */
    public ChainRun f36856b;

    /* JADX INFO: renamed from: b0 */
    public float f36857b0;

    /* JADX INFO: renamed from: c */
    public ChainRun f36858c;

    /* JADX INFO: renamed from: c0 */
    public Object f36859c0;

    /* JADX INFO: renamed from: d */
    public HorizontalWidgetRun f36860d;

    /* JADX INFO: renamed from: d0 */
    public int f36861d0;

    /* JADX INFO: renamed from: e */
    public VerticalWidgetRun f36862e;

    /* JADX INFO: renamed from: e0 */
    public String f36863e0;

    /* JADX INFO: renamed from: f */
    public boolean[] f36864f;

    /* JADX INFO: renamed from: f0 */
    public int f36865f0;

    /* JADX INFO: renamed from: g */
    public boolean f36866g;

    /* JADX INFO: renamed from: g0 */
    public int f36867g0;

    /* JADX INFO: renamed from: h */
    public boolean f36868h;

    /* JADX INFO: renamed from: h0 */
    public float[] f36869h0;

    /* JADX INFO: renamed from: i */
    public boolean f36870i;

    /* JADX INFO: renamed from: i0 */
    public ConstraintWidget[] f36871i0;

    /* JADX INFO: renamed from: j */
    public boolean f36872j;

    /* JADX INFO: renamed from: j0 */
    public ConstraintWidget[] f36873j0;

    /* JADX INFO: renamed from: k */
    public int f36874k;

    /* JADX INFO: renamed from: k0 */
    public int f36875k0;

    /* JADX INFO: renamed from: l */
    public int f36876l;

    /* JADX INFO: renamed from: l0 */
    public int f36877l0;

    /* JADX INFO: renamed from: m */
    public int f36878m;

    /* JADX INFO: renamed from: n */
    public int f36879n;

    /* JADX INFO: renamed from: o */
    public int[] f36880o;

    /* JADX INFO: renamed from: p */
    public int f36881p;

    /* JADX INFO: renamed from: q */
    public int f36882q;

    /* JADX INFO: renamed from: r */
    public float f36883r;

    /* JADX INFO: renamed from: s */
    public int f36884s;

    /* JADX INFO: renamed from: t */
    public int f36885t;

    /* JADX INFO: renamed from: u */
    public float f36886u;

    /* JADX INFO: renamed from: v */
    public int f36887v;

    /* JADX INFO: renamed from: w */
    public float f36888w;

    /* JADX INFO: renamed from: x */
    public int[] f36889x;

    /* JADX INFO: renamed from: y */
    public float f36890y;

    /* JADX INFO: renamed from: z */
    public boolean f36891z;

    public ConstraintWidget() {
        this.f36854a = false;
        this.f36860d = null;
        this.f36862e = null;
        this.f36864f = new boolean[]{true, true};
        this.f36866g = true;
        this.f36868h = true;
        this.f36870i = false;
        this.f36872j = false;
        this.f36874k = -1;
        this.f36876l = -1;
        this.f36878m = 0;
        this.f36879n = 0;
        this.f36880o = new int[2];
        this.f36881p = 0;
        this.f36882q = 0;
        this.f36883r = 1.0f;
        this.f36884s = 0;
        this.f36885t = 0;
        this.f36886u = 1.0f;
        this.f36887v = -1;
        this.f36888w = 1.0f;
        this.f36889x = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f36890y = 0.0f;
        this.f36891z = false;
        this.f36829B = false;
        this.f36830C = 0;
        this.f36831D = 0;
        this.f36832E = new ConstraintAnchor(this, ConstraintAnchor.a.LEFT);
        this.f36833F = new ConstraintAnchor(this, ConstraintAnchor.a.TOP);
        this.f36834G = new ConstraintAnchor(this, ConstraintAnchor.a.RIGHT);
        this.f36835H = new ConstraintAnchor(this, ConstraintAnchor.a.BOTTOM);
        this.f36836I = new ConstraintAnchor(this, ConstraintAnchor.a.BASELINE);
        this.f36837J = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER_X);
        this.f36838K = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER);
        this.f36839L = constraintAnchor;
        this.f36840M = new ConstraintAnchor[]{this.f36832E, this.f36834G, this.f36833F, this.f36835H, this.f36836I, constraintAnchor};
        this.f36841N = new ArrayList<>();
        this.f36842O = new boolean[2];
        this.f36843P = new int[]{1, 1};
        this.f36844Q = null;
        this.f36845R = 0;
        this.f36846S = 0;
        this.f36847T = 0.0f;
        this.f36848U = -1;
        this.f36849V = 0;
        this.f36850W = 0;
        this.f36851X = 0;
        this.f36855a0 = 0.5f;
        this.f36857b0 = 0.5f;
        this.f36861d0 = 0;
        this.f36863e0 = null;
        this.f36865f0 = 0;
        this.f36867g0 = 0;
        this.f36869h0 = new float[]{-1.0f, -1.0f};
        this.f36871i0 = new ConstraintWidget[]{null, null};
        this.f36873j0 = new ConstraintWidget[]{null, null};
        this.f36875k0 = -1;
        this.f36877l0 = -1;
        m15751b();
    }

    /* JADX INFO: renamed from: A */
    public boolean mo15718A() {
        return this.f36870i || (this.f36832E.f36811c && this.f36834G.f36811c);
    }

    /* JADX INFO: renamed from: B */
    public boolean mo15719B() {
        return this.f36872j || (this.f36833F.f36811c && this.f36835H.f36811c);
    }

    /* JADX INFO: renamed from: C */
    public void mo15737C() {
        this.f36832E.m15734j();
        this.f36833F.m15734j();
        this.f36834G.m15734j();
        this.f36835H.m15734j();
        this.f36836I.m15734j();
        this.f36837J.m15734j();
        this.f36838K.m15734j();
        this.f36839L.m15734j();
        this.f36844Q = null;
        this.f36890y = 0.0f;
        this.f36845R = 0;
        this.f36846S = 0;
        this.f36847T = 0.0f;
        this.f36848U = -1;
        this.f36849V = 0;
        this.f36850W = 0;
        this.f36851X = 0;
        this.f36852Y = 0;
        this.f36853Z = 0;
        this.f36855a0 = 0.5f;
        this.f36857b0 = 0.5f;
        int[] iArr = this.f36843P;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f36859c0 = null;
        this.f36861d0 = 0;
        this.f36865f0 = 0;
        this.f36867g0 = 0;
        float[] fArr = this.f36869h0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f36874k = -1;
        this.f36876l = -1;
        int[] iArr2 = this.f36889x;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f36878m = 0;
        this.f36879n = 0;
        this.f36883r = 1.0f;
        this.f36886u = 1.0f;
        this.f36882q = Integer.MAX_VALUE;
        this.f36885t = Integer.MAX_VALUE;
        this.f36881p = 0;
        this.f36884s = 0;
        this.f36887v = -1;
        this.f36888w = 1.0f;
        boolean[] zArr = this.f36864f;
        zArr[0] = true;
        zArr[1] = true;
        this.f36829B = false;
        boolean[] zArr2 = this.f36842O;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f36866g = true;
    }

    /* JADX INFO: renamed from: D */
    public void m15738D() {
        this.f36870i = false;
        this.f36872j = false;
        int size = this.f36841N.size();
        for (int i = 0; i < size; i++) {
            ConstraintAnchor constraintAnchor = this.f36841N.get(i);
            constraintAnchor.f36811c = false;
            constraintAnchor.f36810b = 0;
        }
    }

    /* JADX INFO: renamed from: E */
    public void mo15739E(Cache3 cache3) {
        this.f36832E.m15735k();
        this.f36833F.m15735k();
        this.f36834G.m15735k();
        this.f36835H.m15735k();
        this.f36836I.m15735k();
        this.f36839L.m15735k();
        this.f36837J.m15735k();
        this.f36838K.m15735k();
    }

    /* JADX INFO: renamed from: F */
    public void m15740F(int i) {
        this.f36851X = i;
        this.f36891z = i > 0;
    }

    /* JADX INFO: renamed from: G */
    public void m15741G(int i, int i2) {
        ConstraintAnchor constraintAnchor = this.f36832E;
        constraintAnchor.f36810b = i;
        constraintAnchor.f36811c = true;
        ConstraintAnchor constraintAnchor2 = this.f36834G;
        constraintAnchor2.f36810b = i2;
        constraintAnchor2.f36811c = true;
        this.f36849V = i;
        this.f36845R = i2 - i;
        this.f36870i = true;
    }

    /* JADX INFO: renamed from: H */
    public void m15742H(int i, int i2) {
        ConstraintAnchor constraintAnchor = this.f36833F;
        constraintAnchor.f36810b = i;
        constraintAnchor.f36811c = true;
        ConstraintAnchor constraintAnchor2 = this.f36835H;
        constraintAnchor2.f36810b = i2;
        constraintAnchor2.f36811c = true;
        this.f36850W = i;
        this.f36846S = i2 - i;
        if (this.f36891z) {
            this.f36836I.m15736l(i + this.f36851X);
        }
        this.f36872j = true;
    }

    /* JADX INFO: renamed from: I */
    public void m15743I(int i) {
        this.f36846S = i;
        int i2 = this.f36853Z;
        if (i < i2) {
            this.f36846S = i2;
        }
    }

    /* JADX INFO: renamed from: J */
    public void m15744J(int i) {
        this.f36843P[0] = i;
    }

    /* JADX INFO: renamed from: K */
    public void m15745K(int i) {
        if (i < 0) {
            this.f36853Z = 0;
        } else {
            this.f36853Z = i;
        }
    }

    /* JADX INFO: renamed from: L */
    public void m15746L(int i) {
        if (i < 0) {
            this.f36852Y = 0;
        } else {
            this.f36852Y = i;
        }
    }

    /* JADX INFO: renamed from: M */
    public void m15747M(int i) {
        this.f36843P[1] = i;
    }

    /* JADX INFO: renamed from: N */
    public void m15748N(int i) {
        this.f36845R = i;
        int i2 = this.f36852Y;
        if (i < i2) {
            this.f36845R = i2;
        }
    }

    /* JADX INFO: renamed from: O */
    public void mo15749O(boolean z, boolean z2) {
        int i;
        int i2;
        HorizontalWidgetRun horizontalWidgetRun = this.f36860d;
        boolean z3 = z & horizontalWidgetRun.f37007g;
        VerticalWidgetRun verticalWidgetRun = this.f36862e;
        boolean z4 = z2 & verticalWidgetRun.f37007g;
        int i3 = horizontalWidgetRun.f37008h.f36972g;
        int i4 = verticalWidgetRun.f37008h.f36972g;
        int i5 = horizontalWidgetRun.f37009i.f36972g;
        int i6 = verticalWidgetRun.f37009i.f36972g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f36849V = i3;
        }
        if (z4) {
            this.f36850W = i4;
        }
        if (this.f36861d0 == 8) {
            this.f36845R = 0;
            this.f36846S = 0;
            return;
        }
        if (z3) {
            if (this.f36843P[0] == 1 && i8 < (i2 = this.f36845R)) {
                i8 = i2;
            }
            this.f36845R = i8;
            int i10 = this.f36852Y;
            if (i8 < i10) {
                this.f36845R = i10;
            }
        }
        if (z4) {
            if (this.f36843P[1] == 1 && i9 < (i = this.f36846S)) {
                i9 = i;
            }
            this.f36846S = i9;
            int i11 = this.f36853Z;
            if (i9 < i11) {
                this.f36846S = i11;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public void mo15750P(LinearSystem linearSystem, boolean z) {
        int i;
        int i2;
        VerticalWidgetRun verticalWidgetRun;
        HorizontalWidgetRun horizontalWidgetRun;
        int iM15702o = linearSystem.m15702o(this.f36832E);
        int iM15702o2 = linearSystem.m15702o(this.f36833F);
        int iM15702o3 = linearSystem.m15702o(this.f36834G);
        int iM15702o4 = linearSystem.m15702o(this.f36835H);
        if (z && (horizontalWidgetRun = this.f36860d) != null) {
            DependencyNode dependencyNode = horizontalWidgetRun.f37008h;
            if (dependencyNode.f36975j) {
                DependencyNode dependencyNode2 = horizontalWidgetRun.f37009i;
                if (dependencyNode2.f36975j) {
                    iM15702o = dependencyNode.f36972g;
                    iM15702o3 = dependencyNode2.f36972g;
                }
            }
        }
        if (z && (verticalWidgetRun = this.f36862e) != null) {
            DependencyNode dependencyNode3 = verticalWidgetRun.f37008h;
            if (dependencyNode3.f36975j) {
                DependencyNode dependencyNode4 = verticalWidgetRun.f37009i;
                if (dependencyNode4.f36975j) {
                    iM15702o2 = dependencyNode3.f36972g;
                    iM15702o4 = dependencyNode4.f36972g;
                }
            }
        }
        int i3 = iM15702o4 - iM15702o2;
        if (iM15702o3 - iM15702o < 0 || i3 < 0 || iM15702o == Integer.MIN_VALUE || iM15702o == Integer.MAX_VALUE || iM15702o2 == Integer.MIN_VALUE || iM15702o2 == Integer.MAX_VALUE || iM15702o3 == Integer.MIN_VALUE || iM15702o3 == Integer.MAX_VALUE || iM15702o4 == Integer.MIN_VALUE || iM15702o4 == Integer.MAX_VALUE) {
            iM15702o4 = 0;
            iM15702o = 0;
            iM15702o2 = 0;
            iM15702o3 = 0;
        }
        int i4 = iM15702o3 - iM15702o;
        int i5 = iM15702o4 - iM15702o2;
        this.f36849V = iM15702o;
        this.f36850W = iM15702o2;
        if (this.f36861d0 == 8) {
            this.f36845R = 0;
            this.f36846S = 0;
            return;
        }
        int[] iArr = this.f36843P;
        if (iArr[0] == 1 && i4 < (i2 = this.f36845R)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f36846S)) {
            i5 = i;
        }
        this.f36845R = i4;
        this.f36846S = i5;
        int i6 = this.f36853Z;
        if (i5 < i6) {
            this.f36846S = i6;
        }
        int i7 = this.f36852Y;
        if (i4 < i7) {
            this.f36845R = i7;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m15751b() {
        this.f36841N.add(this.f36832E);
        this.f36841N.add(this.f36833F);
        this.f36841N.add(this.f36834G);
        this.f36841N.add(this.f36835H);
        this.f36841N.add(this.f36837J);
        this.f36841N.add(this.f36838K);
        this.f36841N.add(this.f36839L);
        this.f36841N.add(this.f36836I);
    }

    /* JADX INFO: renamed from: c */
    public void m15752c(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, HashSet<ConstraintWidget> hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            Optimizer.m15789a(constraintWidgetContainer, linearSystem, this);
            hashSet.remove(this);
            mo15722e(linearSystem, constraintWidgetContainer.m15783Z(64));
        }
        if (i == 0) {
            HashSet<ConstraintAnchor> hashSet2 = this.f36832E.f36809a;
            if (hashSet2 != null) {
                Iterator<ConstraintAnchor> it = hashSet2.iterator();
                while (it.hasNext()) {
                    it.next().f36812d.m15752c(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
            }
            HashSet<ConstraintAnchor> hashSet3 = this.f36834G.f36809a;
            if (hashSet3 != null) {
                Iterator<ConstraintAnchor> it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    it2.next().f36812d.m15752c(constraintWidgetContainer, linearSystem, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet<ConstraintAnchor> hashSet4 = this.f36833F.f36809a;
        if (hashSet4 != null) {
            Iterator<ConstraintAnchor> it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                it3.next().f36812d.m15752c(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet5 = this.f36835H.f36809a;
        if (hashSet5 != null) {
            Iterator<ConstraintAnchor> it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                it4.next().f36812d.m15752c(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
        HashSet<ConstraintAnchor> hashSet6 = this.f36836I.f36809a;
        if (hashSet6 != null) {
            Iterator<ConstraintAnchor> it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                it5.next().f36812d.m15752c(constraintWidgetContainer, linearSystem, hashSet, i, true);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m15753d() {
        return (this instanceof VirtualLayout) || (this instanceof Guideline2);
    }

    /* JADX WARN: Code duplicated, block: B:233:0x0383  */
    /* JADX WARN: Code duplicated, block: B:237:0x038d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0392  */
    /* JADX WARN: Code duplicated, block: B:244:0x039c  */
    /* JADX WARN: Code duplicated, block: B:247:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:250:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:252:0x03af  */
    /* JADX WARN: Code duplicated, block: B:253:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:256:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:289:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:291:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:293:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:295:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:308:0x051b  */
    /* JADX WARN: Code duplicated, block: B:312:0x052f  */
    /* JADX WARN: Code duplicated, block: B:313:0x0531  */
    /* JADX WARN: Code duplicated, block: B:315:0x0534  */
    /* JADX WARN: Code duplicated, block: B:353:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:355:0x0604  */
    /* JADX WARN: Code duplicated, block: B:357:0x060d  */
    /* JADX WARN: Code duplicated, block: B:358:0x061d  */
    /* JADX WARN: Code duplicated, block: B:359:0x062f  */
    /* JADX WARN: Code duplicated, block: B:362:0x0639  */
    /* JADX INFO: renamed from: e */
    public void mo15722e(LinearSystem linearSystem, boolean z) {
        boolean z2;
        boolean z3;
        ConstraintWidget constraintWidget;
        ConstraintWidget constraintWidget2;
        boolean z4;
        boolean z5;
        SolverVariable solverVariable;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z6;
        int i5;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int i8;
        char c2;
        ConstraintWidget constraintWidget3;
        boolean z9;
        boolean z10;
        ConstraintWidget constraintWidget4;
        boolean z11;
        VerticalWidgetRun verticalWidgetRun;
        DependencyNode dependencyNode;
        HorizontalWidgetRun horizontalWidgetRun;
        int i9;
        boolean zM15771x;
        boolean zM15772y;
        HorizontalWidgetRun horizontalWidgetRun2;
        VerticalWidgetRun verticalWidgetRun2;
        boolean z12;
        SolverVariable solverVariableM15699l = linearSystem.m15699l(this.f36832E);
        SolverVariable solverVariableM15699l2 = linearSystem.m15699l(this.f36834G);
        SolverVariable solverVariableM15699l3 = linearSystem.m15699l(this.f36833F);
        SolverVariable solverVariableM15699l4 = linearSystem.m15699l(this.f36835H);
        SolverVariable solverVariableM15699l5 = linearSystem.m15699l(this.f36836I);
        ConstraintWidget constraintWidget5 = this.f36844Q;
        if (constraintWidget5 != null) {
            int[] iArr = constraintWidget5.f36843P;
            boolean z13 = iArr[0] == 2;
            z2 = iArr[1] == 2;
            z3 = z13;
        } else {
            z2 = false;
            z3 = false;
        }
        if (this.f36861d0 == 8) {
            int size = this.f36841N.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    z12 = false;
                    break;
                } else {
                    if (this.f36841N.get(i10).m15731g()) {
                        z12 = true;
                        break;
                    }
                    i10++;
                }
            }
            if (!z12) {
                boolean[] zArr = this.f36842O;
                if (!zArr[0] && !zArr[1]) {
                    return;
                }
            }
        }
        boolean z14 = this.f36870i;
        if (z14 || this.f36872j) {
            if (z14) {
                linearSystem.m15692e(solverVariableM15699l, this.f36849V);
                linearSystem.m15692e(solverVariableM15699l2, this.f36849V + this.f36845R);
                if (z3 && (constraintWidget2 = this.f36844Q) != null) {
                    if (this.f36868h) {
                        ConstraintWidgetContainer constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget2;
                        constraintWidgetContainer.m15780V(this.f36832E);
                        constraintWidgetContainer.m15778T(this.f36834G);
                    } else {
                        linearSystem.m15693f(linearSystem.m15699l(constraintWidget2.f36834G), solverVariableM15699l2, 0, 5);
                    }
                }
            }
            if (this.f36872j) {
                linearSystem.m15692e(solverVariableM15699l3, this.f36850W);
                linearSystem.m15692e(solverVariableM15699l4, this.f36850W + this.f36846S);
                if (this.f36836I.m15731g()) {
                    linearSystem.m15692e(solverVariableM15699l5, this.f36850W + this.f36851X);
                }
                if (z2 && (constraintWidget = this.f36844Q) != null) {
                    if (this.f36868h) {
                        ConstraintWidgetContainer constraintWidgetContainer2 = (ConstraintWidgetContainer) constraintWidget;
                        constraintWidgetContainer2.m15780V(this.f36833F);
                        constraintWidgetContainer2.m15779U(this.f36835H);
                    } else {
                        linearSystem.m15693f(linearSystem.m15699l(constraintWidget.f36835H), solverVariableM15699l4, 0, 5);
                    }
                }
            }
            if (this.f36870i && this.f36872j) {
                this.f36870i = false;
                this.f36872j = false;
                return;
            }
        }
        if (z && (horizontalWidgetRun2 = this.f36860d) != null && (verticalWidgetRun2 = this.f36862e) != null) {
            DependencyNode dependencyNode2 = horizontalWidgetRun2.f37008h;
            if (dependencyNode2.f36975j && horizontalWidgetRun2.f37009i.f36975j && verticalWidgetRun2.f37008h.f36975j && verticalWidgetRun2.f37009i.f36975j) {
                linearSystem.m15692e(solverVariableM15699l, dependencyNode2.f36972g);
                linearSystem.m15692e(solverVariableM15699l2, this.f36860d.f37009i.f36972g);
                linearSystem.m15692e(solverVariableM15699l3, this.f36862e.f37008h.f36972g);
                linearSystem.m15692e(solverVariableM15699l4, this.f36862e.f37009i.f36972g);
                linearSystem.m15692e(solverVariableM15699l5, this.f36862e.f36993k.f36972g);
                if (this.f36844Q != null) {
                    if (z3 && this.f36864f[0] && !m15771x()) {
                        linearSystem.m15693f(linearSystem.m15699l(this.f36844Q.f36834G), solverVariableM15699l2, 0, 8);
                    }
                    if (z2 && this.f36864f[1] && !m15772y()) {
                        linearSystem.m15693f(linearSystem.m15699l(this.f36844Q.f36835H), solverVariableM15699l4, 0, 8);
                    }
                }
                this.f36870i = false;
                this.f36872j = false;
                return;
            }
        }
        if (this.f36844Q != null) {
            if (m15770w(0)) {
                ((ConstraintWidgetContainer) this.f36844Q).m15776R(this, 0);
                zM15771x = true;
            } else {
                zM15771x = m15771x();
            }
            if (m15770w(1)) {
                ((ConstraintWidgetContainer) this.f36844Q).m15776R(this, 1);
                zM15772y = true;
            } else {
                zM15772y = m15772y();
            }
            if (!zM15771x && z3 && this.f36861d0 != 8 && this.f36832E.f36814f == null && this.f36834G.f36814f == null) {
                linearSystem.m15693f(linearSystem.m15699l(this.f36844Q.f36834G), solverVariableM15699l2, 0, 1);
            }
            if (!zM15772y && z2 && this.f36861d0 != 8 && this.f36833F.f36814f == null && this.f36835H.f36814f == null && this.f36836I == null) {
                linearSystem.m15693f(linearSystem.m15699l(this.f36844Q.f36835H), solverVariableM15699l4, 0, 1);
            }
            z5 = zM15771x;
            z4 = zM15772y;
        } else {
            z4 = false;
            z5 = false;
        }
        int i11 = this.f36845R;
        int i12 = this.f36852Y;
        if (i11 >= i12) {
            i12 = i11;
        }
        int i13 = this.f36846S;
        int i14 = this.f36853Z;
        if (i13 >= i14) {
            i14 = i13;
        }
        int[] iArr2 = this.f36843P;
        boolean z15 = iArr2[0] != 3;
        boolean z16 = iArr2[1] != 3;
        int i15 = this.f36848U;
        this.f36887v = i15;
        float f = this.f36847T;
        this.f36888w = f;
        int i16 = i12;
        int i17 = this.f36878m;
        int i18 = i14;
        int i19 = this.f36879n;
        SolverVariable solverVariable2 = solverVariableM15699l5;
        if (f > 0.0f) {
            solverVariable = solverVariableM15699l4;
            if (this.f36861d0 != 8) {
                if (iArr2[0] == 3 && i17 == 0) {
                    i17 = 3;
                }
                if (iArr2[1] == 3 && i19 == 0) {
                    i19 = 3;
                }
                if (iArr2[0] == 3 && iArr2[1] == 3 && i17 == 3 && i19 == 3) {
                    if (i15 == -1) {
                        if (z15 && !z16) {
                            this.f36887v = 0;
                        } else if (!z15 && z16) {
                            this.f36887v = 1;
                            if (i15 == -1) {
                                this.f36888w = 1.0f / f;
                            }
                        }
                    }
                    if (this.f36887v == 0 && (!this.f36833F.m15732h() || !this.f36835H.m15732h())) {
                        this.f36887v = 1;
                    } else if (this.f36887v == 1 && (!this.f36832E.m15732h() || !this.f36834G.m15732h())) {
                        this.f36887v = 0;
                    }
                    if (this.f36887v == -1 && (!this.f36833F.m15732h() || !this.f36835H.m15732h() || !this.f36832E.m15732h() || !this.f36834G.m15732h())) {
                        if (this.f36833F.m15732h() && this.f36835H.m15732h()) {
                            this.f36887v = 0;
                        } else if (this.f36832E.m15732h() && this.f36834G.m15732h()) {
                            this.f36888w = 1.0f / this.f36888w;
                            this.f36887v = 1;
                        }
                    }
                    if (this.f36887v == -1) {
                        int i20 = this.f36881p;
                        if (i20 > 0 && this.f36884s == 0) {
                            this.f36887v = 0;
                        } else if (i20 == 0 && this.f36884s > 0) {
                            this.f36888w = 1.0f / this.f36888w;
                            this.f36887v = 1;
                        }
                    }
                } else if (iArr2[0] == 3 && i17 == 3) {
                    this.f36887v = 0;
                    int i21 = (int) (f * i13);
                    if (iArr2[1] != 3) {
                        i3 = i21;
                        i2 = i19;
                        i4 = i18;
                        z6 = false;
                        i = 4;
                    } else {
                        i16 = i21;
                    }
                } else if (iArr2[1] == 3 && i19 == 3) {
                    this.f36887v = 1;
                    if (i15 == -1) {
                        this.f36888w = 1.0f / f;
                    }
                    int i22 = (int) (this.f36888w * i11);
                    if (iArr2[0] != 3) {
                        i4 = i22;
                        i = i17;
                        i3 = i16;
                        z6 = false;
                        i2 = 4;
                    } else {
                        i18 = i22;
                    }
                }
                i = i17;
                i2 = i19;
                i3 = i16;
                i4 = i18;
                z6 = true;
            }
            int[] iArr3 = this.f36880o;
            iArr3[0] = i;
            iArr3[1] = i2;
            if (z6) {
                int i23 = this.f36887v;
                i5 = -1;
                boolean z17 = i23 != 0 || i23 == -1;
                if (z6 || !((i9 = this.f36887v) == 1 || i9 == i5)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (this.f36843P[0] == 2 || !(this instanceof ConstraintWidgetContainer)) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (z8) {
                    i6 = 0;
                } else {
                    i6 = i3;
                }
                boolean z18 = !this.f36839L.m15732h();
                boolean[] zArr2 = this.f36842O;
                boolean z19 = zArr2[0];
                boolean z20 = zArr2[1];
                if (this.f36874k == 2 && !this.f36870i) {
                    if (z && (horizontalWidgetRun = this.f36860d) != null) {
                        DependencyNode dependencyNode3 = horizontalWidgetRun.f37008h;
                        if (dependencyNode3.f36975j && horizontalWidgetRun.f37009i.f36975j) {
                            if (z) {
                                linearSystem.m15692e(solverVariableM15699l, dependencyNode3.f36972g);
                                linearSystem.m15692e(solverVariableM15699l2, this.f36860d.f37009i.f36972g);
                                if (this.f36844Q != null && z3 && this.f36864f[0] && !m15771x()) {
                                    linearSystem.m15693f(linearSystem.m15699l(this.f36844Q.f36834G), solverVariableM15699l2, 0, 8);
                                }
                            }
                        }
                    }
                    ConstraintWidget constraintWidget6 = this.f36844Q;
                    SolverVariable solverVariableM15699l6 = constraintWidget6 != null ? linearSystem.m15699l(constraintWidget6.f36834G) : null;
                    ConstraintWidget constraintWidget7 = this.f36844Q;
                    SolverVariable solverVariableM15699l7 = constraintWidget7 != null ? linearSystem.m15699l(constraintWidget7.f36832E) : null;
                    boolean z21 = this.f36864f[0];
                    int[] iArr4 = this.f36843P;
                    m15754g(linearSystem, true, z3, z2, z21, solverVariableM15699l7, solverVariableM15699l6, iArr4[0], z8, this.f36832E, this.f36834G, this.f36849V, i6, this.f36852Y, this.f36889x[0], this.f36855a0, z17, iArr4[1] == 3, z5, z4, z19, i, i2, this.f36881p, this.f36882q, this.f36883r, z18);
                }
                if (z) {
                    constraintWidget3 = this;
                    verticalWidgetRun = constraintWidget3.f36862e;
                    if (verticalWidgetRun != null) {
                        dependencyNode = verticalWidgetRun.f37008h;
                        if (!dependencyNode.f36975j && verticalWidgetRun.f37009i.f36975j) {
                            linearSystem = linearSystem;
                            solverVariableM15699l3 = solverVariableM15699l3;
                            linearSystem.m15692e(solverVariableM15699l3, dependencyNode.f36972g);
                            solverVariable = solverVariable;
                            linearSystem.m15692e(solverVariable, constraintWidget3.f36862e.f37009i.f36972g);
                            solverVariable2 = solverVariable2;
                            linearSystem.m15692e(solverVariable2, constraintWidget3.f36862e.f36993k.f36972g);
                            ConstraintWidget constraintWidget8 = constraintWidget3.f36844Q;
                            if (constraintWidget8 == null || z4 || !z2) {
                                i7 = 8;
                                i8 = 0;
                                c2 = 1;
                            } else {
                                c2 = 1;
                                if (constraintWidget3.f36864f[1]) {
                                    i7 = 8;
                                    i8 = 0;
                                    linearSystem.m15693f(linearSystem.m15699l(constraintWidget8.f36835H), solverVariable, 0, 8);
                                } else {
                                    i7 = 8;
                                    i8 = 0;
                                }
                            }
                            z9 = false;
                        }
                        if (constraintWidget3.f36876l == 2) {
                            z10 = false;
                        } else {
                            z10 = z9;
                        }
                        if (!z10 && !constraintWidget3.f36872j) {
                            boolean z22 = constraintWidget3.f36843P[c2] == 2 && (constraintWidget3 instanceof ConstraintWidgetContainer);
                            if (z22) {
                                i4 = 0;
                            }
                            ConstraintWidget constraintWidget9 = constraintWidget3.f36844Q;
                            SolverVariable solverVariableM15699l8 = constraintWidget9 != null ? linearSystem.m15699l(constraintWidget9.f36835H) : null;
                            ConstraintWidget constraintWidget10 = constraintWidget3.f36844Q;
                            SolverVariable solverVariableM15699l9 = constraintWidget10 != null ? linearSystem.m15699l(constraintWidget10.f36833F) : null;
                            int i24 = constraintWidget3.f36851X;
                            if (i24 <= 0 && constraintWidget3.f36861d0 != i7) {
                                z11 = z18;
                            } else if (constraintWidget3.f36836I.f36814f != null) {
                                linearSystem.m15691d(solverVariable2, solverVariableM15699l3, i24, i7);
                                linearSystem.m15691d(solverVariable2, linearSystem.m15699l(constraintWidget3.f36836I.f36814f), i8, i7);
                                if (z2) {
                                    linearSystem.m15693f(solverVariableM15699l8, linearSystem.m15699l(constraintWidget3.f36835H), i8, 5);
                                }
                                z11 = false;
                            } else {
                                if (constraintWidget3.f36861d0 == i7) {
                                    linearSystem.m15691d(solverVariable2, solverVariableM15699l3, i8, i7);
                                } else {
                                    linearSystem.m15691d(solverVariable2, solverVariableM15699l3, i24, i7);
                                }
                                z11 = z18;
                            }
                            boolean z23 = constraintWidget3.f36864f[c2];
                            int[] iArr5 = constraintWidget3.f36843P;
                            m15754g(linearSystem, false, z2, z3, z23, solverVariableM15699l9, solverVariableM15699l8, iArr5[c2], z22, constraintWidget3.f36833F, constraintWidget3.f36835H, constraintWidget3.f36850W, i4, constraintWidget3.f36853Z, constraintWidget3.f36889x[c2], constraintWidget3.f36857b0, z7, iArr5[0] == 3, z4, z5, z20, i2, i, constraintWidget3.f36884s, constraintWidget3.f36885t, constraintWidget3.f36886u, z11);
                        }
                        if (z6) {
                            constraintWidget4 = this;
                            if (constraintWidget4.f36887v == 1) {
                                linearSystem.m15695h(solverVariable, solverVariableM15699l3, solverVariableM15699l2, solverVariableM15699l, constraintWidget4.f36888w, 8);
                            } else {
                                linearSystem.m15695h(solverVariableM15699l2, solverVariableM15699l, solverVariable, solverVariableM15699l3, constraintWidget4.f36888w, 8);
                            }
                        } else {
                            constraintWidget4 = this;
                        }
                        if (constraintWidget4.f36839L.m15732h()) {
                            ConstraintWidget constraintWidget11 = constraintWidget4.f36839L.f36814f.f36812d;
                            float radians = (float) Math.toRadians(constraintWidget4.f36890y + 90.0f);
                            int iM15728d = constraintWidget4.f36839L.m15728d();
                            ConstraintAnchor.a aVar = ConstraintAnchor.a.LEFT;
                            SolverVariable solverVariableM15699l10 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar));
                            ConstraintAnchor.a aVar2 = ConstraintAnchor.a.TOP;
                            SolverVariable solverVariableM15699l11 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar2));
                            ConstraintAnchor.a aVar3 = ConstraintAnchor.a.RIGHT;
                            SolverVariable solverVariableM15699l12 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar3));
                            ConstraintAnchor.a aVar4 = ConstraintAnchor.a.BOTTOM;
                            SolverVariable solverVariableM15699l13 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar4));
                            SolverVariable solverVariableM15699l14 = linearSystem.m15699l(constraintWidget11.mo15757j(aVar));
                            SolverVariable solverVariableM15699l15 = linearSystem.m15699l(constraintWidget11.mo15757j(aVar2));
                            SolverVariable solverVariableM15699l16 = linearSystem.m15699l(constraintWidget11.mo15757j(aVar3));
                            SolverVariable solverVariableM15699l17 = linearSystem.m15699l(constraintWidget11.mo15757j(aVar4));
                            ArrayRow arrayRowM15700m = linearSystem.m15700m();
                            double d = radians;
                            double d2 = iM15728d;
                            arrayRowM15700m.m15682g(solverVariableM15699l11, solverVariableM15699l13, solverVariableM15699l15, solverVariableM15699l17, (float) (Math.sin(d) * d2));
                            linearSystem.m15690c(arrayRowM15700m);
                            ArrayRow arrayRowM15700m2 = linearSystem.m15700m();
                            arrayRowM15700m2.m15682g(solverVariableM15699l10, solverVariableM15699l12, solverVariableM15699l14, solverVariableM15699l16, (float) (Math.cos(d) * d2));
                            linearSystem.m15690c(arrayRowM15700m2);
                        }
                        this.f36870i = false;
                        this.f36872j = false;
                    }
                    i7 = 8;
                    i8 = 0;
                    c2 = 1;
                } else {
                    i7 = 8;
                    i8 = 0;
                    c2 = 1;
                    constraintWidget3 = this;
                }
                z9 = true;
                if (constraintWidget3.f36876l == 2) {
                    z10 = false;
                } else {
                    z10 = z9;
                }
                if (!z10) {
                }
                if (z6) {
                    constraintWidget4 = this;
                    if (constraintWidget4.f36887v == 1) {
                        linearSystem.m15695h(solverVariable, solverVariableM15699l3, solverVariableM15699l2, solverVariableM15699l, constraintWidget4.f36888w, 8);
                    } else {
                        linearSystem.m15695h(solverVariableM15699l2, solverVariableM15699l, solverVariable, solverVariableM15699l3, constraintWidget4.f36888w, 8);
                    }
                } else {
                    constraintWidget4 = this;
                }
                if (constraintWidget4.f36839L.m15732h()) {
                    ConstraintWidget constraintWidget12 = constraintWidget4.f36839L.f36814f.f36812d;
                    float radians2 = (float) Math.toRadians(constraintWidget4.f36890y + 90.0f);
                    int iM15728d2 = constraintWidget4.f36839L.m15728d();
                    ConstraintAnchor.a aVar5 = ConstraintAnchor.a.LEFT;
                    SolverVariable solverVariableM15699l18 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar5));
                    ConstraintAnchor.a aVar6 = ConstraintAnchor.a.TOP;
                    SolverVariable solverVariableM15699l19 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar6));
                    ConstraintAnchor.a aVar7 = ConstraintAnchor.a.RIGHT;
                    SolverVariable solverVariableM15699l110 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar7));
                    ConstraintAnchor.a aVar8 = ConstraintAnchor.a.BOTTOM;
                    SolverVariable solverVariableM15699l111 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar8));
                    SolverVariable solverVariableM15699l112 = linearSystem.m15699l(constraintWidget12.mo15757j(aVar5));
                    SolverVariable solverVariableM15699l113 = linearSystem.m15699l(constraintWidget12.mo15757j(aVar6));
                    SolverVariable solverVariableM15699l114 = linearSystem.m15699l(constraintWidget12.mo15757j(aVar7));
                    SolverVariable solverVariableM15699l115 = linearSystem.m15699l(constraintWidget12.mo15757j(aVar8));
                    ArrayRow arrayRowM15700m3 = linearSystem.m15700m();
                    double d3 = radians2;
                    double d4 = iM15728d2;
                    arrayRowM15700m3.m15682g(solverVariableM15699l19, solverVariableM15699l111, solverVariableM15699l113, solverVariableM15699l115, (float) (Math.sin(d3) * d4));
                    linearSystem.m15690c(arrayRowM15700m3);
                    ArrayRow arrayRowM15700m4 = linearSystem.m15700m();
                    arrayRowM15700m4.m15682g(solverVariableM15699l18, solverVariableM15699l110, solverVariableM15699l112, solverVariableM15699l114, (float) (Math.cos(d3) * d4));
                    linearSystem.m15690c(arrayRowM15700m4);
                }
                this.f36870i = false;
                this.f36872j = false;
            }
            i5 = -1;
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (this.f36843P[0] == 2) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                i6 = 0;
            } else {
                i6 = i3;
            }
            boolean z110 = !this.f36839L.m15732h();
            boolean[] zArr3 = this.f36842O;
            boolean z111 = zArr3[0];
            boolean z24 = zArr3[1];
            if (this.f36874k == 2) {
            }
            if (z) {
                constraintWidget3 = this;
                verticalWidgetRun = constraintWidget3.f36862e;
                if (verticalWidgetRun != null) {
                    dependencyNode = verticalWidgetRun.f37008h;
                    if (!dependencyNode.f36975j) {
                    }
                }
                i7 = 8;
                i8 = 0;
                c2 = 1;
            } else {
                i7 = 8;
                i8 = 0;
                c2 = 1;
                constraintWidget3 = this;
            }
            z9 = true;
            if (constraintWidget3.f36876l == 2) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (!z10) {
            }
            if (z6) {
                constraintWidget4 = this;
                if (constraintWidget4.f36887v == 1) {
                    linearSystem.m15695h(solverVariable, solverVariableM15699l3, solverVariableM15699l2, solverVariableM15699l, constraintWidget4.f36888w, 8);
                } else {
                    linearSystem.m15695h(solverVariableM15699l2, solverVariableM15699l, solverVariable, solverVariableM15699l3, constraintWidget4.f36888w, 8);
                }
            } else {
                constraintWidget4 = this;
            }
            if (constraintWidget4.f36839L.m15732h()) {
                ConstraintWidget constraintWidget13 = constraintWidget4.f36839L.f36814f.f36812d;
                float radians3 = (float) Math.toRadians(constraintWidget4.f36890y + 90.0f);
                int iM15728d3 = constraintWidget4.f36839L.m15728d();
                ConstraintAnchor.a aVar9 = ConstraintAnchor.a.LEFT;
                SolverVariable solverVariableM15699l116 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar9));
                ConstraintAnchor.a aVar10 = ConstraintAnchor.a.TOP;
                SolverVariable solverVariableM15699l117 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar10));
                ConstraintAnchor.a aVar11 = ConstraintAnchor.a.RIGHT;
                SolverVariable solverVariableM15699l118 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar11));
                ConstraintAnchor.a aVar12 = ConstraintAnchor.a.BOTTOM;
                SolverVariable solverVariableM15699l119 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar12));
                SolverVariable solverVariableM15699l1110 = linearSystem.m15699l(constraintWidget13.mo15757j(aVar9));
                SolverVariable solverVariableM15699l1111 = linearSystem.m15699l(constraintWidget13.mo15757j(aVar10));
                SolverVariable solverVariableM15699l1112 = linearSystem.m15699l(constraintWidget13.mo15757j(aVar11));
                SolverVariable solverVariableM15699l1113 = linearSystem.m15699l(constraintWidget13.mo15757j(aVar12));
                ArrayRow arrayRowM15700m5 = linearSystem.m15700m();
                double d5 = radians3;
                double d6 = iM15728d3;
                arrayRowM15700m5.m15682g(solverVariableM15699l117, solverVariableM15699l119, solverVariableM15699l1111, solverVariableM15699l1113, (float) (Math.sin(d5) * d6));
                linearSystem.m15690c(arrayRowM15700m5);
                ArrayRow arrayRowM15700m6 = linearSystem.m15700m();
                arrayRowM15700m6.m15682g(solverVariableM15699l116, solverVariableM15699l118, solverVariableM15699l1110, solverVariableM15699l1112, (float) (Math.cos(d5) * d6));
                linearSystem.m15690c(arrayRowM15700m6);
            }
            this.f36870i = false;
            this.f36872j = false;
        }
        solverVariable = solverVariableM15699l4;
        solverVariableM15699l3 = solverVariableM15699l3;
        i = i17;
        i2 = i19;
        i3 = i16;
        i4 = i18;
        z6 = false;
        int[] iArr6 = this.f36880o;
        iArr6[0] = i;
        iArr6[1] = i2;
        if (z6) {
            int i25 = this.f36887v;
            i5 = -1;
            if (i25 != 0) {
            }
            if (z6) {
                z7 = false;
            } else {
                z7 = false;
            }
            if (this.f36843P[0] == 2) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (z8) {
                i6 = 0;
            } else {
                i6 = i3;
            }
            boolean z112 = !this.f36839L.m15732h();
            boolean[] zArr4 = this.f36842O;
            boolean z113 = zArr4[0];
            boolean z25 = zArr4[1];
            if (this.f36874k == 2) {
            }
            if (z) {
                constraintWidget3 = this;
                verticalWidgetRun = constraintWidget3.f36862e;
                if (verticalWidgetRun != null) {
                    dependencyNode = verticalWidgetRun.f37008h;
                    if (!dependencyNode.f36975j) {
                    }
                }
                i7 = 8;
                i8 = 0;
                c2 = 1;
            } else {
                i7 = 8;
                i8 = 0;
                c2 = 1;
                constraintWidget3 = this;
            }
            z9 = true;
            if (constraintWidget3.f36876l == 2) {
                z10 = false;
            } else {
                z10 = z9;
            }
            if (!z10) {
            }
            if (z6) {
                constraintWidget4 = this;
                if (constraintWidget4.f36887v == 1) {
                    linearSystem.m15695h(solverVariable, solverVariableM15699l3, solverVariableM15699l2, solverVariableM15699l, constraintWidget4.f36888w, 8);
                } else {
                    linearSystem.m15695h(solverVariableM15699l2, solverVariableM15699l, solverVariable, solverVariableM15699l3, constraintWidget4.f36888w, 8);
                }
            } else {
                constraintWidget4 = this;
            }
            if (constraintWidget4.f36839L.m15732h()) {
                ConstraintWidget constraintWidget14 = constraintWidget4.f36839L.f36814f.f36812d;
                float radians4 = (float) Math.toRadians(constraintWidget4.f36890y + 90.0f);
                int iM15728d4 = constraintWidget4.f36839L.m15728d();
                ConstraintAnchor.a aVar13 = ConstraintAnchor.a.LEFT;
                SolverVariable solverVariableM15699l1114 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar13));
                ConstraintAnchor.a aVar14 = ConstraintAnchor.a.TOP;
                SolverVariable solverVariableM15699l1115 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar14));
                ConstraintAnchor.a aVar15 = ConstraintAnchor.a.RIGHT;
                SolverVariable solverVariableM15699l1116 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar15));
                ConstraintAnchor.a aVar16 = ConstraintAnchor.a.BOTTOM;
                SolverVariable solverVariableM15699l1117 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar16));
                SolverVariable solverVariableM15699l1118 = linearSystem.m15699l(constraintWidget14.mo15757j(aVar13));
                SolverVariable solverVariableM15699l1119 = linearSystem.m15699l(constraintWidget14.mo15757j(aVar14));
                SolverVariable solverVariableM15699l11110 = linearSystem.m15699l(constraintWidget14.mo15757j(aVar15));
                SolverVariable solverVariableM15699l11111 = linearSystem.m15699l(constraintWidget14.mo15757j(aVar16));
                ArrayRow arrayRowM15700m7 = linearSystem.m15700m();
                double d7 = radians4;
                double d8 = iM15728d4;
                arrayRowM15700m7.m15682g(solverVariableM15699l1115, solverVariableM15699l1117, solverVariableM15699l1119, solverVariableM15699l11111, (float) (Math.sin(d7) * d8));
                linearSystem.m15690c(arrayRowM15700m7);
                ArrayRow arrayRowM15700m8 = linearSystem.m15700m();
                arrayRowM15700m8.m15682g(solverVariableM15699l1114, solverVariableM15699l1116, solverVariableM15699l1118, solverVariableM15699l11110, (float) (Math.cos(d7) * d8));
                linearSystem.m15690c(arrayRowM15700m8);
            }
            this.f36870i = false;
            this.f36872j = false;
        }
        i5 = -1;
        if (z6) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (this.f36843P[0] == 2) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (z8) {
            i6 = 0;
        } else {
            i6 = i3;
        }
        boolean z114 = !this.f36839L.m15732h();
        boolean[] zArr5 = this.f36842O;
        boolean z115 = zArr5[0];
        boolean z26 = zArr5[1];
        if (this.f36874k == 2) {
        }
        if (z) {
            constraintWidget3 = this;
            verticalWidgetRun = constraintWidget3.f36862e;
            if (verticalWidgetRun != null) {
                dependencyNode = verticalWidgetRun.f37008h;
                if (!dependencyNode.f36975j) {
                }
            }
            i7 = 8;
            i8 = 0;
            c2 = 1;
        } else {
            i7 = 8;
            i8 = 0;
            c2 = 1;
            constraintWidget3 = this;
        }
        z9 = true;
        if (constraintWidget3.f36876l == 2) {
            z10 = false;
        } else {
            z10 = z9;
        }
        if (!z10) {
        }
        if (z6) {
            constraintWidget4 = this;
            if (constraintWidget4.f36887v == 1) {
                linearSystem.m15695h(solverVariable, solverVariableM15699l3, solverVariableM15699l2, solverVariableM15699l, constraintWidget4.f36888w, 8);
            } else {
                linearSystem.m15695h(solverVariableM15699l2, solverVariableM15699l, solverVariable, solverVariableM15699l3, constraintWidget4.f36888w, 8);
            }
        } else {
            constraintWidget4 = this;
        }
        if (constraintWidget4.f36839L.m15732h()) {
            ConstraintWidget constraintWidget15 = constraintWidget4.f36839L.f36814f.f36812d;
            float radians5 = (float) Math.toRadians(constraintWidget4.f36890y + 90.0f);
            int iM15728d5 = constraintWidget4.f36839L.m15728d();
            ConstraintAnchor.a aVar17 = ConstraintAnchor.a.LEFT;
            SolverVariable solverVariableM15699l11112 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar17));
            ConstraintAnchor.a aVar18 = ConstraintAnchor.a.TOP;
            SolverVariable solverVariableM15699l11113 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar18));
            ConstraintAnchor.a aVar19 = ConstraintAnchor.a.RIGHT;
            SolverVariable solverVariableM15699l11114 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar19));
            ConstraintAnchor.a aVar110 = ConstraintAnchor.a.BOTTOM;
            SolverVariable solverVariableM15699l11115 = linearSystem.m15699l(constraintWidget4.mo15757j(aVar110));
            SolverVariable solverVariableM15699l11116 = linearSystem.m15699l(constraintWidget15.mo15757j(aVar17));
            SolverVariable solverVariableM15699l11117 = linearSystem.m15699l(constraintWidget15.mo15757j(aVar18));
            SolverVariable solverVariableM15699l11118 = linearSystem.m15699l(constraintWidget15.mo15757j(aVar19));
            SolverVariable solverVariableM15699l11119 = linearSystem.m15699l(constraintWidget15.mo15757j(aVar110));
            ArrayRow arrayRowM15700m9 = linearSystem.m15700m();
            double d9 = radians5;
            double d10 = iM15728d5;
            arrayRowM15700m9.m15682g(solverVariableM15699l11113, solverVariableM15699l11115, solverVariableM15699l11117, solverVariableM15699l11119, (float) (Math.sin(d9) * d10));
            linearSystem.m15690c(arrayRowM15700m9);
            ArrayRow arrayRowM15700m10 = linearSystem.m15700m();
            arrayRowM15700m10.m15682g(solverVariableM15699l11112, solverVariableM15699l11114, solverVariableM15699l11116, solverVariableM15699l11118, (float) (Math.cos(d9) * d10));
            linearSystem.m15690c(arrayRowM15700m10);
        }
        this.f36870i = false;
        this.f36872j = false;
    }

    /* JADX INFO: renamed from: f */
    public boolean mo15723f() {
        return this.f36861d0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017f  */
    /* JADX WARN: Code duplicated, block: B:101:0x018f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0191 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0196 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x01a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x031a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:203:0x0323  */
    /* JADX WARN: Code duplicated, block: B:205:0x0327  */
    /* JADX WARN: Code duplicated, block: B:206:0x0329 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:211:0x033a  */
    /* JADX WARN: Code duplicated, block: B:213:0x036f  */
    /* JADX WARN: Code duplicated, block: B:216:0x038a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0393  */
    /* JADX WARN: Code duplicated, block: B:222:0x0397 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:229:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:231:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:233:0x03bd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:239:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:241:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:242:0x03d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:265:0x0403  */
    /* JADX WARN: Code duplicated, block: B:267:0x0409 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:271:0x0411 A[PHI: r2
  0x0411: PHI (r2v15 int) = (r2v14 int), (r2v19 int), (r2v19 int), (r2v19 int) binds: [B:264:0x0401, B:266:0x0407, B:267:0x0409, B:269:0x040d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:274:0x0423  */
    /* JADX WARN: Code duplicated, block: B:276:0x0428  */
    /* JADX WARN: Code duplicated, block: B:277:0x042d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0430  */
    /* JADX WARN: Code duplicated, block: B:280:0x0435  */
    /* JADX WARN: Code duplicated, block: B:282:0x0438 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:290:0x0452  */
    /* JADX WARN: Code duplicated, block: B:294:0x045e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:302:0x0477  */
    /* JADX WARN: Code duplicated, block: B:304:0x0487 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:323:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:331:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x009e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0113  */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:89:0x0124  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0146  */
    /* JADX WARN: Code duplicated, block: B:97:0x0177  */
    /* JADX WARN: Code duplicated, block: B:99:0x017d A[DONT_INVERT] */
    /* JADX INFO: renamed from: g */
    public final void m15754g(LinearSystem linearSystem, boolean z, boolean z2, boolean z3, boolean z4, SolverVariable solverVariable, SolverVariable solverVariable2, int i, boolean z5, ConstraintAnchor constraintAnchor, ConstraintAnchor constraintAnchor2, int i2, int i3, int i4, int i5, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i6, int i7, int i8, int i9, float f2, boolean z11) {
        boolean z12;
        int iMin;
        int i10;
        int i11;
        boolean z13;
        ConstraintAnchor.a aVar;
        ConstraintAnchor.a aVar2;
        SolverVariable solverVariableM15699l;
        SolverVariable solverVariableM15699l2;
        boolean z14;
        int i12;
        int i13;
        int i14;
        char c2;
        char c3;
        boolean z15;
        ConstraintAnchor constraintAnchor3;
        SolverVariable solverVariable3;
        int i15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        int i16;
        boolean z20;
        int i17;
        int i18;
        boolean z21;
        boolean z22;
        boolean z23;
        ConstraintWidget constraintWidget;
        int i19;
        boolean z24;
        boolean z25;
        SolverVariable solverVariable4;
        int iMin2;
        int i20;
        int iM15728d;
        ConstraintWidget constraintWidget2;
        int i21;
        int i22;
        boolean z26;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z27;
        int i27;
        int i28 = i8;
        int i29 = i9;
        ConstraintAnchor.a aVar3 = ConstraintAnchor.a.BOTTOM;
        SolverVariable solverVariableM15699l3 = linearSystem.m15699l(constraintAnchor);
        SolverVariable solverVariableM15699l4 = linearSystem.m15699l(constraintAnchor2);
        SolverVariable solverVariableM15699l5 = linearSystem.m15699l(constraintAnchor.f36814f);
        SolverVariable solverVariableM15699l6 = linearSystem.m15699l(constraintAnchor2.f36814f);
        boolean zM15732h = constraintAnchor.m15732h();
        boolean zM15732h2 = constraintAnchor2.m15732h();
        boolean zM15732h3 = this.f36839L.m15732h();
        int i30 = zM15732h2 ? (zM15732h ? 1 : 0) + 1 : zM15732h ? 1 : 0;
        if (zM15732h3) {
            i30++;
        }
        int i31 = i30;
        int i32 = z6 ? 3 : i6;
        int iM15315d = C7804v0.m15315d(i);
        if (iM15315d != 0 && iM15315d != 1 && iM15315d == 2) {
            boolean z28 = i32 != 4;
            z12 = z28;
            if (this.f36861d0 == 8) {
                iMin = 0;
                z12 = false;
            } else {
                iMin = i3;
            }
            if (z11) {
                if (zM15732h && !zM15732h2 && !zM15732h3) {
                    linearSystem.m15692e(solverVariableM15699l3, i2);
                } else if (zM15732h && !zM15732h2) {
                    i10 = 8;
                    linearSystem.m15691d(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), 8);
                }
                i10 = 8;
            } else {
                i10 = 8;
            }
            if (!z12) {
                if (i31 != 2 || z6 || (i32 != 1 && i32 != 0)) {
                    if (i28 == -2) {
                        i28 = iMin;
                    }
                    if (i29 == -2) {
                        i29 = iMin;
                    }
                    if (iMin > 0 && i32 != 1) {
                        iMin = 0;
                    }
                    if (i28 > 0) {
                        linearSystem.m15693f(solverVariableM15699l4, solverVariableM15699l3, i28, 8);
                        iMin = Math.max(iMin, i28);
                    }
                    if (i29 > 0) {
                        if (z2 || i32 != 1) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (z14) {
                            i11 = 8;
                            linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, i29, 8);
                        } else {
                            i11 = 8;
                        }
                        iMin = Math.min(iMin, i29);
                    } else {
                        i11 = 8;
                    }
                    if (i32 == 1) {
                        if (z2) {
                            linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                        } else if (z8) {
                            linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, 5);
                            linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                        } else {
                            linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, 5);
                            linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                        }
                    } else if (i32 == 2) {
                        aVar = constraintAnchor.f36813e;
                        aVar2 = ConstraintAnchor.a.TOP;
                        if (aVar != aVar2 || aVar == aVar3) {
                            solverVariableM15699l = linearSystem.m15699l(this.f36844Q.mo15757j(aVar2));
                            solverVariableM15699l2 = linearSystem.m15699l(this.f36844Q.mo15757j(aVar3));
                        } else {
                            solverVariableM15699l = linearSystem.m15699l(this.f36844Q.mo15757j(ConstraintAnchor.a.LEFT));
                            solverVariableM15699l2 = linearSystem.m15699l(this.f36844Q.mo15757j(ConstraintAnchor.a.RIGHT));
                        }
                        SolverVariable solverVariable5 = solverVariableM15699l;
                        ArrayRow arrayRowM15700m = linearSystem.m15700m();
                        arrayRowM15700m.m15679d(solverVariableM15699l4, solverVariableM15699l3, solverVariableM15699l2, solverVariable5, f2);
                        linearSystem.m15690c(arrayRowM15700m);
                    } else {
                        z13 = true;
                    }
                    i12 = i28;
                    if (!z11) {
                        i13 = 0;
                        i14 = 3;
                        c2 = 1;
                        c3 = 2;
                    } else {
                        if (!z8) {
                            if ((!zM15732h || zM15732h2 || zM15732h3) && (!zM15732h || zM15732h2)) {
                                if (!zM15732h || !zM15732h2) {
                                    solverVariable3 = solverVariableM15699l6;
                                    if (!zM15732h && zM15732h2) {
                                        ConstraintWidget constraintWidget3 = constraintAnchor.f36814f.f36812d;
                                        ConstraintWidget constraintWidget4 = constraintAnchor2.f36814f.f36812d;
                                        ConstraintWidget constraintWidget5 = this.f36844Q;
                                        int i33 = 6;
                                        if (z12) {
                                            if (i32 == 0) {
                                                if (i29 != 0 || i12 != 0) {
                                                    z20 = true;
                                                    z27 = true;
                                                    z22 = false;
                                                    i26 = 5;
                                                    i27 = 5;
                                                } else if (solverVariableM15699l5.f36771h && solverVariable3.f36771h) {
                                                    linearSystem.m15691d(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), 8);
                                                    linearSystem.m15691d(solverVariableM15699l4, solverVariable3, -constraintAnchor2.m15728d(), 8);
                                                    return;
                                                } else {
                                                    z20 = false;
                                                    z27 = false;
                                                    z22 = true;
                                                    i26 = 8;
                                                    i27 = 8;
                                                }
                                                i24 = ((constraintWidget3 instanceof Barrier2) || (constraintWidget4 instanceof Barrier2)) ? 4 : i27;
                                                i15 = i32;
                                            } else {
                                                if (i32 == 1) {
                                                    i15 = i32;
                                                    i24 = 4;
                                                    z27 = true;
                                                    z22 = false;
                                                    i26 = 8;
                                                } else {
                                                    if (i32 == 3) {
                                                        i15 = i32;
                                                        if (this.f36887v == -1) {
                                                            if (z9) {
                                                                i17 = z2 ? 5 : 4;
                                                            } else {
                                                                i17 = 8;
                                                            }
                                                            z22 = true;
                                                            z21 = true;
                                                            i16 = 5;
                                                            i18 = 8;
                                                        } else if (z6) {
                                                            if (i7 == 2 || i7 == 1) {
                                                                i24 = 4;
                                                                i25 = 5;
                                                            } else {
                                                                i24 = 5;
                                                                i25 = 8;
                                                            }
                                                            i26 = i25;
                                                            z27 = true;
                                                            z22 = true;
                                                        } else {
                                                            if (i29 > 0) {
                                                                solverVariable2 = solverVariable2;
                                                                z19 = true;
                                                                z18 = true;
                                                                z17 = true;
                                                                i16 = 5;
                                                            } else if (i29 != 0 || i12 != 0) {
                                                                z16 = true;
                                                            } else if (z9) {
                                                                i18 = (constraintWidget3 == constraintWidget5 || constraintWidget4 == constraintWidget5) ? 5 : 4;
                                                                i17 = 6;
                                                                z22 = true;
                                                                z21 = true;
                                                                i16 = 4;
                                                            } else {
                                                                solverVariable2 = solverVariable2;
                                                                z19 = true;
                                                                z18 = true;
                                                                z17 = true;
                                                                i16 = 8;
                                                            }
                                                            z20 = z19;
                                                            i17 = 6;
                                                            i18 = 5;
                                                            boolean z29 = z17;
                                                            z21 = z18;
                                                            z22 = z29;
                                                        }
                                                        z20 = true;
                                                    } else {
                                                        i15 = i32;
                                                        solverVariable2 = solverVariable2;
                                                        z19 = false;
                                                        z18 = false;
                                                        z17 = false;
                                                        i16 = 4;
                                                        z20 = z19;
                                                        i17 = 6;
                                                        i18 = 5;
                                                        boolean z210 = z17;
                                                        z21 = z18;
                                                        z22 = z210;
                                                    }
                                                    if (z21 || solverVariableM15699l5 != solverVariable3 || constraintWidget3 == constraintWidget5) {
                                                        z23 = true;
                                                    } else {
                                                        z21 = false;
                                                        z23 = false;
                                                    }
                                                    if (z20) {
                                                        if (z12 && !z7 && !z9 && solverVariableM15699l5 == solverVariable && solverVariable3 == solverVariable2) {
                                                            z25 = false;
                                                            i23 = 8;
                                                            z26 = false;
                                                            i19 = 8;
                                                        } else {
                                                            i19 = i18;
                                                            z26 = z23;
                                                            z25 = z2;
                                                            i23 = i17;
                                                        }
                                                        constraintWidget = constraintWidget5;
                                                        linearSystem.m15689b(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), f, solverVariable3, solverVariableM15699l4, constraintAnchor2.m15728d(), i23);
                                                        z24 = z26;
                                                    } else {
                                                        constraintWidget = constraintWidget5;
                                                        i19 = i18;
                                                        z24 = z23;
                                                        z25 = z2;
                                                    }
                                                    if (this.f36861d0 != 8 && !constraintAnchor2.m15731g()) {
                                                        return;
                                                    }
                                                    if (z21) {
                                                        solverVariable4 = solverVariable3;
                                                        if (z25 || solverVariableM15699l5 == solverVariable4 || z12 || !((constraintWidget3 instanceof Barrier2) || (constraintWidget4 instanceof Barrier2))) {
                                                            i22 = i19;
                                                        } else {
                                                            i22 = 6;
                                                        }
                                                        linearSystem.m15693f(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), i22);
                                                        linearSystem.m15694g(solverVariableM15699l4, solverVariable4, -constraintAnchor2.m15728d(), i22);
                                                        i19 = i22;
                                                    } else {
                                                        solverVariable4 = solverVariable3;
                                                    }
                                                    if (z25 || !z10 || (constraintWidget3 instanceof Barrier2) || (constraintWidget4 instanceof Barrier2)) {
                                                        iMin2 = i16;
                                                        i20 = i19;
                                                    } else {
                                                        iMin2 = 6;
                                                        i20 = 6;
                                                        z24 = true;
                                                    }
                                                    if (z24) {
                                                        if (z22 || (z9 && !z3)) {
                                                            constraintWidget2 = constraintWidget;
                                                        } else {
                                                            constraintWidget2 = constraintWidget;
                                                            if (constraintWidget3 != constraintWidget2 && constraintWidget4 != constraintWidget2) {
                                                                i33 = iMin2;
                                                            }
                                                            if ((constraintWidget3 instanceof Guideline2) || (constraintWidget4 instanceof Guideline2)) {
                                                                i33 = 5;
                                                            }
                                                            if ((constraintWidget3 instanceof Barrier2) || (constraintWidget4 instanceof Barrier2)) {
                                                                i33 = 5;
                                                            }
                                                            iMin2 = Math.max(z9 ? 5 : i33, iMin2);
                                                        }
                                                        if (z25) {
                                                            iMin2 = Math.min(i20, iMin2);
                                                            if (z6 || z9 || !(constraintWidget3 == constraintWidget2 || constraintWidget4 == constraintWidget2)) {
                                                                i21 = iMin2;
                                                            } else {
                                                                i21 = 4;
                                                            }
                                                        } else {
                                                            i21 = iMin2;
                                                        }
                                                        linearSystem.m15691d(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), i21);
                                                        linearSystem.m15691d(solverVariableM15699l4, solverVariable4, -constraintAnchor2.m15728d(), i21);
                                                    }
                                                    if (z25) {
                                                        solverVariableM15699l4 = solverVariableM15699l4;
                                                        if (solverVariable == solverVariableM15699l5) {
                                                            iM15728d = constraintAnchor.m15728d();
                                                        } else {
                                                            iM15728d = 0;
                                                        }
                                                        if (solverVariableM15699l5 != solverVariable) {
                                                            linearSystem.m15693f(solverVariableM15699l3, solverVariable, iM15728d, 5);
                                                        }
                                                    } else {
                                                        solverVariableM15699l4 = solverVariableM15699l4;
                                                    }
                                                    if (!z25 && z12 && i4 == 0 && i12 == 0) {
                                                        if (z12 && i15 == 3) {
                                                            linearSystem.m15693f(solverVariableM15699l4, solverVariableM15699l3, 0, 8);
                                                        } else {
                                                            linearSystem.m15693f(solverVariableM15699l4, solverVariableM15699l3, 0, 5);
                                                        }
                                                    }
                                                }
                                                z20 = true;
                                            }
                                            i16 = i24;
                                            i18 = i26;
                                            i17 = 6;
                                            z21 = z27;
                                            solverVariable2 = solverVariable2;
                                            if (z21) {
                                                z23 = true;
                                            } else {
                                                z23 = true;
                                            }
                                            if (z20) {
                                                if (z12) {
                                                    i19 = i18;
                                                    z26 = z23;
                                                    z25 = z2;
                                                    i23 = i17;
                                                } else {
                                                    i19 = i18;
                                                    z26 = z23;
                                                    z25 = z2;
                                                    i23 = i17;
                                                }
                                                constraintWidget = constraintWidget5;
                                                linearSystem.m15689b(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), f, solverVariable3, solverVariableM15699l4, constraintAnchor2.m15728d(), i23);
                                                z24 = z26;
                                            } else {
                                                constraintWidget = constraintWidget5;
                                                i19 = i18;
                                                z24 = z23;
                                                z25 = z2;
                                            }
                                            if (this.f36861d0 != 8) {
                                            }
                                            if (z21) {
                                                solverVariable4 = solverVariable3;
                                                if (z25) {
                                                    i22 = i19;
                                                } else {
                                                    i22 = i19;
                                                }
                                                linearSystem.m15693f(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), i22);
                                                linearSystem.m15694g(solverVariableM15699l4, solverVariable4, -constraintAnchor2.m15728d(), i22);
                                                i19 = i22;
                                            } else {
                                                solverVariable4 = solverVariable3;
                                            }
                                            if (z25) {
                                                iMin2 = i16;
                                                i20 = i19;
                                            } else {
                                                iMin2 = i16;
                                                i20 = i19;
                                            }
                                            if (z24) {
                                                if (z22) {
                                                    constraintWidget2 = constraintWidget;
                                                } else {
                                                    constraintWidget2 = constraintWidget;
                                                }
                                                if (z25) {
                                                    iMin2 = Math.min(i20, iMin2);
                                                    if (z6) {
                                                        i21 = iMin2;
                                                    } else {
                                                        i21 = iMin2;
                                                    }
                                                } else {
                                                    i21 = iMin2;
                                                }
                                                linearSystem.m15691d(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), i21);
                                                linearSystem.m15691d(solverVariableM15699l4, solverVariable4, -constraintAnchor2.m15728d(), i21);
                                            }
                                            if (z25) {
                                                solverVariableM15699l4 = solverVariableM15699l4;
                                                if (solverVariable == solverVariableM15699l5) {
                                                    iM15728d = constraintAnchor.m15728d();
                                                } else {
                                                    iM15728d = 0;
                                                }
                                                if (solverVariableM15699l5 != solverVariable) {
                                                    linearSystem.m15693f(solverVariableM15699l3, solverVariable, iM15728d, 5);
                                                }
                                            } else {
                                                solverVariableM15699l4 = solverVariableM15699l4;
                                            }
                                            if (!z25) {
                                            }
                                        } else {
                                            i15 = i32;
                                            if (solverVariableM15699l5.f36771h && solverVariable3.f36771h) {
                                                linearSystem.m15689b(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), f, solverVariable3, solverVariableM15699l4, constraintAnchor2.m15728d(), 8);
                                                if (z2 && z13) {
                                                    int iM15728d2 = constraintAnchor2.f36814f != null ? constraintAnchor2.m15728d() : 0;
                                                    if (solverVariable3 != solverVariable2) {
                                                        linearSystem.m15693f(solverVariable2, solverVariableM15699l4, iM15728d2, 5);
                                                        return;
                                                    }
                                                    return;
                                                }
                                                return;
                                            }
                                            z16 = false;
                                        }
                                        z17 = z16;
                                        z19 = true;
                                        z18 = true;
                                        i16 = 4;
                                        z20 = z19;
                                        i17 = 6;
                                        i18 = 5;
                                        boolean z211 = z17;
                                        z21 = z18;
                                        z22 = z211;
                                        if (z21) {
                                            z23 = true;
                                        } else {
                                            z23 = true;
                                        }
                                        if (z20) {
                                            if (z12) {
                                                i19 = i18;
                                                z26 = z23;
                                                z25 = z2;
                                                i23 = i17;
                                            } else {
                                                i19 = i18;
                                                z26 = z23;
                                                z25 = z2;
                                                i23 = i17;
                                            }
                                            constraintWidget = constraintWidget5;
                                            linearSystem.m15689b(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), f, solverVariable3, solverVariableM15699l4, constraintAnchor2.m15728d(), i23);
                                            z24 = z26;
                                        } else {
                                            constraintWidget = constraintWidget5;
                                            i19 = i18;
                                            z24 = z23;
                                            z25 = z2;
                                        }
                                        if (this.f36861d0 != 8) {
                                        }
                                        if (z21) {
                                            solverVariable4 = solverVariable3;
                                            if (z25) {
                                                i22 = i19;
                                            } else {
                                                i22 = i19;
                                            }
                                            linearSystem.m15693f(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), i22);
                                            linearSystem.m15694g(solverVariableM15699l4, solverVariable4, -constraintAnchor2.m15728d(), i22);
                                            i19 = i22;
                                        } else {
                                            solverVariable4 = solverVariable3;
                                        }
                                        if (z25) {
                                            iMin2 = i16;
                                            i20 = i19;
                                        } else {
                                            iMin2 = i16;
                                            i20 = i19;
                                        }
                                        if (z24) {
                                            if (z22) {
                                                constraintWidget2 = constraintWidget;
                                            } else {
                                                constraintWidget2 = constraintWidget;
                                            }
                                            if (z25) {
                                                iMin2 = Math.min(i20, iMin2);
                                                if (z6) {
                                                    i21 = iMin2;
                                                } else {
                                                    i21 = iMin2;
                                                }
                                            } else {
                                                i21 = iMin2;
                                            }
                                            linearSystem.m15691d(solverVariableM15699l3, solverVariableM15699l5, constraintAnchor.m15728d(), i21);
                                            linearSystem.m15691d(solverVariableM15699l4, solverVariable4, -constraintAnchor2.m15728d(), i21);
                                        }
                                        if (z25) {
                                            solverVariableM15699l4 = solverVariableM15699l4;
                                            if (solverVariable == solverVariableM15699l5) {
                                                iM15728d = constraintAnchor.m15728d();
                                            } else {
                                                iM15728d = 0;
                                            }
                                            if (solverVariableM15699l5 != solverVariable) {
                                                linearSystem.m15693f(solverVariableM15699l3, solverVariable, iM15728d, 5);
                                            }
                                        } else {
                                            solverVariableM15699l4 = solverVariableM15699l4;
                                        }
                                        if (!z25) {
                                        }
                                    }
                                    if (z25 || z13 == 0) {
                                        return;
                                    }
                                    int iM15728d3 = constraintAnchor2.f36814f != null ? constraintAnchor2.m15728d() : 0;
                                    if (solverVariable4 != solverVariable2) {
                                        linearSystem.m15693f(solverVariable2, solverVariableM15699l4, iM15728d3, 5);
                                        return;
                                    }
                                    return;
                                }
                                linearSystem.m15691d(solverVariableM15699l4, solverVariable3, -constraintAnchor2.m15728d(), 8);
                                if (z2) {
                                    solverVariable3 = solverVariableM15699l6;
                                    linearSystem.m15693f(solverVariableM15699l3, solverVariable, 0, 5);
                                }
                                solverVariable3 = solverVariableM15699l6;
                                solverVariable4 = solverVariable3;
                            } else {
                                solverVariable4 = solverVariableM15699l6;
                            }
                            z25 = z2;
                            if (z25) {
                                return;
                            } else {
                                return;
                            }
                        }
                        i13 = 0;
                        i14 = 3;
                        c3 = 2;
                        c2 = 1;
                    }
                    if (i31 >= c3 && z2 && z13) {
                        linearSystem.m15693f(solverVariableM15699l3, solverVariable, i13, 8);
                        boolean z30 = z || this.f36836I.f36814f == null;
                        if (z || (constraintAnchor3 = this.f36836I.f36814f) == null) {
                            z15 = z30;
                        } else {
                            ConstraintWidget constraintWidget6 = constraintAnchor3.f36812d;
                            if (constraintWidget6.f36847T != 0.0f) {
                                int[] iArr = constraintWidget6.f36843P;
                                if (iArr[i13] == i14 && iArr[c2] == i14) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                            } else {
                                z15 = false;
                            }
                        }
                        if (z15) {
                            linearSystem.m15693f(solverVariable2, solverVariableM15699l4, i13, 8);
                            return;
                        }
                        return;
                    }
                    return;
                }
                int iMax = Math.max(i28, iMin);
                if (i29 > 0) {
                    iMax = Math.min(i29, iMax);
                }
                linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMax, 8);
                z13 = z4;
                i12 = i28;
                z12 = false;
                if (!z11) {
                    i13 = 0;
                    i14 = 3;
                    c2 = 1;
                    c3 = 2;
                } else {
                    if (!z8) {
                        if (zM15732h) {
                            if (!zM15732h) {
                                solverVariable3 = solverVariableM15699l6;
                                if (!zM15732h) {
                                }
                                solverVariable3 = solverVariableM15699l6;
                                solverVariable4 = solverVariable3;
                                z25 = z2;
                            } else {
                                solverVariable3 = solverVariableM15699l6;
                                if (!zM15732h) {
                                }
                                solverVariable3 = solverVariableM15699l6;
                                solverVariable4 = solverVariable3;
                                z25 = z2;
                            }
                        } else if (!zM15732h) {
                            solverVariable3 = solverVariableM15699l6;
                            if (!zM15732h) {
                            }
                            solverVariable3 = solverVariableM15699l6;
                            solverVariable4 = solverVariable3;
                            z25 = z2;
                        } else {
                            solverVariable3 = solverVariableM15699l6;
                            if (!zM15732h) {
                            }
                            solverVariable3 = solverVariableM15699l6;
                            solverVariable4 = solverVariable3;
                            z25 = z2;
                        }
                        if (z25) {
                            return;
                        } else {
                            return;
                        }
                    }
                    i13 = 0;
                    i14 = 3;
                    c3 = 2;
                    c2 = 1;
                }
                if (i31 >= c3) {
                }
            }
            if (z5) {
                linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, 0, 3);
                if (i4 > 0) {
                    linearSystem.m15693f(solverVariableM15699l4, solverVariableM15699l3, i4, i10);
                }
                if (i5 < Integer.MAX_VALUE) {
                    linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, i5, i10);
                }
            } else {
                linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, i10);
            }
            z13 = z4;
            i12 = i28;
            if (!z11) {
                i13 = 0;
                i14 = 3;
                c2 = 1;
                c3 = 2;
            } else {
                if (!z8) {
                    if (zM15732h) {
                        if (!zM15732h) {
                            solverVariable3 = solverVariableM15699l6;
                            if (!zM15732h) {
                            }
                            solverVariable3 = solverVariableM15699l6;
                            solverVariable4 = solverVariable3;
                            z25 = z2;
                        } else {
                            solverVariable3 = solverVariableM15699l6;
                            if (!zM15732h) {
                            }
                            solverVariable3 = solverVariableM15699l6;
                            solverVariable4 = solverVariable3;
                            z25 = z2;
                        }
                    } else if (!zM15732h) {
                        solverVariable3 = solverVariableM15699l6;
                        if (!zM15732h) {
                        }
                        solverVariable3 = solverVariableM15699l6;
                        solverVariable4 = solverVariable3;
                        z25 = z2;
                    } else {
                        solverVariable3 = solverVariableM15699l6;
                        if (!zM15732h) {
                        }
                        solverVariable3 = solverVariableM15699l6;
                        solverVariable4 = solverVariable3;
                        z25 = z2;
                    }
                    if (z25) {
                        return;
                    } else {
                        return;
                    }
                }
                i13 = 0;
                i14 = 3;
                c3 = 2;
                c2 = 1;
            }
            if (i31 >= c3) {
            }
        }
        z12 = z28;
        if (this.f36861d0 == 8) {
            iMin = 0;
            z12 = false;
        } else {
            iMin = i3;
        }
        if (z11) {
            i10 = 8;
        } else if (zM15732h) {
            if (zM15732h) {
                i10 = 8;
            } else {
                i10 = 8;
            }
        } else if (zM15732h) {
            i10 = 8;
        } else {
            i10 = 8;
        }
        if (!z12) {
            if (i31 != 2) {
                if (i28 == -2) {
                    i28 = iMin;
                }
                if (i29 == -2) {
                    i29 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i28 > 0) {
                    linearSystem.m15693f(solverVariableM15699l4, solverVariableM15699l3, i28, 8);
                    iMin = Math.max(iMin, i28);
                }
                if (i29 > 0) {
                    if (z2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        i11 = 8;
                        linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, i29, 8);
                    } else {
                        i11 = 8;
                    }
                    iMin = Math.min(iMin, i29);
                } else {
                    i11 = 8;
                }
                if (i32 == 1) {
                    if (z2) {
                        linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                    } else if (z8) {
                        linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, 5);
                        linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                    } else {
                        linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, 5);
                        linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                    }
                } else if (i32 == 2) {
                    aVar = constraintAnchor.f36813e;
                    aVar2 = ConstraintAnchor.a.TOP;
                    if (aVar != aVar2) {
                        solverVariableM15699l = linearSystem.m15699l(this.f36844Q.mo15757j(aVar2));
                        solverVariableM15699l2 = linearSystem.m15699l(this.f36844Q.mo15757j(aVar3));
                    } else {
                        solverVariableM15699l = linearSystem.m15699l(this.f36844Q.mo15757j(aVar2));
                        solverVariableM15699l2 = linearSystem.m15699l(this.f36844Q.mo15757j(aVar3));
                    }
                    SolverVariable solverVariable6 = solverVariableM15699l;
                    ArrayRow arrayRowM15700m2 = linearSystem.m15700m();
                    arrayRowM15700m2.m15679d(solverVariableM15699l4, solverVariableM15699l3, solverVariableM15699l2, solverVariable6, f2);
                    linearSystem.m15690c(arrayRowM15700m2);
                    z13 = z4;
                    i12 = i28;
                    z12 = false;
                } else {
                    z13 = true;
                }
                i12 = i28;
            } else {
                if (i28 == -2) {
                    i28 = iMin;
                }
                if (i29 == -2) {
                    i29 = iMin;
                }
                if (iMin > 0) {
                    iMin = 0;
                }
                if (i28 > 0) {
                    linearSystem.m15693f(solverVariableM15699l4, solverVariableM15699l3, i28, 8);
                    iMin = Math.max(iMin, i28);
                }
                if (i29 > 0) {
                    if (z2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (z14) {
                        i11 = 8;
                        linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, i29, 8);
                    } else {
                        i11 = 8;
                    }
                    iMin = Math.min(iMin, i29);
                } else {
                    i11 = 8;
                }
                if (i32 == 1) {
                    if (z2) {
                        linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                    } else if (z8) {
                        linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, 5);
                        linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                    } else {
                        linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, 5);
                        linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, iMin, i11);
                    }
                } else if (i32 == 2) {
                    aVar = constraintAnchor.f36813e;
                    aVar2 = ConstraintAnchor.a.TOP;
                    if (aVar != aVar2) {
                        solverVariableM15699l = linearSystem.m15699l(this.f36844Q.mo15757j(aVar2));
                        solverVariableM15699l2 = linearSystem.m15699l(this.f36844Q.mo15757j(aVar3));
                    } else {
                        solverVariableM15699l = linearSystem.m15699l(this.f36844Q.mo15757j(aVar2));
                        solverVariableM15699l2 = linearSystem.m15699l(this.f36844Q.mo15757j(aVar3));
                    }
                    SolverVariable solverVariable7 = solverVariableM15699l;
                    ArrayRow arrayRowM15700m3 = linearSystem.m15700m();
                    arrayRowM15700m3.m15679d(solverVariableM15699l4, solverVariableM15699l3, solverVariableM15699l2, solverVariable7, f2);
                    linearSystem.m15690c(arrayRowM15700m3);
                    z13 = z4;
                    i12 = i28;
                    z12 = false;
                } else {
                    z13 = true;
                }
                i12 = i28;
            }
            if (!z11) {
                i13 = 0;
                i14 = 3;
                c2 = 1;
                c3 = 2;
            } else {
                if (!z8) {
                    if (zM15732h) {
                        if (!zM15732h) {
                            solverVariable3 = solverVariableM15699l6;
                            if (!zM15732h) {
                            }
                            solverVariable3 = solverVariableM15699l6;
                            solverVariable4 = solverVariable3;
                            z25 = z2;
                        } else {
                            solverVariable3 = solverVariableM15699l6;
                            if (!zM15732h) {
                            }
                            solverVariable3 = solverVariableM15699l6;
                            solverVariable4 = solverVariable3;
                            z25 = z2;
                        }
                    } else if (!zM15732h) {
                        solverVariable3 = solverVariableM15699l6;
                        if (!zM15732h) {
                        }
                        solverVariable3 = solverVariableM15699l6;
                        solverVariable4 = solverVariable3;
                        z25 = z2;
                    } else {
                        solverVariable3 = solverVariableM15699l6;
                        if (!zM15732h) {
                        }
                        solverVariable3 = solverVariableM15699l6;
                        solverVariable4 = solverVariable3;
                        z25 = z2;
                    }
                    if (z25) {
                        return;
                    } else {
                        return;
                    }
                }
                i13 = 0;
                i14 = 3;
                c3 = 2;
                c2 = 1;
            }
            if (i31 >= c3) {
            }
        }
        if (z5) {
            linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, 0, 3);
            if (i4 > 0) {
                linearSystem.m15693f(solverVariableM15699l4, solverVariableM15699l3, i4, i10);
            }
            if (i5 < Integer.MAX_VALUE) {
                linearSystem.m15694g(solverVariableM15699l4, solverVariableM15699l3, i5, i10);
            }
        } else {
            linearSystem.m15691d(solverVariableM15699l4, solverVariableM15699l3, iMin, i10);
        }
        z13 = z4;
        i12 = i28;
        if (!z11) {
            i13 = 0;
            i14 = 3;
            c2 = 1;
            c3 = 2;
        } else {
            if (!z8) {
                if (zM15732h) {
                    if (!zM15732h) {
                        solverVariable3 = solverVariableM15699l6;
                        if (!zM15732h) {
                        }
                        solverVariable3 = solverVariableM15699l6;
                        solverVariable4 = solverVariable3;
                        z25 = z2;
                    } else {
                        solverVariable3 = solverVariableM15699l6;
                        if (!zM15732h) {
                        }
                        solverVariable3 = solverVariableM15699l6;
                        solverVariable4 = solverVariable3;
                        z25 = z2;
                    }
                } else if (!zM15732h) {
                    solverVariable3 = solverVariableM15699l6;
                    if (!zM15732h) {
                    }
                    solverVariable3 = solverVariableM15699l6;
                    solverVariable4 = solverVariable3;
                    z25 = z2;
                } else {
                    solverVariable3 = solverVariableM15699l6;
                    if (!zM15732h) {
                    }
                    solverVariable3 = solverVariableM15699l6;
                    solverVariable4 = solverVariable3;
                    z25 = z2;
                }
                if (z25) {
                    return;
                } else {
                    return;
                }
            }
            i13 = 0;
            i14 = 3;
            c3 = 2;
            c2 = 1;
        }
        if (i31 >= c3) {
        }
    }

    /* JADX INFO: renamed from: h */
    public void m15755h(LinearSystem linearSystem) {
        linearSystem.m15699l(this.f36832E);
        linearSystem.m15699l(this.f36833F);
        linearSystem.m15699l(this.f36834G);
        linearSystem.m15699l(this.f36835H);
        if (this.f36851X > 0) {
            linearSystem.m15699l(this.f36836I);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m15756i() {
        if (this.f36860d == null) {
            this.f36860d = new HorizontalWidgetRun(this);
        }
        if (this.f36862e == null) {
            this.f36862e = new VerticalWidgetRun(this);
        }
    }

    /* JADX INFO: renamed from: j */
    public ConstraintAnchor mo15757j(ConstraintAnchor.a aVar) {
        switch (aVar) {
            case NONE:
                return null;
            case LEFT:
                return this.f36832E;
            case TOP:
                return this.f36833F;
            case RIGHT:
                return this.f36834G;
            case BOTTOM:
                return this.f36835H;
            case BASELINE:
                return this.f36836I;
            case CENTER:
                return this.f36839L;
            case CENTER_X:
                return this.f36837J;
            case CENTER_Y:
                return this.f36838K;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    /* JADX INFO: renamed from: k */
    public int m15758k() {
        return m15768u() + this.f36846S;
    }

    /* JADX INFO: renamed from: l */
    public int m15759l(int i) {
        if (i == 0) {
            return m15761n();
        }
        if (i == 1) {
            return m15765r();
        }
        return 0;
    }

    /* JADX INFO: renamed from: m */
    public int m15760m() {
        if (this.f36861d0 == 8) {
            return 0;
        }
        return this.f36846S;
    }

    /* JADX INFO: renamed from: n */
    public int m15761n() {
        return this.f36843P[0];
    }

    /* JADX INFO: renamed from: o */
    public ConstraintWidget m15762o(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f36835H).f36814f) != null && constraintAnchor2.f36814f == constraintAnchor) {
                return constraintAnchor2.f36812d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f36834G;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f36814f;
        if (constraintAnchor4 == null || constraintAnchor4.f36814f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f36812d;
    }

    /* JADX INFO: renamed from: p */
    public ConstraintWidget m15763p(int i) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        if (i != 0) {
            if (i == 1 && (constraintAnchor2 = (constraintAnchor = this.f36833F).f36814f) != null && constraintAnchor2.f36814f == constraintAnchor) {
                return constraintAnchor2.f36812d;
            }
            return null;
        }
        ConstraintAnchor constraintAnchor3 = this.f36832E;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f36814f;
        if (constraintAnchor4 == null || constraintAnchor4.f36814f != constraintAnchor3) {
            return null;
        }
        return constraintAnchor4.f36812d;
    }

    /* JADX INFO: renamed from: q */
    public int m15764q() {
        return m15767t() + this.f36845R;
    }

    /* JADX INFO: renamed from: r */
    public int m15765r() {
        return this.f36843P[1];
    }

    /* JADX INFO: renamed from: s */
    public int m15766s() {
        if (this.f36861d0 == 8) {
            return 0;
        }
        return this.f36845R;
    }

    /* JADX INFO: renamed from: t */
    public int m15767t() {
        ConstraintWidget constraintWidget = this.f36844Q;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f36849V : ((ConstraintWidgetContainer) constraintWidget).f36903s0 + this.f36849V;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("");
        sbM1556G.append(this.f36863e0 != null ? outline.m1550A(outline.m1556G("id: "), this.f36863e0, " ") : "");
        sbM1556G.append("(");
        sbM1556G.append(this.f36849V);
        sbM1556G.append(", ");
        sbM1556G.append(this.f36850W);
        sbM1556G.append(") - (");
        sbM1556G.append(this.f36845R);
        sbM1556G.append(" x ");
        return outline.m1603y(sbM1556G, this.f36846S, ")");
    }

    /* JADX INFO: renamed from: u */
    public int m15768u() {
        ConstraintWidget constraintWidget = this.f36844Q;
        return (constraintWidget == null || !(constraintWidget instanceof ConstraintWidgetContainer)) ? this.f36850W : ((ConstraintWidgetContainer) constraintWidget).f36904t0 + this.f36850W;
    }

    /* JADX INFO: renamed from: v */
    public boolean m15769v(int i) {
        if (i == 0) {
            return (this.f36832E.f36814f != null ? 1 : 0) + (this.f36834G.f36814f != null ? 1 : 0) < 2;
        }
        return ((this.f36833F.f36814f != null ? 1 : 0) + (this.f36835H.f36814f != null ? 1 : 0)) + (this.f36836I.f36814f != null ? 1 : 0) < 2;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m15770w(int i) {
        int i2 = i * 2;
        ConstraintAnchor[] constraintAnchorArr = this.f36840M;
        if (constraintAnchorArr[i2].f36814f != null && constraintAnchorArr[i2].f36814f.f36814f != constraintAnchorArr[i2]) {
            int i3 = i2 + 1;
            if (constraintAnchorArr[i3].f36814f != null && constraintAnchorArr[i3].f36814f.f36814f == constraintAnchorArr[i3]) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x */
    public boolean m15771x() {
        ConstraintAnchor constraintAnchor = this.f36832E;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f36814f;
        if (constraintAnchor2 != null && constraintAnchor2.f36814f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f36834G;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f36814f;
        return constraintAnchor4 != null && constraintAnchor4.f36814f == constraintAnchor3;
    }

    /* JADX INFO: renamed from: y */
    public boolean m15772y() {
        ConstraintAnchor constraintAnchor = this.f36833F;
        ConstraintAnchor constraintAnchor2 = constraintAnchor.f36814f;
        if (constraintAnchor2 != null && constraintAnchor2.f36814f == constraintAnchor) {
            return true;
        }
        ConstraintAnchor constraintAnchor3 = this.f36835H;
        ConstraintAnchor constraintAnchor4 = constraintAnchor3.f36814f;
        return constraintAnchor4 != null && constraintAnchor4.f36814f == constraintAnchor3;
    }

    /* JADX INFO: renamed from: z */
    public boolean m15773z() {
        return this.f36866g && this.f36861d0 != 8;
    }

    public ConstraintWidget(String str) {
        this.f36854a = false;
        this.f36860d = null;
        this.f36862e = null;
        this.f36864f = new boolean[]{true, true};
        this.f36866g = true;
        this.f36868h = true;
        this.f36870i = false;
        this.f36872j = false;
        this.f36874k = -1;
        this.f36876l = -1;
        this.f36878m = 0;
        this.f36879n = 0;
        this.f36880o = new int[2];
        this.f36881p = 0;
        this.f36882q = 0;
        this.f36883r = 1.0f;
        this.f36884s = 0;
        this.f36885t = 0;
        this.f36886u = 1.0f;
        this.f36887v = -1;
        this.f36888w = 1.0f;
        this.f36889x = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f36890y = 0.0f;
        this.f36891z = false;
        this.f36829B = false;
        this.f36830C = 0;
        this.f36831D = 0;
        this.f36832E = new ConstraintAnchor(this, ConstraintAnchor.a.LEFT);
        this.f36833F = new ConstraintAnchor(this, ConstraintAnchor.a.TOP);
        this.f36834G = new ConstraintAnchor(this, ConstraintAnchor.a.RIGHT);
        this.f36835H = new ConstraintAnchor(this, ConstraintAnchor.a.BOTTOM);
        this.f36836I = new ConstraintAnchor(this, ConstraintAnchor.a.BASELINE);
        this.f36837J = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER_X);
        this.f36838K = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER);
        this.f36839L = constraintAnchor;
        this.f36840M = new ConstraintAnchor[]{this.f36832E, this.f36834G, this.f36833F, this.f36835H, this.f36836I, constraintAnchor};
        this.f36841N = new ArrayList<>();
        this.f36842O = new boolean[2];
        this.f36843P = new int[]{1, 1};
        this.f36844Q = null;
        this.f36845R = 0;
        this.f36846S = 0;
        this.f36847T = 0.0f;
        this.f36848U = -1;
        this.f36849V = 0;
        this.f36850W = 0;
        this.f36851X = 0;
        this.f36855a0 = 0.5f;
        this.f36857b0 = 0.5f;
        this.f36861d0 = 0;
        this.f36863e0 = null;
        this.f36865f0 = 0;
        this.f36867g0 = 0;
        this.f36869h0 = new float[]{-1.0f, -1.0f};
        this.f36871i0 = new ConstraintWidget[]{null, null};
        this.f36873j0 = new ConstraintWidget[]{null, null};
        this.f36875k0 = -1;
        this.f36877l0 = -1;
        m15751b();
        this.f36863e0 = str;
    }

    public ConstraintWidget(int i, int i2, int i3, int i4) {
        this.f36854a = false;
        this.f36860d = null;
        this.f36862e = null;
        this.f36864f = new boolean[]{true, true};
        this.f36866g = true;
        this.f36868h = true;
        this.f36870i = false;
        this.f36872j = false;
        this.f36874k = -1;
        this.f36876l = -1;
        this.f36878m = 0;
        this.f36879n = 0;
        this.f36880o = new int[2];
        this.f36881p = 0;
        this.f36882q = 0;
        this.f36883r = 1.0f;
        this.f36884s = 0;
        this.f36885t = 0;
        this.f36886u = 1.0f;
        this.f36887v = -1;
        this.f36888w = 1.0f;
        this.f36889x = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f36890y = 0.0f;
        this.f36891z = false;
        this.f36829B = false;
        this.f36830C = 0;
        this.f36831D = 0;
        this.f36832E = new ConstraintAnchor(this, ConstraintAnchor.a.LEFT);
        this.f36833F = new ConstraintAnchor(this, ConstraintAnchor.a.TOP);
        this.f36834G = new ConstraintAnchor(this, ConstraintAnchor.a.RIGHT);
        this.f36835H = new ConstraintAnchor(this, ConstraintAnchor.a.BOTTOM);
        this.f36836I = new ConstraintAnchor(this, ConstraintAnchor.a.BASELINE);
        this.f36837J = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER_X);
        this.f36838K = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER_Y);
        ConstraintAnchor constraintAnchor = new ConstraintAnchor(this, ConstraintAnchor.a.CENTER);
        this.f36839L = constraintAnchor;
        this.f36840M = new ConstraintAnchor[]{this.f36832E, this.f36834G, this.f36833F, this.f36835H, this.f36836I, constraintAnchor};
        this.f36841N = new ArrayList<>();
        this.f36842O = new boolean[2];
        this.f36843P = new int[]{1, 1};
        this.f36844Q = null;
        this.f36845R = 0;
        this.f36846S = 0;
        this.f36847T = 0.0f;
        this.f36848U = -1;
        this.f36849V = 0;
        this.f36850W = 0;
        this.f36851X = 0;
        this.f36855a0 = 0.5f;
        this.f36857b0 = 0.5f;
        this.f36861d0 = 0;
        this.f36863e0 = null;
        this.f36865f0 = 0;
        this.f36867g0 = 0;
        this.f36869h0 = new float[]{-1.0f, -1.0f};
        this.f36871i0 = new ConstraintWidget[]{null, null};
        this.f36873j0 = new ConstraintWidget[]{null, null};
        this.f36875k0 = -1;
        this.f36877l0 = -1;
        this.f36849V = i;
        this.f36850W = i2;
        this.f36845R = i3;
        this.f36846S = i4;
        m15751b();
    }

    public ConstraintWidget(String str, int i, int i2, int i3, int i4) {
        this(i, i2, i3, i4);
        this.f36863e0 = str;
    }

    public ConstraintWidget(int i, int i2) {
        this(0, 0, i, i2);
    }

    public ConstraintWidget(String str, int i, int i2) {
        this(i, i2);
        this.f36863e0 = str;
    }
}
