package p007c.p056c.p057a.p059b0.p060j;

import java.util.List;
import p007c.p056c.p057a.p059b0.p061k.GradientColor;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.GradientColorKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.c, reason: use source file name */
/* JADX INFO: compiled from: AnimatableGradientColorValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor, GradientColor> {
    public AnimatableGradientColorValue(List<Keyframe<GradientColor>> list) {
        super((List) list);
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<GradientColor, GradientColor> mo1339a() {
        return new GradientColorKeyframeAnimation(this.f2018a);
    }
}
