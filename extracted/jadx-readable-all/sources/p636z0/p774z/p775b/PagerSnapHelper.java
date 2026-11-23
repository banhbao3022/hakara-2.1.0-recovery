package p636z0.p774z.p775b;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.z, reason: use source file name */
/* JADX INFO: compiled from: PagerSnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class PagerSnapHelper extends SnapHelper {

    /* JADX INFO: renamed from: d */
    public OrientationHelper3 f39346d;

    /* JADX INFO: renamed from: e */
    public OrientationHelper3 f39347e;

    /* JADX INFO: renamed from: z0.z.b.z$a */
    /* JADX INFO: compiled from: PagerSnapHelper.java */
    public class a extends LinearSmoothScroller {
        public a(Context context) {
            super(context);
        }

        @Override // p636z0.p774z.p775b.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.AbstractC0171x
        /* JADX INFO: renamed from: f */
        public void mo804f(View view, RecyclerView.C0172y c0172y, RecyclerView.AbstractC0171x.a aVar) {
            PagerSnapHelper pagerSnapHelper = PagerSnapHelper.this;
            int[] iArrMo14021c = pagerSnapHelper.mo14021c(pagerSnapHelper.f39166a.getLayoutManager(), view);
            int i = iArrMo14021c[0];
            int i2 = iArrMo14021c[1];
            int iM17056j = m17056j(Math.max(Math.abs(i), Math.abs(i2)));
            if (iM17056j > 0) {
                aVar.m807b(i, i2, iM17056j, this.f39330j);
            }
        }

        @Override // p636z0.p774z.p775b.LinearSmoothScroller
        /* JADX INFO: renamed from: i */
        public float mo11250i(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // p636z0.p774z.p775b.LinearSmoothScroller
        /* JADX INFO: renamed from: k */
        public int mo17057k(int i) {
            return Math.min(100, super.mo17057k(i));
        }
    }

    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: c */
    public int[] mo14021c(RecyclerView.AbstractC0160m abstractC0160m, View view) {
        int[] iArr = new int[2];
        if (abstractC0160m.mo531e()) {
            iArr[0] = m17079h(view, m17081j(abstractC0160m));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0160m.mo533f()) {
            iArr[1] = m17079h(view, m17082k(abstractC0160m));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: d */
    public RecyclerView.AbstractC0171x mo16998d(RecyclerView.AbstractC0160m abstractC0160m) {
        if (abstractC0160m instanceof RecyclerView.AbstractC0171x.b) {
            return new a(this.f39166a.getContext());
        }
        return null;
    }

    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: e */
    public View mo937e(RecyclerView.AbstractC0160m abstractC0160m) {
        if (abstractC0160m.mo533f()) {
            return m17080i(abstractC0160m, m17082k(abstractC0160m));
        }
        if (abstractC0160m.mo531e()) {
            return m17080i(abstractC0160m, m17081j(abstractC0160m));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p636z0.p774z.p775b.SnapHelper
    /* JADX INFO: renamed from: f */
    public int mo14022f(RecyclerView.AbstractC0160m abstractC0160m, int i, int i2) {
        PointF pointFMo526a;
        int iM722J = abstractC0160m.m722J();
        if (iM722J == 0) {
            return -1;
        }
        View view = null;
        OrientationHelper3 orientationHelper3M17082k = abstractC0160m.mo533f() ? m17082k(abstractC0160m) : abstractC0160m.mo531e() ? m17081j(abstractC0160m) : null;
        if (orientationHelper3M17082k == null) {
            return -1;
        }
        int iM764y = abstractC0160m.m764y();
        boolean z = false;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < iM764y; i5++) {
            View viewM762x = abstractC0160m.m762x(i5);
            if (viewM762x != null) {
                int iM17079h = m17079h(viewM762x, orientationHelper3M17082k);
                if (iM17079h <= 0 && iM17079h > i3) {
                    view2 = viewM762x;
                    i3 = iM17079h;
                }
                if (iM17079h >= 0 && iM17079h < i4) {
                    view = viewM762x;
                    i4 = iM17079h;
                }
            }
        }
        boolean z2 = !abstractC0160m.mo531e() ? i2 <= 0 : i <= 0;
        if (z2 && view != null) {
            return abstractC0160m.m735R(view);
        }
        if (!z2 && view2 != null) {
            return abstractC0160m.m735R(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iM735R = abstractC0160m.m735R(view);
        int iM722J2 = abstractC0160m.m722J();
        if ((abstractC0160m instanceof RecyclerView.AbstractC0171x.b) && (pointFMo526a = ((RecyclerView.AbstractC0171x.b) abstractC0160m).mo526a(iM722J2 - 1)) != null && (pointFMo526a.x < 0.0f || pointFMo526a.y < 0.0f)) {
            z = true;
        }
        int i6 = iM735R + (z == z2 ? -1 : 1);
        if (i6 < 0 || i6 >= iM722J) {
            return -1;
        }
        return i6;
    }

    /* JADX INFO: renamed from: h */
    public final int m17079h(View view, OrientationHelper3 orientationHelper3) {
        return ((orientationHelper3.mo17064c(view) / 2) + orientationHelper3.mo17066e(view)) - ((orientationHelper3.mo17073l() / 2) + orientationHelper3.mo17072k());
    }

    /* JADX INFO: renamed from: i */
    public final View m17080i(RecyclerView.AbstractC0160m abstractC0160m, OrientationHelper3 orientationHelper3) {
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

    /* JADX INFO: renamed from: j */
    public final OrientationHelper3 m17081j(RecyclerView.AbstractC0160m abstractC0160m) {
        OrientationHelper3 orientationHelper3 = this.f39347e;
        if (orientationHelper3 == null || orientationHelper3.f39343a != abstractC0160m) {
            this.f39347e = new OrientationHelper(abstractC0160m);
        }
        return this.f39347e;
    }

    /* JADX INFO: renamed from: k */
    public final OrientationHelper3 m17082k(RecyclerView.AbstractC0160m abstractC0160m) {
        OrientationHelper3 orientationHelper3 = this.f39346d;
        if (orientationHelper3 == null || orientationHelper3.f39343a != abstractC0160m) {
            this.f39346d = new OrientationHelper2(abstractC0160m);
        }
        return this.f39346d;
    }
}
