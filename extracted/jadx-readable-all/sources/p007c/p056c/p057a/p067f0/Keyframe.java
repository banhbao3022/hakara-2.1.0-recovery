package p007c.p056c.p057a.p067f0;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p007c.p056c.p057a.LottieComposition;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.c.a.f0.a, reason: use source file name */
/* JADX INFO: compiled from: Keyframe.java */
/* JADX INFO: loaded from: classes.dex */
public class Keyframe<T> {

    /* JADX INFO: renamed from: a */
    public final LottieComposition f2358a;

    /* JADX INFO: renamed from: b */
    public final T f2359b;

    /* JADX INFO: renamed from: c */
    public T f2360c;

    /* JADX INFO: renamed from: d */
    public final Interpolator f2361d;

    /* JADX INFO: renamed from: e */
    public final float f2362e;

    /* JADX INFO: renamed from: f */
    public Float f2363f;

    /* JADX INFO: renamed from: g */
    public float f2364g;

    /* JADX INFO: renamed from: h */
    public float f2365h;

    /* JADX INFO: renamed from: i */
    public int f2366i;

    /* JADX INFO: renamed from: j */
    public int f2367j;

    /* JADX INFO: renamed from: k */
    public float f2368k;

    /* JADX INFO: renamed from: l */
    public float f2369l;

    /* JADX INFO: renamed from: m */
    public PointF f2370m;

    /* JADX INFO: renamed from: n */
    public PointF f2371n;

    public Keyframe(LottieComposition lottieComposition, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f2364g = -3987645.8f;
        this.f2365h = -3987645.8f;
        this.f2366i = 784923401;
        this.f2367j = 784923401;
        this.f2368k = Float.MIN_VALUE;
        this.f2369l = Float.MIN_VALUE;
        this.f2370m = null;
        this.f2371n = null;
        this.f2358a = lottieComposition;
        this.f2359b = t;
        this.f2360c = t2;
        this.f2361d = interpolator;
        this.f2362e = f;
        this.f2363f = f2;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1448a(float f) {
        return f >= m1450c() && f < m1449b();
    }

    /* JADX INFO: renamed from: b */
    public float m1449b() {
        if (this.f2358a == null) {
            return 1.0f;
        }
        if (this.f2369l == Float.MIN_VALUE) {
            if (this.f2363f == null) {
                this.f2369l = 1.0f;
            } else {
                this.f2369l = ((this.f2363f.floatValue() - this.f2362e) / this.f2358a.m1445c()) + m1450c();
            }
        }
        return this.f2369l;
    }

    /* JADX INFO: renamed from: c */
    public float m1450c() {
        LottieComposition lottieComposition = this.f2358a;
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (this.f2368k == Float.MIN_VALUE) {
            this.f2368k = (this.f2362e - lottieComposition.f2353k) / lottieComposition.m1445c();
        }
        return this.f2368k;
    }

    /* JADX INFO: renamed from: d */
    public boolean m1451d() {
        return this.f2361d == null;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Keyframe{startValue=");
        sbM1556G.append(this.f2359b);
        sbM1556G.append(", endValue=");
        sbM1556G.append(this.f2360c);
        sbM1556G.append(", startFrame=");
        sbM1556G.append(this.f2362e);
        sbM1556G.append(", endFrame=");
        sbM1556G.append(this.f2363f);
        sbM1556G.append(", interpolator=");
        sbM1556G.append(this.f2361d);
        sbM1556G.append('}');
        return sbM1556G.toString();
    }

    public Keyframe(T t) {
        this.f2364g = -3987645.8f;
        this.f2365h = -3987645.8f;
        this.f2366i = 784923401;
        this.f2367j = 784923401;
        this.f2368k = Float.MIN_VALUE;
        this.f2369l = Float.MIN_VALUE;
        this.f2370m = null;
        this.f2371n = null;
        this.f2358a = null;
        this.f2359b = t;
        this.f2360c = t;
        this.f2361d = null;
        this.f2362e = Float.MIN_VALUE;
        this.f2363f = Float.valueOf(Float.MAX_VALUE);
    }
}
