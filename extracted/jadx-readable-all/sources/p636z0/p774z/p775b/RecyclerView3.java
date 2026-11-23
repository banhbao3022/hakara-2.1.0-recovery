package p636z0.p774z.p775b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.b0, reason: use source file name */
/* JADX INFO: compiled from: RecyclerView.java */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView3 implements AdapterHelper.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f39137a;

    public RecyclerView3(RecyclerView recyclerView) {
        this.f39137a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public void m16980a(AdapterHelper.b bVar) {
        int i = bVar.f39131a;
        if (i == 1) {
            RecyclerView recyclerView = this.f39137a;
            recyclerView.f987x.mo497p0(recyclerView, bVar.f39132b, bVar.f39134d);
            return;
        }
        if (i == 2) {
            RecyclerView recyclerView2 = this.f39137a;
            recyclerView2.f987x.mo501s0(recyclerView2, bVar.f39132b, bVar.f39134d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f39137a;
            recyclerView3.f987x.mo503u0(recyclerView3, bVar.f39132b, bVar.f39134d, bVar.f39133c);
        } else {
            if (i != 8) {
                return;
            }
            RecyclerView recyclerView4 = this.f39137a;
            recyclerView4.f987x.mo500r0(recyclerView4, bVar.f39132b, bVar.f39134d, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public RecyclerView.AbstractC0149b0 m16981b(int i) {
        RecyclerView recyclerView = this.f39137a;
        int iM17008h = recyclerView.f971p.m17008h();
        RecyclerView.AbstractC0149b0 abstractC0149b0 = null;
        for (int i2 = 0; i2 < iM17008h; i2++) {
            RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(recyclerView.f971p.m17007g(i2));
            if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m651m() && abstractC0149b0M568K.f1005d == i) {
                if (!recyclerView.f971p.m17011k(abstractC0149b0M568K.f1003b)) {
                    abstractC0149b0 = abstractC0149b0M568K;
                    break;
                }
                abstractC0149b0 = abstractC0149b0M568K;
            }
        }
        if (abstractC0149b0 == null || this.f39137a.f971p.m17011k(abstractC0149b0.f1003b)) {
            return null;
        }
        return abstractC0149b0;
    }

    /* JADX INFO: renamed from: c */
    public void m16982c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f39137a;
        int iM17008h = recyclerView.f971p.m17008h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iM17008h; i6++) {
            View viewM17007g = recyclerView.f971p.m17007g(i6);
            RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(viewM17007g);
            if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m659u() && (i4 = abstractC0149b0M568K.f1005d) >= i && i4 < i5) {
                abstractC0149b0M568K.m640b(2);
                abstractC0149b0M568K.m639a(obj);
                ((RecyclerView.C0161n) viewM17007g.getLayoutParams()).f1060c = true;
            }
        }
        RecyclerView.C0167t c0167t = recyclerView.f965m;
        int size = c0167t.f1070c.size();
        while (true) {
            size--;
            if (size < 0) {
                this.f39137a.f988x0 = true;
                return;
            }
            RecyclerView.AbstractC0149b0 abstractC0149b0 = c0167t.f1070c.get(size);
            if (abstractC0149b0 != null && (i3 = abstractC0149b0.f1005d) >= i && i3 < i5) {
                abstractC0149b0.m640b(2);
                c0167t.m790f(size);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m16983d(int i, int i2) {
        RecyclerView recyclerView = this.f39137a;
        int iM17008h = recyclerView.f971p.m17008h();
        for (int i3 = 0; i3 < iM17008h; i3++) {
            RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(recyclerView.f971p.m17007g(i3));
            if (abstractC0149b0M568K != null && !abstractC0149b0M568K.m659u() && abstractC0149b0M568K.f1005d >= i) {
                abstractC0149b0M568K.m655q(i2, false);
                recyclerView.f980t0.f1099f = true;
            }
        }
        RecyclerView.C0167t c0167t = recyclerView.f965m;
        int size = c0167t.f1070c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.AbstractC0149b0 abstractC0149b0 = c0167t.f1070c.get(i4);
            if (abstractC0149b0 != null && abstractC0149b0.f1005d >= i) {
                abstractC0149b0.m655q(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.f39137a.f986w0 = true;
    }

    /* JADX INFO: renamed from: e */
    public void m16984e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f39137a;
        int iM17008h = recyclerView.f971p.m17008h();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iM17008h; i11++) {
            RecyclerView.AbstractC0149b0 abstractC0149b0M568K = RecyclerView.m568K(recyclerView.f971p.m17007g(i11));
            if (abstractC0149b0M568K != null && (i9 = abstractC0149b0M568K.f1005d) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    abstractC0149b0M568K.m655q(i2 - i, false);
                } else {
                    abstractC0149b0M568K.m655q(i5, false);
                }
                recyclerView.f980t0.f1099f = true;
            }
        }
        RecyclerView.C0167t c0167t = recyclerView.f965m;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = c0167t.f1070c.size();
        for (int i12 = 0; i12 < size; i12++) {
            RecyclerView.AbstractC0149b0 abstractC0149b0 = c0167t.f1070c.get(i12);
            if (abstractC0149b0 != null && (i8 = abstractC0149b0.f1005d) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    abstractC0149b0.m655q(i2 - i, false);
                } else {
                    abstractC0149b0.m655q(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f39137a.f986w0 = true;
    }
}
