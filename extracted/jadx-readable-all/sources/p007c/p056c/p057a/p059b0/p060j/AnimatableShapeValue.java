package p007c.p056c.p057a.p059b0.p060j;

import android.graphics.Path;
import java.util.List;
import p007c.p056c.p057a.p059b0.p061k.ShapeData;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.ShapeKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.h, reason: use source file name */
/* JADX INFO: compiled from: AnimatableShapeValue.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {
    public AnimatableShapeValue(List<Keyframe<ShapeData>> list) {
        super((List) list);
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation<ShapeData, Path> mo1339a() {
        return new ShapeKeyframeAnimation(this.f2018a);
    }
}
