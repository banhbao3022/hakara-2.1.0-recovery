package p636z0.p697i.p700b.p701h.p702n;

import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.Guideline2;

/* JADX INFO: renamed from: z0.i.b.h.n.j, reason: use source file name */
/* JADX INFO: compiled from: GuidelineReference.java */
/* JADX INFO: loaded from: classes.dex */
public class GuidelineReference extends WidgetRun {
    public GuidelineReference(ConstraintWidget constraintWidget) {
        super(constraintWidget);
        constraintWidget.f36860d.mo15797f();
        constraintWidget.f36862e.mo15797f();
        this.f37006f = ((Guideline2) constraintWidget).f36936q0;
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun, p636z0.p697i.p700b.p701h.p702n.Dependency2
    /* JADX INFO: renamed from: a */
    public void mo15794a(Dependency2 dependency2) {
        DependencyNode dependencyNode = this.f37008h;
        if (dependencyNode.f36968c && !dependencyNode.f36975j) {
            this.f37008h.mo15810c((int) ((dependencyNode.f36977l.get(0).f36972g * ((Guideline2) this.f37002b).f36932m0) + 0.5f));
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: d */
    public void mo15795d() {
        ConstraintWidget constraintWidget = this.f37002b;
        Guideline2 guideline2 = (Guideline2) constraintWidget;
        int i = guideline2.f36933n0;
        int i2 = guideline2.f36934o0;
        if (guideline2.f36936q0 == 1) {
            if (i != -1) {
                this.f37008h.f36977l.add(constraintWidget.f36844Q.f36860d.f37008h);
                this.f37002b.f36844Q.f36860d.f37008h.f36976k.add(this.f37008h);
                this.f37008h.f36971f = i;
            } else if (i2 != -1) {
                this.f37008h.f36977l.add(constraintWidget.f36844Q.f36860d.f37009i);
                this.f37002b.f36844Q.f36860d.f37009i.f36976k.add(this.f37008h);
                this.f37008h.f36971f = -i2;
            } else {
                DependencyNode dependencyNode = this.f37008h;
                dependencyNode.f36967b = true;
                dependencyNode.f36977l.add(constraintWidget.f36844Q.f36860d.f37009i);
                this.f37002b.f36844Q.f36860d.f37009i.f36976k.add(this.f37008h);
            }
            m15821m(this.f37002b.f36860d.f37008h);
            m15821m(this.f37002b.f36860d.f37009i);
            return;
        }
        if (i != -1) {
            this.f37008h.f36977l.add(constraintWidget.f36844Q.f36862e.f37008h);
            this.f37002b.f36844Q.f36862e.f37008h.f36976k.add(this.f37008h);
            this.f37008h.f36971f = i;
        } else if (i2 != -1) {
            this.f37008h.f36977l.add(constraintWidget.f36844Q.f36862e.f37009i);
            this.f37002b.f36844Q.f36862e.f37009i.f36976k.add(this.f37008h);
            this.f37008h.f36971f = -i2;
        } else {
            DependencyNode dependencyNode2 = this.f37008h;
            dependencyNode2.f36967b = true;
            dependencyNode2.f36977l.add(constraintWidget.f36844Q.f36862e.f37009i);
            this.f37002b.f36844Q.f36862e.f37009i.f36976k.add(this.f37008h);
        }
        m15821m(this.f37002b.f36862e.f37008h);
        m15821m(this.f37002b.f36862e.f37009i);
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: e */
    public void mo15796e() {
        ConstraintWidget constraintWidget = this.f37002b;
        if (((Guideline2) constraintWidget).f36936q0 == 1) {
            constraintWidget.f36849V = this.f37008h.f36972g;
        } else {
            constraintWidget.f36850W = this.f37008h.f36972g;
        }
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: f */
    public void mo15797f() {
        this.f37008h.m15809b();
    }

    @Override // p636z0.p697i.p700b.p701h.p702n.WidgetRun
    /* JADX INFO: renamed from: k */
    public boolean mo15799k() {
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m15821m(DependencyNode dependencyNode) {
        this.f37008h.f36976k.add(dependencyNode);
        dependencyNode.f36977l.add(this.f37008h);
    }
}
