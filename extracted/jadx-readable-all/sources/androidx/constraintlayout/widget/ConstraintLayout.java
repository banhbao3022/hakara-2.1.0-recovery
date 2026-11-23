package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p697i.p700b.LinearSystem;
import p636z0.p697i.p700b.p701h.Barrier2;
import p636z0.p697i.p700b.p701h.ConstraintAnchor;
import p636z0.p697i.p700b.p701h.ConstraintWidget;
import p636z0.p697i.p700b.p701h.ConstraintWidgetContainer;
import p636z0.p697i.p700b.p701h.Guideline2;
import p636z0.p697i.p700b.p701h.Helper;
import p636z0.p697i.p700b.p701h.HelperWidget;
import p636z0.p697i.p700b.p701h.Optimizer;
import p636z0.p697i.p700b.p701h.VirtualLayout;
import p636z0.p697i.p700b.p701h.WidgetContainer;
import p636z0.p697i.p700b.p701h.p702n.BasicMeasure;
import p636z0.p697i.p700b.p701h.p702n.ChainRun;
import p636z0.p697i.p700b.p701h.p702n.DependencyGraph;
import p636z0.p697i.p700b.p701h.p702n.GuidelineReference;
import p636z0.p697i.p700b.p701h.p702n.HorizontalWidgetRun;
import p636z0.p697i.p700b.p701h.p702n.VerticalWidgetRun;
import p636z0.p697i.p700b.p701h.p702n.WidgetRun;
import p636z0.p697i.p703c.C8022i;
import p636z0.p697i.p703c.ConstraintHelper;
import p636z0.p697i.p703c.ConstraintLayoutStates;
import p636z0.p697i.p703c.ConstraintSet;
import p636z0.p697i.p703c.Constraints;
import p636z0.p697i.p703c.ConstraintsChangedListener;
import p636z0.p697i.p703c.Placeholder;
import p636z0.p697i.p703c.VirtualLayout2;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: f */
    public SparseArray<View> f523f;

    /* JADX INFO: renamed from: g */
    public ArrayList<ConstraintHelper> f524g;

    /* JADX INFO: renamed from: h */
    public ConstraintWidgetContainer f525h;

    /* JADX INFO: renamed from: i */
    public int f526i;

    /* JADX INFO: renamed from: j */
    public int f527j;

    /* JADX INFO: renamed from: k */
    public int f528k;

    /* JADX INFO: renamed from: l */
    public int f529l;

    /* JADX INFO: renamed from: m */
    public boolean f530m;

    /* JADX INFO: renamed from: n */
    public int f531n;

    /* JADX INFO: renamed from: o */
    public ConstraintSet f532o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayoutStates f533p;

    /* JADX INFO: renamed from: q */
    public int f534q;

    /* JADX INFO: renamed from: r */
    public HashMap<String, Integer> f535r;

    /* JADX INFO: renamed from: s */
    public int f536s;

    /* JADX INFO: renamed from: t */
    public int f537t;

    /* JADX INFO: renamed from: u */
    public SparseArray<ConstraintWidget> f538u;

    /* JADX INFO: renamed from: v */
    public C0095b f539v;

    /* JADX INFO: renamed from: w */
    public int f540w;

    /* JADX INFO: renamed from: x */
    public int f541x;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0095b implements BasicMeasure.b {

        /* JADX INFO: renamed from: a */
        public ConstraintLayout f608a;

        /* JADX INFO: renamed from: b */
        public int f609b;

        /* JADX INFO: renamed from: c */
        public int f610c;

        /* JADX INFO: renamed from: d */
        public int f611d;

        /* JADX INFO: renamed from: e */
        public int f612e;

        /* JADX INFO: renamed from: f */
        public int f613f;

        /* JADX INFO: renamed from: g */
        public int f614g;

        public C0095b(ConstraintLayout constraintLayout) {
            this.f608a = constraintLayout;
        }

        /* JADX INFO: renamed from: a */
        public final boolean m285a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:122:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:124:0x01a3  */
        /* JADX WARN: Code duplicated, block: B:127:0x01b6  */
        /* JADX WARN: Code duplicated, block: B:128:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:130:0x01bb  */
        /* JADX WARN: Code duplicated, block: B:131:0x01bd  */
        /* JADX WARN: Code duplicated, block: B:137:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:142:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:148:0x01da  */
        /* JADX WARN: Code duplicated, block: B:153:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:155:0x01e8 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:156:0x01e9  */
        /* JADX WARN: Code duplicated, block: B:167:0x0209  */
        /* JADX WARN: Code duplicated, block: B:169:0x020d  */
        /* JADX WARN: Code duplicated, block: B:172:0x0218  */
        /* JADX WARN: Code duplicated, block: B:175:0x0232  */
        /* JADX WARN: Code duplicated, block: B:176:0x0237  */
        /* JADX WARN: Code duplicated, block: B:179:0x023c  */
        /* JADX WARN: Code duplicated, block: B:182:0x0244  */
        /* JADX WARN: Code duplicated, block: B:183:0x024b  */
        /* JADX WARN: Code duplicated, block: B:186:0x0252  */
        /* JADX WARN: Code duplicated, block: B:189:0x0261  */
        /* JADX WARN: Code duplicated, block: B:191:0x0265 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:193:0x0270 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:194:0x0272 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:197:0x027d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:200:0x0284 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:201:0x0286  */
        /* JADX WARN: Code duplicated, block: B:202:0x028d  */
        /* JADX WARN: Code duplicated, block: B:204:0x0293  */
        /* JADX WARN: Code duplicated, block: B:207:0x02b2  */
        /* JADX WARN: Code duplicated, block: B:208:0x02b4  */
        /* JADX WARN: Code duplicated, block: B:215:0x02c0  */
        /* JADX WARN: Code duplicated, block: B:218:0x02c7  */
        /* JADX WARN: Code duplicated, block: B:36:0x0072  */
        /* JADX WARN: Code duplicated, block: B:79:0x00f8  */
        @SuppressLint({"WrongCall"})
        /* JADX INFO: renamed from: b */
        public final void m286b(ConstraintWidget constraintWidget, BasicMeasure.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            ConstraintWidgetContainer constraintWidgetContainer;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            C0094a c0094a;
            int i;
            int measuredWidth;
            int measuredHeight;
            int i2;
            int iMin;
            int i3;
            int i4;
            int iMin2;
            int i5;
            int i6;
            int iMakeMeasureSpec3;
            int baseline;
            int i7;
            boolean z7;
            boolean z8;
            boolean z9;
            if (constraintWidget == null) {
                return;
            }
            int iMakeMeasureSpec4 = 0;
            if (constraintWidget.f36861d0 == 8 && !constraintWidget.f36828A) {
                aVar.f36950e = 0;
                aVar.f36951f = 0;
                aVar.f36952g = 0;
                return;
            }
            if (constraintWidget.f36844Q == null) {
                return;
            }
            int i8 = aVar.f36946a;
            int i9 = aVar.f36947b;
            int i10 = aVar.f36948c;
            int i11 = aVar.f36949d;
            int i12 = this.f609b + this.f610c;
            int i13 = this.f611d;
            View view = (View) constraintWidget.f36859c0;
            int iM15315d = C7804v0.m15315d(i8);
            if (iM15315d == 0) {
                iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
            } else if (iM15315d == 1) {
                iMakeMeasureSpec4 = ViewGroup.getChildMeasureSpec(this.f613f, i13, -2);
            } else if (iM15315d == 2) {
                iMakeMeasureSpec4 = ViewGroup.getChildMeasureSpec(this.f613f, i13, -2);
                boolean z10 = constraintWidget.f36878m == 1;
                int i14 = aVar.f36955j;
                if (i14 == 1 || i14 == 2) {
                    if (aVar.f36955j == 2 || !z10 || (z10 && (view.getMeasuredHeight() == constraintWidget.m15760m())) || (view instanceof Placeholder) || constraintWidget.mo15718A()) {
                        iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(constraintWidget.m15766s(), 1073741824);
                    }
                }
            } else if (iM15315d == 3) {
                int i15 = this.f613f;
                ConstraintAnchor constraintAnchor = constraintWidget.f36832E;
                int i16 = constraintAnchor != null ? constraintAnchor.f36815g + 0 : 0;
                ConstraintAnchor constraintAnchor2 = constraintWidget.f36834G;
                if (constraintAnchor2 != null) {
                    i16 += constraintAnchor2.f36815g;
                }
                iMakeMeasureSpec4 = ViewGroup.getChildMeasureSpec(i15, i13 + i16, -1);
            }
            int iM15315d2 = C7804v0.m15315d(i9);
            if (iM15315d2 == 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
            } else if (iM15315d2 == 1) {
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f614g, i12, -2);
            } else {
                if (iM15315d2 != 2) {
                    if (iM15315d2 != 3) {
                        iMakeMeasureSpec2 = 0;
                    } else {
                        int i17 = this.f614g;
                        int i18 = constraintWidget.f36832E != null ? constraintWidget.f36833F.f36815g + 0 : 0;
                        if (constraintWidget.f36834G != null) {
                            i18 += constraintWidget.f36835H.f36815g;
                        }
                        iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i12 + i18, -1);
                    }
                    constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.f36844Q;
                    if (constraintWidgetContainer != null && Optimizer.m15790b(ConstraintLayout.this.f531n, 256) && view.getMeasuredWidth() == constraintWidget.m15766s() && view.getMeasuredWidth() < constraintWidgetContainer.m15766s() && view.getMeasuredHeight() == constraintWidget.m15760m() && view.getMeasuredHeight() < constraintWidgetContainer.m15760m() && view.getBaseline() == constraintWidget.f36851X && !constraintWidget.m15773z()) {
                        if (m285a(constraintWidget.f36830C, iMakeMeasureSpec4, constraintWidget.m15766s()) || !m285a(constraintWidget.f36831D, iMakeMeasureSpec2, constraintWidget.m15760m())) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            aVar.f36950e = constraintWidget.m15766s();
                            aVar.f36951f = constraintWidget.m15760m();
                            aVar.f36952g = constraintWidget.f36851X;
                            return;
                        }
                    }
                    if (i8 == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i9 == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i9 != 4 || i9 == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (i8 != 4 || i8 == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z || constraintWidget.f36847T <= 0.0f) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z2 || constraintWidget.f36847T <= 0.0f) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (view == null) {
                        return;
                    }
                    c0094a = (C0094a) view.getLayoutParams();
                    i = aVar.f36955j;
                    if (i == 1 && i != 2 && z && constraintWidget.f36878m == 0 && z2 && constraintWidget.f36879n == 0) {
                        i7 = -1;
                        baseline = 0;
                        iMin = 0;
                        iMin2 = 0;
                    } else {
                        if ((view instanceof VirtualLayout2) || !(constraintWidget instanceof VirtualLayout)) {
                            view.measure(iMakeMeasureSpec4, iMakeMeasureSpec2);
                        }
                        constraintWidget.f36830C = iMakeMeasureSpec4;
                        constraintWidget.f36831D = iMakeMeasureSpec2;
                        constraintWidget.f36866g = false;
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        int baseline2 = view.getBaseline();
                        i2 = constraintWidget.f36881p;
                        if (i2 > 0) {
                            iMin = Math.max(i2, measuredWidth);
                        } else {
                            iMin = measuredWidth;
                        }
                        i3 = constraintWidget.f36882q;
                        if (i3 > 0) {
                            iMin = Math.min(i3, iMin);
                        }
                        i4 = constraintWidget.f36884s;
                        if (i4 > 0) {
                            iMin2 = Math.max(i4, measuredHeight);
                        } else {
                            iMin2 = measuredHeight;
                        }
                        i5 = constraintWidget.f36885t;
                        if (i5 > 0) {
                            iMin2 = Math.min(i5, iMin2);
                        }
                        if (!Optimizer.m15790b(ConstraintLayout.this.f531n, 1)) {
                            if (!z5 && z3) {
                                iMin = (int) ((iMin2 * constraintWidget.f36847T) + 0.5f);
                            } else if (z6 && z4) {
                                iMin2 = (int) ((iMin / constraintWidget.f36847T) + 0.5f);
                            }
                        }
                        if (measuredWidth == iMin || measuredHeight != iMin2) {
                            if (measuredWidth != iMin) {
                                i6 = 1073741824;
                                iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                            } else {
                                i6 = 1073741824;
                            }
                            if (measuredHeight != iMin2) {
                                iMakeMeasureSpec3 = iMakeMeasureSpec4;
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i6);
                            }
                            iMakeMeasureSpec3 = iMakeMeasureSpec4;
                            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                            constraintWidget.f36830C = iMakeMeasureSpec3;
                            constraintWidget.f36831D = iMakeMeasureSpec2;
                            constraintWidget.f36866g = false;
                            int measuredWidth2 = view.getMeasuredWidth();
                            int measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            iMin = measuredWidth2;
                            iMin2 = measuredHeight2;
                            i7 = -1;
                        } else {
                            baseline = baseline2;
                            i7 = -1;
                        }
                    }
                    if (baseline != i7) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (iMin == aVar.f36948c || iMin2 != aVar.f36949d) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    aVar.f36954i = z8;
                    if (c0094a.f566Y) {
                        z7 = true;
                    }
                    if (z7 && baseline != -1 && constraintWidget.f36851X != baseline) {
                        aVar.f36954i = true;
                    }
                    aVar.f36950e = iMin;
                    aVar.f36951f = iMin2;
                    aVar.f36953h = z7;
                    aVar.f36952g = baseline;
                }
                iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f614g, i12, -2);
                boolean z11 = constraintWidget.f36879n == 1;
                int i19 = aVar.f36955j;
                if (i19 == 1 || i19 == 2) {
                    if (aVar.f36955j == 2 || !z11 || (z11 && (view.getMeasuredWidth() == constraintWidget.m15766s())) || (view instanceof Placeholder) || constraintWidget.mo15719B()) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.m15760m(), 1073741824);
                    }
                }
            }
            iMakeMeasureSpec2 = iMakeMeasureSpec;
            constraintWidgetContainer = (ConstraintWidgetContainer) constraintWidget.f36844Q;
            if (constraintWidgetContainer != null) {
                if (m285a(constraintWidget.f36830C, iMakeMeasureSpec4, constraintWidget.m15766s())) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    aVar.f36950e = constraintWidget.m15766s();
                    aVar.f36951f = constraintWidget.m15760m();
                    aVar.f36952g = constraintWidget.f36851X;
                    return;
                }
            }
            if (i8 == 3) {
                z = true;
            } else {
                z = false;
            }
            if (i9 == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i9 != 4) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (i8 != 4) {
                z4 = true;
            } else {
                z4 = true;
            }
            if (z) {
                z5 = false;
            } else {
                z5 = false;
            }
            if (z2) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (view == null) {
                return;
            }
            c0094a = (C0094a) view.getLayoutParams();
            i = aVar.f36955j;
            if (i == 1) {
                if (view instanceof VirtualLayout2) {
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec2);
                }
                constraintWidget.f36830C = iMakeMeasureSpec4;
                constraintWidget.f36831D = iMakeMeasureSpec2;
                constraintWidget.f36866g = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline3 = view.getBaseline();
                i2 = constraintWidget.f36881p;
                if (i2 > 0) {
                    iMin = Math.max(i2, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i3 = constraintWidget.f36882q;
                if (i3 > 0) {
                    iMin = Math.min(i3, iMin);
                }
                i4 = constraintWidget.f36884s;
                if (i4 > 0) {
                    iMin2 = Math.max(i4, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i5 = constraintWidget.f36885t;
                if (i5 > 0) {
                    iMin2 = Math.min(i5, iMin2);
                }
                if (!Optimizer.m15790b(ConstraintLayout.this.f531n, 1)) {
                    if (!z5) {
                        if (z6) {
                            iMin2 = (int) ((iMin / constraintWidget.f36847T) + 0.5f);
                        }
                    } else if (z6) {
                        iMin2 = (int) ((iMin / constraintWidget.f36847T) + 0.5f);
                    }
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        i6 = 1073741824;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec4;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i6);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec4;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    constraintWidget.f36830C = iMakeMeasureSpec3;
                    constraintWidget.f36831D = iMakeMeasureSpec2;
                    constraintWidget.f36866g = false;
                    int measuredWidth3 = view.getMeasuredWidth();
                    int measuredHeight3 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth3;
                    iMin2 = measuredHeight3;
                    i7 = -1;
                } else {
                    if (measuredWidth != iMin) {
                        i6 = 1073741824;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec4;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i6);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec4;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    constraintWidget.f36830C = iMakeMeasureSpec3;
                    constraintWidget.f36831D = iMakeMeasureSpec2;
                    constraintWidget.f36866g = false;
                    int measuredWidth4 = view.getMeasuredWidth();
                    int measuredHeight4 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth4;
                    iMin2 = measuredHeight4;
                    i7 = -1;
                }
            } else {
                if (view instanceof VirtualLayout2) {
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec4, iMakeMeasureSpec2);
                }
                constraintWidget.f36830C = iMakeMeasureSpec4;
                constraintWidget.f36831D = iMakeMeasureSpec2;
                constraintWidget.f36866g = false;
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                int baseline4 = view.getBaseline();
                i2 = constraintWidget.f36881p;
                if (i2 > 0) {
                    iMin = Math.max(i2, measuredWidth);
                } else {
                    iMin = measuredWidth;
                }
                i3 = constraintWidget.f36882q;
                if (i3 > 0) {
                    iMin = Math.min(i3, iMin);
                }
                i4 = constraintWidget.f36884s;
                if (i4 > 0) {
                    iMin2 = Math.max(i4, measuredHeight);
                } else {
                    iMin2 = measuredHeight;
                }
                i5 = constraintWidget.f36885t;
                if (i5 > 0) {
                    iMin2 = Math.min(i5, iMin2);
                }
                if (!Optimizer.m15790b(ConstraintLayout.this.f531n, 1)) {
                    if (!z5) {
                        if (z6) {
                            iMin2 = (int) ((iMin / constraintWidget.f36847T) + 0.5f);
                        }
                    } else if (z6) {
                        iMin2 = (int) ((iMin / constraintWidget.f36847T) + 0.5f);
                    }
                }
                if (measuredWidth == iMin) {
                    if (measuredWidth != iMin) {
                        i6 = 1073741824;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec4;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i6);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec4;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    constraintWidget.f36830C = iMakeMeasureSpec3;
                    constraintWidget.f36831D = iMakeMeasureSpec2;
                    constraintWidget.f36866g = false;
                    int measuredWidth5 = view.getMeasuredWidth();
                    int measuredHeight5 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth5;
                    iMin2 = measuredHeight5;
                    i7 = -1;
                } else {
                    if (measuredWidth != iMin) {
                        i6 = 1073741824;
                        iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
                    } else {
                        i6 = 1073741824;
                    }
                    if (measuredHeight != iMin2) {
                        iMakeMeasureSpec3 = iMakeMeasureSpec4;
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin2, i6);
                    }
                    iMakeMeasureSpec3 = iMakeMeasureSpec4;
                    view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                    constraintWidget.f36830C = iMakeMeasureSpec3;
                    constraintWidget.f36831D = iMakeMeasureSpec2;
                    constraintWidget.f36866g = false;
                    int measuredWidth6 = view.getMeasuredWidth();
                    int measuredHeight6 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMin = measuredWidth6;
                    iMin2 = measuredHeight6;
                    i7 = -1;
                }
            }
            if (baseline != i7) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (iMin == aVar.f36948c) {
                z8 = true;
            } else {
                z8 = true;
            }
            aVar.f36954i = z8;
            if (c0094a.f566Y) {
                z7 = true;
            }
            if (z7) {
                aVar.f36954i = true;
            }
            aVar.f36950e = iMin;
            aVar.f36951f = iMin2;
            aVar.f36953h = z7;
            aVar.f36952g = baseline;
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        this.f523f = new SparseArray<>();
        this.f524g = new ArrayList<>(4);
        this.f525h = new ConstraintWidgetContainer();
        this.f526i = 0;
        this.f527j = 0;
        this.f528k = Integer.MAX_VALUE;
        this.f529l = Integer.MAX_VALUE;
        this.f530m = true;
        this.f531n = 257;
        this.f532o = null;
        this.f533p = null;
        this.f534q = -1;
        this.f535r = new HashMap<>();
        this.f536s = -1;
        this.f537t = -1;
        this.f538u = new SparseArray<>();
        this.f539v = new C0095b(this);
        this.f540w = 0;
        this.f541x = 0;
        m279f(null, 0, 0);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0094a generateDefaultLayoutParams() {
        return new C0094a(-2, -2);
    }

    /* JADX INFO: renamed from: c */
    public Object m276c(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> map = this.f535r;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f535r.get(str);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0094a;
    }

    /* JADX INFO: renamed from: d */
    public View m277d(int i) {
        return this.f523f.get(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.f524g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.f524g.get(i).m15847j();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i3 = Integer.parseInt(strArrSplit[0]);
                        int i4 = Integer.parseInt(strArrSplit[1]);
                        int i5 = Integer.parseInt(strArrSplit[2]);
                        int i6 = (int) ((i3 / 1080.0f) * width);
                        int i7 = (int) ((i4 / 1920.0f) * height);
                        int i8 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i6;
                        float f2 = i7;
                        float f3 = i6 + ((int) ((i5 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i7 + i8;
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final ConstraintWidget m278e(View view) {
        if (view == this) {
            return this.f525h;
        }
        if (view == null) {
            return null;
        }
        return ((C0094a) view.getLayoutParams()).f593m0;
    }

    /* JADX INFO: renamed from: f */
    public final void m279f(AttributeSet attributeSet, int i, int i2) {
        ConstraintWidgetContainer constraintWidgetContainer = this.f525h;
        constraintWidgetContainer.f36859c0 = this;
        C0095b c0095b = this.f539v;
        constraintWidgetContainer.f36900p0 = c0095b;
        constraintWidgetContainer.f36899o0.f36963f = c0095b;
        this.f523f.put(getId(), this);
        this.f532o = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C8022i.f37164b, i, i2);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.f526i = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f526i);
                } else if (index == 10) {
                    this.f527j = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f527j);
                } else if (index == 7) {
                    this.f528k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f528k);
                } else if (index == 8) {
                    this.f529l = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f529l);
                } else if (index == 90) {
                    this.f531n = typedArrayObtainStyledAttributes.getInt(index, this.f531n);
                } else if (index == 39) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.f533p = new ConstraintLayoutStates(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f533p = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f532o = constraintSet;
                        constraintSet.m15854e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f532o = null;
                    }
                    this.f534q = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f525h.m15784a0(this.f531n);
    }

    @Override // android.view.View
    public void forceLayout() {
        this.f530m = true;
        this.f536s = -1;
        this.f537t = -1;
        super.forceLayout();
    }

    /* JADX INFO: renamed from: g */
    public boolean m280g() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0094a(getContext(), attributeSet);
    }

    public int getMaxHeight() {
        return this.f529l;
    }

    public int getMaxWidth() {
        return this.f528k;
    }

    public int getMinHeight() {
        return this.f527j;
    }

    public int getMinWidth() {
        return this.f526i;
    }

    public int getOptimizationLevel() {
        return this.f525h.f36909y0;
    }

    /* JADX INFO: renamed from: h */
    public void m281h(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0095b c0095b = this.f539v;
        int i5 = c0095b.f612e;
        int iResolveSizeAndState = ViewGroup.resolveSizeAndState(i3 + c0095b.f611d, i, 0);
        int iResolveSizeAndState2 = ViewGroup.resolveSizeAndState(i4 + i5, i2, 0) & 16777215;
        int iMin = Math.min(this.f528k, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f529l, iResolveSizeAndState2);
        if (z) {
            iMin |= 16777216;
        }
        if (z2) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f536s = iMin;
        this.f537t = iMin2;
    }

    /* JADX INFO: renamed from: i */
    public void m282i(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f535r == null) {
                this.f535r = new HashMap<>();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            this.f535r.put(strSubstring, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:149:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:150:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:157:0x0316  */
    /* JADX WARN: Code duplicated, block: B:159:0x031e  */
    /* JADX WARN: Code duplicated, block: B:160:0x032f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0351  */
    /* JADX WARN: Code duplicated, block: B:169:0x0359  */
    /* JADX WARN: Code duplicated, block: B:170:0x036a  */
    /* JADX WARN: Code duplicated, block: B:177:0x038c  */
    /* JADX WARN: Code duplicated, block: B:185:0x03db  */
    /* JADX WARN: Code duplicated, block: B:188:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:260:0x0518  */
    /* JADX INFO: renamed from: j */
    public final boolean m283j() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        ConstraintWidget constraintWidget;
        int i4;
        int i5;
        ConstraintWidget constraintWidget2;
        int i6;
        int i7;
        ConstraintWidget constraintWidget3;
        int i8;
        float f;
        View view;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        ConstraintWidget constraintWidget6;
        ConstraintWidget constraintWidget7;
        int i9;
        int i10;
        float fAbs;
        int i11;
        String str;
        int iM15844e;
        ConstraintWidget constraintWidget8;
        int childCount = getChildCount();
        int i12 = 0;
        int i13 = 0;
        while (true) {
            z = true;
            if (i13 >= childCount) {
                z2 = false;
                break;
            }
            if (getChildAt(i13).isLayoutRequested()) {
                z2 = true;
                break;
            }
            i13++;
        }
        if (z2) {
            boolean zIsInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i14 = 0; i14 < childCount2; i14++) {
                ConstraintWidget constraintWidgetM278e = m278e(getChildAt(i14));
                if (constraintWidgetM278e != null) {
                    constraintWidgetM278e.mo15737C();
                }
            }
            Object obj = null;
            int i15 = -1;
            if (zIsInEditMode) {
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt = getChildAt(i16);
                    try {
                        String resourceName = getResources().getResourceName(childAt.getId());
                        m282i(0, resourceName, Integer.valueOf(childAt.getId()));
                        int iIndexOf = resourceName.indexOf(47);
                        if (iIndexOf != -1) {
                            resourceName = resourceName.substring(iIndexOf + 1);
                        }
                        int id = childAt.getId();
                        if (id == 0) {
                            constraintWidget8 = this.f525h;
                        } else {
                            View viewFindViewById = this.f523f.get(id);
                            if (viewFindViewById == null && (viewFindViewById = findViewById(id)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                onViewAdded(viewFindViewById);
                            }
                            constraintWidget8 = viewFindViewById == this ? this.f525h : viewFindViewById == null ? null : ((C0094a) viewFindViewById.getLayoutParams()).f593m0;
                        }
                        constraintWidget8.f36863e0 = resourceName;
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            if (this.f534q != -1) {
                for (int i17 = 0; i17 < childCount2; i17++) {
                    View childAt2 = getChildAt(i17);
                    if (childAt2.getId() == this.f534q && (childAt2 instanceof Constraints)) {
                        this.f532o = ((Constraints) childAt2).getConstraintSet();
                    }
                }
            }
            ConstraintSet constraintSet = this.f532o;
            if (constraintSet != null) {
                constraintSet.m15850a(this, true);
            }
            this.f525h.f36942m0.clear();
            int size = this.f524g.size();
            if (size > 0) {
                int i18 = 0;
                while (i18 < size) {
                    ConstraintHelper constraintHelper = this.f524g.get(i18);
                    if (constraintHelper.isInEditMode()) {
                        constraintHelper.setIds(constraintHelper.f37030j);
                    }
                    Helper helper = constraintHelper.f37029i;
                    if (helper != null) {
                        HelperWidget helperWidget = (HelperWidget) helper;
                        helperWidget.f36939n0 = i12;
                        Arrays.fill(helperWidget.f36938m0, obj);
                        for (int i19 = 0; i19 < constraintHelper.f37027g; i19++) {
                            int i20 = constraintHelper.f37026f[i19];
                            View viewM277d = m277d(i20);
                            if (viewM277d == null && (iM15844e = constraintHelper.m15844e(this, (str = constraintHelper.f37032l.get(Integer.valueOf(i20))))) != 0) {
                                constraintHelper.f37026f[i19] = iM15844e;
                                constraintHelper.f37032l.put(Integer.valueOf(iM15844e), str);
                                viewM277d = m277d(iM15844e);
                            }
                            if (viewM277d != null) {
                                Helper helper2 = constraintHelper.f37029i;
                                ConstraintWidget constraintWidgetM278e2 = m278e(viewM277d);
                                HelperWidget helperWidget2 = (HelperWidget) helper2;
                                Objects.requireNonNull(helperWidget2);
                                if (constraintWidgetM278e2 != helperWidget2 && constraintWidgetM278e2 != null) {
                                    int i21 = helperWidget2.f36939n0 + 1;
                                    ConstraintWidget[] constraintWidgetArr = helperWidget2.f36938m0;
                                    if (i21 > constraintWidgetArr.length) {
                                        helperWidget2.f36938m0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
                                    }
                                    ConstraintWidget[] constraintWidgetArr2 = helperWidget2.f36938m0;
                                    int i22 = helperWidget2.f36939n0;
                                    constraintWidgetArr2[i22] = constraintWidgetM278e2;
                                    helperWidget2.f36939n0 = i22 + 1;
                                }
                            }
                        }
                        constraintHelper.f37029i.mo15787a(this.f525h);
                    }
                    i18++;
                    i12 = 0;
                    obj = null;
                }
            }
            for (int i23 = 0; i23 < childCount2; i23++) {
                View childAt3 = getChildAt(i23);
                if (childAt3 instanceof Placeholder) {
                    Placeholder placeholder = (Placeholder) childAt3;
                    if (placeholder.f37160f == -1 && !placeholder.isInEditMode()) {
                        placeholder.setVisibility(placeholder.f37162h);
                    }
                    View viewFindViewById2 = findViewById(placeholder.f37160f);
                    placeholder.f37161g = viewFindViewById2;
                    if (viewFindViewById2 != null) {
                        ((C0094a) viewFindViewById2.getLayoutParams()).f571b0 = true;
                        placeholder.f37161g.setVisibility(0);
                        placeholder.setVisibility(0);
                    }
                }
            }
            this.f538u.clear();
            this.f538u.put(0, this.f525h);
            this.f538u.put(getId(), this.f525h);
            for (int i24 = 0; i24 < childCount2; i24++) {
                View childAt4 = getChildAt(i24);
                this.f538u.put(childAt4.getId(), m278e(childAt4));
            }
            int i25 = 0;
            while (i25 < childCount2) {
                View childAt5 = getChildAt(i25);
                ConstraintWidget constraintWidgetM278e3 = m278e(childAt5);
                if (constraintWidgetM278e3 == null) {
                    z3 = z2;
                    z4 = zIsInEditMode;
                    i = childCount2;
                    i2 = i25;
                } else {
                    C0094a c0094a = (C0094a) childAt5.getLayoutParams();
                    ConstraintWidgetContainer constraintWidgetContainer = this.f525h;
                    constraintWidgetContainer.f36942m0.add(constraintWidgetM278e3);
                    ConstraintWidget constraintWidget9 = constraintWidgetM278e3.f36844Q;
                    if (constraintWidget9 != null) {
                        ((WidgetContainer) constraintWidget9).f36942m0.remove(constraintWidgetM278e3);
                        constraintWidgetM278e3.mo15737C();
                    }
                    constraintWidgetM278e3.f36844Q = constraintWidgetContainer;
                    SparseArray<ConstraintWidget> sparseArray = this.f538u;
                    ConstraintAnchor.a aVar = ConstraintAnchor.a.RIGHT;
                    ConstraintAnchor.a aVar2 = ConstraintAnchor.a.LEFT;
                    ConstraintAnchor.a aVar3 = ConstraintAnchor.a.BOTTOM;
                    ConstraintAnchor.a aVar4 = ConstraintAnchor.a.TOP;
                    c0094a.m284a();
                    constraintWidgetM278e3.f36861d0 = childAt5.getVisibility();
                    if (c0094a.f571b0) {
                        constraintWidgetM278e3.f36828A = z;
                        constraintWidgetM278e3.f36861d0 = 8;
                    }
                    constraintWidgetM278e3.f36859c0 = childAt5;
                    if (childAt5 instanceof ConstraintHelper) {
                        ((ConstraintHelper) childAt5).mo274g(constraintWidgetM278e3, this.f525h.f36901q0);
                    }
                    if (c0094a.f567Z) {
                        Guideline2 guideline2 = (Guideline2) constraintWidgetM278e3;
                        int i26 = c0094a.f587j0;
                        int i27 = c0094a.f589k0;
                        float f2 = c0094a.f591l0;
                        if (f2 != -1.0f) {
                            if (f2 > -1.0f) {
                                guideline2.f36932m0 = f2;
                                guideline2.f36933n0 = i15;
                                guideline2.f36934o0 = i15;
                            }
                        } else if (i26 != i15) {
                            if (i26 > i15) {
                                guideline2.f36932m0 = -1.0f;
                                guideline2.f36933n0 = i26;
                                guideline2.f36934o0 = i15;
                            }
                        } else if (i27 != i15 && i27 > i15) {
                            guideline2.f36932m0 = -1.0f;
                            guideline2.f36933n0 = i15;
                            guideline2.f36934o0 = i27;
                        }
                        z3 = z2;
                        z4 = zIsInEditMode;
                        i = childCount2;
                        i2 = i25;
                    } else {
                        int i28 = c0094a.f573c0;
                        int i29 = c0094a.f575d0;
                        int i30 = c0094a.f577e0;
                        int i31 = c0094a.f579f0;
                        i = childCount2;
                        int i32 = c0094a.f581g0;
                        z3 = z2;
                        int i33 = c0094a.f583h0;
                        i2 = i25;
                        float f3 = c0094a.f585i0;
                        z4 = zIsInEditMode;
                        int i34 = c0094a.f592m;
                        if (i34 != -1) {
                            ConstraintWidget constraintWidget10 = sparseArray.get(i34);
                            if (constraintWidget10 != null) {
                                float f4 = c0094a.f595o;
                                int i35 = c0094a.f594n;
                                ConstraintAnchor.a aVar5 = ConstraintAnchor.a.CENTER;
                                constraintWidgetM278e3.mo15757j(aVar5).m15725a(constraintWidget10.mo15757j(aVar5), i35, 0, true);
                                constraintWidgetM278e3.f36890y = f4;
                            }
                        } else {
                            if (i28 != -1) {
                                ConstraintWidget constraintWidget11 = sparseArray.get(i28);
                                if (constraintWidget11 != null) {
                                    constraintWidgetM278e3.mo15757j(aVar2).m15725a(constraintWidget11.mo15757j(aVar2), ((ViewGroup.MarginLayoutParams) c0094a).leftMargin, i32, true);
                                }
                            } else {
                                i3 = -1;
                                if (i29 == -1) {
                                    if (i30 != i3) {
                                        constraintWidget7 = sparseArray.get(i30);
                                        if (constraintWidget7 != null) {
                                            constraintWidgetM278e3.mo15757j(aVar).m15725a(constraintWidget7.mo15757j(aVar2), ((ViewGroup.MarginLayoutParams) c0094a).rightMargin, i33, true);
                                        }
                                    } else if (i31 != i3 && (constraintWidget = sparseArray.get(i31)) != null) {
                                        constraintWidgetM278e3.mo15757j(aVar).m15725a(constraintWidget.mo15757j(aVar), ((ViewGroup.MarginLayoutParams) c0094a).rightMargin, i33, true);
                                    }
                                    i4 = c0094a.f582h;
                                    if (i4 != -1) {
                                        constraintWidget6 = sparseArray.get(i4);
                                        if (constraintWidget6 != null) {
                                            constraintWidgetM278e3.mo15757j(aVar4).m15725a(constraintWidget6.mo15757j(aVar4), ((ViewGroup.MarginLayoutParams) c0094a).topMargin, c0094a.f601u, true);
                                        }
                                    } else {
                                        i5 = c0094a.f584i;
                                        if (i5 != -1 && (constraintWidget2 = sparseArray.get(i5)) != null) {
                                            constraintWidgetM278e3.mo15757j(aVar4).m15725a(constraintWidget2.mo15757j(aVar3), ((ViewGroup.MarginLayoutParams) c0094a).topMargin, c0094a.f601u, true);
                                        }
                                    }
                                    i6 = c0094a.f586j;
                                    if (i6 != -1) {
                                        constraintWidget5 = sparseArray.get(i6);
                                        if (constraintWidget5 != null) {
                                            constraintWidgetM278e3.mo15757j(aVar3).m15725a(constraintWidget5.mo15757j(aVar4), ((ViewGroup.MarginLayoutParams) c0094a).bottomMargin, c0094a.f603w, true);
                                        }
                                    } else {
                                        i7 = c0094a.f588k;
                                        if (i7 != -1 && (constraintWidget3 = sparseArray.get(i7)) != null) {
                                            constraintWidgetM278e3.mo15757j(aVar3).m15725a(constraintWidget3.mo15757j(aVar3), ((ViewGroup.MarginLayoutParams) c0094a).bottomMargin, c0094a.f603w, true);
                                        }
                                    }
                                    i8 = c0094a.f590l;
                                    if (i8 != -1) {
                                        view = this.f523f.get(i8);
                                        constraintWidget4 = sparseArray.get(c0094a.f590l);
                                        if (constraintWidget4 != null && view != null && (view.getLayoutParams() instanceof C0094a)) {
                                            C0094a c0094a2 = (C0094a) view.getLayoutParams();
                                            c0094a.f566Y = true;
                                            c0094a2.f566Y = true;
                                            ConstraintAnchor.a aVar6 = ConstraintAnchor.a.BASELINE;
                                            constraintWidgetM278e3.mo15757j(aVar6).m15725a(constraintWidget4.mo15757j(aVar6), 0, -1, true);
                                            constraintWidgetM278e3.f36891z = true;
                                            c0094a2.f593m0.f36891z = true;
                                            constraintWidgetM278e3.mo15757j(aVar4).m15734j();
                                            constraintWidgetM278e3.mo15757j(aVar3).m15734j();
                                        }
                                    }
                                    if (f3 >= 0.0f) {
                                        constraintWidgetM278e3.f36855a0 = f3;
                                    }
                                    f = c0094a.f542A;
                                    if (f >= 0.0f) {
                                        constraintWidgetM278e3.f36857b0 = f;
                                    }
                                } else {
                                    ConstraintWidget constraintWidget12 = sparseArray.get(i29);
                                    if (constraintWidget12 != null) {
                                        constraintWidgetM278e3.mo15757j(aVar2).m15725a(constraintWidget12.mo15757j(aVar), ((ViewGroup.MarginLayoutParams) c0094a).leftMargin, i32, true);
                                    }
                                }
                            }
                            i3 = -1;
                            if (i30 != i3) {
                                constraintWidget7 = sparseArray.get(i30);
                                if (constraintWidget7 != null) {
                                    constraintWidgetM278e3.mo15757j(aVar).m15725a(constraintWidget7.mo15757j(aVar2), ((ViewGroup.MarginLayoutParams) c0094a).rightMargin, i33, true);
                                }
                            } else if (i31 != i3) {
                                constraintWidgetM278e3.mo15757j(aVar).m15725a(constraintWidget.mo15757j(aVar), ((ViewGroup.MarginLayoutParams) c0094a).rightMargin, i33, true);
                            }
                            i4 = c0094a.f582h;
                            if (i4 != -1) {
                                constraintWidget6 = sparseArray.get(i4);
                                if (constraintWidget6 != null) {
                                    constraintWidgetM278e3.mo15757j(aVar4).m15725a(constraintWidget6.mo15757j(aVar4), ((ViewGroup.MarginLayoutParams) c0094a).topMargin, c0094a.f601u, true);
                                }
                            } else {
                                i5 = c0094a.f584i;
                                if (i5 != -1) {
                                    constraintWidgetM278e3.mo15757j(aVar4).m15725a(constraintWidget2.mo15757j(aVar3), ((ViewGroup.MarginLayoutParams) c0094a).topMargin, c0094a.f601u, true);
                                }
                            }
                            i6 = c0094a.f586j;
                            if (i6 != -1) {
                                constraintWidget5 = sparseArray.get(i6);
                                if (constraintWidget5 != null) {
                                    constraintWidgetM278e3.mo15757j(aVar3).m15725a(constraintWidget5.mo15757j(aVar4), ((ViewGroup.MarginLayoutParams) c0094a).bottomMargin, c0094a.f603w, true);
                                }
                            } else {
                                i7 = c0094a.f588k;
                                if (i7 != -1) {
                                    constraintWidgetM278e3.mo15757j(aVar3).m15725a(constraintWidget3.mo15757j(aVar3), ((ViewGroup.MarginLayoutParams) c0094a).bottomMargin, c0094a.f603w, true);
                                }
                            }
                            i8 = c0094a.f590l;
                            if (i8 != -1) {
                                view = this.f523f.get(i8);
                                constraintWidget4 = sparseArray.get(c0094a.f590l);
                                if (constraintWidget4 != null) {
                                    C0094a c0094a3 = (C0094a) view.getLayoutParams();
                                    c0094a.f566Y = true;
                                    c0094a3.f566Y = true;
                                    ConstraintAnchor.a aVar7 = ConstraintAnchor.a.BASELINE;
                                    constraintWidgetM278e3.mo15757j(aVar7).m15725a(constraintWidget4.mo15757j(aVar7), 0, -1, true);
                                    constraintWidgetM278e3.f36891z = true;
                                    c0094a3.f593m0.f36891z = true;
                                    constraintWidgetM278e3.mo15757j(aVar4).m15734j();
                                    constraintWidgetM278e3.mo15757j(aVar3).m15734j();
                                }
                            }
                            if (f3 >= 0.0f) {
                                constraintWidgetM278e3.f36855a0 = f3;
                            }
                            f = c0094a.f542A;
                            if (f >= 0.0f) {
                                constraintWidgetM278e3.f36857b0 = f;
                            }
                        }
                        if (z4 && ((i11 = c0094a.f558Q) != -1 || c0094a.f559R != -1)) {
                            int i36 = c0094a.f559R;
                            constraintWidgetM278e3.f36849V = i11;
                            constraintWidgetM278e3.f36850W = i36;
                        }
                        if (c0094a.f564W) {
                            constraintWidgetM278e3.f36843P[0] = 1;
                            constraintWidgetM278e3.m15748N(((ViewGroup.MarginLayoutParams) c0094a).width);
                            if (((ViewGroup.MarginLayoutParams) c0094a).width == -2) {
                                constraintWidgetM278e3.f36843P[0] = 2;
                            }
                        } else if (((ViewGroup.MarginLayoutParams) c0094a).width == -1) {
                            if (c0094a.f561T) {
                                constraintWidgetM278e3.f36843P[0] = 3;
                            } else {
                                constraintWidgetM278e3.f36843P[0] = 4;
                            }
                            constraintWidgetM278e3.mo15757j(aVar2).f36815g = ((ViewGroup.MarginLayoutParams) c0094a).leftMargin;
                            constraintWidgetM278e3.mo15757j(aVar).f36815g = ((ViewGroup.MarginLayoutParams) c0094a).rightMargin;
                        } else {
                            constraintWidgetM278e3.f36843P[0] = 3;
                            constraintWidgetM278e3.m15748N(0);
                        }
                        if (c0094a.f565X) {
                            constraintWidgetM278e3.f36843P[1] = 1;
                            constraintWidgetM278e3.m15743I(((ViewGroup.MarginLayoutParams) c0094a).height);
                            if (((ViewGroup.MarginLayoutParams) c0094a).height == -2) {
                                constraintWidgetM278e3.f36843P[1] = 2;
                            }
                        } else if (((ViewGroup.MarginLayoutParams) c0094a).height == -1) {
                            if (c0094a.f562U) {
                                constraintWidgetM278e3.f36843P[1] = 3;
                            } else {
                                constraintWidgetM278e3.f36843P[1] = 4;
                            }
                            constraintWidgetM278e3.mo15757j(aVar4).f36815g = ((ViewGroup.MarginLayoutParams) c0094a).topMargin;
                            constraintWidgetM278e3.mo15757j(aVar3).f36815g = ((ViewGroup.MarginLayoutParams) c0094a).bottomMargin;
                        } else {
                            constraintWidgetM278e3.f36843P[1] = 3;
                            constraintWidgetM278e3.m15743I(0);
                        }
                        String str2 = c0094a.f543B;
                        if (str2 == null || str2.length() == 0) {
                            constraintWidgetM278e3.f36847T = 0.0f;
                        } else {
                            int length = str2.length();
                            int iIndexOf2 = str2.indexOf(44);
                            if (iIndexOf2 <= 0 || iIndexOf2 >= length - 1) {
                                i9 = 0;
                                i10 = -1;
                            } else {
                                String strSubstring = str2.substring(0, iIndexOf2);
                                i10 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                                i9 = iIndexOf2 + 1;
                            }
                            int iIndexOf3 = str2.indexOf(58);
                            if (iIndexOf3 < 0 || iIndexOf3 >= length - 1) {
                                String strSubstring2 = str2.substring(i9);
                                if (strSubstring2.length() > 0) {
                                    fAbs = Float.parseFloat(strSubstring2);
                                } else {
                                    fAbs = 0.0f;
                                }
                            } else {
                                String strSubstring3 = str2.substring(i9, iIndexOf3);
                                String strSubstring4 = str2.substring(iIndexOf3 + 1);
                                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                    fAbs = 0.0f;
                                } else {
                                    try {
                                        float f5 = Float.parseFloat(strSubstring3);
                                        float f6 = Float.parseFloat(strSubstring4);
                                        if (f5 <= 0.0f || f6 <= 0.0f) {
                                            fAbs = 0.0f;
                                        } else {
                                            fAbs = i10 == 1 ? Math.abs(f6 / f5) : Math.abs(f5 / f6);
                                        }
                                    } catch (NumberFormatException unused2) {
                                    }
                                }
                            }
                            if (fAbs > 0.0f) {
                                constraintWidgetM278e3.f36847T = fAbs;
                                constraintWidgetM278e3.f36848U = i10;
                            }
                        }
                        float f7 = c0094a.f546E;
                        float[] fArr = constraintWidgetM278e3.f36869h0;
                        fArr[0] = f7;
                        z = true;
                        fArr[1] = c0094a.f547F;
                        constraintWidgetM278e3.f36865f0 = c0094a.f548G;
                        constraintWidgetM278e3.f36867g0 = c0094a.f549H;
                        int i37 = c0094a.f550I;
                        int i38 = c0094a.f552K;
                        int i39 = c0094a.f554M;
                        float f8 = c0094a.f556O;
                        constraintWidgetM278e3.f36878m = i37;
                        constraintWidgetM278e3.f36881p = i38;
                        if (i39 == Integer.MAX_VALUE) {
                            i39 = 0;
                        }
                        constraintWidgetM278e3.f36882q = i39;
                        constraintWidgetM278e3.f36883r = f8;
                        if (f8 > 0.0f && f8 < 1.0f && i37 == 0) {
                            constraintWidgetM278e3.f36878m = 2;
                        }
                        int i40 = c0094a.f551J;
                        int i41 = c0094a.f553L;
                        int i42 = c0094a.f555N;
                        float f9 = c0094a.f557P;
                        constraintWidgetM278e3.f36879n = i40;
                        constraintWidgetM278e3.f36884s = i41;
                        if (i42 == Integer.MAX_VALUE) {
                            i42 = 0;
                        }
                        constraintWidgetM278e3.f36885t = i42;
                        constraintWidgetM278e3.f36886u = f9;
                        if (f9 > 0.0f && f9 < 1.0f && i40 == 0) {
                            constraintWidgetM278e3.f36879n = 2;
                        }
                    }
                }
                i25 = i2 + 1;
                childCount2 = i;
                z2 = z3;
                zIsInEditMode = z4;
                i15 = -1;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0094a c0094a = (C0094a) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = c0094a.f593m0;
            if ((childAt.getVisibility() != 8 || c0094a.f567Z || c0094a.f569a0 || zIsInEditMode) && !c0094a.f571b0) {
                int iM15767t = constraintWidget.m15767t();
                int iM15768u = constraintWidget.m15768u();
                int iM15766s = constraintWidget.m15766s() + iM15767t;
                int iM15760m = constraintWidget.m15760m() + iM15768u;
                childAt.layout(iM15767t, iM15768u, iM15766s, iM15760m);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM15767t, iM15768u, iM15766s, iM15760m);
                }
            }
        }
        int size = this.f524g.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.f524g.get(i6).m15845h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x022d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x0237  */
    /* JADX WARN: Code duplicated, block: B:121:0x025e A[PHI: r8
  0x025e: PHI (r8v4 boolean) = (r8v3 boolean), (r8v47 boolean) binds: [B:86:0x01ff, B:443:0x025e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:123:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0266 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x026f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0289  */
    /* JADX WARN: Code duplicated, block: B:135:0x0297  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:221:0x046e  */
    /* JADX WARN: Code duplicated, block: B:223:0x047e  */
    /* JADX WARN: Code duplicated, block: B:226:0x048c A[LOOP:12: B:224:0x0486->B:226:0x048c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:231:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:232:0x0500  */
    /* JADX WARN: Code duplicated, block: B:234:0x0505  */
    /* JADX WARN: Code duplicated, block: B:236:0x050e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:237:0x0510  */
    /* JADX WARN: Code duplicated, block: B:238:0x0512  */
    /* JADX WARN: Code duplicated, block: B:240:0x0515  */
    /* JADX WARN: Code duplicated, block: B:241:0x0517  */
    /* JADX WARN: Code duplicated, block: B:243:0x051c  */
    /* JADX WARN: Code duplicated, block: B:245:0x052a  */
    /* JADX WARN: Code duplicated, block: B:249:0x0532  */
    /* JADX WARN: Code duplicated, block: B:251:0x0538  */
    /* JADX WARN: Code duplicated, block: B:253:0x0549  */
    /* JADX WARN: Code duplicated, block: B:256:0x0556  */
    /* JADX WARN: Code duplicated, block: B:271:0x0576  */
    /* JADX WARN: Code duplicated, block: B:274:0x0586  */
    /* JADX WARN: Code duplicated, block: B:280:0x0592  */
    /* JADX WARN: Code duplicated, block: B:282:0x0595  */
    /* JADX WARN: Code duplicated, block: B:306:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:310:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:314:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:316:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:319:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:321:0x0610  */
    /* JADX WARN: Code duplicated, block: B:324:0x0623  */
    /* JADX WARN: Code duplicated, block: B:326:0x0633  */
    /* JADX WARN: Code duplicated, block: B:330:0x0642  */
    /* JADX WARN: Code duplicated, block: B:332:0x0645 A[LOOP:6: B:331:0x0643->B:332:0x0645, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:333:0x0655  */
    /* JADX WARN: Code duplicated, block: B:336:0x0663  */
    /* JADX WARN: Code duplicated, block: B:338:0x0668  */
    /* JADX WARN: Code duplicated, block: B:340:0x066f  */
    /* JADX WARN: Code duplicated, block: B:341:0x0671  */
    /* JADX WARN: Code duplicated, block: B:344:0x0678  */
    /* JADX WARN: Code duplicated, block: B:345:0x067a  */
    /* JADX WARN: Code duplicated, block: B:348:0x0699  */
    /* JADX WARN: Code duplicated, block: B:350:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:351:0x06af  */
    /* JADX WARN: Code duplicated, block: B:353:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:355:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:358:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:360:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:362:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:364:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:367:0x0717  */
    /* JADX WARN: Code duplicated, block: B:369:0x071c  */
    /* JADX WARN: Code duplicated, block: B:374:0x0740  */
    /* JADX WARN: Code duplicated, block: B:376:0x0745  */
    /* JADX WARN: Code duplicated, block: B:378:0x0753  */
    /* JADX WARN: Code duplicated, block: B:380:0x0757  */
    /* JADX WARN: Code duplicated, block: B:386:0x0769 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:394:0x0780 A[PHI: r20
  0x0780: PHI (r20v3 z0.i.b.h.f) = (r20v1 z0.i.b.h.f), (r20v1 z0.i.b.h.f), (r20v1 z0.i.b.h.f), (r20v4 z0.i.b.h.f) binds: [B:384:0x0766, B:393:0x077e, B:390:0x0779, B:382:0x075b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:397:0x0799  */
    /* JADX WARN: Code duplicated, block: B:400:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:402:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:407:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:409:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:415:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:418:0x07f2  */
    /* JADX WARN: Code duplicated, block: B:422:0x080e A[LOOP:8: B:373:0x073e->B:422:0x080e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:426:0x0831  */
    /* JADX WARN: Code duplicated, block: B:428:0x083a  */
    /* JADX WARN: Code duplicated, block: B:429:0x0840  */
    /* JADX WARN: Code duplicated, block: B:432:0x0848  */
    /* JADX WARN: Code duplicated, block: B:433:0x084e  */
    /* JADX WARN: Code duplicated, block: B:435:0x0852  */
    /* JADX WARN: Code duplicated, block: B:437:0x0858  */
    /* JADX WARN: Code duplicated, block: B:443:0x025e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0824 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:480:0x082d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0154  */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0165 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0167  */
    /* JADX WARN: Code duplicated, block: B:66:0x0171  */
    /* JADX WARN: Code duplicated, block: B:67:0x0173  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:78:0x0191  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:87:0x0201  */
    /* JADX WARN: Code duplicated, block: B:89:0x0204  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x0216  */
    /* JADX WARN: Code duplicated, block: B:95:0x021d  */
    /* JADX WARN: Code duplicated, block: B:96:0x021f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0222 A[ADDED_TO_REGION] */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMax;
        int i3;
        int i4;
        int i5;
        int iMin;
        int i6;
        int iMax2;
        int i7;
        int i8;
        BasicMeasure basicMeasure;
        ConstraintAnchor.a aVar;
        ConstraintAnchor.a aVar2;
        BasicMeasure.b bVar;
        int size;
        int iM15766s;
        int iM15760m;
        boolean zM15790b;
        boolean z;
        boolean z2;
        int i9;
        boolean z3;
        ConstraintAnchor.a aVar3;
        boolean z4;
        int i10;
        boolean zM15781W;
        int i11;
        int i12;
        int size2;
        int i13;
        int i14;
        boolean z5;
        boolean z6;
        int iMax3;
        int iMax4;
        int i15;
        boolean z7;
        ConstraintAnchor.a aVar4;
        ConstraintAnchor.a aVar5;
        BasicMeasure.b bVar2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z8;
        boolean z9;
        int iMax5;
        boolean z10;
        int i20;
        ConstraintWidgetContainer constraintWidgetContainer;
        BasicMeasure.b bVar3;
        int i21;
        int i22;
        int i23;
        ConstraintWidget constraintWidget;
        ConstraintWidgetContainer constraintWidgetContainer2;
        int iM15766s2;
        int iM15760m2;
        int i24;
        int i25;
        boolean zM15791a;
        int iM15766s3;
        BasicMeasure.b bVar4;
        int iM15760m3;
        ConstraintWidget constraintWidget2;
        int iM15766s4;
        int iM15760m4;
        BasicMeasure.b bVar5;
        int iM15766s5;
        boolean z11;
        int iM15760m5;
        ConstraintAnchor.a aVar6;
        ConstraintAnchor.a aVar7;
        int size3;
        BasicMeasure.b bVar6;
        int i26;
        C0095b c0095b;
        int childCount;
        int i27;
        int size4;
        int i28;
        View childAt;
        Placeholder placeholder;
        C0094a c0094a;
        C0094a c0094a2;
        ConstraintWidget constraintWidget3;
        int iM15759l;
        boolean z12;
        HorizontalWidgetRun horizontalWidgetRun;
        VerticalWidgetRun verticalWidgetRun;
        int iMin2;
        int iMin3;
        DependencyGraph dependencyGraph;
        int i29;
        int i30;
        int i31;
        boolean z13;
        boolean z14;
        int i32;
        boolean z15;
        boolean z16;
        int i33;
        ConstraintWidget constraintWidget4;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        if (!this.f530m) {
            int childCount2 = getChildCount();
            for (int i34 = 0; i34 < childCount2; i34++) {
                if (getChildAt(i34).isLayoutRequested()) {
                    this.f530m = true;
                    break;
                }
            }
        }
        if (!this.f530m) {
            int i35 = this.f540w;
            if (i35 == i && this.f541x == i2) {
                int iM15766s6 = this.f525h.m15766s();
                int iM15760m6 = this.f525h.m15760m();
                ConstraintWidgetContainer constraintWidgetContainer3 = this.f525h;
                m281h(i, i2, iM15766s6, iM15760m6, constraintWidgetContainer3.f36910z0, constraintWidgetContainer3.f36892A0);
                return;
            }
            if (i35 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.f541x) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.f525h.m15760m()) {
                this.f540w = i;
                this.f541x = i2;
                int iM15766s7 = this.f525h.m15766s();
                int iM15760m7 = this.f525h.m15760m();
                ConstraintWidgetContainer constraintWidgetContainer4 = this.f525h;
                m281h(i, i2, iM15766s7, iM15760m7, constraintWidgetContainer4.f36910z0, constraintWidgetContainer4.f36892A0);
                return;
            }
        }
        this.f540w = i;
        this.f541x = i2;
        this.f525h.f36901q0 = m280g();
        if (this.f530m) {
            this.f530m = false;
            if (m283j()) {
                ConstraintWidgetContainer constraintWidgetContainer5 = this.f525h;
                constraintWidgetContainer5.f36898n0.m15793c(constraintWidgetContainer5);
            }
        }
        ConstraintWidgetContainer constraintWidgetContainer6 = this.f525h;
        int i36 = this.f531n;
        int mode = View.MeasureSpec.getMode(i);
        int size5 = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size6 = View.MeasureSpec.getSize(i2);
        int iMax6 = Math.max(0, getPaddingTop());
        int iMax7 = Math.max(0, getPaddingBottom());
        int i37 = iMax6 + iMax7;
        int paddingWidth = getPaddingWidth();
        C0095b c0095b2 = this.f539v;
        c0095b2.f609b = iMax6;
        c0095b2.f610c = iMax7;
        c0095b2.f611d = paddingWidth;
        c0095b2.f612e = i37;
        c0095b2.f613f = i;
        c0095b2.f614g = i2;
        int iMax8 = Math.max(0, getPaddingStart());
        int iMax9 = Math.max(0, getPaddingEnd());
        if (iMax8 <= 0 && iMax9 <= 0) {
            iMax8 = Math.max(0, getPaddingLeft());
        } else if (m280g()) {
            iMax8 = iMax9;
        }
        int i38 = size5 - paddingWidth;
        int i39 = size6 - i37;
        C0095b c0095b3 = this.f539v;
        int i40 = c0095b3.f612e;
        int i41 = c0095b3.f611d;
        int childCount3 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                iMax = childCount3 == 0 ? Math.max(0, this.f526i) : 0;
            } else if (mode != 1073741824) {
                i4 = 1;
                i3 = 0;
                i6 = Integer.MIN_VALUE;
                int i42 = i3;
                i5 = i4;
                iMin = i42;
            } else {
                iMin = Math.min(this.f528k - i41, i38);
                i6 = Integer.MIN_VALUE;
                i5 = 1;
            }
            if (mode2 != i6) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        i7 = 1;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.f529l - i40, i39);
                        i7 = 1;
                    }
                } else if (childCount3 == 0) {
                    iMax2 = Math.max(0, this.f527j);
                } else {
                    iMax2 = 0;
                }
                if (iMin == constraintWidgetContainer6.m15766s() || iMax2 != constraintWidgetContainer6.m15760m()) {
                    constraintWidgetContainer6.f36899o0.f36960c = true;
                    i8 = 0;
                } else {
                    i8 = 0;
                }
                constraintWidgetContainer6.f36849V = i8;
                constraintWidgetContainer6.f36850W = i8;
                int i43 = this.f528k - i41;
                int[] iArr = constraintWidgetContainer6.f36889x;
                iArr[i8] = i43;
                iArr[1] = this.f529l - i40;
                constraintWidgetContainer6.m15746L(i8);
                constraintWidgetContainer6.m15745K(i8);
                constraintWidgetContainer6.f36843P[i8] = i5;
                constraintWidgetContainer6.m15748N(iMin);
                constraintWidgetContainer6.f36843P[1] = i7;
                constraintWidgetContainer6.m15743I(iMax2);
                constraintWidgetContainer6.m15746L(this.f526i - i41);
                constraintWidgetContainer6.m15745K(this.f527j - i40);
                constraintWidgetContainer6.f36903s0 = iMax8;
                constraintWidgetContainer6.f36904t0 = iMax6;
                basicMeasure = constraintWidgetContainer6.f36898n0;
                Objects.requireNonNull(basicMeasure);
                aVar = ConstraintAnchor.a.BOTTOM;
                aVar2 = ConstraintAnchor.a.RIGHT;
                bVar = constraintWidgetContainer6.f36900p0;
                size = constraintWidgetContainer6.f36942m0.size();
                iM15766s = constraintWidgetContainer6.m15766s();
                iM15760m = constraintWidgetContainer6.m15760m();
                zM15790b = Optimizer.m15790b(i36, 128);
                if (!zM15790b || Optimizer.m15790b(i36, 64)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i33 = 0;
                    while (true) {
                        if (i33 < size) {
                            constraintWidget4 = constraintWidgetContainer6.f36942m0.get(i33);
                            z17 = z;
                            if (constraintWidget4.m15761n() == 3) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (constraintWidget4.m15765r() == 3) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            if (z18 || !z19 || constraintWidget4.f36847T <= 0.0f) {
                                z20 = false;
                            } else {
                                z20 = true;
                            }
                            if ((constraintWidget4.m15771x() || !z20) && !((constraintWidget4.m15772y() && z20) || (constraintWidget4 instanceof VirtualLayout) || constraintWidget4.m15771x() || constraintWidget4.m15772y())) {
                                i33++;
                                z = z17;
                            } else {
                                i9 = 1073741824;
                                z2 = false;
                            }
                        } else {
                            z2 = z;
                            i9 = 1073741824;
                        }
                    }
                } else {
                    z2 = z;
                    i9 = 1073741824;
                }
                z3 = z2 & ((mode != i9 && mode2 == i9) || zM15790b);
                if (z3) {
                    iMin2 = Math.min(constraintWidgetContainer6.f36889x[0], i38);
                    iMin3 = Math.min(constraintWidgetContainer6.f36889x[1], i39);
                    if (mode == 1073741824 && constraintWidgetContainer6.m15766s() != iMin2) {
                        constraintWidgetContainer6.m15748N(iMin2);
                        constraintWidgetContainer6.m15782X();
                    }
                    if (mode2 == 1073741824 && constraintWidgetContainer6.m15760m() != iMin3) {
                        constraintWidgetContainer6.m15743I(iMin3);
                        constraintWidgetContainer6.m15782X();
                    }
                    if (mode == 1073741824 || mode2 != 1073741824) {
                        aVar3 = aVar;
                        aVar2 = aVar2;
                        bVar = bVar;
                        z4 = z3;
                        i10 = iM15766s;
                        dependencyGraph = constraintWidgetContainer6.f36899o0;
                        if (dependencyGraph.f36959b) {
                            for (ConstraintWidget constraintWidget5 : dependencyGraph.f36958a.f36942m0) {
                                constraintWidget5.m15756i();
                                constraintWidget5.f36854a = false;
                                HorizontalWidgetRun horizontalWidgetRun2 = constraintWidget5.f36860d;
                                horizontalWidgetRun2.f37005e.f36975j = false;
                                horizontalWidgetRun2.f37007g = false;
                                horizontalWidgetRun2.m15824n();
                                VerticalWidgetRun verticalWidgetRun2 = constraintWidget5.f36862e;
                                verticalWidgetRun2.f37005e.f36975j = false;
                                verticalWidgetRun2.f37007g = false;
                                verticalWidgetRun2.m15827m();
                            }
                            i29 = 0;
                            dependencyGraph.f36958a.m15756i();
                            ConstraintWidgetContainer constraintWidgetContainer7 = dependencyGraph.f36958a;
                            constraintWidgetContainer7.f36854a = false;
                            HorizontalWidgetRun horizontalWidgetRun3 = constraintWidgetContainer7.f36860d;
                            horizontalWidgetRun3.f37005e.f36975j = false;
                            horizontalWidgetRun3.f37007g = false;
                            horizontalWidgetRun3.m15824n();
                            VerticalWidgetRun verticalWidgetRun3 = dependencyGraph.f36958a.f36862e;
                            verticalWidgetRun3.f37005e.f36975j = false;
                            verticalWidgetRun3.f37007g = false;
                            verticalWidgetRun3.m15827m();
                            dependencyGraph.m15804c();
                        } else {
                            i29 = 0;
                        }
                        dependencyGraph.m15803b(dependencyGraph.f36961d);
                        ConstraintWidgetContainer constraintWidgetContainer8 = dependencyGraph.f36958a;
                        constraintWidgetContainer8.f36849V = i29;
                        constraintWidgetContainer8.f36850W = i29;
                        constraintWidgetContainer8.f36860d.f37008h.mo15810c(i29);
                        dependencyGraph.f36958a.f36862e.f37008h.mo15810c(i29);
                        i30 = 1073741824;
                        if (mode == 1073741824) {
                            i31 = 1;
                            zM15781W = constraintWidgetContainer6.m15781W(zM15790b, i29) & true;
                            i11 = 1;
                        } else {
                            i31 = 1;
                            zM15781W = true;
                            i11 = 0;
                        }
                        if (mode2 == 1073741824) {
                            zM15781W &= constraintWidgetContainer6.m15781W(zM15790b, i31);
                            i11++;
                        }
                    } else {
                        DependencyGraph dependencyGraph2 = constraintWidgetContainer6.f36899o0;
                        boolean z21 = zM15790b & true;
                        if (dependencyGraph2.f36959b || dependencyGraph2.f36960c) {
                            for (ConstraintWidget constraintWidget6 : dependencyGraph2.f36958a.f36942m0) {
                                constraintWidget6.m15756i();
                                constraintWidget6.f36854a = false;
                                constraintWidget6.f36860d.m15824n();
                                constraintWidget6.f36862e.m15827m();
                            }
                            dependencyGraph2.f36958a.m15756i();
                            ConstraintWidgetContainer constraintWidgetContainer9 = dependencyGraph2.f36958a;
                            i32 = 0;
                            constraintWidgetContainer9.f36854a = false;
                            constraintWidgetContainer9.f36860d.m15824n();
                            dependencyGraph2.f36958a.f36862e.m15827m();
                            dependencyGraph2.f36960c = false;
                        } else {
                            i32 = 0;
                        }
                        dependencyGraph2.m15803b(dependencyGraph2.f36961d);
                        ConstraintWidgetContainer constraintWidgetContainer10 = dependencyGraph2.f36958a;
                        constraintWidgetContainer10.f36849V = i32;
                        constraintWidgetContainer10.f36850W = i32;
                        int iM15759l2 = constraintWidgetContainer10.m15759l(i32);
                        int iM15759l3 = dependencyGraph2.f36958a.m15759l(1);
                        if (dependencyGraph2.f36959b) {
                            dependencyGraph2.m15804c();
                        }
                        int iM15767t = dependencyGraph2.f36958a.m15767t();
                        z4 = z3;
                        int iM15768u = dependencyGraph2.f36958a.m15768u();
                        aVar3 = aVar;
                        dependencyGraph2.f36958a.f36860d.f37008h.mo15810c(iM15767t);
                        dependencyGraph2.f36958a.f36862e.f37008h.mo15810c(iM15768u);
                        dependencyGraph2.m15808g();
                        if (iM15759l2 == 2 || iM15759l3 == 2) {
                            if (z21) {
                                Iterator<WidgetRun> it = dependencyGraph2.f36962e.iterator();
                                while (it.hasNext()) {
                                    if (!it.next().mo15799k()) {
                                        z21 = false;
                                        break;
                                    }
                                }
                            }
                            if (z21 && iM15759l2 == 2) {
                                ConstraintWidgetContainer constraintWidgetContainer11 = dependencyGraph2.f36958a;
                                constraintWidgetContainer11.f36843P[0] = 1;
                                constraintWidgetContainer11.m15748N(dependencyGraph2.m15805d(constraintWidgetContainer11, 0));
                                ConstraintWidgetContainer constraintWidgetContainer12 = dependencyGraph2.f36958a;
                                constraintWidgetContainer12.f36860d.f37005e.mo15810c(constraintWidgetContainer12.m15766s());
                            }
                            if (z21 && iM15759l3 == 2) {
                                ConstraintWidgetContainer constraintWidgetContainer13 = dependencyGraph2.f36958a;
                                constraintWidgetContainer13.f36843P[1] = 1;
                                constraintWidgetContainer13.m15743I(dependencyGraph2.m15805d(constraintWidgetContainer13, 1));
                                ConstraintWidgetContainer constraintWidgetContainer14 = dependencyGraph2.f36958a;
                                constraintWidgetContainer14.f36862e.f37005e.mo15810c(constraintWidgetContainer14.m15760m());
                            }
                        } else {
                            aVar2 = aVar2;
                            bVar = bVar;
                        }
                        ConstraintWidgetContainer constraintWidgetContainer15 = dependencyGraph2.f36958a;
                        int[] iArr2 = constraintWidgetContainer15.f36843P;
                        i10 = iM15766s;
                        if (iArr2[0] == 1 || iArr2[0] == 4) {
                            int iM15766s8 = constraintWidgetContainer15.m15766s() + iM15767t;
                            dependencyGraph2.f36958a.f36860d.f37009i.mo15810c(iM15766s8);
                            dependencyGraph2.f36958a.f36860d.f37005e.mo15810c(iM15766s8 - iM15767t);
                            dependencyGraph2.m15808g();
                            ConstraintWidgetContainer constraintWidgetContainer16 = dependencyGraph2.f36958a;
                            int[] iArr3 = constraintWidgetContainer16.f36843P;
                            if (iArr3[1] == 1 || iArr3[1] == 4) {
                                int iM15760m8 = constraintWidgetContainer16.m15760m() + iM15768u;
                                dependencyGraph2.f36958a.f36862e.f37009i.mo15810c(iM15760m8);
                                dependencyGraph2.f36958a.f36862e.f37005e.mo15810c(iM15760m8 - iM15768u);
                            }
                            dependencyGraph2.m15808g();
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        for (WidgetRun widgetRun : dependencyGraph2.f36962e) {
                            if (widgetRun.f37002b != dependencyGraph2.f36958a || widgetRun.f37007g) {
                                widgetRun.mo15796e();
                            }
                        }
                        Iterator<WidgetRun> it2 = dependencyGraph2.f36962e.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z16 = true;
                                break;
                            }
                            WidgetRun next = it2.next();
                            if (z15 || next.f37002b != dependencyGraph2.f36958a) {
                                if (!next.f37008h.f36975j || ((!next.f37009i.f36975j && !(next instanceof GuidelineReference)) || (!next.f37005e.f36975j && !(next instanceof ChainRun) && !(next instanceof GuidelineReference)))) {
                                    z16 = false;
                                    break;
                                }
                            }
                        }
                        dependencyGraph2.f36958a.m15744J(iM15759l2);
                        dependencyGraph2.f36958a.m15747M(iM15759l3);
                        zM15781W = z16;
                        i30 = 1073741824;
                        i11 = 2;
                    }
                    if (zM15781W) {
                        if (mode == i30) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (mode2 == i30) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        constraintWidgetContainer6.mo15749O(z13, z14);
                    }
                } else {
                    aVar3 = aVar;
                    aVar2 = aVar2;
                    bVar = bVar;
                    z4 = z3;
                    i10 = iM15766s;
                    zM15781W = false;
                    i11 = 0;
                }
                if (zM15781W || i11 != 2) {
                    i12 = constraintWidgetContainer6.f36909y0;
                    if (size > 0) {
                        size3 = constraintWidgetContainer6.f36942m0.size();
                        boolean zM15783Z = constraintWidgetContainer6.m15783Z(64);
                        bVar6 = constraintWidgetContainer6.f36900p0;
                        for (i26 = 0; i26 < size3; i26++) {
                            constraintWidget3 = constraintWidgetContainer6.f36942m0.get(i26);
                            if ((constraintWidget3 instanceof Guideline2) && !(constraintWidget3 instanceof Barrier2) && !constraintWidget3.f36829B && (!zM15783Z || (horizontalWidgetRun = constraintWidget3.f36860d) == null || (verticalWidgetRun = constraintWidget3.f36862e) == null || !horizontalWidgetRun.f37005e.f36975j || !verticalWidgetRun.f37005e.f36975j)) {
                                iM15759l = constraintWidget3.m15759l(0);
                                int iM15759l4 = constraintWidget3.m15759l(1);
                                if (iM15759l == 3 || constraintWidget3.f36878m == 1 || iM15759l4 != 3 || constraintWidget3.f36879n == 1) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                                if (z12 && constraintWidgetContainer6.m15783Z(1) && !(constraintWidget3 instanceof VirtualLayout)) {
                                    if (iM15759l == 3 && constraintWidget3.f36878m == 0 && iM15759l4 != 3 && !constraintWidget3.m15771x()) {
                                        z12 = true;
                                    }
                                    if (iM15759l4 == 3 && constraintWidget3.f36879n == 0 && iM15759l != 3 && !constraintWidget3.m15771x()) {
                                        z12 = true;
                                    }
                                    if (iM15759l == 3 || iM15759l4 == 3) {
                                        if (constraintWidget3.f36847T > 0.0f) {
                                            z12 = true;
                                        }
                                    }
                                    if (z12) {
                                        basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                                    }
                                }
                                if (z12) {
                                    basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                                }
                            }
                        }
                        c0095b = (C0095b) bVar6;
                        childCount = c0095b.f608a.getChildCount();
                        for (i27 = 0; i27 < childCount; i27++) {
                            childAt = c0095b.f608a.getChildAt(i27);
                            if (childAt instanceof Placeholder) {
                                placeholder = (Placeholder) childAt;
                                if (placeholder.f37161g != null) {
                                    c0094a = (C0094a) placeholder.getLayoutParams();
                                    c0094a2 = (C0094a) placeholder.f37161g.getLayoutParams();
                                    c0094a2.f593m0.f36861d0 = 0;
                                    if (c0094a.f593m0.m15761n() != 1) {
                                        c0094a.f593m0.m15748N(c0094a2.f593m0.m15766s());
                                    }
                                    if (c0094a.f593m0.m15765r() != 1) {
                                        c0094a.f593m0.m15743I(c0094a2.f593m0.m15760m());
                                    }
                                    c0094a2.f593m0.f36861d0 = 8;
                                }
                            }
                        }
                        size4 = c0095b.f608a.f524g.size();
                        if (size4 > 0) {
                            for (i28 = 0; i28 < size4; i28++) {
                                c0095b.f608a.f524g.get(i28).m15846i();
                            }
                        }
                    }
                    basicMeasure.m15793c(constraintWidgetContainer6);
                    size2 = basicMeasure.f36943a.size();
                    i13 = i10;
                    if (size > 0) {
                        basicMeasure.m15792b(constraintWidgetContainer6, i13, iM15760m);
                    }
                    if (size2 > 0) {
                        if (constraintWidgetContainer6.m15761n() == 2) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (constraintWidgetContainer6.m15765r() == 2) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        iMax3 = Math.max(constraintWidgetContainer6.m15766s(), basicMeasure.f36945c.f36852Y);
                        iMax4 = Math.max(constraintWidgetContainer6.m15760m(), basicMeasure.f36945c.f36853Z);
                        i15 = 0;
                        z7 = false;
                        while (i15 < size2) {
                            constraintWidget2 = basicMeasure.f36943a.get(i15);
                            if (constraintWidget2 instanceof VirtualLayout) {
                                iM15766s4 = constraintWidget2.m15766s();
                                iM15760m4 = constraintWidget2.m15760m();
                                bVar5 = bVar;
                                boolean zM15791a2 = z7 | basicMeasure.m15791a(bVar5, constraintWidget2, 1);
                                iM15766s5 = constraintWidget2.m15766s();
                                z11 = zM15791a2;
                                iM15760m5 = constraintWidget2.m15760m();
                                if (iM15766s5 != iM15766s4) {
                                    constraintWidget2.m15748N(iM15766s5);
                                    if (z5 || constraintWidget2.m15764q() <= iMax3) {
                                        aVar6 = aVar2;
                                    } else {
                                        aVar6 = aVar2;
                                        iMax3 = Math.max(iMax3, constraintWidget2.mo15757j(aVar6).m15728d() + constraintWidget2.m15764q());
                                    }
                                    z11 = true;
                                } else {
                                    aVar6 = aVar2;
                                }
                                if (iM15760m5 != iM15760m4) {
                                    constraintWidget2.m15743I(iM15760m5);
                                    if (z6 || constraintWidget2.m15758k() <= iMax4) {
                                        aVar7 = aVar3;
                                    } else {
                                        aVar7 = aVar3;
                                        iMax4 = Math.max(iMax4, constraintWidget2.mo15757j(aVar7).m15728d() + constraintWidget2.m15758k());
                                    }
                                    z11 = true;
                                } else {
                                    aVar7 = aVar3;
                                }
                                z7 = ((VirtualLayout) constraintWidget2).f36941o0 | z11;
                            } else {
                                aVar7 = aVar3;
                                aVar6 = aVar2;
                                bVar5 = bVar;
                            }
                            i15++;
                            bVar = bVar5;
                            aVar3 = aVar7;
                            aVar2 = aVar6;
                            i12 = i12;
                        }
                        int i44 = i12;
                        aVar4 = aVar3;
                        aVar5 = aVar2;
                        bVar2 = bVar;
                        i16 = 0;
                        i17 = 2;
                        while (true) {
                            if (i16 >= i17) {
                                i18 = i13;
                                i19 = iM15760m;
                                break;
                            }
                            iMax5 = iMax4;
                            z10 = z7;
                            i20 = 0;
                            while (i20 < size2) {
                                constraintWidget = basicMeasure.f36943a.get(i20);
                                int i45 = size2;
                                if (((constraintWidget instanceof Helper) || (constraintWidget instanceof VirtualLayout)) && !(constraintWidget instanceof Guideline2)) {
                                    constraintWidgetContainer2 = constraintWidgetContainer6;
                                    if (constraintWidget.f36861d0 == 8 && ((!z4 || !constraintWidget.f36860d.f37005e.f36975j || !constraintWidget.f36862e.f37005e.f36975j) && !(constraintWidget instanceof VirtualLayout))) {
                                        iM15766s2 = constraintWidget.m15766s();
                                        iM15760m2 = constraintWidget.m15760m();
                                        i24 = i13;
                                        int i46 = constraintWidget.f36851X;
                                        i25 = iM15760m;
                                        zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                        iM15766s3 = constraintWidget.m15766s();
                                        bVar4 = bVar2;
                                        iM15760m3 = constraintWidget.m15760m();
                                        if (iM15766s3 != iM15766s2) {
                                            constraintWidget.m15748N(iM15766s3);
                                            if (z5 && constraintWidget.m15764q() > iMax3) {
                                                iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                            }
                                            zM15791a = true;
                                        }
                                        if (iM15760m3 != iM15760m2) {
                                            constraintWidget.m15743I(iM15760m3);
                                            if (z6 && constraintWidget.m15758k() > iMax5) {
                                                iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                            }
                                            zM15791a = true;
                                        }
                                        if (constraintWidget.f36891z || i46 == constraintWidget.f36851X) {
                                            z10 = zM15791a;
                                        } else {
                                            z10 = true;
                                        }
                                    }
                                    i20++;
                                    size2 = i45;
                                    constraintWidgetContainer6 = constraintWidgetContainer2;
                                    iM15760m = i25;
                                    bVar2 = bVar4;
                                    i13 = i24;
                                } else {
                                    constraintWidgetContainer2 = constraintWidgetContainer6;
                                }
                                bVar4 = bVar2;
                                i24 = i13;
                                i25 = iM15760m;
                                i20++;
                                size2 = i45;
                                constraintWidgetContainer6 = constraintWidgetContainer2;
                                iM15760m = i25;
                                bVar2 = bVar4;
                                i13 = i24;
                            }
                            constraintWidgetContainer = constraintWidgetContainer6;
                            bVar3 = bVar2;
                            i21 = size2;
                            i22 = i13;
                            i23 = iM15760m;
                            if (!z10) {
                                constraintWidgetContainer6 = constraintWidgetContainer;
                                i19 = i23;
                                i18 = i22;
                                z7 = z10;
                                iMax4 = iMax5;
                                break;
                            }
                            constraintWidgetContainer6 = constraintWidgetContainer;
                            basicMeasure.m15792b(constraintWidgetContainer6, i22, i23);
                            i16++;
                            i13 = i22;
                            iM15760m = i23;
                            iMax4 = iMax5;
                            size2 = i21;
                            bVar2 = bVar3;
                            i17 = 2;
                            z7 = false;
                        }
                        if (z7) {
                            basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                            if (constraintWidgetContainer6.m15766s() < iMax3) {
                                constraintWidgetContainer6.m15748N(iMax3);
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (constraintWidgetContainer6.m15760m() < iMax4) {
                                constraintWidgetContainer6.m15743I(iMax4);
                                z9 = true;
                            } else {
                                z9 = z8;
                            }
                            if (z9) {
                                basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                            }
                        }
                        i14 = i44;
                    } else {
                        i14 = i12;
                    }
                    constraintWidgetContainer6.m15784a0(i14);
                }
                int iM15766s9 = this.f525h.m15766s();
                int iM15760m9 = this.f525h.m15760m();
                ConstraintWidgetContainer constraintWidgetContainer17 = this.f525h;
                m281h(i, i2, iM15766s9, iM15760m9, constraintWidgetContainer17.f36910z0, constraintWidgetContainer17.f36892A0);
            }
            if (childCount3 == 0) {
                iMax2 = Math.max(0, this.f527j);
            } else {
                iMax2 = i39;
            }
            i7 = 2;
            if (iMin == constraintWidgetContainer6.m15766s()) {
                constraintWidgetContainer6.f36899o0.f36960c = true;
                i8 = 0;
            } else {
                constraintWidgetContainer6.f36899o0.f36960c = true;
                i8 = 0;
            }
            constraintWidgetContainer6.f36849V = i8;
            constraintWidgetContainer6.f36850W = i8;
            int i47 = this.f528k - i41;
            int[] iArr4 = constraintWidgetContainer6.f36889x;
            iArr4[i8] = i47;
            iArr4[1] = this.f529l - i40;
            constraintWidgetContainer6.m15746L(i8);
            constraintWidgetContainer6.m15745K(i8);
            constraintWidgetContainer6.f36843P[i8] = i5;
            constraintWidgetContainer6.m15748N(iMin);
            constraintWidgetContainer6.f36843P[1] = i7;
            constraintWidgetContainer6.m15743I(iMax2);
            constraintWidgetContainer6.m15746L(this.f526i - i41);
            constraintWidgetContainer6.m15745K(this.f527j - i40);
            constraintWidgetContainer6.f36903s0 = iMax8;
            constraintWidgetContainer6.f36904t0 = iMax6;
            basicMeasure = constraintWidgetContainer6.f36898n0;
            Objects.requireNonNull(basicMeasure);
            aVar = ConstraintAnchor.a.BOTTOM;
            aVar2 = ConstraintAnchor.a.RIGHT;
            bVar = constraintWidgetContainer6.f36900p0;
            size = constraintWidgetContainer6.f36942m0.size();
            iM15766s = constraintWidgetContainer6.m15766s();
            iM15760m = constraintWidgetContainer6.m15760m();
            zM15790b = Optimizer.m15790b(i36, 128);
            if (zM15790b) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        constraintWidget4 = constraintWidgetContainer6.f36942m0.get(i33);
                        z17 = z;
                        if (constraintWidget4.m15761n() == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (constraintWidget4.m15765r() == 3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        if (constraintWidget4.m15771x()) {
                            i33++;
                            z = z17;
                        } else {
                            i33++;
                            z = z17;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zM15790b);
            if (z3) {
                iMin2 = Math.min(constraintWidgetContainer6.f36889x[0], i38);
                iMin3 = Math.min(constraintWidgetContainer6.f36889x[1], i39);
                if (mode == 1073741824) {
                    constraintWidgetContainer6.m15748N(iMin2);
                    constraintWidgetContainer6.m15782X();
                }
                if (mode2 == 1073741824) {
                    constraintWidgetContainer6.m15743I(iMin3);
                    constraintWidgetContainer6.m15782X();
                }
                if (mode == 1073741824) {
                    aVar3 = aVar;
                    aVar2 = aVar2;
                    bVar = bVar;
                    z4 = z3;
                    i10 = iM15766s;
                    dependencyGraph = constraintWidgetContainer6.f36899o0;
                    if (dependencyGraph.f36959b) {
                        while (r3.hasNext()) {
                            constraintWidget5.m15756i();
                            constraintWidget5.f36854a = false;
                            HorizontalWidgetRun horizontalWidgetRun4 = constraintWidget5.f36860d;
                            horizontalWidgetRun4.f37005e.f36975j = false;
                            horizontalWidgetRun4.f37007g = false;
                            horizontalWidgetRun4.m15824n();
                            VerticalWidgetRun verticalWidgetRun4 = constraintWidget5.f36862e;
                            verticalWidgetRun4.f37005e.f36975j = false;
                            verticalWidgetRun4.f37007g = false;
                            verticalWidgetRun4.m15827m();
                        }
                        i29 = 0;
                        dependencyGraph.f36958a.m15756i();
                        ConstraintWidgetContainer constraintWidgetContainer18 = dependencyGraph.f36958a;
                        constraintWidgetContainer18.f36854a = false;
                        HorizontalWidgetRun horizontalWidgetRun5 = constraintWidgetContainer18.f36860d;
                        horizontalWidgetRun5.f37005e.f36975j = false;
                        horizontalWidgetRun5.f37007g = false;
                        horizontalWidgetRun5.m15824n();
                        VerticalWidgetRun verticalWidgetRun5 = dependencyGraph.f36958a.f36862e;
                        verticalWidgetRun5.f37005e.f36975j = false;
                        verticalWidgetRun5.f37007g = false;
                        verticalWidgetRun5.m15827m();
                        dependencyGraph.m15804c();
                    } else {
                        i29 = 0;
                    }
                    dependencyGraph.m15803b(dependencyGraph.f36961d);
                    ConstraintWidgetContainer constraintWidgetContainer19 = dependencyGraph.f36958a;
                    constraintWidgetContainer19.f36849V = i29;
                    constraintWidgetContainer19.f36850W = i29;
                    constraintWidgetContainer19.f36860d.f37008h.mo15810c(i29);
                    dependencyGraph.f36958a.f36862e.f37008h.mo15810c(i29);
                    i30 = 1073741824;
                    if (mode == 1073741824) {
                        i31 = 1;
                        zM15781W = constraintWidgetContainer6.m15781W(zM15790b, i29) & true;
                        i11 = 1;
                    } else {
                        i31 = 1;
                        zM15781W = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zM15781W &= constraintWidgetContainer6.m15781W(zM15790b, i31);
                        i11++;
                    }
                } else {
                    aVar3 = aVar;
                    aVar2 = aVar2;
                    bVar = bVar;
                    z4 = z3;
                    i10 = iM15766s;
                    dependencyGraph = constraintWidgetContainer6.f36899o0;
                    if (dependencyGraph.f36959b) {
                        while (r3.hasNext()) {
                            constraintWidget5.m15756i();
                            constraintWidget5.f36854a = false;
                            HorizontalWidgetRun horizontalWidgetRun6 = constraintWidget5.f36860d;
                            horizontalWidgetRun6.f37005e.f36975j = false;
                            horizontalWidgetRun6.f37007g = false;
                            horizontalWidgetRun6.m15824n();
                            VerticalWidgetRun verticalWidgetRun6 = constraintWidget5.f36862e;
                            verticalWidgetRun6.f37005e.f36975j = false;
                            verticalWidgetRun6.f37007g = false;
                            verticalWidgetRun6.m15827m();
                        }
                        i29 = 0;
                        dependencyGraph.f36958a.m15756i();
                        ConstraintWidgetContainer constraintWidgetContainer110 = dependencyGraph.f36958a;
                        constraintWidgetContainer110.f36854a = false;
                        HorizontalWidgetRun horizontalWidgetRun7 = constraintWidgetContainer110.f36860d;
                        horizontalWidgetRun7.f37005e.f36975j = false;
                        horizontalWidgetRun7.f37007g = false;
                        horizontalWidgetRun7.m15824n();
                        VerticalWidgetRun verticalWidgetRun7 = dependencyGraph.f36958a.f36862e;
                        verticalWidgetRun7.f37005e.f36975j = false;
                        verticalWidgetRun7.f37007g = false;
                        verticalWidgetRun7.m15827m();
                        dependencyGraph.m15804c();
                    } else {
                        i29 = 0;
                    }
                    dependencyGraph.m15803b(dependencyGraph.f36961d);
                    ConstraintWidgetContainer constraintWidgetContainer111 = dependencyGraph.f36958a;
                    constraintWidgetContainer111.f36849V = i29;
                    constraintWidgetContainer111.f36850W = i29;
                    constraintWidgetContainer111.f36860d.f37008h.mo15810c(i29);
                    dependencyGraph.f36958a.f36862e.f37008h.mo15810c(i29);
                    i30 = 1073741824;
                    if (mode == 1073741824) {
                        i31 = 1;
                        zM15781W = constraintWidgetContainer6.m15781W(zM15790b, i29) & true;
                        i11 = 1;
                    } else {
                        i31 = 1;
                        zM15781W = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zM15781W &= constraintWidgetContainer6.m15781W(zM15790b, i31);
                        i11++;
                    }
                }
                if (zM15781W) {
                    if (mode == i30) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (mode2 == i30) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    constraintWidgetContainer6.mo15749O(z13, z14);
                }
            } else {
                aVar3 = aVar;
                aVar2 = aVar2;
                bVar = bVar;
                z4 = z3;
                i10 = iM15766s;
                zM15781W = false;
                i11 = 0;
            }
            if (zM15781W) {
                i12 = constraintWidgetContainer6.f36909y0;
                if (size > 0) {
                    size3 = constraintWidgetContainer6.f36942m0.size();
                    boolean zM15783Z2 = constraintWidgetContainer6.m15783Z(64);
                    bVar6 = constraintWidgetContainer6.f36900p0;
                    while (i26 < size3) {
                        constraintWidget3 = constraintWidgetContainer6.f36942m0.get(i26);
                        if (constraintWidget3 instanceof Guideline2) {
                            iM15759l = constraintWidget3.m15759l(0);
                            int iM15759l5 = constraintWidget3.m15759l(1);
                            if (iM15759l == 3) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                            }
                            if (z12) {
                                basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                            }
                        }
                    }
                    c0095b = (C0095b) bVar6;
                    childCount = c0095b.f608a.getChildCount();
                    while (i27 < childCount) {
                        childAt = c0095b.f608a.getChildAt(i27);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.f37161g != null) {
                                c0094a = (C0094a) placeholder.getLayoutParams();
                                c0094a2 = (C0094a) placeholder.f37161g.getLayoutParams();
                                c0094a2.f593m0.f36861d0 = 0;
                                if (c0094a.f593m0.m15761n() != 1) {
                                    c0094a.f593m0.m15748N(c0094a2.f593m0.m15766s());
                                }
                                if (c0094a.f593m0.m15765r() != 1) {
                                    c0094a.f593m0.m15743I(c0094a2.f593m0.m15760m());
                                }
                                c0094a2.f593m0.f36861d0 = 8;
                            }
                        }
                    }
                    size4 = c0095b.f608a.f524g.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            c0095b.f608a.f524g.get(i28).m15846i();
                        }
                    }
                }
                basicMeasure.m15793c(constraintWidgetContainer6);
                size2 = basicMeasure.f36943a.size();
                i13 = i10;
                if (size > 0) {
                    basicMeasure.m15792b(constraintWidgetContainer6, i13, iM15760m);
                }
                if (size2 > 0) {
                    if (constraintWidgetContainer6.m15761n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (constraintWidgetContainer6.m15765r() == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    iMax3 = Math.max(constraintWidgetContainer6.m15766s(), basicMeasure.f36945c.f36852Y);
                    iMax4 = Math.max(constraintWidgetContainer6.m15760m(), basicMeasure.f36945c.f36853Z);
                    i15 = 0;
                    z7 = false;
                    while (i15 < size2) {
                        constraintWidget2 = basicMeasure.f36943a.get(i15);
                        if (constraintWidget2 instanceof VirtualLayout) {
                            aVar7 = aVar3;
                            aVar6 = aVar2;
                            bVar5 = bVar;
                        } else {
                            iM15766s4 = constraintWidget2.m15766s();
                            iM15760m4 = constraintWidget2.m15760m();
                            bVar5 = bVar;
                            boolean zM15791a3 = z7 | basicMeasure.m15791a(bVar5, constraintWidget2, 1);
                            iM15766s5 = constraintWidget2.m15766s();
                            z11 = zM15791a3;
                            iM15760m5 = constraintWidget2.m15760m();
                            if (iM15766s5 != iM15766s4) {
                                constraintWidget2.m15748N(iM15766s5);
                                if (z5) {
                                    aVar6 = aVar2;
                                } else {
                                    aVar6 = aVar2;
                                }
                                z11 = true;
                            } else {
                                aVar6 = aVar2;
                            }
                            if (iM15760m5 != iM15760m4) {
                                constraintWidget2.m15743I(iM15760m5);
                                if (z6) {
                                    aVar7 = aVar3;
                                } else {
                                    aVar7 = aVar3;
                                }
                                z11 = true;
                            } else {
                                aVar7 = aVar3;
                            }
                            z7 = ((VirtualLayout) constraintWidget2).f36941o0 | z11;
                        }
                        i15++;
                        bVar = bVar5;
                        aVar3 = aVar7;
                        aVar2 = aVar6;
                        i12 = i12;
                    }
                    int i48 = i12;
                    aVar4 = aVar3;
                    aVar5 = aVar2;
                    bVar2 = bVar;
                    i16 = 0;
                    i17 = 2;
                    while (true) {
                        if (i16 >= i17) {
                            i18 = i13;
                            i19 = iM15760m;
                            break;
                        }
                        iMax5 = iMax4;
                        z10 = z7;
                        i20 = 0;
                        while (i20 < size2) {
                            constraintWidget = basicMeasure.f36943a.get(i20);
                            int i49 = size2;
                            if (constraintWidget instanceof Helper) {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i410 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            } else {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i411 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            }
                            i20++;
                            size2 = i49;
                            constraintWidgetContainer6 = constraintWidgetContainer2;
                            iM15760m = i25;
                            bVar2 = bVar4;
                            i13 = i24;
                        }
                        constraintWidgetContainer = constraintWidgetContainer6;
                        bVar3 = bVar2;
                        i21 = size2;
                        i22 = i13;
                        i23 = iM15760m;
                        if (!z10) {
                            constraintWidgetContainer6 = constraintWidgetContainer;
                            i19 = i23;
                            i18 = i22;
                            z7 = z10;
                            iMax4 = iMax5;
                            break;
                        }
                        constraintWidgetContainer6 = constraintWidgetContainer;
                        basicMeasure.m15792b(constraintWidgetContainer6, i22, i23);
                        i16++;
                        i13 = i22;
                        iM15760m = i23;
                        iMax4 = iMax5;
                        size2 = i21;
                        bVar2 = bVar3;
                        i17 = 2;
                        z7 = false;
                    }
                    if (z7) {
                        basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        if (constraintWidgetContainer6.m15766s() < iMax3) {
                            constraintWidgetContainer6.m15748N(iMax3);
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (constraintWidgetContainer6.m15760m() < iMax4) {
                            constraintWidgetContainer6.m15743I(iMax4);
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                        if (z9) {
                            basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        }
                    }
                    i14 = i48;
                } else {
                    i14 = i12;
                }
                constraintWidgetContainer6.m15784a0(i14);
            } else {
                i12 = constraintWidgetContainer6.f36909y0;
                if (size > 0) {
                    size3 = constraintWidgetContainer6.f36942m0.size();
                    boolean zM15783Z3 = constraintWidgetContainer6.m15783Z(64);
                    bVar6 = constraintWidgetContainer6.f36900p0;
                    while (i26 < size3) {
                        constraintWidget3 = constraintWidgetContainer6.f36942m0.get(i26);
                        if (constraintWidget3 instanceof Guideline2) {
                            iM15759l = constraintWidget3.m15759l(0);
                            int iM15759l6 = constraintWidget3.m15759l(1);
                            if (iM15759l == 3) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                            }
                            if (z12) {
                                basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                            }
                        }
                    }
                    c0095b = (C0095b) bVar6;
                    childCount = c0095b.f608a.getChildCount();
                    while (i27 < childCount) {
                        childAt = c0095b.f608a.getChildAt(i27);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.f37161g != null) {
                                c0094a = (C0094a) placeholder.getLayoutParams();
                                c0094a2 = (C0094a) placeholder.f37161g.getLayoutParams();
                                c0094a2.f593m0.f36861d0 = 0;
                                if (c0094a.f593m0.m15761n() != 1) {
                                    c0094a.f593m0.m15748N(c0094a2.f593m0.m15766s());
                                }
                                if (c0094a.f593m0.m15765r() != 1) {
                                    c0094a.f593m0.m15743I(c0094a2.f593m0.m15760m());
                                }
                                c0094a2.f593m0.f36861d0 = 8;
                            }
                        }
                    }
                    size4 = c0095b.f608a.f524g.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            c0095b.f608a.f524g.get(i28).m15846i();
                        }
                    }
                }
                basicMeasure.m15793c(constraintWidgetContainer6);
                size2 = basicMeasure.f36943a.size();
                i13 = i10;
                if (size > 0) {
                    basicMeasure.m15792b(constraintWidgetContainer6, i13, iM15760m);
                }
                if (size2 > 0) {
                    if (constraintWidgetContainer6.m15761n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (constraintWidgetContainer6.m15765r() == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    iMax3 = Math.max(constraintWidgetContainer6.m15766s(), basicMeasure.f36945c.f36852Y);
                    iMax4 = Math.max(constraintWidgetContainer6.m15760m(), basicMeasure.f36945c.f36853Z);
                    i15 = 0;
                    z7 = false;
                    while (i15 < size2) {
                        constraintWidget2 = basicMeasure.f36943a.get(i15);
                        if (constraintWidget2 instanceof VirtualLayout) {
                            aVar7 = aVar3;
                            aVar6 = aVar2;
                            bVar5 = bVar;
                        } else {
                            iM15766s4 = constraintWidget2.m15766s();
                            iM15760m4 = constraintWidget2.m15760m();
                            bVar5 = bVar;
                            boolean zM15791a4 = z7 | basicMeasure.m15791a(bVar5, constraintWidget2, 1);
                            iM15766s5 = constraintWidget2.m15766s();
                            z11 = zM15791a4;
                            iM15760m5 = constraintWidget2.m15760m();
                            if (iM15766s5 != iM15766s4) {
                                constraintWidget2.m15748N(iM15766s5);
                                if (z5) {
                                    aVar6 = aVar2;
                                } else {
                                    aVar6 = aVar2;
                                }
                                z11 = true;
                            } else {
                                aVar6 = aVar2;
                            }
                            if (iM15760m5 != iM15760m4) {
                                constraintWidget2.m15743I(iM15760m5);
                                if (z6) {
                                    aVar7 = aVar3;
                                } else {
                                    aVar7 = aVar3;
                                }
                                z11 = true;
                            } else {
                                aVar7 = aVar3;
                            }
                            z7 = ((VirtualLayout) constraintWidget2).f36941o0 | z11;
                        }
                        i15++;
                        bVar = bVar5;
                        aVar3 = aVar7;
                        aVar2 = aVar6;
                        i12 = i12;
                    }
                    int i412 = i12;
                    aVar4 = aVar3;
                    aVar5 = aVar2;
                    bVar2 = bVar;
                    i16 = 0;
                    i17 = 2;
                    while (true) {
                        if (i16 >= i17) {
                            i18 = i13;
                            i19 = iM15760m;
                            break;
                        }
                        iMax5 = iMax4;
                        z10 = z7;
                        i20 = 0;
                        while (i20 < size2) {
                            constraintWidget = basicMeasure.f36943a.get(i20);
                            int i413 = size2;
                            if (constraintWidget instanceof Helper) {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i414 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            } else {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i415 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            }
                            i20++;
                            size2 = i413;
                            constraintWidgetContainer6 = constraintWidgetContainer2;
                            iM15760m = i25;
                            bVar2 = bVar4;
                            i13 = i24;
                        }
                        constraintWidgetContainer = constraintWidgetContainer6;
                        bVar3 = bVar2;
                        i21 = size2;
                        i22 = i13;
                        i23 = iM15760m;
                        if (!z10) {
                            constraintWidgetContainer6 = constraintWidgetContainer;
                            i19 = i23;
                            i18 = i22;
                            z7 = z10;
                            iMax4 = iMax5;
                            break;
                        }
                        constraintWidgetContainer6 = constraintWidgetContainer;
                        basicMeasure.m15792b(constraintWidgetContainer6, i22, i23);
                        i16++;
                        i13 = i22;
                        iM15760m = i23;
                        iMax4 = iMax5;
                        size2 = i21;
                        bVar2 = bVar3;
                        i17 = 2;
                        z7 = false;
                    }
                    if (z7) {
                        basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        if (constraintWidgetContainer6.m15766s() < iMax3) {
                            constraintWidgetContainer6.m15748N(iMax3);
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (constraintWidgetContainer6.m15760m() < iMax4) {
                            constraintWidgetContainer6.m15743I(iMax4);
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                        if (z9) {
                            basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        }
                    }
                    i14 = i412;
                } else {
                    i14 = i12;
                }
                constraintWidgetContainer6.m15784a0(i14);
            }
            int iM15766s10 = this.f525h.m15766s();
            int iM15760m10 = this.f525h.m15760m();
            ConstraintWidgetContainer constraintWidgetContainer112 = this.f525h;
            m281h(i, i2, iM15766s10, iM15760m10, constraintWidgetContainer112.f36910z0, constraintWidgetContainer112.f36892A0);
        }
        iMax = childCount3 == 0 ? Math.max(0, this.f526i) : i38;
        i3 = iMax;
        i4 = 2;
        i6 = Integer.MIN_VALUE;
        int i416 = i3;
        i5 = i4;
        iMin = i416;
        if (mode2 != i6) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i7 = 1;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.f529l - i40, i39);
                    i7 = 1;
                }
            } else if (childCount3 == 0) {
                iMax2 = Math.max(0, this.f527j);
            } else {
                iMax2 = 0;
            }
            if (iMin == constraintWidgetContainer6.m15766s()) {
                constraintWidgetContainer6.f36899o0.f36960c = true;
                i8 = 0;
            } else {
                constraintWidgetContainer6.f36899o0.f36960c = true;
                i8 = 0;
            }
            constraintWidgetContainer6.f36849V = i8;
            constraintWidgetContainer6.f36850W = i8;
            int i417 = this.f528k - i41;
            int[] iArr5 = constraintWidgetContainer6.f36889x;
            iArr5[i8] = i417;
            iArr5[1] = this.f529l - i40;
            constraintWidgetContainer6.m15746L(i8);
            constraintWidgetContainer6.m15745K(i8);
            constraintWidgetContainer6.f36843P[i8] = i5;
            constraintWidgetContainer6.m15748N(iMin);
            constraintWidgetContainer6.f36843P[1] = i7;
            constraintWidgetContainer6.m15743I(iMax2);
            constraintWidgetContainer6.m15746L(this.f526i - i41);
            constraintWidgetContainer6.m15745K(this.f527j - i40);
            constraintWidgetContainer6.f36903s0 = iMax8;
            constraintWidgetContainer6.f36904t0 = iMax6;
            basicMeasure = constraintWidgetContainer6.f36898n0;
            Objects.requireNonNull(basicMeasure);
            aVar = ConstraintAnchor.a.BOTTOM;
            aVar2 = ConstraintAnchor.a.RIGHT;
            bVar = constraintWidgetContainer6.f36900p0;
            size = constraintWidgetContainer6.f36942m0.size();
            iM15766s = constraintWidgetContainer6.m15766s();
            iM15760m = constraintWidgetContainer6.m15760m();
            zM15790b = Optimizer.m15790b(i36, 128);
            if (zM15790b) {
                z = true;
            } else {
                z = true;
            }
            if (z) {
                i33 = 0;
                while (true) {
                    if (i33 < size) {
                        constraintWidget4 = constraintWidgetContainer6.f36942m0.get(i33);
                        z17 = z;
                        if (constraintWidget4.m15761n() == 3) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (constraintWidget4.m15765r() == 3) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z18) {
                            z20 = false;
                        } else {
                            z20 = false;
                        }
                        if (constraintWidget4.m15771x()) {
                            i33++;
                            z = z17;
                        } else {
                            i33++;
                            z = z17;
                        }
                        i9 = 1073741824;
                        z2 = false;
                    } else {
                        z2 = z;
                        i9 = 1073741824;
                    }
                }
            } else {
                z2 = z;
                i9 = 1073741824;
            }
            z3 = z2 & ((mode != i9 && mode2 == i9) || zM15790b);
            if (z3) {
                iMin2 = Math.min(constraintWidgetContainer6.f36889x[0], i38);
                iMin3 = Math.min(constraintWidgetContainer6.f36889x[1], i39);
                if (mode == 1073741824) {
                    constraintWidgetContainer6.m15748N(iMin2);
                    constraintWidgetContainer6.m15782X();
                }
                if (mode2 == 1073741824) {
                    constraintWidgetContainer6.m15743I(iMin3);
                    constraintWidgetContainer6.m15782X();
                }
                if (mode == 1073741824) {
                    aVar3 = aVar;
                    aVar2 = aVar2;
                    bVar = bVar;
                    z4 = z3;
                    i10 = iM15766s;
                    dependencyGraph = constraintWidgetContainer6.f36899o0;
                    if (dependencyGraph.f36959b) {
                        while (r3.hasNext()) {
                            constraintWidget5.m15756i();
                            constraintWidget5.f36854a = false;
                            HorizontalWidgetRun horizontalWidgetRun8 = constraintWidget5.f36860d;
                            horizontalWidgetRun8.f37005e.f36975j = false;
                            horizontalWidgetRun8.f37007g = false;
                            horizontalWidgetRun8.m15824n();
                            VerticalWidgetRun verticalWidgetRun8 = constraintWidget5.f36862e;
                            verticalWidgetRun8.f37005e.f36975j = false;
                            verticalWidgetRun8.f37007g = false;
                            verticalWidgetRun8.m15827m();
                        }
                        i29 = 0;
                        dependencyGraph.f36958a.m15756i();
                        ConstraintWidgetContainer constraintWidgetContainer113 = dependencyGraph.f36958a;
                        constraintWidgetContainer113.f36854a = false;
                        HorizontalWidgetRun horizontalWidgetRun9 = constraintWidgetContainer113.f36860d;
                        horizontalWidgetRun9.f37005e.f36975j = false;
                        horizontalWidgetRun9.f37007g = false;
                        horizontalWidgetRun9.m15824n();
                        VerticalWidgetRun verticalWidgetRun9 = dependencyGraph.f36958a.f36862e;
                        verticalWidgetRun9.f37005e.f36975j = false;
                        verticalWidgetRun9.f37007g = false;
                        verticalWidgetRun9.m15827m();
                        dependencyGraph.m15804c();
                    } else {
                        i29 = 0;
                    }
                    dependencyGraph.m15803b(dependencyGraph.f36961d);
                    ConstraintWidgetContainer constraintWidgetContainer114 = dependencyGraph.f36958a;
                    constraintWidgetContainer114.f36849V = i29;
                    constraintWidgetContainer114.f36850W = i29;
                    constraintWidgetContainer114.f36860d.f37008h.mo15810c(i29);
                    dependencyGraph.f36958a.f36862e.f37008h.mo15810c(i29);
                    i30 = 1073741824;
                    if (mode == 1073741824) {
                        i31 = 1;
                        zM15781W = constraintWidgetContainer6.m15781W(zM15790b, i29) & true;
                        i11 = 1;
                    } else {
                        i31 = 1;
                        zM15781W = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zM15781W &= constraintWidgetContainer6.m15781W(zM15790b, i31);
                        i11++;
                    }
                } else {
                    aVar3 = aVar;
                    aVar2 = aVar2;
                    bVar = bVar;
                    z4 = z3;
                    i10 = iM15766s;
                    dependencyGraph = constraintWidgetContainer6.f36899o0;
                    if (dependencyGraph.f36959b) {
                        while (r3.hasNext()) {
                            constraintWidget5.m15756i();
                            constraintWidget5.f36854a = false;
                            HorizontalWidgetRun horizontalWidgetRun10 = constraintWidget5.f36860d;
                            horizontalWidgetRun10.f37005e.f36975j = false;
                            horizontalWidgetRun10.f37007g = false;
                            horizontalWidgetRun10.m15824n();
                            VerticalWidgetRun verticalWidgetRun10 = constraintWidget5.f36862e;
                            verticalWidgetRun10.f37005e.f36975j = false;
                            verticalWidgetRun10.f37007g = false;
                            verticalWidgetRun10.m15827m();
                        }
                        i29 = 0;
                        dependencyGraph.f36958a.m15756i();
                        ConstraintWidgetContainer constraintWidgetContainer115 = dependencyGraph.f36958a;
                        constraintWidgetContainer115.f36854a = false;
                        HorizontalWidgetRun horizontalWidgetRun11 = constraintWidgetContainer115.f36860d;
                        horizontalWidgetRun11.f37005e.f36975j = false;
                        horizontalWidgetRun11.f37007g = false;
                        horizontalWidgetRun11.m15824n();
                        VerticalWidgetRun verticalWidgetRun11 = dependencyGraph.f36958a.f36862e;
                        verticalWidgetRun11.f37005e.f36975j = false;
                        verticalWidgetRun11.f37007g = false;
                        verticalWidgetRun11.m15827m();
                        dependencyGraph.m15804c();
                    } else {
                        i29 = 0;
                    }
                    dependencyGraph.m15803b(dependencyGraph.f36961d);
                    ConstraintWidgetContainer constraintWidgetContainer116 = dependencyGraph.f36958a;
                    constraintWidgetContainer116.f36849V = i29;
                    constraintWidgetContainer116.f36850W = i29;
                    constraintWidgetContainer116.f36860d.f37008h.mo15810c(i29);
                    dependencyGraph.f36958a.f36862e.f37008h.mo15810c(i29);
                    i30 = 1073741824;
                    if (mode == 1073741824) {
                        i31 = 1;
                        zM15781W = constraintWidgetContainer6.m15781W(zM15790b, i29) & true;
                        i11 = 1;
                    } else {
                        i31 = 1;
                        zM15781W = true;
                        i11 = 0;
                    }
                    if (mode2 == 1073741824) {
                        zM15781W &= constraintWidgetContainer6.m15781W(zM15790b, i31);
                        i11++;
                    }
                }
                if (zM15781W) {
                    if (mode == i30) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (mode2 == i30) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    constraintWidgetContainer6.mo15749O(z13, z14);
                }
            } else {
                aVar3 = aVar;
                aVar2 = aVar2;
                bVar = bVar;
                z4 = z3;
                i10 = iM15766s;
                zM15781W = false;
                i11 = 0;
            }
            if (zM15781W) {
                i12 = constraintWidgetContainer6.f36909y0;
                if (size > 0) {
                    size3 = constraintWidgetContainer6.f36942m0.size();
                    boolean zM15783Z4 = constraintWidgetContainer6.m15783Z(64);
                    bVar6 = constraintWidgetContainer6.f36900p0;
                    while (i26 < size3) {
                        constraintWidget3 = constraintWidgetContainer6.f36942m0.get(i26);
                        if (constraintWidget3 instanceof Guideline2) {
                            iM15759l = constraintWidget3.m15759l(0);
                            int iM15759l7 = constraintWidget3.m15759l(1);
                            if (iM15759l == 3) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                            }
                            if (z12) {
                                basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                            }
                        }
                    }
                    c0095b = (C0095b) bVar6;
                    childCount = c0095b.f608a.getChildCount();
                    while (i27 < childCount) {
                        childAt = c0095b.f608a.getChildAt(i27);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.f37161g != null) {
                                c0094a = (C0094a) placeholder.getLayoutParams();
                                c0094a2 = (C0094a) placeholder.f37161g.getLayoutParams();
                                c0094a2.f593m0.f36861d0 = 0;
                                if (c0094a.f593m0.m15761n() != 1) {
                                    c0094a.f593m0.m15748N(c0094a2.f593m0.m15766s());
                                }
                                if (c0094a.f593m0.m15765r() != 1) {
                                    c0094a.f593m0.m15743I(c0094a2.f593m0.m15760m());
                                }
                                c0094a2.f593m0.f36861d0 = 8;
                            }
                        }
                    }
                    size4 = c0095b.f608a.f524g.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            c0095b.f608a.f524g.get(i28).m15846i();
                        }
                    }
                }
                basicMeasure.m15793c(constraintWidgetContainer6);
                size2 = basicMeasure.f36943a.size();
                i13 = i10;
                if (size > 0) {
                    basicMeasure.m15792b(constraintWidgetContainer6, i13, iM15760m);
                }
                if (size2 > 0) {
                    if (constraintWidgetContainer6.m15761n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (constraintWidgetContainer6.m15765r() == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    iMax3 = Math.max(constraintWidgetContainer6.m15766s(), basicMeasure.f36945c.f36852Y);
                    iMax4 = Math.max(constraintWidgetContainer6.m15760m(), basicMeasure.f36945c.f36853Z);
                    i15 = 0;
                    z7 = false;
                    while (i15 < size2) {
                        constraintWidget2 = basicMeasure.f36943a.get(i15);
                        if (constraintWidget2 instanceof VirtualLayout) {
                            aVar7 = aVar3;
                            aVar6 = aVar2;
                            bVar5 = bVar;
                        } else {
                            iM15766s4 = constraintWidget2.m15766s();
                            iM15760m4 = constraintWidget2.m15760m();
                            bVar5 = bVar;
                            boolean zM15791a5 = z7 | basicMeasure.m15791a(bVar5, constraintWidget2, 1);
                            iM15766s5 = constraintWidget2.m15766s();
                            z11 = zM15791a5;
                            iM15760m5 = constraintWidget2.m15760m();
                            if (iM15766s5 != iM15766s4) {
                                constraintWidget2.m15748N(iM15766s5);
                                if (z5) {
                                    aVar6 = aVar2;
                                } else {
                                    aVar6 = aVar2;
                                }
                                z11 = true;
                            } else {
                                aVar6 = aVar2;
                            }
                            if (iM15760m5 != iM15760m4) {
                                constraintWidget2.m15743I(iM15760m5);
                                if (z6) {
                                    aVar7 = aVar3;
                                } else {
                                    aVar7 = aVar3;
                                }
                                z11 = true;
                            } else {
                                aVar7 = aVar3;
                            }
                            z7 = ((VirtualLayout) constraintWidget2).f36941o0 | z11;
                        }
                        i15++;
                        bVar = bVar5;
                        aVar3 = aVar7;
                        aVar2 = aVar6;
                        i12 = i12;
                    }
                    int i418 = i12;
                    aVar4 = aVar3;
                    aVar5 = aVar2;
                    bVar2 = bVar;
                    i16 = 0;
                    i17 = 2;
                    while (true) {
                        if (i16 >= i17) {
                            i18 = i13;
                            i19 = iM15760m;
                            break;
                        }
                        iMax5 = iMax4;
                        z10 = z7;
                        i20 = 0;
                        while (i20 < size2) {
                            constraintWidget = basicMeasure.f36943a.get(i20);
                            int i419 = size2;
                            if (constraintWidget instanceof Helper) {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i4110 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            } else {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i4111 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            }
                            i20++;
                            size2 = i419;
                            constraintWidgetContainer6 = constraintWidgetContainer2;
                            iM15760m = i25;
                            bVar2 = bVar4;
                            i13 = i24;
                        }
                        constraintWidgetContainer = constraintWidgetContainer6;
                        bVar3 = bVar2;
                        i21 = size2;
                        i22 = i13;
                        i23 = iM15760m;
                        if (!z10) {
                            constraintWidgetContainer6 = constraintWidgetContainer;
                            i19 = i23;
                            i18 = i22;
                            z7 = z10;
                            iMax4 = iMax5;
                            break;
                        }
                        constraintWidgetContainer6 = constraintWidgetContainer;
                        basicMeasure.m15792b(constraintWidgetContainer6, i22, i23);
                        i16++;
                        i13 = i22;
                        iM15760m = i23;
                        iMax4 = iMax5;
                        size2 = i21;
                        bVar2 = bVar3;
                        i17 = 2;
                        z7 = false;
                    }
                    if (z7) {
                        basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        if (constraintWidgetContainer6.m15766s() < iMax3) {
                            constraintWidgetContainer6.m15748N(iMax3);
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (constraintWidgetContainer6.m15760m() < iMax4) {
                            constraintWidgetContainer6.m15743I(iMax4);
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                        if (z9) {
                            basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        }
                    }
                    i14 = i418;
                } else {
                    i14 = i12;
                }
                constraintWidgetContainer6.m15784a0(i14);
            } else {
                i12 = constraintWidgetContainer6.f36909y0;
                if (size > 0) {
                    size3 = constraintWidgetContainer6.f36942m0.size();
                    boolean zM15783Z5 = constraintWidgetContainer6.m15783Z(64);
                    bVar6 = constraintWidgetContainer6.f36900p0;
                    while (i26 < size3) {
                        constraintWidget3 = constraintWidgetContainer6.f36942m0.get(i26);
                        if (constraintWidget3 instanceof Guideline2) {
                            iM15759l = constraintWidget3.m15759l(0);
                            int iM15759l8 = constraintWidget3.m15759l(1);
                            if (iM15759l == 3) {
                                z12 = false;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                            }
                            if (z12) {
                                basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                            }
                        }
                    }
                    c0095b = (C0095b) bVar6;
                    childCount = c0095b.f608a.getChildCount();
                    while (i27 < childCount) {
                        childAt = c0095b.f608a.getChildAt(i27);
                        if (childAt instanceof Placeholder) {
                            placeholder = (Placeholder) childAt;
                            if (placeholder.f37161g != null) {
                                c0094a = (C0094a) placeholder.getLayoutParams();
                                c0094a2 = (C0094a) placeholder.f37161g.getLayoutParams();
                                c0094a2.f593m0.f36861d0 = 0;
                                if (c0094a.f593m0.m15761n() != 1) {
                                    c0094a.f593m0.m15748N(c0094a2.f593m0.m15766s());
                                }
                                if (c0094a.f593m0.m15765r() != 1) {
                                    c0094a.f593m0.m15743I(c0094a2.f593m0.m15760m());
                                }
                                c0094a2.f593m0.f36861d0 = 8;
                            }
                        }
                    }
                    size4 = c0095b.f608a.f524g.size();
                    if (size4 > 0) {
                        while (i28 < size4) {
                            c0095b.f608a.f524g.get(i28).m15846i();
                        }
                    }
                }
                basicMeasure.m15793c(constraintWidgetContainer6);
                size2 = basicMeasure.f36943a.size();
                i13 = i10;
                if (size > 0) {
                    basicMeasure.m15792b(constraintWidgetContainer6, i13, iM15760m);
                }
                if (size2 > 0) {
                    if (constraintWidgetContainer6.m15761n() == 2) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (constraintWidgetContainer6.m15765r() == 2) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    iMax3 = Math.max(constraintWidgetContainer6.m15766s(), basicMeasure.f36945c.f36852Y);
                    iMax4 = Math.max(constraintWidgetContainer6.m15760m(), basicMeasure.f36945c.f36853Z);
                    i15 = 0;
                    z7 = false;
                    while (i15 < size2) {
                        constraintWidget2 = basicMeasure.f36943a.get(i15);
                        if (constraintWidget2 instanceof VirtualLayout) {
                            aVar7 = aVar3;
                            aVar6 = aVar2;
                            bVar5 = bVar;
                        } else {
                            iM15766s4 = constraintWidget2.m15766s();
                            iM15760m4 = constraintWidget2.m15760m();
                            bVar5 = bVar;
                            boolean zM15791a6 = z7 | basicMeasure.m15791a(bVar5, constraintWidget2, 1);
                            iM15766s5 = constraintWidget2.m15766s();
                            z11 = zM15791a6;
                            iM15760m5 = constraintWidget2.m15760m();
                            if (iM15766s5 != iM15766s4) {
                                constraintWidget2.m15748N(iM15766s5);
                                if (z5) {
                                    aVar6 = aVar2;
                                } else {
                                    aVar6 = aVar2;
                                }
                                z11 = true;
                            } else {
                                aVar6 = aVar2;
                            }
                            if (iM15760m5 != iM15760m4) {
                                constraintWidget2.m15743I(iM15760m5);
                                if (z6) {
                                    aVar7 = aVar3;
                                } else {
                                    aVar7 = aVar3;
                                }
                                z11 = true;
                            } else {
                                aVar7 = aVar3;
                            }
                            z7 = ((VirtualLayout) constraintWidget2).f36941o0 | z11;
                        }
                        i15++;
                        bVar = bVar5;
                        aVar3 = aVar7;
                        aVar2 = aVar6;
                        i12 = i12;
                    }
                    int i4112 = i12;
                    aVar4 = aVar3;
                    aVar5 = aVar2;
                    bVar2 = bVar;
                    i16 = 0;
                    i17 = 2;
                    while (true) {
                        if (i16 >= i17) {
                            i18 = i13;
                            i19 = iM15760m;
                            break;
                        }
                        iMax5 = iMax4;
                        z10 = z7;
                        i20 = 0;
                        while (i20 < size2) {
                            constraintWidget = basicMeasure.f36943a.get(i20);
                            int i4113 = size2;
                            if (constraintWidget instanceof Helper) {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i4114 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            } else {
                                constraintWidgetContainer2 = constraintWidgetContainer6;
                                if (constraintWidget.f36861d0 == 8) {
                                    bVar4 = bVar2;
                                    i24 = i13;
                                    i25 = iM15760m;
                                } else {
                                    iM15766s2 = constraintWidget.m15766s();
                                    iM15760m2 = constraintWidget.m15760m();
                                    i24 = i13;
                                    int i4115 = constraintWidget.f36851X;
                                    i25 = iM15760m;
                                    zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                    iM15766s3 = constraintWidget.m15766s();
                                    bVar4 = bVar2;
                                    iM15760m3 = constraintWidget.m15760m();
                                    if (iM15766s3 != iM15766s2) {
                                        constraintWidget.m15748N(iM15766s3);
                                        if (z5) {
                                            iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                        }
                                        zM15791a = true;
                                    }
                                    if (iM15760m3 != iM15760m2) {
                                        constraintWidget.m15743I(iM15760m3);
                                        if (z6) {
                                            iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                        }
                                        zM15791a = true;
                                    }
                                    if (constraintWidget.f36891z) {
                                        z10 = zM15791a;
                                    } else {
                                        z10 = zM15791a;
                                    }
                                }
                            }
                            i20++;
                            size2 = i4113;
                            constraintWidgetContainer6 = constraintWidgetContainer2;
                            iM15760m = i25;
                            bVar2 = bVar4;
                            i13 = i24;
                        }
                        constraintWidgetContainer = constraintWidgetContainer6;
                        bVar3 = bVar2;
                        i21 = size2;
                        i22 = i13;
                        i23 = iM15760m;
                        if (!z10) {
                            constraintWidgetContainer6 = constraintWidgetContainer;
                            i19 = i23;
                            i18 = i22;
                            z7 = z10;
                            iMax4 = iMax5;
                            break;
                        }
                        constraintWidgetContainer6 = constraintWidgetContainer;
                        basicMeasure.m15792b(constraintWidgetContainer6, i22, i23);
                        i16++;
                        i13 = i22;
                        iM15760m = i23;
                        iMax4 = iMax5;
                        size2 = i21;
                        bVar2 = bVar3;
                        i17 = 2;
                        z7 = false;
                    }
                    if (z7) {
                        basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        if (constraintWidgetContainer6.m15766s() < iMax3) {
                            constraintWidgetContainer6.m15748N(iMax3);
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (constraintWidgetContainer6.m15760m() < iMax4) {
                            constraintWidgetContainer6.m15743I(iMax4);
                            z9 = true;
                        } else {
                            z9 = z8;
                        }
                        if (z9) {
                            basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                        }
                    }
                    i14 = i4112;
                } else {
                    i14 = i12;
                }
                constraintWidgetContainer6.m15784a0(i14);
            }
            int iM15766s11 = this.f525h.m15766s();
            int iM15760m11 = this.f525h.m15760m();
            ConstraintWidgetContainer constraintWidgetContainer117 = this.f525h;
            m281h(i, i2, iM15766s11, iM15760m11, constraintWidgetContainer117.f36910z0, constraintWidgetContainer117.f36892A0);
        }
        if (childCount3 == 0) {
            iMax2 = Math.max(0, this.f527j);
        } else {
            iMax2 = i39;
        }
        i7 = 2;
        if (iMin == constraintWidgetContainer6.m15766s()) {
            constraintWidgetContainer6.f36899o0.f36960c = true;
            i8 = 0;
        } else {
            constraintWidgetContainer6.f36899o0.f36960c = true;
            i8 = 0;
        }
        constraintWidgetContainer6.f36849V = i8;
        constraintWidgetContainer6.f36850W = i8;
        int i4116 = this.f528k - i41;
        int[] iArr6 = constraintWidgetContainer6.f36889x;
        iArr6[i8] = i4116;
        iArr6[1] = this.f529l - i40;
        constraintWidgetContainer6.m15746L(i8);
        constraintWidgetContainer6.m15745K(i8);
        constraintWidgetContainer6.f36843P[i8] = i5;
        constraintWidgetContainer6.m15748N(iMin);
        constraintWidgetContainer6.f36843P[1] = i7;
        constraintWidgetContainer6.m15743I(iMax2);
        constraintWidgetContainer6.m15746L(this.f526i - i41);
        constraintWidgetContainer6.m15745K(this.f527j - i40);
        constraintWidgetContainer6.f36903s0 = iMax8;
        constraintWidgetContainer6.f36904t0 = iMax6;
        basicMeasure = constraintWidgetContainer6.f36898n0;
        Objects.requireNonNull(basicMeasure);
        aVar = ConstraintAnchor.a.BOTTOM;
        aVar2 = ConstraintAnchor.a.RIGHT;
        bVar = constraintWidgetContainer6.f36900p0;
        size = constraintWidgetContainer6.f36942m0.size();
        iM15766s = constraintWidgetContainer6.m15766s();
        iM15760m = constraintWidgetContainer6.m15760m();
        zM15790b = Optimizer.m15790b(i36, 128);
        if (zM15790b) {
            z = true;
        } else {
            z = true;
        }
        if (z) {
            i33 = 0;
            while (true) {
                if (i33 < size) {
                    constraintWidget4 = constraintWidgetContainer6.f36942m0.get(i33);
                    z17 = z;
                    if (constraintWidget4.m15761n() == 3) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (constraintWidget4.m15765r() == 3) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    if (z18) {
                        z20 = false;
                    } else {
                        z20 = false;
                    }
                    if (constraintWidget4.m15771x()) {
                        i33++;
                        z = z17;
                    } else {
                        i33++;
                        z = z17;
                    }
                    i9 = 1073741824;
                    z2 = false;
                } else {
                    z2 = z;
                    i9 = 1073741824;
                }
            }
        } else {
            z2 = z;
            i9 = 1073741824;
        }
        z3 = z2 & ((mode != i9 && mode2 == i9) || zM15790b);
        if (z3) {
            iMin2 = Math.min(constraintWidgetContainer6.f36889x[0], i38);
            iMin3 = Math.min(constraintWidgetContainer6.f36889x[1], i39);
            if (mode == 1073741824) {
                constraintWidgetContainer6.m15748N(iMin2);
                constraintWidgetContainer6.m15782X();
            }
            if (mode2 == 1073741824) {
                constraintWidgetContainer6.m15743I(iMin3);
                constraintWidgetContainer6.m15782X();
            }
            if (mode == 1073741824) {
                aVar3 = aVar;
                aVar2 = aVar2;
                bVar = bVar;
                z4 = z3;
                i10 = iM15766s;
                dependencyGraph = constraintWidgetContainer6.f36899o0;
                if (dependencyGraph.f36959b) {
                    while (r3.hasNext()) {
                        constraintWidget5.m15756i();
                        constraintWidget5.f36854a = false;
                        HorizontalWidgetRun horizontalWidgetRun12 = constraintWidget5.f36860d;
                        horizontalWidgetRun12.f37005e.f36975j = false;
                        horizontalWidgetRun12.f37007g = false;
                        horizontalWidgetRun12.m15824n();
                        VerticalWidgetRun verticalWidgetRun12 = constraintWidget5.f36862e;
                        verticalWidgetRun12.f37005e.f36975j = false;
                        verticalWidgetRun12.f37007g = false;
                        verticalWidgetRun12.m15827m();
                    }
                    i29 = 0;
                    dependencyGraph.f36958a.m15756i();
                    ConstraintWidgetContainer constraintWidgetContainer118 = dependencyGraph.f36958a;
                    constraintWidgetContainer118.f36854a = false;
                    HorizontalWidgetRun horizontalWidgetRun13 = constraintWidgetContainer118.f36860d;
                    horizontalWidgetRun13.f37005e.f36975j = false;
                    horizontalWidgetRun13.f37007g = false;
                    horizontalWidgetRun13.m15824n();
                    VerticalWidgetRun verticalWidgetRun13 = dependencyGraph.f36958a.f36862e;
                    verticalWidgetRun13.f37005e.f36975j = false;
                    verticalWidgetRun13.f37007g = false;
                    verticalWidgetRun13.m15827m();
                    dependencyGraph.m15804c();
                } else {
                    i29 = 0;
                }
                dependencyGraph.m15803b(dependencyGraph.f36961d);
                ConstraintWidgetContainer constraintWidgetContainer119 = dependencyGraph.f36958a;
                constraintWidgetContainer119.f36849V = i29;
                constraintWidgetContainer119.f36850W = i29;
                constraintWidgetContainer119.f36860d.f37008h.mo15810c(i29);
                dependencyGraph.f36958a.f36862e.f37008h.mo15810c(i29);
                i30 = 1073741824;
                if (mode == 1073741824) {
                    i31 = 1;
                    zM15781W = constraintWidgetContainer6.m15781W(zM15790b, i29) & true;
                    i11 = 1;
                } else {
                    i31 = 1;
                    zM15781W = true;
                    i11 = 0;
                }
                if (mode2 == 1073741824) {
                    zM15781W &= constraintWidgetContainer6.m15781W(zM15790b, i31);
                    i11++;
                }
            } else {
                aVar3 = aVar;
                aVar2 = aVar2;
                bVar = bVar;
                z4 = z3;
                i10 = iM15766s;
                dependencyGraph = constraintWidgetContainer6.f36899o0;
                if (dependencyGraph.f36959b) {
                    while (r3.hasNext()) {
                        constraintWidget5.m15756i();
                        constraintWidget5.f36854a = false;
                        HorizontalWidgetRun horizontalWidgetRun14 = constraintWidget5.f36860d;
                        horizontalWidgetRun14.f37005e.f36975j = false;
                        horizontalWidgetRun14.f37007g = false;
                        horizontalWidgetRun14.m15824n();
                        VerticalWidgetRun verticalWidgetRun14 = constraintWidget5.f36862e;
                        verticalWidgetRun14.f37005e.f36975j = false;
                        verticalWidgetRun14.f37007g = false;
                        verticalWidgetRun14.m15827m();
                    }
                    i29 = 0;
                    dependencyGraph.f36958a.m15756i();
                    ConstraintWidgetContainer constraintWidgetContainer1110 = dependencyGraph.f36958a;
                    constraintWidgetContainer1110.f36854a = false;
                    HorizontalWidgetRun horizontalWidgetRun15 = constraintWidgetContainer1110.f36860d;
                    horizontalWidgetRun15.f37005e.f36975j = false;
                    horizontalWidgetRun15.f37007g = false;
                    horizontalWidgetRun15.m15824n();
                    VerticalWidgetRun verticalWidgetRun15 = dependencyGraph.f36958a.f36862e;
                    verticalWidgetRun15.f37005e.f36975j = false;
                    verticalWidgetRun15.f37007g = false;
                    verticalWidgetRun15.m15827m();
                    dependencyGraph.m15804c();
                } else {
                    i29 = 0;
                }
                dependencyGraph.m15803b(dependencyGraph.f36961d);
                ConstraintWidgetContainer constraintWidgetContainer1111 = dependencyGraph.f36958a;
                constraintWidgetContainer1111.f36849V = i29;
                constraintWidgetContainer1111.f36850W = i29;
                constraintWidgetContainer1111.f36860d.f37008h.mo15810c(i29);
                dependencyGraph.f36958a.f36862e.f37008h.mo15810c(i29);
                i30 = 1073741824;
                if (mode == 1073741824) {
                    i31 = 1;
                    zM15781W = constraintWidgetContainer6.m15781W(zM15790b, i29) & true;
                    i11 = 1;
                } else {
                    i31 = 1;
                    zM15781W = true;
                    i11 = 0;
                }
                if (mode2 == 1073741824) {
                    zM15781W &= constraintWidgetContainer6.m15781W(zM15790b, i31);
                    i11++;
                }
            }
            if (zM15781W) {
                if (mode == i30) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (mode2 == i30) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                constraintWidgetContainer6.mo15749O(z13, z14);
            }
        } else {
            aVar3 = aVar;
            aVar2 = aVar2;
            bVar = bVar;
            z4 = z3;
            i10 = iM15766s;
            zM15781W = false;
            i11 = 0;
        }
        if (zM15781W) {
            i12 = constraintWidgetContainer6.f36909y0;
            if (size > 0) {
                size3 = constraintWidgetContainer6.f36942m0.size();
                boolean zM15783Z6 = constraintWidgetContainer6.m15783Z(64);
                bVar6 = constraintWidgetContainer6.f36900p0;
                while (i26 < size3) {
                    constraintWidget3 = constraintWidgetContainer6.f36942m0.get(i26);
                    if (constraintWidget3 instanceof Guideline2) {
                        iM15759l = constraintWidget3.m15759l(0);
                        int iM15759l9 = constraintWidget3.m15759l(1);
                        if (iM15759l == 3) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                        }
                        if (z12) {
                            basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                        }
                    }
                }
                c0095b = (C0095b) bVar6;
                childCount = c0095b.f608a.getChildCount();
                while (i27 < childCount) {
                    childAt = c0095b.f608a.getChildAt(i27);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.f37161g != null) {
                            c0094a = (C0094a) placeholder.getLayoutParams();
                            c0094a2 = (C0094a) placeholder.f37161g.getLayoutParams();
                            c0094a2.f593m0.f36861d0 = 0;
                            if (c0094a.f593m0.m15761n() != 1) {
                                c0094a.f593m0.m15748N(c0094a2.f593m0.m15766s());
                            }
                            if (c0094a.f593m0.m15765r() != 1) {
                                c0094a.f593m0.m15743I(c0094a2.f593m0.m15760m());
                            }
                            c0094a2.f593m0.f36861d0 = 8;
                        }
                    }
                }
                size4 = c0095b.f608a.f524g.size();
                if (size4 > 0) {
                    while (i28 < size4) {
                        c0095b.f608a.f524g.get(i28).m15846i();
                    }
                }
            }
            basicMeasure.m15793c(constraintWidgetContainer6);
            size2 = basicMeasure.f36943a.size();
            i13 = i10;
            if (size > 0) {
                basicMeasure.m15792b(constraintWidgetContainer6, i13, iM15760m);
            }
            if (size2 > 0) {
                if (constraintWidgetContainer6.m15761n() == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (constraintWidgetContainer6.m15765r() == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                iMax3 = Math.max(constraintWidgetContainer6.m15766s(), basicMeasure.f36945c.f36852Y);
                iMax4 = Math.max(constraintWidgetContainer6.m15760m(), basicMeasure.f36945c.f36853Z);
                i15 = 0;
                z7 = false;
                while (i15 < size2) {
                    constraintWidget2 = basicMeasure.f36943a.get(i15);
                    if (constraintWidget2 instanceof VirtualLayout) {
                        aVar7 = aVar3;
                        aVar6 = aVar2;
                        bVar5 = bVar;
                    } else {
                        iM15766s4 = constraintWidget2.m15766s();
                        iM15760m4 = constraintWidget2.m15760m();
                        bVar5 = bVar;
                        boolean zM15791a7 = z7 | basicMeasure.m15791a(bVar5, constraintWidget2, 1);
                        iM15766s5 = constraintWidget2.m15766s();
                        z11 = zM15791a7;
                        iM15760m5 = constraintWidget2.m15760m();
                        if (iM15766s5 != iM15766s4) {
                            constraintWidget2.m15748N(iM15766s5);
                            if (z5) {
                                aVar6 = aVar2;
                            } else {
                                aVar6 = aVar2;
                            }
                            z11 = true;
                        } else {
                            aVar6 = aVar2;
                        }
                        if (iM15760m5 != iM15760m4) {
                            constraintWidget2.m15743I(iM15760m5);
                            if (z6) {
                                aVar7 = aVar3;
                            } else {
                                aVar7 = aVar3;
                            }
                            z11 = true;
                        } else {
                            aVar7 = aVar3;
                        }
                        z7 = ((VirtualLayout) constraintWidget2).f36941o0 | z11;
                    }
                    i15++;
                    bVar = bVar5;
                    aVar3 = aVar7;
                    aVar2 = aVar6;
                    i12 = i12;
                }
                int i4117 = i12;
                aVar4 = aVar3;
                aVar5 = aVar2;
                bVar2 = bVar;
                i16 = 0;
                i17 = 2;
                while (true) {
                    if (i16 >= i17) {
                        i18 = i13;
                        i19 = iM15760m;
                        break;
                    }
                    iMax5 = iMax4;
                    z10 = z7;
                    i20 = 0;
                    while (i20 < size2) {
                        constraintWidget = basicMeasure.f36943a.get(i20);
                        int i4118 = size2;
                        if (constraintWidget instanceof Helper) {
                            constraintWidgetContainer2 = constraintWidgetContainer6;
                            if (constraintWidget.f36861d0 == 8) {
                                bVar4 = bVar2;
                                i24 = i13;
                                i25 = iM15760m;
                            } else {
                                iM15766s2 = constraintWidget.m15766s();
                                iM15760m2 = constraintWidget.m15760m();
                                i24 = i13;
                                int i4119 = constraintWidget.f36851X;
                                i25 = iM15760m;
                                zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                iM15766s3 = constraintWidget.m15766s();
                                bVar4 = bVar2;
                                iM15760m3 = constraintWidget.m15760m();
                                if (iM15766s3 != iM15766s2) {
                                    constraintWidget.m15748N(iM15766s3);
                                    if (z5) {
                                        iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                    }
                                    zM15791a = true;
                                }
                                if (iM15760m3 != iM15760m2) {
                                    constraintWidget.m15743I(iM15760m3);
                                    if (z6) {
                                        iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                    }
                                    zM15791a = true;
                                }
                                if (constraintWidget.f36891z) {
                                    z10 = zM15791a;
                                } else {
                                    z10 = zM15791a;
                                }
                            }
                        } else {
                            constraintWidgetContainer2 = constraintWidgetContainer6;
                            if (constraintWidget.f36861d0 == 8) {
                                bVar4 = bVar2;
                                i24 = i13;
                                i25 = iM15760m;
                            } else {
                                iM15766s2 = constraintWidget.m15766s();
                                iM15760m2 = constraintWidget.m15760m();
                                i24 = i13;
                                int i41110 = constraintWidget.f36851X;
                                i25 = iM15760m;
                                zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                iM15766s3 = constraintWidget.m15766s();
                                bVar4 = bVar2;
                                iM15760m3 = constraintWidget.m15760m();
                                if (iM15766s3 != iM15766s2) {
                                    constraintWidget.m15748N(iM15766s3);
                                    if (z5) {
                                        iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                    }
                                    zM15791a = true;
                                }
                                if (iM15760m3 != iM15760m2) {
                                    constraintWidget.m15743I(iM15760m3);
                                    if (z6) {
                                        iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                    }
                                    zM15791a = true;
                                }
                                if (constraintWidget.f36891z) {
                                    z10 = zM15791a;
                                } else {
                                    z10 = zM15791a;
                                }
                            }
                        }
                        i20++;
                        size2 = i4118;
                        constraintWidgetContainer6 = constraintWidgetContainer2;
                        iM15760m = i25;
                        bVar2 = bVar4;
                        i13 = i24;
                    }
                    constraintWidgetContainer = constraintWidgetContainer6;
                    bVar3 = bVar2;
                    i21 = size2;
                    i22 = i13;
                    i23 = iM15760m;
                    if (!z10) {
                        constraintWidgetContainer6 = constraintWidgetContainer;
                        i19 = i23;
                        i18 = i22;
                        z7 = z10;
                        iMax4 = iMax5;
                        break;
                    }
                    constraintWidgetContainer6 = constraintWidgetContainer;
                    basicMeasure.m15792b(constraintWidgetContainer6, i22, i23);
                    i16++;
                    i13 = i22;
                    iM15760m = i23;
                    iMax4 = iMax5;
                    size2 = i21;
                    bVar2 = bVar3;
                    i17 = 2;
                    z7 = false;
                }
                if (z7) {
                    basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                    if (constraintWidgetContainer6.m15766s() < iMax3) {
                        constraintWidgetContainer6.m15748N(iMax3);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (constraintWidgetContainer6.m15760m() < iMax4) {
                        constraintWidgetContainer6.m15743I(iMax4);
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                    if (z9) {
                        basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                    }
                }
                i14 = i4117;
            } else {
                i14 = i12;
            }
            constraintWidgetContainer6.m15784a0(i14);
        } else {
            i12 = constraintWidgetContainer6.f36909y0;
            if (size > 0) {
                size3 = constraintWidgetContainer6.f36942m0.size();
                boolean zM15783Z7 = constraintWidgetContainer6.m15783Z(64);
                bVar6 = constraintWidgetContainer6.f36900p0;
                while (i26 < size3) {
                    constraintWidget3 = constraintWidgetContainer6.f36942m0.get(i26);
                    if (constraintWidget3 instanceof Guideline2) {
                        iM15759l = constraintWidget3.m15759l(0);
                        int iM15759l10 = constraintWidget3.m15759l(1);
                        if (iM15759l == 3) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                        }
                        if (z12) {
                            basicMeasure.m15791a(bVar6, constraintWidget3, 0);
                        }
                    }
                }
                c0095b = (C0095b) bVar6;
                childCount = c0095b.f608a.getChildCount();
                while (i27 < childCount) {
                    childAt = c0095b.f608a.getChildAt(i27);
                    if (childAt instanceof Placeholder) {
                        placeholder = (Placeholder) childAt;
                        if (placeholder.f37161g != null) {
                            c0094a = (C0094a) placeholder.getLayoutParams();
                            c0094a2 = (C0094a) placeholder.f37161g.getLayoutParams();
                            c0094a2.f593m0.f36861d0 = 0;
                            if (c0094a.f593m0.m15761n() != 1) {
                                c0094a.f593m0.m15748N(c0094a2.f593m0.m15766s());
                            }
                            if (c0094a.f593m0.m15765r() != 1) {
                                c0094a.f593m0.m15743I(c0094a2.f593m0.m15760m());
                            }
                            c0094a2.f593m0.f36861d0 = 8;
                        }
                    }
                }
                size4 = c0095b.f608a.f524g.size();
                if (size4 > 0) {
                    while (i28 < size4) {
                        c0095b.f608a.f524g.get(i28).m15846i();
                    }
                }
            }
            basicMeasure.m15793c(constraintWidgetContainer6);
            size2 = basicMeasure.f36943a.size();
            i13 = i10;
            if (size > 0) {
                basicMeasure.m15792b(constraintWidgetContainer6, i13, iM15760m);
            }
            if (size2 > 0) {
                if (constraintWidgetContainer6.m15761n() == 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (constraintWidgetContainer6.m15765r() == 2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                iMax3 = Math.max(constraintWidgetContainer6.m15766s(), basicMeasure.f36945c.f36852Y);
                iMax4 = Math.max(constraintWidgetContainer6.m15760m(), basicMeasure.f36945c.f36853Z);
                i15 = 0;
                z7 = false;
                while (i15 < size2) {
                    constraintWidget2 = basicMeasure.f36943a.get(i15);
                    if (constraintWidget2 instanceof VirtualLayout) {
                        aVar7 = aVar3;
                        aVar6 = aVar2;
                        bVar5 = bVar;
                    } else {
                        iM15766s4 = constraintWidget2.m15766s();
                        iM15760m4 = constraintWidget2.m15760m();
                        bVar5 = bVar;
                        boolean zM15791a8 = z7 | basicMeasure.m15791a(bVar5, constraintWidget2, 1);
                        iM15766s5 = constraintWidget2.m15766s();
                        z11 = zM15791a8;
                        iM15760m5 = constraintWidget2.m15760m();
                        if (iM15766s5 != iM15766s4) {
                            constraintWidget2.m15748N(iM15766s5);
                            if (z5) {
                                aVar6 = aVar2;
                            } else {
                                aVar6 = aVar2;
                            }
                            z11 = true;
                        } else {
                            aVar6 = aVar2;
                        }
                        if (iM15760m5 != iM15760m4) {
                            constraintWidget2.m15743I(iM15760m5);
                            if (z6) {
                                aVar7 = aVar3;
                            } else {
                                aVar7 = aVar3;
                            }
                            z11 = true;
                        } else {
                            aVar7 = aVar3;
                        }
                        z7 = ((VirtualLayout) constraintWidget2).f36941o0 | z11;
                    }
                    i15++;
                    bVar = bVar5;
                    aVar3 = aVar7;
                    aVar2 = aVar6;
                    i12 = i12;
                }
                int i41111 = i12;
                aVar4 = aVar3;
                aVar5 = aVar2;
                bVar2 = bVar;
                i16 = 0;
                i17 = 2;
                while (true) {
                    if (i16 >= i17) {
                        i18 = i13;
                        i19 = iM15760m;
                        break;
                    }
                    iMax5 = iMax4;
                    z10 = z7;
                    i20 = 0;
                    while (i20 < size2) {
                        constraintWidget = basicMeasure.f36943a.get(i20);
                        int i41112 = size2;
                        if (constraintWidget instanceof Helper) {
                            constraintWidgetContainer2 = constraintWidgetContainer6;
                            if (constraintWidget.f36861d0 == 8) {
                                bVar4 = bVar2;
                                i24 = i13;
                                i25 = iM15760m;
                            } else {
                                iM15766s2 = constraintWidget.m15766s();
                                iM15760m2 = constraintWidget.m15760m();
                                i24 = i13;
                                int i41113 = constraintWidget.f36851X;
                                i25 = iM15760m;
                                zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                iM15766s3 = constraintWidget.m15766s();
                                bVar4 = bVar2;
                                iM15760m3 = constraintWidget.m15760m();
                                if (iM15766s3 != iM15766s2) {
                                    constraintWidget.m15748N(iM15766s3);
                                    if (z5) {
                                        iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                    }
                                    zM15791a = true;
                                }
                                if (iM15760m3 != iM15760m2) {
                                    constraintWidget.m15743I(iM15760m3);
                                    if (z6) {
                                        iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                    }
                                    zM15791a = true;
                                }
                                if (constraintWidget.f36891z) {
                                    z10 = zM15791a;
                                } else {
                                    z10 = zM15791a;
                                }
                            }
                        } else {
                            constraintWidgetContainer2 = constraintWidgetContainer6;
                            if (constraintWidget.f36861d0 == 8) {
                                bVar4 = bVar2;
                                i24 = i13;
                                i25 = iM15760m;
                            } else {
                                iM15766s2 = constraintWidget.m15766s();
                                iM15760m2 = constraintWidget.m15760m();
                                i24 = i13;
                                int i41114 = constraintWidget.f36851X;
                                i25 = iM15760m;
                                zM15791a = basicMeasure.m15791a(bVar2, constraintWidget, i16 == 1 ? 2 : 1) | z10;
                                iM15766s3 = constraintWidget.m15766s();
                                bVar4 = bVar2;
                                iM15760m3 = constraintWidget.m15760m();
                                if (iM15766s3 != iM15766s2) {
                                    constraintWidget.m15748N(iM15766s3);
                                    if (z5) {
                                        iMax3 = Math.max(iMax3, constraintWidget.mo15757j(aVar5).m15728d() + constraintWidget.m15764q());
                                    }
                                    zM15791a = true;
                                }
                                if (iM15760m3 != iM15760m2) {
                                    constraintWidget.m15743I(iM15760m3);
                                    if (z6) {
                                        iMax5 = Math.max(iMax5, constraintWidget.mo15757j(aVar4).m15728d() + constraintWidget.m15758k());
                                    }
                                    zM15791a = true;
                                }
                                if (constraintWidget.f36891z) {
                                    z10 = zM15791a;
                                } else {
                                    z10 = zM15791a;
                                }
                            }
                        }
                        i20++;
                        size2 = i41112;
                        constraintWidgetContainer6 = constraintWidgetContainer2;
                        iM15760m = i25;
                        bVar2 = bVar4;
                        i13 = i24;
                    }
                    constraintWidgetContainer = constraintWidgetContainer6;
                    bVar3 = bVar2;
                    i21 = size2;
                    i22 = i13;
                    i23 = iM15760m;
                    if (!z10) {
                        constraintWidgetContainer6 = constraintWidgetContainer;
                        i19 = i23;
                        i18 = i22;
                        z7 = z10;
                        iMax4 = iMax5;
                        break;
                    }
                    constraintWidgetContainer6 = constraintWidgetContainer;
                    basicMeasure.m15792b(constraintWidgetContainer6, i22, i23);
                    i16++;
                    i13 = i22;
                    iM15760m = i23;
                    iMax4 = iMax5;
                    size2 = i21;
                    bVar2 = bVar3;
                    i17 = 2;
                    z7 = false;
                }
                if (z7) {
                    basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                    if (constraintWidgetContainer6.m15766s() < iMax3) {
                        constraintWidgetContainer6.m15748N(iMax3);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (constraintWidgetContainer6.m15760m() < iMax4) {
                        constraintWidgetContainer6.m15743I(iMax4);
                        z9 = true;
                    } else {
                        z9 = z8;
                    }
                    if (z9) {
                        basicMeasure.m15792b(constraintWidgetContainer6, i18, i19);
                    }
                }
                i14 = i41111;
            } else {
                i14 = i12;
            }
            constraintWidgetContainer6.m15784a0(i14);
        }
        int iM15766s12 = this.f525h.m15766s();
        int iM15760m12 = this.f525h.m15760m();
        ConstraintWidgetContainer constraintWidgetContainer1112 = this.f525h;
        m281h(i, i2, iM15766s12, iM15760m12, constraintWidgetContainer1112.f36910z0, constraintWidgetContainer1112.f36892A0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetM278e = m278e(view);
        if ((view instanceof Guideline) && !(constraintWidgetM278e instanceof Guideline2)) {
            C0094a c0094a = (C0094a) view.getLayoutParams();
            Guideline2 guideline2 = new Guideline2();
            c0094a.f593m0 = guideline2;
            c0094a.f567Z = true;
            guideline2.m15786R(c0094a.f560S);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.m15848k();
            ((C0094a) view.getLayoutParams()).f569a0 = true;
            if (!this.f524g.contains(constraintHelper)) {
                this.f524g.add(constraintHelper);
            }
        }
        this.f523f.put(view.getId(), view);
        this.f530m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f523f.remove(view.getId());
        ConstraintWidget constraintWidgetM278e = m278e(view);
        this.f525h.f36942m0.remove(constraintWidgetM278e);
        constraintWidgetM278e.mo15737C();
        this.f524g.remove(view);
        this.f530m = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f530m = true;
        this.f536s = -1;
        this.f537t = -1;
        super.requestLayout();
    }

    public void setConstraintSet(ConstraintSet constraintSet) {
        this.f532o = constraintSet;
    }

    @Override // android.view.View
    public void setId(int i) {
        this.f523f.remove(getId());
        super.setId(i);
        this.f523f.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f529l) {
            return;
        }
        this.f529l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f528k) {
            return;
        }
        this.f528k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f527j) {
            return;
        }
        this.f527j = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f526i) {
            return;
        }
        this.f526i = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(ConstraintsChangedListener constraintsChangedListener) {
        ConstraintLayoutStates constraintLayoutStates = this.f533p;
        if (constraintLayoutStates != null) {
            Objects.requireNonNull(constraintLayoutStates);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f531n = i;
        ConstraintWidgetContainer constraintWidgetContainer = this.f525h;
        constraintWidgetContainer.f36909y0 = i;
        LinearSystem.f36737a = constraintWidgetContainer.m15783Z(512);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0094a(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f523f = new SparseArray<>();
        this.f524g = new ArrayList<>(4);
        this.f525h = new ConstraintWidgetContainer();
        this.f526i = 0;
        this.f527j = 0;
        this.f528k = Integer.MAX_VALUE;
        this.f529l = Integer.MAX_VALUE;
        this.f530m = true;
        this.f531n = 257;
        this.f532o = null;
        this.f533p = null;
        this.f534q = -1;
        this.f535r = new HashMap<>();
        this.f536s = -1;
        this.f537t = -1;
        this.f538u = new SparseArray<>();
        this.f539v = new C0095b(this);
        this.f540w = 0;
        this.f541x = 0;
        m279f(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f523f = new SparseArray<>();
        this.f524g = new ArrayList<>(4);
        this.f525h = new ConstraintWidgetContainer();
        this.f526i = 0;
        this.f527j = 0;
        this.f528k = Integer.MAX_VALUE;
        this.f529l = Integer.MAX_VALUE;
        this.f530m = true;
        this.f531n = 257;
        this.f532o = null;
        this.f533p = null;
        this.f534q = -1;
        this.f535r = new HashMap<>();
        this.f536s = -1;
        this.f537t = -1;
        this.f538u = new SparseArray<>();
        this.f539v = new C0095b(this);
        this.f540w = 0;
        this.f541x = 0;
        m279f(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f523f = new SparseArray<>();
        this.f524g = new ArrayList<>(4);
        this.f525h = new ConstraintWidgetContainer();
        this.f526i = 0;
        this.f527j = 0;
        this.f528k = Integer.MAX_VALUE;
        this.f529l = Integer.MAX_VALUE;
        this.f530m = true;
        this.f531n = 257;
        this.f532o = null;
        this.f533p = null;
        this.f534q = -1;
        this.f535r = new HashMap<>();
        this.f536s = -1;
        this.f537t = -1;
        this.f538u = new SparseArray<>();
        this.f539v = new C0095b(this);
        this.f540w = 0;
        this.f541x = 0;
        m279f(attributeSet, i, i2);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static class C0094a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public float f542A;

        /* JADX INFO: renamed from: B */
        public String f543B;

        /* JADX INFO: renamed from: C */
        public float f544C;

        /* JADX INFO: renamed from: D */
        public int f545D;

        /* JADX INFO: renamed from: E */
        public float f546E;

        /* JADX INFO: renamed from: F */
        public float f547F;

        /* JADX INFO: renamed from: G */
        public int f548G;

        /* JADX INFO: renamed from: H */
        public int f549H;

        /* JADX INFO: renamed from: I */
        public int f550I;

        /* JADX INFO: renamed from: J */
        public int f551J;

        /* JADX INFO: renamed from: K */
        public int f552K;

        /* JADX INFO: renamed from: L */
        public int f553L;

        /* JADX INFO: renamed from: M */
        public int f554M;

        /* JADX INFO: renamed from: N */
        public int f555N;

        /* JADX INFO: renamed from: O */
        public float f556O;

        /* JADX INFO: renamed from: P */
        public float f557P;

        /* JADX INFO: renamed from: Q */
        public int f558Q;

        /* JADX INFO: renamed from: R */
        public int f559R;

        /* JADX INFO: renamed from: S */
        public int f560S;

        /* JADX INFO: renamed from: T */
        public boolean f561T;

        /* JADX INFO: renamed from: U */
        public boolean f562U;

        /* JADX INFO: renamed from: V */
        public String f563V;

        /* JADX INFO: renamed from: W */
        public boolean f564W;

        /* JADX INFO: renamed from: X */
        public boolean f565X;

        /* JADX INFO: renamed from: Y */
        public boolean f566Y;

        /* JADX INFO: renamed from: Z */
        public boolean f567Z;

        /* JADX INFO: renamed from: a */
        public int f568a;

        /* JADX INFO: renamed from: a0 */
        public boolean f569a0;

        /* JADX INFO: renamed from: b */
        public int f570b;

        /* JADX INFO: renamed from: b0 */
        public boolean f571b0;

        /* JADX INFO: renamed from: c */
        public float f572c;

        /* JADX INFO: renamed from: c0 */
        public int f573c0;

        /* JADX INFO: renamed from: d */
        public int f574d;

        /* JADX INFO: renamed from: d0 */
        public int f575d0;

        /* JADX INFO: renamed from: e */
        public int f576e;

        /* JADX INFO: renamed from: e0 */
        public int f577e0;

        /* JADX INFO: renamed from: f */
        public int f578f;

        /* JADX INFO: renamed from: f0 */
        public int f579f0;

        /* JADX INFO: renamed from: g */
        public int f580g;

        /* JADX INFO: renamed from: g0 */
        public int f581g0;

        /* JADX INFO: renamed from: h */
        public int f582h;

        /* JADX INFO: renamed from: h0 */
        public int f583h0;

        /* JADX INFO: renamed from: i */
        public int f584i;

        /* JADX INFO: renamed from: i0 */
        public float f585i0;

        /* JADX INFO: renamed from: j */
        public int f586j;

        /* JADX INFO: renamed from: j0 */
        public int f587j0;

        /* JADX INFO: renamed from: k */
        public int f588k;

        /* JADX INFO: renamed from: k0 */
        public int f589k0;

        /* JADX INFO: renamed from: l */
        public int f590l;

        /* JADX INFO: renamed from: l0 */
        public float f591l0;

        /* JADX INFO: renamed from: m */
        public int f592m;

        /* JADX INFO: renamed from: m0 */
        public ConstraintWidget f593m0;

        /* JADX INFO: renamed from: n */
        public int f594n;

        /* JADX INFO: renamed from: o */
        public float f595o;

        /* JADX INFO: renamed from: p */
        public int f596p;

        /* JADX INFO: renamed from: q */
        public int f597q;

        /* JADX INFO: renamed from: r */
        public int f598r;

        /* JADX INFO: renamed from: s */
        public int f599s;

        /* JADX INFO: renamed from: t */
        public int f600t;

        /* JADX INFO: renamed from: u */
        public int f601u;

        /* JADX INFO: renamed from: v */
        public int f602v;

        /* JADX INFO: renamed from: w */
        public int f603w;

        /* JADX INFO: renamed from: x */
        public int f604x;

        /* JADX INFO: renamed from: y */
        public int f605y;

        /* JADX INFO: renamed from: z */
        public float f606z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f607a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f607a = sparseIntArray;
                sparseIntArray.append(64, 8);
                sparseIntArray.append(65, 9);
                sparseIntArray.append(67, 10);
                sparseIntArray.append(68, 11);
                sparseIntArray.append(74, 12);
                sparseIntArray.append(73, 13);
                sparseIntArray.append(46, 14);
                sparseIntArray.append(45, 15);
                sparseIntArray.append(43, 16);
                sparseIntArray.append(47, 2);
                sparseIntArray.append(49, 3);
                sparseIntArray.append(48, 4);
                sparseIntArray.append(82, 49);
                sparseIntArray.append(83, 50);
                sparseIntArray.append(53, 5);
                sparseIntArray.append(54, 6);
                sparseIntArray.append(55, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(69, 17);
                sparseIntArray.append(70, 18);
                sparseIntArray.append(52, 19);
                sparseIntArray.append(51, 20);
                sparseIntArray.append(86, 21);
                sparseIntArray.append(89, 22);
                sparseIntArray.append(87, 23);
                sparseIntArray.append(84, 24);
                sparseIntArray.append(88, 25);
                sparseIntArray.append(85, 26);
                sparseIntArray.append(60, 29);
                sparseIntArray.append(75, 30);
                sparseIntArray.append(50, 44);
                sparseIntArray.append(62, 45);
                sparseIntArray.append(77, 46);
                sparseIntArray.append(61, 47);
                sparseIntArray.append(76, 48);
                sparseIntArray.append(41, 27);
                sparseIntArray.append(40, 28);
                sparseIntArray.append(78, 31);
                sparseIntArray.append(56, 32);
                sparseIntArray.append(80, 33);
                sparseIntArray.append(79, 34);
                sparseIntArray.append(81, 35);
                sparseIntArray.append(58, 36);
                sparseIntArray.append(57, 37);
                sparseIntArray.append(59, 38);
                sparseIntArray.append(63, 39);
                sparseIntArray.append(72, 40);
                sparseIntArray.append(66, 41);
                sparseIntArray.append(44, 42);
                sparseIntArray.append(42, 43);
                sparseIntArray.append(71, 51);
            }
        }

        public C0094a(C0094a c0094a) {
            super((ViewGroup.MarginLayoutParams) c0094a);
            this.f568a = -1;
            this.f570b = -1;
            this.f572c = -1.0f;
            this.f574d = -1;
            this.f576e = -1;
            this.f578f = -1;
            this.f580g = -1;
            this.f582h = -1;
            this.f584i = -1;
            this.f586j = -1;
            this.f588k = -1;
            this.f590l = -1;
            this.f592m = -1;
            this.f594n = 0;
            this.f595o = 0.0f;
            this.f596p = -1;
            this.f597q = -1;
            this.f598r = -1;
            this.f599s = -1;
            this.f600t = -1;
            this.f601u = -1;
            this.f602v = -1;
            this.f603w = -1;
            this.f604x = -1;
            this.f605y = -1;
            this.f606z = 0.5f;
            this.f542A = 0.5f;
            this.f543B = null;
            this.f544C = 0.0f;
            this.f545D = 1;
            this.f546E = -1.0f;
            this.f547F = -1.0f;
            this.f548G = 0;
            this.f549H = 0;
            this.f550I = 0;
            this.f551J = 0;
            this.f552K = 0;
            this.f553L = 0;
            this.f554M = 0;
            this.f555N = 0;
            this.f556O = 1.0f;
            this.f557P = 1.0f;
            this.f558Q = -1;
            this.f559R = -1;
            this.f560S = -1;
            this.f561T = false;
            this.f562U = false;
            this.f563V = null;
            this.f564W = true;
            this.f565X = true;
            this.f566Y = false;
            this.f567Z = false;
            this.f569a0 = false;
            this.f571b0 = false;
            this.f573c0 = -1;
            this.f575d0 = -1;
            this.f577e0 = -1;
            this.f579f0 = -1;
            this.f581g0 = -1;
            this.f583h0 = -1;
            this.f585i0 = 0.5f;
            this.f593m0 = new ConstraintWidget();
            this.f568a = c0094a.f568a;
            this.f570b = c0094a.f570b;
            this.f572c = c0094a.f572c;
            this.f574d = c0094a.f574d;
            this.f576e = c0094a.f576e;
            this.f578f = c0094a.f578f;
            this.f580g = c0094a.f580g;
            this.f582h = c0094a.f582h;
            this.f584i = c0094a.f584i;
            this.f586j = c0094a.f586j;
            this.f588k = c0094a.f588k;
            this.f590l = c0094a.f590l;
            this.f592m = c0094a.f592m;
            this.f594n = c0094a.f594n;
            this.f595o = c0094a.f595o;
            this.f596p = c0094a.f596p;
            this.f597q = c0094a.f597q;
            this.f598r = c0094a.f598r;
            this.f599s = c0094a.f599s;
            this.f600t = c0094a.f600t;
            this.f601u = c0094a.f601u;
            this.f602v = c0094a.f602v;
            this.f603w = c0094a.f603w;
            this.f604x = c0094a.f604x;
            this.f605y = c0094a.f605y;
            this.f606z = c0094a.f606z;
            this.f542A = c0094a.f542A;
            this.f543B = c0094a.f543B;
            this.f544C = c0094a.f544C;
            this.f545D = c0094a.f545D;
            this.f546E = c0094a.f546E;
            this.f547F = c0094a.f547F;
            this.f548G = c0094a.f548G;
            this.f549H = c0094a.f549H;
            this.f561T = c0094a.f561T;
            this.f562U = c0094a.f562U;
            this.f550I = c0094a.f550I;
            this.f551J = c0094a.f551J;
            this.f552K = c0094a.f552K;
            this.f554M = c0094a.f554M;
            this.f553L = c0094a.f553L;
            this.f555N = c0094a.f555N;
            this.f556O = c0094a.f556O;
            this.f557P = c0094a.f557P;
            this.f558Q = c0094a.f558Q;
            this.f559R = c0094a.f559R;
            this.f560S = c0094a.f560S;
            this.f564W = c0094a.f564W;
            this.f565X = c0094a.f565X;
            this.f566Y = c0094a.f566Y;
            this.f567Z = c0094a.f567Z;
            this.f573c0 = c0094a.f573c0;
            this.f575d0 = c0094a.f575d0;
            this.f577e0 = c0094a.f577e0;
            this.f579f0 = c0094a.f579f0;
            this.f581g0 = c0094a.f581g0;
            this.f583h0 = c0094a.f583h0;
            this.f585i0 = c0094a.f585i0;
            this.f563V = c0094a.f563V;
            this.f593m0 = c0094a.f593m0;
        }

        /* JADX INFO: renamed from: a */
        public void m284a() {
            this.f567Z = false;
            this.f564W = true;
            this.f565X = true;
            int i = ((ViewGroup.MarginLayoutParams) this).width;
            if (i == -2 && this.f561T) {
                this.f564W = false;
                if (this.f550I == 0) {
                    this.f550I = 1;
                }
            }
            int i2 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i2 == -2 && this.f562U) {
                this.f565X = false;
                if (this.f551J == 0) {
                    this.f551J = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f564W = false;
                if (i == 0 && this.f550I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f561T = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f565X = false;
                if (i2 == 0 && this.f551J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f562U = true;
                }
            }
            if (this.f572c == -1.0f && this.f568a == -1 && this.f570b == -1) {
                return;
            }
            this.f567Z = true;
            this.f564W = true;
            this.f565X = true;
            if (!(this.f593m0 instanceof Guideline2)) {
                this.f593m0 = new Guideline2();
            }
            ((Guideline2) this.f593m0).m15786R(this.f560S);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x004c  */
        /* JADX WARN: Code duplicated, block: B:20:0x0053  */
        /* JADX WARN: Code duplicated, block: B:23:0x005a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0060  */
        /* JADX WARN: Code duplicated, block: B:29:0x0066  */
        /* JADX WARN: Code duplicated, block: B:36:0x0078  */
        /* JADX WARN: Code duplicated, block: B:37:0x0080 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x0082  */
        /* JADX WARN: Code duplicated, block: B:39:0x0089 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x008b  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public void resolveLayoutDirection(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i);
            boolean z = false;
            boolean z2 = 1 == getLayoutDirection();
            this.f577e0 = -1;
            this.f579f0 = -1;
            this.f573c0 = -1;
            this.f575d0 = -1;
            this.f581g0 = -1;
            this.f583h0 = -1;
            this.f581g0 = this.f600t;
            this.f583h0 = this.f602v;
            float f = this.f606z;
            this.f585i0 = f;
            int i8 = this.f568a;
            this.f587j0 = i8;
            int i9 = this.f570b;
            this.f589k0 = i9;
            float f2 = this.f572c;
            this.f591l0 = f2;
            if (z2) {
                int i10 = this.f596p;
                if (i10 != -1) {
                    this.f577e0 = i10;
                } else {
                    int i11 = this.f597q;
                    if (i11 != -1) {
                        this.f579f0 = i11;
                    } else {
                        i2 = this.f598r;
                        if (i2 != -1) {
                            this.f575d0 = i2;
                            z = true;
                        }
                        i3 = this.f599s;
                        if (i3 != -1) {
                            this.f573c0 = i3;
                            z = true;
                        }
                        i4 = this.f604x;
                        if (i4 != -1) {
                            this.f583h0 = i4;
                        }
                        i5 = this.f605y;
                        if (i5 != -1) {
                            this.f581g0 = i5;
                        }
                        if (z) {
                            this.f585i0 = 1.0f - f;
                        }
                        if (this.f567Z && this.f560S == 1) {
                            if (f2 != -1.0f) {
                                this.f591l0 = 1.0f - f2;
                                this.f587j0 = -1;
                                this.f589k0 = -1;
                            } else if (i8 != -1) {
                                this.f589k0 = i8;
                                this.f587j0 = -1;
                                this.f591l0 = -1.0f;
                            } else if (i9 != -1) {
                                this.f587j0 = i9;
                                this.f589k0 = -1;
                                this.f591l0 = -1.0f;
                            }
                        }
                    }
                }
                z = true;
                i2 = this.f598r;
                if (i2 != -1) {
                    this.f575d0 = i2;
                    z = true;
                }
                i3 = this.f599s;
                if (i3 != -1) {
                    this.f573c0 = i3;
                    z = true;
                }
                i4 = this.f604x;
                if (i4 != -1) {
                    this.f583h0 = i4;
                }
                i5 = this.f605y;
                if (i5 != -1) {
                    this.f581g0 = i5;
                }
                if (z) {
                    this.f585i0 = 1.0f - f;
                }
                if (this.f567Z) {
                    if (f2 != -1.0f) {
                        this.f591l0 = 1.0f - f2;
                        this.f587j0 = -1;
                        this.f589k0 = -1;
                    } else if (i8 != -1) {
                        this.f589k0 = i8;
                        this.f587j0 = -1;
                        this.f591l0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f587j0 = i9;
                        this.f589k0 = -1;
                        this.f591l0 = -1.0f;
                    }
                }
            } else {
                int i12 = this.f596p;
                if (i12 != -1) {
                    this.f575d0 = i12;
                }
                int i13 = this.f597q;
                if (i13 != -1) {
                    this.f573c0 = i13;
                }
                int i14 = this.f598r;
                if (i14 != -1) {
                    this.f577e0 = i14;
                }
                int i15 = this.f599s;
                if (i15 != -1) {
                    this.f579f0 = i15;
                }
                int i16 = this.f604x;
                if (i16 != -1) {
                    this.f581g0 = i16;
                }
                int i17 = this.f605y;
                if (i17 != -1) {
                    this.f583h0 = i17;
                }
            }
            if (this.f598r == -1 && this.f599s == -1 && this.f597q == -1 && this.f596p == -1) {
                int i18 = this.f578f;
                if (i18 != -1) {
                    this.f577e0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                } else {
                    int i19 = this.f580g;
                    if (i19 != -1) {
                        this.f579f0 = i19;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                        }
                    }
                }
                int i20 = this.f574d;
                if (i20 != -1) {
                    this.f573c0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                    return;
                }
                int i21 = this.f576e;
                if (i21 != -1) {
                    this.f575d0 = i21;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                }
            }
        }

        public C0094a(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            this.f568a = -1;
            this.f570b = -1;
            this.f572c = -1.0f;
            this.f574d = -1;
            this.f576e = -1;
            this.f578f = -1;
            this.f580g = -1;
            this.f582h = -1;
            this.f584i = -1;
            this.f586j = -1;
            this.f588k = -1;
            this.f590l = -1;
            this.f592m = -1;
            this.f594n = 0;
            this.f595o = 0.0f;
            this.f596p = -1;
            this.f597q = -1;
            this.f598r = -1;
            this.f599s = -1;
            this.f600t = -1;
            this.f601u = -1;
            this.f602v = -1;
            this.f603w = -1;
            this.f604x = -1;
            this.f605y = -1;
            this.f606z = 0.5f;
            this.f542A = 0.5f;
            this.f543B = null;
            this.f544C = 0.0f;
            this.f545D = 1;
            this.f546E = -1.0f;
            this.f547F = -1.0f;
            this.f548G = 0;
            this.f549H = 0;
            this.f550I = 0;
            this.f551J = 0;
            this.f552K = 0;
            this.f553L = 0;
            this.f554M = 0;
            this.f555N = 0;
            this.f556O = 1.0f;
            this.f557P = 1.0f;
            this.f558Q = -1;
            this.f559R = -1;
            this.f560S = -1;
            this.f561T = false;
            this.f562U = false;
            this.f563V = null;
            this.f564W = true;
            this.f565X = true;
            this.f566Y = false;
            this.f567Z = false;
            this.f569a0 = false;
            this.f571b0 = false;
            this.f573c0 = -1;
            this.f575d0 = -1;
            this.f577e0 = -1;
            this.f579f0 = -1;
            this.f581g0 = -1;
            this.f583h0 = -1;
            this.f585i0 = 0.5f;
            this.f593m0 = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8022i.f37164b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = a.f607a.get(index);
                switch (i3) {
                    case 1:
                        this.f560S = typedArrayObtainStyledAttributes.getInt(index, this.f560S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f592m);
                        this.f592m = resourceId;
                        if (resourceId == -1) {
                            this.f592m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f594n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f594n);
                        break;
                    case 4:
                        float f = typedArrayObtainStyledAttributes.getFloat(index, this.f595o) % 360.0f;
                        this.f595o = f;
                        if (f < 0.0f) {
                            this.f595o = (360.0f - f) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f568a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f568a);
                        break;
                    case 6:
                        this.f570b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f570b);
                        break;
                    case 7:
                        this.f572c = typedArrayObtainStyledAttributes.getFloat(index, this.f572c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f574d);
                        this.f574d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f574d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f576e);
                        this.f576e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f576e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f578f);
                        this.f578f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f578f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f580g);
                        this.f580g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f580g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f582h);
                        this.f582h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f582h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f584i);
                        this.f584i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f584i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f586j);
                        this.f586j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f586j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f588k);
                        this.f588k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f588k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f590l);
                        this.f590l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f590l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f596p);
                        this.f596p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f596p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f597q);
                        this.f597q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f597q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f598r);
                        this.f598r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f598r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f599s);
                        this.f599s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f599s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f600t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f600t);
                        break;
                    case 22:
                        this.f601u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f601u);
                        break;
                    case 23:
                        this.f602v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f602v);
                        break;
                    case 24:
                        this.f603w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f603w);
                        break;
                    case 25:
                        this.f604x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f604x);
                        break;
                    case 26:
                        this.f605y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f605y);
                        break;
                    case 27:
                        this.f561T = typedArrayObtainStyledAttributes.getBoolean(index, this.f561T);
                        break;
                    case 28:
                        this.f562U = typedArrayObtainStyledAttributes.getBoolean(index, this.f562U);
                        break;
                    case 29:
                        this.f606z = typedArrayObtainStyledAttributes.getFloat(index, this.f606z);
                        break;
                    case 30:
                        this.f542A = typedArrayObtainStyledAttributes.getFloat(index, this.f542A);
                        break;
                    case 31:
                        int i4 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f550I = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i5 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f551J = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f552K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f552K);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f552K) == -2) {
                                this.f552K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f554M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f554M);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f554M) == -2) {
                                this.f554M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f556O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f556O));
                        this.f550I = 2;
                        break;
                    case 36:
                        try {
                            this.f553L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f553L);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f553L) == -2) {
                                this.f553L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f555N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f555N);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f555N) == -2) {
                                this.f555N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f557P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f557P));
                        this.f551J = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f543B = string;
                                this.f544C = Float.NaN;
                                this.f545D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f543B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String strSubstring = this.f543B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f545D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f545D = 1;
                                        }
                                        i = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f543B.indexOf(58);
                                    if (iIndexOf2 >= 0 && iIndexOf2 < length - 1) {
                                        String strSubstring2 = this.f543B.substring(i, iIndexOf2);
                                        String strSubstring3 = this.f543B.substring(iIndexOf2 + 1);
                                        if (strSubstring2.length() > 0 && strSubstring3.length() > 0) {
                                            try {
                                                float f2 = Float.parseFloat(strSubstring2);
                                                float f3 = Float.parseFloat(strSubstring3);
                                                if (f2 > 0.0f && f3 > 0.0f) {
                                                    if (this.f545D == 1) {
                                                        this.f544C = Math.abs(f3 / f2);
                                                    } else {
                                                        this.f544C = Math.abs(f2 / f3);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    } else {
                                        String strSubstring4 = this.f543B.substring(i);
                                        if (strSubstring4.length() > 0) {
                                            this.f544C = Float.parseFloat(strSubstring4);
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f546E = typedArrayObtainStyledAttributes.getFloat(index, this.f546E);
                                break;
                            case 46:
                                this.f547F = typedArrayObtainStyledAttributes.getFloat(index, this.f547F);
                                break;
                            case 47:
                                this.f548G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f549H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f558Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f558Q);
                                break;
                            case 50:
                                this.f559R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f559R);
                                break;
                            case 51:
                                this.f563V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m284a();
        }

        public C0094a(int i, int i2) {
            super(i, i2);
            this.f568a = -1;
            this.f570b = -1;
            this.f572c = -1.0f;
            this.f574d = -1;
            this.f576e = -1;
            this.f578f = -1;
            this.f580g = -1;
            this.f582h = -1;
            this.f584i = -1;
            this.f586j = -1;
            this.f588k = -1;
            this.f590l = -1;
            this.f592m = -1;
            this.f594n = 0;
            this.f595o = 0.0f;
            this.f596p = -1;
            this.f597q = -1;
            this.f598r = -1;
            this.f599s = -1;
            this.f600t = -1;
            this.f601u = -1;
            this.f602v = -1;
            this.f603w = -1;
            this.f604x = -1;
            this.f605y = -1;
            this.f606z = 0.5f;
            this.f542A = 0.5f;
            this.f543B = null;
            this.f544C = 0.0f;
            this.f545D = 1;
            this.f546E = -1.0f;
            this.f547F = -1.0f;
            this.f548G = 0;
            this.f549H = 0;
            this.f550I = 0;
            this.f551J = 0;
            this.f552K = 0;
            this.f553L = 0;
            this.f554M = 0;
            this.f555N = 0;
            this.f556O = 1.0f;
            this.f557P = 1.0f;
            this.f558Q = -1;
            this.f559R = -1;
            this.f560S = -1;
            this.f561T = false;
            this.f562U = false;
            this.f563V = null;
            this.f564W = true;
            this.f565X = true;
            this.f566Y = false;
            this.f567Z = false;
            this.f569a0 = false;
            this.f571b0 = false;
            this.f573c0 = -1;
            this.f575d0 = -1;
            this.f577e0 = -1;
            this.f579f0 = -1;
            this.f581g0 = -1;
            this.f583h0 = -1;
            this.f585i0 = 0.5f;
            this.f593m0 = new ConstraintWidget();
        }

        public C0094a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f568a = -1;
            this.f570b = -1;
            this.f572c = -1.0f;
            this.f574d = -1;
            this.f576e = -1;
            this.f578f = -1;
            this.f580g = -1;
            this.f582h = -1;
            this.f584i = -1;
            this.f586j = -1;
            this.f588k = -1;
            this.f590l = -1;
            this.f592m = -1;
            this.f594n = 0;
            this.f595o = 0.0f;
            this.f596p = -1;
            this.f597q = -1;
            this.f598r = -1;
            this.f599s = -1;
            this.f600t = -1;
            this.f601u = -1;
            this.f602v = -1;
            this.f603w = -1;
            this.f604x = -1;
            this.f605y = -1;
            this.f606z = 0.5f;
            this.f542A = 0.5f;
            this.f543B = null;
            this.f544C = 0.0f;
            this.f545D = 1;
            this.f546E = -1.0f;
            this.f547F = -1.0f;
            this.f548G = 0;
            this.f549H = 0;
            this.f550I = 0;
            this.f551J = 0;
            this.f552K = 0;
            this.f553L = 0;
            this.f554M = 0;
            this.f555N = 0;
            this.f556O = 1.0f;
            this.f557P = 1.0f;
            this.f558Q = -1;
            this.f559R = -1;
            this.f560S = -1;
            this.f561T = false;
            this.f562U = false;
            this.f563V = null;
            this.f564W = true;
            this.f565X = true;
            this.f566Y = false;
            this.f567Z = false;
            this.f569a0 = false;
            this.f571b0 = false;
            this.f573c0 = -1;
            this.f575d0 = -1;
            this.f577e0 = -1;
            this.f579f0 = -1;
            this.f581g0 = -1;
            this.f583h0 = -1;
            this.f585i0 = 0.5f;
            this.f593m0 = new ConstraintWidget();
        }
    }
}
