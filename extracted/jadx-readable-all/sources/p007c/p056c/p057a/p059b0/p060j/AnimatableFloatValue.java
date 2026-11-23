package p007c.p056c.p057a.p059b0.p060j;

import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.FloatKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.b, reason: use source file name */
/* JADX INFO: compiled from: AnimatableFloatValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableFloatValue extends BaseAnimatableValue<Float, Float> {
    public AnimatableFloatValue() {
        super(Float.valueOf(0.0f));
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<Float, Float> mo1339a() {
        return new FloatKeyframeAnimation(this.f2018a);
    }

    public AnimatableFloatValue(List<Keyframe<Float>> list) {
        super((List) list);
    }
}
