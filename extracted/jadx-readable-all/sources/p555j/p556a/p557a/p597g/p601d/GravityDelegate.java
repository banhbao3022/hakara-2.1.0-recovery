package p555j.p556a.p557a.p597g.p601d;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p636z0.p774z.p775b.OrientationHelper3;

/* JADX INFO: renamed from: j.a.a.g.d.a, reason: use source file name */
/* JADX INFO: compiled from: GravityDelegate.java */
/* JADX INFO: loaded from: classes.dex */
public class GravityDelegate {

    /* JADX INFO: renamed from: a */
    public OrientationHelper3 f32173a;

    /* JADX INFO: renamed from: b */
    public OrientationHelper3 f32174b;

    /* JADX INFO: renamed from: c */
    public int f32175c;

    /* JADX INFO: renamed from: d */
    public boolean f32176d;

    /* JADX INFO: renamed from: e */
    public boolean f32177e;

    /* JADX INFO: renamed from: f */
    public GravitySnapHelper.a f32178f;

    /* JADX INFO: renamed from: g */
    public boolean f32179g;

    /* JADX INFO: renamed from: h */
    public int f32180h = 1;

    /* JADX INFO: renamed from: i */
    public RecyclerView.AbstractC0165r f32181i = new a();

    /* JADX INFO: renamed from: j.a.a.g.d.a$a */
    /* JADX INFO: compiled from: GravityDelegate.java */
    public class a extends RecyclerView.AbstractC0165r {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0048  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: a */
        public void mo781a(RecyclerView recyclerView, int i) {
            int iM539i1;
            if (i == 2) {
                GravityDelegate.this.f32179g = false;
            }
            if (i == 0) {
                GravityDelegate gravityDelegate = GravityDelegate.this;
                if (!gravityDelegate.f32179g || gravityDelegate.f32178f == null) {
                    return;
                }
                RecyclerView.AbstractC0160m layoutManager = recyclerView.getLayoutManager();
                if (layoutManager instanceof LinearLayoutManager) {
                    int i2 = gravityDelegate.f32175c;
                    if (i2 == 8388611 || i2 == 48 || (i2 == 17 && !gravityDelegate.f32176d)) {
                        iM539i1 = ((LinearLayoutManager) layoutManager).m539i1();
                    } else if (i2 == 8388613 || i2 == 80) {
                        iM539i1 = ((LinearLayoutManager) layoutManager).m546m1();
                    } else {
                        iM539i1 = -1;
                    }
                } else {
                    iM539i1 = -1;
                }
                if (iM539i1 != -1) {
                    GravityDelegate.this.f32178f.m14023a(iM539i1);
                }
                GravityDelegate.this.f32179g = false;
            }
        }
    }

