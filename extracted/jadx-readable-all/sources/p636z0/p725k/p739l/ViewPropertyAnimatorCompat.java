package p636z0.p725k.p739l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;
import p636z0.p644b.p645c.WindowDecorActionBar;

/* JADX INFO: renamed from: z0.k.l.w, reason: use source file name */
/* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class ViewPropertyAnimatorCompat {

    /* JADX INFO: renamed from: a */
    public WeakReference<View> f38092a;

    /* JADX INFO: renamed from: b */
    public int f38093b = -1;

    /* JADX INFO: renamed from: z0.k.l.w$a */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewPropertyAnimatorListener f38094a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f38095b;

        public a(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorListener viewPropertyAnimatorListener, View view) {
            this.f38094a = viewPropertyAnimatorListener;
            this.f38095b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f38094a.mo14826a(this.f38095b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f38094a.mo14669b(this.f38095b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f38094a.mo14677c(this.f38095b);
        }
    }

    /* JADX INFO: renamed from: z0.k.l.w$b */
    /* JADX INFO: compiled from: ViewPropertyAnimatorCompat.java */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewPropertyAnimatorUpdateListener f38096a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f38097b;

        public b(ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener, View view) {
            this.f38096a = viewPropertyAnimatorUpdateListener;
            this.f38097b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) WindowDecorActionBar.this.f34560f.getParent()).invalidate();
        }
    }

    public ViewPropertyAnimatorCompat(View view) {
        this.f38092a = new WeakReference<>(view);
    }

    /* JADX INFO: renamed from: a */
    public ViewPropertyAnimatorCompat m16345a(float f) {
        View view = this.f38092a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m16346b() {
        View view = this.f38092a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: c */
    public ViewPropertyAnimatorCompat m16347c(long j2) {
        View view = this.f38092a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    /* JADX INFO: renamed from: d */
    public ViewPropertyAnimatorCompat m16348d(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        View view = this.f38092a.get();
        if (view != null) {
            m16349e(view, viewPropertyAnimatorListener);
        }
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final void m16349e(View view, ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (viewPropertyAnimatorListener != null) {
            view.animate().setListener(new a(this, viewPropertyAnimatorListener, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* JADX INFO: renamed from: f */
    public ViewPropertyAnimatorCompat m16350f(ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        View view = this.f38092a.get();
        if (view != null) {
            view.animate().setUpdateListener(viewPropertyAnimatorUpdateListener != null ? new b(this, viewPropertyAnimatorUpdateListener, view) : null);
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public ViewPropertyAnimatorCompat m16351g(float f) {
        View view = this.f38092a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
        return this;
    }
}
