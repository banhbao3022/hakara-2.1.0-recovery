package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p190n.p194b.p334e.p358r.ExpandableWidget;
import p636z0.p725k.p739l.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.AbstractC0098c<View> {

    /* JADX INFO: renamed from: a */
    public int f29241a;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class ViewTreeObserverOnPreDrawListenerC5990a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ View f29242f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f29243g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ExpandableWidget f29244h;

        public ViewTreeObserverOnPreDrawListenerC5990a(View view, int i, ExpandableWidget expandableWidget) {
            this.f29242f = view;
            this.f29243g = i;
            this.f29244h = expandableWidget;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f29242f.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f29241a == this.f29243g) {
                ExpandableWidget expandableWidget = this.f29244h;
                expandableBehavior.mo12896C((View) expandableWidget, this.f29242f, expandableWidget.mo11263a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f29241a = 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m12895B(boolean z) {
        if (!z) {
            return this.f29241a == 1;
        }
        int i = this.f29241a;
        return i == 0 || i == 2;
    }

    /* JADX INFO: renamed from: C */
    public abstract boolean mo12896C(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: g */
    public boolean mo315g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (!m12895B(expandableWidget.mo11263a())) {
            return false;
        }
        this.f29241a = expandableWidget.mo11263a() ? 1 : 2;
        return mo12896C((View) expandableWidget, view, expandableWidget.mo11263a(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: k */
    public boolean mo319k(CoordinatorLayout coordinatorLayout, View view, int i) {
        ExpandableWidget expandableWidget;
        AtomicInteger atomicInteger = ViewCompat.f38073a;
        if (!view.isLaidOut()) {
            List<View> listM291e = coordinatorLayout.m291e(view);
            int size = listM291e.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    expandableWidget = null;
                    break;
                }
                View view2 = listM291e.get(i2);
                if (mo312d(coordinatorLayout, view, view2)) {
                    expandableWidget = (ExpandableWidget) view2;
                    break;
                }
                i2++;
            }
            if (expandableWidget != null && m12895B(expandableWidget.mo11263a())) {
                int i3 = expandableWidget.mo11263a() ? 1 : 2;
                this.f29241a = i3;
                view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC5990a(view, i3, expandableWidget));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29241a = 0;
    }
}