    public GravityDelegate(int i, boolean z, GravitySnapHelper.a aVar) {
        if (i != 8388611 && i != 8388613 && i != 80 && i != 48 && i != 17) {
            throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
        }
        this.f32177e = z;
        this.f32175c = i;
        this.f32178f = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final int m14013a(RecyclerView.AbstractC0160m abstractC0160m, View view, OrientationHelper3 orientationHelper3) {
        int iMo17073l = orientationHelper3.mo17073l() / this.f32180h;
        int iM735R = abstractC0160m.m735R(view);
        int i = abstractC0160m instanceof GridLayoutManager ? ((GridLayoutManager) abstractC0160m).f860H : 1;
        int iM14019g = ((iM735R - (m14019g(iM735R, i) * (this.f32180h * i))) / i) * iMo17073l;
        return this.f32176d ? orientationHelper3.mo17063b(view) - (orientationHelper3.mo17073l() - iM14019g) : orientationHelper3.mo17066e(view) - iM14019g;
    }

    /* JADX INFO: renamed from: b */
    public final int m14014b(View view, OrientationHelper3 orientationHelper3, boolean z) {
        return (!this.f32176d || z) ? orientationHelper3.mo17063b(view) - orientationHelper3.mo17068g() : m14015c(view, orientationHelper3, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m14015c(View view, OrientationHelper3 orientationHelper3, boolean z) {
        return (!this.f32176d || z) ? orientationHelper3.mo17066e(view) - orientationHelper3.mo17072k() : m14014b(view, orientationHelper3, true);
    }

    /* JADX INFO: renamed from: d */
    public final View m14016d(RecyclerView.AbstractC0160m abstractC0160m, OrientationHelper3 orientationHelper3) {
        int iMo17067f;
        int iMo17066e;
        int iMo17064c;
        int iMo17072k;
        int iMo17073l;
        int iM764y = abstractC0160m.m764y();
        View view = null;
        if (iM764y == 0) {
            return null;
        }
        RecyclerView recyclerView = abstractC0160m.f1036b;
        if (recyclerView != null && recyclerView.f975r) {
            if (this.f32176d) {
                iMo17072k = orientationHelper3.mo17073l() - orientationHelper3.mo17068g();
                iMo17073l = orientationHelper3.mo17073l() / 2;
            } else {
                iMo17072k = orientationHelper3.mo17072k();
                iMo17073l = orientationHelper3.mo17073l() / 2;
            }
            iMo17067f = iMo17073l + iMo17072k;
        } else {
            iMo17067f = orientationHelper3.mo17067f() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iM764y; i2++) {
            View viewM762x = abstractC0160m.m762x(i2);
            if (this.f32176d) {
                iMo17066e = orientationHelper3.mo17073l() - orientationHelper3.mo17063b(viewM762x);
                iMo17064c = orientationHelper3.mo17064c(viewM762x) / 2;
            } else {
                iMo17066e = orientationHelper3.mo17066e(viewM762x);
                iMo17064c = orientationHelper3.mo17064c(viewM762x) / 2;
            }
            int iAbs = Math.abs((iMo17064c + iMo17066e) - iMo17067f);
            if (iAbs < i) {
                view = viewM762x;
                i = iAbs;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: e */
    public final View m14017e(RecyclerView.AbstractC0160m abstractC0160m, OrientationHelper3 orientationHelper3) {
        float fMo17073l;
        int iMo17064c;
        if (!(abstractC0160m instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0160m;
        boolean z = linearLayoutManager.f881v;
        int iM545l1 = z ? linearLayoutManager.m545l1() : linearLayoutManager.m548n1();
        boolean z2 = true;
        int i = abstractC0160m instanceof GridLayoutManager ? (((GridLayoutManager) abstractC0160m).f860H - 1) + 1 : 1;
        if (iM545l1 == -1) {
            return null;
        }
        View viewMo553t = abstractC0160m.mo553t(iM545l1);
        if (this.f32176d) {
            fMo17073l = orientationHelper3.mo17063b(viewMo553t);
            iMo17064c = orientationHelper3.mo17064c(viewMo553t);
        } else {
            fMo17073l = orientationHelper3.mo17073l() - orientationHelper3.mo17066e(viewMo553t);
            iMo17064c = orientationHelper3.mo17064c(viewMo553t);
        }
        float f = fMo17073l / iMo17064c;
        if (z ? ((LinearLayoutManager) abstractC0160m).m546m1() != abstractC0160m.m722J() - 1 : ((LinearLayoutManager) abstractC0160m).m539i1() != 0) {
            z2 = false;
        }
        if (f > 0.5f && !z2) {
            return viewMo553t;
        }
        if (this.f32177e && z2) {
            return viewMo553t;
        }
        if (z2) {
            return null;
        }
        return z ? abstractC0160m.mo553t(iM545l1 + i) : abstractC0160m.mo553t(iM545l1 - i);
    }

    /* JADX INFO: renamed from: f */
    public final View m14018f(RecyclerView.AbstractC0160m abstractC0160m, OrientationHelper3 orientationHelper3) {
        float fMo17063b;
        int iMo17064c;
        if (!(abstractC0160m instanceof LinearLayoutManager)) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) abstractC0160m;
        boolean z = linearLayoutManager.f881v;
        int iM548n1 = z ? linearLayoutManager.m548n1() : linearLayoutManager.m545l1();
        boolean z2 = true;
        int i = abstractC0160m instanceof GridLayoutManager ? (((GridLayoutManager) abstractC0160m).f860H - 1) + 1 : 1;
        if (iM548n1 == -1) {
            return null;
        }
        View viewMo553t = abstractC0160m.mo553t(iM548n1);
        if (this.f32176d) {
            fMo17063b = orientationHelper3.mo17073l() - orientationHelper3.mo17066e(viewMo553t);
            iMo17064c = orientationHelper3.mo17064c(viewMo553t);
        } else {
            fMo17063b = orientationHelper3.mo17063b(viewMo553t);
            iMo17064c = orientationHelper3.mo17064c(viewMo553t);
        }
        float f = fMo17063b / iMo17064c;
        if (z ? ((LinearLayoutManager) abstractC0160m).m539i1() != 0 : ((LinearLayoutManager) abstractC0160m).m546m1() != abstractC0160m.m722J() - 1) {
            z2 = false;
        }
        if (f > 0.5f && !z2) {
            return viewMo553t;
        }
        if (this.f32177e && z2) {
            return viewMo553t;
        }
        if (z2) {
            return null;
        }
        return z ? abstractC0160m.mo553t(iM548n1 - i) : abstractC0160m.mo553t(iM548n1 + i);
    }

    /* JADX INFO: renamed from: g */
    public final int m14019g(int i, int i2) {
        return i / (i2 * this.f32180h);
    }
}
