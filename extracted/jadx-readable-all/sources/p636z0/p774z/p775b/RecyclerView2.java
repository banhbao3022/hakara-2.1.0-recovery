package p636z0.p774z.p775b;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: z0.z.b.a0, reason: use source file name */
/* JADX INFO: compiled from: RecyclerView.java */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView2 implements ChildHelper.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RecyclerView f39135a;

    public RecyclerView2(RecyclerView recyclerView) {
        this.f39135a = recyclerView;
    }

    /* JADX INFO: renamed from: a */
    public View m16973a(int i) {
        return this.f39135a.getChildAt(i);
    }

    /* JADX INFO: renamed from: b */
    public int m16974b() {
        return this.f39135a.getChildCount();
    }

    /* JADX INFO: renamed from: c */
    public void m16975c(int i) {
        View childAt = this.f39135a.getChildAt(i);
        if (childAt != null) {
            this.f39135a.m622p(childAt);
            childAt.clearAnimation();
        }
        this.f39135a.removeViewAt(i);
    }
}
