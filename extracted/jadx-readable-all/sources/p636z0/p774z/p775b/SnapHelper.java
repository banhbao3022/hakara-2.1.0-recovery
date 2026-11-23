package p636z0.p774z.p775b;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.e0, reason: use source file name */
/* JADX INFO: compiled from: SnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class SnapHelper extends RecyclerView.AbstractC0163p {

    /* JADX INFO: renamed from: a */
    public RecyclerView f39166a;

    /* JADX INFO: renamed from: b */
    public Scroller f39167b;

    /* JADX INFO: renamed from: c */
    public final RecyclerView.AbstractC0165r f39168c = new a();

    /* JADX INFO: renamed from: z0.z.b.e0$a */
    /* JADX INFO: compiled from: SnapHelper.java */
    public class a extends RecyclerView.AbstractC0165r {

        /* JADX INFO: renamed from: a */
        public boolean f39169a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: a */
        public void mo781a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.f39169a) {
                this.f39169a = false;
                SnapHelper.this.m16999g();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: b */
        public void mo782b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f39169a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0163p
    /* JADX INFO: renamed from: a */
    public boolean mo777a(int i, int i2) {
        RecyclerView.AbstractC0171x abstractC0171xMo16998d;
        int iMo14022f;
        boolean z;
        RecyclerView.AbstractC0160m layoutManager = this.f39166a.getLayoutManager();
        if (layoutManager == null || this.f39166a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f39166a.getMinFlingVelocity();
        if (Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) {
            return false;
        }
        if (!(layoutManager instanceof RecyclerView.AbstractC0171x.b) || (abstractC0171xMo16998d = mo16998d(layoutManager)) == null || (iMo14022f = mo14022f(layoutManager, i, i2)) == -1) {
            z = false;
        } else {
            abstractC0171xMo16998d.f1079a = iMo14022f;
            layoutManager.m743Y0(abstractC0171xMo16998d);
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public void mo14020b(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f39166a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m602e0(this.f39168c);
            this.f39166a.setOnFlingListener(null);
        }
        this.f39166a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f39166a.m607h(this.f39168c);
            this.f39166a.setOnFlingListener(this);
            this.f39167b = new Scroller(this.f39166a.getContext(), new DecelerateInterpolator());
            m16999g();
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract int[] mo14021c(RecyclerView.AbstractC0160m abstractC0160m, View view);

    /* JADX INFO: renamed from: d */
    public RecyclerView.AbstractC0171x mo16998d(RecyclerView.AbstractC0160m abstractC0160m) {
        if (abstractC0160m instanceof RecyclerView.AbstractC0171x.b) {
            return new SnapHelper2(this, this.f39166a.getContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public abstract View mo937e(RecyclerView.AbstractC0160m abstractC0160m);

    /* JADX INFO: renamed from: f */
    public abstract int mo14022f(RecyclerView.AbstractC0160m abstractC0160m, int i, int i2);

    /* JADX INFO: renamed from: g */
    public void m16999g() {
        RecyclerView.AbstractC0160m layoutManager;
        View viewMo937e;
        RecyclerView recyclerView = this.f39166a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewMo937e = mo937e(layoutManager)) == null) {
            return;
        }
        int[] iArrMo14021c = mo14021c(layoutManager, viewMo937e);
        if (iArrMo14021c[0] == 0 && iArrMo14021c[1] == 0) {
            return;
        }
        this.f39166a.m615l0(iArrMo14021c[0], iArrMo14021c[1], null, Integer.MIN_VALUE, false);
    }
}
