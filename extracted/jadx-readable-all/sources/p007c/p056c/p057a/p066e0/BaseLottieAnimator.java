package p007c.p056c.p057a.p066e0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: c.c.a.e0.a, reason: use source file name */
/* JADX INFO: compiled from: BaseLottieAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseLottieAnimator extends ValueAnimator {

    /* JADX INFO: renamed from: f */
    public final Set<ValueAnimator.AnimatorUpdateListener> f2321f = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: g */
    public final Set<Animator.AnimatorListener> f2322g = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: a */
    public void m1414a(boolean z) {
        for (Animator.AnimatorListener animatorListener : this.f2322g) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f2322g.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f2321f.add(animatorUpdateListener);
    }

    /* JADX INFO: renamed from: b */
    public void m1415b() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f2321f.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f2322g.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f2321f.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f2322g.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f2321f.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public /* bridge */ /* synthetic */ Animator setDuration(long j2) {
        setDuration(j2);
        throw null;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j2) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
