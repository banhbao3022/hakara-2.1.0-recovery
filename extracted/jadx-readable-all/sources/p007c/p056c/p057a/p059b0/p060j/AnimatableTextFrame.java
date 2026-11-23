package p007c.p056c.p057a.p059b0.p060j;

import java.util.List;
import p007c.p056c.p057a.p059b0.DocumentData;
import p007c.p056c.p057a.p067f0.Keyframe;
import p007c.p056c.p057a.p068z.p070c.BaseKeyframeAnimation;
import p007c.p056c.p057a.p068z.p070c.TextKeyframeAnimation;

/* JADX INFO: renamed from: c.c.a.b0.j.j, reason: use source file name */
/* JADX INFO: compiled from: AnimatableTextFrame.java */
/* JADX INFO: loaded from: classes.dex */
public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {
    public AnimatableTextFrame(List<Keyframe<DocumentData>> list) {
        super((List) list);
    }

    @Override // p007c.p056c.p057a.p059b0.p060j.AnimatableValue
    /* JADX INFO: renamed from: a */
    public BaseKeyframeAnimation mo1339a() {
        return new TextKeyframeAnimation(this.f2018a);
    }
}
