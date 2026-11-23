package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import p007c.p190n.p194b.p334e.p366z.BaseTransientBottomBar;
import p007c.p190n.p194b.p334e.p366z.BaseTransientBottomBar4;
import p007c.p190n.p194b.p334e.p366z.SnackbarManager;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* JADX INFO: renamed from: h */
    public final BaseTransientBottomBar f29016h = new BaseTransientBottomBar(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* JADX INFO: renamed from: B */
    public boolean mo12705B(View view) {
        Objects.requireNonNull(this.f29016h);
        return view instanceof BaseTransientBottomBar4;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0098c
    /* JADX INFO: renamed from: j */
    public boolean mo318j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        Objects.requireNonNull(this.f29016h);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (SnackbarManager.f25689a == null) {
                    SnackbarManager.f25689a = new SnackbarManager();
                }
                synchronized (SnackbarManager.f25689a.f25690b) {
                }
            }
        } else if (coordinatorLayout.m297q(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (SnackbarManager.f25689a == null) {
                SnackbarManager.f25689a = new SnackbarManager();
            }
            synchronized (SnackbarManager.f25689a.f25690b) {
            }
        }
        return super.mo318j(coordinatorLayout, view, motionEvent);
    }
}
