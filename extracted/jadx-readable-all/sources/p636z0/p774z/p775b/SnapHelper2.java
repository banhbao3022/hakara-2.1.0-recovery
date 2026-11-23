package p636z0.p774z.p775b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.f0, reason: use source file name */
/* JADX INFO: compiled from: SnapHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class SnapHelper2 extends LinearSmoothScroller {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ SnapHelper f39176q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapHelper2(SnapHelper snapHelper, Context context) {
        super(context);
        this.f39176q = snapHelper;
    }

    @Override // p636z0.p774z.p775b.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.AbstractC0171x
    /* JADX INFO: renamed from: f */
    public void mo804f(View view, RecyclerView.C0172y c0172y, RecyclerView.AbstractC0171x.a aVar) {
        SnapHelper snapHelper = this.f39176q;
        RecyclerView recyclerView = snapHelper.f39166a;
        if (recyclerView == null) {
            return;
        }
        int[] iArrMo14021c = snapHelper.mo14021c(recyclerView.getLayoutManager(), view);
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
}
