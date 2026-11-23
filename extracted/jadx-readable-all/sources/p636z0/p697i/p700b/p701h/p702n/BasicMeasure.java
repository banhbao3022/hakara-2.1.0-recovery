package p636z0.p697i.p700b.p701h.p702n;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.ConstraintWidgetContainer;

/* JADX INFO: renamed from: z0.i.b.h.n.b, reason: use source file name */
/* JADX INFO: compiled from: BasicMeasure.java */
/* JADX INFO: loaded from: classes.dex */
public class BasicMeasure {

    /* JADX INFO: renamed from: a */
    public final ArrayList<ConstraintWidget> f36943a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public a f36944b = new a();

    /* JADX INFO: renamed from: c */
    public ConstraintWidgetContainer f36945c;

    /* JADX INFO: renamed from: z0.i.b.h.n.b$a */
    /* JADX INFO: compiled from: BasicMeasure.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f36946a;

        /* JADX INFO: renamed from: b */
        public int f36947b;

        /* JADX INFO: renamed from: c */
        public int f36948c;

        /* JADX INFO: renamed from: d */
        public int f36949d;

        /* JADX INFO: renamed from: e */
        public int f36950e;

        /* JADX INFO: renamed from: f */
        public int f36951f;

        /* JADX INFO: renamed from: g */
        public int f36952g;

        /* JADX INFO: renamed from: h */
        public boolean f36953h;

        /* JADX INFO: renamed from: i */
        public boolean f36954i;

        /* JADX INFO: renamed from: j */
        public int f36955j;
    }

    /* JADX INFO: renamed from: z0.i.b.h.n.b$b */
    /* JADX INFO: compiled from: BasicMeasure.java */
    public interface b {
    }

    public BasicMeasure(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f36945c = constraintWidgetContainer;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m15791a(b bVar, ConstraintWidget constraintWidget, int i) {
        this.f36944b.f36946a = constraintWidget.m15761n();
        this.f36944b.f36947b = constraintWidget.m15765r();
        this.f36944b.f36948c = constraintWidget.m15766s();
        this.f36944b.f36949d = constraintWidget.m15760m();
        a aVar = this.f36944b;
        aVar.f36954i = false;
        aVar.f36955j = i;
        boolean z = aVar.f36946a == 3;
        boolean z2 = aVar.f36947b == 3;
        boolean z3 = z && constraintWidget.f36847T > 0.0f;
        boolean z4 = z2 && constraintWidget.f36847T > 0.0f;
        if (z3 && constraintWidget.f36880o[0] == 4) {
            aVar.f36946a = 1;
        }
        if (z4 && constraintWidget.f36880o[1] == 4) {
            aVar.f36947b = 1;
        }
        ((ConstraintLayout.C0095b) bVar).m286b(constraintWidget, aVar);
        constraintWidget.m15748N(this.f36944b.f36950e);
        constraintWidget.m15743I(this.f36944b.f36951f);
        a aVar2 = this.f36944b;
        constraintWidget.f36891z = aVar2.f36953h;
        constraintWidget.m15740F(aVar2.f36952g);
        a aVar3 = this.f36944b;
        aVar3.f36955j = 0;
        return aVar3.f36954i;
    }

    /* JADX INFO: renamed from: b */
    public final void m15792b(ConstraintWidgetContainer constraintWidgetContainer, int i, int i2) {
        int i3 = constraintWidgetContainer.f36852Y;
        int i4 = constraintWidgetContainer.f36853Z;
        constraintWidgetContainer.m15746L(0);
        constraintWidgetContainer.m15745K(0);
        constraintWidgetContainer.f36845R = i;
        int i5 = constraintWidgetContainer.f36852Y;
        if (i < i5) {
            constraintWidgetContainer.f36845R = i5;
        }
        constraintWidgetContainer.f36846S = i2;
        int i6 = constraintWidgetContainer.f36853Z;
        if (i2 < i6) {
            constraintWidgetContainer.f36846S = i6;
        }
        constraintWidgetContainer.m15746L(i3);
        constraintWidgetContainer.m15745K(i4);
        this.f36945c.mo15775Q();
    }

    /* JADX INFO: renamed from: c */
    public void m15793c(ConstraintWidgetContainer constraintWidgetContainer) {
        this.f36943a.clear();
        int size = constraintWidgetContainer.f36942m0.size();
        for (int i = 0; i < size; i++) {
            ConstraintWidget constraintWidget = constraintWidgetContainer.f36942m0.get(i);
            if (constraintWidget.m15761n() == 3 || constraintWidget.m15765r() == 3) {
                this.f36943a.add(constraintWidget);
            }
        }
        constraintWidgetContainer.m15782X();
    }
}
