package p007c.p056c.p057a.p068z.p070c;

import java.util.Collections;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.LottieFrameInfo;
import p007c.p056c.p057a.p067f0.LottieValueCallback;

/* JADX INFO: renamed from: c.c.a.z.c.p, reason: use source file name */
/* JADX INFO: compiled from: ValueCallbackKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: i */
    public final A f2674i;

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback) {
        this(lottieValueCallback, null);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: b */
    public float mo1501b() {
        return 1.0f;
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: e */
    public A mo1504e() {
        LottieValueCallback<A> lottieValueCallback = this.f2633e;
        A a = this.f2674i;
        float f = this.f2632d;
        return lottieValueCallback.m1452a(0.0f, 0.0f, a, a, f, f, f);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public A mo1505f(Keyframe<K> keyframe, float f) {
        return mo1504e();
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: g */
    public void mo1506g() {
        if (this.f2633e != null) {
            super.mo1506g();
        }
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: h */
    public void mo1507h(float f) {
        this.f2632d = f;
    }

    public ValueCallbackKeyframeAnimation(LottieValueCallback<A> lottieValueCallback, A a) {
        super(Collections.emptyList());
        new LottieFrameInfo();
        LottieValueCallback<A> lottieValueCallback2 = this.f2633e;
        this.f2633e = lottieValueCallback;
        this.f2674i = a;
    }
}
