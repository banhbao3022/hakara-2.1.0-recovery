package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p636z0.p774z.p775b.LinearSmoothScroller;

/* JADX INFO: renamed from: c.n.b.e.o.x, reason: use source file name */
/* JADX INFO: compiled from: SmoothCalendarLayoutManager.java */
/* JADX INFO: loaded from: classes.dex */
public class SmoothCalendarLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: c.n.b.e.o.x$a */
    /* JADX INFO: compiled from: SmoothCalendarLayoutManager.java */
    public class a extends LinearSmoothScroller {
        public a(SmoothCalendarLayoutManager smoothCalendarLayoutManager, Context context) {
            super(context);
        }

        @Override // p636z0.p774z.p775b.LinearSmoothScroller
        /* JADX INFO: renamed from: i */
        public float mo11250i(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public SmoothCalendarLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0160m
    /* JADX INFO: renamed from: X0 */
    public void mo525X0(RecyclerView recyclerView, RecyclerView.C0172y c0172y, int i) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.f1079a = i;
        m743Y0(aVar);
    }
}
