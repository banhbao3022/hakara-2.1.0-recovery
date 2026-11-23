package p636z0.p774z.p775b;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.s, reason: use source file name */
/* JADX INFO: compiled from: LinearSnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class LinearSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: d */
    public OrientationHelper3 f39337d;

    /* JADX INFO: renamed from: e */
    public OrientationHelper3 f39338e;

    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: c */
    public int[] mo14021c(RecyclerView.AbstractC0160m abstractC0160m, View view) {
        int[] iArr = new int[2];
        if (abstractC0160m.mo531e()) {
            iArr[0] = m17058h(view, m17061k(abstractC0160m));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0160m.mo533f()) {
            iArr[1] = m17058h(view, m17062l(abstractC0160m));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: e */
    public View mo937e(RecyclerView.AbstractC0160m abstractC0160m) {
        if (abstractC0160m.mo533f()) {
            return m17060j(abstractC0160m, m17062l(abstractC0160m));
        }
        if (abstractC0160m.mo531e()) {
            return m17060j(abstractC0160m, m17061k(abstractC0160m));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: f */
    public int mo14022f(RecyclerView.AbstractC0160m abstractC0160m, int i, int i2) {
        int iM722J;
        View viewMo937e;
        int iM735R;
        int i3;
        PointF pointFMo526a;
        int iM17059i;
        int iM17059i2;
        if (!(abstractC0160m instanceof RecyclerView.AbstractC0171x.b) || (iM722J = abstractC0160m.m722J()) == 0 || (viewMo937e = mo937e(abstractC0160m)) == null || (iM735R = abstractC0160m.m735R(viewMo937e)) == -1 || (pointFMo526a = ((RecyclerView.AbstractC0171x.b) abstractC0160m).mo526a((i3 = iM722J - 1))) == null) {
            return -1;
        }
        if (abstractC0160m.mo531e()) {
            iM17059i = m17059i(abstractC0160m, m17061k(abstractC0160m), i, 0);
            if (pointFMo526a.x < 0.0f) {
                iM17059i = -iM17059i;
            }
        } else {
            iM17059i = 0;
        }
        if (abstractC0160m.mo533f()) {
            iM17059i2 = m17059i(abstractC0160m, m17062l(abstractC0160m), 0, i2);
            if (pointFMo526a.y < 0.0f) {
                iM17059i2 = -iM17059i2;
            }
        } else {
            iM17059i2 = 0;
        }
        if (abstractC0160m.mo533f()) {
            iM17059i = iM17059i2;
        }
        if (iM17059i == 0) {
            return -1;
        }
        int i4 = iM735R + iM17059i;
        int i5 = i4 >= 0 ? i4 : 0;
        return i5 >= iM722J ? i3 : i5;
    }

    /* JADX INFO: renamed from: h */
    public final int m17058h(View view, OrientationHelper3 orientationHelper3) {
        return ((orientationHelper3.mo17064c(view) / 2) + orientationHelper3.mo17066e(view)) - ((orientationHelper3.mo17073l() / 2) + orientationHelper3.mo17072k());
    }

    /* JADX INFO: renamed from: i */
    public final int m17059i(RecyclerView.AbstractC0160m abstractC0160m, OrientationHelper3 orientationHelper3, int i, int i2) {
        int iMax;
        this.f39167b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.f39167b.getFinalX(), this.f39167b.getFinalY()};
        int iM764y = abstractC0160m.m764y();
        float f = 1.0f;
        if (iM764y != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 = 0; i5 < iM764y; i5++) {
                View viewM762x = abstractC0160m.m762x(i5);
                int iM735R = abstractC0160m.m735R(viewM762x);
                if (iM735R != -1) {
                    if (iM735R < i3) {
                        view = viewM762x;
                        i3 = iM735R;
                    }
                    if (iM735R > i4) {
                        view2 = viewM762x;
                        i4 = iM735R;
                    }
                }
            }
            if (view != null && view2 != null && (iMax = Math.max(orientationHelper3.mo17063b(view), orientationHelper3.mo17063b(view2)) - Math.min(orientationHelper3.mo17066e(view), orientationHelper3.mo17066e(view2))) != 0) {
                f = (iMax * 1.0f) / ((i4 - i3) + 1);
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    /* JADX INFO: renamed from: j */
    public final View m17060j(RecyclerView.AbstractC0160m abstractC0160m, OrientationHelper3 orientationHelper3) {
        int iM764y = abstractC0160m.m764y();
        View view = null;
        if (iM764y == 0) {
            return null;
        }
        int iMo17073l = (orientationHelper3.mo17073l() / 2) + orientationHelper3.mo17072k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM764y; i2++) {
            View viewM762x = abstractC0160m.m762x(i2);
            int iAbs = Math.abs(((orientationHelper3.mo17064c(viewM762x) / 2) + orientationHelper3.mo17066e(viewM762x)) - iMo17073l);
            if (iAbs < i) {
                view = viewM762x;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: k */
    public final OrientationHelper3 m17061k(RecyclerView.AbstractC0160m abstractC0160m) {
        OrientationHelper3 orientationHelper3 = this.f39338e;
        if (orientationHelper3 == null || orientationHelper3.f39343a != abstractC0160m) {
            this.f39338e = new OrientationHelper(abstractC0160m);
        }
        return this.f39338e;
    }

    /* JADX INFO: renamed from: l */
    public final OrientationHelper3 m17062l(RecyclerView.AbstractC0160m abstractC0160m) {
        OrientationHelper3 orientationHelper3 = this.f39337d;
        if (orientationHelper3 == null || orientationHelper3.f39343a != abstractC0160m) {
            this.f39337d = new OrientationHelper2(abstractC0160m);
        }
        return this.f39337d;
    }
}
