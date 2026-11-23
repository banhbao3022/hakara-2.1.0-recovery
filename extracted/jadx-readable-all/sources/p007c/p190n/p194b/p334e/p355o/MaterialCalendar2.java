package p007c.p190n.p194b.p334e.p355o;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import p636z0.p725k.p738k.Pair;

/* JADX INFO: renamed from: c.n.b.e.o.h, reason: use source file name */
/* JADX INFO: compiled from: MaterialCalendar.java */
/* JADX INFO: loaded from: classes.dex */
public class MaterialCalendar2 extends RecyclerView.AbstractC0159l {

    /* JADX INFO: renamed from: a */
    public final Calendar f25251a = UtcDates.m11255e();

    /* JADX INFO: renamed from: b */
    public final Calendar f25252b = UtcDates.m11255e();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ MaterialCalendar f25253c;

    public MaterialCalendar2(MaterialCalendar materialCalendar) {
        this.f25253c = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0159l
    /* JADX INFO: renamed from: d */
    public void mo701d(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0172y c0172y) {
        if ((recyclerView.getAdapter() instanceof YearGridAdapter2) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            YearGridAdapter2 yearGridAdapter2 = (YearGridAdapter2) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (Pair<Long, Long> pair : this.f25253c.f25237f0.m11217m()) {
                Long l = pair.f37971a;
                if (l != null && pair.f37972b != null) {
                    this.f25251a.setTimeInMillis(l.longValue());
                    this.f25252b.setTimeInMillis(pair.f37972b.longValue());
                    int iM11213n = yearGridAdapter2.m11213n(this.f25251a.get(1));
                    int iM11213n2 = yearGridAdapter2.m11213n(this.f25252b.get(1));
                    View viewMo553t = gridLayoutManager.mo553t(iM11213n);
                    View viewMo553t2 = gridLayoutManager.mo553t(iM11213n2);
                    int i = gridLayoutManager.f860H;
                    int i2 = iM11213n / i;
                    int i3 = iM11213n2 / i;
                    for (int i4 = i2; i4 <= i3; i4++) {
                        View viewMo553t3 = gridLayoutManager.mo553t(gridLayoutManager.f860H * i4);
                        if (viewMo553t3 != null) {
                            int top = viewMo553t3.getTop() + this.f25253c.f25241j0.f25225d.f25214a.top;
                            int bottom = viewMo553t3.getBottom() - this.f25253c.f25241j0.f25225d.f25214a.bottom;
                            canvas.drawRect(i4 == i2 ? (viewMo553t.getWidth() / 2) + viewMo553t.getLeft() : 0, top, i4 == i3 ? (viewMo553t2.getWidth() / 2) + viewMo553t2.getLeft() : recyclerView.getWidth(), bottom, this.f25253c.f25241j0.f25229h);
                        }
                    }
                }
            }
        }
    }
}
