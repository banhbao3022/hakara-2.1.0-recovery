package p007c.p056c.p057a.p059b0.p060j;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.PathKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.PointKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.e, reason: use source file name */
/* JADX INFO: compiled from: AnimatablePathValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatablePathValue implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a */
    public final List<Keyframe<PointF>> f2002a;

    public AnimatablePathValue() {
        this.f2002a = Collections.singletonList(new Keyframe(new PointF(0.0f, 0.0f)));
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<PointF, PointF> mo1339a() {
        return this.f2002a.get(0).m1451d() ? new PointKeyframeAnimation(this.f2002a) : new PathKeyframeAnimation(this.f2002a);
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: b */
    public List<Keyframe<PointF>> mo1340b() {
        return this.f2002a;
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: c */
    public boolean mo1341c() {
        return this.f2002a.size() == 1 && this.f2002a.get(0).m1451d();
    }

    public AnimatablePathValue(List<Keyframe<PointF>> list) {
        this.f2002a = list;
    }
}
