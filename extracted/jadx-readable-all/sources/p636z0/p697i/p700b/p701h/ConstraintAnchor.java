package p636z0.p697i.p700b.p701h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p636z0.p697i.p700b.SolverVariable;
import p636z0.p697i.p700b.p701h.p702n.Grouping;
import p636z0.p697i.p700b.p701h.p702n.WidgetGroup;

/* JADX INFO: renamed from: z0.i.b.h.d, reason: use source file name */
/* JADX INFO: compiled from: ConstraintAnchor.java */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintAnchor {

    /* JADX INFO: renamed from: b */
    public int f36810b;

    /* JADX INFO: renamed from: c */
    public boolean f36811c;

    /* JADX INFO: renamed from: d */
    public final ConstraintWidget f36812d;

    /* JADX INFO: renamed from: e */
    public final a f36813e;

    /* JADX INFO: renamed from: f */
    public ConstraintAnchor f36814f;

    /* JADX INFO: renamed from: i */
    public SolverVariable f36817i;

    /* JADX INFO: renamed from: a */
    public HashSet<ConstraintAnchor> f36809a = null;

    /* JADX INFO: renamed from: g */
    public int f36815g = 0;

    /* JADX INFO: renamed from: h */
    public int f36816h = -1;

    /* JADX INFO: renamed from: z0.i.b.h.d$a */
    /* JADX INFO: compiled from: ConstraintAnchor.java */
    public enum a {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, a aVar) {
        this.f36812d = constraintWidget;
        this.f36813e = aVar;
    }

    /* JADX INFO: renamed from: a */
    public boolean m15725a(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            m15734j();
            return true;
        }
        if (!z && !m15733i(constraintAnchor)) {
            return false;
        }
        this.f36814f = constraintAnchor;
        if (constraintAnchor.f36809a == null) {
            constraintAnchor.f36809a = new HashSet<>();
        }
        HashSet<ConstraintAnchor> hashSet = this.f36814f.f36809a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i > 0) {
            this.f36815g = i;
        } else {
            this.f36815g = 0;
        }
        this.f36816h = i2;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m15726b(int i, ArrayList<WidgetGroup> arrayList, WidgetGroup widgetGroup) {
        HashSet<ConstraintAnchor> hashSet = this.f36809a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                Grouping.m15818a(it.next().f36812d, i, arrayList, widgetGroup);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public int m15727c() {
        if (this.f36811c) {
            return this.f36810b;
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m15728d() {
        ConstraintAnchor constraintAnchor;
        if (this.f36812d.f36861d0 == 8) {
            return 0;
        }
        int i = this.f36816h;
        return (i <= -1 || (constraintAnchor = this.f36814f) == null || constraintAnchor.f36812d.f36861d0 != 8) ? this.f36815g : i;
    }

    /* JADX INFO: renamed from: e */
    public final ConstraintAnchor m15729e() {
        switch (this.f36813e) {
            case NONE:
            case BASELINE:
            case CENTER:
            case CENTER_X:
            case CENTER_Y:
                return null;
            case LEFT:
                return this.f36812d.f36834G;
            case TOP:
                return this.f36812d.f36835H;
            case RIGHT:
                return this.f36812d.f36832E;
            case BOTTOM:
                return this.f36812d.f36833F;
            default:
                throw new AssertionError(this.f36813e.name());
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m15730f() {
        HashSet<ConstraintAnchor> hashSet = this.f36809a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().m15729e().m15732h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public boolean m15731g() {
        HashSet<ConstraintAnchor> hashSet = this.f36809a;
        return hashSet != null && hashSet.size() > 0;
    }

    /* JADX INFO: renamed from: h */
    public boolean m15732h() {
        return this.f36814f != null;
    }

    /* JADX INFO: renamed from: i */
    public boolean m15733i(ConstraintAnchor constraintAnchor) {
        a aVar = a.CENTER_Y;
        a aVar2 = a.CENTER_X;
        a aVar3 = a.BASELINE;
        if (constraintAnchor == null) {
            return false;
        }
        a aVar4 = constraintAnchor.f36813e;
        a aVar5 = this.f36813e;
        if (aVar4 == aVar5) {
            return aVar5 != aVar3 || (constraintAnchor.f36812d.f36891z && this.f36812d.f36891z);
        }
        switch (aVar5) {
            case NONE:
            case BASELINE:
            case CENTER_X:
            case CENTER_Y:
                return false;
            case LEFT:
            case RIGHT:
                boolean z = aVar4 == a.LEFT || aVar4 == a.RIGHT;
                if (constraintAnchor.f36812d instanceof Guideline2) {
                    return z || aVar4 == aVar2;
                }
                return z;
            case TOP:
            case BOTTOM:
                boolean z2 = aVar4 == a.TOP || aVar4 == a.BOTTOM;
                if (constraintAnchor.f36812d instanceof Guideline2) {
                    return z2 || aVar4 == aVar;
                }
                return z2;
            case CENTER:
                return (aVar4 == aVar3 || aVar4 == aVar2 || aVar4 == aVar) ? false : true;
            default:
                throw new AssertionError(this.f36813e.name());
        }
    }

    /* JADX INFO: renamed from: j */
    public void m15734j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f36814f;
        if (constraintAnchor != null && (hashSet = constraintAnchor.f36809a) != null) {
            hashSet.remove(this);
            if (this.f36814f.f36809a.size() == 0) {
                this.f36814f.f36809a = null;
            }
        }
        this.f36809a = null;
        this.f36814f = null;
        this.f36815g = 0;
        this.f36816h = -1;
        this.f36811c = false;
        this.f36810b = 0;
    }

    /* JADX INFO: renamed from: k */
    public void m15735k() {
        SolverVariable solverVariable = this.f36817i;
        if (solverVariable == null) {
            this.f36817i = new SolverVariable(SolverVariable.a.UNRESTRICTED, (String) null);
        } else {
            solverVariable.m15715c();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m15736l(int i) {
        this.f36810b = i;
        this.f36811c = true;
    }

    public String toString() {
        return this.f36812d.f36863e0 + ":" + this.f36813e.toString();
    }
}
