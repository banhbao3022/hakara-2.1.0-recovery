package p007c.p056c.p057a.p059b0.p060j;

import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p067f0.ScaleXY;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ScaleKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.g, reason: use source file name */
/* JADX INFO: compiled from: AnimatableScaleValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableScaleValue extends BaseAnimatableValue<ScaleXY, ScaleXY> {
    public AnimatableScaleValue() {
        this(new ScaleXY(1.0f, 1.0f));
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<ScaleXY, ScaleXY> mo1339a() {
        return new ScaleKeyframeAnimation(this.f2018a);
    }

    public AnimatableScaleValue(ScaleXY scaleXY) {
        super(scaleXY);
    }

    public AnimatableScaleValue(List<Keyframe<ScaleXY>> list) {
        super((List) list);
    }
}
