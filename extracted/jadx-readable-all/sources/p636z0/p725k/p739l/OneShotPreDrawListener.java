package p636z0.p725k.p739l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* JADX INFO: renamed from: z0.k.l.o, reason: use source file name */
/* JADX INFO: compiled from: OneShotPreDrawListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: f */
    public final View f38069f;

    /* JADX INFO: renamed from: g */
    public ViewTreeObserver f38070g;

    /* JADX INFO: renamed from: h */
    public final Runnable f38071h;

    public OneShotPreDrawListener(View view, Runnable runnable) {
        this.f38069f = view;
        this.f38070g = view.getViewTreeObserver();
        this.f38071h = runnable;
    }

    /* JADX INFO: renamed from: a */
    public static OneShotPreDrawListener m16304a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
        return oneShotPreDrawListener;
    }

    /* JADX INFO: renamed from: b */
    public void m16305b() {
        if (this.f38070g.isAlive()) {
            this.f38070g.removeOnPreDrawListener(this);
        } else {
            this.f38069f.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f38069f.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m16305b();
        this.f38071h.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f38070g = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m16305b();
    }
}
