package p007c.p056c.p057a.p059b0.p060j;

import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ColorKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.a, reason: use source file name */
/* JADX INFO: compiled from: AnimatableColorValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableColorValue extends BaseAnimatableValue<Integer, Integer> {
    public AnimatableColorValue(List<Keyframe<Integer>> list) {
        super((List) list);
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<Integer, Integer> mo1339a() {
        return new ColorKeyframeAnimation(this.f2018a);
    }
}
