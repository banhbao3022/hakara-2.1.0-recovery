package mtp.media.karaoke.p628ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p497y.MathJVM;

/* JADX INFO: compiled from: CustomLinearLayoutManager.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class CustomLinearLayoutManager extends LinearLayoutManager {
    public CustomLinearLayoutManager(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: I1 */
    public final RecyclerView.C0161n m14473I1(RecyclerView.C0161n c0161n) {
        int i = this.f877r;
        if (i == 0) {
            ((ViewGroup.MarginLayoutParams) c0161n).width = MathJVM.m13102a(((double) ((this.f1050p - m731P()) - m730O())) / ((double) m722J()));
        } else if (i == 1) {
            ((ViewGroup.MarginLayoutParams) c0161n).height = MathJVM.m13102a(((double) ((this.f1051q - m729N()) - m733Q())) / ((double) m722J()));
        }
        return c0161n;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: e */
    public boolean mo531e() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: f */
    public boolean mo533f() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: g */
    public boolean mo490g(RecyclerView.C0161n c0161n) {
        Intrinsics2.m13089e(c0161n, "lp");
        return super.mo490g(c0161n);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: u */
    public RecyclerView.C0161n mo502u() {
        RecyclerView.C0161n c0161nMo502u = super.mo502u();
        Intrinsics2.m13088d(c0161nMo502u, "super.generateDefaultLayoutParams()");
        m14473I1(c0161nMo502u);
        return c0161nMo502u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: v */
    public RecyclerView.C0161n mo504v(Context context, AttributeSet attributeSet) {
        RecyclerView.C0161n c0161n = new RecyclerView.C0161n(context, attributeSet);
        Intrinsics2.m13088d(c0161n, "super.generateLayoutParams(c, attrs)");
        m14473I1(c0161n);
        return c0161n;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: w */
    public RecyclerView.C0161n mo506w(ViewGroup.LayoutParams layoutParams) {
        Intrinsics2.m13089e(layoutParams, "lp");
        RecyclerView.C0161n c0161nMo506w = super.mo506w(layoutParams);
        Intrinsics2.m13088d(c0161nMo506w, "super.generateLayoutParams(lp)");
        m14473I1(c0161nMo506w);
        return c0161nMo506w;
    }

    public CustomLinearLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public CustomLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
