package p007c.p190n.p194b.p334e.p339d;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p725k.C8162a;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.WindowInsetsCompat;

/* JADX INFO: renamed from: c.n.b.e.d.g, reason: use source file name */
/* JADX INFO: compiled from: HeaderScrollingViewBehavior.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* JADX INFO: renamed from: c */
    public final Rect f24928c;

    /* JADX INFO: renamed from: d */
    public final Rect f24929d;

    /* JADX INFO: renamed from: e */
    public int f24930e;

    /* JADX INFO: renamed from: f */
    public int f24931f;

    public HeaderScrollingViewBehavior() {
        this.f24928c = new Rect();
        this.f24929d = new Rect();
        this.f24930e = 0;
    }

    @Override // p007c.p190n.p194b.p334e.p339d.ViewOffsetBehavior
    /* JADX INFO: renamed from: C */
    public void mo11080C(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewMo11081E = mo11081E(coordinatorLayout.m291e(view));
        if (viewMo11081E == null) {
            coordinatorLayout.m299s(view, i);
            this.f24930e = 0;
            return;
        }
        CoordinatorLayout.C0101f c0101f = (CoordinatorLayout.C0101f) view.getLayoutParams();
        Rect rect = this.f24928c;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0101f).leftMargin, viewMo11081E.getBottom() + ((ViewGroup.MarginLayoutParams) c0101f).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0101f).rightMargin, ((viewMo11081E.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0101f).bottomMargin);
        WindowInsetsCompat lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.m16228c() + rect.left;
                rect.right -= lastWindowInsets.m16229d();
            }
        }
        Rect rect2 = this.f24929d;
        int i2 = c0101f.f645c;
        Gravity.apply(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int iM11082F = m11082F(viewMo11081E);
        view.layout(rect2.left, rect2.top - iM11082F, rect2.right, rect2.bottom - iM11082F);
        this.f24930e = rect2.top - viewMo11081E.getBottom();
    }

    /* JADX INFO: renamed from: E */
    public abstract View mo11081E(List<View> list);

    /* JADX INFO: renamed from: F */
    public final int m11082F(View view) {
        if (this.f24931f == 0) {
            return 0;
        }
        float fMo11083G = mo11083G(view);
        int i = this.f24931f;
        return C8162a.m16066k((int) (fMo11083G * i), 0, i);
    }

    /* JADX INFO: renamed from: G */
    public float mo11083G(View view) {
        return 1.0f;
    }

    /* JADX INFO: renamed from: H */
    public int mo11084H(View view) {
        return view.getMeasuredHeight();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: l */
    public boolean mo320l(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewMo11081E;
        WindowInsetsCompat lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewMo11081E = mo11081E(coordinatorLayout.m291e(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            if (viewMo11081E.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                size += lastWindowInsets.m16227b() + lastWindowInsets.m16230e();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        coordinatorLayout.m300t(view, i, i2, View.MeasureSpec.makeMeasureSpec((mo11084H(viewMo11081E) + size) - viewMo11081E.getMeasuredHeight(), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24928c = new Rect();
        this.f24929d = new Rect();
        this.f24930e = 0;
    }
}
