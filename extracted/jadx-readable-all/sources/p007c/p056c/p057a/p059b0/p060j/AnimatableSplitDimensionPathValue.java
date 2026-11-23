package p007c.p056c.p057a.p059b0.p060j;

import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.SplitDimensionPathKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.i, reason: use source file name */
/* JADX INFO: compiled from: AnimatableSplitDimensionPathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableSplitDimensionPathValue implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final AnimatableFloatValue f2003a;

    /* JADX INFO: renamed from: b */
    public final AnimatableFloatValue f2004b;

    public AnimatableSplitDimensionPathValue(AnimatableFloatValue animatableFloatValue, AnimatableFloatValue animatableFloatValue2) {
        this.f2003a = animatableFloatValue;
        this.f2004b = animatableFloatValue2;
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<PointF, PointF> mo1339a() {
        return new SplitDimensionPathKeyframeAnimation(this.f2003a.mo1339a(), this.f2004b.mo1339a());
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: b */
    public List<Keyframe<PointF>> mo1340b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: c */
    public boolean mo1341c() {
        return this.f2003a.mo1341c() && this.f2004b.mo1341c();
    }
}
