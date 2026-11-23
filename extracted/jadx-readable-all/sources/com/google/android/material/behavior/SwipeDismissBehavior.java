package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p344f.SwipeDismissBehavior2;
import p636z0.p725k.p739l.ViewCompat;
import p636z0.p725k.p739l.p740b0.AccessibilityNodeInfoCompat;
import p636z0.p745m.p747b.ViewDragHelper;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0098c<V> {

    /* JADX INFO: renamed from: a */
    public ViewDragHelper f28767a;

    /* JADX INFO: renamed from: b */
    public boolean f28768b;

    /* JADX INFO: renamed from: c */
    public int f28769c = 2;

    /* JADX INFO: renamed from: d */
    public float f28770d = 0.5f;

    /* JADX INFO: renamed from: e */
    public float f28771e = 0.0f;

    /* JADX INFO: renamed from: f */
    public float f28772f = 0.5f;

    /* JADX INFO: renamed from: g */
    public final ViewDragHelper.c f28773g = new C5912a();

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C5912a extends ViewDragHelper.c {

        /* JADX INFO: renamed from: a */
        public int f28774a;

        /* JADX INFO: renamed from: b */
        public int f28775b = -1;

        public C5912a() {
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: a */
        public int mo12706a(View view, int i, int i2) {
            int width;
            int width2;
            int width3;
            AtomicInteger atomicInteger = ViewCompat.f38073a;
            boolean z = view.getLayoutDirection() == 1;
            int i3 = SwipeDismissBehavior.this.f28769c;
            if (i3 == 0) {
                if (z) {
                    width = this.f28774a - view.getWidth();
                    width2 = this.f28774a;
                } else {
                    width = this.f28774a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 != 1) {
                width = this.f28774a - view.getWidth();
                width2 = view.getWidth() + this.f28774a;
            } else if (z) {
                width = this.f28774a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f28774a - view.getWidth();
                width2 = this.f28774a;
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: b */
        public int mo12707b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: c */
        public int mo12708c(View view) {
            return view.getWidth();
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: e */
        public void mo12709e(View view, int i) {
            this.f28775b = i;
            this.f28774a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: f */
        public void mo12710f(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: g */
        public void mo12711g(View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f28771e) + this.f28774a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f28772f) + this.f28774a;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m12704C(0.0f, 1.0f - ((f - width) / (width2 - width)), 1.0f));
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x002c  */
        /* JADX WARN: Code duplicated, block: B:18:0x002e  */
        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: h */
        public void mo12712h(View view, float f, float f2) {
            boolean z;
            int i;
            this.f28775b = -1;
            int width = view.getWidth();
            boolean z2 = false;
            if (f != 0.0f) {
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                boolean z3 = view.getLayoutDirection() == 1;
                int i2 = SwipeDismissBehavior.this.f28769c;
                if (i2 != 2 && (i2 != 0 ? i2 != 1 || (!z3 ? f < 0.0f : f > 0.0f) : !z3 ? f > 0.0f : f < 0.0f)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                if (Math.abs(view.getLeft() - this.f28774a) >= Math.round(view.getWidth() * SwipeDismissBehavior.this.f28770d)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                int left = view.getLeft();
                int i3 = this.f28774a;
                i = left < i3 ? i3 - width : i3 + width;
                z2 = true;
            } else {
                i = this.f28774a;
            }
            if (SwipeDismissBehavior.this.f28767a.m16393t(i, view.getTop())) {
                RunnableC5913b runnableC5913b = new RunnableC5913b(view, z2);
                AtomicInteger atomicInteger2 = ViewCompat.f38073a;
                view.postOnAnimation(runnableC5913b);
            } else if (z2) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }

        @Override // p636z0.p745m.p747b.ViewDragHelper.c
        /* JADX INFO: renamed from: i */
        public boolean mo12713i(View view, int i) {
            int i2 = this.f28775b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo12705B(view);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public class RunnableC5913b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final View f28777f;

        /* JADX INFO: renamed from: g */
        public final boolean f28778g;

        public RunnableC5913b(View view, boolean z) {
            this.f28777f = view;
            this.f28778g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f28767a;
            if (viewDragHelper == null || !viewDragHelper.m16382i(true)) {
                if (this.f28778g) {
                    Objects.requireNonNull(SwipeDismissBehavior.this);
                }
            } else {
                View view = this.f28777f;
                AtomicInteger atomicInteger = ViewCompat.f38073a;
                view.postOnAnimation(this);
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static float m12704C(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: A */
    public boolean mo308A(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f28767a;
        if (viewDragHelper == null) {
            return false;
        }
        viewDragHelper.m16387n(motionEvent);
        return true;
    }

    /* JADX INFO: renamed from: B */
    public boolean mo12705B(View view) {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: j */
    public boolean mo318j(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zM297q = this.f28768b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zM297q = coordinatorLayout.m297q(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f28768b = zM297q;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f28768b = false;
        }
        if (!zM297q) {
            return false;
        }
        if (this.f28767a == null) {
            this.f28767a = new ViewDragHelper(coordinatorLayout.getContext(), coordinatorLayout, this.f28773g);
        }
        return this.f28767a.m16394u(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: k */
    public boolean mo319k(CoordinatorLayout coordinatorLayout, V v, int i) {
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (v.getImportantForAccessibility() == 0) {
            v.setImportantForAccessibility(1);
            ViewCompat.m16324r(1048576, v);
            ViewCompat.m16318l(v, 0);
            if (mo12705B(v)) {
                ViewCompat.m16325s(v, AccessibilityNodeInfoCompat.a.f38026f, null, new SwipeDismissBehavior2(this));
            }
        }
        return false;
    }
}
