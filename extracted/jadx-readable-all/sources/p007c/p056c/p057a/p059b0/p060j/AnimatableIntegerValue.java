package p007c.p056c.p057a.p059b0.p060j;

import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.IntegerKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.d, reason: use source file name */
/* JADX INFO: compiled from: AnimatableIntegerValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableIntegerValue extends BaseAnimatableValue<Integer, Integer> {
    public AnimatableIntegerValue() {
        super(100);
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<Integer, Integer> mo1339a() {
        return new IntegerKeyframeAnimation(this.f2018a);
    }

    public AnimatableIntegerValue(List<Keyframe<Integer>> list) {
        super((List) list);
    }
}
