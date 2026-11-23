package p007c.p056c.p057a.p059b0.p060j;

import android.graphics.PointF;
import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.PointKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.f, reason: use source file name */
/* JADX INFO: compiled from: AnimatablePointValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatablePointValue extends BaseAnimatableValue<PointF, PointF> {
    public AnimatablePointValue(List<Keyframe<PointF>> list) {
        super((List) list);
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<PointF, PointF> mo1339a() {
        return new PointKeyframeAnimation(this.f2018a);
    }
}
