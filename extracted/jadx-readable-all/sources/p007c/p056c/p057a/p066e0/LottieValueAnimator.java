package p007c.p056c.p057a.p066e0;

import android.animation.Animator;
import android.graphics.PointF;
import android.view.Choreographer;
import java.util.Iterator;
import p007c.p056c.p057a.L;
import p007c.p056c.p057a.LottieComposition;

/* JADX INFO: renamed from: c.c.a.e0.e, reason: use source file name */
/* JADX INFO: compiled from: LottieValueAnimator.java */
/* JADX INFO: loaded from: classes.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: o */
    public LottieComposition f2332o;

    /* JADX INFO: renamed from: h */
    public float f2325h = 1.0f;

    /* JADX INFO: renamed from: i */
    public boolean f2326i = false;

    /* JADX INFO: renamed from: j */
    public long f2327j = 0;

    /* JADX INFO: renamed from: k */
    public float f2328k = 0.0f;

    /* JADX INFO: renamed from: l */
    public int f2329l = 0;

    /* JADX INFO: renamed from: m */
    public float f2330m = -2.1474836E9f;

    /* JADX INFO: renamed from: n */
    public float f2331n = 2.1474836E9f;

    /* JADX INFO: renamed from: p */
    public boolean f2333p = false;

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        Iterator<Animator.AnimatorListener> it = this.f2322g.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
        m1428l();
    }

    /* JADX INFO: renamed from: d */
    public void m1422d() {
        m1428l();
        m1414a(m1426j());
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j2) {
        m1427k();
        LottieComposition lottieComposition = this.f2332o;
        if (lottieComposition == null || !this.f2333p) {
            return;
        }
        long j3 = this.f2327j;
        float fAbs = (j3 != 0 ? j2 - j3 : 0L) / ((1.0E9f / lottieComposition.f2355m) / Math.abs(this.f2325h));
        float f = this.f2328k;
        if (m1426j()) {
            fAbs = -fAbs;
        }
        float f2 = f + fAbs;
        this.f2328k = f2;
        float fM1425i = m1425i();
        float fM1424g = m1424g();
        PointF pointF = MiscUtils.f2336a;
        boolean z = !(f2 >= fM1425i && f2 <= fM1424g);
        this.f2328k = MiscUtils.m1432b(this.f2328k, m1425i(), m1424g());
        this.f2327j = j2;
        m1415b();
        if (z) {
            if (getRepeatCount() == -1 || this.f2329l < getRepeatCount()) {
                Iterator<Animator.AnimatorListener> it = this.f2322g.iterator();
                while (it.hasNext()) {
                    it.next().onAnimationRepeat(this);
                }
                this.f2329l++;
                if (getRepeatMode() == 2) {
                    this.f2326i = !this.f2326i;
                    this.f2325h = -this.f2325h;
                } else {
                    this.f2328k = m1426j() ? m1424g() : m1425i();
                }
                this.f2327j = j2;
            } else {
                this.f2328k = this.f2325h < 0.0f ? m1425i() : m1424g();
                m1428l();
                m1414a(m1426j());
            }
        }
        if (this.f2332o != null) {
            float f3 = this.f2328k;
            if (f3 < this.f2330m || f3 > this.f2331n) {
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f2330m), Float.valueOf(this.f2331n), Float.valueOf(this.f2328k)));
            }
        }
        L.m1365a("LottieValueAnimator#doFrame");
    }

    /* JADX INFO: renamed from: e */
    public float m1423e() {
        LottieComposition lottieComposition = this.f2332o;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f2328k;
        float f2 = lottieComposition.f2353k;
        return (f - f2) / (lottieComposition.f2354l - f2);
    }

    /* JADX INFO: renamed from: g */
    public float m1424g() {
        LottieComposition lottieComposition = this.f2332o;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f2331n;
        return f == 2.1474836E9f ? lottieComposition.f2354l : f;
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float fM1425i;
        float fM1424g;
        float fM1425i2;
        if (this.f2332o == null) {
            return 0.0f;
        }
        if (m1426j()) {
            fM1425i = m1424g() - this.f2328k;
            fM1424g = m1424g();
            fM1425i2 = m1425i();
        } else {
            fM1425i = this.f2328k - m1425i();
            fM1424g = m1424g();
            fM1425i2 = m1425i();
        }
        return fM1425i / (fM1424g - fM1425i2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(m1423e());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.f2332o;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.m1444b();
    }

    /* JADX INFO: renamed from: i */
    public float m1425i() {
        LottieComposition lottieComposition = this.f2332o;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.f2330m;
        return f == -2.1474836E9f ? lottieComposition.f2353k : f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f2333p;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1426j() {
        return this.f2325h < 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public void m1427k() {
        if (this.f2333p) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1428l() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.f2333p = false;
    }

    /* JADX INFO: renamed from: m */
    public void m1429m(float f) {
        if (this.f2328k == f) {
            return;
        }
        this.f2328k = MiscUtils.m1432b(f, m1425i(), m1424g());
        this.f2327j = 0L;
        m1415b();
    }

    /* JADX INFO: renamed from: n */
    public void m1430n(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        LottieComposition lottieComposition = this.f2332o;
        float f3 = lottieComposition == null ? -3.4028235E38f : lottieComposition.f2353k;
        float f4 = lottieComposition == null ? Float.MAX_VALUE : lottieComposition.f2354l;
        this.f2330m = MiscUtils.m1432b(f, f3, f4);
        this.f2331n = MiscUtils.m1432b(f2, f3, f4);
        m1429m((int) MiscUtils.m1432b(this.f2328k, f, f2));
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.f2326i) {
            return;
        }
        this.f2326i = false;
        this.f2325h = -this.f2325h;
    }
}
