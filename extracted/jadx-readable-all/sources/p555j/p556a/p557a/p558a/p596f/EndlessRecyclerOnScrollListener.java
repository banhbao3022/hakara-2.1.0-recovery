package p555j.p556a.p557a.p558a.p596f;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.f.c, reason: use source file name */
/* JADX INFO: compiled from: EndlessRecyclerOnScrollListener.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EndlessRecyclerOnScrollListener extends RecyclerView.AbstractC0165r {

    /* JADX INFO: renamed from: a */
    public int f32062a;

    /* JADX INFO: renamed from: b */
    public boolean f32063b;

    /* JADX INFO: renamed from: c */
    public int f32064c;

    /* JADX INFO: renamed from: d */
    public int f32065d;

    /* JADX INFO: renamed from: e */
    public int f32066e;

    /* JADX INFO: renamed from: f */
    public int f32067f;

    public EndlessRecyclerOnScrollListener() {
        this(0, 1, null);
    }

    public /* synthetic */ EndlessRecyclerOnScrollListener(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0165r
    /* JADX INFO: renamed from: b */
    public void mo782b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        Intrinsics2.m13089e(recyclerView, "recyclerView");
        this.f32065d = recyclerView.getChildCount();
        RecyclerView.AbstractC0160m layoutManager = recyclerView.getLayoutManager();
        this.f32066e = layoutManager != null ? layoutManager.m722J() : 0;
        RecyclerView.AbstractC0160m layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 instanceof LinearLayoutManager) {
            this.f32064c = ((LinearLayoutManager) layoutManager2).m545l1();
        } else if (layoutManager2 instanceof GridLayoutManager) {
            this.f32064c = ((GridLayoutManager) layoutManager2).m545l1();
        } else {
            Intrinsics2.m13089e(new Exception("Unsupported LayoutManage"), "$this$safeLog");
        }
        if (this.f32063b && (i3 = this.f32066e) > this.f32062a) {
            this.f32063b = false;
            this.f32062a = i3;
        }
        if (this.f32063b || this.f32066e - this.f32065d > this.f32064c + this.f32067f) {
            return;
        }
        mo13987c();
        this.f32063b = true;
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo13987c();

    public EndlessRecyclerOnScrollListener(int i) {
        this.f32063b = true;
        this.f32067f = i < 1 ? 6 : i;
    }
}
