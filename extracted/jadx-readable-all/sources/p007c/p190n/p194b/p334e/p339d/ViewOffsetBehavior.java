package p007c.p190n.p194b.p334e.p339d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: renamed from: c.n.b.e.d.h, reason: use source file name */
/* JADX INFO: compiled from: ViewOffsetBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.AbstractC0098c<V> {

    /* JADX INFO: renamed from: a */
    public ViewOffsetHelper f24932a;

    /* JADX INFO: renamed from: b */
    public int f24933b;

    public ViewOffsetBehavior() {
        this.f24933b = 0;
    }

    /* JADX INFO: renamed from: B */
    public int m11085B() {
        ViewOffsetHelper viewOffsetHelper = this.f24932a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.f24937d;
        }
        return 0;
    }

    /* JADX INFO: renamed from: C */
    public void mo11080C(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m299s(v, i);
    }

    /* JADX INFO: renamed from: D */
    public boolean m11086D(int i) {
        ViewOffsetHelper viewOffsetHelper = this.f24932a;
        if (viewOffsetHelper != null) {
            return viewOffsetHelper.m11088b(i);
        }
        this.f24933b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: k */
    public boolean mo319k(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo11080C(coordinatorLayout, v, i);
        if (this.f24932a == null) {
            this.f24932a = new ViewOffsetHelper(v);
        }
        ViewOffsetHelper viewOffsetHelper = this.f24932a;
        viewOffsetHelper.f24935b = viewOffsetHelper.f24934a.getTop();
        viewOffsetHelper.f24936c = viewOffsetHelper.f24934a.getLeft();
        this.f24932a.m11087a();
        int i2 = this.f24933b;
        if (i2 == 0) {
            return true;
        }
        this.f24932a.m11088b(i2);
        this.f24933b = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24933b = 0;
    }
}
