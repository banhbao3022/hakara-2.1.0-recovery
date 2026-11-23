package p555j.p556a.p557a.p558a.p559a.p562c;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.c.b, reason: use source file name */
/* JADX INFO: compiled from: ExploreAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ExploreAdapter2 implements RecyclerView.InterfaceC0164q {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ExploreAdapter f31106a;

    public ExploreAdapter2(ExploreAdapter exploreAdapter) {
        this.f31106a = exploreAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
    /* JADX INFO: renamed from: a */
    public void mo778a(RecyclerView recyclerView, MotionEvent motionEvent) {
        Intrinsics2.m13089e(recyclerView, "p0");
        Intrinsics2.m13089e(motionEvent, "p1");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
    /* JADX INFO: renamed from: b */
    public boolean mo779b(RecyclerView recyclerView, MotionEvent motionEvent) {
        Intrinsics2.m13089e(recyclerView, "rv");
        Intrinsics2.m13089e(motionEvent, "e");
        int action = motionEvent.getAction();
        if (action == 0) {
            recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            if (Math.abs(motionEvent.getX() - this.f31106a.f31092g) > Math.abs(motionEvent.getY() - this.f31106a.f31093h)) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(true);
            } else if (Math.abs(motionEvent.getY() - this.f31106a.f31093h) > this.f31106a.f31091f) {
                recyclerView.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        this.f31106a.f31092g = motionEvent.getX();
        this.f31106a.f31093h = motionEvent.getY();
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0164q
    /* JADX INFO: renamed from: c */
    public void mo780c(boolean z) {
    }
}
