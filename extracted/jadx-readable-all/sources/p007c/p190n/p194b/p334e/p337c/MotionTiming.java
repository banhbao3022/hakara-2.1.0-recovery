package p007c.p190n.p194b.p334e.p337c;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.e.c.i, reason: use source file name */
/* JADX INFO: compiled from: MotionTiming.java */
/* JADX INFO: loaded from: classes.dex */
public class MotionTiming {

    /* JADX INFO: renamed from: a */
    public long f24808a;

    /* JADX INFO: renamed from: b */
    public long f24809b;

    /* JADX INFO: renamed from: c */
    public TimeInterpolator f24810c;

    /* JADX INFO: renamed from: d */
    public int f24811d;

    /* JADX INFO: renamed from: e */
    public int f24812e;

    public MotionTiming(long j2, long j3) {
        this.f24808a = 0L;
        this.f24809b = 300L;
        this.f24810c = null;
        this.f24811d = 0;
        this.f24812e = 1;
        this.f24808a = j2;
        this.f24809b = j3;
    }

    /* JADX INFO: renamed from: a */
    public void m11041a(Animator animator) {
        animator.setStartDelay(this.f24808a);
        animator.setDuration(this.f24809b);
        animator.setInterpolator(m11042b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f24811d);
            valueAnimator.setRepeatMode(this.f24812e);
        }
    }

    /* JADX INFO: renamed from: b */
    public TimeInterpolator m11042b() {
        TimeInterpolator timeInterpolator = this.f24810c;
        return timeInterpolator != null ? timeInterpolator : AnimationUtils.f24794b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotionTiming)) {
            return false;
        }
        MotionTiming motionTiming = (MotionTiming) obj;
        if (this.f24808a == motionTiming.f24808a && this.f24809b == motionTiming.f24809b && this.f24811d == motionTiming.f24811d && this.f24812e == motionTiming.f24812e) {
            return m11042b().getClass().equals(motionTiming.m11042b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f24808a;
        long j3 = this.f24809b;
        return ((((m11042b().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f24811d) * 31) + this.f24812e;
    }

    public String toString() {
        StringBuilder sbM1555F = outline.m1555F('\n');
        sbM1555F.append(MotionTiming.class.getName());
        sbM1555F.append('{');
        sbM1555F.append(Integer.toHexString(System.identityHashCode(this)));
        sbM1555F.append(" delay: ");
        sbM1555F.append(this.f24808a);
        sbM1555F.append(" duration: ");
        sbM1555F.append(this.f24809b);
        sbM1555F.append(" interpolator: ");
        sbM1555F.append(m11042b().getClass());
        sbM1555F.append(" repeatCount: ");
        sbM1555F.append(this.f24811d);
        sbM1555F.append(" repeatMode: ");
        return outline.m1603y(sbM1555F, this.f24812e, "}\n");
    }

    public MotionTiming(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.f24808a = 0L;
        this.f24809b = 300L;
        this.f24810c = null;
        this.f24811d = 0;
        this.f24812e = 1;
        this.f24808a = j2;
        this.f24809b = j3;
        this.f24810c = timeInterpolator;
    }
}
