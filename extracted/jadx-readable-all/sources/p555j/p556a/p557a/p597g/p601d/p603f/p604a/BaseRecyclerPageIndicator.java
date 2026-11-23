package p555j.p556a.p557a.p597g.p601d.p603f.p604a;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: j.a.a.g.d.f.a.a, reason: use source file name */
/* JADX INFO: compiled from: BaseRecyclerPageIndicator.java */
/* JADX INFO: loaded from: classes.dex */
public class BaseRecyclerPageIndicator extends View implements OnPageChangeListener {

    /* JADX INFO: renamed from: f */
    public RecyclerView f32193f;

    /* JADX INFO: renamed from: g */
    public OnPageChangeListener f32194g;

    /* JADX INFO: renamed from: h */
    public int f32195h;

    /* JADX INFO: renamed from: i */
    public int f32196i;

    /* JADX INFO: renamed from: j */
    public RecyclerView.AbstractC0165r f32197j;

    /* JADX INFO: renamed from: j.a.a.g.d.f.a.a$a */
    /* JADX INFO: compiled from: BaseRecyclerPageIndicator.java */
    public class a extends RecyclerView.AbstractC0165r {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: a */
        public void mo781a(RecyclerView recyclerView, int i) {
            OnPageChangeListener onPageChangeListener;
            OnPageChangeListener onPageChangeListener2 = BaseRecyclerPageIndicator.this.f32194g;
            if (onPageChangeListener2 != null && (onPageChangeListener = ((BaseRecyclerPageIndicator) onPageChangeListener2).f32194g) != null) {
                ((BaseRecyclerPageIndicator) onPageChangeListener).m14026b(i);
            }
            if (i == 0) {
                RecyclerView.AbstractC0160m layoutManager = recyclerView.getLayoutManager();
                int iM545l1 = 0;
                if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    iM545l1 = gridLayoutManager.m545l1() / (gridLayoutManager.f860H * BaseRecyclerPageIndicator.this.f32195h);
                } else if (layoutManager instanceof LinearLayoutManager) {
                    iM545l1 = ((LinearLayoutManager) layoutManager).m545l1();
                }
                BaseRecyclerPageIndicator baseRecyclerPageIndicator = BaseRecyclerPageIndicator.this;
                if (baseRecyclerPageIndicator.f32196i == iM545l1) {
                    return;
                }
                baseRecyclerPageIndicator.f32196i = iM545l1;
                baseRecyclerPageIndicator.invalidate();
                OnPageChangeListener onPageChangeListener3 = baseRecyclerPageIndicator.f32194g;
                if (onPageChangeListener3 != null) {
                    ((BaseRecyclerPageIndicator) onPageChangeListener3).m14027c(iM545l1);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
        /* JADX INFO: renamed from: b */
        public void mo782b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public BaseRecyclerPageIndicator(Context context) {
        super(context);
        this.f32195h = 1;
        this.f32197j = new a();
    }

    /* JADX INFO: renamed from: a */
    public int m14025a() {
        RecyclerView recyclerView = this.f32193f;
        if (recyclerView == null) {
            return 0;
        }
        int i = 1;
        RecyclerView.AbstractC0160m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && (layoutManager instanceof GridLayoutManager)) {
            i = ((GridLayoutManager) layoutManager).f860H;
        }
        return i * this.f32195h;
    }

    /* JADX INFO: renamed from: b */
    public void m14026b(int i) {
        OnPageChangeListener onPageChangeListener = this.f32194g;
        if (onPageChangeListener != null) {
            ((BaseRecyclerPageIndicator) onPageChangeListener).m14026b(i);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14027c(int i) {
        if (this.f32196i == i) {
            return;
        }
        this.f32196i = i;
        invalidate();
        OnPageChangeListener onPageChangeListener = this.f32194g;
        if (onPageChangeListener != null) {
            ((BaseRecyclerPageIndicator) onPageChangeListener).m14027c(i);
        }
    }

    /* JADX INFO: renamed from: d */
    public int m14028d() {
        RecyclerView recyclerView = this.f32193f;
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return 0;
        }
        int iMo662d = this.f32193f.getAdapter().mo662d();
        int iM14025a = m14025a();
        if (iM14025a <= 0) {
            return 0;
        }
        return iMo662d % iM14025a == 0 ? iMo662d / iM14025a : (iMo662d / iM14025a) + 1;
    }

    public void setCurrentItem(int i) {
        if (this.f32193f == null) {
            throw new IllegalStateException("RecyclerView has not been bound.");
        }
        this.f32193f.m617m0(m14025a() * i);
        this.f32196i = i;
        invalidate();
    }

    public void setOnPageChangeListener(OnPageChangeListener onPageChangeListener) {
        this.f32194g = onPageChangeListener;
    }

    public void setPageColumn(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("column must be not null");
        }
        this.f32195h = i;
    }

    public void setRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f32193f;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.m602e0(this.f32197j);
        }
        if (recyclerView.getAdapter() == null) {
            throw new IllegalStateException("RecyclerView does not have adapter instance.");
        }
        this.f32193f = recyclerView;
        recyclerView.m607h(this.f32197j);
        invalidate();
    }

    public BaseRecyclerPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32195h = 1;
        this.f32197j = new a();
    }

    public BaseRecyclerPageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32195h = 1;
        this.f32197j = new a();
    }
}
