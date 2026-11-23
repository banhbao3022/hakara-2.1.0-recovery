package p007c.p056c.p057a.p068z.p070c;

import android.graphics.PointF;
import java.util.Collections;
import p007c.p056c.p057a.p067f0.Keyframe;

/* JADX INFO: renamed from: c.c.a.z.c.m, reason: use source file name */
/* JADX INFO: compiled from: SplitDimensionPathKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class SplitDimensionPathKeyframeAnimation extends BaseKeyframeAnimation<PointF, PointF> {

    /* JADX INFO: renamed from: i */
    public final PointF f2657i;

    /* JADX INFO: renamed from: j */
    public final BaseKeyframeAnimation<Float, Float> f2658j;

    /* JADX INFO: renamed from: k */
    public final BaseKeyframeAnimation<Float, Float> f2659k;

    public SplitDimensionPathKeyframeAnimation(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.emptyList());
        this.f2657i = new PointF();
        this.f2658j = baseKeyframeAnimation;
        this.f2659k = baseKeyframeAnimation2;
        mo1507h(this.f2632d);
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: e */
    public PointF mo1504e() {
        return this.f2657i;
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public PointF mo1505f(Keyframe<PointF> keyframe, float f) {
        return this.f2657i;
    }

    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: h */
    public void mo1507h(float f) {
        this.f2658j.mo1507h(f);
        this.f2659k.mo1507h(f);
        this.f2657i.set(this.f2658j.mo1504e().floatValue(), this.f2659k.mo1504e().floatValue());
        for (int i = 0; i < this.f2629a.size(); i++) {
            this.f2629a.get(i).mo1345a();
        }
    }
}
