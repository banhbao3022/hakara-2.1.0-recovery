package p007c.p056c.p057a.p068z.p070c;

import java.util.List;
import p007c.p056c.p057a.p059b0.DocumentData;
import p007c.p056c.p057a.p067f0.Keyframe;

/* JADX INFO: renamed from: c.c.a.z.c.n, reason: use source file name */
/* JADX INFO: compiled from: TextKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public class TextKeyframeAnimation extends KeyframeAnimation<DocumentData> {
    public TextKeyframeAnimation(List<Keyframe<DocumentData>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation
    /* JADX INFO: renamed from: f */
    public Object mo1505f(Keyframe keyframe, float f) {
        return (DocumentData) keyframe.f2359b;
    }
}
