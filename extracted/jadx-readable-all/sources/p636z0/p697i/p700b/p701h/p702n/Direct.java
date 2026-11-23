package p636z0.p697i.p700b.p701h.p702n;

import java.util.HashSet;
import java.util.Iterator;
import p636z0.p697i.p700b.p701h.ConstraintAnchor;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.ConstraintWidgetContainer;
import p636z0.p697i.p700b.p701h.Guideline2;

/* JADX INFO: renamed from: z0.i.b.h.n.h, reason: use source file name */
/* JADX INFO: compiled from: Direct.java */
/* JADX INFO: loaded from: classes.dex */
public class Direct {

    /* JADX INFO: renamed from: a */
    public static BasicMeasure.a f36988a = new BasicMeasure.a();

    /* JADX INFO: renamed from: a */
    public static boolean m15811a(ConstraintWidget constraintWidget) {
        int iM15761n = constraintWidget.m15761n();
        int iM15765r = constraintWidget.m15765r();
        ConstraintWidget constraintWidget2 = constraintWidget.f36844Q;
        ConstraintWidgetContainer constraintWidgetContainer = constraintWidget2 != null ? (ConstraintWidgetContainer) constraintWidget2 : null;
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.m15761n();
        }
        if (constraintWidgetContainer != null) {
            constraintWidgetContainer.m15765r();
        }
        boolean z = iM15761n == 1 || iM15761n == 2 || (iM15761n == 3 && constraintWidget.f36878m == 0 && constraintWidget.f36847T == 0.0f && constraintWidget.m15769v(0)) || constraintWidget.mo15718A();
        boolean z2 = iM15765r == 1 || iM15765r == 2 || (iM15765r == 3 && constraintWidget.f36879n == 0 && constraintWidget.f36847T == 0.0f && constraintWidget.m15769v(1)) || constraintWidget.mo15719B();
        if (constraintWidget.f36847T <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static void m15812b(ConstraintWidget constraintWidget, BasicMeasure.b bVar, boolean z) {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.m15773z() && m15811a(constraintWidget)) {
            ConstraintWidgetContainer.m15774Y(constraintWidget, bVar, new BasicMeasure.a(), 0);
        }
        ConstraintAnchor constraintAnchorMo15757j = constraintWidget.mo15757j(ConstraintAnchor.a.LEFT);
        ConstraintAnchor constraintAnchorMo15757j2 = constraintWidget.mo15757j(ConstraintAnchor.a.RIGHT);
        int iM15727c = constraintAnchorMo15757j.m15727c();
        int iM15727c2 = constraintAnchorMo15757j2.m15727c();
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorMo15757j.f36809a;
        if (hashSet2 != null && constraintAnchorMo15757j.f36811c) {
            Iterator<ConstraintAnchor> it = hashSet2.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f36812d;
                boolean zM15811a = m15811a(constraintWidget2);
                if (constraintWidget2.m15773z() && zM15811a) {
                    ConstraintWidgetContainer.m15774Y(constraintWidget2, bVar, new BasicMeasure.a(), 0);
                }
                if (constraintWidget2.m15761n() != 3 || zM15811a) {
                    if (!constraintWidget2.m15773z()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f36832E;
                        if (next == constraintAnchor6 && constraintWidget2.f36834G.f36814f == null) {
                            int iM15728d = constraintAnchor6.m15728d() + iM15727c;
                            constraintWidget2.m15741G(iM15728d, constraintWidget2.m15766s() + iM15728d);
                            m15812b(constraintWidget2, bVar, z);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.f36834G;
                            if (next == constraintAnchor7 && constraintAnchor6.f36814f == null) {
                                int iM15728d2 = iM15727c - constraintAnchor7.m15728d();
                                constraintWidget2.m15741G(iM15728d2 - constraintWidget2.m15766s(), iM15728d2);
                                m15812b(constraintWidget2, bVar, z);
                            } else if (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor7.f36814f) != null && constraintAnchor3.f36811c && !constraintWidget2.m15771x()) {
                                m15813c(bVar, constraintWidget2, z);
                            }
                        }
                    }
                } else if (constraintWidget2.m15761n() == 3 && constraintWidget2.f36882q >= 0 && constraintWidget2.f36881p >= 0 && (constraintWidget2.f36861d0 == 8 || (constraintWidget2.f36878m == 0 && constraintWidget2.f36847T == 0.0f))) {
                    if (!constraintWidget2.m15771x() && !constraintWidget2.f36829B) {
                        ConstraintAnchor constraintAnchor8 = constraintWidget2.f36832E;
                        if (((next == constraintAnchor8 && (constraintAnchor5 = constraintWidget2.f36834G.f36814f) != null && constraintAnchor5.f36811c) || (next == constraintWidget2.f36834G && (constraintAnchor4 = constraintAnchor8.f36814f) != null && constraintAnchor4.f36811c)) && !constraintWidget2.m15771x()) {
                            m15814d(constraintWidget, bVar, constraintWidget2, z);
                        }
                    }
                }
            }
        }
        if ((constraintWidget instanceof Guideline2) || (hashSet = constraintAnchorMo15757j2.f36809a) == null || !constraintAnchorMo15757j2.f36811c) {
            return;
        }
        Iterator<ConstraintAnchor> it2 = hashSet.iterator();
        while (it2.hasNext()) {
            ConstraintAnchor next2 = it2.next();
            ConstraintWidget constraintWidget3 = next2.f36812d;
            boolean zM15811a2 = m15811a(constraintWidget3);
            if (constraintWidget3.m15773z() && zM15811a2) {
                ConstraintWidgetContainer.m15774Y(constraintWidget3, bVar, new BasicMeasure.a(), 0);
            }
            ConstraintAnchor constraintAnchor9 = constraintWidget3.f36832E;
            boolean z2 = (next2 == constraintAnchor9 && (constraintAnchor2 = constraintWidget3.f36834G.f36814f) != null && constraintAnchor2.f36811c) || (next2 == constraintWidget3.f36834G && (constraintAnchor = constraintAnchor9.f36814f) != null && constraintAnchor.f36811c);
            if (constraintWidget3.m15761n() != 3 || zM15811a2) {
                if (!constraintWidget3.m15773z()) {
                    ConstraintAnchor constraintAnchor10 = constraintWidget3.f36832E;
                    if (next2 == constraintAnchor10 && constraintWidget3.f36834G.f36814f == null) {
                        int iM15728d3 = constraintAnchor10.m15728d() + iM15727c2;
                        constraintWidget3.m15741G(iM15728d3, constraintWidget3.m15766s() + iM15728d3);
                        m15812b(constraintWidget3, bVar, z);
                    } else {
                        ConstraintAnchor constraintAnchor11 = constraintWidget3.f36834G;
                        if (next2 == constraintAnchor11 && constraintAnchor10.f36814f == null) {
                            int iM15728d4 = iM15727c2 - constraintAnchor11.m15728d();
                            constraintWidget3.m15741G(iM15728d4 - constraintWidget3.m15766s(), iM15728d4);
                            m15812b(constraintWidget3, bVar, z);
                        } else if (z2 && !constraintWidget3.m15771x()) {
                            m15813c(bVar, constraintWidget3, z);
                        }
                    }
                }
            } else if (constraintWidget3.m15761n() == 3 && constraintWidget3.f36882q >= 0 && constraintWidget3.f36881p >= 0 && (constraintWidget3.f36861d0 == 8 || (constraintWidget3.f36878m == 0 && constraintWidget3.f36847T == 0.0f))) {
                if (!constraintWidget3.m15771x() && !constraintWidget3.f36829B && z2 && !constraintWidget3.m15771x()) {
                    m15814d(constraintWidget, bVar, constraintWidget3, z);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15813c(BasicMeasure.b bVar, ConstraintWidget constraintWidget, boolean z) {
        float f = constraintWidget.f36855a0;
        int iM15727c = constraintWidget.f36832E.f36814f.m15727c();
        int iM15727c2 = constraintWidget.f36834G.f36814f.m15727c();
        int iM15728d = constraintWidget.f36832E.m15728d() + iM15727c;
        int iM15728d2 = iM15727c2 - constraintWidget.f36834G.m15728d();
        if (iM15727c == iM15727c2) {
            f = 0.5f;
        } else {
            iM15727c = iM15728d;
            iM15727c2 = iM15728d2;
        }
        int iM15766s = constraintWidget.m15766s();
        int i = (iM15727c2 - iM15727c) - iM15766s;
        if (iM15727c > iM15727c2) {
            i = (iM15727c - iM15727c2) - iM15766s;
        }
        int i2 = ((int) ((f * i) + 0.5f)) + iM15727c;
        int i3 = i2 + iM15766s;
        if (iM15727c > iM15727c2) {
            i3 = i2 - iM15766s;
        }
        constraintWidget.m15741G(i2, i3);
        m15812b(constraintWidget, bVar, z);
    }

    /* JADX INFO: renamed from: d */
    public static void m15814d(ConstraintWidget constraintWidget, BasicMeasure.b bVar, ConstraintWidget constraintWidget2, boolean z) {
        float f = constraintWidget2.f36855a0;
        int iM15728d = constraintWidget2.f36832E.m15728d() + constraintWidget2.f36832E.f36814f.m15727c();
        int iM15727c = constraintWidget2.f36834G.f36814f.m15727c() - constraintWidget2.f36834G.m15728d();
        if (iM15727c >= iM15728d) {
            int iM15766s = constraintWidget2.m15766s();
            if (constraintWidget2.f36861d0 != 8) {
                int i = constraintWidget2.f36878m;
                if (i == 2) {
                    iM15766s = (int) (constraintWidget2.f36855a0 * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.m15766s() : constraintWidget.f36844Q.m15766s()));
                } else if (i == 0) {
                    iM15766s = iM15727c - iM15728d;
                }
                iM15766s = Math.max(constraintWidget2.f36881p, iM15766s);
                int i2 = constraintWidget2.f36882q;
                if (i2 > 0) {
                    iM15766s = Math.min(i2, iM15766s);
                }
            }
            int i3 = iM15728d + ((int) ((f * ((iM15727c - iM15728d) - iM15766s)) + 0.5f));
            constraintWidget2.m15741G(i3, iM15766s + i3);
            m15812b(constraintWidget2, bVar, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m15815e(BasicMeasure.b bVar, ConstraintWidget constraintWidget) {
        float f = constraintWidget.f36857b0;
        int iM15727c = constraintWidget.f36833F.f36814f.m15727c();
        int iM15727c2 = constraintWidget.f36835H.f36814f.m15727c();
        int iM15728d = constraintWidget.f36833F.m15728d() + iM15727c;
        int iM15728d2 = iM15727c2 - constraintWidget.f36835H.m15728d();
        if (iM15727c == iM15727c2) {
            f = 0.5f;
        } else {
            iM15727c = iM15728d;
            iM15727c2 = iM15728d2;
        }
        int iM15760m = constraintWidget.m15760m();
        int i = (iM15727c2 - iM15727c) - iM15760m;
        if (iM15727c > iM15727c2) {
            i = (iM15727c - iM15727c2) - iM15760m;
        }
        int i2 = (int) ((f * i) + 0.5f);
        int i3 = iM15727c + i2;
        int i4 = i3 + iM15760m;
        if (iM15727c > iM15727c2) {
            i3 = iM15727c - i2;
            i4 = i3 - iM15760m;
        }
        constraintWidget.m15742H(i3, i4);
        m15817g(constraintWidget, bVar);
    }

    /* JADX INFO: renamed from: f */
    public static void m15816f(ConstraintWidget constraintWidget, BasicMeasure.b bVar, ConstraintWidget constraintWidget2) {
        float f = constraintWidget2.f36857b0;
        int iM15728d = constraintWidget2.f36833F.m15728d() + constraintWidget2.f36833F.f36814f.m15727c();
        int iM15727c = constraintWidget2.f36835H.f36814f.m15727c() - constraintWidget2.f36835H.m15728d();
        if (iM15727c >= iM15728d) {
            int iM15760m = constraintWidget2.m15760m();
            if (constraintWidget2.f36861d0 != 8) {
                int i = constraintWidget2.f36879n;
                if (i == 2) {
                    iM15760m = (int) (f * 0.5f * (constraintWidget instanceof ConstraintWidgetContainer ? constraintWidget.m15760m() : constraintWidget.f36844Q.m15760m()));
                } else if (i == 0) {
                    iM15760m = iM15727c - iM15728d;
                }
                iM15760m = Math.max(constraintWidget2.f36884s, iM15760m);
                int i2 = constraintWidget2.f36885t;
                if (i2 > 0) {
                    iM15760m = Math.min(i2, iM15760m);
                }
            }
            int i3 = iM15728d + ((int) ((f * ((iM15727c - iM15728d) - iM15760m)) + 0.5f));
            constraintWidget2.m15742H(i3, iM15760m + i3);
            m15817g(constraintWidget2, bVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m15817g(ConstraintWidget constraintWidget, BasicMeasure.b bVar) {
        ConstraintAnchor constraintAnchor;
        ConstraintAnchor constraintAnchor2;
        ConstraintAnchor constraintAnchor3;
        ConstraintAnchor constraintAnchor4;
        ConstraintAnchor constraintAnchor5;
        if (!(constraintWidget instanceof ConstraintWidgetContainer) && constraintWidget.m15773z() && m15811a(constraintWidget)) {
            ConstraintWidgetContainer.m15774Y(constraintWidget, bVar, new BasicMeasure.a(), 0);
        }
        ConstraintAnchor constraintAnchorMo15757j = constraintWidget.mo15757j(ConstraintAnchor.a.TOP);
        ConstraintAnchor constraintAnchorMo15757j2 = constraintWidget.mo15757j(ConstraintAnchor.a.BOTTOM);
        int iM15727c = constraintAnchorMo15757j.m15727c();
        int iM15727c2 = constraintAnchorMo15757j2.m15727c();
        HashSet<ConstraintAnchor> hashSet = constraintAnchorMo15757j.f36809a;
        if (hashSet != null && constraintAnchorMo15757j.f36811c) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintAnchor next = it.next();
                ConstraintWidget constraintWidget2 = next.f36812d;
                boolean zM15811a = m15811a(constraintWidget2);
                if (constraintWidget2.m15773z() && zM15811a) {
                    ConstraintWidgetContainer.m15774Y(constraintWidget2, bVar, new BasicMeasure.a(), 0);
                }
                if (constraintWidget2.m15765r() != 3 || zM15811a) {
                    if (!constraintWidget2.m15773z()) {
                        ConstraintAnchor constraintAnchor6 = constraintWidget2.f36833F;
                        if (next == constraintAnchor6 && constraintWidget2.f36835H.f36814f == null) {
                            int iM15728d = constraintAnchor6.m15728d() + iM15727c;
                            constraintWidget2.m15742H(iM15728d, constraintWidget2.m15760m() + iM15728d);
                            m15817g(constraintWidget2, bVar);
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintWidget2.f36835H;
                            if (next == constraintAnchor7 && constraintAnchor7.f36814f == null) {
                                int iM15728d2 = iM15727c - constraintAnchor7.m15728d();
                                constraintWidget2.m15742H(iM15728d2 - constraintWidget2.m15760m(), iM15728d2);
                                m15817g(constraintWidget2, bVar);
                            } else if (next == constraintAnchor6 && (constraintAnchor3 = constraintAnchor7.f36814f) != null && constraintAnchor3.f36811c) {
                                m15815e(bVar, constraintWidget2);
                            }
                        }
                    }
                } else if (constraintWidget2.m15765r() == 3 && constraintWidget2.f36885t >= 0 && constraintWidget2.f36884s >= 0 && (constraintWidget2.f36861d0 == 8 || (constraintWidget2.f36879n == 0 && constraintWidget2.f36847T == 0.0f))) {
                    if (!constraintWidget2.m15772y() && !constraintWidget2.f36829B) {
                        ConstraintAnchor constraintAnchor8 = constraintWidget2.f36833F;
                        if (((next == constraintAnchor8 && (constraintAnchor5 = constraintWidget2.f36835H.f36814f) != null && constraintAnchor5.f36811c) || (next == constraintWidget2.f36835H && (constraintAnchor4 = constraintAnchor8.f36814f) != null && constraintAnchor4.f36811c)) && !constraintWidget2.m15772y()) {
                            m15816f(constraintWidget, bVar, constraintWidget2);
                        }
                    }
                }
            }
        }
        if (constraintWidget instanceof Guideline2) {
            return;
        }
        HashSet<ConstraintAnchor> hashSet2 = constraintAnchorMo15757j2.f36809a;
        if (hashSet2 != null && constraintAnchorMo15757j2.f36811c) {
            Iterator<ConstraintAnchor> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ConstraintAnchor next2 = it2.next();
                ConstraintWidget constraintWidget3 = next2.f36812d;
                boolean zM15811a2 = m15811a(constraintWidget3);
                if (constraintWidget3.m15773z() && zM15811a2) {
                    ConstraintWidgetContainer.m15774Y(constraintWidget3, bVar, new BasicMeasure.a(), 0);
                }
                ConstraintAnchor constraintAnchor9 = constraintWidget3.f36833F;
                boolean z = (next2 == constraintAnchor9 && (constraintAnchor2 = constraintWidget3.f36835H.f36814f) != null && constraintAnchor2.f36811c) || (next2 == constraintWidget3.f36835H && (constraintAnchor = constraintAnchor9.f36814f) != null && constraintAnchor.f36811c);
                if (constraintWidget3.m15765r() != 3 || zM15811a2) {
                    if (!constraintWidget3.m15773z()) {
                        ConstraintAnchor constraintAnchor10 = constraintWidget3.f36833F;
                        if (next2 == constraintAnchor10 && constraintWidget3.f36835H.f36814f == null) {
                            int iM15728d3 = constraintAnchor10.m15728d() + iM15727c2;
                            constraintWidget3.m15742H(iM15728d3, constraintWidget3.m15760m() + iM15728d3);
                            m15817g(constraintWidget3, bVar);
                        } else {
                            ConstraintAnchor constraintAnchor11 = constraintWidget3.f36835H;
                            if (next2 == constraintAnchor11 && constraintAnchor10.f36814f == null) {
                                int iM15728d4 = iM15727c2 - constraintAnchor11.m15728d();
                                constraintWidget3.m15742H(iM15728d4 - constraintWidget3.m15760m(), iM15728d4);
                                m15817g(constraintWidget3, bVar);
                            } else if (z && !constraintWidget3.m15772y()) {
                                m15815e(bVar, constraintWidget3);
                            }
                        }
                    }
                } else if (constraintWidget3.m15765r() == 3 && constraintWidget3.f36885t >= 0 && constraintWidget3.f36884s >= 0 && (constraintWidget3.f36861d0 == 8 || (constraintWidget3.f36879n == 0 && constraintWidget3.f36847T == 0.0f))) {
                    if (!constraintWidget3.m15772y() && !constraintWidget3.f36829B && z && !constraintWidget3.m15772y()) {
                        m15816f(constraintWidget, bVar, constraintWidget3);
                    }
                }
            }
        }
        ConstraintAnchor constraintAnchorMo15757j3 = constraintWidget.mo15757j(ConstraintAnchor.a.BASELINE);
        if (constraintAnchorMo15757j3.f36809a == null || !constraintAnchorMo15757j3.f36811c) {
            return;
        }
        int iM15727c3 = constraintAnchorMo15757j3.m15727c();
        for (ConstraintAnchor constraintAnchor12 : constraintAnchorMo15757j3.f36809a) {
            ConstraintWidget constraintWidget4 = constraintAnchor12.f36812d;
            boolean zM15811a3 = m15811a(constraintWidget4);
            if (constraintWidget4.m15773z() && zM15811a3) {
                ConstraintWidgetContainer.m15774Y(constraintWidget4, bVar, new BasicMeasure.a(), 0);
            }
            if (constraintWidget4.m15765r() != 3 || zM15811a3) {
                if (!constraintWidget4.m15773z() && constraintAnchor12 == constraintWidget4.f36836I) {
                    if (constraintWidget4.f36891z) {
                        int i = iM15727c3 - constraintWidget4.f36851X;
                        int i2 = constraintWidget4.f36846S + i;
                        constraintWidget4.f36850W = i;
                        constraintWidget4.f36833F.m15736l(i);
                        constraintWidget4.f36835H.m15736l(i2);
                        ConstraintAnchor constraintAnchor13 = constraintWidget4.f36836I;
                        constraintAnchor13.f36810b = iM15727c3;
                        constraintAnchor13.f36811c = true;
                        constraintWidget4.f36872j = true;
                    }
                    m15817g(constraintWidget4, bVar);
                }
            }
        }
    }
}
