package p555j.p556a.p557a.p597g.p601d;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: j.a.a.g.d.d, reason: use source file name */
/* JADX INFO: compiled from: PageIndicatorHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class PageIndicatorHelper {

    /* JADX INFO: renamed from: a */
    public GravityPageChangeListener f32185a;

    /* JADX INFO: renamed from: c */
    public RecyclerView f32187c;

    /* JADX INFO: renamed from: d */
    public int f32188d;

    /* JADX INFO: renamed from: b */
    public int f32186b = 1;

    /* JADX INFO: renamed from: e */
    public RecyclerView.AbstractC0165r f32189e = new a();

    /* JADX INFO: renamed from: j.a.a.g.d.d$a */
    /* JADX INFO: compiled from: PageIndicatorHelper.java */
    public class a extends RecyclerView.AbstractC0165r {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0046  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: a */
        public void mo781a(RecyclerView recyclerView, int i) {
            int i2;
            int iM539i1;
            GravityPageChangeListener gravityPageChangeListener = PageIndicatorHelper.this.f32185a;
            if (gravityPageChangeListener != null) {
                gravityPageChangeListener.mo13931a(i);
            }
            if (i == 0) {
                RecyclerView.AbstractC0160m layoutManager = recyclerView.getLayoutManager();
                int i3 = 0;
                if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    iM539i1 = gridLayoutManager.m539i1();
                    int iM545l1 = gridLayoutManager.m545l1();
                    if (iM539i1 == -1 && iM545l1 >= 0) {
                        iM539i1 = iM545l1;
                    }
                    PageIndicatorHelper pageIndicatorHelper = PageIndicatorHelper.this;
                    RecyclerView recyclerView2 = pageIndicatorHelper.f32187c;
                    if (recyclerView2 == null || recyclerView2.getAdapter() == null) {
                        i2 = 0;
                    } else {
                        pageIndicatorHelper.f32187c.getAdapter().mo662d();
                        int iM14024a = pageIndicatorHelper.m14024a();
                        if (iM14024a <= 0) {
                            i2 = 0;
                        } else {
                            i2 = (iM539i1 / iM14024a) + 1;
                        }
                    }
                } else if (layoutManager instanceof LinearLayoutManager) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    iM539i1 = linearLayoutManager.m539i1();
                    int iM545l2 = linearLayoutManager.m545l1();
                    if (iM539i1 == -1 && iM545l2 >= 0) {
                        iM539i1 = iM545l2;
                    }
                    i2 = iM539i1 + 1;
                } else {
                    i2 = 0;
                    iM539i1 = 0;
                }
                PageIndicatorHelper pageIndicatorHelper2 = PageIndicatorHelper.this;
                if (pageIndicatorHelper2.f32188d == i2) {
                    return;
                }
                pageIndicatorHelper2.f32188d = i2;
                GravityPageChangeListener gravityPageChangeListener2 = pageIndicatorHelper2.f32185a;
                if (gravityPageChangeListener2 != null) {
                    RecyclerView recyclerView3 = pageIndicatorHelper2.f32187c;
                    if (recyclerView3 != null && recyclerView3.getAdapter() != null) {
                        int iMo662d = pageIndicatorHelper2.f32187c.getAdapter().mo662d();
                        int iM14024a2 = pageIndicatorHelper2.m14024a();
                        if (iM14024a2 > 0) {
                            i3 = iMo662d % iM14024a2 == 0 ? iMo662d / iM14024a2 : (iMo662d / iM14024a2) + 1;
                        }
                    }
                    gravityPageChangeListener2.mo13932b(iM539i1, i2, i3);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: b */
        public void mo782b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public int m14024a() {
        RecyclerView recyclerView = this.f32187c;
        if (recyclerView == null) {
            return 0;
        }
        int i = 1;
        RecyclerView.AbstractC0160m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof GridLayoutManager)) {
            i = ((GridLayoutManager) layoutManager).f860H;
        }
        return i * this.f32186b;
    }
}
